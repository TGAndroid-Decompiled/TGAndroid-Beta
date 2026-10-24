package ci;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.su;
import org.telegram.ui.Components.v20;
import org.telegram.ui.Components.zr;
public final class z7 {
    public final int f6210a;
    public final su f6211b;
    public final v20 f6212c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.g5 f6213f;
    public final org.telegram.ui.Components.g5 f6214g;
    public boolean h;
    public MessagesController.PeerColor f6215i;
    public int f6216j;

    public z7(View view) {
        su suVar = new su(1, view);
        this.f6210a = UserConfig.selectedAccount;
        this.f6211b = suVar;
        zr zrVar = zr.h;
        this.f6213f = new org.telegram.ui.Components.g5(suVar, 350L, zrVar);
        this.f6214g = new org.telegram.ui.Components.g5(suVar, 350L, zrVar);
        v20 v20Var = new v20();
        this.f6212c = v20Var;
        v20Var.f31268a = true;
        v20Var.f31269b = true;
        b(false);
        v20Var.f31270c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        v20Var.f31270c.setStyle(Paint.Style.STROKE);
        v20Var.f31270c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int storyColor1;
        int storyColor2;
        int i10 = this.f6216j;
        int i11 = org.telegram.ui.ActionBar.r6.f21818b;
        org.telegram.ui.Components.g5 g5Var = this.f6214g;
        org.telegram.ui.Components.g5 g5Var2 = this.f6213f;
        if (i10 != i11) {
            this.f6216j = i11;
            try {
                if (this.h) {
                    storyColor1 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.hk, false);
                    storyColor2 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ik, false);
                } else {
                    MessagesController.PeerColor peerColor = this.f6215i;
                    if (peerColor != null) {
                        storyColor1 = peerColor.getStoryColor1(org.telegram.ui.ActionBar.k6.I.q());
                        storyColor2 = this.f6215i.getStoryColor2(org.telegram.ui.ActionBar.k6.I.q());
                    }
                }
                if (storyColor1 != this.d || storyColor2 != this.e) {
                    this.d = storyColor1;
                    this.e = storyColor2;
                    g5Var2.a(storyColor1, true);
                    g5Var.a(storyColor2, true);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        int a2 = g5Var2.a(this.d, false);
        int a10 = g5Var.a(this.e, false);
        v20 v20Var = this.f6212c;
        v20Var.d(a2, a10, 0, 0);
        v20Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return v20Var.f31270c;
    }

    public final void b(boolean z10) {
        this.h = true;
        this.f6215i = null;
        this.f6216j = org.telegram.ui.ActionBar.r6.f21818b;
        d(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.hk, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ik, false), z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        this.f6215i = peerColor;
        this.f6216j = org.telegram.ui.ActionBar.r6.f21818b;
        if (peerColor != null) {
            this.h = false;
            d(peerColor.getStoryColor1(org.telegram.ui.ActionBar.k6.I.q()), peerColor.getStoryColor2(org.telegram.ui.ActionBar.k6.I.q()), z10);
            return;
        }
        b(z10);
    }

    public final void d(int i10, int i11, boolean z10) {
        this.d = i10;
        this.e = i11;
        if (!z10) {
            this.f6213f.a(i10, true);
            this.f6214g.a(i11, true);
        }
        su suVar = this.f6211b;
        if (suVar != null) {
            suVar.run();
        }
    }
}
