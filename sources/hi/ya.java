package hi;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.ui.Components.lr;
public final class ya {
    public int f15781a;
    public boolean f15782b;
    public bb f15783c;
    public String d;
    public long f15784e;
    public long f15785f;
    public float f15786g;
    public float h;
    public float f15787i;
    public final RectF f15788j = new RectF();
    public final org.telegram.ui.Components.c6 f15789k;
    public final db f15790l;

    public ya(db dbVar) {
        this.f15790l = dbVar;
        this.f15789k = new org.telegram.ui.Components.c6(dbVar, 360L, lr.h);
    }

    public static void a(ya yaVar, boolean z10) {
        db dbVar = yaVar.f15790l;
        if (dbVar.getMeasuredWidth() > 0) {
            bb bbVar = yaVar.f15783c;
            if (bbVar == null || z10) {
                Long l10 = null;
                if (bbVar != null) {
                    bbVar.b();
                    yaVar.f15783c = null;
                }
                db dbVar2 = yaVar.f15790l;
                boolean z11 = yaVar.f15782b;
                String str = yaVar.d;
                int i7 = dbVar2.f14495w1;
                int i10 = dbVar2.f14503z1;
                int i11 = (i7 - i10) - i10;
                int L = org.telegram.messenger.g0.L(38.0f);
                long j3 = yaVar.f15784e;
                if (j3 > 2) {
                    l10 = Long.valueOf(j3);
                }
                yaVar.f15783c = new bb(dbVar2, z11, str, i11, L, l10, dbVar.getMaxScrollDuration(), dbVar.f14446a1, dbVar.f14449b1, new k(yaVar, 23));
            }
        }
    }

    public static void b(ya yaVar) {
        db dbVar = yaVar.f15790l;
        int i7 = yaVar.f15781a;
        if (i7 >= 0) {
            ArrayList arrayList = dbVar.f14481r;
            if (i7 < arrayList.size()) {
                wa waVar = (wa) arrayList.get(yaVar.f15781a);
                if (dbVar.getMeasuredWidth() > 0 && waVar == null) {
                    if (waVar != null) {
                        waVar.a();
                    }
                    arrayList.set(yaVar.f15781a, new wa(dbVar, yaVar.d, (dbVar.getMeasuredWidth() - dbVar.getPaddingLeft()) - dbVar.getPaddingRight()));
                }
            }
        }
    }
}
