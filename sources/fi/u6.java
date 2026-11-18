package fi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.j10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
public final class u6 extends View {
    public final w3 f12618a;
    public boolean f12619b;
    public final org.telegram.ui.Components.c6 f12620c;
    public final ImageReceiver d;
    public final ImageReceiver f12621e;
    public org.telegram.ui.Components.o5 f12622f;
    public boolean h;
    public boolean f12623n;
    public boolean f12624r;
    public boolean f12625s;

    public u6(Context context, w3 w3Var) {
        super(context);
        this.f12620c = new org.telegram.ui.Components.c6(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.f12621e = new ImageReceiver(this);
        this.h = true;
        this.f12618a = w3Var;
        imageReceiver.A1 = true;
        imageReceiver.f22677y = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.P();
        this.f12621e.P();
        this.f12625s = true;
        org.telegram.ui.Components.o5 o5Var = this.f12622f;
        if (o5Var != null) {
            o5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.R();
        this.f12621e.R();
        this.f12625s = false;
        org.telegram.ui.Components.o5 o5Var = this.f12622f;
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
        if (p0Var != null && ((str2 = p0Var.f5478f) == null || !str2.equals("❤"))) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f12623n = z10;
        if (p0Var != null && (str = p0Var.f5478f) != null && str.equals("❤")) {
            this.f12619b = true;
        } else {
            this.f12619b = false;
        }
        org.telegram.ui.Components.o5 o5Var = this.f12622f;
        if (o5Var != null) {
            o5Var.n(this);
        }
        this.f12622f = null;
        if (p0Var != null) {
            if (p0Var.f5479g != 0) {
                org.telegram.ui.Components.o5 o5Var2 = new org.telegram.ui.Components.o5(3, j10.f24773t0, p0Var.f5479g);
                this.f12622f = o5Var2;
                if (this.f12625s) {
                    o5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ri.d0(j10.f24773t0).f26635r.get(p0Var.f5478f);
                if (tL_availableReaction != null) {
                    this.d.q0(fc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", org.telegram.messenger.u5.f(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.n6.f29339a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
