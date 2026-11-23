package fi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.k10;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
public final class u6 extends View {
    public final w3 f12662a;
    public boolean f12663b;
    public final org.telegram.ui.Components.d6 f12664c;
    public final ImageReceiver d;
    public final ImageReceiver f12665e;
    public org.telegram.ui.Components.p5 f12666f;
    public boolean h;
    public boolean f12667n;
    public boolean f12668r;
    public boolean f12669s;

    public u6(Context context, w3 w3Var) {
        super(context);
        this.f12664c = new org.telegram.ui.Components.d6(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.f12665e = new ImageReceiver(this);
        this.h = true;
        this.f12662a = w3Var;
        imageReceiver.A1 = true;
        imageReceiver.f22705y = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.P();
        this.f12665e.P();
        this.f12669s = true;
        org.telegram.ui.Components.p5 p5Var = this.f12666f;
        if (p5Var != null) {
            p5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.R();
        this.f12665e.R();
        this.f12669s = false;
        org.telegram.ui.Components.p5 p5Var = this.f12666f;
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
        if (p0Var != null && ((str2 = p0Var.f5507f) == null || !str2.equals("❤"))) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f12667n = z10;
        if (p0Var != null && (str = p0Var.f5507f) != null && str.equals("❤")) {
            this.f12663b = true;
        } else {
            this.f12663b = false;
        }
        org.telegram.ui.Components.p5 p5Var = this.f12666f;
        if (p5Var != null) {
            p5Var.n(this);
        }
        this.f12666f = null;
        if (p0Var != null) {
            if (p0Var.f5508g != 0) {
                org.telegram.ui.Components.p5 p5Var2 = new org.telegram.ui.Components.p5(3, k10.f24968t0, p0Var.f5508g);
                this.f12666f = p5Var2;
                if (this.f12669s) {
                    p5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) si.d0(k10.f24968t0).f26847r.get(p0Var.f5507f);
                if (tL_availableReaction != null) {
                    this.d.q0(gc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", org.telegram.messenger.u5.f(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.m6.f29324a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
