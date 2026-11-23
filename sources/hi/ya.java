package hi;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.ui.Components.nr;
public final class ya {
    public int f15737a;
    public boolean f15738b;
    public bb f15739c;
    public String d;
    public long f15740e;
    public long f15741f;
    public float f15742g;
    public float h;
    public float f15743i;
    public final RectF f15744j = new RectF();
    public final org.telegram.ui.Components.d6 f15745k;
    public final db f15746l;

    public ya(db dbVar) {
        this.f15746l = dbVar;
        this.f15745k = new org.telegram.ui.Components.d6(dbVar, 360L, nr.h);
    }

    public static void a(ya yaVar, boolean z10) {
        db dbVar = yaVar.f15746l;
        if (dbVar.getMeasuredWidth() > 0) {
            bb bbVar = yaVar.f15739c;
            if (bbVar == null || z10) {
                Long l10 = null;
                if (bbVar != null) {
                    bbVar.b();
                    yaVar.f15739c = null;
                }
                db dbVar2 = yaVar.f15746l;
                boolean z11 = yaVar.f15738b;
                String str = yaVar.d;
                int i7 = dbVar2.f14472w1;
                int i10 = dbVar2.f14480z1;
                int i11 = (i7 - i10) - i10;
                int L = org.telegram.messenger.g0.L(38.0f);
                long j3 = yaVar.f15740e;
                if (j3 > 2) {
                    l10 = Long.valueOf(j3);
                }
                yaVar.f15739c = new bb(dbVar2, z11, str, i11, L, l10, dbVar.getMaxScrollDuration(), dbVar.f14423a1, dbVar.f14426b1, new b0(yaVar, 22));
            }
        }
    }

    public static void b(ya yaVar) {
        db dbVar = yaVar.f15746l;
        int i7 = yaVar.f15737a;
        if (i7 >= 0) {
            ArrayList arrayList = dbVar.f14458r;
            if (i7 < arrayList.size()) {
                wa waVar = (wa) arrayList.get(yaVar.f15737a);
                if (dbVar.getMeasuredWidth() > 0 && waVar == null) {
                    if (waVar != null) {
                        waVar.a();
                    }
                    arrayList.set(yaVar.f15737a, new wa(dbVar, yaVar.d, (dbVar.getMeasuredWidth() - dbVar.getPaddingLeft()) - dbVar.getPaddingRight()));
                }
            }
        }
    }
}
