package org.telegram.messenger;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class y6 implements TextWatcher {
    public boolean f19556a;
    public final int f19557b;
    public final w6 f19558c;
    public final TextView[] d;
    public final TLRPC.TL_factCheck e;

    public y6(int i10, w6 w6Var, TextView[] textViewArr, TLRPC.TL_factCheck tL_factCheck) {
        this.f19557b = i10;
        this.f19558c = w6Var;
        this.d = textViewArr;
        this.e = tL_factCheck;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        int i11;
        if (!this.f19556a) {
            int length = editable.length();
            boolean z10 = true;
            int i12 = this.f19557b;
            if (length > i12) {
                this.f19556a = true;
                editable.delete(i12, editable.length());
                w6 w6Var = this.f19558c;
                i0.E3(w6Var);
                try {
                    w6Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.f19556a = false;
            }
            TextView[] textViewArr = this.d;
            if (textViewArr[0] != null) {
                if (editable.length() <= 0 && this.e != null) {
                    z10 = false;
                }
                TextView textView = textViewArr[0];
                if (z10) {
                    i10 = 2131751355;
                } else {
                    i10 = 2131746336;
                }
                textView.setText(dd.L0(i10, null));
                TextView textView2 = textViewArr[0];
                if (z10) {
                    i11 = org.telegram.ui.ActionBar.t6.H5;
                } else {
                    i11 = org.telegram.ui.ActionBar.t6.f21171q7;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, i11, false));
            }
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
