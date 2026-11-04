package ad;
public enum w1 extends c2 {
    public w1() {
        super("BogusDoctype", 65);
    }

    @Override
    public final void d(m mVar, a aVar) {
        char d = aVar.d();
        x xVar = c2.f317a;
        if (d != '>') {
            if (d != 65535) {
                return;
            }
            mVar.j();
            mVar.f370c = xVar;
            return;
        }
        mVar.j();
        mVar.f370c = xVar;
    }
}
