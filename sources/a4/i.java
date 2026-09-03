package a4;

import h5.w;
import j3.m0;
import j3.n0;
import java.util.ArrayList;
import java.util.Arrays;
import k7.x6;
import s8.v;
public final class i extends j {
    public static final byte[] f71o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] f72p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean f73n;

    public static boolean e(w wVar, byte[] bArr) {
        if (wVar.a() < bArr.length) {
            return false;
        }
        int i10 = wVar.f6988b;
        byte[] bArr2 = new byte[bArr.length];
        wVar.e(0, bArr.length, bArr2);
        wVar.F(i10);
        return Arrays.equals(bArr2, bArr);
    }

    @Override
    public final long b(w wVar) {
        byte[] bArr = wVar.f6987a;
        byte b10 = 0;
        byte b11 = bArr[0];
        if (bArr.length > 1) {
            b10 = bArr[1];
        }
        return (this.f79i * l3.a.e(b11, b10)) / 1000000;
    }

    @Override
    public final boolean c(w wVar, long j10, af.c cVar) {
        if (e(wVar, f71o)) {
            byte[] copyOf = Arrays.copyOf(wVar.f6987a, wVar.f6989c);
            int i10 = copyOf[9] & 255;
            ArrayList a2 = l3.a.a(copyOf);
            if (((n0) cVar.f156b) == null) {
                m0 m0Var = new m0();
                m0Var.f8666o = "audio/opus";
                m0Var.B = i10;
                m0Var.C = 48000;
                m0Var.f8668q = a2;
                cVar.f156b = new n0(m0Var);
                return true;
            }
        } else if (e(wVar, f72p)) {
            h5.a.j((n0) cVar.f156b);
            if (!this.f73n) {
                this.f73n = true;
                wVar.G(8);
                e4.c a10 = x6.a(v.u((String[]) x6.b(wVar, false, false).f29015b));
                if (a10 != null) {
                    m0 a11 = ((n0) cVar.f156b).a();
                    e4.c cVar2 = ((n0) cVar.f156b).f8723s;
                    if (cVar2 != null) {
                        a10 = a10.a(cVar2.f5109a);
                    }
                    a11.f8660i = a10;
                    cVar.f156b = new n0(a11);
                    return true;
                }
            }
        } else {
            h5.a.j((n0) cVar.f156b);
            return false;
        }
        return true;
    }

    @Override
    public final void d(boolean z4) {
        super.d(z4);
        if (z4) {
            this.f73n = false;
        }
    }
}
