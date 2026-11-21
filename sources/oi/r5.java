package oi;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.messenger.cj;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.a70;
public final class r5 implements View.OnClickListener {
    public final int f22358a;
    public final a6 f22359b;

    public r5(a6 a6Var, int i7) {
        this.f22358a = i7;
        this.f22359b = a6Var;
    }

    @Override
    public final void onClick(View view) {
        Set set;
        switch (this.f22358a) {
            case 0:
                a6 a6Var = this.f22359b;
                a aVar = a6Var.f21975y;
                if (aVar != null && aVar.f21934e) {
                    boolean z10 = !aVar.f21935f;
                    aVar.f21935f = z10;
                    ((CheckBoxBase) a6Var.f21968e.f3873b).f(-1, z10, true);
                    x5 x5Var = a6Var.E;
                    if (x5Var != null) {
                        a aVar2 = a6Var.f21975y;
                        boolean z11 = aVar2.f21935f;
                        t3 t3Var = ((d3) x5Var).f22053a;
                        aVar2.f21935f = z11;
                        g2 g2Var = t3Var.R3;
                        if (g2Var != null) {
                            g2Var.d();
                            t3Var.R3.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                a6 a6Var2 = this.f22359b;
                x5 x5Var2 = a6Var2.E;
                if (x5Var2 != null) {
                    a aVar3 = a6Var2.f21975y;
                    t3 t3Var2 = ((d3) x5Var2).f22053a;
                    if (aVar3 != null && (aVar3.f21932b instanceof TL_iv.pageBlockPreformatted) && (set = qi.j.f56228a.f56250y) != null) {
                        ArrayList arrayList = new ArrayList(set);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.f21932b;
                        a70 G0 = t3Var2.f22425p3.G0(view);
                        G0.X(m6.d0(org.telegram.messenger.g0.L(3.0f), m6.w0(m6.f29378d6, t3Var2.f22424o3)));
                        G0.f33356c0 = true;
                        G0.f33352a0 = org.telegram.messenger.g0.L(350.0f);
                        G0.i(new n2(t3Var2, aVar3, 25), gd.N0(2131753996, null), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            G0.i(null, cj.b(pageblockpreformatted.language), true);
                        }
                        G0.k();
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj = arrayList.get(i7);
                            i7++;
                            String str = (String) obj;
                            G0.i(new kg.y((ViewGroup) t3Var2, (Object) aVar3, str, 17), cj.b(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        G0.a0();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
