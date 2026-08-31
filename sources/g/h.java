package g;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import r0.j0;
import r0.m0;
public final class h implements Runnable {
    public final int f6737a;
    public final q f6738b;

    public h(q qVar, int i10) {
        this.f6737a = i10;
        this.f6738b = qVar;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        int i10 = this.f6737a;
        q qVar = this.f6738b;
        switch (i10) {
            case 0:
                if ((qVar.f6772f0 & 1) != 0) {
                    qVar.k(0);
                }
                if ((qVar.f6772f0 & 4096) != 0) {
                    qVar.k(108);
                }
                qVar.f6770e0 = false;
                qVar.f6772f0 = 0;
                return;
            default:
                qVar.B.showAtLocation(qVar.f6784y, 55, 0, 0);
                m0 m0Var = qVar.D;
                if (m0Var != null) {
                    m0Var.b();
                }
                if (qVar.F && (viewGroup = qVar.G) != null) {
                    WeakHashMap weakHashMap = j0.f46438a;
                    if (viewGroup.isLaidOut()) {
                        qVar.f6784y.setAlpha(0.0f);
                        m0 a2 = j0.a(qVar.f6784y);
                        a2.a(1.0f);
                        qVar.D = a2;
                        a2.d(new i(this, 0));
                        return;
                    }
                }
                qVar.f6784y.setAlpha(1.0f);
                qVar.f6784y.setVisibility(0);
                return;
        }
    }
}
