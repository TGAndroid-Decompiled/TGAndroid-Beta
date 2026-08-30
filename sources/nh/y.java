package nh;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class y implements Runnable {
    public final int f16064a;
    public final v0 f16065b;

    public y(v0 v0Var, int i10) {
        this.f16064a = i10;
        this.f16065b = v0Var;
    }

    @Override
    public final void run() {
        switch (this.f16064a) {
            case 0:
                this.f16065b.b();
                return;
            default:
                v0 v0Var = this.f16065b;
                ArrayList arrayList = v0Var.f15979s;
                y yVar = v0Var.B;
                if (yVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(yVar);
                    v0Var.B = null;
                }
                int currentTime = ConnectionsManager.getInstance(v0Var.K).getCurrentTime();
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    u0 u0Var = (u0) arrayList.get(size);
                    ArrayList arrayList2 = u0Var.f15950f;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size2) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            t0 t0Var = (t0) obj;
                            long j10 = t0Var.f15900g;
                            if (j10 <= 0 || currentTime - t0Var.d > t.b(u0Var.f15947a, (int) j10, 0)) {
                            }
                        } else {
                            arrayList.remove(size);
                        }
                    }
                }
                Collections.sort(arrayList, new e5.f(v0Var, 26));
                v0Var.f15977n.N(true);
                v0Var.u(true);
                v0Var.m();
                return;
        }
    }
}
