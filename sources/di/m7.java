package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class m7 extends View {
    public final n4 f8787a;
    public boolean f8788b;
    public final org.telegram.ui.Components.h6 f8789c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public org.telegram.ui.Components.t5 f8790f;
    public boolean h;
    public boolean f8791n;
    public boolean f8792r;
    public boolean f8793s;

    public m7(Context context, n4 n4Var) {
        super(context);
        this.f8789c = new org.telegram.ui.Components.h6(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.e = new ImageReceiver(this);
        this.h = true;
        this.f8787a = n4Var;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.e.onAttachedToWindow();
        this.f8793s = true;
        org.telegram.ui.Components.t5 t5Var = this.f8790f;
        if (t5Var != null) {
            t5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.e.onDetachedFromWindow();
        this.f8793s = false;
        org.telegram.ui.Components.t5 t5Var = this.f8790f;
        if (t5Var != null) {
            t5Var.o(this);
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: di.m7.onDraw(android.graphics.Canvas):void");
    }

    public void setAllowDrawReaction(boolean z10) {
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        invalidate();
    }

    public void setReaction(bh.x0 x0Var) {
        boolean z10;
        String str;
        String str2;
        if (x0Var != null && ((str2 = x0Var.f4208f) == null || !str2.equals("❤"))) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f8791n = z10;
        if (x0Var != null && (str = x0Var.f4208f) != null && str.equals("❤")) {
            this.f8788b = true;
        } else {
            this.f8788b = false;
        }
        org.telegram.ui.Components.t5 t5Var = this.f8790f;
        if (t5Var != null) {
            t5Var.o(this);
        }
        this.f8790f = null;
        if (x0Var != null) {
            if (x0Var.f4209g != 0) {
                org.telegram.ui.Components.t5 t5Var2 = new org.telegram.ui.Components.t5(3, UserConfig.selectedAccount, x0Var.f4209g);
                this.f8790f = t5Var2;
                if (this.f8793s) {
                    t5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(x0Var.f4208f);
                if (tL_availableReaction != null) {
                    this.d.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.y6.f23297a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
