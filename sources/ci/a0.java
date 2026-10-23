package ci;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class a0 implements Runnable {
    public final int f5134a;
    public final x0 f5135b;

    public a0(x0 x0Var, int i10) {
        this.f5134a = i10;
        this.f5135b = x0Var;
    }

    @Override
    public final void run() {
        switch (this.f5134a) {
            case 0:
                this.f5135b.b();
                return;
            default:
                x0 x0Var = this.f5135b;
                ArrayList arrayList = x0Var.f6092s;
                a0 a0Var = x0Var.E;
                if (a0Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(a0Var);
                    x0Var.E = null;
                }
                int currentTime = ConnectionsManager.getInstance(x0Var.N).getCurrentTime();
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    w0 w0Var = (w0) arrayList.get(size);
                    ArrayList arrayList2 = w0Var.f6040f;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size2) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            v0 v0Var = (v0) obj;
                            long j10 = v0Var.f6005g;
                            if (j10 <= 0 || currentTime - v0Var.d > u.b(w0Var.f6037a, (int) j10, 0)) {
                            }
                        } else {
                            arrayList.remove(size);
                        }
                    }
                }
                Collections.sort(arrayList, new a4.d(x0Var, 10));
                x0Var.f6090n.N(true);
                x0Var.u(true);
                x0Var.m();
                return;
        }
    }
}
