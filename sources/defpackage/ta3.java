package defpackage;

import android.view.View;
public final class ta3 implements x76, h59 {
    public final byte a;
    public final Object b;

    public ta3(tk tkVar, int i, qe8 qe8Var, qe8 qe8Var2) {
        this.b = tkVar;
        this.a = i;
    }

    @Override
    public final boolean g(int i, View view) {
        u29 u29Var;
        v29 v29Var = (v29) this.b;
        if (this.a == 5 || (u29Var = v29Var.h0) == null || !(view instanceof t29)) {
            return false;
        }
        u29Var.g(v29Var, ((t29) view).e, true, false);
        return true;
    }

    @Override
    public final void invoke(Object obj) {
        uk ukVar = (uk) obj;
        ukVar.getClass();
        ukVar.w((tk) this.b, this.a);
    }

    public ta3(v29 v29Var, int i) {
        this.b = v29Var;
        this.a = i;
    }
}
