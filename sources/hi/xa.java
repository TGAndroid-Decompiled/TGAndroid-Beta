package hi;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.ui.Components.nr;
public final class xa {
    public int f15764a;
    public boolean f15765b;
    public ab f15766c;
    public String d;
    public long f15767e;
    public long f15768f;
    public float f15769g;
    public float h;
    public float f15770i;
    public final RectF f15771j = new RectF();
    public final org.telegram.ui.Components.d6 f15772k;
    public final cb f15773l;

    public xa(cb cbVar) {
        this.f15773l = cbVar;
        this.f15772k = new org.telegram.ui.Components.d6(cbVar, 360L, nr.h);
    }

    public static void a(xa xaVar, boolean z10) {
        cb cbVar = xaVar.f15773l;
        if (cbVar.getMeasuredWidth() > 0) {
            ab abVar = xaVar.f15766c;
            if (abVar == null || z10) {
                Long l10 = null;
                if (abVar != null) {
                    abVar.b();
                    xaVar.f15766c = null;
                }
                cb cbVar2 = xaVar.f15773l;
                boolean z11 = xaVar.f15765b;
                String str = xaVar.d;
                int i7 = cbVar2.f14448w1;
                int i10 = cbVar2.f14456z1;
                int i11 = (i7 - i10) - i10;
                int L = org.telegram.messenger.g0.L(38.0f);
                long j3 = xaVar.f15767e;
                if (j3 > 2) {
                    l10 = Long.valueOf(j3);
                }
                xaVar.f15766c = new ab(cbVar2, z11, str, i11, L, l10, cbVar.getMaxScrollDuration(), cbVar.f14399a1, cbVar.f14402b1, new l(xaVar, 23));
            }
        }
    }

    public static void b(xa xaVar) {
        cb cbVar = xaVar.f15773l;
        int i7 = xaVar.f15764a;
        if (i7 >= 0) {
            ArrayList arrayList = cbVar.f14434r;
            if (i7 < arrayList.size()) {
                va vaVar = (va) arrayList.get(xaVar.f15764a);
                if (cbVar.getMeasuredWidth() > 0 && vaVar == null) {
                    if (vaVar != null) {
                        vaVar.a();
                    }
                    arrayList.set(xaVar.f15764a, new va(cbVar, xaVar.d, (cbVar.getMeasuredWidth() - cbVar.getPaddingLeft()) - cbVar.getPaddingRight()));
                }
            }
        }
    }
}
