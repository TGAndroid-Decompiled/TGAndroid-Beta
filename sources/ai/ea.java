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
    public final int f776a;
    public final nu f777b;
    public final o20 f778c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.f5 f779f;
    public final org.telegram.ui.Components.f5 f780g;

    public ea(View view) {
        nu nuVar = new nu(1, view);
        this.f776a = UserConfig.selectedAccount;
        this.f777b = nuVar;
        qr qrVar = qr.h;
        this.f779f = new org.telegram.ui.Components.f5(nuVar, 350L, qrVar);
        this.f780g = new org.telegram.ui.Components.f5(nuVar, 350L, qrVar);
        o20 o20Var = new o20();
        this.f778c = o20Var;
        o20Var.f26603a = true;
        o20Var.f26604b = true;
        b(false);
        o20Var.f26605c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        o20Var.f26605c.setStyle(Paint.Style.STROKE);
        o20Var.f26605c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int a2 = this.f779f.a(this.d, false);
        int a10 = this.f780g.a(this.e, false);
        o20 o20Var = this.f778c;
        o20Var.d(a2, a10, 0, 0);
        o20Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return o20Var.f26605c;
    }

    public final void b(boolean z10) {
        d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ik, false), z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        if (peerColor != null) {
            d(peerColor.getStoryColor1(org.telegram.ui.ActionBar.j6.I.q()), peerColor.getStoryColor2(org.telegram.ui.ActionBar.j6.I.q()), z10);
        } else {
            b(z10);
        }
    }

    public final void d(int i10, int i11, boolean z10) {
        this.d = i10;
        this.e = i11;
        if (!z10) {
            this.f779f.a(i10, true);
            this.f780g.a(i11, true);
        }
        nu nuVar = this.f777b;
        if (nuVar != null) {
            nuVar.run();
        }
    }
}
