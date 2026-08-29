package cg;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.bn0;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.qv0;
import org.telegram.ui.zq;
public final class x1 implements zk0 {
    public final int f3459a;
    public final int f3460b;
    public final org.telegram.ui.ActionBar.o2 f3461c;
    public final Object d;

    public x1(Object obj, int i10, org.telegram.ui.ActionBar.o2 o2Var, int i11) {
        this.f3459a = i11;
        this.d = obj;
        this.f3460b = i10;
        this.f3461c = o2Var;
    }

    @Override
    public final void c(int i10, View view) {
        kg.q0 q0Var;
        switch (this.f3459a) {
            case 0:
                f2 f2Var = (f2) this.d;
                if (view instanceof qv0) {
                    qv0 qv0Var = (qv0) view;
                    PremiumPreviewFragment.q0(this.f3460b, qv0Var.f41788f.f38243a);
                    f2Var.showDialog(new p1(this.f3461c, qv0Var.f41788f.f38243a, false));
                    return;
                }
                return;
            default:
                en0 en0Var = (en0) this.d;
                ArrayList arrayList = en0Var.f28122r;
                jh.e1 e1Var = en0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.f3460b).isPremium()) {
                        new p1(this.f3461c, 24, true).show();
                        return;
                    }
                    long j10 = ((bn0) arrayList.get(i10)).f27188a.h;
                    if (en0Var.h == j10) {
                        q0Var = null;
                    } else {
                        q0Var = ((bn0) arrayList.get(i10)).f27188a;
                    }
                    if (en0Var.f(q0Var)) {
                        for (int i11 = 0; i11 < e1Var.getChildCount(); i11++) {
                            if (e1Var.getChildAt(i11) == view) {
                                float f9 = 50.0f;
                                if (i11 <= 1) {
                                    if (i11 == 0) {
                                        f9 = 90.0f;
                                    }
                                    e1Var.v0(-AndroidUtilities.dp(f9), 0, null);
                                } else if (i11 >= e1Var.getChildCount() - 2) {
                                    if (i11 == e1Var.getChildCount() - 1) {
                                        f9 = 80.0f;
                                    }
                                    e1Var.v0(AndroidUtilities.dp(f9), 0, null);
                                }
                            }
                        }
                        e1Var.M(new zq(3));
                        if (en0Var.h == j10) {
                            en0Var.h = 0L;
                            return;
                        }
                        en0Var.h = j10;
                        ((dn0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
