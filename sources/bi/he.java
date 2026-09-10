package bi;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wr;
public final class he {
    public int f2813a;
    public boolean f2814b;
    public ke f2815c;
    public String d;
    public long e;
    public long f2816f;
    public float f2817g;
    public float h;
    public float f2818i;
    public final RectF f2819j = new RectF();
    public final org.telegram.ui.Components.d6 f2820k;
    public final me f2821l;

    public he(me meVar) {
        this.f2821l = meVar;
        this.f2820k = new org.telegram.ui.Components.d6(meVar, 360L, wr.h);
    }

    public static void a(he heVar, boolean z10) {
        me meVar = heVar.f2821l;
        if (meVar.getMeasuredWidth() > 0) {
            ke keVar = heVar.f2815c;
            if (keVar == null || z10) {
                Long l4 = null;
                if (keVar != null) {
                    keVar.b();
                    heVar.f2815c = null;
                }
                me meVar2 = heVar.f2821l;
                boolean z11 = heVar.f2814b;
                String str = heVar.d;
                int i10 = meVar2.f3196v1;
                int i11 = meVar2.f3205y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j3 = heVar.e;
                if (j3 > 2) {
                    l4 = Long.valueOf(j3);
                }
                heVar.f2815c = new ke(meVar2, z11, str, i12, dp, l4, meVar.getMaxScrollDuration(), meVar.Z0, meVar.f3150a1, new wc(heVar, 5));
            }
        }
    }

    public static void b(he heVar) {
        me meVar = heVar.f2821l;
        int i10 = heVar.f2813a;
        if (i10 >= 0) {
            ArrayList arrayList = meVar.f3185r;
            if (i10 < arrayList.size()) {
                fe feVar = (fe) arrayList.get(heVar.f2813a);
                if (meVar.getMeasuredWidth() > 0 && feVar == null) {
                    if (feVar != null) {
                        feVar.a();
                    }
                    arrayList.set(heVar.f2813a, new fe(meVar, heVar.d, (meVar.getMeasuredWidth() - meVar.getPaddingLeft()) - meVar.getPaddingRight()));
                }
            }
        }
    }
}
