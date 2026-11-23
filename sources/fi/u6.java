package fi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.k10;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
public final class u6 extends View {
    public final w3 f12610a;
    public boolean f12611b;
    public final org.telegram.ui.Components.d6 f12612c;
    public final ImageReceiver d;
    public final ImageReceiver f12613e;
    public org.telegram.ui.Components.p5 f12614f;
    public boolean h;
    public boolean f12615n;
    public boolean f12616r;
    public boolean f12617s;

    public u6(Context context, w3 w3Var) {
        super(context);
        this.f12612c = new org.telegram.ui.Components.d6(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.f12613e = new ImageReceiver(this);
        this.h = true;
        this.f12610a = w3Var;
        imageReceiver.A1 = true;
        imageReceiver.f22669y = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.P();
        this.f12613e.P();
        this.f12617s = true;
        org.telegram.ui.Components.p5 p5Var = this.f12614f;
        if (p5Var != null) {
            p5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.R();
        this.f12613e.R();
        this.f12617s = false;
        org.telegram.ui.Components.p5 p5Var = this.f12614f;
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
        if (p0Var != null && ((str2 = p0Var.f5470f) == null || !str2.equals("❤"))) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f12615n = z10;
        if (p0Var != null && (str = p0Var.f5470f) != null && str.equals("❤")) {
            this.f12611b = true;
        } else {
            this.f12611b = false;
        }
        org.telegram.ui.Components.p5 p5Var = this.f12614f;
        if (p5Var != null) {
            p5Var.n(this);
        }
        this.f12614f = null;
        if (p0Var != null) {
            if (p0Var.f5471g != 0) {
                org.telegram.ui.Components.p5 p5Var2 = new org.telegram.ui.Components.p5(3, k10.f24932t0, p0Var.f5471g);
                this.f12614f = p5Var2;
                if (this.f12617s) {
                    p5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) si.d0(k10.f24932t0).f26811r.get(p0Var.f5470f);
                if (tL_availableReaction != null) {
                    this.d.q0(gc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", org.telegram.messenger.u5.f(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.m6.f29290a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
