package n6;
public final class c implements b {
    public final o8.a f13836a;

    public c(o8.a aVar) {
        this.f13836a = aVar;
    }

    @Override
    public final void a(k6.a aVar) {
        boolean c10 = aVar.c();
        o8.a aVar2 = this.f13836a;
        if (c10) {
            aVar2.b(null, aVar2.S);
            return;
        }
        m mVar = aVar2.K;
        if (mVar != null) {
            ((com.google.android.gms.common.api.l) mVar.f13899a).onConnectionFailed(aVar);
        }
    }
}
