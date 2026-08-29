package j6;

import android.os.RemoteException;
import l3.g0;
import t7.j;
import u7.g;
public final class d implements e {
    public final int f10897a;
    public final j f10898b;

    public d(j jVar, int i10) {
        this.f10897a = i10;
        this.f10898b = jVar;
    }

    @Override
    public final int a() {
        switch (this.f10897a) {
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    @Override
    public final void b() {
        switch (this.f10897a) {
            case 0:
                g0 g0Var = this.f10898b.f48175a;
                g0Var.getClass();
                try {
                    g gVar = (g) g0Var.f14097c;
                    gVar.Q0(gVar.M0(), 12);
                    return;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            default:
                g0 g0Var2 = this.f10898b.f48175a;
                g0Var2.getClass();
                try {
                    g gVar2 = (g) g0Var2.f14097c;
                    gVar2.Q0(gVar2.M0(), 3);
                    return;
                } catch (RemoteException e11) {
                    throw new RuntimeException(e11);
                }
        }
    }
}
