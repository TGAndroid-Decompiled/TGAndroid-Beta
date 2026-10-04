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
    public final int f925a;
    public final qu f926b;
    public final s20 f927c;
    public int d;
    public int f928e;
    public final org.telegram.ui.Components.h5 f929f;
    public final org.telegram.ui.Components.h5 f930g;

    public ea(View view) {
        qu quVar = new qu(1, view);
        this.f925a = UserConfig.selectedAccount;
        this.f926b = quVar;
        tr trVar = tr.h;
        this.f929f = new org.telegram.ui.Components.h5(quVar, 350L, trVar);
        this.f930g = new org.telegram.ui.Components.h5(quVar, 350L, trVar);
        s20 s20Var = new s20();
        this.f927c = s20Var;
        s20Var.f30588a = true;
        s20Var.f30589b = true;
        b(false);
        s20Var.f30590c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        s20Var.f30590c.setStyle(Paint.Style.STROKE);
        s20Var.f30590c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int a2 = this.f929f.a(this.d, false);
        int a10 = this.f930g.a(this.f928e, false);
        s20 s20Var = this.f927c;
        s20Var.d(a2, a10, 0, 0);
        s20Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return s20Var.f30590c;
    }

    public final void b(boolean z10) {
        d(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.hk, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.ik, false), z10);
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
        this.f928e = i11;
        if (!z10) {
            this.f929f.a(i10, true);
            this.f930g.a(i11, true);
        }
        qu quVar = this.f926b;
        if (quVar != null) {
            quVar.run();
        }
    }
}
