package ai;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class n0 implements Runnable {
    public final int f1277a;
    public final o1 f1278b;

    public n0(o1 o1Var, int i10) {
        this.f1277a = i10;
        this.f1278b = o1Var;
    }

    @Override
    public final void run() {
        switch (this.f1277a) {
            case 0:
                this.f1278b.b();
                return;
            default:
                o1 o1Var = this.f1278b;
                ArrayList arrayList = o1Var.f1339s;
                n0 n0Var = o1Var.E;
                if (n0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(n0Var);
                    o1Var.E = null;
                }
                int currentTime = ConnectionsManager.getInstance(o1Var.N).getCurrentTime();
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    n1 n1Var = (n1) arrayList.get(size);
                    ArrayList arrayList2 = n1Var.f1282f;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size2) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            m1 m1Var = (m1) obj;
                            long j3 = m1Var.f1231g;
                            if (j3 <= 0 || currentTime - m1Var.d > g0.b(n1Var.f1279a, (int) j3, 0)) {
                            }
                        } else {
                            arrayList.remove(size);
                        }
                    }
                }
                Collections.sort(arrayList, new a4.e(o1Var, 2));
                o1Var.f1337n.N(true);
                o1Var.u(true);
                o1Var.m();
                return;
        }
    }
}
