package fd;
public enum z1 extends a2 {
    public z1() {
        super("EndTagOpen", 8);
    }

    @Override
    public final void d(k kVar, a aVar) {
        boolean j10 = aVar.j();
        v vVar = a2.f9079a;
        if (j10) {
            kVar.l(this);
            kVar.h("</");
            kVar.f9127c = vVar;
        } else if (aVar.o()) {
            kVar.d(false);
            kVar.f9127c = a2.f9100r;
        } else if (aVar.m('>')) {
            kVar.m(this);
            kVar.a(vVar);
        } else {
            kVar.m(this);
            kVar.a(a2.f9088f0);
        }
    }
}
