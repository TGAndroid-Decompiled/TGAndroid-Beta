package n6;
public final class c implements b {
    public final o8.a f16670a;

    public c(o8.a aVar) {
        this.f16670a = aVar;
    }

    @Override
    public final void a(k6.a aVar) {
        boolean c10 = aVar.c();
        o8.a aVar2 = this.f16670a;
        if (c10) {
            aVar2.b(null, aVar2.S);
            return;
        }
        n nVar = aVar2.K;
        if (nVar != null) {
            ((com.google.android.gms.common.api.l) nVar.f16744a).onConnectionFailed(aVar);
        }
    }
}
