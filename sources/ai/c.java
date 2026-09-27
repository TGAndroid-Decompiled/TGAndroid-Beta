package ai;

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
import org.telegram.messenger.qk;
import org.telegram.ui.Components.sr;
public final class c extends FrameLayout {
    public final ImageView f623a;
    public final org.telegram.ui.Components.o6 f624b;
    public final Paint f625c;
    public final Paint d;
    public boolean e;
    public int f626f;
    public float h;
    public ValueAnimator f627n;

    public c(Context context, dh.b bVar) {
        super(context);
        Paint paint = new Paint(1);
        this.f625c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.h = 1.0f;
        w7.a6.a(this);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(false, true, true, false);
        this.f624b = o6Var;
        o6Var.r(-9866632);
        o6Var.t(AndroidUtilities.dp(9.0f));
        o6Var.setCallback(this);
        o6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        o6Var.D = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        FrameLayout frameLayout = new FrameLayout(context);
        ah.l lVar = new ah.l();
        lVar.a(bVar);
        lVar.f485g.setColor(-14670806);
        lVar.invalidateSelf();
        lVar.f484f = AndroidUtilities.dp(1.0f);
        frameLayout.setBackground(lVar);
        addView(frameLayout, w7.y5.e(40, 40, 17));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.menu_comments);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, mode));
        frameLayout.addView(imageView, w7.y5.e(20, 20, 17));
        ImageView imageView2 = new ImageView(context);
        this.f623a = imageView2;
        imageView2.setImageResource(R.drawable.menu_comments_arrow);
        imageView2.setColorFilter(new PorterDuffColorFilter(-2960428, mode));
        frameLayout.addView(imageView2, w7.y5.e(20, 20, 17));
        imageView2.setPivotX(AndroidUtilities.dp(10.27f));
        imageView2.setPivotY(AndroidUtilities.dp(9.58f));
    }

    public final void a(boolean z10, boolean z11) {
        if (z11 && this.e == z10) {
            return;
        }
        this.e = z10;
        float f7 = 180.0f;
        ImageView imageView = this.f623a;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (z10) {
                f7 = 0.0f;
            }
            qk.s(animate.rotation(f7), sr.h, 420L);
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
        org.telegram.ui.Components.o6 o6Var = this.f624b;
        float g10 = o6Var.g() * f7;
        float max = Math.max(AndroidUtilities.dp(12.0f), o6Var.d() + AndroidUtilities.dp(6.0f));
        canvas.save();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
        canvas.scale(g10, g10, rectF.centerX(), rectF.centerY());
        rectF.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.d);
        rectF.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.f625c);
        canvas.translate(((max - o6Var.d()) / 2.0f) + rectF.left, AndroidUtilities.dp(7.0f));
        o6Var.draw(canvas);
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
        this.f624b.q(formatNumber, true, true);
        if (this.f626f != i10) {
            ValueAnimator valueAnimator = this.f627n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f627n = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f627n = ofFloat;
            ofFloat.addUpdateListener(new a(this, 0));
            this.f627n.addListener(new b(this, 0));
            this.f627n.setInterpolator(new OvershootInterpolator(2.5f));
            this.f627n.setDuration(200L);
            this.f627n.start();
            this.f626f = i10;
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f624b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
