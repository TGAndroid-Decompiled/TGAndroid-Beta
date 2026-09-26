package ci;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.zp;
import org.telegram.ui.c10;
import org.telegram.ui.il0;
public final class o2 extends TimerTask {
    public final int f5236a;
    public final Object f5237b;

    public o2(Object obj, int i10) {
        this.f5236a = i10;
        this.f5237b = obj;
    }

    @Override
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.f5236a) {
            case 0:
                AndroidUtilities.runOnUIThread(new androidx.fragment.app.a0(this, 14));
                return;
            case 1:
                e6.c cVar = (e6.c) this.f5237b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.f7979k == null && cVar.f7973b != 0) {
                    e6.h hVar = cVar.f7974c;
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
                    cVar.f7979k = basePendingResult;
                    basePendingResult.i(new e6.r(cVar, 1));
                    arrayDeque.clear();
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new zp(this, 24));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new c10(this, 23));
                return;
            default:
                AndroidUtilities.runOnUIThread(new il0(this, 5));
                return;
        }
    }
}
