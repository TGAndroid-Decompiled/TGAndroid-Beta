package ci;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tr;
public final class pc {
    public int f5713a;
    public boolean f5714b;
    public tc f5715c;
    public String d;
    public long f5716e;
    public long f5717f;
    public float f5718g;
    public float h;
    public float f5719i;
    public final RectF f5720j = new RectF();
    public final org.telegram.ui.Components.e6 f5721k;
    public final vc f5722l;

    public pc(vc vcVar) {
        this.f5722l = vcVar;
        this.f5721k = new org.telegram.ui.Components.e6(vcVar, 360L, tr.h);
    }

    public static void a(pc pcVar, boolean z10) {
        vc vcVar = pcVar.f5722l;
        if (vcVar.getMeasuredWidth() > 0) {
            tc tcVar = pcVar.f5715c;
            if (tcVar == null || z10) {
                Long l4 = null;
                if (tcVar != null) {
                    tcVar.b();
                    pcVar.f5715c = null;
                }
                vc vcVar2 = pcVar.f5722l;
                boolean z11 = pcVar.f5714b;
                String str = pcVar.d;
                int i10 = vcVar2.f6184v1;
                int i11 = vcVar2.f6193y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j3 = pcVar.f5716e;
                if (j3 > 2) {
                    l4 = Long.valueOf(j3);
                }
                pcVar.f5715c = new tc(vcVar2, z11, str, i12, dp, l4, vcVar.getMaxScrollDuration(), vcVar.Z0, vcVar.f6137a1, new androidx.fragment.app.a0(pcVar, 29));
            }
        }
    }

    public static void b(pc pcVar) {
        vc vcVar = pcVar.f5722l;
        int i10 = pcVar.f5713a;
        if (i10 >= 0) {
            ArrayList arrayList = vcVar.f6173r;
            if (i10 < arrayList.size()) {
                nc ncVar = (nc) arrayList.get(pcVar.f5713a);
                if (vcVar.getMeasuredWidth() > 0 && ncVar == null) {
                    if (ncVar != null) {
                        ncVar.a();
                    }
                    arrayList.set(pcVar.f5713a, new nc(vcVar, pcVar.d, (vcVar.getMeasuredWidth() - vcVar.getPaddingLeft()) - vcVar.getPaddingRight()));
                }
            }
        }
    }
}
