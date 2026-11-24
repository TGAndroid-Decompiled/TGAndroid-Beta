package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class jm2 extends FrameLayout {
    public final ImageView a;
    public final gn b;
    public final Paint c;
    public final Paint d;
    public boolean e;
    public int f;
    public float h;
    public ValueAnimator n;

    public jm2(Context context, bl0 bl0Var) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.h = 1.0f;
        ote.a(this);
        gn gnVar = new gn(false, true, true);
        this.b = gnVar;
        gnVar.u(-9866632);
        gnVar.w(gl.L(9.0f));
        gnVar.setCallback(this);
        gnVar.x(gl.n1("fonts/num.otf"));
        gnVar.K = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        FrameLayout frameLayout = new FrameLayout(context);
        u9b u9bVar = new u9b();
        u9bVar.a = bl0Var;
        u9bVar.a();
        u9bVar.g.setColor(-14670806);
        u9bVar.invalidateSelf();
        u9bVar.f = gl.L(1.0f);
        frameLayout.setBackground(u9bVar);
        addView(frameLayout, nme.e(40, 40, 17));
        ImageView k = tb4.k(context, 2131231782);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        k.setColorFilter(new PorterDuffColorFilter(-2960428, mode));
        frameLayout.addView(k, nme.e(20, 20, 17));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setImageResource(2131231783);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, mode));
        frameLayout.addView(imageView, nme.e(20, 20, 17));
        imageView.setPivotX(gl.L(10.27f));
        imageView.setPivotY(gl.L(9.58f));
    }

    public final void a(boolean z, boolean z2) {
        if (z2 && this.e == z) {
            return;
        }
        this.e = z;
        float f = 180.0f;
        ImageView imageView = this.a;
        if (z2) {
            ViewPropertyAnimator animate = imageView.animate();
            if (z) {
                f = 0.0f;
            }
            ug8.t(animate.rotation(f), s33.h, 420L);
            return;
        }
        if (z) {
            f = 0.0f;
        }
        imageView.setRotation(f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        super.dispatchDraw(canvas);
        float f = this.h;
        gn gnVar = this.b;
        float i = gnVar.i() * f;
        float max = Math.max(gl.L(12.0f), gnVar.c() + gl.L(6.0f));
        canvas.save();
        RectF rectF = gl.P;
        rectF.set(getWidth() - max, 0.0f, getWidth(), gl.L(13.0f));
        canvas.scale(i, i, rectF.centerX(), rectF.centerY());
        rectF.inset(-gl.L(2.0f), -gl.L(2.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.d);
        rectF.set(getWidth() - max, 0.0f, getWidth(), gl.L(13.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.c);
        canvas.translate(((max - gnVar.c()) / 2.0f) + rectF.left, gl.L(7.0f));
        gnVar.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    public void setCount(int i) {
        String E;
        if (i <= 0) {
            E = "";
        } else {
            E = k96.E(i, ',');
        }
        this.b.t(E, true, true);
        if (this.f != i) {
            ValueAnimator valueAnimator = this.n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.n = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.n = ofFloat;
            ofFloat.addUpdateListener(new uz1(this, (byte) 13));
            this.n.addListener(new im2(this, (byte) 0));
            b00.n(2.5f, this.n);
            this.n.setDuration(200L);
            this.n.start();
            this.f = i;
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
