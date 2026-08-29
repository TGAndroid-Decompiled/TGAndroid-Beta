package lh;

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
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.xi0;
public final class q1 extends View {
    public final int f16109a;
    public final RectF f16110b;
    public final org.telegram.ui.Components.n6 f16111c;
    public final o1 d;
    public final ArrayList f16112e;
    public final int[] f16113f;
    public final ArrayList h;
    public float f16114n;
    public ValueAnimator f16115r;
    public boolean f16116s;

    public q1(Context context, int i10) {
        super(context);
        this.f16110b = new RectF();
        jr jrVar = jr.f29800f;
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, false, false, false);
        this.f16111c = n6Var;
        this.f16112e = new ArrayList();
        this.f16113f = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.h = new ArrayList();
        this.f16116s = true;
        this.f16109a = i10;
        n6Var.setCallback(this);
        n6Var.o(false, true, false);
        n6Var.t(AndroidUtilities.dp(40.0f));
        n6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        n6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        n6Var.G = AndroidUtilities.displaySize.x;
        n6Var.r(-1);
        n6Var.f30862b = 17;
        this.d = new o1(this, 0);
    }

    public final void a(float f9, o1 o1Var) {
        ValueAnimator valueAnimator = this.f16115r;
        if (valueAnimator != null) {
            this.f16115r = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f16114n, f9);
        this.f16115r = ofFloat;
        ofFloat.addUpdateListener(new bg.q1(this, 26));
        this.f16115r.addListener(new jh.l5(this, f9, o1Var, 1));
        this.f16115r.setInterpolator(jr.h);
        this.f16115r.setDuration(320L);
        this.f16115r.start();
    }

    public final void b() {
        this.f16116s = true;
        AndroidUtilities.cancelRunOnUIThread(this.d);
        this.f16111c.q("", true, true);
        invalidate();
        a(0.0f, new o1(this, 1));
    }

    public final void c(r1 r1Var) {
        this.f16110b.set(r1Var.getX() - getX(), r1Var.getY() - getY(), (r1Var.getX() - getX()) + r1Var.getWidth(), (r1Var.getY() - getY()) + r1Var.getHeight());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        int i10;
        q1 q1Var = this;
        Canvas canvas2 = canvas;
        float f9 = 1.0f;
        float lerp = AndroidUtilities.lerp(1.0f, 1.8f, q1Var.f16114n);
        int dp = (int) (AndroidUtilities.dp(90.0f) * lerp);
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = q1Var.f16112e;
            int size = arrayList.size();
            rectF = q1Var.f16110b;
            if (i11 >= size) {
                break;
            }
            xi0 xi0Var = (xi0) arrayList.get(i11);
            if (xi0Var.X >= xi0Var.f34737e[0]) {
                arrayList.remove(i11);
                i11--;
            } else {
                float f10 = dp / 2.0f;
                xi0Var.setBounds((int) (((AndroidUtilities.dp(15.0f) * lerp) + rectF.left) - f10), (int) (rectF.centerY() - f10), (int) com.google.android.recaptcha.internal.a.d(AndroidUtilities.dp(15.0f), lerp, rectF.left, f10), (int) (rectF.centerY() + f10));
                xi0Var.setAlpha((int) (q1Var.f16114n * 255.0f));
                xi0Var.draw(canvas2);
            }
            i11++;
        }
        canvas2.save();
        canvas2.translate(rectF.centerX(), rectF.top - AndroidUtilities.dp(1.0f));
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = q1Var.h;
            if (i12 < arrayList2.size()) {
                p1 p1Var = (p1) arrayList2.get(i12);
                float f11 = p1Var.f16082c;
                float f12 = p1Var.f16081b;
                ImageReceiver imageReceiver = p1Var.f16084f;
                float d = p1Var.f16086i.d(f9, z10);
                float e10 = p1Var.f16087j.e(p1Var.h);
                float dp2 = AndroidUtilities.dp(23.0f) + p1Var.f16085g.f35462c;
                float dp3 = AndroidUtilities.dp(18.0f);
                float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.lerp(f9, 0.0f, e10), Utilities.clamp01(Math.min(AndroidUtilities.ilerp(d, f9, 0.85f), AndroidUtilities.ilerp(d, 0.0f, 0.12f))));
                Paint paint = p1Var.f16083e;
                int i13 = (int) (lerp2 * 255.0f);
                paint.setAlpha(i13);
                xi0 xi0Var2 = p1Var.d;
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
                p1Var.f16085g.c(AndroidUtilities.dp(18.0f), f15, lerp2, -1, canvas3);
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
                if (d < 1.0f && e10 < 1.0f) {
                    i10 = i14;
                } else {
                    ((p1) arrayList2.get(i14)).f16084f.onDetachedFromWindow();
                    arrayList2.remove(i14);
                    i10 = i14 - 1;
                }
                i12 = i10 + 1;
                q1Var = this;
                f9 = 1.0f;
                z10 = false;
            } else {
                canvas2.restore();
                return;
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f16111c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
