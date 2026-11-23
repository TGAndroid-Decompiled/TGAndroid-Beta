package hi;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.ui.Components.kr;
public final class sb {
    public int f15408a;
    public boolean f15409b;
    public vb f15410c;
    public String d;
    public long f15411e;
    public long f15412f;
    public float f15413g;
    public float h;
    public float f15414i;
    public final RectF f15415j = new RectF();
    public final org.telegram.ui.Components.c6 f15416k;
    public final xb f15417l;

    public sb(xb xbVar) {
        this.f15417l = xbVar;
        this.f15416k = new org.telegram.ui.Components.c6(xbVar, 360L, kr.h);
    }

    public static void a(sb sbVar, boolean z10) {
        xb xbVar = sbVar.f15417l;
        if (xbVar.getMeasuredWidth() > 0) {
            vb vbVar = sbVar.f15410c;
            if (vbVar == null || z10) {
                Long l10 = null;
                if (vbVar != null) {
                    vbVar.b();
                    sbVar.f15410c = null;
                }
                xb xbVar2 = sbVar.f15417l;
                boolean z11 = sbVar.f15409b;
                String str = sbVar.d;
                int i7 = xbVar2.f15843w1;
                int i10 = xbVar2.f15851z1;
                int i11 = (i7 - i10) - i10;
                int L = org.telegram.messenger.g0.L(38.0f);
                long j3 = sbVar.f15411e;
                if (j3 > 2) {
                    l10 = Long.valueOf(j3);
                }
                sbVar.f15410c = new vb(xbVar2, z11, str, i11, L, l10, xbVar.getMaxScrollDuration(), xbVar.f15794a1, xbVar.f15797b1, new w(sbVar, 23));
            }
        }
    }

    public static void b(sb sbVar) {
        xb xbVar = sbVar.f15417l;
        int i7 = sbVar.f15408a;
        if (i7 >= 0) {
            ArrayList arrayList = xbVar.f15829r;
            if (i7 < arrayList.size()) {
                qb qbVar = (qb) arrayList.get(sbVar.f15408a);
                if (xbVar.getMeasuredWidth() > 0 && qbVar == null) {
                    if (qbVar != null) {
                        qbVar.a();
                    }
                    arrayList.set(sbVar.f15408a, new qb(xbVar, sbVar.d, (xbVar.getMeasuredWidth() - xbVar.getPaddingLeft()) - xbVar.getPaddingRight()));
                }
            }
        }
    }
}
