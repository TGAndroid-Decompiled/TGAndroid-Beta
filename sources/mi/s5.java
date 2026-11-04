package mi;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.messenger.bd;
import org.telegram.messenger.wi;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.f60;
public final class s5 implements View.OnClickListener {
    public final int f19886a;
    public final b6 f19887b;

    public s5(b6 b6Var, int i3) {
        this.f19886a = i3;
        this.f19887b = b6Var;
    }

    @Override
    public final void onClick(View view) {
        Set set;
        switch (this.f19886a) {
            case 0:
                b6 b6Var = this.f19887b;
                a aVar = b6Var.f19491y;
                if (aVar != null && aVar.f19433e) {
                    boolean z10 = !aVar.f19434f;
                    aVar.f19434f = z10;
                    ((CheckBoxBase) b6Var.f19484e.f1094b).f(-1, z10, true);
                    y5 y5Var = b6Var.E;
                    if (y5Var != null) {
                        a aVar2 = b6Var.f19491y;
                        boolean z11 = aVar2.f19434f;
                        t3 t3Var = ((d3) y5Var).f19561a;
                        aVar2.f19434f = z11;
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
                b6 b6Var2 = this.f19887b;
                y5 y5Var2 = b6Var2.E;
                if (y5Var2 != null) {
                    a aVar3 = b6Var2.f19491y;
                    t3 t3Var2 = ((d3) y5Var2).f19561a;
                    if (aVar3 != null && (aVar3.f19431b instanceof TL_iv.pageBlockPreformatted) && (set = oi.k.f21149a.f21171y) != null) {
                        ArrayList arrayList = new ArrayList(set);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.f19431b;
                        f60 D1 = t3Var2.f19916p3.D1(view);
                        D1.W(k6.d0(org.telegram.messenger.g0.L(3.0f), k6.w0(k6.f27878d6, t3Var2.f19914o3)));
                        D1.Z = true;
                        D1.X = org.telegram.messenger.g0.L(350.0f);
                        D1.i(new n2(t3Var2, aVar3, 25), bd.M0(2131753999, null), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            D1.i(null, wi.b(pageblockpreformatted.language), true);
                        }
                        D1.k();
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            String str = (String) obj;
                            D1.i(new lg.y((ViewGroup) t3Var2, (Object) aVar3, str, 9), wi.b(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        D1.Z();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
