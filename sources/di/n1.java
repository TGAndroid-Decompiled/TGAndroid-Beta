package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ha;
import c8.ka;
import org.telegram.ui.Components.wq;
public final class n1 extends FrameLayout {
    public final FrameLayout f9383a;
    public final View f9384b;
    public final ImageView f9385c;
    public final m1 d;
    public boolean f9386e;
    public ValueAnimator f9387f;
    public boolean h;
    public float f9388n;
    public ValueAnimator f9389r;

    public n1(Context context, gh.b bVar) {
        super(context);
        ka.a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9383a = frameLayout;
        dh.j jVar = new dh.j();
        jVar.f8776a = bVar;
        jVar.a();
        jVar.f8781g.setColor(-14670806);
        jVar.invalidateSelf();
        jVar.f8780f = org.telegram.messenger.g0.L(1.0f);
        frameLayout.setBackground(jVar);
        addView(frameLayout, ha.e(40, 40, 17));
        View view = new View(context);
        this.f9384b = view;
        view.setBackground(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(40.0f), -13522392));
        frameLayout.addView(view, ha.e(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        m1 m1Var = new m1(context);
        this.d = m1Var;
        addView(m1Var, ha.e(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.f9385c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, ha.e(40, 40, 17));
        b(false, false);
    }

    public final void a(boolean z9, boolean z10) {
        int i7;
        if (this.f9386e == z9 && z10) {
            return;
        }
        this.f9386e = z9;
        ValueAnimator valueAnimator = this.f9387f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f9387f = null;
        }
        boolean z11 = true;
        float f10 = 1.0f;
        m1 m1Var = this.d;
        if (!z10) {
            if (z9) {
                f10 = 0.0f;
            }
            m1Var.setAlpha(f10);
            if (z9) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            m1Var.setVisibility(i7);
        } else {
            m1Var.setVisibility(0);
            float alpha = m1Var.getAlpha();
            if (z9) {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
            this.f9387f = ofFloat;
            ofFloat.addUpdateListener(new l1(this, 0));
            this.f9387f.setDuration(320L);
            this.f9387f.setInterpolator(wq.h);
            this.f9387f.start();
        }
        if (!this.h && z9) {
            z11 = false;
        }
        c(z11, z10);
    }

    public final void b(boolean z9, boolean z10) {
        boolean z11;
        this.h = z9;
        int i7 = 2131232431;
        ImageView imageView = this.f9385c;
        if (!z10) {
            if (z9) {
                i7 = 2131232427;
            }
            org.telegram.messenger.g0.R3(imageView, i7);
        } else {
            if (z9) {
                i7 = 2131232427;
            }
            imageView.setImageResource(i7);
        }
        if (!z9 && this.f9386e) {
            z11 = false;
        } else {
            z11 = true;
        }
        c(z11, z10);
    }

    public final void c(boolean z9, boolean z10) {
        ValueAnimator valueAnimator = this.f9389r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f9389r = null;
        }
        float f10 = 0.0f;
        if (!z10) {
            if (z9) {
                f10 = 1.0f;
            }
            this.f9388n = f10;
            View view = this.f9384b;
            view.setAlpha(1.0f - f10);
            view.setScaleX(1.0f - this.f9388n);
            view.setScaleY(1.0f - this.f9388n);
            this.f9385c.setColorFilter(new PorterDuffColorFilter(i0.a.f(this.f9388n, -1, -2960428), PorterDuff.Mode.SRC_IN));
            this.f9383a.invalidate();
            return;
        }
        float f11 = this.f9388n;
        if (z9) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f9389r = ofFloat;
        ofFloat.addUpdateListener(new l1(this, 1));
        this.f9389r.setInterpolator(wq.h);
        this.f9389r.setDuration(420L);
        this.f9389r.start();
    }
}
