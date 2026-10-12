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
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.es;
public final class m2 extends View {
    public float E;
    public final int[] F;
    public final float G;
    public final l2 f3294a;
    public final RectF f3295b;
    public final Path f3296c;
    public final zh.b8 d;
    public final org.telegram.ui.Components.g6 e;
    public final org.telegram.ui.Components.g6 f3297f;
    public final org.telegram.ui.Components.r6 h;
    public final Paint f3298n;
    public final Paint f3299r;
    public final Drawable f3300s;
    public final bh.j v;
    public int f3301w;
    public boolean f3302x;
    public long f3303y;

    public m2(Context context, l2 l2Var, eh.b bVar) {
        super(context);
        this.f3295b = new RectF();
        this.f3296c = new Path();
        es esVar = es.h;
        this.e = new org.telegram.ui.Components.g6(this, 320L, esVar);
        this.f3297f = new org.telegram.ui.Components.g6(this, 320L, esVar);
        Paint paint = new Paint(1);
        this.f3298n = paint;
        Paint paint2 = new Paint(1);
        this.f3299r = paint2;
        this.F = new int[2];
        this.G = 1.0f;
        this.f3294a = l2Var;
        w7.c6.a(this);
        this.f3300s = context.getResources().getDrawable(R.drawable.star).mutate();
        bh.j jVar = new bh.j();
        this.v = jVar;
        jVar.a(bVar);
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(false, true, true);
        this.h = r6Var;
        r6Var.u(-9866632);
        r6Var.w(AndroidUtilities.dp(9.0f));
        r6Var.setCallback(this);
        r6Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        r6Var.J = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new br(R.drawable.star, 0).setScale(1.8f, 1.8f);
        setCount(0);
        this.d = new zh.b8(1, 50);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float dp = AndroidUtilities.dp(38.0f);
        float e = this.e.e(this.f3302x);
        if (this.f3301w > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e7 = this.f3297f.e(z10);
        RectF rectF = this.f3295b;
        rectF.set((getWidth() - dp) / 2.0f, (getHeight() - dp) / 2.0f, (getWidth() + dp) / 2.0f, (getHeight() + dp) / 2.0f);
        int d = i0.a.d(e, -14670806, -548067);
        Paint paint = this.f3298n;
        paint.setColor(d);
        bh.j jVar = this.v;
        jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        jVar.f2802g.setColor(d);
        jVar.invalidateSelf();
        jVar.draw(canvas);
        int dp2 = AndroidUtilities.dp(20.0f);
        Drawable drawable = this.f3300s;
        drawable.setBounds((getWidth() - dp2) / 2, (getHeight() - dp2) / 2, (getWidth() + dp2) / 2, (getHeight() + dp2) / 2);
        drawable.draw(canvas);
        canvas.save();
        Path path = this.f3296c;
        path.rewind();
        path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.clipPath(path);
        float lerp = AndroidUtilities.lerp(5.0f, 15.0f, e);
        zh.b8 b8Var = this.d;
        b8Var.h = lerp;
        b8Var.g(rectF);
        b8Var.d();
        b8Var.b(canvas, -1, AndroidUtilities.lerp(0.5f, 1.0f, e));
        invalidate();
        canvas.restore();
        if (e7 > 0.0f) {
            org.telegram.ui.Components.r6 r6Var = this.h;
            float max = Math.max(AndroidUtilities.dp(12.0f), r6Var.c() + AndroidUtilities.dp(6.0f));
            float i10 = r6Var.i() * this.G * e7;
            canvas.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.scale(i10, i10, rectF2.centerX(), rectF2.centerY());
            rectF2.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.f3299r);
            rectF2.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.translate(((max - r6Var.c()) / 2.0f) + rectF2.left, AndroidUtilities.dp(6.33f));
            r6Var.u(i0.a.d(e, -9866632, -1));
            r6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f3294a.c(this);
    }

    public void setCount(int i10) {
        this.f3301w = i10;
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
        if (this.f3302x == z10) {
            return;
        }
        this.f3302x = z10;
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
