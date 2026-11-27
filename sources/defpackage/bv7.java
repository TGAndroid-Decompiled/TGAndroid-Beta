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
public final class bv7 extends View {
    public final int a;
    public final RectF b;
    public final hn c;
    public final zu7 d;
    public final ArrayList e;
    public final int[] f;
    public final ArrayList h;
    public float n;
    public ValueAnimator r;
    public boolean s;

    public bv7(Context context, int i) {
        super(context);
        this.b = new RectF();
        k43 k43Var = k43.f;
        hn hnVar = new hn(false, false, false);
        this.c = hnVar;
        this.e = new ArrayList();
        this.f = new int[]{2131624214, 2131624215, 2131624216, 2131624217, 2131624218};
        this.h = new ArrayList();
        this.s = true;
        this.a = i;
        hnVar.setCallback(this);
        hnVar.r(false, true);
        hnVar.w(hl.L(40.0f));
        hnVar.x(hl.n1("fonts/num.otf"));
        hnVar.s(hl.L(12.0f), hl.L(3.5f), 0);
        hnVar.N = hl.q.x;
        hnVar.u(-1);
        hnVar.b = 17;
        this.d = new zu7(this, (byte) 0);
    }

    public final void a(float f, zu7 zu7Var) {
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            this.r = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, f);
        this.r = ofFloat;
        ofFloat.addUpdateListener(new ch4(this, (byte) 29));
        this.r.addListener(new ok4(this, f, zu7Var, (byte) 2));
        this.r.setInterpolator(k43.h);
        this.r.setDuration(320L);
        this.r.start();
    }

    public final void b() {
        this.s = true;
        hl.r(this.d);
        this.c.t("", true, true);
        invalidate();
        a(0.0f, new zu7(this, (byte) 1));
    }

    public final void c(cv7 cv7Var) {
        this.b.set(cv7Var.getX() - getX(), cv7Var.getY() - getY(), (cv7Var.getX() - getX()) + cv7Var.getWidth(), (cv7Var.getY() - getY()) + cv7Var.getHeight());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        RectF rectF;
        int i;
        bv7 bv7Var = this;
        Canvas canvas2 = canvas;
        float f3 = 1.0f;
        float R1 = hl.R1(1.0f, 1.8f, bv7Var.n);
        float f4 = 90.0f;
        int L = (int) (hl.L(90.0f) * R1);
        boolean z = false;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = bv7Var.e;
            int size = arrayList.size();
            f = 255.0f;
            f2 = 2.0f;
            rectF = bv7Var.b;
            if (i2 >= size) {
                break;
            }
            b29 b29Var = (b29) arrayList.get(i2);
            if (b29Var.b0 >= b29Var.e[0]) {
                arrayList.remove(i2);
                i2--;
            } else {
                float f5 = L / 2.0f;
                b29Var.setBounds((int) (((hl.L(15.0f) * R1) + rectF.left) - f5), (int) (rectF.centerY() - f5), (int) bs2.i(hl.L(15.0f), R1, rectF.left, f5), (int) (rectF.centerY() + f5));
                b29Var.setAlpha((int) (bv7Var.n * 255.0f));
                b29Var.draw(canvas2);
            }
            i2++;
        }
        canvas2.save();
        canvas2.translate(rectF.centerX(), rectF.top - hl.L(1.0f));
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = bv7Var.h;
            if (i3 < arrayList2.size()) {
                av7 av7Var = (av7) arrayList2.get(i3);
                float f6 = av7Var.c;
                float f7 = av7Var.b;
                ImageReceiver imageReceiver = av7Var.f;
                float e = av7Var.i.e(z, f3);
                float d = av7Var.j.d(av7Var.h);
                float f8 = f4;
                float L2 = hl.L(23.0f) + av7Var.g.c;
                float L3 = hl.L(18.0f);
                float f9 = f;
                float f10 = f2;
                float f11 = f3;
                float R12 = hl.R1(0.0f, hl.R1(f3, 0.0f, d), Utilities.l(Math.min(hl.x1(e, f3, 0.85f), hl.x1(e, 0.0f, 0.12f))));
                Paint paint = av7Var.e;
                int i4 = (int) (R12 * f9);
                paint.setAlpha(i4);
                b29 b29Var2 = av7Var.d;
                if (b29Var2 != null) {
                    b29Var2.setAlpha(i4);
                }
                imageReceiver.setAlpha(R12);
                canvas2.save();
                double d2 = e;
                float sin = (float) Math.sin(Math.pow(d2, 0.44999998807907104d) * 3.141592653589793d * 3.0d);
                float f12 = (f7 * f10) - f11;
                canvas2.translate(hl.L(4.0f) * f12, 0.0f);
                float f13 = 1.5f * ((f6 * f10) - f11);
                canvas2.rotate(f13);
                int i5 = i3;
                canvas2.translate(0.0f, ((float) Math.pow(d2, 0.800000011920929d)) * (-hl.L(200.0f)));
                canvas2.translate(hl.L(5.0f) * sin * ((float) Math.pow(d2, 0.5d)), 0.0f);
                canvas2.rotate(((float) (Math.sin((Math.pow(d2, 0.44999998807907104d) - 0.15000000596046448d) * 3.141592653589793d * 3.0d) * Utilities.l((float) Math.pow(d2, 0.20000000298023224d)))) * (-6.0f));
                float R13 = hl.R1(0.4f, f11, R12);
                canvas2.scale(R13, R13);
                canvas2.translate((-L2) / f10, (-L3) / f10);
                float f14 = L3 / f10;
                canvas2.drawRoundRect(0.0f, 0.0f, L2, L3, f14, f14, paint);
                imageReceiver.h(canvas2, null);
                Canvas canvas3 = canvas2;
                av7Var.g.c(hl.L(18.0f), f14, R12, -1, canvas3);
                canvas2 = canvas3;
                canvas2.restore();
                if (b29Var2 != null) {
                    canvas2.save();
                    canvas2.translate(hl.L(4.0f) * f12, 0.0f);
                    canvas2.rotate(f13);
                    canvas2.translate(0.0f, (-hl.L(200.0f)) * ((float) Math.pow(d2, 0.800000011920929d)));
                    canvas2.translate(sin * hl.L(5.0f) * ((float) Math.pow(d2, 0.5d)), 0.0f);
                    int L4 = hl.L(f8);
                    int i6 = (-L4) / 2;
                    int i7 = L4 / 2;
                    b29Var2.setBounds(i6, hl.L(8.0f) + i6, i7, hl.L(8.0f) + i7);
                    b29Var2.draw(canvas2);
                    canvas2.restore();
                }
                if (e < 1.0f && d < 1.0f) {
                    i = i5;
                } else {
                    ((av7) arrayList2.get(i5)).f.K();
                    arrayList2.remove(i5);
                    i = i5 - 1;
                }
                i3 = i + 1;
                bv7Var = this;
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
