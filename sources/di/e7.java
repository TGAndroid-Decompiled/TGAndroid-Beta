package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.p10;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
public final class e7 extends View {
    public final g4 f8959a;
    public boolean f8960b;
    public final org.telegram.ui.Components.v5 f8961c;
    public final ImageReceiver d;
    public final ImageReceiver f8962e;
    public org.telegram.ui.Components.h5 f8963f;
    public boolean h;
    public boolean f8964n;
    public boolean f8965r;
    public boolean f8966s;

    public e7(Context context, g4 g4Var) {
        super(context);
        this.f8961c = new org.telegram.ui.Components.v5(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.f8962e = new ImageReceiver(this);
        this.h = true;
        this.f8959a = g4Var;
        imageReceiver.f21241z1 = true;
        imageReceiver.f21237y = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.P();
        this.f8962e.P();
        this.f8966s = true;
        org.telegram.ui.Components.h5 h5Var = this.f8963f;
        if (h5Var != null) {
            h5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.R();
        this.f8962e.R();
        this.f8966s = false;
        org.telegram.ui.Components.h5 h5Var = this.f8963f;
        if (h5Var != null) {
            h5Var.n(this);
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: di.e7.onDraw(android.graphics.Canvas):void");
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
        if (o0Var != null && ((str2 = o0Var.f6359f) == null || !str2.equals("❤"))) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.f8964n = z9;
        if (o0Var != null && (str = o0Var.f6359f) != null && str.equals("❤")) {
            this.f8960b = true;
        } else {
            this.f8960b = false;
        }
        org.telegram.ui.Components.h5 h5Var = this.f8963f;
        if (h5Var != null) {
            h5Var.n(this);
        }
        this.f8963f = null;
        if (o0Var != null) {
            if (o0Var.f6360g != 0) {
                org.telegram.ui.Components.h5 h5Var2 = new org.telegram.ui.Components.h5(3, p10.f24474s0, o0Var.f6360g);
                this.f8963f = h5Var2;
                if (this.f8966s) {
                    h5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(p10.f24474s0).f25840r.get(o0Var.f6359f);
                if (tL_availableReaction != null) {
                    this.d.q0(hc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", org.telegram.messenger.t5.f(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.m6.f27834a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
