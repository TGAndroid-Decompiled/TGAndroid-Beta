package di;

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
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.pr;
public abstract class e0 extends FrameLayout implements m70 {
    public static final int f7118x0 = 0;
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
    public final FrameLayout f7119a;
    public float f7120a0;
    public final bi.b f7121b;
    public float f7122b0;
    public final g7 f7123c;
    public float f7124c0;
    public CameraView d;
    public float f7125d0;
    public Object f7126e;
    public boolean f7127e0;
    public t f7128f;
    public boolean f7129f0;
    public d0 f7130g0;
    public final ArrayList h;
    public d0 f7131h0;
    public a0 f7132i0;
    public d0 f7133j0;
    public boolean f7134k0;
    public Runnable f7135l0;
    public Runnable m0;
    public final ArrayList f7136n;
    public boolean f7137n0;
    public long f7138o0;
    public boolean f7139p0;
    public boolean f7140q0;
    public d0 f7141r;
    public zc f7142r0;
    public d0 f7143s;
    public d7 f7144s0;
    public boolean f7145t0;
    public long f7146u0;
    public final Paint v;
    public boolean f7147v0;
    public final Path f7148w;
    public final a0 f7149w0;
    public final float[] f7150x;
    public final int f7151y;

    public e0(Context context, org.telegram.ui.Components.ja jaVar, FrameLayout frameLayout, bi.b bVar) {
        super(context);
        this.f7123c = new g7(new a0(this, 1));
        this.f7128f = new t(".");
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.f7136n = new ArrayList();
        Paint paint = new Paint(1);
        this.v = paint;
        this.f7148w = new Path();
        this.f7150x = new float[8];
        this.H = new a0(this, 2);
        pr prVar = pr.h;
        this.I = new org.telegram.ui.Components.e6(this, 0L, 320L, prVar);
        this.J = new org.telegram.ui.Components.e6[]{new org.telegram.ui.Components.e6(this, 0L, 320L, prVar), new org.telegram.ui.Components.e6(this, 0L, 320L, prVar), new org.telegram.ui.Components.e6(this, 0L, 320L, prVar), new org.telegram.ui.Components.e6(this, 0L, 320L, prVar), new org.telegram.ui.Components.e6(this, 0L, 320L, prVar)};
        this.K = new org.telegram.ui.Components.e6(this, 0L, 320L, prVar);
        this.L = new float[5];
        this.M = new float[5];
        this.P = new RectF();
        this.Q = new Path();
        this.S = true;
        this.f7140q0 = true;
        this.f7145t0 = true;
        this.f7149w0 = new a0(this, 3);
        this.G = jaVar;
        this.f7119a = frameLayout;
        this.f7121b = bVar;
        setBackgroundColor(-14737633);
        d0 d0Var = new d0(this);
        d0Var.b((s) this.f7128f.f8151e.get(0), false);
        d0Var.f7035m = true;
        if (this.f7134k0) {
            d0Var.f7027c.onAttachedToWindow();
        }
        arrayList.add(d0Var);
        this.f7141r = d0Var;
        this.f7143s = null;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(8.0f));
        int dp = AndroidUtilities.dp(300.0f);
        this.f7151y = dp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{0, -1, -1, 0}, new float[]{0.0f, 0.2f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = linearGradient;
        this.F = new Matrix();
        paint.setShader(linearGradient);
        setWillNotDraw(false);
    }

    public static void b(e0 e0Var, RectF rectF, s sVar) {
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
            canvas.drawColor(org.telegram.ui.ActionBar.j6.l1(drawable.getAlpha() * f7, -16777216));
        }
        canvas.restore();
    }

    @Override
    public final void a(RectF rectF) {
        d0 d0Var = this.f7133j0;
        if (d0Var != null) {
            s sVar = d0Var.h;
            t tVar = sVar.f8086a;
            int i10 = sVar.f8087b;
            int i11 = sVar.f8088c;
            float f7 = tVar.f8150c;
            float d = this.J[i11].d(tVar.d[i11], false);
            rectF.set((getMeasuredWidth() / d) * i10, (getMeasuredHeight() / f7) * i11, (getMeasuredWidth() / d) * (i10 + 1), (getMeasuredHeight() / f7) * (i11 + 1));
            return;
        }
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override
    public final void c(Canvas canvas, float f7) {
        d0 d0Var = this.f7133j0;
        if (d0Var != null) {
            s sVar = d0Var.h;
            t tVar = sVar.f8086a;
            int i10 = sVar.f8087b;
            int i11 = sVar.f8088c;
            float f10 = tVar.f8150c;
            float d = this.J[i11].d(tVar.d[i11], false);
            float measuredWidth = (getMeasuredWidth() / d) * i10;
            float measuredHeight = (getMeasuredHeight() / f10) * i11;
            float measuredWidth2 = (getMeasuredWidth() / d) * (i10 + 1);
            float measuredHeight2 = (getMeasuredHeight() / f10) * (i11 + 1);
            RectF rectF = this.P;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            g(canvas, rectF, this.f7133j0);
        }
    }

    public final boolean d() {
        if (this.f7130g0 == null) {
            return false;
        }
        this.f7130g0 = null;
        this.f7127e0 = false;
        invalidate();
        a0 a0Var = this.f7132i0;
        if (a0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(a0Var);
            this.f7132i0 = null;
            return true;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: di.e0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ArrayList arrayList;
        org.telegram.ui.Components.e6[] e6VarArr;
        RectF rectF;
        d0 d0Var;
        a0 a0Var;
        if (j() && !this.f7137n0) {
            if (motionEvent.getPointerCount() > 1) {
                d();
                return false;
            }
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            org.telegram.ui.Components.e6 e6Var = this.I;
            float f7 = e6Var.f25565c;
            int i10 = 0;
            while (true) {
                arrayList = this.h;
                int size = arrayList.size();
                e6VarArr = this.J;
                rectF = this.P;
                if (i10 < size) {
                    d0Var = (d0) arrayList.get(i10);
                    s sVar = d0Var.h;
                    int i11 = sVar.f8088c;
                    int i12 = sVar.f8087b;
                    float f10 = e6VarArr[i11].f25565c;
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
                this.f7127e0 = false;
                this.f7124c0 = 0.0f;
                this.f7120a0 = 0.0f;
                this.f7125d0 = 0.0f;
                this.f7122b0 = 0.0f;
                this.f7130g0 = d0Var;
                if (d0Var != null) {
                    a0 a0Var2 = new a0(this, 0);
                    this.f7132i0 = a0Var2;
                    AndroidUtilities.runOnUIThread(a0Var2, ViewConfiguration.getLongPressTimeout());
                }
            } else if (motionEvent.getAction() == 2) {
                if (v7.z6.a(motionEvent.getX(), motionEvent.getY(), this.V, this.W) > AndroidUtilities.touchSlop * 1.2f && (a0Var = this.f7132i0) != null) {
                    AndroidUtilities.cancelRunOnUIThread(a0Var);
                    this.f7132i0 = null;
                }
                if (!this.f7127e0 && getFilledProgress() >= 1.0f && this.f7130g0 != null && d0Var != null && v7.z6.a(motionEvent.getX(), motionEvent.getY(), this.V, this.W) > AndroidUtilities.touchSlop * 1.2f) {
                    this.f7127e0 = true;
                    this.f7131h0 = this.f7130g0;
                    this.f7124c0 = 0.0f;
                    this.f7120a0 = 0.0f;
                    this.f7125d0 = 0.0f;
                    this.f7122b0 = 0.0f;
                    invalidate();
                    a0 a0Var3 = this.f7132i0;
                    if (a0Var3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(a0Var3);
                        this.f7132i0 = null;
                    }
                } else if (this.f7127e0 && this.f7131h0 != null) {
                    float x11 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    float f11 = e6Var.f25565c;
                    int i13 = 0;
                    while (true) {
                        if (i13 < arrayList.size()) {
                            s sVar2 = ((d0) arrayList.get(i13)).h;
                            int i14 = sVar2.f8088c;
                            int i15 = sVar2.f8087b;
                            float f12 = e6VarArr[i14].f25565c;
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
                    int indexOf = arrayList.indexOf(this.f7131h0);
                    if (i13 >= 0 && indexOf >= 0 && i13 != indexOf) {
                        Collections.swap(arrayList, indexOf, i13);
                        o(this.f7128f);
                        this.f7129f0 = true;
                        invalidate();
                        float f13 = this.f7128f.f8150c;
                        s sVar3 = this.f7131h0.h;
                        int i16 = sVar3.f8088c;
                        int i17 = sVar3.f8087b;
                        float f14 = e6VarArr[i16].f25565c;
                        rectF.set((getMeasuredWidth() / f14) * i17, (getMeasuredHeight() / f13) * i16, (getMeasuredWidth() / f14) * (i17 + 1), (getMeasuredHeight() / f13) * (i16 + 1));
                        this.f7120a0 = this.f7124c0;
                        this.f7122b0 = this.f7125d0;
                        this.V = rectF.centerX();
                        this.W = rectF.centerY();
                    }
                    this.f7124c0 = motionEvent.getX() - this.V;
                    this.f7125d0 = motionEvent.getY() - this.W;
                    invalidate();
                } else if (this.f7130g0 != d0Var) {
                    this.f7130g0 = null;
                    a0 a0Var4 = this.f7132i0;
                    if (a0Var4 != null) {
                        AndroidUtilities.cancelRunOnUIThread(a0Var4);
                        this.f7132i0 = null;
                        return true;
                    }
                    return true;
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f7130g0 != null) {
                    this.f7130g0 = null;
                    this.f7127e0 = false;
                    invalidate();
                    a0 a0Var5 = this.f7132i0;
                    if (a0Var5 == null) {
                        return true;
                    }
                    AndroidUtilities.cancelRunOnUIThread(a0Var5);
                    this.f7132i0 = null;
                    return true;
                }
            } else if (motionEvent.getAction() == 3 && d()) {
                return true;
            }
            if (this.f7130g0 != null || super.dispatchTouchEvent(motionEvent)) {
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

    public final void g(android.graphics.Canvas r9, android.graphics.RectF r10, di.d0 r11) {
        throw new UnsupportedOperationException("Method not decompiled: di.e0.g(android.graphics.Canvas, android.graphics.RectF, di.d0):void");
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

    public ArrayList<o8> getContent() {
        ArrayList<o8> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            o8 o8Var = ((d0) obj).f7036n;
            if (o8Var != null) {
                arrayList.add(o8Var);
            }
        }
        return arrayList;
    }

    public d0 getCurrent() {
        return this.f7141r;
    }

    public long getDuration() {
        d0 mainPart;
        o8 o8Var;
        if (!this.f7137n0 || (mainPart = getMainPart()) == null || (o8Var = mainPart.f7036n) == null) {
            return 1L;
        }
        return Math.max(Math.min((o8Var.W - o8Var.V) * ((float) o8Var.f7758h0), 59500L), 1L);
    }

    public int getFilledCount() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                if (((d0) arrayList.get(i10)).f7036n != null) {
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
        return this.f7128f;
    }

    public d0 getMainPart() {
        d0 d0Var = null;
        if (!this.f7137n0) {
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
            o8 o8Var = d0Var2.f7036n;
            if (o8Var != null && o8Var.K) {
                long j10 = o8Var.f7758h0;
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
        return this.f7143s;
    }

    public ArrayList<Integer> getOrder() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.h;
            if (i10 < arrayList2.size()) {
                i10 = com.google.android.gms.internal.vision.e2.e(((d0) arrayList2.get(i10)).f7025a, i10, 1, arrayList);
            } else {
                return arrayList;
            }
        }
    }

    public long getPosition() {
        if (!this.f7137n0) {
            return 0L;
        }
        if (!this.f7140q0) {
            return this.f7146u0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = currentTimeMillis - this.f7138o0;
        if (j3 > getDuration()) {
            this.f7138o0 = currentTimeMillis - (j3 % getDuration());
        }
        return j3;
    }

    public long getPositionWithOffset() {
        long j3 = 0;
        if (!this.f7137n0) {
            return 0L;
        }
        getPosition();
        d0 mainPart = getMainPart();
        if (mainPart != null) {
            o8 o8Var = mainPart.f7036n;
            j3 = o8Var.X + (o8Var.V * ((float) o8Var.f7758h0));
        }
        return getPosition() + j3;
    }

    public int getTotalCount() {
        return this.h.size();
    }

    public final void h(float f7, Canvas canvas, RectF rectF, View view) {
        g7 g7Var;
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
            if (view == this.d && (g7Var = this.f7123c) != null) {
                Paint paint = (Paint) g7Var.f7270i;
                org.telegram.ui.Components.e6[] e6VarArr = (org.telegram.ui.Components.e6[]) g7Var.h;
                org.telegram.ui.Components.e6[] e6VarArr2 = (org.telegram.ui.Components.e6[]) g7Var.f7269g;
                Path path = (Path) g7Var.f7271j;
                f7 f7Var = (f7) g7Var.f7266c;
                if (f7Var != null && f7Var.f7235b.length > 0) {
                    float e7 = ((org.telegram.ui.Components.e6) g7Var.d).e(g7Var.f7264a);
                    float d = ((org.telegram.ui.Components.e6) g7Var.f7267e).d(((f7) g7Var.f7266c).f7236c, false);
                    float width = (rectF2.width() * d) + rectF2.left;
                    float d10 = ((org.telegram.ui.Components.e6) g7Var.f7268f).d(((f7) g7Var.f7266c).d, false);
                    float f10 = rectF2.top;
                    float lerp = AndroidUtilities.lerp(0.5f, 1.1f, e7);
                    canvas.save();
                    canvas.scale(lerp, lerp, width, (rectF2.height() * d10) + f10);
                    if (e7 > 0.0f) {
                        path.rewind();
                        int min = Math.min(4, ((f7) g7Var.f7266c).f7235b.length);
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
                            f7 f7Var2 = (f7) g7Var.f7266c;
                            PointF[] pointFArr = f7Var2.f7235b;
                            PointF pointF = pointFArr[i12];
                            int i14 = min;
                            PointF pointF2 = pointFArr[i11];
                            org.telegram.ui.Components.e6[] e6VarArr3 = e6VarArr;
                            PointF pointF3 = pointFArr[i10];
                            org.telegram.ui.Components.e6[] e6VarArr4 = e6VarArr2;
                            float f11 = e7;
                            float width2 = (rectF2.width() * (e6VarArr4[i12].d(pointF.x - f7Var2.f7236c, false) + d)) + rectF2.left;
                            float height = (rectF2.height() * (e6VarArr3[i12].d(pointF.y - ((f7) g7Var.f7266c).d, false) + d10)) + rectF2.top;
                            float width3 = (rectF2.width() * (e6VarArr4[i11].d(pointF2.x - ((f7) g7Var.f7266c).f7236c, false) + d)) + rectF2.left;
                            float height2 = (rectF2.height() * (e6VarArr3[i11].d(pointF2.y - ((f7) g7Var.f7266c).d, false) + d10)) + rectF2.top;
                            float f12 = rectF2.left;
                            float width4 = rectF2.width();
                            float f13 = rectF2.top;
                            float height3 = rectF.height();
                            path.moveTo(((width2 - width3) * 0.18f) + width3, ((height - height2) * 0.18f) + height2);
                            path.lineTo(width3, height2);
                            path.lineTo(((((width4 * (e6VarArr4[i10].d(pointF3.x - ((f7) g7Var.f7266c).f7236c, false) + d)) + f12) - width3) * 0.18f) + width3, ((((height3 * (e6VarArr3[i10].d(pointF3.y - ((f7) g7Var.f7266c).d, false) + d10)) + f13) - height2) * 0.18f) + height2);
                            rectF2 = rectF;
                            e6VarArr2 = e6VarArr4;
                            i11 = i13;
                            min = i14;
                            e6VarArr = e6VarArr3;
                            e7 = f11;
                        }
                        paint.setAlpha((int) (e7 * 255.0f));
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
        if (this.f7128f.f8151e.size() > 1) {
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
        t tVar = sVar.f8086a;
        int[] iArr = tVar.d;
        int i11 = sVar.f8088c;
        int i12 = iArr[i11];
        int i13 = sVar.f8087b;
        float f10 = measuredHeight;
        int i14 = tVar.f8150c;
        rectF.set((f7 / i12) * i13, (f10 / i14) * i11, (f7 / i12) * (i13 + 1), (f10 / i14) * (i11 + 1));
    }

    public final boolean l(o8 o8Var) {
        if (o8Var.K) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                o8 o8Var2 = ((d0) obj).f7036n;
                if (o8Var2 != null && o8Var2.K && o8Var2.P > 0.0f) {
                    o8Var.P = 0.0f;
                    break;
                }
            }
        }
        d0 d0Var = this.f7141r;
        if (d0Var != null) {
            d0Var.a(o8Var);
        }
        q();
        requestLayout();
        if (this.f7141r != null) {
            return false;
        }
        return true;
    }

    public final void m(long j3, boolean z10) {
        if (this.f7137n0) {
            long clamp = Utilities.clamp(j3, getDuration(), 0L);
            if (!this.f7140q0) {
                this.f7146u0 = clamp;
            }
            this.f7138o0 = System.currentTimeMillis() - clamp;
            this.f7139p0 = z10;
            if (this.f7137n0) {
                a0 a0Var = this.f7149w0;
                AndroidUtilities.cancelRunOnUIThread(a0Var);
                a0Var.run();
            }
        }
    }

    public final void n(o8 o8Var) {
        if (o8Var != null && o8Var.T != null) {
            o(o8Var.S);
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i10 < arrayList.size()) {
                    ((d0) arrayList.get(i10)).a((o8) o8Var.T.get(i10));
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
        ArrayList arrayList = tVar.f8151e;
        this.f7128f = tVar;
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
                    if (this.f7134k0) {
                        d0Var2.f7027c.onAttachedToWindow();
                    }
                    d0Var2.b(sVar, true);
                    arrayList2.add(d0Var2);
                } else if (sVar != null) {
                    d0Var.b(sVar, true);
                } else if (d0Var != null) {
                    this.f7136n.add(d0Var);
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
                ((d0) arrayList.get(i10)).f7027c.onAttachedToWindow();
                i10++;
            } else {
                this.f7134k0 = true;
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
                ((d0) arrayList.get(i10)).f7027c.onDetachedFromWindow();
                i10++;
            } else {
                this.f7134k0 = false;
                AndroidUtilities.cancelRunOnUIThread(this.f7149w0);
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        d0 d0Var;
        o8 o8Var;
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
                        if (childAt == ((d0) arrayList.get(i15)).f7028e) {
                            d0Var = (d0) arrayList.get(i15);
                            break;
                        }
                        i15++;
                    } else {
                        d0Var = null;
                        break;
                    }
                }
                if (d0Var != null && (o8Var = d0Var.f7036n) != null && (i12 = o8Var.f7764k0) > 0 && (i13 = o8Var.f7766l0) > 0) {
                    if (o8Var.Q % 90 == 1) {
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
        if (this.f7126e != null) {
            z11 = true;
        }
        if (z10 == z11) {
            return;
        }
        if (z10) {
            this.f7126e = cameraView.getBlurRenderNode();
        } else {
            this.f7126e = null;
        }
    }

    public final void q() {
        ArrayList arrayList;
        boolean z10;
        this.f7141r = null;
        this.f7143s = null;
        int i10 = 0;
        while (true) {
            arrayList = this.h;
            if (i10 >= arrayList.size()) {
                break;
            }
            d0 d0Var = (d0) arrayList.get(i10);
            if (d0Var.f7036n == null) {
                if (this.f7141r == null) {
                    this.f7141r = d0Var;
                } else {
                    this.f7143s = d0Var;
                    break;
                }
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            d0 d0Var2 = (d0) arrayList.get(i11);
            if (d0Var2 == this.f7141r) {
                z10 = true;
            } else {
                z10 = false;
            }
            d0Var2.f7035m = z10;
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
            addView(cameraView, w7.x5.e(-1, -1, 119));
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
        this.f7135l0 = runnable;
    }

    public void setMuted(boolean z10) {
        if (this.f7147v0 == z10) {
            return;
        }
        this.f7147v0 = z10;
    }

    public void setOnCameraThumbClick(Runnable runnable) {
        this.T = runnable;
    }

    public void setPlaying(boolean z10) {
        boolean z11 = this.f7145t0;
        this.f7145t0 = true;
        if (this.f7140q0 != z10) {
            this.f7140q0 = z10;
            if (!z10) {
                this.f7146u0 = getPosition();
            } else if (z11) {
                m(this.f7146u0, false);
            } else {
                this.f7139p0 = false;
            }
            if (this.f7137n0) {
                a0 a0Var = this.f7149w0;
                AndroidUtilities.cancelRunOnUIThread(a0Var);
                a0Var.run();
            }
        }
    }

    public void setPreview(boolean z10) {
        if (this.f7137n0 != z10) {
            this.f7137n0 = z10;
            ArrayList arrayList = this.h;
            int i10 = 0;
            if (z10) {
                org.telegram.ui.Components.ja jaVar = this.G;
                if (jaVar != null) {
                    jaVar.d();
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((d0) arrayList.get(i11)).f7025a = i11;
                }
            }
            this.f7139p0 = false;
            this.f7146u0 = 0L;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                d0 d0Var = (d0) obj;
                c0 c0Var = d0Var.d;
                if (c0Var != null) {
                    c0Var.setAudioEnabled(z10, true);
                    if (z10 && !this.f7140q0) {
                        d0Var.d.pause();
                    } else {
                        d0Var.d.play();
                    }
                }
            }
            a0 a0Var = this.f7149w0;
            AndroidUtilities.cancelRunOnUIThread(a0Var);
            if (z10) {
                this.f7138o0 = System.currentTimeMillis();
                AndroidUtilities.runOnUIThread(a0Var, 1000.0f / AndroidUtilities.screenRefreshRate);
            }
        }
    }

    public void setPreviewView(d7 d7Var) {
        this.f7144s0 = d7Var;
    }

    public void setResetState(Runnable runnable) {
        this.m0 = runnable;
    }

    public void setTimelineView(zc zcVar) {
        this.f7142r0 = zcVar;
    }
}
