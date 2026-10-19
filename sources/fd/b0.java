package fd;
public enum b0 extends a2 {
    public b0() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override
    public final void d(k kVar, a aVar) {
        if (aVar.o()) {
            kVar.e();
            kVar.h.append(aVar.i());
            kVar.h("<" + aVar.i());
            kVar.a(a2.Q);
        } else if (aVar.m('/')) {
            kVar.e();
            kVar.a(a2.O);
        } else {
            kVar.f('<');
            kVar.f10569c = a2.K;
        }
    }
}
