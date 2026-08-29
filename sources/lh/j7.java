package lh;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k20;
public final class j7 {
    public final int f15809a;
    public final eu f15810b;
    public final k20 f15811c;
    public int d;
    public int f15812e;
    public final org.telegram.ui.Components.f5 f15813f;
    public final org.telegram.ui.Components.f5 f15814g;

    public j7(View view) {
        eu euVar = new eu(1, view);
        this.f15809a = UserConfig.selectedAccount;
        this.f15810b = euVar;
        jr jrVar = jr.h;
        this.f15813f = new org.telegram.ui.Components.f5(euVar, 350L, jrVar);
        this.f15814g = new org.telegram.ui.Components.f5(euVar, 350L, jrVar);
        k20 k20Var = new k20();
        this.f15811c = k20Var;
        k20Var.f29891a = true;
        k20Var.f29892b = true;
        b(false);
        k20Var.f29893c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        k20Var.f29893c.setStyle(Paint.Style.STROKE);
        k20Var.f29893c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int a2 = this.f15813f.a(this.d, false);
        int a10 = this.f15814g.a(this.f15812e, false);
        k20 k20Var = this.f15811c;
        k20Var.d(a2, a10, 0, 0);
        k20Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return k20Var.f29893c;
    }

    public final void b(boolean z10) {
        d(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.hk, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ik, false), z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        if (peerColor != null) {
            d(peerColor.getStoryColor1(org.telegram.ui.ActionBar.g6.I.q()), peerColor.getStoryColor2(org.telegram.ui.ActionBar.g6.I.q()), z10);
        } else {
            b(z10);
        }
    }

    public final void d(int i10, int i11, boolean z10) {
        this.d = i10;
        this.f15812e = i11;
        if (!z10) {
            this.f15813f.a(i10, true);
            this.f15814g.a(i11, true);
        }
        eu euVar = this.f15810b;
        if (euVar != null) {
            euVar.run();
        }
    }
}
