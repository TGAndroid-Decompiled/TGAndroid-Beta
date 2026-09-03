package a4;

import h5.w;
import j3.n0;
import java.util.Arrays;
import k7.v6;
import k7.w6;
import q5.c0;
import r3.o;
public final class d extends j {
    public o f58n;
    public c f59o;

    @Override
    public final long b(w wVar) {
        byte[] bArr = wVar.f6987a;
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
    public final boolean c(w wVar, long j10, af.c cVar) {
        byte[] bArr = wVar.f6987a;
        o oVar = this.f58n;
        if (oVar == null) {
            o oVar2 = new o(bArr, 17);
            this.f58n = oVar2;
            cVar.f156b = oVar2.c(Arrays.copyOfRange(bArr, 9, wVar.f6989c), null);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) == 3) {
            c0 b11 = w6.b(wVar);
            o oVar3 = new o(oVar.f43255a, oVar.f43256b, oVar.f43257c, oVar.d, oVar.e, oVar.f43259g, oVar.h, oVar.f43261j, b11, oVar.f43263l);
            this.f58n = oVar3;
            ?? obj = new Object();
            obj.f57c = oVar3;
            obj.d = b11;
            obj.f55a = -1L;
            obj.f56b = -1L;
            this.f59o = obj;
            return true;
        } else if (b10 != -1) {
            return true;
        } else {
            c cVar2 = this.f59o;
            if (cVar2 != null) {
                cVar2.f55a = j10;
                cVar.f157c = cVar2;
            }
            ((n0) cVar.f156b).getClass();
            return false;
        }
    }

    @Override
    public final void d(boolean z4) {
        super.d(z4);
        if (z4) {
            this.f58n = null;
            this.f59o = null;
        }
    }
}
