package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.view.View;
import java.util.HashSet;
public class dta extends View implements vlb {
    public cta a;
    public final zka b;
    public int c;
    public eg9 d;
    public boolean e;
    public Paint f;
    public LinearGradient h;
    public Matrix n;

    public dta(Context context) {
        super(context);
        int i;
        if (gda.o() == 2) {
            i = 200;
        } else if (gda.o() == 1) {
            i = 100;
        } else {
            i = 50;
        }
        this.b = new zka(this, (byte) 1);
        this.e = true;
        this.a = new cta(i);
        a();
    }

    public void a() {
        cta ctaVar = this.a;
        ctaVar.N = 100;
        ctaVar.L = true;
        ctaVar.G = true;
        ctaVar.J = true;
        ctaVar.H = true;
        ctaVar.r = (byte) 4;
        ctaVar.w = 0.98f;
        ctaVar.v = 0.98f;
        ctaVar.u = 0.98f;
        ctaVar.c();
    }

    public final void b(float f) {
        float f2;
        if (f < 60.0f) {
            f2 = 5.0f;
        } else if (f < 180.0f) {
            f2 = 9.0f;
        } else {
            f2 = 15.0f;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        rha rhaVar = new rha(this, (byte) 6);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, f2);
        ofFloat.addUpdateListener(rhaVar);
        ofFloat.setDuration(600L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f2, 1.0f);
        ofFloat2.addUpdateListener(rhaVar);
        ofFloat2.setDuration(2000L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    public final void c() {
        Paint paint = new Paint(1);
        this.f = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, gm.L(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.h = linearGradient;
        this.f.setShader(linearGradient);
        this.n = new Matrix();
    }

    public int getStarsRectWidth() {
        return gm.L(140.0f);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        eg9 eg9Var = new eg9(this, (byte) 9);
        this.d = eg9Var;
        e86.a(eg9Var);
        boolean e = e86.e(131072);
        if (this.e != e) {
            this.e = e;
            invalidate();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        HashSet hashSet;
        super.onDetachedFromWindow();
        eg9 eg9Var = this.d;
        if (eg9Var != null && (hashSet = e86.n) != null) {
            hashSet.remove(eg9Var);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.e) {
            if (this.f != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            this.a.d(canvas2);
            if (this.f != null) {
                canvas2.save();
                this.n.reset();
                this.n.postTranslate(0.0f, (getHeight() + 1) - gm.L(12.0f));
                this.h.setLocalMatrix(this.n);
                canvas2.drawRect(0.0f, getHeight() - gm.L(12.0f), getWidth(), getHeight(), this.f);
                this.n.reset();
                this.n.postRotate(180.0f);
                this.n.postTranslate(0.0f, gm.L(12.0f));
                this.h.setLocalMatrix(this.n);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), gm.L(12.0f), this.f);
                canvas2.restore();
                canvas2.restore();
            }
            if (!this.a.g) {
                invalidate();
            }
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        this.a.a.set(0.0f, 0.0f, getStarsRectWidth(), gm.L(140.0f));
        this.a.a.offset((getMeasuredWidth() - this.a.a.width()) / 2.0f, (getMeasuredHeight() - this.a.a.height()) / 2.0f);
        this.a.b.set(-gm.L(15.0f), -gm.L(15.0f), gm.L(15.0f) + getMeasuredWidth(), gm.L(15.0f) + getMeasuredHeight());
        if (this.c != measuredHeight) {
            this.c = measuredHeight;
            this.a.f();
        }
    }

    public void setPaused(boolean z) {
        cta ctaVar = this.a;
        if (z == ctaVar.g) {
            return;
        }
        ctaVar.g = z;
        if (z) {
            ctaVar.Q = System.currentTimeMillis();
            return;
        }
        for (int i = 0; i < this.a.n.size(); i++) {
            bta btaVar = (bta) this.a.n.get(i);
            btaVar.a = (System.currentTimeMillis() - this.a.Q) + btaVar.a;
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        zka zkaVar = this.b;
        removeCallbacks(zkaVar);
        postDelayed(zkaVar, 150L);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
