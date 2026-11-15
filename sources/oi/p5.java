package oi;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.messenger.dj;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.m60;
public final class p5 implements View.OnClickListener {
    public final int f21898a;
    public final y5 f21899b;

    public p5(y5 y5Var, int i7) {
        this.f21898a = i7;
        this.f21899b = y5Var;
    }

    @Override
    public final void onClick(View view) {
        Set set;
        switch (this.f21898a) {
            case 0:
                y5 y5Var = this.f21899b;
                a aVar = y5Var.f22151y;
                if (aVar != null && aVar.f21546e) {
                    boolean z10 = !aVar.f21547f;
                    aVar.f21547f = z10;
                    ((CheckBoxBase) y5Var.f22144e.f3748b).f(-1, z10, true);
                    v5 v5Var = y5Var.E;
                    if (v5Var != null) {
                        a aVar2 = y5Var.f22151y;
                        boolean z11 = aVar2.f21547f;
                        q3 q3Var = ((a3) v5Var).f21571a;
                        aVar2.f21547f = z11;
                        d2 d2Var = q3Var.R3;
                        if (d2Var != null) {
                            d2Var.d();
                            q3Var.R3.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                y5 y5Var2 = this.f21899b;
                v5 v5Var2 = y5Var2.E;
                if (v5Var2 != null) {
                    a aVar3 = y5Var2.f22151y;
                    q3 q3Var2 = ((a3) v5Var2).f21571a;
                    if (aVar3 != null && (aVar3.f21544b instanceof TL_iv.pageBlockPreformatted) && (set = qi.j.f55613a.f55635y) != null) {
                        ArrayList arrayList = new ArrayList(set);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.f21544b;
                        m60 g02 = q3Var2.f21931p3.g0(view);
                        g02.W(j6.d0(org.telegram.messenger.g0.L(3.0f), j6.w0(j6.f28849d6, q3Var2.f21930o3)));
                        g02.Z = true;
                        g02.X = org.telegram.messenger.g0.L(350.0f);
                        g02.i(new k2(q3Var2, aVar3, 25), hd.M0(2131753999, null), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            g02.i(null, dj.b(pageblockpreformatted.language), true);
                        }
                        g02.k();
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj = arrayList.get(i7);
                            i7++;
                            String str = (String) obj;
                            g02.i(new ki.n(q3Var2, aVar3, str, 12), dj.b(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        g02.Z();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
