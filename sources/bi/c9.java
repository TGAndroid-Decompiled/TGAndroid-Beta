package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class c9 extends View {
    public final n5 f2911a;
    public boolean f2912b;
    public final org.telegram.ui.Components.g6 f2913c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public org.telegram.ui.Components.s5 f2914f;
    public boolean h;
    public boolean f2915n;
    public boolean f2916r;
    public boolean f2917s;

    public c9(Context context, n5 n5Var) {
        super(context);
        this.f2913c = new org.telegram.ui.Components.g6(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.e = new ImageReceiver(this);
        this.h = true;
        this.f2911a = n5Var;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.e.onAttachedToWindow();
        this.f2917s = true;
        org.telegram.ui.Components.s5 s5Var = this.f2914f;
        if (s5Var != null) {
            s5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.e.onDetachedFromWindow();
        this.f2917s = false;
        org.telegram.ui.Components.s5 s5Var = this.f2914f;
        if (s5Var != null) {
            s5Var.o(this);
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: bi.c9.onDraw(android.graphics.Canvas):void");
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
        if (i1Var != null && ((str2 = i1Var.f783f) == null || !str2.equals("❤"))) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f2915n = z10;
        if (i1Var != null && (str = i1Var.f783f) != null && str.equals("❤")) {
            this.f2912b = true;
        } else {
            this.f2912b = false;
        }
        org.telegram.ui.Components.s5 s5Var = this.f2914f;
        if (s5Var != null) {
            s5Var.o(this);
        }
        this.f2914f = null;
        if (i1Var != null) {
            if (i1Var.f784g != 0) {
                org.telegram.ui.Components.s5 s5Var2 = new org.telegram.ui.Components.s5(3, UserConfig.selectedAccount, i1Var.f784g);
                this.f2914f = s5Var2;
                if (this.f2917s) {
                    s5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(i1Var.f783f);
                if (tL_availableReaction != null) {
                    this.d.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.g6.f19543a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
