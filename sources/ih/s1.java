package ih;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mi0;
public final class s1 extends View {
    public final int f12100a;
    public final RectF f12101b;
    public final org.telegram.ui.Components.i6 f12102c;
    public final q1 d;
    public final ArrayList f12103e;
    public final int[] f12104f;
    public final ArrayList h;
    public float f12105n;
    public ValueAnimator f12106r;
    public boolean f12107s;

    public s1(Context context, int i9) {
        super(context);
        this.f12101b = new RectF();
        gr grVar = gr.f28844f;
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, false, false, false);
        this.f12102c = i6Var;
        this.f12103e = new ArrayList();
        this.f12104f = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.h = new ArrayList();
        this.f12107s = true;
        this.f12100a = i9;
        i6Var.setCallback(this);
        i6Var.o(false, true, false);
        i6Var.t(AndroidUtilities.dp(40.0f));
        i6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        i6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        i6Var.G = AndroidUtilities.displaySize.x;
        i6Var.r(-1);
        i6Var.f29333b = 17;
        this.d = new q1(this, 0);
    }

    public final void a(float f10, q1 q1Var) {
        ValueAnimator valueAnimator = this.f12106r;
        if (valueAnimator != null) {
            this.f12106r = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f12105n, f10);
        this.f12106r = ofFloat;
        ofFloat.addUpdateListener(new bg.b(this, 17));
        this.f12106r.addListener(new gh.o5(this, f10, q1Var, 1));
        this.f12106r.setInterpolator(gr.h);
        this.f12106r.setDuration(320L);
        this.f12106r.start();
    }

    public final void b() {
        this.f12107s = true;
        AndroidUtilities.cancelRunOnUIThread(this.d);
        this.f12102c.q("", true, true);
        invalidate();
        a(0.0f, new q1(this, 1));
    }

    public final void c(t1 t1Var) {
        this.f12101b.set(t1Var.getX() - getX(), t1Var.getY() - getY(), (t1Var.getX() - getX()) + t1Var.getWidth(), (t1Var.getY() - getY()) + t1Var.getHeight());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        int i9;
        s1 s1Var = this;
        Canvas canvas2 = canvas;
        float f10 = 1.0f;
        float lerp = AndroidUtilities.lerp(1.0f, 1.8f, s1Var.f12105n);
        int dp = (int) (AndroidUtilities.dp(90.0f) * lerp);
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = s1Var.f12103e;
            int size = arrayList.size();
            rectF = s1Var.f12101b;
            if (i10 >= size) {
                break;
            }
            mi0 mi0Var = (mi0) arrayList.get(i10);
            if (mi0Var.X >= mi0Var.f30847e[0]) {
                arrayList.remove(i10);
                i10--;
            } else {
                float f11 = dp / 2.0f;
                mi0Var.setBounds((int) (((AndroidUtilities.dp(15.0f) * lerp) + rectF.left) - f11), (int) (rectF.centerY() - f11), (int) aa.d.w(AndroidUtilities.dp(15.0f), lerp, rectF.left, f11), (int) (rectF.centerY() + f11));
                mi0Var.setAlpha((int) (s1Var.f12105n * 255.0f));
                mi0Var.draw(canvas2);
            }
            i10++;
        }
        canvas2.save();
        canvas2.translate(rectF.centerX(), rectF.top - AndroidUtilities.dp(1.0f));
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = s1Var.h;
            if (i11 < arrayList2.size()) {
                r1 r1Var = (r1) arrayList2.get(i11);
                float f12 = r1Var.f12058c;
                float f13 = r1Var.f12057b;
                ImageReceiver imageReceiver = r1Var.f12060f;
                float d = r1Var.f12062i.d(f10, z10);
                float e10 = r1Var.f12063j.e(r1Var.h);
                float dp2 = AndroidUtilities.dp(23.0f) + r1Var.f12061g.f31223c;
                float dp3 = AndroidUtilities.dp(18.0f);
                float lerp2 = AndroidUtilities.lerp(0.0f, AndroidUtilities.lerp(f10, 0.0f, e10), Utilities.clamp01(Math.min(AndroidUtilities.ilerp(d, f10, 0.85f), AndroidUtilities.ilerp(d, 0.0f, 0.12f))));
                Paint paint = r1Var.f12059e;
                int i12 = (int) (lerp2 * 255.0f);
                paint.setAlpha(i12);
                mi0 mi0Var2 = r1Var.d;
                if (mi0Var2 != null) {
                    mi0Var2.setAlpha(i12);
                }
                imageReceiver.setAlpha(lerp2);
                canvas2.save();
                double d9 = d;
                float sin = (float) Math.sin(Math.pow(d9, 0.44999998807907104d) * 3.141592653589793d * 3.0d);
                float f14 = (f13 * 2.0f) - 1.0f;
                canvas2.translate(AndroidUtilities.dp(4.0f) * f14, 0.0f);
                float f15 = 1.5f * ((f12 * 2.0f) - 1.0f);
                canvas2.rotate(f15);
                int i13 = i11;
                canvas2.translate(0.0f, ((float) Math.pow(d9, 0.800000011920929d)) * (-AndroidUtilities.dp(200.0f)));
                canvas2.translate(AndroidUtilities.dp(5.0f) * sin * ((float) Math.pow(d9, 0.5d)), 0.0f);
                canvas2.rotate(((float) (Math.sin((Math.pow(d9, 0.44999998807907104d) - 0.15000000596046448d) * 3.141592653589793d * 3.0d) * Utilities.clamp01((float) Math.pow(d9, 0.20000000298023224d)))) * (-6.0f));
                float lerp3 = AndroidUtilities.lerp(0.4f, 1.0f, lerp2);
                canvas2.scale(lerp3, lerp3);
                canvas2.translate((-dp2) / 2.0f, (-dp3) / 2.0f);
                float f16 = dp3 / 2.0f;
                canvas2.drawRoundRect(0.0f, 0.0f, dp2, dp3, f16, f16, paint);
                imageReceiver.draw(canvas2);
                Canvas canvas3 = canvas2;
                r1Var.f12061g.c(AndroidUtilities.dp(18.0f), f16, lerp2, -1, canvas3);
                canvas2 = canvas3;
                canvas2.restore();
                if (mi0Var2 != null) {
                    canvas2.save();
                    canvas2.translate(AndroidUtilities.dp(4.0f) * f14, 0.0f);
                    canvas2.rotate(f15);
                    canvas2.translate(0.0f, (-AndroidUtilities.dp(200.0f)) * ((float) Math.pow(d9, 0.800000011920929d)));
                    canvas2.translate(sin * AndroidUtilities.dp(5.0f) * ((float) Math.pow(d9, 0.5d)), 0.0f);
                    int dp4 = AndroidUtilities.dp(90.0f);
                    int i14 = (-dp4) / 2;
                    int i15 = dp4 / 2;
                    mi0Var2.setBounds(i14, AndroidUtilities.dp(8.0f) + i14, i15, AndroidUtilities.dp(8.0f) + i15);
                    mi0Var2.draw(canvas2);
                    canvas2.restore();
                }
                if (d < 1.0f && e10 < 1.0f) {
                    i9 = i13;
                } else {
                    ((r1) arrayList2.get(i13)).f12060f.onDetachedFromWindow();
                    arrayList2.remove(i13);
                    i9 = i13 - 1;
                }
                i11 = i9 + 1;
                s1Var = this;
                f10 = 1.0f;
                z10 = false;
            } else {
                canvas2.restore();
                return;
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f12102c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
