package oh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import mh.wa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr;
public final class s1 extends View {
    public float B;
    public final int[] C;
    public final float D;
    public final r1 f17713a;
    public final RectF f17714b;
    public final Path f17715c;
    public final wa d;
    public final org.telegram.ui.Components.z5 f17716e;
    public final org.telegram.ui.Components.z5 f17717f;
    public final org.telegram.ui.Components.j6 h;
    public final Paint f17718n;
    public final Paint f17719r;
    public final Drawable f17720s;
    public final og.i v;
    public int f17721w;
    public boolean f17722x;
    public long f17723y;

    public s1(Context context, r1 r1Var, rg.b bVar) {
        super(context);
        this.f17714b = new RectF();
        this.f17715c = new Path();
        pr prVar = pr.h;
        this.f17716e = new org.telegram.ui.Components.z5(this, 320L, prVar);
        this.f17717f = new org.telegram.ui.Components.z5(this, 320L, prVar);
        Paint paint = new Paint(1);
        this.f17718n = paint;
        Paint paint2 = new Paint(1);
        this.f17719r = paint2;
        this.C = new int[2];
        this.D = 1.0f;
        this.f17713a = r1Var;
        k7.e6.a(this);
        this.f17720s = context.getResources().getDrawable(R.drawable.star).mutate();
        og.i iVar = new og.i();
        this.v = iVar;
        iVar.a(bVar);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, true, true, false);
        this.h = j6Var;
        j6Var.r(-9866632);
        j6Var.t(AndroidUtilities.dp(9.0f));
        j6Var.setCallback(this);
        j6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        j6Var.D = true;
        paint.setColor(-14670806);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new oq(R.drawable.star, 0).setScale(1.8f, 1.8f);
        setCount(0);
        this.d = new wa(1, 50);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z4;
        float dp = AndroidUtilities.dp(38.0f);
        float e6 = this.f17716e.e(this.f17722x);
        if (this.f17721w > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        float e10 = this.f17717f.e(z4);
        RectF rectF = this.f17714b;
        rectF.set((getWidth() - dp) / 2.0f, (getHeight() - dp) / 2.0f, (getWidth() + dp) / 2.0f, (getHeight() + dp) / 2.0f);
        int d = i0.a.d(e6, -14670806, -548067);
        Paint paint = this.f17718n;
        paint.setColor(d);
        og.i iVar = this.v;
        iVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        iVar.f16817g.setColor(d);
        iVar.invalidateSelf();
        iVar.draw(canvas);
        int dp2 = AndroidUtilities.dp(20.0f);
        Drawable drawable = this.f17720s;
        drawable.setBounds((getWidth() - dp2) / 2, (getHeight() - dp2) / 2, (getWidth() + dp2) / 2, (getHeight() + dp2) / 2);
        drawable.draw(canvas);
        canvas.save();
        Path path = this.f17715c;
        path.rewind();
        path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.clipPath(path);
        float lerp = AndroidUtilities.lerp(5.0f, 15.0f, e6);
        wa waVar = this.d;
        waVar.h = lerp;
        waVar.g(rectF);
        waVar.d();
        waVar.b(canvas, -1, AndroidUtilities.lerp(0.5f, 1.0f, e6));
        invalidate();
        canvas.restore();
        if (e10 > 0.0f) {
            org.telegram.ui.Components.j6 j6Var = this.h;
            float max = Math.max(AndroidUtilities.dp(12.0f), j6Var.d() + AndroidUtilities.dp(6.0f));
            float g10 = j6Var.g() * this.D * e10;
            canvas.save();
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.scale(g10, g10, rectF2.centerX(), rectF2.centerY());
            rectF2.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.f17719r);
            rectF2.set(getWidth() - max, 0.0f, getWidth(), AndroidUtilities.dp(13.0f));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.translate(((max - j6Var.d()) / 2.0f) + rectF2.left, AndroidUtilities.dp(6.33f));
            j6Var.r(i0.a.d(e6, -9866632, -1));
            j6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f17713a.c(this);
    }

    public void setCount(int i10) {
        this.f17721w = i10;
        org.telegram.ui.Components.j6 j6Var = this.h;
        if (i10 > 50000) {
            j6Var.q(AndroidUtilities.formatWholeNumber(i10, 0), true, true);
        } else {
            j6Var.q(LocaleController.formatNumber(i10, ','), true, true);
        }
        invalidate();
        requestLayout();
    }

    public void setFilled(boolean z4) {
        if (this.f17722x == z4) {
            return;
        }
        this.f17722x = z4;
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
