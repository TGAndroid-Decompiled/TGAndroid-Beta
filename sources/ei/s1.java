package ei;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import b8.pf;
import org.telegram.ui.Components.xq;
public final class s1 extends FrameLayout {
    public final FrameLayout f10977a;
    public final View f10978b;
    public final ImageView f10979c;
    public final r1 d;
    public boolean f10980e;
    public ValueAnimator f10981f;
    public boolean h;
    public float f10982n;
    public ValueAnimator f10983r;

    public s1(Context context, hh.b bVar) {
        super(context);
        pf.a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f10977a = frameLayout;
        eh.j jVar = new eh.j();
        jVar.f10051a = bVar;
        jVar.a();
        jVar.f10056g.setColor(-14670806);
        jVar.invalidateSelf();
        jVar.f10055f = org.telegram.messenger.g0.L(1.0f);
        frameLayout.setBackground(jVar);
        addView(frameLayout, mf.e(40, 40, 17));
        View view = new View(context);
        this.f10978b = view;
        view.setBackground(org.telegram.ui.ActionBar.k6.L(org.telegram.messenger.g0.L(40.0f), -13522392));
        frameLayout.addView(view, mf.e(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        r1 r1Var = new r1(context);
        this.d = r1Var;
        addView(r1Var, mf.e(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.f10979c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, mf.e(40, 40, 17));
        b(false, false);
    }

    public final void a(boolean z10, boolean z11) {
        int i3;
        if (this.f10980e == z10 && z11) {
            return;
        }
        this.f10980e = z10;
        ValueAnimator valueAnimator = this.f10981f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f10981f = null;
        }
        boolean z12 = true;
        float f10 = 1.0f;
        r1 r1Var = this.d;
        if (!z11) {
            if (z10) {
                f10 = 0.0f;
            }
            r1Var.setAlpha(f10);
            if (z10) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            r1Var.setVisibility(i3);
        } else {
            r1Var.setVisibility(0);
            float alpha = r1Var.getAlpha();
            if (z10) {
                f10 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f10);
            this.f10981f = ofFloat;
            ofFloat.addUpdateListener(new q1(this, 0));
            this.f10981f.setDuration(320L);
            this.f10981f.setInterpolator(xq.h);
            this.f10981f.start();
        }
        if (!this.h && z10) {
            z12 = false;
        }
        c(z12, z11);
    }

    public final void b(boolean z10, boolean z11) {
        boolean z12;
        this.h = z10;
        int i3 = 2131232431;
        ImageView imageView = this.f10979c;
        if (!z11) {
            if (z10) {
                i3 = 2131232427;
            }
            org.telegram.messenger.g0.R3(imageView, i3);
        } else {
            if (z10) {
                i3 = 2131232427;
            }
            imageView.setImageResource(i3);
        }
        if (!z10 && this.f10980e) {
            z12 = false;
        } else {
            z12 = true;
        }
        c(z12, z11);
    }

    public final void c(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f10983r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f10983r = null;
        }
        float f10 = 0.0f;
        if (!z11) {
            if (z10) {
                f10 = 1.0f;
            }
            this.f10982n = f10;
            View view = this.f10978b;
            view.setAlpha(1.0f - f10);
            view.setScaleX(1.0f - this.f10982n);
            view.setScaleY(1.0f - this.f10982n);
            this.f10979c.setColorFilter(new PorterDuffColorFilter(i0.a.f(this.f10982n, -1, -2960428), PorterDuff.Mode.SRC_IN));
            this.f10977a.invalidate();
            return;
        }
        float f11 = this.f10982n;
        if (z10) {
            f10 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f10983r = ofFloat;
        ofFloat.addUpdateListener(new q1(this, 1));
        this.f10983r.setInterpolator(xq.h);
        this.f10983r.setDuration(420L);
        this.f10983r.start();
    }
}
