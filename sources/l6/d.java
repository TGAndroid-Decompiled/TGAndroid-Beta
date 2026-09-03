package l6;

import android.os.RemoteException;
import s5.m;
import v7.j;
import w7.g;
public final class d implements e {
    public final int f11470a;
    public final j f11471b;

    public d(j jVar, int i10) {
        this.f11470a = i10;
        this.f11471b = jVar;
    }

    @Override
    public final int a() {
        switch (this.f11470a) {
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    @Override
    public final void b() {
        switch (this.f11470a) {
            case 0:
                m mVar = this.f11471b.f45695a;
                mVar.getClass();
                try {
                    g gVar = (g) mVar.f44154c;
                    gVar.Q0(gVar.M0(), 12);
                    return;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            default:
                m mVar2 = this.f11471b.f45695a;
                mVar2.getClass();
                try {
                    g gVar2 = (g) mVar2.f44154c;
                    gVar2.Q0(gVar2.M0(), 3);
                    return;
                } catch (RemoteException e6) {
                    throw new RuntimeException(e6);
                }
        }
    }
}
