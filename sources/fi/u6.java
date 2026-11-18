package fi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.j10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
public final class u6 extends View {
    public final w3 f12615a;
    public boolean f12616b;
    public final org.telegram.ui.Components.c6 f12617c;
    public final ImageReceiver d;
    public final ImageReceiver f12618e;
    public org.telegram.ui.Components.o5 f12619f;
    public boolean h;
    public boolean f12620n;
    public boolean f12621r;
    public boolean f12622s;

    public u6(Context context, w3 w3Var) {
        super(context);
        this.f12617c = new org.telegram.ui.Components.c6(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.f12618e = new ImageReceiver(this);
        this.h = true;
        this.f12615a = w3Var;
        imageReceiver.A1 = true;
        imageReceiver.f22674y = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.P();
        this.f12618e.P();
        this.f12622s = true;
        org.telegram.ui.Components.o5 o5Var = this.f12619f;
        if (o5Var != null) {
            o5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.R();
        this.f12618e.R();
        this.f12622s = false;
        org.telegram.ui.Components.o5 o5Var = this.f12619f;
        if (o5Var != null) {
            o5Var.n(this);
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: fi.u6.onDraw(android.graphics.Canvas):void");
    }

    public void setAllowDrawReaction(boolean z10) {
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        invalidate();
    }

    public void setReaction(ch.p0 p0Var) {
        boolean z10;
        String str;
        String str2;
        if (p0Var != null && ((str2 = p0Var.f5475f) == null || !str2.equals("❤"))) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f12620n = z10;
        if (p0Var != null && (str = p0Var.f5475f) != null && str.equals("❤")) {
            this.f12616b = true;
        } else {
            this.f12616b = false;
        }
        org.telegram.ui.Components.o5 o5Var = this.f12619f;
        if (o5Var != null) {
            o5Var.n(this);
        }
        this.f12619f = null;
        if (p0Var != null) {
            if (p0Var.f5476g != 0) {
                org.telegram.ui.Components.o5 o5Var2 = new org.telegram.ui.Components.o5(3, j10.f24770t0, p0Var.f5476g);
                this.f12619f = o5Var2;
                if (this.f12622s) {
                    o5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ri.d0(j10.f24770t0).f26633r.get(p0Var.f5475f);
                if (tL_availableReaction != null) {
                    this.d.q0(fc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", org.telegram.messenger.u5.f(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.n6.f29337a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
