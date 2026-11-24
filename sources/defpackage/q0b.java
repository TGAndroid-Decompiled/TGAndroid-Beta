package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
public final class q0b extends s09 implements vlb {
    public float E;
    public float F;
    public ValueAnimator G;
    public ValueAnimator H;
    public final u0b I;
    public int r;
    public float s;
    public ValueAnimator w;
    public boolean x;
    public long y;

    public q0b(u0b u0bVar, Context context) {
        super(context);
        int v0;
        ylb ylbVar = u0bVar.o2;
        this.I = u0bVar;
        this.x = false;
        this.E = 1.0f;
        if (u0bVar.E3) {
            v0 = on2.p(cmb.v0(cmb.Ml, ylbVar), 102);
        } else {
            v0 = cmb.v0(cmb.Df, ylbVar);
        }
        k(v0);
        setScaleType(ImageView.ScaleType.CENTER);
        setLayerNum(null);
    }

    @Override
    public final void c() {
        this.x = true;
        if (this.E < 1.0f) {
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.H = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, 1.0f);
            this.H = ofFloat;
            ofFloat.addUpdateListener(new n0b(this, (byte) 2));
            this.H.addListener(new p0b(this, (byte) 0));
            this.H.setDuration(320L);
            this.H.setInterpolator(d53.h);
            this.H.start();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        if (isPressed()) {
            float f = this.F;
            if (f != 1.0f) {
                this.F = Utilities.i(((1000.0f / gm.r) / 100.0f) + f, 1.0f, 0.0f);
                invalidate();
                this.I.invalidate();
            }
        }
        float A = td4.A(1.0f, this.F, 0.15f, 0.85f) * this.E;
        int i = (A > 1.0f ? 1 : (A == 1.0f ? 0 : -1));
        if (i != 0) {
            canvas.save();
            canvas.scale(A, A, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        super.draw(canvas);
        if (i != 0) {
            canvas.restore();
        }
    }

    public final void j() {
        if (System.currentTimeMillis() - this.y > 250) {
            this.y = System.currentTimeMillis();
            p09 animatedDrawable = getAnimatedDrawable();
            if (animatedDrawable == null && getImageReceiver() != null) {
                animatedDrawable = getImageReceiver().y();
            }
            if (animatedDrawable != null) {
                animatedDrawable.stop();
                animatedDrawable.H(0);
                animatedDrawable.C(true);
            } else if (animatedDrawable == null) {
                setProgress(0.0f);
                d();
            }
        }
    }

    public final void k(int i) {
        if (this.r != i) {
            this.r = i;
            setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void l(boolean z, boolean z2) {
        if (Math.abs(this.s - (z ? 1.0f : 0.0f)) > 0.01f) {
            ValueAnimator valueAnimator = this.w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.w = null;
            }
            float f = 0.0f;
            if (z2) {
                float f2 = this.s;
                if (z) {
                    f = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                this.w = ofFloat;
                ofFloat.addUpdateListener(new n0b(this, (byte) 1));
                this.w.addListener(new p0b(this, (byte) 1));
                this.w.setDuration(350L);
                this.w.setInterpolator(d53.h);
                this.w.start();
                return;
            }
            if (z) {
                f = 1.0f;
            }
            m(f);
        }
    }

    public final void m(float f) {
        this.s = f;
        u0b u0bVar = this.I;
        ylb ylbVar = u0bVar.o2;
        if (u0bVar.E3) {
            k(on2.p(cmb.v0(cmb.Ml, ylbVar), (int) (gm.R1(0.4f, 0.8f, f) * 255.0f)));
        } else {
            k(on2.f(this.s, cmb.v0(cmb.Df, ylbVar), cmb.v0(cmb.Ff, ylbVar)));
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        super.onMeasure(wi8.f(4.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    @Override
    public final void setPressed(boolean z) {
        ValueAnimator valueAnimator;
        if (isPressed() != z) {
            super.setPressed(z);
            invalidate();
            this.I.invalidate();
            if (z && (valueAnimator = this.G) != null) {
                valueAnimator.removeAllListeners();
                this.G.cancel();
            }
            if (!z) {
                float f = this.F;
                if (f != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                    this.G = ofFloat;
                    ofFloat.addUpdateListener(new n0b(this, (byte) 0));
                    this.G.addListener(new p0b(this, (byte) 2));
                    b10.n(3.0f, this.G);
                    this.G.setDuration(350L);
                    this.G.start();
                }
            }
        }
    }

    @Override
    public final void updateColors() {
        try {
            if (this.w == null) {
                m(this.s);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
