package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import gh.bb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
public final class t1 extends View {
    public float A;
    public final int[] B;
    public final float C;
    public final s1 f12147a;
    public final RectF f12148b;
    public final Path f12149c;
    public final bb d;
    public final org.telegram.ui.Components.y5 f12150e;
    public final org.telegram.ui.Components.y5 f12151f;
    public final org.telegram.ui.Components.i6 h;
    public final Paint f12152n;
    public final Paint f12153r;
    public final Drawable f12154s;
    public final ig.i v;
    public int f12155w;
    public boolean f12156x;
    public long f12157y;

    public t1(Context context, s1 s1Var, lg.b bVar) {
        super(context);
        this.f12148b = new RectF();
        this.f12149c = new Path();
        gr grVar = gr.h;
        this.f12150e = new org.telegram.ui.Components.y5(this, 320L, grVar);
        this.f12151f = new org.telegram.ui.Components.y5(this, 320L, grVar);
        Paint paint = new Paint(1);
        this.f12152n = paint;
        Paint paint2 = new Paint(1);
        this.f12153r = paint2;
        this.B = new int[2];
        this.C = 1.0f;
        this.f12147a = s1Var;
        g7.g6.a(this);
        this.f12154s = context.getResources().getDrawable(R.drawable.star).mutate();
        ig.i iVar = new ig.i();
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
        new eq(R.drawable.star, 0).setScale(1.8f, 1.8f);
        setCount(0);
        this.d = new bb(1, 50);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float dp = AndroidUtilities.dp(38.0f);
        float e10 = this.f12150e.e(this.f12156x);
        if (this.f12155w > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e11 = this.f12151f.e(z10);
        RectF rectF = this.f12148b;
        rectF.set((getWidth() - dp) / 2.0f, (getHeight() - dp) / 2.0f, (getWidth() + dp) / 2.0f, (getHeight() + dp) / 2.0f);
        int d = i0.a.d(e10, -14670806, -548067);
        Paint paint = this.f12152n;
        paint.setColor(d);
        ig.i iVar = this.v;
        iVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        iVar.f11194g.setColor(d);
        iVar.invalidateSelf();
        iVar.draw(canvas);
        int dp2 = AndroidUtilities.dp(20.0f);
        Drawable drawable = this.f12154s;
        drawable.setBounds((getWidth() - dp2) / 2, (getHeight() - dp2) / 2, (getWidth() + dp2) / 2, (getHeight() + dp2) / 2);
        drawable.draw(canvas);
        canvas.save();
        Path path = this.f12149c;
        path.rewind();
        path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.clipPath(path);
        float lerp = AndroidUtilities.lerp(5.0f, 15.0f, e10);
        bb bbVar = this.d;
        bbVar.h = lerp;
        bbVar.g(rectF);
        bbVar.d();
        bbVar.b(canvas, -1, AndroidUtilities.lerp(0.5f, 1.0f, e10));
        invalidate();
        canvas.restore();
        if (e11 > 0.0f) {
            org.telegram.ui.Components.i6 i6Var = this.h;
            float max = Math.max(AndroidUtilities.dp(12.0f), i6Var.d() + AndroidUtilities.dp(6.0f));
            float g10 = i6Var.g() * this.C * e11;
            canvas.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.scale(g10, g10, rectF2.centerX(), rectF2.centerY());
            rectF2.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.f12153r);
            rectF2.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.translate(((max - i6Var.d()) / 2.0f) + rectF2.left, AndroidUtilities.dp(6.33f));
            i6Var.r(i0.a.d(e10, -9866632, -1));
            i6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        this.f12147a.c(this);
    }

    public void setCount(int i9) {
        this.f12155w = i9;
        org.telegram.ui.Components.i6 i6Var = this.h;
        if (i9 > 50000) {
            i6Var.q(AndroidUtilities.formatWholeNumber(i9, 0), true, true);
        } else {
            i6Var.q(LocaleController.formatNumber(i9, ','), true, true);
        }
        invalidate();
        requestLayout();
    }

    public void setFilled(boolean z10) {
        if (this.f12156x == z10) {
            return;
        }
        this.f12156x = z10;
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
