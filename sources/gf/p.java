package gf;

import kf.r;
public final class p extends mf.a {
    public final r f13634a = new kf.p();
    public final l f13635b = new l();

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
        if (this.f13635b.f13620b.length() == 0) {
            this.f13634a.g();
        }
    }

    @Override
    public final kf.a e() {
        return this.f13634a;
    }

    @Override
    public final void g(lf.a aVar) {
        StringBuilder sb2 = this.f13635b.f13620b;
        if (sb2.length() > 0) {
            aVar.a(sb2.toString(), this.f13634a);
        }
    }

    @Override
    public final a h(g gVar) {
        if (!gVar.h) {
            return a.a(gVar.f13579b);
        }
        return null;
    }
}
