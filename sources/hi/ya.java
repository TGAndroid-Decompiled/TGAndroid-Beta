package hi;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.ui.Components.lr;
public final class ya {
    public int f15784a;
    public boolean f15785b;
    public bb f15786c;
    public String d;
    public long f15787e;
    public long f15788f;
    public float f15789g;
    public float h;
    public float f15790i;
    public final RectF f15791j = new RectF();
    public final org.telegram.ui.Components.c6 f15792k;
    public final db f15793l;

    public ya(db dbVar) {
        this.f15793l = dbVar;
        this.f15792k = new org.telegram.ui.Components.c6(dbVar, 360L, lr.h);
    }

    public static void a(ya yaVar, boolean z10) {
        db dbVar = yaVar.f15793l;
        if (dbVar.getMeasuredWidth() > 0) {
            bb bbVar = yaVar.f15786c;
            if (bbVar == null || z10) {
                Long l10 = null;
                if (bbVar != null) {
                    bbVar.b();
                    yaVar.f15786c = null;
                }
                db dbVar2 = yaVar.f15793l;
                boolean z11 = yaVar.f15785b;
                String str = yaVar.d;
                int i7 = dbVar2.f14498w1;
                int i10 = dbVar2.f14506z1;
                int i11 = (i7 - i10) - i10;
                int L = org.telegram.messenger.g0.L(38.0f);
                long j3 = yaVar.f15787e;
                if (j3 > 2) {
                    l10 = Long.valueOf(j3);
                }
                yaVar.f15786c = new bb(dbVar2, z11, str, i11, L, l10, dbVar.getMaxScrollDuration(), dbVar.f14449a1, dbVar.f14452b1, new k(yaVar, 23));
            }
        }
    }

    public static void b(ya yaVar) {
        db dbVar = yaVar.f15793l;
        int i7 = yaVar.f15784a;
        if (i7 >= 0) {
            ArrayList arrayList = dbVar.f14484r;
            if (i7 < arrayList.size()) {
                wa waVar = (wa) arrayList.get(yaVar.f15784a);
                if (dbVar.getMeasuredWidth() > 0 && waVar == null) {
                    if (waVar != null) {
                        waVar.a();
                    }
                    arrayList.set(yaVar.f15784a, new wa(dbVar, yaVar.d, (dbVar.getMeasuredWidth() - dbVar.getPaddingLeft()) - dbVar.getPaddingRight()));
                }
            }
        }
    }
}
