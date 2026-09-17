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
    public final c6 f1435a;
    public boolean f1436b;
    public final org.telegram.ui.Components.c6 f1437c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public org.telegram.ui.Components.o5 f1438f;
    public boolean h;
    public boolean f1439n;
    public boolean f1440r;
    public boolean f1441s;

    public q9(Context context, c6 c6Var) {
        super(context);
        this.f1437c = new org.telegram.ui.Components.c6(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.e = new ImageReceiver(this);
        this.h = true;
        this.f1435a = c6Var;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.e.onAttachedToWindow();
        this.f1441s = true;
        org.telegram.ui.Components.o5 o5Var = this.f1438f;
        if (o5Var != null) {
            o5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.e.onDetachedFromWindow();
        this.f1441s = false;
        org.telegram.ui.Components.o5 o5Var = this.f1438f;
        if (o5Var != null) {
            o5Var.o(this);
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

    public void setReaction(zg.p0 p0Var) {
        boolean z10;
        String str;
        String str2;
        if (p0Var != null && ((str2 = p0Var.f49150f) == null || !str2.equals("❤"))) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f1439n = z10;
        if (p0Var != null && (str = p0Var.f49150f) != null && str.equals("❤")) {
            this.f1436b = true;
        } else {
            this.f1436b = false;
        }
        org.telegram.ui.Components.o5 o5Var = this.f1438f;
        if (o5Var != null) {
            o5Var.o(this);
        }
        this.f1438f = null;
        if (p0Var != null) {
            if (p0Var.f49151g != 0) {
                org.telegram.ui.Components.o5 o5Var2 = new org.telegram.ui.Components.o5(3, UserConfig.selectedAccount, p0Var.f49151g);
                this.f1438f = o5Var2;
                if (this.f1441s) {
                    o5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(p0Var.f49150f);
                if (tL_availableReaction != null) {
                    this.d.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.j6.f18806a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
