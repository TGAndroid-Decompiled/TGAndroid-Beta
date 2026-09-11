package di;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
public final class uc {
    public int f8263a;
    public boolean f8264b;
    public xc f8265c;
    public String d;
    public long f8266e;
    public long f8267f;
    public float f8268g;
    public float h;
    public float f8269i;
    public final RectF f8270j = new RectF();
    public final org.telegram.ui.Components.e6 f8271k;
    public final zc f8272l;

    public uc(zc zcVar) {
        this.f8272l = zcVar;
        this.f8271k = new org.telegram.ui.Components.e6(zcVar, 360L, pr.h);
    }

    public static void a(uc ucVar, boolean z10) {
        zc zcVar = ucVar.f8272l;
        if (zcVar.getMeasuredWidth() > 0) {
            xc xcVar = ucVar.f8265c;
            if (xcVar == null || z10) {
                Long l4 = null;
                if (xcVar != null) {
                    xcVar.b();
                    ucVar.f8265c = null;
                }
                zc zcVar2 = ucVar.f8272l;
                boolean z11 = ucVar.f8264b;
                String str = ucVar.d;
                int i10 = zcVar2.f8584v1;
                int i11 = zcVar2.f8593y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j3 = ucVar.f8266e;
                if (j3 > 2) {
                    l4 = Long.valueOf(j3);
                }
                ucVar.f8265c = new xc(zcVar2, z11, str, i12, dp, l4, zcVar.getMaxScrollDuration(), zcVar.Z0, zcVar.f8537a1, new nb(ucVar, 5));
            }
        }
    }

    public static void b(uc ucVar) {
        zc zcVar = ucVar.f8272l;
        int i10 = ucVar.f8263a;
        if (i10 >= 0) {
            ArrayList arrayList = zcVar.f8573r;
            if (i10 < arrayList.size()) {
                sc scVar = (sc) arrayList.get(ucVar.f8263a);
                if (zcVar.getMeasuredWidth() > 0 && scVar == null) {
                    if (scVar != null) {
                        scVar.a();
                    }
                    arrayList.set(ucVar.f8263a, new sc(zcVar, ucVar.d, (zcVar.getMeasuredWidth() - zcVar.getPaddingLeft()) - zcVar.getPaddingRight()));
                }
            }
        }
    }
}
