package ci;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.uj0;
public final class w1 extends View {
    public final int f6034a;
    public final RectF f6035b;
    public final org.telegram.ui.Components.p6 f6036c;
    public final u1 d;
    public final ArrayList e;
    public final int[] f6037f;
    public final ArrayList h;
    public float f6038n;
    public ValueAnimator f6039r;
    public boolean f6040s;

    public w1(Context context, int i10) {
        super(context);
        this.f6035b = new RectF();
        bs bsVar = bs.f25030f;
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, false, false);
        this.f6036c = p6Var;
        this.e = new ArrayList();
        this.f6037f = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.h = new ArrayList();
        this.f6040s = true;
        this.f6034a = i10;
        p6Var.setCallback(this);
        p6Var.r(false, true);
        p6Var.w(AndroidUtilities.dp(40.0f));
        p6Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        p6Var.s(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(3.5f), 0);
        p6Var.M = AndroidUtilities.displaySize.x;
        p6Var.u(-1);
        p6Var.f29192b = 17;
        this.d = new u1(this, 0);
    }

    public final void a(float f7, u1 u1Var) {
        ValueAnimator valueAnimator = this.f6039r;
        if (valueAnimator != null) {
            this.f6039r = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f6038n, f7);
        this.f6039r = ofFloat;
        ofFloat.addUpdateListener(new ah.c0(this, 15));
        this.f6039r.addListener(new ai.o7(this, f7, u1Var, 1));
        this.f6039r.setInterpolator(bs.h);
        this.f6039r.setDuration(320L);
        this.f6039r.start();
    }

    public final void b() {
        this.f6040s = true;
        AndroidUtilities.cancelRunOnUIThread(this.d);
        this.f6036c.t("", true, true);
        invalidate();
        a(0.0f, new u1(this, 1));
    }

    public final void c(x1 x1Var) {
        this.f6035b.set(x1Var.getX() - getX(), x1Var.getY() - getY(), (x1Var.getX() - getX()) + x1Var.getWidth(), (x1Var.getY() - getY()) + x1Var.getHeight());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        RectF rectF;
        int i10;
        w1 w1Var = this;
        Canvas canvas2 = canvas;
        float f11 = 1.0f;
        float lerp = AndroidUtilities.lerp(1.0f, 1.8f, w1Var.f6038n);
        float f12 = 90.0f;
        int dp = (int) (AndroidUtilities.dp(90.0f) * lerp);
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = w1Var.e;
            int size = arrayList.size();
            f7 = 255.0f;
            f10 = 2.0f;
            rectF = w1Var.f6035b;
            if (i11 >= size) {
                break;
            }
            uj0 uj0Var = (uj0) arrayList.get(i11);
            if (uj0Var.f31001a0 >= uj0Var.e[0]) {
                arrayList.remove(i11);
                i11--;
            } else {
                float f13 = dp / 2.0f;
                uj0Var.setBounds((int) (((AndroidUtilities.dp(15.0f) * lerp) + rectF.left) - f13), (int) (rectF.centerY() - f13), (int) r4.c.c(AndroidUtilities.dp(15.0f), lerp, rectF.left, f13), (int) (rectF.centerY() + f13));
                uj0Var.setAlpha((int) (w1Var.f6038n * 255.0f));
                uj0Var.draw(canvas2);
            }
            i11++;
        }
        canvas2.save();
        canvas2.translate(rectF.centerX(), rectF.top - AndroidUtilities.dp(1.0f));
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = w1Var.h;
            if (i12 < arrayList2.size()) {
                v1 v1Var = (v1) arrayList2.get(i12);
                float f14 = v1Var.f6001c;
                float f15 = v1Var.f6000b;
                ImageReceiver imageReceiver = v1Var.f6002f;
                float d = v1Var.f6004i.d(f11, z10);
                float e = v1Var.f6005j.e(v1Var.h);
                float f16 = f12;
                float dp2 = AndroidUtilities.dp(23.0f) + v1Var.f6003g.f25437c;
                float dp3 = AndroidUtilities.dp(18.0f);
                float f17 = f7;
                float f18 = f10;
                float f19 = f11;
                float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.lerp(f11, 0.0f, e), Utilities.clamp01(Math.min(AndroidUtilities.ilerp(d, f11, 0.85f), AndroidUtilities.ilerp(d, 0.0f, 0.12f))));
                Paint paint = v1Var.e;
                int i13 = (int) (lerp2 * f17);
                paint.setAlpha(i13);
                uj0 uj0Var2 = v1Var.d;
                if (uj0Var2 != null) {
                    uj0Var2.setAlpha(i13);
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
                v1Var.f6003g.c(AndroidUtilities.dp(18.0f), f22, lerp2, -1, canvas3);
                canvas2 = canvas3;
                canvas2.restore();
                if (uj0Var2 != null) {
                    canvas2.save();
                    canvas2.translate(AndroidUtilities.dp(4.0f) * f20, 0.0f);
                    canvas2.rotate(f21);
                    canvas2.translate(0.0f, (-AndroidUtilities.dp(200.0f)) * ((float) Math.pow(d10, 0.800000011920929d)));
                    canvas2.translate(sin * AndroidUtilities.dp(5.0f) * ((float) Math.pow(d10, 0.5d)), 0.0f);
                    int dp4 = AndroidUtilities.dp(f16);
                    int i15 = (-dp4) / 2;
                    int i16 = dp4 / 2;
                    uj0Var2.setBounds(i15, AndroidUtilities.dp(8.0f) + i15, i16, AndroidUtilities.dp(8.0f) + i16);
                    uj0Var2.draw(canvas2);
                    canvas2.restore();
                }
                if (d < 1.0f && e < 1.0f) {
                    i10 = i14;
                } else {
                    ((v1) arrayList2.get(i14)).f6002f.onDetachedFromWindow();
                    arrayList2.remove(i14);
                    i10 = i14 - 1;
                }
                i12 = i10 + 1;
                w1Var = this;
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
        if (drawable != this.f6036c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
