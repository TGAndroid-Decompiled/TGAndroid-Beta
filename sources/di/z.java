package di;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.ConnectionsManager;
public final class z implements Runnable {
    public final int f9981a;
    public final u0 f9982b;

    public z(u0 u0Var, int i7) {
        this.f9981a = i7;
        this.f9982b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f9981a) {
            case 0:
                this.f9982b.b();
                return;
            default:
                u0 u0Var = this.f9982b;
                ArrayList arrayList = u0Var.f9815s;
                z zVar = u0Var.E;
                if (zVar != null) {
                    org.telegram.messenger.g0.r(zVar);
                    u0Var.E = null;
                }
                int currentTime = ConnectionsManager.getInstance(u0Var.N).getCurrentTime();
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    t0 t0Var = (t0) arrayList.get(size);
                    ArrayList arrayList2 = t0Var.f9771f;
                    int size2 = arrayList2.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 < size2) {
                            Object obj = arrayList2.get(i7);
                            i7++;
                            s0 s0Var = (s0) obj;
                            long j3 = s0Var.f9719g;
                            if (j3 <= 0 || currentTime - s0Var.d > t.b(t0Var.f9767a, (int) j3, 0)) {
                            }
                        } else {
                            arrayList.remove(size);
                        }
                    }
                }
                Collections.sort(arrayList, new a3.c(u0Var, 20));
                u0Var.f9813n.O(true);
                u0Var.u(true);
                u0Var.m();
                return;
        }
    }
}
