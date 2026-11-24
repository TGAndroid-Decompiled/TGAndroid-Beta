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
public final class vn2 extends FrameLayout {
    public final ImageView a;
    public final ho b;
    public final Paint c;
    public final Paint d;
    public boolean e;
    public int f;
    public float h;
    public ValueAnimator n;

    public vn2(Context context, bm0 bm0Var) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.h = 1.0f;
        rve.a(this);
        ho hoVar = new ho(false, true, true);
        this.b = hoVar;
        hoVar.u(-9866632);
        hoVar.w(gm.L(9.0f));
        hoVar.setCallback(this);
        hoVar.x(gm.n1("fonts/num.otf"));
        hoVar.K = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        FrameLayout frameLayout = new FrameLayout(context);
        wbb wbbVar = new wbb();
        wbbVar.a = bm0Var;
        wbbVar.a();
        wbbVar.g.setColor(-14670806);
        wbbVar.invalidateSelf();
        wbbVar.f = gm.L(1.0f);
        frameLayout.setBackground(wbbVar);
        addView(frameLayout, qoe.e(40, 40, 17));
        ImageView k = td4.k(context, 2131231783);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        k.setColorFilter(new PorterDuffColorFilter(-2960428, mode));
        frameLayout.addView(k, qoe.e(20, 20, 17));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setImageResource(2131231784);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, mode));
        frameLayout.addView(imageView, qoe.e(20, 20, 17));
        imageView.setPivotX(gm.L(10.27f));
        imageView.setPivotY(gm.L(9.58f));
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
            wi8.t(animate.rotation(f), d53.h, 420L);
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
        ho hoVar = this.b;
        float i = hoVar.i() * f;
        float max = Math.max(gm.L(12.0f), hoVar.c() + gm.L(6.0f));
        canvas.save();
        RectF rectF = gm.P;
        rectF.set(getWidth() - max, 0.0f, getWidth(), gm.L(13.0f));
        canvas.scale(i, i, rectF.centerX(), rectF.centerY());
        rectF.inset(-gm.L(2.0f), -gm.L(2.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.d);
        rectF.set(getWidth() - max, 0.0f, getWidth(), gm.L(13.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.c);
        canvas.translate(((max - hoVar.c()) / 2.0f) + rectF.left, gm.L(7.0f));
        hoVar.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    public void setCount(int i) {
        String E;
        if (i <= 0) {
            E = "";
        } else {
            E = jb6.E(i, ',');
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
            ofFloat.addUpdateListener(new et1(this, (byte) 15));
            this.n.addListener(new kh2(this, (byte) 2));
            b10.n(2.5f, this.n);
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
