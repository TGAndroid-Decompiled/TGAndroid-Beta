package gf;

import kf.r;
public final class p extends mf.a {
    public final r f13602a = new kf.p();
    public final l f13603b = new l();

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
        if (this.f13603b.f13588b.length() == 0) {
            this.f13602a.g();
        }
    }

    @Override
    public final kf.a e() {
        return this.f13602a;
    }

    @Override
    public final void g(lf.a aVar) {
        StringBuilder sb2 = this.f13603b.f13588b;
        if (sb2.length() > 0) {
            aVar.a(sb2.toString(), this.f13602a);
        }
    }

    @Override
    public final a h(g gVar) {
        if (!gVar.h) {
            return a.a(gVar.f13547b);
        }
        return null;
    }
}
