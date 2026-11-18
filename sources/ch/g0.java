package ch;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import fi.s2;
import j$.util.Objects;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.j10;
import org.telegram.messenger.ri;
import org.telegram.messenger.u5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.o5;
public final class g0 {
    public final ImageReceiver f5361a;
    public o5 f5362b;
    public p0 f5364e;
    public View f5365f;
    public boolean f5366g;
    public boolean f5367i;
    public int f5368j;
    public PorterDuffColorFilter f5369k;
    public final Rect f5363c = new Rect();
    public final int d = j10.f24773t0;
    public float h = 1.0f;

    public g0(View view) {
        this.f5365f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f5361a = imageReceiver;
        imageReceiver.A1 = true;
    }

    public final void a(Canvas canvas) {
        o5 o5Var = this.f5362b;
        Rect rect = this.f5363c;
        if (o5Var != null) {
            s2 s2Var = o5Var.f37976k;
            if (s2Var != null) {
                s2Var.J0((int) (rect.width() * 0.1f));
            }
            this.f5362b.setColorFilter(this.f5369k);
            this.f5362b.setBounds(rect);
            this.f5362b.setAlpha((int) (this.h * 255.0f));
            this.f5362b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f5361a;
        imageReceiver.y0(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.h(canvas, null);
    }

    public final void b(boolean z10) {
        this.f5366g = z10;
        ImageReceiver imageReceiver = this.f5361a;
        if (z10) {
            imageReceiver.P();
            o5 o5Var = this.f5362b;
            if (o5Var != null) {
                o5Var.a(this.f5365f);
                return;
            }
            return;
        }
        imageReceiver.R();
        o5 o5Var2 = this.f5362b;
        if (o5Var2 != null) {
            o5Var2.n(this.f5365f);
        }
    }

    public final void c(Rect rect) {
        this.f5363c.set(rect);
    }

    public final void d(int i7) {
        if (this.f5368j != i7) {
            this.f5368j = i7;
            this.f5369k = new PorterDuffColorFilter(this.f5368j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f5365f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(p0 p0Var) {
        String str;
        int i7;
        if (!Objects.equals(this.f5364e, p0Var)) {
            ImageReceiver imageReceiver = this.f5361a;
            imageReceiver.f();
            o5 o5Var = this.f5362b;
            if (o5Var != null) {
                o5Var.n(this.f5365f);
                this.f5362b = null;
            }
            this.f5364e = p0Var;
            boolean z10 = this.f5367i;
            if (z10) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            if (p0Var.f5478f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ri.d0(this.d).f26635r.get(p0Var.f5478f);
                if (tL_availableReaction != null) {
                    imageReceiver.r0(fc.b(tL_availableReaction.select_animation), str, null, null, u5.f(tL_availableReaction.select_animation, n6.f29561m6, 0.2f, null), 0L, "tgs", p0Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i7 = 13;
            } else {
                i7 = 1;
            }
            o5 o5Var2 = new o5(i7, j10.f24773t0, p0Var.f5479g);
            this.f5362b = o5Var2;
            if (this.f5366g) {
                o5Var2.a(this.f5365f);
            }
            o5 o5Var3 = this.f5362b;
            this.f5368j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f5369k = porterDuffColorFilter;
            o5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
