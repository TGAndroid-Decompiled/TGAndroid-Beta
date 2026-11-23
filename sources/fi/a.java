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
import c8.ma;
import c8.ra;
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
import org.telegram.ui.Components.nr;
public final class a extends FrameLayout {
    public final ImageView f11739a;
    public final org.telegram.ui.Components.n6 f11740b;
    public final Paint f11741c;
    public final Paint d;
    public boolean f11742e;
    public int f11743f;
    public float h;
    public ValueAnimator f11744n;

    public a(Context context, gh.b bVar) {
        super(context);
        Paint paint = new Paint(1);
        this.f11741c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.h = 1.0f;
        ra.a(this);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true);
        this.f11740b = n6Var;
        n6Var.u(-9866632);
        n6Var.w(org.telegram.messenger.g0.L(9.0f));
        n6Var.setCallback(this);
        n6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        n6Var.K = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        FrameLayout frameLayout = new FrameLayout(context);
        dh.j jVar = new dh.j();
        jVar.f8474a = bVar;
        jVar.a();
        jVar.f8479g.setColor(-14670806);
        jVar.invalidateSelf();
        jVar.f8478f = org.telegram.messenger.g0.L(1.0f);
        frameLayout.setBackground(jVar);
        addView(frameLayout, ma.e(40, 40, 17));
        ImageView e10 = o10.e(context, 2131231779);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        e10.setColorFilter(new PorterDuffColorFilter(-2960428, mode));
        frameLayout.addView(e10, ma.e(20, 20, 17));
        ImageView imageView = new ImageView(context);
        this.f11739a = imageView;
        imageView.setImageResource(2131231780);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, mode));
        frameLayout.addView(imageView, ma.e(20, 20, 17));
        imageView.setPivotX(org.telegram.messenger.g0.L(10.27f));
        imageView.setPivotY(org.telegram.messenger.g0.L(9.58f));
    }

    public final void a(boolean z10, boolean z11) {
        if (z11 && this.f11742e == z10) {
            return;
        }
        this.f11742e = z10;
        float f10 = 180.0f;
        ImageView imageView = this.f11739a;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (z10) {
                f10 = 0.0f;
            }
            o10.o(animate.rotation(f10), nr.h, 420L);
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
        org.telegram.ui.Components.n6 n6Var = this.f11740b;
        float i7 = n6Var.i() * f10;
        float max = Math.max(org.telegram.messenger.g0.L(12.0f), n6Var.c() + org.telegram.messenger.g0.L(6.0f));
        canvas.save();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getWidth() - max, 0.0f, getWidth(), org.telegram.messenger.g0.L(13.0f));
        canvas.scale(i7, i7, rectF.centerX(), rectF.centerY());
        rectF.inset(-org.telegram.messenger.g0.L(2.0f), -org.telegram.messenger.g0.L(2.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.d);
        rectF.set(getWidth() - max, 0.0f, getWidth(), org.telegram.messenger.g0.L(13.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.f11741c);
        canvas.translate(((max - n6Var.c()) / 2.0f) + rectF.left, org.telegram.messenger.g0.L(7.0f));
        n6Var.draw(canvas);
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
        this.f11740b.t(E, true, true);
        if (this.f11743f != i7) {
            ValueAnimator valueAnimator = this.f11744n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f11744n = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f11744n = ofFloat;
            ofFloat.addUpdateListener(new ah.g(this, 12));
            this.f11744n.addListener(new ai.k0(this, 8));
            org.telegram.ui.Cells.c0.q(2.5f, this.f11744n);
            this.f11744n.setDuration(200L);
            this.f11744n.start();
            this.f11743f = i7;
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f11740b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
