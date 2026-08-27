package jh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.er;

public final class a extends FrameLayout {

    public final ImageView f13015a;

    public final org.telegram.ui.Components.i6 f13016b;

    public final Paint f13017c;
    public final Paint d;

    public boolean f13018e;

    public int f13019f;
    public float h;

    public ValueAnimator f13020n;

    public a(Context context, mg.b bVar) {
        super(context);
        Paint paint = new Paint(1);
        this.f13017c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.h = 1.0f;
        h7.b6.a(this);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        this.f13016b = i6Var;
        i6Var.r(-9866632);
        i6Var.t(AndroidUtilities.dp(9.0f));
        i6Var.setCallback(this);
        i6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        i6Var.D = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        FrameLayout frameLayout = new FrameLayout(context);
        jg.i iVar = new jg.i();
        iVar.a(bVar);
        iVar.f13006g.setColor(-14670806);
        iVar.invalidateSelf();
        iVar.f13005f = AndroidUtilities.dp(1.0f);
        frameLayout.setBackground(iVar);
        addView(frameLayout, h7.z5.e(40, 40, 17));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.menu_comments);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, mode));
        frameLayout.addView(imageView, h7.z5.e(20, 20, 17));
        ImageView imageView2 = new ImageView(context);
        this.f13015a = imageView2;
        imageView2.setImageResource(R.drawable.menu_comments_arrow);
        imageView2.setColorFilter(new PorterDuffColorFilter(-2960428, mode));
        frameLayout.addView(imageView2, h7.z5.e(20, 20, 17));
        imageView2.setPivotX(AndroidUtilities.dp(10.27f));
        imageView2.setPivotY(AndroidUtilities.dp(9.58f));
    }

    public final void a(boolean z10, boolean z11) {
        if (z11 && this.f13018e == z10) {
            return;
        }
        this.f13018e = z10;
        ImageView imageView = this.f13015a;
        if (z11) {
            rl.o(imageView.animate().rotation(z10 ? 0.0f : 180.0f), er.h, 420L);
        } else {
            imageView.setRotation(z10 ? 0.0f : 180.0f);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        super.dispatchDraw(canvas);
        float f10 = this.h;
        org.telegram.ui.Components.i6 i6Var = this.f13016b;
        float fG = i6Var.g() * f10;
        float fMax = Math.max(AndroidUtilities.dp(12.0f), i6Var.d() + AndroidUtilities.dp(6.0f));
        canvas.save();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getWidth() - fMax, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
        canvas.scale(fG, fG, rectF.centerX(), rectF.centerY());
        rectF.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.d);
        rectF.set(getWidth() - fMax, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.f13017c);
        canvas.translate(((fMax - i6Var.d()) / 2.0f) + rectF.left, AndroidUtilities.dp(7.0f));
        i6Var.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    public void setCount(int i10) {
        this.f13016b.q(i10 <= 0 ? "" : LocaleController.formatNumber(i10, ','), true, true);
        if (this.f13019f != i10) {
            ValueAnimator valueAnimator = this.f13020n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f13020n = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f13020n = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ag.u(this, 13));
            this.f13020n.addListener(new ag.r1(this, 11));
            this.f13020n.setInterpolator(new OvershootInterpolator(2.5f));
            this.f13020n.setDuration(200L);
            this.f13020n.start();
            this.f13019f = i10;
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f13016b || super.verifyDrawable(drawable);
    }
}
