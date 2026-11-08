package li;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.messenger.fj;
import org.telegram.messenger.id;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.k60;
public final class r5 implements View.OnClickListener {
    public final int f18812a;
    public final a6 f18813b;

    public r5(a6 a6Var, int i7) {
        this.f18812a = i7;
        this.f18813b = a6Var;
    }

    @Override
    public final void onClick(View view) {
        Set set;
        switch (this.f18812a) {
            case 0:
                a6 a6Var = this.f18813b;
                a aVar = a6Var.f18435y;
                if (aVar != null && aVar.f18394e) {
                    boolean z9 = !aVar.f18395f;
                    aVar.f18395f = z9;
                    ((CheckBoxBase) a6Var.f18428e.f3833b).f(-1, z9, true);
                    x5 x5Var = a6Var.D;
                    if (x5Var != null) {
                        a aVar2 = a6Var.f18435y;
                        boolean z10 = aVar2.f18395f;
                        t3 t3Var = ((c3) x5Var).f18504a;
                        aVar2.f18395f = z10;
                        f2 f2Var = t3Var.Q3;
                        if (f2Var != null) {
                            f2Var.d();
                            t3Var.Q3.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                a6 a6Var2 = this.f18813b;
                x5 x5Var2 = a6Var2.D;
                if (x5Var2 != null) {
                    a aVar3 = a6Var2.f18435y;
                    t3 t3Var2 = ((c3) x5Var2).f18504a;
                    if (aVar3 != null && (aVar3.f18392b instanceof TL_iv.pageBlockPreformatted) && (set = ni.m.f20635a.f20657y) != null) {
                        ArrayList arrayList = new ArrayList(set);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.f18392b;
                        k60 J = t3Var2.f18890o3.J(view);
                        J.W(k6.d0(org.telegram.messenger.g0.L(3.0f), k6.w0(k6.f27852d6, t3Var2.f18888n3)));
                        J.Z = true;
                        J.X = org.telegram.messenger.g0.L(350.0f);
                        J.i(new m2(t3Var2, aVar3, 25), id.M0(2131753999, null), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            J.i(null, fj.b(pageblockpreformatted.language), true);
                        }
                        J.k();
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj = arrayList.get(i7);
                            i7++;
                            String str = (String) obj;
                            J.i(new l2.z0(t3Var2, aVar3, str, 5), fj.b(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        J.Z();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
