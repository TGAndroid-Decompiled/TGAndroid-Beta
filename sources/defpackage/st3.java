package defpackage;

import android.text.Editable;
public final class st3 implements pcc {
    public final xt3 a;
    public final int b;
    public final int c;

    public st3(xt3 xt3Var, int i, int i2) {
        this.a = xt3Var;
        this.b = i;
        this.c = i2;
    }

    @Override
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        xt3 xt3Var = this.a;
        Editable text = xt3Var.getText();
        int i = this.b;
        text.replace(i, this.c, charSequence);
        xt3Var.setSelection(i, charSequence.length() + i);
    }
}
