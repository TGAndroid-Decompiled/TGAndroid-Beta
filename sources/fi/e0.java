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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.kb1;
public abstract class e0 extends FrameLayout implements k80 {
    public static final int f10740x0 = 0;
    public final LinearGradient E;
    public final Matrix F;
    public final org.telegram.ui.Components.la G;
    public final a0 H;
    public final org.telegram.ui.Components.h6 I;
    public final org.telegram.ui.Components.h6[] J;
    public final org.telegram.ui.Components.h6 K;
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
    public final FrameLayout f10741a;
    public float f10742a0;
    public final di.b f10743b;
    public float f10744b0;
    public final r6 f10745c;
    public float f10746c0;
    public CameraView d;
    public float f10747d0;
    public Object e;
    public boolean f10748e0;
    public t f10749f;
    public boolean f10750f0;
    public d0 f10751g0;
    public final ArrayList h;
    public d0 f10752h0;
    public a0 f10753i0;
    public d0 f10754j0;
    public boolean f10755k0;
    public Runnable f10756l0;
    public Runnable m0;
    public final ArrayList f10757n;
    public boolean f10758n0;
    public long f10759o0;
    public boolean f10760p0;
    public boolean f10761q0;
    public d0 f10762r;
    public cc f10763r0;
    public d0 f10764s;
    public o6 f10765s0;
    public boolean f10766t0;
    public long f10767u0;
    public final Paint v;
    public boolean f10768v0;
    public final Path f10769w;
    public final a0 f10770w0;
    public final float[] f10771x;
    public final int f10772y;

    public e0(Context context, org.telegram.ui.Components.la laVar, FrameLayout frameLayout, di.b bVar) {
        super(context);
        this.f10745c = new r6(new a0(this, 1));
        this.f10749f = new t(".");
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.f10757n = new ArrayList();
        Paint paint = new Paint(1);
        this.v = paint;
        this.f10769w = new Path();
        this.f10771x = new float[8];
        this.H = new a0(this, 2);
        ds dsVar = ds.h;
        this.I = new org.telegram.ui.Components.h6(this, 0L, 320L, dsVar);
        this.J = new org.telegram.ui.Components.h6[]{new org.telegram.ui.Components.h6(this, 0L, 320L, dsVar), new org.telegram.ui.Components.h6(this, 0L, 320L, dsVar), new org.telegram.ui.Components.h6(this, 0L, 320L, dsVar), new org.telegram.ui.Components.h6(this, 0L, 320L, dsVar), new org.telegram.ui.Components.h6(this, 0L, 320L, dsVar)};
        this.K = new org.telegram.ui.Components.h6(this, 0L, 320L, dsVar);
        this.L = new float[5];
        this.M = new float[5];
        this.P = new RectF();
        this.Q = new Path();
        this.S = true;
        this.f10761q0 = true;
        this.f10766t0 = true;
        this.f10770w0 = new a0(this, 3);
        this.G = laVar;
        this.f10741a = frameLayout;
        this.f10743b = bVar;
        setBackgroundColor(-14737633);
        d0 d0Var = new d0(this);
        d0Var.b((s) this.f10749f.e.get(0), false);
        d0Var.f10710m = true;
        if (this.f10755k0) {
            d0Var.f10703c.onAttachedToWindow();
        }
        arrayList.add(d0Var);
        this.f10762r = d0Var;
        this.f10764s = null;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(8.0f));
        int dp = AndroidUtilities.dp(300.0f);
        this.f10772y = dp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{0, -1, -1, 0}, new float[]{0.0f, 0.2f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = linearGradient;
        this.F = new Matrix();
        paint.setShader(linearGradient);
        setWillNotDraw(false);
    }

    public static void c(e0 e0Var, RectF rectF, s sVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        int measuredWidth = e0Var.getMeasuredWidth();
        int measuredHeight = e0Var.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = AndroidUtilities.displaySize;
            int i10 = point.x;
            measuredHeight = point.y;
            measuredWidth = i10;
        }
        e0Var.k(rectF, sVar);
        float f7 = rectF.left;
        boolean z13 = false;
        if (f7 <= 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = rectF.top;
        if (f10 <= 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        float f11 = measuredWidth;
        if (rectF.right >= f11) {
            z12 = true;
        } else {
            z12 = false;
        }
        float f12 = measuredHeight;
        if (rectF.bottom >= f12) {
            z13 = true;
        }
        if (z10 && z12 && !z11 && !z13) {
            rectF.offset(0.0f, f12 - f10);
        } else if (z11 && z13 && !z10 && !z12) {
            rectF.offset(0.0f, f11 - f7);
        } else {
            if (z12 && !z10) {
                rectF.offset(rectF.width(), 0.0f);
            }
            if (z13 && !z11) {
                rectF.offset(0.0f, rectF.height());
            }
        }
    }

    public static void f(Canvas canvas, Drawable drawable, RectF rectF, float f7) {
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
        if (f7 > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.y6.o1(drawable.getAlpha() * f7, -16777216));
        }
        canvas.restore();
    }

    @Override
    public final void a(RectF rectF) {
        d0 d0Var = this.f10754j0;
        if (d0Var != null) {
            s sVar = d0Var.h;
            t tVar = sVar.f11568a;
            int i10 = sVar.f11569b;
            int i11 = sVar.f11570c;
            float f7 = tVar.f11692c;
            float d = this.J[i11].d(tVar.d[i11], false);
            rectF.set((getMeasuredWidth() / d) * i10, (getMeasuredHeight() / f7) * i11, (getMeasuredWidth() / d) * (i10 + 1), (getMeasuredHeight() / f7) * (i11 + 1));
            return;
        }
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void b(Canvas canvas, float f7) {
        d0 d0Var = this.f10754j0;
        if (d0Var != null) {
            s sVar = d0Var.h;
            t tVar = sVar.f11568a;
            int i10 = sVar.f11569b;
            int i11 = sVar.f11570c;
            float f10 = tVar.f11692c;
            float d = this.J[i11].d(tVar.d[i11], false);
            float measuredWidth = (getMeasuredWidth() / d) * i10;
            float measuredHeight = (getMeasuredHeight() / f10) * i11;
            float measuredWidth2 = (getMeasuredWidth() / d) * (i10 + 1);
            float measuredHeight2 = (getMeasuredHeight() / f10) * (i11 + 1);
            RectF rectF = this.P;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            g(canvas, rectF, this.f10754j0);
        }
    }

    public final boolean d() {
        if (this.f10751g0 == null) {
            return false;
        }
        this.f10751g0 = null;
        this.f10748e0 = false;
        invalidate();
        a0 a0Var = this.f10753i0;
        if (a0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(a0Var);
            this.f10753i0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RecordingCanvas recordingCanvas;
        double d;
        float[] fArr;
        float[] fArr2;
        float f7;
        ArrayList arrayList;
        float f10;
        float f11;
        RectF rectF;
        float f12;
        org.telegram.ui.Components.la laVar;
        float f13;
        float f14;
        float f15;
        float f16;
        d0 d0Var;
        float f17;
        int i10;
        if (this.N != null && Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            RenderNode c10 = org.telegram.messenger.d.c(this.N);
            c10.setPosition(0, 0, getWidth(), getHeight());
            recordingCanvas = c10.beginRecording();
        } else {
            recordingCanvas = canvas;
        }
        super.dispatchDraw(recordingCanvas);
        boolean j10 = j();
        org.telegram.ui.Components.h6 h6Var = this.I;
        org.telegram.ui.Components.h6[] h6VarArr = this.J;
        float f18 = 0.0f;
        if (!j10 && !this.f10750f0 && !this.f10748e0) {
            float f19 = h6Var.f28864c;
            t tVar = this.f10749f;
            if (f19 == tVar.f11692c && h6VarArr[0].f28864c == tVar.d[0]) {
                r6 r6Var = this.f10745c;
                if (!r6Var.f11548b && r6Var.d.f28864c <= 0.0f) {
                    setCameraNeedsBlur(false);
                    i(canvas);
                    return;
                }
            }
        }
        if (this.f10758n0) {
            setCameraNeedsBlur(false);
        }
        recordingCanvas.drawColor(-14737633);
        float e = this.K.e(this.f10748e0);
        float d10 = h6Var.d(this.f10749f.f11692c, false);
        int i11 = 0;
        while (true) {
            d = d10;
            int i12 = (i11 > Math.ceil(d) ? 1 : (i11 == Math.ceil(d) ? 0 : -1));
            fArr = this.M;
            fArr2 = this.L;
            if (i12 >= 0) {
                break;
            }
            fArr2[i11] = getMeasuredWidth();
            fArr[i11] = 0.0f;
            i11++;
        }
        int i13 = this.f10749f.f11692c;
        while (true) {
            f7 = 1.0f;
            if (i13 >= h6VarArr.length) {
                break;
            }
            h6VarArr[i13].d(1.0f, false);
            i13++;
        }
        int i14 = 0;
        boolean z10 = false;
        float f20 = 0.0f;
        while (true) {
            arrayList = this.h;
            f10 = f7;
            int size = arrayList.size();
            f11 = f18;
            rectF = this.P;
            if (i14 >= size) {
                break;
            }
            d0 d0Var2 = (d0) arrayList.get(i14);
            s sVar = d0Var2.h;
            int i15 = sVar.f11570c;
            float f21 = e;
            int i16 = sVar.f11569b;
            float f22 = d10;
            org.telegram.ui.Components.h6[] h6VarArr2 = h6VarArr;
            float d11 = h6VarArr[i15].d(sVar.f11568a.d[i15], false);
            if (this.f10750f0 || this.f10748e0) {
                i10 = i15;
                AndroidUtilities.lerp(d0Var2.f10707j, d0Var2.f10708k, d0Var2.f10709l, rectF);
            } else {
                i10 = i15;
                rectF.set((getMeasuredWidth() / d11) * i16, (getMeasuredHeight() / f22) * i15, (getMeasuredWidth() / d11) * (i16 + 1), (getMeasuredHeight() / f22) * (i10 + 1));
            }
            fArr2[i10] = Math.min(fArr2[i10], rectF.left);
            fArr[i10] = Math.max(fArr[i10], rectF.right);
            f20 = Math.max(f20, rectF.bottom);
            if (f21 <= f11 || d0Var2 != this.f10752h0) {
                if (this.f10758n0 && d0Var2.d != null) {
                    z10 = true;
                }
                g(recordingCanvas, rectF, d0Var2);
            }
            i14++;
            f7 = f10;
            f18 = f11;
            e = f21;
            d10 = f22;
            h6VarArr = h6VarArr2;
        }
        float f23 = e;
        float f24 = d10;
        org.telegram.ui.Components.h6[] h6VarArr3 = h6VarArr;
        int i17 = 0;
        while (true) {
            ArrayList arrayList2 = this.f10757n;
            if (i17 >= arrayList2.size()) {
                break;
            }
            d0 d0Var3 = (d0) arrayList2.get(i17);
            s sVar2 = d0Var3.h;
            int i18 = sVar2.f11570c;
            int i19 = sVar2.f11569b;
            org.telegram.ui.Components.h6 h6Var2 = h6VarArr3[i18];
            int[] iArr = this.f10749f.d;
            int i20 = i17;
            if (i18 >= iArr.length) {
                f17 = f10;
            } else {
                f17 = iArr[i18];
            }
            float d12 = h6Var2.d(f17, false);
            rectF.set((getMeasuredWidth() / d12) * i19, (getMeasuredHeight() / f24) * i18, (getMeasuredWidth() / d12) * (i19 + 1), (i18 + 1) * (getMeasuredHeight() / f24));
            fArr2[i18] = Math.min(fArr2[i18], rectF.left);
            fArr[i18] = Math.max(fArr[i18], rectF.right);
            f20 = Math.max(f20, rectF.bottom);
            if (this.f10758n0 && d0Var3.d != null) {
                z10 = true;
            }
            g(recordingCanvas, rectF, d0Var3);
            i17 = i20 + 1;
        }
        if (!this.f10748e0) {
            int i21 = 0;
            while (i21 < Math.ceil(d)) {
                if (fArr2[i21] >= f11) {
                    rectF.set(f11, (getMeasuredHeight() / f24) * i21, fArr2[i21], (getMeasuredHeight() / f24) * (i21 + 1));
                    g(recordingCanvas, rectF, null);
                }
                if (fArr[i21] < getMeasuredWidth()) {
                    rectF.set(fArr[i21], (getMeasuredHeight() / f24) * i21, getMeasuredWidth(), (getMeasuredHeight() / f24) * (i21 + 1));
                    g(recordingCanvas, rectF, null);
                }
                i21++;
                f11 = 0.0f;
            }
            if (f20 < getMeasuredHeight()) {
                f12 = 0.0f;
                rectF.set(0.0f, f20, getMeasuredWidth(), getMeasuredHeight());
                g(recordingCanvas, rectF, null);
            } else {
                f12 = 0.0f;
            }
        } else {
            f12 = f11;
        }
        if (f23 > f12 && (d0Var = this.f10752h0) != null) {
            s sVar3 = d0Var.h;
            int i22 = sVar3.f11570c;
            int i23 = sVar3.f11569b;
            float d13 = h6VarArr3[i22].d(this.f10749f.d[i22], false);
            if (this.f10748e0) {
                AndroidUtilities.lerp(d0Var.f10707j, d0Var.f10708k, d0Var.f10709l, rectF);
            } else {
                rectF.set((getMeasuredWidth() / d13) * i23, (getMeasuredHeight() / f24) * i22, (getMeasuredWidth() / d13) * (i23 + 1), (getMeasuredHeight() / f24) * (i22 + 1));
            }
            recordingCanvas.save();
            recordingCanvas.translate(AndroidUtilities.lerp(this.f10742a0, this.f10746c0, d0Var.f10709l) * f23, AndroidUtilities.lerp(this.f10744b0, this.f10747d0, d0Var.f10709l) * f23);
            g(recordingCanvas, rectF, d0Var);
            recordingCanvas.restore();
        }
        for (int i24 = 0; i24 < arrayList.size(); i24++) {
            d0 d0Var4 = (d0) arrayList.get(i24);
            s sVar4 = d0Var4.h;
            float d14 = d0Var4.f10702b.d(0.0f, false);
            if (d14 > 0.0f) {
                int i25 = sVar4.f11570c;
                int i26 = sVar4.f11570c;
                int i27 = sVar4.f11569b;
                float d15 = h6VarArr3[i25].d(sVar4.f11568a.d[i25], false);
                if (!this.f10750f0 && !this.f10748e0) {
                    rectF.set((getMeasuredWidth() / d15) * i27, (getMeasuredHeight() / f24) * i26, (getMeasuredWidth() / d15) * (i27 + 1), (getMeasuredHeight() / f24) * (i26 + 1));
                } else {
                    AndroidUtilities.lerp(d0Var4.f10707j, d0Var4.f10708k, d0Var4.f10709l, rectF);
                }
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(rectF);
                rectF2.inset(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                Matrix matrix = this.F;
                matrix.reset();
                float f25 = rectF.left;
                int i28 = this.f10772y;
                int i29 = i28 * i28;
                matrix.postTranslate(AndroidUtilities.lerp(((float) Math.sqrt(i29 + i29)) * (-1.4f), (float) Math.sqrt((rectF.height() * rectF.height()) + (rectF.width() * rectF.width())), f10 - d14) + f25, 0.0f);
                matrix.postRotate(-25.0f);
                this.E.setLocalMatrix(matrix);
                Paint paint = this.v;
                paint.setAlpha(255);
                Path path = this.f10769w;
                path.rewind();
                s sVar5 = d0Var4.h;
                if (sVar5.f11569b == 0 && sVar5.f11570c == 0) {
                    f13 = AndroidUtilities.dp(8.0f);
                } else {
                    f13 = 0.0f;
                }
                float[] fArr3 = this.f10771x;
                fArr3[1] = f13;
                fArr3[0] = f13;
                s sVar6 = d0Var4.h;
                if (sVar6.f11569b == sVar6.f11568a.f11691b - 1 && sVar6.f11570c == 0) {
                    f14 = AndroidUtilities.dp(8.0f);
                } else {
                    f14 = 0.0f;
                }
                fArr3[2] = f14;
                fArr3[1] = f14;
                s sVar7 = d0Var4.h;
                int i30 = sVar7.f11569b;
                t tVar2 = sVar7.f11568a;
                if (i30 == tVar2.f11691b - 1 && sVar7.f11570c == tVar2.f11692c - 1) {
                    f15 = AndroidUtilities.dp(8.0f);
                } else {
                    f15 = 0.0f;
                }
                fArr3[4] = f15;
                fArr3[3] = f15;
                s sVar8 = d0Var4.h;
                if (sVar8.f11569b == 0 && sVar8.f11570c == sVar8.f11568a.f11692c - 1) {
                    f16 = AndroidUtilities.dp(8.0f);
                } else {
                    f16 = 0.0f;
                }
                fArr3[6] = f16;
                fArr3[5] = f16;
                path.addRoundRect(rectF2, fArr3, Path.Direction.CW);
                recordingCanvas.drawPath(path, paint);
            }
        }
        if (z10 && (laVar = this.G) != null) {
            laVar.d();
        }
        i(canvas);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r19) {
        throw new UnsupportedOperationException("Method not decompiled: fi.e0.dispatchTouchEvent(android.view.MotionEvent):boolean");
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

    public final void g(android.graphics.Canvas r9, android.graphics.RectF r10, fi.d0 r11) {
        throw new UnsupportedOperationException("Method not decompiled: fi.e0.g(android.graphics.Canvas, android.graphics.RectF, fi.d0):void");
    }

    public Object getBlurRenderNode() {
        Shader.TileMode tileMode;
        if (this.N == null && Build.VERSION.SDK_INT >= 31) {
            this.N = new RenderNode("CameraViewRenderNode");
            RenderNode renderNode = new RenderNode("CameraViewRenderNodeBlur");
            this.O = renderNode;
            tileMode = Shader.TileMode.DECAL;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), tileMode));
        }
        return this.O;
    }

    public ArrayList<w7> getContent() {
        ArrayList<w7> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            w7 w7Var = ((d0) obj).f10711n;
            if (w7Var != null) {
                arrayList.add(w7Var);
            }
        }
        return arrayList;
    }

    public d0 getCurrent() {
        return this.f10762r;
    }

    public long getDuration() {
        d0 mainPart;
        w7 w7Var;
        if (!this.f10758n0 || (mainPart = getMainPart()) == null || (w7Var = mainPart.f10711n) == null) {
            return 1L;
        }
        return Math.max(Math.min((w7Var.W - w7Var.V) * ((float) w7Var.f11904h0), 59500L), 1L);
    }

    public int getFilledCount() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((d0) arrayList.get(i10)).f10711n != null) {
                    i11++;
                }
                i10++;
            } else {
                return i11;
            }
        }
    }

    public float getFilledProgress() {
        return getFilledCount() / getTotalCount();
    }

    public t getLayout() {
        return this.f10749f;
    }

    public d0 getMainPart() {
        d0 d0Var = null;
        if (!this.f10758n0) {
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
            w7 w7Var = d0Var2.f10711n;
            if (w7Var != null && w7Var.K) {
                long j11 = w7Var.f11904h0;
                c0 c0Var = d0Var2.d;
                if (c0Var != null && c0Var.getDuration() > 0) {
                    j11 = d0Var2.d.getDuration();
                }
                if (j11 > j10) {
                    d0Var = d0Var2;
                    j10 = j11;
                }
            }
        }
        return d0Var;
    }

    public d0 getNext() {
        return this.f10764s;
    }

    public ArrayList<Integer> getOrder() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.h;
            if (i10 < arrayList2.size()) {
                i10 = c3.h0.i(((d0) arrayList2.get(i10)).f10701a, i10, 1, arrayList);
            } else {
                return arrayList;
            }
        }
    }

    public long getPosition() {
        if (!this.f10758n0) {
            return 0L;
        }
        if (!this.f10761q0) {
            return this.f10767u0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f10759o0;
        if (j10 > getDuration()) {
            this.f10759o0 = currentTimeMillis - (j10 % getDuration());
        }
        return j10;
    }

    public long getPositionWithOffset() {
        long j10 = 0;
        if (!this.f10758n0) {
            return 0L;
        }
        getPosition();
        d0 mainPart = getMainPart();
        if (mainPart != null) {
            w7 w7Var = mainPart.f10711n;
            j10 = w7Var.X + (w7Var.V * ((float) w7Var.f11904h0));
        }
        return getPosition() + j10;
    }

    public int getTotalCount() {
        return this.h.size();
    }

    public final void h(float f7, Canvas canvas, RectF rectF, View view) {
        r6 r6Var;
        int i10;
        TextureView textureView;
        Bitmap bitmap;
        if (view != null) {
            float max = Math.max(rectF.width() / view.getWidth(), rectF.height() / view.getHeight());
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            canvas.clipRect((-rectF.width()) / 2.0f, (-rectF.height()) / 2.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            canvas.scale(max, max);
            canvas.translate((-view.getWidth()) / 2.0f, (-view.getHeight()) / 2.0f);
            if (AndroidUtilities.makingGlobalBlurBitmap) {
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
            if (f7 > 0.0f) {
                canvas.drawColor(org.telegram.ui.ActionBar.y6.o1(view.getAlpha() * f7, -16777216));
            }
            canvas.restore();
            if (view == this.d && (r6Var = this.f10745c) != null) {
                Paint paint = r6Var.f11552i;
                org.telegram.ui.Components.h6[] h6VarArr = r6Var.h;
                org.telegram.ui.Components.h6[] h6VarArr2 = r6Var.f11551g;
                Path path = r6Var.f11553j;
                q6 q6Var = r6Var.f11549c;
                if (q6Var != null && q6Var.f11486b.length > 0) {
                    float e = r6Var.d.e(r6Var.f11548b);
                    int i11 = 0;
                    float d = r6Var.e.d(r6Var.f11549c.f11487c, false);
                    float width = (rectF.width() * d) + rectF.left;
                    float d10 = r6Var.f11550f.d(r6Var.f11549c.d, false);
                    float f10 = rectF.top;
                    float lerp = AndroidUtilities.lerp(0.5f, 1.1f, e);
                    canvas.save();
                    canvas.scale(lerp, lerp, width, (rectF.height() * d10) + f10);
                    if (e > 0.0f) {
                        path.rewind();
                        int min = Math.min(4, r6Var.f11549c.f11486b.length);
                        int i12 = 0;
                        while (i12 < min) {
                            int i13 = i12 - 1;
                            if (i13 < 0) {
                                i13 = min - 1;
                            }
                            int i14 = i12 + 1;
                            if (i14 >= min) {
                                i10 = i11;
                            } else {
                                i10 = i14;
                            }
                            q6 q6Var2 = r6Var.f11549c;
                            PointF[] pointFArr = q6Var2.f11486b;
                            PointF pointF = pointFArr[i13];
                            int i15 = min;
                            PointF pointF2 = pointFArr[i12];
                            org.telegram.ui.Components.h6[] h6VarArr3 = h6VarArr;
                            PointF pointF3 = pointFArr[i10];
                            org.telegram.ui.Components.h6[] h6VarArr4 = h6VarArr2;
                            float f11 = e;
                            float width2 = (rectF.width() * (h6VarArr4[i13].d(pointF.x - q6Var2.f11487c, false) + d)) + rectF.left;
                            float height = (rectF.height() * (h6VarArr3[i13].d(pointF.y - r6Var.f11549c.d, false) + d10)) + rectF.top;
                            float width3 = (rectF.width() * (h6VarArr4[i12].d(pointF2.x - r6Var.f11549c.f11487c, false) + d)) + rectF.left;
                            float height2 = (rectF.height() * (h6VarArr3[i12].d(pointF2.y - r6Var.f11549c.d, false) + d10)) + rectF.top;
                            float width4 = (rectF.width() * (h6VarArr4[i10].d(pointF3.x - r6Var.f11549c.f11487c, false) + d)) + rectF.left;
                            float f12 = rectF.top;
                            float height3 = rectF.height();
                            path.moveTo(((width2 - width3) * 0.18f) + width3, ((height - height2) * 0.18f) + height2);
                            path.lineTo(width3, height2);
                            path.lineTo(((width4 - width3) * 0.18f) + width3, ((((height3 * (h6VarArr3[i10].d(pointF3.y - r6Var.f11549c.d, false) + d10)) + f12) - height2) * 0.18f) + height2);
                            h6VarArr2 = h6VarArr4;
                            i11 = 0;
                            i12 = i14;
                            min = i15;
                            h6VarArr = h6VarArr3;
                            e = f11;
                        }
                        paint.setAlpha((int) (e * 255.0f));
                        canvas.drawPath(path, paint);
                    }
                    canvas.restore();
                }
            }
        }
    }

    public final void i(Canvas canvas) {
        if (this.N != null && Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            RenderNode c10 = org.telegram.messenger.d.c(this.N);
            c10.endRecording();
            canvas.drawRenderNode(c10);
            Object obj = this.O;
            if (obj != null) {
                RenderNode c11 = org.telegram.messenger.d.c(obj);
                c11.setPosition(0, 0, getWidth(), getHeight());
                c11.beginRecording().drawRenderNode(c10);
                c11.endRecording();
            }
        }
    }

    public final boolean j() {
        if (this.f10749f.e.size() > 1) {
            return true;
        }
        return false;
    }

    public final void k(RectF rectF, s sVar) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = AndroidUtilities.displaySize;
            int i10 = point.x;
            measuredHeight = point.y;
            measuredWidth = i10;
        }
        float f7 = measuredWidth;
        t tVar = sVar.f11568a;
        int[] iArr = tVar.d;
        int i11 = sVar.f11570c;
        int i12 = iArr[i11];
        int i13 = sVar.f11569b;
        float f10 = measuredHeight;
        int i14 = tVar.f11692c;
        rectF.set((f7 / i12) * i13, (f10 / i14) * i11, (f7 / i12) * (i13 + 1), (f10 / i14) * (i11 + 1));
    }

    public final boolean l(w7 w7Var) {
        if (w7Var.K) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                w7 w7Var2 = ((d0) obj).f10711n;
                if (w7Var2 != null && w7Var2.K && w7Var2.P > 0.0f) {
                    w7Var.P = 0.0f;
                    break;
                }
            }
        }
        d0 d0Var = this.f10762r;
        if (d0Var != null) {
            d0Var.a(w7Var);
        }
        q();
        requestLayout();
        if (this.f10762r != null) {
            return false;
        }
        return true;
    }

    public final void m(long j10, boolean z10) {
        if (this.f10758n0) {
            long clamp = Utilities.clamp(j10, getDuration(), 0L);
            if (!this.f10761q0) {
                this.f10767u0 = clamp;
            }
            this.f10759o0 = System.currentTimeMillis() - clamp;
            this.f10760p0 = z10;
            if (this.f10758n0) {
                a0 a0Var = this.f10770w0;
                AndroidUtilities.cancelRunOnUIThread(a0Var);
                a0Var.run();
            }
        }
    }

    public final void n(w7 w7Var) {
        if (w7Var != null && w7Var.T != null) {
            o(w7Var.S);
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i10 < arrayList.size()) {
                    ((d0) arrayList.get(i10)).a((w7) w7Var.T.get(i10));
                    i10++;
                } else {
                    return;
                }
            }
        } else {
            e();
        }
    }

    public final void o(t tVar) {
        s sVar;
        d0 d0Var;
        if (tVar == null) {
            tVar = new t(".");
        }
        ArrayList arrayList = tVar.e;
        this.f10749f = tVar;
        a0 a0Var = this.H;
        AndroidUtilities.cancelRunOnUIThread(a0Var);
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList2 = this.h;
            if (i10 < Math.max(size, arrayList2.size())) {
                if (i10 < arrayList.size()) {
                    sVar = (s) arrayList.get(i10);
                } else {
                    sVar = null;
                }
                if (i10 < arrayList2.size()) {
                    d0Var = (d0) arrayList2.get(i10);
                } else {
                    d0Var = null;
                }
                if (d0Var == null && sVar != null) {
                    d0 d0Var2 = new d0(this);
                    if (this.f10755k0) {
                        d0Var2.f10703c.onAttachedToWindow();
                    }
                    d0Var2.b(sVar, true);
                    arrayList2.add(d0Var2);
                } else if (sVar != null) {
                    d0Var.b(sVar, true);
                } else if (d0Var != null) {
                    this.f10757n.add(d0Var);
                    arrayList2.remove(d0Var);
                    d0Var.b(null, true);
                    i10--;
                }
                i10++;
            } else {
                q();
                invalidate();
                AndroidUtilities.runOnUIThread(a0Var, 360L);
                return;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                ((d0) arrayList.get(i10)).f10703c.onAttachedToWindow();
                i10++;
            } else {
                this.f10755k0 = true;
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                ((d0) arrayList.get(i10)).f10703c.onDetachedFromWindow();
                i10++;
            } else {
                this.f10755k0 = false;
                AndroidUtilities.cancelRunOnUIThread(this.f10770w0);
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        d0 d0Var;
        w7 w7Var;
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
                    if (i15 < arrayList.size()) {
                        if (childAt == ((d0) arrayList.get(i15)).e) {
                            d0Var = (d0) arrayList.get(i15);
                            break;
                        }
                        i15++;
                    } else {
                        d0Var = null;
                        break;
                    }
                }
                if (d0Var != null && (w7Var = d0Var.f10711n) != null && (i12 = w7Var.f11910k0) > 0 && (i13 = w7Var.f11912l0) > 0) {
                    if (w7Var.Q % 90 == 1) {
                        i13 = i12;
                        i12 = i13;
                    }
                    float f7 = i12;
                    float f10 = i13;
                    float min = Math.min(1.0f, Math.max(f7 / size, f10 / size2));
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (f7 * min), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (f10 * min), 1073741824));
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
        if (cameraView != null && this.U) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.e != null) {
            z11 = true;
        }
        if (z10 == z11) {
            return;
        }
        if (z10) {
            this.e = cameraView.getBlurRenderNode();
        } else {
            this.e = null;
        }
    }

    public final void q() {
        ArrayList arrayList;
        boolean z10;
        this.f10762r = null;
        this.f10764s = null;
        int i10 = 0;
        while (true) {
            arrayList = this.h;
            if (i10 >= arrayList.size()) {
                break;
            }
            d0 d0Var = (d0) arrayList.get(i10);
            if (d0Var.f10711n == null) {
                if (this.f10762r == null) {
                    this.f10762r = d0Var;
                } else {
                    this.f10764s = d0Var;
                    break;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            d0 d0Var2 = (d0) arrayList.get(i11);
            if (d0Var2 == this.f10762r) {
                z10 = true;
            } else {
                z10 = false;
            }
            d0Var2.f10710m = z10;
        }
    }

    public void setCameraNeedsBlur(boolean z10) {
        if (this.U == z10) {
            return;
        }
        this.U = z10;
        p();
    }

    public void setCameraThumb(Drawable drawable) {
        this.R = drawable;
        invalidate();
    }

    public void setCameraThumbVisible(boolean z10) {
        this.S = z10;
        invalidate();
    }

    public void setCameraView(CameraView cameraView) {
        CameraView cameraView2 = this.d;
        if (cameraView2 != cameraView && cameraView2 != null) {
            cameraView2.unlistenDraw(new a0(this, 1));
            AndroidUtilities.removeFromParent(this.d);
            this.d = null;
            p();
        }
        this.d = cameraView;
        if (cameraView != null) {
            addView(cameraView, kb1.i(-1, -1, 119));
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
        this.f10756l0 = runnable;
    }

    public void setMuted(boolean z10) {
        if (this.f10768v0 == z10) {
            return;
        }
        this.f10768v0 = z10;
    }

    public void setOnCameraThumbClick(Runnable runnable) {
        this.T = runnable;
    }

    public void setPlaying(boolean z10) {
        boolean z11 = this.f10766t0;
        this.f10766t0 = true;
        if (this.f10761q0 != z10) {
            this.f10761q0 = z10;
            if (!z10) {
                this.f10767u0 = getPosition();
            } else if (z11) {
                m(this.f10767u0, false);
            } else {
                this.f10760p0 = false;
            }
            if (this.f10758n0) {
                a0 a0Var = this.f10770w0;
                AndroidUtilities.cancelRunOnUIThread(a0Var);
                a0Var.run();
            }
        }
    }

    public void setPreview(boolean z10) {
        if (this.f10758n0 != z10) {
            this.f10758n0 = z10;
            ArrayList arrayList = this.h;
            int i10 = 0;
            if (z10) {
                org.telegram.ui.Components.la laVar = this.G;
                if (laVar != null) {
                    laVar.d();
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((d0) arrayList.get(i11)).f10701a = i11;
                }
            }
            this.f10760p0 = false;
            this.f10767u0 = 0L;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                d0 d0Var = (d0) obj;
                c0 c0Var = d0Var.d;
                if (c0Var != null) {
                    c0Var.setAudioEnabled(z10, true);
                    if (z10 && !this.f10761q0) {
                        d0Var.d.pause();
                    } else {
                        d0Var.d.play();
                    }
                }
            }
            a0 a0Var = this.f10770w0;
            AndroidUtilities.cancelRunOnUIThread(a0Var);
            if (z10) {
                this.f10759o0 = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(a0Var, 1000.0f / AndroidUtilities.screenRefreshRate);
            }
        }
    }

    public void setPreviewView(o6 o6Var) {
        this.f10765s0 = o6Var;
    }

    public void setResetState(Runnable runnable) {
        this.m0 = runnable;
    }

    public void setTimelineView(cc ccVar) {
        this.f10763r0 = ccVar;
    }
}
