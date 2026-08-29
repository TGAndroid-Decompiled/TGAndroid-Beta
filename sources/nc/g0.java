package nc;
public enum g0 extends b2 {
    public g0() {
        super("ScriptDataDoubleEscaped", 28);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char i10 = aVar.i();
        if (i10 != 0) {
            if (i10 != '-') {
                if (i10 != '<') {
                    if (i10 != 65535) {
                        lVar.g(aVar.g('-', '<', 0));
                        return;
                    }
                    lVar.l(this);
                    lVar.f17290c = b2.f17237a;
                    return;
                }
                lVar.f(i10);
                lVar.a(b2.Q);
                return;
            }
            lVar.f(i10);
            lVar.a(b2.O);
            return;
        }
        lVar.m(this);
        aVar.a();
        lVar.f((char) 65533);
    }
}
