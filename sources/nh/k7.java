package nh;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p20;
public final class k7 {
    public final int f15543a;
    public final hu f15544b;
    public final p20 f15545c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.c5 f15546f;
    public final org.telegram.ui.Components.c5 f15547g;

    public k7(View view) {
        hu huVar = new hu(1, view);
        this.f15543a = UserConfig.selectedAccount;
        this.f15544b = huVar;
        nr nrVar = nr.h;
        this.f15546f = new org.telegram.ui.Components.c5(huVar, 350L, nrVar);
        this.f15547g = new org.telegram.ui.Components.c5(huVar, 350L, nrVar);
        p20 p20Var = new p20();
        this.f15545c = p20Var;
        p20Var.f27711a = true;
        p20Var.f27712b = true;
        b(false);
        p20Var.f27713c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        p20Var.f27713c.setStyle(Paint.Style.STROKE);
        p20Var.f27713c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int a2 = this.f15546f.a(this.d, false);
        int a10 = this.f15547g.a(this.e, false);
        p20 p20Var = this.f15545c;
        p20Var.d(a2, a10, 0, 0);
        p20Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return p20Var.f27713c;
    }

    public final void b(boolean z4) {
        d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ik, false), z4);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z4) {
        if (peerColor != null) {
            d(peerColor.getStoryColor1(org.telegram.ui.ActionBar.j6.I.q()), peerColor.getStoryColor2(org.telegram.ui.ActionBar.j6.I.q()), z4);
        } else {
            b(z4);
        }
    }

    public final void d(int i10, int i11, boolean z4) {
        this.d = i10;
        this.e = i11;
        if (!z4) {
            this.f15546f.a(i10, true);
            this.f15547g.a(i11, true);
        }
        hu huVar = this.f15544b;
        if (huVar != null) {
            huVar.run();
        }
    }
}
