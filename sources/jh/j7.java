package jh;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.xt;

public final class j7 {

    public final int f13557a;

    public final xt f13558b;

    public final c20 f13559c;
    public int d;

    public int f13560e;

    public final org.telegram.ui.Components.b5 f13561f;

    public final org.telegram.ui.Components.b5 f13562g;

    public j7(View view) {
        xt xtVar = new xt(1, view);
        this.f13557a = UserConfig.selectedAccount;
        this.f13558b = xtVar;
        er erVar = er.h;
        this.f13561f = new org.telegram.ui.Components.b5(xtVar, 350L, erVar);
        this.f13562g = new org.telegram.ui.Components.b5(xtVar, 350L, erVar);
        c20 c20Var = new c20();
        this.f13559c = c20Var;
        c20Var.f27290a = true;
        c20Var.f27291b = true;
        b(false);
        c20Var.f27292c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        c20Var.f27292c.setStyle(Paint.Style.STROKE);
        c20Var.f27292c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int iA = this.f13561f.a(this.d, false);
        int iA2 = this.f13562g.a(this.f13560e, false);
        c20 c20Var = this.f13559c;
        c20Var.d(iA, iA2, 0, 0);
        c20Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return c20Var.f27292c;
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
        this.f13560e = i11;
        if (!z10) {
            this.f13561f.a(i10, true);
            this.f13562g.a(i11, true);
        }
        xt xtVar = this.f13558b;
        if (xtVar != null) {
            xtVar.run();
        }
    }
}
