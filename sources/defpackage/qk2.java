package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
public abstract class qk2 extends FrameLayout implements bs5 {
    public final int E;
    public final LinearGradient F;
    public final Matrix G;
    public final sl0 H;
    public final lk2 I;
    public final lm J;
    public final lm[] K;
    public final lm L;
    public final float[] M;
    public final float[] N;
    public Object O;
    public Object P;
    public final RectF Q;
    public final Path R;
    public Drawable S;
    public boolean T;
    public Runnable U;
    public boolean V;
    public float W;
    public final FrameLayout a;
    public float a0;
    public final f53 b;
    public float b0;
    public final cv8 c;
    public float c0;
    public CameraView d;
    public float d0;
    public Object e;
    public float e0;
    public fk2 f;
    public boolean f0;
    public boolean g0;
    public final ArrayList h;
    public pk2 h0;
    public pk2 i0;
    public lk2 j0;
    public pk2 k0;
    public boolean l0;
    public Runnable m0;
    public final ArrayList n;
    public Runnable n0;
    public boolean o0;
    public long p0;
    public boolean q0;
    public pk2 r;
    public boolean r0;
    public pk2 s;
    public kob s0;
    public zi8 t0;
    public boolean u0;
    public long v0;
    public final Paint w;
    public boolean w0;
    public final Path x;
    public final lk2 x0;
    public final float[] y;

    public qk2(Context context, sl0 sl0Var, FrameLayout frameLayout, f53 f53Var) {
        super(context);
        this.c = new cv8(new lk2(this, (byte) 1));
        this.f = new fk2(".");
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.n = new ArrayList();
        Paint paint = new Paint(1);
        this.w = paint;
        this.x = new Path();
        this.y = new float[8];
        this.I = new lk2(this, (byte) 2);
        s33 s33Var = s33.h;
        this.J = new lm(this, 0L, 320L, s33Var);
        this.K = new lm[]{new lm(this, 0L, 320L, s33Var), new lm(this, 0L, 320L, s33Var), new lm(this, 0L, 320L, s33Var), new lm(this, 0L, 320L, s33Var), new lm(this, 0L, 320L, s33Var)};
        this.L = new lm(this, 0L, 320L, s33Var);
        this.M = new float[5];
        this.N = new float[5];
        this.Q = new RectF();
        this.R = new Path();
        this.T = true;
        this.r0 = true;
        this.u0 = true;
        this.x0 = new lk2(this, (byte) 3);
        this.H = sl0Var;
        this.a = frameLayout;
        this.b = f53Var;
        setBackgroundColor(-14737633);
        pk2 pk2Var = new pk2(this);
        pk2Var.b((ek2) this.f.e.get(0), false);
        pk2Var.m = true;
        if (this.l0) {
            pk2Var.c.I();
        }
        arrayList.add(pk2Var);
        this.r = pk2Var;
        this.s = null;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(gl.L(8.0f));
        int L = gl.L(300.0f);
        this.E = L;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{0, -1, -1, 0}, new float[]{0.0f, 0.2f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
        this.F = linearGradient;
        this.G = new Matrix();
        paint.setShader(linearGradient);
        setWillNotDraw(false);
    }

    public static void c(Canvas canvas, Drawable drawable, RectF rectF, float f) {
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float max = Math.max(rectF.width() / intrinsicWidth, rectF.height() / intrinsicHeight);
        canvas.save();
        canvas.translate(rectF.centerX(), rectF.centerY());
        canvas.clipRect((-rectF.width()) / 2.0f, (-rectF.height()) / 2.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
        canvas.scale(max, max);
        canvas.translate((-intrinsicWidth) / 2.0f, (-intrinsicHeight) / 2.0f);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        if (f > 0.0f) {
            canvas.drawColor(bkb.p1(drawable.getAlpha() * f, -16777216));
        }
        canvas.restore();
    }

    public final boolean a() {
        if (this.h0 == null) {
            return false;
        }
        this.h0 = null;
        this.f0 = false;
        invalidate();
        lk2 lk2Var = this.j0;
        if (lk2Var != null) {
            gl.r(lk2Var);
            this.j0 = null;
            return true;
        }
        return true;
    }

    public final void b() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((pk2) obj).a(null);
        }
        q();
    }

    public final void d(android.graphics.Canvas r9, android.graphics.RectF r10, defpackage.pk2 r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qk2.d(android.graphics.Canvas, android.graphics.RectF, pk2):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        double d;
        float[] fArr;
        float[] fArr2;
        float f;
        ArrayList arrayList;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        sl0 sl0Var;
        float f5;
        float f6;
        float f7;
        float f8;
        pk2 pk2Var;
        float f9;
        int i;
        if (this.O != null && Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            RenderNode e = qm0.e(this.O);
            e.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = e.beginRecording();
        } else {
            recordingCanvas = canvas;
        }
        super.dispatchDraw(recordingCanvas);
        boolean i2 = i();
        lm lmVar = this.J;
        lm[] lmVarArr = this.K;
        float f10 = 0.0f;
        if (!i2 && !this.g0 && !this.f0) {
            float f11 = lmVar.c;
            fk2 fk2Var = this.f;
            if (f11 == fk2Var.c && lmVarArr[0].c == fk2Var.d[0]) {
                cv8 cv8Var = this.c;
                if (!cv8Var.a && ((lm) cv8Var.d).c <= 0.0f) {
                    setCameraNeedsBlur(false);
                    h(canvas);
                    return;
                }
            }
        }
        if (this.o0) {
            setCameraNeedsBlur(false);
        }
        recordingCanvas.drawColor(-14737633);
        float d2 = this.L.d(this.f0);
        float e2 = lmVar.e(false, this.f.c);
        int i3 = 0;
        while (true) {
            d = e2;
            int i4 = (i3 > Math.ceil(d) ? 1 : (i3 == Math.ceil(d) ? 0 : -1));
            fArr = this.N;
            fArr2 = this.M;
            if (i4 >= 0) {
                break;
            }
            fArr2[i3] = getMeasuredWidth();
            fArr[i3] = 0.0f;
            i3++;
        }
        int i5 = this.f.c;
        while (true) {
            f = 1.0f;
            if (i5 >= lmVarArr.length) {
                break;
            }
            lmVarArr[i5].e(false, 1.0f);
            i5++;
        }
        int i6 = 0;
        boolean z = false;
        float f12 = 0.0f;
        while (true) {
            arrayList = this.h;
            f2 = f;
            int size = arrayList.size();
            f3 = f10;
            rectF = this.Q;
            if (i6 >= size) {
                break;
            }
            pk2 pk2Var2 = (pk2) arrayList.get(i6);
            ek2 ek2Var = pk2Var2.h;
            int i7 = ek2Var.c;
            float f13 = d2;
            int i8 = ek2Var.b;
            float f14 = e2;
            lm[] lmVarArr2 = lmVarArr;
            float e3 = lmVarArr[i7].e(false, ek2Var.a.d[i7]);
            if (!this.g0 && !this.f0) {
                i = i7;
                rectF.set((getMeasuredWidth() / e3) * i8, (getMeasuredHeight() / f14) * i7, (getMeasuredWidth() / e3) * (i8 + 1), (getMeasuredHeight() / f14) * (i + 1));
            } else {
                i = i7;
                gl.X1(pk2Var2.j, pk2Var2.k, pk2Var2.l, rectF);
            }
            fArr2[i] = Math.min(fArr2[i], rectF.left);
            fArr[i] = Math.max(fArr[i], rectF.right);
            f12 = Math.max(f12, rectF.bottom);
            if (f13 <= f3 || pk2Var2 != this.i0) {
                if (this.o0 && pk2Var2.d != null) {
                    z = true;
                }
                d(recordingCanvas, rectF, pk2Var2);
            }
            i6++;
            f = f2;
            f10 = f3;
            d2 = f13;
            e2 = f14;
            lmVarArr = lmVarArr2;
        }
        float f15 = d2;
        float f16 = e2;
        lm[] lmVarArr3 = lmVarArr;
        int i9 = 0;
        while (true) {
            ArrayList arrayList2 = this.n;
            if (i9 >= arrayList2.size()) {
                break;
            }
            pk2 pk2Var3 = (pk2) arrayList2.get(i9);
            ek2 ek2Var2 = pk2Var3.h;
            int i10 = ek2Var2.c;
            int i11 = ek2Var2.b;
            lm lmVar2 = lmVarArr3[i10];
            int[] iArr = this.f.d;
            int i12 = i9;
            if (i10 >= iArr.length) {
                f9 = f2;
            } else {
                f9 = iArr[i10];
            }
            float e4 = lmVar2.e(false, f9);
            rectF.set((getMeasuredWidth() / e4) * i11, (getMeasuredHeight() / f16) * i10, (getMeasuredWidth() / e4) * (i11 + 1), (i10 + 1) * (getMeasuredHeight() / f16));
            fArr2[i10] = Math.min(fArr2[i10], rectF.left);
            fArr[i10] = Math.max(fArr[i10], rectF.right);
            f12 = Math.max(f12, rectF.bottom);
            if (this.o0 && pk2Var3.d != null) {
                z = true;
            }
            d(recordingCanvas, rectF, pk2Var3);
            i9 = i12 + 1;
        }
        if (!this.f0) {
            int i13 = 0;
            while (i13 < Math.ceil(d)) {
                if (fArr2[i13] >= f3) {
                    rectF.set(f3, (getMeasuredHeight() / f16) * i13, fArr2[i13], (getMeasuredHeight() / f16) * (i13 + 1));
                    d(recordingCanvas, rectF, null);
                }
                if (fArr[i13] < getMeasuredWidth()) {
                    rectF.set(fArr[i13], (getMeasuredHeight() / f16) * i13, getMeasuredWidth(), (getMeasuredHeight() / f16) * (i13 + 1));
                    d(recordingCanvas, rectF, null);
                }
                i13++;
                f3 = 0.0f;
            }
            if (f12 < getMeasuredHeight()) {
                f4 = 0.0f;
                rectF.set(0.0f, f12, getMeasuredWidth(), getMeasuredHeight());
                d(recordingCanvas, rectF, null);
            } else {
                f4 = 0.0f;
            }
        } else {
            f4 = f3;
        }
        if (f15 > f4 && (pk2Var = this.i0) != null) {
            ek2 ek2Var3 = pk2Var.h;
            int i14 = ek2Var3.c;
            int i15 = ek2Var3.b;
            float e5 = lmVarArr3[i14].e(false, this.f.d[i14]);
            if (this.f0) {
                gl.X1(pk2Var.j, pk2Var.k, pk2Var.l, rectF);
            } else {
                rectF.set((getMeasuredWidth() / e5) * i15, (getMeasuredHeight() / f16) * i14, (getMeasuredWidth() / e5) * (i15 + 1), (getMeasuredHeight() / f16) * (i14 + 1));
            }
            recordingCanvas.save();
            recordingCanvas.translate(gl.R1(this.b0, this.d0, pk2Var.l) * f15, gl.R1(this.c0, this.e0, pk2Var.l) * f15);
            d(recordingCanvas, rectF, pk2Var);
            recordingCanvas.restore();
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            pk2 pk2Var4 = (pk2) arrayList.get(i16);
            ek2 ek2Var4 = pk2Var4.h;
            float e6 = pk2Var4.b.e(false, 0.0f);
            if (e6 > 0.0f) {
                int i17 = ek2Var4.c;
                int i18 = ek2Var4.c;
                int i19 = ek2Var4.b;
                float e7 = lmVarArr3[i17].e(false, ek2Var4.a.d[i17]);
                if (!this.g0 && !this.f0) {
                    rectF.set((getMeasuredWidth() / e7) * i19, (getMeasuredHeight() / f16) * i18, (getMeasuredWidth() / e7) * (i19 + 1), (getMeasuredHeight() / f16) * (i18 + 1));
                } else {
                    gl.X1(pk2Var4.j, pk2Var4.k, pk2Var4.l, rectF);
                }
                RectF rectF2 = gl.P;
                rectF2.set(rectF);
                rectF2.inset(gl.L(4.0f), gl.L(4.0f));
                Matrix matrix = this.G;
                matrix.reset();
                float f17 = rectF.left;
                int i20 = this.E;
                matrix.postTranslate(gl.R1(((float) Math.sqrt((i20 * i20) << 1)) * (-1.4f), (float) Math.sqrt((rectF.height() * rectF.height()) + (rectF.width() * rectF.width())), f2 - e6) + f17, 0.0f);
                matrix.postRotate(-25.0f);
                this.F.setLocalMatrix(matrix);
                Paint paint = this.w;
                paint.setAlpha(255);
                Path path = this.x;
                path.rewind();
                ek2 ek2Var5 = pk2Var4.h;
                if (ek2Var5.b == 0 && ek2Var5.c == 0) {
                    f5 = gl.L(8.0f);
                } else {
                    f5 = 0.0f;
                }
                float[] fArr3 = this.y;
                fArr3[1] = f5;
                fArr3[0] = f5;
                ek2 ek2Var6 = pk2Var4.h;
                if (ek2Var6.b == ek2Var6.a.b - 1 && ek2Var6.c == 0) {
                    f6 = gl.L(8.0f);
                } else {
                    f6 = 0.0f;
                }
                fArr3[2] = f6;
                fArr3[1] = f6;
                ek2 ek2Var7 = pk2Var4.h;
                int i21 = ek2Var7.b;
                fk2 fk2Var2 = ek2Var7.a;
                if (i21 == fk2Var2.b - 1 && ek2Var7.c == fk2Var2.c - 1) {
                    f7 = gl.L(8.0f);
                } else {
                    f7 = 0.0f;
                }
                fArr3[4] = f7;
                fArr3[3] = f7;
                ek2 ek2Var8 = pk2Var4.h;
                if (ek2Var8.b == 0 && ek2Var8.c == ek2Var8.a.c - 1) {
                    f8 = gl.L(8.0f);
                } else {
                    f8 = 0.0f;
                }
                fArr3[6] = f8;
                fArr3[5] = f8;
                path.addRoundRect(rectF2, fArr3, Path.Direction.CW);
                recordingCanvas.drawPath(path, paint);
            }
        }
        if (z && (sl0Var = this.H) != null) {
            sl0Var.d();
        }
        h(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qk2.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.d && gl.m0) {
            return false;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public final void e(RectF rectF) {
        pk2 pk2Var = this.k0;
        if (pk2Var != null) {
            ek2 ek2Var = pk2Var.h;
            fk2 fk2Var = ek2Var.a;
            int i = ek2Var.b;
            int i2 = ek2Var.c;
            float f = fk2Var.c;
            float e = this.K[i2].e(false, fk2Var.d[i2]);
            rectF.set((getMeasuredWidth() / e) * i, (getMeasuredHeight() / f) * i2, (getMeasuredWidth() / e) * (i + 1), (getMeasuredHeight() / f) * (i2 + 1));
            return;
        }
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    public final void f(float f, Canvas canvas, RectF rectF, View view) {
        cv8 cv8Var;
        int i;
        TextureView textureView;
        Bitmap bitmap;
        if (view != null) {
            float max = Math.max(rectF.width() / view.getWidth(), rectF.height() / view.getHeight());
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            canvas.clipRect((-rectF.width()) / 2.0f, (-rectF.height()) / 2.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            canvas.scale(max, max);
            canvas.translate((-view.getWidth()) / 2.0f, (-view.getHeight()) / 2.0f);
            if (gl.m0) {
                if (view instanceof TextureView) {
                    textureView = (TextureView) view;
                } else if (view instanceof CameraView) {
                    textureView = ((CameraView) view).getTextureView();
                } else {
                    textureView = null;
                }
                if (textureView != null && (bitmap = textureView.getBitmap()) != null) {
                    canvas.scale(view.getWidth() / bitmap.getWidth(), view.getHeight() / bitmap.getHeight());
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                }
            } else {
                view.draw(canvas);
            }
            if (f > 0.0f) {
                canvas.drawColor(bkb.p1(view.getAlpha() * f, -16777216));
            }
            canvas.restore();
            if (view == this.d && (cv8Var = this.c) != null) {
                Paint paint = (Paint) cv8Var.i;
                lm[] lmVarArr = (lm[]) cv8Var.h;
                lm[] lmVarArr2 = (lm[]) cv8Var.g;
                Path path = (Path) cv8Var.j;
                bv8 bv8Var = (bv8) cv8Var.c;
                if (bv8Var != null && bv8Var.b.length > 0) {
                    float d = ((lm) cv8Var.d).d(cv8Var.a);
                    int i2 = 0;
                    float e = ((lm) cv8Var.e).e(false, ((bv8) cv8Var.c).c);
                    float width = (rectF.width() * e) + rectF.left;
                    float e2 = ((lm) cv8Var.f).e(false, ((bv8) cv8Var.c).d);
                    float height = (rectF.height() * e2) + rectF.top;
                    float R1 = gl.R1(0.5f, 1.1f, d);
                    canvas.save();
                    canvas.scale(R1, R1, width, height);
                    if (d > 0.0f) {
                        path.rewind();
                        int min = Math.min(4, ((bv8) cv8Var.c).b.length);
                        int i3 = 0;
                        while (i3 < min) {
                            int i4 = i3 - 1;
                            if (i4 < 0) {
                                i4 = min - 1;
                            }
                            int i5 = i3 + 1;
                            if (i5 >= min) {
                                i = i2;
                            } else {
                                i = i5;
                            }
                            bv8 bv8Var2 = (bv8) cv8Var.c;
                            lm[] lmVarArr3 = lmVarArr;
                            PointF[] pointFArr = bv8Var2.b;
                            PointF pointF = pointFArr[i4];
                            int i6 = min;
                            PointF pointF2 = pointFArr[i3];
                            lm[] lmVarArr4 = lmVarArr2;
                            PointF pointF3 = pointFArr[i];
                            float f2 = d;
                            float f3 = e;
                            float width2 = (rectF.width() * (lmVarArr4[i4].e(false, pointF.x - bv8Var2.c) + f3)) + rectF.left;
                            float height2 = (rectF.height() * (lmVarArr3[i4].e(false, pointF.y - ((bv8) cv8Var.c).d) + e2)) + rectF.top;
                            float width3 = (rectF.width() * (lmVarArr4[i3].e(false, pointF2.x - ((bv8) cv8Var.c).c) + f3)) + rectF.left;
                            float height3 = (rectF.height() * (lmVarArr3[i3].e(false, pointF2.y - ((bv8) cv8Var.c).d) + e2)) + rectF.top;
                            float f4 = rectF.left;
                            float width4 = rectF.width();
                            float f5 = rectF.top;
                            float height4 = rectF.height();
                            path.moveTo(((width2 - width3) * 0.18f) + width3, ((height2 - height3) * 0.18f) + height3);
                            path.lineTo(width3, height3);
                            path.lineTo(((((width4 * (lmVarArr4[i].e(false, pointF3.x - ((bv8) cv8Var.c).c) + f3)) + f4) - width3) * 0.18f) + width3, ((((height4 * (lmVarArr3[i].e(false, pointF3.y - ((bv8) cv8Var.c).d) + e2)) + f5) - height3) * 0.18f) + height3);
                            lmVarArr = lmVarArr3;
                            d = f2;
                            i3 = i5;
                            i2 = 0;
                            min = i6;
                            lmVarArr2 = lmVarArr4;
                            e = f3;
                        }
                        paint.setAlpha((int) (d * 255.0f));
                        canvas.drawPath(path, paint);
                    }
                    canvas.restore();
                }
            }
        }
    }

    @Override
    public final void g(Canvas canvas, float f) {
        pk2 pk2Var = this.k0;
        if (pk2Var != null) {
            ek2 ek2Var = pk2Var.h;
            fk2 fk2Var = ek2Var.a;
            int i = ek2Var.b;
            int i2 = ek2Var.c;
            float f2 = fk2Var.c;
            float e = this.K[i2].e(false, fk2Var.d[i2]);
            float measuredWidth = (getMeasuredWidth() / e) * i;
            float measuredHeight = (getMeasuredHeight() / f2) * i2;
            float measuredWidth2 = (getMeasuredWidth() / e) * (i + 1);
            float measuredHeight2 = (getMeasuredHeight() / f2) * (i2 + 1);
            RectF rectF = this.Q;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            d(canvas, rectF, this.k0);
        }
    }

    public Object getBlurRenderNode() {
        Shader.TileMode tileMode;
        if (this.O == null && Build.VERSION.SDK_INT >= 31) {
            this.O = new RenderNode("CameraViewRenderNode");
            RenderNode renderNode = new RenderNode("CameraViewRenderNodeBlur");
            this.P = renderNode;
            tileMode = Shader.TileMode.DECAL;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(gl.L(32.0f), gl.L(32.0f), tileMode));
        }
        return this.P;
    }

    public ArrayList<f4b> getContent() {
        ArrayList<f4b> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            f4b f4bVar = ((pk2) obj).n;
            if (f4bVar != null) {
                arrayList.add(f4bVar);
            }
        }
        return arrayList;
    }

    public pk2 getCurrent() {
        return this.r;
    }

    public long getDuration() {
        pk2 mainPart;
        f4b f4bVar;
        if (!this.o0 || (mainPart = getMainPart()) == null || (f4bVar = mainPart.n) == null) {
            return 1L;
        }
        return Math.max(Math.min((f4bVar.W - f4bVar.V) * ((float) f4bVar.h0), 59500L), 1L);
    }

    public int getFilledCount() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i < arrayList.size()) {
                if (((pk2) arrayList.get(i)).n != null) {
                    i2++;
                }
                i++;
            } else {
                return i2;
            }
        }
    }

    public float getFilledProgress() {
        return getFilledCount() / getTotalCount();
    }

    public fk2 getLayout() {
        return this.f;
    }

    public pk2 getMainPart() {
        pk2 pk2Var = null;
        if (!this.o0) {
            return null;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        long j = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            pk2 pk2Var2 = (pk2) obj;
            f4b f4bVar = pk2Var2.n;
            if (f4bVar != null && f4bVar.K) {
                long j2 = f4bVar.h0;
                ok2 ok2Var = pk2Var2.d;
                if (ok2Var != null && ok2Var.getDuration() > 0) {
                    j2 = pk2Var2.d.getDuration();
                }
                if (j2 > j) {
                    pk2Var = pk2Var2;
                    j = j2;
                }
            }
        }
        return pk2Var;
    }

    public pk2 getNext() {
        return this.s;
    }

    public ArrayList<Integer> getOrder() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.h;
            if (i < arrayList2.size()) {
                i = tb4.g(((pk2) arrayList2.get(i)).a, i, 1, arrayList);
            } else {
                return arrayList;
            }
        }
    }

    public long getPosition() {
        if (!this.o0) {
            return 0L;
        }
        if (!this.r0) {
            return this.v0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.p0;
        if (j > getDuration()) {
            this.p0 = currentTimeMillis - (j % getDuration());
        }
        return j;
    }

    public long getPositionWithOffset() {
        long j = 0;
        if (!this.o0) {
            return 0L;
        }
        getPosition();
        pk2 mainPart = getMainPart();
        if (mainPart != null) {
            f4b f4bVar = mainPart.n;
            j = f4bVar.X + (f4bVar.V * ((float) f4bVar.h0));
        }
        return getPosition() + j;
    }

    public int getTotalCount() {
        return this.h.size();
    }

    public final void h(Canvas canvas) {
        if (this.O != null && Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            RenderNode e = qm0.e(this.O);
            e.endRecording();
            canvas.drawRenderNode(e);
            Object obj = this.P;
            if (obj != null) {
                RenderNode e2 = qm0.e(obj);
                e2.setPosition(0, 0, getWidth(), getHeight());
                e2.beginRecording().drawRenderNode(e);
                e2.endRecording();
            }
        }
    }

    public final boolean i() {
        if (this.f.e.size() > 1) {
            return true;
        }
        return false;
    }

    public final void j(RectF rectF, ek2 ek2Var) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = gl.q;
            measuredWidth = point.x;
            measuredHeight = point.y;
        }
        fk2 fk2Var = ek2Var.a;
        int[] iArr = fk2Var.d;
        int i = ek2Var.c;
        float f = measuredWidth / iArr[i];
        int i2 = ek2Var.b;
        float f2 = measuredHeight / fk2Var.c;
        rectF.set(i2 * f, i * f2, f * (i2 + 1), f2 * (i + 1));
    }

    public final void k(RectF rectF, ek2 ek2Var) {
        boolean z;
        boolean z2;
        boolean z3;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = gl.q;
            int i = point.x;
            measuredHeight = point.y;
            measuredWidth = i;
        }
        j(rectF, ek2Var);
        float f = rectF.left;
        boolean z4 = false;
        if (f <= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        float f2 = rectF.top;
        if (f2 <= 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        float f3 = measuredWidth;
        if (rectF.right >= f3) {
            z3 = true;
        } else {
            z3 = false;
        }
        float f4 = measuredHeight;
        if (rectF.bottom >= f4) {
            z4 = true;
        }
        if (z && z3 && !z2 && !z4) {
            rectF.offset(0.0f, f4 - f2);
        } else if (z2 && z4 && !z && !z3) {
            rectF.offset(0.0f, f3 - f);
        } else {
            if (z3 && !z) {
                rectF.offset(rectF.width(), 0.0f);
            }
            if (z4 && !z2) {
                rectF.offset(0.0f, rectF.height());
            }
        }
    }

    public final boolean l(f4b f4bVar) {
        if (f4bVar.K) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                f4b f4bVar2 = ((pk2) obj).n;
                if (f4bVar2 != null && f4bVar2.K && f4bVar2.P > 0.0f) {
                    f4bVar.P = 0.0f;
                    break;
                }
            }
        }
        pk2 pk2Var = this.r;
        if (pk2Var != null) {
            pk2Var.a(f4bVar);
        }
        q();
        requestLayout();
        if (this.r != null) {
            return false;
        }
        return true;
    }

    public final void m(long j, boolean z) {
        if (this.o0) {
            long k = Utilities.k(j, getDuration(), 0L);
            if (!this.r0) {
                this.v0 = k;
            }
            this.p0 = System.currentTimeMillis() - k;
            this.q0 = z;
            if (this.o0) {
                lk2 lk2Var = this.x0;
                gl.r(lk2Var);
                lk2Var.run();
            }
        }
    }

    public final void n(f4b f4bVar) {
        if (f4bVar != null && f4bVar.T != null) {
            o(f4bVar.S);
            int i = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i < arrayList.size()) {
                    ((pk2) arrayList.get(i)).a((f4b) f4bVar.T.get(i));
                    i++;
                } else {
                    return;
                }
            }
        } else {
            b();
        }
    }

    public final void o(fk2 fk2Var) {
        ek2 ek2Var;
        pk2 pk2Var;
        if (fk2Var == null) {
            fk2Var = new fk2(".");
        }
        ArrayList arrayList = fk2Var.e;
        this.f = fk2Var;
        lk2 lk2Var = this.I;
        gl.r(lk2Var);
        int i = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList2 = this.h;
            if (i < Math.max(size, arrayList2.size())) {
                if (i < arrayList.size()) {
                    ek2Var = (ek2) arrayList.get(i);
                } else {
                    ek2Var = null;
                }
                if (i < arrayList2.size()) {
                    pk2Var = (pk2) arrayList2.get(i);
                } else {
                    pk2Var = null;
                }
                if (pk2Var == null && ek2Var != null) {
                    pk2 pk2Var2 = new pk2(this);
                    if (this.l0) {
                        pk2Var2.c.I();
                    }
                    pk2Var2.b(ek2Var, true);
                    arrayList2.add(pk2Var2);
                } else if (ek2Var != null) {
                    pk2Var.b(ek2Var, true);
                } else if (pk2Var != null) {
                    this.n.add(pk2Var);
                    arrayList2.remove(pk2Var);
                    pk2Var.b(null, true);
                    i--;
                }
                i++;
            } else {
                q();
                invalidate();
                gl.e3(lk2Var, 360L);
                return;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i < arrayList.size()) {
                ((pk2) arrayList.get(i)).c.I();
                i++;
            } else {
                this.l0 = true;
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i < arrayList.size()) {
                ((pk2) arrayList.get(i)).c.K();
                i++;
            } else {
                this.l0 = false;
                gl.r(this.x0);
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        pk2 pk2Var;
        f4b f4bVar;
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt == this.d) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else {
                int i6 = 0;
                while (true) {
                    ArrayList arrayList = this.h;
                    if (i6 < arrayList.size()) {
                        if (childAt == ((pk2) arrayList.get(i6)).e) {
                            pk2Var = (pk2) arrayList.get(i6);
                            break;
                        }
                        i6++;
                    } else {
                        pk2Var = null;
                        break;
                    }
                }
                if (pk2Var != null && (f4bVar = pk2Var.n) != null && (i3 = f4bVar.k0) > 0 && (i4 = f4bVar.l0) > 0) {
                    if (f4bVar.Q % 90 == 1) {
                        i4 = i3;
                        i3 = i4;
                    }
                    float f = i3;
                    float f2 = i4;
                    float min = Math.min(1.0f, Math.max(f / size, f2 / size2));
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (f * min), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (f2 * min), 1073741824));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                }
            }
        }
    }

    public final void p() {
        boolean z;
        CameraView cameraView = this.d;
        boolean z2 = false;
        if (cameraView != null && this.V) {
            z = true;
        } else {
            z = false;
        }
        if (this.e != null) {
            z2 = true;
        }
        if (z == z2) {
            return;
        }
        if (z) {
            this.e = cameraView.getBlurRenderNode();
        } else {
            this.e = null;
        }
    }

    public final void q() {
        ArrayList arrayList;
        boolean z;
        this.r = null;
        this.s = null;
        int i = 0;
        while (true) {
            arrayList = this.h;
            if (i >= arrayList.size()) {
                break;
            }
            pk2 pk2Var = (pk2) arrayList.get(i);
            if (pk2Var.n == null) {
                if (this.r == null) {
                    this.r = pk2Var;
                } else {
                    this.s = pk2Var;
                    break;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            pk2 pk2Var2 = (pk2) arrayList.get(i2);
            if (pk2Var2 == this.r) {
                z = true;
            } else {
                z = false;
            }
            pk2Var2.m = z;
        }
    }

    public void setCameraNeedsBlur(boolean z) {
        if (this.V == z) {
            return;
        }
        this.V = z;
        p();
    }

    public void setCameraThumb(Drawable drawable) {
        this.S = drawable;
        invalidate();
    }

    public void setCameraThumbVisible(boolean z) {
        this.T = z;
        invalidate();
    }

    public void setCameraView(CameraView cameraView) {
        CameraView cameraView2 = this.d;
        if (cameraView2 != cameraView && cameraView2 != null) {
            cameraView2.unlistenDraw(new lk2(this, (byte) 1));
            gl.B2(this.d);
            this.d = null;
            p();
        }
        this.d = cameraView;
        if (cameraView != null) {
            addView(cameraView, nme.e(-1, -1, 119));
        }
        CameraView cameraView3 = this.d;
        if (cameraView3 != null) {
            cameraView3.unlistenDraw(new lk2(this, (byte) 1));
        }
        this.d = cameraView;
        if (cameraView != null) {
            cameraView.listenDraw(new lk2(this, (byte) 1));
        }
        p();
        invalidate();
    }

    public void setCancelGestures(Runnable runnable) {
        this.m0 = runnable;
    }

    public void setMuted(boolean z) {
        if (this.w0 == z) {
            return;
        }
        this.w0 = z;
    }

    public void setOnCameraThumbClick(Runnable runnable) {
        this.U = runnable;
    }

    public void setPlaying(boolean z) {
        boolean z2 = this.u0;
        this.u0 = true;
        if (this.r0 != z) {
            this.r0 = z;
            if (!z) {
                this.v0 = getPosition();
            } else if (z2) {
                m(this.v0, false);
            } else {
                this.q0 = false;
            }
            if (this.o0) {
                lk2 lk2Var = this.x0;
                gl.r(lk2Var);
                lk2Var.run();
            }
        }
    }

    public void setPreview(boolean z) {
        if (this.o0 != z) {
            this.o0 = z;
            ArrayList arrayList = this.h;
            int i = 0;
            if (z) {
                sl0 sl0Var = this.H;
                if (sl0Var != null) {
                    sl0Var.d();
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((pk2) arrayList.get(i2)).a = i2;
                }
            }
            this.q0 = false;
            this.v0 = 0L;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                pk2 pk2Var = (pk2) obj;
                ok2 ok2Var = pk2Var.d;
                if (ok2Var != null) {
                    ok2Var.setAudioEnabled(z, true);
                    if (z && !this.r0) {
                        pk2Var.d.pause();
                    } else {
                        pk2Var.d.play();
                    }
                }
            }
            lk2 lk2Var = this.x0;
            gl.r(lk2Var);
            if (z) {
                this.p0 = System.currentTimeMillis();
                gl.e3(lk2Var, 1000.0f / gl.r);
            }
        }
    }

    public void setPreviewView(zi8 zi8Var) {
        this.t0 = zi8Var;
    }

    public void setResetState(Runnable runnable) {
        this.n0 = runnable;
    }

    @Override
    public void setScrimHidden(boolean z) {
        tb4.a(this, z);
    }

    public void setTimelineView(kob kobVar) {
        this.s0 = kobVar;
    }
}
