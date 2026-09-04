package bi;

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
import org.telegram.messenger.wl;
import org.telegram.ui.Components.pr;
public final class a extends FrameLayout {
    public final ImageView f2725a;
    public final org.telegram.ui.Components.p6 f2726b;
    public final Paint f2727c;
    public final Paint d;
    public boolean f2728e;
    public int f2729f;
    public float h;
    public ValueAnimator f2730n;

    public a(Context context, eh.b bVar) {
        super(context);
        Paint paint = new Paint(1);
        this.f2727c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.h = 1.0f;
        w7.z5.a(this);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, true, true, false);
        this.f2726b = p6Var;
        p6Var.r(-9866632);
        p6Var.t(AndroidUtilities.dp(9.0f));
        p6Var.setCallback(this);
        p6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        p6Var.D = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        FrameLayout frameLayout = new FrameLayout(context);
        bh.j jVar = new bh.j();
        jVar.a(bVar);
        jVar.f2716g.setColor(-14670806);
        jVar.invalidateSelf();
        jVar.f2715f = AndroidUtilities.dp(1.0f);
        frameLayout.setBackground(jVar);
        addView(frameLayout, w7.x5.e(40, 40, 17));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.menu_comments);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, mode));
        frameLayout.addView(imageView, w7.x5.e(20, 20, 17));
        ImageView imageView2 = new ImageView(context);
        this.f2725a = imageView2;
        imageView2.setImageResource(R.drawable.menu_comments_arrow);
        imageView2.setColorFilter(new PorterDuffColorFilter(-2960428, mode));
        frameLayout.addView(imageView2, w7.x5.e(20, 20, 17));
        imageView2.setPivotX(AndroidUtilities.dp(10.27f));
        imageView2.setPivotY(AndroidUtilities.dp(9.58f));
    }

    public final void a(boolean z10, boolean z11) {
        if (z11 && this.f2728e == z10) {
            return;
        }
        this.f2728e = z10;
        float f7 = 180.0f;
        ImageView imageView = this.f2725a;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (z10) {
                f7 = 0.0f;
            }
            wl.q(animate.rotation(f7), pr.h, 420L);
            return;
        }
        if (z10) {
            f7 = 0.0f;
        }
        imageView.setRotation(f7);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        super.dispatchDraw(canvas);
        float f7 = this.h;
        org.telegram.ui.Components.p6 p6Var = this.f2726b;
        float g10 = p6Var.g() * f7;
        float max = Math.max(AndroidUtilities.dp(12.0f), p6Var.d() + AndroidUtilities.dp(6.0f));
        canvas.save();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
        canvas.scale(g10, g10, rectF.centerX(), rectF.centerY());
        rectF.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.d);
        rectF.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.f2727c);
        canvas.translate(((max - p6Var.d()) / 2.0f) + rectF.left, AndroidUtilities.dp(7.0f));
        p6Var.draw(canvas);
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
        this.f2726b.q(formatNumber, true, true);
        if (this.f2729f != i10) {
            ValueAnimator valueAnimator = this.f2730n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f2730n = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f2730n = ofFloat;
            ofFloat.addUpdateListener(new ah.d0(this, 1));
            this.f2730n.addListener(new ah.b(this, 3));
            this.f2730n.setInterpolator(new OvershootInterpolator(2.5f));
            this.f2730n.setDuration(200L);
            this.f2730n.start();
            this.f2729f = i10;
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f2726b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
