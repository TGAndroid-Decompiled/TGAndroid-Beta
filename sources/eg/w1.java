package eg;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.ln0;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.on0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.fr;
import org.telegram.ui.zv0;
public final class w1 implements il0 {
    public final int f5573a;
    public final int f5574b;
    public final org.telegram.ui.ActionBar.p2 f5575c;
    public final Object d;

    public w1(Object obj, int i10, org.telegram.ui.ActionBar.p2 p2Var, int i11) {
        this.f5573a = i11;
        this.d = obj;
        this.f5574b = i10;
        this.f5575c = p2Var;
    }

    @Override
    public final void f(int i10, View view) {
        mg.q0 q0Var;
        switch (this.f5573a) {
            case 0:
                e2 e2Var = (e2) this.d;
                if (view instanceof zv0) {
                    zv0 zv0Var = (zv0) view;
                    PremiumPreviewFragment.q0(this.f5574b, zv0Var.f40870f.f37545a);
                    e2Var.showDialog(new o1(this.f5575c, zv0Var.f40870f.f37545a, false));
                    return;
                }
                return;
            default:
                on0 on0Var = (on0) this.d;
                ArrayList arrayList = on0Var.f27605r;
                lh.e1 e1Var = on0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!UserConfig.getInstance(this.f5574b).isPremium()) {
                        new o1(this.f5575c, 24, true).show();
                        return;
                    }
                    long j10 = ((ln0) arrayList.get(i10)).f26817a.h;
                    if (on0Var.h == j10) {
                        q0Var = null;
                    } else {
                        q0Var = ((ln0) arrayList.get(i10)).f26817a;
                    }
                    if (on0Var.f(q0Var)) {
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
                        e1Var.M(new fr(3));
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
