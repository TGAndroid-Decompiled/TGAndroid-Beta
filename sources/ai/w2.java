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
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.rr;
public final class w2 extends View {
    public final int f1642a;
    public final RectF f1643b;
    public final org.telegram.ui.Components.o6 f1644c;
    public final s2 d;
    public final ArrayList e;
    public final int[] f1645f;
    public final ArrayList h;
    public float f1646n;
    public ValueAnimator f1647r;
    public boolean f1648s;

    public w2(Context context, int i10) {
        super(context);
        this.f1643b = new RectF();
        rr rrVar = rr.f28022f;
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(false, false, false, false);
        this.f1644c = o6Var;
        this.e = new ArrayList();
        this.f1645f = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.h = new ArrayList();
        this.f1648s = true;
        this.f1642a = i10;
        o6Var.setCallback(this);
        o6Var.o(false, true, false);
        o6Var.t(AndroidUtilities.dp(40.0f));
        o6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        o6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        o6Var.G = AndroidUtilities.displaySize.x;
        o6Var.r(-1);
        o6Var.f26925b = 17;
        this.d = new s2(this, 0);
    }

    public final void a(float f7, s2 s2Var) {
        ValueAnimator valueAnimator = this.f1647r;
        if (valueAnimator != null) {
            this.f1647r = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f1646n, f7);
        this.f1647r = ofFloat;
        ofFloat.addUpdateListener(new a(this, 7));
        this.f1647r.addListener(new t2(this, f7, s2Var, 0));
        this.f1647r.setInterpolator(rr.h);
        this.f1647r.setDuration(320L);
        this.f1647r.start();
    }

    public final void b() {
        this.f1648s = true;
        AndroidUtilities.cancelRunOnUIThread(this.d);
        this.f1644c.q("", true, true);
        invalidate();
        a(0.0f, new s2(this, 1));
    }

    public final void c(x2 x2Var) {
        this.f1643b.set(x2Var.getX() - getX(), x2Var.getY() - getY(), (x2Var.getX() - getX()) + x2Var.getWidth(), (x2Var.getY() - getY()) + x2Var.getHeight());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        int i10;
        w2 w2Var = this;
        Canvas canvas2 = canvas;
        float f7 = 1.0f;
        float lerp = AndroidUtilities.lerp(1.0f, 1.8f, w2Var.f1646n);
        int dp = (int) (AndroidUtilities.dp(90.0f) * lerp);
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = w2Var.e;
            int size = arrayList.size();
            rectF = w2Var.f1643b;
            if (i11 >= size) {
                break;
            }
            ij0 ij0Var = (ij0) arrayList.get(i11);
            if (ij0Var.f25042a0 >= ij0Var.e[0]) {
                arrayList.remove(i11);
                i11--;
            } else {
                float f10 = dp / 2.0f;
                ij0Var.setBounds((int) (((AndroidUtilities.dp(15.0f) * lerp) + rectF.left) - f10), (int) (rectF.centerY() - f10), (int) org.telegram.ui.Cells.c1.b(AndroidUtilities.dp(15.0f), lerp, rectF.left, f10), (int) (rectF.centerY() + f10));
                ij0Var.setAlpha((int) (w2Var.f1646n * 255.0f));
                ij0Var.draw(canvas2);
            }
            i11++;
        }
        canvas2.save();
        canvas2.translate(rectF.centerX(), rectF.top - AndroidUtilities.dp(1.0f));
        int i12 = 0;
        while (true) {
            ArrayList arrayList2 = w2Var.h;
            if (i12 < arrayList2.size()) {
                v2 v2Var = (v2) arrayList2.get(i12);
                float f11 = v2Var.f1599c;
                float f12 = v2Var.f1598b;
                ImageReceiver imageReceiver = v2Var.f1600f;
                float d = v2Var.f1602i.d(f7, z10);
                float e = v2Var.f1603j.e(v2Var.h);
                float dp2 = AndroidUtilities.dp(23.0f) + v2Var.f1601g.f28357c;
                float dp3 = AndroidUtilities.dp(18.0f);
                float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.lerp(f7, 0.0f, e), Utilities.clamp01(Math.min(AndroidUtilities.ilerp(d, f7, 0.85f), AndroidUtilities.ilerp(d, 0.0f, 0.12f))));
                Paint paint = v2Var.e;
                int i13 = (int) (lerp2 * 255.0f);
                paint.setAlpha(i13);
                ij0 ij0Var2 = v2Var.d;
                if (ij0Var2 != null) {
                    ij0Var2.setAlpha(i13);
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
                v2Var.f1601g.c(AndroidUtilities.dp(18.0f), f15, lerp2, -1, canvas3);
                canvas2 = canvas3;
                canvas2.restore();
                if (ij0Var2 != null) {
                    canvas2.save();
                    canvas2.translate(AndroidUtilities.dp(4.0f) * f13, 0.0f);
                    canvas2.rotate(f14);
                    canvas2.translate(0.0f, (-AndroidUtilities.dp(200.0f)) * ((float) Math.pow(d10, 0.800000011920929d)));
                    canvas2.translate(sin * AndroidUtilities.dp(5.0f) * ((float) Math.pow(d10, 0.5d)), 0.0f);
                    int dp4 = AndroidUtilities.dp(90.0f);
                    int i15 = (-dp4) / 2;
                    int i16 = dp4 / 2;
                    ij0Var2.setBounds(i15, AndroidUtilities.dp(8.0f) + i15, i16, AndroidUtilities.dp(8.0f) + i16);
                    ij0Var2.draw(canvas2);
                    canvas2.restore();
                }
                if (d < 1.0f && e < 1.0f) {
                    i10 = i14;
                } else {
                    ((v2) arrayList2.get(i14)).f1600f.onDetachedFromWindow();
                    arrayList2.remove(i14);
                    i10 = i14 - 1;
                }
                i12 = i10 + 1;
                w2Var = this;
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
        if (drawable != this.f1644c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
