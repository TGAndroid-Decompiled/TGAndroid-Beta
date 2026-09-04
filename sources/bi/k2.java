package bi;

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
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.xi0;
public final class k2 extends View {
    public final int f3186a;
    public final RectF f3187b;
    public final org.telegram.ui.Components.p6 f3188c;
    public final g2 d;
    public final ArrayList f3189e;
    public final int[] f3190f;
    public final ArrayList h;
    public float f3191n;
    public ValueAnimator f3192r;
    public boolean f3193s;

    public k2(Context context, int i10) {
        super(context);
        this.f3187b = new RectF();
        pr prVar = pr.f29466f;
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, false, false, false);
        this.f3188c = p6Var;
        this.f3189e = new ArrayList();
        this.f3190f = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.h = new ArrayList();
        this.f3193s = true;
        this.f3186a = i10;
        p6Var.setCallback(this);
        p6Var.o(false, true, false);
        p6Var.t(AndroidUtilities.dp(40.0f));
        p6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        p6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        p6Var.G = AndroidUtilities.displaySize.x;
        p6Var.r(-1);
        p6Var.f29285b = 17;
        this.d = new g2(this, 0);
    }

    public final void a(float f7, g2 g2Var) {
        ValueAnimator valueAnimator = this.f3192r;
        if (valueAnimator != null) {
            this.f3192r = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f3191n, f7);
        this.f3192r = ofFloat;
        ofFloat.addUpdateListener(new ah.d0(this, 8));
        this.f3192r.addListener(new h2(this, f7, g2Var, 0));
        this.f3192r.setInterpolator(pr.h);
        this.f3192r.setDuration(320L);
        this.f3192r.start();
    }

    public final void b() {
        this.f3193s = true;
        AndroidUtilities.cancelRunOnUIThread(this.d);
        this.f3188c.q("", true, true);
        invalidate();
        a(0.0f, new g2(this, 1));
    }

    public final void c(l2 l2Var) {
        this.f3187b.set(l2Var.getX() - getX(), l2Var.getY() - getY(), (l2Var.getX() - getX()) + l2Var.getWidth(), (l2Var.getY() - getY()) + l2Var.getHeight());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        int i10;
        k2 k2Var = this;
        Canvas canvas2 = canvas;
        float f7 = 1.0f;
        float lerp = AndroidUtilities.lerp(1.0f, 1.8f, k2Var.f3191n);
        int dp = (int) (AndroidUtilities.dp(90.0f) * lerp);
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = k2Var.f3189e;
            int size = arrayList.size();
            rectF = k2Var.f3187b;
            if (i11 >= size) {
                break;
            }
            xi0 xi0Var = (xi0) arrayList.get(i11);
            if (xi0Var.f32553b0 >= xi0Var.f32557e[0]) {
                arrayList.remove(i11);
                i11--;
            } else {
                float f10 = dp / 2.0f;
                xi0Var.setBounds((int) (((AndroidUtilities.dp(15.0f) * lerp) + rectF.left) - f10), (int) (rectF.centerY() - f10), (int) org.telegram.ui.Cells.p6.a(AndroidUtilities.dp(15.0f), lerp, rectF.left, f10), (int) (rectF.centerY() + f10));
                xi0Var.setAlpha((int) (k2Var.f3191n * 255.0f));
                xi0Var.draw(canvas2);
            }
            i11++;
        }
        canvas2.save();
        canvas2.translate(rectF.centerX(), rectF.top - AndroidUtilities.dp(1.0f));
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = k2Var.h;
            if (i12 < arrayList2.size()) {
                j2 j2Var = (j2) arrayList2.get(i12);
                float f11 = j2Var.f3128c;
                float f12 = j2Var.f3127b;
                ImageReceiver imageReceiver = j2Var.f3130f;
                float d = j2Var.f3132i.d(f7, z10);
                float e7 = j2Var.f3133j.e(j2Var.h);
                float dp2 = AndroidUtilities.dp(23.0f) + j2Var.f3131g.f25847c;
                float dp3 = AndroidUtilities.dp(18.0f);
                float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.lerp(f7, 0.0f, e7), Utilities.clamp01(Math.min(AndroidUtilities.ilerp(d, f7, 0.85f), AndroidUtilities.ilerp(d, 0.0f, 0.12f))));
                Paint paint = j2Var.f3129e;
                int i13 = (int) (lerp2 * 255.0f);
                paint.setAlpha(i13);
                xi0 xi0Var2 = j2Var.d;
                if (xi0Var2 != null) {
                    xi0Var2.setAlpha(i13);
                }
                imageReceiver.setAlpha(lerp2);
                canvas2.save();
                double d10 = d;
                float sin = (float) Math.sin(Math.pow(d10, 0.44999998807907104d) * 3.141592653589793d * 3.0d);
                float f13 = (f12 * 2.0f) - 1.0f;
                canvas2.translate(AndroidUtilities.dp(4.0f) * f13, 0.0f);
                float f14 = 1.5f * ((f11 * 2.0f) - 1.0f);
                canvas2.rotate(f14);
                int i14 = i12;
                canvas2.translate(0.0f, ((float) Math.pow(d10, 0.800000011920929d)) * (-AndroidUtilities.dp(200.0f)));
                canvas2.translate(AndroidUtilities.dp(5.0f) * sin * ((float) Math.pow(d10, 0.5d)), 0.0f);
                canvas2.rotate(((float) (Math.sin((Math.pow(d10, 0.44999998807907104d) - 0.15000000596046448d) * 3.141592653589793d * 3.0d) * Utilities.clamp01((float) Math.pow(d10, 0.20000000298023224d)))) * (-6.0f));
                float lerp3 = AndroidUtilities.lerp(0.4f, 1.0f, lerp2);
                canvas2.scale(lerp3, lerp3);
                canvas2.translate((-dp2) / 2.0f, (-dp3) / 2.0f);
                float f15 = dp3 / 2.0f;
                canvas2.drawRoundRect(0.0f, 0.0f, dp2, dp3, f15, f15, paint);
                imageReceiver.draw(canvas2);
                Canvas canvas3 = canvas2;
                j2Var.f3131g.c(AndroidUtilities.dp(18.0f), f15, lerp2, -1, canvas3);
                canvas2 = canvas3;
                canvas2.restore();
                if (xi0Var2 != null) {
                    canvas2.save();
                    canvas2.translate(AndroidUtilities.dp(4.0f) * f13, 0.0f);
                    canvas2.rotate(f14);
                    canvas2.translate(0.0f, (-AndroidUtilities.dp(200.0f)) * ((float) Math.pow(d10, 0.800000011920929d)));
                    canvas2.translate(sin * AndroidUtilities.dp(5.0f) * ((float) Math.pow(d10, 0.5d)), 0.0f);
                    int dp4 = AndroidUtilities.dp(90.0f);
                    int i15 = (-dp4) / 2;
                    int i16 = dp4 / 2;
                    xi0Var2.setBounds(i15, AndroidUtilities.dp(8.0f) + i15, i16, AndroidUtilities.dp(8.0f) + i16);
                    xi0Var2.draw(canvas2);
                    canvas2.restore();
                }
                if (d < 1.0f && e7 < 1.0f) {
                    i10 = i14;
                } else {
                    ((j2) arrayList2.get(i14)).f3130f.onDetachedFromWindow();
                    arrayList2.remove(i14);
                    i10 = i14 - 1;
                }
                i12 = i10 + 1;
                k2Var = this;
                f7 = 1.0f;
                z10 = false;
            } else {
                canvas2.restore();
                return;
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f3188c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
