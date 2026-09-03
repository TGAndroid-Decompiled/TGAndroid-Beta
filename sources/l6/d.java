package l6;

import android.os.RemoteException;
import s5.m;
import v7.j;
import w7.g;
public final class d implements e {
    public final int f11738a;
    public final j f11739b;

    public d(j jVar, int i10) {
        this.f11738a = i10;
        this.f11739b = jVar;
    }

    @Override
    public final int a() {
        switch (this.f11738a) {
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    @Override
    public final void b() {
        switch (this.f11738a) {
            case 0:
                m mVar = this.f11739b.f48963a;
                mVar.getClass();
                try {
                    g gVar = (g) mVar.f47094c;
                    gVar.Q0(gVar.M0(), 12);
                    return;
                } catch (RemoteException e6) {
                    throw new RuntimeException(e6);
                }
            default:
                m mVar2 = this.f11739b.f48963a;
                mVar2.getClass();
                try {
                    g gVar2 = (g) mVar2.f47094c;
                    gVar2.Q0(gVar2.M0(), 3);
                    return;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
        }
    }
}
