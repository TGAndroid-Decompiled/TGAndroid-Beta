package ci;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sr;
public final class qc {
    public int f5386a;
    public boolean f5387b;
    public uc f5388c;
    public String d;
    public long e;
    public long f5389f;
    public float f5390g;
    public float h;
    public float f5391i;
    public final RectF f5392j = new RectF();
    public final org.telegram.ui.Components.e6 f5393k;
    public final wc f5394l;

    public qc(wc wcVar) {
        this.f5394l = wcVar;
        this.f5393k = new org.telegram.ui.Components.e6(wcVar, 360L, sr.h);
    }

    public static void a(qc qcVar, boolean z10) {
        wc wcVar = qcVar.f5394l;
        if (wcVar.getMeasuredWidth() > 0) {
            uc ucVar = qcVar.f5388c;
            if (ucVar == null || z10) {
                Long l4 = null;
                if (ucVar != null) {
                    ucVar.b();
                    qcVar.f5388c = null;
                }
                wc wcVar2 = qcVar.f5394l;
                boolean z11 = qcVar.f5387b;
                String str = qcVar.d;
                int i10 = wcVar2.f5791v1;
                int i11 = wcVar2.f5800y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j3 = qcVar.e;
                if (j3 > 2) {
                    l4 = Long.valueOf(j3);
                }
                qcVar.f5388c = new uc(wcVar2, z11, str, i12, dp, l4, wcVar.getMaxScrollDuration(), wcVar.Z0, wcVar.f5745a1, new androidx.fragment.app.a0(qcVar, 29));
            }
        }
    }

    public static void b(qc qcVar) {
        wc wcVar = qcVar.f5394l;
        int i10 = qcVar.f5386a;
        if (i10 >= 0) {
            ArrayList arrayList = wcVar.f5780r;
            if (i10 < arrayList.size()) {
                oc ocVar = (oc) arrayList.get(qcVar.f5386a);
                if (wcVar.getMeasuredWidth() > 0 && ocVar == null) {
                    if (ocVar != null) {
                        ocVar.a();
                    }
                    arrayList.set(qcVar.f5386a, new oc(wcVar, qcVar.d, (wcVar.getMeasuredWidth() - wcVar.getPaddingLeft()) - wcVar.getPaddingRight()));
                }
            }
        }
    }
}
