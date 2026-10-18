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
public final class z7 {
    public final int f6201a;
    public final uu f6202b;
    public final x20 f6203c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.i5 f6204f;
    public final org.telegram.ui.Components.i5 f6205g;

    public z7(View view) {
        uu uuVar = new uu(1, view);
        this.f6201a = UserConfig.selectedAccount;
        this.f6202b = uuVar;
        bs bsVar = bs.h;
        this.f6204f = new org.telegram.ui.Components.i5(uuVar, 350L, bsVar);
        this.f6205g = new org.telegram.ui.Components.i5(uuVar, 350L, bsVar);
        x20 x20Var = new x20();
        this.f6203c = x20Var;
        x20Var.f32283a = true;
        x20Var.f32284b = true;
        b(false);
        x20Var.f32285c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        x20Var.f32285c.setStyle(Paint.Style.STROKE);
        x20Var.f32285c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int a2 = this.f6204f.a(this.d, false);
        int a10 = this.f6205g.a(this.e, false);
        x20 x20Var = this.f6203c;
        x20Var.d(a2, a10, 0, 0);
        x20Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return x20Var.f32285c;
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
            this.f6204f.a(i10, true);
            this.f6205g.a(i11, true);
        }
        uu uuVar = this.f6202b;
        if (uuVar != null) {
            uuVar.run();
        }
    }
}
