package kh;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.np;
import org.telegram.ui.o00;
import org.telegram.ui.zk0;
public final class j2 extends TimerTask {
    public final int f15458a;
    public final Object f15459b;

    public j2(Object obj, int i9) {
        this.f15458a = i9;
        this.f15459b = obj;
    }

    @Override
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.f15458a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f1(this, 4));
                return;
            case 1:
                o5.c cVar = (o5.c) this.f15459b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.f18966k == null && cVar.f18959b != 0) {
                    o5.h hVar = cVar.f18960c;
                    int[] e10 = q5.a.e(arrayDeque);
                    hVar.getClass();
                    x5.l.e("Must be called from the main thread.");
                    if (!hVar.w()) {
                        basePendingResult = o5.h.t();
                    } else {
                        o5.j jVar = new o5.j(hVar, e10);
                        o5.h.x(jVar);
                        basePendingResult = jVar;
                    }
                    cVar.f18966k = basePendingResult;
                    basePendingResult.i(new o5.q(cVar, 1));
                    arrayDeque.clear();
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new np(this, 24));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new o00(this, 23));
                return;
            default:
                AndroidUtilities.runOnUIThread(new zk0(this, 5));
                return;
        }
    }
}
