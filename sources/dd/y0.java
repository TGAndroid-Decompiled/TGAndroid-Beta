package dd;
public enum y0 extends b2 {
    public y0() {
        super("CommentStart", 44);
    }

    @Override
    public final void d(l lVar, a aVar) {
        e eVar = lVar.f8054n;
        char d = aVar.d();
        a1 a1Var = b2.f8007k0;
        if (d != 0) {
            if (d != '-') {
                w wVar = b2.f7992a;
                if (d != '>') {
                    if (d != 65535) {
                        eVar.f8029c.append(d);
                        lVar.f8045c = a1Var;
                        return;
                    }
                    lVar.l(this);
                    lVar.i();
                    lVar.f8045c = wVar;
                    return;
                }
                lVar.m(this);
                lVar.i();
                lVar.f8045c = wVar;
                return;
            }
            lVar.f8045c = b2.f8006j0;
            return;
        }
        lVar.m(this);
        eVar.f8029c.append((char) 65533);
        lVar.f8045c = a1Var;
    }
}
