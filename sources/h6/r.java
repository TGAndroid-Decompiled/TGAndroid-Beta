package h6;

import com.google.android.gms.common.api.internal.BasePendingResult;
import hi.e1;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.fo;
import org.telegram.ui.dc0;
import org.telegram.ui.ef0;
import org.telegram.ui.iz;
public final class r extends TimerTask {
    public final int f13633a;
    public final Object f13634b;

    public r(Object obj, int i7) {
        this.f13633a = i7;
        this.f13634b = obj;
    }

    @Override
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.f13633a) {
            case 0:
                c cVar = (c) this.f13634b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.f13588k == null && cVar.f13581b != 0) {
                    h hVar = cVar.f13582c;
                    int[] e10 = j6.a.e(arrayDeque);
                    hVar.getClass();
                    q6.m.d("Must be called from the main thread.");
                    if (!hVar.w()) {
                        basePendingResult = h.t();
                    } else {
                        j jVar = new j(hVar, e10);
                        h.x(jVar);
                        basePendingResult = jVar;
                    }
                    cVar.f13588k = basePendingResult;
                    basePendingResult.i(new q(cVar, 1));
                    arrayDeque.clear();
                    return;
                }
                return;
            case 1:
                g0.h3(new e1(this, 4));
                return;
            case 2:
                g0.h3(new fo(this, 24));
                return;
            case 3:
                if (((dc0) this.f13634b).O != null) {
                    g0.h3(new iz(this, 25));
                    return;
                }
                return;
            case 4:
                g0.h3(new ef0(this, 8));
                return;
            default:
                try {
                    Socket socket = ((rc.q) this.f13634b).f55996a.f55968a.f55962g;
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
