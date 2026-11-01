package e6;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.ho;
import org.telegram.ui.kd0;
import org.telegram.ui.kg0;
import org.telegram.ui.yy;
import vh.d0;
public final class r extends TimerTask {
    public final int f6308a;
    public final Object f6309b;

    public r(Object obj, int i10) {
        this.f6308a = i10;
        this.f6309b = obj;
    }

    @Override
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.f6308a) {
            case 0:
                c cVar = (c) this.f6309b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.f6268k == null && cVar.f6262b != 0) {
                    h hVar = cVar.f6263c;
                    int[] e = g6.a.e(arrayDeque);
                    hVar.getClass();
                    n6.l.d("Must be called from the main thread.");
                    if (!hVar.w()) {
                        basePendingResult = h.t();
                    } else {
                        j jVar = new j(hVar, e);
                        h.x(jVar);
                        basePendingResult = jVar;
                    }
                    cVar.f6268k = basePendingResult;
                    basePendingResult.i(new q(cVar, 1));
                    arrayDeque.clear();
                    return;
                }
                return;
            case 1:
                try {
                    Socket socket = ((lc.q) this.f6309b).f11740a.f11779a.f11774g;
                    if (socket != null) {
                        socket.close();
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 2:
                i0.g3(new ho(this, 25));
                return;
            case 3:
                if (((kd0) this.f6309b).N != null) {
                    i0.g3(new yy(this, 25));
                    return;
                }
                return;
            case 4:
                i0.g3(new kg0(this, 8));
                return;
            default:
                i0.g3(new d0(this, 6));
                return;
        }
    }
}
