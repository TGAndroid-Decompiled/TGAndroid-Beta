package oh;

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
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.pr;
public final class r1 extends View {
    public final int f17677a;
    public final RectF f17678b;
    public final org.telegram.ui.Components.j6 f17679c;
    public final p1 d;
    public final ArrayList f17680e;
    public final int[] f17681f;
    public final ArrayList h;
    public float f17682n;
    public ValueAnimator f17683r;
    public boolean f17684s;

    public r1(Context context, int i10) {
        super(context);
        this.f17678b = new RectF();
        pr prVar = pr.f30168f;
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, false, false, false);
        this.f17679c = j6Var;
        this.f17680e = new ArrayList();
        this.f17681f = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.h = new ArrayList();
        this.f17684s = true;
        this.f17677a = i10;
        j6Var.setCallback(this);
        j6Var.o(false, true, false);
        j6Var.t(AndroidUtilities.dp(40.0f));
        j6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        j6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        j6Var.G = AndroidUtilities.displaySize.x;
        j6Var.r(-1);
        j6Var.f27999b = 17;
        this.d = new p1(this, 0);
    }

    public final void a(float f10, p1 p1Var) {
        ValueAnimator valueAnimator = this.f17683r;
        if (valueAnimator != null) {
            this.f17683r = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f17682n, f10);
        this.f17683r = ofFloat;
        ofFloat.addUpdateListener(new eg.m1(this, 26));
        this.f17683r.addListener(new mh.k5(this, f10, p1Var, 1));
        this.f17683r.setInterpolator(pr.h);
        this.f17683r.setDuration(320L);
        this.f17683r.start();
    }

    public final void b() {
        this.f17684s = true;
        AndroidUtilities.cancelRunOnUIThread(this.d);
        this.f17679c.q("", true, true);
        invalidate();
        a(0.0f, new p1(this, 1));
    }

    public final void c(s1 s1Var) {
        this.f17678b.set(s1Var.getX() - getX(), s1Var.getY() - getY(), (s1Var.getX() - getX()) + s1Var.getWidth(), (s1Var.getY() - getY()) + s1Var.getHeight());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        int i10;
        r1 r1Var = this;
        Canvas canvas2 = canvas;
        float f10 = 1.0f;
        float lerp = AndroidUtilities.lerp(1.0f, 1.8f, r1Var.f17682n);
        int dp = (int) (AndroidUtilities.dp(90.0f) * lerp);
        boolean z4 = false;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = r1Var.f17680e;
            int size = arrayList.size();
            rectF = r1Var.f17678b;
            if (i11 >= size) {
                break;
            }
            hj0 hj0Var = (hj0) arrayList.get(i11);
            if (hj0Var.Y >= hj0Var.f27524e[0]) {
                arrayList.remove(i11);
                i11--;
            } else {
                float f11 = dp / 2.0f;
                hj0Var.setBounds((int) (((AndroidUtilities.dp(15.0f) * lerp) + rectF.left) - f11), (int) (rectF.centerY() - f11), (int) e2.c.A(AndroidUtilities.dp(15.0f), lerp, rectF.left, f11), (int) (rectF.centerY() + f11));
                hj0Var.setAlpha((int) (r1Var.f17682n * 255.0f));
                hj0Var.draw(canvas2);
            }
            i11++;
        }
        canvas2.save();
        canvas2.translate(rectF.centerX(), rectF.top - AndroidUtilities.dp(1.0f));
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = r1Var.h;
            if (i12 < arrayList2.size()) {
                q1 q1Var = (q1) arrayList2.get(i12);
                float f12 = q1Var.f17647c;
                float f13 = q1Var.f17646b;
                ImageReceiver imageReceiver = q1Var.f17649f;
                float d = q1Var.f17651i.d(f10, z4);
                float e6 = q1Var.f17652j.e(q1Var.h);
                float dp2 = AndroidUtilities.dp(23.0f) + q1Var.f17650g.f28227c;
                float dp3 = AndroidUtilities.dp(18.0f);
                float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.lerp(f10, 0.0f, e6), Utilities.clamp01(Math.min(AndroidUtilities.ilerp(d, f10, 0.85f), AndroidUtilities.ilerp(d, 0.0f, 0.12f))));
                Paint paint = q1Var.f17648e;
                int i13 = (int) (lerp2 * 255.0f);
                paint.setAlpha(i13);
                hj0 hj0Var2 = q1Var.d;
                if (hj0Var2 != null) {
                    hj0Var2.setAlpha(i13);
                }
                imageReceiver.setAlpha(lerp2);
                canvas2.save();
                double d10 = d;
                float sin = (float) Math.sin(Math.pow(d10, 0.44999998807907104d) * 3.141592653589793d * 3.0d);
                float f14 = (f13 * 2.0f) - 1.0f;
                canvas2.translate(AndroidUtilities.dp(4.0f) * f14, 0.0f);
                float f15 = 1.5f * ((f12 * 2.0f) - 1.0f);
                canvas2.rotate(f15);
                int i14 = i12;
                canvas2.translate(0.0f, ((float) Math.pow(d10, 0.800000011920929d)) * (-AndroidUtilities.dp(200.0f)));
                canvas2.translate(AndroidUtilities.dp(5.0f) * sin * ((float) Math.pow(d10, 0.5d)), 0.0f);
                canvas2.rotate(((float) (Math.sin((Math.pow(d10, 0.44999998807907104d) - 0.15000000596046448d) * 3.141592653589793d * 3.0d) * Utilities.clamp01((float) Math.pow(d10, 0.20000000298023224d)))) * (-6.0f));
                float lerp3 = AndroidUtilities.lerp(0.4f, 1.0f, lerp2);
                canvas2.scale(lerp3, lerp3);
                canvas2.translate((-dp2) / 2.0f, (-dp3) / 2.0f);
                float f16 = dp3 / 2.0f;
                canvas2.drawRoundRect(0.0f, 0.0f, dp2, dp3, f16, f16, paint);
                imageReceiver.draw(canvas2);
                Canvas canvas3 = canvas2;
                q1Var.f17650g.c(AndroidUtilities.dp(18.0f), f16, lerp2, -1, canvas3);
                canvas2 = canvas3;
                canvas2.restore();
                if (hj0Var2 != null) {
                    canvas2.save();
                    canvas2.translate(AndroidUtilities.dp(4.0f) * f14, 0.0f);
                    canvas2.rotate(f15);
                    canvas2.translate(0.0f, (-AndroidUtilities.dp(200.0f)) * ((float) Math.pow(d10, 0.800000011920929d)));
                    canvas2.translate(sin * AndroidUtilities.dp(5.0f) * ((float) Math.pow(d10, 0.5d)), 0.0f);
                    int dp4 = AndroidUtilities.dp(90.0f);
                    int i15 = (-dp4) / 2;
                    int i16 = dp4 / 2;
                    hj0Var2.setBounds(i15, AndroidUtilities.dp(8.0f) + i15, i16, AndroidUtilities.dp(8.0f) + i16);
                    hj0Var2.draw(canvas2);
                    canvas2.restore();
                }
                if (d < 1.0f && e6 < 1.0f) {
                    i10 = i14;
                } else {
                    ((q1) arrayList2.get(i14)).f17649f.onDetachedFromWindow();
                    arrayList2.remove(i14);
                    i10 = i14 - 1;
                }
                i12 = i10 + 1;
                r1Var = this;
                f10 = 1.0f;
                z4 = false;
            } else {
                canvas2.restore();
                return;
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f17679c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
