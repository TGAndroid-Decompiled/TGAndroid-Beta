package b4;

import org.telegram.ui.Components.jb;
public final class x {
    public final r3.a f1665a;
    public final r3.e f1666b;
    public r3.b f1667c;
    public final int d;

    public x(r3.c cVar, r3.e eVar, long j10, long j11, long j12, long j13, long j14, int i10) {
        this.f1666b = eVar;
        this.d = i10;
        this.f1665a = new r3.a(cVar, j10, j11, j12, j13, j14);
    }

    public static int a(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static int c(r3.l lVar, long j10, jb jbVar) {
        if (j10 == lVar.getPosition()) {
            return 0;
        }
        jbVar.f28091a = j10;
        return 1;
    }

    public final int b(r3.l r27, org.telegram.ui.Components.jb r28) {
        throw new UnsupportedOperationException("Method not decompiled: b4.x.b(r3.l, org.telegram.ui.Components.jb):int");
    }

    public final void d(long j10) {
        r3.b bVar = this.f1667c;
        if (bVar != null && bVar.f46534a == j10) {
            return;
        }
        r3.a aVar = this.f1665a;
        this.f1667c = new r3.b(j10, aVar.f46529a.f(j10), aVar.f46531c, aVar.d, aVar.f46532e, aVar.f46533f);
    }
}
