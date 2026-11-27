package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public abstract class mgc extends View {
    public static final Object g0 = new Object();
    public MediaMetadataRetriever E;
    public lgc F;
    public final ArrayList G;
    public jgc H;
    public long I;
    public int J;
    public int K;
    public int L;
    public float M;
    public float N;
    public final RectF O;
    public int P;
    public int Q;
    public final Paint R;
    public final ArrayList S;
    public final Rect T;
    public final Paint U;
    public final Paint V;
    public final Paint W;
    public long a;
    public final Paint a0;
    public int b;
    public final Paint b0;
    public int c;
    public final Paint c0;
    public float d;
    public final mm d0;
    public float e;
    public final Path e0;
    public float f;
    public boolean f0;
    public boolean h;
    public boolean n;
    public boolean r;
    public float s;
    public float w;
    public boolean x;
    public ParcelFileDescriptor y;

    public mgc(Context context) {
        super(context);
        this.e = 1.0f;
        this.s = 0.5f;
        this.G = new ArrayList();
        this.M = 1.0f;
        this.N = 0.0f;
        this.O = new RectF();
        this.Q = 0;
        this.R = new Paint(3);
        ArrayList arrayList = new ArrayList();
        this.S = arrayList;
        Rect rect = new Rect();
        this.T = rect;
        Paint paint = new Paint(1);
        this.U = paint;
        Paint paint2 = new Paint(1);
        this.V = paint2;
        Paint paint3 = new Paint(1);
        this.W = paint3;
        Paint paint4 = new Paint(1);
        this.a0 = paint4;
        Paint paint5 = new Paint(1);
        this.b0 = paint5;
        Paint paint6 = new Paint(1);
        this.c0 = paint6;
        this.d0 = new mm(0.0f, this, 0L, 200L, k43.j);
        this.e0 = new Path();
        paint.setColor(-1);
        paint2.setColor(-256);
        paint3.setColor(637534208);
        paint4.setColor(1291845632);
        paint5.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint6.setColor(-16777216);
        arrayList.add(rect);
    }

    public final void a() {
        ArrayList arrayList;
        Bitmap bitmap;
        synchronized (g0) {
            try {
                ParcelFileDescriptor parcelFileDescriptor = this.y;
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                    this.y = null;
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
            try {
                MediaMetadataRetriever mediaMetadataRetriever = this.E;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    this.E = null;
                }
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
        }
        int i = 0;
        while (true) {
            int size = this.G.size();
            arrayList = this.G;
            if (i >= size) {
                break;
            }
            kgc kgcVar = (kgc) arrayList.get(i);
            if (kgcVar != null && (bitmap = kgcVar.a) != null) {
                bitmap.recycle();
            }
            i++;
        }
        arrayList.clear();
        jgc jgcVar = this.H;
        if (jgcVar != null) {
            jgcVar.cancel(true);
            this.H = null;
        }
    }

    public abstract void b(Canvas canvas, RectF rectF);

    public final void c(float f, float f2, Canvas canvas, Paint paint) {
        float N = hl.N(12.0f);
        float L = hl.L(2.0f);
        float L2 = hl.L(46.0f) + L;
        float f3 = (1.0f - f2) * ((L2 - L) / 2.0f);
        float f4 = L + f3;
        float f5 = L2 - f3;
        Paint paint2 = this.W;
        paint2.setAlpha((int) (38.0f * f2));
        paint.setAlpha((int) (f2 * 255.0f));
        float measuredWidth = (((getMeasuredWidth() - (N * 2.0f)) - hl.L(20.0f)) * f) + N + hl.L(10.0f);
        RectF rectF = this.O;
        rectF.set(measuredWidth - hl.N(1.5f), f4, hl.N(1.5f) + measuredWidth, f5);
        rectF.inset(-hl.N(0.66f), -hl.N(0.66f));
        canvas.drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), paint2);
        rectF.set(measuredWidth - hl.N(1.5f), f4, hl.N(1.5f) + measuredWidth, f5);
        canvas.drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), paint);
    }

    public final void d(int i) {
        float f;
        int i2;
        if (this.E == null) {
            return;
        }
        if (i == 0) {
            this.K = hl.L(38.0f);
            int i3 = this.b;
            if (i3 != 0 && (i2 = this.c) != 0) {
                f = i3 / i2;
            } else {
                f = 1.0f;
            }
            this.L = Math.max(1, (int) Math.ceil((getMeasuredWidth() - hl.L(32.0f)) / (this.K * Utilities.i(f, 1.3333334f, 0.5625f))));
            this.J = (int) Math.ceil((getMeasuredWidth() - hl.L(32.0f)) / this.L);
            this.I = this.a / this.L;
        }
        jgc jgcVar = new jgc(this);
        this.H = jgcVar;
        jgcVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i), null, null);
    }

    public float getLeftProgress() {
        return this.d;
    }

    public long getLength() {
        return Math.max(1L, this.a);
    }

    public float getProgress() {
        return this.s;
    }

    public float getRightProgress() {
        return this.e;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        boolean z;
        float f4;
        float f5;
        float f6;
        Canvas canvas2;
        float N = hl.N(12.0f);
        float measuredWidth = getMeasuredWidth() - (N * 2.0f);
        float L = hl.L(10.0f) + N + ((int) ((measuredWidth - hl.L(20.0f)) * this.d));
        float L2 = hl.L(10.0f) + N + ((int) ((measuredWidth - hl.L(20.0f)) * this.e));
        float L3 = hl.L(6.0f);
        float L4 = L3 + hl.L(38.0f);
        ArrayList arrayList = this.G;
        boolean isEmpty = arrayList.isEmpty();
        Path path = this.e0;
        if (isEmpty && this.H == null) {
            RectF rectF = hl.P;
            rectF.set(N, L3, measuredWidth + N, L4);
            canvas.save();
            path.rewind();
            path.addRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), Path.Direction.CW);
            canvas.clipPath(path);
            b(canvas, rectF);
            canvas.restore();
            d(0);
            f = 2.0f;
            f2 = 10.0f;
            f3 = 6.0f;
            f4 = L;
            f6 = L3;
            f5 = L2;
        } else {
            canvas.save();
            path.rewind();
            RectF rectF2 = hl.P;
            float f7 = measuredWidth + N;
            rectF2.set(N, L3, f7, L4);
            f = 2.0f;
            f2 = 10.0f;
            f3 = 6.0f;
            path.addRoundRect(rectF2, hl.L(6.0f), hl.L(6.0f), Path.Direction.CW);
            canvas.clipPath(path);
            if (arrayList.size() < this.L) {
                z = true;
            } else {
                z = false;
            }
            this.f0 = z;
            if (!z) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    } else if (((kgc) arrayList.get(i)).a == null) {
                        this.f0 = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (this.f0) {
                RectF rectF3 = hl.P;
                rectF3.set(N, L3, hl.L(4.0f) + f7, L4);
                b(canvas, rectF3);
            }
            int i2 = 0;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                kgc kgcVar = (kgc) arrayList.get(i3);
                Bitmap bitmap = kgcVar.a;
                if (bitmap != null) {
                    float f8 = (this.J * i2) + N;
                    float L5 = hl.L(6.0f);
                    float f9 = kgcVar.b;
                    if (f9 != 1.0f) {
                        float f10 = f9 + 0.045714285f;
                        kgcVar.b = f10;
                        if (f10 > 1.0f) {
                            kgcVar.b = 1.0f;
                        } else {
                            invalidate();
                        }
                        Paint paint = this.R;
                        paint.setAlpha((int) (k43.h.getInterpolation(kgcVar.b) * 255.0f));
                        canvas.drawBitmap(bitmap, f8, L5, paint);
                    } else {
                        canvas.drawBitmap(bitmap, f8, L5, (Paint) null);
                    }
                }
                i2++;
            }
            float L6 = hl.L(46.0f);
            Paint paint2 = this.a0;
            canvas.drawRect(N, L3, L, L6, paint2);
            f4 = L;
            canvas.drawRect(L2, L3, f7, L4, paint2);
            f5 = L2;
            f6 = L3;
            canvas.restore();
        }
        boolean z2 = this.x;
        Paint paint3 = this.U;
        if (!z2) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            RectF rectF4 = this.O;
            rectF4.set(f4 - hl.N(f2), f6, hl.N(f2) + f5, L4);
            paint3.setAlpha(255);
            canvas2.drawRoundRect(rectF4, hl.N(f3), hl.N(f3), paint3);
            rectF4.set(f4, hl.N(f) + f6, f5, L4 - hl.N(f));
            canvas2.drawRect(rectF4, this.b0);
            canvas2.restore();
            float L7 = hl.L(f);
            float L8 = hl.L(f2);
            float N2 = f4 - ((hl.N(f2) - L7) / f);
            float f11 = (((L4 - f6) - L8) / f) + f6;
            float f12 = L8 + f11;
            rectF4.set(N2, f11, N2 - L7, f12);
            float N3 = hl.N(f3);
            float N4 = hl.N(f3);
            Paint paint4 = this.c0;
            canvas2.drawRoundRect(rectF4, N3, N4, paint4);
            float N5 = ((hl.N(f2) - L7) / f) + f5;
            rectF4.set(N5, f11, L7 + N5, f12);
            canvas2.drawRoundRect(rectF4, hl.N(f3), hl.N(f3), paint4);
        } else {
            canvas2 = canvas;
        }
        float e = this.d0.e(false, 0.0f);
        if (e > 0.0f) {
            c(this.e, e, canvas2, paint3);
        }
        c(this.s, 1.0f - e, canvas2, paint3);
        if (this.x) {
            c(this.f, 1.0f, canvas2, this.V);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT >= 29) {
            this.T.set(i, 0, i3, getMeasuredHeight());
            setSystemGestureExclusionRects(this.S);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        ArrayList arrayList;
        Bitmap bitmap;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        if (this.P != size) {
            int i3 = 0;
            while (true) {
                arrayList = this.G;
                if (i3 >= arrayList.size()) {
                    break;
                }
                kgc kgcVar = (kgc) arrayList.get(i3);
                if (kgcVar != null && (bitmap = kgcVar.a) != null) {
                    bitmap.recycle();
                }
                i3++;
            }
            arrayList.clear();
            jgc jgcVar = this.H;
            if (jgcVar != null) {
                jgcVar.cancel(true);
                this.H = null;
            }
            invalidate();
            this.P = size;
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mgc.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(lgc lgcVar) {
        this.F = lgcVar;
    }

    public void setMaxProgressDiff(float f) {
        this.M = f;
        float f2 = this.e;
        float f3 = this.d;
        if (f2 - f3 > f) {
            this.e = f3 + f;
            invalidate();
        }
    }

    public void setMinProgressDiff(float f) {
        this.N = f;
    }

    public void setMode(int i) {
        if (this.Q == i) {
            return;
        }
        this.Q = i;
        invalidate();
    }

    public void setProgress(float f) {
        float f2 = 0.0f;
        if (this.x && (f <= 0.0f || f >= 1.0f)) {
            f = this.f;
        }
        long j = this.a;
        if (j != 0) {
            f2 = 240.0f / ((float) j);
        }
        float f3 = this.s;
        if (f < f3 && f <= this.d + f2 && f3 + f2 >= this.e) {
            this.d0.e(true, 1.0f);
        }
        this.s = f;
        invalidate();
    }

    public void setRightProgress(float f) {
        this.e = f;
        lgc lgcVar = this.F;
        if (lgcVar != null) {
            ((vy0) lgcVar).b(1);
        }
        lgc lgcVar2 = this.F;
        if (lgcVar2 != null) {
            ((vy0) lgcVar2).e(this.e);
        }
        lgc lgcVar3 = this.F;
        if (lgcVar3 != null) {
            ((vy0) lgcVar3).c(1);
        }
        invalidate();
    }
}
