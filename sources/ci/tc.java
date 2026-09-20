package ci;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
public final class tc {
    public int f5578a;
    public boolean f5579b;
    public xc f5580c;
    public String d;
    public long e;
    public long f5581f;
    public float f5582g;
    public float h;
    public float f5583i;
    public final RectF f5584j = new RectF();
    public final org.telegram.ui.Components.d6 f5585k;
    public final zc f5586l;

    public tc(zc zcVar) {
        this.f5586l = zcVar;
        this.f5585k = new org.telegram.ui.Components.d6(zcVar, 360L, qr.h);
    }

    public static void a(tc tcVar, boolean z10) {
        zc zcVar = tcVar.f5586l;
        if (zcVar.getMeasuredWidth() > 0) {
            xc xcVar = tcVar.f5580c;
            if (xcVar == null || z10) {
                Long l4 = null;
                if (xcVar != null) {
                    xcVar.b();
                    tcVar.f5580c = null;
                }
                zc zcVar2 = tcVar.f5586l;
                boolean z11 = tcVar.f5579b;
                String str = tcVar.d;
                int i10 = zcVar2.f5932v1;
                int i11 = zcVar2.f5941y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j3 = tcVar.e;
                if (j3 > 2) {
                    l4 = Long.valueOf(j3);
                }
                tcVar.f5580c = new xc(zcVar2, z11, str, i12, dp, l4, zcVar.getMaxScrollDuration(), zcVar.Z0, zcVar.f5886a1, new androidx.fragment.app.a0(tcVar, 29));
            }
        }
    }

    public static void b(tc tcVar) {
        zc zcVar = tcVar.f5586l;
        int i10 = tcVar.f5578a;
        if (i10 >= 0) {
            ArrayList arrayList = zcVar.f5921r;
            if (i10 < arrayList.size()) {
                rc rcVar = (rc) arrayList.get(tcVar.f5578a);
                if (zcVar.getMeasuredWidth() > 0 && rcVar == null) {
                    if (rcVar != null) {
                        rcVar.a();
                    }
                    arrayList.set(tcVar.f5578a, new rc(zcVar, tcVar.d, (zcVar.getMeasuredWidth() - zcVar.getPaddingLeft()) - zcVar.getPaddingRight()));
                }
            }
        }
    }
}
