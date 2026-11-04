package j3;

import e3.e;
import e3.f;
import e3.g;
import e3.i;
import e3.p;
import e3.s;
public final class a {
    public final e f16175a;
    public final i f16176b;
    public f f16177c;
    public final int d;

    public a(g gVar, i iVar, long j10, long j11, long j12, long j13, long j14, int i3) {
        this.f16176b = iVar;
        this.d = i3;
        this.f16175a = new e(gVar, j10, j11, j12, j13, j14);
    }

    public static int a(int i3, byte[] bArr) {
        return (bArr[i3 + 3] & 255) | ((bArr[i3] & 255) << 24) | ((bArr[i3 + 1] & 255) << 16) | ((bArr[i3 + 2] & 255) << 8);
    }

    public static int c(p pVar, long j10, s sVar) {
        if (j10 == pVar.getPosition()) {
            return 0;
        }
        sVar.f9506a = j10;
        return 1;
    }

    public final int b(e3.p r28, e3.s r29) {
        throw new UnsupportedOperationException("Method not decompiled: j3.a.b(e3.p, e3.s):int");
    }

    public final void d(long j10) {
        f fVar = this.f16177c;
        if (fVar != null && fVar.f9460a == j10) {
            return;
        }
        e eVar = this.f16175a;
        this.f16177c = new f(j10, eVar.f9455a.k(j10), eVar.f9457c, eVar.d, eVar.f9458e, eVar.f9459f);
    }
}
