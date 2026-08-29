package nh;

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
import org.telegram.ui.Components.i70;
import org.telegram.ui.Components.jr;
import org.telegram.ui.th;
public abstract class e0 extends FrameLayout implements i70 {
    public static final int f17555t0 = 0;
    public final LinearGradient A;
    public final Matrix B;
    public final org.telegram.ui.Components.ga C;
    public final a0 D;
    public final org.telegram.ui.Components.d6 E;
    public final org.telegram.ui.Components.d6[] F;
    public final org.telegram.ui.Components.d6 G;
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
    public final FrameLayout f17556a;
    public boolean f17557a0;
    public final lh.b f17558b;
    public boolean f17559b0;
    public final i6 f17560c;
    public d0 f17561c0;
    public CameraView d;
    public d0 f17562d0;
    public Object f17563e;
    public a0 f17564e0;
    public t f17565f;
    public d0 f17566f0;
    public boolean f17567g0;
    public final ArrayList h;
    public Runnable f17568h0;
    public Runnable f17569i0;
    public boolean f17570j0;
    public long f17571k0;
    public boolean f17572l0;
    public boolean m0;
    public final ArrayList f17573n;
    public qb f17574n0;
    public f6 f17575o0;
    public boolean f17576p0;
    public long f17577q0;
    public d0 f17578r;
    public boolean f17579r0;
    public d0 f17580s;
    public final a0 f17581s0;
    public final Paint v;
    public final Path f17582w;
    public final float[] f17583x;
    public final int f17584y;

    public e0(Context context, org.telegram.ui.Components.ga gaVar, FrameLayout frameLayout, lh.b bVar) {
        super(context);
        this.f17560c = new i6(new a0(this, 1));
        this.f17565f = new t(".");
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.f17573n = new ArrayList();
        Paint paint = new Paint(1);
        this.v = paint;
        this.f17582w = new Path();
        this.f17583x = new float[8];
        this.D = new a0(this, 2);
        jr jrVar = jr.h;
        this.E = new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar);
        this.F = new org.telegram.ui.Components.d6[]{new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar), new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar), new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar), new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar), new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar)};
        this.G = new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar);
        this.H = new float[5];
        this.I = new float[5];
        this.L = new RectF();
        this.M = new Path();
        this.O = true;
        this.m0 = true;
        this.f17576p0 = true;
        this.f17581s0 = new a0(this, 3);
        this.C = gaVar;
        this.f17556a = frameLayout;
        this.f17558b = bVar;
        setBackgroundColor(-14737633);
        d0 d0Var = new d0(this);
        d0Var.b((s) this.f17565f.f18567e.get(0), false);
        d0Var.f17514m = true;
        if (this.f17567g0) {
            d0Var.f17506c.onAttachedToWindow();
        }
        arrayList.add(d0Var);
        this.f17578r = d0Var;
        this.f17580s = null;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(8.0f));
        int dp = AndroidUtilities.dp(300.0f);
        this.f17584y = dp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{0, -1, -1, 0}, new float[]{0.0f, 0.2f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
        this.A = linearGradient;
        this.B = new Matrix();
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
        float f9 = rectF.left;
        boolean z13 = false;
        if (f9 <= 0.0f) {
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
            rectF.offset(0.0f, f11 - f9);
        } else {
            if (z12 && !z10) {
                rectF.offset(rectF.width(), 0.0f);
            }
            if (z13 && !z11) {
                rectF.offset(0.0f, rectF.height());
            }
        }
    }

    public static void f(Canvas canvas, Drawable drawable, RectF rectF, float f9) {
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
        if (f9 > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.g6.l1(drawable.getAlpha() * f9, -16777216));
        }
        canvas.restore();
    }

    @Override
    public final void a(RectF rectF) {
        d0 d0Var = this.f17566f0;
        if (d0Var != null) {
            s sVar = d0Var.h;
            t tVar = sVar.f18540a;
            int i10 = sVar.f18541b;
            int i11 = sVar.f18542c;
            float f9 = tVar.f18566c;
            float d = this.F[i11].d(tVar.d[i11], false);
            rectF.set((getMeasuredWidth() / d) * i10, (getMeasuredHeight() / f9) * i11, (getMeasuredWidth() / d) * (i10 + 1), (getMeasuredHeight() / f9) * (i11 + 1));
            return;
        }
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void b(Canvas canvas, float f9) {
        d0 d0Var = this.f17566f0;
        if (d0Var != null) {
            s sVar = d0Var.h;
            t tVar = sVar.f18540a;
            int i10 = sVar.f18541b;
            int i11 = sVar.f18542c;
            float f10 = tVar.f18566c;
            float d = this.F[i11].d(tVar.d[i11], false);
            float measuredWidth = (getMeasuredWidth() / d) * i10;
            float measuredHeight = (getMeasuredHeight() / f10) * i11;
            float measuredWidth2 = (getMeasuredWidth() / d) * (i10 + 1);
            float measuredHeight2 = (getMeasuredHeight() / f10) * (i11 + 1);
            RectF rectF = this.L;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            g(canvas, rectF, this.f17566f0);
        }
    }

    public final boolean d() {
        if (this.f17561c0 == null) {
            return false;
        }
        this.f17561c0 = null;
        this.f17557a0 = false;
        invalidate();
        a0 a0Var = this.f17564e0;
        if (a0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(a0Var);
            this.f17564e0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: nh.e0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ArrayList arrayList;
        org.telegram.ui.Components.d6[] d6VarArr;
        RectF rectF;
        d0 d0Var;
        a0 a0Var;
        if (j() && !this.f17570j0) {
            if (motionEvent.getPointerCount() > 1) {
                d();
                return false;
            }
            float x4 = motionEvent.getX();
            float y8 = motionEvent.getY();
            org.telegram.ui.Components.d6 d6Var = this.E;
            float f9 = d6Var.f27666c;
            int i10 = 0;
            while (true) {
                arrayList = this.h;
                int size = arrayList.size();
                d6VarArr = this.F;
                rectF = this.L;
                if (i10 < size) {
                    d0Var = (d0) arrayList.get(i10);
                    s sVar = d0Var.h;
                    int i11 = sVar.f18542c;
                    int i12 = sVar.f18541b;
                    float f10 = d6VarArr[i11].f27666c;
                    rectF.set((getMeasuredWidth() / f10) * i12, (getMeasuredHeight() / f9) * i11, (getMeasuredWidth() / f10) * (i12 + 1), (getMeasuredHeight() / f9) * (i11 + 1));
                    if (rectF.contains(x4, y8)) {
                        break;
                    }
                    i10++;
                } else {
                    d0Var = null;
                    break;
                }
            }
            if (motionEvent.getAction() == 0) {
                this.R = motionEvent.getX();
                this.S = motionEvent.getY();
                this.f17557a0 = false;
                this.V = 0.0f;
                this.T = 0.0f;
                this.W = 0.0f;
                this.U = 0.0f;
                this.f17561c0 = d0Var;
                if (d0Var != null) {
                    a0 a0Var2 = new a0(this, 0);
                    this.f17564e0 = a0Var2;
                    AndroidUtilities.runOnUIThread(a0Var2, ViewConfiguration.getLongPressTimeout());
                }
            } else if (motionEvent.getAction() == 2) {
                if (i7.z5.a(motionEvent.getX(), motionEvent.getY(), this.R, this.S) > AndroidUtilities.touchSlop * 1.2f && (a0Var = this.f17564e0) != null) {
                    AndroidUtilities.cancelRunOnUIThread(a0Var);
                    this.f17564e0 = null;
                }
                if (!this.f17557a0 && getFilledProgress() >= 1.0f && this.f17561c0 != null && d0Var != null && i7.z5.a(motionEvent.getX(), motionEvent.getY(), this.R, this.S) > AndroidUtilities.touchSlop * 1.2f) {
                    this.f17557a0 = true;
                    this.f17562d0 = this.f17561c0;
                    this.V = 0.0f;
                    this.T = 0.0f;
                    this.W = 0.0f;
                    this.U = 0.0f;
                    invalidate();
                    a0 a0Var3 = this.f17564e0;
                    if (a0Var3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(a0Var3);
                        this.f17564e0 = null;
                    }
                } else if (this.f17557a0 && this.f17562d0 != null) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    float f11 = d6Var.f27666c;
                    int i13 = 0;
                    while (true) {
                        if (i13 < arrayList.size()) {
                            s sVar2 = ((d0) arrayList.get(i13)).h;
                            int i14 = sVar2.f18542c;
                            int i15 = sVar2.f18541b;
                            float f12 = d6VarArr[i14].f27666c;
                            rectF.set((getMeasuredWidth() / f12) * i15, (getMeasuredHeight() / f11) * i14, (getMeasuredWidth() / f12) * (i15 + 1), (getMeasuredHeight() / f11) * (i14 + 1));
                            if (rectF.contains(x10, y10)) {
                                break;
                            }
                            i13++;
                        } else {
                            i13 = -1;
                            break;
                        }
                    }
                    int indexOf = arrayList.indexOf(this.f17562d0);
                    if (i13 >= 0 && indexOf >= 0 && i13 != indexOf) {
                        Collections.swap(arrayList, indexOf, i13);
                        o(this.f17565f);
                        this.f17559b0 = true;
                        invalidate();
                        float f13 = this.f17565f.f18566c;
                        s sVar3 = this.f17562d0.h;
                        int i16 = sVar3.f18542c;
                        int i17 = sVar3.f18541b;
                        float f14 = d6VarArr[i16].f27666c;
                        rectF.set((getMeasuredWidth() / f14) * i17, (getMeasuredHeight() / f13) * i16, (getMeasuredWidth() / f14) * (i17 + 1), (getMeasuredHeight() / f13) * (i16 + 1));
                        this.T = this.V;
                        this.U = this.W;
                        this.R = rectF.centerX();
                        this.S = rectF.centerY();
                    }
                    this.V = motionEvent.getX() - this.R;
                    this.W = motionEvent.getY() - this.S;
                    invalidate();
                } else if (this.f17561c0 != d0Var) {
                    this.f17561c0 = null;
                    a0 a0Var4 = this.f17564e0;
                    if (a0Var4 != null) {
                        AndroidUtilities.cancelRunOnUIThread(a0Var4);
                        this.f17564e0 = null;
                        return true;
                    }
                    return true;
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f17561c0 != null) {
                    this.f17561c0 = null;
                    this.f17557a0 = false;
                    invalidate();
                    a0 a0Var5 = this.f17564e0;
                    if (a0Var5 == null) {
                        return true;
                    }
                    AndroidUtilities.cancelRunOnUIThread(a0Var5);
                    this.f17564e0 = null;
                    return true;
                }
            } else if (motionEvent.getAction() == 3 && d()) {
                return true;
            }
            if (this.f17561c0 != null || super.dispatchTouchEvent(motionEvent)) {
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
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((d0) obj).a(null);
        }
        q();
    }

    public final void g(android.graphics.Canvas r9, android.graphics.RectF r10, nh.d0 r11) {
        throw new UnsupportedOperationException("Method not decompiled: nh.e0.g(android.graphics.Canvas, android.graphics.RectF, nh.d0):void");
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

    public ArrayList<o7> getContent() {
        ArrayList<o7> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            o7 o7Var = ((d0) obj).f17515n;
            if (o7Var != null) {
                arrayList.add(o7Var);
            }
        }
        return arrayList;
    }

    public d0 getCurrent() {
        return this.f17578r;
    }

    public long getDuration() {
        d0 mainPart;
        o7 o7Var;
        if (!this.f17570j0 || (mainPart = getMainPart()) == null || (o7Var = mainPart.f17515n) == null) {
            return 1L;
        }
        return Math.max(Math.min((o7Var.W - o7Var.V) * ((float) o7Var.f18272h0), 59500L), 1L);
    }

    public int getFilledCount() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((d0) arrayList.get(i10)).f17515n != null) {
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
        return this.f17565f;
    }

    public d0 getMainPart() {
        d0 d0Var = null;
        if (!this.f17570j0) {
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
            o7 o7Var = d0Var2.f17515n;
            if (o7Var != null && o7Var.K) {
                long j11 = o7Var.f18272h0;
                cg.v2 v2Var = d0Var2.d;
                if (v2Var != null && v2Var.getDuration() > 0) {
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
        return this.f17580s;
    }

    public ArrayList<Integer> getOrder() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.h;
            if (i10 < arrayList2.size()) {
                i10 = th.d(((d0) arrayList2.get(i10)).f17504a, i10, 1, arrayList);
            } else {
                return arrayList;
            }
        }
    }

    public long getPosition() {
        if (!this.f17570j0) {
            return 0L;
        }
        if (!this.m0) {
            return this.f17577q0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f17571k0;
        if (j10 > getDuration()) {
            this.f17571k0 = currentTimeMillis - (j10 % getDuration());
        }
        return j10;
    }

    public long getPositionWithOffset() {
        long j10 = 0;
        if (!this.f17570j0) {
            return 0L;
        }
        getPosition();
        d0 mainPart = getMainPart();
        if (mainPart != null) {
            o7 o7Var = mainPart.f17515n;
            j10 = o7Var.X + (o7Var.V * ((float) o7Var.f18272h0));
        }
        return getPosition() + j10;
    }

    public int getTotalCount() {
        return this.h.size();
    }

    public final void h(float f9, Canvas canvas, RectF rectF, View view) {
        i6 i6Var;
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
            if (f9 > 0.0f) {
                canvas.drawColor(org.telegram.ui.ActionBar.g6.l1(view.getAlpha() * f9, -16777216));
            }
            canvas.restore();
            if (view == this.d && (i6Var = this.f17560c) != null) {
                Paint paint = i6Var.f17891i;
                org.telegram.ui.Components.d6[] d6VarArr = i6Var.h;
                org.telegram.ui.Components.d6[] d6VarArr2 = i6Var.f17890g;
                Path path = i6Var.f17892j;
                h6 h6Var = i6Var.f17887c;
                if (h6Var != null && h6Var.f17845b.length > 0) {
                    float e10 = i6Var.d.e(i6Var.f17886b);
                    float d = i6Var.f17888e.d(i6Var.f17887c.f17846c, false);
                    float width = (rectF.width() * d) + rectF.left;
                    float d10 = i6Var.f17889f.d(i6Var.f17887c.d, false);
                    float f10 = rectF.top;
                    float lerp = AndroidUtilities.lerp(0.5f, 1.1f, e10);
                    canvas.save();
                    canvas.scale(lerp, lerp, width, (rectF.height() * d10) + f10);
                    if (e10 > 0.0f) {
                        path.rewind();
                        int min = Math.min(4, i6Var.f17887c.f17845b.length);
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
                            h6 h6Var2 = i6Var.f17887c;
                            PointF[] pointFArr = h6Var2.f17845b;
                            PointF pointF = pointFArr[i12];
                            int i14 = min;
                            PointF pointF2 = pointFArr[i11];
                            org.telegram.ui.Components.d6[] d6VarArr3 = d6VarArr;
                            PointF pointF3 = pointFArr[i10];
                            org.telegram.ui.Components.d6[] d6VarArr4 = d6VarArr2;
                            float f11 = e10;
                            float width2 = (rectF.width() * (d6VarArr4[i12].d(pointF.x - h6Var2.f17846c, false) + d)) + rectF.left;
                            float height = (rectF.height() * (d6VarArr3[i12].d(pointF.y - i6Var.f17887c.d, false) + d10)) + rectF.top;
                            float width3 = (rectF.width() * (d6VarArr4[i11].d(pointF2.x - i6Var.f17887c.f17846c, false) + d)) + rectF.left;
                            float height2 = (rectF.height() * (d6VarArr3[i11].d(pointF2.y - i6Var.f17887c.d, false) + d10)) + rectF.top;
                            float width4 = (rectF.width() * (d6VarArr4[i10].d(pointF3.x - i6Var.f17887c.f17846c, false) + d)) + rectF.left;
                            float f12 = rectF.top;
                            float height3 = rectF.height();
                            path.moveTo(((width2 - width3) * 0.18f) + width3, ((height - height2) * 0.18f) + height2);
                            path.lineTo(width3, height2);
                            path.lineTo(((width4 - width3) * 0.18f) + width3, ((((height3 * (d6VarArr3[i10].d(pointF3.y - i6Var.f17887c.d, false) + d10)) + f12) - height2) * 0.18f) + height2);
                            d6VarArr2 = d6VarArr4;
                            i11 = i13;
                            min = i14;
                            d6VarArr = d6VarArr3;
                            e10 = f11;
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
            RenderNode c3 = org.telegram.messenger.b.c(this.J);
            c3.endRecording();
            canvas.drawRenderNode(c3);
            Object obj = this.K;
            if (obj != null) {
                RenderNode c6 = org.telegram.messenger.b.c(obj);
                c6.setPosition(0, 0, getWidth(), getHeight());
                c6.beginRecording().drawRenderNode(c3);
                c6.endRecording();
            }
        }
    }

    public final boolean j() {
        if (this.f17565f.f18567e.size() > 1) {
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
        float f9 = measuredWidth;
        t tVar = sVar.f18540a;
        int[] iArr = tVar.d;
        int i11 = sVar.f18542c;
        int i12 = iArr[i11];
        int i13 = sVar.f18541b;
        float f10 = measuredHeight;
        int i14 = tVar.f18566c;
        rectF.set((f9 / i12) * i13, (f10 / i14) * i11, (f9 / i12) * (i13 + 1), (f10 / i14) * (i11 + 1));
    }

    public final boolean l(o7 o7Var) {
        if (o7Var.K) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                o7 o7Var2 = ((d0) obj).f17515n;
                if (o7Var2 != null && o7Var2.K && o7Var2.P > 0.0f) {
                    o7Var.P = 0.0f;
                    break;
                }
            }
        }
        d0 d0Var = this.f17578r;
        if (d0Var != null) {
            d0Var.a(o7Var);
        }
        q();
        requestLayout();
        if (this.f17578r != null) {
            return false;
        }
        return true;
    }

    public final void m(long j10, boolean z10) {
        if (this.f17570j0) {
            long clamp = Utilities.clamp(j10, getDuration(), 0L);
            if (!this.m0) {
                this.f17577q0 = clamp;
            }
            this.f17571k0 = System.currentTimeMillis() - clamp;
            this.f17572l0 = z10;
            if (this.f17570j0) {
                a0 a0Var = this.f17581s0;
                AndroidUtilities.cancelRunOnUIThread(a0Var);
                a0Var.run();
            }
        }
    }

    public final void n(o7 o7Var) {
        if (o7Var != null && o7Var.T != null) {
            o(o7Var.S);
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i10 < arrayList.size()) {
                    ((d0) arrayList.get(i10)).a((o7) o7Var.T.get(i10));
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
        ArrayList arrayList = tVar.f18567e;
        this.f17565f = tVar;
        a0 a0Var = this.D;
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
                    if (this.f17567g0) {
                        d0Var2.f17506c.onAttachedToWindow();
                    }
                    d0Var2.b(sVar, true);
                    arrayList2.add(d0Var2);
                } else if (sVar != null) {
                    d0Var.b(sVar, true);
                } else if (d0Var != null) {
                    this.f17573n.add(d0Var);
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
                ((d0) arrayList.get(i10)).f17506c.onAttachedToWindow();
                i10++;
            } else {
                this.f17567g0 = true;
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
                ((d0) arrayList.get(i10)).f17506c.onDetachedFromWindow();
                i10++;
            } else {
                this.f17567g0 = false;
                AndroidUtilities.cancelRunOnUIThread(this.f17581s0);
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        d0 d0Var;
        o7 o7Var;
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
                        if (childAt == ((d0) arrayList.get(i15)).f17507e) {
                            d0Var = (d0) arrayList.get(i15);
                            break;
                        }
                        i15++;
                    } else {
                        d0Var = null;
                        break;
                    }
                }
                if (d0Var != null && (o7Var = d0Var.f17515n) != null && (i12 = o7Var.f18278k0) > 0 && (i13 = o7Var.f18280l0) > 0) {
                    if (o7Var.Q % 90 == 1) {
                        i13 = i12;
                        i12 = i13;
                    }
                    float f9 = i12;
                    float f10 = i13;
                    float min = Math.min(1.0f, Math.max(f9 / size, f10 / size2));
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (f9 * min), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (f10 * min), 1073741824));
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
        if (this.f17563e != null) {
            z11 = true;
        }
        if (z10 == z11) {
            return;
        }
        if (z10) {
            this.f17563e = cameraView.getBlurRenderNode();
        } else {
            this.f17563e = null;
        }
    }

    public final void q() {
        ArrayList arrayList;
        boolean z10;
        this.f17578r = null;
        this.f17580s = null;
        int i10 = 0;
        while (true) {
            arrayList = this.h;
            if (i10 >= arrayList.size()) {
                break;
            }
            d0 d0Var = (d0) arrayList.get(i10);
            if (d0Var.f17515n == null) {
                if (this.f17578r == null) {
                    this.f17578r = d0Var;
                } else {
                    this.f17580s = d0Var;
                    break;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            d0 d0Var2 = (d0) arrayList.get(i11);
            if (d0Var2 == this.f17578r) {
                z10 = true;
            } else {
                z10 = false;
            }
            d0Var2.f17514m = z10;
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
            cameraView2.unlistenDraw(new a0(this, 1));
            AndroidUtilities.removeFromParent(this.d);
            this.d = null;
            p();
        }
        this.d = cameraView;
        if (cameraView != null) {
            addView(cameraView, i7.f6.e(-1, -1, 119));
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
        this.f17568h0 = runnable;
    }

    public void setMuted(boolean z10) {
        if (this.f17579r0 == z10) {
            return;
        }
        this.f17579r0 = z10;
    }

    public void setOnCameraThumbClick(Runnable runnable) {
        this.P = runnable;
    }

    public void setPlaying(boolean z10) {
        boolean z11 = this.f17576p0;
        this.f17576p0 = true;
        if (this.m0 != z10) {
            this.m0 = z10;
            if (!z10) {
                this.f17577q0 = getPosition();
            } else if (z11) {
                m(this.f17577q0, false);
            } else {
                this.f17572l0 = false;
            }
            if (this.f17570j0) {
                a0 a0Var = this.f17581s0;
                AndroidUtilities.cancelRunOnUIThread(a0Var);
                a0Var.run();
            }
        }
    }

    public void setPreview(boolean z10) {
        if (this.f17570j0 != z10) {
            this.f17570j0 = z10;
            ArrayList arrayList = this.h;
            int i10 = 0;
            if (z10) {
                org.telegram.ui.Components.ga gaVar = this.C;
                if (gaVar != null) {
                    gaVar.d();
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((d0) arrayList.get(i11)).f17504a = i11;
                }
            }
            this.f17572l0 = false;
            this.f17577q0 = 0L;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                d0 d0Var = (d0) obj;
                cg.v2 v2Var = d0Var.d;
                if (v2Var != null) {
                    v2Var.setAudioEnabled(z10, true);
                    if (z10 && !this.m0) {
                        d0Var.d.pause();
                    } else {
                        d0Var.d.play();
                    }
                }
            }
            a0 a0Var = this.f17581s0;
            AndroidUtilities.cancelRunOnUIThread(a0Var);
            if (z10) {
                this.f17571k0 = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(a0Var, 1000.0f / AndroidUtilities.screenRefreshRate);
            }
        }
    }

    public void setPreviewView(f6 f6Var) {
        this.f17575o0 = f6Var;
    }

    public void setResetState(Runnable runnable) {
        this.f17569i0 = runnable;
    }

    public void setTimelineView(qb qbVar) {
        this.f17574n0 = qbVar;
    }
}
