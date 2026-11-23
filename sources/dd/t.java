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
                lVar.f8318c = b2.f8274f;
                return;
            }
            lVar.e();
            lVar.f8318c = b2.H;
            return;
        }
        lVar.h("<!");
        lVar.f8318c = b2.J;
    }
}
