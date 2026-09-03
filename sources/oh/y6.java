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
    public final c4 f17958a;
    public boolean f17959b;
    public final org.telegram.ui.Components.z5 f17960c;
    public final ImageReceiver d;
    public final ImageReceiver f17961e;
    public org.telegram.ui.Components.l5 f17962f;
    public boolean h;
    public boolean f17963n;
    public boolean f17964r;
    public boolean f17965s;

    public y6(Context context, c4 c4Var) {
        super(context);
        this.f17960c = new org.telegram.ui.Components.z5(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.f17961e = new ImageReceiver(this);
        this.h = true;
        this.f17958a = c4Var;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.f17961e.onAttachedToWindow();
        this.f17965s = true;
        org.telegram.ui.Components.l5 l5Var = this.f17962f;
        if (l5Var != null) {
            l5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.f17961e.onDetachedFromWindow();
        this.f17965s = false;
        org.telegram.ui.Components.l5 l5Var = this.f17962f;
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
        if (q0Var != null && ((str2 = q0Var.f16180f) == null || !str2.equals("❤"))) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f17963n = z4;
        if (q0Var != null && (str = q0Var.f16180f) != null && str.equals("❤")) {
            this.f17959b = true;
        } else {
            this.f17959b = false;
        }
        org.telegram.ui.Components.l5 l5Var = this.f17962f;
        if (l5Var != null) {
            l5Var.o(this);
        }
        this.f17962f = null;
        if (q0Var != null) {
            if (q0Var.f16181g != 0) {
                org.telegram.ui.Components.l5 l5Var2 = new org.telegram.ui.Components.l5(3, UserConfig.selectedAccount, q0Var.f16181g);
                this.f17962f = l5Var2;
                if (this.f17965s) {
                    l5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(q0Var.f16180f);
                if (tL_availableReaction != null) {
                    this.d.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.k6.f21607a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
