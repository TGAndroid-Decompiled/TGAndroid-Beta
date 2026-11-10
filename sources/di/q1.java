package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.zg0;
public final class q1 extends View {
    public final int f9568a;
    public final RectF f9569b;
    public final org.telegram.ui.Components.h6 f9570c;
    public final o1 d;
    public final ArrayList f9571e;
    public final int[] f9572f;
    public final ArrayList h;
    public float f9573n;
    public ValueAnimator f9574r;
    public boolean f9575s;

    public q1(Context context, int i7) {
        super(context);
        this.f9569b = new RectF();
        wq wqVar = wq.f40046f;
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(false, false, false);
        this.f9570c = h6Var;
        this.f9571e = new ArrayList();
        this.f9572f = new int[]{2131624219, 2131624220, 2131624221, 2131624222, 2131624223};
        this.h = new ArrayList();
        this.f9575s = true;
        this.f9568a = i7;
        h6Var.setCallback(this);
        h6Var.r(false, true);
        h6Var.w(org.telegram.messenger.g0.L(40.0f));
        h6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        h6Var.s(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(3.5f), 0);
        h6Var.M = org.telegram.messenger.g0.f22567q.x;
        h6Var.u(-1);
        h6Var.f34187b = 17;
        this.d = new o1(this, 0);
    }

    public final void a(float f10, o1 o1Var) {
        ValueAnimator valueAnimator = this.f9574r;
        if (valueAnimator != null) {
            this.f9574r = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f9573n, f10);
        this.f9574r = ofFloat;
        ofFloat.addUpdateListener(new ah.h(this, 17));
        this.f9574r.addListener(new bi.o7(this, f10, o1Var, 1));
        this.f9574r.setInterpolator(wq.h);
        this.f9574r.setDuration(320L);
        this.f9574r.start();
    }

    public final void b() {
        this.f9575s = true;
        org.telegram.messenger.g0.r(this.d);
        this.f9570c.t("", true, true);
        invalidate();
        a(0.0f, new o1(this, 1));
    }

    public final void c(r1 r1Var) {
        this.f9569b.set(r1Var.getX() - getX(), r1Var.getY() - getY(), (r1Var.getX() - getX()) + r1Var.getWidth(), (r1Var.getY() - getY()) + r1Var.getHeight());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        RectF rectF;
        int i7;
        q1 q1Var = this;
        Canvas canvas2 = canvas;
        float f12 = 1.0f;
        float T1 = org.telegram.messenger.g0.T1(1.0f, 1.8f, q1Var.f9573n);
        float f13 = 90.0f;
        int L = (int) (org.telegram.messenger.g0.L(90.0f) * T1);
        boolean z9 = false;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = q1Var.f9571e;
            int size = arrayList.size();
            f10 = 255.0f;
            f11 = 2.0f;
            rectF = q1Var.f9569b;
            if (i10 >= size) {
                break;
            }
            zg0 zg0Var = (zg0) arrayList.get(i10);
            if (zg0Var.f40962a0 >= zg0Var.f40968e[0]) {
                arrayList.remove(i10);
                i10--;
            } else {
                float f14 = L / 2.0f;
                zg0Var.setBounds((int) (((org.telegram.messenger.g0.L(15.0f) * T1) + rectF.left) - f14), (int) (rectF.centerY() - f14), (int) rf.b.d(org.telegram.messenger.g0.L(15.0f), T1, rectF.left, f14), (int) (rectF.centerY() + f14));
                zg0Var.setAlpha((int) (q1Var.f9573n * 255.0f));
                zg0Var.draw(canvas2);
            }
            i10++;
        }
        canvas2.save();
        canvas2.translate(rectF.centerX(), rectF.top - org.telegram.messenger.g0.L(1.0f));
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = q1Var.h;
            if (i11 < arrayList2.size()) {
                p1 p1Var = (p1) arrayList2.get(i11);
                float f15 = p1Var.f9493c;
                float f16 = p1Var.f9492b;
                ImageReceiver imageReceiver = p1Var.f9495f;
                float e10 = p1Var.f9497i.e(z9, f12);
                float d = p1Var.f9498j.d(p1Var.h);
                float f17 = f13;
                float L2 = org.telegram.messenger.g0.L(23.0f) + p1Var.f9496g.f36133c;
                float L3 = org.telegram.messenger.g0.L(18.0f);
                float f18 = f10;
                float f19 = f11;
                float f20 = f12;
                float T12 = org.telegram.messenger.g0.T1(0.0f, org.telegram.messenger.g0.T1(f12, 0.0f, d), Utilities.l(Math.min(org.telegram.messenger.g0.z1(e10, f12, 0.85f), org.telegram.messenger.g0.z1(e10, 0.0f, 0.12f))));
                Paint paint = p1Var.f9494e;
                int i12 = (int) (T12 * f18);
                paint.setAlpha(i12);
                zg0 zg0Var2 = p1Var.d;
                if (zg0Var2 != null) {
                    zg0Var2.setAlpha(i12);
                }
                imageReceiver.setAlpha(T12);
                canvas2.save();
                double d2 = e10;
                float sin = (float) Math.sin(Math.pow(d2, 0.44999998807907104d) * 3.141592653589793d * 3.0d);
                float f21 = (f16 * f19) - f20;
                canvas2.translate(org.telegram.messenger.g0.L(4.0f) * f21, 0.0f);
                float f22 = 1.5f * ((f15 * f19) - f20);
                canvas2.rotate(f22);
                int i13 = i11;
                canvas2.translate(0.0f, ((float) Math.pow(d2, 0.800000011920929d)) * (-org.telegram.messenger.g0.L(200.0f)));
                canvas2.translate(org.telegram.messenger.g0.L(5.0f) * sin * ((float) Math.pow(d2, 0.5d)), 0.0f);
                canvas2.rotate(((float) (Math.sin((Math.pow(d2, 0.44999998807907104d) - 0.15000000596046448d) * 3.141592653589793d * 3.0d) * Utilities.l((float) Math.pow(d2, 0.20000000298023224d)))) * (-6.0f));
                float T13 = org.telegram.messenger.g0.T1(0.4f, f20, T12);
                canvas2.scale(T13, T13);
                canvas2.translate((-L2) / f19, (-L3) / f19);
                float f23 = L3 / f19;
                canvas2.drawRoundRect(0.0f, 0.0f, L2, L3, f23, f23, paint);
                imageReceiver.h(canvas2, null);
                Canvas canvas3 = canvas2;
                p1Var.f9496g.c(org.telegram.messenger.g0.L(18.0f), f23, T12, -1, canvas3);
                canvas2 = canvas3;
                canvas2.restore();
                if (zg0Var2 != null) {
                    canvas2.save();
                    canvas2.translate(org.telegram.messenger.g0.L(4.0f) * f21, 0.0f);
                    canvas2.rotate(f22);
                    canvas2.translate(0.0f, (-org.telegram.messenger.g0.L(200.0f)) * ((float) Math.pow(d2, 0.800000011920929d)));
                    canvas2.translate(sin * org.telegram.messenger.g0.L(5.0f) * ((float) Math.pow(d2, 0.5d)), 0.0f);
                    int L4 = org.telegram.messenger.g0.L(f17);
                    int i14 = (-L4) / 2;
                    int i15 = L4 / 2;
                    zg0Var2.setBounds(i14, org.telegram.messenger.g0.L(8.0f) + i14, i15, org.telegram.messenger.g0.L(8.0f) + i15);
                    zg0Var2.draw(canvas2);
                    canvas2.restore();
                }
                if (e10 < 1.0f && d < 1.0f) {
                    i7 = i13;
                } else {
                    ((p1) arrayList2.get(i13)).f9495f.R();
                    arrayList2.remove(i13);
                    i7 = i13 - 1;
                }
                i11 = i7 + 1;
                q1Var = this;
                f13 = f17;
                f10 = f18;
                f11 = f19;
                f12 = 1.0f;
                z9 = false;
            } else {
                canvas2.restore();
                return;
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f9570c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
