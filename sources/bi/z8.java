package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class z8 extends View {
    public final l5 f4065a;
    public boolean f4066b;
    public final org.telegram.ui.Components.e6 f4067c;
    public final ImageReceiver d;
    public final ImageReceiver f4068e;
    public org.telegram.ui.Components.q5 f4069f;
    public boolean h;
    public boolean f4070n;
    public boolean f4071r;
    public boolean f4072s;

    public z8(Context context, l5 l5Var) {
        super(context);
        this.f4067c = new org.telegram.ui.Components.e6(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.f4068e = new ImageReceiver(this);
        this.h = true;
        this.f4065a = l5Var;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.f4068e.onAttachedToWindow();
        this.f4072s = true;
        org.telegram.ui.Components.q5 q5Var = this.f4069f;
        if (q5Var != null) {
            q5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.f4068e.onDetachedFromWindow();
        this.f4072s = false;
        org.telegram.ui.Components.q5 q5Var = this.f4069f;
        if (q5Var != null) {
            q5Var.o(this);
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: bi.z8.onDraw(android.graphics.Canvas):void");
    }

    public void setAllowDrawReaction(boolean z10) {
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        invalidate();
    }

    public void setReaction(ah.j1 j1Var) {
        boolean z10;
        String str;
        String str2;
        if (j1Var != null && ((str2 = j1Var.f597f) == null || !str2.equals("❤"))) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f4070n = z10;
        if (j1Var != null && (str = j1Var.f597f) != null && str.equals("❤")) {
            this.f4066b = true;
        } else {
            this.f4066b = false;
        }
        org.telegram.ui.Components.q5 q5Var = this.f4069f;
        if (q5Var != null) {
            q5Var.o(this);
        }
        this.f4069f = null;
        if (j1Var != null) {
            if (j1Var.f598g != 0) {
                org.telegram.ui.Components.q5 q5Var2 = new org.telegram.ui.Components.q5(3, UserConfig.selectedAccount, j1Var.f598g);
                this.f4069f = q5Var2;
                if (this.f4072s) {
                    q5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(j1Var.f597f);
                if (tL_availableReaction != null) {
                    this.d.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.j6.f20607a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
