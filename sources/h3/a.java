package h3;

import c3.e;
import c3.f;
import c3.g;
import c3.i;
import c3.r;
import c3.u;
public final class a {
    public final e f11676a;
    public final i f11677b;
    public f f11678c;
    public final int d;

    public a(g gVar, i iVar, long j10, long j11, long j12, long j13, long j14, int i10) {
        this.f11677b = iVar;
        this.d = i10;
        this.f11676a = new e(gVar, j10, j11, j12, j13, j14);
    }

    public static int a(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static int c(r rVar, long j10, u uVar) {
        if (j10 == rVar.getPosition()) {
            return 0;
        }
        uVar.f4664a = j10;
        return 1;
    }

    public final int b(c3.r r28, c3.u r29) {
        throw new UnsupportedOperationException("Method not decompiled: h3.a.b(c3.r, c3.u):int");
    }

    public final void d(long j10) {
        f fVar = this.f11678c;
        if (fVar != null && fVar.f4615a == j10) {
            return;
        }
        e eVar = this.f11676a;
        this.f11678c = new f(j10, eVar.f4611a.k(j10), eVar.f4613c, eVar.d, eVar.e, eVar.f4614f);
    }
}
