package ai;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class r9 extends View {
    public final c6 f1667a;
    public boolean f1668b;
    public final org.telegram.ui.Components.g6 f1669c;
    public final ImageReceiver d;
    public final ImageReceiver f1670e;
    public org.telegram.ui.Components.s5 f1671f;
    public boolean h;
    public boolean f1672n;
    public boolean f1673r;
    public boolean f1674s;

    public r9(Context context, c6 c6Var) {
        super(context);
        this.f1669c = new org.telegram.ui.Components.g6(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.f1670e = new ImageReceiver(this);
        this.h = true;
        this.f1667a = c6Var;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.f1670e.onAttachedToWindow();
        this.f1674s = true;
        org.telegram.ui.Components.s5 s5Var = this.f1671f;
        if (s5Var != null) {
            s5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.f1670e.onDetachedFromWindow();
        this.f1674s = false;
        org.telegram.ui.Components.s5 s5Var = this.f1671f;
        if (s5Var != null) {
            s5Var.o(this);
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: ai.r9.onDraw(android.graphics.Canvas):void");
    }

    public void setAllowDrawReaction(boolean z10) {
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        invalidate();
    }

    public void setReaction(zg.n0 n0Var) {
        boolean z10;
        String str;
        String str2;
        if (n0Var != null && ((str2 = n0Var.f54849f) == null || !str2.equals("❤"))) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f1672n = z10;
        if (n0Var != null && (str = n0Var.f54849f) != null && str.equals("❤")) {
            this.f1668b = true;
        } else {
            this.f1668b = false;
        }
        org.telegram.ui.Components.s5 s5Var = this.f1671f;
        if (s5Var != null) {
            s5Var.o(this);
        }
        this.f1671f = null;
        if (n0Var != null) {
            if (n0Var.f54850g != 0) {
                org.telegram.ui.Components.s5 s5Var2 = new org.telegram.ui.Components.s5(3, UserConfig.selectedAccount, n0Var.f54850g);
                this.f1671f = s5Var2;
                if (this.f1674s) {
                    s5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(n0Var.f54849f);
                if (tL_availableReaction != null) {
                    this.d.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.h6.f20504a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
