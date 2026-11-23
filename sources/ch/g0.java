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
    public final ImageReceiver f5353a;
    public p5 f5354b;
    public p0 f5356e;
    public View f5357f;
    public boolean f5358g;
    public boolean f5359i;
    public int f5360j;
    public PorterDuffColorFilter f5361k;
    public final Rect f5355c = new Rect();
    public final int d = k10.f24932t0;
    public float h = 1.0f;

    public g0(View view) {
        this.f5357f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f5353a = imageReceiver;
        imageReceiver.A1 = true;
    }

    public final void a(Canvas canvas) {
        p5 p5Var = this.f5354b;
        Rect rect = this.f5355c;
        if (p5Var != null) {
            s2 s2Var = p5Var.f38457k;
            if (s2Var != null) {
                s2Var.J0((int) (rect.width() * 0.1f));
            }
            this.f5354b.setColorFilter(this.f5361k);
            this.f5354b.setBounds(rect);
            this.f5354b.setAlpha((int) (this.h * 255.0f));
            this.f5354b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f5353a;
        imageReceiver.y0(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.h(canvas, null);
    }

    public final void b(boolean z10) {
        this.f5358g = z10;
        ImageReceiver imageReceiver = this.f5353a;
        if (z10) {
            imageReceiver.P();
            p5 p5Var = this.f5354b;
            if (p5Var != null) {
                p5Var.a(this.f5357f);
                return;
            }
            return;
        }
        imageReceiver.R();
        p5 p5Var2 = this.f5354b;
        if (p5Var2 != null) {
            p5Var2.n(this.f5357f);
        }
    }

    public final void c(Rect rect) {
        this.f5355c.set(rect);
    }

    public final void d(int i7) {
        if (this.f5360j != i7) {
            this.f5360j = i7;
            this.f5361k = new PorterDuffColorFilter(this.f5360j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f5357f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(p0 p0Var) {
        String str;
        int i7;
        if (!Objects.equals(this.f5356e, p0Var)) {
            ImageReceiver imageReceiver = this.f5353a;
            imageReceiver.f();
            p5 p5Var = this.f5354b;
            if (p5Var != null) {
                p5Var.n(this.f5357f);
                this.f5354b = null;
            }
            this.f5356e = p0Var;
            boolean z10 = this.f5359i;
            if (z10) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            if (p0Var.f5470f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) si.d0(this.d).f26811r.get(p0Var.f5470f);
                if (tL_availableReaction != null) {
                    imageReceiver.r0(gc.b(tL_availableReaction.select_animation), str, null, null, u5.f(tL_availableReaction.select_animation, m6.f29512m6, 0.2f, null), 0L, "tgs", p0Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i7 = 13;
            } else {
                i7 = 1;
            }
            p5 p5Var2 = new p5(i7, k10.f24932t0, p0Var.f5471g);
            this.f5354b = p5Var2;
            if (this.f5358g) {
                p5Var2.a(this.f5357f);
            }
            p5 p5Var3 = this.f5354b;
            this.f5360j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f5361k = porterDuffColorFilter;
            p5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
