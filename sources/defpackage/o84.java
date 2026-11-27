package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class o84 implements TextWatcher {
    public boolean a;
    public final int b;
    public final m84 c;
    public final TextView[] d;
    public final TLRPC.TL_factCheck e;

    public o84(int i, m84 m84Var, TextView[] textViewArr, TLRPC.TL_factCheck tL_factCheck) {
        this.b = i;
        this.c = m84Var;
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
                m84 m84Var = this.c;
                hl.z3(m84Var);
                try {
                    m84Var.performHapticFeedback(3, 2);
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
                    i = 2131751319;
                } else {
                    i = 2131746048;
                }
                textView.setText(ob6.M0(i, null));
                TextView textView2 = textViewArr[0];
                if (z) {
                    i2 = aob.H5;
                } else {
                    i2 = aob.q7;
                }
                textView2.setTextColor(aob.w0(null, i2, false));
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
