package nh;

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
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.mr;
public final class r1 extends View {
    public final int f15805a;
    public final RectF f15806b;
    public final org.telegram.ui.Components.j6 f15807c;
    public final p1 d;
    public final ArrayList e;
    public final int[] f15808f;
    public final ArrayList h;
    public float f15809n;
    public ValueAnimator f15810r;
    public boolean f15811s;

    public r1(Context context, int i10) {
        super(context);
        this.f15806b = new RectF();
        mr mrVar = mr.f27122f;
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, false, false, false);
        this.f15807c = j6Var;
        this.e = new ArrayList();
        this.f15808f = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.h = new ArrayList();
        this.f15811s = true;
        this.f15805a = i10;
        j6Var.setCallback(this);
        j6Var.o(false, true, false);
        j6Var.t(AndroidUtilities.dp(40.0f));
        j6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        j6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        j6Var.G = AndroidUtilities.displaySize.x;
        j6Var.r(-1);
        j6Var.f25847b = 17;
        this.d = new p1(this, 0);
    }

    public final void a(float f10, p1 p1Var) {
        ValueAnimator valueAnimator = this.f15810r;
        if (valueAnimator != null) {
            this.f15810r = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f15809n, f10);
        this.f15810r = ofFloat;
        ofFloat.addUpdateListener(new dg.o1(this, 26));
        this.f15810r.addListener(new lh.k5(this, f10, p1Var, 1));
        this.f15810r.setInterpolator(mr.h);
        this.f15810r.setDuration(320L);
        this.f15810r.start();
    }

    public final void b() {
        this.f15811s = true;
        AndroidUtilities.cancelRunOnUIThread(this.d);
        this.f15807c.q("", true, true);
        invalidate();
        a(0.0f, new p1(this, 1));
    }

    public final void c(s1 s1Var) {
        this.f15806b.set(s1Var.getX() - getX(), s1Var.getY() - getY(), (s1Var.getX() - getX()) + s1Var.getWidth(), (s1Var.getY() - getY()) + s1Var.getHeight());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        int i10;
        r1 r1Var = this;
        Canvas canvas2 = canvas;
        float f10 = 1.0f;
        float lerp = AndroidUtilities.lerp(1.0f, 1.8f, r1Var.f15809n);
        int dp = (int) (AndroidUtilities.dp(90.0f) * lerp);
        boolean z4 = false;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = r1Var.e;
            int size = arrayList.size();
            rectF = r1Var.f15806b;
            if (i11 >= size) {
                break;
            }
            gj0 gj0Var = (gj0) arrayList.get(i11);
            if (gj0Var.Y >= gj0Var.e[0]) {
                arrayList.remove(i11);
                i11--;
            } else {
                float f11 = dp / 2.0f;
                gj0Var.setBounds((int) (((AndroidUtilities.dp(15.0f) * lerp) + rectF.left) - f11), (int) (rectF.centerY() - f11), (int) e2.c.A(AndroidUtilities.dp(15.0f), lerp, rectF.left, f11), (int) (rectF.centerY() + f11));
                gj0Var.setAlpha((int) (r1Var.f15809n * 255.0f));
                gj0Var.draw(canvas2);
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
                float f12 = q1Var.f15774c;
                float f13 = q1Var.f15773b;
                ImageReceiver imageReceiver = q1Var.f15775f;
                float d = q1Var.f15777i.d(f10, z4);
                float e = q1Var.f15778j.e(q1Var.h);
                float dp2 = AndroidUtilities.dp(23.0f) + q1Var.f15776g.f26124c;
                float dp3 = AndroidUtilities.dp(18.0f);
                float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.lerp(f10, 0.0f, e), Utilities.clamp01(Math.min(AndroidUtilities.ilerp(d, f10, 0.85f), AndroidUtilities.ilerp(d, 0.0f, 0.12f))));
                Paint paint = q1Var.e;
                int i13 = (int) (lerp2 * 255.0f);
                paint.setAlpha(i13);
                gj0 gj0Var2 = q1Var.d;
                if (gj0Var2 != null) {
                    gj0Var2.setAlpha(i13);
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
                q1Var.f15776g.c(AndroidUtilities.dp(18.0f), f16, lerp2, -1, canvas3);
                canvas2 = canvas3;
                canvas2.restore();
                if (gj0Var2 != null) {
                    canvas2.save();
                    canvas2.translate(AndroidUtilities.dp(4.0f) * f14, 0.0f);
                    canvas2.rotate(f15);
                    canvas2.translate(0.0f, (-AndroidUtilities.dp(200.0f)) * ((float) Math.pow(d10, 0.800000011920929d)));
                    canvas2.translate(sin * AndroidUtilities.dp(5.0f) * ((float) Math.pow(d10, 0.5d)), 0.0f);
                    int dp4 = AndroidUtilities.dp(90.0f);
                    int i15 = (-dp4) / 2;
                    int i16 = dp4 / 2;
                    gj0Var2.setBounds(i15, AndroidUtilities.dp(8.0f) + i15, i16, AndroidUtilities.dp(8.0f) + i16);
                    gj0Var2.draw(canvas2);
                    canvas2.restore();
                }
                if (d < 1.0f && e < 1.0f) {
                    i10 = i14;
                } else {
                    ((q1) arrayList2.get(i14)).f15775f.onDetachedFromWindow();
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
        if (drawable != this.f15807c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
