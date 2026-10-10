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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.is;
public final class y2 extends View {
    public float E;
    public final int[] F;
    public final float G;
    public final x2 f1934a;
    public final RectF f1935b;
    public final Path f1936c;
    public final yh.b8 d;
    public final org.telegram.ui.Components.g6 f1937e;
    public final org.telegram.ui.Components.g6 f1938f;
    public final org.telegram.ui.Components.q6 h;
    public final Paint f1939n;
    public final Paint f1940r;
    public final Drawable f1941s;
    public final ah.l v;
    public int f1942w;
    public boolean f1943x;
    public long f1944y;

    public y2(Context context, x2 x2Var, dh.b bVar) {
        super(context);
        this.f1935b = new RectF();
        this.f1936c = new Path();
        is isVar = is.h;
        this.f1937e = new org.telegram.ui.Components.g6(this, 320L, isVar);
        this.f1938f = new org.telegram.ui.Components.g6(this, 320L, isVar);
        Paint paint = new Paint(1);
        this.f1939n = paint;
        Paint paint2 = new Paint(1);
        this.f1940r = paint2;
        this.F = new int[2];
        this.G = 1.0f;
        this.f1934a = x2Var;
        w7.z5.a(this);
        this.f1941s = context.getResources().getDrawable(R.drawable.star).mutate();
        ah.l lVar = new ah.l();
        this.v = lVar;
        lVar.a(bVar);
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(false, true, true);
        this.h = q6Var;
        q6Var.u(-9866632);
        q6Var.w(AndroidUtilities.dp(9.0f));
        q6Var.setCallback(this);
        q6Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        q6Var.J = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new er(R.drawable.star, 0).setScale(1.8f, 1.8f);
        setCount(0);
        this.d = new yh.b8(1, 50);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float dp = AndroidUtilities.dp(38.0f);
        float e7 = this.f1937e.e(this.f1943x);
        if (this.f1942w > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e10 = this.f1938f.e(z10);
        RectF rectF = this.f1935b;
        rectF.set((getWidth() - dp) / 2.0f, (getHeight() - dp) / 2.0f, (getWidth() + dp) / 2.0f, (getHeight() + dp) / 2.0f);
        int d = i0.a.d(e7, -14670806, -548067);
        Paint paint = this.f1939n;
        paint.setColor(d);
        ah.l lVar = this.v;
        lVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        lVar.f609g.setColor(d);
        lVar.invalidateSelf();
        lVar.draw(canvas);
        int dp2 = AndroidUtilities.dp(20.0f);
        Drawable drawable = this.f1941s;
        drawable.setBounds((getWidth() - dp2) / 2, (getHeight() - dp2) / 2, (getWidth() + dp2) / 2, (getHeight() + dp2) / 2);
        drawable.draw(canvas);
        canvas.save();
        Path path = this.f1936c;
        path.rewind();
        path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.clipPath(path);
        float lerp = AndroidUtilities.lerp(5.0f, 15.0f, e7);
        yh.b8 b8Var = this.d;
        b8Var.h = lerp;
        b8Var.g(rectF);
        b8Var.d();
        b8Var.b(canvas, -1, AndroidUtilities.lerp(0.5f, 1.0f, e7));
        invalidate();
        canvas.restore();
        if (e10 > 0.0f) {
            org.telegram.ui.Components.q6 q6Var = this.h;
            float max = Math.max(AndroidUtilities.dp(12.0f), q6Var.c() + AndroidUtilities.dp(6.0f));
            float i10 = q6Var.i() * this.G * e10;
            canvas.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.scale(i10, i10, rectF2.centerX(), rectF2.centerY());
            rectF2.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.f1940r);
            rectF2.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.translate(((max - q6Var.c()) / 2.0f) + rectF2.left, AndroidUtilities.dp(6.33f));
            q6Var.u(i0.a.d(e7, -9866632, -1));
            q6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f1934a.c(this);
    }

    public void setCount(int i10) {
        this.f1942w = i10;
        org.telegram.ui.Components.q6 q6Var = this.h;
        if (i10 > 50000) {
            q6Var.t(AndroidUtilities.formatWholeNumber(i10, 0), true, true);
        } else {
            q6Var.t(LocaleController.formatNumber(i10, ','), true, true);
        }
        invalidate();
        requestLayout();
    }

    public void setFilled(boolean z10) {
        if (this.f1943x == z10) {
            return;
        }
        this.f1943x = z10;
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
