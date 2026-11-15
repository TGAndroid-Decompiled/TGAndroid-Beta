package fi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.m10;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
public final class x6 extends View {
    public final y3 f12503a;
    public boolean f12504b;
    public final org.telegram.ui.Components.u5 f12505c;
    public final ImageReceiver d;
    public final ImageReceiver f12506e;
    public org.telegram.ui.Components.g5 f12507f;
    public boolean h;
    public boolean f12508n;
    public boolean f12509r;
    public boolean f12510s;

    public x6(Context context, y3 y3Var) {
        super(context);
        this.f12505c = new org.telegram.ui.Components.u5(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.f12506e = new ImageReceiver(this);
        this.h = true;
        this.f12503a = y3Var;
        imageReceiver.A1 = true;
        imageReceiver.f22311y = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.P();
        this.f12506e.P();
        this.f12510s = true;
        org.telegram.ui.Components.g5 g5Var = this.f12507f;
        if (g5Var != null) {
            g5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.R();
        this.f12506e.R();
        this.f12510s = false;
        org.telegram.ui.Components.g5 g5Var = this.f12507f;
        if (g5Var != null) {
            g5Var.n(this);
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: fi.x6.onDraw(android.graphics.Canvas):void");
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
        if (p0Var != null && ((str2 = p0Var.f5188f) == null || !str2.equals("❤"))) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f12508n = z10;
        if (p0Var != null && (str = p0Var.f5188f) != null && str.equals("❤")) {
            this.f12504b = true;
        } else {
            this.f12504b = false;
        }
        org.telegram.ui.Components.g5 g5Var = this.f12507f;
        if (g5Var != null) {
            g5Var.n(this);
        }
        this.f12507f = null;
        if (p0Var != null) {
            if (p0Var.f5189g != 0) {
                org.telegram.ui.Components.g5 g5Var2 = new org.telegram.ui.Components.g5(3, m10.f24934t0, p0Var.f5189g);
                this.f12507f = g5Var2;
                if (this.f12510s) {
                    g5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) si.b0(m10.f24934t0).f26495r.get(p0Var.f5188f);
                if (tL_availableReaction != null) {
                    this.d.q0(gc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", org.telegram.messenger.t5.f(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.j6.f28792a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
