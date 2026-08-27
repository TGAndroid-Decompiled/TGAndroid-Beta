package mc;

public final enum z extends b2 {
    public z() {
        super("ScriptDataEscaped", 21);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.j()) {
            lVar.l(this);
            lVar.f18007c = b2.f17954a;
            return;
        }
        char cI = aVar.i();
        if (cI == 0) {
            lVar.m(this);
            aVar.a();
            lVar.f((char) 65533);
        } else if (cI == '-') {
            lVar.f('-');
            lVar.a(b2.H);
        } else if (cI != '<') {
            lVar.g(aVar.g('-', '<', 0));
        } else {
            lVar.a(b2.J);
        }
    }
}
