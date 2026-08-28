package g;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import r0.j0;
import r0.m0;
public final class h implements Runnable {
    public final int f6984a;
    public final q f6985b;

    public h(q qVar, int i9) {
        this.f6984a = i9;
        this.f6985b = qVar;
    }

    @Override
    public final void run() {
        ViewGroup viewGroup;
        int i9 = this.f6984a;
        q qVar = this.f6985b;
        switch (i9) {
            case 0:
                if ((qVar.f7016e0 & 1) != 0) {
                    qVar.j(0);
                }
                if ((qVar.f7016e0 & 4096) != 0) {
                    qVar.j(108);
                }
                qVar.f7014d0 = false;
                qVar.f7016e0 = 0;
                return;
            default:
                qVar.A.showAtLocation(qVar.f7030y, 55, 0, 0);
                m0 m0Var = qVar.C;
                if (m0Var != null) {
                    m0Var.b();
                }
                if (qVar.E && (viewGroup = qVar.F) != null) {
                    WeakHashMap weakHashMap = j0.f46915a;
                    if (viewGroup.isLaidOut()) {
                        qVar.f7030y.setAlpha(0.0f);
                        m0 a2 = j0.a(qVar.f7030y);
                        a2.a(1.0f);
                        qVar.C = a2;
                        a2.d(new i(this, 0));
                        return;
                    }
                }
                qVar.f7030y.setAlpha(1.0f);
                qVar.f7030y.setVisibility(0);
                return;
        }
    }
}
