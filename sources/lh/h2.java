package lh;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lp;
import org.telegram.ui.r00;
import org.telegram.ui.zk0;

public final class h2 extends TimerTask {

    public final int f16054a;

    public final Object f16055b;

    public h2(Object obj, int i10) {
        this.f16054a = i10;
        this.f16055b = obj;
    }

    @Override
    public final void run() {
        BasePendingResult basePendingResultT;
        switch (this.f16054a) {
            case 0:
                AndroidUtilities.runOnUIThread(new kh.c(this, 11));
                break;
            case 1:
                o5.c cVar = (o5.c) this.f16055b;
                ArrayDeque arrayDeque = cVar.h;
                if (!arrayDeque.isEmpty() && cVar.f19313k == null && cVar.f19306b != 0) {
                    o5.h hVar = cVar.f19307c;
                    int[] iArrE = r5.a.e(arrayDeque);
                    hVar.getClass();
                    y5.l.e("Must be called from the main thread.");
                    if (hVar.w()) {
                        o5.j jVar = new o5.j(hVar, iArrE);
                        o5.h.x(jVar);
                        basePendingResultT = jVar;
                    } else {
                        basePendingResultT = o5.h.t();
                    }
                    cVar.f19313k = basePendingResultT;
                    basePendingResultT.i(new o5.p(cVar, 1));
                    arrayDeque.clear();
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new lp(this, 24));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new r00(this, 23));
                break;
            default:
                AndroidUtilities.runOnUIThread(new zk0(this, 5));
                break;
        }
    }
}
