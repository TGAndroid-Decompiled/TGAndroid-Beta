package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class c9 extends View {
    public final n5 f2907a;
    public boolean f2908b;
    public final org.telegram.ui.Components.g6 f2909c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public org.telegram.ui.Components.s5 f2910f;
    public boolean h;
    public boolean f2911n;
    public boolean f2912r;
    public boolean f2913s;

    public c9(Context context, n5 n5Var) {
        super(context);
        this.f2909c = new org.telegram.ui.Components.g6(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.e = new ImageReceiver(this);
        this.h = true;
        this.f2907a = n5Var;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.e.onAttachedToWindow();
        this.f2913s = true;
        org.telegram.ui.Components.s5 s5Var = this.f2910f;
        if (s5Var != null) {
            s5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.e.onDetachedFromWindow();
        this.f2913s = false;
        org.telegram.ui.Components.s5 s5Var = this.f2910f;
        if (s5Var != null) {
            s5Var.o(this);
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: bi.c9.onDraw(android.graphics.Canvas):void");
    }

    public void setAllowDrawReaction(boolean z10) {
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        invalidate();
    }

    public void setReaction(ah.i1 i1Var) {
        boolean z10;
        String str;
        String str2;
        if (i1Var != null && ((str2 = i1Var.f779f) == null || !str2.equals("❤"))) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f2911n = z10;
        if (i1Var != null && (str = i1Var.f779f) != null && str.equals("❤")) {
            this.f2908b = true;
        } else {
            this.f2908b = false;
        }
        org.telegram.ui.Components.s5 s5Var = this.f2910f;
        if (s5Var != null) {
            s5Var.o(this);
        }
        this.f2910f = null;
        if (i1Var != null) {
            if (i1Var.f780g != 0) {
                org.telegram.ui.Components.s5 s5Var2 = new org.telegram.ui.Components.s5(3, UserConfig.selectedAccount, i1Var.f780g);
                this.f2910f = s5Var2;
                if (this.f2913s) {
                    s5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(i1Var.f779f);
                if (tL_availableReaction != null) {
                    this.d.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.g6.f19843a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
