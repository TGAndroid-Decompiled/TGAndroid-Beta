package f6;

import com.google.android.gms.common.api.internal.BasePendingResult;
import di.s8;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bq;
import org.telegram.ui.lj0;
import org.telegram.ui.p00;
public final class r extends TimerTask {
    public final int f10237a;
    public final Object f10238b;

    public r(Object obj, int i10) {
        this.f10237a = i10;
        this.f10238b = obj;
    }

    @Override
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.f10237a) {
            case 0:
                c cVar = (c) this.f10238b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.f10197k == null && cVar.f10191b != 0) {
                    h hVar = cVar.f10192c;
                    int[] e = h6.a.e(arrayDeque);
                    hVar.getClass();
                    o6.l.e("Must be called from the main thread.");
                    if (!hVar.w()) {
                        basePendingResult = h.t();
                    } else {
                        k kVar = new k(hVar, e);
                        h.x(kVar);
                        basePendingResult = kVar;
                    }
                    cVar.f10197k = basePendingResult;
                    basePendingResult.i(new q(cVar, 1));
                    arrayDeque.clear();
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new s8(this, 18));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new bq(this, 26));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new p00(this, 25));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new lj0(this, 7));
                return;
            default:
                try {
                    Socket socket = ((uc.q) this.f10238b).f49709a.f49683a.f49678g;
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
