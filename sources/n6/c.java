package n6;
public final class c implements b {
    public final o8.a f16374a;

    public c(o8.a aVar) {
        this.f16374a = aVar;
    }

    @Override
    public final void a(k6.a aVar) {
        boolean c10 = aVar.c();
        o8.a aVar2 = this.f16374a;
        if (c10) {
            aVar2.b(null, aVar2.S);
            return;
        }
        n nVar = aVar2.K;
        if (nVar != null) {
            ((com.google.android.gms.common.api.l) nVar.f16448a).onConnectionFailed(aVar);
        }
    }
}
