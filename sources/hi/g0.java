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
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.z60;
public abstract class g0 extends FrameLayout implements z60 {
    public static final int f14661y0 = 0;
    public final int E;
    public final LinearGradient F;
    public final Matrix G;
    public final org.telegram.ui.Components.ca H;
    public final c0 I;
    public final org.telegram.ui.Components.d6 J;
    public final org.telegram.ui.Components.d6[] K;
    public final org.telegram.ui.Components.d6 L;
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
    public final FrameLayout f14662a;
    public float f14663a0;
    public final fi.b f14664b;
    public float f14665b0;
    public final y5 f14666c;
    public float f14667c0;
    public CameraView d;
    public float f14668d0;
    public Object f14669e;
    public float f14670e0;
    public v f14671f;
    public boolean f14672f0;
    public boolean f14673g0;
    public final ArrayList h;
    public f0 f14674h0;
    public f0 f14675i0;
    public c0 f14676j0;
    public f0 f14677k0;
    public boolean f14678l0;
    public Runnable m0;
    public final ArrayList f14679n;
    public Runnable f14680n0;
    public boolean f14681o0;
    public long f14682p0;
    public boolean f14683q0;
    public f0 f14684r;
    public boolean f14685r0;
    public f0 f14686s;
    public cb f14687s0;
    public v5 f14688t0;
    public boolean f14689u0;
    public long f14690v0;
    public final Paint f14691w;
    public boolean f14692w0;
    public final Path f14693x;
    public final c0 f14694x0;
    public final float[] f14695y;

    public g0(Context context, org.telegram.ui.Components.ca caVar, FrameLayout frameLayout, fi.b bVar) {
        super(context);
        this.f14666c = new y5(new c0(this, 1));
        this.f14671f = new v(".");
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.f14679n = new ArrayList();
        Paint paint = new Paint(1);
        this.f14691w = paint;
        this.f14693x = new Path();
        this.f14695y = new float[8];
        this.I = new c0(this, 2);
        nr nrVar = nr.h;
        this.J = new org.telegram.ui.Components.d6(this, 0L, 320L, nrVar);
        this.K = new org.telegram.ui.Components.d6[]{new org.telegram.ui.Components.d6(this, 0L, 320L, nrVar), new org.telegram.ui.Components.d6(this, 0L, 320L, nrVar), new org.telegram.ui.Components.d6(this, 0L, 320L, nrVar), new org.telegram.ui.Components.d6(this, 0L, 320L, nrVar), new org.telegram.ui.Components.d6(this, 0L, 320L, nrVar)};
        this.L = new org.telegram.ui.Components.d6(this, 0L, 320L, nrVar);
        this.M = new float[5];
        this.N = new float[5];
        this.Q = new RectF();
        this.R = new Path();
        this.T = true;
        this.f14685r0 = true;
        this.f14689u0 = true;
        this.f14694x0 = new c0(this, 3);
        this.H = caVar;
        this.f14662a = frameLayout;
        this.f14664b = bVar;
        setBackgroundColor(-14737633);
        f0 f0Var = new f0(this);
        f0Var.b((u) this.f14671f.f15588e.get(0), false);
        f0Var.f14622m = true;
        if (this.f14678l0) {
            f0Var.f14614c.P();
        }
        arrayList.add(f0Var);
        this.f14684r = f0Var;
        this.f14686s = null;
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

    public static void a(g0 g0Var, RectF rectF, u uVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        int measuredWidth = g0Var.getMeasuredWidth();
        int measuredHeight = g0Var.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = org.telegram.messenger.g0.f24146q;
            int i7 = point.x;
            measuredHeight = point.y;
            measuredWidth = i7;
        }
        g0Var.k(rectF, uVar);
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
            canvas.drawColor(org.telegram.ui.ActionBar.m6.r1(drawable.getAlpha() * f10, -16777216));
        }
        canvas.restore();
    }

    public final boolean b() {
        if (this.f14674h0 == null) {
            return false;
        }
        this.f14674h0 = null;
        this.f14672f0 = false;
        invalidate();
        c0 c0Var = this.f14676j0;
        if (c0Var != null) {
            org.telegram.messenger.g0.r(c0Var);
            this.f14676j0 = null;
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
            ((f0) obj).a(null);
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
        f0 f0Var;
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
        org.telegram.ui.Components.d6 d6Var = this.J;
        org.telegram.ui.Components.d6[] d6VarArr = this.K;
        float f19 = 0.0f;
        if (!j3 && !this.f14673g0 && !this.f14672f0) {
            float f20 = d6Var.f34391c;
            v vVar = this.f14671f;
            if (f20 == vVar.f15587c && d6VarArr[0].f34391c == vVar.d[0]) {
                y5 y5Var = this.f14666c;
                if (!y5Var.f15788b && y5Var.d.f34391c <= 0.0f) {
                    setCameraNeedsBlur(false);
                    i(canvas);
                    return;
                }
            }
        }
        if (this.f14681o0) {
            setCameraNeedsBlur(false);
        }
        recordingCanvas.drawColor(-14737633);
        float d10 = this.L.d(this.f14672f0);
        float e10 = d6Var.e(false, this.f14671f.f15587c);
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
        int i12 = this.f14671f.f15587c;
        while (true) {
            f10 = 1.0f;
            if (i12 >= d6VarArr.length) {
                break;
            }
            d6VarArr[i12].e(false, 1.0f);
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
            f0 f0Var2 = (f0) arrayList.get(i13);
            u uVar = f0Var2.h;
            int i14 = uVar.f15521c;
            float f22 = d10;
            int i15 = uVar.f15520b;
            float f23 = e10;
            org.telegram.ui.Components.d6[] d6VarArr2 = d6VarArr;
            float e11 = d6VarArr[i14].e(false, uVar.f15519a.d[i14]);
            if (this.f14673g0 || this.f14672f0) {
                i7 = i14;
                org.telegram.messenger.g0.Z1(f0Var2.f14619j, f0Var2.f14620k, f0Var2.f14621l, rectF);
            } else {
                i7 = i14;
                rectF.set((getMeasuredWidth() / e11) * i15, (getMeasuredHeight() / f23) * i14, (getMeasuredWidth() / e11) * (i15 + 1), (getMeasuredHeight() / f23) * (i7 + 1));
            }
            fArr2[i7] = Math.min(fArr2[i7], rectF.left);
            fArr[i7] = Math.max(fArr[i7], rectF.right);
            f21 = Math.max(f21, rectF.bottom);
            if (f22 <= f12 || f0Var2 != this.f14675i0) {
                if (this.f14681o0 && f0Var2.d != null) {
                    z10 = true;
                }
                e(recordingCanvas, rectF, f0Var2);
            }
            i13++;
            f10 = f11;
            f19 = f12;
            d10 = f22;
            e10 = f23;
            d6VarArr = d6VarArr2;
        }
        float f24 = d10;
        float f25 = e10;
        org.telegram.ui.Components.d6[] d6VarArr3 = d6VarArr;
        int i16 = 0;
        while (true) {
            ArrayList arrayList2 = this.f14679n;
            if (i16 >= arrayList2.size()) {
                break;
            }
            f0 f0Var3 = (f0) arrayList2.get(i16);
            u uVar2 = f0Var3.h;
            int i17 = uVar2.f15521c;
            int i18 = uVar2.f15520b;
            org.telegram.ui.Components.d6 d6Var2 = d6VarArr3[i17];
            int[] iArr = this.f14671f.d;
            int i19 = i16;
            if (i17 >= iArr.length) {
                f18 = f11;
            } else {
                f18 = iArr[i17];
            }
            float e12 = d6Var2.e(false, f18);
            rectF.set((getMeasuredWidth() / e12) * i18, (getMeasuredHeight() / f25) * i17, (getMeasuredWidth() / e12) * (i18 + 1), (i17 + 1) * (getMeasuredHeight() / f25));
            fArr2[i17] = Math.min(fArr2[i17], rectF.left);
            fArr[i17] = Math.max(fArr[i17], rectF.right);
            f21 = Math.max(f21, rectF.bottom);
            if (this.f14681o0 && f0Var3.d != null) {
                z10 = true;
            }
            e(recordingCanvas, rectF, f0Var3);
            i16 = i19 + 1;
        }
        if (!this.f14672f0) {
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
        if (f24 > f13 && (f0Var = this.f14675i0) != null) {
            u uVar3 = f0Var.h;
            int i21 = uVar3.f15521c;
            int i22 = uVar3.f15520b;
            float e13 = d6VarArr3[i21].e(false, this.f14671f.d[i21]);
            if (this.f14672f0) {
                org.telegram.messenger.g0.Z1(f0Var.f14619j, f0Var.f14620k, f0Var.f14621l, rectF);
            } else {
                rectF.set((getMeasuredWidth() / e13) * i22, (getMeasuredHeight() / f25) * i21, (getMeasuredWidth() / e13) * (i22 + 1), (getMeasuredHeight() / f25) * (i21 + 1));
            }
            recordingCanvas.save();
            recordingCanvas.translate(org.telegram.messenger.g0.T1(this.f14665b0, this.f14668d0, f0Var.f14621l) * f24, org.telegram.messenger.g0.T1(this.f14667c0, this.f14670e0, f0Var.f14621l) * f24);
            e(recordingCanvas, rectF, f0Var);
            recordingCanvas.restore();
        }
        for (int i23 = 0; i23 < arrayList.size(); i23++) {
            f0 f0Var4 = (f0) arrayList.get(i23);
            u uVar4 = f0Var4.h;
            float e14 = f0Var4.f14613b.e(false, 0.0f);
            if (e14 > 0.0f) {
                int i24 = uVar4.f15521c;
                int i25 = uVar4.f15521c;
                int i26 = uVar4.f15520b;
                float e15 = d6VarArr3[i24].e(false, uVar4.f15519a.d[i24]);
                if (!this.f14673g0 && !this.f14672f0) {
                    rectF.set((getMeasuredWidth() / e15) * i26, (getMeasuredHeight() / f25) * i25, (getMeasuredWidth() / e15) * (i26 + 1), (getMeasuredHeight() / f25) * (i25 + 1));
                } else {
                    org.telegram.messenger.g0.Z1(f0Var4.f14619j, f0Var4.f14620k, f0Var4.f14621l, rectF);
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
                Paint paint = this.f14691w;
                paint.setAlpha(255);
                Path path = this.f14693x;
                path.rewind();
                u uVar5 = f0Var4.h;
                if (uVar5.f15520b == 0 && uVar5.f15521c == 0) {
                    f14 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    f14 = 0.0f;
                }
                float[] fArr3 = this.f14695y;
                fArr3[1] = f14;
                fArr3[0] = f14;
                u uVar6 = f0Var4.h;
                if (uVar6.f15520b == uVar6.f15519a.f15586b - 1 && uVar6.f15521c == 0) {
                    f15 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    f15 = 0.0f;
                }
                fArr3[2] = f15;
                fArr3[1] = f15;
                u uVar7 = f0Var4.h;
                int i29 = uVar7.f15520b;
                v vVar2 = uVar7.f15519a;
                if (i29 == vVar2.f15586b - 1 && uVar7.f15521c == vVar2.f15587c - 1) {
                    f16 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    f16 = 0.0f;
                }
                fArr3[4] = f16;
                fArr3[3] = f16;
                u uVar8 = f0Var4.h;
                if (uVar8.f15520b == 0 && uVar8.f15521c == uVar8.f15519a.f15587c - 1) {
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
        throw new UnsupportedOperationException("Method not decompiled: hi.g0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.d && org.telegram.messenger.g0.m0) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(android.graphics.Canvas r9, android.graphics.RectF r10, hi.f0 r11) {
        throw new UnsupportedOperationException("Method not decompiled: hi.g0.e(android.graphics.Canvas, android.graphics.RectF, hi.f0):void");
    }

    @Override
    public final void f(RectF rectF) {
        f0 f0Var = this.f14677k0;
        if (f0Var != null) {
            u uVar = f0Var.h;
            v vVar = uVar.f15519a;
            int i7 = uVar.f15520b;
            int i10 = uVar.f15521c;
            float f10 = vVar.f15587c;
            float e10 = this.K[i10].e(false, vVar.d[i10]);
            rectF.set((getMeasuredWidth() / e10) * i7, (getMeasuredHeight() / f10) * i10, (getMeasuredWidth() / e10) * (i7 + 1), (getMeasuredHeight() / f10) * (i10 + 1));
            return;
        }
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    public final void g(float f10, Canvas canvas, RectF rectF, View view) {
        y5 y5Var;
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
            if (view == this.d && (y5Var = this.f14666c) != null) {
                Paint paint = y5Var.f15793i;
                org.telegram.ui.Components.d6[] d6VarArr = y5Var.h;
                org.telegram.ui.Components.d6[] d6VarArr2 = y5Var.f15792g;
                Path path = y5Var.f15794j;
                x5 x5Var = y5Var.f15789c;
                if (x5Var != null && x5Var.f15748b.length > 0) {
                    float d = y5Var.d.d(y5Var.f15788b);
                    int i10 = 0;
                    float e10 = y5Var.f15790e.e(false, y5Var.f15789c.f15749c);
                    float width = (rectF.width() * e10) + rectF.left;
                    float e11 = y5Var.f15791f.e(false, y5Var.f15789c.d);
                    float f11 = rectF.top;
                    float T1 = org.telegram.messenger.g0.T1(0.5f, 1.1f, d);
                    canvas.save();
                    canvas.scale(T1, T1, width, (rectF.height() * e11) + f11);
                    if (d > 0.0f) {
                        path.rewind();
                        int min = Math.min(4, y5Var.f15789c.f15748b.length);
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
                            x5 x5Var2 = y5Var.f15789c;
                            PointF[] pointFArr = x5Var2.f15748b;
                            PointF pointF = pointFArr[i12];
                            int i14 = min;
                            PointF pointF2 = pointFArr[i11];
                            org.telegram.ui.Components.d6[] d6VarArr3 = d6VarArr;
                            PointF pointF3 = pointFArr[i7];
                            org.telegram.ui.Components.d6[] d6VarArr4 = d6VarArr2;
                            float f12 = d;
                            float width2 = (rectF.width() * (d6VarArr4[i12].e(false, pointF.x - x5Var2.f15749c) + e10)) + rectF.left;
                            float height = (rectF.height() * (d6VarArr3[i12].e(false, pointF.y - y5Var.f15789c.d) + e11)) + rectF.top;
                            float width3 = (rectF.width() * (d6VarArr4[i11].e(false, pointF2.x - y5Var.f15789c.f15749c) + e10)) + rectF.left;
                            float height2 = (rectF.height() * (d6VarArr3[i11].e(false, pointF2.y - y5Var.f15789c.d) + e11)) + rectF.top;
                            float width4 = (rectF.width() * (d6VarArr4[i7].e(false, pointF3.x - y5Var.f15789c.f15749c) + e10)) + rectF.left;
                            float f13 = rectF.top;
                            float height3 = rectF.height();
                            path.moveTo(((width2 - width3) * 0.18f) + width3, ((height - height2) * 0.18f) + height2);
                            path.lineTo(width3, height2);
                            path.lineTo(((width4 - width3) * 0.18f) + width3, ((((height3 * (d6VarArr3[i7].e(false, pointF3.y - y5Var.f15789c.d) + e11)) + f13) - height2) * 0.18f) + height2);
                            d6VarArr2 = d6VarArr4;
                            i10 = 0;
                            i11 = i13;
                            min = i14;
                            d6VarArr = d6VarArr3;
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

    public ArrayList<c7> getContent() {
        ArrayList<c7> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            c7 c7Var = ((f0) obj).f14623n;
            if (c7Var != null) {
                arrayList.add(c7Var);
            }
        }
        return arrayList;
    }

    public f0 getCurrent() {
        return this.f14684r;
    }

    public long getDuration() {
        f0 mainPart;
        c7 c7Var;
        if (!this.f14681o0 || (mainPart = getMainPart()) == null || (c7Var = mainPart.f14623n) == null) {
            return 1L;
        }
        return Math.max(Math.min((c7Var.W - c7Var.V) * ((float) c7Var.f14353h0), 59500L), 1L);
    }

    public int getFilledCount() {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 < arrayList.size()) {
                if (((f0) arrayList.get(i7)).f14623n != null) {
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

    public v getLayout() {
        return this.f14671f;
    }

    public f0 getMainPart() {
        f0 f0Var = null;
        if (!this.f14681o0) {
            return null;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i7 = 0;
        long j3 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            f0 f0Var2 = (f0) obj;
            c7 c7Var = f0Var2.f14623n;
            if (c7Var != null && c7Var.K) {
                long j10 = c7Var.f14353h0;
                e0 e0Var = f0Var2.d;
                if (e0Var != null && e0Var.getDuration() > 0) {
                    j10 = f0Var2.d.getDuration();
                }
                if (j10 > j3) {
                    f0Var = f0Var2;
                    j3 = j10;
                }
            }
        }
        return f0Var;
    }

    public f0 getNext() {
        return this.f14686s;
    }

    public ArrayList<Integer> getOrder() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.h;
            if (i7 < arrayList2.size()) {
                i7 = com.google.android.gms.internal.vision.e2.f(((f0) arrayList2.get(i7)).f14612a, i7, 1, arrayList);
            } else {
                return arrayList;
            }
        }
    }

    public long getPosition() {
        if (!this.f14681o0) {
            return 0L;
        }
        if (!this.f14685r0) {
            return this.f14690v0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f14682p0;
        if (j3 > getDuration()) {
            this.f14682p0 = currentTimeMillis - (j3 % getDuration());
        }
        return j3;
    }

    public long getPositionWithOffset() {
        long j3 = 0;
        if (!this.f14681o0) {
            return 0L;
        }
        getPosition();
        f0 mainPart = getMainPart();
        if (mainPart != null) {
            c7 c7Var = mainPart.f14623n;
            j3 = c7Var.X + (c7Var.V * ((float) c7Var.f14353h0));
        }
        return getPosition() + j3;
    }

    public int getTotalCount() {
        return this.h.size();
    }

    @Override
    public final void h(Canvas canvas, float f10) {
        f0 f0Var = this.f14677k0;
        if (f0Var != null) {
            u uVar = f0Var.h;
            v vVar = uVar.f15519a;
            int i7 = uVar.f15520b;
            int i10 = uVar.f15521c;
            float f11 = vVar.f15587c;
            float e10 = this.K[i10].e(false, vVar.d[i10]);
            float measuredWidth = (getMeasuredWidth() / e10) * i7;
            float measuredHeight = (getMeasuredHeight() / f11) * i10;
            float measuredWidth2 = (getMeasuredWidth() / e10) * (i7 + 1);
            float measuredHeight2 = (getMeasuredHeight() / f11) * (i10 + 1);
            RectF rectF = this.Q;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            e(canvas, rectF, this.f14677k0);
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
        if (this.f14671f.f15588e.size() > 1) {
            return true;
        }
        return false;
    }

    public final void k(RectF rectF, u uVar) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = org.telegram.messenger.g0.f24146q;
            int i7 = point.x;
            measuredHeight = point.y;
            measuredWidth = i7;
        }
        float f10 = measuredWidth;
        v vVar = uVar.f15519a;
        int[] iArr = vVar.d;
        int i10 = uVar.f15521c;
        int i11 = iArr[i10];
        int i12 = uVar.f15520b;
        float f11 = measuredHeight;
        int i13 = vVar.f15587c;
        rectF.set((f10 / i11) * i12, (f11 / i13) * i10, (f10 / i11) * (i12 + 1), (f11 / i13) * (i10 + 1));
    }

    public final boolean l(c7 c7Var) {
        if (c7Var.K) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    break;
                }
                Object obj = arrayList.get(i7);
                i7++;
                c7 c7Var2 = ((f0) obj).f14623n;
                if (c7Var2 != null && c7Var2.K && c7Var2.P > 0.0f) {
                    c7Var.P = 0.0f;
                    break;
                }
            }
        }
        f0 f0Var = this.f14684r;
        if (f0Var != null) {
            f0Var.a(c7Var);
        }
        q();
        requestLayout();
        if (this.f14684r != null) {
            return false;
        }
        return true;
    }

    public final void m(long j3, boolean z10) {
        if (this.f14681o0) {
            long k10 = Utilities.k(j3, getDuration(), 0L);
            if (!this.f14685r0) {
                this.f14690v0 = k10;
            }
            this.f14682p0 = System.currentTimeMillis() - k10;
            this.f14683q0 = z10;
            if (this.f14681o0) {
                c0 c0Var = this.f14694x0;
                org.telegram.messenger.g0.r(c0Var);
                c0Var.run();
            }
        }
    }

    public final void n(c7 c7Var) {
        if (c7Var != null && c7Var.T != null) {
            o(c7Var.S);
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i7 < arrayList.size()) {
                    ((f0) arrayList.get(i7)).a((c7) c7Var.T.get(i7));
                    i7++;
                } else {
                    return;
                }
            }
        } else {
            c();
        }
    }

    public final void o(v vVar) {
        u uVar;
        f0 f0Var;
        if (vVar == null) {
            vVar = new v(".");
        }
        ArrayList arrayList = vVar.f15588e;
        this.f14671f = vVar;
        c0 c0Var = this.I;
        org.telegram.messenger.g0.r(c0Var);
        int i7 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList2 = this.h;
            if (i7 < Math.max(size, arrayList2.size())) {
                if (i7 < arrayList.size()) {
                    uVar = (u) arrayList.get(i7);
                } else {
                    uVar = null;
                }
                if (i7 < arrayList2.size()) {
                    f0Var = (f0) arrayList2.get(i7);
                } else {
                    f0Var = null;
                }
                if (f0Var == null && uVar != null) {
                    f0 f0Var2 = new f0(this);
                    if (this.f14678l0) {
                        f0Var2.f14614c.P();
                    }
                    f0Var2.b(uVar, true);
                    arrayList2.add(f0Var2);
                } else if (uVar != null) {
                    f0Var.b(uVar, true);
                } else if (f0Var != null) {
                    this.f14679n.add(f0Var);
                    arrayList2.remove(f0Var);
                    f0Var.b(null, true);
                    i7--;
                }
                i7++;
            } else {
                q();
                invalidate();
                org.telegram.messenger.g0.h3(c0Var, 360L);
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
                ((f0) arrayList.get(i7)).f14614c.P();
                i7++;
            } else {
                this.f14678l0 = true;
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
                ((f0) arrayList.get(i7)).f14614c.R();
                i7++;
            } else {
                this.f14678l0 = false;
                org.telegram.messenger.g0.r(this.f14694x0);
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        f0 f0Var;
        c7 c7Var;
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
                        if (childAt == ((f0) arrayList.get(i14)).f14615e) {
                            f0Var = (f0) arrayList.get(i14);
                            break;
                        }
                        i14++;
                    } else {
                        f0Var = null;
                        break;
                    }
                }
                if (f0Var != null && (c7Var = f0Var.f14623n) != null && (i11 = c7Var.f14359k0) > 0 && (i12 = c7Var.f14361l0) > 0) {
                    if (c7Var.Q % 90 == 1) {
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
        if (this.f14669e != null) {
            z11 = true;
        }
        if (z10 == z11) {
            return;
        }
        if (z10) {
            this.f14669e = cameraView.getBlurRenderNode();
        } else {
            this.f14669e = null;
        }
    }

    public final void q() {
        ArrayList arrayList;
        boolean z10;
        this.f14684r = null;
        this.f14686s = null;
        int i7 = 0;
        while (true) {
            arrayList = this.h;
            if (i7 >= arrayList.size()) {
                break;
            }
            f0 f0Var = (f0) arrayList.get(i7);
            if (f0Var.f14623n == null) {
                if (this.f14684r == null) {
                    this.f14684r = f0Var;
                } else {
                    this.f14686s = f0Var;
                    break;
                }
            }
            i7++;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            f0 f0Var2 = (f0) arrayList.get(i10);
            if (f0Var2 == this.f14684r) {
                z10 = true;
            } else {
                z10 = false;
            }
            f0Var2.f14622m = z10;
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
            cameraView2.unlistenDraw(new c0(this, 1));
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
            cameraView3.unlistenDraw(new c0(this, 1));
        }
        this.d = cameraView;
        if (cameraView != null) {
            cameraView.listenDraw(new c0(this, 1));
        }
        p();
        invalidate();
    }

    public void setCancelGestures(Runnable runnable) {
        this.m0 = runnable;
    }

    public void setMuted(boolean z10) {
        if (this.f14692w0 == z10) {
            return;
        }
        this.f14692w0 = z10;
    }

    public void setOnCameraThumbClick(Runnable runnable) {
        this.U = runnable;
    }

    public void setPlaying(boolean z10) {
        boolean z11 = this.f14689u0;
        this.f14689u0 = true;
        if (this.f14685r0 != z10) {
            this.f14685r0 = z10;
            if (!z10) {
                this.f14690v0 = getPosition();
            } else if (z11) {
                m(this.f14690v0, false);
            } else {
                this.f14683q0 = false;
            }
            if (this.f14681o0) {
                c0 c0Var = this.f14694x0;
                org.telegram.messenger.g0.r(c0Var);
                c0Var.run();
            }
        }
    }

    public void setPreview(boolean z10) {
        if (this.f14681o0 != z10) {
            this.f14681o0 = z10;
            ArrayList arrayList = this.h;
            int i7 = 0;
            if (z10) {
                org.telegram.ui.Components.ca caVar = this.H;
                if (caVar != null) {
                    caVar.d();
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((f0) arrayList.get(i10)).f14612a = i10;
                }
            }
            this.f14683q0 = false;
            this.f14690v0 = 0L;
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                f0 f0Var = (f0) obj;
                e0 e0Var = f0Var.d;
                if (e0Var != null) {
                    e0Var.setAudioEnabled(z10, true);
                    if (z10 && !this.f14685r0) {
                        f0Var.d.pause();
                    } else {
                        f0Var.d.play();
                    }
                }
            }
            c0 c0Var = this.f14694x0;
            org.telegram.messenger.g0.r(c0Var);
            if (z10) {
                this.f14682p0 = System.currentTimeMillis();
                org.telegram.messenger.g0.h3(c0Var, 1000.0f / org.telegram.messenger.g0.f24147r);
            }
        }
    }

    public void setPreviewView(v5 v5Var) {
        this.f14688t0 = v5Var;
    }

    public void setResetState(Runnable runnable) {
        this.f14680n0 = runnable;
    }

    @Override
    public void setScrimHidden(boolean z10) {
        org.telegram.ui.Cells.c0.d(this, z10);
    }

    public void setTimelineView(cb cbVar) {
        this.f14687s0 = cbVar;
    }
}
