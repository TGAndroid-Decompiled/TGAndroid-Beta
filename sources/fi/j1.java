package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ma;
import c8.ra;
import org.telegram.ui.Components.nr;
public final class j1 extends FrameLayout {
    public final FrameLayout f12168a;
    public final View f12169b;
    public final ImageView f12170c;
    public final i1 d;
    public boolean f12171e;
    public ValueAnimator f12172f;
    public boolean h;
    public float f12173n;
    public ValueAnimator f12174r;

    public j1(Context context, gh.b bVar) {
        super(context);
        ra.a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f12168a = frameLayout;
        dh.j jVar = new dh.j();
        jVar.f8471a = bVar;
        jVar.a();
        jVar.f8476g.setColor(-14670806);
        jVar.invalidateSelf();
        jVar.f8475f = org.telegram.messenger.g0.L(1.0f);
        frameLayout.setBackground(jVar);
        addView(frameLayout, ma.e(40, 40, 17));
        View view = new View(context);
        this.f12169b = view;
        view.setBackground(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(40.0f), -13522392));
        frameLayout.addView(view, ma.e(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        i1 i1Var = new i1(context);
        this.d = i1Var;
        addView(i1Var, ma.e(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.f12170c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, ma.e(40, 40, 17));
        b(false, false);
    }

    public final void a(boolean z10, boolean z11) {
        int i7;
        if (this.f12171e == z10 && z11) {
            return;
        }
        this.f12171e = z10;
        ValueAnimator valueAnimator = this.f12172f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f12172f = null;
        }
        boolean z12 = true;
        float f10 = 1.0f;
        i1 i1Var = this.d;
        if (!z11) {
            if (z10) {
                f10 = 0.0f;
            }
            i1Var.setAlpha(f10);
            if (z10) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            i1Var.setVisibility(i7);
        } else {
            i1Var.setVisibility(0);
            float alpha = i1Var.getAlpha();
            if (z10) {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
            this.f12172f = ofFloat;
            ofFloat.addUpdateListener(new h1(this, 0));
            this.f12172f.setDuration(320L);
            this.f12172f.setInterpolator(nr.h);
            this.f12172f.start();
        }
        if (!this.h && z10) {
            z12 = false;
        }
        c(z12, z11);
    }

    public final void b(boolean z10, boolean z11) {
        boolean z12;
        this.h = z10;
        int i7 = 2131232433;
        ImageView imageView = this.f12170c;
        if (!z11) {
            if (z10) {
                i7 = 2131232429;
            }
            org.telegram.messenger.g0.P3(imageView, i7);
        } else {
            if (z10) {
                i7 = 2131232429;
            }
            imageView.setImageResource(i7);
        }
        if (!z10 && this.f12171e) {
            z12 = false;
        } else {
            z12 = true;
        }
        c(z12, z11);
    }

    public final void c(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f12174r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f12174r = null;
        }
        float f10 = 0.0f;
        if (!z11) {
            if (z10) {
                f10 = 1.0f;
            }
            this.f12173n = f10;
            View view = this.f12169b;
            view.setAlpha(1.0f - f10);
            view.setScaleX(1.0f - this.f12173n);
            view.setScaleY(1.0f - this.f12173n);
            this.f12170c.setColorFilter(new PorterDuffColorFilter(i0.a.f(this.f12173n, -1, -2960428), PorterDuff.Mode.SRC_IN));
            this.f12168a.invalidate();
            return;
        }
        float f11 = this.f12173n;
        if (z10) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f12174r = ofFloat;
        ofFloat.addUpdateListener(new h1(this, 1));
        this.f12174r.setInterpolator(nr.h);
        this.f12174r.setDuration(420L);
        this.f12174r.start();
    }
}
