package l6;

import android.os.RemoteException;
import s5.m;
import v7.j;
import w7.g;
public final class d implements e {
    public final int f11360a;
    public final j f11361b;

    public d(j jVar, int i10) {
        this.f11360a = i10;
        this.f11361b = jVar;
    }

    @Override
    public final int a() {
        switch (this.f11360a) {
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    @Override
    public final void b() {
        switch (this.f11360a) {
            case 0:
                m mVar = this.f11361b.f45631a;
                mVar.getClass();
                try {
                    g gVar = (g) mVar.f44089c;
                    gVar.Q0(gVar.M0(), 12);
                    return;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            default:
                m mVar2 = this.f11361b.f45631a;
                mVar2.getClass();
                try {
                    g gVar2 = (g) mVar2.f44089c;
                    gVar2.Q0(gVar2.M0(), 3);
                    return;
                } catch (RemoteException e6) {
                    throw new RuntimeException(e6);
                }
        }
    }
}
