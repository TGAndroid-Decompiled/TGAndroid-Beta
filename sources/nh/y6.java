package nh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class y6 extends View {
    public final a4 f16058a;
    public boolean f16059b;
    public final org.telegram.ui.Components.z5 f16060c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public org.telegram.ui.Components.l5 f16061f;
    public boolean h;
    public boolean f16062n;
    public boolean f16063r;
    public boolean f16064s;

    public y6(Context context, a4 a4Var) {
        super(context);
        this.f16060c = new org.telegram.ui.Components.z5(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.e = new ImageReceiver(this);
        this.h = true;
        this.f16058a = a4Var;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.e.onAttachedToWindow();
        this.f16064s = true;
        org.telegram.ui.Components.l5 l5Var = this.f16061f;
        if (l5Var != null) {
            l5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.e.onDetachedFromWindow();
        this.f16064s = false;
        org.telegram.ui.Components.l5 l5Var = this.f16061f;
        if (l5Var != null) {
            l5Var.o(this);
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: nh.y6.onDraw(android.graphics.Canvas):void");
    }

    public void setAllowDrawReaction(boolean z4) {
        if (this.h == z4) {
            return;
        }
        this.h = z4;
        invalidate();
    }

    public void setReaction(mg.q0 q0Var) {
        boolean z4;
        String str;
        String str2;
        if (q0Var != null && ((str2 = q0Var.f14095f) == null || !str2.equals("❤"))) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f16062n = z4;
        if (q0Var != null && (str = q0Var.f14095f) != null && str.equals("❤")) {
            this.f16059b = true;
        } else {
            this.f16059b = false;
        }
        org.telegram.ui.Components.l5 l5Var = this.f16061f;
        if (l5Var != null) {
            l5Var.o(this);
        }
        this.f16061f = null;
        if (q0Var != null) {
            if (q0Var.f14096g != 0) {
                org.telegram.ui.Components.l5 l5Var2 = new org.telegram.ui.Components.l5(3, UserConfig.selectedAccount, q0Var.f14096g);
                this.f16061f = l5Var2;
                if (this.f16064s) {
                    l5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(q0Var.f14095f);
                if (tL_availableReaction != null) {
                    this.d.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.j6.f19827a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
