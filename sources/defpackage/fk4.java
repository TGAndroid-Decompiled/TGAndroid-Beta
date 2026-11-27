package defpackage;

import java.util.Arrays;
public final class fk4 extends ucb {
    public gk4 n;
    public ty0 o;

    @Override
    public final boolean c(ey7 ey7Var, long j, k7b k7bVar) {
        byte[] bArr = ey7Var.a;
        gk4 gk4Var = this.n;
        if (gk4Var == null) {
            gk4 gk4Var2 = new gk4(17, bArr);
            this.n = gk4Var2;
            jo4 a = gk4Var2.c(Arrays.copyOfRange(bArr, 9, ey7Var.c), null).a();
            a.r = dg7.n("audio/ogg");
            k7bVar.b = new ko4(a);
            return true;
        }
        byte b = bArr[0];
        if ((b & Byte.MAX_VALUE) == 3) {
            lh2 b2 = lle.b(ey7Var);
            gk4 gk4Var3 = new gk4(gk4Var.a, gk4Var.b, gk4Var.c, gk4Var.d, gk4Var.e, gk4Var.g, gk4Var.h, gk4Var.j, b2, gk4Var.l);
            this.n = gk4Var3;
            ?? obj = new Object();
            obj.c = gk4Var3;
            obj.d = b2;
            obj.a = -1L;
            obj.b = -1L;
            this.o = obj;
            return true;
        } else if (b != -1) {
            return true;
        } else {
            ty0 ty0Var = this.o;
            if (ty0Var != null) {
                ty0Var.a = j;
                k7bVar.c = ty0Var;
            }
            ((ko4) k7bVar.b).getClass();
            return false;
        }
    }

    @Override
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
