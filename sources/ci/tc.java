package ci;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
public final class tc {
    public int f5577a;
    public boolean f5578b;
    public xc f5579c;
    public String d;
    public long e;
    public long f5580f;
    public float f5581g;
    public float h;
    public float f5582i;
    public final RectF f5583j = new RectF();
    public final org.telegram.ui.Components.e6 f5584k;
    public final zc f5585l;

    public tc(zc zcVar) {
        this.f5585l = zcVar;
        this.f5584k = new org.telegram.ui.Components.e6(zcVar, 360L, qr.h);
    }

    public static void a(tc tcVar, boolean z10) {
        zc zcVar = tcVar.f5585l;
        if (zcVar.getMeasuredWidth() > 0) {
            xc xcVar = tcVar.f5579c;
            if (xcVar == null || z10) {
                Long l4 = null;
                if (xcVar != null) {
                    xcVar.b();
                    tcVar.f5579c = null;
                }
                zc zcVar2 = tcVar.f5585l;
                boolean z11 = tcVar.f5578b;
                String str = tcVar.d;
                int i10 = zcVar2.f5931v1;
                int i11 = zcVar2.f5940y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j3 = tcVar.e;
                if (j3 > 2) {
                    l4 = Long.valueOf(j3);
                }
                tcVar.f5579c = new xc(zcVar2, z11, str, i12, dp, l4, zcVar.getMaxScrollDuration(), zcVar.Z0, zcVar.f5885a1, new androidx.fragment.app.a0(tcVar, 29));
            }
        }
    }

    public static void b(tc tcVar) {
        zc zcVar = tcVar.f5585l;
        int i10 = tcVar.f5577a;
        if (i10 >= 0) {
            ArrayList arrayList = zcVar.f5920r;
            if (i10 < arrayList.size()) {
                rc rcVar = (rc) arrayList.get(tcVar.f5577a);
                if (zcVar.getMeasuredWidth() > 0 && rcVar == null) {
                    if (rcVar != null) {
                        rcVar.a();
                    }
                    arrayList.set(tcVar.f5577a, new rc(zcVar, tcVar.d, (zcVar.getMeasuredWidth() - zcVar.getPaddingLeft()) - zcVar.getPaddingRight()));
                }
            }
        }
    }
}
