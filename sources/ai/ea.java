package ai;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.qr;
public final class ea {
    public final int f771a;
    public final nu f772b;
    public final o20 f773c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.f5 f774f;
    public final org.telegram.ui.Components.f5 f775g;

    public ea(View view) {
        nu nuVar = new nu(1, view);
        this.f771a = UserConfig.selectedAccount;
        this.f772b = nuVar;
        qr qrVar = qr.h;
        this.f774f = new org.telegram.ui.Components.f5(nuVar, 350L, qrVar);
        this.f775g = new org.telegram.ui.Components.f5(nuVar, 350L, qrVar);
        o20 o20Var = new o20();
        this.f773c = o20Var;
        o20Var.f26658a = true;
        o20Var.f26659b = true;
        b(false);
        o20Var.f26660c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        o20Var.f26660c.setStyle(Paint.Style.STROKE);
        o20Var.f26660c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int a2 = this.f774f.a(this.d, false);
        int a10 = this.f775g.a(this.e, false);
        o20 o20Var = this.f773c;
        o20Var.d(a2, a10, 0, 0);
        o20Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return o20Var.f26660c;
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
        this.e = i11;
        if (!z10) {
            this.f774f.a(i10, true);
            this.f775g.a(i11, true);
        }
        nu nuVar = this.f772b;
        if (nuVar != null) {
            nuVar.run();
        }
    }
}
