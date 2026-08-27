package jh;

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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oi0;

public final class q1 extends View {

    public final int f13843a;

    public final RectF f13844b;

    public final org.telegram.ui.Components.i6 f13845c;
    public final o1 d;

    public final ArrayList f13846e;

    public final int[] f13847f;
    public final ArrayList h;

    public float f13848n;

    public ValueAnimator f13849r;

    public boolean f13850s;

    public q1(Context context, int i10) {
        super(context);
        this.f13844b = new RectF();
        er erVar = er.f28122f;
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, false, false, false);
        this.f13845c = i6Var;
        this.f13846e = new ArrayList();
        this.f13847f = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.h = new ArrayList();
        this.f13850s = true;
        this.f13843a = i10;
        i6Var.setCallback(this);
        i6Var.o(false, true, false);
        i6Var.t(AndroidUtilities.dp(40.0f));
        i6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        i6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        i6Var.G = AndroidUtilities.displaySize.x;
        i6Var.r(-1);
        i6Var.f29239b = 17;
        this.d = new o1(this, 0);
    }

    public final void a(float f10, o1 o1Var) {
        ValueAnimator valueAnimator = this.f13849r;
        if (valueAnimator != null) {
            this.f13849r = null;
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f13848n, f10);
        this.f13849r = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ag.u(this, 20));
        this.f13849r.addListener(new hh.n5(this, f10, o1Var, 1));
        this.f13849r.setInterpolator(er.h);
        this.f13849r.setDuration(320L);
        this.f13849r.start();
    }

    public final void b() {
        this.f13850s = true;
        AndroidUtilities.cancelRunOnUIThread(this.d);
        this.f13845c.q("", true, true);
        invalidate();
        a(0.0f, new o1(this, 1));
    }

    public final void c(r1 r1Var) {
        this.f13844b.set(r1Var.getX() - getX(), r1Var.getY() - getY(), (r1Var.getX() - getX()) + r1Var.getWidth(), (r1Var.getY() - getY()) + r1Var.getHeight());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        int i10;
        q1 q1Var = this;
        Canvas canvas2 = canvas;
        float f10 = 1.0f;
        float fLerp = AndroidUtilities.lerp(1.0f, 1.8f, q1Var.f13848n);
        int iDp = (int) (AndroidUtilities.dp(90.0f) * fLerp);
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = q1Var.f13846e;
            int size = arrayList.size();
            rectF = q1Var.f13844b;
            if (i11 >= size) {
                break;
            }
            oi0 oi0Var = (oi0) arrayList.get(i11);
            if (oi0Var.X >= oi0Var.f31312e[0]) {
                arrayList.remove(i11);
                i11--;
            } else {
                float f11 = iDp / 2.0f;
                oi0Var.setBounds((int) (((AndroidUtilities.dp(15.0f) * fLerp) + rectF.left) - f11), (int) (rectF.centerY() - f11), (int) com.google.android.recaptcha.internal.a.d(AndroidUtilities.dp(15.0f), fLerp, rectF.left, f11), (int) (rectF.centerY() + f11));
                oi0Var.setAlpha((int) (q1Var.f13848n * 255.0f));
                oi0Var.draw(canvas2);
            }
            i11++;
        }
        float fCenterX = rectF.centerX();
        float fDp = rectF.top - AndroidUtilities.dp(1.0f);
        canvas2.save();
        canvas2.translate(fCenterX, fDp);
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = q1Var.h;
            if (i12 >= arrayList2.size()) {
                canvas2.restore();
                return;
            }
            p1 p1Var = (p1) arrayList2.get(i12);
            float f12 = p1Var.f13811c;
            float f13 = p1Var.f13810b;
            ImageReceiver imageReceiver = p1Var.f13813f;
            float fD = p1Var.f13815i.d(f10, z10);
            float fE = p1Var.f13816j.e(p1Var.h);
            float fDp2 = AndroidUtilities.dp(23.0f) + p1Var.f13814g.f31697c;
            float fDp3 = AndroidUtilities.dp(18.0f);
            float fLerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.lerp(f10, 0.0f, fE), Utilities.clamp01(Math.min(AndroidUtilities.ilerp(fD, f10, 0.85f), AndroidUtilities.ilerp(fD, 0.0f, 0.12f))));
            Paint paint = p1Var.f13812e;
            int i13 = (int) (fLerp2 * 255.0f);
            paint.setAlpha(i13);
            oi0 oi0Var2 = p1Var.d;
            if (oi0Var2 != null) {
                oi0Var2.setAlpha(i13);
            }
            imageReceiver.setAlpha(fLerp2);
            canvas2.save();
            double d = fD;
            float fSin = (float) Math.sin(Math.pow(d, 0.44999998807907104d) * 3.141592653589793d * 3.0d);
            float f14 = (f13 * 2.0f) - 1.0f;
            canvas2.translate(AndroidUtilities.dp(4.0f) * f14, 0.0f);
            float f15 = 1.5f * ((f12 * 2.0f) - 1.0f);
            canvas2.rotate(f15);
            int i14 = i12;
            canvas2.translate(0.0f, ((float) Math.pow(d, 0.800000011920929d)) * (-AndroidUtilities.dp(200.0f)));
            canvas2.translate(AndroidUtilities.dp(5.0f) * fSin * ((float) Math.pow(d, 0.5d)), 0.0f);
            canvas2.rotate(((float) (Math.sin((Math.pow(d, 0.44999998807907104d) - 0.15000000596046448d) * 3.141592653589793d * 3.0d) * ((double) Utilities.clamp01((float) Math.pow(d, 0.20000000298023224d))))) * (-6.0f));
            float fLerp3 = AndroidUtilities.lerp(0.4f, 1.0f, fLerp2);
            canvas2.scale(fLerp3, fLerp3);
            canvas2.translate((-fDp2) / 2.0f, (-fDp3) / 2.0f);
            float f16 = fDp3 / 2.0f;
            canvas2.drawRoundRect(0.0f, 0.0f, fDp2, fDp3, f16, f16, paint);
            imageReceiver.draw(canvas2);
            Canvas canvas3 = canvas2;
            p1Var.f13814g.c(AndroidUtilities.dp(18.0f), f16, fLerp2, -1, canvas3);
            canvas2 = canvas3;
            canvas2.restore();
            if (oi0Var2 != null) {
                canvas2.save();
                canvas2.translate(AndroidUtilities.dp(4.0f) * f14, 0.0f);
                canvas2.rotate(f15);
                canvas2.translate(0.0f, (-AndroidUtilities.dp(200.0f)) * ((float) Math.pow(d, 0.800000011920929d)));
                canvas2.translate(fSin * AndroidUtilities.dp(5.0f) * ((float) Math.pow(d, 0.5d)), 0.0f);
                int iDp2 = AndroidUtilities.dp(90.0f);
                int i15 = (-iDp2) / 2;
                int i16 = iDp2 / 2;
                oi0Var2.setBounds(i15, AndroidUtilities.dp(8.0f) + i15, i16, AndroidUtilities.dp(8.0f) + i16);
                oi0Var2.draw(canvas2);
                canvas2.restore();
            }
            if (fD >= 1.0f || fE >= 1.0f) {
                ((p1) arrayList2.get(i14)).f13813f.onDetachedFromWindow();
                arrayList2.remove(i14);
                i10 = i14 - 1;
            } else {
                i10 = i14;
            }
            i12 = i10 + 1;
            q1Var = this;
            f10 = 1.0f;
            z10 = false;
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f13845c || super.verifyDrawable(drawable);
    }
}
