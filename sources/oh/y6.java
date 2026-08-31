package oh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class y6 extends View {
    public final c4 f17956a;
    public boolean f17957b;
    public final org.telegram.ui.Components.z5 f17958c;
    public final ImageReceiver d;
    public final ImageReceiver f17959e;
    public org.telegram.ui.Components.l5 f17960f;
    public boolean h;
    public boolean f17961n;
    public boolean f17962r;
    public boolean f17963s;

    public y6(Context context, c4 c4Var) {
        super(context);
        this.f17958c = new org.telegram.ui.Components.z5(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.f17959e = new ImageReceiver(this);
        this.h = true;
        this.f17956a = c4Var;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.f17959e.onAttachedToWindow();
        this.f17963s = true;
        org.telegram.ui.Components.l5 l5Var = this.f17960f;
        if (l5Var != null) {
            l5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.f17959e.onDetachedFromWindow();
        this.f17963s = false;
        org.telegram.ui.Components.l5 l5Var = this.f17960f;
        if (l5Var != null) {
            l5Var.o(this);
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: oh.y6.onDraw(android.graphics.Canvas):void");
    }

    public void setAllowDrawReaction(boolean z4) {
        if (this.h == z4) {
            return;
        }
        this.h = z4;
        invalidate();
    }

    public void setReaction(ng.q0 q0Var) {
        boolean z4;
        String str;
        String str2;
        if (q0Var != null && ((str2 = q0Var.f16178f) == null || !str2.equals("❤"))) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f17961n = z4;
        if (q0Var != null && (str = q0Var.f16178f) != null && str.equals("❤")) {
            this.f17957b = true;
        } else {
            this.f17957b = false;
        }
        org.telegram.ui.Components.l5 l5Var = this.f17960f;
        if (l5Var != null) {
            l5Var.o(this);
        }
        this.f17960f = null;
        if (q0Var != null) {
            if (q0Var.f16179g != 0) {
                org.telegram.ui.Components.l5 l5Var2 = new org.telegram.ui.Components.l5(3, UserConfig.selectedAccount, q0Var.f16179g);
                this.f17960f = l5Var2;
                if (this.f17963s) {
                    l5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(q0Var.f16178f);
                if (tL_availableReaction != null) {
                    this.d.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.k6.f21605a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
