package h6;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.mo;
import org.telegram.ui.dc0;
import org.telegram.ui.hf0;
import org.telegram.ui.lz;
public final class r extends TimerTask {
    public final int f13948a;
    public final Object f13949b;

    public r(Object obj, int i7) {
        this.f13948a = i7;
        this.f13949b = obj;
    }

    @Override
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.f13948a) {
            case 0:
                c cVar = (c) this.f13949b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.f13903k == null && cVar.f13896b != 0) {
                    h hVar = cVar.f13897c;
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
                    cVar.f13903k = basePendingResult;
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
                if (((dc0) this.f13949b).O != null) {
                    g0.g3(new lz(this, 25));
                    return;
                }
                return;
            case 4:
                g0.g3(new hf0(this, 8));
                return;
            default:
                try {
                    Socket socket = ((rc.q) this.f13949b).f56570a.f56542a.f56536g;
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
