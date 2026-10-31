package bi;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.messenger.cd;
import org.telegram.messenger.gj;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.z60;
public final class e6 implements View.OnClickListener {
    public final int f2985a;
    public final q6 f2986b;

    public e6(q6 q6Var, int i10) {
        this.f2985a = i10;
        this.f2986b = q6Var;
    }

    @Override
    public final void onClick(View view) {
        Set set;
        switch (this.f2985a) {
            case 0:
                q6 q6Var = this.f2986b;
                a aVar = q6Var.f3309y;
                if (aVar != null && aVar.e) {
                    boolean z10 = !aVar.f2820f;
                    aVar.f2820f = z10;
                    ((CheckBoxBase) q6Var.e.f3356b).f(-1, z10, true);
                    n6 n6Var = q6Var.D;
                    if (n6Var != null) {
                        a aVar2 = q6Var.f3309y;
                        boolean z11 = aVar2.f2820f;
                        d4 d4Var = ((m3) n6Var).f3203a;
                        aVar2.f2820f = z11;
                        o2 o2Var = d4Var.Q3;
                        if (o2Var != null) {
                            o2Var.d();
                            d4Var.Q3.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                q6 q6Var2 = this.f2986b;
                n6 n6Var2 = q6Var2.D;
                if (n6Var2 != null) {
                    a aVar3 = q6Var2.f3309y;
                    d4 d4Var2 = ((m3) n6Var2).f3203a;
                    if (aVar3 != null && (aVar3.f2818b instanceof TL_iv.pageBlockPreformatted) && (set = di.l.f5973a.f5994y) != null) {
                        ArrayList arrayList = new ArrayList(set);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.f2818b;
                        z60 U = d4Var2.f2938o3.U(view);
                        U.W(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(3.0f), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, d4Var2.f2936n3)));
                        U.Z = true;
                        U.X = org.telegram.messenger.i0.L(350.0f);
                        U.i(new v2(d4Var2, aVar3, 25), cd.L0(2131753999, null), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            U.i(null, gj.b(pageblockpreformatted.language), true);
                        }
                        U.k();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            String str = (String) obj;
                            U.i(new a3.l0(d4Var2, aVar3, str, 14), gj.b(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        U.Z();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
