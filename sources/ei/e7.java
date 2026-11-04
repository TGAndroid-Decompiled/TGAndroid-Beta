package ei;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.h10;
import org.telegram.messenger.li;
import org.telegram.tgnet.TLRPC;
public final class e7 extends View {
    public final g4 f10228a;
    public boolean f10229b;
    public final org.telegram.ui.Components.u5 f10230c;
    public final ImageReceiver d;
    public final ImageReceiver f10231e;
    public org.telegram.ui.Components.g5 f10232f;
    public boolean h;
    public boolean f10233n;
    public boolean f10234r;
    public boolean f10235s;

    public e7(Context context, g4 g4Var) {
        super(context);
        this.f10230c = new org.telegram.ui.Components.u5(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.f10231e = new ImageReceiver(this);
        this.h = true;
        this.f10228a = g4Var;
        imageReceiver.A1 = true;
        imageReceiver.f21282y = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.P();
        this.f10231e.P();
        this.f10235s = true;
        org.telegram.ui.Components.g5 g5Var = this.f10232f;
        if (g5Var != null) {
            g5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.R();
        this.f10231e.R();
        this.f10235s = false;
        org.telegram.ui.Components.g5 g5Var = this.f10232f;
        if (g5Var != null) {
            g5Var.n(this);
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: ei.e7.onDraw(android.graphics.Canvas):void");
    }

    public void setAllowDrawReaction(boolean z10) {
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        invalidate();
    }

    public void setReaction(dh.n0 n0Var) {
        boolean z10;
        String str;
        String str2;
        if (n0Var != null && ((str2 = n0Var.f9097f) == null || !str2.equals("❤"))) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f10233n = z10;
        if (n0Var != null && (str = n0Var.f9097f) != null && str.equals("❤")) {
            this.f10229b = true;
        } else {
            this.f10229b = false;
        }
        org.telegram.ui.Components.g5 g5Var = this.f10232f;
        if (g5Var != null) {
            g5Var.n(this);
        }
        this.f10232f = null;
        if (n0Var != null) {
            if (n0Var.f9098g != 0) {
                org.telegram.ui.Components.g5 g5Var2 = new org.telegram.ui.Components.g5(3, h10.f22829t0, n0Var.f9098g);
                this.f10232f = g5Var2;
                if (this.f10235s) {
                    g5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) li.b0(h10.f22829t0).f24045r.get(n0Var.f9097f);
                if (tL_availableReaction != null) {
                    this.d.q0(ac.b(tL_availableReaction.center_icon), "40_40_lastreactframe", org.telegram.messenger.t5.f(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.k6.f27824a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
