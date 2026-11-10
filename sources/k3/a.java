package k3;

import f3.e;
import f3.f;
import f3.g;
import f3.i;
import f3.p;
import f3.s;
public final class a {
    public final e f17193a;
    public final i f17194b;
    public f f17195c;
    public final int d;

    public a(g gVar, i iVar, long j3, long j10, long j11, long j12, long j13, int i7) {
        this.f17194b = iVar;
        this.d = i7;
        this.f17193a = new e(gVar, j3, j10, j11, j12, j13);
    }

    public static int a(int i7, byte[] bArr) {
        return (bArr[i7 + 3] & 255) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7 + 2] & 255) << 8);
    }

    public static int c(p pVar, long j3, s sVar) {
        if (j3 == pVar.getPosition()) {
            return 0;
        }
        sVar.f11075a = j3;
        return 1;
    }

    public final int b(f3.p r28, f3.s r29) {
        throw new UnsupportedOperationException("Method not decompiled: k3.a.b(f3.p, f3.s):int");
    }

    public final void d(long j3) {
        f fVar = this.f17195c;
        if (fVar != null && fVar.f11029a == j3) {
            return;
        }
        e eVar = this.f17193a;
        this.f17195c = new f(j3, eVar.f11018a.q(j3), eVar.f11020c, eVar.d, eVar.f11021e, eVar.f11022f);
    }
}
