package dh;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import ei.c3;
import j$.util.Objects;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.h10;
import org.telegram.messenger.li;
import org.telegram.messenger.t5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g5;
public final class e0 {
    public final ImageReceiver f8990a;
    public g5 f8991b;
    public n0 f8993e;
    public View f8994f;
    public boolean f8995g;
    public boolean f8996i;
    public int f8997j;
    public PorterDuffColorFilter f8998k;
    public final Rect f8992c = new Rect();
    public final int d = h10.f22829t0;
    public float h = 1.0f;

    public e0(View view) {
        this.f8994f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f8990a = imageReceiver;
        imageReceiver.A1 = true;
    }

    public final void a(Canvas canvas) {
        g5 g5Var = this.f8991b;
        Rect rect = this.f8992c;
        if (g5Var != null) {
            c3 c3Var = g5Var.f33971k;
            if (c3Var != null) {
                c3Var.J0((int) (rect.width() * 0.1f));
            }
            this.f8991b.setColorFilter(this.f8998k);
            this.f8991b.setBounds(rect);
            this.f8991b.setAlpha((int) (this.h * 255.0f));
            this.f8991b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f8990a;
        imageReceiver.y0(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.h(canvas, null);
    }

    public final void b(boolean z10) {
        this.f8995g = z10;
        ImageReceiver imageReceiver = this.f8990a;
        if (z10) {
            imageReceiver.P();
            g5 g5Var = this.f8991b;
            if (g5Var != null) {
                g5Var.a(this.f8994f);
                return;
            }
            return;
        }
        imageReceiver.R();
        g5 g5Var2 = this.f8991b;
        if (g5Var2 != null) {
            g5Var2.n(this.f8994f);
        }
    }

    public final void c(Rect rect) {
        this.f8992c.set(rect);
    }

    public final void d(int i3) {
        if (this.f8997j != i3) {
            this.f8997j = i3;
            this.f8998k = new PorterDuffColorFilter(this.f8997j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f8994f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(n0 n0Var) {
        String str;
        int i3;
        if (!Objects.equals(this.f8993e, n0Var)) {
            ImageReceiver imageReceiver = this.f8990a;
            imageReceiver.f();
            g5 g5Var = this.f8991b;
            if (g5Var != null) {
                g5Var.n(this.f8994f);
                this.f8991b = null;
            }
            this.f8993e = n0Var;
            boolean z10 = this.f8996i;
            if (z10) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            if (n0Var.f9097f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) li.b0(this.d).f24045r.get(n0Var.f9097f);
                if (tL_availableReaction != null) {
                    imageReceiver.r0(ac.b(tL_availableReaction.select_animation), str, null, null, t5.f(tL_availableReaction.select_animation, k6.f28043m6, 0.2f, null), 0L, "tgs", n0Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i3 = 13;
            } else {
                i3 = 1;
            }
            g5 g5Var2 = new g5(i3, h10.f22829t0, n0Var.f9098g);
            this.f8991b = g5Var2;
            if (this.f8995g) {
                g5Var2.a(this.f8994f);
            }
            g5 g5Var3 = this.f8991b;
            this.f8997j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f8998k = porterDuffColorFilter;
            g5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
