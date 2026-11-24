package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class l2b extends View {
    public final w28 a;
    public boolean b;
    public final lm c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public vl f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;

    public l2b(Context context, w28 w28Var) {
        super(context);
        this.c = new lm(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.e = new ImageReceiver(this);
        this.h = true;
        this.a = w28Var;
        imageReceiver.A1 = true;
        imageReceiver.y = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.I();
        this.e.I();
        this.s = true;
        vl vlVar = this.f;
        if (vlVar != null) {
            vlVar.b(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.K();
        this.e.K();
        this.s = false;
        vl vlVar = this.f;
        if (vlVar != null) {
            vlVar.o(this);
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l2b.onDraw(android.graphics.Canvas):void");
    }

    public void setAllowDrawReaction(boolean z) {
        if (this.h == z) {
            return;
        }
        this.h = z;
        invalidate();
    }

    public void setReaction(h19 h19Var) {
        boolean z;
        String str;
        String str2;
        if (h19Var != null && ((str2 = h19Var.f) == null || !str2.equals("❤"))) {
            z = false;
        } else {
            z = true;
        }
        this.n = z;
        if (h19Var != null && (str = h19Var.f) != null && str.equals("❤")) {
            this.b = true;
        } else {
            this.b = false;
        }
        vl vlVar = this.f;
        if (vlVar != null) {
            vlVar.o(this);
        }
        this.f = null;
        if (h19Var != null) {
            if (h19Var.g != 0) {
                vl vlVar2 = new vl(3, y6c.t0, h19Var.g);
                this.f = vlVar2;
                if (this.s) {
                    vlVar2.b(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hq6.d0(y6c.t0).r.get(h19Var.f);
                if (tL_availableReaction != null) {
                    this.d.d0(gl5.b(tL_availableReaction.center_icon), "40_40_lastreactframe", uo3.f(tL_availableReaction.static_icon, bkb.Z6, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
