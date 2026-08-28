package ih;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.yt;
import org.telegram.ui.Components.z10;
public final class n7 {
    public final int f11868a;
    public final yt f11869b;
    public final z10 f11870c;
    public int d;
    public int f11871e;
    public final org.telegram.ui.Components.b5 f11872f;
    public final org.telegram.ui.Components.b5 f11873g;

    public n7(View view) {
        yt ytVar = new yt(1, view);
        this.f11868a = UserConfig.selectedAccount;
        this.f11869b = ytVar;
        gr grVar = gr.h;
        this.f11872f = new org.telegram.ui.Components.b5(ytVar, 350L, grVar);
        this.f11873g = new org.telegram.ui.Components.b5(ytVar, 350L, grVar);
        z10 z10Var = new z10();
        this.f11870c = z10Var;
        z10Var.f35153a = true;
        z10Var.f35154b = true;
        b(false);
        z10Var.f35155c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        z10Var.f35155c.setStyle(Paint.Style.STROKE);
        z10Var.f35155c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int a2 = this.f11872f.a(this.d, false);
        int a3 = this.f11873g.a(this.f11871e, false);
        z10 z10Var = this.f11870c;
        z10Var.d(a2, a3, 0, 0);
        z10Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return z10Var.f35155c;
    }

    public final void b(boolean z10) {
        d(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.hk, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ik, false), z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        if (peerColor != null) {
            d(peerColor.getStoryColor1(org.telegram.ui.ActionBar.f6.I.q()), peerColor.getStoryColor2(org.telegram.ui.ActionBar.f6.I.q()), z10);
        } else {
            b(z10);
        }
    }

    public final void d(int i9, int i10, boolean z10) {
        this.d = i9;
        this.f11871e = i10;
        if (!z10) {
            this.f11872f.a(i9, true);
            this.f11873g.a(i10, true);
        }
        yt ytVar = this.f11869b;
        if (ytVar != null) {
            ytVar.run();
        }
    }
}
