package bi;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.pr;
public final class l9 {
    public final int f3319a;
    public final lu f3320b;
    public final o20 f3321c;
    public int d;
    public int f3322e;
    public final org.telegram.ui.Components.h5 f3323f;
    public final org.telegram.ui.Components.h5 f3324g;

    public l9(View view) {
        lu luVar = new lu(1, view);
        this.f3319a = UserConfig.selectedAccount;
        this.f3320b = luVar;
        pr prVar = pr.h;
        this.f3323f = new org.telegram.ui.Components.h5(luVar, 350L, prVar);
        this.f3324g = new org.telegram.ui.Components.h5(luVar, 350L, prVar);
        o20 o20Var = new o20();
        this.f3321c = o20Var;
        o20Var.f28955a = true;
        o20Var.f28956b = true;
        b(false);
        o20Var.f28957c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        o20Var.f28957c.setStyle(Paint.Style.STROKE);
        o20Var.f28957c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int a2 = this.f3323f.a(this.d, false);
        int a10 = this.f3324g.a(this.f3322e, false);
        o20 o20Var = this.f3321c;
        o20Var.d(a2, a10, 0, 0);
        o20Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return o20Var.f28957c;
    }

    public final void b(boolean z10) {
        d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ik, false), z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        if (peerColor != null) {
            d(peerColor.getStoryColor1(org.telegram.ui.ActionBar.j6.I.q()), peerColor.getStoryColor2(org.telegram.ui.ActionBar.j6.I.q()), z10);
        } else {
            b(z10);
        }
    }

    public final void d(int i10, int i11, boolean z10) {
        this.d = i10;
        this.f3322e = i11;
        if (!z10) {
            this.f3323f.a(i10, true);
            this.f3324g.a(i11, true);
        }
        lu luVar = this.f3320b;
        if (luVar != null) {
            luVar.run();
        }
    }
}
