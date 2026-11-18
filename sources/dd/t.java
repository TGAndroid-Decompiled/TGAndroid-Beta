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
                lVar.f8327c = b2.f8283f;
                return;
            }
            lVar.e();
            lVar.f8327c = b2.H;
            return;
        }
        lVar.h("<!");
        lVar.f8327c = b2.J;
    }
}
