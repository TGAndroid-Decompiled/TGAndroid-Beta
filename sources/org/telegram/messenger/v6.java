package org.telegram.messenger;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class v6 implements TextWatcher {
    public boolean f27426a;
    public final int f27427b;
    public final t6 f27428c;
    public final TextView[] d;
    public final TLRPC.TL_factCheck f27429e;

    public v6(int i7, t6 t6Var, TextView[] textViewArr, TLRPC.TL_factCheck tL_factCheck) {
        this.f27427b = i7;
        this.f27428c = t6Var;
        this.d = textViewArr;
        this.f27429e = tL_factCheck;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        int i10;
        if (!this.f27426a) {
            int length = editable.length();
            boolean z10 = true;
            int i11 = this.f27427b;
            if (length > i11) {
                this.f27426a = true;
                editable.delete(i11, editable.length());
                t6 t6Var = this.f27428c;
                g0.D3(t6Var);
                try {
                    t6Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.f27426a = false;
            }
            TextView[] textViewArr = this.d;
            if (textViewArr[0] != null) {
                if (editable.length() <= 0 && this.f27429e != null) {
                    z10 = false;
                }
                TextView textView = textViewArr[0];
                if (z10) {
                    i7 = 2131751342;
                } else {
                    i7 = 2131746125;
                }
                textView.setText(gd.N0(i7, null));
                TextView textView2 = textViewArr[0];
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.n6.H5;
                } else {
                    i10 = org.telegram.ui.ActionBar.n6.f29692q7;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, i10, false));
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
