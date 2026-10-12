package ci;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.js;
public final class qc {
    public int f5843a;
    public boolean f5844b;
    public uc f5845c;
    public String d;
    public long f5846e;
    public long f5847f;
    public float f5848g;
    public float h;
    public float f5849i;
    public final RectF f5850j = new RectF();
    public final org.telegram.ui.Components.g6 f5851k;
    public final wc f5852l;

    public qc(wc wcVar) {
        this.f5852l = wcVar;
        this.f5851k = new org.telegram.ui.Components.g6(wcVar, 360L, js.h);
    }

    public static void a(qc qcVar, boolean z10) {
        wc wcVar = qcVar.f5852l;
        if (wcVar.getMeasuredWidth() > 0) {
            uc ucVar = qcVar.f5845c;
            if (ucVar == null || z10) {
                Long l4 = null;
                if (ucVar != null) {
                    ucVar.b();
                    qcVar.f5845c = null;
                }
                wc wcVar2 = qcVar.f5852l;
                boolean z11 = qcVar.f5844b;
                String str = qcVar.d;
                int i10 = wcVar2.f6274v1;
                int i11 = wcVar2.f6283y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j3 = qcVar.f5846e;
                if (j3 > 2) {
                    l4 = Long.valueOf(j3);
                }
                qcVar.f5845c = new uc(wcVar2, z11, str, i12, dp, l4, wcVar.getMaxScrollDuration(), wcVar.Z0, wcVar.f6227a1, new androidx.fragment.app.a0(qcVar, 29));
            }
        }
    }

    public static void b(qc qcVar) {
        wc wcVar = qcVar.f5852l;
        int i10 = qcVar.f5843a;
        if (i10 >= 0) {
            ArrayList arrayList = wcVar.f6263r;
            if (i10 < arrayList.size()) {
                oc ocVar = (oc) arrayList.get(qcVar.f5843a);
                if (wcVar.getMeasuredWidth() > 0 && ocVar == null) {
                    if (ocVar != null) {
                        ocVar.a();
                    }
                    arrayList.set(qcVar.f5843a, new oc(wcVar, qcVar.d, (wcVar.getMeasuredWidth() - wcVar.getPaddingLeft()) - wcVar.getPaddingRight()));
                }
            }
        }
    }
}
