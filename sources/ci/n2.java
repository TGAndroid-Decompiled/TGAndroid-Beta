package ci;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nq;
import org.telegram.ui.sk0;
import org.telegram.ui.tz;
public final class n2 extends TimerTask {
    public final int f5629a;
    public final Object f5630b;

    public n2(Object obj, int i10) {
        this.f5629a = i10;
        this.f5630b = obj;
    }

    @Override
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.f5629a) {
            case 0:
                AndroidUtilities.runOnUIThread(new androidx.fragment.app.a0(this, 14));
                return;
            case 1:
                e6.c cVar = (e6.c) this.f5630b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.f8652k == null && cVar.f8645b != 0) {
                    e6.h hVar = cVar.f8646c;
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
                    cVar.f8652k = basePendingResult;
                    basePendingResult.i(new e6.r(cVar, 1));
                    arrayDeque.clear();
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new nq(this, 24));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new tz(this, 24));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new sk0(this, 6));
                return;
            default:
                try {
                    Socket socket = ((sc.q) this.f5630b).f47981a.f48029a.f48023g;
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
