package ed;
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
                lVar.f8885c = b2.f8841f;
                return;
            }
            lVar.e();
            lVar.f8885c = b2.G;
            return;
        }
        lVar.h("<!");
        lVar.f8885c = b2.I;
    }
}
