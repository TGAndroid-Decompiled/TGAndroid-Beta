package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.na;
import c8.sa;
import org.telegram.ui.Components.kr;
public final class j1 extends FrameLayout {
    public final FrameLayout f12133a;
    public final View f12134b;
    public final ImageView f12135c;
    public final i1 d;
    public boolean f12136e;
    public ValueAnimator f12137f;
    public boolean h;
    public float f12138n;
    public ValueAnimator f12139r;

    public j1(Context context, gh.b bVar) {
        super(context);
        sa.a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f12133a = frameLayout;
        dh.j jVar = new dh.j();
        jVar.f8436a = bVar;
        jVar.a();
        jVar.f8441g.setColor(-14670806);
        jVar.invalidateSelf();
        jVar.f8440f = org.telegram.messenger.g0.L(1.0f);
        frameLayout.setBackground(jVar);
        addView(frameLayout, na.e(40, 40, 17));
        View view = new View(context);
        this.f12134b = view;
        view.setBackground(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(40.0f), -13522392));
        frameLayout.addView(view, na.e(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        i1 i1Var = new i1(context);
        this.d = i1Var;
        addView(i1Var, na.e(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.f12135c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, na.e(40, 40, 17));
        b(false, false);
    }

    public final void a(boolean z10, boolean z11) {
        int i7;
        if (this.f12136e == z10 && z11) {
            return;
        }
        this.f12136e = z10;
        ValueAnimator valueAnimator = this.f12137f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f12137f = null;
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
            this.f12137f = ofFloat;
            ofFloat.addUpdateListener(new h1(this, 0));
            this.f12137f.setDuration(320L);
            this.f12137f.setInterpolator(kr.h);
            this.f12137f.start();
        }
        if (!this.h && z10) {
            z12 = false;
        }
        c(z12, z11);
    }

    public final void b(boolean z10, boolean z11) {
        boolean z12;
        this.h = z10;
        int i7 = 2131232436;
        ImageView imageView = this.f12135c;
        if (!z11) {
            if (z10) {
                i7 = 2131232432;
            }
            org.telegram.messenger.g0.P3(imageView, i7);
        } else {
            if (z10) {
                i7 = 2131232432;
            }
            imageView.setImageResource(i7);
        }
        if (!z10 && this.f12136e) {
            z12 = false;
        } else {
            z12 = true;
        }
        c(z12, z11);
    }

    public final void c(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f12139r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f12139r = null;
        }
        float f10 = 0.0f;
        if (!z11) {
            if (z10) {
                f10 = 1.0f;
            }
            this.f12138n = f10;
            View view = this.f12134b;
            view.setAlpha(1.0f - f10);
            view.setScaleX(1.0f - this.f12138n);
            view.setScaleY(1.0f - this.f12138n);
            this.f12135c.setColorFilter(new PorterDuffColorFilter(i0.a.f(this.f12138n, -1, -2960428), PorterDuff.Mode.SRC_IN));
            this.f12133a.invalidate();
            return;
        }
        float f11 = this.f12138n;
        if (z10) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f12139r = ofFloat;
        ofFloat.addUpdateListener(new h1(this, 1));
        this.f12139r.setInterpolator(kr.h);
        this.f12139r.setDuration(420L);
        this.f12139r.start();
    }
}
