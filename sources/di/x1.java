package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import bi.td;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.zq;
public final class x1 extends View {
    public float E;
    public final int[] F;
    public final float G;
    public final w1 f9356a;
    public final RectF f9357b;
    public final Path f9358c;
    public final td d;
    public final org.telegram.ui.Components.h6 e;
    public final org.telegram.ui.Components.h6 f9359f;
    public final org.telegram.ui.Components.r6 h;
    public final Paint f9360n;
    public final Paint f9361r;
    public final Drawable f9362s;
    public final ch.i v;
    public int f9363w;
    public boolean f9364x;
    public long f9365y;

    public x1(Context context, w1 w1Var, fh.b bVar) {
        super(context);
        this.f9357b = new RectF();
        this.f9358c = new Path();
        ds dsVar = ds.h;
        this.e = new org.telegram.ui.Components.h6(this, 320L, dsVar);
        this.f9359f = new org.telegram.ui.Components.h6(this, 320L, dsVar);
        Paint paint = new Paint(1);
        this.f9360n = paint;
        Paint paint2 = new Paint(1);
        this.f9361r = paint2;
        this.F = new int[2];
        this.G = 1.0f;
        this.f9356a = w1Var;
        kb1.b(this);
        this.f9362s = context.getResources().getDrawable(R.drawable.star).mutate();
        ch.i iVar = new ch.i();
        this.v = iVar;
        iVar.a(bVar);
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(false, true, true);
        this.h = r6Var;
        r6Var.u(-9866632);
        r6Var.w(AndroidUtilities.dp(9.0f));
        r6Var.setCallback(this);
        r6Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        r6Var.J = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new zq(R.drawable.star, 0).setScale(1.8f, 1.8f);
        setCount(0);
        this.d = new td(1, 50);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float dp = AndroidUtilities.dp(38.0f);
        float e = this.e.e(this.f9364x);
        if (this.f9363w > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e10 = this.f9359f.e(z10);
        RectF rectF = this.f9357b;
        rectF.set((getWidth() - dp) / 2.0f, (getHeight() - dp) / 2.0f, (getWidth() + dp) / 2.0f, (getHeight() + dp) / 2.0f);
        int f7 = i0.a.f(e, -14670806, -548067);
        Paint paint = this.f9360n;
        paint.setColor(f7);
        ch.i iVar = this.v;
        iVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        iVar.f6355g.setColor(f7);
        iVar.invalidateSelf();
        iVar.draw(canvas);
        int dp2 = AndroidUtilities.dp(20.0f);
        Drawable drawable = this.f9362s;
        drawable.setBounds((getWidth() - dp2) / 2, (getHeight() - dp2) / 2, (getWidth() + dp2) / 2, (getHeight() + dp2) / 2);
        drawable.draw(canvas);
        canvas.save();
        Path path = this.f9358c;
        path.rewind();
        path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.clipPath(path);
        float lerp = AndroidUtilities.lerp(5.0f, 15.0f, e);
        td tdVar = this.d;
        tdVar.h = lerp;
        tdVar.g(rectF);
        tdVar.d();
        tdVar.b(canvas, -1, AndroidUtilities.lerp(0.5f, 1.0f, e));
        invalidate();
        canvas.restore();
        if (e10 > 0.0f) {
            org.telegram.ui.Components.r6 r6Var = this.h;
            float max = Math.max(AndroidUtilities.dp(12.0f), r6Var.c() + AndroidUtilities.dp(6.0f));
            float i10 = r6Var.i() * this.G * e10;
            canvas.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.scale(i10, i10, rectF2.centerX(), rectF2.centerY());
            rectF2.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.f9361r);
            rectF2.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.translate(((max - r6Var.c()) / 2.0f) + rectF2.left, AndroidUtilities.dp(6.33f));
            r6Var.u(i0.a.f(e, -9866632, -1));
            r6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f9356a.c(this);
    }

    public void setCount(int i10) {
        this.f9363w = i10;
        org.telegram.ui.Components.r6 r6Var = this.h;
        if (i10 > 50000) {
            r6Var.t(AndroidUtilities.formatWholeNumber(i10, 0), true, true);
        } else {
            r6Var.t(LocaleController.formatNumber(i10, ','), true, true);
        }
        invalidate();
        requestLayout();
    }

    public void setFilled(boolean z10) {
        if (this.f9364x == z10) {
            return;
        }
        this.f9364x = z10;
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
