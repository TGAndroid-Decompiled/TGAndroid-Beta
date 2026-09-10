package bi;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dq;
import org.telegram.ui.i10;
import org.telegram.ui.ql0;
public final class b3 extends TimerTask {
    public final int f2354a;
    public final Object f2355b;

    public b3(Object obj, int i10) {
        this.f2354a = i10;
        this.f2355b = obj;
    }

    @Override
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.f2354a) {
            case 0:
                AndroidUtilities.runOnUIThread(new a3.d(this, 20));
                return;
            case 1:
                e6.c cVar = (e6.c) this.f2355b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.f7297k == null && cVar.f7291b != 0) {
                    e6.h hVar = cVar.f7292c;
                    int[] e = g6.a.e(arrayDeque);
                    hVar.getClass();
                    n6.l.e("Must be called from the main thread.");
                    if (!hVar.w()) {
                        basePendingResult = e6.h.t();
                    } else {
                        e6.k kVar = new e6.k(hVar, e);
                        e6.h.x(kVar);
                        basePendingResult = kVar;
                    }
                    cVar.f7297k = basePendingResult;
                    basePendingResult.i(new e6.r(cVar, 1));
                    arrayDeque.clear();
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new dq(this, 24));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new i10(this, 23));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ql0(this, 5));
                return;
        }
    }
}
