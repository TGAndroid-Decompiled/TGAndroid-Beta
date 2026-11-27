package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.ImageReceiver;
public final class f49 extends de0 {
    public final byte H;
    public final g49 I;

    public f49(g49 g49Var, Context context, byte b) {
        super(context);
        this.H = b;
        this.I = g49Var;
    }

    @Override
    public final ImageReceiver c() {
        switch (this.H) {
            case 0:
                return new e49(this, (byte) 0);
            case 1:
                return new e49(this, (byte) 1);
            default:
                return super.c();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        switch (this.H) {
            case 0:
                g49 g49Var = this.I;
                f49 f49Var = g49Var.b;
                super.dispatchDraw(canvas);
                if (this.a.y() != null && !g49Var.F) {
                    this.a.y().start();
                }
                if (g49Var.s && !g49Var.w && this.a.y() != null && this.a.y().v() && f49Var.a.y() != null && f49Var.a.y().p()) {
                    g49Var.w = true;
                    f49Var.a.y().I(0, false, true);
                    f49Var.setVisibility(0);
                    Runnable runnable = g49Var.Q.Q0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    hl.c3(new uk8(this, (byte) 25));
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
        g49 g49Var = this.I;
        switch (b) {
            case 0:
                i49 i49Var = g49Var.Q;
                if (!ri5.c(this, i49Var)) {
                    super.invalidate();
                    i49Var.invalidate();
                    return;
                }
                return;
            case 1:
                if (!ri5.c(this)) {
                    super.invalidate();
                    return;
                }
                return;
            default:
                super.invalidate();
                g49Var.Q.invalidate();
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
                wl wlVar = this.e;
                if (wlVar != null) {
                    imageReceiver = wlVar.k;
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
                if (ri5.c(this)) {
                    return;
                }
                super.invalidate(i, i2, i3, i4);
                return;
            case 1:
                if (ri5.c(this)) {
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
                i49 i49Var = this.I.Q;
                if (ri5.c(this, i49Var)) {
                    return;
                }
                super.invalidate(rect);
                i49Var.invalidate();
                return;
            default:
                super.invalidate(rect);
                return;
        }
    }
}
