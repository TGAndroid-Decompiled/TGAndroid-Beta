package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.p10;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
public final class d7 extends View {
    public final f4 f8926a;
    public boolean f8927b;
    public final org.telegram.ui.Components.w5 f8928c;
    public final ImageReceiver d;
    public final ImageReceiver f8929e;
    public org.telegram.ui.Components.i5 f8930f;
    public boolean h;
    public boolean f8931n;
    public boolean f8932r;
    public boolean f8933s;

    public d7(Context context, f4 f4Var) {
        super(context);
        this.f8928c = new org.telegram.ui.Components.w5(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.f8929e = new ImageReceiver(this);
        this.h = true;
        this.f8926a = f4Var;
        imageReceiver.f21233z1 = true;
        imageReceiver.f21229y = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.P();
        this.f8929e.P();
        this.f8933s = true;
        org.telegram.ui.Components.i5 i5Var = this.f8930f;
        if (i5Var != null) {
            i5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.R();
        this.f8929e.R();
        this.f8933s = false;
        org.telegram.ui.Components.i5 i5Var = this.f8930f;
        if (i5Var != null) {
            i5Var.n(this);
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: di.d7.onDraw(android.graphics.Canvas):void");
    }

    public void setAllowDrawReaction(boolean z9) {
        if (this.h == z9) {
            return;
        }
        this.h = z9;
        invalidate();
    }

    public void setReaction(ch.o0 o0Var) {
        boolean z9;
        String str;
        String str2;
        if (o0Var != null && ((str2 = o0Var.f6356f) == null || !str2.equals("❤"))) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.f8931n = z9;
        if (o0Var != null && (str = o0Var.f6356f) != null && str.equals("❤")) {
            this.f8927b = true;
        } else {
            this.f8927b = false;
        }
        org.telegram.ui.Components.i5 i5Var = this.f8930f;
        if (i5Var != null) {
            i5Var.n(this);
        }
        this.f8930f = null;
        if (o0Var != null) {
            if (o0Var.f6357g != 0) {
                org.telegram.ui.Components.i5 i5Var2 = new org.telegram.ui.Components.i5(3, p10.f24467s0, o0Var.f6357g);
                this.f8930f = i5Var2;
                if (this.f8933s) {
                    i5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(p10.f24467s0).f25833r.get(o0Var.f6356f);
                if (tL_availableReaction != null) {
                    this.d.q0(hc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", org.telegram.messenger.t5.f(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.k6.f27793a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
