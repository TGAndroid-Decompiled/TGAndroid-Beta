package nh;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.q20;
public final class k7 {
    public final int f15523a;
    public final gu f15524b;
    public final q20 f15525c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.c5 f15526f;
    public final org.telegram.ui.Components.c5 f15527g;

    public k7(View view) {
        gu guVar = new gu(1, view);
        this.f15523a = UserConfig.selectedAccount;
        this.f15524b = guVar;
        mr mrVar = mr.h;
        this.f15526f = new org.telegram.ui.Components.c5(guVar, 350L, mrVar);
        this.f15527g = new org.telegram.ui.Components.c5(guVar, 350L, mrVar);
        q20 q20Var = new q20();
        this.f15525c = q20Var;
        q20Var.f28048a = true;
        q20Var.f28049b = true;
        b(false);
        q20Var.f28050c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        q20Var.f28050c.setStyle(Paint.Style.STROKE);
        q20Var.f28050c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int a2 = this.f15526f.a(this.d, false);
        int a10 = this.f15527g.a(this.e, false);
        q20 q20Var = this.f15525c;
        q20Var.d(a2, a10, 0, 0);
        q20Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return q20Var.f28050c;
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
            this.f15526f.a(i10, true);
            this.f15527g.a(i11, true);
        }
        gu guVar = this.f15524b;
        if (guVar != null) {
            guVar.run();
        }
    }
}
