package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ja;
import c8.na;
import org.telegram.ui.Components.er;
public final class l1 extends FrameLayout {
    public final FrameLayout f11978a;
    public final View f11979b;
    public final ImageView f11980c;
    public final k1 d;
    public boolean f11981e;
    public ValueAnimator f11982f;
    public boolean h;
    public float f11983n;
    public ValueAnimator f11984r;

    public l1(Context context, gh.b bVar) {
        super(context);
        na.a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f11978a = frameLayout;
        dh.j jVar = new dh.j();
        jVar.f8163a = bVar;
        jVar.a();
        jVar.f8168g.setColor(-14670806);
        jVar.invalidateSelf();
        jVar.f8167f = org.telegram.messenger.g0.L(1.0f);
        frameLayout.setBackground(jVar);
        addView(frameLayout, ja.e(40, 40, 17));
        View view = new View(context);
        this.f11979b = view;
        view.setBackground(org.telegram.ui.ActionBar.j6.L(org.telegram.messenger.g0.L(40.0f), -13522392));
        frameLayout.addView(view, ja.e(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        k1 k1Var = new k1(context);
        this.d = k1Var;
        addView(k1Var, ja.e(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.f11980c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, ja.e(40, 40, 17));
        b(false, false);
    }

    public final void a(boolean z10, boolean z11) {
        int i7;
        if (this.f11981e == z10 && z11) {
            return;
        }
        this.f11981e = z10;
        ValueAnimator valueAnimator = this.f11982f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f11982f = null;
        }
        boolean z12 = true;
        float f10 = 1.0f;
        k1 k1Var = this.d;
        if (!z11) {
            if (z10) {
                f10 = 0.0f;
            }
            k1Var.setAlpha(f10);
            if (z10) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            k1Var.setVisibility(i7);
        } else {
            k1Var.setVisibility(0);
            float alpha = k1Var.getAlpha();
            if (z10) {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
            this.f11982f = ofFloat;
            ofFloat.addUpdateListener(new j1(this, 0));
            this.f11982f.setDuration(320L);
            this.f11982f.setInterpolator(er.h);
            this.f11982f.start();
        }
        if (!this.h && z10) {
            z12 = false;
        }
        c(z12, z11);
    }

    public final void b(boolean z10, boolean z11) {
        boolean z12;
        this.h = z10;
        int i7 = 2131232432;
        ImageView imageView = this.f11980c;
        if (!z11) {
            if (z10) {
                i7 = 2131232428;
            }
            org.telegram.messenger.g0.Q3(imageView, i7);
        } else {
            if (z10) {
                i7 = 2131232428;
            }
            imageView.setImageResource(i7);
        }
        if (!z10 && this.f11981e) {
            z12 = false;
        } else {
            z12 = true;
        }
        c(z12, z11);
    }

    public final void c(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f11984r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f11984r = null;
        }
        float f10 = 0.0f;
        if (!z11) {
            if (z10) {
                f10 = 1.0f;
            }
            this.f11983n = f10;
            View view = this.f11979b;
            view.setAlpha(1.0f - f10);
            view.setScaleX(1.0f - this.f11983n);
            view.setScaleY(1.0f - this.f11983n);
            this.f11980c.setColorFilter(new PorterDuffColorFilter(i0.a.f(this.f11983n, -1, -2960428), PorterDuff.Mode.SRC_IN));
            this.f11978a.invalidate();
            return;
        }
        float f11 = this.f11983n;
        if (z10) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f11984r = ofFloat;
        ofFloat.addUpdateListener(new j1(this, 1));
        this.f11984r.setInterpolator(er.h);
        this.f11984r.setDuration(420L);
        this.f11984r.start();
    }
}
