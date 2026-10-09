package ai;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.hs;
public final class fa {
    public final int f1036a;
    public final dv f1037b;
    public final f30 f1038c;
    public int d;
    public int f1039e;
    public final org.telegram.ui.Components.j5 f1040f;
    public final org.telegram.ui.Components.j5 f1041g;

    public fa(View view) {
        dv dvVar = new dv(1, view);
        this.f1036a = UserConfig.selectedAccount;
        this.f1037b = dvVar;
        hs hsVar = hs.h;
        this.f1040f = new org.telegram.ui.Components.j5(dvVar, 350L, hsVar);
        this.f1041g = new org.telegram.ui.Components.j5(dvVar, 350L, hsVar);
        f30 f30Var = new f30();
        this.f1038c = f30Var;
        f30Var.f26223a = true;
        f30Var.f26224b = true;
        b(false);
        f30Var.f26225c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        f30Var.f26225c.setStyle(Paint.Style.STROKE);
        f30Var.f26225c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int a2 = this.f1040f.a(this.d, false);
        int a10 = this.f1041g.a(this.f1039e, false);
        f30 f30Var = this.f1038c;
        f30Var.d(a2, a10, 0, 0);
        f30Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return f30Var.f26225c;
    }

    public final void b(boolean z10) {
        d(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.hk, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.ik, false), z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        if (peerColor != null) {
            d(peerColor.getStoryColor1(org.telegram.ui.ActionBar.i6.I.q()), peerColor.getStoryColor2(org.telegram.ui.ActionBar.i6.I.q()), z10);
        } else {
            b(z10);
        }
    }

    public final void d(int i10, int i11, boolean z10) {
        this.d = i10;
        this.f1039e = i11;
        if (!z10) {
            this.f1040f.a(i10, true);
            this.f1041g.a(i11, true);
        }
        dv dvVar = this.f1037b;
        if (dvVar != null) {
            dvVar.run();
        }
    }
}
