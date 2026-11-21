package fi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.j10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
public final class u6 extends View {
    public final w3 f12659a;
    public boolean f12660b;
    public final org.telegram.ui.Components.d6 f12661c;
    public final ImageReceiver d;
    public final ImageReceiver f12662e;
    public org.telegram.ui.Components.p5 f12663f;
    public boolean h;
    public boolean f12664n;
    public boolean f12665r;
    public boolean f12666s;

    public u6(Context context, w3 w3Var) {
        super(context);
        this.f12661c = new org.telegram.ui.Components.d6(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.f12662e = new ImageReceiver(this);
        this.h = true;
        this.f12659a = w3Var;
        imageReceiver.A1 = true;
        imageReceiver.f22702y = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.P();
        this.f12662e.P();
        this.f12666s = true;
        org.telegram.ui.Components.p5 p5Var = this.f12663f;
        if (p5Var != null) {
            p5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.R();
        this.f12662e.R();
        this.f12666s = false;
        org.telegram.ui.Components.p5 p5Var = this.f12663f;
        if (p5Var != null) {
            p5Var.n(this);
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
        if (p0Var != null && ((str2 = p0Var.f5504f) == null || !str2.equals("❤"))) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f12664n = z10;
        if (p0Var != null && (str = p0Var.f5504f) != null && str.equals("❤")) {
            this.f12660b = true;
        } else {
            this.f12660b = false;
        }
        org.telegram.ui.Components.p5 p5Var = this.f12663f;
        if (p5Var != null) {
            p5Var.n(this);
        }
        this.f12663f = null;
        if (p0Var != null) {
            if (p0Var.f5505g != 0) {
                org.telegram.ui.Components.p5 p5Var2 = new org.telegram.ui.Components.p5(3, j10.f24798t0, p0Var.f5505g);
                this.f12663f = p5Var2;
                if (this.f12666s) {
                    p5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ri.d0(j10.f24798t0).f26661r.get(p0Var.f5504f);
                if (tL_availableReaction != null) {
                    this.d.q0(fc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", org.telegram.messenger.u5.f(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.m6.f29321a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
