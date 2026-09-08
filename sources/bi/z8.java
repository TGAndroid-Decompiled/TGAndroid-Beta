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
    public final l5 f4092a;
    public boolean f4093b;
    public final org.telegram.ui.Components.e6 f4094c;
    public final ImageReceiver d;
    public final ImageReceiver f4095e;
    public org.telegram.ui.Components.q5 f4096f;
    public boolean h;
    public boolean f4097n;
    public boolean f4098r;
    public boolean f4099s;

    public z8(Context context, l5 l5Var) {
        super(context);
        this.f4094c = new org.telegram.ui.Components.e6(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.f4095e = new ImageReceiver(this);
        this.h = true;
        this.f4092a = l5Var;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.f4095e.onAttachedToWindow();
        this.f4099s = true;
        org.telegram.ui.Components.q5 q5Var = this.f4096f;
        if (q5Var != null) {
            q5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.f4095e.onDetachedFromWindow();
        this.f4099s = false;
        org.telegram.ui.Components.q5 q5Var = this.f4096f;
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
        if (j1Var != null && ((str2 = j1Var.f609f) == null || !str2.equals("❤"))) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f4097n = z10;
        if (j1Var != null && (str = j1Var.f609f) != null && str.equals("❤")) {
            this.f4093b = true;
        } else {
            this.f4093b = false;
        }
        org.telegram.ui.Components.q5 q5Var = this.f4096f;
        if (q5Var != null) {
            q5Var.o(this);
        }
        this.f4096f = null;
        if (j1Var != null) {
            if (j1Var.f610g != 0) {
                org.telegram.ui.Components.q5 q5Var2 = new org.telegram.ui.Components.q5(3, UserConfig.selectedAccount, j1Var.f610g);
                this.f4096f = q5Var2;
                if (this.f4099s) {
                    q5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(j1Var.f609f);
                if (tL_availableReaction != null) {
                    this.d.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.j6.f20634a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
