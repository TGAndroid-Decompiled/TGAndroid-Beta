package e6;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.zp;
import org.telegram.ui.fz;
import org.telegram.ui.oj0;
public final class r extends TimerTask {
    public final int f8399a;
    public final Object f8400b;

    public r(Object obj, int i10) {
        this.f8399a = i10;
        this.f8400b = obj;
    }

    @Override
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.f8399a) {
            case 0:
                c cVar = (c) this.f8400b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.f8359k == null && cVar.f8353b != 0) {
                    h hVar = cVar.f8354c;
                    int[] e = g6.a.e(arrayDeque);
                    hVar.getClass();
                    n6.l.e("Must be called from the main thread.");
                    if (!hVar.w()) {
                        basePendingResult = h.t();
                    } else {
                        k kVar = new k(hVar, e);
                        h.x(kVar);
                        basePendingResult = kVar;
                    }
                    cVar.f8359k = basePendingResult;
                    basePendingResult.i(new q(cVar, 1));
                    arrayDeque.clear();
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new com.google.firebase.messaging.s(this, 14));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new zp(this, 25));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new fz(this, 25));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new oj0(this, 7));
                return;
            default:
                try {
                    Socket socket = ((tc.q) this.f8400b).f47438a.f47412a.f47407g;
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
