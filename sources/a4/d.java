package a4;

import h5.w;
import j3.n0;
import java.util.Arrays;
import k7.v6;
import k7.w6;
import q5.c0;
import r3.o;
public final class d extends j {
    public o f63n;
    public c f64o;

    @Override
    public final long b(w wVar) {
        byte[] bArr = wVar.f7308a;
        if (bArr[0] == -1) {
            int i10 = (bArr[2] & 255) >> 4;
            if (i10 == 6 || i10 == 7) {
                wVar.G(4);
                wVar.A();
            }
            int b10 = v6.b(i10, wVar);
            wVar.F(0);
            return b10;
        }
        return -1L;
    }

    @Override
    public final boolean c(w wVar, long j10, bf.b bVar) {
        byte[] bArr = wVar.f7308a;
        o oVar = this.f63n;
        if (oVar == null) {
            o oVar2 = new o(bArr, 17);
            this.f63n = oVar2;
            bVar.f1935b = oVar2.c(Arrays.copyOfRange(bArr, 9, wVar.f7310c), null);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) == 3) {
            c0 b11 = w6.b(wVar);
            o oVar3 = new o(oVar.f46597a, oVar.f46598b, oVar.f46599c, oVar.d, oVar.f46600e, oVar.f46602g, oVar.h, oVar.f46604j, b11, oVar.f46606l);
            this.f63n = oVar3;
            ?? obj = new Object();
            obj.f62c = oVar3;
            obj.d = b11;
            obj.f60a = -1L;
            obj.f61b = -1L;
            this.f64o = obj;
            return true;
        } else if (b10 != -1) {
            return true;
        } else {
            c cVar = this.f64o;
            if (cVar != null) {
                cVar.f60a = j10;
                bVar.f1936c = cVar;
            }
            ((n0) bVar.f1935b).getClass();
            return false;
        }
    }

    @Override
    public final void d(boolean z4) {
        super.d(z4);
        if (z4) {
            this.f63n = null;
            this.f64o = null;
        }
    }
}
