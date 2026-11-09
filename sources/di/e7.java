package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.p10;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
public final class e7 extends View {
    public final g4 f8954a;
    public boolean f8955b;
    public final org.telegram.ui.Components.w5 f8956c;
    public final ImageReceiver d;
    public final ImageReceiver f8957e;
    public org.telegram.ui.Components.i5 f8958f;
    public boolean h;
    public boolean f8959n;
    public boolean f8960r;
    public boolean f8961s;

    public e7(Context context, g4 g4Var) {
        super(context);
        this.f8956c = new org.telegram.ui.Components.w5(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.f8957e = new ImageReceiver(this);
        this.h = true;
        this.f8954a = g4Var;
        imageReceiver.f21236z1 = true;
        imageReceiver.f21232y = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.P();
        this.f8957e.P();
        this.f8961s = true;
        org.telegram.ui.Components.i5 i5Var = this.f8958f;
        if (i5Var != null) {
            i5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.R();
        this.f8957e.R();
        this.f8961s = false;
        org.telegram.ui.Components.i5 i5Var = this.f8958f;
        if (i5Var != null) {
            i5Var.n(this);
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
        if (o0Var != null && ((str2 = o0Var.f6354f) == null || !str2.equals("❤"))) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.f8959n = z9;
        if (o0Var != null && (str = o0Var.f6354f) != null && str.equals("❤")) {
            this.f8955b = true;
        } else {
            this.f8955b = false;
        }
        org.telegram.ui.Components.i5 i5Var = this.f8958f;
        if (i5Var != null) {
            i5Var.n(this);
        }
        this.f8958f = null;
        if (o0Var != null) {
            if (o0Var.f6355g != 0) {
                org.telegram.ui.Components.i5 i5Var2 = new org.telegram.ui.Components.i5(3, p10.f24470s0, o0Var.f6355g);
                this.f8958f = i5Var2;
                if (this.f8961s) {
                    i5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(p10.f24470s0).f25836r.get(o0Var.f6354f);
                if (tL_availableReaction != null) {
                    this.d.q0(hc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", org.telegram.messenger.t5.f(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.l6.f27809a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
