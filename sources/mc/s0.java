package mc;

public final enum s0 extends b2 {
    public s0() {
        super("Rcdata", 2);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char cI = aVar.i();
        if (cI == 0) {
            lVar.m(this);
            aVar.a();
            lVar.f((char) 65533);
        } else {
            if (cI == '&') {
                lVar.a(b2.d);
                return;
            }
            if (cI == '<') {
                lVar.a(b2.f17978s);
            } else if (cI != 65535) {
                lVar.g(aVar.g('&', '<', 0));
            } else {
                lVar.h(new g());
            }
        }
    }
}
