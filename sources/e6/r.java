package e6;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hq;
import org.telegram.ui.ck0;
import org.telegram.ui.dz;
public final class r extends TimerTask {
    public final int f8392a;
    public final Object f8393b;

    public r(Object obj, int i10) {
        this.f8392a = i10;
        this.f8393b = obj;
    }

    @Override
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.f8392a) {
            case 0:
                c cVar = (c) this.f8393b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.f8352k == null && cVar.f8346b != 0) {
                    h hVar = cVar.f8347c;
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
                    cVar.f8352k = basePendingResult;
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
                AndroidUtilities.runOnUIThread(new dz(this, 24));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ck0(this, 6));
                return;
            default:
                try {
                    Socket socket = ((tc.q) this.f8393b).f46994a.f46968a.f46963g;
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
