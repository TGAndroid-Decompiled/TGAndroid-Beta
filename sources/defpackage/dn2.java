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
public final class dn2 extends FrameLayout {
    public final ImageView a;
    public final hn b;
    public final Paint c;
    public final Paint d;
    public boolean e;
    public int f;
    public float h;
    public ValueAnimator n;

    public dn2(Context context, cl0 cl0Var) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.h = 1.0f;
        iye.a(this);
        hn hnVar = new hn(false, true, true);
        this.b = hnVar;
        hnVar.u(-9866632);
        hnVar.w(hl.L(9.0f));
        hnVar.setCallback(this);
        hnVar.x(hl.n1("fonts/num.otf"));
        hnVar.K = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        FrameLayout frameLayout = new FrameLayout(context);
        sdb sdbVar = new sdb();
        sdbVar.a = cl0Var;
        sdbVar.a();
        sdbVar.g.setColor(-14670806);
        sdbVar.invalidateSelf();
        sdbVar.f = hl.L(1.0f);
        frameLayout.setBackground(sdbVar);
        addView(frameLayout, tre.e(40, 40, 17));
        ImageView k = qd4.k(context, 2131231782);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        k.setColorFilter(new PorterDuffColorFilter(-2960428, mode));
        frameLayout.addView(k, tre.e(20, 20, 17));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setImageResource(2131231783);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, mode));
        frameLayout.addView(imageView, tre.e(20, 20, 17));
        imageView.setPivotX(hl.L(10.27f));
        imageView.setPivotY(hl.L(9.58f));
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
            ik8.t(animate.rotation(f), k43.h, 420L);
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
        hn hnVar = this.b;
        float i = hnVar.i() * f;
        float max = Math.max(hl.L(12.0f), hnVar.c() + hl.L(6.0f));
        canvas.save();
        RectF rectF = hl.P;
        rectF.set(getWidth() - max, 0.0f, getWidth(), hl.L(13.0f));
        canvas.scale(i, i, rectF.centerX(), rectF.centerY());
        rectF.inset(-hl.L(2.0f), -hl.L(2.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.d);
        rectF.set(getWidth() - max, 0.0f, getWidth(), hl.L(13.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.c);
        canvas.translate(((max - hnVar.c()) / 2.0f) + rectF.left, hl.L(7.0f));
        hnVar.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    public void setCount(int i) {
        String E;
        if (i <= 0) {
            E = "";
        } else {
            E = ob6.E(i, ',');
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
            ofFloat.addUpdateListener(new az1(this, (byte) 14));
            this.n.addListener(new cn2(this, (byte) 0));
            c00.o(2.5f, this.n);
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
