package hi;

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
import org.telegram.messenger.fd;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.l60;
public abstract class e0 extends FrameLayout implements l60 {
    public static final int f14191y0 = 0;
    public final int E;
    public final LinearGradient F;
    public final Matrix G;
    public final org.telegram.ui.Components.u9 H;
    public final a0 I;
    public final org.telegram.ui.Components.u5 J;
    public final org.telegram.ui.Components.u5[] K;
    public final org.telegram.ui.Components.u5 L;
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
    public final FrameLayout f14192a;
    public float f14193a0;
    public final fi.b f14194b;
    public float f14195b0;
    public final a6 f14196c;
    public float f14197c0;
    public CameraView d;
    public float f14198d0;
    public Object f14199e;
    public float f14200e0;
    public t f14201f;
    public boolean f14202f0;
    public boolean f14203g0;
    public final ArrayList h;
    public d0 f14204h0;
    public d0 f14205i0;
    public a0 f14206j0;
    public d0 f14207k0;
    public boolean f14208l0;
    public Runnable m0;
    public final ArrayList f14209n;
    public Runnable f14210n0;
    public boolean f14211o0;
    public long f14212p0;
    public boolean f14213q0;
    public d0 f14214r;
    public boolean f14215r0;
    public d0 f14216s;
    public cb f14217s0;
    public x5 f14218t0;
    public boolean f14219u0;
    public long f14220v0;
    public final Paint f14221w;
    public boolean f14222w0;
    public final Path f14223x;
    public final a0 f14224x0;
    public final float[] f14225y;

    public e0(Context context, org.telegram.ui.Components.u9 u9Var, FrameLayout frameLayout, fi.b bVar) {
        super(context);
        this.f14196c = new a6(new a0(this, 1));
        this.f14201f = new t(".");
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.f14209n = new ArrayList();
        Paint paint = new Paint(1);
        this.f14221w = paint;
        this.f14223x = new Path();
        this.f14225y = new float[8];
        this.I = new a0(this, 2);
        er erVar = er.h;
        this.J = new org.telegram.ui.Components.u5(this, 0L, 320L, erVar);
        this.K = new org.telegram.ui.Components.u5[]{new org.telegram.ui.Components.u5(this, 0L, 320L, erVar), new org.telegram.ui.Components.u5(this, 0L, 320L, erVar), new org.telegram.ui.Components.u5(this, 0L, 320L, erVar), new org.telegram.ui.Components.u5(this, 0L, 320L, erVar), new org.telegram.ui.Components.u5(this, 0L, 320L, erVar)};
        this.L = new org.telegram.ui.Components.u5(this, 0L, 320L, erVar);
        this.M = new float[5];
        this.N = new float[5];
        this.Q = new RectF();
        this.R = new Path();
        this.T = true;
        this.f14215r0 = true;
        this.f14219u0 = true;
        this.f14224x0 = new a0(this, 3);
        this.H = u9Var;
        this.f14192a = frameLayout;
        this.f14194b = bVar;
        setBackgroundColor(-14737633);
        d0 d0Var = new d0(this);
        d0Var.b((s) this.f14201f.f15124e.get(0), false);
        d0Var.f14082m = true;
        if (this.f14208l0) {
            d0Var.f14074c.P();
        }
        arrayList.add(d0Var);
        this.f14214r = d0Var;
        this.f14216s = null;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(8.0f));
        int L = org.telegram.messenger.g0.L(300.0f);
        this.E = L;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{0, -1, -1, 0}, new float[]{0.0f, 0.2f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
        this.F = linearGradient;
        this.G = new Matrix();
        paint.setShader(linearGradient);
        setWillNotDraw(false);
    }

    public static void a(e0 e0Var, RectF rectF, s sVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        int measuredWidth = e0Var.getMeasuredWidth();
        int measuredHeight = e0Var.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = org.telegram.messenger.g0.f23611q;
            int i7 = point.x;
            measuredHeight = point.y;
            measuredWidth = i7;
        }
        e0Var.k(rectF, sVar);
        float f10 = rectF.left;
        boolean z13 = false;
        if (f10 <= 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f11 = rectF.top;
        if (f11 <= 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        float f12 = measuredWidth;
        if (rectF.right >= f12) {
            z12 = true;
        } else {
            z12 = false;
        }
        float f13 = measuredHeight;
        if (rectF.bottom >= f13) {
            z13 = true;
        }
        if (z10 && z12 && !z11 && !z13) {
            rectF.offset(0.0f, f13 - f11);
        } else if (z11 && z13 && !z10 && !z12) {
            rectF.offset(0.0f, f12 - f10);
        } else {
            if (z12 && !z10) {
                rectF.offset(rectF.width(), 0.0f);
            }
            if (z13 && !z11) {
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
            canvas.drawColor(org.telegram.ui.ActionBar.j6.r1(drawable.getAlpha() * f10, -16777216));
        }
        canvas.restore();
    }

    public final boolean b() {
        if (this.f14204h0 == null) {
            return false;
        }
        this.f14204h0 = null;
        this.f14202f0 = false;
        invalidate();
        a0 a0Var = this.f14206j0;
        if (a0Var != null) {
            org.telegram.messenger.g0.r(a0Var);
            this.f14206j0 = null;
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
        org.telegram.ui.Components.u9 u9Var;
        float f14;
        float f15;
        float f16;
        float f17;
        d0 d0Var;
        float f18;
        int i7;
        if (this.O != null && Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            RenderNode d2 = n2.a0.d(this.O);
            d2.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = d2.beginRecording();
        } else {
            recordingCanvas = canvas;
        }
        super.dispatchDraw(recordingCanvas);
        boolean j3 = j();
        org.telegram.ui.Components.u5 u5Var = this.J;
        org.telegram.ui.Components.u5[] u5VarArr = this.K;
        float f19 = 0.0f;
        if (!j3 && !this.f14203g0 && !this.f14202f0) {
            float f20 = u5Var.f39900c;
            t tVar = this.f14201f;
            if (f20 == tVar.f15123c && u5VarArr[0].f39900c == tVar.d[0]) {
                a6 a6Var = this.f14196c;
                if (!a6Var.f13875b && a6Var.d.f39900c <= 0.0f) {
                    setCameraNeedsBlur(false);
                    i(canvas);
                    return;
                }
            }
        }
        if (this.f14211o0) {
            setCameraNeedsBlur(false);
        }
        recordingCanvas.drawColor(-14737633);
        float d10 = this.L.d(this.f14202f0);
        float e10 = u5Var.e(false, this.f14201f.f15123c);
        int i10 = 0;
        while (true) {
            d = e10;
            int i11 = (i10 > Math.ceil(d) ? 1 : (i10 == Math.ceil(d) ? 0 : -1));
            fArr = this.N;
            fArr2 = this.M;
            if (i11 >= 0) {
                break;
            }
            fArr2[i10] = getMeasuredWidth();
            fArr[i10] = 0.0f;
            i10++;
        }
        int i12 = this.f14201f.f15123c;
        while (true) {
            f10 = 1.0f;
            if (i12 >= u5VarArr.length) {
                break;
            }
            u5VarArr[i12].e(false, 1.0f);
            i12++;
        }
        int i13 = 0;
        boolean z10 = false;
        float f21 = 0.0f;
        while (true) {
            arrayList = this.h;
            f11 = f10;
            int size = arrayList.size();
            f12 = f19;
            rectF = this.Q;
            if (i13 >= size) {
                break;
            }
            d0 d0Var2 = (d0) arrayList.get(i13);
            s sVar = d0Var2.h;
            int i14 = sVar.f15013c;
            float f22 = d10;
            int i15 = sVar.f15012b;
            float f23 = e10;
            org.telegram.ui.Components.u5[] u5VarArr2 = u5VarArr;
            float e11 = u5VarArr[i14].e(false, sVar.f15011a.d[i14]);
            if (this.f14203g0 || this.f14202f0) {
                i7 = i14;
                org.telegram.messenger.g0.Z1(d0Var2.f14079j, d0Var2.f14080k, d0Var2.f14081l, rectF);
            } else {
                i7 = i14;
                rectF.set((getMeasuredWidth() / e11) * i15, (getMeasuredHeight() / f23) * i14, (getMeasuredWidth() / e11) * (i15 + 1), (getMeasuredHeight() / f23) * (i7 + 1));
            }
            fArr2[i7] = Math.min(fArr2[i7], rectF.left);
            fArr[i7] = Math.max(fArr[i7], rectF.right);
            f21 = Math.max(f21, rectF.bottom);
            if (f22 <= f12 || d0Var2 != this.f14205i0) {
                if (this.f14211o0 && d0Var2.d != null) {
                    z10 = true;
                }
                e(recordingCanvas, rectF, d0Var2);
            }
            i13++;
            f10 = f11;
            f19 = f12;
            d10 = f22;
            e10 = f23;
            u5VarArr = u5VarArr2;
        }
        float f24 = d10;
        float f25 = e10;
        org.telegram.ui.Components.u5[] u5VarArr3 = u5VarArr;
        int i16 = 0;
        while (true) {
            ArrayList arrayList2 = this.f14209n;
            if (i16 >= arrayList2.size()) {
                break;
            }
            d0 d0Var3 = (d0) arrayList2.get(i16);
            s sVar2 = d0Var3.h;
            int i17 = sVar2.f15013c;
            int i18 = sVar2.f15012b;
            org.telegram.ui.Components.u5 u5Var2 = u5VarArr3[i17];
            int[] iArr = this.f14201f.d;
            int i19 = i16;
            if (i17 >= iArr.length) {
                f18 = f11;
            } else {
                f18 = iArr[i17];
            }
            float e12 = u5Var2.e(false, f18);
            rectF.set((getMeasuredWidth() / e12) * i18, (getMeasuredHeight() / f25) * i17, (getMeasuredWidth() / e12) * (i18 + 1), (i17 + 1) * (getMeasuredHeight() / f25));
            fArr2[i17] = Math.min(fArr2[i17], rectF.left);
            fArr[i17] = Math.max(fArr[i17], rectF.right);
            f21 = Math.max(f21, rectF.bottom);
            if (this.f14211o0 && d0Var3.d != null) {
                z10 = true;
            }
            e(recordingCanvas, rectF, d0Var3);
            i16 = i19 + 1;
        }
        if (!this.f14202f0) {
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
        if (f24 > f13 && (d0Var = this.f14205i0) != null) {
            s sVar3 = d0Var.h;
            int i21 = sVar3.f15013c;
            int i22 = sVar3.f15012b;
            float e13 = u5VarArr3[i21].e(false, this.f14201f.d[i21]);
            if (this.f14202f0) {
                org.telegram.messenger.g0.Z1(d0Var.f14079j, d0Var.f14080k, d0Var.f14081l, rectF);
            } else {
                rectF.set((getMeasuredWidth() / e13) * i22, (getMeasuredHeight() / f25) * i21, (getMeasuredWidth() / e13) * (i22 + 1), (getMeasuredHeight() / f25) * (i21 + 1));
            }
            recordingCanvas.save();
            recordingCanvas.translate(org.telegram.messenger.g0.T1(this.f14195b0, this.f14198d0, d0Var.f14081l) * f24, org.telegram.messenger.g0.T1(this.f14197c0, this.f14200e0, d0Var.f14081l) * f24);
            e(recordingCanvas, rectF, d0Var);
            recordingCanvas.restore();
        }
        for (int i23 = 0; i23 < arrayList.size(); i23++) {
            d0 d0Var4 = (d0) arrayList.get(i23);
            s sVar4 = d0Var4.h;
            float e14 = d0Var4.f14073b.e(false, 0.0f);
            if (e14 > 0.0f) {
                int i24 = sVar4.f15013c;
                int i25 = sVar4.f15013c;
                int i26 = sVar4.f15012b;
                float e15 = u5VarArr3[i24].e(false, sVar4.f15011a.d[i24]);
                if (!this.f14203g0 && !this.f14202f0) {
                    rectF.set((getMeasuredWidth() / e15) * i26, (getMeasuredHeight() / f25) * i25, (getMeasuredWidth() / e15) * (i26 + 1), (getMeasuredHeight() / f25) * (i25 + 1));
                } else {
                    org.telegram.messenger.g0.Z1(d0Var4.f14079j, d0Var4.f14080k, d0Var4.f14081l, rectF);
                }
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(rectF);
                rectF2.inset(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
                Matrix matrix = this.G;
                matrix.reset();
                float f26 = rectF.left;
                int i27 = this.E;
                int i28 = i27 * i27;
                matrix.postTranslate(org.telegram.messenger.g0.T1(((float) Math.sqrt(i28 + i28)) * (-1.4f), (float) Math.sqrt((rectF.height() * rectF.height()) + (rectF.width() * rectF.width())), f11 - e14) + f26, 0.0f);
                matrix.postRotate(-25.0f);
                this.F.setLocalMatrix(matrix);
                Paint paint = this.f14221w;
                paint.setAlpha(255);
                Path path = this.f14223x;
                path.rewind();
                s sVar5 = d0Var4.h;
                if (sVar5.f15012b == 0 && sVar5.f15013c == 0) {
                    f14 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    f14 = 0.0f;
                }
                float[] fArr3 = this.f14225y;
                fArr3[1] = f14;
                fArr3[0] = f14;
                s sVar6 = d0Var4.h;
                if (sVar6.f15012b == sVar6.f15011a.f15122b - 1 && sVar6.f15013c == 0) {
                    f15 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    f15 = 0.0f;
                }
                fArr3[2] = f15;
                fArr3[1] = f15;
                s sVar7 = d0Var4.h;
                int i29 = sVar7.f15012b;
                t tVar2 = sVar7.f15011a;
                if (i29 == tVar2.f15122b - 1 && sVar7.f15013c == tVar2.f15123c - 1) {
                    f16 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    f16 = 0.0f;
                }
                fArr3[4] = f16;
                fArr3[3] = f16;
                s sVar8 = d0Var4.h;
                if (sVar8.f15012b == 0 && sVar8.f15013c == sVar8.f15011a.f15123c - 1) {
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
        if (z10 && (u9Var = this.H) != null) {
            u9Var.d();
        }
        i(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: hi.e0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.d && org.telegram.messenger.g0.m0) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(android.graphics.Canvas r9, android.graphics.RectF r10, hi.d0 r11) {
        throw new UnsupportedOperationException("Method not decompiled: hi.e0.e(android.graphics.Canvas, android.graphics.RectF, hi.d0):void");
    }

    @Override
    public final void f(RectF rectF) {
        d0 d0Var = this.f14207k0;
        if (d0Var != null) {
            s sVar = d0Var.h;
            t tVar = sVar.f15011a;
            int i7 = sVar.f15012b;
            int i10 = sVar.f15013c;
            float f10 = tVar.f15123c;
            float e10 = this.K[i10].e(false, tVar.d[i10]);
            rectF.set((getMeasuredWidth() / e10) * i7, (getMeasuredHeight() / f10) * i10, (getMeasuredWidth() / e10) * (i7 + 1), (getMeasuredHeight() / f10) * (i10 + 1));
            return;
        }
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    public final void g(float f10, Canvas canvas, RectF rectF, View view) {
        a6 a6Var;
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
                canvas.drawColor(org.telegram.ui.ActionBar.j6.r1(view.getAlpha() * f10, -16777216));
            }
            canvas.restore();
            if (view == this.d && (a6Var = this.f14196c) != null) {
                Paint paint = a6Var.f13880i;
                org.telegram.ui.Components.u5[] u5VarArr = a6Var.h;
                org.telegram.ui.Components.u5[] u5VarArr2 = a6Var.f13879g;
                Path path = a6Var.f13881j;
                z5 z5Var = a6Var.f13876c;
                if (z5Var != null && z5Var.f15504b.length > 0) {
                    float d = a6Var.d.d(a6Var.f13875b);
                    int i10 = 0;
                    float e10 = a6Var.f13877e.e(false, a6Var.f13876c.f15505c);
                    float width = (rectF.width() * e10) + rectF.left;
                    float e11 = a6Var.f13878f.e(false, a6Var.f13876c.d);
                    float f11 = rectF.top;
                    float T1 = org.telegram.messenger.g0.T1(0.5f, 1.1f, d);
                    canvas.save();
                    canvas.scale(T1, T1, width, (rectF.height() * e11) + f11);
                    if (d > 0.0f) {
                        path.rewind();
                        int min = Math.min(4, a6Var.f13876c.f15504b.length);
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
                            z5 z5Var2 = a6Var.f13876c;
                            PointF[] pointFArr = z5Var2.f15504b;
                            PointF pointF = pointFArr[i12];
                            int i14 = min;
                            PointF pointF2 = pointFArr[i11];
                            org.telegram.ui.Components.u5[] u5VarArr3 = u5VarArr;
                            PointF pointF3 = pointFArr[i7];
                            org.telegram.ui.Components.u5[] u5VarArr4 = u5VarArr2;
                            float f12 = d;
                            float width2 = (rectF.width() * (u5VarArr4[i12].e(false, pointF.x - z5Var2.f15505c) + e10)) + rectF.left;
                            float height = (rectF.height() * (u5VarArr3[i12].e(false, pointF.y - a6Var.f13876c.d) + e11)) + rectF.top;
                            float width3 = (rectF.width() * (u5VarArr4[i11].e(false, pointF2.x - a6Var.f13876c.f15505c) + e10)) + rectF.left;
                            float height2 = (rectF.height() * (u5VarArr3[i11].e(false, pointF2.y - a6Var.f13876c.d) + e11)) + rectF.top;
                            float width4 = (rectF.width() * (u5VarArr4[i7].e(false, pointF3.x - a6Var.f13876c.f15505c) + e10)) + rectF.left;
                            float f13 = rectF.top;
                            float height3 = rectF.height();
                            path.moveTo(((width2 - width3) * 0.18f) + width3, ((height - height2) * 0.18f) + height2);
                            path.lineTo(width3, height2);
                            path.lineTo(((width4 - width3) * 0.18f) + width3, ((((height3 * (u5VarArr3[i7].e(false, pointF3.y - a6Var.f13876c.d) + e11)) + f13) - height2) * 0.18f) + height2);
                            u5VarArr2 = u5VarArr4;
                            i10 = 0;
                            i11 = i13;
                            min = i14;
                            u5VarArr = u5VarArr3;
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

    public Object getBlurRenderNode() {
        if (this.O == null && Build.VERSION.SDK_INT >= 31) {
            this.O = new RenderNode("CameraViewRenderNode");
            RenderNode renderNode = new RenderNode("CameraViewRenderNodeBlur");
            this.P = renderNode;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), fd.c()));
        }
        return this.P;
    }

    public ArrayList<d7> getContent() {
        ArrayList<d7> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            d7 d7Var = ((d0) obj).f14083n;
            if (d7Var != null) {
                arrayList.add(d7Var);
            }
        }
        return arrayList;
    }

    public d0 getCurrent() {
        return this.f14214r;
    }

    public long getDuration() {
        d0 mainPart;
        d7 d7Var;
        if (!this.f14211o0 || (mainPart = getMainPart()) == null || (d7Var = mainPart.f14083n) == null) {
            return 1L;
        }
        return Math.max(Math.min((d7Var.W - d7Var.V) * ((float) d7Var.f14141h0), 59500L), 1L);
    }

    public int getFilledCount() {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 < arrayList.size()) {
                if (((d0) arrayList.get(i7)).f14083n != null) {
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
        return this.f14201f;
    }

    public d0 getMainPart() {
        d0 d0Var = null;
        if (!this.f14211o0) {
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
            d7 d7Var = d0Var2.f14083n;
            if (d7Var != null && d7Var.K) {
                long j10 = d7Var.f14141h0;
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
        return this.f14216s;
    }

    public ArrayList<Integer> getOrder() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.h;
            if (i7 < arrayList2.size()) {
                i7 = com.google.android.gms.internal.vision.e2.f(((d0) arrayList2.get(i7)).f14072a, i7, 1, arrayList);
            } else {
                return arrayList;
            }
        }
    }

    public long getPosition() {
        if (!this.f14211o0) {
            return 0L;
        }
        if (!this.f14215r0) {
            return this.f14220v0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f14212p0;
        if (j3 > getDuration()) {
            this.f14212p0 = currentTimeMillis - (j3 % getDuration());
        }
        return j3;
    }

    public long getPositionWithOffset() {
        long j3 = 0;
        if (!this.f14211o0) {
            return 0L;
        }
        getPosition();
        d0 mainPart = getMainPart();
        if (mainPart != null) {
            d7 d7Var = mainPart.f14083n;
            j3 = d7Var.X + (d7Var.V * ((float) d7Var.f14141h0));
        }
        return getPosition() + j3;
    }

    public int getTotalCount() {
        return this.h.size();
    }

    @Override
    public final void h(Canvas canvas, float f10) {
        d0 d0Var = this.f14207k0;
        if (d0Var != null) {
            s sVar = d0Var.h;
            t tVar = sVar.f15011a;
            int i7 = sVar.f15012b;
            int i10 = sVar.f15013c;
            float f11 = tVar.f15123c;
            float e10 = this.K[i10].e(false, tVar.d[i10]);
            float measuredWidth = (getMeasuredWidth() / e10) * i7;
            float measuredHeight = (getMeasuredHeight() / f11) * i10;
            float measuredWidth2 = (getMeasuredWidth() / e10) * (i7 + 1);
            float measuredHeight2 = (getMeasuredHeight() / f11) * (i10 + 1);
            RectF rectF = this.Q;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            e(canvas, rectF, this.f14207k0);
        }
    }

    public final void i(Canvas canvas) {
        if (this.O != null && Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            RenderNode d = n2.a0.d(this.O);
            d.endRecording();
            canvas.drawRenderNode(d);
            Object obj = this.P;
            if (obj != null) {
                RenderNode d2 = n2.a0.d(obj);
                d2.setPosition(0, 0, getWidth(), getHeight());
                d2.beginRecording().drawRenderNode(d);
                d2.endRecording();
            }
        }
    }

    public final boolean j() {
        if (this.f14201f.f15124e.size() > 1) {
            return true;
        }
        return false;
    }

    public final void k(RectF rectF, s sVar) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = org.telegram.messenger.g0.f23611q;
            int i7 = point.x;
            measuredHeight = point.y;
            measuredWidth = i7;
        }
        float f10 = measuredWidth;
        t tVar = sVar.f15011a;
        int[] iArr = tVar.d;
        int i10 = sVar.f15013c;
        int i11 = iArr[i10];
        int i12 = sVar.f15012b;
        float f11 = measuredHeight;
        int i13 = tVar.f15123c;
        rectF.set((f10 / i11) * i12, (f11 / i13) * i10, (f10 / i11) * (i12 + 1), (f11 / i13) * (i10 + 1));
    }

    public final boolean l(d7 d7Var) {
        if (d7Var.K) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    break;
                }
                Object obj = arrayList.get(i7);
                i7++;
                d7 d7Var2 = ((d0) obj).f14083n;
                if (d7Var2 != null && d7Var2.K && d7Var2.P > 0.0f) {
                    d7Var.P = 0.0f;
                    break;
                }
            }
        }
        d0 d0Var = this.f14214r;
        if (d0Var != null) {
            d0Var.a(d7Var);
        }
        q();
        requestLayout();
        if (this.f14214r != null) {
            return false;
        }
        return true;
    }

    public final void m(long j3, boolean z10) {
        if (this.f14211o0) {
            long k10 = Utilities.k(j3, getDuration(), 0L);
            if (!this.f14215r0) {
                this.f14220v0 = k10;
            }
            this.f14212p0 = System.currentTimeMillis() - k10;
            this.f14213q0 = z10;
            if (this.f14211o0) {
                a0 a0Var = this.f14224x0;
                org.telegram.messenger.g0.r(a0Var);
                a0Var.run();
            }
        }
    }

    public final void n(d7 d7Var) {
        if (d7Var != null && d7Var.T != null) {
            o(d7Var.S);
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i7 < arrayList.size()) {
                    ((d0) arrayList.get(i7)).a((d7) d7Var.T.get(i7));
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
        ArrayList arrayList = tVar.f15124e;
        this.f14201f = tVar;
        a0 a0Var = this.I;
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
                    if (this.f14208l0) {
                        d0Var2.f14074c.P();
                    }
                    d0Var2.b(sVar, true);
                    arrayList2.add(d0Var2);
                } else if (sVar != null) {
                    d0Var.b(sVar, true);
                } else if (d0Var != null) {
                    this.f14209n.add(d0Var);
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
                ((d0) arrayList.get(i7)).f14074c.P();
                i7++;
            } else {
                this.f14208l0 = true;
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
                ((d0) arrayList.get(i7)).f14074c.R();
                i7++;
            } else {
                this.f14208l0 = false;
                org.telegram.messenger.g0.r(this.f14224x0);
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        d0 d0Var;
        d7 d7Var;
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
                        if (childAt == ((d0) arrayList.get(i14)).f14075e) {
                            d0Var = (d0) arrayList.get(i14);
                            break;
                        }
                        i14++;
                    } else {
                        d0Var = null;
                        break;
                    }
                }
                if (d0Var != null && (d7Var = d0Var.f14083n) != null && (i11 = d7Var.f14147k0) > 0 && (i12 = d7Var.f14149l0) > 0) {
                    if (d7Var.Q % 90 == 1) {
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
        boolean z10;
        CameraView cameraView = this.d;
        boolean z11 = false;
        if (cameraView != null && this.V) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f14199e != null) {
            z11 = true;
        }
        if (z10 == z11) {
            return;
        }
        if (z10) {
            this.f14199e = cameraView.getBlurRenderNode();
        } else {
            this.f14199e = null;
        }
    }

    public final void q() {
        ArrayList arrayList;
        boolean z10;
        this.f14214r = null;
        this.f14216s = null;
        int i7 = 0;
        while (true) {
            arrayList = this.h;
            if (i7 >= arrayList.size()) {
                break;
            }
            d0 d0Var = (d0) arrayList.get(i7);
            if (d0Var.f14083n == null) {
                if (this.f14214r == null) {
                    this.f14214r = d0Var;
                } else {
                    this.f14216s = d0Var;
                    break;
                }
            }
            i7++;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            d0 d0Var2 = (d0) arrayList.get(i10);
            if (d0Var2 == this.f14214r) {
                z10 = true;
            } else {
                z10 = false;
            }
            d0Var2.f14082m = z10;
        }
    }

    public void setCameraNeedsBlur(boolean z10) {
        if (this.V == z10) {
            return;
        }
        this.V = z10;
        p();
    }

    public void setCameraThumb(Drawable drawable) {
        this.S = drawable;
        invalidate();
    }

    public void setCameraThumbVisible(boolean z10) {
        this.T = z10;
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
            addView(cameraView, c8.ja.e(-1, -1, 119));
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
        this.m0 = runnable;
    }

    public void setMuted(boolean z10) {
        if (this.f14222w0 == z10) {
            return;
        }
        this.f14222w0 = z10;
    }

    public void setOnCameraThumbClick(Runnable runnable) {
        this.U = runnable;
    }

    public void setPlaying(boolean z10) {
        boolean z11 = this.f14219u0;
        this.f14219u0 = true;
        if (this.f14215r0 != z10) {
            this.f14215r0 = z10;
            if (!z10) {
                this.f14220v0 = getPosition();
            } else if (z11) {
                m(this.f14220v0, false);
            } else {
                this.f14213q0 = false;
            }
            if (this.f14211o0) {
                a0 a0Var = this.f14224x0;
                org.telegram.messenger.g0.r(a0Var);
                a0Var.run();
            }
        }
    }

    public void setPreview(boolean z10) {
        if (this.f14211o0 != z10) {
            this.f14211o0 = z10;
            ArrayList arrayList = this.h;
            int i7 = 0;
            if (z10) {
                org.telegram.ui.Components.u9 u9Var = this.H;
                if (u9Var != null) {
                    u9Var.d();
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((d0) arrayList.get(i10)).f14072a = i10;
                }
            }
            this.f14213q0 = false;
            this.f14220v0 = 0L;
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                d0 d0Var = (d0) obj;
                c0 c0Var = d0Var.d;
                if (c0Var != null) {
                    c0Var.setAudioEnabled(z10, true);
                    if (z10 && !this.f14215r0) {
                        d0Var.d.pause();
                    } else {
                        d0Var.d.play();
                    }
                }
            }
            a0 a0Var = this.f14224x0;
            org.telegram.messenger.g0.r(a0Var);
            if (z10) {
                this.f14212p0 = System.currentTimeMillis();
                org.telegram.messenger.g0.i3(a0Var, 1000.0f / org.telegram.messenger.g0.f23612r);
            }
        }
    }

    public void setPreviewView(x5 x5Var) {
        this.f14218t0 = x5Var;
    }

    public void setResetState(Runnable runnable) {
        this.f14210n0 = runnable;
    }

    public void setTimelineView(cb cbVar) {
        this.f14217s0 = cbVar;
    }
}
