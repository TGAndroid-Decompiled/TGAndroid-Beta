package defpackage;

import android.content.Context;
public final class xs7 implements pcc {
    public final byte a;
    public final Context b;
    public final int c;
    public final vnb d;
    public final ms7 e;
    public final Boolean f;

    public xs7(Context context, int i, vnb vnbVar, ms7 ms7Var, Boolean bool, byte b) {
        this.a = b;
        this.b = context;
        this.c = i;
        this.d = vnbVar;
        this.e = ms7Var;
        this.f = bool;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        ms7 ms7Var = this.e;
        switch (b) {
            case 0:
                d31 j = ms7Var.j();
                it7.t(this.b, this.c, this.d, j, (String) obj, this.f);
                return;
            case 1:
                d31 j2 = ms7Var.j();
                it7.t(this.b, this.c, this.d, j2, (String) obj, this.f);
                return;
            case 2:
                d31 j3 = ms7Var.j();
                it7.t(this.b, this.c, this.d, j3, (String) obj, this.f);
                return;
            default:
                d31 j4 = ms7Var.j();
                it7.t(this.b, this.c, this.d, j4, (String) obj, this.f);
                return;
        }
    }
}
