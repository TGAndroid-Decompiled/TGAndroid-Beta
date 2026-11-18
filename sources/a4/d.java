package a4;

import e2.s0;
import e2.t;
import f3.u;
import h2.x;
import java.util.Arrays;
import q4.q;
public final class d extends j {
    public u f161n;
    public c f162o;

    @Override
    public final long b(x xVar) {
        byte[] bArr = xVar.f13836a;
        if (bArr[0] == -1) {
            int i7 = (bArr[2] & 255) >> 4;
            if (i7 == 6 || i7 == 7) {
                xVar.O(4);
                xVar.I();
            }
            int s5 = f3.b.s(i7, xVar);
            xVar.N(0);
            return s5;
        }
        return -1L;
    }

    @Override
    public final boolean c(x xVar, long j3, q qVar) {
        byte[] bArr = xVar.f13836a;
        u uVar = this.f161n;
        if (uVar == null) {
            u uVar2 = new u(bArr, 17);
            this.f161n = uVar2;
            t a10 = uVar2.c(Arrays.copyOfRange(bArr, 9, xVar.f13838c), null).a();
            a10.f10716q = s0.n("audio/ogg");
            qVar.f55826b = new e2.u(a10);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) == 3) {
            wf.b t6 = f3.b.t(xVar);
            u uVar3 = new u(uVar.f11203a, uVar.f11204b, uVar.f11205c, uVar.d, uVar.f11206e, uVar.f11208g, uVar.h, uVar.f11210j, t6, uVar.f11212l);
            this.f161n = uVar3;
            ?? obj = new Object();
            obj.f160c = uVar3;
            obj.d = t6;
            obj.f158a = -1L;
            obj.f159b = -1L;
            this.f162o = obj;
            return true;
        } else if (b10 != -1) {
            return true;
        } else {
            c cVar = this.f162o;
            if (cVar != null) {
                cVar.f158a = j3;
                qVar.f55827c = cVar;
            }
            ((e2.u) qVar.f55826b).getClass();
            return false;
        }
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f161n = null;
            this.f162o = null;
        }
    }
}
