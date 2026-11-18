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
import org.telegram.ui.Components.y60;
public final class q5 implements View.OnClickListener {
    public final int f22256a;
    public final z5 f22257b;

    public q5(z5 z5Var, int i7) {
        this.f22256a = i7;
        this.f22257b = z5Var;
    }

    @Override
    public final void onClick(View view) {
        Set set;
        switch (this.f22256a) {
            case 0:
                z5 z5Var = this.f22257b;
                a aVar = z5Var.f22565y;
                if (aVar != null && aVar.f21909e) {
                    boolean z10 = !aVar.f21910f;
                    aVar.f21910f = z10;
                    ((CheckBoxBase) z5Var.f22558e.f3688b).f(-1, z10, true);
                    w5 w5Var = z5Var.E;
                    if (w5Var != null) {
                        a aVar2 = z5Var.f22565y;
                        boolean z11 = aVar2.f21910f;
                        s3 s3Var = ((c3) w5Var).f21970a;
                        aVar2.f21910f = z11;
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
                z5 z5Var2 = this.f22257b;
                w5 w5Var2 = z5Var2.E;
                if (w5Var2 != null) {
                    a aVar3 = z5Var2.f22565y;
                    s3 s3Var2 = ((c3) w5Var2).f21970a;
                    if (aVar3 != null && (aVar3.f21907b instanceof TL_iv.pageBlockPreformatted) && (set = qi.j.f56187a.f56209y) != null) {
                        ArrayList arrayList = new ArrayList(set);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.f21907b;
                        y60 G0 = s3Var2.f22334p3.G0(view);
                        G0.X(n6.d0(org.telegram.messenger.g0.L(3.0f), n6.w0(n6.f29394d6, s3Var2.f22333o3)));
                        G0.f42347c0 = true;
                        G0.f42343a0 = org.telegram.messenger.g0.L(350.0f);
                        G0.i(new l2(s3Var2, aVar3, 25), gd.M0(2131753997, null), TextUtils.isEmpty(pageblockpreformatted.language));
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
                            G0.i(new kg.i0(s3Var2, aVar3, str, 16), cj.b(str), TextUtils.equals(str, pageblockpreformatted.language));
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
