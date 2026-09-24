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
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.x70;
public abstract class e0 extends FrameLayout implements x70 {
    public static final int f4559x0 = 0;
    public final LinearGradient E;
    public final Matrix F;
    public final org.telegram.ui.Components.ja G;
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
    public final FrameLayout f4560a;
    public float f4561a0;
    public final ai.d f4562b;
    public float f4563b0;
    public final e7 f4564c;
    public float f4565c0;
    public CameraView d;
    public float f4566d0;
    public Object e;
    public boolean f4567e0;
    public t f4568f;
    public boolean f4569f0;
    public d0 f4570g0;
    public final ArrayList h;
    public d0 f4571h0;
    public a0 f4572i0;
    public d0 f4573j0;
    public boolean f4574k0;
    public Runnable f4575l0;
    public Runnable m0;
    public final ArrayList f4576n;
    public boolean f4577n0;
    public long f4578o0;
    public boolean f4579p0;
    public boolean f4580q0;
    public d0 f4581r;
    public wc f4582r0;
    public d0 f4583s;
    public b7 f4584s0;
    public boolean f4585t0;
    public long f4586u0;
    public final Paint v;
    public boolean f4587v0;
    public final Path f4588w;
    public final a0 f4589w0;
    public final float[] f4590x;
    public final int f4591y;

    public e0(Context context, org.telegram.ui.Components.ja jaVar, FrameLayout frameLayout, ai.d dVar) {
        super(context);
        this.f4564c = new e7(new a0(this, 1));
        this.f4568f = new t(".");
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.f4576n = new ArrayList();
        Paint paint = new Paint(1);
        this.v = paint;
        this.f4588w = new Path();
        this.f4590x = new float[8];
        this.H = new a0(this, 2);
        rr rrVar = rr.h;
        this.I = new org.telegram.ui.Components.e6(this, 0L, 320L, rrVar);
        this.J = new org.telegram.ui.Components.e6[]{new org.telegram.ui.Components.e6(this, 0L, 320L, rrVar), new org.telegram.ui.Components.e6(this, 0L, 320L, rrVar), new org.telegram.ui.Components.e6(this, 0L, 320L, rrVar), new org.telegram.ui.Components.e6(this, 0L, 320L, rrVar), new org.telegram.ui.Components.e6(this, 0L, 320L, rrVar)};
        this.K = new org.telegram.ui.Components.e6(this, 0L, 320L, rrVar);
        this.L = new float[5];
        this.M = new float[5];
        this.P = new RectF();
        this.Q = new Path();
        this.S = true;
        this.f4580q0 = true;
        this.f4585t0 = true;
        this.f4589w0 = new a0(this, 3);
        this.G = jaVar;
        this.f4560a = frameLayout;
        this.f4562b = dVar;
        setBackgroundColor(-14737633);
        d0 d0Var = new d0(this);
        d0Var.b((s) this.f4568f.e.get(0), false);
        d0Var.f4487m = true;
        if (this.f4574k0) {
            d0Var.f4480c.onAttachedToWindow();
        }
        arrayList.add(d0Var);
        this.f4581r = d0Var;
        this.f4583s = null;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(8.0f));
        int dp = AndroidUtilities.dp(300.0f);
        this.f4591y = dp;
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
        d0 d0Var = this.f4573j0;
        if (d0Var != null) {
            s sVar = d0Var.h;
            t tVar = sVar.f5467a;
            int i10 = sVar.f5468b;
            int i11 = sVar.f5469c;
            float f7 = tVar.f5514c;
            float d = this.J[i11].d(tVar.d[i11], false);
            rectF.set((getMeasuredWidth() / d) * i10, (getMeasuredHeight() / f7) * i11, (getMeasuredWidth() / d) * (i10 + 1), (getMeasuredHeight() / f7) * (i11 + 1));
            return;
        }
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void b(Canvas canvas, float f7) {
        d0 d0Var = this.f4573j0;
        if (d0Var != null) {
            s sVar = d0Var.h;
            t tVar = sVar.f5467a;
            int i10 = sVar.f5468b;
            int i11 = sVar.f5469c;
            float f10 = tVar.f5514c;
            float d = this.J[i11].d(tVar.d[i11], false);
            float measuredWidth = (getMeasuredWidth() / d) * i10;
            float measuredHeight = (getMeasuredHeight() / f10) * i11;
            float measuredWidth2 = (getMeasuredWidth() / d) * (i10 + 1);
            float measuredHeight2 = (getMeasuredHeight() / f10) * (i11 + 1);
            RectF rectF = this.P;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            g(canvas, rectF, this.f4573j0);
        }
    }

    public final boolean d() {
        if (this.f4570g0 == null) {
            return false;
        }
        this.f4570g0 = null;
        this.f4567e0 = false;
        invalidate();
        a0 a0Var = this.f4572i0;
        if (a0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(a0Var);
            this.f4572i0 = null;
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
        if (j() && !this.f4577n0) {
            if (motionEvent.getPointerCount() > 1) {
                d();
                return false;
            }
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            org.telegram.ui.Components.e6 e6Var = this.I;
            float f7 = e6Var.f23817c;
            int i10 = 0;
            while (true) {
                arrayList = this.h;
                int size = arrayList.size();
                e6VarArr = this.J;
                rectF = this.P;
                if (i10 < size) {
                    d0Var = (d0) arrayList.get(i10);
                    s sVar = d0Var.h;
                    int i11 = sVar.f5469c;
                    int i12 = sVar.f5468b;
                    float f10 = e6VarArr[i11].f23817c;
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
                this.f4567e0 = false;
                this.f4565c0 = 0.0f;
                this.f4561a0 = 0.0f;
                this.f4566d0 = 0.0f;
                this.f4563b0 = 0.0f;
                this.f4570g0 = d0Var;
                if (d0Var != null) {
                    a0 a0Var2 = new a0(this, 0);
                    this.f4572i0 = a0Var2;
                    AndroidUtilities.runOnUIThread(a0Var2, ViewConfiguration.getLongPressTimeout());
                }
            } else if (motionEvent.getAction() == 2) {
                if (v7.a7.a(motionEvent.getX(), motionEvent.getY(), this.V, this.W) > AndroidUtilities.touchSlop * 1.2f && (a0Var = this.f4572i0) != null) {
                    AndroidUtilities.cancelRunOnUIThread(a0Var);
                    this.f4572i0 = null;
                }
                if (!this.f4567e0 && getFilledProgress() >= 1.0f && this.f4570g0 != null && d0Var != null && v7.a7.a(motionEvent.getX(), motionEvent.getY(), this.V, this.W) > AndroidUtilities.touchSlop * 1.2f) {
                    this.f4567e0 = true;
                    this.f4571h0 = this.f4570g0;
                    this.f4565c0 = 0.0f;
                    this.f4561a0 = 0.0f;
                    this.f4566d0 = 0.0f;
                    this.f4563b0 = 0.0f;
                    invalidate();
                    a0 a0Var3 = this.f4572i0;
                    if (a0Var3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(a0Var3);
                        this.f4572i0 = null;
                    }
                } else if (this.f4567e0 && this.f4571h0 != null) {
                    float x11 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    float f11 = e6Var.f23817c;
                    int i13 = 0;
                    while (true) {
                        if (i13 < arrayList.size()) {
                            s sVar2 = ((d0) arrayList.get(i13)).h;
                            int i14 = sVar2.f5469c;
                            int i15 = sVar2.f5468b;
                            float f12 = e6VarArr[i14].f23817c;
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
                    int indexOf = arrayList.indexOf(this.f4571h0);
                    if (i13 >= 0 && indexOf >= 0 && i13 != indexOf) {
                        Collections.swap(arrayList, indexOf, i13);
                        o(this.f4568f);
                        this.f4569f0 = true;
                        invalidate();
                        float f13 = this.f4568f.f5514c;
                        s sVar3 = this.f4571h0.h;
                        int i16 = sVar3.f5469c;
                        int i17 = sVar3.f5468b;
                        float f14 = e6VarArr[i16].f23817c;
                        rectF.set((getMeasuredWidth() / f14) * i17, (getMeasuredHeight() / f13) * i16, (getMeasuredWidth() / f14) * (i17 + 1), (getMeasuredHeight() / f13) * (i16 + 1));
                        this.f4561a0 = this.f4565c0;
                        this.f4563b0 = this.f4566d0;
                        this.V = rectF.centerX();
                        this.W = rectF.centerY();
                    }
                    this.f4565c0 = motionEvent.getX() - this.V;
                    this.f4566d0 = motionEvent.getY() - this.W;
                    invalidate();
                } else if (this.f4570g0 != d0Var) {
                    this.f4570g0 = null;
                    a0 a0Var4 = this.f4572i0;
                    if (a0Var4 != null) {
                        AndroidUtilities.cancelRunOnUIThread(a0Var4);
                        this.f4572i0 = null;
                        return true;
                    }
                    return true;
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f4570g0 != null) {
                    this.f4570g0 = null;
                    this.f4567e0 = false;
                    invalidate();
                    a0 a0Var5 = this.f4572i0;
                    if (a0Var5 == null) {
                        return true;
                    }
                    AndroidUtilities.cancelRunOnUIThread(a0Var5);
                    this.f4572i0 = null;
                    return true;
                }
            } else if (motionEvent.getAction() == 3 && d()) {
                return true;
            }
            if (this.f4570g0 != null || super.dispatchTouchEvent(motionEvent)) {
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
            l8 l8Var = ((d0) obj).f4488n;
            if (l8Var != null) {
                arrayList.add(l8Var);
            }
        }
        return arrayList;
    }

    public d0 getCurrent() {
        return this.f4581r;
    }

    public long getDuration() {
        d0 mainPart;
        l8 l8Var;
        if (!this.f4577n0 || (mainPart = getMainPart()) == null || (l8Var = mainPart.f4488n) == null) {
            return 1L;
        }
        return Math.max(Math.min((l8Var.W - l8Var.V) * ((float) l8Var.f4981h0), 59500L), 1L);
    }

    public int getFilledCount() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((d0) arrayList.get(i10)).f4488n != null) {
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
        return this.f4568f;
    }

    public d0 getMainPart() {
        d0 d0Var = null;
        if (!this.f4577n0) {
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
            l8 l8Var = d0Var2.f4488n;
            if (l8Var != null && l8Var.K) {
                long j10 = l8Var.f4981h0;
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
        return this.f4583s;
    }

    public ArrayList<Integer> getOrder() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.h;
            if (i10 < arrayList2.size()) {
                i10 = com.google.android.gms.internal.vision.e2.e(((d0) arrayList2.get(i10)).f4478a, i10, 1, arrayList);
            } else {
                return arrayList;
            }
        }
    }

    public long getPosition() {
        if (!this.f4577n0) {
            return 0L;
        }
        if (!this.f4580q0) {
            return this.f4586u0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f4578o0;
        if (j3 > getDuration()) {
            this.f4578o0 = currentTimeMillis - (j3 % getDuration());
        }
        return j3;
    }

    public long getPositionWithOffset() {
        long j3 = 0;
        if (!this.f4577n0) {
            return 0L;
        }
        getPosition();
        d0 mainPart = getMainPart();
        if (mainPart != null) {
            l8 l8Var = mainPart.f4488n;
            j3 = l8Var.X + (l8Var.V * ((float) l8Var.f4981h0));
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
            if (view == this.d && (e7Var = this.f4564c) != null) {
                Paint paint = (Paint) e7Var.f4644i;
                org.telegram.ui.Components.e6[] e6VarArr = (org.telegram.ui.Components.e6[]) e7Var.h;
                org.telegram.ui.Components.e6[] e6VarArr2 = (org.telegram.ui.Components.e6[]) e7Var.f4643g;
                Path path = (Path) e7Var.f4645j;
                d7 d7Var = (d7) e7Var.f4641c;
                if (d7Var != null && d7Var.f4518b.length > 0) {
                    float e = ((org.telegram.ui.Components.e6) e7Var.d).e(e7Var.f4639a);
                    float d = ((org.telegram.ui.Components.e6) e7Var.e).d(((d7) e7Var.f4641c).f4519c, false);
                    float width = (rectF2.width() * d) + rectF2.left;
                    float d10 = ((org.telegram.ui.Components.e6) e7Var.f4642f).d(((d7) e7Var.f4641c).d, false);
                    float f10 = rectF2.top;
                    float lerp = AndroidUtilities.lerp(0.5f, 1.1f, e);
                    canvas.save();
                    canvas.scale(lerp, lerp, width, (rectF2.height() * d10) + f10);
                    if (e > 0.0f) {
                        path.rewind();
                        int min = Math.min(4, ((d7) e7Var.f4641c).f4518b.length);
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
                            d7 d7Var2 = (d7) e7Var.f4641c;
                            PointF[] pointFArr = d7Var2.f4518b;
                            PointF pointF = pointFArr[i12];
                            int i14 = min;
                            PointF pointF2 = pointFArr[i11];
                            org.telegram.ui.Components.e6[] e6VarArr3 = e6VarArr;
                            PointF pointF3 = pointFArr[i10];
                            org.telegram.ui.Components.e6[] e6VarArr4 = e6VarArr2;
                            float f11 = e;
                            float width2 = (rectF2.width() * (e6VarArr4[i12].d(pointF.x - d7Var2.f4519c, false) + d)) + rectF2.left;
                            float height = (rectF2.height() * (e6VarArr3[i12].d(pointF.y - ((d7) e7Var.f4641c).d, false) + d10)) + rectF2.top;
                            float width3 = (rectF2.width() * (e6VarArr4[i11].d(pointF2.x - ((d7) e7Var.f4641c).f4519c, false) + d)) + rectF2.left;
                            float height2 = (rectF2.height() * (e6VarArr3[i11].d(pointF2.y - ((d7) e7Var.f4641c).d, false) + d10)) + rectF2.top;
                            float f12 = rectF2.left;
                            float width4 = rectF2.width();
                            float f13 = rectF2.top;
                            float height3 = rectF.height();
                            path.moveTo(((width2 - width3) * 0.18f) + width3, ((height - height2) * 0.18f) + height2);
                            path.lineTo(width3, height2);
                            path.lineTo(((((width4 * (e6VarArr4[i10].d(pointF3.x - ((d7) e7Var.f4641c).f4519c, false) + d)) + f12) - width3) * 0.18f) + width3, ((((height3 * (e6VarArr3[i10].d(pointF3.y - ((d7) e7Var.f4641c).d, false) + d10)) + f13) - height2) * 0.18f) + height2);
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
        if (this.f4568f.e.size() > 1) {
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
        t tVar = sVar.f5467a;
        int[] iArr = tVar.d;
        int i11 = sVar.f5469c;
        int i12 = iArr[i11];
        int i13 = sVar.f5468b;
        float f10 = measuredHeight;
        int i14 = tVar.f5514c;
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
                l8 l8Var2 = ((d0) obj).f4488n;
                if (l8Var2 != null && l8Var2.K && l8Var2.P > 0.0f) {
                    l8Var.P = 0.0f;
                    break;
                }
            }
        }
        d0 d0Var = this.f4581r;
        if (d0Var != null) {
            d0Var.a(l8Var);
        }
        q();
        requestLayout();
        if (this.f4581r != null) {
            return false;
        }
        return true;
    }

    public final void m(long j3, boolean z10) {
        if (this.f4577n0) {
            long clamp = Utilities.clamp(j3, getDuration(), 0L);
            if (!this.f4580q0) {
                this.f4586u0 = clamp;
            }
            this.f4578o0 = System.currentTimeMillis() - clamp;
            this.f4579p0 = z10;
            if (this.f4577n0) {
                a0 a0Var = this.f4589w0;
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
        this.f4568f = tVar;
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
                    if (this.f4574k0) {
                        d0Var2.f4480c.onAttachedToWindow();
                    }
                    d0Var2.b(sVar, true);
                    arrayList2.add(d0Var2);
                } else if (sVar != null) {
                    d0Var.b(sVar, true);
                } else if (d0Var != null) {
                    this.f4576n.add(d0Var);
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
                ((d0) arrayList.get(i10)).f4480c.onAttachedToWindow();
                i10++;
            } else {
                this.f4574k0 = true;
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
                ((d0) arrayList.get(i10)).f4480c.onDetachedFromWindow();
                i10++;
            } else {
                this.f4574k0 = false;
                AndroidUtilities.cancelRunOnUIThread(this.f4589w0);
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
                if (d0Var != null && (l8Var = d0Var.f4488n) != null && (i12 = l8Var.f4987k0) > 0 && (i13 = l8Var.f4989l0) > 0) {
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
        this.f4581r = null;
        this.f4583s = null;
        int i10 = 0;
        while (true) {
            arrayList = this.h;
            if (i10 >= arrayList.size()) {
                break;
            }
            d0 d0Var = (d0) arrayList.get(i10);
            if (d0Var.f4488n == null) {
                if (this.f4581r == null) {
                    this.f4581r = d0Var;
                } else {
                    this.f4583s = d0Var;
                    break;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            d0 d0Var2 = (d0) arrayList.get(i11);
            if (d0Var2 == this.f4581r) {
                z10 = true;
            } else {
                z10 = false;
            }
            d0Var2.f4487m = z10;
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
        this.f4575l0 = runnable;
    }

    public void setMuted(boolean z10) {
        if (this.f4587v0 == z10) {
            return;
        }
        this.f4587v0 = z10;
    }

    public void setOnCameraThumbClick(Runnable runnable) {
        this.T = runnable;
    }

    public void setPlaying(boolean z10) {
        boolean z11 = this.f4585t0;
        this.f4585t0 = true;
        if (this.f4580q0 != z10) {
            this.f4580q0 = z10;
            if (!z10) {
                this.f4586u0 = getPosition();
            } else if (z11) {
                m(this.f4586u0, false);
            } else {
                this.f4579p0 = false;
            }
            if (this.f4577n0) {
                a0 a0Var = this.f4589w0;
                AndroidUtilities.cancelRunOnUIThread(a0Var);
                a0Var.run();
            }
        }
    }

    public void setPreview(boolean z10) {
        if (this.f4577n0 != z10) {
            this.f4577n0 = z10;
            ArrayList arrayList = this.h;
            int i10 = 0;
            if (z10) {
                org.telegram.ui.Components.ja jaVar = this.G;
                if (jaVar != null) {
                    jaVar.d();
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((d0) arrayList.get(i11)).f4478a = i11;
                }
            }
            this.f4579p0 = false;
            this.f4586u0 = 0L;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                d0 d0Var = (d0) obj;
                c0 c0Var = d0Var.d;
                if (c0Var != null) {
                    c0Var.setAudioEnabled(z10, true);
                    if (z10 && !this.f4580q0) {
                        d0Var.d.pause();
                    } else {
                        d0Var.d.play();
                    }
                }
            }
            a0 a0Var = this.f4589w0;
            AndroidUtilities.cancelRunOnUIThread(a0Var);
            if (z10) {
                this.f4578o0 = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(a0Var, 1000.0f / AndroidUtilities.screenRefreshRate);
            }
        }
    }

    public void setPreviewView(b7 b7Var) {
        this.f4584s0 = b7Var;
    }

    public void setResetState(Runnable runnable) {
        this.m0 = runnable;
    }

    public void setTimelineView(wc wcVar) {
        this.f4582r0 = wcVar;
    }
}
