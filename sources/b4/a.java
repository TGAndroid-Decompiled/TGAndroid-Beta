package b4;

import org.telegram.ui.Components.jb;
public final class a implements r3.k {
    public final b f1410a = new b(null, 0);
    public final h5.w f1411b = new h5.w(2786);
    public boolean f1412c;

    @Override
    public final void d(long j10, long j11) {
        this.f1412c = false;
        this.f1410a.b();
    }

    @Override
    public final void e(r3.m mVar) {
        this.f1410a.c(mVar, new h0(0, 1));
        mVar.i1();
        mVar.m2(new r3.n(-9223372036854775807L));
    }

    @Override
    public final int h(r3.l lVar, jb jbVar) {
        h5.w wVar = this.f1411b;
        int read = ((r3.h) lVar).read(wVar.f7308a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        wVar.F(0);
        wVar.E(read);
        boolean z4 = this.f1412c;
        b bVar = this.f1410a;
        if (!z4) {
            bVar.e(4, 0L);
            this.f1412c = true;
        }
        bVar.a(wVar);
        return 0;
    }

    @Override
    public final boolean i(r3.l r14) {
        throw new UnsupportedOperationException("Method not decompiled: b4.a.i(r3.l):boolean");
    }

    @Override
    public final void release() {
    }
}
