package bi;

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
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.wr;
public abstract class j0 extends FrameLayout implements v70 {
    public static final int f2903x0 = 0;
    public final LinearGradient E;
    public final Matrix F;
    public final org.telegram.ui.Components.ia G;
    public final e0 H;
    public final org.telegram.ui.Components.d6 I;
    public final org.telegram.ui.Components.d6[] J;
    public final org.telegram.ui.Components.d6 K;
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
    public final FrameLayout f2904a;
    public float f2905a0;
    public final zh.b f2906b;
    public float f2907b0;
    public final h8 f2908c;
    public float f2909c0;
    public CameraView d;
    public float f2910d0;
    public Object e;
    public boolean f2911e0;
    public x f2912f;
    public boolean f2913f0;
    public i0 f2914g0;
    public final ArrayList h;
    public i0 f2915h0;
    public e0 f2916i0;
    public i0 f2917j0;
    public boolean f2918k0;
    public Runnable f2919l0;
    public Runnable m0;
    public final ArrayList f2920n;
    public boolean f2921n0;
    public long f2922o0;
    public boolean f2923p0;
    public boolean f2924q0;
    public i0 f2925r;
    public me f2926r0;
    public i0 f2927s;
    public e8 f2928s0;
    public boolean f2929t0;
    public long f2930u0;
    public final Paint v;
    public boolean f2931v0;
    public final Path f2932w;
    public final e0 f2933w0;
    public final float[] f2934x;
    public final int f2935y;

    public j0(Context context, org.telegram.ui.Components.ia iaVar, FrameLayout frameLayout, zh.b bVar) {
        super(context);
        this.f2908c = new h8(new e0(this, 1));
        this.f2912f = new x(".");
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.f2920n = new ArrayList();
        Paint paint = new Paint(1);
        this.v = paint;
        this.f2932w = new Path();
        this.f2934x = new float[8];
        this.H = new e0(this, 2);
        wr wrVar = wr.h;
        this.I = new org.telegram.ui.Components.d6(this, 0L, 320L, wrVar);
        this.J = new org.telegram.ui.Components.d6[]{new org.telegram.ui.Components.d6(this, 0L, 320L, wrVar), new org.telegram.ui.Components.d6(this, 0L, 320L, wrVar), new org.telegram.ui.Components.d6(this, 0L, 320L, wrVar), new org.telegram.ui.Components.d6(this, 0L, 320L, wrVar), new org.telegram.ui.Components.d6(this, 0L, 320L, wrVar)};
        this.K = new org.telegram.ui.Components.d6(this, 0L, 320L, wrVar);
        this.L = new float[5];
        this.M = new float[5];
        this.P = new RectF();
        this.Q = new Path();
        this.S = true;
        this.f2924q0 = true;
        this.f2929t0 = true;
        this.f2933w0 = new e0(this, 3);
        this.G = iaVar;
        this.f2904a = frameLayout;
        this.f2906b = bVar;
        setBackgroundColor(-14737633);
        i0 i0Var = new i0(this);
        i0Var.b((w) this.f2912f.e.get(0), false);
        i0Var.f2834m = true;
        if (this.f2918k0) {
            i0Var.f2827c.onAttachedToWindow();
        }
        arrayList.add(i0Var);
        this.f2925r = i0Var;
        this.f2927s = null;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(8.0f));
        int dp = AndroidUtilities.dp(300.0f);
        this.f2935y = dp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{0, -1, -1, 0}, new float[]{0.0f, 0.2f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = linearGradient;
        this.F = new Matrix();
        paint.setShader(linearGradient);
        setWillNotDraw(false);
    }

    public static void b(j0 j0Var, RectF rectF, w wVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        int measuredWidth = j0Var.getMeasuredWidth();
        int measuredHeight = j0Var.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = AndroidUtilities.displaySize;
            int i10 = point.x;
            measuredHeight = point.y;
            measuredWidth = i10;
        }
        j0Var.k(rectF, wVar);
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
            canvas.drawColor(org.telegram.ui.ActionBar.j6.l1(drawable.getAlpha() * f7, -16777216));
        }
        canvas.restore();
    }

    @Override
    public final void a(RectF rectF) {
        i0 i0Var = this.f2917j0;
        if (i0Var != null) {
            w wVar = i0Var.h;
            x xVar = wVar.f3811a;
            int i10 = wVar.f3812b;
            int i11 = wVar.f3813c;
            float f7 = xVar.f3854c;
            float d = this.J[i11].d(xVar.d[i11], false);
            rectF.set((getMeasuredWidth() / d) * i10, (getMeasuredHeight() / f7) * i11, (getMeasuredWidth() / d) * (i10 + 1), (getMeasuredHeight() / f7) * (i11 + 1));
            return;
        }
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void c(Canvas canvas, float f7) {
        i0 i0Var = this.f2917j0;
        if (i0Var != null) {
            w wVar = i0Var.h;
            x xVar = wVar.f3811a;
            int i10 = wVar.f3812b;
            int i11 = wVar.f3813c;
            float f10 = xVar.f3854c;
            float d = this.J[i11].d(xVar.d[i11], false);
            float measuredWidth = (getMeasuredWidth() / d) * i10;
            float measuredHeight = (getMeasuredHeight() / f10) * i11;
            float measuredWidth2 = (getMeasuredWidth() / d) * (i10 + 1);
            float measuredHeight2 = (getMeasuredHeight() / f10) * (i11 + 1);
            RectF rectF = this.P;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            g(canvas, rectF, this.f2917j0);
        }
    }

    public final boolean d() {
        if (this.f2914g0 == null) {
            return false;
        }
        this.f2914g0 = null;
        this.f2911e0 = false;
        invalidate();
        e0 e0Var = this.f2916i0;
        if (e0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(e0Var);
            this.f2916i0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: bi.j0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ArrayList arrayList;
        org.telegram.ui.Components.d6[] d6VarArr;
        RectF rectF;
        i0 i0Var;
        e0 e0Var;
        if (j() && !this.f2921n0) {
            if (motionEvent.getPointerCount() > 1) {
                d();
                return false;
            }
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            org.telegram.ui.Components.d6 d6Var = this.I;
            float f7 = d6Var.f22295c;
            int i10 = 0;
            while (true) {
                arrayList = this.h;
                int size = arrayList.size();
                d6VarArr = this.J;
                rectF = this.P;
                if (i10 < size) {
                    i0Var = (i0) arrayList.get(i10);
                    w wVar = i0Var.h;
                    int i11 = wVar.f3813c;
                    int i12 = wVar.f3812b;
                    float f10 = d6VarArr[i11].f22295c;
                    rectF.set((getMeasuredWidth() / f10) * i12, (getMeasuredHeight() / f7) * i11, (getMeasuredWidth() / f10) * (i12 + 1), (getMeasuredHeight() / f7) * (i11 + 1));
                    if (rectF.contains(x10, y3)) {
                        break;
                    }
                    i10++;
                } else {
                    i0Var = null;
                    break;
                }
            }
            if (motionEvent.getAction() == 0) {
                this.V = motionEvent.getX();
                this.W = motionEvent.getY();
                this.f2911e0 = false;
                this.f2909c0 = 0.0f;
                this.f2905a0 = 0.0f;
                this.f2910d0 = 0.0f;
                this.f2907b0 = 0.0f;
                this.f2914g0 = i0Var;
                if (i0Var != null) {
                    e0 e0Var2 = new e0(this, 0);
                    this.f2916i0 = e0Var2;
                    AndroidUtilities.runOnUIThread(e0Var2, ViewConfiguration.getLongPressTimeout());
                }
            } else if (motionEvent.getAction() == 2) {
                if (v7.a7.a(motionEvent.getX(), motionEvent.getY(), this.V, this.W) > AndroidUtilities.touchSlop * 1.2f && (e0Var = this.f2916i0) != null) {
                    AndroidUtilities.cancelRunOnUIThread(e0Var);
                    this.f2916i0 = null;
                }
                if (!this.f2911e0 && getFilledProgress() >= 1.0f && this.f2914g0 != null && i0Var != null && v7.a7.a(motionEvent.getX(), motionEvent.getY(), this.V, this.W) > AndroidUtilities.touchSlop * 1.2f) {
                    this.f2911e0 = true;
                    this.f2915h0 = this.f2914g0;
                    this.f2909c0 = 0.0f;
                    this.f2905a0 = 0.0f;
                    this.f2910d0 = 0.0f;
                    this.f2907b0 = 0.0f;
                    invalidate();
                    e0 e0Var3 = this.f2916i0;
                    if (e0Var3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(e0Var3);
                        this.f2916i0 = null;
                    }
                } else if (this.f2911e0 && this.f2915h0 != null) {
                    float x11 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    float f11 = d6Var.f22295c;
                    int i13 = 0;
                    while (true) {
                        if (i13 < arrayList.size()) {
                            w wVar2 = ((i0) arrayList.get(i13)).h;
                            int i14 = wVar2.f3813c;
                            int i15 = wVar2.f3812b;
                            float f12 = d6VarArr[i14].f22295c;
                            rectF.set((getMeasuredWidth() / f12) * i15, (getMeasuredHeight() / f11) * i14, (getMeasuredWidth() / f12) * (i15 + 1), (getMeasuredHeight() / f11) * (i14 + 1));
                            if (rectF.contains(x11, y10)) {
                                break;
                            }
                            i13++;
                        } else {
                            i13 = -1;
                            break;
                        }
                    }
                    int indexOf = arrayList.indexOf(this.f2915h0);
                    if (i13 >= 0 && indexOf >= 0 && i13 != indexOf) {
                        Collections.swap(arrayList, indexOf, i13);
                        o(this.f2912f);
                        this.f2913f0 = true;
                        invalidate();
                        float f13 = this.f2912f.f3854c;
                        w wVar3 = this.f2915h0.h;
                        int i16 = wVar3.f3813c;
                        int i17 = wVar3.f3812b;
                        float f14 = d6VarArr[i16].f22295c;
                        rectF.set((getMeasuredWidth() / f14) * i17, (getMeasuredHeight() / f13) * i16, (getMeasuredWidth() / f14) * (i17 + 1), (getMeasuredHeight() / f13) * (i16 + 1));
                        this.f2905a0 = this.f2909c0;
                        this.f2907b0 = this.f2910d0;
                        this.V = rectF.centerX();
                        this.W = rectF.centerY();
                    }
                    this.f2909c0 = motionEvent.getX() - this.V;
                    this.f2910d0 = motionEvent.getY() - this.W;
                    invalidate();
                } else if (this.f2914g0 != i0Var) {
                    this.f2914g0 = null;
                    e0 e0Var4 = this.f2916i0;
                    if (e0Var4 != null) {
                        AndroidUtilities.cancelRunOnUIThread(e0Var4);
                        this.f2916i0 = null;
                        return true;
                    }
                    return true;
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f2914g0 != null) {
                    this.f2914g0 = null;
                    this.f2911e0 = false;
                    invalidate();
                    e0 e0Var5 = this.f2916i0;
                    if (e0Var5 == null) {
                        return true;
                    }
                    AndroidUtilities.cancelRunOnUIThread(e0Var5);
                    this.f2916i0 = null;
                    return true;
                }
            } else if (motionEvent.getAction() == 3 && d()) {
                return true;
            }
            if (this.f2914g0 != null || super.dispatchTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
        d();
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.d && AndroidUtilities.makingGlobalBlurBitmap) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((i0) obj).a(null);
        }
        q();
    }

    public final void g(android.graphics.Canvas r9, android.graphics.RectF r10, bi.i0 r11) {
        throw new UnsupportedOperationException("Method not decompiled: bi.j0.g(android.graphics.Canvas, android.graphics.RectF, bi.i0):void");
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

    public ArrayList<r9> getContent() {
        ArrayList<r9> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            r9 r9Var = ((i0) obj).f2835n;
            if (r9Var != null) {
                arrayList.add(r9Var);
            }
        }
        return arrayList;
    }

    public i0 getCurrent() {
        return this.f2925r;
    }

    public long getDuration() {
        i0 mainPart;
        r9 r9Var;
        if (!this.f2921n0 || (mainPart = getMainPart()) == null || (r9Var = mainPart.f2835n) == null) {
            return 1L;
        }
        return Math.max(Math.min((r9Var.W - r9Var.V) * ((float) r9Var.f3576h0), 59500L), 1L);
    }

    public int getFilledCount() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((i0) arrayList.get(i10)).f2835n != null) {
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

    public x getLayout() {
        return this.f2912f;
    }

    public i0 getMainPart() {
        i0 i0Var = null;
        if (!this.f2921n0) {
            return null;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        long j3 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            i0 i0Var2 = (i0) obj;
            r9 r9Var = i0Var2.f2835n;
            if (r9Var != null && r9Var.K) {
                long j10 = r9Var.f3576h0;
                h0 h0Var = i0Var2.d;
                if (h0Var != null && h0Var.getDuration() > 0) {
                    j10 = i0Var2.d.getDuration();
                }
                if (j10 > j3) {
                    i0Var = i0Var2;
                    j3 = j10;
                }
            }
        }
        return i0Var;
    }

    public i0 getNext() {
        return this.f2927s;
    }

    public ArrayList<Integer> getOrder() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.h;
            if (i10 < arrayList2.size()) {
                i10 = com.google.android.gms.internal.vision.e2.d(((i0) arrayList2.get(i10)).f2825a, i10, 1, arrayList);
            } else {
                return arrayList;
            }
        }
    }

    public long getPosition() {
        if (!this.f2921n0) {
            return 0L;
        }
        if (!this.f2924q0) {
            return this.f2930u0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f2922o0;
        if (j3 > getDuration()) {
            this.f2922o0 = currentTimeMillis - (j3 % getDuration());
        }
        return j3;
    }

    public long getPositionWithOffset() {
        long j3 = 0;
        if (!this.f2921n0) {
            return 0L;
        }
        getPosition();
        i0 mainPart = getMainPart();
        if (mainPart != null) {
            r9 r9Var = mainPart.f2835n;
            j3 = r9Var.X + (r9Var.V * ((float) r9Var.f3576h0));
        }
        return getPosition() + j3;
    }

    public int getTotalCount() {
        return this.h.size();
    }

    public final void h(float f7, Canvas canvas, RectF rectF, View view) {
        h8 h8Var;
        int i10;
        TextureView textureView;
        Bitmap bitmap;
        RectF rectF2 = rectF;
        if (view != null) {
            float max = Math.max(rectF2.width() / view.getWidth(), rectF2.height() / view.getHeight());
            canvas.save();
            canvas.translate(rectF2.centerX(), rectF2.centerY());
            canvas.clipRect((-rectF2.width()) / 2.0f, (-rectF2.height()) / 2.0f, rectF2.width() / 2.0f, rectF2.height() / 2.0f);
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
                canvas.drawColor(org.telegram.ui.ActionBar.j6.l1(view.getAlpha() * f7, -16777216));
            }
            canvas.restore();
            if (view == this.d && (h8Var = this.f2908c) != null) {
                Paint paint = (Paint) h8Var.f2798i;
                org.telegram.ui.Components.d6[] d6VarArr = (org.telegram.ui.Components.d6[]) h8Var.h;
                org.telegram.ui.Components.d6[] d6VarArr2 = (org.telegram.ui.Components.d6[]) h8Var.f2797g;
                Path path = (Path) h8Var.f2799j;
                g8 g8Var = (g8) h8Var.f2795c;
                if (g8Var != null && g8Var.f2751b.length > 0) {
                    float e = ((org.telegram.ui.Components.d6) h8Var.d).e(h8Var.f2793a);
                    float d = ((org.telegram.ui.Components.d6) h8Var.e).d(((g8) h8Var.f2795c).f2752c, false);
                    float width = (rectF2.width() * d) + rectF2.left;
                    float d10 = ((org.telegram.ui.Components.d6) h8Var.f2796f).d(((g8) h8Var.f2795c).d, false);
                    float f10 = rectF2.top;
                    float lerp = AndroidUtilities.lerp(0.5f, 1.1f, e);
                    canvas.save();
                    canvas.scale(lerp, lerp, width, (rectF2.height() * d10) + f10);
                    if (e > 0.0f) {
                        path.rewind();
                        int min = Math.min(4, ((g8) h8Var.f2795c).f2751b.length);
                        int i11 = 0;
                        while (i11 < min) {
                            int i12 = i11 - 1;
                            if (i12 < 0) {
                                i12 = min - 1;
                            }
                            int i13 = i11 + 1;
                            if (i13 >= min) {
                                i10 = 0;
                            } else {
                                i10 = i13;
                            }
                            g8 g8Var2 = (g8) h8Var.f2795c;
                            PointF[] pointFArr = g8Var2.f2751b;
                            PointF pointF = pointFArr[i12];
                            int i14 = min;
                            PointF pointF2 = pointFArr[i11];
                            org.telegram.ui.Components.d6[] d6VarArr3 = d6VarArr;
                            PointF pointF3 = pointFArr[i10];
                            org.telegram.ui.Components.d6[] d6VarArr4 = d6VarArr2;
                            float f11 = e;
                            float width2 = (rectF2.width() * (d6VarArr4[i12].d(pointF.x - g8Var2.f2752c, false) + d)) + rectF2.left;
                            float height = (rectF2.height() * (d6VarArr3[i12].d(pointF.y - ((g8) h8Var.f2795c).d, false) + d10)) + rectF2.top;
                            float width3 = (rectF2.width() * (d6VarArr4[i11].d(pointF2.x - ((g8) h8Var.f2795c).f2752c, false) + d)) + rectF2.left;
                            float height2 = (rectF2.height() * (d6VarArr3[i11].d(pointF2.y - ((g8) h8Var.f2795c).d, false) + d10)) + rectF2.top;
                            float f12 = rectF2.left;
                            float width4 = rectF2.width();
                            float f13 = rectF2.top;
                            float height3 = rectF.height();
                            path.moveTo(((width2 - width3) * 0.18f) + width3, ((height - height2) * 0.18f) + height2);
                            path.lineTo(width3, height2);
                            path.lineTo(((((width4 * (d6VarArr4[i10].d(pointF3.x - ((g8) h8Var.f2795c).f2752c, false) + d)) + f12) - width3) * 0.18f) + width3, ((((height3 * (d6VarArr3[i10].d(pointF3.y - ((g8) h8Var.f2795c).d, false) + d10)) + f13) - height2) * 0.18f) + height2);
                            rectF2 = rectF;
                            d6VarArr2 = d6VarArr4;
                            i11 = i13;
                            min = i14;
                            d6VarArr = d6VarArr3;
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
            RenderNode c10 = org.telegram.messenger.b.c(this.N);
            c10.endRecording();
            canvas.drawRenderNode(c10);
            Object obj = this.O;
            if (obj != null) {
                RenderNode c11 = org.telegram.messenger.b.c(obj);
                c11.setPosition(0, 0, getWidth(), getHeight());
                c11.beginRecording().drawRenderNode(c10);
                c11.endRecording();
            }
        }
    }

    public final boolean j() {
        if (this.f2912f.e.size() > 1) {
            return true;
        }
        return false;
    }

    public final void k(RectF rectF, w wVar) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = AndroidUtilities.displaySize;
            int i10 = point.x;
            measuredHeight = point.y;
            measuredWidth = i10;
        }
        float f7 = measuredWidth;
        x xVar = wVar.f3811a;
        int[] iArr = xVar.d;
        int i11 = wVar.f3813c;
        int i12 = iArr[i11];
        int i13 = wVar.f3812b;
        float f10 = measuredHeight;
        int i14 = xVar.f3854c;
        rectF.set((f7 / i12) * i13, (f10 / i14) * i11, (f7 / i12) * (i13 + 1), (f10 / i14) * (i11 + 1));
    }

    public final boolean l(r9 r9Var) {
        if (r9Var.K) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                r9 r9Var2 = ((i0) obj).f2835n;
                if (r9Var2 != null && r9Var2.K && r9Var2.P > 0.0f) {
                    r9Var.P = 0.0f;
                    break;
                }
            }
        }
        i0 i0Var = this.f2925r;
        if (i0Var != null) {
            i0Var.a(r9Var);
        }
        q();
        requestLayout();
        if (this.f2925r != null) {
            return false;
        }
        return true;
    }

    public final void m(long j3, boolean z10) {
        if (this.f2921n0) {
            long clamp = Utilities.clamp(j3, getDuration(), 0L);
            if (!this.f2924q0) {
                this.f2930u0 = clamp;
            }
            this.f2922o0 = System.currentTimeMillis() - clamp;
            this.f2923p0 = z10;
            if (this.f2921n0) {
                e0 e0Var = this.f2933w0;
                AndroidUtilities.cancelRunOnUIThread(e0Var);
                e0Var.run();
            }
        }
    }

    public final void n(r9 r9Var) {
        if (r9Var != null && r9Var.T != null) {
            o(r9Var.S);
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i10 < arrayList.size()) {
                    ((i0) arrayList.get(i10)).a((r9) r9Var.T.get(i10));
                    i10++;
                } else {
                    return;
                }
            }
        } else {
            e();
        }
    }

    public final void o(x xVar) {
        w wVar;
        i0 i0Var;
        if (xVar == null) {
            xVar = new x(".");
        }
        ArrayList arrayList = xVar.e;
        this.f2912f = xVar;
        e0 e0Var = this.H;
        AndroidUtilities.cancelRunOnUIThread(e0Var);
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList2 = this.h;
            if (i10 < Math.max(size, arrayList2.size())) {
                if (i10 < arrayList.size()) {
                    wVar = (w) arrayList.get(i10);
                } else {
                    wVar = null;
                }
                if (i10 < arrayList2.size()) {
                    i0Var = (i0) arrayList2.get(i10);
                } else {
                    i0Var = null;
                }
                if (i0Var == null && wVar != null) {
                    i0 i0Var2 = new i0(this);
                    if (this.f2918k0) {
                        i0Var2.f2827c.onAttachedToWindow();
                    }
                    i0Var2.b(wVar, true);
                    arrayList2.add(i0Var2);
                } else if (wVar != null) {
                    i0Var.b(wVar, true);
                } else if (i0Var != null) {
                    this.f2920n.add(i0Var);
                    arrayList2.remove(i0Var);
                    i0Var.b(null, true);
                    i10--;
                }
                i10++;
            } else {
                q();
                invalidate();
                AndroidUtilities.runOnUIThread(e0Var, 360L);
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
                ((i0) arrayList.get(i10)).f2827c.onAttachedToWindow();
                i10++;
            } else {
                this.f2918k0 = true;
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
                ((i0) arrayList.get(i10)).f2827c.onDetachedFromWindow();
                i10++;
            } else {
                this.f2918k0 = false;
                AndroidUtilities.cancelRunOnUIThread(this.f2933w0);
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        i0 i0Var;
        r9 r9Var;
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
                        if (childAt == ((i0) arrayList.get(i15)).e) {
                            i0Var = (i0) arrayList.get(i15);
                            break;
                        }
                        i15++;
                    } else {
                        i0Var = null;
                        break;
                    }
                }
                if (i0Var != null && (r9Var = i0Var.f2835n) != null && (i12 = r9Var.f3582k0) > 0 && (i13 = r9Var.f3584l0) > 0) {
                    if (r9Var.Q % 90 == 1) {
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
        this.f2925r = null;
        this.f2927s = null;
        int i10 = 0;
        while (true) {
            arrayList = this.h;
            if (i10 >= arrayList.size()) {
                break;
            }
            i0 i0Var = (i0) arrayList.get(i10);
            if (i0Var.f2835n == null) {
                if (this.f2925r == null) {
                    this.f2925r = i0Var;
                } else {
                    this.f2927s = i0Var;
                    break;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            i0 i0Var2 = (i0) arrayList.get(i11);
            if (i0Var2 == this.f2925r) {
                z10 = true;
            } else {
                z10 = false;
            }
            i0Var2.f2834m = z10;
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
            cameraView2.unlistenDraw(new e0(this, 1));
            AndroidUtilities.removeFromParent(this.d);
            this.d = null;
            p();
        }
        this.d = cameraView;
        if (cameraView != null) {
            addView(cameraView, w7.a6.e(-1, -1, 119));
        }
        CameraView cameraView3 = this.d;
        if (cameraView3 != null) {
            cameraView3.unlistenDraw(new e0(this, 1));
        }
        this.d = cameraView;
        if (cameraView != null) {
            cameraView.listenDraw(new e0(this, 1));
        }
        p();
        invalidate();
    }

    public void setCancelGestures(Runnable runnable) {
        this.f2919l0 = runnable;
    }

    public void setMuted(boolean z10) {
        if (this.f2931v0 == z10) {
            return;
        }
        this.f2931v0 = z10;
    }

    public void setOnCameraThumbClick(Runnable runnable) {
        this.T = runnable;
    }

    public void setPlaying(boolean z10) {
        boolean z11 = this.f2929t0;
        this.f2929t0 = true;
        if (this.f2924q0 != z10) {
            this.f2924q0 = z10;
            if (!z10) {
                this.f2930u0 = getPosition();
            } else if (z11) {
                m(this.f2930u0, false);
            } else {
                this.f2923p0 = false;
            }
            if (this.f2921n0) {
                e0 e0Var = this.f2933w0;
                AndroidUtilities.cancelRunOnUIThread(e0Var);
                e0Var.run();
            }
        }
    }

    public void setPreview(boolean z10) {
        if (this.f2921n0 != z10) {
            this.f2921n0 = z10;
            ArrayList arrayList = this.h;
            int i10 = 0;
            if (z10) {
                org.telegram.ui.Components.ia iaVar = this.G;
                if (iaVar != null) {
                    iaVar.d();
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((i0) arrayList.get(i11)).f2825a = i11;
                }
            }
            this.f2923p0 = false;
            this.f2930u0 = 0L;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                i0 i0Var = (i0) obj;
                h0 h0Var = i0Var.d;
                if (h0Var != null) {
                    h0Var.setAudioEnabled(z10, true);
                    if (z10 && !this.f2924q0) {
                        i0Var.d.pause();
                    } else {
                        i0Var.d.play();
                    }
                }
            }
            e0 e0Var = this.f2933w0;
            AndroidUtilities.cancelRunOnUIThread(e0Var);
            if (z10) {
                this.f2922o0 = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(e0Var, 1000.0f / AndroidUtilities.screenRefreshRate);
            }
        }
    }

    public void setPreviewView(e8 e8Var) {
        this.f2928s0 = e8Var;
    }

    public void setResetState(Runnable runnable) {
        this.m0 = runnable;
    }

    public void setTimelineView(me meVar) {
        this.f2926r0 = meVar;
    }
}
