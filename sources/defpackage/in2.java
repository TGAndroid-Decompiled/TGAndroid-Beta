package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
public final class in2 extends View {
    public final Paint a;
    public final int[] b;
    public final Paint c;
    public final LongSparseArray d;
    public long e;
    public final Path f;
    public final float[] h;
    public final HashMap n;
    public final ln2 r;

    public in2(ln2 ln2Var, Context context) {
        super(context);
        int f;
        this.r = ln2Var;
        this.a = new Paint(1);
        this.b = new int[]{-16735784, -16752387, -11788361, -6804548, -4707235, -180718, -38656, -152832, -211200, -198077, -2495689, -8996289};
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new LongSparseArray();
        this.e = Long.MIN_VALUE;
        this.f = new Path();
        this.h = new float[8];
        this.n = new HashMap();
        setPadding(gm.L(14.0f), gm.L(3.0f), gm.L(14.0f), gm.L(3.0f));
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        for (int i = 0; i < 12; i++) {
            for (int i2 = 0; i2 < 10; i2++) {
                if (i2 == 0) {
                    this.n.put(Long.valueOf((i << 16) + i2), Integer.valueOf(on2.f(i / 11.0f, -1, -16777216)));
                } else {
                    int[] iArr = this.b;
                    if (i2 < 6) {
                        f = on2.f(((5 - i2) / 4.0f) * 0.5f, iArr[i], -16777216);
                    } else {
                        f = on2.f(hg9.x(9 - i2, 5.0f, 0.5f, 0.5f), iArr[i], -1);
                    }
                    this.n.put(Long.valueOf((i << 16) + i2), Integer.valueOf(f));
                }
            }
        }
    }

    public final void a(int i) {
        for (Map.Entry entry : this.n.entrySet()) {
            if (((Integer) entry.getValue()).intValue() == i) {
                long longValue = ((Long) entry.getKey()).longValue();
                int i2 = (int) (longValue >> 16);
                b(i2, (int) (longValue - (i2 << 16)));
                return;
            }
        }
        this.e = Long.MIN_VALUE;
        invalidate();
    }

    public final void b(int i, int i2) {
        long j = (i << 16) + i2;
        this.e = j;
        LongSparseArray longSparseArray = this.d;
        if (longSparseArray.get(j) == null) {
            longSparseArray.put(this.e, Float.valueOf(0.0f));
        }
        invalidate();
    }

    public final void c(MotionEvent motionEvent) {
        int x = (int) ((motionEvent.getX() - getPaddingLeft()) / (((getWidth() - getPaddingLeft()) - getPaddingRight()) / 12));
        int y = (int) (motionEvent.getY() / (((getHeight() - getPaddingTop()) - getPaddingBottom()) / 10));
        Integer num = (Integer) this.n.get(Long.valueOf((x << 16) + y));
        if (num != null) {
            int intValue = num.intValue();
            int i = ln2.t1;
            this.r.D0(intValue, 3);
            b(x, y);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        HashMap hashMap;
        float max;
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        super.onDraw(canvas);
        RectF rectF = gm.P;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        canvas.save();
        Path path = this.r.o1;
        path.rewind();
        float f5 = 10.0f;
        path.addRoundRect(rectF, gm.L(10.0f), gm.L(10.0f), Path.Direction.CW);
        canvas.clipPath(path);
        float width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) / 12.0f;
        float height = ((getHeight() - getPaddingTop()) - getPaddingBottom()) / 10.0f;
        int i2 = 0;
        while (true) {
            hashMap = this.n;
            if (i2 >= 12) {
                break;
            }
            for (int i3 = 0; i3 < 10; i3++) {
                Integer num = (Integer) hashMap.get(Long.valueOf((i2 << 16) + i3));
                if (num != null) {
                    int intValue = num.intValue();
                    Paint paint = this.a;
                    paint.setColor(intValue);
                    RectF rectF2 = gm.P;
                    rectF2.set((i2 * width) + getPaddingLeft(), (i3 * height) + getPaddingTop(), ((i2 + 1) * width) + getPaddingLeft(), ((i3 + 1) * height) + getPaddingTop());
                    canvas.drawRect(rectF2, paint);
                }
            }
            i2++;
        }
        canvas.restore();
        int i4 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.d;
            if (i4 < longSparseArray.size()) {
                long keyAt = longSparseArray.keyAt(i4);
                float floatValue = ((Float) longSparseArray.valueAt(i4)).floatValue();
                if (this.e == keyAt) {
                    max = Math.min(1.0f, floatValue + 0.045714285f);
                } else {
                    max = Math.max(0.0f, floatValue - 0.10666667f);
                }
                float f6 = f5;
                int i5 = (int) (keyAt >> 16);
                int i6 = (int) (keyAt - (i5 << 16));
                Integer num2 = (Integer) hashMap.get(Long.valueOf(keyAt));
                Paint paint2 = this.c;
                if (num2 != null) {
                    if (gm.B(num2.intValue()) > 0.721f) {
                        i = -15658735;
                    } else {
                        i = -1;
                    }
                    paint2.setColor(i);
                }
                paint2.setStrokeWidth(d53.h.getInterpolation(max) * gm.L(3.0f));
                Path path2 = this.f;
                path2.rewind();
                RectF rectF3 = gm.P;
                float f7 = width;
                float f8 = height;
                HashMap hashMap2 = hashMap;
                rectF3.set((i5 * f7) + getPaddingLeft(), (i6 * f8) + getPaddingTop(), ((i5 + 1) * f7) + getPaddingLeft(), ((i6 + 1) * f8) + getPaddingTop());
                if (i5 == 0 && i6 == 0) {
                    f = gm.L(f6);
                } else {
                    f = 0.0f;
                }
                float[] fArr = this.h;
                fArr[1] = f;
                fArr[0] = f;
                if (i5 == 11 && i6 == 0) {
                    f2 = gm.L(f6);
                } else {
                    f2 = 0.0f;
                }
                fArr[3] = f2;
                fArr[2] = f2;
                if (i5 == 11 && i6 == 9) {
                    f3 = gm.L(f6);
                } else {
                    f3 = 0.0f;
                }
                fArr[5] = f3;
                fArr[4] = f3;
                if (i5 == 0 && i6 == 9) {
                    f4 = gm.L(f6);
                } else {
                    f4 = 0.0f;
                }
                fArr[7] = f4;
                fArr[6] = f4;
                path2.addRoundRect(rectF3, fArr, Path.Direction.CW);
                canvas.drawPath(path2, paint2);
                if (max <= 0.0f && this.e != keyAt) {
                    longSparseArray.removeAt(i4);
                    i4--;
                    invalidate();
                } else {
                    if (max < 1.0f) {
                        invalidate();
                    }
                    longSparseArray.setValueAt(i4, Float.valueOf(max));
                }
                i4++;
                f5 = f6;
                width = f7;
                height = f8;
                hashMap = hashMap2;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r4) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in2.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
