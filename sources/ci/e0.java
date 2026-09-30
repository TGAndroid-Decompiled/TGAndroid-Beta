package ci;

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
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.tr;
public abstract class e0 extends FrameLayout implements a80 {
    public static final int f4566x0 = 0;
    public final LinearGradient E;
    public final Matrix F;
    public final org.telegram.ui.Components.ka G;
    public final a0 H;
    public final org.telegram.ui.Components.e6 I;
    public final org.telegram.ui.Components.e6[] J;
    public final org.telegram.ui.Components.e6 K;
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
    public final FrameLayout f4567a;
    public float f4568a0;
    public final ai.d f4569b;
    public float f4570b0;
    public final e7 f4571c;
    public float f4572c0;
    public CameraView d;
    public float f4573d0;
    public Object e;
    public boolean f4574e0;
    public t f4575f;
    public boolean f4576f0;
    public d0 f4577g0;
    public final ArrayList h;
    public d0 f4578h0;
    public a0 f4579i0;
    public d0 f4580j0;
    public boolean f4581k0;
    public Runnable f4582l0;
    public Runnable m0;
    public final ArrayList f4583n;
    public boolean f4584n0;
    public long f4585o0;
    public boolean f4586p0;
    public boolean f4587q0;
    public d0 f4588r;
    public wc f4589r0;
    public d0 f4590s;
    public b7 f4591s0;
    public boolean f4592t0;
    public long f4593u0;
    public final Paint v;
    public boolean f4594v0;
    public final Path f4595w;
    public final a0 f4596w0;
    public final float[] f4597x;
    public final int f4598y;

    public e0(Context context, org.telegram.ui.Components.ka kaVar, FrameLayout frameLayout, ai.d dVar) {
        super(context);
        this.f4571c = new e7(new a0(this, 1));
        this.f4575f = new t(".");
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.f4583n = new ArrayList();
        Paint paint = new Paint(1);
        this.v = paint;
        this.f4595w = new Path();
        this.f4597x = new float[8];
        this.H = new a0(this, 2);
        tr trVar = tr.h;
        this.I = new org.telegram.ui.Components.e6(this, 0L, 320L, trVar);
        this.J = new org.telegram.ui.Components.e6[]{new org.telegram.ui.Components.e6(this, 0L, 320L, trVar), new org.telegram.ui.Components.e6(this, 0L, 320L, trVar), new org.telegram.ui.Components.e6(this, 0L, 320L, trVar), new org.telegram.ui.Components.e6(this, 0L, 320L, trVar), new org.telegram.ui.Components.e6(this, 0L, 320L, trVar)};
        this.K = new org.telegram.ui.Components.e6(this, 0L, 320L, trVar);
        this.L = new float[5];
        this.M = new float[5];
        this.P = new RectF();
        this.Q = new Path();
        this.S = true;
        this.f4587q0 = true;
        this.f4592t0 = true;
        this.f4596w0 = new a0(this, 3);
        this.G = kaVar;
        this.f4567a = frameLayout;
        this.f4569b = dVar;
        setBackgroundColor(-14737633);
        d0 d0Var = new d0(this);
        d0Var.b((s) this.f4575f.e.get(0), false);
        d0Var.f4494m = true;
        if (this.f4581k0) {
            d0Var.f4487c.onAttachedToWindow();
        }
        arrayList.add(d0Var);
        this.f4588r = d0Var;
        this.f4590s = null;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(8.0f));
        int dp = AndroidUtilities.dp(300.0f);
        this.f4598y = dp;
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
            canvas.drawColor(org.telegram.ui.ActionBar.h6.l1(drawable.getAlpha() * f7, -16777216));
        }
        canvas.restore();
    }

    @Override
    public final void a(RectF rectF) {
        d0 d0Var = this.f4580j0;
        if (d0Var != null) {
            s sVar = d0Var.h;
            t tVar = sVar.f5476a;
            int i10 = sVar.f5477b;
            int i11 = sVar.f5478c;
            float f7 = tVar.f5523c;
            float d = this.J[i11].d(tVar.d[i11], false);
            rectF.set((getMeasuredWidth() / d) * i10, (getMeasuredHeight() / f7) * i11, (getMeasuredWidth() / d) * (i10 + 1), (getMeasuredHeight() / f7) * (i11 + 1));
            return;
        }
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void b(Canvas canvas, float f7) {
        d0 d0Var = this.f4580j0;
        if (d0Var != null) {
            s sVar = d0Var.h;
            t tVar = sVar.f5476a;
            int i10 = sVar.f5477b;
            int i11 = sVar.f5478c;
            float f10 = tVar.f5523c;
            float d = this.J[i11].d(tVar.d[i11], false);
            float measuredWidth = (getMeasuredWidth() / d) * i10;
            float measuredHeight = (getMeasuredHeight() / f10) * i11;
            float measuredWidth2 = (getMeasuredWidth() / d) * (i10 + 1);
            float measuredHeight2 = (getMeasuredHeight() / f10) * (i11 + 1);
            RectF rectF = this.P;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            g(canvas, rectF, this.f4580j0);
        }
    }

    public final boolean d() {
        if (this.f4577g0 == null) {
            return false;
        }
        this.f4577g0 = null;
        this.f4574e0 = false;
        invalidate();
        a0 a0Var = this.f4579i0;
        if (a0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(a0Var);
            this.f4579i0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: ci.e0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ArrayList arrayList;
        org.telegram.ui.Components.e6[] e6VarArr;
        RectF rectF;
        d0 d0Var;
        a0 a0Var;
        if (j() && !this.f4584n0) {
            if (motionEvent.getPointerCount() > 1) {
                d();
                return false;
            }
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            org.telegram.ui.Components.e6 e6Var = this.I;
            float f7 = e6Var.f23852c;
            int i10 = 0;
            while (true) {
                arrayList = this.h;
                int size = arrayList.size();
                e6VarArr = this.J;
                rectF = this.P;
                if (i10 < size) {
                    d0Var = (d0) arrayList.get(i10);
                    s sVar = d0Var.h;
                    int i11 = sVar.f5478c;
                    int i12 = sVar.f5477b;
                    float f10 = e6VarArr[i11].f23852c;
                    rectF.set((getMeasuredWidth() / f10) * i12, (getMeasuredHeight() / f7) * i11, (getMeasuredWidth() / f10) * (i12 + 1), (getMeasuredHeight() / f7) * (i11 + 1));
                    if (rectF.contains(x10, y3)) {
                        break;
                    }
                    i10++;
                } else {
                    d0Var = null;
                    break;
                }
            }
            if (motionEvent.getAction() == 0) {
                this.V = motionEvent.getX();
                this.W = motionEvent.getY();
                this.f4574e0 = false;
                this.f4572c0 = 0.0f;
                this.f4568a0 = 0.0f;
                this.f4573d0 = 0.0f;
                this.f4570b0 = 0.0f;
                this.f4577g0 = d0Var;
                if (d0Var != null) {
                    a0 a0Var2 = new a0(this, 0);
                    this.f4579i0 = a0Var2;
                    AndroidUtilities.runOnUIThread(a0Var2, ViewConfiguration.getLongPressTimeout());
                }
            } else if (motionEvent.getAction() == 2) {
                if (v7.a7.a(motionEvent.getX(), motionEvent.getY(), this.V, this.W) > AndroidUtilities.touchSlop * 1.2f && (a0Var = this.f4579i0) != null) {
                    AndroidUtilities.cancelRunOnUIThread(a0Var);
                    this.f4579i0 = null;
                }
                if (!this.f4574e0 && getFilledProgress() >= 1.0f && this.f4577g0 != null && d0Var != null && v7.a7.a(motionEvent.getX(), motionEvent.getY(), this.V, this.W) > AndroidUtilities.touchSlop * 1.2f) {
                    this.f4574e0 = true;
                    this.f4578h0 = this.f4577g0;
                    this.f4572c0 = 0.0f;
                    this.f4568a0 = 0.0f;
                    this.f4573d0 = 0.0f;
                    this.f4570b0 = 0.0f;
                    invalidate();
                    a0 a0Var3 = this.f4579i0;
                    if (a0Var3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(a0Var3);
                        this.f4579i0 = null;
                    }
                } else if (this.f4574e0 && this.f4578h0 != null) {
                    float x11 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    float f11 = e6Var.f23852c;
                    int i13 = 0;
                    while (true) {
                        if (i13 < arrayList.size()) {
                            s sVar2 = ((d0) arrayList.get(i13)).h;
                            int i14 = sVar2.f5478c;
                            int i15 = sVar2.f5477b;
                            float f12 = e6VarArr[i14].f23852c;
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
                    int indexOf = arrayList.indexOf(this.f4578h0);
                    if (i13 >= 0 && indexOf >= 0 && i13 != indexOf) {
                        Collections.swap(arrayList, indexOf, i13);
                        o(this.f4575f);
                        this.f4576f0 = true;
                        invalidate();
                        float f13 = this.f4575f.f5523c;
                        s sVar3 = this.f4578h0.h;
                        int i16 = sVar3.f5478c;
                        int i17 = sVar3.f5477b;
                        float f14 = e6VarArr[i16].f23852c;
                        rectF.set((getMeasuredWidth() / f14) * i17, (getMeasuredHeight() / f13) * i16, (getMeasuredWidth() / f14) * (i17 + 1), (getMeasuredHeight() / f13) * (i16 + 1));
                        this.f4568a0 = this.f4572c0;
                        this.f4570b0 = this.f4573d0;
                        this.V = rectF.centerX();
                        this.W = rectF.centerY();
                    }
                    this.f4572c0 = motionEvent.getX() - this.V;
                    this.f4573d0 = motionEvent.getY() - this.W;
                    invalidate();
                } else if (this.f4577g0 != d0Var) {
                    this.f4577g0 = null;
                    a0 a0Var4 = this.f4579i0;
                    if (a0Var4 != null) {
                        AndroidUtilities.cancelRunOnUIThread(a0Var4);
                        this.f4579i0 = null;
                        return true;
                    }
                    return true;
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f4577g0 != null) {
                    this.f4577g0 = null;
                    this.f4574e0 = false;
                    invalidate();
                    a0 a0Var5 = this.f4579i0;
                    if (a0Var5 == null) {
                        return true;
                    }
                    AndroidUtilities.cancelRunOnUIThread(a0Var5);
                    this.f4579i0 = null;
                    return true;
                }
            } else if (motionEvent.getAction() == 3 && d()) {
                return true;
            }
            if (this.f4577g0 != null || super.dispatchTouchEvent(motionEvent)) {
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
            ((d0) obj).a(null);
        }
        q();
    }

    public final void g(android.graphics.Canvas r9, android.graphics.RectF r10, ci.d0 r11) {
        throw new UnsupportedOperationException("Method not decompiled: ci.e0.g(android.graphics.Canvas, android.graphics.RectF, ci.d0):void");
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

    public ArrayList<l8> getContent() {
        ArrayList<l8> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            l8 l8Var = ((d0) obj).f4495n;
            if (l8Var != null) {
                arrayList.add(l8Var);
            }
        }
        return arrayList;
    }

    public d0 getCurrent() {
        return this.f4588r;
    }

    public long getDuration() {
        d0 mainPart;
        l8 l8Var;
        if (!this.f4584n0 || (mainPart = getMainPart()) == null || (l8Var = mainPart.f4495n) == null) {
            return 1L;
        }
        return Math.max(Math.min((l8Var.W - l8Var.V) * ((float) l8Var.f4988h0), 59500L), 1L);
    }

    public int getFilledCount() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((d0) arrayList.get(i10)).f4495n != null) {
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
        return this.f4575f;
    }

    public d0 getMainPart() {
        d0 d0Var = null;
        if (!this.f4584n0) {
            return null;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        long j3 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            d0 d0Var2 = (d0) obj;
            l8 l8Var = d0Var2.f4495n;
            if (l8Var != null && l8Var.K) {
                long j10 = l8Var.f4988h0;
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
        return this.f4590s;
    }

    public ArrayList<Integer> getOrder() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.h;
            if (i10 < arrayList2.size()) {
                i10 = com.google.android.gms.internal.vision.e2.e(((d0) arrayList2.get(i10)).f4485a, i10, 1, arrayList);
            } else {
                return arrayList;
            }
        }
    }

    public long getPosition() {
        if (!this.f4584n0) {
            return 0L;
        }
        if (!this.f4587q0) {
            return this.f4593u0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f4585o0;
        if (j3 > getDuration()) {
            this.f4585o0 = currentTimeMillis - (j3 % getDuration());
        }
        return j3;
    }

    public long getPositionWithOffset() {
        long j3 = 0;
        if (!this.f4584n0) {
            return 0L;
        }
        getPosition();
        d0 mainPart = getMainPart();
        if (mainPart != null) {
            l8 l8Var = mainPart.f4495n;
            j3 = l8Var.X + (l8Var.V * ((float) l8Var.f4988h0));
        }
        return getPosition() + j3;
    }

    public int getTotalCount() {
        return this.h.size();
    }

    public final void h(float f7, Canvas canvas, RectF rectF, View view) {
        e7 e7Var;
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
                canvas.drawColor(org.telegram.ui.ActionBar.h6.l1(view.getAlpha() * f7, -16777216));
            }
            canvas.restore();
            if (view == this.d && (e7Var = this.f4571c) != null) {
                Paint paint = (Paint) e7Var.f4652i;
                org.telegram.ui.Components.e6[] e6VarArr = (org.telegram.ui.Components.e6[]) e7Var.h;
                org.telegram.ui.Components.e6[] e6VarArr2 = (org.telegram.ui.Components.e6[]) e7Var.f4651g;
                Path path = (Path) e7Var.f4653j;
                d7 d7Var = (d7) e7Var.f4649c;
                if (d7Var != null && d7Var.f4525b.length > 0) {
                    float e = ((org.telegram.ui.Components.e6) e7Var.d).e(e7Var.f4647a);
                    float d = ((org.telegram.ui.Components.e6) e7Var.e).d(((d7) e7Var.f4649c).f4526c, false);
                    float width = (rectF2.width() * d) + rectF2.left;
                    float d10 = ((org.telegram.ui.Components.e6) e7Var.f4650f).d(((d7) e7Var.f4649c).d, false);
                    float f10 = rectF2.top;
                    float lerp = AndroidUtilities.lerp(0.5f, 1.1f, e);
                    canvas.save();
                    canvas.scale(lerp, lerp, width, (rectF2.height() * d10) + f10);
                    if (e > 0.0f) {
                        path.rewind();
                        int min = Math.min(4, ((d7) e7Var.f4649c).f4525b.length);
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
                            d7 d7Var2 = (d7) e7Var.f4649c;
                            PointF[] pointFArr = d7Var2.f4525b;
                            PointF pointF = pointFArr[i12];
                            int i14 = min;
                            PointF pointF2 = pointFArr[i11];
                            org.telegram.ui.Components.e6[] e6VarArr3 = e6VarArr;
                            PointF pointF3 = pointFArr[i10];
                            org.telegram.ui.Components.e6[] e6VarArr4 = e6VarArr2;
                            float f11 = e;
                            float width2 = (rectF2.width() * (e6VarArr4[i12].d(pointF.x - d7Var2.f4526c, false) + d)) + rectF2.left;
                            float height = (rectF2.height() * (e6VarArr3[i12].d(pointF.y - ((d7) e7Var.f4649c).d, false) + d10)) + rectF2.top;
                            float width3 = (rectF2.width() * (e6VarArr4[i11].d(pointF2.x - ((d7) e7Var.f4649c).f4526c, false) + d)) + rectF2.left;
                            float height2 = (rectF2.height() * (e6VarArr3[i11].d(pointF2.y - ((d7) e7Var.f4649c).d, false) + d10)) + rectF2.top;
                            float f12 = rectF2.left;
                            float width4 = rectF2.width();
                            float f13 = rectF2.top;
                            float height3 = rectF.height();
                            path.moveTo(((width2 - width3) * 0.18f) + width3, ((height - height2) * 0.18f) + height2);
                            path.lineTo(width3, height2);
                            path.lineTo(((((width4 * (e6VarArr4[i10].d(pointF3.x - ((d7) e7Var.f4649c).f4526c, false) + d)) + f12) - width3) * 0.18f) + width3, ((((height3 * (e6VarArr3[i10].d(pointF3.y - ((d7) e7Var.f4649c).d, false) + d10)) + f13) - height2) * 0.18f) + height2);
                            rectF2 = rectF;
                            e6VarArr2 = e6VarArr4;
                            i11 = i13;
                            min = i14;
                            e6VarArr = e6VarArr3;
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
        if (this.f4575f.e.size() > 1) {
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
        t tVar = sVar.f5476a;
        int[] iArr = tVar.d;
        int i11 = sVar.f5478c;
        int i12 = iArr[i11];
        int i13 = sVar.f5477b;
        float f10 = measuredHeight;
        int i14 = tVar.f5523c;
        rectF.set((f7 / i12) * i13, (f10 / i14) * i11, (f7 / i12) * (i13 + 1), (f10 / i14) * (i11 + 1));
    }

    public final boolean l(l8 l8Var) {
        if (l8Var.K) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                l8 l8Var2 = ((d0) obj).f4495n;
                if (l8Var2 != null && l8Var2.K && l8Var2.P > 0.0f) {
                    l8Var.P = 0.0f;
                    break;
                }
            }
        }
        d0 d0Var = this.f4588r;
        if (d0Var != null) {
            d0Var.a(l8Var);
        }
        q();
        requestLayout();
        if (this.f4588r != null) {
            return false;
        }
        return true;
    }

    public final void m(long j3, boolean z10) {
        if (this.f4584n0) {
            long clamp = Utilities.clamp(j3, getDuration(), 0L);
            if (!this.f4587q0) {
                this.f4593u0 = clamp;
            }
            this.f4585o0 = System.currentTimeMillis() - clamp;
            this.f4586p0 = z10;
            if (this.f4584n0) {
                a0 a0Var = this.f4596w0;
                AndroidUtilities.cancelRunOnUIThread(a0Var);
                a0Var.run();
            }
        }
    }

    public final void n(l8 l8Var) {
        if (l8Var != null && l8Var.T != null) {
            o(l8Var.S);
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i10 < arrayList.size()) {
                    ((d0) arrayList.get(i10)).a((l8) l8Var.T.get(i10));
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
        this.f4575f = tVar;
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
                    if (this.f4581k0) {
                        d0Var2.f4487c.onAttachedToWindow();
                    }
                    d0Var2.b(sVar, true);
                    arrayList2.add(d0Var2);
                } else if (sVar != null) {
                    d0Var.b(sVar, true);
                } else if (d0Var != null) {
                    this.f4583n.add(d0Var);
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
                ((d0) arrayList.get(i10)).f4487c.onAttachedToWindow();
                i10++;
            } else {
                this.f4581k0 = true;
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
                ((d0) arrayList.get(i10)).f4487c.onDetachedFromWindow();
                i10++;
            } else {
                this.f4581k0 = false;
                AndroidUtilities.cancelRunOnUIThread(this.f4596w0);
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        d0 d0Var;
        l8 l8Var;
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
                if (d0Var != null && (l8Var = d0Var.f4495n) != null && (i12 = l8Var.f4994k0) > 0 && (i13 = l8Var.f4996l0) > 0) {
                    if (l8Var.Q % 90 == 1) {
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
        this.f4588r = null;
        this.f4590s = null;
        int i10 = 0;
        while (true) {
            arrayList = this.h;
            if (i10 >= arrayList.size()) {
                break;
            }
            d0 d0Var = (d0) arrayList.get(i10);
            if (d0Var.f4495n == null) {
                if (this.f4588r == null) {
                    this.f4588r = d0Var;
                } else {
                    this.f4590s = d0Var;
                    break;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            d0 d0Var2 = (d0) arrayList.get(i11);
            if (d0Var2 == this.f4588r) {
                z10 = true;
            } else {
                z10 = false;
            }
            d0Var2.f4494m = z10;
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
            addView(cameraView, w7.y5.e(-1, -1, 119));
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
        this.f4582l0 = runnable;
    }

    public void setMuted(boolean z10) {
        if (this.f4594v0 == z10) {
            return;
        }
        this.f4594v0 = z10;
    }

    public void setOnCameraThumbClick(Runnable runnable) {
        this.T = runnable;
    }

    public void setPlaying(boolean z10) {
        boolean z11 = this.f4592t0;
        this.f4592t0 = true;
        if (this.f4587q0 != z10) {
            this.f4587q0 = z10;
            if (!z10) {
                this.f4593u0 = getPosition();
            } else if (z11) {
                m(this.f4593u0, false);
            } else {
                this.f4586p0 = false;
            }
            if (this.f4584n0) {
                a0 a0Var = this.f4596w0;
                AndroidUtilities.cancelRunOnUIThread(a0Var);
                a0Var.run();
            }
        }
    }

    public void setPreview(boolean z10) {
        if (this.f4584n0 != z10) {
            this.f4584n0 = z10;
            ArrayList arrayList = this.h;
            int i10 = 0;
            if (z10) {
                org.telegram.ui.Components.ka kaVar = this.G;
                if (kaVar != null) {
                    kaVar.d();
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((d0) arrayList.get(i11)).f4485a = i11;
                }
            }
            this.f4586p0 = false;
            this.f4593u0 = 0L;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                d0 d0Var = (d0) obj;
                c0 c0Var = d0Var.d;
                if (c0Var != null) {
                    c0Var.setAudioEnabled(z10, true);
                    if (z10 && !this.f4587q0) {
                        d0Var.d.pause();
                    } else {
                        d0Var.d.play();
                    }
                }
            }
            a0 a0Var = this.f4596w0;
            AndroidUtilities.cancelRunOnUIThread(a0Var);
            if (z10) {
                this.f4585o0 = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(a0Var, 1000.0f / AndroidUtilities.screenRefreshRate);
            }
        }
    }

    public void setPreviewView(b7 b7Var) {
        this.f4591s0 = b7Var;
    }

    public void setResetState(Runnable runnable) {
        this.m0 = runnable;
    }

    public void setTimelineView(wc wcVar) {
        this.f4589r0 = wcVar;
    }
}
