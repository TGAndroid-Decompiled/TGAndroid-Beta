package fg;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.bw0;
import org.telegram.ui.gr;
public final class v1 implements jl0 {
    public final int f6606a;
    public final int f6607b;
    public final org.telegram.ui.ActionBar.p2 f6608c;
    public final Object d;

    public v1(Object obj, int i10, org.telegram.ui.ActionBar.p2 p2Var, int i11) {
        this.f6606a = i11;
        this.d = obj;
        this.f6607b = i10;
        this.f6608c = p2Var;
    }

    @Override
    public final void f(int i10, View view) {
        ng.q0 q0Var;
        switch (this.f6606a) {
            case 0:
                d2 d2Var = (d2) this.d;
                if (view instanceof bw0) {
                    bw0 bw0Var = (bw0) view;
                    PremiumPreviewFragment.q0(this.f6607b, bw0Var.f35608f.f41056a);
                    d2Var.showDialog(new n1(this.f6608c, bw0Var.f35608f.f41056a, false));
                    return;
                }
                return;
            default:
                pn0 pn0Var = (pn0) this.d;
                ArrayList arrayList = pn0Var.f30134r;
                mh.d1 d1Var = pn0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.f6607b).isPremium()) {
                        new n1(this.f6608c, 24, true).show();
                        return;
                    }
                    long j10 = ((mn0) arrayList.get(i10)).f29156a.h;
                    if (pn0Var.h == j10) {
                        q0Var = null;
                    } else {
                        q0Var = ((mn0) arrayList.get(i10)).f29156a;
                    }
                    if (pn0Var.f(q0Var)) {
                        for (int i11 = 0; i11 < d1Var.getChildCount(); i11++) {
                            if (d1Var.getChildAt(i11) == view) {
                                float f10 = 50.0f;
                                if (i11 <= 1) {
                                    if (i11 == 0) {
                                        f10 = 90.0f;
                                    }
                                    d1Var.v0(-AndroidUtilities.dp(f10), 0, null);
                                } else if (i11 >= d1Var.getChildCount() - 2) {
                                    if (i11 == d1Var.getChildCount() - 1) {
                                        f10 = 80.0f;
                                    }
                                    d1Var.v0(AndroidUtilities.dp(f10), 0, null);
                                }
                            }
                        }
                        d1Var.M(new gr(3));
                        if (pn0Var.h == j10) {
                            pn0Var.h = 0L;
                            return;
                        }
                        pn0Var.h = j10;
                        ((on0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
