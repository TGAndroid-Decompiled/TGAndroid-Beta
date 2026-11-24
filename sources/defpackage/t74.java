package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class t74 implements TextWatcher {
    public boolean a;
    public final int b;
    public final r74 c;
    public final TextView[] d;
    public final TLRPC.TL_factCheck e;

    public t74(int i, r74 r74Var, TextView[] textViewArr, TLRPC.TL_factCheck tL_factCheck) {
        this.b = i;
        this.c = r74Var;
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
                r74 r74Var = this.c;
                gl.A3(r74Var);
                try {
                    r74Var.performHapticFeedback(3, 2);
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
                    i = 2131751342;
                } else {
                    i = 2131746128;
                }
                textView.setText(k96.M0(i, null));
                TextView textView2 = textViewArr[0];
                if (z) {
                    i2 = bkb.G5;
                } else {
                    i2 = bkb.p7;
                }
                textView2.setTextColor(bkb.w0(null, i2, false));
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
