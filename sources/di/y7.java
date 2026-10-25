package di;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.z20;
public final class y7 {
    public final int f9406a;
    public final vu f9407b;
    public final z20 f9408c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.j5 f9409f;
    public final org.telegram.ui.Components.j5 f9410g;
    public boolean h;
    public MessagesController.PeerColor f9411i;
    public int f9412j;

    public y7(View view) {
        vu vuVar = new vu(1, view);
        this.f9406a = UserConfig.selectedAccount;
        this.f9407b = vuVar;
        ds dsVar = ds.h;
        this.f9409f = new org.telegram.ui.Components.j5(vuVar, 350L, dsVar);
        this.f9410g = new org.telegram.ui.Components.j5(vuVar, 350L, dsVar);
        z20 z20Var = new z20();
        this.f9408c = z20Var;
        z20Var.f35182a = true;
        z20Var.f35183b = true;
        b(false);
        z20Var.f35184c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        z20Var.f35184c.setStyle(Paint.Style.STROKE);
        z20Var.f35184c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int storyColor1;
        int storyColor2;
        int i10 = this.f9412j;
        int i11 = org.telegram.ui.ActionBar.f7.f22626b;
        org.telegram.ui.Components.j5 j5Var = this.f9410g;
        org.telegram.ui.Components.j5 j5Var2 = this.f9409f;
        if (i10 != i11) {
            this.f9412j = i11;
            try {
                if (this.h) {
                    storyColor1 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.hk, false);
                    storyColor2 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.ik, false);
                } else {
                    MessagesController.PeerColor peerColor = this.f9411i;
                    if (peerColor != null) {
                        storyColor1 = peerColor.getStoryColor1(org.telegram.ui.ActionBar.y6.I.q());
                        storyColor2 = this.f9411i.getStoryColor2(org.telegram.ui.ActionBar.y6.I.q());
                    }
                }
                if (storyColor1 != this.d || storyColor2 != this.e) {
                    this.d = storyColor1;
                    this.e = storyColor2;
                    j5Var2.a(storyColor1, true);
                    j5Var.a(storyColor2, true);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        int a2 = j5Var2.a(this.d, false);
        int a10 = j5Var.a(this.e, false);
        z20 z20Var = this.f9408c;
        z20Var.d(a2, a10, 0, 0);
        z20Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return z20Var.f35184c;
    }

    public final void b(boolean z10) {
        this.h = true;
        this.f9411i = null;
        this.f9412j = org.telegram.ui.ActionBar.f7.f22626b;
        d(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.hk, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.ik, false), z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        this.f9411i = peerColor;
        this.f9412j = org.telegram.ui.ActionBar.f7.f22626b;
        if (peerColor != null) {
            this.h = false;
            d(peerColor.getStoryColor1(org.telegram.ui.ActionBar.y6.I.q()), peerColor.getStoryColor2(org.telegram.ui.ActionBar.y6.I.q()), z10);
            return;
        }
        b(z10);
    }

    public final void d(int i10, int i11, boolean z10) {
        this.d = i10;
        this.e = i11;
        if (!z10) {
            this.f9409f.a(i10, true);
            this.f9410g.a(i11, true);
        }
        vu vuVar = this.f9407b;
        if (vuVar != null) {
            vuVar.run();
        }
    }
}
