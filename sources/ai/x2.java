package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.qr;
public final class x2 extends View {
    public float E;
    public final int[] F;
    public final float G;
    public final w2 f1686a;
    public final RectF f1687b;
    public final Path f1688c;
    public final yh.i8 d;
    public final org.telegram.ui.Components.d6 e;
    public final org.telegram.ui.Components.d6 f1689f;
    public final org.telegram.ui.Components.n6 h;
    public final Paint f1690n;
    public final Paint f1691r;
    public final Drawable f1692s;
    public final ah.m v;
    public int f1693w;
    public boolean f1694x;
    public long f1695y;

    public x2(Context context, w2 w2Var, dh.b bVar) {
        super(context);
        this.f1687b = new RectF();
        this.f1688c = new Path();
        qr qrVar = qr.h;
        this.e = new org.telegram.ui.Components.d6(this, 320L, qrVar);
        this.f1689f = new org.telegram.ui.Components.d6(this, 320L, qrVar);
        Paint paint = new Paint(1);
        this.f1690n = paint;
        Paint paint2 = new Paint(1);
        this.f1691r = paint2;
        this.F = new int[2];
        this.G = 1.0f;
        this.f1686a = w2Var;
        w7.b6.a(this);
        this.f1692s = context.getResources().getDrawable(R.drawable.star).mutate();
        ah.m mVar = new ah.m();
        this.v = mVar;
        mVar.a(bVar);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true, false);
        this.h = n6Var;
        n6Var.r(-9866632);
        n6Var.t(AndroidUtilities.dp(9.0f));
        n6Var.setCallback(this);
        n6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        n6Var.D = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new oq(R.drawable.star, 0).setScale(1.8f, 1.8f);
        setCount(0);
        this.d = new yh.i8(1, 50);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float dp = AndroidUtilities.dp(38.0f);
        float e = this.e.e(this.f1694x);
        if (this.f1693w > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e7 = this.f1689f.e(z10);
        RectF rectF = this.f1687b;
        rectF.set((getWidth() - dp) / 2.0f, (getHeight() - dp) / 2.0f, (getWidth() + dp) / 2.0f, (getHeight() + dp) / 2.0f);
        int d = i0.a.d(e, -14670806, -548067);
        Paint paint = this.f1690n;
        paint.setColor(d);
        ah.m mVar = this.v;
        mVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        mVar.f485g.setColor(d);
        mVar.invalidateSelf();
        mVar.draw(canvas);
        int dp2 = AndroidUtilities.dp(20.0f);
        Drawable drawable = this.f1692s;
        drawable.setBounds((getWidth() - dp2) / 2, (getHeight() - dp2) / 2, (getWidth() + dp2) / 2, (getHeight() + dp2) / 2);
        drawable.draw(canvas);
        canvas.save();
        Path path = this.f1688c;
        path.rewind();
        path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.clipPath(path);
        float lerp = AndroidUtilities.lerp(5.0f, 15.0f, e);
        yh.i8 i8Var = this.d;
        i8Var.h = lerp;
        i8Var.g(rectF);
        i8Var.d();
        i8Var.b(canvas, -1, AndroidUtilities.lerp(0.5f, 1.0f, e));
        invalidate();
        canvas.restore();
        if (e7 > 0.0f) {
            org.telegram.ui.Components.n6 n6Var = this.h;
            float max = Math.max(AndroidUtilities.dp(12.0f), n6Var.d() + AndroidUtilities.dp(6.0f));
            float g10 = n6Var.g() * this.G * e7;
            canvas.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.scale(g10, g10, rectF2.centerX(), rectF2.centerY());
            rectF2.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.f1691r);
            rectF2.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.translate(((max - n6Var.d()) / 2.0f) + rectF2.left, AndroidUtilities.dp(6.33f));
            n6Var.r(i0.a.d(e, -9866632, -1));
            n6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f1686a.c(this);
    }

    public void setCount(int i10) {
        this.f1693w = i10;
        org.telegram.ui.Components.n6 n6Var = this.h;
        if (i10 > 50000) {
            n6Var.q(AndroidUtilities.formatWholeNumber(i10, 0), true, true);
        } else {
            n6Var.q(LocaleController.formatNumber(i10, ','), true, true);
        }
        invalidate();
        requestLayout();
    }

    public void setFilled(boolean z10) {
        if (this.f1694x == z10) {
            return;
        }
        this.f1694x = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.h != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
