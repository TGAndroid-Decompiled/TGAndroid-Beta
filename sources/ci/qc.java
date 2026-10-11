package ci;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.is;
public final class qc {
    public int f5844a;
    public boolean f5845b;
    public uc f5846c;
    public String d;
    public long f5847e;
    public long f5848f;
    public float f5849g;
    public float h;
    public float f5850i;
    public final RectF f5851j = new RectF();
    public final org.telegram.ui.Components.g6 f5852k;
    public final wc f5853l;

    public qc(wc wcVar) {
        this.f5853l = wcVar;
        this.f5852k = new org.telegram.ui.Components.g6(wcVar, 360L, is.h);
    }

    public static void a(qc qcVar, boolean z10) {
        wc wcVar = qcVar.f5853l;
        if (wcVar.getMeasuredWidth() > 0) {
            uc ucVar = qcVar.f5846c;
            if (ucVar == null || z10) {
                Long l4 = null;
                if (ucVar != null) {
                    ucVar.b();
                    qcVar.f5846c = null;
                }
                wc wcVar2 = qcVar.f5853l;
                boolean z11 = qcVar.f5845b;
                String str = qcVar.d;
                int i10 = wcVar2.f6275v1;
                int i11 = wcVar2.f6284y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j3 = qcVar.f5847e;
                if (j3 > 2) {
                    l4 = Long.valueOf(j3);
                }
                qcVar.f5846c = new uc(wcVar2, z11, str, i12, dp, l4, wcVar.getMaxScrollDuration(), wcVar.Z0, wcVar.f6228a1, new androidx.fragment.app.a0(qcVar, 29));
            }
        }
    }

    public static void b(qc qcVar) {
        wc wcVar = qcVar.f5853l;
        int i10 = qcVar.f5844a;
        if (i10 >= 0) {
            ArrayList arrayList = wcVar.f6264r;
            if (i10 < arrayList.size()) {
                oc ocVar = (oc) arrayList.get(qcVar.f5844a);
                if (wcVar.getMeasuredWidth() > 0 && ocVar == null) {
                    if (ocVar != null) {
                        ocVar.a();
                    }
                    arrayList.set(qcVar.f5844a, new oc(wcVar, qcVar.d, (wcVar.getMeasuredWidth() - wcVar.getPaddingLeft()) - wcVar.getPaddingRight()));
                }
            }
        }
    }
}
