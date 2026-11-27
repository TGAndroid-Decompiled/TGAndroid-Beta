package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
public final class kjc {
    public final fp a;
    public final fp b;
    public fp c;
    public fp d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public final Paint j;
    public final Paint k;
    public final Paint l;
    public final ArrayList m;

    public kjc() {
        fp fpVar = new fp(80, 80);
        this.a = fpVar;
        fp fpVar2 = new fp(80, 80);
        this.b = fpVar2;
        this.f = 0;
        this.g = 0;
        Paint paint = new Paint(1);
        this.j = paint;
        Paint paint2 = new Paint(1);
        this.k = paint2;
        Paint paint3 = new Paint(1);
        this.l = paint3;
        this.m = new ArrayList();
        fpVar2.i(0.0f, 0.0f, 80.0f, 80.0f);
        fpVar.i(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(102);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) fpVar2.a).setAlpha(180);
    }

    public final void a(View view) {
        this.m.add(view);
    }

    public final Paint b() {
        if (this.i) {
            return this.k;
        }
        return (Paint) this.b.a;
    }

    public final void c() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f, float f2) {
        float f3 = this.g * 1.12f;
        fp fpVar = this.b;
        float f4 = -f;
        float f5 = -f2;
        fpVar.k(f4 - ((f3 - this.f) / 2.0f), f5 - ((f3 - this.g) / 2.0f), f3 / ((Bitmap) fpVar.c).getHeight(), this.h);
        this.d.i(f4, f5, this.f - f, this.g - f2);
    }

    public final void e(boolean z) {
        if (this.i && !z) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final kjc b;

                {
                    this.b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    byte b = r2;
                    kjc kjcVar = this.b;
                    kjcVar.getClass();
                    switch (b) {
                        case 0:
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i = (int) (35.0f * floatValue);
                            kjcVar.l.setAlpha(i);
                            kjcVar.k.setAlpha((int) (floatValue * 102.0f));
                            kjcVar.j.setAlpha(i);
                            kjcVar.c();
                            return;
                        default:
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) kjcVar.b.a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) kjcVar.a.a).setAlpha((int) (floatValue2 * 255.0f));
                            kjcVar.c();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new omb(this, (byte) 17));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final kjc b;

                {
                    this.b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    byte b = r2;
                    kjc kjcVar = this.b;
                    kjcVar.getClass();
                    switch (b) {
                        case 0:
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i = (int) (35.0f * floatValue);
                            kjcVar.l.setAlpha(i);
                            kjcVar.k.setAlpha((int) (floatValue * 102.0f));
                            kjcVar.j.setAlpha(i);
                            kjcVar.c();
                            return;
                        default:
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) kjcVar.b.a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) kjcVar.a.a).setAlpha((int) (floatValue2 * 255.0f));
                            kjcVar.c();
                            return;
                    }
                }
            });
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setStartDelay(80L);
            ofFloat2.setDuration(80L);
            ofFloat2.start();
        } else {
            this.i = z;
        }
        c();
    }
}
