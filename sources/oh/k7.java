package oh;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q20;
public final class k7 {
    public final int f17366a;
    public final ju f17367b;
    public final q20 f17368c;
    public int d;
    public int f17369e;
    public final org.telegram.ui.Components.c5 f17370f;
    public final org.telegram.ui.Components.c5 f17371g;

    public k7(View view) {
        ju juVar = new ju(1, view);
        this.f17366a = UserConfig.selectedAccount;
        this.f17367b = juVar;
        pr prVar = pr.h;
        this.f17370f = new org.telegram.ui.Components.c5(juVar, 350L, prVar);
        this.f17371g = new org.telegram.ui.Components.c5(juVar, 350L, prVar);
        q20 q20Var = new q20();
        this.f17368c = q20Var;
        q20Var.f30252a = true;
        q20Var.f30253b = true;
        b(false);
        q20Var.f30254c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        q20Var.f30254c.setStyle(Paint.Style.STROKE);
        q20Var.f30254c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int a2 = this.f17370f.a(this.d, false);
        int a10 = this.f17371g.a(this.f17369e, false);
        q20 q20Var = this.f17368c;
        q20Var.d(a2, a10, 0, 0);
        q20Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return q20Var.f30254c;
    }

    public final void b(boolean z4) {
        d(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.hk, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.ik, false), z4);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z4) {
        if (peerColor != null) {
            d(peerColor.getStoryColor1(org.telegram.ui.ActionBar.k6.I.q()), peerColor.getStoryColor2(org.telegram.ui.ActionBar.k6.I.q()), z4);
        } else {
            b(z4);
        }
    }

    public final void d(int i10, int i11, boolean z4) {
        this.d = i10;
        this.f17369e = i11;
        if (!z4) {
            this.f17370f.a(i10, true);
            this.f17371g.a(i11, true);
        }
        ju juVar = this.f17367b;
        if (juVar != null) {
            juVar.run();
        }
    }
}
