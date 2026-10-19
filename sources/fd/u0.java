package fd;
public enum u0 extends a2 {
    public u0() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        v vVar = a2.f10521a;
        if (d != '>') {
            if (d != 65535) {
                kVar.m(this);
                aVar.q();
                kVar.f10569c = a2.W;
                return;
            }
            kVar.l(this);
            kVar.f10569c = vVar;
            return;
        }
        kVar.f10572i.f10563j = true;
        kVar.k();
        kVar.f10569c = vVar;
    }
}
