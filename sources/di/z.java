package di;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.ConnectionsManager;
public final class z implements Runnable {
    public final int f9986a;
    public final u0 f9987b;

    public z(u0 u0Var, int i7) {
        this.f9986a = i7;
        this.f9987b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f9986a) {
            case 0:
                this.f9987b.b();
                return;
            default:
                u0 u0Var = this.f9987b;
                ArrayList arrayList = u0Var.f9820s;
                z zVar = u0Var.E;
                if (zVar != null) {
                    org.telegram.messenger.g0.r(zVar);
                    u0Var.E = null;
                }
                int currentTime = ConnectionsManager.getInstance(u0Var.N).getCurrentTime();
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    t0 t0Var = (t0) arrayList.get(size);
                    ArrayList arrayList2 = t0Var.f9776f;
                    int size2 = arrayList2.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 < size2) {
                            Object obj = arrayList2.get(i7);
                            i7++;
                            s0 s0Var = (s0) obj;
                            long j3 = s0Var.f9724g;
                            if (j3 <= 0 || currentTime - s0Var.d > t.b(t0Var.f9772a, (int) j3, 0)) {
                            }
                        } else {
                            arrayList.remove(size);
                        }
                    }
                }
                Collections.sort(arrayList, new a3.c(u0Var, 20));
                u0Var.f9818n.O(true);
                u0Var.u(true);
                u0Var.m();
                return;
        }
    }
}
