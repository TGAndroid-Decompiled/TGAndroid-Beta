package ci;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.uu;
import org.telegram.ui.Components.x20;
public final class a8 {
    public final int f5166a;
    public final uu f5167b;
    public final x20 f5168c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.i5 f5169f;
    public final org.telegram.ui.Components.i5 f5170g;

    public a8(View view) {
        uu uuVar = new uu(1, view);
        this.f5166a = UserConfig.selectedAccount;
        this.f5167b = uuVar;
        bs bsVar = bs.h;
        this.f5169f = new org.telegram.ui.Components.i5(uuVar, 350L, bsVar);
        this.f5170g = new org.telegram.ui.Components.i5(uuVar, 350L, bsVar);
        x20 x20Var = new x20();
        this.f5168c = x20Var;
        x20Var.f32312a = true;
        x20Var.f32313b = true;
        b(false);
        x20Var.f32314c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        x20Var.f32314c.setStyle(Paint.Style.STROKE);
        x20Var.f32314c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int a2 = this.f5169f.a(this.d, false);
        int a10 = this.f5170g.a(this.e, false);
        x20 x20Var = this.f5168c;
        x20Var.d(a2, a10, 0, 0);
        x20Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return x20Var.f32314c;
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
        this.e = i11;
        if (!z10) {
            this.f5169f.a(i10, true);
            this.f5170g.a(i11, true);
        }
        uu uuVar = this.f5167b;
        if (uuVar != null) {
            uuVar.run();
        }
    }
}
