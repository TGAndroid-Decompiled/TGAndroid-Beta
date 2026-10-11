package ai;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ev;
import org.telegram.ui.Components.g30;
import org.telegram.ui.Components.is;
public final class fa {
    public final int f1036a;
    public final ev f1037b;
    public final g30 f1038c;
    public int d;
    public int f1039e;
    public final org.telegram.ui.Components.j5 f1040f;
    public final org.telegram.ui.Components.j5 f1041g;

    public fa(View view) {
        ev evVar = new ev(1, view);
        this.f1036a = UserConfig.selectedAccount;
        this.f1037b = evVar;
        is isVar = is.h;
        this.f1040f = new org.telegram.ui.Components.j5(evVar, 350L, isVar);
        this.f1041g = new org.telegram.ui.Components.j5(evVar, 350L, isVar);
        g30 g30Var = new g30();
        this.f1038c = g30Var;
        g30Var.f26638a = true;
        g30Var.f26639b = true;
        b(false);
        g30Var.f26640c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        g30Var.f26640c.setStyle(Paint.Style.STROKE);
        g30Var.f26640c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int a2 = this.f1040f.a(this.d, false);
        int a10 = this.f1041g.a(this.f1039e, false);
        g30 g30Var = this.f1038c;
        g30Var.d(a2, a10, 0, 0);
        g30Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return g30Var.f26640c;
    }

    public final void b(boolean z10) {
        d(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.hk, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.ik, false), z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        if (peerColor != null) {
            d(peerColor.getStoryColor1(org.telegram.ui.ActionBar.h6.I.q()), peerColor.getStoryColor2(org.telegram.ui.ActionBar.h6.I.q()), z10);
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
        ev evVar = this.f1037b;
        if (evVar != null) {
            evVar.run();
        }
    }
}
