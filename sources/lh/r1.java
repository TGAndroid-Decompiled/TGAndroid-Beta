package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import jh.va;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jr;
public final class r1 extends View {
    public float A;
    public final int[] B;
    public final float C;
    public final q1 f16149a;
    public final RectF f16150b;
    public final Path f16151c;
    public final va d;
    public final org.telegram.ui.Components.d6 f16152e;
    public final org.telegram.ui.Components.d6 f16153f;
    public final org.telegram.ui.Components.n6 h;
    public final Paint f16154n;
    public final Paint f16155r;
    public final Drawable f16156s;
    public final lg.i v;
    public int f16157w;
    public boolean f16158x;
    public long f16159y;

    public r1(Context context, q1 q1Var, og.b bVar) {
        super(context);
        this.f16150b = new RectF();
        this.f16151c = new Path();
        jr jrVar = jr.h;
        this.f16152e = new org.telegram.ui.Components.d6(this, 320L, jrVar);
        this.f16153f = new org.telegram.ui.Components.d6(this, 320L, jrVar);
        Paint paint = new Paint(1);
        this.f16154n = paint;
        Paint paint2 = new Paint(1);
        this.f16155r = paint2;
        this.B = new int[2];
        this.C = 1.0f;
        this.f16149a = q1Var;
        i7.h6.a(this);
        this.f16156s = context.getResources().getDrawable(R.drawable.star).mutate();
        lg.i iVar = new lg.i();
        this.v = iVar;
        iVar.a(bVar);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true, false);
        this.h = n6Var;
        n6Var.r(-9866632);
        n6Var.t(AndroidUtilities.dp(9.0f));
        n6Var.setCallback(this);
        n6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        n6Var.D = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new iq(R.drawable.star, 0).setScale(1.8f, 1.8f);
        setCount(0);
        this.d = new va(1, 50);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float dp = AndroidUtilities.dp(38.0f);
        float e10 = this.f16152e.e(this.f16158x);
        if (this.f16157w > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e11 = this.f16153f.e(z10);
        RectF rectF = this.f16150b;
        rectF.set((getWidth() - dp) / 2.0f, (getHeight() - dp) / 2.0f, (getWidth() + dp) / 2.0f, (getHeight() + dp) / 2.0f);
        int d = i0.a.d(e10, -14670806, -548067);
        Paint paint = this.f16154n;
        paint.setColor(d);
        lg.i iVar = this.v;
        iVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        iVar.f15287g.setColor(d);
        iVar.invalidateSelf();
        iVar.draw(canvas);
        int dp2 = AndroidUtilities.dp(20.0f);
        Drawable drawable = this.f16156s;
        drawable.setBounds((getWidth() - dp2) / 2, (getHeight() - dp2) / 2, (getWidth() + dp2) / 2, (getHeight() + dp2) / 2);
        drawable.draw(canvas);
        canvas.save();
        Path path = this.f16151c;
        path.rewind();
        path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.clipPath(path);
        float lerp = AndroidUtilities.lerp(5.0f, 15.0f, e10);
        va vaVar = this.d;
        vaVar.h = lerp;
        vaVar.g(rectF);
        vaVar.d();
        vaVar.b(canvas, -1, AndroidUtilities.lerp(0.5f, 1.0f, e10));
        invalidate();
        canvas.restore();
        if (e11 > 0.0f) {
            org.telegram.ui.Components.n6 n6Var = this.h;
            float max = Math.max(AndroidUtilities.dp(12.0f), n6Var.d() + AndroidUtilities.dp(6.0f));
            float g10 = n6Var.g() * this.C * e11;
            canvas.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.scale(g10, g10, rectF2.centerX(), rectF2.centerY());
            rectF2.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.f16155r);
            rectF2.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.translate(((max - n6Var.d()) / 2.0f) + rectF2.left, AndroidUtilities.dp(6.33f));
            n6Var.r(i0.a.d(e10, -9866632, -1));
            n6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f16149a.c(this);
    }

    public void setCount(int i10) {
        this.f16157w = i10;
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
        if (this.f16158x == z10) {
            return;
        }
        this.f16158x = z10;
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
