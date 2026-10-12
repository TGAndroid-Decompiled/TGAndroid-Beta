package ai;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.gv;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.js;
public final class fa {
    public final int f1034a;
    public final gv f1035b;
    public final i30 f1036c;
    public int d;
    public int f1037e;
    public final org.telegram.ui.Components.j5 f1038f;
    public final org.telegram.ui.Components.j5 f1039g;

    public fa(View view) {
        gv gvVar = new gv(1, view);
        this.f1034a = UserConfig.selectedAccount;
        this.f1035b = gvVar;
        js jsVar = js.h;
        this.f1038f = new org.telegram.ui.Components.j5(gvVar, 350L, jsVar);
        this.f1039g = new org.telegram.ui.Components.j5(gvVar, 350L, jsVar);
        i30 i30Var = new i30();
        this.f1036c = i30Var;
        i30Var.f27031a = true;
        i30Var.f27032b = true;
        b(false);
        i30Var.f27033c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        i30Var.f27033c.setStyle(Paint.Style.STROKE);
        i30Var.f27033c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int a2 = this.f1038f.a(this.d, false);
        int a10 = this.f1039g.a(this.f1037e, false);
        i30 i30Var = this.f1036c;
        i30Var.d(a2, a10, 0, 0);
        i30Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return i30Var.f27033c;
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
        this.f1037e = i11;
        if (!z10) {
            this.f1038f.a(i10, true);
            this.f1039g.a(i11, true);
        }
        gv gvVar = this.f1035b;
        if (gvVar != null) {
            gvVar.run();
        }
    }
}
