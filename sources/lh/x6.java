package lh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class x6 extends View {
    public final a4 f16398a;
    public boolean f16399b;
    public final org.telegram.ui.Components.d6 f16400c;
    public final ImageReceiver d;
    public final ImageReceiver f16401e;
    public org.telegram.ui.Components.p5 f16402f;
    public boolean h;
    public boolean f16403n;
    public boolean f16404r;
    public boolean f16405s;

    public x6(Context context, a4 a4Var) {
        super(context);
        this.f16400c = new org.telegram.ui.Components.d6(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.f16401e = new ImageReceiver(this);
        this.h = true;
        this.f16398a = a4Var;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.f16401e.onAttachedToWindow();
        this.f16405s = true;
        org.telegram.ui.Components.p5 p5Var = this.f16402f;
        if (p5Var != null) {
            p5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.f16401e.onDetachedFromWindow();
        this.f16405s = false;
        org.telegram.ui.Components.p5 p5Var = this.f16402f;
        if (p5Var != null) {
            p5Var.o(this);
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: lh.x6.onDraw(android.graphics.Canvas):void");
    }

    public void setAllowDrawReaction(boolean z10) {
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        invalidate();
    }

    public void setReaction(kg.q0 q0Var) {
        boolean z10;
        String str;
        String str2;
        if (q0Var != null && ((str2 = q0Var.f13825f) == null || !str2.equals("❤"))) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f16403n = z10;
        if (q0Var != null && (str = q0Var.f13825f) != null && str.equals("❤")) {
            this.f16399b = true;
        } else {
            this.f16399b = false;
        }
        org.telegram.ui.Components.p5 p5Var = this.f16402f;
        if (p5Var != null) {
            p5Var.o(this);
        }
        this.f16402f = null;
        if (q0Var != null) {
            if (q0Var.f13826g != 0) {
                org.telegram.ui.Components.p5 p5Var2 = new org.telegram.ui.Components.p5(3, UserConfig.selectedAccount, q0Var.f13826g);
                this.f16402f = p5Var2;
                if (this.f16405s) {
                    p5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(q0Var.f13825f);
                if (tL_availableReaction != null) {
                    this.d.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.g6.f23009a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
