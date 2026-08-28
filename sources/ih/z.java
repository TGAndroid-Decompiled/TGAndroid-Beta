package ih;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class z implements Runnable {
    public final int f12356a;
    public final w0 f12357b;

    public z(w0 w0Var, int i9) {
        this.f12356a = i9;
        this.f12357b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f12356a) {
            case 0:
                this.f12357b.b();
                return;
            default:
                w0 w0Var = this.f12357b;
                ArrayList arrayList = w0Var.f12282s;
                z zVar = w0Var.A;
                if (zVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(zVar);
                    w0Var.A = null;
                }
                int currentTime = ConnectionsManager.getInstance(w0Var.J).getCurrentTime();
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    v0 v0Var = (v0) arrayList.get(size);
                    ArrayList arrayList2 = v0Var.f12224f;
                    int size2 = arrayList2.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 < size2) {
                            Object obj = arrayList2.get(i9);
                            i9++;
                            u0 u0Var = (u0) obj;
                            long j10 = u0Var.f12179g;
                            if (j10 <= 0 || currentTime - u0Var.d > u.b(v0Var.f12220a, (int) j10, 0)) {
                            }
                        } else {
                            arrayList.remove(size);
                        }
                    }
                }
                Collections.sort(arrayList, new a5.e(w0Var, 23));
                w0Var.f12280n.N(true);
                w0Var.u(true);
                w0Var.m();
                return;
        }
    }
}
