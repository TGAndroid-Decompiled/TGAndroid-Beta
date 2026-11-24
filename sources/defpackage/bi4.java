package defpackage;

import java.util.Arrays;
public final class bi4 extends w8b {
    public ci4 n;
    public ly0 o;

    @Override
    public final boolean c(xu7 xu7Var, long j, v8b v8bVar) {
        byte[] bArr = xu7Var.a;
        ci4 ci4Var = this.n;
        if (ci4Var == null) {
            ci4 ci4Var2 = new ci4(17, bArr);
            this.n = ci4Var2;
            em4 a = ci4Var2.c(Arrays.copyOfRange(bArr, 9, xu7Var.c), null).a();
            a.r = ud7.n("audio/ogg");
            v8bVar.b = new fm4(a);
            return true;
        }
        byte b = bArr[0];
        if ((b & Byte.MAX_VALUE) == 3) {
            lv6 b2 = qge.b(xu7Var);
            ci4 ci4Var3 = new ci4(ci4Var.a, ci4Var.b, ci4Var.c, ci4Var.d, ci4Var.e, ci4Var.g, ci4Var.h, ci4Var.j, b2, ci4Var.l);
            this.n = ci4Var3;
            ?? obj = new Object();
            obj.c = ci4Var3;
            obj.d = b2;
            obj.a = -1L;
            obj.b = -1L;
            this.o = obj;
            return true;
        } else if (b != -1) {
            return true;
        } else {
            ly0 ly0Var = this.o;
            if (ly0Var != null) {
                ly0Var.a = j;
                v8bVar.c = ly0Var;
            }
            ((fm4) v8bVar.b).getClass();
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
