package ci;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xp;
import org.telegram.ui.g10;
import org.telegram.ui.pl0;
public final class p2 extends TimerTask {
    public final int f5299a;
    public final Object f5300b;

    public p2(Object obj, int i10) {
        this.f5299a = i10;
        this.f5300b = obj;
    }

    @Override
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.f5299a) {
            case 0:
                AndroidUtilities.runOnUIThread(new androidx.fragment.app.a0(this, 14));
                return;
            case 1:
                e6.c cVar = (e6.c) this.f5300b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.f7994k == null && cVar.f7988b != 0) {
                    e6.h hVar = cVar.f7989c;
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
                    cVar.f7994k = basePendingResult;
                    basePendingResult.i(new e6.r(cVar, 1));
                    arrayDeque.clear();
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new xp(this, 24));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new g10(this, 23));
                return;
            default:
                AndroidUtilities.runOnUIThread(new pl0(this, 5));
                return;
        }
    }
}
