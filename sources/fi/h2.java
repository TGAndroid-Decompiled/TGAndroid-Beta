package fi;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.ui.Components.gp;
import org.telegram.ui.hc0;
import org.telegram.ui.hf0;
import org.telegram.ui.kz;
public final class h2 extends TimerTask {
    public final int f12130a;
    public final Object f12131b;

    public h2(Object obj, int i7) {
        this.f12130a = i7;
        this.f12131b = obj;
    }

    @Override
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.f12130a) {
            case 0:
                org.telegram.messenger.g0.h3(new di.f8(this, 20));
                return;
            case 1:
                h6.c cVar = (h6.c) this.f12131b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.f14231k == null && cVar.f14224b != 0) {
                    h6.h hVar = cVar.f14225c;
                    int[] e10 = j6.a.e(arrayDeque);
                    hVar.getClass();
                    q6.m.d("Must be called from the main thread.");
                    if (!hVar.w()) {
                        basePendingResult = h6.h.t();
                    } else {
                        h6.j jVar = new h6.j(hVar, e10);
                        h6.h.x(jVar);
                        basePendingResult = jVar;
                    }
                    cVar.f14231k = basePendingResult;
                    basePendingResult.i(new h6.q(cVar, 1));
                    arrayDeque.clear();
                    return;
                }
                return;
            case 2:
                org.telegram.messenger.g0.h3(new gp(this, 22));
                return;
            case 3:
                if (((hc0) this.f12131b).N != null) {
                    org.telegram.messenger.g0.h3(new kz(this, 25));
                    return;
                }
                return;
            case 4:
                org.telegram.messenger.g0.h3(new hf0(this, 8));
                return;
            default:
                try {
                    Socket socket = ((rc.q) this.f12131b).f54524a.f54496a.f54490g;
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
