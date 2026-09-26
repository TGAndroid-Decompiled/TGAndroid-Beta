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
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.sr;
public final class x2 extends View {
    public float E;
    public final int[] F;
    public final float G;
    public final w2 f1681a;
    public final RectF f1682b;
    public final Path f1683c;
    public final yh.i8 d;
    public final org.telegram.ui.Components.e6 e;
    public final org.telegram.ui.Components.e6 f1684f;
    public final org.telegram.ui.Components.o6 h;
    public final Paint f1685n;
    public final Paint f1686r;
    public final Drawable f1687s;
    public final ah.l v;
    public int f1688w;
    public boolean f1689x;
    public long f1690y;

    public x2(Context context, w2 w2Var, dh.b bVar) {
        super(context);
        this.f1682b = new RectF();
        this.f1683c = new Path();
        sr srVar = sr.h;
        this.e = new org.telegram.ui.Components.e6(this, 320L, srVar);
        this.f1684f = new org.telegram.ui.Components.e6(this, 320L, srVar);
        Paint paint = new Paint(1);
        this.f1685n = paint;
        Paint paint2 = new Paint(1);
        this.f1686r = paint2;
        this.F = new int[2];
        this.G = 1.0f;
        this.f1681a = w2Var;
        w7.a6.a(this);
        this.f1687s = context.getResources().getDrawable(R.drawable.star).mutate();
        ah.l lVar = new ah.l();
        this.v = lVar;
        lVar.a(bVar);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(false, true, true, false);
        this.h = o6Var;
        o6Var.r(-9866632);
        o6Var.t(AndroidUtilities.dp(9.0f));
        o6Var.setCallback(this);
        o6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        o6Var.D = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new qq(R.drawable.star, 0).setScale(1.8f, 1.8f);
        setCount(0);
        this.d = new yh.i8(1, 50);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float dp = AndroidUtilities.dp(38.0f);
        float e = this.e.e(this.f1689x);
        if (this.f1688w > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e7 = this.f1684f.e(z10);
        RectF rectF = this.f1682b;
        rectF.set((getWidth() - dp) / 2.0f, (getHeight() - dp) / 2.0f, (getWidth() + dp) / 2.0f, (getHeight() + dp) / 2.0f);
        int d = i0.a.d(e, -14670806, -548067);
        Paint paint = this.f1685n;
        paint.setColor(d);
        ah.l lVar = this.v;
        lVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        lVar.f482g.setColor(d);
        lVar.invalidateSelf();
        lVar.draw(canvas);
        int dp2 = AndroidUtilities.dp(20.0f);
        Drawable drawable = this.f1687s;
        drawable.setBounds((getWidth() - dp2) / 2, (getHeight() - dp2) / 2, (getWidth() + dp2) / 2, (getHeight() + dp2) / 2);
        drawable.draw(canvas);
        canvas.save();
        Path path = this.f1683c;
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
            org.telegram.ui.Components.o6 o6Var = this.h;
            float max = Math.max(AndroidUtilities.dp(12.0f), o6Var.d() + AndroidUtilities.dp(6.0f));
            float g10 = o6Var.g() * this.G * e7;
            canvas.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.scale(g10, g10, rectF2.centerX(), rectF2.centerY());
            rectF2.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.f1686r);
            rectF2.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.translate(((max - o6Var.d()) / 2.0f) + rectF2.left, AndroidUtilities.dp(6.33f));
            o6Var.r(i0.a.d(e, -9866632, -1));
            o6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f1681a.c(this);
    }

    public void setCount(int i10) {
        this.f1688w = i10;
        org.telegram.ui.Components.o6 o6Var = this.h;
        if (i10 > 50000) {
            o6Var.q(AndroidUtilities.formatWholeNumber(i10, 0), true, true);
        } else {
            o6Var.q(LocaleController.formatNumber(i10, ','), true, true);
        }
        invalidate();
        requestLayout();
    }

    public void setFilled(boolean z10) {
        if (this.f1689x == z10) {
            return;
        }
        this.f1689x = z10;
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
