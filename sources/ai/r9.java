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
    public final c6 f1669a;
    public boolean f1670b;
    public final org.telegram.ui.Components.g6 f1671c;
    public final ImageReceiver d;
    public final ImageReceiver f1672e;
    public org.telegram.ui.Components.s5 f1673f;
    public boolean h;
    public boolean f1674n;
    public boolean f1675r;
    public boolean f1676s;

    public r9(Context context, c6 c6Var) {
        super(context);
        this.f1671c = new org.telegram.ui.Components.g6(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.f1672e = new ImageReceiver(this);
        this.h = true;
        this.f1669a = c6Var;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.f1672e.onAttachedToWindow();
        this.f1676s = true;
        org.telegram.ui.Components.s5 s5Var = this.f1673f;
        if (s5Var != null) {
            s5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.f1672e.onDetachedFromWindow();
        this.f1676s = false;
        org.telegram.ui.Components.s5 s5Var = this.f1673f;
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
        if (n0Var != null && ((str2 = n0Var.f54704f) == null || !str2.equals("❤"))) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f1674n = z10;
        if (n0Var != null && (str = n0Var.f54704f) != null && str.equals("❤")) {
            this.f1670b = true;
        } else {
            this.f1670b = false;
        }
        org.telegram.ui.Components.s5 s5Var = this.f1673f;
        if (s5Var != null) {
            s5Var.o(this);
        }
        this.f1673f = null;
        if (n0Var != null) {
            if (n0Var.f54705g != 0) {
                org.telegram.ui.Components.s5 s5Var2 = new org.telegram.ui.Components.s5(3, UserConfig.selectedAccount, n0Var.f54705g);
                this.f1673f = s5Var2;
                if (this.f1676s) {
                    s5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(n0Var.f54704f);
                if (tL_availableReaction != null) {
                    this.d.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.h6.f20730a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
