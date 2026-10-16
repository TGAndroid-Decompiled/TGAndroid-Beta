package di;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;
public final class pc {
    public int f7598a;
    public boolean f7599b;
    public sc f7600c;
    public String d;
    public long e;
    public long f7601f;
    public float f7602g;
    public float h;
    public float f7603i;
    public final RectF f7604j = new RectF();
    public final org.telegram.ui.Components.g6 f7605k;
    public final uc f7606l;

    public pc(uc ucVar) {
        this.f7606l = ucVar;
        this.f7605k = new org.telegram.ui.Components.g6(ucVar, 360L, es.h);
    }

    public static void a(pc pcVar, boolean z10) {
        uc ucVar = pcVar.f7606l;
        if (ucVar.getMeasuredWidth() > 0) {
            sc scVar = pcVar.f7600c;
            if (scVar == null || z10) {
                Long l4 = null;
                if (scVar != null) {
                    scVar.b();
                    pcVar.f7600c = null;
                }
                uc ucVar2 = pcVar.f7606l;
                boolean z11 = pcVar.f7599b;
                String str = pcVar.d;
                int i10 = ucVar2.f7959v1;
                int i11 = ucVar2.f7968y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j10 = pcVar.e;
                if (j10 > 2) {
                    l4 = Long.valueOf(j10);
                }
                pcVar.f7600c = new sc(ucVar2, z11, str, i12, dp, l4, ucVar.getMaxScrollDuration(), ucVar.Z0, ucVar.f7913a1, new x8(pcVar, 8));
            }
        }
    }

    public static void b(pc pcVar) {
        uc ucVar = pcVar.f7606l;
        int i10 = pcVar.f7598a;
        if (i10 >= 0) {
            ArrayList arrayList = ucVar.f7948r;
            if (i10 < arrayList.size()) {
                nc ncVar = (nc) arrayList.get(pcVar.f7598a);
                if (ucVar.getMeasuredWidth() > 0 && ncVar == null) {
                    if (ncVar != null) {
                        ncVar.a();
                    }
                    arrayList.set(pcVar.f7598a, new nc(ucVar, pcVar.d, (ucVar.getMeasuredWidth() - ucVar.getPaddingLeft()) - ucVar.getPaddingRight()));
                }
            }
        }
    }
}
