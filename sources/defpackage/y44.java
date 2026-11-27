package defpackage;

import android.content.Context;
public final class y44 implements tw8 {
    public final byte a;
    public final aj3 b;

    public y44(aj3 aj3Var, byte b) {
        this.a = b;
        this.b = aj3Var;
    }

    @Override
    public final Object mo21get() {
        byte b = this.a;
        aj3 aj3Var = this.b;
        switch (b) {
            case 0:
                return new x44((vw8) aj3Var.b);
            default:
                return new ab6((Context) aj3Var.b);
        }
    }
}
