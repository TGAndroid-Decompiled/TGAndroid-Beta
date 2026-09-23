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
    public final b6 f1433a;
    public boolean f1434b;
    public final org.telegram.ui.Components.e6 f1435c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public org.telegram.ui.Components.q5 f1436f;
    public boolean h;
    public boolean f1437n;
    public boolean f1438r;
    public boolean f1439s;

    public q9(Context context, b6 b6Var) {
        super(context);
        this.f1435c = new org.telegram.ui.Components.e6(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.e = new ImageReceiver(this);
        this.h = true;
        this.f1433a = b6Var;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.e.onAttachedToWindow();
        this.f1439s = true;
        org.telegram.ui.Components.q5 q5Var = this.f1436f;
        if (q5Var != null) {
            q5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.e.onDetachedFromWindow();
        this.f1439s = false;
        org.telegram.ui.Components.q5 q5Var = this.f1436f;
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

    public void setReaction(zg.p0 p0Var) {
        boolean z10;
        String str;
        String str2;
        if (p0Var != null && ((str2 = p0Var.f49071f) == null || !str2.equals("❤"))) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f1437n = z10;
        if (p0Var != null && (str = p0Var.f49071f) != null && str.equals("❤")) {
            this.f1434b = true;
        } else {
            this.f1434b = false;
        }
        org.telegram.ui.Components.q5 q5Var = this.f1436f;
        if (q5Var != null) {
            q5Var.o(this);
        }
        this.f1436f = null;
        if (p0Var != null) {
            if (p0Var.f49072g != 0) {
                org.telegram.ui.Components.q5 q5Var2 = new org.telegram.ui.Components.q5(3, UserConfig.selectedAccount, p0Var.f49072g);
                this.f1436f = q5Var2;
                if (this.f1439s) {
                    q5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(p0Var.f49071f);
                if (tL_availableReaction != null) {
                    this.d.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.h6.f18733a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
