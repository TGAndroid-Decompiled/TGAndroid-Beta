package ci;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.aq;
import org.telegram.ui.g10;
import org.telegram.ui.nl0;
public final class o2 extends TimerTask {
    public final int f5649a;
    public final Object f5650b;

    public o2(Object obj, int i10) {
        this.f5649a = i10;
        this.f5650b = obj;
    }

    @Override
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.f5649a) {
            case 0:
                AndroidUtilities.runOnUIThread(new androidx.fragment.app.a0(this, 14));
                return;
            case 1:
                e6.c cVar = (e6.c) this.f5650b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.f8659k == null && cVar.f8652b != 0) {
                    e6.h hVar = cVar.f8653c;
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
                    cVar.f8659k = basePendingResult;
                    basePendingResult.i(new e6.r(cVar, 1));
                    arrayDeque.clear();
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new aq(this, 24));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new g10(this, 23));
                return;
            default:
                AndroidUtilities.runOnUIThread(new nl0(this, 5));
                return;
        }
    }
}
