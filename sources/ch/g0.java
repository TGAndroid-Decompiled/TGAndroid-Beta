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
    public final ImageReceiver f5358a;
    public o5 f5359b;
    public p0 f5361e;
    public View f5362f;
    public boolean f5363g;
    public boolean f5364i;
    public int f5365j;
    public PorterDuffColorFilter f5366k;
    public final Rect f5360c = new Rect();
    public final int d = j10.f24770t0;
    public float h = 1.0f;

    public g0(View view) {
        this.f5362f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f5358a = imageReceiver;
        imageReceiver.A1 = true;
    }

    public final void a(Canvas canvas) {
        o5 o5Var = this.f5359b;
        Rect rect = this.f5360c;
        if (o5Var != null) {
            s2 s2Var = o5Var.f37976k;
            if (s2Var != null) {
                s2Var.J0((int) (rect.width() * 0.1f));
            }
            this.f5359b.setColorFilter(this.f5366k);
            this.f5359b.setBounds(rect);
            this.f5359b.setAlpha((int) (this.h * 255.0f));
            this.f5359b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f5358a;
        imageReceiver.y0(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.h(canvas, null);
    }

    public final void b(boolean z10) {
        this.f5363g = z10;
        ImageReceiver imageReceiver = this.f5358a;
        if (z10) {
            imageReceiver.P();
            o5 o5Var = this.f5359b;
            if (o5Var != null) {
                o5Var.a(this.f5362f);
                return;
            }
            return;
        }
        imageReceiver.R();
        o5 o5Var2 = this.f5359b;
        if (o5Var2 != null) {
            o5Var2.n(this.f5362f);
        }
    }

    public final void c(Rect rect) {
        this.f5360c.set(rect);
    }

    public final void d(int i7) {
        if (this.f5365j != i7) {
            this.f5365j = i7;
            this.f5366k = new PorterDuffColorFilter(this.f5365j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f5362f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(p0 p0Var) {
        String str;
        int i7;
        if (!Objects.equals(this.f5361e, p0Var)) {
            ImageReceiver imageReceiver = this.f5358a;
            imageReceiver.f();
            o5 o5Var = this.f5359b;
            if (o5Var != null) {
                o5Var.n(this.f5362f);
                this.f5359b = null;
            }
            this.f5361e = p0Var;
            boolean z10 = this.f5364i;
            if (z10) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            if (p0Var.f5475f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ri.d0(this.d).f26633r.get(p0Var.f5475f);
                if (tL_availableReaction != null) {
                    imageReceiver.r0(fc.b(tL_availableReaction.select_animation), str, null, null, u5.f(tL_availableReaction.select_animation, n6.f29559m6, 0.2f, null), 0L, "tgs", p0Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i7 = 13;
            } else {
                i7 = 1;
            }
            o5 o5Var2 = new o5(i7, j10.f24770t0, p0Var.f5476g);
            this.f5359b = o5Var2;
            if (this.f5363g) {
                o5Var2.a(this.f5362f);
            }
            o5 o5Var3 = this.f5359b;
            this.f5365j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f5366k = porterDuffColorFilter;
            o5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
