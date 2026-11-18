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
import org.telegram.messenger.ed;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.x60;
public abstract class f0 extends FrameLayout implements x60 {
    public static final int f14606y0 = 0;
    public final int E;
    public final LinearGradient F;
    public final Matrix G;
    public final org.telegram.ui.Components.ca H;
    public final b0 I;
    public final org.telegram.ui.Components.c6 J;
    public final org.telegram.ui.Components.c6[] K;
    public final org.telegram.ui.Components.c6 L;
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
    public final FrameLayout f14607a;
    public float f14608a0;
    public final fi.b f14609b;
    public float f14610b0;
    public final z5 f14611c;
    public float f14612c0;
    public CameraView d;
    public float f14613d0;
    public Object f14614e;
    public float f14615e0;
    public u f14616f;
    public boolean f14617f0;
    public boolean f14618g0;
    public final ArrayList h;
    public e0 f14619h0;
    public e0 f14620i0;
    public b0 f14621j0;
    public e0 f14622k0;
    public boolean f14623l0;
    public Runnable m0;
    public final ArrayList f14624n;
    public Runnable f14625n0;
    public boolean f14626o0;
    public long f14627p0;
    public boolean f14628q0;
    public e0 f14629r;
    public boolean f14630r0;
    public e0 f14631s;
    public db f14632s0;
    public w5 f14633t0;
    public boolean f14634u0;
    public long f14635v0;
    public final Paint f14636w;
    public boolean f14637w0;
    public final Path f14638x;
    public final b0 f14639x0;
    public final float[] f14640y;

    public f0(Context context, org.telegram.ui.Components.ca caVar, FrameLayout frameLayout, fi.b bVar) {
        super(context);
        this.f14611c = new z5(new b0(this, 1));
        this.f14616f = new u(".");
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.f14624n = new ArrayList();
        Paint paint = new Paint(1);
        this.f14636w = paint;
        this.f14638x = new Path();
        this.f14640y = new float[8];
        this.I = new b0(this, 2);
        lr lrVar = lr.h;
        this.J = new org.telegram.ui.Components.c6(this, 0L, 320L, lrVar);
        this.K = new org.telegram.ui.Components.c6[]{new org.telegram.ui.Components.c6(this, 0L, 320L, lrVar), new org.telegram.ui.Components.c6(this, 0L, 320L, lrVar), new org.telegram.ui.Components.c6(this, 0L, 320L, lrVar), new org.telegram.ui.Components.c6(this, 0L, 320L, lrVar), new org.telegram.ui.Components.c6(this, 0L, 320L, lrVar)};
        this.L = new org.telegram.ui.Components.c6(this, 0L, 320L, lrVar);
        this.M = new float[5];
        this.N = new float[5];
        this.Q = new RectF();
        this.R = new Path();
        this.T = true;
        this.f14630r0 = true;
        this.f14634u0 = true;
        this.f14639x0 = new b0(this, 3);
        this.H = caVar;
        this.f14607a = frameLayout;
        this.f14609b = bVar;
        setBackgroundColor(-14737633);
        e0 e0Var = new e0(this);
        e0Var.b((t) this.f14616f.f15509e.get(0), false);
        e0Var.f14516m = true;
        if (this.f14623l0) {
            e0Var.f14508c.P();
        }
        arrayList.add(e0Var);
        this.f14629r = e0Var;
        this.f14631s = null;
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

    public static void a(f0 f0Var, RectF rectF, t tVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        int measuredWidth = f0Var.getMeasuredWidth();
        int measuredHeight = f0Var.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = org.telegram.messenger.g0.f24118q;
            int i7 = point.x;
            measuredHeight = point.y;
            measuredWidth = i7;
        }
        f0Var.k(rectF, tVar);
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
            canvas.drawColor(org.telegram.ui.ActionBar.n6.r1(drawable.getAlpha() * f10, -16777216));
        }
        canvas.restore();
    }

    public final boolean b() {
        if (this.f14619h0 == null) {
            return false;
        }
        this.f14619h0 = null;
        this.f14617f0 = false;
        invalidate();
        b0 b0Var = this.f14621j0;
        if (b0Var != null) {
            org.telegram.messenger.g0.r(b0Var);
            this.f14621j0 = null;
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
            ((e0) obj).a(null);
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
        org.telegram.ui.Components.ca caVar;
        float f14;
        float f15;
        float f16;
        float f17;
        e0 e0Var;
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
        org.telegram.ui.Components.c6 c6Var = this.J;
        org.telegram.ui.Components.c6[] c6VarArr = this.K;
        float f19 = 0.0f;
        if (!j3 && !this.f14618g0 && !this.f14617f0) {
            float f20 = c6Var.f33892c;
            u uVar = this.f14616f;
            if (f20 == uVar.f15508c && c6VarArr[0].f33892c == uVar.d[0]) {
                z5 z5Var = this.f14611c;
                if (!z5Var.f15810b && z5Var.d.f33892c <= 0.0f) {
                    setCameraNeedsBlur(false);
                    i(canvas);
                    return;
                }
            }
        }
        if (this.f14626o0) {
            setCameraNeedsBlur(false);
        }
        recordingCanvas.drawColor(-14737633);
        float d10 = this.L.d(this.f14617f0);
        float e10 = c6Var.e(false, this.f14616f.f15508c);
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
        int i12 = this.f14616f.f15508c;
        while (true) {
            f10 = 1.0f;
            if (i12 >= c6VarArr.length) {
                break;
            }
            c6VarArr[i12].e(false, 1.0f);
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
            e0 e0Var2 = (e0) arrayList.get(i13);
            t tVar = e0Var2.h;
            int i14 = tVar.f15401c;
            float f22 = d10;
            int i15 = tVar.f15400b;
            float f23 = e10;
            org.telegram.ui.Components.c6[] c6VarArr2 = c6VarArr;
            float e11 = c6VarArr[i14].e(false, tVar.f15399a.d[i14]);
            if (this.f14618g0 || this.f14617f0) {
                i7 = i14;
                org.telegram.messenger.g0.Z1(e0Var2.f14513j, e0Var2.f14514k, e0Var2.f14515l, rectF);
            } else {
                i7 = i14;
                rectF.set((getMeasuredWidth() / e11) * i15, (getMeasuredHeight() / f23) * i14, (getMeasuredWidth() / e11) * (i15 + 1), (getMeasuredHeight() / f23) * (i7 + 1));
            }
            fArr2[i7] = Math.min(fArr2[i7], rectF.left);
            fArr[i7] = Math.max(fArr[i7], rectF.right);
            f21 = Math.max(f21, rectF.bottom);
            if (f22 <= f12 || e0Var2 != this.f14620i0) {
                if (this.f14626o0 && e0Var2.d != null) {
                    z10 = true;
                }
                e(recordingCanvas, rectF, e0Var2);
            }
            i13++;
            f10 = f11;
            f19 = f12;
            d10 = f22;
            e10 = f23;
            c6VarArr = c6VarArr2;
        }
        float f24 = d10;
        float f25 = e10;
        org.telegram.ui.Components.c6[] c6VarArr3 = c6VarArr;
        int i16 = 0;
        while (true) {
            ArrayList arrayList2 = this.f14624n;
            if (i16 >= arrayList2.size()) {
                break;
            }
            e0 e0Var3 = (e0) arrayList2.get(i16);
            t tVar2 = e0Var3.h;
            int i17 = tVar2.f15401c;
            int i18 = tVar2.f15400b;
            org.telegram.ui.Components.c6 c6Var2 = c6VarArr3[i17];
            int[] iArr = this.f14616f.d;
            int i19 = i16;
            if (i17 >= iArr.length) {
                f18 = f11;
            } else {
                f18 = iArr[i17];
            }
            float e12 = c6Var2.e(false, f18);
            rectF.set((getMeasuredWidth() / e12) * i18, (getMeasuredHeight() / f25) * i17, (getMeasuredWidth() / e12) * (i18 + 1), (i17 + 1) * (getMeasuredHeight() / f25));
            fArr2[i17] = Math.min(fArr2[i17], rectF.left);
            fArr[i17] = Math.max(fArr[i17], rectF.right);
            f21 = Math.max(f21, rectF.bottom);
            if (this.f14626o0 && e0Var3.d != null) {
                z10 = true;
            }
            e(recordingCanvas, rectF, e0Var3);
            i16 = i19 + 1;
        }
        if (!this.f14617f0) {
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
        if (f24 > f13 && (e0Var = this.f14620i0) != null) {
            t tVar3 = e0Var.h;
            int i21 = tVar3.f15401c;
            int i22 = tVar3.f15400b;
            float e13 = c6VarArr3[i21].e(false, this.f14616f.d[i21]);
            if (this.f14617f0) {
                org.telegram.messenger.g0.Z1(e0Var.f14513j, e0Var.f14514k, e0Var.f14515l, rectF);
            } else {
                rectF.set((getMeasuredWidth() / e13) * i22, (getMeasuredHeight() / f25) * i21, (getMeasuredWidth() / e13) * (i22 + 1), (getMeasuredHeight() / f25) * (i21 + 1));
            }
            recordingCanvas.save();
            recordingCanvas.translate(org.telegram.messenger.g0.T1(this.f14610b0, this.f14613d0, e0Var.f14515l) * f24, org.telegram.messenger.g0.T1(this.f14612c0, this.f14615e0, e0Var.f14515l) * f24);
            e(recordingCanvas, rectF, e0Var);
            recordingCanvas.restore();
        }
        for (int i23 = 0; i23 < arrayList.size(); i23++) {
            e0 e0Var4 = (e0) arrayList.get(i23);
            t tVar4 = e0Var4.h;
            float e14 = e0Var4.f14507b.e(false, 0.0f);
            if (e14 > 0.0f) {
                int i24 = tVar4.f15401c;
                int i25 = tVar4.f15401c;
                int i26 = tVar4.f15400b;
                float e15 = c6VarArr3[i24].e(false, tVar4.f15399a.d[i24]);
                if (!this.f14618g0 && !this.f14617f0) {
                    rectF.set((getMeasuredWidth() / e15) * i26, (getMeasuredHeight() / f25) * i25, (getMeasuredWidth() / e15) * (i26 + 1), (getMeasuredHeight() / f25) * (i25 + 1));
                } else {
                    org.telegram.messenger.g0.Z1(e0Var4.f14513j, e0Var4.f14514k, e0Var4.f14515l, rectF);
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
                Paint paint = this.f14636w;
                paint.setAlpha(255);
                Path path = this.f14638x;
                path.rewind();
                t tVar5 = e0Var4.h;
                if (tVar5.f15400b == 0 && tVar5.f15401c == 0) {
                    f14 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    f14 = 0.0f;
                }
                float[] fArr3 = this.f14640y;
                fArr3[1] = f14;
                fArr3[0] = f14;
                t tVar6 = e0Var4.h;
                if (tVar6.f15400b == tVar6.f15399a.f15507b - 1 && tVar6.f15401c == 0) {
                    f15 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    f15 = 0.0f;
                }
                fArr3[2] = f15;
                fArr3[1] = f15;
                t tVar7 = e0Var4.h;
                int i29 = tVar7.f15400b;
                u uVar2 = tVar7.f15399a;
                if (i29 == uVar2.f15507b - 1 && tVar7.f15401c == uVar2.f15508c - 1) {
                    f16 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    f16 = 0.0f;
                }
                fArr3[4] = f16;
                fArr3[3] = f16;
                t tVar8 = e0Var4.h;
                if (tVar8.f15400b == 0 && tVar8.f15401c == tVar8.f15399a.f15508c - 1) {
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
        if (z10 && (caVar = this.H) != null) {
            caVar.d();
        }
        i(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: hi.f0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.d && org.telegram.messenger.g0.m0) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(android.graphics.Canvas r9, android.graphics.RectF r10, hi.e0 r11) {
        throw new UnsupportedOperationException("Method not decompiled: hi.f0.e(android.graphics.Canvas, android.graphics.RectF, hi.e0):void");
    }

    @Override
    public final void f(RectF rectF) {
        e0 e0Var = this.f14622k0;
        if (e0Var != null) {
            t tVar = e0Var.h;
            u uVar = tVar.f15399a;
            int i7 = tVar.f15400b;
            int i10 = tVar.f15401c;
            float f10 = uVar.f15508c;
            float e10 = this.K[i10].e(false, uVar.d[i10]);
            rectF.set((getMeasuredWidth() / e10) * i7, (getMeasuredHeight() / f10) * i10, (getMeasuredWidth() / e10) * (i7 + 1), (getMeasuredHeight() / f10) * (i10 + 1));
            return;
        }
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    public final void g(float f10, Canvas canvas, RectF rectF, View view) {
        z5 z5Var;
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
                canvas.drawColor(org.telegram.ui.ActionBar.n6.r1(view.getAlpha() * f10, -16777216));
            }
            canvas.restore();
            if (view == this.d && (z5Var = this.f14611c) != null) {
                Paint paint = z5Var.f15815i;
                org.telegram.ui.Components.c6[] c6VarArr = z5Var.h;
                org.telegram.ui.Components.c6[] c6VarArr2 = z5Var.f15814g;
                Path path = z5Var.f15816j;
                y5 y5Var = z5Var.f15811c;
                if (y5Var != null && y5Var.f15768b.length > 0) {
                    float d = z5Var.d.d(z5Var.f15810b);
                    int i10 = 0;
                    float e10 = z5Var.f15812e.e(false, z5Var.f15811c.f15769c);
                    float width = (rectF.width() * e10) + rectF.left;
                    float e11 = z5Var.f15813f.e(false, z5Var.f15811c.d);
                    float f11 = rectF.top;
                    float T1 = org.telegram.messenger.g0.T1(0.5f, 1.1f, d);
                    canvas.save();
                    canvas.scale(T1, T1, width, (rectF.height() * e11) + f11);
                    if (d > 0.0f) {
                        path.rewind();
                        int min = Math.min(4, z5Var.f15811c.f15768b.length);
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
                            y5 y5Var2 = z5Var.f15811c;
                            PointF[] pointFArr = y5Var2.f15768b;
                            PointF pointF = pointFArr[i12];
                            int i14 = min;
                            PointF pointF2 = pointFArr[i11];
                            org.telegram.ui.Components.c6[] c6VarArr3 = c6VarArr;
                            PointF pointF3 = pointFArr[i7];
                            org.telegram.ui.Components.c6[] c6VarArr4 = c6VarArr2;
                            float f12 = d;
                            float width2 = (rectF.width() * (c6VarArr4[i12].e(false, pointF.x - y5Var2.f15769c) + e10)) + rectF.left;
                            float height = (rectF.height() * (c6VarArr3[i12].e(false, pointF.y - z5Var.f15811c.d) + e11)) + rectF.top;
                            float width3 = (rectF.width() * (c6VarArr4[i11].e(false, pointF2.x - z5Var.f15811c.f15769c) + e10)) + rectF.left;
                            float height2 = (rectF.height() * (c6VarArr3[i11].e(false, pointF2.y - z5Var.f15811c.d) + e11)) + rectF.top;
                            float width4 = (rectF.width() * (c6VarArr4[i7].e(false, pointF3.x - z5Var.f15811c.f15769c) + e10)) + rectF.left;
                            float f13 = rectF.top;
                            float height3 = rectF.height();
                            path.moveTo(((width2 - width3) * 0.18f) + width3, ((height - height2) * 0.18f) + height2);
                            path.lineTo(width3, height2);
                            path.lineTo(((width4 - width3) * 0.18f) + width3, ((((height3 * (c6VarArr3[i7].e(false, pointF3.y - z5Var.f15811c.d) + e11)) + f13) - height2) * 0.18f) + height2);
                            c6VarArr2 = c6VarArr4;
                            i10 = 0;
                            i11 = i13;
                            min = i14;
                            c6VarArr = c6VarArr3;
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
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(32.0f), ed.c()));
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
            d7 d7Var = ((e0) obj).f14517n;
            if (d7Var != null) {
                arrayList.add(d7Var);
            }
        }
        return arrayList;
    }

    public e0 getCurrent() {
        return this.f14629r;
    }

    public long getDuration() {
        e0 mainPart;
        d7 d7Var;
        if (!this.f14626o0 || (mainPart = getMainPart()) == null || (d7Var = mainPart.f14517n) == null) {
            return 1L;
        }
        return Math.max(Math.min((d7Var.W - d7Var.V) * ((float) d7Var.f14403h0), 59500L), 1L);
    }

    public int getFilledCount() {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 < arrayList.size()) {
                if (((e0) arrayList.get(i7)).f14517n != null) {
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

    public u getLayout() {
        return this.f14616f;
    }

    public e0 getMainPart() {
        e0 e0Var = null;
        if (!this.f14626o0) {
            return null;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i7 = 0;
        long j3 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            e0 e0Var2 = (e0) obj;
            d7 d7Var = e0Var2.f14517n;
            if (d7Var != null && d7Var.K) {
                long j10 = d7Var.f14403h0;
                d0 d0Var = e0Var2.d;
                if (d0Var != null && d0Var.getDuration() > 0) {
                    j10 = e0Var2.d.getDuration();
                }
                if (j10 > j3) {
                    e0Var = e0Var2;
                    j3 = j10;
                }
            }
        }
        return e0Var;
    }

    public e0 getNext() {
        return this.f14631s;
    }

    public ArrayList<Integer> getOrder() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.h;
            if (i7 < arrayList2.size()) {
                i7 = com.google.android.gms.internal.vision.e2.f(((e0) arrayList2.get(i7)).f14506a, i7, 1, arrayList);
            } else {
                return arrayList;
            }
        }
    }

    public long getPosition() {
        if (!this.f14626o0) {
            return 0L;
        }
        if (!this.f14630r0) {
            return this.f14635v0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f14627p0;
        if (j3 > getDuration()) {
            this.f14627p0 = currentTimeMillis - (j3 % getDuration());
        }
        return j3;
    }

    public long getPositionWithOffset() {
        long j3 = 0;
        if (!this.f14626o0) {
            return 0L;
        }
        getPosition();
        e0 mainPart = getMainPart();
        if (mainPart != null) {
            d7 d7Var = mainPart.f14517n;
            j3 = d7Var.X + (d7Var.V * ((float) d7Var.f14403h0));
        }
        return getPosition() + j3;
    }

    public int getTotalCount() {
        return this.h.size();
    }

    @Override
    public final void h(Canvas canvas, float f10) {
        e0 e0Var = this.f14622k0;
        if (e0Var != null) {
            t tVar = e0Var.h;
            u uVar = tVar.f15399a;
            int i7 = tVar.f15400b;
            int i10 = tVar.f15401c;
            float f11 = uVar.f15508c;
            float e10 = this.K[i10].e(false, uVar.d[i10]);
            float measuredWidth = (getMeasuredWidth() / e10) * i7;
            float measuredHeight = (getMeasuredHeight() / f11) * i10;
            float measuredWidth2 = (getMeasuredWidth() / e10) * (i7 + 1);
            float measuredHeight2 = (getMeasuredHeight() / f11) * (i10 + 1);
            RectF rectF = this.Q;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            e(canvas, rectF, this.f14622k0);
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
        if (this.f14616f.f15509e.size() > 1) {
            return true;
        }
        return false;
    }

    public final void k(RectF rectF, t tVar) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = org.telegram.messenger.g0.f24118q;
            int i7 = point.x;
            measuredHeight = point.y;
            measuredWidth = i7;
        }
        float f10 = measuredWidth;
        u uVar = tVar.f15399a;
        int[] iArr = uVar.d;
        int i10 = tVar.f15401c;
        int i11 = iArr[i10];
        int i12 = tVar.f15400b;
        float f11 = measuredHeight;
        int i13 = uVar.f15508c;
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
                d7 d7Var2 = ((e0) obj).f14517n;
                if (d7Var2 != null && d7Var2.K && d7Var2.P > 0.0f) {
                    d7Var.P = 0.0f;
                    break;
                }
            }
        }
        e0 e0Var = this.f14629r;
        if (e0Var != null) {
            e0Var.a(d7Var);
        }
        q();
        requestLayout();
        if (this.f14629r != null) {
            return false;
        }
        return true;
    }

    public final void m(long j3, boolean z10) {
        if (this.f14626o0) {
            long k10 = Utilities.k(j3, getDuration(), 0L);
            if (!this.f14630r0) {
                this.f14635v0 = k10;
            }
            this.f14627p0 = System.currentTimeMillis() - k10;
            this.f14628q0 = z10;
            if (this.f14626o0) {
                b0 b0Var = this.f14639x0;
                org.telegram.messenger.g0.r(b0Var);
                b0Var.run();
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
                    ((e0) arrayList.get(i7)).a((d7) d7Var.T.get(i7));
                    i7++;
                } else {
                    return;
                }
            }
        } else {
            c();
        }
    }

    public final void o(u uVar) {
        t tVar;
        e0 e0Var;
        if (uVar == null) {
            uVar = new u(".");
        }
        ArrayList arrayList = uVar.f15509e;
        this.f14616f = uVar;
        b0 b0Var = this.I;
        org.telegram.messenger.g0.r(b0Var);
        int i7 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList2 = this.h;
            if (i7 < Math.max(size, arrayList2.size())) {
                if (i7 < arrayList.size()) {
                    tVar = (t) arrayList.get(i7);
                } else {
                    tVar = null;
                }
                if (i7 < arrayList2.size()) {
                    e0Var = (e0) arrayList2.get(i7);
                } else {
                    e0Var = null;
                }
                if (e0Var == null && tVar != null) {
                    e0 e0Var2 = new e0(this);
                    if (this.f14623l0) {
                        e0Var2.f14508c.P();
                    }
                    e0Var2.b(tVar, true);
                    arrayList2.add(e0Var2);
                } else if (tVar != null) {
                    e0Var.b(tVar, true);
                } else if (e0Var != null) {
                    this.f14624n.add(e0Var);
                    arrayList2.remove(e0Var);
                    e0Var.b(null, true);
                    i7--;
                }
                i7++;
            } else {
                q();
                invalidate();
                org.telegram.messenger.g0.h3(b0Var, 360L);
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
                ((e0) arrayList.get(i7)).f14508c.P();
                i7++;
            } else {
                this.f14623l0 = true;
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
                ((e0) arrayList.get(i7)).f14508c.R();
                i7++;
            } else {
                this.f14623l0 = false;
                org.telegram.messenger.g0.r(this.f14639x0);
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        e0 e0Var;
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
                        if (childAt == ((e0) arrayList.get(i14)).f14509e) {
                            e0Var = (e0) arrayList.get(i14);
                            break;
                        }
                        i14++;
                    } else {
                        e0Var = null;
                        break;
                    }
                }
                if (e0Var != null && (d7Var = e0Var.f14517n) != null && (i11 = d7Var.f14409k0) > 0 && (i12 = d7Var.f14411l0) > 0) {
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
        if (this.f14614e != null) {
            z11 = true;
        }
        if (z10 == z11) {
            return;
        }
        if (z10) {
            this.f14614e = cameraView.getBlurRenderNode();
        } else {
            this.f14614e = null;
        }
    }

    public final void q() {
        ArrayList arrayList;
        boolean z10;
        this.f14629r = null;
        this.f14631s = null;
        int i7 = 0;
        while (true) {
            arrayList = this.h;
            if (i7 >= arrayList.size()) {
                break;
            }
            e0 e0Var = (e0) arrayList.get(i7);
            if (e0Var.f14517n == null) {
                if (this.f14629r == null) {
                    this.f14629r = e0Var;
                } else {
                    this.f14631s = e0Var;
                    break;
                }
            }
            i7++;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            e0 e0Var2 = (e0) arrayList.get(i10);
            if (e0Var2 == this.f14629r) {
                z10 = true;
            } else {
                z10 = false;
            }
            e0Var2.f14516m = z10;
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
            cameraView2.unlistenDraw(new b0(this, 1));
            org.telegram.messenger.g0.E2(this.d);
            this.d = null;
            p();
        }
        this.d = cameraView;
        if (cameraView != null) {
            addView(cameraView, c8.ma.e(-1, -1, 119));
        }
        CameraView cameraView3 = this.d;
        if (cameraView3 != null) {
            cameraView3.unlistenDraw(new b0(this, 1));
        }
        this.d = cameraView;
        if (cameraView != null) {
            cameraView.listenDraw(new b0(this, 1));
        }
        p();
        invalidate();
    }

    public void setCancelGestures(Runnable runnable) {
        this.m0 = runnable;
    }

    public void setMuted(boolean z10) {
        if (this.f14637w0 == z10) {
            return;
        }
        this.f14637w0 = z10;
    }

    public void setOnCameraThumbClick(Runnable runnable) {
        this.U = runnable;
    }

    public void setPlaying(boolean z10) {
        boolean z11 = this.f14634u0;
        this.f14634u0 = true;
        if (this.f14630r0 != z10) {
            this.f14630r0 = z10;
            if (!z10) {
                this.f14635v0 = getPosition();
            } else if (z11) {
                m(this.f14635v0, false);
            } else {
                this.f14628q0 = false;
            }
            if (this.f14626o0) {
                b0 b0Var = this.f14639x0;
                org.telegram.messenger.g0.r(b0Var);
                b0Var.run();
            }
        }
    }

    public void setPreview(boolean z10) {
        if (this.f14626o0 != z10) {
            this.f14626o0 = z10;
            ArrayList arrayList = this.h;
            int i7 = 0;
            if (z10) {
                org.telegram.ui.Components.ca caVar = this.H;
                if (caVar != null) {
                    caVar.d();
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((e0) arrayList.get(i10)).f14506a = i10;
                }
            }
            this.f14628q0 = false;
            this.f14635v0 = 0L;
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                e0 e0Var = (e0) obj;
                d0 d0Var = e0Var.d;
                if (d0Var != null) {
                    d0Var.setAudioEnabled(z10, true);
                    if (z10 && !this.f14630r0) {
                        e0Var.d.pause();
                    } else {
                        e0Var.d.play();
                    }
                }
            }
            b0 b0Var = this.f14639x0;
            org.telegram.messenger.g0.r(b0Var);
            if (z10) {
                this.f14627p0 = System.currentTimeMillis();
                org.telegram.messenger.g0.h3(b0Var, 1000.0f / org.telegram.messenger.g0.f24119r);
            }
        }
    }

    public void setPreviewView(w5 w5Var) {
        this.f14633t0 = w5Var;
    }

    public void setResetState(Runnable runnable) {
        this.f14625n0 = runnable;
    }

    @Override
    public void setScrimHidden(boolean z10) {
        org.telegram.ui.Cells.c0.d(this, z10);
    }

    public void setTimelineView(db dbVar) {
        this.f14632s0 = dbVar;
    }
}
