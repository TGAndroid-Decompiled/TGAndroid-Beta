package i6;

import android.os.RemoteException;
import s7.j;
import t7.g;

public final class d implements e {

    public final int f10570a;

    public final j f10571b;

    public d(j jVar, int i10) {
        this.f10570a = i10;
        this.f10571b = jVar;
    }

    @Override
    public final int a() {
        switch (this.f10570a) {
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    @Override
    public final void b() {
        switch (this.f10570a) {
            case 0:
                j9.a aVar = this.f10571b.f47812a;
                aVar.getClass();
                try {
                    g gVar = (g) aVar.f12864c;
                    gVar.Q0(gVar.M0(), 12);
                    return;
                } catch (RemoteException e9) {
                    throw new a7.c(e9);
                }
            default:
                j9.a aVar2 = this.f10571b.f47812a;
                aVar2.getClass();
                try {
                    g gVar2 = (g) aVar2.f12864c;
                    gVar2.Q0(gVar2.M0(), 3);
                    return;
                } catch (RemoteException e10) {
                    throw new a7.c(e10);
                }
        }
    }
}
