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
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.p5;
public final class g0 {
    public final ImageReceiver f5387a;
    public p5 f5388b;
    public p0 f5390e;
    public View f5391f;
    public boolean f5392g;
    public boolean f5393i;
    public int f5394j;
    public PorterDuffColorFilter f5395k;
    public final Rect f5389c = new Rect();
    public final int d = j10.f24798t0;
    public float h = 1.0f;

    public g0(View view) {
        this.f5391f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f5387a = imageReceiver;
        imageReceiver.A1 = true;
    }

    public final void a(Canvas canvas) {
        p5 p5Var = this.f5388b;
        Rect rect = this.f5389c;
        if (p5Var != null) {
            s2 s2Var = p5Var.f38501k;
            if (s2Var != null) {
                s2Var.J0((int) (rect.width() * 0.1f));
            }
            this.f5388b.setColorFilter(this.f5395k);
            this.f5388b.setBounds(rect);
            this.f5388b.setAlpha((int) (this.h * 255.0f));
            this.f5388b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f5387a;
        imageReceiver.y0(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.h(canvas, null);
    }

    public final void b(boolean z10) {
        this.f5392g = z10;
        ImageReceiver imageReceiver = this.f5387a;
        if (z10) {
            imageReceiver.P();
            p5 p5Var = this.f5388b;
            if (p5Var != null) {
                p5Var.a(this.f5391f);
                return;
            }
            return;
        }
        imageReceiver.R();
        p5 p5Var2 = this.f5388b;
        if (p5Var2 != null) {
            p5Var2.n(this.f5391f);
        }
    }

    public final void c(Rect rect) {
        this.f5389c.set(rect);
    }

    public final void d(int i7) {
        if (this.f5394j != i7) {
            this.f5394j = i7;
            this.f5395k = new PorterDuffColorFilter(this.f5394j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f5391f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(p0 p0Var) {
        String str;
        int i7;
        if (!Objects.equals(this.f5390e, p0Var)) {
            ImageReceiver imageReceiver = this.f5387a;
            imageReceiver.f();
            p5 p5Var = this.f5388b;
            if (p5Var != null) {
                p5Var.n(this.f5391f);
                this.f5388b = null;
            }
            this.f5390e = p0Var;
            boolean z10 = this.f5393i;
            if (z10) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            if (p0Var.f5504f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ri.d0(this.d).f26661r.get(p0Var.f5504f);
                if (tL_availableReaction != null) {
                    imageReceiver.r0(fc.b(tL_availableReaction.select_animation), str, null, null, u5.f(tL_availableReaction.select_animation, m6.f29543m6, 0.2f, null), 0L, "tgs", p0Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i7 = 13;
            } else {
                i7 = 1;
            }
            p5 p5Var2 = new p5(i7, j10.f24798t0, p0Var.f5505g);
            this.f5388b = p5Var2;
            if (this.f5392g) {
                p5Var2.a(this.f5391f);
            }
            p5 p5Var3 = this.f5388b;
            this.f5394j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f5395k = porterDuffColorFilter;
            p5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
