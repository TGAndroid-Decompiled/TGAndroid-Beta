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
    public final int f22259a;
    public final z5 f22260b;

    public q5(z5 z5Var, int i7) {
        this.f22259a = i7;
        this.f22260b = z5Var;
    }

    @Override
    public final void onClick(View view) {
        Set set;
        switch (this.f22259a) {
            case 0:
                z5 z5Var = this.f22260b;
                a aVar = z5Var.f22568y;
                if (aVar != null && aVar.f21912e) {
                    boolean z10 = !aVar.f21913f;
                    aVar.f21913f = z10;
                    ((CheckBoxBase) z5Var.f22561e.f3723b).f(-1, z10, true);
                    w5 w5Var = z5Var.E;
                    if (w5Var != null) {
                        a aVar2 = z5Var.f22568y;
                        boolean z11 = aVar2.f21913f;
                        s3 s3Var = ((c3) w5Var).f21973a;
                        aVar2.f21913f = z11;
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
                z5 z5Var2 = this.f22260b;
                w5 w5Var2 = z5Var2.E;
                if (w5Var2 != null) {
                    a aVar3 = z5Var2.f22568y;
                    s3 s3Var2 = ((c3) w5Var2).f21973a;
                    if (aVar3 != null && (aVar3.f21910b instanceof TL_iv.pageBlockPreformatted) && (set = qi.j.f56187a.f56209y) != null) {
                        ArrayList arrayList = new ArrayList(set);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.f21910b;
                        y60 G0 = s3Var2.f22337p3.G0(view);
                        G0.X(n6.d0(org.telegram.messenger.g0.L(3.0f), n6.w0(n6.f29396d6, s3Var2.f22336o3)));
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
