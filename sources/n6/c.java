package n6;
public final class c implements b {
    public final o8.a f14981a;

    public c(o8.a aVar) {
        this.f14981a = aVar;
    }

    @Override
    public final void a(k6.a aVar) {
        boolean c10 = aVar.c();
        o8.a aVar2 = this.f14981a;
        if (c10) {
            aVar2.b(null, aVar2.S);
            return;
        }
        m mVar = aVar2.K;
        if (mVar != null) {
            ((com.google.android.gms.common.api.l) mVar.f15044a).onConnectionFailed(aVar);
        }
    }
}
