package eg;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.kn0;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.gw0;
import org.telegram.ui.hr;
public final class w1 implements hl0 {
    public final int f5562a;
    public final int f5563b;
    public final org.telegram.ui.ActionBar.p2 f5564c;
    public final Object d;

    public w1(Object obj, int i10, org.telegram.ui.ActionBar.p2 p2Var, int i11) {
        this.f5562a = i11;
        this.d = obj;
        this.f5563b = i10;
        this.f5564c = p2Var;
    }

    @Override
    public final void d(int i10, View view) {
        mg.q0 q0Var;
        switch (this.f5562a) {
            case 0:
                e2 e2Var = (e2) this.d;
                if (view instanceof gw0) {
                    gw0 gw0Var = (gw0) view;
                    PremiumPreviewFragment.q0(this.f5563b, gw0Var.f34523f.f39779a);
                    e2Var.showDialog(new o1(this.f5564c, gw0Var.f34523f.f39779a, false));
                    return;
                }
                return;
            default:
                nn0 nn0Var = (nn0) this.d;
                ArrayList arrayList = nn0Var.f27313r;
                lh.e1 e1Var = nn0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.f5563b).isPremium()) {
                        new o1(this.f5564c, 24, true).show();
                        return;
                    }
                    long j10 = ((kn0) arrayList.get(i10)).f26357a.h;
                    if (nn0Var.h == j10) {
                        q0Var = null;
                    } else {
                        q0Var = ((kn0) arrayList.get(i10)).f26357a;
                    }
                    if (nn0Var.f(q0Var)) {
                        for (int i11 = 0; i11 < e1Var.getChildCount(); i11++) {
                            if (e1Var.getChildAt(i11) == view) {
                                float f10 = 50.0f;
                                if (i11 <= 1) {
                                    if (i11 == 0) {
                                        f10 = 90.0f;
                                    }
                                    e1Var.v0(-AndroidUtilities.dp(f10), 0, null);
                                } else if (i11 >= e1Var.getChildCount() - 2) {
                                    if (i11 == e1Var.getChildCount() - 1) {
                                        f10 = 80.0f;
                                    }
                                    e1Var.v0(AndroidUtilities.dp(f10), 0, null);
                                }
                            }
                        }
                        e1Var.M(new hr(3));
                        if (nn0Var.h == j10) {
                            nn0Var.h = 0L;
                            return;
                        }
                        nn0Var.h = j10;
                        ((mn0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
