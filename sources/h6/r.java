package h6;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.mo;
import org.telegram.ui.ec0;
import org.telegram.ui.if0;
import org.telegram.ui.lz;
public final class r extends TimerTask {
    public final int f13945a;
    public final Object f13946b;

    public r(Object obj, int i7) {
        this.f13945a = i7;
        this.f13946b = obj;
    }

    @Override
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.f13945a) {
            case 0:
                c cVar = (c) this.f13946b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.f13900k == null && cVar.f13893b != 0) {
                    h hVar = cVar.f13894c;
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
                    cVar.f13900k = basePendingResult;
                    basePendingResult.i(new q(cVar, 1));
                    arrayDeque.clear();
                    return;
                }
                return;
            case 1:
                g0.g3(new hi.k(this, 8));
                return;
            case 2:
                g0.g3(new mo(this, 24));
                return;
            case 3:
                if (((ec0) this.f13946b).O != null) {
                    g0.g3(new lz(this, 25));
                    return;
                }
                return;
            case 4:
                g0.g3(new if0(this, 8));
                return;
            default:
                try {
                    Socket socket = ((rc.q) this.f13946b).f56570a.f56542a.f56536g;
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
