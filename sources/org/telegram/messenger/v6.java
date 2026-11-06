package org.telegram.messenger;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class v6 implements TextWatcher {
    public boolean f25939a;
    public final int f25940b;
    public final t6 f25941c;
    public final TextView[] d;
    public final TLRPC.TL_factCheck f25942e;

    public v6(int i7, t6 t6Var, TextView[] textViewArr, TLRPC.TL_factCheck tL_factCheck) {
        this.f25940b = i7;
        this.f25941c = t6Var;
        this.d = textViewArr;
        this.f25942e = tL_factCheck;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        int i10;
        if (!this.f25939a) {
            int length = editable.length();
            boolean z9 = true;
            int i11 = this.f25940b;
            if (length > i11) {
                this.f25939a = true;
                editable.delete(i11, editable.length());
                t6 t6Var = this.f25941c;
                g0.F3(t6Var);
                try {
                    t6Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.f25939a = false;
            }
            TextView[] textViewArr = this.d;
            if (textViewArr[0] != null) {
                if (editable.length() <= 0 && this.f25942e != null) {
                    z9 = false;
                }
                TextView textView = textViewArr[0];
                if (z9) {
                    i7 = 2131751355;
                } else {
                    i7 = 2131746320;
                }
                textView.setText(hd.M0(i7, null));
                TextView textView2 = textViewArr[0];
                if (z9) {
                    i10 = org.telegram.ui.ActionBar.k6.H5;
                } else {
                    i10 = org.telegram.ui.ActionBar.k6.f28089q7;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            }
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
