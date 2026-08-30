package nh;

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
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.nr;
public final class a extends FrameLayout {
    public final ImageView f15035a;
    public final org.telegram.ui.Components.j6 f15036b;
    public final Paint f15037c;
    public final Paint d;
    public boolean e;
    public int f15038f;
    public float h;
    public ValueAnimator f15039n;

    public a(Context context, qg.b bVar) {
        super(context);
        Paint paint = new Paint(1);
        this.f15037c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.h = 1.0f;
        k7.d6.a(this);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, true, true, false);
        this.f15036b = j6Var;
        j6Var.r(-9866632);
        j6Var.t(AndroidUtilities.dp(9.0f));
        j6Var.setCallback(this);
        j6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        j6Var.D = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        FrameLayout frameLayout = new FrameLayout(context);
        ng.i iVar = new ng.i();
        iVar.a(bVar);
        iVar.f15027g.setColor(-14670806);
        iVar.invalidateSelf();
        iVar.f15026f = AndroidUtilities.dp(1.0f);
        frameLayout.setBackground(iVar);
        addView(frameLayout, k7.b6.e(40, 40, 17));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.menu_comments);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, mode));
        frameLayout.addView(imageView, k7.b6.e(20, 20, 17));
        ImageView imageView2 = new ImageView(context);
        this.f15035a = imageView2;
        imageView2.setImageResource(R.drawable.menu_comments_arrow);
        imageView2.setColorFilter(new PorterDuffColorFilter(-2960428, mode));
        frameLayout.addView(imageView2, k7.b6.e(20, 20, 17));
        imageView2.setPivotX(AndroidUtilities.dp(10.27f));
        imageView2.setPivotY(AndroidUtilities.dp(9.58f));
    }

    public final void a(boolean z4, boolean z10) {
        if (z10 && this.e == z4) {
            return;
        }
        this.e = z4;
        float f10 = 180.0f;
        ImageView imageView = this.f15035a;
        if (z10) {
            ViewPropertyAnimator animate = imageView.animate();
            if (z4) {
                f10 = 0.0f;
            }
            org.telegram.ui.b.p(animate.rotation(f10), nr.h, 420L);
            return;
        }
        if (z4) {
            f10 = 0.0f;
        }
        imageView.setRotation(f10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        super.dispatchDraw(canvas);
        float f10 = this.h;
        org.telegram.ui.Components.j6 j6Var = this.f15036b;
        float g10 = j6Var.g() * f10;
        float max = Math.max(AndroidUtilities.dp(12.0f), j6Var.d() + AndroidUtilities.dp(6.0f));
        canvas.save();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
        canvas.scale(g10, g10, rectF.centerX(), rectF.centerY());
        rectF.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.d);
        rectF.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.f15037c);
        canvas.translate(((max - j6Var.d()) / 2.0f) + rectF.left, AndroidUtilities.dp(7.0f));
        j6Var.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    public void setCount(int i10) {
        String formatNumber;
        if (i10 <= 0) {
            formatNumber = "";
        } else {
            formatNumber = LocaleController.formatNumber(i10, ',');
        }
        this.f15036b.q(formatNumber, true, true);
        if (this.f15038f != i10) {
            ValueAnimator valueAnimator = this.f15039n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f15039n = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f15039n = ofFloat;
            ofFloat.addUpdateListener(new dg.o1(this, 19));
            this.f15039n.addListener(new cg.l0(this, 15));
            this.f15039n.setInterpolator(new OvershootInterpolator(2.5f));
            this.f15039n.setDuration(200L);
            this.f15039n.start();
            this.f15038f = i10;
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f15036b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
