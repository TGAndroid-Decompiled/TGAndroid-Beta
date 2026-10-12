package n6;
public final class c implements b {
    public final o8.a f16373a;

    public c(o8.a aVar) {
        this.f16373a = aVar;
    }

    @Override
    public final void a(k6.a aVar) {
        boolean c10 = aVar.c();
        o8.a aVar2 = this.f16373a;
        if (c10) {
            aVar2.b(null, aVar2.S);
            return;
        }
        n nVar = aVar2.K;
        if (nVar != null) {
            ((com.google.android.gms.common.api.l) nVar.f16447a).onConnectionFailed(aVar);
        }
    }
}
