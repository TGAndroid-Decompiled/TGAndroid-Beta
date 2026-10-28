package fi;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
public final class xb {
    public int f11967a;
    public boolean f11968b;
    public ac f11969c;
    public String d;
    public long e;
    public long f11970f;
    public float f11971g;
    public float h;
    public float f11972i;
    public final RectF f11973j = new RectF();
    public final org.telegram.ui.Components.h6 f11974k;
    public final cc f11975l;

    public xb(cc ccVar) {
        this.f11975l = ccVar;
        this.f11974k = new org.telegram.ui.Components.h6(ccVar, 360L, ds.h);
    }

    public static void a(xb xbVar, boolean z10) {
        cc ccVar = xbVar.f11975l;
        if (ccVar.getMeasuredWidth() > 0) {
            ac acVar = xbVar.f11969c;
            if (acVar == null || z10) {
                Long l4 = null;
                if (acVar != null) {
                    acVar.b();
                    xbVar.f11969c = null;
                }
                cc ccVar2 = xbVar.f11975l;
                boolean z11 = xbVar.f11968b;
                String str = xbVar.d;
                int i10 = ccVar2.f10669v1;
                int i11 = ccVar2.f10678y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j10 = xbVar.e;
                if (j10 > 2) {
                    l4 = Long.valueOf(j10);
                }
                xbVar.f11969c = new ac(ccVar2, z11, str, i12, dp, l4, ccVar.getMaxScrollDuration(), ccVar.Z0, ccVar.f10623a1, new ua(xbVar, 3));
            }
        }
    }

    public static void b(xb xbVar) {
        cc ccVar = xbVar.f11975l;
        int i10 = xbVar.f11967a;
        if (i10 >= 0) {
            ArrayList arrayList = ccVar.f10658r;
            if (i10 < arrayList.size()) {
                vb vbVar = (vb) arrayList.get(xbVar.f11967a);
                if (ccVar.getMeasuredWidth() > 0 && vbVar == null) {
                    if (vbVar != null) {
                        vbVar.a();
                    }
                    arrayList.set(xbVar.f11967a, new vb(ccVar, xbVar.d, (ccVar.getMeasuredWidth() - ccVar.getPaddingLeft()) - ccVar.getPaddingRight()));
                }
            }
        }
    }
}
