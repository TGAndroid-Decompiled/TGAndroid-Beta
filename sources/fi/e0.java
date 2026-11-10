package fi;

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
import org.telegram.messenger.ch;
import org.telegram.ui.Components.j60;
import org.telegram.ui.Components.wq;
public abstract class e0 extends FrameLayout implements j60 {
    public static final int f11825x0 = 0;
    public final int D;
    public final LinearGradient E;
    public final Matrix F;
    public final org.telegram.ui.Components.x9 G;
    public final a0 H;
    public final org.telegram.ui.Components.v5 I;
    public final org.telegram.ui.Components.v5[] J;
    public final org.telegram.ui.Components.v5 K;
    public final float[] L;
    public final float[] M;
    public Object N;
    public Object O;
    public final RectF P;
    public final Path Q;
    public Drawable R;
    public boolean S;
    public Runnable T;
    public boolean U;
    public float V;
    public float W;
    public final FrameLayout f11826a;
    public float f11827a0;
    public final di.b f11828b;
    public float f11829b0;
    public final b6 f11830c;
    public float f11831c0;
    public CameraView d;
    public float f11832d0;
    public Object f11833e;
    public boolean f11834e0;
    public t f11835f;
    public boolean f11836f0;
    public d0 f11837g0;
    public final ArrayList h;
    public d0 f11838h0;
    public a0 f11839i0;
    public d0 f11840j0;
    public boolean f11841k0;
    public Runnable f11842l0;
    public Runnable m0;
    public final ArrayList f11843n;
    public boolean f11844n0;
    public long f11845o0;
    public boolean f11846p0;
    public boolean f11847q0;
    public d0 f11848r;
    public fb f11849r0;
    public d0 f11850s;
    public y5 f11851s0;
    public boolean f11852t0;
    public long f11853u0;
    public boolean f11854v0;
    public final Paint f11855w;
    public final a0 f11856w0;
    public final Path f11857x;
    public final float[] f11858y;

    public e0(Context context, org.telegram.ui.Components.x9 x9Var, FrameLayout frameLayout, di.b bVar) {
        super(context);
        this.f11830c = new b6(new a0(this, 1));
        this.f11835f = new t(".");
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.f11843n = new ArrayList();
        Paint paint = new Paint(1);
        this.f11855w = paint;
        this.f11857x = new Path();
        this.f11858y = new float[8];
        this.H = new a0(this, 2);
        wq wqVar = wq.h;
        this.I = new org.telegram.ui.Components.v5(this, 0L, 320L, wqVar);
        this.J = new org.telegram.ui.Components.v5[]{new org.telegram.ui.Components.v5(this, 0L, 320L, wqVar), new org.telegram.ui.Components.v5(this, 0L, 320L, wqVar), new org.telegram.ui.Components.v5(this, 0L, 320L, wqVar), new org.telegram.ui.Components.v5(this, 0L, 320L, wqVar), new org.telegram.ui.Components.v5(this, 0L, 320L, wqVar)};
        this.K = new org.telegram.ui.Components.v5(this, 0L, 320L, wqVar);
        this.L = new float[5];
        this.M = new float[5];
        this.P = new RectF();
        this.Q = new Path();
        this.S = true;
        this.f11847q0 = true;
        this.f11852t0 = true;
        this.f11856w0 = new a0(this, 3);
        this.G = x9Var;
        this.f11826a = frameLayout;
        this.f11828b = bVar;
        setBackgroundColor(-14737633);
        d0 d0Var = new d0(this);
        d0Var.b((s) this.f11835f.f12828e.get(0), false);
        d0Var.f11782m = true;
        if (this.f11841k0) {
            d0Var.f11774c.P();
        }
        arrayList.add(d0Var);
        this.f11848r = d0Var;
        this.f11850s = null;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(8.0f));
        int L = org.telegram.messenger.g0.L(300.0f);
        this.D = L;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{0, -1, -1, 0}, new float[]{0.0f, 0.2f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = linearGradient;
        this.F = new Matrix();
        paint.setShader(linearGradient);
        setWillNotDraw(false);
    }

    public static void a(e0 e0Var, RectF rectF, s sVar) {
        boolean z9;
        boolean z10;
        boolean z11;
        int measuredWidth = e0Var.getMeasuredWidth();
        int measuredHeight = e0Var.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = org.telegram.messenger.g0.f22567q;
            int i7 = point.x;
            measuredHeight = point.y;
            measuredWidth = i7;
        }
        e0Var.k(rectF, sVar);
        float f10 = rectF.left;
        boolean z12 = false;
        if (f10 <= 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        float f11 = rectF.top;
        if (f11 <= 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f12 = measuredWidth;
        if (rectF.right >= f12) {
            z11 = true;
        } else {
            z11 = false;
        }
        float f13 = measuredHeight;
        if (rectF.bottom >= f13) {
            z12 = true;
        }
        if (z9 && z11 && !z10 && !z12) {
            rectF.offset(0.0f, f13 - f11);
        } else if (z10 && z12 && !z9 && !z11) {
            rectF.offset(0.0f, f12 - f10);
        } else {
            if (z11 && !z9) {
                rectF.offset(rectF.width(), 0.0f);
            }
            if (z12 && !z10) {
                rectF.offset(0.0f, rectF.height());
            }
        }
    }

    public static void d(Canvas canvas, Drawable drawable, RectF rectF, float f10) {
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
        if (f10 > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.m6.r1(drawable.getAlpha() * f10, -16777216));
        }
        canvas.restore();
    }

    public final boolean b() {
        if (this.f11837g0 == null) {
            return false;
        }
        this.f11837g0 = null;
        this.f11834e0 = false;
        invalidate();
        a0 a0Var = this.f11839i0;
        if (a0Var != null) {
            org.telegram.messenger.g0.r(a0Var);
            this.f11839i0 = null;
            return true;
        }
        return true;
    }

    public final void c() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((d0) obj).a(null);
        }
        q();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        double d;
        float[] fArr;
        float[] fArr2;
        float f10;
        ArrayList arrayList;
        float f11;
        float f12;
        RectF rectF;
        float f13;
        org.telegram.ui.Components.x9 x9Var;
        float f14;
        float f15;
        float f16;
        float f17;
        d0 d0Var;
        float f18;
        int i7;
        if (this.N != null && Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            RenderNode e10 = ni.a.e(this.N);
            e10.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = e10.beginRecording();
        } else {
            recordingCanvas = canvas;
        }
        super.dispatchDraw(recordingCanvas);
        boolean j3 = j();
        org.telegram.ui.Components.v5 v5Var = this.I;
        org.telegram.ui.Components.v5[] v5VarArr = this.J;
        float f19 = 0.0f;
        if (!j3 && !this.f11836f0 && !this.f11834e0) {
            float f20 = v5Var.f38854c;
            t tVar = this.f11835f;
            if (f20 == tVar.f12827c && v5VarArr[0].f38854c == tVar.d[0]) {
                b6 b6Var = this.f11830c;
                if (!b6Var.f11687b && b6Var.d.f38854c <= 0.0f) {
                    setCameraNeedsBlur(false);
                    i(canvas);
                    return;
                }
            }
        }
        if (this.f11844n0) {
            setCameraNeedsBlur(false);
        }
        recordingCanvas.drawColor(-14737633);
        float d2 = this.K.d(this.f11834e0);
        float e11 = v5Var.e(false, this.f11835f.f12827c);
        int i10 = 0;
        while (true) {
            d = e11;
            int i11 = (i10 > Math.ceil(d) ? 1 : (i10 == Math.ceil(d) ? 0 : -1));
            fArr = this.M;
            fArr2 = this.L;
            if (i11 >= 0) {
                break;
            }
            fArr2[i10] = getMeasuredWidth();
            fArr[i10] = 0.0f;
            i10++;
        }
        int i12 = this.f11835f.f12827c;
        while (true) {
            f10 = 1.0f;
            if (i12 >= v5VarArr.length) {
                break;
            }
            v5VarArr[i12].e(false, 1.0f);
            i12++;
        }
        int i13 = 0;
        boolean z9 = false;
        float f21 = 0.0f;
        while (true) {
            arrayList = this.h;
            f11 = f10;
            int size = arrayList.size();
            f12 = f19;
            rectF = this.P;
            if (i13 >= size) {
                break;
            }
            d0 d0Var2 = (d0) arrayList.get(i13);
            s sVar = d0Var2.h;
            int i14 = sVar.f12768c;
            float f22 = d2;
            int i15 = sVar.f12767b;
            float f23 = e11;
            org.telegram.ui.Components.v5[] v5VarArr2 = v5VarArr;
            float e12 = v5VarArr[i14].e(false, sVar.f12766a.d[i14]);
            if (this.f11836f0 || this.f11834e0) {
                i7 = i14;
                org.telegram.messenger.g0.Z1(d0Var2.f11779j, d0Var2.f11780k, d0Var2.f11781l, rectF);
            } else {
                i7 = i14;
                rectF.set((getMeasuredWidth() / e12) * i15, (getMeasuredHeight() / f23) * i14, (getMeasuredWidth() / e12) * (i15 + 1), (getMeasuredHeight() / f23) * (i7 + 1));
            }
            fArr2[i7] = Math.min(fArr2[i7], rectF.left);
            fArr[i7] = Math.max(fArr[i7], rectF.right);
            f21 = Math.max(f21, rectF.bottom);
            if (f22 <= f12 || d0Var2 != this.f11838h0) {
                if (this.f11844n0 && d0Var2.d != null) {
                    z9 = true;
                }
                e(recordingCanvas, rectF, d0Var2);
            }
            i13++;
            f10 = f11;
            f19 = f12;
            d2 = f22;
            e11 = f23;
            v5VarArr = v5VarArr2;
        }
        float f24 = d2;
        float f25 = e11;
        org.telegram.ui.Components.v5[] v5VarArr3 = v5VarArr;
        int i16 = 0;
        while (true) {
            ArrayList arrayList2 = this.f11843n;
            if (i16 >= arrayList2.size()) {
                break;
            }
            d0 d0Var3 = (d0) arrayList2.get(i16);
            s sVar2 = d0Var3.h;
            int i17 = sVar2.f12768c;
            int i18 = sVar2.f12767b;
            org.telegram.ui.Components.v5 v5Var2 = v5VarArr3[i17];
            int[] iArr = this.f11835f.d;
            int i19 = i16;
            if (i17 >= iArr.length) {
                f18 = f11;
            } else {
                f18 = iArr[i17];
            }
            float e13 = v5Var2.e(false, f18);
            rectF.set((getMeasuredWidth() / e13) * i18, (getMeasuredHeight() / f25) * i17, (getMeasuredWidth() / e13) * (i18 + 1), (i17 + 1) * (getMeasuredHeight() / f25));
            fArr2[i17] = Math.min(fArr2[i17], rectF.left);
            fArr[i17] = Math.max(fArr[i17], rectF.right);
            f21 = Math.max(f21, rectF.bottom);
            if (this.f11844n0 && d0Var3.d != null) {
                z9 = true;
            }
            e(recordingCanvas, rectF, d0Var3);
            i16 = i19 + 1;
        }
        if (!this.f11834e0) {
            int i20 = 0;
            while (i20 < Math.ceil(d)) {
                if (fArr2[i20] >= f12) {
                    rectF.set(f12, (getMeasuredHeight() / f25) * i20, fArr2[i20], (getMeasuredHeight() / f25) * (i20 + 1));
                    e(recordingCanvas, rectF, null);
                }
                if (fArr[i20] < getMeasuredWidth()) {
                    rectF.set(fArr[i20], (getMeasuredHeight() / f25) * i20, getMeasuredWidth(), (getMeasuredHeight() / f25) * (i20 + 1));
                    e(recordingCanvas, rectF, null);
                }
                i20++;
                f12 = 0.0f;
            }
            if (f21 < getMeasuredHeight()) {
                f13 = 0.0f;
                rectF.set(0.0f, f21, getMeasuredWidth(), getMeasuredHeight());
                e(recordingCanvas, rectF, null);
            } else {
                f13 = 0.0f;
            }
        } else {
            f13 = f12;
        }
        if (f24 > f13 && (d0Var = this.f11838h0) != null) {
            s sVar3 = d0Var.h;
            int i21 = sVar3.f12768c;
            int i22 = sVar3.f12767b;
            float e14 = v5VarArr3[i21].e(false, this.f11835f.d[i21]);
            if (this.f11834e0) {
                org.telegram.messenger.g0.Z1(d0Var.f11779j, d0Var.f11780k, d0Var.f11781l, rectF);
            } else {
                rectF.set((getMeasuredWidth() / e14) * i22, (getMeasuredHeight() / f25) * i21, (getMeasuredWidth() / e14) * (i22 + 1), (getMeasuredHeight() / f25) * (i21 + 1));
            }
            recordingCanvas.save();
            recordingCanvas.translate(org.telegram.messenger.g0.T1(this.f11827a0, this.f11831c0, d0Var.f11781l) * f24, org.telegram.messenger.g0.T1(this.f11829b0, this.f11832d0, d0Var.f11781l) * f24);
            e(recordingCanvas, rectF, d0Var);
            recordingCanvas.restore();
        }
        for (int i23 = 0; i23 < arrayList.size(); i23++) {
            d0 d0Var4 = (d0) arrayList.get(i23);
            s sVar4 = d0Var4.h;
            float e15 = d0Var4.f11773b.e(false, 0.0f);
            if (e15 > 0.0f) {
                int i24 = sVar4.f12768c;
                int i25 = sVar4.f12768c;
                int i26 = sVar4.f12767b;
                float e16 = v5VarArr3[i24].e(false, sVar4.f12766a.d[i24]);
                if (!this.f11836f0 && !this.f11834e0) {
                    rectF.set((getMeasuredWidth() / e16) * i26, (getMeasuredHeight() / f25) * i25, (getMeasuredWidth() / e16) * (i26 + 1), (getMeasuredHeight() / f25) * (i25 + 1));
                } else {
                    org.telegram.messenger.g0.Z1(d0Var4.f11779j, d0Var4.f11780k, d0Var4.f11781l, rectF);
                }
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(rectF);
                rectF2.inset(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                Matrix matrix = this.F;
                matrix.reset();
                float f26 = rectF.left;
                int i27 = this.D;
                int i28 = i27 * i27;
                matrix.postTranslate(org.telegram.messenger.g0.T1(((float) Math.sqrt(i28 + i28)) * (-1.4f), (float) Math.sqrt((rectF.height() * rectF.height()) + (rectF.width() * rectF.width())), f11 - e15) + f26, 0.0f);
                matrix.postRotate(-25.0f);
                this.E.setLocalMatrix(matrix);
                Paint paint = this.f11855w;
                paint.setAlpha(255);
                Path path = this.f11857x;
                path.rewind();
                s sVar5 = d0Var4.h;
                if (sVar5.f12767b == 0 && sVar5.f12768c == 0) {
                    f14 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    f14 = 0.0f;
                }
                float[] fArr3 = this.f11858y;
                fArr3[1] = f14;
                fArr3[0] = f14;
                s sVar6 = d0Var4.h;
                if (sVar6.f12767b == sVar6.f12766a.f12826b - 1 && sVar6.f12768c == 0) {
                    f15 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    f15 = 0.0f;
                }
                fArr3[2] = f15;
                fArr3[1] = f15;
                s sVar7 = d0Var4.h;
                int i29 = sVar7.f12767b;
                t tVar2 = sVar7.f12766a;
                if (i29 == tVar2.f12826b - 1 && sVar7.f12768c == tVar2.f12827c - 1) {
                    f16 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    f16 = 0.0f;
                }
                fArr3[4] = f16;
                fArr3[3] = f16;
                s sVar8 = d0Var4.h;
                if (sVar8.f12767b == 0 && sVar8.f12768c == sVar8.f12766a.f12827c - 1) {
                    f17 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    f17 = 0.0f;
                }
                fArr3[6] = f17;
                fArr3[5] = f17;
                path.addRoundRect(rectF2, fArr3, Path.Direction.CW);
                recordingCanvas.drawPath(path, paint);
            }
        }
        if (z9 && (x9Var = this.G) != null) {
            x9Var.d();
        }
        i(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: fi.e0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.d && org.telegram.messenger.g0.m0) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(android.graphics.Canvas r9, android.graphics.RectF r10, fi.d0 r11) {
        throw new UnsupportedOperationException("Method not decompiled: fi.e0.e(android.graphics.Canvas, android.graphics.RectF, fi.d0):void");
    }

    public final void f(float f10, Canvas canvas, RectF rectF, View view) {
        b6 b6Var;
        int i7;
        TextureView textureView;
        Bitmap bitmap;
        if (view != null) {
            float max = Math.max(rectF.width() / view.getWidth(), rectF.height() / view.getHeight());
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            canvas.clipRect((-rectF.width()) / 2.0f, (-rectF.height()) / 2.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            canvas.scale(max, max);
            canvas.translate((-view.getWidth()) / 2.0f, (-view.getHeight()) / 2.0f);
            if (org.telegram.messenger.g0.m0) {
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
            if (f10 > 0.0f) {
                canvas.drawColor(org.telegram.ui.ActionBar.m6.r1(view.getAlpha() * f10, -16777216));
            }
            canvas.restore();
            if (view == this.d && (b6Var = this.f11830c) != null) {
                Paint paint = b6Var.f11692i;
                org.telegram.ui.Components.v5[] v5VarArr = b6Var.h;
                org.telegram.ui.Components.v5[] v5VarArr2 = b6Var.f11691g;
                Path path = b6Var.f11693j;
                a6 a6Var = b6Var.f11688c;
                if (a6Var != null && a6Var.f11612b.length > 0) {
                    float d = b6Var.d.d(b6Var.f11687b);
                    int i10 = 0;
                    float e10 = b6Var.f11689e.e(false, b6Var.f11688c.f11613c);
                    float width = (rectF.width() * e10) + rectF.left;
                    float e11 = b6Var.f11690f.e(false, b6Var.f11688c.d);
                    float f11 = rectF.top;
                    float T1 = org.telegram.messenger.g0.T1(0.5f, 1.1f, d);
                    canvas.save();
                    canvas.scale(T1, T1, width, (rectF.height() * e11) + f11);
                    if (d > 0.0f) {
                        path.rewind();
                        int min = Math.min(4, b6Var.f11688c.f11612b.length);
                        int i11 = 0;
                        while (i11 < min) {
                            int i12 = i11 - 1;
                            if (i12 < 0) {
                                i12 = min - 1;
                            }
                            int i13 = i11 + 1;
                            if (i13 >= min) {
                                i7 = i10;
                            } else {
                                i7 = i13;
                            }
                            a6 a6Var2 = b6Var.f11688c;
                            PointF[] pointFArr = a6Var2.f11612b;
                            PointF pointF = pointFArr[i12];
                            int i14 = min;
                            PointF pointF2 = pointFArr[i11];
                            org.telegram.ui.Components.v5[] v5VarArr3 = v5VarArr;
                            PointF pointF3 = pointFArr[i7];
                            org.telegram.ui.Components.v5[] v5VarArr4 = v5VarArr2;
                            float f12 = d;
                            float width2 = (rectF.width() * (v5VarArr4[i12].e(false, pointF.x - a6Var2.f11613c) + e10)) + rectF.left;
                            float height = (rectF.height() * (v5VarArr3[i12].e(false, pointF.y - b6Var.f11688c.d) + e11)) + rectF.top;
                            float width3 = (rectF.width() * (v5VarArr4[i11].e(false, pointF2.x - b6Var.f11688c.f11613c) + e10)) + rectF.left;
                            float height2 = (rectF.height() * (v5VarArr3[i11].e(false, pointF2.y - b6Var.f11688c.d) + e11)) + rectF.top;
                            float width4 = (rectF.width() * (v5VarArr4[i7].e(false, pointF3.x - b6Var.f11688c.f11613c) + e10)) + rectF.left;
                            float f13 = rectF.top;
                            float height3 = rectF.height();
                            path.moveTo(((width2 - width3) * 0.18f) + width3, ((height - height2) * 0.18f) + height2);
                            path.lineTo(width3, height2);
                            path.lineTo(((width4 - width3) * 0.18f) + width3, ((((height3 * (v5VarArr3[i7].e(false, pointF3.y - b6Var.f11688c.d) + e11)) + f13) - height2) * 0.18f) + height2);
                            v5VarArr2 = v5VarArr4;
                            i10 = 0;
                            i11 = i13;
                            min = i14;
                            v5VarArr = v5VarArr3;
                            d = f12;
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
    public final void g(RectF rectF) {
        d0 d0Var = this.f11840j0;
        if (d0Var != null) {
            s sVar = d0Var.h;
            t tVar = sVar.f12766a;
            int i7 = sVar.f12767b;
            int i10 = sVar.f12768c;
            float f10 = tVar.f12827c;
            float e10 = this.J[i10].e(false, tVar.d[i10]);
            rectF.set((getMeasuredWidth() / e10) * i7, (getMeasuredHeight() / f10) * i10, (getMeasuredWidth() / e10) * (i7 + 1), (getMeasuredHeight() / f10) * (i10 + 1));
            return;
        }
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    public Object getBlurRenderNode() {
        if (this.N == null && Build.VERSION.SDK_INT >= 31) {
            this.N = new RenderNode("CameraViewRenderNode");
            RenderNode renderNode = new RenderNode("CameraViewRenderNodeBlur");
            this.O = renderNode;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), ch.e()));
        }
        return this.O;
    }

    public ArrayList<e7> getContent() {
        ArrayList<e7> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            e7 e7Var = ((d0) obj).f11783n;
            if (e7Var != null) {
                arrayList.add(e7Var);
            }
        }
        return arrayList;
    }

    public d0 getCurrent() {
        return this.f11848r;
    }

    public long getDuration() {
        d0 mainPart;
        e7 e7Var;
        if (!this.f11844n0 || (mainPart = getMainPart()) == null || (e7Var = mainPart.f11783n) == null) {
            return 1L;
        }
        return Math.max(Math.min((e7Var.W - e7Var.V) * ((float) e7Var.f11898h0), 59500L), 1L);
    }

    public int getFilledCount() {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 < arrayList.size()) {
                if (((d0) arrayList.get(i7)).f11783n != null) {
                    i10++;
                }
                i7++;
            } else {
                return i10;
            }
        }
    }

    public float getFilledProgress() {
        return getFilledCount() / getTotalCount();
    }

    public t getLayout() {
        return this.f11835f;
    }

    public d0 getMainPart() {
        d0 d0Var = null;
        if (!this.f11844n0) {
            return null;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i7 = 0;
        long j3 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            d0 d0Var2 = (d0) obj;
            e7 e7Var = d0Var2.f11783n;
            if (e7Var != null && e7Var.K) {
                long j10 = e7Var.f11898h0;
                c0 c0Var = d0Var2.d;
                if (c0Var != null && c0Var.getDuration() > 0) {
                    j10 = d0Var2.d.getDuration();
                }
                if (j10 > j3) {
                    d0Var = d0Var2;
                    j3 = j10;
                }
            }
        }
        return d0Var;
    }

    public d0 getNext() {
        return this.f11850s;
    }

    public ArrayList<Integer> getOrder() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.h;
            if (i7 < arrayList2.size()) {
                i7 = com.google.android.recaptcha.internal.a.f(((d0) arrayList2.get(i7)).f11772a, i7, 1, arrayList);
            } else {
                return arrayList;
            }
        }
    }

    public long getPosition() {
        if (!this.f11844n0) {
            return 0L;
        }
        if (!this.f11847q0) {
            return this.f11853u0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f11845o0;
        if (j3 > getDuration()) {
            this.f11845o0 = currentTimeMillis - (j3 % getDuration());
        }
        return j3;
    }

    public long getPositionWithOffset() {
        long j3 = 0;
        if (!this.f11844n0) {
            return 0L;
        }
        getPosition();
        d0 mainPart = getMainPart();
        if (mainPart != null) {
            e7 e7Var = mainPart.f11783n;
            j3 = e7Var.X + (e7Var.V * ((float) e7Var.f11898h0));
        }
        return getPosition() + j3;
    }

    public int getTotalCount() {
        return this.h.size();
    }

    @Override
    public final void h(Canvas canvas, float f10) {
        d0 d0Var = this.f11840j0;
        if (d0Var != null) {
            s sVar = d0Var.h;
            t tVar = sVar.f12766a;
            int i7 = sVar.f12767b;
            int i10 = sVar.f12768c;
            float f11 = tVar.f12827c;
            float e10 = this.J[i10].e(false, tVar.d[i10]);
            float measuredWidth = (getMeasuredWidth() / e10) * i7;
            float measuredHeight = (getMeasuredHeight() / f11) * i10;
            float measuredWidth2 = (getMeasuredWidth() / e10) * (i7 + 1);
            float measuredHeight2 = (getMeasuredHeight() / f11) * (i10 + 1);
            RectF rectF = this.P;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            e(canvas, rectF, this.f11840j0);
        }
    }

    public final void i(Canvas canvas) {
        if (this.N != null && Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            RenderNode e10 = ni.a.e(this.N);
            e10.endRecording();
            canvas.drawRenderNode(e10);
            Object obj = this.O;
            if (obj != null) {
                RenderNode e11 = ni.a.e(obj);
                e11.setPosition(0, 0, getWidth(), getHeight());
                e11.beginRecording().drawRenderNode(e10);
                e11.endRecording();
            }
        }
    }

    public final boolean j() {
        if (this.f11835f.f12828e.size() > 1) {
            return true;
        }
        return false;
    }

    public final void k(RectF rectF, s sVar) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = org.telegram.messenger.g0.f22567q;
            int i7 = point.x;
            measuredHeight = point.y;
            measuredWidth = i7;
        }
        float f10 = measuredWidth;
        t tVar = sVar.f12766a;
        int[] iArr = tVar.d;
        int i10 = sVar.f12768c;
        int i11 = iArr[i10];
        int i12 = sVar.f12767b;
        float f11 = measuredHeight;
        int i13 = tVar.f12827c;
        rectF.set((f10 / i11) * i12, (f11 / i13) * i10, (f10 / i11) * (i12 + 1), (f11 / i13) * (i10 + 1));
    }

    public final boolean l(e7 e7Var) {
        if (e7Var.K) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    break;
                }
                Object obj = arrayList.get(i7);
                i7++;
                e7 e7Var2 = ((d0) obj).f11783n;
                if (e7Var2 != null && e7Var2.K && e7Var2.P > 0.0f) {
                    e7Var.P = 0.0f;
                    break;
                }
            }
        }
        d0 d0Var = this.f11848r;
        if (d0Var != null) {
            d0Var.a(e7Var);
        }
        q();
        requestLayout();
        if (this.f11848r != null) {
            return false;
        }
        return true;
    }

    public final void m(long j3, boolean z9) {
        if (this.f11844n0) {
            long k10 = Utilities.k(j3, getDuration(), 0L);
            if (!this.f11847q0) {
                this.f11853u0 = k10;
            }
            this.f11845o0 = System.currentTimeMillis() - k10;
            this.f11846p0 = z9;
            if (this.f11844n0) {
                a0 a0Var = this.f11856w0;
                org.telegram.messenger.g0.r(a0Var);
                a0Var.run();
            }
        }
    }

    public final void n(e7 e7Var) {
        if (e7Var != null && e7Var.T != null) {
            o(e7Var.S);
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i7 < arrayList.size()) {
                    ((d0) arrayList.get(i7)).a((e7) e7Var.T.get(i7));
                    i7++;
                } else {
                    return;
                }
            }
        } else {
            c();
        }
    }

    public final void o(t tVar) {
        s sVar;
        d0 d0Var;
        if (tVar == null) {
            tVar = new t(".");
        }
        ArrayList arrayList = tVar.f12828e;
        this.f11835f = tVar;
        a0 a0Var = this.H;
        org.telegram.messenger.g0.r(a0Var);
        int i7 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList2 = this.h;
            if (i7 < Math.max(size, arrayList2.size())) {
                if (i7 < arrayList.size()) {
                    sVar = (s) arrayList.get(i7);
                } else {
                    sVar = null;
                }
                if (i7 < arrayList2.size()) {
                    d0Var = (d0) arrayList2.get(i7);
                } else {
                    d0Var = null;
                }
                if (d0Var == null && sVar != null) {
                    d0 d0Var2 = new d0(this);
                    if (this.f11841k0) {
                        d0Var2.f11774c.P();
                    }
                    d0Var2.b(sVar, true);
                    arrayList2.add(d0Var2);
                } else if (sVar != null) {
                    d0Var.b(sVar, true);
                } else if (d0Var != null) {
                    this.f11843n.add(d0Var);
                    arrayList2.remove(d0Var);
                    d0Var.b(null, true);
                    i7--;
                }
                i7++;
            } else {
                q();
                invalidate();
                org.telegram.messenger.g0.i3(a0Var, 360L);
                return;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 < arrayList.size()) {
                ((d0) arrayList.get(i7)).f11774c.P();
                i7++;
            } else {
                this.f11841k0 = true;
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 < arrayList.size()) {
                ((d0) arrayList.get(i7)).f11774c.R();
                i7++;
            } else {
                this.f11841k0 = false;
                org.telegram.messenger.g0.r(this.f11856w0);
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        d0 d0Var;
        e7 e7Var;
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt == this.d) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else {
                int i14 = 0;
                while (true) {
                    ArrayList arrayList = this.h;
                    if (i14 < arrayList.size()) {
                        if (childAt == ((d0) arrayList.get(i14)).f11775e) {
                            d0Var = (d0) arrayList.get(i14);
                            break;
                        }
                        i14++;
                    } else {
                        d0Var = null;
                        break;
                    }
                }
                if (d0Var != null && (e7Var = d0Var.f11783n) != null && (i11 = e7Var.f11904k0) > 0 && (i12 = e7Var.f11906l0) > 0) {
                    if (e7Var.Q % 90 == 1) {
                        i12 = i11;
                        i11 = i12;
                    }
                    float f10 = i11;
                    float f11 = i12;
                    float min = Math.min(1.0f, Math.max(f10 / size, f11 / size2));
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (f10 * min), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (f11 * min), 1073741824));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                }
            }
        }
    }

    public final void p() {
        boolean z9;
        CameraView cameraView = this.d;
        boolean z10 = false;
        if (cameraView != null && this.U) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f11833e != null) {
            z10 = true;
        }
        if (z9 == z10) {
            return;
        }
        if (z9) {
            this.f11833e = cameraView.getBlurRenderNode();
        } else {
            this.f11833e = null;
        }
    }

    public final void q() {
        ArrayList arrayList;
        boolean z9;
        this.f11848r = null;
        this.f11850s = null;
        int i7 = 0;
        while (true) {
            arrayList = this.h;
            if (i7 >= arrayList.size()) {
                break;
            }
            d0 d0Var = (d0) arrayList.get(i7);
            if (d0Var.f11783n == null) {
                if (this.f11848r == null) {
                    this.f11848r = d0Var;
                } else {
                    this.f11850s = d0Var;
                    break;
                }
            }
            i7++;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            d0 d0Var2 = (d0) arrayList.get(i10);
            if (d0Var2 == this.f11848r) {
                z9 = true;
            } else {
                z9 = false;
            }
            d0Var2.f11782m = z9;
        }
    }

    public void setCameraNeedsBlur(boolean z9) {
        if (this.U == z9) {
            return;
        }
        this.U = z9;
        p();
    }

    public void setCameraThumb(Drawable drawable) {
        this.R = drawable;
        invalidate();
    }

    public void setCameraThumbVisible(boolean z9) {
        this.S = z9;
        invalidate();
    }

    public void setCameraView(CameraView cameraView) {
        CameraView cameraView2 = this.d;
        if (cameraView2 != cameraView && cameraView2 != null) {
            cameraView2.unlistenDraw(new a0(this, 1));
            org.telegram.messenger.g0.E2(this.d);
            this.d = null;
            p();
        }
        this.d = cameraView;
        if (cameraView != null) {
            addView(cameraView, c8.ha.e(-1, -1, 119));
        }
        CameraView cameraView3 = this.d;
        if (cameraView3 != null) {
            cameraView3.unlistenDraw(new a0(this, 1));
        }
        this.d = cameraView;
        if (cameraView != null) {
            cameraView.listenDraw(new a0(this, 1));
        }
        p();
        invalidate();
    }

    public void setCancelGestures(Runnable runnable) {
        this.f11842l0 = runnable;
    }

    public void setMuted(boolean z9) {
        if (this.f11854v0 == z9) {
            return;
        }
        this.f11854v0 = z9;
    }

    public void setOnCameraThumbClick(Runnable runnable) {
        this.T = runnable;
    }

    public void setPlaying(boolean z9) {
        boolean z10 = this.f11852t0;
        this.f11852t0 = true;
        if (this.f11847q0 != z9) {
            this.f11847q0 = z9;
            if (!z9) {
                this.f11853u0 = getPosition();
            } else if (z10) {
                m(this.f11853u0, false);
            } else {
                this.f11846p0 = false;
            }
            if (this.f11844n0) {
                a0 a0Var = this.f11856w0;
                org.telegram.messenger.g0.r(a0Var);
                a0Var.run();
            }
        }
    }

    public void setPreview(boolean z9) {
        if (this.f11844n0 != z9) {
            this.f11844n0 = z9;
            ArrayList arrayList = this.h;
            int i7 = 0;
            if (z9) {
                org.telegram.ui.Components.x9 x9Var = this.G;
                if (x9Var != null) {
                    x9Var.d();
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((d0) arrayList.get(i10)).f11772a = i10;
                }
            }
            this.f11846p0 = false;
            this.f11853u0 = 0L;
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                d0 d0Var = (d0) obj;
                c0 c0Var = d0Var.d;
                if (c0Var != null) {
                    c0Var.setAudioEnabled(z9, true);
                    if (z9 && !this.f11847q0) {
                        d0Var.d.pause();
                    } else {
                        d0Var.d.play();
                    }
                }
            }
            a0 a0Var = this.f11856w0;
            org.telegram.messenger.g0.r(a0Var);
            if (z9) {
                this.f11845o0 = System.currentTimeMillis();
                org.telegram.messenger.g0.i3(a0Var, 1000.0f / org.telegram.messenger.g0.f22568r);
            }
        }
    }

    public void setPreviewView(y5 y5Var) {
        this.f11851s0 = y5Var;
    }

    public void setResetState(Runnable runnable) {
        this.m0 = runnable;
    }

    public void setTimelineView(fb fbVar) {
        this.f11849r0 = fbVar;
    }
}
