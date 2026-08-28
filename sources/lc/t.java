package lc;
public enum t extends b2 {
    public t() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        if (d != '!') {
            if (d != '/') {
                lVar.g("<");
                aVar.q();
                lVar.f16823c = b2.f16779f;
                return;
            }
            lVar.e();
            lVar.f16823c = b2.C;
            return;
        }
        lVar.g("<!");
        lVar.f16823c = b2.E;
    }
}
