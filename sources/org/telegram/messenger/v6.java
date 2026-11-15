package org.telegram.messenger;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class v6 implements TextWatcher {
    public boolean f26935a;
    public final int f26936b;
    public final t6 f26937c;
    public final TextView[] d;
    public final TLRPC.TL_factCheck f26938e;

    public v6(int i7, t6 t6Var, TextView[] textViewArr, TLRPC.TL_factCheck tL_factCheck) {
        this.f26936b = i7;
        this.f26937c = t6Var;
        this.d = textViewArr;
        this.f26938e = tL_factCheck;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7;
        int i10;
        if (!this.f26935a) {
            int length = editable.length();
            boolean z10 = true;
            int i11 = this.f26936b;
            if (length > i11) {
                this.f26935a = true;
                editable.delete(i11, editable.length());
                t6 t6Var = this.f26937c;
                g0.E3(t6Var);
                try {
                    t6Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.f26935a = false;
            }
            TextView[] textViewArr = this.d;
            if (textViewArr[0] != null) {
                if (editable.length() <= 0 && this.f26938e != null) {
                    z10 = false;
                }
                TextView textView = textViewArr[0];
                if (z10) {
                    i7 = 2131751354;
                } else {
                    i7 = 2131746321;
                }
                textView.setText(hd.M0(i7, null));
                TextView textView2 = textViewArr[0];
                if (z10) {
                    i10 = org.telegram.ui.ActionBar.j6.H5;
                } else {
                    i10 = org.telegram.ui.ActionBar.j6.f29090q7;
                }
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, i10, false));
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
