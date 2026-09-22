package dd;
public enum t extends b2 {
    public t() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        if (d != '!') {
            if (d != '/') {
                lVar.h("<");
                aVar.q();
                lVar.f7696c = b2.f7654f;
                return;
            }
            lVar.e();
            lVar.f7696c = b2.G;
            return;
        }
        lVar.h("<!");
        lVar.f7696c = b2.I;
    }
}
