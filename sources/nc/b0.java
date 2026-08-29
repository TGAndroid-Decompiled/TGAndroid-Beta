package nc;
public enum b0 extends b2 {
    public b0() {
        super("ScriptDataEscapedDashDash", 23);
    }

    @Override
    public final void d(l lVar, a aVar) {
        if (aVar.j()) {
            lVar.l(this);
            lVar.f17290c = b2.f17237a;
            return;
        }
        char d = aVar.d();
        z zVar = b2.G;
        if (d != 0) {
            if (d != '-') {
                if (d != '<') {
                    if (d != '>') {
                        lVar.f(d);
                        lVar.f17290c = zVar;
                        return;
                    }
                    lVar.f(d);
                    lVar.f17290c = b2.f17246f;
                    return;
                }
                lVar.f17290c = b2.J;
                return;
            }
            lVar.f(d);
            return;
        }
        lVar.m(this);
        lVar.f((char) 65533);
        lVar.f17290c = zVar;
    }
}
