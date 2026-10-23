package ci;

import ai.ee;
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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.xq;
public final class x1 extends View {
    public float E;
    public final int[] F;
    public final float G;
    public final w1 f6096a;
    public final RectF f6097b;
    public final Path f6098c;
    public final ee d;
    public final org.telegram.ui.Components.f6 e;
    public final org.telegram.ui.Components.f6 f6099f;
    public final org.telegram.ui.Components.p6 h;
    public final Paint f6100n;
    public final Paint f6101r;
    public final Drawable f6102s;
    public final bh.j v;
    public int f6103w;
    public boolean f6104x;
    public long f6105y;

    public x1(Context context, w1 w1Var, eh.b bVar) {
        super(context);
        this.f6097b = new RectF();
        this.f6098c = new Path();
        bs bsVar = bs.h;
        this.e = new org.telegram.ui.Components.f6(this, 320L, bsVar);
        this.f6099f = new org.telegram.ui.Components.f6(this, 320L, bsVar);
        Paint paint = new Paint(1);
        this.f6100n = paint;
        Paint paint2 = new Paint(1);
        this.f6101r = paint2;
        this.F = new int[2];
        this.G = 1.0f;
        this.f6096a = w1Var;
        w7.b6.a(this);
        this.f6102s = context.getResources().getDrawable(R.drawable.star).mutate();
        bh.j jVar = new bh.j();
        this.v = jVar;
        jVar.a(bVar);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, true, true);
        this.h = p6Var;
        p6Var.u(-9866632);
        p6Var.w(AndroidUtilities.dp(9.0f));
        p6Var.setCallback(this);
        p6Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        p6Var.J = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new xq(R.drawable.star, 0).setScale(1.8f, 1.8f);
        setCount(0);
        this.d = new ee(1, 50);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float dp = AndroidUtilities.dp(38.0f);
        float e = this.e.e(this.f6104x);
        if (this.f6103w > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e7 = this.f6099f.e(z10);
        RectF rectF = this.f6097b;
        rectF.set((getWidth() - dp) / 2.0f, (getHeight() - dp) / 2.0f, (getWidth() + dp) / 2.0f, (getHeight() + dp) / 2.0f);
        int f7 = i0.a.f(e, -14670806, -548067);
        Paint paint = this.f6100n;
        paint.setColor(f7);
        bh.j jVar = this.v;
        jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        jVar.f4418g.setColor(f7);
        jVar.invalidateSelf();
        jVar.draw(canvas);
        int dp2 = AndroidUtilities.dp(20.0f);
        Drawable drawable = this.f6102s;
        drawable.setBounds((getWidth() - dp2) / 2, (getHeight() - dp2) / 2, (getWidth() + dp2) / 2, (getHeight() + dp2) / 2);
        drawable.draw(canvas);
        canvas.save();
        Path path = this.f6098c;
        path.rewind();
        path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.clipPath(path);
        float lerp = AndroidUtilities.lerp(5.0f, 15.0f, e);
        ee eeVar = this.d;
        eeVar.h = lerp;
        eeVar.g(rectF);
        eeVar.d();
        eeVar.b(canvas, -1, AndroidUtilities.lerp(0.5f, 1.0f, e));
        invalidate();
        canvas.restore();
        if (e7 > 0.0f) {
            org.telegram.ui.Components.p6 p6Var = this.h;
            float max = Math.max(AndroidUtilities.dp(12.0f), p6Var.c() + AndroidUtilities.dp(6.0f));
            float i10 = p6Var.i() * this.G * e7;
            canvas.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.scale(i10, i10, rectF2.centerX(), rectF2.centerY());
            rectF2.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.f6101r);
            rectF2.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.translate(((max - p6Var.c()) / 2.0f) + rectF2.left, AndroidUtilities.dp(6.33f));
            p6Var.u(i0.a.f(e, -9866632, -1));
            p6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f6096a.c(this);
    }

    public void setCount(int i10) {
        this.f6103w = i10;
        org.telegram.ui.Components.p6 p6Var = this.h;
        if (i10 > 50000) {
            p6Var.t(AndroidUtilities.formatWholeNumber(i10, 0), true, true);
        } else {
            p6Var.t(LocaleController.formatNumber(i10, ','), true, true);
        }
        invalidate();
        requestLayout();
    }

    public void setFilled(boolean z10) {
        if (this.f6104x == z10) {
            return;
        }
        this.f6104x = z10;
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
