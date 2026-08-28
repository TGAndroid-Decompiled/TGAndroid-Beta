package h6;

import android.os.RemoteException;
import r7.j;
import s7.g;
public final class d implements e {
    public final int f9861a;
    public final j f9862b;

    public d(j jVar, int i9) {
        this.f9861a = i9;
        this.f9862b = jVar;
    }

    @Override
    public final int a() {
        switch (this.f9861a) {
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    @Override
    public final void b() {
        switch (this.f9861a) {
            case 0:
                j4.c cVar = this.f9862b.f47092a;
                cVar.getClass();
                try {
                    g gVar = (g) cVar.f13432c;
                    gVar.Q0(gVar.M0(), 12);
                    return;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            default:
                j4.c cVar2 = this.f9862b.f47092a;
                cVar2.getClass();
                try {
                    g gVar2 = (g) cVar2.f13432c;
                    gVar2.Q0(gVar2.M0(), 3);
                    return;
                } catch (RemoteException e11) {
                    throw new RuntimeException(e11);
                }
        }
    }
}
