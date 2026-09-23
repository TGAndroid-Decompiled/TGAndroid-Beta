package le;
public final class j {
    public final g f13976a;
    public final n f13977b = new n(0.0f);
    public final n f13978c = new n(0.0f);
    public final n d = new n(0.0f);
    public final n e = new n(0.0f);
    public final n f13979f = new n(0.0f);
    public final n f13980g = new n(0.0f);

    public j(k kVar, g gVar) {
        this.f13976a = gVar;
    }

    public static void a(j jVar, int i10, boolean z10) {
        n nVar = jVar.f13978c;
        n nVar2 = jVar.f13977b;
        float f7 = 0.0f;
        if (z10) {
            nVar2.f13988c = i10;
            if (i10 > 0) {
                f7 = 1.0f;
            }
            nVar.f13988c = f7;
            return;
        }
        nVar2.d(i10);
        if (i10 > 0) {
            f7 = 1.0f;
        }
        nVar.d(f7);
    }
}
