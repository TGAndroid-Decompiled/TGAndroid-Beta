package bi;

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
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.pr;
public final class l2 extends View {
    public float E;
    public final int[] F;
    public final float G;
    public final k2 f3255a;
    public final RectF f3256b;
    public final Path f3257c;
    public final zh.h8 d;
    public final org.telegram.ui.Components.e6 f3258e;
    public final org.telegram.ui.Components.e6 f3259f;
    public final org.telegram.ui.Components.p6 h;
    public final Paint f3260n;
    public final Paint f3261r;
    public final Drawable f3262s;
    public final bh.j v;
    public int f3263w;
    public boolean f3264x;
    public long f3265y;

    public l2(Context context, k2 k2Var, eh.b bVar) {
        super(context);
        this.f3256b = new RectF();
        this.f3257c = new Path();
        pr prVar = pr.h;
        this.f3258e = new org.telegram.ui.Components.e6(this, 320L, prVar);
        this.f3259f = new org.telegram.ui.Components.e6(this, 320L, prVar);
        Paint paint = new Paint(1);
        this.f3260n = paint;
        Paint paint2 = new Paint(1);
        this.f3261r = paint2;
        this.F = new int[2];
        this.G = 1.0f;
        this.f3255a = k2Var;
        w7.z5.a(this);
        this.f3262s = context.getResources().getDrawable(R.drawable.star).mutate();
        bh.j jVar = new bh.j();
        this.v = jVar;
        jVar.a(bVar);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, true, true, false);
        this.h = p6Var;
        p6Var.r(-9866632);
        p6Var.t(AndroidUtilities.dp(9.0f));
        p6Var.setCallback(this);
        p6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        p6Var.D = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new nq(R.drawable.star, 0).setScale(1.8f, 1.8f);
        setCount(0);
        this.d = new zh.h8(1, 50);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float dp = AndroidUtilities.dp(38.0f);
        float e7 = this.f3258e.e(this.f3264x);
        if (this.f3263w > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e10 = this.f3259f.e(z10);
        RectF rectF = this.f3256b;
        rectF.set((getWidth() - dp) / 2.0f, (getHeight() - dp) / 2.0f, (getWidth() + dp) / 2.0f, (getHeight() + dp) / 2.0f);
        int d = i0.a.d(e7, -14670806, -548067);
        Paint paint = this.f3260n;
        paint.setColor(d);
        bh.j jVar = this.v;
        jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        jVar.f2743g.setColor(d);
        jVar.invalidateSelf();
        jVar.draw(canvas);
        int dp2 = AndroidUtilities.dp(20.0f);
        Drawable drawable = this.f3262s;
        drawable.setBounds((getWidth() - dp2) / 2, (getHeight() - dp2) / 2, (getWidth() + dp2) / 2, (getHeight() + dp2) / 2);
        drawable.draw(canvas);
        canvas.save();
        Path path = this.f3257c;
        path.rewind();
        path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.clipPath(path);
        float lerp = AndroidUtilities.lerp(5.0f, 15.0f, e7);
        zh.h8 h8Var = this.d;
        h8Var.h = lerp;
        h8Var.g(rectF);
        h8Var.d();
        h8Var.b(canvas, -1, AndroidUtilities.lerp(0.5f, 1.0f, e7));
        invalidate();
        canvas.restore();
        if (e10 > 0.0f) {
            org.telegram.ui.Components.p6 p6Var = this.h;
            float max = Math.max(AndroidUtilities.dp(12.0f), p6Var.d() + AndroidUtilities.dp(6.0f));
            float g10 = p6Var.g() * this.G * e10;
            canvas.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.scale(g10, g10, rectF2.centerX(), rectF2.centerY());
            rectF2.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.f3261r);
            rectF2.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.translate(((max - p6Var.d()) / 2.0f) + rectF2.left, AndroidUtilities.dp(6.33f));
            p6Var.r(i0.a.d(e7, -9866632, -1));
            p6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f3255a.c(this);
    }

    public void setCount(int i10) {
        this.f3263w = i10;
        org.telegram.ui.Components.p6 p6Var = this.h;
        if (i10 > 50000) {
            p6Var.q(AndroidUtilities.formatWholeNumber(i10, 0), true, true);
        } else {
            p6Var.q(LocaleController.formatNumber(i10, ','), true, true);
        }
        invalidate();
        requestLayout();
    }

    public void setFilled(boolean z10) {
        if (this.f3264x == z10) {
            return;
        }
        this.f3264x = z10;
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
