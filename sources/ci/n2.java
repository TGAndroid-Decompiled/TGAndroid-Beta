package ci;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pq;
import org.telegram.ui.uk0;
import org.telegram.ui.wz;
public final class n2 extends TimerTask {
    public final int f5628a;
    public final Object f5629b;

    public n2(Object obj, int i10) {
        this.f5628a = i10;
        this.f5629b = obj;
    }

    @Override
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.f5628a) {
            case 0:
                AndroidUtilities.runOnUIThread(new androidx.fragment.app.a0(this, 14));
                return;
            case 1:
                e6.c cVar = (e6.c) this.f5629b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.f8650k == null && cVar.f8643b != 0) {
                    e6.h hVar = cVar.f8644c;
                    int[] e7 = g6.a.e(arrayDeque);
                    hVar.getClass();
                    n6.m.e("Must be called from the main thread.");
                    if (!hVar.w()) {
                        basePendingResult = e6.h.t();
                    } else {
                        e6.k kVar = new e6.k(hVar, e7);
                        e6.h.x(kVar);
                        basePendingResult = kVar;
                    }
                    cVar.f8650k = basePendingResult;
                    basePendingResult.i(new e6.r(cVar, 1));
                    arrayDeque.clear();
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new pq(this, 24));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new wz(this, 24));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new uk0(this, 6));
                return;
            default:
                try {
                    Socket socket = ((sc.q) this.f5629b).f48122a.f48170a.f48164g;
                    if (socket != null) {
                        socket.close();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
        }
    }
}
