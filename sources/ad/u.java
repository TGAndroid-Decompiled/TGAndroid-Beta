package ad;
public enum u extends c2 {
    public u() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override
    public final void d(m mVar, a aVar) {
        char d = aVar.d();
        if (d != '!') {
            if (d != '/') {
                mVar.h("<");
                aVar.q();
                mVar.f370c = c2.f326f;
                return;
            }
            mVar.e();
            mVar.f370c = c2.H;
            return;
        }
        mVar.h("<!");
        mVar.f370c = c2.J;
    }
}
