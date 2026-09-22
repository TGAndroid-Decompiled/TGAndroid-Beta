package ci;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
public final class tc {
    public int f5574a;
    public boolean f5575b;
    public xc f5576c;
    public String d;
    public long e;
    public long f5577f;
    public float f5578g;
    public float h;
    public float f5579i;
    public final RectF f5580j = new RectF();
    public final org.telegram.ui.Components.c6 f5581k;
    public final zc f5582l;

    public tc(zc zcVar) {
        this.f5582l = zcVar;
        this.f5581k = new org.telegram.ui.Components.c6(zcVar, 360L, qr.h);
    }

    public static void a(tc tcVar, boolean z10) {
        zc zcVar = tcVar.f5582l;
        if (zcVar.getMeasuredWidth() > 0) {
            xc xcVar = tcVar.f5576c;
            if (xcVar == null || z10) {
                Long l4 = null;
                if (xcVar != null) {
                    xcVar.b();
                    tcVar.f5576c = null;
                }
                zc zcVar2 = tcVar.f5582l;
                boolean z11 = tcVar.f5575b;
                String str = tcVar.d;
                int i10 = zcVar2.f5928v1;
                int i11 = zcVar2.f5937y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j3 = tcVar.e;
                if (j3 > 2) {
                    l4 = Long.valueOf(j3);
                }
                tcVar.f5576c = new xc(zcVar2, z11, str, i12, dp, l4, zcVar.getMaxScrollDuration(), zcVar.Z0, zcVar.f5882a1, new androidx.fragment.app.a0(tcVar, 29));
            }
        }
    }

    public static void b(tc tcVar) {
        zc zcVar = tcVar.f5582l;
        int i10 = tcVar.f5574a;
        if (i10 >= 0) {
            ArrayList arrayList = zcVar.f5917r;
            if (i10 < arrayList.size()) {
                rc rcVar = (rc) arrayList.get(tcVar.f5574a);
                if (zcVar.getMeasuredWidth() > 0 && rcVar == null) {
                    if (rcVar != null) {
                        rcVar.a();
                    }
                    arrayList.set(tcVar.f5574a, new rc(zcVar, tcVar.d, (zcVar.getMeasuredWidth() - zcVar.getPaddingLeft()) - zcVar.getPaddingRight()));
                }
            }
        }
    }
}
