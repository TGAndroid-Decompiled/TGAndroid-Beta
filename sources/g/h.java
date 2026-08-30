package g;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import r0.j0;
import r0.m0;
public final class h implements Runnable {
    public final int f6270a;
    public final q f6271b;

    public h(q qVar, int i10) {
        this.f6270a = i10;
        this.f6271b = qVar;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        int i10 = this.f6270a;
        q qVar = this.f6271b;
        switch (i10) {
            case 0:
                if ((qVar.f6301f0 & 1) != 0) {
                    qVar.k(0);
                }
                if ((qVar.f6301f0 & 4096) != 0) {
                    qVar.k(108);
                }
                qVar.f6299e0 = false;
                qVar.f6301f0 = 0;
                return;
            default:
                qVar.B.showAtLocation(qVar.f6313y, 55, 0, 0);
                m0 m0Var = qVar.D;
                if (m0Var != null) {
                    m0Var.b();
                }
                if (qVar.F && (viewGroup = qVar.G) != null) {
                    WeakHashMap weakHashMap = j0.f43118a;
                    if (viewGroup.isLaidOut()) {
                        qVar.f6313y.setAlpha(0.0f);
                        m0 a2 = j0.a(qVar.f6313y);
                        a2.a(1.0f);
                        qVar.D = a2;
                        a2.d(new i(this, 0));
                        return;
                    }
                }
                qVar.f6313y.setAlpha(1.0f);
                qVar.f6313y.setVisibility(0);
                return;
        }
    }
}
