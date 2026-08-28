package fe;

import ie.r;
public final class o extends ke.a {
    public final r f6121a = new ie.p();
    public final k f6122b = new k();

    @Override
    public final void a(java.lang.CharSequence r12) {
        throw new UnsupportedOperationException("Method not decompiled: fe.o.a(java.lang.CharSequence):void");
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final void d() {
        if (this.f6122b.f6107b.length() == 0) {
            this.f6121a.g();
        }
    }

    @Override
    public final ie.a e() {
        return this.f6121a;
    }

    @Override
    public final void g(je.a aVar) {
        StringBuilder sb2 = this.f6122b.f6107b;
        if (sb2.length() > 0) {
            aVar.a(sb2.toString(), this.f6121a);
        }
    }

    @Override
    public final e4.h h(e eVar) {
        if (!eVar.h) {
            return e4.h.a(eVar.f6063b);
        }
        return null;
    }
}
