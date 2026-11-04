package gi;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.ui.Components.xq;
public final class ab {
    public int f12412a;
    public boolean f12413b;
    public db f12414c;
    public String d;
    public long f12415e;
    public long f12416f;
    public float f12417g;
    public float h;
    public float f12418i;
    public final RectF f12419j = new RectF();
    public final org.telegram.ui.Components.u5 f12420k;
    public final fb f12421l;

    public ab(fb fbVar) {
        this.f12421l = fbVar;
        this.f12420k = new org.telegram.ui.Components.u5(fbVar, 360L, xq.h);
    }

    public static void a(ab abVar, boolean z10) {
        fb fbVar = abVar.f12421l;
        if (fbVar.getMeasuredWidth() > 0) {
            db dbVar = abVar.f12414c;
            if (dbVar == null || z10) {
                Long l10 = null;
                if (dbVar != null) {
                    dbVar.b();
                    abVar.f12414c = null;
                }
                fb fbVar2 = abVar.f12421l;
                boolean z11 = abVar.f12413b;
                String str = abVar.d;
                int i3 = fbVar2.f12809w1;
                int i10 = fbVar2.f12817z1;
                int i11 = (i3 - i10) - i10;
                int L = org.telegram.messenger.g0.L(38.0f);
                long j10 = abVar.f12415e;
                if (j10 > 2) {
                    l10 = Long.valueOf(j10);
                }
                abVar.f12414c = new db(fbVar2, z11, str, i11, L, l10, fbVar.getMaxScrollDuration(), fbVar.f12760a1, fbVar.f12763b1, new f6(abVar, 10));
            }
        }
    }

    public static void b(ab abVar) {
        fb fbVar = abVar.f12421l;
        int i3 = abVar.f12412a;
        if (i3 >= 0) {
            ArrayList arrayList = fbVar.f12795r;
            if (i3 < arrayList.size()) {
                ya yaVar = (ya) arrayList.get(abVar.f12412a);
                if (fbVar.getMeasuredWidth() > 0 && yaVar == null) {
                    if (yaVar != null) {
                        yaVar.a();
                    }
                    arrayList.set(abVar.f12412a, new ya(fbVar, abVar.d, (fbVar.getMeasuredWidth() - fbVar.getPaddingLeft()) - fbVar.getPaddingRight()));
                }
            }
        }
    }
}
