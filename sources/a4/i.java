package a4;

import h5.w;
import j3.m0;
import j3.n0;
import java.util.ArrayList;
import java.util.Arrays;
import k7.w6;
import s8.v;
public final class i extends j {
    public static final byte[] f72o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] f73p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean f74n;

    public static boolean e(w wVar, byte[] bArr) {
        if (wVar.a() < bArr.length) {
            return false;
        }
        int i10 = wVar.f7001b;
        byte[] bArr2 = new byte[bArr.length];
        wVar.e(0, bArr.length, bArr2);
        wVar.F(i10);
        return Arrays.equals(bArr2, bArr);
    }

    @Override
    public final long b(w wVar) {
        byte[] bArr = wVar.f7000a;
        byte b10 = 0;
        byte b11 = bArr[0];
        if (bArr.length > 1) {
            b10 = bArr[1];
        }
        return (this.f80i * l3.a.e(b11, b10)) / 1000000;
    }

    @Override
    public final boolean c(w wVar, long j10, bf.b bVar) {
        if (e(wVar, f72o)) {
            byte[] copyOf = Arrays.copyOf(wVar.f7000a, wVar.f7002c);
            int i10 = copyOf[9] & 255;
            ArrayList a2 = l3.a.a(copyOf);
            if (((n0) bVar.f1782b) == null) {
                m0 m0Var = new m0();
                m0Var.f8684o = "audio/opus";
                m0Var.B = i10;
                m0Var.C = 48000;
                m0Var.f8686q = a2;
                bVar.f1782b = new n0(m0Var);
                return true;
            }
        } else if (e(wVar, f73p)) {
            h5.a.j((n0) bVar.f1782b);
            if (!this.f74n) {
                this.f74n = true;
                wVar.G(8);
                e4.c a10 = w6.a(v.u((String[]) w6.b(wVar, false, false).f16220b));
                if (a10 != null) {
                    m0 a11 = ((n0) bVar.f1782b).a();
                    e4.c cVar = ((n0) bVar.f1782b).f8741s;
                    if (cVar != null) {
                        a10 = a10.a(cVar.f5101a);
                    }
                    a11.f8678i = a10;
                    bVar.f1782b = new n0(a11);
                    return true;
                }
            }
        } else {
            h5.a.j((n0) bVar.f1782b);
            return false;
        }
        return true;
    }

    @Override
    public final void d(boolean z4) {
        super.d(z4);
        if (z4) {
            this.f74n = false;
        }
    }
}
