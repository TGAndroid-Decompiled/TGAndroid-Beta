package ci;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tr;
public final class qc {
    public int f5395a;
    public boolean f5396b;
    public uc f5397c;
    public String d;
    public long e;
    public long f5398f;
    public float f5399g;
    public float h;
    public float f5400i;
    public final RectF f5401j = new RectF();
    public final org.telegram.ui.Components.e6 f5402k;
    public final wc f5403l;

    public qc(wc wcVar) {
        this.f5403l = wcVar;
        this.f5402k = new org.telegram.ui.Components.e6(wcVar, 360L, tr.h);
    }

    public static void a(qc qcVar, boolean z10) {
        wc wcVar = qcVar.f5403l;
        if (wcVar.getMeasuredWidth() > 0) {
            uc ucVar = qcVar.f5397c;
            if (ucVar == null || z10) {
                Long l4 = null;
                if (ucVar != null) {
                    ucVar.b();
                    qcVar.f5397c = null;
                }
                wc wcVar2 = qcVar.f5403l;
                boolean z11 = qcVar.f5396b;
                String str = qcVar.d;
                int i10 = wcVar2.f5803v1;
                int i11 = wcVar2.f5812y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j3 = qcVar.e;
                if (j3 > 2) {
                    l4 = Long.valueOf(j3);
                }
                qcVar.f5397c = new uc(wcVar2, z11, str, i12, dp, l4, wcVar.getMaxScrollDuration(), wcVar.Z0, wcVar.f5757a1, new androidx.fragment.app.a0(qcVar, 29));
            }
        }
    }

    public static void b(qc qcVar) {
        wc wcVar = qcVar.f5403l;
        int i10 = qcVar.f5395a;
        if (i10 >= 0) {
            ArrayList arrayList = wcVar.f5792r;
            if (i10 < arrayList.size()) {
                oc ocVar = (oc) arrayList.get(qcVar.f5395a);
                if (wcVar.getMeasuredWidth() > 0 && ocVar == null) {
                    if (ocVar != null) {
                        ocVar.a();
                    }
                    arrayList.set(qcVar.f5395a, new oc(wcVar, qcVar.d, (wcVar.getMeasuredWidth() - wcVar.getPaddingLeft()) - wcVar.getPaddingRight()));
                }
            }
        }
    }
}
