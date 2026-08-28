package lc;
public enum v0 extends b2 {
    public v0() {
        super("SelfClosingStartTag", 41);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        w wVar = b2.f16770a;
        if (d != '>') {
            if (d != 65535) {
                lVar.m(this);
                aVar.q();
                lVar.f16823c = b2.S;
                return;
            }
            lVar.l(this);
            lVar.f16823c = wVar;
            return;
        }
        lVar.f16827i.f16815j = true;
        lVar.k();
        lVar.f16823c = wVar;
    }
}
