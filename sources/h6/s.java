package h6;

import com.google.android.gms.common.api.internal.BasePendingResult;
import hi.w;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.lo;
import org.telegram.ui.dc0;
import org.telegram.ui.gf0;
import org.telegram.ui.kz;
public final class s extends TimerTask {
    public final int f13942a;
    public final Object f13943b;

    public s(Object obj, int i7) {
        this.f13942a = i7;
        this.f13943b = obj;
    }

    @Override
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.f13942a) {
            case 0:
                c cVar = (c) this.f13943b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.f13895k == null && cVar.f13888b != 0) {
                    h hVar = cVar.f13889c;
                    int[] e10 = j6.a.e(arrayDeque);
                    hVar.getClass();
                    q6.m.e("Must be called from the main thread.");
                    if (!hVar.w()) {
                        basePendingResult = h.t();
                    } else {
                        j jVar = new j(hVar, e10);
                        h.x(jVar);
                        basePendingResult = jVar;
                    }
                    cVar.f13895k = basePendingResult;
                    basePendingResult.i(new r(cVar, 1));
                    arrayDeque.clear();
                    return;
                }
                return;
            case 1:
                g0.g3(new w(this, 9));
                return;
            case 2:
                g0.g3(new lo(this, 24));
                return;
            case 3:
                if (((dc0) this.f13943b).O != null) {
                    g0.g3(new kz(this, 25));
                    return;
                }
                return;
            case 4:
                g0.g3(new gf0(this, 8));
                return;
            default:
                try {
                    Socket socket = ((rc.q) this.f13943b).f56693a.f56665a.f56659g;
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
