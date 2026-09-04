package bi;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class g0 implements Runnable {
    public final int f2998a;
    public final g1 f2999b;

    public g0(g1 g1Var, int i10) {
        this.f2998a = i10;
        this.f2999b = g1Var;
    }

    @Override
    public final void run() {
        switch (this.f2998a) {
            case 0:
                this.f2999b.b();
                return;
            default:
                g1 g1Var = this.f2999b;
                ArrayList arrayList = g1Var.f3014s;
                g0 g0Var = g1Var.E;
                if (g0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(g0Var);
                    g1Var.E = null;
                }
                int currentTime = ConnectionsManager.getInstance(g1Var.N).getCurrentTime();
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    f1 f1Var = (f1) arrayList.get(size);
                    ArrayList arrayList2 = f1Var.f2951f;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size2) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            e1 e1Var = (e1) obj;
                            long j3 = e1Var.f2903g;
                            if (j3 <= 0 || currentTime - e1Var.d > z.b(f1Var.f2947a, (int) j3, 0)) {
                            }
                        } else {
                            arrayList.remove(size);
                        }
                    }
                }
                Collections.sort(arrayList, new a4.e(g1Var, 6));
                g1Var.f3012n.N(true);
                g1Var.u(true);
                g1Var.m();
                return;
        }
    }
}
