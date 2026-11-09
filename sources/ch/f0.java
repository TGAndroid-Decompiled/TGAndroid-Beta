package ch;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import di.z2;
import j$.util.Objects;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.p10;
import org.telegram.messenger.t5;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.i5;
public final class f0 {
    public final ImageReceiver f6239a;
    public i5 f6240b;
    public o0 f6242e;
    public View f6243f;
    public boolean f6244g;
    public boolean f6245i;
    public int f6246j;
    public PorterDuffColorFilter f6247k;
    public final Rect f6241c = new Rect();
    public final int d = p10.f24470s0;
    public float h = 1.0f;

    public f0(View view) {
        this.f6243f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f6239a = imageReceiver;
        imageReceiver.f21236z1 = true;
    }

    public final void a(Canvas canvas) {
        i5 i5Var = this.f6240b;
        Rect rect = this.f6241c;
        if (i5Var != null) {
            z2 z2Var = i5Var.f34568k;
            if (z2Var != null) {
                z2Var.J0((int) (rect.width() * 0.1f));
            }
            this.f6240b.setColorFilter(this.f6247k);
            this.f6240b.setBounds(rect);
            this.f6240b.setAlpha((int) (this.h * 255.0f));
            this.f6240b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f6239a;
        imageReceiver.y0(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.h(canvas, null);
    }

    public final void b(boolean z9) {
        this.f6244g = z9;
        ImageReceiver imageReceiver = this.f6239a;
        if (z9) {
            imageReceiver.P();
            i5 i5Var = this.f6240b;
            if (i5Var != null) {
                i5Var.a(this.f6243f);
                return;
            }
            return;
        }
        imageReceiver.R();
        i5 i5Var2 = this.f6240b;
        if (i5Var2 != null) {
            i5Var2.n(this.f6243f);
        }
    }

    public final void c(Rect rect) {
        this.f6241c.set(rect);
    }

    public final void d(int i7) {
        if (this.f6246j != i7) {
            this.f6246j = i7;
            this.f6247k = new PorterDuffColorFilter(this.f6246j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f6243f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(o0 o0Var) {
        String str;
        int i7;
        if (!Objects.equals(this.f6242e, o0Var)) {
            ImageReceiver imageReceiver = this.f6239a;
            imageReceiver.f();
            i5 i5Var = this.f6240b;
            if (i5Var != null) {
                i5Var.n(this.f6243f);
                this.f6240b = null;
            }
            this.f6242e = o0Var;
            boolean z9 = this.f6245i;
            if (z9) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            if (o0Var.f6354f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(this.d).f25836r.get(o0Var.f6354f);
                if (tL_availableReaction != null) {
                    imageReceiver.r0(hc.b(tL_availableReaction.select_animation), str, null, null, t5.f(tL_availableReaction.select_animation, l6.f28030m6, 0.2f, null), 0L, "tgs", o0Var, 0);
                    return;
                }
                return;
            }
            if (z9) {
                i7 = 13;
            } else {
                i7 = 1;
            }
            i5 i5Var2 = new i5(i7, p10.f24470s0, o0Var.f6355g);
            this.f6240b = i5Var2;
            if (this.f6244g) {
                i5Var2.a(this.f6243f);
            }
            i5 i5Var3 = this.f6240b;
            this.f6246j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f6247k = porterDuffColorFilter;
            i5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
