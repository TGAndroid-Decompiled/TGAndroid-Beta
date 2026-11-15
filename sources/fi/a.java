package fi;

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
import c8.ja;
import c8.na;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.ui.Components.er;
public final class a extends FrameLayout {
    public final ImageView f11390a;
    public final org.telegram.ui.Components.g6 f11391b;
    public final Paint f11392c;
    public final Paint d;
    public boolean f11393e;
    public int f11394f;
    public float h;
    public ValueAnimator f11395n;

    public a(Context context, gh.b bVar) {
        super(context);
        Paint paint = new Paint(1);
        this.f11392c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.h = 1.0f;
        na.a(this);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.f11391b = g6Var;
        g6Var.u(-9866632);
        g6Var.w(org.telegram.messenger.g0.L(9.0f));
        g6Var.setCallback(this);
        g6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        g6Var.K = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        FrameLayout frameLayout = new FrameLayout(context);
        dh.j jVar = new dh.j();
        jVar.f8160a = bVar;
        jVar.a();
        jVar.f8165g.setColor(-14670806);
        jVar.invalidateSelf();
        jVar.f8164f = org.telegram.messenger.g0.L(1.0f);
        frameLayout.setBackground(jVar);
        addView(frameLayout, ja.e(40, 40, 17));
        ImageView e10 = i20.e(context, 2131231778);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        e10.setColorFilter(new PorterDuffColorFilter(-2960428, mode));
        frameLayout.addView(e10, ja.e(20, 20, 17));
        ImageView imageView = new ImageView(context);
        this.f11390a = imageView;
        imageView.setImageResource(2131231779);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, mode));
        frameLayout.addView(imageView, ja.e(20, 20, 17));
        imageView.setPivotX(org.telegram.messenger.g0.L(10.27f));
        imageView.setPivotY(org.telegram.messenger.g0.L(9.58f));
    }

    public final void a(boolean z10, boolean z11) {
        if (z11 && this.f11393e == z10) {
            return;
        }
        this.f11393e = z10;
        float f10 = 180.0f;
        ImageView imageView = this.f11390a;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (z10) {
                f10 = 0.0f;
            }
            i20.n(animate.rotation(f10), er.h, 420L);
            return;
        }
        if (z10) {
            f10 = 0.0f;
        }
        imageView.setRotation(f10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        super.dispatchDraw(canvas);
        float f10 = this.h;
        org.telegram.ui.Components.g6 g6Var = this.f11391b;
        float i7 = g6Var.i() * f10;
        float max = Math.max(org.telegram.messenger.g0.L(12.0f), g6Var.c() + org.telegram.messenger.g0.L(6.0f));
        canvas.save();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getWidth() - max, 0.0f, getWidth(), org.telegram.messenger.g0.L(13.0f));
        canvas.scale(i7, i7, rectF.centerX(), rectF.centerY());
        rectF.inset(-org.telegram.messenger.g0.L(2.0f), -org.telegram.messenger.g0.L(2.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.d);
        rectF.set(getWidth() - max, 0.0f, getWidth(), org.telegram.messenger.g0.L(13.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.f11392c);
        canvas.translate(((max - g6Var.c()) / 2.0f) + rectF.left, org.telegram.messenger.g0.L(7.0f));
        g6Var.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    public void setCount(int i7) {
        String E;
        if (i7 <= 0) {
            E = "";
        } else {
            E = hd.E(i7, ',');
        }
        this.f11391b.t(E, true, true);
        if (this.f11394f != i7) {
            ValueAnimator valueAnimator = this.f11395n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f11395n = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f11395n = ofFloat;
            ofFloat.addUpdateListener(new ah.h(this, 12));
            this.f11395n.addListener(new ai.i0(this, 8));
            i20.k(2.5f, this.f11395n);
            this.f11395n.setDuration(200L);
            this.f11395n.start();
            this.f11394f = i7;
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f11391b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
