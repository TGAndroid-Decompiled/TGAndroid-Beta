package hi;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.ui.Components.nr;
public final class xa {
    public int f15761a;
    public boolean f15762b;
    public ab f15763c;
    public String d;
    public long f15764e;
    public long f15765f;
    public float f15766g;
    public float h;
    public float f15767i;
    public final RectF f15768j = new RectF();
    public final org.telegram.ui.Components.d6 f15769k;
    public final cb f15770l;

    public xa(cb cbVar) {
        this.f15770l = cbVar;
        this.f15769k = new org.telegram.ui.Components.d6(cbVar, 360L, nr.h);
    }

    public static void a(xa xaVar, boolean z10) {
        cb cbVar = xaVar.f15770l;
        if (cbVar.getMeasuredWidth() > 0) {
            ab abVar = xaVar.f15763c;
            if (abVar == null || z10) {
                Long l10 = null;
                if (abVar != null) {
                    abVar.b();
                    xaVar.f15763c = null;
                }
                cb cbVar2 = xaVar.f15770l;
                boolean z11 = xaVar.f15762b;
                String str = xaVar.d;
                int i7 = cbVar2.f14445w1;
                int i10 = cbVar2.f14453z1;
                int i11 = (i7 - i10) - i10;
                int L = org.telegram.messenger.g0.L(38.0f);
                long j3 = xaVar.f15764e;
                if (j3 > 2) {
                    l10 = Long.valueOf(j3);
                }
                xaVar.f15763c = new ab(cbVar2, z11, str, i11, L, l10, cbVar.getMaxScrollDuration(), cbVar.f14396a1, cbVar.f14399b1, new l(xaVar, 23));
            }
        }
    }

    public static void b(xa xaVar) {
        cb cbVar = xaVar.f15770l;
        int i7 = xaVar.f15761a;
        if (i7 >= 0) {
            ArrayList arrayList = cbVar.f14431r;
            if (i7 < arrayList.size()) {
                va vaVar = (va) arrayList.get(xaVar.f15761a);
                if (cbVar.getMeasuredWidth() > 0 && vaVar == null) {
                    if (vaVar != null) {
                        vaVar.a();
                    }
                    arrayList.set(xaVar.f15761a, new va(cbVar, xaVar.d, (cbVar.getMeasuredWidth() - cbVar.getPaddingLeft()) - cbVar.getPaddingRight()));
                }
            }
        }
    }
}
