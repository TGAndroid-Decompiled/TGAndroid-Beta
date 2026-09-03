package b6;
public final class c implements b {
    public final c8.a f1572a;

    public c(c8.a aVar) {
        this.f1572a = aVar;
    }

    @Override
    public final void a(y5.a aVar) {
        boolean f10 = aVar.f();
        c8.a aVar2 = this.f1572a;
        if (f10) {
            aVar2.i(null, aVar2.P);
            return;
        }
        n nVar = aVar2.H;
        if (nVar != null) {
            ((com.google.android.gms.common.api.l) nVar.f1640a).onConnectionFailed(aVar);
        }
    }
}
