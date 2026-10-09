package ci;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hs;
public final class qc {
    public int f5845a;
    public boolean f5846b;
    public uc f5847c;
    public String d;
    public long f5848e;
    public long f5849f;
    public float f5850g;
    public float h;
    public float f5851i;
    public final RectF f5852j = new RectF();
    public final org.telegram.ui.Components.g6 f5853k;
    public final wc f5854l;

    public qc(wc wcVar) {
        this.f5854l = wcVar;
        this.f5853k = new org.telegram.ui.Components.g6(wcVar, 360L, hs.h);
    }

    public static void a(qc qcVar, boolean z10) {
        wc wcVar = qcVar.f5854l;
        if (wcVar.getMeasuredWidth() > 0) {
            uc ucVar = qcVar.f5847c;
            if (ucVar == null || z10) {
                Long l4 = null;
                if (ucVar != null) {
                    ucVar.b();
                    qcVar.f5847c = null;
                }
                wc wcVar2 = qcVar.f5854l;
                boolean z11 = qcVar.f5846b;
                String str = qcVar.d;
                int i10 = wcVar2.f6276v1;
                int i11 = wcVar2.f6285y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j3 = qcVar.f5848e;
                if (j3 > 2) {
                    l4 = Long.valueOf(j3);
                }
                qcVar.f5847c = new uc(wcVar2, z11, str, i12, dp, l4, wcVar.getMaxScrollDuration(), wcVar.Z0, wcVar.f6229a1, new androidx.fragment.app.a0(qcVar, 29));
            }
        }
    }

    public static void b(qc qcVar) {
        wc wcVar = qcVar.f5854l;
        int i10 = qcVar.f5845a;
        if (i10 >= 0) {
            ArrayList arrayList = wcVar.f6265r;
            if (i10 < arrayList.size()) {
                oc ocVar = (oc) arrayList.get(qcVar.f5845a);
                if (wcVar.getMeasuredWidth() > 0 && ocVar == null) {
                    if (ocVar != null) {
                        ocVar.a();
                    }
                    arrayList.set(qcVar.f5845a, new oc(wcVar, qcVar.d, (wcVar.getMeasuredWidth() - wcVar.getPaddingLeft()) - wcVar.getPaddingRight()));
                }
            }
        }
    }
}
