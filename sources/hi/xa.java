package hi;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.ui.Components.er;
public final class xa {
    public int f15390a;
    public boolean f15391b;
    public ab f15392c;
    public String d;
    public long f15393e;
    public long f15394f;
    public float f15395g;
    public float h;
    public float f15396i;
    public final RectF f15397j = new RectF();
    public final org.telegram.ui.Components.u5 f15398k;
    public final cb f15399l;

    public xa(cb cbVar) {
        this.f15399l = cbVar;
        this.f15398k = new org.telegram.ui.Components.u5(cbVar, 360L, er.h);
    }

    public static void a(xa xaVar, boolean z10) {
        cb cbVar = xaVar.f15399l;
        if (cbVar.getMeasuredWidth() > 0) {
            ab abVar = xaVar.f15392c;
            if (abVar == null || z10) {
                Long l10 = null;
                if (abVar != null) {
                    abVar.b();
                    xaVar.f15392c = null;
                }
                cb cbVar2 = xaVar.f15399l;
                boolean z11 = xaVar.f15391b;
                String str = xaVar.d;
                int i7 = cbVar2.f14041w1;
                int i10 = cbVar2.f14049z1;
                int i11 = (i7 - i10) - i10;
                int L = org.telegram.messenger.g0.L(38.0f);
                long j3 = xaVar.f15393e;
                if (j3 > 2) {
                    l10 = Long.valueOf(j3);
                }
                xaVar.f15392c = new ab(cbVar2, z11, str, i11, L, l10, cbVar.getMaxScrollDuration(), cbVar.f13992a1, cbVar.f13995b1, new e1(xaVar, 19));
            }
        }
    }

    public static void b(xa xaVar) {
        cb cbVar = xaVar.f15399l;
        int i7 = xaVar.f15390a;
        if (i7 >= 0) {
            ArrayList arrayList = cbVar.f14027r;
            if (i7 < arrayList.size()) {
                va vaVar = (va) arrayList.get(xaVar.f15390a);
                if (cbVar.getMeasuredWidth() > 0 && vaVar == null) {
                    if (vaVar != null) {
                        vaVar.a();
                    }
                    arrayList.set(xaVar.f15390a, new va(cbVar, xaVar.d, (cbVar.getMeasuredWidth() - cbVar.getPaddingLeft()) - cbVar.getPaddingRight()));
                }
            }
        }
    }
}
