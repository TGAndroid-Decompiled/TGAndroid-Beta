package kh;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.w60;
public abstract class f0 extends FrameLayout implements w60 {
    public static final int f15193t0 = 0;
    public final LinearGradient A;
    public final Matrix B;
    public final org.telegram.ui.Components.ba C;
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
    public final FrameLayout f15194a;
    public boolean f15195a0;
    public final ih.b f15196b;
    public boolean f15197b0;
    public final u6 f15198c;
    public e0 f15199c0;
    public CameraView d;
    public e0 f15200d0;
    public Object f15201e;
    public b0 f15202e0;
    public u f15203f;
    public e0 f15204f0;
    public boolean f15205g0;
    public final ArrayList h;
    public Runnable f15206h0;
    public Runnable f15207i0;
    public boolean f15208j0;
    public long f15209k0;
    public boolean f15210l0;
    public boolean m0;
    public final ArrayList f15211n;
    public gc f15212n0;
    public r6 f15213o0;
    public boolean f15214p0;
    public long f15215q0;
    public e0 f15216r;
    public boolean f15217r0;
    public e0 f15218s;
    public final b0 f15219s0;
    public final Paint v;
    public final Path f15220w;
    public final float[] f15221x;
    public final int f15222y;

    public f0(Context context, org.telegram.ui.Components.ba baVar, FrameLayout frameLayout, ih.b bVar) {
        super(context);
        this.f15198c = new u6(new b0(this, 1));
        this.f15203f = new u(".");
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.f15211n = new ArrayList();
        Paint paint = new Paint(1);
        this.v = paint;
        this.f15220w = new Path();
        this.f15221x = new float[8];
        this.D = new b0(this, 2);
        gr grVar = gr.h;
        this.E = new org.telegram.ui.Components.y5(this, 0L, 320L, grVar);
        this.F = new org.telegram.ui.Components.y5[]{new org.telegram.ui.Components.y5(this, 0L, 320L, grVar), new org.telegram.ui.Components.y5(this, 0L, 320L, grVar), new org.telegram.ui.Components.y5(this, 0L, 320L, grVar), new org.telegram.ui.Components.y5(this, 0L, 320L, grVar), new org.telegram.ui.Components.y5(this, 0L, 320L, grVar)};
        this.G = new org.telegram.ui.Components.y5(this, 0L, 320L, grVar);
        this.H = new float[5];
        this.I = new float[5];
        this.L = new RectF();
        this.M = new Path();
        this.O = true;
        this.m0 = true;
        this.f15214p0 = true;
        this.f15219s0 = new b0(this, 3);
        this.C = baVar;
        this.f15194a = frameLayout;
        this.f15196b = bVar;
        setBackgroundColor(-14737633);
        e0 e0Var = new e0(this);
        e0Var.b((t) this.f15203f.f16118e.get(0), false);
        e0Var.f15139m = true;
        if (this.f15205g0) {
            e0Var.f15131c.onAttachedToWindow();
        }
        arrayList.add(e0Var);
        this.f15216r = e0Var;
        this.f15218s = null;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(8.0f));
        int dp = AndroidUtilities.dp(300.0f);
        this.f15222y = dp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{0, -1, -1, 0}, new float[]{0.0f, 0.2f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
        this.A = linearGradient;
        this.B = new Matrix();
        paint.setShader(linearGradient);
        setWillNotDraw(false);
    }

    public static void c(f0 f0Var, RectF rectF, t tVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        int measuredWidth = f0Var.getMeasuredWidth();
        int measuredHeight = f0Var.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = AndroidUtilities.displaySize;
            int i9 = point.x;
            measuredHeight = point.y;
            measuredWidth = i9;
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

    public static void f(Canvas canvas, Drawable drawable, RectF rectF, float f10) {
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
            canvas.drawColor(org.telegram.ui.ActionBar.f6.l1(drawable.getAlpha() * f10, -16777216));
        }
        canvas.restore();
    }

    @Override
    public final void a(RectF rectF) {
        e0 e0Var = this.f15204f0;
        if (e0Var != null) {
            t tVar = e0Var.h;
            u uVar = tVar.f16073a;
            int i9 = tVar.f16074b;
            int i10 = tVar.f16075c;
            float f10 = uVar.f16117c;
            float d = this.F[i10].d(uVar.d[i10], false);
            rectF.set((getMeasuredWidth() / d) * i9, (getMeasuredHeight() / f10) * i10, (getMeasuredWidth() / d) * (i9 + 1), (getMeasuredHeight() / f10) * (i10 + 1));
            return;
        }
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void b(Canvas canvas, float f10) {
        e0 e0Var = this.f15204f0;
        if (e0Var != null) {
            t tVar = e0Var.h;
            u uVar = tVar.f16073a;
            int i9 = tVar.f16074b;
            int i10 = tVar.f16075c;
            float f11 = uVar.f16117c;
            float d = this.F[i10].d(uVar.d[i10], false);
            float measuredWidth = (getMeasuredWidth() / d) * i9;
            float measuredHeight = (getMeasuredHeight() / f11) * i10;
            float measuredWidth2 = (getMeasuredWidth() / d) * (i9 + 1);
            float measuredHeight2 = (getMeasuredHeight() / f11) * (i10 + 1);
            RectF rectF = this.L;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            g(canvas, rectF, this.f15204f0);
        }
    }

    public final boolean d() {
        if (this.f15199c0 == null) {
            return false;
        }
        this.f15199c0 = null;
        this.f15195a0 = false;
        invalidate();
        b0 b0Var = this.f15202e0;
        if (b0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(b0Var);
            this.f15202e0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: kh.f0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ArrayList arrayList;
        org.telegram.ui.Components.y5[] y5VarArr;
        RectF rectF;
        e0 e0Var;
        b0 b0Var;
        if (j() && !this.f15208j0) {
            if (motionEvent.getPointerCount() > 1) {
                d();
                return false;
            }
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            org.telegram.ui.Components.y5 y5Var = this.E;
            float f10 = y5Var.f34854c;
            int i9 = 0;
            while (true) {
                arrayList = this.h;
                int size = arrayList.size();
                y5VarArr = this.F;
                rectF = this.L;
                if (i9 < size) {
                    e0Var = (e0) arrayList.get(i9);
                    t tVar = e0Var.h;
                    int i10 = tVar.f16075c;
                    int i11 = tVar.f16074b;
                    float f11 = y5VarArr[i10].f34854c;
                    rectF.set((getMeasuredWidth() / f11) * i11, (getMeasuredHeight() / f10) * i10, (getMeasuredWidth() / f11) * (i11 + 1), (getMeasuredHeight() / f10) * (i10 + 1));
                    if (rectF.contains(x10, y10)) {
                        break;
                    }
                    i9++;
                } else {
                    e0Var = null;
                    break;
                }
            }
            if (motionEvent.getAction() == 0) {
                this.R = motionEvent.getX();
                this.S = motionEvent.getY();
                this.f15195a0 = false;
                this.V = 0.0f;
                this.T = 0.0f;
                this.W = 0.0f;
                this.U = 0.0f;
                this.f15199c0 = e0Var;
                if (e0Var != null) {
                    b0 b0Var2 = new b0(this, 0);
                    this.f15202e0 = b0Var2;
                    AndroidUtilities.runOnUIThread(b0Var2, ViewConfiguration.getLongPressTimeout());
                }
            } else if (motionEvent.getAction() == 2) {
                if (g7.w.a(motionEvent.getX(), motionEvent.getY(), this.R, this.S) > AndroidUtilities.touchSlop * 1.2f && (b0Var = this.f15202e0) != null) {
                    AndroidUtilities.cancelRunOnUIThread(b0Var);
                    this.f15202e0 = null;
                }
                if (!this.f15195a0 && getFilledProgress() >= 1.0f && this.f15199c0 != null && e0Var != null && g7.w.a(motionEvent.getX(), motionEvent.getY(), this.R, this.S) > AndroidUtilities.touchSlop * 1.2f) {
                    this.f15195a0 = true;
                    this.f15200d0 = this.f15199c0;
                    this.V = 0.0f;
                    this.T = 0.0f;
                    this.W = 0.0f;
                    this.U = 0.0f;
                    invalidate();
                    b0 b0Var3 = this.f15202e0;
                    if (b0Var3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(b0Var3);
                        this.f15202e0 = null;
                    }
                } else if (this.f15195a0 && this.f15200d0 != null) {
                    float x11 = motionEvent.getX();
                    float y11 = motionEvent.getY();
                    float f12 = y5Var.f34854c;
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList.size()) {
                            t tVar2 = ((e0) arrayList.get(i12)).h;
                            int i13 = tVar2.f16075c;
                            int i14 = tVar2.f16074b;
                            float f13 = y5VarArr[i13].f34854c;
                            rectF.set((getMeasuredWidth() / f13) * i14, (getMeasuredHeight() / f12) * i13, (getMeasuredWidth() / f13) * (i14 + 1), (getMeasuredHeight() / f12) * (i13 + 1));
                            if (rectF.contains(x11, y11)) {
                                break;
                            }
                            i12++;
                        } else {
                            i12 = -1;
                            break;
                        }
                    }
                    int indexOf = arrayList.indexOf(this.f15200d0);
                    if (i12 >= 0 && indexOf >= 0 && i12 != indexOf) {
                        Collections.swap(arrayList, indexOf, i12);
                        o(this.f15203f);
                        this.f15197b0 = true;
                        invalidate();
                        float f14 = this.f15203f.f16117c;
                        t tVar3 = this.f15200d0.h;
                        int i15 = tVar3.f16075c;
                        int i16 = tVar3.f16074b;
                        float f15 = y5VarArr[i15].f34854c;
                        rectF.set((getMeasuredWidth() / f15) * i16, (getMeasuredHeight() / f14) * i15, (getMeasuredWidth() / f15) * (i16 + 1), (getMeasuredHeight() / f14) * (i15 + 1));
                        this.T = this.V;
                        this.U = this.W;
                        this.R = rectF.centerX();
                        this.S = rectF.centerY();
                    }
                    this.V = motionEvent.getX() - this.R;
                    this.W = motionEvent.getY() - this.S;
                    invalidate();
                } else if (this.f15199c0 != e0Var) {
                    this.f15199c0 = null;
                    b0 b0Var4 = this.f15202e0;
                    if (b0Var4 != null) {
                        AndroidUtilities.cancelRunOnUIThread(b0Var4);
                        this.f15202e0 = null;
                        return true;
                    }
                    return true;
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f15199c0 != null) {
                    this.f15199c0 = null;
                    this.f15195a0 = false;
                    invalidate();
                    b0 b0Var5 = this.f15202e0;
                    if (b0Var5 == null) {
                        return true;
                    }
                    AndroidUtilities.cancelRunOnUIThread(b0Var5);
                    this.f15202e0 = null;
                    return true;
                }
            } else if (motionEvent.getAction() == 3 && d()) {
                return true;
            }
            if (this.f15199c0 != null || super.dispatchTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }
        d();
        return false;
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
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((e0) obj).a(null);
        }
        q();
    }

    public final void g(android.graphics.Canvas r9, android.graphics.RectF r10, kh.e0 r11) {
        throw new UnsupportedOperationException("Method not decompiled: kh.f0.g(android.graphics.Canvas, android.graphics.RectF, kh.e0):void");
    }

    public Object getBlurRenderNode() {
        Shader.TileMode tileMode;
        if (this.J == null && Build.VERSION.SDK_INT >= 31) {
            this.J = new RenderNode("CameraViewRenderNode");
            RenderNode renderNode = new RenderNode("CameraViewRenderNodeBlur");
            this.K = renderNode;
            tileMode = Shader.TileMode.DECAL;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), tileMode));
        }
        return this.K;
    }

    public ArrayList<a8> getContent() {
        ArrayList<a8> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList2.get(i9);
            i9++;
            a8 a8Var = ((e0) obj).f15140n;
            if (a8Var != null) {
                arrayList.add(a8Var);
            }
        }
        return arrayList;
    }

    public e0 getCurrent() {
        return this.f15216r;
    }

    public long getDuration() {
        e0 mainPart;
        a8 a8Var;
        if (!this.f15208j0 || (mainPart = getMainPart()) == null || (a8Var = mainPart.f15140n) == null) {
            return 1L;
        }
        return Math.max(Math.min((a8Var.W - a8Var.V) * ((float) a8Var.f14919h0), 59500L), 1L);
    }

    public int getFilledCount() {
        int i9 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i9 < arrayList.size()) {
                if (((e0) arrayList.get(i9)).f15140n != null) {
                    i10++;
                }
                i9++;
            } else {
                return i10;
            }
        }
    }

    public float getFilledProgress() {
        return getFilledCount() / getTotalCount();
    }

    public u getLayout() {
        return this.f15203f;
    }

    public e0 getMainPart() {
        e0 e0Var = null;
        if (!this.f15208j0) {
            return null;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i9 = 0;
        long j10 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            e0 e0Var2 = (e0) obj;
            a8 a8Var = e0Var2.f15140n;
            if (a8Var != null && a8Var.K) {
                long j11 = a8Var.f14919h0;
                d0 d0Var = e0Var2.d;
                if (d0Var != null && d0Var.getDuration() > 0) {
                    j11 = e0Var2.d.getDuration();
                }
                if (j11 > j10) {
                    e0Var = e0Var2;
                    j10 = j11;
                }
            }
        }
        return e0Var;
    }

    public e0 getNext() {
        return this.f15218s;
    }

    public ArrayList<Integer> getOrder() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i9 = 0;
        while (true) {
            ArrayList arrayList2 = this.h;
            if (i9 < arrayList2.size()) {
                i9 = j3.r0.e(((e0) arrayList2.get(i9)).f15129a, i9, 1, arrayList);
            } else {
                return arrayList;
            }
        }
    }

    public long getPosition() {
        if (!this.f15208j0) {
            return 0L;
        }
        if (!this.m0) {
            return this.f15215q0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f15209k0;
        if (j10 > getDuration()) {
            this.f15209k0 = currentTimeMillis - (j10 % getDuration());
        }
        return j10;
    }

    public long getPositionWithOffset() {
        long j10 = 0;
        if (!this.f15208j0) {
            return 0L;
        }
        getPosition();
        e0 mainPart = getMainPart();
        if (mainPart != null) {
            a8 a8Var = mainPart.f15140n;
            j10 = a8Var.X + (a8Var.V * ((float) a8Var.f14919h0));
        }
        return getPosition() + j10;
    }

    public int getTotalCount() {
        return this.h.size();
    }

    public final void h(float f10, Canvas canvas, RectF rectF, View view) {
        u6 u6Var;
        int i9;
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
            if (f10 > 0.0f) {
                canvas.drawColor(org.telegram.ui.ActionBar.f6.l1(view.getAlpha() * f10, -16777216));
            }
            canvas.restore();
            if (view == this.d && (u6Var = this.f15198c) != null) {
                Paint paint = u6Var.f16152i;
                org.telegram.ui.Components.y5[] y5VarArr = u6Var.h;
                org.telegram.ui.Components.y5[] y5VarArr2 = u6Var.f16151g;
                Path path = u6Var.f16153j;
                t6 t6Var = u6Var.f16148c;
                if (t6Var != null && t6Var.f16090b.length > 0) {
                    float e10 = u6Var.d.e(u6Var.f16147b);
                    float d = u6Var.f16149e.d(u6Var.f16148c.f16091c, false);
                    float width = (rectF.width() * d) + rectF.left;
                    float d9 = u6Var.f16150f.d(u6Var.f16148c.d, false);
                    float f11 = rectF.top;
                    float lerp = AndroidUtilities.lerp(0.5f, 1.1f, e10);
                    canvas.save();
                    canvas.scale(lerp, lerp, width, (rectF.height() * d9) + f11);
                    if (e10 > 0.0f) {
                        path.rewind();
                        int min = Math.min(4, u6Var.f16148c.f16090b.length);
                        int i10 = 0;
                        while (i10 < min) {
                            int i11 = i10 - 1;
                            if (i11 < 0) {
                                i11 = min - 1;
                            }
                            int i12 = i10 + 1;
                            if (i12 >= min) {
                                i9 = 0;
                            } else {
                                i9 = i12;
                            }
                            t6 t6Var2 = u6Var.f16148c;
                            PointF[] pointFArr = t6Var2.f16090b;
                            PointF pointF = pointFArr[i11];
                            int i13 = min;
                            PointF pointF2 = pointFArr[i10];
                            org.telegram.ui.Components.y5[] y5VarArr3 = y5VarArr;
                            PointF pointF3 = pointFArr[i9];
                            org.telegram.ui.Components.y5[] y5VarArr4 = y5VarArr2;
                            float f12 = e10;
                            float width2 = (rectF.width() * (y5VarArr4[i11].d(pointF.x - t6Var2.f16091c, false) + d)) + rectF.left;
                            float height = (rectF.height() * (y5VarArr3[i11].d(pointF.y - u6Var.f16148c.d, false) + d9)) + rectF.top;
                            float width3 = (rectF.width() * (y5VarArr4[i10].d(pointF2.x - u6Var.f16148c.f16091c, false) + d)) + rectF.left;
                            float height2 = (rectF.height() * (y5VarArr3[i10].d(pointF2.y - u6Var.f16148c.d, false) + d9)) + rectF.top;
                            float width4 = (rectF.width() * (y5VarArr4[i9].d(pointF3.x - u6Var.f16148c.f16091c, false) + d)) + rectF.left;
                            float f13 = rectF.top;
                            float height3 = rectF.height();
                            path.moveTo(((width2 - width3) * 0.18f) + width3, ((height - height2) * 0.18f) + height2);
                            path.lineTo(width3, height2);
                            path.lineTo(((width4 - width3) * 0.18f) + width3, ((((height3 * (y5VarArr3[i9].d(pointF3.y - u6Var.f16148c.d, false) + d9)) + f13) - height2) * 0.18f) + height2);
                            y5VarArr2 = y5VarArr4;
                            i10 = i12;
                            min = i13;
                            y5VarArr = y5VarArr3;
                            e10 = f12;
                        }
                        paint.setAlpha((int) (e10 * 255.0f));
                        canvas.drawPath(path, paint);
                    }
                    canvas.restore();
                }
            }
        }
    }

    public final void i(Canvas canvas) {
        if (this.J != null && Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            RenderNode c10 = org.telegram.messenger.b.c(this.J);
            c10.endRecording();
            canvas.drawRenderNode(c10);
            Object obj = this.K;
            if (obj != null) {
                RenderNode c11 = org.telegram.messenger.b.c(obj);
                c11.setPosition(0, 0, getWidth(), getHeight());
                c11.beginRecording().drawRenderNode(c10);
                c11.endRecording();
            }
        }
    }

    public final boolean j() {
        if (this.f15203f.f16118e.size() > 1) {
            return true;
        }
        return false;
    }

    public final void k(RectF rectF, t tVar) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = AndroidUtilities.displaySize;
            int i9 = point.x;
            measuredHeight = point.y;
            measuredWidth = i9;
        }
        float f10 = measuredWidth;
        u uVar = tVar.f16073a;
        int[] iArr = uVar.d;
        int i10 = tVar.f16075c;
        int i11 = iArr[i10];
        int i12 = tVar.f16074b;
        float f11 = measuredHeight;
        int i13 = uVar.f16117c;
        rectF.set((f10 / i11) * i12, (f11 / i13) * i10, (f10 / i11) * (i12 + 1), (f11 / i13) * (i10 + 1));
    }

    public final boolean l(a8 a8Var) {
        if (a8Var.K) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    break;
                }
                Object obj = arrayList.get(i9);
                i9++;
                a8 a8Var2 = ((e0) obj).f15140n;
                if (a8Var2 != null && a8Var2.K && a8Var2.P > 0.0f) {
                    a8Var.P = 0.0f;
                    break;
                }
            }
        }
        e0 e0Var = this.f15216r;
        if (e0Var != null) {
            e0Var.a(a8Var);
        }
        q();
        requestLayout();
        if (this.f15216r != null) {
            return false;
        }
        return true;
    }

    public final void m(long j10, boolean z10) {
        if (this.f15208j0) {
            long clamp = Utilities.clamp(j10, getDuration(), 0L);
            if (!this.m0) {
                this.f15215q0 = clamp;
            }
            this.f15209k0 = System.currentTimeMillis() - clamp;
            this.f15210l0 = z10;
            if (this.f15208j0) {
                b0 b0Var = this.f15219s0;
                AndroidUtilities.cancelRunOnUIThread(b0Var);
                b0Var.run();
            }
        }
    }

    public final void n(a8 a8Var) {
        if (a8Var != null && a8Var.T != null) {
            o(a8Var.S);
            int i9 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i9 < arrayList.size()) {
                    ((e0) arrayList.get(i9)).a((a8) a8Var.T.get(i9));
                    i9++;
                } else {
                    return;
                }
            }
        } else {
            e();
        }
    }

    public final void o(u uVar) {
        t tVar;
        e0 e0Var;
        if (uVar == null) {
            uVar = new u(".");
        }
        ArrayList arrayList = uVar.f16118e;
        this.f15203f = uVar;
        b0 b0Var = this.D;
        AndroidUtilities.cancelRunOnUIThread(b0Var);
        int i9 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList2 = this.h;
            if (i9 < Math.max(size, arrayList2.size())) {
                if (i9 < arrayList.size()) {
                    tVar = (t) arrayList.get(i9);
                } else {
                    tVar = null;
                }
                if (i9 < arrayList2.size()) {
                    e0Var = (e0) arrayList2.get(i9);
                } else {
                    e0Var = null;
                }
                if (e0Var == null && tVar != null) {
                    e0 e0Var2 = new e0(this);
                    if (this.f15205g0) {
                        e0Var2.f15131c.onAttachedToWindow();
                    }
                    e0Var2.b(tVar, true);
                    arrayList2.add(e0Var2);
                } else if (tVar != null) {
                    e0Var.b(tVar, true);
                } else if (e0Var != null) {
                    this.f15211n.add(e0Var);
                    arrayList2.remove(e0Var);
                    e0Var.b(null, true);
                    i9--;
                }
                i9++;
            } else {
                q();
                invalidate();
                AndroidUtilities.runOnUIThread(b0Var, 360L);
                return;
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i9 < arrayList.size()) {
                ((e0) arrayList.get(i9)).f15131c.onAttachedToWindow();
                i9++;
            } else {
                this.f15205g0 = true;
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i9 < arrayList.size()) {
                ((e0) arrayList.get(i9)).f15131c.onDetachedFromWindow();
                i9++;
            } else {
                this.f15205g0 = false;
                AndroidUtilities.cancelRunOnUIThread(this.f15219s0);
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        e0 e0Var;
        a8 a8Var;
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i9);
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
                        if (childAt == ((e0) arrayList.get(i14)).f15132e) {
                            e0Var = (e0) arrayList.get(i14);
                            break;
                        }
                        i14++;
                    } else {
                        e0Var = null;
                        break;
                    }
                }
                if (e0Var != null && (a8Var = e0Var.f15140n) != null && (i11 = a8Var.f14925k0) > 0 && (i12 = a8Var.f14927l0) > 0) {
                    if (a8Var.Q % 90 == 1) {
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
        if (cameraView != null && this.Q) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f15201e != null) {
            z11 = true;
        }
        if (z10 == z11) {
            return;
        }
        if (z10) {
            this.f15201e = cameraView.getBlurRenderNode();
        } else {
            this.f15201e = null;
        }
    }

    public final void q() {
        ArrayList arrayList;
        boolean z10;
        this.f15216r = null;
        this.f15218s = null;
        int i9 = 0;
        while (true) {
            arrayList = this.h;
            if (i9 >= arrayList.size()) {
                break;
            }
            e0 e0Var = (e0) arrayList.get(i9);
            if (e0Var.f15140n == null) {
                if (this.f15216r == null) {
                    this.f15216r = e0Var;
                } else {
                    this.f15218s = e0Var;
                    break;
                }
            }
            i9++;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            e0 e0Var2 = (e0) arrayList.get(i10);
            if (e0Var2 == this.f15216r) {
                z10 = true;
            } else {
                z10 = false;
            }
            e0Var2.f15139m = z10;
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
            addView(cameraView, g7.e6.e(-1, -1, 119));
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
        this.f15206h0 = runnable;
    }

    public void setMuted(boolean z10) {
        if (this.f15217r0 == z10) {
            return;
        }
        this.f15217r0 = z10;
    }

    public void setOnCameraThumbClick(Runnable runnable) {
        this.P = runnable;
    }

    public void setPlaying(boolean z10) {
        boolean z11 = this.f15214p0;
        this.f15214p0 = true;
        if (this.m0 != z10) {
            this.m0 = z10;
            if (!z10) {
                this.f15215q0 = getPosition();
            } else if (z11) {
                m(this.f15215q0, false);
            } else {
                this.f15210l0 = false;
            }
            if (this.f15208j0) {
                b0 b0Var = this.f15219s0;
                AndroidUtilities.cancelRunOnUIThread(b0Var);
                b0Var.run();
            }
        }
    }

    public void setPreview(boolean z10) {
        if (this.f15208j0 != z10) {
            this.f15208j0 = z10;
            ArrayList arrayList = this.h;
            int i9 = 0;
            if (z10) {
                org.telegram.ui.Components.ba baVar = this.C;
                if (baVar != null) {
                    baVar.d();
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((e0) arrayList.get(i10)).f15129a = i10;
                }
            }
            this.f15210l0 = false;
            this.f15215q0 = 0L;
            int size = arrayList.size();
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                e0 e0Var = (e0) obj;
                d0 d0Var = e0Var.d;
                if (d0Var != null) {
                    d0Var.setAudioEnabled(z10, true);
                    if (z10 && !this.m0) {
                        e0Var.d.pause();
                    } else {
                        e0Var.d.play();
                    }
                }
            }
            b0 b0Var = this.f15219s0;
            AndroidUtilities.cancelRunOnUIThread(b0Var);
            if (z10) {
                this.f15209k0 = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(b0Var, 1000.0f / AndroidUtilities.screenRefreshRate);
            }
        }
    }

    public void setPreviewView(r6 r6Var) {
        this.f15213o0 = r6Var;
    }

    public void setResetState(Runnable runnable) {
        this.f15207i0 = runnable;
    }

    public void setTimelineView(gc gcVar) {
        this.f15212n0 = gcVar;
    }
}
