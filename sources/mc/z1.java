package mc;

public final enum z1 extends b2 {
    public z1() {
        super("TagOpen", 7);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char cI = aVar.i();
        if (cI == '!') {
            lVar.a(b2.f17959c0);
            return;
        }
        if (cI == '/') {
            lVar.a(b2.f17971n);
            return;
        }
        if (cI == '?') {
            lVar.a(b2.f17957b0);
            return;
        }
        if (aVar.o()) {
            lVar.d(true);
            lVar.f18007c = b2.f17976r;
        } else {
            lVar.m(this);
            lVar.f('<');
            lVar.f18007c = b2.f17954a;
        }
    }
}
