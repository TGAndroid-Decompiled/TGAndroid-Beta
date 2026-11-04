package ei;

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
import b8.mf;
import b8.pf;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.xq;
public final class a extends FrameLayout {
    public final ImageView f10067a;
    public final org.telegram.ui.Components.g6 f10068b;
    public final Paint f10069c;
    public final Paint d;
    public boolean f10070e;
    public int f10071f;
    public float h;
    public ValueAnimator f10072n;

    public a(Context context, hh.b bVar) {
        super(context);
        Paint paint = new Paint(1);
        this.f10069c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.h = 1.0f;
        pf.a(this);
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.f10068b = g6Var;
        g6Var.u(-9866632);
        g6Var.w(org.telegram.messenger.g0.L(9.0f));
        g6Var.setCallback(this);
        g6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        g6Var.J = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        FrameLayout frameLayout = new FrameLayout(context);
        eh.j jVar = new eh.j();
        jVar.f10051a = bVar;
        jVar.a();
        jVar.f10056g.setColor(-14670806);
        jVar.invalidateSelf();
        jVar.f10055f = org.telegram.messenger.g0.L(1.0f);
        frameLayout.setBackground(jVar);
        addView(frameLayout, mf.e(40, 40, 17));
        ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131231778);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        e10.setColorFilter(new PorterDuffColorFilter(-2960428, mode));
        frameLayout.addView(e10, mf.e(20, 20, 17));
        ImageView imageView = new ImageView(context);
        this.f10067a = imageView;
        imageView.setImageResource(2131231779);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, mode));
        frameLayout.addView(imageView, mf.e(20, 20, 17));
        imageView.setPivotX(org.telegram.messenger.g0.L(10.27f));
        imageView.setPivotY(org.telegram.messenger.g0.L(9.58f));
    }

    public final void a(boolean z10, boolean z11) {
        if (z11 && this.f10070e == z10) {
            return;
        }
        this.f10070e = z10;
        float f10 = 180.0f;
        ImageView imageView = this.f10067a;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (z10) {
                f10 = 0.0f;
            }
            org.telegram.messenger.camera.q.l(animate.rotation(f10), xq.h, 420L);
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
        org.telegram.ui.Components.g6 g6Var = this.f10068b;
        float i3 = g6Var.i() * f10;
        float max = Math.max(org.telegram.messenger.g0.L(12.0f), g6Var.c() + org.telegram.messenger.g0.L(6.0f));
        canvas.save();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getWidth() - max, 0.0f, getWidth(), org.telegram.messenger.g0.L(13.0f));
        canvas.scale(i3, i3, rectF.centerX(), rectF.centerY());
        rectF.inset(-org.telegram.messenger.g0.L(2.0f), -org.telegram.messenger.g0.L(2.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.d);
        rectF.set(getWidth() - max, 0.0f, getWidth(), org.telegram.messenger.g0.L(13.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.f10069c);
        canvas.translate(((max - g6Var.c()) / 2.0f) + rectF.left, org.telegram.messenger.g0.L(7.0f));
        g6Var.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    public void setCount(int i3) {
        String E;
        if (i3 <= 0) {
            E = "";
        } else {
            E = bd.E(i3, ',');
        }
        this.f10068b.t(E, true, true);
        if (this.f10071f != i3) {
            ValueAnimator valueAnimator = this.f10072n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f10072n = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f10072n = ofFloat;
            ofFloat.addUpdateListener(new bh.f(this, 11));
            this.f10072n.addListener(new ai.e1(this, 7));
            org.telegram.messenger.camera.q.i(2.5f, this.f10072n);
            this.f10072n.setDuration(200L);
            this.f10072n.start();
            this.f10071f = i3;
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f10068b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
