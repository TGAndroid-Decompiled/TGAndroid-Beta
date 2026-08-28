package kh;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
public final class bc {
    public int f15012a;
    public boolean f15013b;
    public ec f15014c;
    public String d;
    public long f15015e;
    public long f15016f;
    public float f15017g;
    public float h;
    public float f15018i;
    public final RectF f15019j = new RectF();
    public final org.telegram.ui.Components.y5 f15020k;
    public final gc f15021l;

    public bc(gc gcVar) {
        this.f15021l = gcVar;
        this.f15020k = new org.telegram.ui.Components.y5(gcVar, 360L, gr.h);
    }

    public static void a(bc bcVar, boolean z10) {
        gc gcVar = bcVar.f15021l;
        if (gcVar.getMeasuredWidth() > 0) {
            ec ecVar = bcVar.f15014c;
            if (ecVar == null || z10) {
                Long l10 = null;
                if (ecVar != null) {
                    ecVar.b();
                    bcVar.f15014c = null;
                }
                gc gcVar2 = bcVar.f15021l;
                boolean z11 = bcVar.f15013b;
                String str = bcVar.d;
                int i9 = gcVar2.f15366r1;
                int i10 = gcVar2.f15373u1;
                int i11 = (i9 - i10) - i10;
                int dp = AndroidUtilities.dp(38.0f);
                long j10 = bcVar.f15015e;
                if (j10 > 2) {
                    l10 = Long.valueOf(j10);
                }
                bcVar.f15014c = new ec(gcVar2, z11, str, i11, dp, l10, gcVar.getMaxScrollDuration(), gcVar.V0, gcVar.W0, new f1(bcVar, 19));
            }
        }
    }

    public static void b(bc bcVar) {
        gc gcVar = bcVar.f15021l;
        int i9 = bcVar.f15012a;
        if (i9 >= 0) {
            ArrayList arrayList = gcVar.f15364r;
            if (i9 < arrayList.size()) {
                zb zbVar = (zb) arrayList.get(bcVar.f15012a);
                if (gcVar.getMeasuredWidth() > 0 && zbVar == null) {
                    if (zbVar != null) {
                        zbVar.a();
                    }
                    arrayList.set(bcVar.f15012a, new zb(gcVar, bcVar.d, (gcVar.getMeasuredWidth() - gcVar.getPaddingLeft()) - gcVar.getPaddingRight()));
                }
            }
        }
    }
}
