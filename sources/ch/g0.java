package ch;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import fi.u2;
import j$.util.Objects;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.m10;
import org.telegram.messenger.si;
import org.telegram.messenger.t5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g5;
public final class g0 {
    public final ImageReceiver f5072a;
    public g5 f5073b;
    public p0 f5075e;
    public View f5076f;
    public boolean f5077g;
    public boolean f5078i;
    public int f5079j;
    public PorterDuffColorFilter f5080k;
    public final Rect f5074c = new Rect();
    public final int d = m10.f24934t0;
    public float h = 1.0f;

    public g0(View view) {
        this.f5076f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f5072a = imageReceiver;
        imageReceiver.A1 = true;
    }

    public final void a(Canvas canvas) {
        g5 g5Var = this.f5073b;
        Rect rect = this.f5074c;
        if (g5Var != null) {
            u2 u2Var = g5Var.f34809k;
            if (u2Var != null) {
                u2Var.J0((int) (rect.width() * 0.1f));
            }
            this.f5073b.setColorFilter(this.f5080k);
            this.f5073b.setBounds(rect);
            this.f5073b.setAlpha((int) (this.h * 255.0f));
            this.f5073b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f5072a;
        imageReceiver.y0(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.h(canvas, null);
    }

    public final void b(boolean z10) {
        this.f5077g = z10;
        ImageReceiver imageReceiver = this.f5072a;
        if (z10) {
            imageReceiver.P();
            g5 g5Var = this.f5073b;
            if (g5Var != null) {
                g5Var.a(this.f5076f);
                return;
            }
            return;
        }
        imageReceiver.R();
        g5 g5Var2 = this.f5073b;
        if (g5Var2 != null) {
            g5Var2.n(this.f5076f);
        }
    }

    public final void c(Rect rect) {
        this.f5074c.set(rect);
    }

    public final void d(int i7) {
        if (this.f5079j != i7) {
            this.f5079j = i7;
            this.f5080k = new PorterDuffColorFilter(this.f5079j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f5076f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(p0 p0Var) {
        String str;
        int i7;
        if (!Objects.equals(this.f5075e, p0Var)) {
            ImageReceiver imageReceiver = this.f5072a;
            imageReceiver.f();
            g5 g5Var = this.f5073b;
            if (g5Var != null) {
                g5Var.n(this.f5076f);
                this.f5073b = null;
            }
            this.f5075e = p0Var;
            boolean z10 = this.f5078i;
            if (z10) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            if (p0Var.f5188f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) si.b0(this.d).f26495r.get(p0Var.f5188f);
                if (tL_availableReaction != null) {
                    imageReceiver.r0(gc.b(tL_availableReaction.select_animation), str, null, null, t5.f(tL_availableReaction.select_animation, j6.f29014m6, 0.2f, null), 0L, "tgs", p0Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i7 = 13;
            } else {
                i7 = 1;
            }
            g5 g5Var2 = new g5(i7, m10.f24934t0, p0Var.f5189g);
            this.f5073b = g5Var2;
            if (this.f5077g) {
                g5Var2.a(this.f5076f);
            }
            g5 g5Var3 = this.f5073b;
            this.f5079j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f5080k = porterDuffColorFilter;
            g5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
