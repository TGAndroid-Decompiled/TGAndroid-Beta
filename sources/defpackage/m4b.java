package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class m4b extends View {
    public final y48 a;
    public boolean b;
    public final ln c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public vm f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;

    public m4b(Context context, y48 y48Var) {
        super(context);
        this.c = new ln(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.e = new ImageReceiver(this);
        this.h = true;
        this.a = y48Var;
        imageReceiver.A1 = true;
        imageReceiver.y = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.I();
        this.e.I();
        this.s = true;
        vm vmVar = this.f;
        if (vmVar != null) {
            vmVar.b(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.K();
        this.e.K();
        this.s = false;
        vm vmVar = this.f;
        if (vmVar != null) {
            vmVar.o(this);
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m4b.onDraw(android.graphics.Canvas):void");
    }

    public void setAllowDrawReaction(boolean z) {
        if (this.h == z) {
            return;
        }
        this.h = z;
        invalidate();
    }

    public void setReaction(k39 k39Var) {
        boolean z;
        String str;
        String str2;
        if (k39Var != null && ((str2 = k39Var.f) == null || !str2.equals("❤"))) {
            z = false;
        } else {
            z = true;
        }
        this.n = z;
        if (k39Var != null && (str = k39Var.f) != null && str.equals("❤")) {
            this.b = true;
        } else {
            this.b = false;
        }
        vm vmVar = this.f;
        if (vmVar != null) {
            vmVar.o(this);
        }
        this.f = null;
        if (k39Var != null) {
            if (k39Var.g != 0) {
                vm vmVar2 = new vm(3, z8c.t0, k39Var.g);
                this.f = vmVar2;
                if (this.s) {
                    vmVar2.b(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hs6.d0(z8c.t0).r.get(k39Var.f);
                if (tL_availableReaction != null) {
                    this.d.d0(gn5.b(tL_availableReaction.center_icon), "40_40_lastreactframe", eq3.f(tL_availableReaction.static_icon, cmb.Z6, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
