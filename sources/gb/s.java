package gb;

import android.content.Context;
public final class s implements ib.b {
    public final int f13394a;
    public final e.a f13395b;

    public s(e.a aVar, int i7) {
        this.f13394a = i7;
        this.f13395b = aVar;
    }

    @Override
    public final Object mo23get() {
        int i7 = this.f13394a;
        e.a aVar = this.f13395b;
        switch (i7) {
            case 0:
                o9.g firebaseApp = (o9.g) aVar.f10170a;
                kotlin.jvm.internal.j.e(firebaseApp, "firebaseApp");
                q0 q0Var = q0.f13392a;
                return q0.a(firebaseApp);
            default:
                return new jb.a((Context) aVar.f10170a);
        }
    }
}
