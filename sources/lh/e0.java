package lh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.er;

public abstract class e0 extends FrameLayout implements a70 {

    public static final int f15888t0 = 0;
    public final LinearGradient A;
    public final Matrix B;
    public final org.telegram.ui.Components.z9 C;
    public final b0 D;
    public final org.telegram.ui.Components.y5 E;
    public final org.telegram.ui.Components.y5[] F;
    public final org.telegram.ui.Components.y5 G;
    public final float[] H;
    public final float[] I;
    public Object J;
    public Object K;
    public final RectF L;
    public final Path M;
    public Drawable N;
    public boolean O;
    public Runnable P;
    public boolean Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public float V;
    public float W;

    public final FrameLayout f15889a;

    public boolean f15890a0;

    public final jh.b f15891b;

    public boolean f15892b0;

    public final t6 f15893c;

    public d0 f15894c0;
    public CameraView d;

    public d0 f15895d0;

    public Object f15896e;

    public b0 f15897e0;

    public u f15898f;

    public d0 f15899f0;

    public boolean f15900g0;
    public final ArrayList h;

    public Runnable f15901h0;

    public Runnable f15902i0;

    public boolean f15903j0;

    public long f15904k0;

    public boolean f15905l0;
    public boolean m0;

    public final ArrayList f15906n;

    public cc f15907n0;

    public q6 f15908o0;

    public boolean f15909p0;

    public long f15910q0;

    public d0 f15911r;

    public boolean f15912r0;

    public d0 f15913s;

    public final b0 f15914s0;
    public final Paint v;

    public final Path f15915w;

    public final float[] f15916x;

    public final int f15917y;

    public e0(Context context, org.telegram.ui.Components.z9 z9Var, FrameLayout frameLayout, jh.b bVar) {
        super(context);
        this.f15893c = new t6(new b0(this, 1));
        this.f15898f = new u(".");
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.f15906n = new ArrayList();
        Paint paint = new Paint(1);
        this.v = paint;
        this.f15915w = new Path();
        this.f15916x = new float[8];
        this.D = new b0(this, 2);
        er erVar = er.h;
        this.E = new org.telegram.ui.Components.y5(this, 0L, 320L, erVar);
        this.F = new org.telegram.ui.Components.y5[]{new org.telegram.ui.Components.y5(this, 0L, 320L, erVar), new org.telegram.ui.Components.y5(this, 0L, 320L, erVar), new org.telegram.ui.Components.y5(this, 0L, 320L, erVar), new org.telegram.ui.Components.y5(this, 0L, 320L, erVar), new org.telegram.ui.Components.y5(this, 0L, 320L, erVar)};
        this.G = new org.telegram.ui.Components.y5(this, 0L, 320L, erVar);
        this.H = new float[5];
        this.I = new float[5];
        this.L = new RectF();
        this.M = new Path();
        this.O = true;
        this.m0 = true;
        this.f15909p0 = true;
        this.f15914s0 = new b0(this, 3);
        this.C = z9Var;
        this.f15889a = frameLayout;
        this.f15891b = bVar;
        setBackgroundColor(-14737633);
        d0 d0Var = new d0(this);
        d0Var.b((t) this.f15898f.f16885e.get(0), false);
        d0Var.f15845m = true;
        if (this.f15900g0) {
            d0Var.f15837c.onAttachedToWindow();
        }
        arrayList.add(d0Var);
        this.f15911r = d0Var;
        this.f15913s = null;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(8.0f));
        int iDp = AndroidUtilities.dp(300.0f);
        this.f15917y = iDp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, iDp, 0.0f, new int[]{0, -1, -1, 0}, new float[]{0.0f, 0.2f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
        this.A = linearGradient;
        this.B = new Matrix();
        paint.setShader(linearGradient);
        setWillNotDraw(false);
    }

    public static void b(e0 e0Var, RectF rectF, t tVar) {
        int measuredWidth = e0Var.getMeasuredWidth();
        int measuredHeight = e0Var.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = AndroidUtilities.displaySize;
            int i10 = point.x;
            measuredHeight = point.y;
            measuredWidth = i10;
        }
        e0Var.k(rectF, tVar);
        float f10 = rectF.left;
        boolean z10 = f10 <= 0.0f;
        float f11 = rectF.top;
        boolean z11 = f11 <= 0.0f;
        float f12 = measuredWidth;
        boolean z12 = rectF.right >= f12;
        float f13 = measuredHeight;
        boolean z13 = rectF.bottom >= f13;
        if (z10 && z12 && !z11 && !z13) {
            rectF.offset(0.0f, f13 - f11);
            return;
        }
        if (z11 && z13 && !z10 && !z12) {
            rectF.offset(0.0f, f12 - f10);
            return;
        }
        if (z12 && !z10) {
            rectF.offset(rectF.width(), 0.0f);
        }
        if (!z13 || z11) {
            return;
        }
        rectF.offset(0.0f, rectF.height());
    }

    public static void f(Canvas canvas, Drawable drawable, RectF rectF, float f10) {
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float fMax = Math.max(rectF.width() / intrinsicWidth, rectF.height() / intrinsicHeight);
        canvas.save();
        canvas.translate(rectF.centerX(), rectF.centerY());
        canvas.clipRect((-rectF.width()) / 2.0f, (-rectF.height()) / 2.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
        canvas.scale(fMax, fMax);
        canvas.translate((-intrinsicWidth) / 2.0f, (-intrinsicHeight) / 2.0f);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        if (f10 > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.g6.l1(drawable.getAlpha() * f10, -16777216));
        }
        canvas.restore();
    }

    @Override
    public final void a(RectF rectF) {
        d0 d0Var = this.f15899f0;
        if (d0Var == null) {
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            return;
        }
        t tVar = d0Var.h;
        u uVar = tVar.f16828a;
        int i10 = tVar.f16829b;
        int i11 = tVar.f16830c;
        float f10 = uVar.f16884c;
        float fD = this.F[i11].d(uVar.d[i11], false);
        rectF.set((getMeasuredWidth() / fD) * i10, (getMeasuredHeight() / f10) * i11, (getMeasuredWidth() / fD) * (i10 + 1), (getMeasuredHeight() / f10) * (i11 + 1));
    }

    @Override
    public final void c(Canvas canvas, float f10) {
        d0 d0Var = this.f15899f0;
        if (d0Var != null) {
            t tVar = d0Var.h;
            u uVar = tVar.f16828a;
            int i10 = tVar.f16829b;
            int i11 = tVar.f16830c;
            float f11 = uVar.f16884c;
            float fD = this.F[i11].d(uVar.d[i11], false);
            float measuredWidth = (getMeasuredWidth() / fD) * i10;
            float measuredHeight = (getMeasuredHeight() / f11) * i11;
            float measuredWidth2 = (getMeasuredWidth() / fD) * (i10 + 1);
            float measuredHeight2 = (getMeasuredHeight() / f11) * (i11 + 1);
            RectF rectF = this.L;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            g(canvas, rectF, this.f15899f0);
        }
    }

    public final boolean d() {
        if (this.f15894c0 == null) {
            return false;
        }
        this.f15894c0 = null;
        this.f15890a0 = false;
        invalidate();
        b0 b0Var = this.f15897e0;
        if (b0Var == null) {
            return true;
        }
        AndroidUtilities.cancelRunOnUIThread(b0Var);
        this.f15897e0 = null;
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvasBeginRecording;
        double d;
        float[] fArr;
        float[] fArr2;
        ArrayList arrayList;
        float f10;
        RectF rectF;
        float f11;
        org.telegram.ui.Components.z9 z9Var;
        d0 d0Var;
        int i10;
        if (this.J == null || Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            canvasBeginRecording = canvas;
        } else {
            RenderNode renderNodeC = org.telegram.messenger.b.c(this.J);
            renderNodeC.setPosition(0, 0, getWidth(), getHeight());
            canvasBeginRecording = renderNodeC.beginRecording();
        }
        super.dispatchDraw(canvasBeginRecording);
        boolean zJ = j();
        org.telegram.ui.Components.y5 y5Var = this.E;
        org.telegram.ui.Components.y5[] y5VarArr = this.F;
        if (!zJ && !this.f15892b0 && !this.f15890a0) {
            float f12 = y5Var.f34812c;
            u uVar = this.f15898f;
            if (f12 == uVar.f16884c && y5VarArr[0].f34812c == uVar.d[0]) {
                t6 t6Var = this.f15893c;
                if (!t6Var.f16854b && t6Var.d.f34812c <= 0.0f) {
                    setCameraNeedsBlur(false);
                    i(canvas);
                    return;
                }
            }
        }
        if (this.f15903j0) {
            setCameraNeedsBlur(false);
        }
        canvasBeginRecording.drawColor(-14737633);
        float fE = this.G.e(this.f15890a0);
        float fD = y5Var.d(this.f15898f.f16884c, false);
        int i11 = 0;
        while (true) {
            double d10 = i11;
            d = fD;
            double dCeil = Math.ceil(d);
            fArr = this.I;
            fArr2 = this.H;
            if (d10 >= dCeil) {
                break;
            }
            fArr2[i11] = getMeasuredWidth();
            fArr[i11] = 0.0f;
            i11++;
        }
        for (int i12 = this.f15898f.f16884c; i12 < y5VarArr.length; i12++) {
            y5VarArr[i12].d(1.0f, false);
        }
        int i13 = 0;
        float fMax = 0.0f;
        boolean z10 = false;
        while (true) {
            arrayList = this.h;
            int size = arrayList.size();
            f10 = 0.0f;
            rectF = this.L;
            if (i13 >= size) {
                break;
            }
            d0 d0Var2 = (d0) arrayList.get(i13);
            t tVar = d0Var2.h;
            int i14 = tVar.f16830c;
            float f13 = fE;
            int i15 = tVar.f16829b;
            float f14 = fD;
            org.telegram.ui.Components.y5[] y5VarArr2 = y5VarArr;
            float fD2 = y5VarArr[i14].d(tVar.f16828a.d[i14], false);
            if (this.f15892b0 || this.f15890a0) {
                i10 = i14;
                AndroidUtilities.lerp(d0Var2.f15842j, d0Var2.f15843k, d0Var2.f15844l, rectF);
            } else {
                i10 = i14;
                rectF.set((getMeasuredWidth() / fD2) * i15, (getMeasuredHeight() / f14) * i14, (getMeasuredWidth() / fD2) * (i15 + 1), (getMeasuredHeight() / f14) * (i10 + 1));
            }
            fArr2[i10] = Math.min(fArr2[i10], rectF.left);
            fArr[i10] = Math.max(fArr[i10], rectF.right);
            fMax = Math.max(fMax, rectF.bottom);
            if (f13 <= 0.0f || d0Var2 != this.f15895d0) {
                if (this.f15903j0 && d0Var2.d != null) {
                    z10 = true;
                }
                g(canvasBeginRecording, rectF, d0Var2);
            }
            i13++;
            fE = f13;
            fD = f14;
            y5VarArr = y5VarArr2;
        }
        float f15 = fE;
        float f16 = fD;
        org.telegram.ui.Components.y5[] y5VarArr3 = y5VarArr;
        int i16 = 0;
        while (true) {
            ArrayList arrayList2 = this.f15906n;
            if (i16 >= arrayList2.size()) {
                break;
            }
            d0 d0Var3 = (d0) arrayList2.get(i16);
            t tVar2 = d0Var3.h;
            int i17 = tVar2.f16830c;
            int i18 = tVar2.f16829b;
            org.telegram.ui.Components.y5 y5Var2 = y5VarArr3[i17];
            int[] iArr = this.f15898f.d;
            int i19 = i16;
            float fD3 = y5Var2.d(i17 >= iArr.length ? 1.0f : iArr[i17], false);
            rectF.set((getMeasuredWidth() / fD3) * i18, (getMeasuredHeight() / f16) * i17, (getMeasuredWidth() / fD3) * (i18 + 1), (i17 + 1) * (getMeasuredHeight() / f16));
            fArr2[i17] = Math.min(fArr2[i17], rectF.left);
            fArr[i17] = Math.max(fArr[i17], rectF.right);
            fMax = Math.max(fMax, rectF.bottom);
            if (this.f15903j0 && d0Var3.d != null) {
                z10 = true;
            }
            g(canvasBeginRecording, rectF, d0Var3);
            i16 = i19 + 1;
        }
        if (this.f15890a0) {
            f11 = 0.0f;
        } else {
            int i20 = 0;
            while (i20 < Math.ceil(d)) {
                if (fArr2[i20] >= f10) {
                    rectF.set(0.0f, (getMeasuredHeight() / f16) * i20, fArr2[i20], (getMeasuredHeight() / f16) * (i20 + 1));
                    g(canvasBeginRecording, rectF, null);
                }
                if (fArr[i20] < getMeasuredWidth()) {
                    rectF.set(fArr[i20], (getMeasuredHeight() / f16) * i20, getMeasuredWidth(), (getMeasuredHeight() / f16) * (i20 + 1));
                    g(canvasBeginRecording, rectF, null);
                }
                i20++;
                f10 = 0.0f;
            }
            if (fMax < getMeasuredHeight()) {
                f11 = 0.0f;
                rectF.set(0.0f, fMax, getMeasuredWidth(), getMeasuredHeight());
                g(canvasBeginRecording, rectF, null);
            } else {
                f11 = 0.0f;
            }
        }
        if (f15 > f11 && (d0Var = this.f15895d0) != null) {
            t tVar3 = d0Var.h;
            int i21 = tVar3.f16830c;
            int i22 = tVar3.f16829b;
            float fD4 = y5VarArr3[i21].d(this.f15898f.d[i21], false);
            if (this.f15890a0) {
                AndroidUtilities.lerp(d0Var.f15842j, d0Var.f15843k, d0Var.f15844l, rectF);
            } else {
                rectF.set((getMeasuredWidth() / fD4) * i22, (getMeasuredHeight() / f16) * i21, (getMeasuredWidth() / fD4) * (i22 + 1), (getMeasuredHeight() / f16) * (i21 + 1));
            }
            canvasBeginRecording.save();
            canvasBeginRecording.translate(AndroidUtilities.lerp(this.T, this.V, d0Var.f15844l) * f15, AndroidUtilities.lerp(this.U, this.W, d0Var.f15844l) * f15);
            g(canvasBeginRecording, rectF, d0Var);
            canvasBeginRecording.restore();
        }
        for (int i23 = 0; i23 < arrayList.size(); i23++) {
            d0 d0Var4 = (d0) arrayList.get(i23);
            t tVar4 = d0Var4.h;
            float fD5 = d0Var4.f15836b.d(0.0f, false);
            if (fD5 > 0.0f) {
                int i24 = tVar4.f16830c;
                int i25 = tVar4.f16830c;
                int i26 = tVar4.f16829b;
                float fD6 = y5VarArr3[i24].d(tVar4.f16828a.d[i24], false);
                if (this.f15892b0 || this.f15890a0) {
                    AndroidUtilities.lerp(d0Var4.f15842j, d0Var4.f15843k, d0Var4.f15844l, rectF);
                } else {
                    rectF.set((getMeasuredWidth() / fD6) * i26, (getMeasuredHeight() / f16) * i25, (getMeasuredWidth() / fD6) * (i26 + 1), (getMeasuredHeight() / f16) * (i25 + 1));
                }
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(rectF);
                rectF2.inset(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                Matrix matrix = this.B;
                matrix.reset();
                float f17 = rectF.left;
                int i27 = this.f15917y;
                int i28 = i27 * i27;
                matrix.postTranslate(AndroidUtilities.lerp(((float) Math.sqrt(i28 + i28)) * (-1.4f), (float) Math.sqrt((rectF.height() * rectF.height()) + (rectF.width() * rectF.width())), 1.0f - fD5) + f17, 0.0f);
                matrix.postRotate(-25.0f);
                this.A.setLocalMatrix(matrix);
                Paint paint = this.v;
                paint.setAlpha(255);
                Path path = this.f15915w;
                path.rewind();
                t tVar5 = d0Var4.h;
                float fDp = (tVar5.f16829b == 0 && tVar5.f16830c == 0) ? AndroidUtilities.dp(8.0f) : 0.0f;
                float[] fArr3 = this.f15916x;
                fArr3[1] = fDp;
                fArr3[0] = fDp;
                t tVar6 = d0Var4.h;
                float fDp2 = (tVar6.f16829b == tVar6.f16828a.f16883b + (-1) && tVar6.f16830c == 0) ? AndroidUtilities.dp(8.0f) : 0.0f;
                fArr3[2] = fDp2;
                fArr3[1] = fDp2;
                t tVar7 = d0Var4.h;
                int i29 = tVar7.f16829b;
                u uVar2 = tVar7.f16828a;
                float fDp3 = (i29 == uVar2.f16883b + (-1) && tVar7.f16830c == uVar2.f16884c + (-1)) ? AndroidUtilities.dp(8.0f) : 0.0f;
                fArr3[4] = fDp3;
                fArr3[3] = fDp3;
                t tVar8 = d0Var4.h;
                float fDp4 = (tVar8.f16829b == 0 && tVar8.f16830c == tVar8.f16828a.f16884c + (-1)) ? AndroidUtilities.dp(8.0f) : 0.0f;
                fArr3[6] = fDp4;
                fArr3[5] = fDp4;
                path.addRoundRect(rectF2, fArr3, Path.Direction.CW);
                canvasBeginRecording.drawPath(path, paint);
            }
        }
        if (z10 && (z9Var = this.C) != null) {
            z9Var.d();
        }
        i(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ArrayList arrayList;
        org.telegram.ui.Components.y5[] y5VarArr;
        RectF rectF;
        d0 d0Var;
        b0 b0Var;
        if (!j() || this.f15903j0) {
            d();
            return false;
        }
        if (motionEvent.getPointerCount() > 1) {
            d();
            return false;
        }
        float x8 = motionEvent.getX();
        float y10 = motionEvent.getY();
        org.telegram.ui.Components.y5 y5Var = this.E;
        float f10 = y5Var.f34812c;
        int i10 = 0;
        while (true) {
            arrayList = this.h;
            int size = arrayList.size();
            y5VarArr = this.F;
            rectF = this.L;
            if (i10 >= size) {
                d0Var = null;
                break;
            }
            d0Var = (d0) arrayList.get(i10);
            t tVar = d0Var.h;
            int i11 = tVar.f16830c;
            int i12 = tVar.f16829b;
            float f11 = y5VarArr[i11].f34812c;
            rectF.set((getMeasuredWidth() / f11) * i12, (getMeasuredHeight() / f10) * i11, (getMeasuredWidth() / f11) * (i12 + 1), (getMeasuredHeight() / f10) * (i11 + 1));
            if (rectF.contains(x8, y10)) {
                break;
            }
            i10++;
        }
        if (motionEvent.getAction() == 0) {
            this.R = motionEvent.getX();
            this.S = motionEvent.getY();
            this.f15890a0 = false;
            this.V = 0.0f;
            this.T = 0.0f;
            this.W = 0.0f;
            this.U = 0.0f;
            this.f15894c0 = d0Var;
            if (d0Var != null) {
                b0 b0Var2 = new b0(this, 0);
                this.f15897e0 = b0Var2;
                AndroidUtilities.runOnUIThread(b0Var2, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 2) {
            if (h7.y.a(motionEvent.getX(), motionEvent.getY(), this.R, this.S) > AndroidUtilities.touchSlop * 1.2f && (b0Var = this.f15897e0) != null) {
                AndroidUtilities.cancelRunOnUIThread(b0Var);
                this.f15897e0 = null;
            }
            if (!this.f15890a0 && getFilledProgress() >= 1.0f && this.f15894c0 != null && d0Var != null && h7.y.a(motionEvent.getX(), motionEvent.getY(), this.R, this.S) > AndroidUtilities.touchSlop * 1.2f) {
                this.f15890a0 = true;
                this.f15895d0 = this.f15894c0;
                this.V = 0.0f;
                this.T = 0.0f;
                this.W = 0.0f;
                this.U = 0.0f;
                invalidate();
                b0 b0Var3 = this.f15897e0;
                if (b0Var3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(b0Var3);
                    this.f15897e0 = null;
                }
            } else if (this.f15890a0 && this.f15895d0 != null) {
                float x10 = motionEvent.getX();
                float y11 = motionEvent.getY();
                float f12 = y5Var.f34812c;
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        i13 = -1;
                        break;
                    }
                    t tVar2 = ((d0) arrayList.get(i13)).h;
                    int i14 = tVar2.f16830c;
                    int i15 = tVar2.f16829b;
                    float f13 = y5VarArr[i14].f34812c;
                    rectF.set((getMeasuredWidth() / f13) * i15, (getMeasuredHeight() / f12) * i14, (getMeasuredWidth() / f13) * (i15 + 1), (getMeasuredHeight() / f12) * (i14 + 1));
                    if (rectF.contains(x10, y11)) {
                        break;
                    }
                    i13++;
                }
                int iIndexOf = arrayList.indexOf(this.f15895d0);
                if (i13 >= 0 && iIndexOf >= 0 && i13 != iIndexOf) {
                    Collections.swap(arrayList, iIndexOf, i13);
                    o(this.f15898f);
                    this.f15892b0 = true;
                    invalidate();
                    float f14 = this.f15898f.f16884c;
                    t tVar3 = this.f15895d0.h;
                    int i16 = tVar3.f16830c;
                    int i17 = tVar3.f16829b;
                    float f15 = y5VarArr[i16].f34812c;
                    rectF.set((getMeasuredWidth() / f15) * i17, (getMeasuredHeight() / f14) * i16, (getMeasuredWidth() / f15) * (i17 + 1), (getMeasuredHeight() / f14) * (i16 + 1));
                    this.T = this.V;
                    this.U = this.W;
                    this.R = rectF.centerX();
                    this.S = rectF.centerY();
                }
                this.V = motionEvent.getX() - this.R;
                this.W = motionEvent.getY() - this.S;
                invalidate();
            } else if (this.f15894c0 != d0Var) {
                this.f15894c0 = null;
                b0 b0Var4 = this.f15897e0;
                if (b0Var4 == null) {
                    return true;
                }
                AndroidUtilities.cancelRunOnUIThread(b0Var4);
                this.f15897e0 = null;
                return true;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.f15894c0 != null) {
                this.f15894c0 = null;
                this.f15890a0 = false;
                invalidate();
                b0 b0Var5 = this.f15897e0;
                if (b0Var5 == null) {
                    return true;
                }
                AndroidUtilities.cancelRunOnUIThread(b0Var5);
                this.f15897e0 = null;
                return true;
            }
        } else if (motionEvent.getAction() == 3 && d()) {
            return true;
        }
        return this.f15894c0 != null || super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.d && AndroidUtilities.makingGlobalBlurBitmap) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((d0) obj).a(null);
        }
        q();
    }

    public final void g(Canvas canvas, RectF rectF, d0 d0Var) {
        boolean z10;
        CameraView cameraView;
        ImageView imageView;
        if (AndroidUtilities.makingGlobalBlurBitmap && d0Var == this.f15899f0) {
            return;
        }
        if (d0Var == this.f15895d0) {
            org.telegram.ui.Components.y5 y5Var = this.G;
            if (y5Var.f34812c > 0.0f) {
                canvas.save();
                Path path = this.M;
                path.rewind();
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(rectF);
                rectF2.inset(AndroidUtilities.dp(10.0f) * y5Var.f34812c, AndroidUtilities.dp(10.0f) * y5Var.f34812c);
                float fDp = AndroidUtilities.dp(12.0f) * y5Var.f34812c;
                path.addRoundRect(rectF2, fDp, fDp, Path.Direction.CW);
                canvas.clipPath(path);
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (d0Var != null) {
            ImageReceiver imageReceiver = d0Var.f15837c;
            if (d0Var.f15846n != null) {
                TextureView textureView = d0Var.f15838e;
                if (textureView == null || !d0Var.f15839f) {
                    imageReceiver.setImageCoords(rectF.left, rectF.top, rectF.width(), rectF.height());
                    if (!imageReceiver.draw(canvas)) {
                        CameraView cameraView2 = this.d;
                        if (cameraView2 == null && this.O) {
                            f(canvas, this.N, rectF, 0.0f);
                        } else {
                            h(0.0f, canvas, rectF, cameraView2);
                        }
                    }
                } else {
                    h(0.0f, canvas, rectF, textureView);
                }
            } else if ((d0Var == null && d0Var.f15845m) || AndroidUtilities.makingGlobalBlurBitmap) {
                CameraView cameraView3 = this.d;
                if (cameraView3 == null && this.O) {
                    f(canvas, this.N, rectF, (d0Var == null || !d0Var.f15845m) ? 0.4f : 0.0f);
                } else {
                    h((d0Var == null || !d0Var.f15845m) ? 0.4f : 0.0f, canvas, rectF, cameraView3);
                }
            } else {
                setCameraNeedsBlur(!this.f15903j0);
                if (this.f15896e == null && Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
                    RenderNode renderNodeC = org.telegram.messenger.b.c(this.f15896e);
                    float fMax = Math.max(rectF.width() / renderNodeC.getWidth(), rectF.height() / renderNodeC.getHeight());
                    canvas.save();
                    canvas.translate(rectF.left, rectF.top);
                    canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                    canvas.scale(fMax, fMax);
                    canvas.drawRenderNode(renderNodeC);
                    canvas.drawColor(1677721600);
                    canvas.restore();
                } else {
                    h(0.75f, canvas, rectF, this.d);
                }
                cameraView = this.d;
                if (cameraView != null && (imageView = cameraView.blurredStubView) != null && imageView.getVisibility() == 0 && this.d.blurredStubView.getAlpha() > 0.0f) {
                    h(0.4f, canvas, rectF, this.d.blurredStubView);
                }
            }
        } else if (d0Var == null) {
            setCameraNeedsBlur(!this.f15903j0);
            if (this.f15896e == null) {
                h(0.75f, canvas, rectF, this.d);
            } else {
                h(0.75f, canvas, rectF, this.d);
            }
            cameraView = this.d;
            if (cameraView != null) {
                h(0.4f, canvas, rectF, this.d.blurredStubView);
            }
        } else {
            setCameraNeedsBlur(!this.f15903j0);
            if (this.f15896e == null) {
                h(0.75f, canvas, rectF, this.d);
            } else {
                h(0.75f, canvas, rectF, this.d);
            }
            cameraView = this.d;
            if (cameraView != null) {
                h(0.4f, canvas, rectF, this.d.blurredStubView);
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    public Object getBlurRenderNode() {
        if (this.J == null && Build.VERSION.SDK_INT >= 31) {
            this.J = new RenderNode("CameraViewRenderNode");
            RenderNode renderNode = new RenderNode("CameraViewRenderNodeBlur");
            this.K = renderNode;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Shader.TileMode.DECAL));
        }
        return this.K;
    }

    public ArrayList<z7> getContent() {
        ArrayList<z7> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            z7 z7Var = ((d0) obj).f15846n;
            if (z7Var != null) {
                arrayList.add(z7Var);
            }
        }
        return arrayList;
    }

    public d0 getCurrent() {
        return this.f15911r;
    }

    public long getDuration() {
        d0 mainPart;
        z7 z7Var;
        if (!this.f15903j0 || (mainPart = getMainPart()) == null || (z7Var = mainPart.f15846n) == null) {
            return 1L;
        }
        return Math.max(Math.min((long) ((z7Var.W - z7Var.V) * z7Var.f17211h0), 59500L), 1L);
    }

    public int getFilledCount() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return i11;
            }
            if (((d0) arrayList.get(i10)).f15846n != null) {
                i11++;
            }
            i10++;
        }
    }

    public float getFilledProgress() {
        return getFilledCount() / getTotalCount();
    }

    public u getLayout() {
        return this.f15898f;
    }

    public d0 getMainPart() {
        d0 d0Var = null;
        if (!this.f15903j0) {
            return null;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        long j10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            d0 d0Var2 = (d0) obj;
            z7 z7Var = d0Var2.f15846n;
            if (z7Var != null && z7Var.K) {
                long duration = z7Var.f17211h0;
                ag.o3 o3Var = d0Var2.d;
                if (o3Var != null && o3Var.getDuration() > 0) {
                    duration = d0Var2.d.getDuration();
                }
                if (duration > j10) {
                    d0Var = d0Var2;
                    j10 = duration;
                }
            }
        }
        return d0Var;
    }

    public d0 getNext() {
        return this.f15913s;
    }

    public ArrayList<Integer> getOrder() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int iF = 0;
        while (true) {
            ArrayList arrayList2 = this.h;
            if (iF >= arrayList2.size()) {
                return arrayList;
            }
            iF = i0.a.f(((d0) arrayList2.get(iF)).f15835a, iF, 1, arrayList);
        }
    }

    public long getPosition() {
        if (!this.f15903j0) {
            return 0L;
        }
        if (!this.m0) {
            return this.f15910q0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = jCurrentTimeMillis - this.f15904k0;
        if (j10 > getDuration()) {
            this.f15904k0 = jCurrentTimeMillis - (j10 % getDuration());
        }
        return j10;
    }

    public long getPositionWithOffset() {
        long j10 = 0;
        if (!this.f15903j0) {
            return 0L;
        }
        getPosition();
        d0 mainPart = getMainPart();
        if (mainPart != null) {
            z7 z7Var = mainPart.f15846n;
            j10 = z7Var.X + ((long) (z7Var.V * z7Var.f17211h0));
        }
        return getPosition() + j10;
    }

    public int getTotalCount() {
        return this.h.size();
    }

    public final void h(float f10, Canvas canvas, RectF rectF, View view) {
        t6 t6Var;
        TextureView textureView;
        Bitmap bitmap;
        if (view == null) {
            return;
        }
        float fMax = Math.max(rectF.width() / view.getWidth(), rectF.height() / view.getHeight());
        canvas.save();
        canvas.translate(rectF.centerX(), rectF.centerY());
        canvas.clipRect((-rectF.width()) / 2.0f, (-rectF.height()) / 2.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
        canvas.scale(fMax, fMax);
        canvas.translate((-view.getWidth()) / 2.0f, (-view.getHeight()) / 2.0f);
        if (AndroidUtilities.makingGlobalBlurBitmap) {
            if (view instanceof TextureView) {
                textureView = (TextureView) view;
            } else {
                textureView = view instanceof CameraView ? ((CameraView) view).getTextureView() : null;
            }
            if (textureView != null && (bitmap = textureView.getBitmap()) != null) {
                canvas.scale(view.getWidth() / bitmap.getWidth(), view.getHeight() / bitmap.getHeight());
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else {
            view.draw(canvas);
        }
        if (f10 > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.g6.l1(view.getAlpha() * f10, -16777216));
        }
        canvas.restore();
        if (view != this.d || (t6Var = this.f15893c) == null) {
            return;
        }
        Paint paint = t6Var.f16859i;
        org.telegram.ui.Components.y5[] y5VarArr = t6Var.h;
        org.telegram.ui.Components.y5[] y5VarArr2 = t6Var.f16858g;
        Path path = t6Var.f16860j;
        s6 s6Var = t6Var.f16855c;
        if (s6Var == null || s6Var.f16728b.length <= 0) {
            return;
        }
        float fE = t6Var.d.e(t6Var.f16854b);
        float fD = t6Var.f16856e.d(t6Var.f16855c.f16729c, false);
        float fWidth = (rectF.width() * fD) + rectF.left;
        float fD2 = t6Var.f16857f.d(t6Var.f16855c.d, false);
        float fHeight = (rectF.height() * fD2) + rectF.top;
        float fLerp = AndroidUtilities.lerp(0.5f, 1.1f, fE);
        canvas.save();
        canvas.scale(fLerp, fLerp, fWidth, fHeight);
        if (fE > 0.0f) {
            path.rewind();
            int iMin = Math.min(4, t6Var.f16855c.f16728b.length);
            int i10 = 0;
            while (i10 < iMin) {
                int i11 = i10 - 1;
                if (i11 < 0) {
                    i11 = iMin - 1;
                }
                int i12 = i10 + 1;
                int i13 = i12 >= iMin ? 0 : i12;
                s6 s6Var2 = t6Var.f16855c;
                PointF[] pointFArr = s6Var2.f16728b;
                PointF pointF = pointFArr[i11];
                int i14 = iMin;
                PointF pointF2 = pointFArr[i10];
                org.telegram.ui.Components.y5[] y5VarArr3 = y5VarArr;
                PointF pointF3 = pointFArr[i13];
                org.telegram.ui.Components.y5[] y5VarArr4 = y5VarArr2;
                float f11 = fE;
                float fWidth2 = (rectF.width() * (y5VarArr4[i11].d(pointF.x - s6Var2.f16729c, false) + fD)) + rectF.left;
                float fHeight2 = (rectF.height() * (y5VarArr3[i11].d(pointF.y - t6Var.f16855c.d, false) + fD2)) + rectF.top;
                float fWidth3 = (rectF.width() * (y5VarArr4[i10].d(pointF2.x - t6Var.f16855c.f16729c, false) + fD)) + rectF.left;
                float fHeight3 = (rectF.height() * (y5VarArr3[i10].d(pointF2.y - t6Var.f16855c.d, false) + fD2)) + rectF.top;
                float fWidth4 = (rectF.width() * (y5VarArr4[i13].d(pointF3.x - t6Var.f16855c.f16729c, false) + fD)) + rectF.left;
                float fHeight4 = ((rectF.height() * (y5VarArr3[i13].d(pointF3.y - t6Var.f16855c.d, false) + fD2)) + rectF.top) - fHeight3;
                path.moveTo(((fWidth2 - fWidth3) * 0.18f) + fWidth3, ((fHeight2 - fHeight3) * 0.18f) + fHeight3);
                path.lineTo(fWidth3, fHeight3);
                path.lineTo(((fWidth4 - fWidth3) * 0.18f) + fWidth3, (fHeight4 * 0.18f) + fHeight3);
                y5VarArr2 = y5VarArr4;
                i10 = i12;
                iMin = i14;
                y5VarArr = y5VarArr3;
                fE = f11;
            }
            paint.setAlpha((int) (fE * 255.0f));
            canvas.drawPath(path, paint);
        }
        canvas.restore();
    }

    public final void i(Canvas canvas) {
        if (this.J == null || Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            return;
        }
        RenderNode renderNodeC = org.telegram.messenger.b.c(this.J);
        renderNodeC.endRecording();
        canvas.drawRenderNode(renderNodeC);
        Object obj = this.K;
        if (obj != null) {
            RenderNode renderNodeC2 = org.telegram.messenger.b.c(obj);
            renderNodeC2.setPosition(0, 0, getWidth(), getHeight());
            renderNodeC2.beginRecording().drawRenderNode(renderNodeC);
            renderNodeC2.endRecording();
        }
    }

    public final boolean j() {
        return this.f15898f.f16885e.size() > 1;
    }

    public final void k(RectF rectF, t tVar) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = AndroidUtilities.displaySize;
            int i10 = point.x;
            measuredHeight = point.y;
            measuredWidth = i10;
        }
        float f10 = measuredWidth;
        u uVar = tVar.f16828a;
        int[] iArr = uVar.d;
        int i11 = tVar.f16830c;
        int i12 = iArr[i11];
        int i13 = tVar.f16829b;
        float f11 = measuredHeight;
        int i14 = uVar.f16884c;
        rectF.set((f10 / i12) * i13, (f11 / i14) * i11, (f10 / i12) * (i13 + 1), (f11 / i14) * (i11 + 1));
    }

    public final boolean l(z7 z7Var) {
        if (z7Var.K) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                z7 z7Var2 = ((d0) obj).f15846n;
                if (z7Var2 != null && z7Var2.K && z7Var2.P > 0.0f) {
                    z7Var.P = 0.0f;
                    break;
                }
            }
        }
        d0 d0Var = this.f15911r;
        if (d0Var != null) {
            d0Var.a(z7Var);
        }
        q();
        requestLayout();
        return this.f15911r == null;
    }

    public final void m(long j10, boolean z10) {
        if (this.f15903j0) {
            long jClamp = Utilities.clamp(j10, getDuration(), 0L);
            if (!this.m0) {
                this.f15910q0 = jClamp;
            }
            this.f15904k0 = System.currentTimeMillis() - jClamp;
            this.f15905l0 = z10;
            if (this.f15903j0) {
                b0 b0Var = this.f15914s0;
                AndroidUtilities.cancelRunOnUIThread(b0Var);
                b0Var.run();
            }
        }
    }

    public final void n(z7 z7Var) {
        if (z7Var == null || z7Var.T == null) {
            e();
            return;
        }
        o(z7Var.S);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((d0) arrayList.get(i10)).a((z7) z7Var.T.get(i10));
            i10++;
        }
    }

    public final void o(u uVar) {
        if (uVar == null) {
            uVar = new u(".");
        }
        ArrayList arrayList = uVar.f16885e;
        this.f15898f = uVar;
        b0 b0Var = this.D;
        AndroidUtilities.cancelRunOnUIThread(b0Var);
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList2 = this.h;
            if (i10 >= Math.max(size, arrayList2.size())) {
                q();
                invalidate();
                AndroidUtilities.runOnUIThread(b0Var, 360L);
                return;
            }
            t tVar = i10 < arrayList.size() ? (t) arrayList.get(i10) : null;
            d0 d0Var = i10 < arrayList2.size() ? (d0) arrayList2.get(i10) : null;
            if (d0Var == null && tVar != null) {
                d0 d0Var2 = new d0(this);
                if (this.f15900g0) {
                    d0Var2.f15837c.onAttachedToWindow();
                }
                d0Var2.b(tVar, true);
                arrayList2.add(d0Var2);
            } else if (tVar != null) {
                d0Var.b(tVar, true);
            } else if (d0Var != null) {
                this.f15906n.add(d0Var);
                arrayList2.remove(d0Var);
                d0Var.b(null, true);
                i10--;
            }
            i10++;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                this.f15900g0 = true;
                return;
            } else {
                ((d0) arrayList.get(i10)).f15837c.onAttachedToWindow();
                i10++;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                this.f15900g0 = false;
                AndroidUtilities.cancelRunOnUIThread(this.f15914s0);
                return;
            } else {
                ((d0) arrayList.get(i10)).f15837c.onDetachedFromWindow();
                i10++;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        d0 d0Var;
        z7 z7Var;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt == this.d) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else {
                int i15 = 0;
                while (true) {
                    ArrayList arrayList = this.h;
                    if (i15 >= arrayList.size()) {
                        d0Var = null;
                        break;
                    } else {
                        if (childAt == ((d0) arrayList.get(i15)).f15838e) {
                            d0Var = (d0) arrayList.get(i15);
                            break;
                        }
                        i15++;
                    }
                }
                if (d0Var == null || (z7Var = d0Var.f15846n) == null || (i12 = z7Var.f17217k0) <= 0 || (i13 = z7Var.f17219l0) <= 0) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                } else {
                    if (z7Var.Q % 90 == 1) {
                        i13 = i12;
                        i12 = i13;
                    }
                    float f10 = i12;
                    float f11 = i13;
                    float fMin = Math.min(1.0f, Math.max(f10 / size, f11 / size2));
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (f10 * fMin), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (f11 * fMin), 1073741824));
                }
            }
        }
    }

    public final void p() {
        CameraView cameraView = this.d;
        boolean z10 = cameraView != null && this.Q;
        if (z10 == (this.f15896e != null)) {
            return;
        }
        if (z10) {
            this.f15896e = cameraView.getBlurRenderNode();
        } else {
            this.f15896e = null;
        }
    }

    public final void q() {
        ArrayList arrayList;
        this.f15911r = null;
        this.f15913s = null;
        int i10 = 0;
        while (true) {
            arrayList = this.h;
            if (i10 >= arrayList.size()) {
                break;
            }
            d0 d0Var = (d0) arrayList.get(i10);
            if (d0Var.f15846n == null) {
                if (this.f15911r != null) {
                    this.f15913s = d0Var;
                    break;
                }
                this.f15911r = d0Var;
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            d0 d0Var2 = (d0) arrayList.get(i11);
            d0Var2.f15845m = d0Var2 == this.f15911r;
        }
    }

    public void setCameraNeedsBlur(boolean z10) {
        if (this.Q == z10) {
            return;
        }
        this.Q = z10;
        p();
    }

    public void setCameraThumb(Drawable drawable) {
        this.N = drawable;
        invalidate();
    }

    public void setCameraThumbVisible(boolean z10) {
        this.O = z10;
        invalidate();
    }

    public void setCameraView(CameraView cameraView) {
        CameraView cameraView2 = this.d;
        if (cameraView2 != cameraView && cameraView2 != null) {
            cameraView2.unlistenDraw(new b0(this, 1));
            AndroidUtilities.removeFromParent(this.d);
            this.d = null;
            p();
        }
        this.d = cameraView;
        if (cameraView != null) {
            addView(cameraView, h7.z5.e(-1, -1, 119));
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
        this.f15901h0 = runnable;
    }

    public void setMuted(boolean z10) {
        if (this.f15912r0 == z10) {
            return;
        }
        this.f15912r0 = z10;
    }

    public void setOnCameraThumbClick(Runnable runnable) {
        this.P = runnable;
    }

    public void setPlaying(boolean z10) {
        boolean z11 = this.f15909p0;
        this.f15909p0 = true;
        if (this.m0 == z10) {
            return;
        }
        this.m0 = z10;
        if (!z10) {
            this.f15910q0 = getPosition();
        } else if (z11) {
            m(this.f15910q0, false);
        } else {
            this.f15905l0 = false;
        }
        if (this.f15903j0) {
            b0 b0Var = this.f15914s0;
            AndroidUtilities.cancelRunOnUIThread(b0Var);
            b0Var.run();
        }
    }

    public void setPreview(boolean z10) {
        if (this.f15903j0 == z10) {
            return;
        }
        this.f15903j0 = z10;
        ArrayList arrayList = this.h;
        int i10 = 0;
        if (z10) {
            org.telegram.ui.Components.z9 z9Var = this.C;
            if (z9Var != null) {
                z9Var.d();
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d0) arrayList.get(i11)).f15835a = i11;
            }
        }
        this.f15905l0 = false;
        this.f15910q0 = 0L;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            d0 d0Var = (d0) obj;
            ag.o3 o3Var = d0Var.d;
            if (o3Var != null) {
                o3Var.setAudioEnabled(z10, true);
                if (!z10 || this.m0) {
                    d0Var.d.play();
                } else {
                    d0Var.d.pause();
                }
            }
        }
        b0 b0Var = this.f15914s0;
        AndroidUtilities.cancelRunOnUIThread(b0Var);
        if (z10) {
            this.f15904k0 = System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(b0Var, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
        }
    }

    public void setPreviewView(q6 q6Var) {
        this.f15908o0 = q6Var;
    }

    public void setResetState(Runnable runnable) {
        this.f15902i0 = runnable;
    }

    public void setTimelineView(cc ccVar) {
        this.f15907n0 = ccVar;
    }
}
