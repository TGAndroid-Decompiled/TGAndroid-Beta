package h6;

import com.google.android.gms.common.api.internal.BasePendingResult;
import hi.b0;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.oo;
import org.telegram.ui.ec0;
import org.telegram.ui.hf0;
import org.telegram.ui.lz;
public final class r extends TimerTask {
    public final int f13940a;
    public final Object f13941b;

    public r(Object obj, int i7) {
        this.f13940a = i7;
        this.f13941b = obj;
    }

    @Override
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.f13940a) {
            case 0:
                c cVar = (c) this.f13941b;
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
                    basePendingResult.i(new q(cVar, 1));
                    arrayDeque.clear();
                    return;
                }
                return;
            case 1:
                g0.g3(new b0(this, 7));
                return;
            case 2:
                g0.g3(new oo(this, 24));
                return;
            case 3:
                if (((ec0) this.f13941b).O != null) {
                    g0.g3(new lz(this, 25));
                    return;
                }
                return;
            case 4:
                g0.g3(new hf0(this, 8));
                return;
            default:
                try {
                    Socket socket = ((rc.q) this.f13941b).f56580a.f56552a.f56546g;
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
