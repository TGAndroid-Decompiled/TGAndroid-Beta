package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
public final class g81 extends FrameLayout {
    public static final int E = 0;
    public final ema a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int h;
    public SparseArray n;
    public SparseArray r;
    public final kj4 s;
    public final SparseArray w;
    public final SparseArray x;
    public final j81 y;

    public g81(j81 j81Var, Context context) {
        super(context);
        this.y = j81Var;
        this.n = new SparseArray();
        this.r = new SparseArray();
        this.w = new SparseArray();
        this.x = new SparseArray();
        setWillNotDraw(false);
        ema emaVar = new ema(context);
        this.a = emaVar;
        if (j81Var.f0 == 0 && j81Var.e0) {
            emaVar.setOnLongClickListener(new zs(this, (byte) 1));
            emaVar.setOnClickListener(new h6(this, (byte) 2));
        }
        int i = aob.i6;
        hf0 f0 = aob.f0(aob.w0(null, i, false), 2, -1);
        uob M = yob.M(i);
        emaVar.setBackground(f0);
        yob.j(emaVar, f0, null, M, null);
        emaVar.setTextSize(15);
        emaVar.setTypeface(hl.o());
        emaVar.setGravity(17);
        yob.W(emaVar, aob.G6, null);
        addView(emaVar, tre.d(-1, 28.0f, 0, 0.0f, 12.0f, 0.0f, 4.0f));
        kj4 kj4Var = new kj4(context, new e81(this, context));
        this.s = kj4Var;
        ((GestureDetector) kj4Var.b).setIsLongpressEnabled(j81Var.f0 == 0);
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
        i81 i81Var = (i81) sparseArray2.get(i);
        float f6 = 0.0f;
        if (i81Var != null) {
            float f7 = i81Var.a;
            f2 = i81Var.b;
            f3 = i81Var.c;
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
            duration.setInterpolator(dt3.e);
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
                    float A = qd4.A(f14, f15, floatValue, f15);
                    i81 i81Var2 = obj;
                    i81Var2.a = A;
                    float f16 = f5;
                    float f17 = f12;
                    i81Var2.b = qd4.A(f16, f17, floatValue, f17);
                    float f18 = f13;
                    float f19 = f3;
                    i81Var2.c = qd4.A(f18, f19, floatValue, f19);
                    g81.this.invalidate();
                }
            });
            duration.addListener(new f81(this, obj, f10, f5, f13, i, z));
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
                h81 h81Var = (h81) this.n.get(i, null);
                if (h81Var != null) {
                    float f2 = h81Var.m;
                    h81Var.l = qd4.A(h81Var.n, f2, f, f2);
                    float f3 = h81Var.j;
                    h81Var.i = qd4.A(h81Var.k, f3, f, f3);
                }
            }
        }
        invalidate();
    }

    public final void c(int i, int i2) {
        float f;
        if (this.n != null) {
            for (int i3 = 0; i3 < this.d; i3++) {
                h81 h81Var = (h81) this.n.get(i3, null);
                if (h81Var != null) {
                    h81Var.m = h81Var.l;
                    int i4 = h81Var.h;
                    if (i4 >= i && i4 <= i2) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    h81Var.n = f;
                    h81Var.j = h81Var.i;
                    if (i4 != i && i4 != i2) {
                        h81Var.k = 0.0f;
                    } else {
                        h81Var.k = 1.0f;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g81.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L((this.f * 52) + 44), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return ((GestureDetector) this.s.b).onTouchEvent(motionEvent);
    }
}
