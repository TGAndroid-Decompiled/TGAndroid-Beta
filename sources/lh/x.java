package lh;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class x implements Runnable {
    public final int f16382a;
    public final u0 f16383b;

    public x(u0 u0Var, int i10) {
        this.f16382a = i10;
        this.f16383b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f16382a) {
            case 0:
                this.f16383b.b();
                return;
            default:
                u0 u0Var = this.f16383b;
                ArrayList arrayList = u0Var.f16285s;
                x xVar = u0Var.A;
                if (xVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(xVar);
                    u0Var.A = null;
                }
                int currentTime = ConnectionsManager.getInstance(u0Var.J).getCurrentTime();
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    t0 t0Var = (t0) arrayList.get(size);
                    ArrayList arrayList2 = t0Var.f16254f;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size2) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            s0 s0Var = (s0) obj;
                            long j10 = s0Var.f16199g;
                            if (j10 <= 0 || currentTime - s0Var.d > s.b(t0Var.f16250a, (int) j10, 0)) {
                            }
                        } else {
                            arrayList.remove(size);
                        }
                    }
                }
                Collections.sort(arrayList, new c5.e(u0Var, 26));
                u0Var.f16283n.N(true);
                u0Var.u(true);
                u0Var.m();
                return;
        }
    }
}
