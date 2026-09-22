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
    public final c6 f1432a;
    public boolean f1433b;
    public final org.telegram.ui.Components.d6 f1434c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public org.telegram.ui.Components.p5 f1435f;
    public boolean h;
    public boolean f1436n;
    public boolean f1437r;
    public boolean f1438s;

    public q9(Context context, c6 c6Var) {
        super(context);
        this.f1434c = new org.telegram.ui.Components.d6(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.e = new ImageReceiver(this);
        this.h = true;
        this.f1432a = c6Var;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.e.onAttachedToWindow();
        this.f1438s = true;
        org.telegram.ui.Components.p5 p5Var = this.f1435f;
        if (p5Var != null) {
            p5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.e.onDetachedFromWindow();
        this.f1438s = false;
        org.telegram.ui.Components.p5 p5Var = this.f1435f;
        if (p5Var != null) {
            p5Var.o(this);
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
        if (p0Var != null && ((str2 = p0Var.f49447f) == null || !str2.equals("❤"))) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f1436n = z10;
        if (p0Var != null && (str = p0Var.f49447f) != null && str.equals("❤")) {
            this.f1433b = true;
        } else {
            this.f1433b = false;
        }
        org.telegram.ui.Components.p5 p5Var = this.f1435f;
        if (p5Var != null) {
            p5Var.o(this);
        }
        this.f1435f = null;
        if (p0Var != null) {
            if (p0Var.f49448g != 0) {
                org.telegram.ui.Components.p5 p5Var2 = new org.telegram.ui.Components.p5(3, UserConfig.selectedAccount, p0Var.f49448g);
                this.f1435f = p5Var2;
                if (this.f1438s) {
                    p5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(p0Var.f49447f);
                if (tL_availableReaction != null) {
                    this.d.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.j6.f19053a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
