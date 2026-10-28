package h3;

import c3.e;
import c3.f;
import c3.g;
import c3.i;
import c3.p;
import c3.s;
public final class a {
    public final e f12584a;
    public final i f12585b;
    public f f12586c;
    public final int d;

    public a(g gVar, i iVar, long j10, long j11, long j12, long j13, long j14, int i10) {
        this.f12585b = iVar;
        this.d = i10;
        this.f12584a = new e(gVar, j10, j11, j12, j13, j14);
    }

    public static int a(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static int c(p pVar, long j10, s sVar) {
        if (j10 == pVar.getPosition()) {
            return 0;
        }
        sVar.f6092a = j10;
        return 1;
    }

    public final int b(c3.p r28, c3.s r29) {
        throw new UnsupportedOperationException("Method not decompiled: h3.a.b(c3.p, c3.s):int");
    }

    public final void d(long j10) {
        f fVar = this.f12586c;
        if (fVar != null && fVar.f6051a == j10) {
            return;
        }
        e eVar = this.f12584a;
        this.f12586c = new f(j10, eVar.f6047a.g(j10), eVar.f6049c, eVar.d, eVar.e, eVar.f6050f);
    }
}
