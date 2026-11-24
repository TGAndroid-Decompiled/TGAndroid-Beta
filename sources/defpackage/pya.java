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
public final class pya extends ry8 implements tjb {
    public float E;
    public float F;
    public ValueAnimator G;
    public ValueAnimator H;
    public final tya I;
    public int r;
    public float s;
    public ValueAnimator w;
    public boolean x;
    public long y;

    public pya(tya tyaVar, Context context) {
        super(context);
        int v0;
        wjb wjbVar = tyaVar.o2;
        this.I = tyaVar;
        this.x = false;
        this.E = 1.0f;
        if (tyaVar.E3) {
            v0 = bm2.o(bkb.v0(bkb.Ml, wjbVar), 102);
        } else {
            v0 = bkb.v0(bkb.Df, wjbVar);
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
            ofFloat.addUpdateListener(new mya(this, (byte) 2));
            this.H.addListener(new oya(this, (byte) 0));
            this.H.setDuration(320L);
            this.H.setInterpolator(s33.h);
            this.H.start();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        if (isPressed()) {
            float f = this.F;
            if (f != 1.0f) {
                this.F = Utilities.i(((1000.0f / gl.r) / 100.0f) + f, 1.0f, 0.0f);
                invalidate();
                this.I.invalidate();
            }
        }
        float A = tb4.A(1.0f, this.F, 0.15f, 0.85f) * this.E;
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
            oy8 animatedDrawable = getAnimatedDrawable();
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
                ofFloat.addUpdateListener(new mya(this, (byte) 1));
                this.w.addListener(new oya(this, (byte) 1));
                this.w.setDuration(350L);
                this.w.setInterpolator(s33.h);
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
        tya tyaVar = this.I;
        wjb wjbVar = tyaVar.o2;
        if (tyaVar.E3) {
            k(bm2.o(bkb.v0(bkb.Ml, wjbVar), (int) (gl.R1(0.4f, 0.8f, f) * 255.0f)));
        } else {
            k(bm2.f(this.s, bkb.v0(bkb.Df, wjbVar), bkb.v0(bkb.Ff, wjbVar)));
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        super.onMeasure(ug8.f(4.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
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
                    ofFloat.addUpdateListener(new mya(this, (byte) 0));
                    this.G.addListener(new oya(this, (byte) 2));
                    b00.n(3.0f, this.G);
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
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
