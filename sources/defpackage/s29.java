package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.ImageReceiver;
public final class s29 extends bf0 {
    public final byte H;
    public final t29 I;

    public s29(t29 t29Var, Context context, byte b) {
        super(context);
        this.H = b;
        this.I = t29Var;
    }

    @Override
    public final ImageReceiver c() {
        switch (this.H) {
            case 0:
                return new r29(this, (byte) 0);
            case 1:
                return new r29(this, (byte) 1);
            default:
                return super.c();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.H) {
            case 0:
                t29 t29Var = this.I;
                s29 s29Var = t29Var.b;
                super.dispatchDraw(canvas);
                if (this.a.y() != null && !t29Var.F) {
                    this.a.y().start();
                }
                if (t29Var.s && !t29Var.w && this.a.y() != null && this.a.y().v() && s29Var.a.y() != null && s29Var.a.y().p()) {
                    t29Var.w = true;
                    s29Var.a.y().I(0, false, true);
                    s29Var.setVisibility(0);
                    Runnable runnable = t29Var.Q.Q0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    gm.c3(new pp8(this, (byte) 17));
                }
                invalidate();
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public final void invalidate() {
        byte b = this.H;
        t29 t29Var = this.I;
        switch (b) {
            case 0:
                v29 v29Var = t29Var.Q;
                if (!oi5.c(this, v29Var)) {
                    super.invalidate();
                    v29Var.invalidate();
                    return;
                }
                return;
            case 1:
                if (!oi5.c(this)) {
                    super.invalidate();
                    return;
                }
                return;
            default:
                super.invalidate();
                t29Var.Q.invalidate();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ImageReceiver imageReceiver;
        switch (this.H) {
            case 1:
                this.I.a();
                super.onDraw(canvas);
                return;
            case 2:
                vm vmVar = this.e;
                if (vmVar != null) {
                    imageReceiver = vmVar.k;
                } else {
                    imageReceiver = this.a;
                }
                if (imageReceiver != null && imageReceiver.y() != null) {
                    imageReceiver.y().start();
                }
                super.onDraw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        switch (this.H) {
            case 0:
                if (oi5.c(this)) {
                    return;
                }
                super.invalidate(i, i2, i3, i4);
                return;
            case 1:
                if (oi5.c(this)) {
                    return;
                }
                super.invalidate(i, i2, i3, i4);
                return;
            default:
                super.invalidate(i, i2, i3, i4);
                return;
        }
    }

    @Override
    public final void invalidate(Rect rect) {
        switch (this.H) {
            case 0:
                v29 v29Var = this.I.Q;
                if (oi5.c(this, v29Var)) {
                    return;
                }
                super.invalidate(rect);
                v29Var.invalidate();
                return;
            default:
                super.invalidate(rect);
                return;
        }
    }
}
