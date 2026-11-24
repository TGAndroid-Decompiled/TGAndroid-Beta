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
import android.view.View;
import java.util.ArrayList;
public final class tec extends View {
    public static final Object U = new Object();
    public int E;
    public int F;
    public int G;
    public float H;
    public float I;
    public boolean J;
    public Rect K;
    public Rect L;
    public int M;
    public Bitmap N;
    public final ArrayList O;
    public boolean P;
    public rec Q;
    public Path R;
    public final Paint S;
    public boolean T;
    public long a;
    public float b;
    public float c;
    public final Paint d;
    public final Paint e;
    public boolean f;
    public boolean h;
    public float n;
    public MediaMetadataRetriever r;
    public sec s;
    public final ArrayList w;
    public qec x;
    public long y;

    public tec(Context context) {
        super(context);
        this.c = 1.0f;
        Paint paint = new Paint();
        this.d = paint;
        Paint paint2 = new Paint();
        this.e = paint2;
        this.w = new ArrayList();
        this.H = 1.0f;
        this.I = 0.0f;
        this.O = new ArrayList();
        Paint paint3 = new Paint(1);
        this.S = paint3;
        paint.setColor(2130706432);
        paint3.setColor(-1);
        paint3.setStrokeWidth(gm.N(2.0f));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(cmb.w0(null, cmb.Z6, false));
        this.M = 0;
        rec recVar = this.Q;
        if (recVar != null) {
            recVar.b();
        }
    }

    public final void a(boolean z) {
        synchronized (U) {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = this.r;
                if (mediaMetadataRetriever != null) {
                    mediaMetadataRetriever.release();
                    this.r = null;
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        if (z) {
            int i = 0;
            if (!this.O.isEmpty()) {
                while (i < this.O.size()) {
                    Bitmap bitmap = (Bitmap) this.O.get(i);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    i++;
                }
            } else {
                while (i < this.w.size()) {
                    Bitmap bitmap2 = (Bitmap) this.w.get(i);
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    i++;
                }
            }
        }
        this.O.clear();
        this.w.clear();
        qec qecVar = this.x;
        if (qecVar != null) {
            qecVar.cancel(true);
            this.x = null;
        }
    }

    public final void b(int i) {
        if (this.r != null) {
            if (i == 0) {
                if (this.J) {
                    int L = gm.L(56.0f);
                    this.E = L;
                    this.F = L;
                    this.G = Math.max(1, (int) Math.ceil((getMeasuredWidth() - gm.L(16.0f)) / (this.F / 2.0f)));
                } else {
                    this.F = gm.L(40.0f);
                    this.G = Math.max(1, (getMeasuredWidth() - gm.L(16.0f)) / this.F);
                    this.E = (int) Math.ceil((getMeasuredWidth() - gm.L(16.0f)) / this.G);
                }
                this.y = this.a / this.G;
                ArrayList arrayList = this.O;
                if (!arrayList.isEmpty()) {
                    float size = arrayList.size() / this.G;
                    float f = 0.0f;
                    for (int i2 = 0; i2 < this.G; i2++) {
                        this.w.add((Bitmap) arrayList.get((int) f));
                        f += size;
                    }
                    return;
                }
            }
            this.P = false;
            qec qecVar = new qec(this);
            this.x = qecVar;
            qecVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Integer.valueOf(i), null, null);
        }
    }

    public float getLeftProgress() {
        return this.b;
    }

    public float getRightProgress() {
        return this.c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        if (this.T) {
            canvas.save();
            Path path = this.R;
            if (path != null) {
                canvas.clipPath(path);
            }
        }
        float measuredWidth = getMeasuredWidth() - gm.L(24.0f);
        int L = gm.L(12.0f) + ((int) (this.b * measuredWidth));
        int L2 = gm.L(12.0f) + ((int) (measuredWidth * this.c));
        float f = 32.0f;
        int measuredHeight = (getMeasuredHeight() - gm.L(32.0f)) >> 1;
        ArrayList arrayList = this.w;
        if (arrayList.isEmpty() && this.x == null) {
            b(0);
        }
        if (!arrayList.isEmpty()) {
            if (!this.P) {
                canvas.drawRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight() - measuredHeight, this.e);
            }
            int i2 = 0;
            int i3 = 0;
            while (i2 < arrayList.size()) {
                Bitmap bitmap = (Bitmap) arrayList.get(i2);
                if (bitmap != null && !bitmap.isRecycled()) {
                    boolean z = this.J;
                    int i4 = this.E;
                    if (z) {
                        i4 /= 2;
                    }
                    int i5 = i4 * i3;
                    if (z) {
                        this.L.set(i5, measuredHeight, gm.L(28.0f) + i5, gm.L(f) + measuredHeight);
                        canvas.drawBitmap(bitmap, this.K, this.L, (Paint) null);
                    } else {
                        canvas.drawBitmap(bitmap, i5, measuredHeight, (Paint) null);
                    }
                }
                i3++;
                i2++;
                f = 32.0f;
            }
            float f2 = measuredHeight;
            Paint paint = this.d;
            canvas.drawRect(0.0f, f2, L, getMeasuredHeight() - measuredHeight, paint);
            canvas.drawRect(L2, f2, getMeasuredWidth(), getMeasuredHeight() - measuredHeight, paint);
            Paint paint2 = this.S;
            canvas.drawLine(L - gm.L(4.0f), gm.L(10.0f) + measuredHeight, L - gm.L(4.0f), kt6.y(10.0f, getMeasuredHeight(), measuredHeight), paint2);
            canvas.drawLine(gm.L(4.0f) + L2, gm.L(10.0f) + measuredHeight, gm.L(4.0f) + L2, kt6.y(10.0f, getMeasuredHeight(), measuredHeight), paint2);
            if (this.T) {
                canvas.restore();
                return;
            }
            int measuredHeight2 = getMeasuredHeight() - (measuredHeight << 1);
            int measuredWidth2 = getMeasuredWidth();
            if (gm.L(6.0f) != this.M) {
                this.M = gm.L(6.0f);
                this.N = Bitmap.createBitmap(gm.L(6.0f), gm.L(6.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(this.N);
                Paint paint3 = new Paint(1);
                paint3.setColor(0);
                paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas2.drawColor(cmb.w0(null, cmb.Ie, false));
                float f3 = this.M;
                canvas2.drawCircle(f3, f3, f3, paint3);
            }
            int i6 = this.M >> 1;
            canvas.save();
            canvas.drawBitmap(this.N, 0.0f, f2, (Paint) null);
            float f4 = (measuredHeight2 + measuredHeight) - i6;
            canvas.rotate(-90.0f, i6, f4);
            canvas.drawBitmap(this.N, 0.0f, i - this.M, (Paint) null);
            canvas.restore();
            canvas.save();
            float f5 = measuredWidth2 - i6;
            canvas.rotate(180.0f, f5, f4);
            Bitmap bitmap2 = this.N;
            int i7 = this.M;
            canvas.drawBitmap(bitmap2, measuredWidth2 - i7, i - i7, (Paint) null);
            canvas.restore();
            canvas.save();
            canvas.rotate(90.0f, f5, measuredHeight + i6);
            canvas.drawBitmap(this.N, measuredWidth2 - this.M, f2, (Paint) null);
            canvas.restore();
        } else if (this.T) {
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.T) {
            Path path = this.R;
            if (path == null) {
                path = new Path();
                this.R = path;
            }
            path.rewind();
            int measuredHeight = (getMeasuredHeight() - gm.L(32.0f)) >> 1;
            RectF rectF = gm.P;
            rectF.set(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight() - measuredHeight);
            this.R.addRoundRect(rectF, gm.L(7.0f), gm.L(7.0f), Path.Direction.CCW);
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tec.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(sec secVar) {
        this.s = secVar;
    }

    public void setKeyframes(ArrayList<Bitmap> arrayList) {
        ArrayList arrayList2 = this.O;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }

    public void setMaxProgressDiff(float f) {
        this.H = f;
        float f2 = this.c;
        float f3 = this.b;
        if (f2 - f3 > f) {
            this.c = f3 + f;
            invalidate();
        }
    }

    public void setMinProgressDiff(float f) {
        this.I = f;
    }

    public void setRoundFrames(boolean z) {
        this.J = z;
        if (z) {
            this.K = new Rect(gm.L(14.0f), gm.L(14.0f), gm.L(42.0f), gm.L(42.0f));
            this.L = new Rect();
        }
    }

    public void setTimeHintView(rec recVar) {
        this.Q = recVar;
    }

    public void setVideoPath(String str) {
        a(false);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        this.r = mediaMetadataRetriever;
        this.b = 0.0f;
        this.c = 1.0f;
        try {
            mediaMetadataRetriever.setDataSource(str);
            this.a = Long.parseLong(this.r.extractMetadata(9));
        } catch (Exception e) {
            fc4.g(e, true);
        }
        invalidate();
    }
}
