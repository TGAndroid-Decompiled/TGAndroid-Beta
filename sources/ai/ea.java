package ai;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.q20;
import org.telegram.ui.Components.sr;
public final class ea {
    public final int f857a;
    public final pu f858b;
    public final q20 f859c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.h5 f860f;
    public final org.telegram.ui.Components.h5 f861g;

    public ea(View view) {
        pu puVar = new pu(1, view);
        this.f857a = UserConfig.selectedAccount;
        this.f858b = puVar;
        sr srVar = sr.h;
        this.f860f = new org.telegram.ui.Components.h5(puVar, 350L, srVar);
        this.f861g = new org.telegram.ui.Components.h5(puVar, 350L, srVar);
        q20 q20Var = new q20();
        this.f859c = q20Var;
        q20Var.f27556a = true;
        q20Var.f27557b = true;
        b(false);
        q20Var.f27558c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        q20Var.f27558c.setStyle(Paint.Style.STROKE);
        q20Var.f27558c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int a2 = this.f860f.a(this.d, false);
        int a10 = this.f861g.a(this.e, false);
        q20 q20Var = this.f859c;
        q20Var.d(a2, a10, 0, 0);
        q20Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return q20Var.f27558c;
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
        pu puVar = this.f858b;
        if (puVar != null) {
            puVar.run();
        }
    }
}
