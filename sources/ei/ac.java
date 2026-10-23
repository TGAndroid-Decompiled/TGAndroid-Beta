package ei;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
public final class ac {
    public int f8762a;
    public boolean f8763b;
    public ec f8764c;
    public String d;
    public long e;
    public long f8765f;
    public float f8766g;
    public float h;
    public float f8767i;
    public final RectF f8768j = new RectF();
    public final org.telegram.ui.Components.f6 f8769k;
    public final gc f8770l;

    public ac(gc gcVar) {
        this.f8770l = gcVar;
        this.f8769k = new org.telegram.ui.Components.f6(gcVar, 360L, bs.h);
    }

    public static void a(ac acVar, boolean z10) {
        gc gcVar = acVar.f8770l;
        if (gcVar.getMeasuredWidth() > 0) {
            ec ecVar = acVar.f8764c;
            if (ecVar == null || z10) {
                Long l4 = null;
                if (ecVar != null) {
                    ecVar.b();
                    acVar.f8764c = null;
                }
                gc gcVar2 = acVar.f8770l;
                boolean z11 = acVar.f8763b;
                String str = acVar.d;
                int i10 = gcVar2.f9137v1;
                int i11 = gcVar2.f9146y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j10 = acVar.e;
                if (j10 > 2) {
                    l4 = Long.valueOf(j10);
                }
                acVar.f8764c = new ec(gcVar2, z11, str, i12, dp, l4, gcVar.getMaxScrollDuration(), gcVar.Z0, gcVar.f9091a1, new com.google.firebase.messaging.s(acVar, 29));
            }
        }
    }

    public static void b(ac acVar) {
        gc gcVar = acVar.f8770l;
        int i10 = acVar.f8762a;
        if (i10 >= 0) {
            ArrayList arrayList = gcVar.f9126r;
            if (i10 < arrayList.size()) {
                yb ybVar = (yb) arrayList.get(acVar.f8762a);
                if (gcVar.getMeasuredWidth() > 0 && ybVar == null) {
                    if (ybVar != null) {
                        ybVar.a();
                    }
                    arrayList.set(acVar.f8762a, new yb(gcVar, acVar.d, (gcVar.getMeasuredWidth() - gcVar.getPaddingLeft()) - gcVar.getPaddingRight()));
                }
            }
        }
    }
}
