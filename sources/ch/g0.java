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
import org.telegram.messenger.i10;
import org.telegram.messenger.ri;
import org.telegram.messenger.u5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.o5;
public final class g0 {
    public final ImageReceiver f5353a;
    public o5 f5354b;
    public p0 f5356e;
    public View f5357f;
    public boolean f5358g;
    public boolean f5359i;
    public int f5360j;
    public PorterDuffColorFilter f5361k;
    public final Rect f5355c = new Rect();
    public final int d = i10.f24637t0;
    public float h = 1.0f;

    public g0(View view) {
        this.f5357f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f5353a = imageReceiver;
        imageReceiver.A1 = true;
    }

    public final void a(Canvas canvas) {
        o5 o5Var = this.f5354b;
        Rect rect = this.f5355c;
        if (o5Var != null) {
            s2 s2Var = o5Var.f38028k;
            if (s2Var != null) {
                s2Var.K0((int) (rect.width() * 0.1f));
            }
            this.f5354b.setColorFilter(this.f5361k);
            this.f5354b.setBounds(rect);
            this.f5354b.setAlpha((int) (this.h * 255.0f));
            this.f5354b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f5353a;
        imageReceiver.z0(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.h(canvas, null);
    }

    public final void b(boolean z10) {
        this.f5358g = z10;
        ImageReceiver imageReceiver = this.f5353a;
        if (z10) {
            imageReceiver.Q();
            o5 o5Var = this.f5354b;
            if (o5Var != null) {
                o5Var.a(this.f5357f);
                return;
            }
            return;
        }
        imageReceiver.S();
        o5 o5Var2 = this.f5354b;
        if (o5Var2 != null) {
            o5Var2.n(this.f5357f);
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
            o5 o5Var = this.f5354b;
            if (o5Var != null) {
                o5Var.n(this.f5357f);
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
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ri.d0(this.d).f26734r.get(p0Var.f5470f);
                if (tL_availableReaction != null) {
                    imageReceiver.s0(fc.b(tL_availableReaction.select_animation), str, null, null, u5.f(tL_availableReaction.select_animation, n6.f29616m6, 0.2f, null), 0L, "tgs", p0Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i7 = 13;
            } else {
                i7 = 1;
            }
            o5 o5Var2 = new o5(i7, i10.f24637t0, p0Var.f5471g);
            this.f5354b = o5Var2;
            if (this.f5358g) {
                o5Var2.a(this.f5357f);
            }
            o5 o5Var3 = this.f5354b;
            this.f5360j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f5361k = porterDuffColorFilter;
            o5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
