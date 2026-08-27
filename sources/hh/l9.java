package hh;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.jc0;

public final class l9 implements TextWatcher {

    public boolean f9682a;

    public int f9683b = 2;

    public final EditTextBoldCursor f9684c;
    public final jc0 d;

    public final long f9685e;

    public final boolean f9686f;
    public final lh.d h;

    public final TextView f9687n;

    public l9(EditTextBoldCursor editTextBoldCursor, jc0 jc0Var, long j10, boolean z10, lh.d dVar, TextView textView) {
        this.f9684c = editTextBoldCursor;
        this.d = jc0Var;
        this.f9685e = j10;
        this.f9686f = z10;
        this.h = dVar;
        this.f9687n = textView;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        long j10;
        jc0 jc0Var = this.d;
        EditTextBoldCursor editTextBoldCursor = this.f9684c;
        if (this.f9682a) {
            return;
        }
        try {
            j10 = TextUtils.isEmpty(editable) ? 0L : Long.parseLong(editable.toString());
            try {
                if (j10 > MessagesController.getInstance(UserConfig.selectedAccount).starsPaidPostAmountMax) {
                    this.f9682a = true;
                    j10 = MessagesController.getInstance(UserConfig.selectedAccount).starsPaidPostAmountMax;
                    editTextBoldCursor.setText(Long.toString(j10));
                    editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
                    int i10 = -this.f9683b;
                    this.f9683b = i10;
                    AndroidUtilities.shakeViewSpring(jc0Var, i10);
                }
            } catch (Exception unused) {
                this.f9682a = true;
                long j11 = this.f9685e;
                editTextBoldCursor.setText(j11 <= 0 ? "" : Long.toString(j11));
                editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
            }
        } catch (Exception unused2) {
            j10 = 0;
        }
        this.f9682a = false;
        if (!this.f9686f) {
            this.h.setEnabled(j10 > 0);
        }
        jc0Var.c(editTextBoldCursor.isFocused(), !TextUtils.isEmpty(editTextBoldCursor.getText()));
        TextView textView = this.f9687n;
        if (j10 == 0) {
            textView.animate().alpha(0.0f).start();
            textView.setText("");
        } else {
            textView.animate().alpha(1.0f).start();
            textView.setText("≈" + BillingController.getInstance().formatCurrency((long) ((j10 / 1000.0d) * ((double) MessagesController.getInstance(UserConfig.selectedAccount).starsUsdWithdrawRate1000)), "USD"));
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
