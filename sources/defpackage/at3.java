package defpackage;

import android.text.Editable;
public final class at3 implements p8c {
    public final gt3 a;
    public final int b;
    public final int c;

    public at3(gt3 gt3Var, int i, int i2) {
        this.a = gt3Var;
        this.b = i;
        this.c = i2;
    }

    @Override
    public final void a(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        gt3 gt3Var = this.a;
        Editable text = gt3Var.getText();
        int i = this.b;
        text.replace(i, this.c, charSequence);
        gt3Var.setSelection(i, charSequence.length() + i);
    }
}
