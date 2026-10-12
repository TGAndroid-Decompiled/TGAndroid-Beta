package di;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;
public final class pc {
    public int f7595a;
    public boolean f7596b;
    public sc f7597c;
    public String d;
    public long e;
    public long f7598f;
    public float f7599g;
    public float h;
    public float f7600i;
    public final RectF f7601j = new RectF();
    public final org.telegram.ui.Components.g6 f7602k;
    public final uc f7603l;

    public pc(uc ucVar) {
        this.f7603l = ucVar;
        this.f7602k = new org.telegram.ui.Components.g6(ucVar, 360L, es.h);
    }

    public static void a(pc pcVar, boolean z10) {
        uc ucVar = pcVar.f7603l;
        if (ucVar.getMeasuredWidth() > 0) {
            sc scVar = pcVar.f7597c;
            if (scVar == null || z10) {
                Long l4 = null;
                if (scVar != null) {
                    scVar.b();
                    pcVar.f7597c = null;
                }
                uc ucVar2 = pcVar.f7603l;
                boolean z11 = pcVar.f7596b;
                String str = pcVar.d;
                int i10 = ucVar2.f7956v1;
                int i11 = ucVar2.f7965y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j10 = pcVar.e;
                if (j10 > 2) {
                    l4 = Long.valueOf(j10);
                }
                pcVar.f7597c = new sc(ucVar2, z11, str, i12, dp, l4, ucVar.getMaxScrollDuration(), ucVar.Z0, ucVar.f7910a1, new x8(pcVar, 8));
            }
        }
    }

    public static void b(pc pcVar) {
        uc ucVar = pcVar.f7603l;
        int i10 = pcVar.f7595a;
        if (i10 >= 0) {
            ArrayList arrayList = ucVar.f7945r;
            if (i10 < arrayList.size()) {
                nc ncVar = (nc) arrayList.get(pcVar.f7595a);
                if (ucVar.getMeasuredWidth() > 0 && ncVar == null) {
                    if (ncVar != null) {
                        ncVar.a();
                    }
                    arrayList.set(pcVar.f7595a, new nc(ucVar, pcVar.d, (ucVar.getMeasuredWidth() - ucVar.getPaddingLeft()) - ucVar.getPaddingRight()));
                }
            }
        }
    }
}
