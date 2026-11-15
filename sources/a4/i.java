package a4;

import e2.q0;
import e2.s0;
import e2.t;
import e2.u;
import h2.x;
import h9.i0;
import i2.o;
import java.util.ArrayList;
import java.util.Arrays;
import q4.q;
public final class i extends j {
    public static final byte[] f176o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] f177p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean f178n;

    public static boolean e(x xVar, byte[] bArr) {
        if (xVar.a() < bArr.length) {
            return false;
        }
        int i7 = xVar.f13522b;
        byte[] bArr2 = new byte[bArr.length];
        xVar.k(0, bArr.length, bArr2);
        xVar.N(i7);
        return Arrays.equals(bArr2, bArr);
    }

    @Override
    public final long b(x xVar) {
        byte[] bArr = xVar.f13521a;
        byte b10 = 0;
        byte b11 = bArr[0];
        if (bArr.length > 1) {
            b10 = bArr[1];
        }
        return (this.f185i * o.e(b11, b10)) / 1000000;
    }

    @Override
    public final boolean c(x xVar, long j3, q qVar) {
        if (e(xVar, f176o)) {
            byte[] copyOf = Arrays.copyOf(xVar.f13521a, xVar.f13523c);
            int i7 = copyOf[9] & 255;
            ArrayList a10 = o.a(copyOf);
            if (((u) qVar.f55252b) == null) {
                t tVar = new t();
                tVar.f10398q = s0.n("audio/ogg");
                tVar.f10399r = s0.n("audio/opus");
                tVar.J = i7;
                tVar.K = 48000;
                tVar.f10402u = a10;
                qVar.f55252b = new u(tVar);
                return true;
            }
        } else if (e(xVar, f177p)) {
            ((u) qVar.f55252b).getClass();
            if (!this.f178n) {
                this.f178n = true;
                xVar.O(8);
                q0 r10 = f3.b.r(i0.r(f3.b.u(xVar, false, false).f10862a));
                if (r10 != null) {
                    t a11 = ((u) qVar.f55252b).a();
                    a11.f10392k = r10.b(((u) qVar.f55252b).f10444l);
                    qVar.f55252b = new u(a11);
                    return true;
                }
            }
        } else {
            ((u) qVar.f55252b).getClass();
            return false;
        }
        return true;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f178n = false;
        }
    }
}
