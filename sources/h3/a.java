package h3;

import c3.e;
import c3.f;
import c3.g;
import c3.i;
import c3.p;
import c3.s;
public final class a {
    public final e f10341a;
    public final i f10342b;
    public f f10343c;
    public final int d;

    public a(g gVar, i iVar, long j10, long j11, long j12, long j13, long j14, int i10) {
        this.f10342b = iVar;
        this.d = i10;
        this.f10341a = new e(gVar, j10, j11, j12, j13, j14);
    }

    public static int a(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static int c(p pVar, long j10, s sVar) {
        if (j10 == pVar.getPosition()) {
            return 0;
        }
        sVar.f4279a = j10;
        return 1;
    }

    public final int b(c3.p r28, c3.s r29) {
        throw new UnsupportedOperationException("Method not decompiled: h3.a.b(c3.p, c3.s):int");
    }

    public final void d(long j10) {
        f fVar = this.f10343c;
        if (fVar != null && fVar.f4239a == j10) {
            return;
        }
        e eVar = this.f10341a;
        this.f10343c = new f(j10, eVar.f4235a.k(j10), eVar.f4237c, eVar.d, eVar.e, eVar.f4238f);
    }
}
