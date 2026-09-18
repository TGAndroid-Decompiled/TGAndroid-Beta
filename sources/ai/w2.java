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
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.yi0;
public final class w2 extends View {
    public final int f1641a;
    public final RectF f1642b;
    public final org.telegram.ui.Components.m6 f1643c;
    public final s2 d;
    public final ArrayList e;
    public final int[] f1644f;
    public final ArrayList h;
    public float f1645n;
    public ValueAnimator f1646r;
    public boolean f1647s;

    public w2(Context context, int i10) {
        super(context);
        this.f1642b = new RectF();
        qr qrVar = qr.f27383f;
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, false, false, false);
        this.f1643c = m6Var;
        this.e = new ArrayList();
        this.f1644f = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.h = new ArrayList();
        this.f1647s = true;
        this.f1641a = i10;
        m6Var.setCallback(this);
        m6Var.o(false, true, false);
        m6Var.t(AndroidUtilities.dp(40.0f));
        m6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        m6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        m6Var.G = AndroidUtilities.displaySize.x;
        m6Var.r(-1);
        m6Var.f26070b = 17;
        this.d = new s2(this, 0);
    }

    public final void a(float f7, s2 s2Var) {
        ValueAnimator valueAnimator = this.f1646r;
        if (valueAnimator != null) {
            this.f1646r = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f1645n, f7);
        this.f1646r = ofFloat;
        ofFloat.addUpdateListener(new a(this, 7));
        this.f1646r.addListener(new t2(this, f7, s2Var, 0));
        this.f1646r.setInterpolator(qr.h);
        this.f1646r.setDuration(320L);
        this.f1646r.start();
    }

    public final void b() {
        this.f1647s = true;
        AndroidUtilities.cancelRunOnUIThread(this.d);
        this.f1643c.q("", true, true);
        invalidate();
        a(0.0f, new s2(this, 1));
    }

    public final void c(x2 x2Var) {
        this.f1642b.set(x2Var.getX() - getX(), x2Var.getY() - getY(), (x2Var.getX() - getX()) + x2Var.getWidth(), (x2Var.getY() - getY()) + x2Var.getHeight());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        int i10;
        w2 w2Var = this;
        Canvas canvas2 = canvas;
        float f7 = 1.0f;
        float lerp = AndroidUtilities.lerp(1.0f, 1.8f, w2Var.f1645n);
        int dp = (int) (AndroidUtilities.dp(90.0f) * lerp);
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = w2Var.e;
            int size = arrayList.size();
            rectF = w2Var.f1642b;
            if (i11 >= size) {
                break;
            }
            yi0 yi0Var = (yi0) arrayList.get(i11);
            if (yi0Var.f30222a0 >= yi0Var.e[0]) {
                arrayList.remove(i11);
                i11--;
            } else {
                float f10 = dp / 2.0f;
                yi0Var.setBounds((int) (((AndroidUtilities.dp(15.0f) * lerp) + rectF.left) - f10), (int) (rectF.centerY() - f10), (int) org.telegram.ui.Cells.p6.a(AndroidUtilities.dp(15.0f), lerp, rectF.left, f10), (int) (rectF.centerY() + f10));
                yi0Var.setAlpha((int) (w2Var.f1645n * 255.0f));
                yi0Var.draw(canvas2);
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
                float f11 = v2Var.f1604c;
                float f12 = v2Var.f1603b;
                ImageReceiver imageReceiver = v2Var.f1605f;
                float d = v2Var.f1607i.d(f7, z10);
                float e = v2Var.f1608j.e(v2Var.h);
                float dp2 = AndroidUtilities.dp(23.0f) + v2Var.f1606g.f24442c;
                float dp3 = AndroidUtilities.dp(18.0f);
                float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.lerp(f7, 0.0f, e), Utilities.clamp01(Math.min(AndroidUtilities.ilerp(d, f7, 0.85f), AndroidUtilities.ilerp(d, 0.0f, 0.12f))));
                Paint paint = v2Var.e;
                int i13 = (int) (lerp2 * 255.0f);
                paint.setAlpha(i13);
                yi0 yi0Var2 = v2Var.d;
                if (yi0Var2 != null) {
                    yi0Var2.setAlpha(i13);
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
                v2Var.f1606g.c(AndroidUtilities.dp(18.0f), f15, lerp2, -1, canvas3);
                canvas2 = canvas3;
                canvas2.restore();
                if (yi0Var2 != null) {
                    canvas2.save();
                    canvas2.translate(AndroidUtilities.dp(4.0f) * f13, 0.0f);
                    canvas2.rotate(f14);
                    canvas2.translate(0.0f, (-AndroidUtilities.dp(200.0f)) * ((float) Math.pow(d10, 0.800000011920929d)));
                    canvas2.translate(sin * AndroidUtilities.dp(5.0f) * ((float) Math.pow(d10, 0.5d)), 0.0f);
                    int dp4 = AndroidUtilities.dp(90.0f);
                    int i15 = (-dp4) / 2;
                    int i16 = dp4 / 2;
                    yi0Var2.setBounds(i15, AndroidUtilities.dp(8.0f) + i15, i16, AndroidUtilities.dp(8.0f) + i16);
                    yi0Var2.draw(canvas2);
                    canvas2.restore();
                }
                if (d < 1.0f && e < 1.0f) {
                    i10 = i14;
                } else {
                    ((v2) arrayList2.get(i14)).f1605f.onDetachedFromWindow();
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
        if (drawable != this.f1643c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
