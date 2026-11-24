package defpackage;

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
public final class wt7 extends View {
    public final int a;
    public final RectF b;
    public final ho c;
    public final ut7 d;
    public final ArrayList e;
    public final int[] f;
    public final ArrayList h;
    public float n;
    public ValueAnimator r;
    public boolean s;

    public wt7(Context context, int i) {
        super(context);
        this.b = new RectF();
        d53 d53Var = d53.f;
        ho hoVar = new ho(false, false, false);
        this.c = hoVar;
        this.e = new ArrayList();
        this.f = new int[]{2131624214, 2131624215, 2131624216, 2131624217, 2131624218};
        this.h = new ArrayList();
        this.s = true;
        this.a = i;
        hoVar.setCallback(this);
        hoVar.r(false, true);
        hoVar.w(gm.L(40.0f));
        hoVar.x(gm.n1("fonts/num.otf"));
        hoVar.s(gm.L(12.0f), gm.L(3.5f), 0);
        hoVar.N = gm.q.x;
        hoVar.u(-1);
        hoVar.b = 17;
        this.d = new ut7(this, (byte) 0);
    }

    public final void a(float f, ut7 ut7Var) {
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            this.r = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, f);
        this.r = ofFloat;
        ofFloat.addUpdateListener(new fh4(this, (byte) 28));
        this.r.addListener(new ok4(this, f, ut7Var, (byte) 2));
        this.r.setInterpolator(d53.h);
        this.r.setDuration(320L);
        this.r.start();
    }

    public final void b() {
        this.s = true;
        gm.r(this.d);
        this.c.t("", true, true);
        invalidate();
        a(0.0f, new ut7(this, (byte) 1));
    }

    public final void c(xt7 xt7Var) {
        this.b.set(xt7Var.getX() - getX(), xt7Var.getY() - getY(), (xt7Var.getX() - getX()) + xt7Var.getWidth(), (xt7Var.getY() - getY()) + xt7Var.getHeight());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        RectF rectF;
        int i;
        wt7 wt7Var = this;
        Canvas canvas2 = canvas;
        float f3 = 1.0f;
        float R1 = gm.R1(1.0f, 1.8f, wt7Var.n);
        float f4 = 90.0f;
        int L = (int) (gm.L(90.0f) * R1);
        boolean z = false;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = wt7Var.e;
            int size = arrayList.size();
            f = 255.0f;
            f2 = 2.0f;
            rectF = wt7Var.b;
            if (i2 >= size) {
                break;
            }
            p09 p09Var = (p09) arrayList.get(i2);
            if (p09Var.b0 >= p09Var.e[0]) {
                arrayList.remove(i2);
                i2--;
            } else {
                float f5 = L / 2.0f;
                p09Var.setBounds((int) (((gm.L(15.0f) * R1) + rectF.left) - f5), (int) (rectF.centerY() - f5), (int) ts2.i(gm.L(15.0f), R1, rectF.left, f5), (int) (rectF.centerY() + f5));
                p09Var.setAlpha((int) (wt7Var.n * 255.0f));
                p09Var.draw(canvas2);
            }
            i2++;
        }
        canvas2.save();
        canvas2.translate(rectF.centerX(), rectF.top - gm.L(1.0f));
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = wt7Var.h;
            if (i3 < arrayList2.size()) {
                vt7 vt7Var = (vt7) arrayList2.get(i3);
                float f6 = vt7Var.c;
                float f7 = vt7Var.b;
                ImageReceiver imageReceiver = vt7Var.f;
                float e = vt7Var.i.e(z, f3);
                float d = vt7Var.j.d(vt7Var.h);
                float f8 = f4;
                float L2 = gm.L(23.0f) + vt7Var.g.c;
                float L3 = gm.L(18.0f);
                float f9 = f;
                float f10 = f2;
                float f11 = f3;
                float R12 = gm.R1(0.0f, gm.R1(f3, 0.0f, d), Utilities.l(Math.min(gm.x1(e, f3, 0.85f), gm.x1(e, 0.0f, 0.12f))));
                Paint paint = vt7Var.e;
                int i4 = (int) (R12 * f9);
                paint.setAlpha(i4);
                p09 p09Var2 = vt7Var.d;
                if (p09Var2 != null) {
                    p09Var2.setAlpha(i4);
                }
                imageReceiver.setAlpha(R12);
                canvas2.save();
                double d2 = e;
                float sin = (float) Math.sin(Math.pow(d2, 0.44999998807907104d) * 3.141592653589793d * 3.0d);
                float f12 = (f7 * f10) - f11;
                canvas2.translate(gm.L(4.0f) * f12, 0.0f);
                float f13 = 1.5f * ((f6 * f10) - f11);
                canvas2.rotate(f13);
                int i5 = i3;
                canvas2.translate(0.0f, ((float) Math.pow(d2, 0.800000011920929d)) * (-gm.L(200.0f)));
                canvas2.translate(gm.L(5.0f) * sin * ((float) Math.pow(d2, 0.5d)), 0.0f);
                canvas2.rotate(((float) (Math.sin((Math.pow(d2, 0.44999998807907104d) - 0.15000000596046448d) * 3.141592653589793d * 3.0d) * Utilities.l((float) Math.pow(d2, 0.20000000298023224d)))) * (-6.0f));
                float R13 = gm.R1(0.4f, f11, R12);
                canvas2.scale(R13, R13);
                canvas2.translate((-L2) / f10, (-L3) / f10);
                float f14 = L3 / f10;
                canvas2.drawRoundRect(0.0f, 0.0f, L2, L3, f14, f14, paint);
                imageReceiver.h(canvas2, null);
                Canvas canvas3 = canvas2;
                vt7Var.g.c(gm.L(18.0f), f14, R12, -1, canvas3);
                canvas2 = canvas3;
                canvas2.restore();
                if (p09Var2 != null) {
                    canvas2.save();
                    canvas2.translate(gm.L(4.0f) * f12, 0.0f);
                    canvas2.rotate(f13);
                    canvas2.translate(0.0f, (-gm.L(200.0f)) * ((float) Math.pow(d2, 0.800000011920929d)));
                    canvas2.translate(sin * gm.L(5.0f) * ((float) Math.pow(d2, 0.5d)), 0.0f);
                    int L4 = gm.L(f8);
                    int i6 = (-L4) / 2;
                    int i7 = L4 / 2;
                    p09Var2.setBounds(i6, gm.L(8.0f) + i6, i7, gm.L(8.0f) + i7);
                    p09Var2.draw(canvas2);
                    canvas2.restore();
                }
                if (e < 1.0f && d < 1.0f) {
                    i = i5;
                } else {
                    ((vt7) arrayList2.get(i5)).f.K();
                    arrayList2.remove(i5);
                    i = i5 - 1;
                }
                i3 = i + 1;
                wt7Var = this;
                f4 = f8;
                f = f9;
                f2 = f10;
                f3 = 1.0f;
                z = false;
            } else {
                canvas2.restore();
                return;
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.c && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
