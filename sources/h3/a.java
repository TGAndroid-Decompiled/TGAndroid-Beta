package h3;

import c3.e;
import c3.f;
import c3.g;
import c3.i;
import c3.p;
import c3.s;
public final class a {
    public final e f9226a;
    public final i f9227b;
    public f f9228c;
    public final int d;

    public a(g gVar, i iVar, long j3, long j10, long j11, long j12, long j13, int i10) {
        this.f9227b = iVar;
        this.d = i10;
        this.f9226a = new e(gVar, j3, j10, j11, j12, j13);
    }

    public static int a(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static int c(p pVar, long j3, s sVar) {
        if (j3 == pVar.getPosition()) {
            return 0;
        }
        sVar.f4212a = j3;
        return 1;
    }

    public final int b(c3.p r27, c3.s r28) {
        throw new UnsupportedOperationException("Method not decompiled: h3.a.b(c3.p, c3.s):int");
    }

    public final void d(long j3) {
        f fVar = this.f9228c;
        if (fVar != null && fVar.f4174a == j3) {
            return;
        }
        e eVar = this.f9226a;
        this.f9228c = new f(j3, eVar.f4170a.b(j3), eVar.f4172c, eVar.d, eVar.e, eVar.f4173f);
    }
}
