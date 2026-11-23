package oi;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.messenger.dj;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.a70;
public final class q5 implements View.OnClickListener {
    public final int f22287a;
    public final z5 f22288b;

    public q5(z5 z5Var, int i7) {
        this.f22287a = i7;
        this.f22288b = z5Var;
    }

    @Override
    public final void onClick(View view) {
        Set set;
        switch (this.f22287a) {
            case 0:
                z5 z5Var = this.f22288b;
                a aVar = z5Var.f22560y;
                if (aVar != null && aVar.f21903e) {
                    boolean z10 = !aVar.f21904f;
                    aVar.f21904f = z10;
                    ((CheckBoxBase) z5Var.f22553e.f3898b).f(-1, z10, true);
                    w5 w5Var = z5Var.E;
                    if (w5Var != null) {
                        a aVar2 = z5Var.f22560y;
                        boolean z11 = aVar2.f21904f;
                        s3 s3Var = ((c3) w5Var).f21999a;
                        aVar2.f21904f = z11;
                        e2 e2Var = s3Var.R3;
                        if (e2Var != null) {
                            e2Var.d();
                            s3Var.R3.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                z5 z5Var2 = this.f22288b;
                w5 w5Var2 = z5Var2.E;
                if (w5Var2 != null) {
                    a aVar3 = z5Var2.f22560y;
                    s3 s3Var2 = ((c3) w5Var2).f21999a;
                    if (aVar3 != null && (aVar3.f21901b instanceof TL_iv.pageBlockPreformatted) && (set = qi.j.f56197a.f56219y) != null) {
                        ArrayList arrayList = new ArrayList(set);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.f21901b;
                        a70 G0 = s3Var2.f22365p3.G0(view);
                        G0.X(m6.d0(org.telegram.messenger.g0.L(3.0f), m6.w0(m6.f29347d6, s3Var2.f22364o3)));
                        G0.f33335c0 = true;
                        G0.f33331a0 = org.telegram.messenger.g0.L(350.0f);
                        G0.i(new l2(s3Var2, aVar3, 25), hd.N0(2131753996, null), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            G0.i(null, dj.b(pageblockpreformatted.language), true);
                        }
                        G0.k();
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj = arrayList.get(i7);
                            i7++;
                            String str = (String) obj;
                            G0.i(new kg.y((ViewGroup) s3Var2, (Object) aVar3, str, 17), dj.b(str), TextUtils.equals(str, pageblockpreformatted.language));
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
