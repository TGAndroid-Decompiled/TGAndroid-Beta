package ei;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.ConnectionsManager;
public final class a0 implements Runnable {
    public final int f10073a;
    public final w0 f10074b;

    public a0(w0 w0Var, int i3) {
        this.f10073a = i3;
        this.f10074b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f10073a) {
            case 0:
                this.f10074b.b();
                return;
            default:
                w0 w0Var = this.f10074b;
                ArrayList arrayList = w0Var.f11161s;
                a0 a0Var = w0Var.F;
                if (a0Var != null) {
                    org.telegram.messenger.g0.r(a0Var);
                    w0Var.F = null;
                }
                int currentTime = ConnectionsManager.getInstance(w0Var.O).getCurrentTime();
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    v0 v0Var = (v0) arrayList.get(size);
                    ArrayList arrayList2 = v0Var.f11109f;
                    int size2 = arrayList2.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size2) {
                            Object obj = arrayList2.get(i3);
                            i3++;
                            u0 u0Var = (u0) obj;
                            long j10 = u0Var.f11074g;
                            if (j10 <= 0 || currentTime - u0Var.d > u.b(v0Var.f11105a, (int) j10, 0)) {
                            }
                        } else {
                            arrayList.remove(size);
                        }
                    }
                }
                Collections.sort(arrayList, new a3.u(w0Var, 10));
                w0Var.f11159n.O(true);
                w0Var.u(true);
                w0Var.m();
                return;
        }
    }
}
