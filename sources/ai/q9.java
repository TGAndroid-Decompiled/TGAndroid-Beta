package ai;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class q9 extends View {
    public final b6 f1438a;
    public boolean f1439b;
    public final org.telegram.ui.Components.e6 f1440c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public org.telegram.ui.Components.q5 f1441f;
    public boolean h;
    public boolean f1442n;
    public boolean f1443r;
    public boolean f1444s;

    public q9(Context context, b6 b6Var) {
        super(context);
        this.f1440c = new org.telegram.ui.Components.e6(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.e = new ImageReceiver(this);
        this.h = true;
        this.f1438a = b6Var;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.e.onAttachedToWindow();
        this.f1444s = true;
        org.telegram.ui.Components.q5 q5Var = this.f1441f;
        if (q5Var != null) {
            q5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.e.onDetachedFromWindow();
        this.f1444s = false;
        org.telegram.ui.Components.q5 q5Var = this.f1441f;
        if (q5Var != null) {
            q5Var.o(this);
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: ai.q9.onDraw(android.graphics.Canvas):void");
    }

    public void setAllowDrawReaction(boolean z10) {
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        invalidate();
    }

    public void setReaction(zg.o0 o0Var) {
        boolean z10;
        String str;
        String str2;
        if (o0Var != null && ((str2 = o0Var.f49504f) == null || !str2.equals("❤"))) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f1442n = z10;
        if (o0Var != null && (str = o0Var.f49504f) != null && str.equals("❤")) {
            this.f1439b = true;
        } else {
            this.f1439b = false;
        }
        org.telegram.ui.Components.q5 q5Var = this.f1441f;
        if (q5Var != null) {
            q5Var.o(this);
        }
        this.f1441f = null;
        if (o0Var != null) {
            if (o0Var.f49505g != 0) {
                org.telegram.ui.Components.q5 q5Var2 = new org.telegram.ui.Components.q5(3, UserConfig.selectedAccount, o0Var.f49505g);
                this.f1441f = q5Var2;
                if (this.f1444s) {
                    q5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(o0Var.f49504f);
                if (tL_availableReaction != null) {
                    this.d.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.h6.f19020a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
