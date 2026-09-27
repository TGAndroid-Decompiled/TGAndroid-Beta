package ai;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.r20;
import org.telegram.ui.Components.sr;
public final class ea {
    public final int f860a;
    public final pu f861b;
    public final r20 f862c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.h5 f863f;
    public final org.telegram.ui.Components.h5 f864g;

    public ea(View view) {
        pu puVar = new pu(1, view);
        this.f860a = UserConfig.selectedAccount;
        this.f861b = puVar;
        sr srVar = sr.h;
        this.f863f = new org.telegram.ui.Components.h5(puVar, 350L, srVar);
        this.f864g = new org.telegram.ui.Components.h5(puVar, 350L, srVar);
        r20 r20Var = new r20();
        this.f862c = r20Var;
        r20Var.f27882a = true;
        r20Var.f27883b = true;
        b(false);
        r20Var.f27884c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        r20Var.f27884c.setStyle(Paint.Style.STROKE);
        r20Var.f27884c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int a2 = this.f863f.a(this.d, false);
        int a10 = this.f864g.a(this.e, false);
        r20 r20Var = this.f862c;
        r20Var.d(a2, a10, 0, 0);
        r20Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return r20Var.f27884c;
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
            this.f863f.a(i10, true);
            this.f864g.a(i11, true);
        }
        pu puVar = this.f861b;
        if (puVar != null) {
            puVar.run();
        }
    }
}
