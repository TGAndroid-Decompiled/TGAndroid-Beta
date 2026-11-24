package defpackage;

import android.content.Context;
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
public abstract class zi8 extends FrameLayout {
    public static final int C0 = 0;
    public final HashSet A0;
    public t23 B0;
    public lbc E;
    public qk2 F;
    public kob G;
    public final sl0 H;
    public final n00 I;
    public long J;
    public long K;
    public final yi8 L;
    public final yi8 M;
    public final yi8 N;
    public d6b O;
    public boolean P;
    public final lm Q;
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
    public f4b d;
    public float d0;
    public lbc e;
    public float e0;
    public int f;
    public boolean f0;
    public final lm g0;
    public int h;
    public boolean h0;
    public final Matrix i0;
    public final Matrix j0;
    public final Matrix k0;
    public boolean l0;
    public final PointF m0;
    public kac n;
    public final PointF n0;
    public float o0;
    public double p0;
    public boolean q0;
    public TextureView r;
    public boolean r0;
    public l58 s;
    public boolean s0;
    public final Matrix t0;
    public final Matrix u0;
    public float v0;
    public d6b w;
    public boolean w0;
    public am9 x;
    public boolean x0;
    public lbc y;
    public long y0;
    public Runnable z0;

    public zi8(Context context, sl0 sl0Var, n00 n00Var) {
        super(context);
        this.b = new Rect();
        this.c = new Rect();
        Paint paint = new Paint(1);
        new yi8(this, (byte) 2);
        this.L = new yi8(this, (byte) 3);
        this.M = new yi8(this, (byte) 4);
        this.N = new yi8(this, (byte) 5);
        this.Q = new lm(this, 0L, 350L, s33.h);
        this.R = new Paint(7);
        this.U = new Paint(1);
        this.a0 = new Matrix();
        this.b0 = new float[2];
        this.f0 = true;
        this.g0 = new lm(this, 0L, 320L, s33.g);
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
        this.H = sl0Var;
        this.I = n00Var;
        paint.setStrokeWidth(gl.L(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(gl.L(3.0f), 0.0f, gl.L(1.0f), 1073741824);
    }

    public static Drawable d(Drawable drawable, int i, long j, boolean z) {
        TLRPC.WallPaper wallPaper = null;
        if (j == Long.MIN_VALUE) {
            return null;
        }
        if (j >= 0) {
            TLRPC.UserFull W1 = na7.q1(i).W1(j);
            if (W1 != null) {
                wallPaper = W1.wallpaper;
            }
        } else {
            TLRPC.ChatFull L0 = na7.q1(i).L0(-j);
            if (L0 != null) {
                wallPaper = L0.wallpaper;
            }
        }
        return e(drawable, i, wallPaper, z);
    }

    public static android.graphics.drawable.Drawable e(android.graphics.drawable.Drawable r5, int r6, org.telegram.tgnet.TLRPC.WallPaper r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zi8.e(android.graphics.drawable.Drawable, int, org.telegram.tgnet.TLRPC$WallPaper, boolean):android.graphics.drawable.Drawable");
    }

    public static Drawable f(int i, final jy3 jy3Var, final boolean z) {
        if (jy3Var.l()) {
            bkb.I(jy3.d(z), jy3Var.g(i, z ? 1 : 0), ((iy3) jy3Var.f.get(z ? 1 : 0)).g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray g = jy3Var.g(i, z ? 1 : 0);
        int i2 = bkb.De;
        int i3 = g.get(i2, bkb.w0(null, i2, false));
        int i4 = bkb.Ee;
        int i5 = g.get(i4, bkb.w0(null, i4, false));
        int i6 = bkb.Fe;
        int i7 = g.get(i6, bkb.w0(null, i6, false));
        int i8 = bkb.Ge;
        int i9 = g.get(i8, bkb.w0(null, i8, false));
        final ye7 ye7Var = new ye7();
        ye7Var.g = false;
        ye7Var.r(jy3Var.j(z ? 1 : 0).settings.intensity, ye7Var.u);
        ye7Var.n(true, i3, i5, i7, i9);
        ye7Var.t(0);
        final int f = ye7Var.f();
        jy3Var.n(z ? 1 : 0, new ResultCallback() {
            @Override
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair != null) {
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((mqc) pair.second).a;
                    jy3 jy3Var2 = jy3.this;
                    if (longValue == jy3Var2.h(z ? 1 : 0) && bitmap != null) {
                        int i10 = jy3Var2.j(z ? 1 : 0).settings.intensity;
                        ye7 ye7Var2 = ye7Var;
                        ye7Var2.r(i10, bitmap);
                        ye7Var2.s(f);
                        ye7Var2.q(1.0f);
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
        return ye7Var;
    }

    private void setupCollage(f4b f4bVar) {
        ArrayList<f4b> arrayList;
        kob kobVar = this.G;
        if (kobVar != null) {
            if (f4bVar != null) {
                arrayList = f4bVar.T;
            } else {
                arrayList = null;
            }
            kobVar.setCollage(arrayList);
        }
    }

    private void setupImage(f4b f4bVar) {
        Utilities.g.c(new h18(this, f4bVar, (byte) 21));
    }

    public abstract void a();

    public final void b() {
        float f;
        float f2;
        lbc lbcVar = this.e;
        float f3 = 0.0f;
        if (lbcVar != null) {
            if (!this.P) {
                f4b f4bVar = this.d;
                if (f4bVar != null) {
                    if (!f4bVar.Y) {
                        f2 = f4bVar.P;
                    }
                } else {
                    f2 = 1.0f;
                }
                lbcVar.A0(f2);
            }
            f2 = 0.0f;
            lbcVar.A0(f2);
        }
        lbc lbcVar2 = this.y;
        if (lbcVar2 != null) {
            if (this.P) {
                f = 0.0f;
            } else {
                f4b f4bVar2 = this.d;
                if (f4bVar2 != null) {
                    f = f4bVar2.u0;
                } else {
                    f = 1.0f;
                }
            }
            lbcVar2.A0(f);
        }
        lbc lbcVar3 = this.E;
        if (lbcVar3 != null) {
            if (!this.P) {
                f4b f4bVar3 = this.d;
                if (f4bVar3 != null) {
                    f3 = f4bVar3.G;
                } else {
                    f3 = 1.0f;
                }
            }
            lbcVar3.A0(f3);
        }
        qk2 qk2Var = this.F;
        if (qk2Var != null) {
            qk2Var.setMuted(this.P);
        }
    }

    public final void c(Matrix matrix) {
        f4b f4bVar = this.d;
        if (f4bVar == null) {
            return;
        }
        float[] fArr = this.b0;
        fArr[0] = f4bVar.k0 / 2.0f;
        fArr[1] = f4bVar.l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.c0 = fArr[0];
        this.d0 = fArr[1];
        f4b f4bVar2 = this.d;
        fArr[0] = f4bVar2.k0;
        fArr[1] = f4bVar2.l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.e0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.d0, fArr[0] - this.c0));
        float f = fArr[0];
        float f2 = fArr[1];
        f4b f4bVar3 = this.d;
        fArr[0] = f4bVar3.k0 / 2.0f;
        fArr[1] = f4bVar3.l0;
        matrix.mapPoints(fArr);
        float f3 = fArr[0];
        float f4 = fArr[1];
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z;
        f4b f4bVar;
        zl6 zl6Var;
        if (this.T != null) {
            float f = 0.0f;
            if (this.h0) {
                Path path = new Path();
                RectF rectF = gl.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, gl.L(12.0f), gl.L(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.T;
            if (!(drawable instanceof ye7) || ((ye7) drawable).u != null) {
                f = this.Q.e(false, 1.0f);
            }
            Drawable drawable2 = this.S;
            if (drawable2 != null && f < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - f) * 255.0f));
                f4b.j(canvas, this.S, getWidth(), getHeight());
            }
            this.T.setAlpha((int) (f * 255.0f));
            f4b.j(canvas, this.T, getWidth(), getHeight());
            if (this.h0) {
                canvas.restore();
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.U);
        }
        t23 t23Var = this.B0;
        if (t23Var != null) {
            t23Var.d.b(canvas2, true);
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
                    canvas2.translate(f4bVar.k0 / 2.0f, f4bVar.l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    f4b f4bVar2 = this.d;
                    int i = f4bVar2.k0;
                    int i2 = f4bVar2.l0;
                    int i3 = f4bVar2.Q;
                    zl6 zl6Var2 = f4bVar2.m0;
                    if (((i3 + zl6Var2.k) / 90) % 2 == 1) {
                        i2 = i;
                        i = i2;
                    }
                    float f2 = zl6Var2.e;
                    float f3 = zl6Var2.f;
                    float f4 = i;
                    float f5 = i2;
                    canvas2.clipRect(((-i) * f2) / 2.0f, ((-i2) * f3) / 2.0f, (f2 * f4) / 2.0f, (f3 * f5) / 2.0f);
                    float f6 = this.d.m0.c;
                    canvas2.scale(f6, f6);
                    zl6 zl6Var3 = this.d.m0;
                    canvas2.translate(zl6Var3.a * f4, zl6Var3.b * f5);
                    canvas2.rotate(this.d.m0.d + zl6Var.k);
                    if (this.d.m0.l) {
                        canvas2.scale(-1.0f, 1.0f);
                    }
                    canvas2.rotate(this.d.Q);
                    f4b f4bVar3 = this.d;
                    canvas2.translate((-f4bVar3.k0) / 2.0f, (-f4bVar3.l0) / 2.0f);
                }
                Paint paint = this.R;
                paint.setAlpha((int) ((1.0f - d) * 255.0f));
                int width = this.a.getWidth();
                int height = this.a.getHeight();
                Rect rect = this.b;
                rect.set(0, 0, width, height);
                f4b f4bVar4 = this.d;
                int i4 = f4bVar4.k0;
                int i5 = f4bVar4.l0;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zi8.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        f4b f4bVar;
        f4b f4bVar2;
        kac kacVar = this.n;
        if (view == kacVar && (f4bVar2 = this.d) != null && f4bVar2.u) {
            return false;
        }
        if ((view == kacVar || view == this.r) && (f4bVar = this.d) != null && f4bVar.m0 != null) {
            canvas.save();
            canvas.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
            canvas.concat(this.d.n0);
            f4b f4bVar3 = this.d;
            if (f4bVar3.m0 != null) {
                canvas.translate(f4bVar3.k0 / 2.0f, f4bVar3.l0 / 2.0f);
                canvas.rotate(-this.d.Q);
                f4b f4bVar4 = this.d;
                int i = f4bVar4.k0;
                int i2 = f4bVar4.l0;
                int i3 = f4bVar4.Q;
                zl6 zl6Var = f4bVar4.m0;
                if (((i3 + zl6Var.k) / 90) % 2 == 1) {
                    i2 = i;
                    i = i2;
                }
                float f = zl6Var.e;
                float f2 = zl6Var.f;
                canvas.clipRect(((-i) * f) / 2.0f, ((-i2) * f2) / 2.0f, (i * f) / 2.0f, (i2 * f2) / 2.0f);
                canvas.rotate(this.d.Q);
                f4b f4bVar5 = this.d;
                canvas.translate((-f4bVar5.k0) / 2.0f, (-f4bVar5.l0) / 2.0f);
            }
            canvas.concat(this.i0);
            canvas.scale(1.0f / (getWidth() / this.d.i0), 1.0f / (getHeight() / this.d.j0));
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    public final void g(p8c p8cVar, View... viewArr) {
        kac kacVar;
        int L = (int) (gl.L(26.0f) * gl.p);
        int L2 = (int) (gl.L(30.33f) * gl.p);
        int L3 = (int) (gl.L(4.0f) * gl.p);
        ?? r5 = new Bitmap[viewArr.length];
        for (int i = 0; i < viewArr.length; i++) {
            View view = viewArr[i];
            if (view != null && view.getWidth() >= 0 && viewArr[i].getHeight() > 0) {
                View view2 = viewArr[i];
                if (view2 == this && (kacVar = this.n) != null) {
                    r5[i] = kacVar.getBitmap();
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
        Utilities.e.c(new os2(L, L2, L3, r5, p8cVar, (byte) 1));
    }

    public int getContentHeight() {
        f4b f4bVar = this.d;
        if (f4bVar == null) {
            return 1;
        }
        return f4bVar.l0;
    }

    public int getContentWidth() {
        f4b f4bVar = this.d;
        if (f4bVar == null) {
            return 1;
        }
        return f4bVar.k0;
    }

    public long getCurrentPosition() {
        lbc lbcVar = this.e;
        if (lbcVar != null) {
            return lbcVar.S();
        }
        lbc lbcVar2 = this.y;
        if (lbcVar2 != null) {
            return lbcVar2.S();
        }
        lbc lbcVar3 = this.E;
        if (lbcVar3 != null) {
            return lbcVar3.S();
        }
        return 0L;
    }

    public long getDuration() {
        f4b f4bVar = this.d;
        if (f4bVar != null) {
            double d = f4bVar.i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        lbc lbcVar = this.e;
        if (lbcVar != null && lbcVar.U() != -9223372036854775807L) {
            return this.e.U();
        }
        return 1L;
    }

    public int getOrientation() {
        f4b f4bVar = this.d;
        if (f4bVar == null) {
            return 0;
        }
        return f4bVar.Q;
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

    public kac getTextureView() {
        return this.n;
    }

    public abstract void h();

    public final boolean i() {
        f4b f4bVar;
        if (this.F != null && (f4bVar = this.d) != null && f4bVar.v()) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        return !this.A0.contains(-9982);
    }

    public final void k(defpackage.f4b r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zi8.k(f4b):void");
    }

    public final void l(f4b f4bVar) {
        this.d = f4bVar;
        if (f4bVar == null) {
            setupImage(null);
            u(null);
            this.U.setShader(null);
            q(null, false);
            s(null, null, false);
            return;
        }
        if (f4bVar.K) {
            setupImage(f4bVar);
            if (f4bVar.A0 == 0 && f4bVar.B0 == 0) {
                f4bVar.y(new yi8(this, (byte) 0));
            } else {
                r();
            }
        } else {
            setupImage(f4bVar);
            r();
        }
        a();
        u(f4bVar);
        q(f4bVar, false);
        s(f4bVar, null, false);
    }

    public final void m(long j) {
        lbc lbcVar = this.e;
        if (lbcVar != null) {
            lbcVar.p0(j, false);
        } else if (i()) {
            this.F.m(j, false);
        } else {
            lbc lbcVar2 = this.y;
            if (lbcVar2 != null) {
                lbcVar2.p0(j, false);
            } else {
                lbc lbcVar3 = this.E;
                if (lbcVar3 != null) {
                    lbcVar3.p0(j, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(f4b f4bVar, a5b a5bVar, long j) {
        this.d = f4bVar;
        if (f4bVar == null) {
            t(null, a5bVar, j);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.U.setShader(null);
            q(null, false);
            s(null, null, false);
            return;
        }
        if (f4bVar.v()) {
            setupImage(null);
            t(null, a5bVar, j);
            setupCollage(f4bVar);
        } else if (f4bVar.K) {
            setupImage(f4bVar);
            setupCollage(null);
            t(f4bVar, a5bVar, j);
            if (f4bVar.A0 == 0 && f4bVar.B0 == 0) {
                f4bVar.y(new yi8(this, (byte) 1));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, a5bVar, 0L);
            setupImage(f4bVar);
            r();
        }
        a();
        u(f4bVar);
        q(f4bVar, false);
        s(f4bVar, null, false);
    }

    public final void o(TextureView textureView, l58 l58Var) {
        TextureView textureView2 = this.r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.r = null;
        }
        this.s = l58Var;
        this.r = textureView;
        if (l58Var != null) {
            int i = this.V;
            int i2 = this.W;
            td4 td4Var = l58Var.m0;
            if (td4Var != null) {
                td4Var.f(i, i2);
            } else {
                l58Var.K0 = i;
                l58Var.L0 = i2;
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

    public final void p(k27 k27Var) {
        long j;
        int maxCount;
        f4b f4bVar = this.d;
        if (f4bVar != null) {
            f4bVar.j = true;
            float f = 1.0f;
            if (k27Var != null) {
                int i = k27Var.K1;
                if (k27Var.k != null) {
                    TLRPC.Document F0 = k27Var.F0();
                    if (F0 != null && F0.id != 0) {
                        this.d.z = new TLRPC.TL_inputDocument();
                        TLRPC.InputDocument inputDocument = this.d.z;
                        inputDocument.id = F0.id;
                        inputDocument.file_reference = F0.file_reference;
                        inputDocument.access_hash = F0.access_hash;
                    }
                    int i2 = 0;
                    if (!TextUtils.isEmpty(k27Var.k.attachPath)) {
                        this.d.y = k27Var.k.attachPath;
                    } else {
                        ba4.G(i);
                        File J = ba4.J(F0, null, false, true);
                        if (J == null || !J.exists()) {
                            ba4.G(i);
                            J = ba4.J(F0, null, true, true);
                            if (J != null && J.exists()) {
                                this.d.y = J.getAbsolutePath();
                            } else {
                                f4b f4bVar2 = this.d;
                                f4bVar2.y = null;
                                f4bVar2.z = null;
                                f4bVar2.A = null;
                                f4bVar2.B = null;
                                f4bVar2.D = 0L;
                                f4bVar2.C = 0L;
                                f4bVar2.E = 0.0f;
                                f4bVar2.F = 1.0f;
                                return;
                            }
                        }
                        this.d.y = J.getAbsolutePath();
                    }
                    f4b f4bVar3 = this.d;
                    f4bVar3.A = null;
                    f4bVar3.B = null;
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
                    f4b f4bVar4 = this.d;
                    f4bVar4.D = 0L;
                    if (f4bVar4.K) {
                        f4bVar4.D = f4bVar4.Z * ((float) getDuration());
                    }
                    this.d.E = 0.0f;
                    if (i()) {
                        ArrayList arrayList2 = this.F.h;
                        int size2 = arrayList2.size();
                        while (i2 < size2) {
                            Object obj = arrayList2.get(i2);
                            i2++;
                            f4b f4bVar5 = ((pk2) obj).n;
                            if (f4bVar5 != null && f4bVar5.K) {
                                j = this.F.getDuration();
                                break;
                            }
                        }
                    }
                    f4b f4bVar6 = this.d;
                    if (f4bVar6.K) {
                        j = getDuration();
                    } else {
                        j = f4bVar6.C;
                    }
                    kob kobVar = this.G;
                    if (kobVar == null) {
                        maxCount = 1;
                    } else {
                        maxCount = kobVar.getMaxCount();
                    }
                    f4b f4bVar7 = this.d;
                    if (f4bVar7.C != 0) {
                        f = Math.min(1.0f, ((float) Math.min(j, maxCount * 59000)) / ((float) this.d.C));
                    }
                    f4bVar7.F = f;
                }
            }
            f4bVar.y = null;
            f4bVar.z = null;
            f4bVar.A = null;
            f4bVar.B = null;
            f4bVar.D = 0L;
            f4bVar.C = 0L;
            f4bVar.E = 0.0f;
            f4bVar.F = 1.0f;
        }
        q(this.d, true);
    }

    public final void q(f4b f4bVar, boolean z) {
        boolean z2;
        String str;
        float f;
        float f2;
        float f3;
        lbc lbcVar = this.E;
        if (lbcVar != null) {
            lbcVar.f0();
            this.E.l0();
            this.E = null;
        }
        if (f4bVar != null) {
            kob kobVar = this.G;
            boolean z3 = false;
            if (kobVar != null) {
                String str2 = f4bVar.y;
                String str3 = f4bVar.A;
                String str4 = f4bVar.B;
                long j = f4bVar.C;
                long j2 = f4bVar.D;
                float f4 = f4bVar.E;
                float f5 = f4bVar.F;
                float f6 = f4bVar.G;
                if (!TextUtils.equals(kobVar.P, str2)) {
                    dob dobVar = kobVar.b0;
                    if (dobVar != null) {
                        dobVar.a();
                        kobVar.b0 = null;
                        kobVar.V = false;
                    }
                    kobVar.P = str2;
                    kobVar.p();
                }
                kobVar.P = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                kobVar.O = !isEmpty;
                if (isEmpty) {
                    kobVar.Q = false;
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
                if (kobVar.O) {
                    kobVar.S = j;
                    kobVar.R = j2 - (((float) j) * f4);
                    kobVar.T = f4;
                    kobVar.U = f5;
                    kobVar.W = f6;
                    float f7 = 0.0f;
                    if (str != null) {
                        StaticLayout staticLayout = new StaticLayout(str, kobVar.M0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        kobVar.N0 = staticLayout;
                        if (staticLayout.getLineCount() > 0) {
                            f2 = kobVar.N0.getLineWidth(0);
                        } else {
                            f2 = 0.0f;
                        }
                        kobVar.O0 = f2;
                        if (kobVar.N0.getLineCount() > 0) {
                            f3 = kobVar.N0.getLineLeft(0);
                        } else {
                            f3 = 0.0f;
                        }
                        kobVar.P0 = f3;
                    } else {
                        kobVar.O0 = 0.0f;
                        kobVar.N0 = null;
                    }
                    if (str4 != null) {
                        StaticLayout staticLayout2 = new StaticLayout(str4, kobVar.Q0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        kobVar.R0 = staticLayout2;
                        if (staticLayout2.getLineCount() > 0) {
                            f = kobVar.R0.getLineWidth(0);
                        } else {
                            f = 0.0f;
                        }
                        kobVar.S0 = f;
                        if (kobVar.R0.getLineCount() > 0) {
                            f7 = kobVar.R0.getLineLeft(0);
                        }
                        kobVar.T0 = f7;
                    } else {
                        kobVar.S0 = 0.0f;
                        kobVar.R0 = null;
                    }
                }
                if (!z) {
                    z2 = true;
                    kobVar.f0.f(kobVar.O, true);
                } else {
                    z2 = true;
                }
                kobVar.invalidate();
            } else {
                z2 = true;
            }
            if (f4bVar.y != null) {
                lbc lbcVar2 = new lbc();
                this.E = lbcVar2;
                lbcVar2.E = z2;
                lbcVar2.K = new gi3(this);
                lbcVar2.i0(Uri.fromFile(new File(f4bVar.y)), "other");
                b();
                if (this.e != null && getDuration() > 0) {
                    long duration = f4bVar.Z * ((float) getDuration());
                    this.e.p0(duration, false);
                    this.G.setProgress(duration);
                }
                z2 = true;
                w(true);
            }
            t7b t7bVar = ((i7b) this).D0;
            x6b x6bVar = t7bVar.w1;
            if (x6bVar != null) {
                f4b f4bVar2 = t7bVar.L1;
                if (f4bVar2 != null && f4bVar2.y != null) {
                    z3 = z2;
                }
                x6bVar.setHasAudio(z3);
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
            i = gl.q.y;
        }
        f4b f4bVar = this.d;
        int i2 = f4bVar.A0;
        Paint paint = this.U;
        if (i2 != 0 && f4bVar.B0 != 0) {
            float f = i;
            f4b f4bVar2 = this.d;
            int i3 = f4bVar2.A0;
            this.V = i3;
            int i4 = f4bVar2.B0;
            this.W = i4;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f, new int[]{i3, i4}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            kac kacVar = this.n;
            if (kacVar != null) {
                int i5 = this.V;
                int i6 = this.W;
                td4 td4Var = kacVar.b;
                if (td4Var == null) {
                    kacVar.n = i5;
                    kacVar.r = i6;
                } else {
                    td4Var.f(i5, i6);
                }
            }
            l58 l58Var = this.s;
            if (l58Var != null) {
                int i7 = this.V;
                int i8 = this.W;
                td4 td4Var2 = l58Var.m0;
                if (td4Var2 != null) {
                    td4Var2.f(i7, i8);
                } else {
                    l58Var.K0 = i7;
                    l58Var.L0 = i8;
                }
            }
        } else {
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                new jq0(this, i, (byte) 3).a(kee.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        }
        invalidate();
    }

    public final void s(f4b f4bVar, am9 am9Var, boolean z) {
        lbc lbcVar;
        if (f4bVar != null && f4bVar.o0 != null) {
            lbc lbcVar2 = this.y;
            if (lbcVar2 != null) {
                lbcVar2.l0();
                this.y = null;
            }
            lbc lbcVar3 = new lbc();
            this.y = lbcVar3;
            lbcVar3.E = true;
            lbcVar3.K = new s34(this, (byte) 26);
            this.y.i0(Uri.fromFile(f4bVar.o0), "other");
            b();
            this.x = am9Var;
            if (am9Var != null && (lbcVar = this.y) != null) {
                lbcVar.z0(am9Var.w0);
            }
            this.G.n(f4bVar.o0.getAbsolutePath(), f4bVar.q0, f4bVar.r0, f4bVar.s0, f4bVar.t0, f4bVar.u0, z);
            y(true);
            return;
        }
        lbc lbcVar4 = this.y;
        if (lbcVar4 != null) {
            lbcVar4.f0();
            this.y.l0();
            this.y = null;
        }
        kob kobVar = this.G;
        if (kobVar != null) {
            kobVar.setRoundNull(z);
        }
        this.x = null;
        gl.r(this.L);
    }

    public void set(f4b f4bVar) {
        n(f4bVar, null, 0L);
    }

    public void setAllowCropping(boolean z) {
        this.l0 = z;
    }

    public void setCollageView(qk2 qk2Var) {
        this.F = qk2Var;
    }

    public void setCropEditorDrawing(t23 t23Var) {
        if (this.B0 != t23Var) {
            this.B0 = t23Var;
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

    public void setVideoTimelineView(kob kobVar) {
        this.G = kobVar;
        if (kobVar != null) {
            kobVar.setDelegate(new z24(this, (byte) 25));
        }
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            set(null);
        }
    }

    public final void t(f4b f4bVar, a5b a5bVar, long j) {
        sl0 sl0Var;
        boolean z;
        ArrayList arrayList;
        xl0 xl0Var;
        float f = 0.0f;
        if (f4bVar != null && !f4bVar.v()) {
            lbc lbcVar = this.e;
            if (lbcVar != null) {
                lbcVar.l0();
                this.e = null;
            }
            lbc lbcVar2 = new lbc();
            this.e = lbcVar2;
            lbcVar2.E = true;
            lbcVar2.K = new xl3((ViewGroup) this, (Object) f4bVar, (Object) new Runnable[]{a5bVar}, (byte) 24);
            kac kacVar = this.n;
            if (kacVar != null) {
                kacVar.clearAnimation();
                kac kacVar2 = this.n;
                td4 td4Var = kacVar2.b;
                if (td4Var != null) {
                    td4Var.postRunnable(new rd4(td4Var, (byte) 0));
                }
                kacVar2.a = null;
                removeView(this.n);
                this.n = null;
            }
            this.n = new kac(this.e, getContext());
            this.H.e();
            kac kacVar3 = this.n;
            if (f4bVar.u) {
                sl0Var = null;
            } else {
                sl0Var = this.H;
            }
            kacVar3.s = sl0Var;
            td4 td4Var2 = kacVar3.b;
            if (td4Var2 != null && (xl0Var = td4Var2.J) != null) {
                sl0 sl0Var2 = xl0Var.t;
                if (sl0Var2 != null && sl0Var2.m != null) {
                    sl0Var2.m = null;
                }
                xl0Var.t = sl0Var;
                if (sl0Var != null && sl0Var.m != xl0Var) {
                    sl0Var.m = xl0Var;
                    sl0Var.d();
                }
            }
            this.n.setOpaque(false);
            a();
            n00 n00Var = this.I;
            if (n00Var != null && n00Var.g) {
                n00Var.a(this.n);
            } else {
                kac kacVar4 = this.n;
                if (a5bVar != null) {
                    f = 1.0f;
                }
                kacVar4.setAlpha(f);
                addView(this.n, nme.e(-2, -2, 51));
            }
            zf7 zf7Var = new zf7(this, (byte) 17);
            e4b e4bVar = f4bVar.d1;
            if (e4bVar != null) {
                zf7Var.a(e4bVar);
            } else if (f4bVar.K && Build.VERSION.SDK_INT >= 24) {
                Utilities.e.c(new a4b(f4bVar, zf7Var, (byte) 0));
            } else {
                ?? obj = new Object();
                f4bVar.d1 = obj;
                zf7Var.a(obj);
            }
            File file = f4bVar.Z0;
            if (file == null) {
                file = f4bVar.L;
            }
            this.e.i0(Uri.fromFile(file), "other");
            this.e.t0(this.A0.isEmpty());
            this.e.r0(true);
            if (f4bVar.h) {
                j = (f4bVar.Z * ((float) f4bVar.h0)) + ((float) j);
            }
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i > 0) {
                this.e.p0(j, false);
            }
            b();
            w(true);
            if (f4bVar.u && (arrayList = f4bVar.v) != null && arrayList.size() == 1 && ((k27) f4bVar.v.get(0)).D == 5) {
                z = true;
            } else {
                z = false;
            }
            kob kobVar = this.G;
            File file2 = f4bVar.Z0;
            if (file2 == null) {
                file2 = f4bVar.L;
            }
            kobVar.o(z, file2.getAbsolutePath(), getDuration(), f4bVar.P);
            this.G.setVideoLeft(f4bVar.Z);
            this.G.setVideoRight(f4bVar.a0);
            kob kobVar2 = this.G;
            if (kobVar2 != null && i > 0) {
                kobVar2.setProgress(j);
                return;
            }
            return;
        }
        lbc lbcVar3 = this.e;
        if (lbcVar3 != null) {
            lbcVar3.f0();
            this.e.l0();
            this.e = null;
        }
        n00 n00Var2 = this.I;
        if (n00Var2 != null && n00Var2.g) {
            n00Var2.a(null);
        } else {
            kac kacVar5 = this.n;
            if (kacVar5 != null) {
                kacVar5.clearAnimation();
                this.n.animate().alpha(0.0f).withEndAction(new yi8(this, (byte) 6)).start();
            }
        }
        kob kobVar3 = this.G;
        if (kobVar3 != null) {
            kobVar3.o(false, null, 1L, 0.0f);
        }
        gl.r(this.L);
        if (a5bVar != null) {
            gl.c3(a5bVar);
        }
    }

    public final void u(f4b f4bVar) {
        Drawable drawable = this.T;
        this.S = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (f4bVar == null) {
            this.T = null;
            return;
        }
        long j = f4bVar.z0;
        if (j != Long.MIN_VALUE) {
            Drawable d = d(this.T, f4bVar.a, j, f4bVar.y0);
            f4bVar.x0 = d;
            this.T = d;
            if (this.S != d) {
                this.S = null;
            }
            if (d != null) {
                d.setCallback(this);
            }
            sl0 sl0Var = this.H;
            if (sl0Var != null) {
                Drawable drawable2 = this.T;
                if (drawable2 != null) {
                    if (drawable2 instanceof BitmapDrawable) {
                        sl0Var.f(((BitmapDrawable) drawable2).getBitmap(), false);
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
                        sl0Var.f(createBitmap, true);
                    }
                } else {
                    sl0Var.f(null, false);
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
        f4b f4bVar;
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
                f = loe.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
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
                float width = f4bVar.i0 / getWidth();
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
                                gl.W3(this);
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
                                gl.W3(this);
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
                        t7b t7bVar = ((i7b) this).D0;
                        t7bVar.p1.a(true, false, t7bVar.j0);
                        t7bVar.p1.b(t7bVar.d1.getText());
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zi8.w(boolean):void");
    }

    public final void x(int i, boolean z) {
        HashSet hashSet = this.A0;
        if (z) {
            hashSet.add(Integer.valueOf(i));
        } else {
            hashSet.remove(Integer.valueOf(i));
        }
        lbc lbcVar = this.e;
        if (lbcVar != null) {
            lbcVar.t0(hashSet.isEmpty());
        }
        qk2 qk2Var = this.F;
        if (qk2Var != null) {
            qk2Var.setPlaying(hashSet.isEmpty());
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
                am9 am9Var = this.x;
                if (am9Var != null && !am9Var.D0) {
                    am9Var.D0 = true;
                    am9Var.E0.f(true, true);
                    am9Var.invalidate();
                }
                long S2 = this.y.S();
                if (z && this.y.U() != -9223372036854775807L) {
                    float U = ((float) S2) / ((float) this.y.U());
                    f4b f4bVar = this.d;
                    if ((U < f4bVar.s0 || U > f4bVar.t0) && System.currentTimeMillis() - this.K > 500) {
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
            f4b f4bVar2 = this.d;
            float f2 = f4bVar2.t0;
            float f3 = f4bVar2.s0;
            long j = (f2 - f3) * ((float) f4bVar2.q0);
            long j2 = f4bVar2.r0;
            if (S >= j2 && S <= j + j2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!c0 || !z2) {
                z3 = false;
            }
            long j3 = (S - j2) + (f3 * f);
            am9 am9Var2 = this.x;
            if (am9Var2 != null && am9Var2.D0 != z2) {
                am9Var2.D0 = z2;
                am9Var2.invalidate();
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
