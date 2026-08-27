package mc;

public final enum g0 extends b2 {
    public g0() {
        super("ScriptDataDoubleEscaped", 28);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char cI = aVar.i();
        if (cI == 0) {
            lVar.m(this);
            aVar.a();
            lVar.f((char) 65533);
        } else if (cI == '-') {
            lVar.f(cI);
            lVar.a(b2.O);
        } else if (cI == '<') {
            lVar.f(cI);
            lVar.a(b2.Q);
        } else if (cI != 65535) {
            lVar.g(aVar.g('-', '<', 0));
        } else {
            lVar.l(this);
            lVar.f18007c = b2.f17954a;
        }
    }
}
