package gf;

import kf.r;
public final class p extends mf.a {
    public final r f13597a = new kf.p();
    public final l f13598b = new l();

    @Override
    public final void a(java.lang.CharSequence r12) {
        throw new UnsupportedOperationException("Method not decompiled: gf.p.a(java.lang.CharSequence):void");
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final void d() {
        if (this.f13598b.f13583b.length() == 0) {
            this.f13597a.g();
        }
    }

    @Override
    public final kf.a e() {
        return this.f13597a;
    }

    @Override
    public final void g(lf.a aVar) {
        StringBuilder sb2 = this.f13598b.f13583b;
        if (sb2.length() > 0) {
            aVar.a(sb2.toString(), this.f13597a);
        }
    }

    @Override
    public final a h(g gVar) {
        if (!gVar.h) {
            return a.a(gVar.f13542b);
        }
        return null;
    }
}
