package di;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.kq;
import org.telegram.ui.yk0;
import org.telegram.ui.zz;
public final class n2 extends TimerTask {
    public final int f7449a;
    public final Object f7450b;

    public n2(Object obj, int i10) {
        this.f7449a = i10;
        this.f7450b = obj;
    }

    @Override
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.f7449a) {
            case 0:
                AndroidUtilities.runOnUIThread(new bi.la(this, 23));
                return;
            case 1:
                e6.c cVar = (e6.c) this.f7450b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.f8472k == null && cVar.f8466b != 0) {
                    e6.h hVar = cVar.f8467c;
                    int[] e = g6.a.e(arrayDeque);
                    hVar.getClass();
                    n6.l.e("Must be called from the main thread.");
                    if (!hVar.w()) {
                        basePendingResult = e6.h.t();
                    } else {
                        e6.k kVar = new e6.k(hVar, e);
                        e6.h.x(kVar);
                        basePendingResult = kVar;
                    }
                    cVar.f8472k = basePendingResult;
                    basePendingResult.i(new e6.q(cVar, 1));
                    arrayDeque.clear();
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new kq(this, 24));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new zz(this, 24));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new yk0(this, 6));
                return;
            default:
                try {
                    Socket socket = ((tc.q) this.f7450b).f45633a.f45607a.f45602g;
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
