package nc;
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
                lVar.f17290c = b2.f17246f;
                return;
            }
            lVar.e();
            lVar.f17290c = b2.C;
            return;
        }
        lVar.g("<!");
        lVar.f17290c = b2.E;
    }
}
