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
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.w60;
public abstract class n0 extends FrameLayout implements w60 {
    public static final int f14963y0 = 0;
    public final int E;
    public final LinearGradient F;
    public final Matrix G;
    public final org.telegram.ui.Components.ba H;
    public final j0 I;
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
    public final FrameLayout f14964a;
    public float f14965a0;
    public final fi.b f14966b;
    public float f14967b0;
    public final i6 f14968c;
    public float f14969c0;
    public CameraView d;
    public float f14970d0;
    public Object f14971e;
    public float f14972e0;
    public c0 f14973f;
    public boolean f14974f0;
    public boolean f14975g0;
    public final ArrayList h;
    public m0 f14976h0;
    public m0 f14977i0;
    public j0 f14978j0;
    public m0 f14979k0;
    public boolean f14980l0;
    public Runnable m0;
    public final ArrayList f14981n;
    public Runnable f14982n0;
    public boolean f14983o0;
    public long f14984p0;
    public boolean f14985q0;
    public m0 f14986r;
    public boolean f14987r0;
    public m0 f14988s;
    public xb f14989s0;
    public f6 f14990t0;
    public boolean f14991u0;
    public long f14992v0;
    public final Paint f14993w;
    public boolean f14994w0;
    public final Path f14995x;
    public final j0 f14996x0;
    public final float[] f14997y;

    public n0(Context context, org.telegram.ui.Components.ba baVar, FrameLayout frameLayout, fi.b bVar) {
        super(context);
        this.f14968c = new i6(new j0(this, 1));
        this.f14973f = new c0(".");
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.f14981n = new ArrayList();
        Paint paint = new Paint(1);
        this.f14993w = paint;
        this.f14995x = new Path();
        this.f14997y = new float[8];
        this.I = new j0(this, 2);
        kr krVar = kr.h;
        this.J = new org.telegram.ui.Components.c6(this, 0L, 320L, krVar);
        this.K = new org.telegram.ui.Components.c6[]{new org.telegram.ui.Components.c6(this, 0L, 320L, krVar), new org.telegram.ui.Components.c6(this, 0L, 320L, krVar), new org.telegram.ui.Components.c6(this, 0L, 320L, krVar), new org.telegram.ui.Components.c6(this, 0L, 320L, krVar), new org.telegram.ui.Components.c6(this, 0L, 320L, krVar)};
        this.L = new org.telegram.ui.Components.c6(this, 0L, 320L, krVar);
        this.M = new float[5];
        this.N = new float[5];
        this.Q = new RectF();
        this.R = new Path();
        this.T = true;
        this.f14987r0 = true;
        this.f14991u0 = true;
        this.f14996x0 = new j0(this, 3);
        this.H = baVar;
        this.f14964a = frameLayout;
        this.f14966b = bVar;
        setBackgroundColor(-14737633);
        m0 m0Var = new m0(this);
        m0Var.b((b0) this.f14973f.f14250e.get(0), false);
        m0Var.f14874m = true;
        if (this.f14980l0) {
            m0Var.f14866c.Q();
        }
        arrayList.add(m0Var);
        this.f14986r = m0Var;
        this.f14988s = null;
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

    public static void a(n0 n0Var, RectF rectF, b0 b0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        int measuredWidth = n0Var.getMeasuredWidth();
        int measuredHeight = n0Var.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = org.telegram.messenger.g0.f24226q;
            int i7 = point.x;
            measuredHeight = point.y;
            measuredWidth = i7;
        }
        n0Var.k(rectF, b0Var);
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
        if (this.f14976h0 == null) {
            return false;
        }
        this.f14976h0 = null;
        this.f14974f0 = false;
        invalidate();
        j0 j0Var = this.f14978j0;
        if (j0Var != null) {
            org.telegram.messenger.g0.r(j0Var);
            this.f14978j0 = null;
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
            ((m0) obj).a(null);
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
        org.telegram.ui.Components.ba baVar;
        float f14;
        float f15;
        float f16;
        float f17;
        m0 m0Var;
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
        if (!j3 && !this.f14975g0 && !this.f14974f0) {
            float f20 = c6Var.f33931c;
            c0 c0Var = this.f14973f;
            if (f20 == c0Var.f14249c && c6VarArr[0].f33931c == c0Var.d[0]) {
                i6 i6Var = this.f14968c;
                if (!i6Var.f14677b && i6Var.d.f33931c <= 0.0f) {
                    setCameraNeedsBlur(false);
                    i(canvas);
                    return;
                }
            }
        }
        if (this.f14983o0) {
            setCameraNeedsBlur(false);
        }
        recordingCanvas.drawColor(-14737633);
        float d10 = this.L.d(this.f14974f0);
        float e10 = c6Var.e(false, this.f14973f.f14249c);
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
        int i12 = this.f14973f.f14249c;
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
            m0 m0Var2 = (m0) arrayList.get(i13);
            b0 b0Var = m0Var2.h;
            int i14 = b0Var.f14212c;
            float f22 = d10;
            int i15 = b0Var.f14211b;
            float f23 = e10;
            org.telegram.ui.Components.c6[] c6VarArr2 = c6VarArr;
            float e11 = c6VarArr[i14].e(false, b0Var.f14210a.d[i14]);
            if (this.f14975g0 || this.f14974f0) {
                i7 = i14;
                org.telegram.messenger.g0.Z1(m0Var2.f14871j, m0Var2.f14872k, m0Var2.f14873l, rectF);
            } else {
                i7 = i14;
                rectF.set((getMeasuredWidth() / e11) * i15, (getMeasuredHeight() / f23) * i14, (getMeasuredWidth() / e11) * (i15 + 1), (getMeasuredHeight() / f23) * (i7 + 1));
            }
            fArr2[i7] = Math.min(fArr2[i7], rectF.left);
            fArr[i7] = Math.max(fArr[i7], rectF.right);
            f21 = Math.max(f21, rectF.bottom);
            if (f22 <= f12 || m0Var2 != this.f14977i0) {
                if (this.f14983o0 && m0Var2.d != null) {
                    z10 = true;
                }
                e(recordingCanvas, rectF, m0Var2);
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
            ArrayList arrayList2 = this.f14981n;
            if (i16 >= arrayList2.size()) {
                break;
            }
            m0 m0Var3 = (m0) arrayList2.get(i16);
            b0 b0Var2 = m0Var3.h;
            int i17 = b0Var2.f14212c;
            int i18 = b0Var2.f14211b;
            org.telegram.ui.Components.c6 c6Var2 = c6VarArr3[i17];
            int[] iArr = this.f14973f.d;
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
            if (this.f14983o0 && m0Var3.d != null) {
                z10 = true;
            }
            e(recordingCanvas, rectF, m0Var3);
            i16 = i19 + 1;
        }
        if (!this.f14974f0) {
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
        if (f24 > f13 && (m0Var = this.f14977i0) != null) {
            b0 b0Var3 = m0Var.h;
            int i21 = b0Var3.f14212c;
            int i22 = b0Var3.f14211b;
            float e13 = c6VarArr3[i21].e(false, this.f14973f.d[i21]);
            if (this.f14974f0) {
                org.telegram.messenger.g0.Z1(m0Var.f14871j, m0Var.f14872k, m0Var.f14873l, rectF);
            } else {
                rectF.set((getMeasuredWidth() / e13) * i22, (getMeasuredHeight() / f25) * i21, (getMeasuredWidth() / e13) * (i22 + 1), (getMeasuredHeight() / f25) * (i21 + 1));
            }
            recordingCanvas.save();
            recordingCanvas.translate(org.telegram.messenger.g0.T1(this.f14967b0, this.f14970d0, m0Var.f14873l) * f24, org.telegram.messenger.g0.T1(this.f14969c0, this.f14972e0, m0Var.f14873l) * f24);
            e(recordingCanvas, rectF, m0Var);
            recordingCanvas.restore();
        }
        for (int i23 = 0; i23 < arrayList.size(); i23++) {
            m0 m0Var4 = (m0) arrayList.get(i23);
            b0 b0Var4 = m0Var4.h;
            float e14 = m0Var4.f14865b.e(false, 0.0f);
            if (e14 > 0.0f) {
                int i24 = b0Var4.f14212c;
                int i25 = b0Var4.f14212c;
                int i26 = b0Var4.f14211b;
                float e15 = c6VarArr3[i24].e(false, b0Var4.f14210a.d[i24]);
                if (!this.f14975g0 && !this.f14974f0) {
                    rectF.set((getMeasuredWidth() / e15) * i26, (getMeasuredHeight() / f25) * i25, (getMeasuredWidth() / e15) * (i26 + 1), (getMeasuredHeight() / f25) * (i25 + 1));
                } else {
                    org.telegram.messenger.g0.Z1(m0Var4.f14871j, m0Var4.f14872k, m0Var4.f14873l, rectF);
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
                Paint paint = this.f14993w;
                paint.setAlpha(255);
                Path path = this.f14995x;
                path.rewind();
                b0 b0Var5 = m0Var4.h;
                if (b0Var5.f14211b == 0 && b0Var5.f14212c == 0) {
                    f14 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    f14 = 0.0f;
                }
                float[] fArr3 = this.f14997y;
                fArr3[1] = f14;
                fArr3[0] = f14;
                b0 b0Var6 = m0Var4.h;
                if (b0Var6.f14211b == b0Var6.f14210a.f14248b - 1 && b0Var6.f14212c == 0) {
                    f15 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    f15 = 0.0f;
                }
                fArr3[2] = f15;
                fArr3[1] = f15;
                b0 b0Var7 = m0Var4.h;
                int i29 = b0Var7.f14211b;
                c0 c0Var2 = b0Var7.f14210a;
                if (i29 == c0Var2.f14248b - 1 && b0Var7.f14212c == c0Var2.f14249c - 1) {
                    f16 = org.telegram.messenger.g0.L(8.0f);
                } else {
                    f16 = 0.0f;
                }
                fArr3[4] = f16;
                fArr3[3] = f16;
                b0 b0Var8 = m0Var4.h;
                if (b0Var8.f14211b == 0 && b0Var8.f14212c == b0Var8.f14210a.f14249c - 1) {
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
        if (z10 && (baVar = this.H) != null) {
            baVar.d();
        }
        i(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: hi.n0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.d && org.telegram.messenger.g0.m0) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(android.graphics.Canvas r9, android.graphics.RectF r10, hi.m0 r11) {
        throw new UnsupportedOperationException("Method not decompiled: hi.n0.e(android.graphics.Canvas, android.graphics.RectF, hi.m0):void");
    }

    @Override
    public final void f(RectF rectF) {
        m0 m0Var = this.f14979k0;
        if (m0Var != null) {
            b0 b0Var = m0Var.h;
            c0 c0Var = b0Var.f14210a;
            int i7 = b0Var.f14211b;
            int i10 = b0Var.f14212c;
            float f10 = c0Var.f14249c;
            float e10 = this.K[i10].e(false, c0Var.d[i10]);
            rectF.set((getMeasuredWidth() / e10) * i7, (getMeasuredHeight() / f10) * i10, (getMeasuredWidth() / e10) * (i7 + 1), (getMeasuredHeight() / f10) * (i10 + 1));
            return;
        }
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void g(Canvas canvas, float f10) {
        m0 m0Var = this.f14979k0;
        if (m0Var != null) {
            b0 b0Var = m0Var.h;
            c0 c0Var = b0Var.f14210a;
            int i7 = b0Var.f14211b;
            int i10 = b0Var.f14212c;
            float f11 = c0Var.f14249c;
            float e10 = this.K[i10].e(false, c0Var.d[i10]);
            float measuredWidth = (getMeasuredWidth() / e10) * i7;
            float measuredHeight = (getMeasuredHeight() / f11) * i10;
            float measuredWidth2 = (getMeasuredWidth() / e10) * (i7 + 1);
            float measuredHeight2 = (getMeasuredHeight() / f11) * (i10 + 1);
            RectF rectF = this.Q;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            e(canvas, rectF, this.f14979k0);
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

    public ArrayList<x7> getContent() {
        ArrayList<x7> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList2.get(i7);
            i7++;
            x7 x7Var = ((m0) obj).f14875n;
            if (x7Var != null) {
                arrayList.add(x7Var);
            }
        }
        return arrayList;
    }

    public m0 getCurrent() {
        return this.f14986r;
    }

    public long getDuration() {
        m0 mainPart;
        x7 x7Var;
        if (!this.f14983o0 || (mainPart = getMainPart()) == null || (x7Var = mainPart.f14875n) == null) {
            return 1L;
        }
        return Math.max(Math.min((x7Var.W - x7Var.V) * ((float) x7Var.f15751h0), 59500L), 1L);
    }

    public int getFilledCount() {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i7 < arrayList.size()) {
                if (((m0) arrayList.get(i7)).f14875n != null) {
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

    public c0 getLayout() {
        return this.f14973f;
    }

    public m0 getMainPart() {
        m0 m0Var = null;
        if (!this.f14983o0) {
            return null;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i7 = 0;
        long j3 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            m0 m0Var2 = (m0) obj;
            x7 x7Var = m0Var2.f14875n;
            if (x7Var != null && x7Var.K) {
                long j10 = x7Var.f15751h0;
                l0 l0Var = m0Var2.d;
                if (l0Var != null && l0Var.getDuration() > 0) {
                    j10 = m0Var2.d.getDuration();
                }
                if (j10 > j3) {
                    m0Var = m0Var2;
                    j3 = j10;
                }
            }
        }
        return m0Var;
    }

    public m0 getNext() {
        return this.f14988s;
    }

    public ArrayList<Integer> getOrder() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.h;
            if (i7 < arrayList2.size()) {
                i7 = com.google.android.gms.internal.vision.e2.f(((m0) arrayList2.get(i7)).f14864a, i7, 1, arrayList);
            } else {
                return arrayList;
            }
        }
    }

    public long getPosition() {
        if (!this.f14983o0) {
            return 0L;
        }
        if (!this.f14987r0) {
            return this.f14992v0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f14984p0;
        if (j3 > getDuration()) {
            this.f14984p0 = currentTimeMillis - (j3 % getDuration());
        }
        return j3;
    }

    public long getPositionWithOffset() {
        long j3 = 0;
        if (!this.f14983o0) {
            return 0L;
        }
        getPosition();
        m0 mainPart = getMainPart();
        if (mainPart != null) {
            x7 x7Var = mainPart.f14875n;
            j3 = x7Var.X + (x7Var.V * ((float) x7Var.f15751h0));
        }
        return getPosition() + j3;
    }

    public int getTotalCount() {
        return this.h.size();
    }

    public final void h(float f10, Canvas canvas, RectF rectF, View view) {
        i6 i6Var;
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
            if (view == this.d && (i6Var = this.f14968c) != null) {
                Paint paint = i6Var.f14682i;
                org.telegram.ui.Components.c6[] c6VarArr = i6Var.h;
                org.telegram.ui.Components.c6[] c6VarArr2 = i6Var.f14681g;
                Path path = i6Var.f14683j;
                h6 h6Var = i6Var.f14678c;
                if (h6Var != null && h6Var.f14584b.length > 0) {
                    float d = i6Var.d.d(i6Var.f14677b);
                    int i10 = 0;
                    float e10 = i6Var.f14679e.e(false, i6Var.f14678c.f14585c);
                    float width = (rectF.width() * e10) + rectF.left;
                    float e11 = i6Var.f14680f.e(false, i6Var.f14678c.d);
                    float f11 = rectF.top;
                    float T1 = org.telegram.messenger.g0.T1(0.5f, 1.1f, d);
                    canvas.save();
                    canvas.scale(T1, T1, width, (rectF.height() * e11) + f11);
                    if (d > 0.0f) {
                        path.rewind();
                        int min = Math.min(4, i6Var.f14678c.f14584b.length);
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
                            h6 h6Var2 = i6Var.f14678c;
                            PointF[] pointFArr = h6Var2.f14584b;
                            PointF pointF = pointFArr[i12];
                            int i14 = min;
                            PointF pointF2 = pointFArr[i11];
                            org.telegram.ui.Components.c6[] c6VarArr3 = c6VarArr;
                            PointF pointF3 = pointFArr[i7];
                            org.telegram.ui.Components.c6[] c6VarArr4 = c6VarArr2;
                            float f12 = d;
                            float width2 = (rectF.width() * (c6VarArr4[i12].e(false, pointF.x - h6Var2.f14585c) + e10)) + rectF.left;
                            float height = (rectF.height() * (c6VarArr3[i12].e(false, pointF.y - i6Var.f14678c.d) + e11)) + rectF.top;
                            float width3 = (rectF.width() * (c6VarArr4[i11].e(false, pointF2.x - i6Var.f14678c.f14585c) + e10)) + rectF.left;
                            float height2 = (rectF.height() * (c6VarArr3[i11].e(false, pointF2.y - i6Var.f14678c.d) + e11)) + rectF.top;
                            float width4 = (rectF.width() * (c6VarArr4[i7].e(false, pointF3.x - i6Var.f14678c.f14585c) + e10)) + rectF.left;
                            float f13 = rectF.top;
                            float height3 = rectF.height();
                            path.moveTo(((width2 - width3) * 0.18f) + width3, ((height - height2) * 0.18f) + height2);
                            path.lineTo(width3, height2);
                            path.lineTo(((width4 - width3) * 0.18f) + width3, ((((height3 * (c6VarArr3[i7].e(false, pointF3.y - i6Var.f14678c.d) + e11)) + f13) - height2) * 0.18f) + height2);
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
        if (this.f14973f.f14250e.size() > 1) {
            return true;
        }
        return false;
    }

    public final void k(RectF rectF, b0 b0Var) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = org.telegram.messenger.g0.f24226q;
            int i7 = point.x;
            measuredHeight = point.y;
            measuredWidth = i7;
        }
        float f10 = measuredWidth;
        c0 c0Var = b0Var.f14210a;
        int[] iArr = c0Var.d;
        int i10 = b0Var.f14212c;
        int i11 = iArr[i10];
        int i12 = b0Var.f14211b;
        float f11 = measuredHeight;
        int i13 = c0Var.f14249c;
        rectF.set((f10 / i11) * i12, (f11 / i13) * i10, (f10 / i11) * (i12 + 1), (f11 / i13) * (i10 + 1));
    }

    public final boolean l(x7 x7Var) {
        if (x7Var.K) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    break;
                }
                Object obj = arrayList.get(i7);
                i7++;
                x7 x7Var2 = ((m0) obj).f14875n;
                if (x7Var2 != null && x7Var2.K && x7Var2.P > 0.0f) {
                    x7Var.P = 0.0f;
                    break;
                }
            }
        }
        m0 m0Var = this.f14986r;
        if (m0Var != null) {
            m0Var.a(x7Var);
        }
        q();
        requestLayout();
        if (this.f14986r != null) {
            return false;
        }
        return true;
    }

    public final void m(long j3, boolean z10) {
        if (this.f14983o0) {
            long k10 = Utilities.k(j3, getDuration(), 0L);
            if (!this.f14987r0) {
                this.f14992v0 = k10;
            }
            this.f14984p0 = System.currentTimeMillis() - k10;
            this.f14985q0 = z10;
            if (this.f14983o0) {
                j0 j0Var = this.f14996x0;
                org.telegram.messenger.g0.r(j0Var);
                j0Var.run();
            }
        }
    }

    public final void n(x7 x7Var) {
        if (x7Var != null && x7Var.T != null) {
            o(x7Var.S);
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i7 < arrayList.size()) {
                    ((m0) arrayList.get(i7)).a((x7) x7Var.T.get(i7));
                    i7++;
                } else {
                    return;
                }
            }
        } else {
            c();
        }
    }

    public final void o(c0 c0Var) {
        b0 b0Var;
        m0 m0Var;
        if (c0Var == null) {
            c0Var = new c0(".");
        }
        ArrayList arrayList = c0Var.f14250e;
        this.f14973f = c0Var;
        j0 j0Var = this.I;
        org.telegram.messenger.g0.r(j0Var);
        int i7 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList2 = this.h;
            if (i7 < Math.max(size, arrayList2.size())) {
                if (i7 < arrayList.size()) {
                    b0Var = (b0) arrayList.get(i7);
                } else {
                    b0Var = null;
                }
                if (i7 < arrayList2.size()) {
                    m0Var = (m0) arrayList2.get(i7);
                } else {
                    m0Var = null;
                }
                if (m0Var == null && b0Var != null) {
                    m0 m0Var2 = new m0(this);
                    if (this.f14980l0) {
                        m0Var2.f14866c.Q();
                    }
                    m0Var2.b(b0Var, true);
                    arrayList2.add(m0Var2);
                } else if (b0Var != null) {
                    m0Var.b(b0Var, true);
                } else if (m0Var != null) {
                    this.f14981n.add(m0Var);
                    arrayList2.remove(m0Var);
                    m0Var.b(null, true);
                    i7--;
                }
                i7++;
            } else {
                q();
                invalidate();
                org.telegram.messenger.g0.h3(j0Var, 360L);
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
                ((m0) arrayList.get(i7)).f14866c.Q();
                i7++;
            } else {
                this.f14980l0 = true;
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
                ((m0) arrayList.get(i7)).f14866c.S();
                i7++;
            } else {
                this.f14980l0 = false;
                org.telegram.messenger.g0.r(this.f14996x0);
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        m0 m0Var;
        x7 x7Var;
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
                        if (childAt == ((m0) arrayList.get(i14)).f14867e) {
                            m0Var = (m0) arrayList.get(i14);
                            break;
                        }
                        i14++;
                    } else {
                        m0Var = null;
                        break;
                    }
                }
                if (m0Var != null && (x7Var = m0Var.f14875n) != null && (i11 = x7Var.f15757k0) > 0 && (i12 = x7Var.f15759l0) > 0) {
                    if (x7Var.Q % 90 == 1) {
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
        if (this.f14971e != null) {
            z11 = true;
        }
        if (z10 == z11) {
            return;
        }
        if (z10) {
            this.f14971e = cameraView.getBlurRenderNode();
        } else {
            this.f14971e = null;
        }
    }

    public final void q() {
        ArrayList arrayList;
        boolean z10;
        this.f14986r = null;
        this.f14988s = null;
        int i7 = 0;
        while (true) {
            arrayList = this.h;
            if (i7 >= arrayList.size()) {
                break;
            }
            m0 m0Var = (m0) arrayList.get(i7);
            if (m0Var.f14875n == null) {
                if (this.f14986r == null) {
                    this.f14986r = m0Var;
                } else {
                    this.f14988s = m0Var;
                    break;
                }
            }
            i7++;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            m0 m0Var2 = (m0) arrayList.get(i10);
            if (m0Var2 == this.f14986r) {
                z10 = true;
            } else {
                z10 = false;
            }
            m0Var2.f14874m = z10;
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
            cameraView2.unlistenDraw(new j0(this, 1));
            org.telegram.messenger.g0.E2(this.d);
            this.d = null;
            p();
        }
        this.d = cameraView;
        if (cameraView != null) {
            addView(cameraView, c8.na.e(-1, -1, 119));
        }
        CameraView cameraView3 = this.d;
        if (cameraView3 != null) {
            cameraView3.unlistenDraw(new j0(this, 1));
        }
        this.d = cameraView;
        if (cameraView != null) {
            cameraView.listenDraw(new j0(this, 1));
        }
        p();
        invalidate();
    }

    public void setCancelGestures(Runnable runnable) {
        this.m0 = runnable;
    }

    public void setMuted(boolean z10) {
        if (this.f14994w0 == z10) {
            return;
        }
        this.f14994w0 = z10;
    }

    public void setOnCameraThumbClick(Runnable runnable) {
        this.U = runnable;
    }

    public void setPlaying(boolean z10) {
        boolean z11 = this.f14991u0;
        this.f14991u0 = true;
        if (this.f14987r0 != z10) {
            this.f14987r0 = z10;
            if (!z10) {
                this.f14992v0 = getPosition();
            } else if (z11) {
                m(this.f14992v0, false);
            } else {
                this.f14985q0 = false;
            }
            if (this.f14983o0) {
                j0 j0Var = this.f14996x0;
                org.telegram.messenger.g0.r(j0Var);
                j0Var.run();
            }
        }
    }

    public void setPreview(boolean z10) {
        if (this.f14983o0 != z10) {
            this.f14983o0 = z10;
            ArrayList arrayList = this.h;
            int i7 = 0;
            if (z10) {
                org.telegram.ui.Components.ba baVar = this.H;
                if (baVar != null) {
                    baVar.d();
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((m0) arrayList.get(i10)).f14864a = i10;
                }
            }
            this.f14985q0 = false;
            this.f14992v0 = 0L;
            int size = arrayList.size();
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                m0 m0Var = (m0) obj;
                l0 l0Var = m0Var.d;
                if (l0Var != null) {
                    l0Var.setAudioEnabled(z10, true);
                    if (z10 && !this.f14987r0) {
                        m0Var.d.pause();
                    } else {
                        m0Var.d.play();
                    }
                }
            }
            j0 j0Var = this.f14996x0;
            org.telegram.messenger.g0.r(j0Var);
            if (z10) {
                this.f14984p0 = System.currentTimeMillis();
                org.telegram.messenger.g0.h3(j0Var, 1000.0f / org.telegram.messenger.g0.f24227r);
            }
        }
    }

    public void setPreviewView(f6 f6Var) {
        this.f14990t0 = f6Var;
    }

    public void setResetState(Runnable runnable) {
        this.f14982n0 = runnable;
    }

    @Override
    public void setScrimHidden(boolean z10) {
        org.telegram.ui.Cells.c0.d(this, z10);
    }

    public void setTimelineView(xb xbVar) {
        this.f14989s0 = xbVar;
    }
}
