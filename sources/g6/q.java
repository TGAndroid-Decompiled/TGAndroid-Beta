package g6;

import com.google.android.gms.common.api.internal.BasePendingResult;
import ei.z5;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.gp;
import org.telegram.ui.cc0;
import org.telegram.ui.fz;
import org.telegram.ui.sg0;
public final class q extends TimerTask {
    public final int f12030a;
    public final Object f12031b;

    public q(Object obj, int i3) {
        this.f12030a = i3;
        this.f12031b = obj;
    }

    @Override
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.f12030a) {
            case 0:
                c cVar = (c) this.f12031b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.f11988k == null && cVar.f11981b != 0) {
                    h hVar = cVar.f11982c;
                    int[] e10 = i6.a.e(arrayDeque);
                    hVar.getClass();
                    p6.m.d("Must be called from the main thread.");
                    if (!hVar.w()) {
                        basePendingResult = h.t();
                    } else {
                        j jVar = new j(hVar, e10);
                        h.x(jVar);
                        basePendingResult = jVar;
                    }
                    cVar.f11988k = basePendingResult;
                    basePendingResult.i(new p(cVar, 1));
                    arrayDeque.clear();
                    return;
                }
                return;
            case 1:
                g0.h3(new z5(this, 25));
                return;
            case 2:
                try {
                    Socket socket = ((oc.q) this.f12031b).f20959a.f21007a.f21001g;
                    if (socket != null) {
                        socket.close();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 3:
                g0.h3(new gp(this, 22));
                return;
            case 4:
                if (((cc0) this.f12031b).O != null) {
                    g0.h3(new fz(this, 24));
                    return;
                }
                return;
            default:
                g0.h3(new sg0(this, 7));
                return;
        }
    }
}
