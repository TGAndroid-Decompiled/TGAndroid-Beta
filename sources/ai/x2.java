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
    public final w2 f1830a;
    public final RectF f1831b;
    public final Path f1832c;
    public final yh.j8 d;
    public final org.telegram.ui.Components.e6 f1833e;
    public final org.telegram.ui.Components.e6 f1834f;
    public final org.telegram.ui.Components.o6 h;
    public final Paint f1835n;
    public final Paint f1836r;
    public final Drawable f1837s;
    public final ah.l v;
    public int f1838w;
    public boolean f1839x;
    public long f1840y;

    public x2(Context context, w2 w2Var, dh.b bVar) {
        super(context);
        this.f1831b = new RectF();
        this.f1832c = new Path();
        tr trVar = tr.h;
        this.f1833e = new org.telegram.ui.Components.e6(this, 320L, trVar);
        this.f1834f = new org.telegram.ui.Components.e6(this, 320L, trVar);
        Paint paint = new Paint(1);
        this.f1835n = paint;
        Paint paint2 = new Paint(1);
        this.f1836r = paint2;
        this.F = new int[2];
        this.G = 1.0f;
        this.f1830a = w2Var;
        w7.b6.a(this);
        this.f1837s = context.getResources().getDrawable(R.drawable.star).mutate();
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
        this.d = new yh.j8(1, 50);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float dp = AndroidUtilities.dp(38.0f);
        float e7 = this.f1833e.e(this.f1839x);
        if (this.f1838w > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e10 = this.f1834f.e(z10);
        RectF rectF = this.f1831b;
        rectF.set((getWidth() - dp) / 2.0f, (getHeight() - dp) / 2.0f, (getWidth() + dp) / 2.0f, (getHeight() + dp) / 2.0f);
        int d = i0.a.d(e7, -14670806, -548067);
        Paint paint = this.f1835n;
        paint.setColor(d);
        ah.l lVar = this.v;
        lVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        lVar.f526g.setColor(d);
        lVar.invalidateSelf();
        lVar.draw(canvas);
        int dp2 = AndroidUtilities.dp(20.0f);
        Drawable drawable = this.f1837s;
        drawable.setBounds((getWidth() - dp2) / 2, (getHeight() - dp2) / 2, (getWidth() + dp2) / 2, (getHeight() + dp2) / 2);
        drawable.draw(canvas);
        canvas.save();
        Path path = this.f1832c;
        path.rewind();
        path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.clipPath(path);
        float lerp = AndroidUtilities.lerp(5.0f, 15.0f, e7);
        yh.j8 j8Var = this.d;
        j8Var.h = lerp;
        j8Var.g(rectF);
        j8Var.d();
        j8Var.b(canvas, -1, AndroidUtilities.lerp(0.5f, 1.0f, e7));
        invalidate();
        canvas.restore();
        if (e10 > 0.0f) {
            org.telegram.ui.Components.o6 o6Var = this.h;
            float max = Math.max(AndroidUtilities.dp(12.0f), o6Var.d() + AndroidUtilities.dp(6.0f));
            float g10 = o6Var.g() * this.G * e10;
            canvas.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.scale(g10, g10, rectF2.centerX(), rectF2.centerY());
            rectF2.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.f1836r);
            rectF2.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.translate(((max - o6Var.d()) / 2.0f) + rectF2.left, AndroidUtilities.dp(6.33f));
            o6Var.r(i0.a.d(e7, -9866632, -1));
            o6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f1830a.c(this);
    }

    public void setCount(int i10) {
        this.f1838w = i10;
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
        if (this.f1839x == z10) {
            return;
        }
        this.f1839x = z10;
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
