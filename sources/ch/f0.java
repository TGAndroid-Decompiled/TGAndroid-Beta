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
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.h5;
public final class f0 {
    public final ImageReceiver f6244a;
    public h5 f6245b;
    public o0 f6247e;
    public View f6248f;
    public boolean f6249g;
    public boolean f6250i;
    public int f6251j;
    public PorterDuffColorFilter f6252k;
    public final Rect f6246c = new Rect();
    public final int d = p10.f24474s0;
    public float h = 1.0f;

    public f0(View view) {
        this.f6248f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f6244a = imageReceiver;
        imageReceiver.f21241z1 = true;
    }

    public final void a(Canvas canvas) {
        h5 h5Var = this.f6245b;
        Rect rect = this.f6246c;
        if (h5Var != null) {
            z2 z2Var = h5Var.f34176k;
            if (z2Var != null) {
                z2Var.J0((int) (rect.width() * 0.1f));
            }
            this.f6245b.setColorFilter(this.f6252k);
            this.f6245b.setBounds(rect);
            this.f6245b.setAlpha((int) (this.h * 255.0f));
            this.f6245b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f6244a;
        imageReceiver.y0(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.h(canvas, null);
    }

    public final void b(boolean z9) {
        this.f6249g = z9;
        ImageReceiver imageReceiver = this.f6244a;
        if (z9) {
            imageReceiver.P();
            h5 h5Var = this.f6245b;
            if (h5Var != null) {
                h5Var.a(this.f6248f);
                return;
            }
            return;
        }
        imageReceiver.R();
        h5 h5Var2 = this.f6245b;
        if (h5Var2 != null) {
            h5Var2.n(this.f6248f);
        }
    }

    public final void c(Rect rect) {
        this.f6246c.set(rect);
    }

    public final void d(int i7) {
        if (this.f6251j != i7) {
            this.f6251j = i7;
            this.f6252k = new PorterDuffColorFilter(this.f6251j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f6248f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(o0 o0Var) {
        String str;
        int i7;
        if (!Objects.equals(this.f6247e, o0Var)) {
            ImageReceiver imageReceiver = this.f6244a;
            imageReceiver.f();
            h5 h5Var = this.f6245b;
            if (h5Var != null) {
                h5Var.n(this.f6248f);
                this.f6245b = null;
            }
            this.f6247e = o0Var;
            boolean z9 = this.f6250i;
            if (z9) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            if (o0Var.f6359f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(this.d).f25840r.get(o0Var.f6359f);
                if (tL_availableReaction != null) {
                    imageReceiver.r0(hc.b(tL_availableReaction.select_animation), str, null, null, t5.f(tL_availableReaction.select_animation, m6.f28055m6, 0.2f, null), 0L, "tgs", o0Var, 0);
                    return;
                }
                return;
            }
            if (z9) {
                i7 = 13;
            } else {
                i7 = 1;
            }
            h5 h5Var2 = new h5(i7, p10.f24474s0, o0Var.f6360g);
            this.f6245b = h5Var2;
            if (this.f6249g) {
                h5Var2.a(this.f6248f);
            }
            h5 h5Var3 = this.f6245b;
            this.f6251j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f6252k = porterDuffColorFilter;
            h5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
