package fi;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.ui.Components.gp;
import org.telegram.ui.gc0;
import org.telegram.ui.gf0;
import org.telegram.ui.jz;
public final class h2 extends TimerTask {
    public final int f12126a;
    public final Object f12127b;

    public h2(Object obj, int i7) {
        this.f12126a = i7;
        this.f12127b = obj;
    }

    @Override
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.f12126a) {
            case 0:
                org.telegram.messenger.g0.h3(new di.f8(this, 20));
                return;
            case 1:
                h6.c cVar = (h6.c) this.f12127b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.f14229k == null && cVar.f14222b != 0) {
                    h6.h hVar = cVar.f14223c;
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
                    cVar.f14229k = basePendingResult;
                    basePendingResult.i(new h6.q(cVar, 1));
                    arrayDeque.clear();
                    return;
                }
                return;
            case 2:
                org.telegram.messenger.g0.h3(new gp(this, 22));
                return;
            case 3:
                if (((gc0) this.f12127b).N != null) {
                    org.telegram.messenger.g0.h3(new jz(this, 25));
                    return;
                }
                return;
            case 4:
                org.telegram.messenger.g0.h3(new gf0(this, 8));
                return;
            default:
                try {
                    Socket socket = ((rc.q) this.f12127b).f54525a.f54497a.f54491g;
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
