package di;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wp;
import org.telegram.ui.g10;
import org.telegram.ui.rl0;
public final class p2 extends TimerTask {
    public final int f7821a;
    public final Object f7822b;

    public p2(Object obj, int i10) {
        this.f7821a = i10;
        this.f7822b = obj;
    }

    @Override
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.f7821a) {
            case 0:
                AndroidUtilities.runOnUIThread(new bi.oa(this, 20));
                return;
            case 1:
                e6.c cVar = (e6.c) this.f7822b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.f8858k == null && cVar.f8851b != 0) {
                    e6.h hVar = cVar.f8852c;
                    int[] e7 = g6.a.e(arrayDeque);
                    hVar.getClass();
                    n6.l.e("Must be called from the main thread.");
                    if (!hVar.w()) {
                        basePendingResult = e6.h.t();
                    } else {
                        e6.k kVar = new e6.k(hVar, e7);
                        e6.h.x(kVar);
                        basePendingResult = kVar;
                    }
                    cVar.f8858k = basePendingResult;
                    basePendingResult.i(new e6.r(cVar, 1));
                    arrayDeque.clear();
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new wp(this, 24));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new g10(this, 23));
                return;
            default:
                AndroidUtilities.runOnUIThread(new rl0(this, 5));
                return;
        }
    }
}
