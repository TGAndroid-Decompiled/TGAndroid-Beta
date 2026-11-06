package fi;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.ui.Components.xq;
public final class ab {
    public int f11619a;
    public boolean f11620b;
    public db f11621c;
    public String d;
    public long f11622e;
    public long f11623f;
    public float f11624g;
    public float h;
    public float f11625i;
    public final RectF f11626j = new RectF();
    public final org.telegram.ui.Components.w5 f11627k;
    public final fb f11628l;

    public ab(fb fbVar) {
        this.f11628l = fbVar;
        this.f11627k = new org.telegram.ui.Components.w5(fbVar, 360L, xq.h);
    }

    public static void a(ab abVar, boolean z9) {
        fb fbVar = abVar.f11628l;
        if (fbVar.getMeasuredWidth() > 0) {
            db dbVar = abVar.f11621c;
            if (dbVar == null || z9) {
                Long l10 = null;
                if (dbVar != null) {
                    dbVar.b();
                    abVar.f11621c = null;
                }
                fb fbVar2 = abVar.f11628l;
                boolean z10 = abVar.f11620b;
                String str = abVar.d;
                int i7 = fbVar2.f12041v1;
                int i10 = fbVar2.f12050y1;
                int i11 = (i7 - i10) - i10;
                int L = org.telegram.messenger.g0.L(38.0f);
                long j3 = abVar.f11622e;
                if (j3 > 2) {
                    l10 = Long.valueOf(j3);
                }
                abVar.f11621c = new db(fbVar2, z10, str, i11, L, l10, fbVar.getMaxScrollDuration(), fbVar.Z0, fbVar.f11995a1, new h9(abVar, 6));
            }
        }
    }

    public static void b(ab abVar) {
        fb fbVar = abVar.f11628l;
        int i7 = abVar.f11619a;
        if (i7 >= 0) {
            ArrayList arrayList = fbVar.f12030r;
            if (i7 < arrayList.size()) {
                ya yaVar = (ya) arrayList.get(abVar.f11619a);
                if (fbVar.getMeasuredWidth() > 0 && yaVar == null) {
                    if (yaVar != null) {
                        yaVar.a();
                    }
                    arrayList.set(abVar.f11619a, new ya(fbVar, abVar.d, (fbVar.getMeasuredWidth() - fbVar.getPaddingLeft()) - fbVar.getPaddingRight()));
                }
            }
        }
    }
}
