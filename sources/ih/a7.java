package ih;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class a7 extends View {
    public final f4 f11223a;
    public boolean f11224b;
    public final org.telegram.ui.Components.y5 f11225c;
    public final ImageReceiver d;
    public final ImageReceiver f11226e;
    public org.telegram.ui.Components.k5 f11227f;
    public boolean h;
    public boolean f11228n;
    public boolean f11229r;
    public boolean f11230s;

    public a7(Context context, f4 f4Var) {
        super(context);
        this.f11225c = new org.telegram.ui.Components.y5(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.f11226e = new ImageReceiver(this);
        this.h = true;
        this.f11223a = f4Var;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.f11226e.onAttachedToWindow();
        this.f11230s = true;
        org.telegram.ui.Components.k5 k5Var = this.f11227f;
        if (k5Var != null) {
            k5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.f11226e.onDetachedFromWindow();
        this.f11230s = false;
        org.telegram.ui.Components.k5 k5Var = this.f11227f;
        if (k5Var != null) {
            k5Var.o(this);
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: ih.a7.onDraw(android.graphics.Canvas):void");
    }

    public void setAllowDrawReaction(boolean z10) {
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        invalidate();
    }

    public void setReaction(hg.r0 r0Var) {
        boolean z10;
        String str;
        String str2;
        if (r0Var != null && ((str2 = r0Var.f10717f) == null || !str2.equals("❤"))) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f11228n = z10;
        if (r0Var != null && (str = r0Var.f10717f) != null && str.equals("❤")) {
            this.f11224b = true;
        } else {
            this.f11224b = false;
        }
        org.telegram.ui.Components.k5 k5Var = this.f11227f;
        if (k5Var != null) {
            k5Var.o(this);
        }
        this.f11227f = null;
        if (r0Var != null) {
            if (r0Var.f10718g != 0) {
                org.telegram.ui.Components.k5 k5Var2 = new org.telegram.ui.Components.k5(3, UserConfig.selectedAccount, r0Var.f10718g);
                this.f11227f = k5Var2;
                if (this.f11230s) {
                    k5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(r0Var.f10717f);
                if (tL_availableReaction != null) {
                    this.d.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.f6.f22947a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
