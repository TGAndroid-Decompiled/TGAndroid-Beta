package di;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
public final class uc {
    public int f8291a;
    public boolean f8292b;
    public xc f8293c;
    public String d;
    public long f8294e;
    public long f8295f;
    public float f8296g;
    public float h;
    public float f8297i;
    public final RectF f8298j = new RectF();
    public final org.telegram.ui.Components.e6 f8299k;
    public final zc f8300l;

    public uc(zc zcVar) {
        this.f8300l = zcVar;
        this.f8299k = new org.telegram.ui.Components.e6(zcVar, 360L, pr.h);
    }

    public static void a(uc ucVar, boolean z10) {
        zc zcVar = ucVar.f8300l;
        if (zcVar.getMeasuredWidth() > 0) {
            xc xcVar = ucVar.f8293c;
            if (xcVar == null || z10) {
                Long l4 = null;
                if (xcVar != null) {
                    xcVar.b();
                    ucVar.f8293c = null;
                }
                zc zcVar2 = ucVar.f8300l;
                boolean z11 = ucVar.f8292b;
                String str = ucVar.d;
                int i10 = zcVar2.f8612v1;
                int i11 = zcVar2.f8621y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j3 = ucVar.f8294e;
                if (j3 > 2) {
                    l4 = Long.valueOf(j3);
                }
                ucVar.f8293c = new xc(zcVar2, z11, str, i12, dp, l4, zcVar.getMaxScrollDuration(), zcVar.Z0, zcVar.f8565a1, new nb(ucVar, 5));
            }
        }
    }

    public static void b(uc ucVar) {
        zc zcVar = ucVar.f8300l;
        int i10 = ucVar.f8291a;
        if (i10 >= 0) {
            ArrayList arrayList = zcVar.f8601r;
            if (i10 < arrayList.size()) {
                sc scVar = (sc) arrayList.get(ucVar.f8291a);
                if (zcVar.getMeasuredWidth() > 0 && scVar == null) {
                    if (scVar != null) {
                        scVar.a();
                    }
                    arrayList.set(ucVar.f8291a, new sc(zcVar, ucVar.d, (zcVar.getMeasuredWidth() - zcVar.getPaddingLeft()) - zcVar.getPaddingRight()));
                }
            }
        }
    }
}
