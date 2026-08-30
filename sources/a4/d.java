package a4;

import h5.w;
import j3.n0;
import java.util.Arrays;
import k7.u6;
import k7.v6;
import q5.g0;
import r3.o;
public final class d extends j {
    public o f59n;
    public c f60o;

    @Override
    public final long b(w wVar) {
        byte[] bArr = wVar.f7000a;
        if (bArr[0] == -1) {
            int i10 = (bArr[2] & 255) >> 4;
            if (i10 == 6 || i10 == 7) {
                wVar.G(4);
                wVar.A();
            }
            int b10 = u6.b(i10, wVar);
            wVar.F(0);
            return b10;
        }
        return -1L;
    }

    @Override
    public final boolean c(w wVar, long j10, bf.b bVar) {
        byte[] bArr = wVar.f7000a;
        o oVar = this.f59n;
        if (oVar == null) {
            o oVar2 = new o(bArr, 17);
            this.f59n = oVar2;
            bVar.f1782b = oVar2.c(Arrays.copyOfRange(bArr, 9, wVar.f7002c), null);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) == 3) {
            g0 b11 = v6.b(wVar);
            o oVar3 = new o(oVar.f43231a, oVar.f43232b, oVar.f43233c, oVar.d, oVar.e, oVar.f43235g, oVar.h, oVar.f43237j, b11, oVar.f43239l);
            this.f59n = oVar3;
            ?? obj = new Object();
            obj.f58c = oVar3;
            obj.d = b11;
            obj.f56a = -1L;
            obj.f57b = -1L;
            this.f60o = obj;
            return true;
        } else if (b10 != -1) {
            return true;
        } else {
            c cVar = this.f60o;
            if (cVar != null) {
                cVar.f56a = j10;
                bVar.f1783c = cVar;
            }
            ((n0) bVar.f1782b).getClass();
            return false;
        }
    }

    @Override
    public final void d(boolean z4) {
        super.d(z4);
        if (z4) {
            this.f59n = null;
            this.f60o = null;
        }
    }
}
