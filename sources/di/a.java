package di;

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
import c8.ha;
import c8.ka;
import org.telegram.messenger.id;
import org.telegram.ui.Components.xq;
public final class a extends FrameLayout {
    public final ImageView f8787a;
    public final org.telegram.ui.Components.i6 f8788b;
    public final Paint f8789c;
    public final Paint d;
    public boolean f8790e;
    public int f8791f;
    public float h;
    public ValueAnimator f8792n;

    public a(Context context, gh.b bVar) {
        super(context);
        Paint paint = new Paint(1);
        this.f8789c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.h = 1.0f;
        ka.a(this);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true);
        this.f8788b = i6Var;
        i6Var.u(-9866632);
        i6Var.w(org.telegram.messenger.g0.L(9.0f));
        i6Var.setCallback(this);
        i6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        i6Var.J = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        FrameLayout frameLayout = new FrameLayout(context);
        dh.j jVar = new dh.j();
        jVar.f8771a = bVar;
        jVar.a();
        jVar.f8776g.setColor(-14670806);
        jVar.invalidateSelf();
        jVar.f8775f = org.telegram.messenger.g0.L(1.0f);
        frameLayout.setBackground(jVar);
        addView(frameLayout, ha.e(40, 40, 17));
        ImageView e10 = org.telegram.messenger.camera.q.e(context, 2131231778);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        e10.setColorFilter(new PorterDuffColorFilter(-2960428, mode));
        frameLayout.addView(e10, ha.e(20, 20, 17));
        ImageView imageView = new ImageView(context);
        this.f8787a = imageView;
        imageView.setImageResource(2131231779);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, mode));
        frameLayout.addView(imageView, ha.e(20, 20, 17));
        imageView.setPivotX(org.telegram.messenger.g0.L(10.27f));
        imageView.setPivotY(org.telegram.messenger.g0.L(9.58f));
    }

    public final void a(boolean z9, boolean z10) {
        if (z10 && this.f8790e == z9) {
            return;
        }
        this.f8790e = z9;
        float f10 = 180.0f;
        ImageView imageView = this.f8787a;
        if (z10) {
            ViewPropertyAnimator animate = imageView.animate();
            if (z9) {
                f10 = 0.0f;
            }
            org.telegram.messenger.camera.q.l(animate.rotation(f10), xq.h, 420L);
            return;
        }
        if (z9) {
            f10 = 0.0f;
        }
        imageView.setRotation(f10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        super.dispatchDraw(canvas);
        float f10 = this.h;
        org.telegram.ui.Components.i6 i6Var = this.f8788b;
        float i7 = i6Var.i() * f10;
        float max = Math.max(org.telegram.messenger.g0.L(12.0f), i6Var.c() + org.telegram.messenger.g0.L(6.0f));
        canvas.save();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getWidth() - max, 0.0f, getWidth(), org.telegram.messenger.g0.L(13.0f));
        canvas.scale(i7, i7, rectF.centerX(), rectF.centerY());
        rectF.inset(-org.telegram.messenger.g0.L(2.0f), -org.telegram.messenger.g0.L(2.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.d);
        rectF.set(getWidth() - max, 0.0f, getWidth(), org.telegram.messenger.g0.L(13.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.f8789c);
        canvas.translate(((max - i6Var.c()) / 2.0f) + rectF.left, org.telegram.messenger.g0.L(7.0f));
        i6Var.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    public void setCount(int i7) {
        String E;
        if (i7 <= 0) {
            E = "";
        } else {
            E = id.E(i7, ',');
        }
        this.f8788b.t(E, true, true);
        if (this.f8791f != i7) {
            ValueAnimator valueAnimator = this.f8792n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f8792n = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f8792n = ofFloat;
            ofFloat.addUpdateListener(new ah.h(this, 11));
            this.f8792n.addListener(new bi.t5(this, 6));
            org.telegram.messenger.camera.q.i(2.5f, this.f8792n);
            this.f8792n.setDuration(200L);
            this.f8792n.start();
            this.f8791f = i7;
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f8788b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
