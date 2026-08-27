package jh;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

public final class x implements Runnable {

    public final int f14112a;

    public final u0 f14113b;

    public x(u0 u0Var, int i10) {
        this.f14112a = i10;
        this.f14113b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f14112a) {
            case 0:
                this.f14113b.b();
                break;
            default:
                u0 u0Var = this.f14113b;
                ArrayList arrayList = u0Var.f14018s;
                x xVar = u0Var.A;
                if (xVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(xVar);
                    u0Var.A = null;
                }
                int currentTime = ConnectionsManager.getInstance(u0Var.J).getCurrentTime();
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    t0 t0Var = (t0) arrayList.get(size);
                    ArrayList arrayList2 = t0Var.f13989f;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size2) {
                            arrayList.remove(size);
                        }
                        Object obj = arrayList2.get(i10);
                        i10++;
                        s0 s0Var = (s0) obj;
                        long j10 = s0Var.f13934g;
                        if (j10 > 0 && currentTime - s0Var.d <= s.b(t0Var.f13985a, (int) j10, 0)) {
                        }
                        break;
                        break;
                    }
                }
                Collections.sort(arrayList, new a5.f(u0Var, 24));
                u0Var.f14016n.N(true);
                u0Var.u(true);
                u0Var.m();
                break;
        }
    }
}
