package nh;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rp;
import org.telegram.ui.q00;
import org.telegram.ui.vk0;
public final class g2 extends TimerTask {
    public final int f17690a;
    public final Object f17691b;

    public g2(Object obj, int i10) {
        this.f17690a = i10;
        this.f17691b = obj;
    }

    @Override
    public final void run() {
        BasePendingResult basePendingResult;
        switch (this.f17690a) {
            case 0:
                AndroidUtilities.runOnUIThread(new lh.m5(this, 25));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new rp(this, 24));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new q00(this, 23));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new vk0(this, 5));
                return;
            default:
                q5.c cVar = (q5.c) this.f17691b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.f46373k == null && cVar.f46366b != 0) {
                    q5.h hVar = cVar.f46367c;
                    int[] e10 = s5.a.e(arrayDeque);
                    hVar.getClass();
                    z5.l.e("Must be called from the main thread.");
                    if (!hVar.w()) {
                        basePendingResult = q5.h.t();
                    } else {
                        q5.j jVar = new q5.j(hVar, e10);
                        q5.h.x(jVar);
                        basePendingResult = jVar;
                    }
                    cVar.f46373k = basePendingResult;
                    basePendingResult.i(new q5.p(cVar, 1));
                    arrayDeque.clear();
                    return;
                }
                return;
        }
    }
}
