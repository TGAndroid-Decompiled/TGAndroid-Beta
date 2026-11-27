package defpackage;

import android.content.Context;
public final class lo8 implements tw8 {
    public final byte a = 0;
    public final tw8 b;
    public final aj3 c;

    public lo8(aj3 aj3Var, tw8 tw8Var) {
        this.c = aj3Var;
        this.b = tw8Var;
    }

    @Override
    public final Object mo21get() {
        byte b = this.a;
        aj3 aj3Var = this.c;
        tw8 tw8Var = this.b;
        switch (b) {
            case 0:
                return new ko8((Context) aj3Var.b, (vcc) tw8Var.mo21get());
            default:
                return new ca9((tr) tw8Var.mo21get(), (mx2) aj3Var.b);
        }
    }

    public lo8(tw8 tw8Var, aj3 aj3Var) {
        this.b = tw8Var;
        this.c = aj3Var;
    }
}
