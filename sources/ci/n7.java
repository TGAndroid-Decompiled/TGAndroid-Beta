package ci;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class n7 extends View {
    public final n4 f5653a;
    public boolean f5654b;
    public final org.telegram.ui.Components.f6 f5655c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public org.telegram.ui.Components.r5 f5656f;
    public boolean h;
    public boolean f5657n;
    public boolean f5658r;
    public boolean f5659s;

    public n7(Context context, n4 n4Var) {
        super(context);
        this.f5655c = new org.telegram.ui.Components.f6(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.e = new ImageReceiver(this);
        this.h = true;
        this.f5653a = n4Var;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.e.onAttachedToWindow();
        this.f5659s = true;
        org.telegram.ui.Components.r5 r5Var = this.f5656f;
        if (r5Var != null) {
            r5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.e.onDetachedFromWindow();
        this.f5659s = false;
        org.telegram.ui.Components.r5 r5Var = this.f5656f;
        if (r5Var != null) {
            r5Var.o(this);
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: ci.n7.onDraw(android.graphics.Canvas):void");
    }

    public void setAllowDrawReaction(boolean z10) {
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        invalidate();
    }

    public void setReaction(ah.i1 i1Var) {
        boolean z10;
        String str;
        String str2;
        if (i1Var != null && ((str2 = i1Var.f785f) == null || !str2.equals("❤"))) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f5657n = z10;
        if (i1Var != null && (str = i1Var.f785f) != null && str.equals("❤")) {
            this.f5654b = true;
        } else {
            this.f5654b = false;
        }
        org.telegram.ui.Components.r5 r5Var = this.f5656f;
        if (r5Var != null) {
            r5Var.o(this);
        }
        this.f5656f = null;
        if (i1Var != null) {
            if (i1Var.f786g != 0) {
                org.telegram.ui.Components.r5 r5Var2 = new org.telegram.ui.Components.r5(3, UserConfig.selectedAccount, i1Var.f786g);
                this.f5656f = r5Var2;
                if (this.f5659s) {
                    r5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(i1Var.f785f);
                if (tL_availableReaction != null) {
                    this.d.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.h6.f20935a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
