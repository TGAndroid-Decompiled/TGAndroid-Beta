package g;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import r0.j0;
import r0.m0;
public final class h implements Runnable {
    public final int f6894a;
    public final q f6895b;

    public h(q qVar, int i10) {
        this.f6894a = i10;
        this.f6895b = qVar;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        int i10 = this.f6894a;
        q qVar = this.f6895b;
        switch (i10) {
            case 0:
                if ((qVar.f6926e0 & 1) != 0) {
                    qVar.k(0);
                }
                if ((qVar.f6926e0 & 4096) != 0) {
                    qVar.k(108);
                }
                qVar.f6924d0 = false;
                qVar.f6926e0 = 0;
                return;
            default:
                qVar.A.showAtLocation(qVar.f6940y, 55, 0, 0);
                m0 m0Var = qVar.C;
                if (m0Var != null) {
                    m0Var.b();
                }
                if (qVar.E && (viewGroup = qVar.F) != null) {
                    WeakHashMap weakHashMap = j0.f46829a;
                    if (viewGroup.isLaidOut()) {
                        qVar.f6940y.setAlpha(0.0f);
                        m0 a2 = j0.a(qVar.f6940y);
                        a2.a(1.0f);
                        qVar.C = a2;
                        a2.d(new i(this, 0));
                        return;
                    }
                }
                qVar.f6940y.setAlpha(1.0f);
                qVar.f6940y.setVisibility(0);
                return;
        }
    }
}
