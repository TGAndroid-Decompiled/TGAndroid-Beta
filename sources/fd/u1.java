package fd;
public enum u1 extends a2 {
    public u1() {
        super("BogusDoctype", 65);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        v vVar = a2.f9076a;
        if (d != '>') {
            if (d != 65535) {
                return;
            }
            kVar.j();
            kVar.f9124c = vVar;
            return;
        }
        kVar.j();
        kVar.f9124c = vVar;
    }
}
