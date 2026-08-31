package oh;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class x implements Runnable {
    public final int f17918a;
    public final v0 f17919b;

    public x(v0 v0Var, int i10) {
        this.f17918a = i10;
        this.f17919b = v0Var;
    }

    @Override
    public final void run() {
        switch (this.f17918a) {
            case 0:
                this.f17919b.b();
                return;
            default:
                v0 v0Var = this.f17919b;
                ArrayList arrayList = v0Var.f17838s;
                x xVar = v0Var.B;
                if (xVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(xVar);
                    v0Var.B = null;
                }
                int currentTime = ConnectionsManager.getInstance(v0Var.K).getCurrentTime();
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    u0 u0Var = (u0) arrayList.get(size);
                    ArrayList arrayList2 = u0Var.f17802f;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size2) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            t0 t0Var = (t0) obj;
                            long j10 = t0Var.f17760g;
                            if (j10 <= 0 || currentTime - t0Var.d > s.b(u0Var.f17798a, (int) j10, 0)) {
                            }
                        } else {
                            arrayList.remove(size);
                        }
                    }
                }
                Collections.sort(arrayList, new e5.f(v0Var, 27));
                v0Var.f17836n.N(true);
                v0Var.u(true);
                v0Var.m();
                return;
        }
    }
}
