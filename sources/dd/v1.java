package dd;
public enum v1 extends b2 {
    public v1() {
        super("BogusDoctype", 65);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char d = aVar.d();
        w wVar = b2.f6420a;
        if (d != '>') {
            if (d != 65535) {
                return;
            }
            lVar.j();
            lVar.f6470c = wVar;
            return;
        }
        lVar.j();
        lVar.f6470c = wVar;
    }
}
