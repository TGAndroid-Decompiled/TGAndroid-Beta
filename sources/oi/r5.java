package oi;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.messenger.cj;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.x60;
public final class r5 implements View.OnClickListener {
    public final int f22419a;
    public final a6 f22420b;

    public r5(a6 a6Var, int i7) {
        this.f22419a = i7;
        this.f22420b = a6Var;
    }

    @Override
    public final void onClick(View view) {
        Set set;
        switch (this.f22419a) {
            case 0:
                a6 a6Var = this.f22420b;
                a aVar = a6Var.f22044y;
                if (aVar != null && aVar.f22003e) {
                    boolean z10 = !aVar.f22004f;
                    aVar.f22004f = z10;
                    ((CheckBoxBase) a6Var.f22037e.f3898b).f(-1, z10, true);
                    x5 x5Var = a6Var.E;
                    if (x5Var != null) {
                        a aVar2 = a6Var.f22044y;
                        boolean z11 = aVar2.f22004f;
                        t3 t3Var = ((d3) x5Var).f22122a;
                        aVar2.f22004f = z11;
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
                a6 a6Var2 = this.f22420b;
                x5 x5Var2 = a6Var2.E;
                if (x5Var2 != null) {
                    a aVar3 = a6Var2.f22044y;
                    t3 t3Var2 = ((d3) x5Var2).f22122a;
                    if (aVar3 != null && (aVar3.f22001b instanceof TL_iv.pageBlockPreformatted) && (set = qi.j.f56310a.f56332y) != null) {
                        ArrayList arrayList = new ArrayList(set);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.f22001b;
                        x60 i02 = t3Var2.f22495p3.i0(view);
                        i02.X(n6.d0(org.telegram.messenger.g0.L(3.0f), n6.w0(n6.f29451d6, t3Var2.f22494o3)));
                        i02.f41864c0 = true;
                        i02.f41860a0 = org.telegram.messenger.g0.L(350.0f);
                        i02.i(new n2(t3Var2, aVar3, 25), gd.N0(2131753996, null), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            i02.i(null, cj.b(pageblockpreformatted.language), true);
                        }
                        i02.k();
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj = arrayList.get(i7);
                            i7++;
                            String str = (String) obj;
                            i02.i(new kg.x(t3Var2, aVar3, str, 18), cj.b(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        i02.a0();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
