package defpackage;

import android.text.Editable;
public final class ku3 implements qac {
    public final qu3 a;
    public final int b;
    public final int c;

    public ku3(qu3 qu3Var, int i, int i2) {
        this.a = qu3Var;
        this.b = i;
        this.c = i2;
    }

    @Override
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        qu3 qu3Var = this.a;
        Editable text = qu3Var.getText();
        int i = this.b;
        text.replace(i, this.c, charSequence);
        qu3Var.setSelection(i, charSequence.length() + i);
    }
}
