package ch;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import fi.s2;
import j$.util.Objects;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.k10;
import org.telegram.messenger.si;
import org.telegram.messenger.u5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.p5;
public final class g0 {
    public final ImageReceiver f5390a;
    public p5 f5391b;
    public p0 f5393e;
    public View f5394f;
    public boolean f5395g;
    public boolean f5396i;
    public int f5397j;
    public PorterDuffColorFilter f5398k;
    public final Rect f5392c = new Rect();
    public final int d = k10.f24968t0;
    public float h = 1.0f;

    public g0(View view) {
        this.f5394f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f5390a = imageReceiver;
        imageReceiver.A1 = true;
    }

    public final void a(Canvas canvas) {
        p5 p5Var = this.f5391b;
        Rect rect = this.f5392c;
        if (p5Var != null) {
            s2 s2Var = p5Var.f38500k;
            if (s2Var != null) {
                s2Var.J0((int) (rect.width() * 0.1f));
            }
            this.f5391b.setColorFilter(this.f5398k);
            this.f5391b.setBounds(rect);
            this.f5391b.setAlpha((int) (this.h * 255.0f));
            this.f5391b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f5390a;
        imageReceiver.y0(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.h(canvas, null);
    }

    public final void b(boolean z10) {
        this.f5395g = z10;
        ImageReceiver imageReceiver = this.f5390a;
        if (z10) {
            imageReceiver.P();
            p5 p5Var = this.f5391b;
            if (p5Var != null) {
                p5Var.a(this.f5394f);
                return;
            }
            return;
        }
        imageReceiver.R();
        p5 p5Var2 = this.f5391b;
        if (p5Var2 != null) {
            p5Var2.n(this.f5394f);
        }
    }

    public final void c(Rect rect) {
        this.f5392c.set(rect);
    }

    public final void d(int i7) {
        if (this.f5397j != i7) {
            this.f5397j = i7;
            this.f5398k = new PorterDuffColorFilter(this.f5397j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f5394f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(p0 p0Var) {
        String str;
        int i7;
        if (!Objects.equals(this.f5393e, p0Var)) {
            ImageReceiver imageReceiver = this.f5390a;
            imageReceiver.f();
            p5 p5Var = this.f5391b;
            if (p5Var != null) {
                p5Var.n(this.f5394f);
                this.f5391b = null;
            }
            this.f5393e = p0Var;
            boolean z10 = this.f5396i;
            if (z10) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            if (p0Var.f5507f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) si.d0(this.d).f26847r.get(p0Var.f5507f);
                if (tL_availableReaction != null) {
                    imageReceiver.r0(gc.b(tL_availableReaction.select_animation), str, null, null, u5.f(tL_availableReaction.select_animation, m6.f29546m6, 0.2f, null), 0L, "tgs", p0Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i7 = 13;
            } else {
                i7 = 1;
            }
            p5 p5Var2 = new p5(i7, k10.f24968t0, p0Var.f5508g);
            this.f5391b = p5Var2;
            if (this.f5395g) {
                p5Var2.a(this.f5394f);
            }
            p5 p5Var3 = this.f5391b;
            this.f5397j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f5398k = porterDuffColorFilter;
            p5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
