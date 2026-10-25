package o6;
public final class c implements b {
    public final p8.a f19099a;

    public c(p8.a aVar) {
        this.f19099a = aVar;
    }

    @Override
    public final void a(l6.a aVar) {
        boolean c10 = aVar.c();
        p8.a aVar2 = this.f19099a;
        if (c10) {
            aVar2.j(null, aVar2.S);
            return;
        }
        m mVar = aVar2.K;
        if (mVar != null) {
            ((com.google.android.gms.common.api.l) mVar.f19162a).onConnectionFailed(aVar);
        }
    }
}
