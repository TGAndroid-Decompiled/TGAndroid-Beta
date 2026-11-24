package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class c94 implements TextWatcher {
    public boolean a;
    public final int b;
    public final a94 c;
    public final TextView[] d;
    public final TLRPC.TL_factCheck e;

    public c94(int i, a94 a94Var, TextView[] textViewArr, TLRPC.TL_factCheck tL_factCheck) {
        this.b = i;
        this.c = a94Var;
        this.d = textViewArr;
        this.e = tL_factCheck;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i;
        int i2;
        if (!this.a) {
            int length = editable.length();
            boolean z = true;
            int i3 = this.b;
            if (length > i3) {
                this.a = true;
                editable.delete(i3, editable.length());
                a94 a94Var = this.c;
                gm.z3(a94Var);
                try {
                    a94Var.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.a = false;
            }
            TextView[] textViewArr = this.d;
            if (textViewArr[0] != null) {
                if (editable.length() <= 0 && this.e != null) {
                    z = false;
                }
                TextView textView = textViewArr[0];
                if (z) {
                    i = 2131751291;
                } else {
                    i = 2131746054;
                }
                textView.setText(jb6.M0(i, null));
                TextView textView2 = textViewArr[0];
                if (z) {
                    i2 = cmb.G5;
                } else {
                    i2 = cmb.p7;
                }
                textView2.setTextColor(cmb.w0(null, i2, false));
            }
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
