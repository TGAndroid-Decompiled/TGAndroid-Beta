package fi;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.ConnectionsManager;
public final class z implements Runnable {
    public final int f12839a;
    public final t0 f12840b;

    public z(t0 t0Var, int i7) {
        this.f12839a = i7;
        this.f12840b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f12839a) {
            case 0:
                this.f12840b.b();
                return;
            default:
                t0 t0Var = this.f12840b;
                ArrayList arrayList = t0Var.f12613s;
                z zVar = t0Var.F;
                if (zVar != null) {
                    org.telegram.messenger.g0.r(zVar);
                    t0Var.F = null;
                }
                int currentTime = ConnectionsManager.getInstance(t0Var.O).getCurrentTime();
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    s0 s0Var = (s0) arrayList.get(size);
                    ArrayList arrayList2 = s0Var.f12558f;
                    int size2 = arrayList2.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 < size2) {
                            Object obj = arrayList2.get(i7);
                            i7++;
                            r0 r0Var = (r0) obj;
                            long j3 = r0Var.f12522g;
                            if (j3 <= 0 || currentTime - r0Var.d > t.b(s0Var.f12554a, (int) j3, 0)) {
                            }
                        } else {
                            arrayList.remove(size);
                        }
                    }
                }
                Collections.sort(arrayList, new a3.c(t0Var, 20));
                t0Var.f12611n.O(true);
                t0Var.u(true);
                t0Var.m();
                return;
        }
    }
}
