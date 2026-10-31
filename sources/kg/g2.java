package kg;

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
import org.telegram.messenger.sc;
import org.telegram.messenger.tz;
import org.telegram.ui.ActionBar.k6;
public class g2 extends View implements k6 {
    public f2 f11092a;
    public final androidx.activity.i f11093b;
    public int f11094c;
    public ag.l d;
    public boolean e;
    public Paint f11095f;
    public LinearGradient h;
    public Matrix f11096n;

    public g2(Context context) {
        super(context);
        int i10;
        if (tz.o() == 2) {
            i10 = 200;
        } else if (tz.o() == 1) {
            i10 = 100;
        } else {
            i10 = 50;
        }
        this.f11093b = new androidx.activity.i(this, 25);
        this.e = true;
        this.f11092a = new f2(i10);
        a();
    }

    public void a() {
        f2 f2Var = this.f11092a;
        f2Var.O = 100;
        f2Var.M = true;
        f2Var.G = true;
        f2Var.K = true;
        f2Var.H = true;
        f2Var.f11082r = 4;
        f2Var.f11086w = 0.98f;
        f2Var.v = 0.98f;
        f2Var.f11085u = 0.98f;
        f2Var.c();
    }

    public final void b(float f7) {
        float f10;
        if (f7 < 60.0f) {
            f10 = 5.0f;
        } else if (f7 < 180.0f) {
            f10 = 9.0f;
        } else {
            f10 = 15.0f;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        bg.k kVar = new bg.k(this, 11);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, f10);
        ofFloat.addUpdateListener(kVar);
        ofFloat.setDuration(600L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, 1.0f);
        ofFloat2.addUpdateListener(kVar);
        ofFloat2.setDuration(2000L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    public final void c() {
        Paint paint = new Paint(1);
        this.f11095f = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(12.0f), new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.h = linearGradient;
        this.f11095f.setShader(linearGradient);
        this.f11096n = new Matrix();
    }

    public int getStarsRectWidth() {
        return org.telegram.messenger.i0.L(140.0f);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ag.l lVar = new ag.l(this, 16);
        this.d = lVar;
        sc.a(lVar);
        boolean e = sc.e(131072);
        if (this.e != e) {
            this.e = e;
            invalidate();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        HashSet hashSet;
        super.onDetachedFromWindow();
        ag.l lVar = this.d;
        if (lVar != null && (hashSet = sc.f17896n) != null) {
            hashSet.remove(lVar);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        if (this.e) {
            if (this.f11095f != null) {
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            this.f11092a.d(canvas2);
            if (this.f11095f != null) {
                canvas2.save();
                this.f11096n.reset();
                this.f11096n.postTranslate(0.0f, (getHeight() + 1) - org.telegram.messenger.i0.L(12.0f));
                this.h.setLocalMatrix(this.f11096n);
                canvas2.drawRect(0.0f, getHeight() - org.telegram.messenger.i0.L(12.0f), getWidth(), getHeight(), this.f11095f);
                this.f11096n.reset();
                this.f11096n.postRotate(180.0f);
                this.f11096n.postTranslate(0.0f, org.telegram.messenger.i0.L(12.0f));
                this.h.setLocalMatrix(this.f11096n);
                canvas2.drawRect(0.0f, 0.0f, getWidth(), org.telegram.messenger.i0.L(12.0f), this.f11095f);
                canvas2.restore();
                canvas2.restore();
            }
            if (!this.f11092a.f11072g) {
                invalidate();
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        this.f11092a.f11068a.set(0.0f, 0.0f, getStarsRectWidth(), org.telegram.messenger.i0.L(140.0f));
        this.f11092a.f11068a.offset((getMeasuredWidth() - this.f11092a.f11068a.width()) / 2.0f, (getMeasuredHeight() - this.f11092a.f11068a.height()) / 2.0f);
        this.f11092a.f11069b.set(-org.telegram.messenger.i0.L(15.0f), -org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(15.0f) + getMeasuredWidth(), org.telegram.messenger.i0.L(15.0f) + getMeasuredHeight());
        if (this.f11094c != measuredHeight) {
            this.f11094c = measuredHeight;
            this.f11092a.f();
        }
    }

    public void setPaused(boolean z10) {
        f2 f2Var = this.f11092a;
        if (z10 == f2Var.f11072g) {
            return;
        }
        f2Var.f11072g = z10;
        if (z10) {
            f2Var.R = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < this.f11092a.f11078n.size(); i10++) {
            e2 e2Var = (e2) this.f11092a.f11078n.get(i10);
            e2Var.f11044a = (System.currentTimeMillis() - this.f11092a.R) + e2Var.f11044a;
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        androidx.activity.i iVar = this.f11093b;
        removeCallbacks(iVar);
        postDelayed(iVar, 150L);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
