package defpackage;

import java.util.Arrays;
public final class fk4 extends yab {
    public gk4 n;
    public sz0 o;

    @Override
    public final boolean c(yw7 yw7Var, long j, xab xabVar) {
        byte[] bArr = yw7Var.a;
        gk4 gk4Var = this.n;
        if (gk4Var == null) {
            gk4 gk4Var2 = new gk4(17, bArr);
            this.n = gk4Var2;
            fo4 a = gk4Var2.c(Arrays.copyOfRange(bArr, 9, yw7Var.c), null).a();
            a.r = wf7.n("audio/ogg");
            xabVar.b = new go4(a);
            return true;
        }
        byte b = bArr[0];
        if ((b & Byte.MAX_VALUE) == 3) {
            lx6 b2 = rie.b(yw7Var);
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
            sz0 sz0Var = this.o;
            if (sz0Var != null) {
                sz0Var.a = j;
                xabVar.c = sz0Var;
            }
            ((go4) xabVar.b).getClass();
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
