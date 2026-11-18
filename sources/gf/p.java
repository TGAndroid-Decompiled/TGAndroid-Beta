package gf;

import kf.r;
public final class p extends mf.a {
    public final r f13605a = new kf.p();
    public final l f13606b = new l();

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
        if (this.f13606b.f13591b.length() == 0) {
            this.f13605a.g();
        }
    }

    @Override
    public final kf.a e() {
        return this.f13605a;
    }

    @Override
    public final void g(lf.a aVar) {
        StringBuilder sb2 = this.f13606b.f13591b;
        if (sb2.length() > 0) {
            aVar.a(sb2.toString(), this.f13605a);
        }
    }

    @Override
    public final a h(g gVar) {
        if (!gVar.h) {
            return a.a(gVar.f13550b);
        }
        return null;
    }
}
