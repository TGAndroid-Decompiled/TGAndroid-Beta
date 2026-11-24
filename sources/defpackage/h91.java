package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class h91 extends FrameLayout {
    public static final int E = 0;
    public final lka a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public SparseArray n;
    public SparseArray r;
    public final lj4 s;
    public final SparseArray w;
    public final SparseArray x;
    public final k91 y;

    public h91(k91 k91Var, Context context) {
        super(context);
        this.y = k91Var;
        this.n = new SparseArray();
        this.r = new SparseArray();
        this.w = new SparseArray();
        this.x = new SparseArray();
        setWillNotDraw(false);
        lka lkaVar = new lka(context);
        this.a = lkaVar;
        if (k91Var.f0 == 0 && k91Var.e0) {
            lkaVar.setOnLongClickListener(new au(this, (byte) 1));
            lkaVar.setOnClickListener(new g6(this, (byte) 2));
        }
        int i = cmb.h6;
        fg0 f0 = cmb.f0(cmb.w0(null, i, false), 2, -1);
        wmb M = anb.M(i);
        lkaVar.setBackground(f0);
        anb.j(lkaVar, f0, null, M, null);
        lkaVar.setTextSize(15);
        lkaVar.setTypeface(gm.o());
        lkaVar.setGravity(17);
        anb.W(lkaVar, cmb.F6, null);
        addView(lkaVar, qoe.d(-1, 28.0f, 0, 0.0f, 12.0f, 0.0f, 4.0f));
        lj4 lj4Var = new lj4(context, new f91(this, context));
        this.s = lj4Var;
        ((GestureDetector) lj4Var.a).setIsLongpressEnabled(k91Var.f0 == 0);
    }

    public final void a(int i, int i2, int i3, boolean z, boolean z2) {
        float f;
        float f2;
        final float f3;
        float f4;
        final float f5;
        SparseArray sparseArray = this.w;
        ValueAnimator valueAnimator = (ValueAnimator) sparseArray.get(i);
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float measuredWidth = getMeasuredWidth() / 7.0f;
        SparseArray sparseArray2 = this.x;
        j91 j91Var = (j91) sparseArray2.get(i);
        float f6 = 0.0f;
        if (j91Var != null) {
            float f7 = j91Var.a;
            f2 = j91Var.b;
            f3 = j91Var.c;
            f = f7;
        } else {
            f = (measuredWidth / 2.0f) + (i2 * measuredWidth);
            f2 = f;
            f3 = 0.0f;
        }
        if (z) {
            float f8 = measuredWidth / 2.0f;
            f4 = (i2 * measuredWidth) + f8;
            float f9 = (measuredWidth * i3) + f8;
            f6 = 1.0f;
            f5 = f9;
        } else {
            f4 = f;
            f5 = f2;
        }
        final ?? obj = new Object();
        obj.a = f;
        obj.b = f2;
        sparseArray2.put(i, obj);
        if (z2) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            duration.setInterpolator(vt3.e);
            final float f10 = f4;
            final float f11 = f;
            final float f12 = f2;
            final float f13 = f6;
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f14 = f10;
                    float f15 = f11;
                    float A = td4.A(f14, f15, floatValue, f15);
                    j91 j91Var2 = obj;
                    j91Var2.a = A;
                    float f16 = f5;
                    float f17 = f12;
                    j91Var2.b = td4.A(f16, f17, floatValue, f17);
                    float f18 = f13;
                    float f19 = f3;
                    j91Var2.c = td4.A(f18, f19, floatValue, f19);
                    h91.this.invalidate();
                }
            });
            duration.addListener(new g91(this, obj, f10, f5, f13, i, z));
            duration.start();
            sparseArray.put(i, duration);
            return;
        }
        obj.a = f4;
        obj.b = f5;
        obj.c = f6;
        invalidate();
    }

    public final void b(float f) {
        if (this.n != null) {
            for (int i = 0; i < this.d; i++) {
                i91 i91Var = (i91) this.n.get(i, null);
                if (i91Var != null) {
                    float f2 = i91Var.m;
                    i91Var.l = td4.A(i91Var.n, f2, f, f2);
                    float f3 = i91Var.j;
                    i91Var.i = td4.A(i91Var.k, f3, f, f3);
                }
            }
        }
        invalidate();
    }

    public final void c(int i, int i2) {
        float f;
        if (this.n != null) {
            for (int i3 = 0; i3 < this.d; i3++) {
                i91 i91Var = (i91) this.n.get(i3, null);
                if (i91Var != null) {
                    i91Var.m = i91Var.l;
                    int i4 = i91Var.h;
                    if (i4 >= i && i4 <= i2) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    i91Var.n = f;
                    i91Var.j = i91Var.i;
                    if (i4 != i && i4 != i2) {
                        i91Var.k = 0.0f;
                    } else {
                        i91Var.k = 1.0f;
                    }
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.r != null) {
            for (int i = 0; i < this.r.size(); i++) {
                ((ImageReceiver) this.r.valueAt(i)).I();
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.r != null) {
            for (int i = 0; i < this.r.size(); i++) {
                ((ImageReceiver) this.r.valueAt(i)).K();
            }
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r36) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h91.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L((this.f * 52) + 44), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.s.a).onTouchEvent(motionEvent);
    }
}
