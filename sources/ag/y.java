package ag;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.x3;
import org.telegram.ui.Components.jr;
public final class y extends View {
    public final Paint f715a;
    public final int[] f716b;
    public final Paint f717c;
    public final LongSparseArray d;
    public long f718e;
    public final Path f719f;
    public final float[] h;
    public final HashMap f720n;
    public final f0 f721r;

    public y(f0 f0Var, Context context) {
        super(context);
        int d;
        this.f721r = f0Var;
        this.f715a = new Paint(1);
        this.f716b = new int[]{-16735784, -16752387, -11788361, -6804548, -4707235, -180718, -38656, -152832, -211200, -198077, -2495689, -8996289};
        Paint paint = new Paint(1);
        this.f717c = paint;
        this.d = new LongSparseArray();
        this.f718e = Long.MIN_VALUE;
        this.f719f = new Path();
        this.h = new float[8];
        this.f720n = new HashMap();
        setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f));
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        for (int i10 = 0; i10 < 12; i10++) {
            for (int i11 = 0; i11 < 10; i11++) {
                if (i11 == 0) {
                    this.f720n.put(Long.valueOf((i10 << 16) + i11), Integer.valueOf(i0.a.d(i10 / 11.0f, -1, -16777216)));
                } else {
                    if (i11 < 6) {
                        d = i0.a.d(((5 - i11) / 4.0f) * 0.5f, this.f716b[i10], -16777216);
                    } else {
                        d = i0.a.d(x3.A(9 - i11, 5.0f, 0.5f, 0.5f), this.f716b[i10], -1);
                    }
                    this.f720n.put(Long.valueOf((i10 << 16) + i11), Integer.valueOf(d));
                }
            }
        }
    }

    public final void a(int i10) {
        for (Map.Entry entry : this.f720n.entrySet()) {
            if (((Integer) entry.getValue()).intValue() == i10) {
                long longValue = ((Long) entry.getKey()).longValue();
                int i11 = (int) (longValue >> 16);
                b(i11, (int) (longValue - (i11 << 16)));
                return;
            }
        }
        this.f718e = Long.MIN_VALUE;
        invalidate();
    }

    public final void b(int i10, int i11) {
        long j10 = (i10 << 16) + i11;
        this.f718e = j10;
        LongSparseArray longSparseArray = this.d;
        if (longSparseArray.get(j10) == null) {
            longSparseArray.put(this.f718e, Float.valueOf(0.0f));
        }
        invalidate();
    }

    public final void c(MotionEvent motionEvent) {
        int x4 = (int) ((motionEvent.getX() - getPaddingLeft()) / (((getWidth() - getPaddingLeft()) - getPaddingRight()) / 12));
        int y8 = (int) (motionEvent.getY() / (((getHeight() - getPaddingTop()) - getPaddingBottom()) / 10));
        Integer num = (Integer) this.f720n.get(Long.valueOf((x4 << 16) + y8));
        if (num != null) {
            int intValue = num.intValue();
            int i10 = f0.f462s;
            this.f721r.m(intValue, 3);
            b(x4, y8);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        HashMap hashMap;
        float max;
        float f9;
        float f10;
        float f11;
        float f12;
        int i10;
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        canvas.save();
        Path path = this.f721r.f465e;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
        canvas.clipPath(path);
        float width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) / 12.0f;
        float height = ((getHeight() - getPaddingTop()) - getPaddingBottom()) / 10.0f;
        int i11 = 0;
        while (true) {
            hashMap = this.f720n;
            if (i11 >= 12) {
                break;
            }
            for (int i12 = 0; i12 < 10; i12++) {
                Integer num = (Integer) hashMap.get(Long.valueOf((i11 << 16) + i12));
                if (num != null) {
                    int intValue = num.intValue();
                    Paint paint = this.f715a;
                    paint.setColor(intValue);
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set((i11 * width) + getPaddingLeft(), (i12 * height) + getPaddingTop(), ((i11 + 1) * width) + getPaddingLeft(), ((i12 + 1) * height) + getPaddingTop());
                    canvas.drawRect(rectF2, paint);
                }
            }
            i11++;
        }
        canvas.restore();
        int i13 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.d;
            if (i13 < longSparseArray.size()) {
                long keyAt = longSparseArray.keyAt(i13);
                float floatValue = ((Float) longSparseArray.valueAt(i13)).floatValue();
                if (this.f718e == keyAt) {
                    max = Math.min(1.0f, floatValue + 0.045714285f);
                } else {
                    max = Math.max(0.0f, floatValue - 0.10666667f);
                }
                int i14 = (int) (keyAt >> 16);
                int i15 = (int) (keyAt - (i14 << 16));
                Integer num2 = (Integer) hashMap.get(Long.valueOf(keyAt));
                Paint paint2 = this.f717c;
                if (num2 != null) {
                    if (AndroidUtilities.computePerceivedBrightness(num2.intValue()) > 0.721f) {
                        i10 = -15658735;
                    } else {
                        i10 = -1;
                    }
                    paint2.setColor(i10);
                }
                paint2.setStrokeWidth(jr.h.getInterpolation(max) * AndroidUtilities.dp(3.0f));
                Path path2 = this.f719f;
                path2.rewind();
                RectF rectF3 = AndroidUtilities.rectTmp;
                float f13 = width;
                float f14 = height;
                HashMap hashMap2 = hashMap;
                rectF3.set((i14 * f13) + getPaddingLeft(), (i15 * f14) + getPaddingTop(), ((i14 + 1) * f13) + getPaddingLeft(), ((i15 + 1) * f14) + getPaddingTop());
                if (i14 == 0 && i15 == 0) {
                    f9 = AndroidUtilities.dp(10.0f);
                } else {
                    f9 = 0.0f;
                }
                float[] fArr = this.h;
                fArr[1] = f9;
                fArr[0] = f9;
                if (i14 == 11 && i15 == 0) {
                    f10 = AndroidUtilities.dp(10.0f);
                } else {
                    f10 = 0.0f;
                }
                fArr[3] = f10;
                fArr[2] = f10;
                if (i14 == 11 && i15 == 9) {
                    f11 = AndroidUtilities.dp(10.0f);
                } else {
                    f11 = 0.0f;
                }
                fArr[5] = f11;
                fArr[4] = f11;
                if (i14 == 0 && i15 == 9) {
                    f12 = AndroidUtilities.dp(10.0f);
                } else {
                    f12 = 0.0f;
                }
                fArr[7] = f12;
                fArr[6] = f12;
                path2.addRoundRect(rectF3, fArr, Path.Direction.CW);
                canvas.drawPath(path2, paint2);
                if (max <= 0.0f && this.f718e != keyAt) {
                    longSparseArray.removeAt(i13);
                    i13--;
                    invalidate();
                } else {
                    if (max < 1.0f) {
                        invalidate();
                    }
                    longSparseArray.setValueAt(i13, Float.valueOf(max));
                }
                i13++;
                width = f13;
                height = f14;
                hashMap = hashMap2;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r4) {
        throw new UnsupportedOperationException("Method not decompiled: ag.y.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
