package defpackage;

import android.content.Context;
public final class xp7 implements p8c {
    public final byte a;
    public final Context b;
    public final int c;
    public final wjb d;
    public final mp7 e;
    public final Boolean f;

    public xp7(Context context, int i, wjb wjbVar, mp7 mp7Var, Boolean bool, byte b) {
        this.a = b;
        this.b = context;
        this.c = i;
        this.d = wjbVar;
        this.e = mp7Var;
        this.f = bool;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        mp7 mp7Var = this.e;
        switch (b) {
            case 0:
                u21 j = mp7Var.j();
                cq7.q(this.b, this.c, this.d, j, (String) obj, this.f);
                return;
            case 1:
                u21 j2 = mp7Var.j();
                cq7.q(this.b, this.c, this.d, j2, (String) obj, this.f);
                return;
            case 2:
                u21 j3 = mp7Var.j();
                cq7.q(this.b, this.c, this.d, j3, (String) obj, this.f);
                return;
            default:
                u21 j4 = mp7Var.j();
                cq7.q(this.b, this.c, this.d, j4, (String) obj, this.f);
                return;
        }
    }
}
