package ih;

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
import org.telegram.messenger.ll;
import org.telegram.ui.Components.gr;
public final class a extends FrameLayout {
    public final ImageView f11203a;
    public final org.telegram.ui.Components.i6 f11204b;
    public final Paint f11205c;
    public final Paint d;
    public boolean f11206e;
    public int f11207f;
    public float h;
    public ValueAnimator f11208n;

    public a(Context context, lg.b bVar) {
        super(context);
        Paint paint = new Paint(1);
        this.f11205c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.h = 1.0f;
        g7.g6.a(this);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        this.f11204b = i6Var;
        i6Var.r(-9866632);
        i6Var.t(AndroidUtilities.dp(9.0f));
        i6Var.setCallback(this);
        i6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        i6Var.D = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        FrameLayout frameLayout = new FrameLayout(context);
        ig.i iVar = new ig.i();
        iVar.a(bVar);
        iVar.f11194g.setColor(-14670806);
        iVar.invalidateSelf();
        iVar.f11193f = AndroidUtilities.dp(1.0f);
        frameLayout.setBackground(iVar);
        addView(frameLayout, g7.e6.e(40, 40, 17));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.menu_comments);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, mode));
        frameLayout.addView(imageView, g7.e6.e(20, 20, 17));
        ImageView imageView2 = new ImageView(context);
        this.f11203a = imageView2;
        imageView2.setImageResource(R.drawable.menu_comments_arrow);
        imageView2.setColorFilter(new PorterDuffColorFilter(-2960428, mode));
        frameLayout.addView(imageView2, g7.e6.e(20, 20, 17));
        imageView2.setPivotX(AndroidUtilities.dp(10.27f));
        imageView2.setPivotY(AndroidUtilities.dp(9.58f));
    }

    public final void a(boolean z10, boolean z11) {
        if (z11 && this.f11206e == z10) {
            return;
        }
        this.f11206e = z10;
        float f10 = 180.0f;
        ImageView imageView = this.f11203a;
        if (z11) {
            ViewPropertyAnimator animate = imageView.animate();
            if (z10) {
                f10 = 0.0f;
            }
            ll.r(animate.rotation(f10), gr.h, 420L);
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
        org.telegram.ui.Components.i6 i6Var = this.f11204b;
        float g10 = i6Var.g() * f10;
        float max = Math.max(AndroidUtilities.dp(12.0f), i6Var.d() + AndroidUtilities.dp(6.0f));
        canvas.save();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
        canvas.scale(g10, g10, rectF.centerX(), rectF.centerY());
        rectF.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.d);
        rectF.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.f11205c);
        canvas.translate(((max - i6Var.d()) / 2.0f) + rectF.left, AndroidUtilities.dp(7.0f));
        i6Var.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    public void setCount(int i9) {
        String formatNumber;
        if (i9 <= 0) {
            formatNumber = "";
        } else {
            formatNumber = LocaleController.formatNumber(i9, ',');
        }
        this.f11204b.q(formatNumber, true, true);
        if (this.f11207f != i9) {
            ValueAnimator valueAnimator = this.f11208n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f11208n = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f11208n = ofFloat;
            ofFloat.addUpdateListener(new bg.b(this, 10));
            this.f11208n.addListener(new ag.e(this, 9));
            this.f11208n.setInterpolator(new OvershootInterpolator(2.5f));
            this.f11208n.setDuration(200L);
            this.f11208n.start();
            this.f11207f = i9;
        }
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f11204b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
