package fi;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
public final class xb {
    public int f11968a;
    public boolean f11969b;
    public ac f11970c;
    public String d;
    public long e;
    public long f11971f;
    public float f11972g;
    public float h;
    public float f11973i;
    public final RectF f11974j = new RectF();
    public final org.telegram.ui.Components.h6 f11975k;
    public final cc f11976l;

    public xb(cc ccVar) {
        this.f11976l = ccVar;
        this.f11975k = new org.telegram.ui.Components.h6(ccVar, 360L, ds.h);
    }

    public static void a(xb xbVar, boolean z10) {
        cc ccVar = xbVar.f11976l;
        if (ccVar.getMeasuredWidth() > 0) {
            ac acVar = xbVar.f11970c;
            if (acVar == null || z10) {
                Long l4 = null;
                if (acVar != null) {
                    acVar.b();
                    xbVar.f11970c = null;
                }
                cc ccVar2 = xbVar.f11976l;
                boolean z11 = xbVar.f11969b;
                String str = xbVar.d;
                int i10 = ccVar2.f10670v1;
                int i11 = ccVar2.f10679y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j10 = xbVar.e;
                if (j10 > 2) {
                    l4 = Long.valueOf(j10);
                }
                xbVar.f11970c = new ac(ccVar2, z11, str, i12, dp, l4, ccVar.getMaxScrollDuration(), ccVar.Z0, ccVar.f10624a1, new ua(xbVar, 3));
            }
        }
    }

    public static void b(xb xbVar) {
        cc ccVar = xbVar.f11976l;
        int i10 = xbVar.f11968a;
        if (i10 >= 0) {
            ArrayList arrayList = ccVar.f10659r;
            if (i10 < arrayList.size()) {
                vb vbVar = (vb) arrayList.get(xbVar.f11968a);
                if (ccVar.getMeasuredWidth() > 0 && vbVar == null) {
                    if (vbVar != null) {
                        vbVar.a();
                    }
                    arrayList.set(xbVar.f11968a, new vb(ccVar, xbVar.d, (ccVar.getMeasuredWidth() - ccVar.getPaddingLeft()) - ccVar.getPaddingRight()));
                }
            }
        }
    }
}
