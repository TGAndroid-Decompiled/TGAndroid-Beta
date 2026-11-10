package fi;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.ui.Components.wq;
public final class ab {
    public int f11624a;
    public boolean f11625b;
    public db f11626c;
    public String d;
    public long f11627e;
    public long f11628f;
    public float f11629g;
    public float h;
    public float f11630i;
    public final RectF f11631j = new RectF();
    public final org.telegram.ui.Components.v5 f11632k;
    public final fb f11633l;

    public ab(fb fbVar) {
        this.f11633l = fbVar;
        this.f11632k = new org.telegram.ui.Components.v5(fbVar, 360L, wq.h);
    }

    public static void a(ab abVar, boolean z9) {
        fb fbVar = abVar.f11633l;
        if (fbVar.getMeasuredWidth() > 0) {
            db dbVar = abVar.f11626c;
            if (dbVar == null || z9) {
                Long l10 = null;
                if (dbVar != null) {
                    dbVar.b();
                    abVar.f11626c = null;
                }
                fb fbVar2 = abVar.f11633l;
                boolean z10 = abVar.f11625b;
                String str = abVar.d;
                int i7 = fbVar2.f12045v1;
                int i10 = fbVar2.f12054y1;
                int i11 = (i7 - i10) - i10;
                int L = org.telegram.messenger.g0.L(38.0f);
                long j3 = abVar.f11627e;
                if (j3 > 2) {
                    l10 = Long.valueOf(j3);
                }
                abVar.f11626c = new db(fbVar2, z10, str, i11, L, l10, fbVar.getMaxScrollDuration(), fbVar.Z0, fbVar.f11999a1, new v9(abVar, 5));
            }
        }
    }

    public static void b(ab abVar) {
        fb fbVar = abVar.f11633l;
        int i7 = abVar.f11624a;
        if (i7 >= 0) {
            ArrayList arrayList = fbVar.f12034r;
            if (i7 < arrayList.size()) {
                ya yaVar = (ya) arrayList.get(abVar.f11624a);
                if (fbVar.getMeasuredWidth() > 0 && yaVar == null) {
                    if (yaVar != null) {
                        yaVar.a();
                    }
                    arrayList.set(abVar.f11624a, new ya(fbVar, abVar.d, (fbVar.getMeasuredWidth() - fbVar.getPaddingLeft()) - fbVar.getPaddingRight()));
                }
            }
        }
    }
}
