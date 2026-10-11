package ai;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.is;
public final class x2 extends View {
    public final int f1895a;
    public final RectF f1896b;
    public final org.telegram.ui.Components.q6 f1897c;
    public final t2 d;
    public final ArrayList f1898e;
    public final int[] f1899f;
    public final ArrayList h;
    public float f1900n;
    public ValueAnimator f1901r;
    public boolean f1902s;

    public x2(Context context, int i10) {
        super(context);
        this.f1896b = new RectF();
        is isVar = is.f27500f;
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(false, false, false);
        this.f1897c = q6Var;
        this.f1898e = new ArrayList();
        this.f1899f = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.h = new ArrayList();
        this.f1902s = true;
        this.f1895a = i10;
        q6Var.setCallback(this);
        q6Var.r(false, true);
        q6Var.w(AndroidUtilities.dp(40.0f));
        q6Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        q6Var.s(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        q6Var.M = AndroidUtilities.displaySize.x;
        q6Var.u(-1);
        q6Var.f30134b = 17;
        this.d = new t2(this, 0);
    }

    public final void a(float f7, t2 t2Var) {
        ValueAnimator valueAnimator = this.f1901r;
        if (valueAnimator != null) {
            this.f1901r = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f1900n, f7);
        this.f1901r = ofFloat;
        ofFloat.addUpdateListener(new a(this, 7));
        this.f1901r.addListener(new u2(this, f7, t2Var, 0));
        this.f1901r.setInterpolator(is.h);
        this.f1901r.setDuration(320L);
        this.f1901r.start();
    }

    public final void b() {
        this.f1902s = true;
        AndroidUtilities.cancelRunOnUIThread(this.d);
        this.f1897c.t("", true, true);
        invalidate();
        a(0.0f, new t2(this, 1));
    }

    public final void c(y2 y2Var) {
        this.f1896b.set(y2Var.getX() - getX(), y2Var.getY() - getY(), (y2Var.getX() - getX()) + y2Var.getWidth(), (y2Var.getY() - getY()) + y2Var.getHeight());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        RectF rectF;
        int i10;
        x2 x2Var = this;
        Canvas canvas2 = canvas;
        float f11 = 1.0f;
        float lerp = AndroidUtilities.lerp(1.0f, 1.8f, x2Var.f1900n);
        float f12 = 90.0f;
        int dp = (int) (AndroidUtilities.dp(90.0f) * lerp);
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = x2Var.f1898e;
            int size = arrayList.size();
            f7 = 255.0f;
            f10 = 2.0f;
            rectF = x2Var.f1896b;
            if (i11 >= size) {
                break;
            }
            dk0 dk0Var = (dk0) arrayList.get(i11);
            if (dk0Var.f25804a0 >= dk0Var.f25810e[0]) {
                arrayList.remove(i11);
                i11--;
            } else {
                float f13 = dp / 2.0f;
                dk0Var.setBounds((int) (((AndroidUtilities.dp(15.0f) * lerp) + rectF.left) - f13), (int) (rectF.centerY() - f13), (int) sc.v.d(AndroidUtilities.dp(15.0f), lerp, rectF.left, f13), (int) (rectF.centerY() + f13));
                dk0Var.setAlpha((int) (x2Var.f1900n * 255.0f));
                dk0Var.draw(canvas2);
            }
            i11++;
        }
        canvas2.save();
        canvas2.translate(rectF.centerX(), rectF.top - AndroidUtilities.dp(1.0f));
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = x2Var.h;
            if (i12 < arrayList2.size()) {
                w2 w2Var = (w2) arrayList2.get(i12);
                float f14 = w2Var.f1845c;
                float f15 = w2Var.f1844b;
                ImageReceiver imageReceiver = w2Var.f1847f;
                float d = w2Var.f1849i.d(f11, z10);
                float e7 = w2Var.f1850j.e(w2Var.h);
                float f16 = f12;
                float dp2 = AndroidUtilities.dp(23.0f) + w2Var.f1848g.f28678c;
                float dp3 = AndroidUtilities.dp(18.0f);
                float f17 = f7;
                float f18 = f10;
                float f19 = f11;
                float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.lerp(f11, 0.0f, e7), Utilities.clamp01(Math.min(AndroidUtilities.ilerp(d, f11, 0.85f), AndroidUtilities.ilerp(d, 0.0f, 0.12f))));
                Paint paint = w2Var.f1846e;
                int i13 = (int) (lerp2 * f17);
                paint.setAlpha(i13);
                dk0 dk0Var2 = w2Var.d;
                if (dk0Var2 != null) {
                    dk0Var2.setAlpha(i13);
                }
                imageReceiver.setAlpha(lerp2);
                canvas2.save();
                double d10 = d;
                float sin = (float) Math.sin(Math.pow(d10, 0.44999998807907104d) * 3.141592653589793d * 3.0d);
                float f20 = (f15 * f18) - f19;
                canvas2.translate(AndroidUtilities.dp(4.0f) * f20, 0.0f);
                float f21 = 1.5f * ((f14 * f18) - f19);
                canvas2.rotate(f21);
                int i14 = i12;
                canvas2.translate(0.0f, ((float) Math.pow(d10, 0.800000011920929d)) * (-AndroidUtilities.dp(200.0f)));
                canvas2.translate(AndroidUtilities.dp(5.0f) * sin * ((float) Math.pow(d10, 0.5d)), 0.0f);
                canvas2.rotate(((float) (Math.sin((Math.pow(d10, 0.44999998807907104d) - 0.15000000596046448d) * 3.141592653589793d * 3.0d) * Utilities.clamp01((float) Math.pow(d10, 0.20000000298023224d)))) * (-6.0f));
                float lerp3 = AndroidUtilities.lerp(0.4f, f19, lerp2);
                canvas2.scale(lerp3, lerp3);
                canvas2.translate((-dp2) / f18, (-dp3) / f18);
                float f22 = dp3 / f18;
                canvas2.drawRoundRect(0.0f, 0.0f, dp2, dp3, f22, f22, paint);
                imageReceiver.draw(canvas2);
                Canvas canvas3 = canvas2;
                w2Var.f1848g.c(AndroidUtilities.dp(18.0f), f22, lerp2, -1, canvas3);
                canvas2 = canvas3;
                canvas2.restore();
                if (dk0Var2 != null) {
                    canvas2.save();
                    canvas2.translate(AndroidUtilities.dp(4.0f) * f20, 0.0f);
                    canvas2.rotate(f21);
                    canvas2.translate(0.0f, (-AndroidUtilities.dp(200.0f)) * ((float) Math.pow(d10, 0.800000011920929d)));
                    canvas2.translate(sin * AndroidUtilities.dp(5.0f) * ((float) Math.pow(d10, 0.5d)), 0.0f);
                    int dp4 = AndroidUtilities.dp(f16);
                    int i15 = (-dp4) / 2;
                    int i16 = dp4 / 2;
                    dk0Var2.setBounds(i15, AndroidUtilities.dp(8.0f) + i15, i16, AndroidUtilities.dp(8.0f) + i16);
                    dk0Var2.draw(canvas2);
                    canvas2.restore();
                }
                if (d < 1.0f && e7 < 1.0f) {
                    i10 = i14;
                } else {
                    ((w2) arrayList2.get(i14)).f1847f.onDetachedFromWindow();
                    arrayList2.remove(i14);
                    i10 = i14 - 1;
                }
                i12 = i10 + 1;
                x2Var = this;
                f12 = f16;
                f7 = f17;
                f10 = f18;
                f11 = 1.0f;
                z10 = false;
            } else {
                canvas2.restore();
                return;
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f1897c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
