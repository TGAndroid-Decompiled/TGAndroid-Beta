package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class h6b extends View {
    public final m68 a;
    public boolean b;
    public final mm c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public wl f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;

    public h6b(Context context, m68 m68Var) {
        super(context);
        this.c = new mm(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.e = new ImageReceiver(this);
        this.h = true;
        this.a = m68Var;
        imageReceiver.A1 = true;
        imageReceiver.y = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.I();
        this.e.I();
        this.s = true;
        wl wlVar = this.f;
        if (wlVar != null) {
            wlVar.b(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.K();
        this.e.K();
        this.s = false;
        wl wlVar = this.f;
        if (wlVar != null) {
            wlVar.o(this);
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h6b.onDraw(android.graphics.Canvas):void");
    }

    public void setAllowDrawReaction(boolean z) {
        if (this.h == z) {
            return;
        }
        this.h = z;
        invalidate();
    }

    public void setReaction(w49 w49Var) {
        boolean z;
        String str;
        String str2;
        if (w49Var != null && ((str2 = w49Var.f) == null || !str2.equals("❤"))) {
            z = false;
        } else {
            z = true;
        }
        this.n = z;
        if (w49Var != null && (str = w49Var.f) != null && str.equals("❤")) {
            this.b = true;
        } else {
            this.b = false;
        }
        wl wlVar = this.f;
        if (wlVar != null) {
            wlVar.o(this);
        }
        this.f = null;
        if (w49Var != null) {
            if (w49Var.g != 0) {
                wl wlVar2 = new wl(3, yac.t0, w49Var.g);
                this.f = wlVar2;
                if (this.s) {
                    wlVar2.b(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ls6.d0(yac.t0).r.get(w49Var.f);
                if (tL_availableReaction != null) {
                    this.d.d0(jn5.b(tL_availableReaction.center_icon), "40_40_lastreactframe", lp3.f(tL_availableReaction.static_icon, aob.a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
