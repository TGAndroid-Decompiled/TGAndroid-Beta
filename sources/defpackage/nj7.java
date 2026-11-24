package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class nj7 extends FrameLayout {
    public final FrameLayout a;
    public final View b;
    public final ImageView c;
    public final fp0 d;
    public boolean e;
    public ValueAnimator f;
    public boolean h;
    public float n;
    public ValueAnimator r;

    public nj7(Context context, bm0 bm0Var) {
        super(context);
        rve.a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        wbb wbbVar = new wbb();
        wbbVar.a = bm0Var;
        wbbVar.a();
        wbbVar.g.setColor(-14670806);
        wbbVar.invalidateSelf();
        wbbVar.f = gm.L(1.0f);
        frameLayout.setBackground(wbbVar);
        addView(frameLayout, qoe.e(40, 40, 17));
        View view = new View(context);
        this.b = view;
        view.setBackground(cmb.K(gm.L(40.0f), -13522392));
        frameLayout.addView(view, qoe.e(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        fp0 fp0Var = new fp0(context);
        this.d = fp0Var;
        addView(fp0Var, qoe.e(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, qoe.e(40, 40, 17));
        b(false, false);
    }

    public final void a(boolean z, boolean z2) {
        int i;
        if (this.e == z && z2) {
            return;
        }
        this.e = z;
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f = null;
        }
        boolean z3 = true;
        float f = 1.0f;
        fp0 fp0Var = this.d;
        if (!z2) {
            if (z) {
                f = 0.0f;
            }
            fp0Var.setAlpha(f);
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            fp0Var.setVisibility(i);
        } else {
            fp0Var.setVisibility(0);
            float alpha = fp0Var.getAlpha();
            if (z) {
                f = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f);
            this.f = ofFloat;
            ofFloat.addUpdateListener(new mj7(this, (byte) 0));
            this.f.setDuration(320L);
            this.f.setInterpolator(d53.h);
            this.f.start();
        }
        if (!this.h && z) {
            z3 = false;
        }
        c(z3, z2);
    }

    public final void b(boolean z, boolean z2) {
        boolean z3;
        this.h = z;
        int i = 2131232437;
        ImageView imageView = this.c;
        if (!z2) {
            if (z) {
                i = 2131232433;
            }
            gm.L3(imageView, i);
        } else {
            if (z) {
                i = 2131232433;
            }
            imageView.setImageResource(i);
        }
        if (!z && this.e) {
            z3 = false;
        } else {
            z3 = true;
        }
        c(z3, z2);
    }

    public final void c(boolean z, boolean z2) {
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.r = null;
        }
        float f = 0.0f;
        if (!z2) {
            if (z) {
                f = 1.0f;
            }
            this.n = f;
            View view = this.b;
            view.setAlpha(1.0f - f);
            view.setScaleX(1.0f - this.n);
            view.setScaleY(1.0f - this.n);
            this.c.setColorFilter(new PorterDuffColorFilter(on2.f(this.n, -1, -2960428), PorterDuff.Mode.SRC_IN));
            this.a.invalidate();
            return;
        }
        float f2 = this.n;
        if (z) {
            f = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.r = ofFloat;
        ofFloat.addUpdateListener(new mj7(this, (byte) 1));
        this.r.setInterpolator(d53.h);
        this.r.setDuration(420L);
        this.r.start();
    }
}
