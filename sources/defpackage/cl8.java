package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
public abstract class cl8 extends FrameLayout {
    public static final int C0 = 0;
    public final HashSet A0;
    public e43 B0;
    public ndc E;
    public cm2 F;
    public lqb G;
    public final sm0 H;
    public final n10 I;
    public long J;
    public long K;
    public final bl8 L;
    public final bl8 M;
    public final bl8 N;
    public f8b O;
    public boolean P;
    public final ln Q;
    public final Paint R;
    public Drawable S;
    public Drawable T;
    public final Paint U;
    public int V;
    public int W;
    public Bitmap a;
    public final Matrix a0;
    public final Rect b;
    public final float[] b0;
    public final Rect c;
    public float c0;
    public g6b d;
    public float d0;
    public ndc e;
    public float e0;
    public int f;
    public boolean f0;
    public final ln g0;
    public int h;
    public boolean h0;
    public final Matrix i0;
    public final Matrix j0;
    public final Matrix k0;
    public boolean l0;
    public final PointF m0;
    public ncc n;
    public final PointF n0;
    public float o0;
    public double p0;
    public boolean q0;
    public TextureView r;
    public boolean r0;
    public n78 s;
    public boolean s0;
    public final Matrix t0;
    public final Matrix u0;
    public float v0;
    public f8b w;
    public boolean w0;
    public ao9 x;
    public boolean x0;
    public ndc y;
    public long y0;
    public Runnable z0;

    public cl8(Activity activity, sm0 sm0Var, n10 n10Var) {
        super(activity);
        this.b = new Rect();
        this.c = new Rect();
        Paint paint = new Paint(1);
        new bl8(this, (byte) 1);
        this.L = new bl8(this, (byte) 2);
        this.M = new bl8(this, (byte) 3);
        this.N = new bl8(this, (byte) 4);
        this.Q = new ln(this, 0L, 350L, d53.h);
        this.R = new Paint(7);
        this.U = new Paint(1);
        this.a0 = new Matrix();
        this.b0 = new float[2];
        this.f0 = true;
        this.g0 = new ln(this, 0L, 320L, d53.g);
        this.h0 = false;
        this.i0 = new Matrix();
        this.j0 = new Matrix();
        this.k0 = new Matrix();
        this.l0 = true;
        this.m0 = new PointF();
        this.n0 = new PointF();
        this.t0 = new Matrix();
        this.u0 = new Matrix();
        this.A0 = new HashSet();
        this.H = sm0Var;
        this.I = n10Var;
        paint.setStrokeWidth(gm.L(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(gm.L(3.0f), 0.0f, gm.L(1.0f), 1073741824);
    }

    public static Drawable d(Drawable drawable, int i, long j, boolean z) {
        TLRPC.WallPaper wallPaper = null;
        if (j == Long.MIN_VALUE) {
            return null;
        }
        if (j >= 0) {
            TLRPC.UserFull X1 = oc7.r1(i).X1(j);
            if (X1 != null) {
                wallPaper = X1.wallpaper;
            }
        } else {
            TLRPC.ChatFull M0 = oc7.r1(i).M0(-j);
            if (M0 != null) {
                wallPaper = M0.wallpaper;
            }
        }
        return e(drawable, i, wallPaper, z);
    }

    public static android.graphics.drawable.Drawable e(android.graphics.drawable.Drawable r5, int r6, org.telegram.tgnet.TLRPC.WallPaper r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cl8.e(android.graphics.drawable.Drawable, int, org.telegram.tgnet.TLRPC$WallPaper, boolean):android.graphics.drawable.Drawable");
    }

    public static Drawable f(int i, final tz3 tz3Var, final boolean z) {
        if (tz3Var.l()) {
            cmb.I(tz3.d(z), tz3Var.g(i, z ? 1 : 0), ((sz3) tz3Var.f.get(z ? 1 : 0)).g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray g = tz3Var.g(i, z ? 1 : 0);
        int i2 = cmb.De;
        int i3 = g.get(i2, cmb.w0(null, i2, false));
        int i4 = cmb.Ee;
        int i5 = g.get(i4, cmb.w0(null, i4, false));
        int i6 = cmb.Fe;
        int i7 = g.get(i6, cmb.w0(null, i6, false));
        int i8 = cmb.Ge;
        int i9 = g.get(i8, cmb.w0(null, i8, false));
        final ah7 ah7Var = new ah7();
        ah7Var.g = false;
        ah7Var.r(tz3Var.j(z ? 1 : 0).settings.intensity, ah7Var.u);
        ah7Var.n(true, i3, i5, i7, i9);
        ah7Var.t(0);
        final int f = ah7Var.f();
        tz3Var.n(z ? 1 : 0, new ResultCallback() {
            @Override
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair != null) {
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((osc) pair.second).a;
                    tz3 tz3Var2 = tz3.this;
                    if (longValue == tz3Var2.h(z ? 1 : 0) && bitmap != null) {
                        int i10 = tz3Var2.j(z ? 1 : 0).settings.intensity;
                        ah7 ah7Var2 = ah7Var;
                        ah7Var2.r(i10, bitmap);
                        ah7Var2.s(f);
                        ah7Var2.q(1.0f);
                    }
                }
            }

            @Override
            public final void onError(TLRPC.TL_error tL_error) {
            }

            @Override
            public final void onError(Throwable th) {
            }
        });
        return ah7Var;
    }

    private void setupCollage(g6b g6bVar) {
        ArrayList<g6b> arrayList;
        lqb lqbVar = this.G;
        if (lqbVar != null) {
            if (g6bVar != null) {
                arrayList = g6bVar.T;
            } else {
                arrayList = null;
            }
            lqbVar.setCollage(arrayList);
        }
    }

    private void setupImage(g6b g6bVar) {
        Utilities.g.c(new a18(this, g6bVar, (byte) 22));
    }

    public abstract void a();

    public final void b() {
        float f;
        float f2;
        ndc ndcVar = this.e;
        float f3 = 0.0f;
        if (ndcVar != null) {
            if (!this.P) {
                g6b g6bVar = this.d;
                if (g6bVar != null) {
                    if (!g6bVar.Y) {
                        f2 = g6bVar.P;
                    }
                } else {
                    f2 = 1.0f;
                }
                ndcVar.A0(f2);
            }
            f2 = 0.0f;
            ndcVar.A0(f2);
        }
        ndc ndcVar2 = this.y;
        if (ndcVar2 != null) {
            if (this.P) {
                f = 0.0f;
            } else {
                g6b g6bVar2 = this.d;
                if (g6bVar2 != null) {
                    f = g6bVar2.u0;
                } else {
                    f = 1.0f;
                }
            }
            ndcVar2.A0(f);
        }
        ndc ndcVar3 = this.E;
        if (ndcVar3 != null) {
            if (!this.P) {
                g6b g6bVar3 = this.d;
                if (g6bVar3 != null) {
                    f3 = g6bVar3.G;
                } else {
                    f3 = 1.0f;
                }
            }
            ndcVar3.A0(f3);
        }
        cm2 cm2Var = this.F;
        if (cm2Var != null) {
            cm2Var.setMuted(this.P);
        }
    }

    public final void c(Matrix matrix) {
        g6b g6bVar = this.d;
        if (g6bVar == null) {
            return;
        }
        float[] fArr = this.b0;
        fArr[0] = g6bVar.k0 / 2.0f;
        fArr[1] = g6bVar.l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.c0 = fArr[0];
        this.d0 = fArr[1];
        g6b g6bVar2 = this.d;
        fArr[0] = g6bVar2.k0;
        fArr[1] = g6bVar2.l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.e0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.d0, fArr[0] - this.c0));
        float f = fArr[0];
        float f2 = fArr[1];
        g6b g6bVar3 = this.d;
        fArr[0] = g6bVar3.k0 / 2.0f;
        fArr[1] = g6bVar3.l0;
        matrix.mapPoints(fArr);
        float f3 = fArr[0];
        float f4 = fArr[1];
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z;
        g6b g6bVar;
        ao6 ao6Var;
        if (this.T != null) {
            float f = 0.0f;
            if (this.h0) {
                Path path = new Path();
                RectF rectF = gm.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, gm.L(12.0f), gm.L(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.T;
            if (!(drawable instanceof ah7) || ((ah7) drawable).u != null) {
                f = this.Q.e(false, 1.0f);
            }
            Drawable drawable2 = this.S;
            if (drawable2 != null && f < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - f) * 255.0f));
                g6b.j(canvas, this.S, getWidth(), getHeight());
            }
            this.T.setAlpha((int) (f * 255.0f));
            g6b.j(canvas, this.T, getWidth(), getHeight());
            if (this.h0) {
                canvas.restore();
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.U);
        }
        e43 e43Var = this.B0;
        if (e43Var != null) {
            e43Var.d.b(canvas2, true);
        } else if (this.f0 && this.d != null && !i()) {
            if (this.a == null) {
                z = true;
            } else {
                z = false;
            }
            float d = this.g0.d(z);
            if (this.a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
                canvas2.concat(this.d.n0);
                if (this.d.m0 != null) {
                    canvas2.translate(g6bVar.k0 / 2.0f, g6bVar.l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    g6b g6bVar2 = this.d;
                    int i = g6bVar2.k0;
                    int i2 = g6bVar2.l0;
                    int i3 = g6bVar2.Q;
                    ao6 ao6Var2 = g6bVar2.m0;
                    if (((i3 + ao6Var2.k) / 90) % 2 == 1) {
                        i2 = i;
                        i = i2;
                    }
                    float f2 = ao6Var2.e;
                    float f3 = ao6Var2.f;
                    float f4 = i;
                    float f5 = i2;
                    canvas2.clipRect(((-i) * f2) / 2.0f, ((-i2) * f3) / 2.0f, (f2 * f4) / 2.0f, (f3 * f5) / 2.0f);
                    float f6 = this.d.m0.c;
                    canvas2.scale(f6, f6);
                    ao6 ao6Var3 = this.d.m0;
                    canvas2.translate(ao6Var3.a * f4, ao6Var3.b * f5);
                    canvas2.rotate(this.d.m0.d + ao6Var.k);
                    if (this.d.m0.l) {
                        canvas2.scale(-1.0f, 1.0f);
                    }
                    canvas2.rotate(this.d.Q);
                    g6b g6bVar3 = this.d;
                    canvas2.translate((-g6bVar3.k0) / 2.0f, (-g6bVar3.l0) / 2.0f);
                }
                Paint paint = this.R;
                paint.setAlpha((int) ((1.0f - d) * 255.0f));
                int width = this.a.getWidth();
                int height = this.a.getHeight();
                Rect rect = this.b;
                rect.set(0, 0, width, height);
                g6b g6bVar4 = this.d;
                int i4 = g6bVar4.k0;
                int i5 = g6bVar4.l0;
                Rect rect2 = this.c;
                rect2.set(0, 0, i4, i5);
                canvas2.drawBitmap(this.a, rect, rect2, paint);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cl8.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        g6b g6bVar;
        g6b g6bVar2;
        ncc nccVar = this.n;
        if (view == nccVar && (g6bVar2 = this.d) != null && g6bVar2.u) {
            return false;
        }
        if ((view == nccVar || view == this.r) && (g6bVar = this.d) != null && g6bVar.m0 != null) {
            canvas.save();
            canvas.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
            canvas.concat(this.d.n0);
            g6b g6bVar3 = this.d;
            if (g6bVar3.m0 != null) {
                canvas.translate(g6bVar3.k0 / 2.0f, g6bVar3.l0 / 2.0f);
                canvas.rotate(-this.d.Q);
                g6b g6bVar4 = this.d;
                int i = g6bVar4.k0;
                int i2 = g6bVar4.l0;
                int i3 = g6bVar4.Q;
                ao6 ao6Var = g6bVar4.m0;
                if (((i3 + ao6Var.k) / 90) % 2 == 1) {
                    i2 = i;
                    i = i2;
                }
                float f = ao6Var.e;
                float f2 = ao6Var.f;
                canvas.clipRect(((-i) * f) / 2.0f, ((-i2) * f2) / 2.0f, (i * f) / 2.0f, (i2 * f2) / 2.0f);
                canvas.rotate(this.d.Q);
                g6b g6bVar5 = this.d;
                canvas.translate((-g6bVar5.k0) / 2.0f, (-g6bVar5.l0) / 2.0f);
            }
            canvas.concat(this.i0);
            canvas.scale(1.0f / (getWidth() / this.d.i0), 1.0f / (getHeight() / this.d.j0));
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    public final void g(qac qacVar, View... viewArr) {
        ncc nccVar;
        int L = (int) (gm.L(26.0f) * gm.p);
        int L2 = (int) (gm.L(30.33f) * gm.p);
        int L3 = (int) (gm.L(4.0f) * gm.p);
        ?? r5 = new Bitmap[viewArr.length];
        for (int i = 0; i < viewArr.length; i++) {
            View view = viewArr[i];
            if (view != null && view.getWidth() >= 0 && viewArr[i].getHeight() > 0) {
                View view2 = viewArr[i];
                if (view2 == this && (nccVar = this.n) != null) {
                    r5[i] = nccVar.getBitmap();
                } else if (view2 instanceof TextureView) {
                    r5[i] = ((TextureView) view2).getBitmap();
                } else if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0) {
                    r5[i] = Bitmap.createBitmap(L, L2, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(r5[i]);
                    canvas.save();
                    float max = Math.max(L / viewArr[i].getWidth(), L2 / viewArr[i].getHeight());
                    canvas.scale(max, max);
                    viewArr[i].draw(canvas);
                    canvas.restore();
                }
            }
        }
        Utilities.e.c(new zt2(L, L2, L3, r5, qacVar, (byte) 1));
    }

    public int getContentHeight() {
        g6b g6bVar = this.d;
        if (g6bVar == null) {
            return 1;
        }
        return g6bVar.l0;
    }

    public int getContentWidth() {
        g6b g6bVar = this.d;
        if (g6bVar == null) {
            return 1;
        }
        return g6bVar.k0;
    }

    public long getCurrentPosition() {
        ndc ndcVar = this.e;
        if (ndcVar != null) {
            return ndcVar.S();
        }
        ndc ndcVar2 = this.y;
        if (ndcVar2 != null) {
            return ndcVar2.S();
        }
        ndc ndcVar3 = this.E;
        if (ndcVar3 != null) {
            return ndcVar3.S();
        }
        return 0L;
    }

    public long getDuration() {
        g6b g6bVar = this.d;
        if (g6bVar != null) {
            double d = g6bVar.i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        ndc ndcVar = this.e;
        if (ndcVar != null && ndcVar.U() != -9223372036854775807L) {
            return this.e.U();
        }
        return 1L;
    }

    public int getOrientation() {
        g6b g6bVar = this.d;
        if (g6bVar == null) {
            return 0;
        }
        return g6bVar.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        if (this.d == null) {
            return new Pair<>(1080, 1920);
        }
        return new Pair<>(Integer.valueOf(this.d.i0), Integer.valueOf(this.d.j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.a;
    }

    public ncc getTextureView() {
        return this.n;
    }

    public abstract void h();

    public final boolean i() {
        g6b g6bVar;
        if (this.F != null && (g6bVar = this.d) != null && g6bVar.v()) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        return !this.A0.contains(-9982);
    }

    public final void k(defpackage.g6b r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cl8.k(g6b):void");
    }

    public final void l(g6b g6bVar) {
        this.d = g6bVar;
        if (g6bVar == null) {
            setupImage(null);
            u(null);
            this.U.setShader(null);
            q(null, false);
            s(null, null, false);
            return;
        }
        if (g6bVar.K) {
            setupImage(g6bVar);
            if (g6bVar.A0 == 0 && g6bVar.B0 == 0) {
                g6bVar.y(new q78((k9b) this, (byte) 25));
            } else {
                r();
            }
        } else {
            setupImage(g6bVar);
            r();
        }
        a();
        u(g6bVar);
        q(g6bVar, false);
        s(g6bVar, null, false);
    }

    public final void m(long j) {
        ndc ndcVar = this.e;
        if (ndcVar != null) {
            ndcVar.p0(j, false);
        } else if (i()) {
            this.F.m(j, false);
        } else {
            ndc ndcVar2 = this.y;
            if (ndcVar2 != null) {
                ndcVar2.p0(j, false);
            } else {
                ndc ndcVar3 = this.E;
                if (ndcVar3 != null) {
                    ndcVar3.p0(j, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(g6b g6bVar, b7b b7bVar, long j) {
        this.d = g6bVar;
        if (g6bVar == null) {
            t(null, b7bVar, j);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.U.setShader(null);
            q(null, false);
            s(null, null, false);
            return;
        }
        if (g6bVar.v()) {
            setupImage(null);
            t(null, b7bVar, j);
            setupCollage(g6bVar);
        } else if (g6bVar.K) {
            setupImage(g6bVar);
            setupCollage(null);
            t(g6bVar, b7bVar, j);
            if (g6bVar.A0 == 0 && g6bVar.B0 == 0) {
                g6bVar.y(new bl8(this, (byte) 0));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, b7bVar, 0L);
            setupImage(g6bVar);
            r();
        }
        a();
        u(g6bVar);
        q(g6bVar, false);
        s(g6bVar, null, false);
    }

    public final void o(TextureView textureView, n78 n78Var) {
        TextureView textureView2 = this.r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.r = null;
        }
        this.s = n78Var;
        this.r = textureView;
        if (n78Var != null) {
            int i = this.V;
            int i2 = this.W;
            uf4 uf4Var = n78Var.m0;
            if (uf4Var != null) {
                uf4Var.f(i, i2);
            } else {
                n78Var.K0 = i;
                n78Var.L0 = i2;
            }
        }
        TextureView textureView3 = this.r;
        if (textureView3 != null) {
            addView(textureView3);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.l0) {
            v(motionEvent);
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void p(k47 k47Var) {
        long j;
        int maxCount;
        g6b g6bVar = this.d;
        if (g6bVar != null) {
            g6bVar.j = true;
            float f = 1.0f;
            if (k47Var != null) {
                int i = k47Var.K1;
                if (k47Var.k != null) {
                    TLRPC.Document F0 = k47Var.F0();
                    if (F0 != null && F0.id != 0) {
                        this.d.z = new TLRPC.TL_inputDocument();
                        TLRPC.InputDocument inputDocument = this.d.z;
                        inputDocument.id = F0.id;
                        inputDocument.file_reference = F0.file_reference;
                        inputDocument.access_hash = F0.access_hash;
                    }
                    int i2 = 0;
                    if (!TextUtils.isEmpty(k47Var.k.attachPath)) {
                        this.d.y = k47Var.k.attachPath;
                    } else {
                        bc4.G(i);
                        File J = bc4.J(F0, null, false, true);
                        if (J == null || !J.exists()) {
                            bc4.G(i);
                            J = bc4.J(F0, null, true, true);
                            if (J != null && J.exists()) {
                                this.d.y = J.getAbsolutePath();
                            } else {
                                g6b g6bVar2 = this.d;
                                g6bVar2.y = null;
                                g6bVar2.z = null;
                                g6bVar2.A = null;
                                g6bVar2.B = null;
                                g6bVar2.D = 0L;
                                g6bVar2.C = 0L;
                                g6bVar2.E = 0.0f;
                                g6bVar2.F = 1.0f;
                                return;
                            }
                        }
                        this.d.y = J.getAbsolutePath();
                    }
                    g6b g6bVar3 = this.d;
                    g6bVar3.A = null;
                    g6bVar3.B = null;
                    if (F0 != null) {
                        ArrayList<TLRPC.DocumentAttribute> arrayList = F0.attributes;
                        int size = arrayList.size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute = arrayList.get(i3);
                            i3++;
                            TLRPC.DocumentAttribute documentAttribute2 = documentAttribute;
                            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                                this.d.A = documentAttribute2.performer;
                                if (!TextUtils.isEmpty(documentAttribute2.title)) {
                                    this.d.B = documentAttribute2.title;
                                }
                                this.d.C = (long) (documentAttribute2.duration * 1000.0d);
                            } else if (documentAttribute2 instanceof TLRPC.TL_documentAttributeFilename) {
                                this.d.B = documentAttribute2.file_name;
                            }
                        }
                    }
                    g6b g6bVar4 = this.d;
                    g6bVar4.D = 0L;
                    if (g6bVar4.K) {
                        g6bVar4.D = g6bVar4.Z * ((float) getDuration());
                    }
                    this.d.E = 0.0f;
                    if (i()) {
                        ArrayList arrayList2 = this.F.h;
                        int size2 = arrayList2.size();
                        while (i2 < size2) {
                            Object obj = arrayList2.get(i2);
                            i2++;
                            g6b g6bVar5 = ((bm2) obj).n;
                            if (g6bVar5 != null && g6bVar5.K) {
                                j = this.F.getDuration();
                                break;
                            }
                        }
                    }
                    g6b g6bVar6 = this.d;
                    if (g6bVar6.K) {
                        j = getDuration();
                    } else {
                        j = g6bVar6.C;
                    }
                    lqb lqbVar = this.G;
                    if (lqbVar == null) {
                        maxCount = 1;
                    } else {
                        maxCount = lqbVar.getMaxCount();
                    }
                    g6b g6bVar7 = this.d;
                    if (g6bVar7.C != 0) {
                        f = Math.min(1.0f, ((float) Math.min(j, maxCount * 59000)) / ((float) this.d.C));
                    }
                    g6bVar7.F = f;
                }
            }
            g6bVar.y = null;
            g6bVar.z = null;
            g6bVar.A = null;
            g6bVar.B = null;
            g6bVar.D = 0L;
            g6bVar.C = 0L;
            g6bVar.E = 0.0f;
            g6bVar.F = 1.0f;
        }
        q(this.d, true);
    }

    public final void q(g6b g6bVar, boolean z) {
        boolean z2;
        String str;
        float f;
        float f2;
        float f3;
        ndc ndcVar = this.E;
        if (ndcVar != null) {
            ndcVar.f0();
            this.E.l0();
            this.E = null;
        }
        if (g6bVar != null) {
            lqb lqbVar = this.G;
            boolean z3 = false;
            if (lqbVar != null) {
                String str2 = g6bVar.y;
                String str3 = g6bVar.A;
                String str4 = g6bVar.B;
                long j = g6bVar.C;
                long j2 = g6bVar.D;
                float f4 = g6bVar.E;
                float f5 = g6bVar.F;
                float f6 = g6bVar.G;
                if (!TextUtils.equals(lqbVar.P, str2)) {
                    eqb eqbVar = lqbVar.b0;
                    if (eqbVar != null) {
                        eqbVar.a();
                        lqbVar.b0 = null;
                        lqbVar.V = false;
                    }
                    lqbVar.P = str2;
                    lqbVar.p();
                }
                lqbVar.P = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                lqbVar.O = !isEmpty;
                if (isEmpty) {
                    lqbVar.Q = false;
                    str3 = null;
                    str4 = null;
                }
                if (TextUtils.isEmpty(str3)) {
                    str = null;
                } else {
                    str = str3;
                }
                if (TextUtils.isEmpty(str4)) {
                    str4 = null;
                }
                if (lqbVar.O) {
                    lqbVar.S = j;
                    lqbVar.R = j2 - (((float) j) * f4);
                    lqbVar.T = f4;
                    lqbVar.U = f5;
                    lqbVar.W = f6;
                    float f7 = 0.0f;
                    if (str != null) {
                        StaticLayout staticLayout = new StaticLayout(str, lqbVar.M0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        lqbVar.N0 = staticLayout;
                        if (staticLayout.getLineCount() > 0) {
                            f2 = lqbVar.N0.getLineWidth(0);
                        } else {
                            f2 = 0.0f;
                        }
                        lqbVar.O0 = f2;
                        if (lqbVar.N0.getLineCount() > 0) {
                            f3 = lqbVar.N0.getLineLeft(0);
                        } else {
                            f3 = 0.0f;
                        }
                        lqbVar.P0 = f3;
                    } else {
                        lqbVar.O0 = 0.0f;
                        lqbVar.N0 = null;
                    }
                    if (str4 != null) {
                        StaticLayout staticLayout2 = new StaticLayout(str4, lqbVar.Q0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        lqbVar.R0 = staticLayout2;
                        if (staticLayout2.getLineCount() > 0) {
                            f = lqbVar.R0.getLineWidth(0);
                        } else {
                            f = 0.0f;
                        }
                        lqbVar.S0 = f;
                        if (lqbVar.R0.getLineCount() > 0) {
                            f7 = lqbVar.R0.getLineLeft(0);
                        }
                        lqbVar.T0 = f7;
                    } else {
                        lqbVar.S0 = 0.0f;
                        lqbVar.R0 = null;
                    }
                }
                if (!z) {
                    z2 = true;
                    lqbVar.f0.f(lqbVar.O, true);
                } else {
                    z2 = true;
                }
                lqbVar.invalidate();
            } else {
                z2 = true;
            }
            if (g6bVar.y != null) {
                ndc ndcVar2 = new ndc();
                this.E = ndcVar2;
                ndcVar2.E = z2;
                ndcVar2.K = new ai4(this, (byte) 22);
                ndcVar2.i0(Uri.fromFile(new File(g6bVar.y)), "other");
                b();
                if (this.e != null && getDuration() > 0) {
                    long duration = g6bVar.Z * ((float) getDuration());
                    this.e.p0(duration, false);
                    this.G.setProgress(duration);
                }
                z2 = true;
                w(true);
            }
            v9b v9bVar = ((k9b) this).D0;
            z8b z8bVar = v9bVar.w1;
            if (z8bVar != null) {
                g6b g6bVar2 = v9bVar.L1;
                if (g6bVar2 != null && g6bVar2.y != null) {
                    z3 = z2;
                }
                z8bVar.setHasAudio(z3);
            }
        }
    }

    public final void r() {
        int i;
        if (this.d == null) {
            return;
        }
        if (getMeasuredHeight() > 0) {
            i = getMeasuredHeight();
        } else {
            i = gm.q.y;
        }
        g6b g6bVar = this.d;
        int i2 = g6bVar.A0;
        Paint paint = this.U;
        if (i2 != 0 && g6bVar.B0 != 0) {
            float f = i;
            g6b g6bVar2 = this.d;
            int i3 = g6bVar2.A0;
            this.V = i3;
            int i4 = g6bVar2.B0;
            this.W = i4;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f, new int[]{i3, i4}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            ncc nccVar = this.n;
            if (nccVar != null) {
                int i5 = this.V;
                int i6 = this.W;
                uf4 uf4Var = nccVar.b;
                if (uf4Var == null) {
                    nccVar.n = i5;
                    nccVar.r = i6;
                } else {
                    uf4Var.f(i5, i6);
                }
            }
            n78 n78Var = this.s;
            if (n78Var != null) {
                int i7 = this.V;
                int i8 = this.W;
                uf4 uf4Var2 = n78Var.m0;
                if (uf4Var2 != null) {
                    uf4Var2.f(i7, i8);
                } else {
                    n78Var.K0 = i7;
                    n78Var.L0 = i8;
                }
            }
        } else {
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                new jr0(this, i, (byte) 3).a(lge.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        }
        invalidate();
    }

    public final void s(g6b g6bVar, ao9 ao9Var, boolean z) {
        ndc ndcVar;
        if (g6bVar != null && g6bVar.o0 != null) {
            ndc ndcVar2 = this.y;
            if (ndcVar2 != null) {
                ndcVar2.l0();
                this.y = null;
            }
            ndc ndcVar3 = new ndc();
            this.y = ndcVar3;
            ndcVar3.E = true;
            ndcVar3.K = new k44(this, (byte) 28);
            this.y.i0(Uri.fromFile(g6bVar.o0), "other");
            b();
            this.x = ao9Var;
            if (ao9Var != null && (ndcVar = this.y) != null) {
                ndcVar.z0(ao9Var.w0);
            }
            this.G.n(g6bVar.o0.getAbsolutePath(), g6bVar.q0, g6bVar.r0, g6bVar.s0, g6bVar.t0, g6bVar.u0, z);
            y(true);
            return;
        }
        ndc ndcVar4 = this.y;
        if (ndcVar4 != null) {
            ndcVar4.f0();
            this.y.l0();
            this.y = null;
        }
        lqb lqbVar = this.G;
        if (lqbVar != null) {
            lqbVar.setRoundNull(z);
        }
        this.x = null;
        gm.r(this.L);
    }

    public void set(g6b g6bVar) {
        n(g6bVar, null, 0L);
    }

    public void setAllowCropping(boolean z) {
        this.l0 = z;
    }

    public void setCollageView(cm2 cm2Var) {
        this.F = cm2Var;
    }

    public void setCropEditorDrawing(e43 e43Var) {
        if (this.B0 != e43Var) {
            this.B0 = e43Var;
            invalidate();
        }
    }

    public void setDraw(boolean z) {
        this.f0 = z;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.z0 = runnable;
    }

    public void setVideoTimelineView(lqb lqbVar) {
        this.G = lqbVar;
        if (lqbVar != null) {
            lqbVar.setDelegate(new fk3(this));
        }
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            set(null);
        }
    }

    public final void t(g6b g6bVar, b7b b7bVar, long j) {
        sm0 sm0Var;
        long j2;
        boolean z;
        ArrayList arrayList;
        xm0 xm0Var;
        float f = 0.0f;
        if (g6bVar != null && !g6bVar.v()) {
            ndc ndcVar = this.e;
            if (ndcVar != null) {
                ndcVar.l0();
                this.e = null;
            }
            ndc ndcVar2 = new ndc();
            this.e = ndcVar2;
            ndcVar2.E = true;
            ndcVar2.K = new in3((ViewGroup) this, (Object) g6bVar, (Object) new Runnable[]{b7bVar}, (byte) 24);
            ncc nccVar = this.n;
            if (nccVar != null) {
                nccVar.clearAnimation();
                ncc nccVar2 = this.n;
                uf4 uf4Var = nccVar2.b;
                if (uf4Var != null) {
                    uf4Var.postRunnable(new sf4(uf4Var, (byte) 0));
                }
                nccVar2.a = null;
                removeView(this.n);
                this.n = null;
            }
            this.n = new ncc(this.e, getContext());
            this.H.e();
            ncc nccVar3 = this.n;
            if (g6bVar.u) {
                sm0Var = null;
            } else {
                sm0Var = this.H;
            }
            nccVar3.s = sm0Var;
            uf4 uf4Var2 = nccVar3.b;
            if (uf4Var2 != null && (xm0Var = uf4Var2.J) != null) {
                sm0 sm0Var2 = xm0Var.t;
                if (sm0Var2 != null && sm0Var2.m != null) {
                    sm0Var2.m = null;
                }
                xm0Var.t = sm0Var;
                if (sm0Var != null && sm0Var.m != xm0Var) {
                    sm0Var.m = xm0Var;
                    sm0Var.d();
                }
            }
            this.n.setOpaque(false);
            a();
            n10 n10Var = this.I;
            if (n10Var != null && n10Var.g) {
                n10Var.a(this.n);
            } else {
                ncc nccVar4 = this.n;
                if (b7bVar != null) {
                    f = 1.0f;
                }
                nccVar4.setAlpha(f);
                addView(this.n, qoe.e(-2, -2, 51));
            }
            ci7 ci7Var = new ci7(this, (byte) 17);
            f6b f6bVar = g6bVar.d1;
            if (f6bVar != null) {
                ci7Var.a(f6bVar);
            } else if (g6bVar.K && Build.VERSION.SDK_INT >= 24) {
                Utilities.e.c(new b6b(g6bVar, ci7Var, (byte) 0));
            } else {
                ?? obj = new Object();
                g6bVar.d1 = obj;
                ci7Var.a(obj);
            }
            File file = g6bVar.Z0;
            if (file == null) {
                file = g6bVar.L;
            }
            this.e.i0(Uri.fromFile(file), "other");
            this.e.t0(this.A0.isEmpty());
            this.e.r0(true);
            if (g6bVar.h) {
                j2 = (g6bVar.Z * ((float) g6bVar.h0)) + ((float) j);
            } else {
                j2 = j;
            }
            int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i > 0) {
                this.e.p0(j2, false);
            }
            b();
            w(true);
            if (g6bVar.u && (arrayList = g6bVar.v) != null && arrayList.size() == 1 && ((k47) g6bVar.v.get(0)).D == 5) {
                z = true;
            } else {
                z = false;
            }
            lqb lqbVar = this.G;
            File file2 = g6bVar.Z0;
            if (file2 == null) {
                file2 = g6bVar.L;
            }
            lqbVar.o(z, file2.getAbsolutePath(), getDuration(), g6bVar.P);
            this.G.setVideoLeft(g6bVar.Z);
            this.G.setVideoRight(g6bVar.a0);
            lqb lqbVar2 = this.G;
            if (lqbVar2 != null && i > 0) {
                lqbVar2.setProgress(j2);
                return;
            }
            return;
        }
        ndc ndcVar3 = this.e;
        if (ndcVar3 != null) {
            ndcVar3.f0();
            this.e.l0();
            this.e = null;
        }
        n10 n10Var2 = this.I;
        if (n10Var2 != null && n10Var2.g) {
            n10Var2.a(null);
        } else {
            ncc nccVar5 = this.n;
            if (nccVar5 != null) {
                nccVar5.clearAnimation();
                this.n.animate().alpha(0.0f).withEndAction(new bl8(this, (byte) 5)).start();
            }
        }
        lqb lqbVar3 = this.G;
        if (lqbVar3 != null) {
            lqbVar3.o(false, null, 1L, 0.0f);
        }
        gm.r(this.L);
        if (b7bVar != null) {
            gm.c3(b7bVar);
        }
    }

    public final void u(g6b g6bVar) {
        Drawable drawable = this.T;
        this.S = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (g6bVar == null) {
            this.T = null;
            return;
        }
        long j = g6bVar.z0;
        if (j != Long.MIN_VALUE) {
            Drawable d = d(this.T, g6bVar.a, j, g6bVar.y0);
            g6bVar.x0 = d;
            this.T = d;
            if (this.S != d) {
                this.S = null;
            }
            if (d != null) {
                d.setCallback(this);
            }
            sm0 sm0Var = this.H;
            if (sm0Var != null) {
                Drawable drawable2 = this.T;
                if (drawable2 != null) {
                    if (drawable2 instanceof BitmapDrawable) {
                        sm0Var.f(((BitmapDrawable) drawable2).getBitmap(), false);
                    } else {
                        int intrinsicWidth = drawable2.getIntrinsicWidth();
                        int intrinsicHeight = this.T.getIntrinsicHeight();
                        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                            intrinsicWidth = 1080;
                            intrinsicHeight = 1920;
                        }
                        float f = intrinsicWidth;
                        float f2 = intrinsicHeight;
                        float max = Math.max(100.0f / f, 100.0f / f2);
                        if (max > 1.0f) {
                            intrinsicWidth = (int) (f * max);
                            intrinsicHeight = (int) (f2 * max);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                        this.T.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                        this.T.draw(new Canvas(createBitmap));
                        sm0Var.f(createBitmap, true);
                    }
                } else {
                    sm0Var.f(null, false);
                }
            }
            invalidate();
            return;
        }
        this.T = null;
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z;
        double d;
        float f;
        g6b g6bVar;
        PointF pointF;
        boolean z2;
        boolean z3;
        if (this.l0) {
            if (motionEvent.getPointerCount() > 1) {
                z = true;
            } else {
                z = false;
            }
            PointF pointF2 = this.n0;
            if (z) {
                pointF2.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                pointF2.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                f = oqe.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                d = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
            } else {
                pointF2.x = motionEvent.getX(0);
                pointF2.y = motionEvent.getY(0);
                d = 0.0d;
                f = 0.0f;
            }
            boolean z4 = this.q0;
            PointF pointF3 = this.m0;
            if (z4 != z) {
                pointF3.x = pointF2.x;
                pointF3.y = pointF2.y;
                this.o0 = f;
                this.p0 = d;
                this.q0 = z;
            }
            if (this.d != null) {
                float width = g6bVar.i0 / getWidth();
                int actionMasked = motionEvent.getActionMasked();
                Matrix matrix = this.t0;
                if (actionMasked == 0) {
                    this.v0 = 0.0f;
                    this.w0 = false;
                    invalidate();
                    this.x0 = true;
                    matrix.set(this.d.n0);
                }
                if (motionEvent.getActionMasked() == 2 && this.x0 && this.d != null) {
                    float f2 = pointF2.x * width;
                    float f3 = pointF2.y * width;
                    float f4 = pointF3.x * width;
                    float f5 = pointF3.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f6 = this.o0;
                        if (f6 != 0.0f) {
                            float f7 = f / f6;
                            matrix.postScale(f7, f7, f2, f3);
                        }
                        pointF = pointF2;
                        float degrees = (float) Math.toDegrees(d - this.p0);
                        float f8 = this.v0 + degrees;
                        this.v0 = f8;
                        if (!this.s0) {
                            if (Math.abs(f8) > 20.0f) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            this.s0 = z2;
                            if (!z2) {
                                c(matrix);
                                if ((Math.round(this.e0 / 90.0f) * 90.0f) - this.e0 > 20.0f) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                this.s0 = z3;
                            }
                            if (!this.w0) {
                                gm.W3(this);
                                this.w0 = true;
                            }
                        }
                        if (this.s0) {
                            matrix.postRotate(degrees, f2, f3);
                        }
                        this.r0 = true;
                    } else {
                        pointF = pointF2;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.r0) {
                        matrix.postTranslate(f2 - f4, f3 - f5);
                    }
                    Matrix matrix2 = this.u0;
                    matrix2.set(matrix);
                    Matrix matrix3 = this.a0;
                    matrix3.set(matrix);
                    c(matrix3);
                    float round = (Math.round(this.e0 / 90.0f) * 90.0f) - this.e0;
                    if (this.s0) {
                        if (Math.abs(round) < 3.5f) {
                            matrix2.postRotate(round, this.c0, this.d0);
                            if (!this.w0) {
                                gm.W3(this);
                                this.w0 = true;
                            }
                        } else {
                            this.w0 = false;
                        }
                    }
                    this.d.n0.set(matrix2);
                    this.d.j = true;
                    a();
                    invalidate();
                } else {
                    pointF = pointF2;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getPointerCount() <= 1) {
                        this.r0 = false;
                        v9b v9bVar = ((k9b) this).D0;
                        v9bVar.p1.a(true, false, v9bVar.j0);
                        v9bVar.p1.b(v9bVar.d1.getText());
                    }
                    this.x0 = false;
                    this.s0 = false;
                    this.v0 = 0.0f;
                    this.w0 = false;
                    invalidate();
                }
                PointF pointF4 = pointF;
                pointF3.x = pointF4.x;
                pointF3.y = pointF4.y;
                this.o0 = f;
                this.p0 = d;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.T != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void w(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cl8.w(boolean):void");
    }

    public final void x(int i, boolean z) {
        HashSet hashSet = this.A0;
        if (z) {
            hashSet.add(Integer.valueOf(i));
        } else {
            hashSet.remove(Integer.valueOf(i));
        }
        ndc ndcVar = this.e;
        if (ndcVar != null) {
            ndcVar.t0(hashSet.isEmpty());
        }
        cm2 cm2Var = this.F;
        if (cm2Var != null) {
            cm2Var.setPlaying(hashSet.isEmpty());
        }
        w(true);
        y(true);
    }

    public final void y(boolean z) {
        long S;
        boolean c0;
        float f;
        boolean z2;
        int i;
        if (this.y != null && this.d != null) {
            boolean z3 = true;
            if (this.e == null && !i()) {
                this.y.t0(this.A0.isEmpty());
                this.y.r0(true);
                ao9 ao9Var = this.x;
                if (ao9Var != null && !ao9Var.D0) {
                    ao9Var.D0 = true;
                    ao9Var.E0.f(true, true);
                    ao9Var.invalidate();
                }
                long S2 = this.y.S();
                if (z && this.y.U() != -9223372036854775807L) {
                    float U = ((float) S2) / ((float) this.y.U());
                    g6b g6bVar = this.d;
                    if ((U < g6bVar.s0 || U > g6bVar.t0) && System.currentTimeMillis() - this.K > 500) {
                        this.K = System.currentTimeMillis();
                        this.y.p0(-this.d.r0, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i()) {
                S = this.F.getPositionWithOffset();
                c0 = this.F.r0;
            } else {
                S = this.e.S();
                c0 = this.e.c0();
            }
            g6b g6bVar2 = this.d;
            float f2 = g6bVar2.t0;
            float f3 = g6bVar2.s0;
            long j = (f2 - f3) * ((float) g6bVar2.q0);
            long j2 = g6bVar2.r0;
            if (S >= j2 && S <= j + j2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!c0 || !z2) {
                z3 = false;
            }
            long j3 = (S - j2) + (f3 * f);
            ao9 ao9Var2 = this.x;
            if (ao9Var2 != null && ao9Var2.D0 != z2) {
                ao9Var2.D0 = z2;
                ao9Var2.invalidate();
            }
            if (this.y.c0() != z3) {
                this.y.t0(z3);
                this.y.p0(j3, false);
            } else if (z) {
                long abs = Math.abs(this.y.S() - j3);
                if (i()) {
                    i = 300;
                } else {
                    i = 120;
                }
                if (abs > i) {
                    this.y.p0(j3, false);
                }
            }
        }
    }
}
