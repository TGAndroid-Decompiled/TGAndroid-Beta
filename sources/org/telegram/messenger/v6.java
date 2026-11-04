package org.telegram.messenger;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class v6 implements TextWatcher {
    public boolean f25829a;
    public final int f25830b;
    public final t6 f25831c;
    public final TextView[] d;
    public final TLRPC.TL_factCheck f25832e;

    public v6(int i3, t6 t6Var, TextView[] textViewArr, TLRPC.TL_factCheck tL_factCheck) {
        this.f25830b = i3;
        this.f25831c = t6Var;
        this.d = textViewArr;
        this.f25832e = tL_factCheck;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i3;
        int i10;
        if (!this.f25829a) {
            int length = editable.length();
            boolean z10 = true;
            int i11 = this.f25830b;
            if (length > i11) {
                this.f25829a = true;
                editable.delete(i11, editable.length());
                t6 t6Var = this.f25831c;
                g0.F3(t6Var);
                try {
                    t6Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.f25829a = false;
            }
            TextView[] textViewArr = this.d;
            if (textViewArr[0] != null) {
                if (editable.length() <= 0 && this.f25832e != null) {
                    z10 = false;
                }
                TextView textView = textViewArr[0];
                if (z10) {
                    i3 = 2131751355;
                } else {
                    i3 = 2131746329;
                }
                textView.setText(bd.M0(i3, null));
                TextView textView2 = textViewArr[0];
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.k6.H5;
                } else {
                    i10 = org.telegram.ui.ActionBar.k6.f28122q7;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
            }
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
