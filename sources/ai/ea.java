package ai;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.rr;
public final class ea {
    public final int f857a;
    public final ou f858b;
    public final p20 f859c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.h5 f860f;
    public final org.telegram.ui.Components.h5 f861g;

    public ea(View view) {
        ou ouVar = new ou(1, view);
        this.f857a = UserConfig.selectedAccount;
        this.f858b = ouVar;
        rr rrVar = rr.h;
        this.f860f = new org.telegram.ui.Components.h5(ouVar, 350L, rrVar);
        this.f861g = new org.telegram.ui.Components.h5(ouVar, 350L, rrVar);
        p20 p20Var = new p20();
        this.f859c = p20Var;
        p20Var.f26910a = true;
        p20Var.f26911b = true;
        b(false);
        p20Var.f26912c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        p20Var.f26912c.setStyle(Paint.Style.STROKE);
        p20Var.f26912c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int a2 = this.f860f.a(this.d, false);
        int a10 = this.f861g.a(this.e, false);
        p20 p20Var = this.f859c;
        p20Var.d(a2, a10, 0, 0);
        p20Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return p20Var.f26912c;
    }

    public final void b(boolean z10) {
        d(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.hk, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.ik, false), z10);
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
        this.e = i11;
        if (!z10) {
            this.f860f.a(i10, true);
            this.f861g.a(i11, true);
        }
        ou ouVar = this.f858b;
        if (ouVar != null) {
            ouVar.run();
        }
    }
}
