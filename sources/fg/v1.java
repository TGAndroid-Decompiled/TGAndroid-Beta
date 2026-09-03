package fg;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.on0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.gr;
import org.telegram.ui.gw0;
public final class v1 implements il0 {
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
                if (view instanceof gw0) {
                    gw0 gw0Var = (gw0) view;
                    PremiumPreviewFragment.q0(this.f6607b, gw0Var.f37177f.f42867a);
                    d2Var.showDialog(new n1(this.f6608c, gw0Var.f37177f.f42867a, false));
                    return;
                }
                return;
            default:
                on0 on0Var = (on0) this.d;
                ArrayList arrayList = on0Var.f29830r;
                mh.d1 d1Var = on0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.f6607b).isPremium()) {
                        new n1(this.f6608c, 24, true).show();
                        return;
                    }
                    long j10 = ((ln0) arrayList.get(i10)).f28810a.h;
                    if (on0Var.h == j10) {
                        q0Var = null;
                    } else {
                        q0Var = ((ln0) arrayList.get(i10)).f28810a;
                    }
                    if (on0Var.f(q0Var)) {
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
                        if (on0Var.h == j10) {
                            on0Var.h = 0L;
                            return;
                        }
                        on0Var.h = j10;
                        ((nn0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
