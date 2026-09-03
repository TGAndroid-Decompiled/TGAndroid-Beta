package b4;

import org.telegram.ui.Components.jb;
public final class c implements r3.k {
    public final b f1340a = new b(null, 1);
    public final h5.w f1341b = new h5.w(16384);
    public boolean f1342c;

    @Override
    public final void d(long j10, long j11) {
        this.f1342c = false;
        this.f1340a.b();
    }

    @Override
    public final void e(r3.m mVar) {
        this.f1340a.c(mVar, new h0(0, 1));
        mVar.j1();
        mVar.h2(new r3.n(-9223372036854775807L));
    }

    @Override
    public final int h(r3.l lVar, jb jbVar) {
        h5.w wVar = this.f1341b;
        int read = ((r3.h) lVar).read(wVar.f6987a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        wVar.F(0);
        wVar.E(read);
        boolean z4 = this.f1342c;
        b bVar = this.f1340a;
        if (!z4) {
            bVar.e(4, 0L);
            this.f1342c = true;
        }
        bVar.a(wVar);
        return 0;
    }

    @Override
    public final boolean i(r3.l r15) {
        throw new UnsupportedOperationException("Method not decompiled: b4.c.i(r3.l):boolean");
    }

    @Override
    public final void release() {
    }
}
