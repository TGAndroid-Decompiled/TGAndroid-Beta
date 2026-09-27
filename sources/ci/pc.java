package ci;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sr;
public final class pc {
    public int f5305a;
    public boolean f5306b;
    public tc f5307c;
    public String d;
    public long e;
    public long f5308f;
    public float f5309g;
    public float h;
    public float f5310i;
    public final RectF f5311j = new RectF();
    public final org.telegram.ui.Components.e6 f5312k;
    public final vc f5313l;

    public pc(vc vcVar) {
        this.f5313l = vcVar;
        this.f5312k = new org.telegram.ui.Components.e6(vcVar, 360L, sr.h);
    }

    public static void a(pc pcVar, boolean z10) {
        vc vcVar = pcVar.f5313l;
        if (vcVar.getMeasuredWidth() > 0) {
            tc tcVar = pcVar.f5307c;
            if (tcVar == null || z10) {
                Long l4 = null;
                if (tcVar != null) {
                    tcVar.b();
                    pcVar.f5307c = null;
                }
                vc vcVar2 = pcVar.f5313l;
                boolean z11 = pcVar.f5306b;
                String str = pcVar.d;
                int i10 = vcVar2.f5741v1;
                int i11 = vcVar2.f5750y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j3 = pcVar.e;
                if (j3 > 2) {
                    l4 = Long.valueOf(j3);
                }
                pcVar.f5307c = new tc(vcVar2, z11, str, i12, dp, l4, vcVar.getMaxScrollDuration(), vcVar.Z0, vcVar.f5695a1, new androidx.fragment.app.a0(pcVar, 29));
            }
        }
    }

    public static void b(pc pcVar) {
        vc vcVar = pcVar.f5313l;
        int i10 = pcVar.f5305a;
        if (i10 >= 0) {
            ArrayList arrayList = vcVar.f5730r;
            if (i10 < arrayList.size()) {
                nc ncVar = (nc) arrayList.get(pcVar.f5305a);
                if (vcVar.getMeasuredWidth() > 0 && ncVar == null) {
                    if (ncVar != null) {
                        ncVar.a();
                    }
                    arrayList.set(pcVar.f5305a, new nc(vcVar, pcVar.d, (vcVar.getMeasuredWidth() - vcVar.getPaddingLeft()) - vcVar.getPaddingRight()));
                }
            }
        }
    }
}
