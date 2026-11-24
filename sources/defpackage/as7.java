package defpackage;

import android.content.Context;
public final class as7 implements qac {
    public final byte a;
    public final Context b;
    public final int c;
    public final ylb d;
    public final pr7 e;
    public final Boolean f;

    public as7(Context context, int i, ylb ylbVar, pr7 pr7Var, Boolean bool, byte b) {
        this.a = b;
        this.b = context;
        this.c = i;
        this.d = ylbVar;
        this.e = pr7Var;
        this.f = bool;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        pr7 pr7Var = this.e;
        switch (b) {
            case 0:
                c41 j = pr7Var.j();
                fs7.q(this.b, this.c, this.d, j, (String) obj, this.f);
                return;
            case 1:
                c41 j2 = pr7Var.j();
                fs7.q(this.b, this.c, this.d, j2, (String) obj, this.f);
                return;
            case 2:
                c41 j3 = pr7Var.j();
                fs7.q(this.b, this.c, this.d, j3, (String) obj, this.f);
                return;
            default:
                c41 j4 = pr7Var.j();
                fs7.q(this.b, this.c, this.d, j4, (String) obj, this.f);
                return;
        }
    }
}
