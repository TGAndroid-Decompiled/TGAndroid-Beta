package jh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import hh.bb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.er;

public final class r1 extends View {
    public float A;
    public final int[] B;
    public final float C;

    public final q1 f13884a;

    public final RectF f13885b;

    public final Path f13886c;
    public final bb d;

    public final org.telegram.ui.Components.y5 f13887e;

    public final org.telegram.ui.Components.y5 f13888f;
    public final org.telegram.ui.Components.i6 h;

    public final Paint f13889n;

    public final Paint f13890r;

    public final Drawable f13891s;
    public final jg.i v;

    public int f13892w;

    public boolean f13893x;

    public long f13894y;

    public r1(Context context, q1 q1Var, mg.b bVar) {
        super(context);
        this.f13885b = new RectF();
        this.f13886c = new Path();
        er erVar = er.h;
        this.f13887e = new org.telegram.ui.Components.y5(this, 320L, erVar);
        this.f13888f = new org.telegram.ui.Components.y5(this, 320L, erVar);
        Paint paint = new Paint(1);
        this.f13889n = paint;
        Paint paint2 = new Paint(1);
        this.f13890r = paint2;
        this.B = new int[2];
        this.C = 1.0f;
        this.f13884a = q1Var;
        h7.b6.a(this);
        this.f13891s = context.getResources().getDrawable(R.drawable.star).mutate();
        jg.i iVar = new jg.i();
        this.v = iVar;
        iVar.a(bVar);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true, false);
        this.h = i6Var;
        i6Var.r(-9866632);
        i6Var.t(AndroidUtilities.dp(9.0f));
        i6Var.setCallback(this);
        i6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        i6Var.D = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new cq(R.drawable.star, 0).setScale(1.8f, 1.8f);
        setCount(0);
        this.d = new bb(1, 50);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float fDp = AndroidUtilities.dp(38.0f);
        float fE = this.f13887e.e(this.f13893x);
        float fE2 = this.f13888f.e(this.f13892w > 0);
        float width = (getWidth() - fDp) / 2.0f;
        float height = (getHeight() - fDp) / 2.0f;
        float width2 = (getWidth() + fDp) / 2.0f;
        float height2 = (getHeight() + fDp) / 2.0f;
        RectF rectF = this.f13885b;
        rectF.set(width, height, width2, height2);
        int iD = i0.b.d(fE, -14670806, -548067);
        Paint paint = this.f13889n;
        paint.setColor(iD);
        int i10 = (int) rectF.left;
        int i11 = (int) rectF.top;
        int i12 = (int) rectF.right;
        int i13 = (int) rectF.bottom;
        jg.i iVar = this.v;
        iVar.setBounds(i10, i11, i12, i13);
        iVar.f13006g.setColor(iD);
        iVar.invalidateSelf();
        iVar.draw(canvas);
        int iDp = AndroidUtilities.dp(20.0f);
        int width3 = (getWidth() - iDp) / 2;
        int height3 = (getHeight() - iDp) / 2;
        int width4 = (getWidth() + iDp) / 2;
        int height4 = (getHeight() + iDp) / 2;
        Drawable drawable = this.f13891s;
        drawable.setBounds(width3, height3, width4, height4);
        drawable.draw(canvas);
        canvas.save();
        Path path = this.f13886c;
        path.rewind();
        path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.clipPath(path);
        float fLerp = AndroidUtilities.lerp(5.0f, 15.0f, fE);
        bb bbVar = this.d;
        bbVar.h = fLerp;
        bbVar.g(rectF);
        bbVar.d();
        bbVar.b(canvas, -1, AndroidUtilities.lerp(0.5f, 1.0f, fE));
        invalidate();
        canvas.restore();
        if (fE2 > 0.0f) {
            float fDp2 = AndroidUtilities.dp(12.0f);
            float fDp3 = AndroidUtilities.dp(6.0f);
            org.telegram.ui.Components.i6 i6Var = this.h;
            float fMax = Math.max(fDp2, i6Var.d() + fDp3);
            float fG = i6Var.g() * this.C * fE2;
            canvas.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(getWidth() - fMax, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.scale(fG, fG, rectF2.centerX(), rectF2.centerY());
            rectF2.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.f13890r);
            rectF2.set(getWidth() - fMax, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.translate(((fMax - i6Var.d()) / 2.0f) + rectF2.left, AndroidUtilities.dp(6.33f));
            i6Var.r(i0.b.d(fE, -9866632, -1));
            i6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f13884a.c(this);
    }

    public void setCount(int i10) {
        this.f13892w = i10;
        org.telegram.ui.Components.i6 i6Var = this.h;
        if (i10 > 50000) {
            i6Var.q(AndroidUtilities.formatWholeNumber(i10, 0), true, true);
        } else {
            i6Var.q(LocaleController.formatNumber(i10, ','), true, true);
        }
        invalidate();
        requestLayout();
    }

    public void setFilled(boolean z10) {
        if (this.f13893x == z10) {
            return;
        }
        this.f13893x = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return this.h == drawable || super.verifyDrawable(drawable);
    }
}
