package ei;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class q7 implements TextWatcher {
    public final s7 f9648a;

    public q7(s7 s7Var) {
        this.f9648a = s7Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        boolean z10;
        String obj = editable.toString();
        s7 s7Var = this.f9648a;
        s7Var.f9808s0 = obj;
        if (!s7Var.Z) {
            String str = s7Var.f9813x0;
            String str2 = "";
            if (obj == null) {
                obj = "";
            }
            boolean equals = TextUtils.equals(str, obj);
            boolean z11 = false;
            if (!equals) {
                s7Var.a0();
                String str3 = s7Var.f9808s0;
                if (str3 != null && str3.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s7Var.f9812w0 = z10;
            }
            String str4 = s7Var.I0;
            String str5 = s7Var.f9808s0;
            if (str5 != null) {
                str2 = str5;
            }
            if (!TextUtils.equals(str4, str2)) {
                s7Var.Z();
                String str6 = s7Var.f9808s0;
                if (str6 != null && str6.length() > 3) {
                    i10 = ((org.telegram.ui.ActionBar.f3) s7Var).currentAccount;
                    if (!TextUtils.isEmpty(MessagesController.getInstance(i10).config.musicSearchUsername.get())) {
                        z11 = true;
                    }
                }
                s7Var.D0 = z11;
            }
            l7 l7Var = s7Var.f9815z0;
            AndroidUtilities.cancelRunOnUIThread(l7Var);
            AndroidUtilities.runOnUIThread(l7Var, 400L);
            l7 l7Var2 = s7Var.K0;
            AndroidUtilities.cancelRunOnUIThread(l7Var2);
            AndroidUtilities.runOnUIThread(l7Var2, 400L);
        }
        s7Var.f9806q0.N(true);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
