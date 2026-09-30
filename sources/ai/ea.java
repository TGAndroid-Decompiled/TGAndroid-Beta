package ai;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.tr;
public final class ea {
    public final int f857a;
    public final qu f858b;
    public final s20 f859c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.h5 f860f;
    public final org.telegram.ui.Components.h5 f861g;

    public ea(View view) {
        qu quVar = new qu(1, view);
        this.f857a = UserConfig.selectedAccount;
        this.f858b = quVar;
        tr trVar = tr.h;
        this.f860f = new org.telegram.ui.Components.h5(quVar, 350L, trVar);
        this.f861g = new org.telegram.ui.Components.h5(quVar, 350L, trVar);
        s20 s20Var = new s20();
        this.f859c = s20Var;
        s20Var.f28172a = true;
        s20Var.f28173b = true;
        b(false);
        s20Var.f28174c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        s20Var.f28174c.setStyle(Paint.Style.STROKE);
        s20Var.f28174c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int a2 = this.f860f.a(this.d, false);
        int a10 = this.f861g.a(this.e, false);
        s20 s20Var = this.f859c;
        s20Var.d(a2, a10, 0, 0);
        s20Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return s20Var.f28174c;
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
        qu quVar = this.f858b;
        if (quVar != null) {
            quVar.run();
        }
    }
}
