package fd;
public enum s extends a2 {
    public s() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        if (d != '!') {
            if (d != '/') {
                kVar.h("<");
                aVar.q();
                kVar.f10570c = a2.f10530f;
                return;
            }
            kVar.e();
            kVar.f10570c = a2.G;
            return;
        }
        kVar.h("<!");
        kVar.f10570c = a2.I;
    }
}
