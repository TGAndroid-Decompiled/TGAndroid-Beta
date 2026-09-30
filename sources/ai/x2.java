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
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.tr;
public final class x2 extends View {
    public float E;
    public final int[] F;
    public final float G;
    public final w2 f1688a;
    public final RectF f1689b;
    public final Path f1690c;
    public final yh.i8 d;
    public final org.telegram.ui.Components.e6 e;
    public final org.telegram.ui.Components.e6 f1691f;
    public final org.telegram.ui.Components.o6 h;
    public final Paint f1692n;
    public final Paint f1693r;
    public final Drawable f1694s;
    public final ah.l v;
    public int f1695w;
    public boolean f1696x;
    public long f1697y;

    public x2(Context context, w2 w2Var, dh.b bVar) {
        super(context);
        this.f1689b = new RectF();
        this.f1690c = new Path();
        tr trVar = tr.h;
        this.e = new org.telegram.ui.Components.e6(this, 320L, trVar);
        this.f1691f = new org.telegram.ui.Components.e6(this, 320L, trVar);
        Paint paint = new Paint(1);
        this.f1692n = paint;
        Paint paint2 = new Paint(1);
        this.f1693r = paint2;
        this.F = new int[2];
        this.G = 1.0f;
        this.f1688a = w2Var;
        w7.a6.a(this);
        this.f1694s = context.getResources().getDrawable(R.drawable.star).mutate();
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
        new rq(R.drawable.star, 0).setScale(1.8f, 1.8f);
        setCount(0);
        this.d = new yh.i8(1, 50);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float dp = AndroidUtilities.dp(38.0f);
        float e = this.e.e(this.f1696x);
        if (this.f1695w > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e7 = this.f1691f.e(z10);
        RectF rectF = this.f1689b;
        rectF.set((getWidth() - dp) / 2.0f, (getHeight() - dp) / 2.0f, (getWidth() + dp) / 2.0f, (getHeight() + dp) / 2.0f);
        int d = i0.a.d(e, -14670806, -548067);
        Paint paint = this.f1692n;
        paint.setColor(d);
        ah.l lVar = this.v;
        lVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        lVar.f482g.setColor(d);
        lVar.invalidateSelf();
        lVar.draw(canvas);
        int dp2 = AndroidUtilities.dp(20.0f);
        Drawable drawable = this.f1694s;
        drawable.setBounds((getWidth() - dp2) / 2, (getHeight() - dp2) / 2, (getWidth() + dp2) / 2, (getHeight() + dp2) / 2);
        drawable.draw(canvas);
        canvas.save();
        Path path = this.f1690c;
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
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.f1693r);
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
        this.f1688a.c(this);
    }

    public void setCount(int i10) {
        this.f1695w = i10;
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
        if (this.f1696x == z10) {
            return;
        }
        this.f1696x = z10;
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
