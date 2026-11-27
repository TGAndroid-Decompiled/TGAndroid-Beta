package defpackage;

import android.content.Context;
public final class ayd extends e23 {
    public final kg7 b;

    public ayd(kg7 kg7Var) {
        super((byte) 4);
        this.b = kg7Var;
    }

    @Override
    public final Object a(Object obj) {
        ggd q31Var;
        lm5 lm5Var = (lm5) obj;
        Context b = this.b.b();
        j05.b.getClass();
        if (c15.a(b) >= 204700000) {
            q31Var = new qoc(b, lm5Var);
        } else {
            q31Var = new q31(b, lm5Var);
        }
        return new ahe(lm5Var, q31Var, caf.c());
    }
}
