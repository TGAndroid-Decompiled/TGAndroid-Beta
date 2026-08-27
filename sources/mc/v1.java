package mc;

public final enum v1 extends b2 {
    public v1() {
        super("BogusDoctype", 65);
    }

    @Override
    public final void d(l lVar, a aVar) {
        char cD = aVar.d();
        w wVar = b2.f17954a;
        if (cD == '>') {
            lVar.j();
            lVar.f18007c = wVar;
        } else {
            if (cD != 65535) {
                return;
            }
            lVar.j();
            lVar.f18007c = wVar;
        }
    }
}
