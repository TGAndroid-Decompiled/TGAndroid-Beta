package e6;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hq;
import org.telegram.ui.ek0;
import org.telegram.ui.fz;
public final class r extends TimerTask {
    public final int f8395a;
    public final Object f8396b;

    public r(Object obj, int i10) {
        this.f8395a = i10;
        this.f8396b = obj;
    }

    @Override
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.f8395a) {
            case 0:
                c cVar = (c) this.f8396b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.f8355k == null && cVar.f8349b != 0) {
                    h hVar = cVar.f8350c;
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
                    cVar.f8355k = basePendingResult;
                    basePendingResult.i(new q(cVar, 1));
                    arrayDeque.clear();
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new com.google.firebase.messaging.s(this, 14));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new hq(this, 24));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new fz(this, 24));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ek0(this, 6));
                return;
            default:
                try {
                    Socket socket = ((tc.q) this.f8396b).f47042a.f47016a.f47011g;
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
