package hi;

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
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.messenger.we;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.de0;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.za0;
public abstract class f6 extends FrameLayout {
    public static final int C0 = 0;
    public final HashSet A0;
    public s0 B0;
    public h61 E;
    public n0 F;
    public xb G;
    public final org.telegram.ui.Components.ba H;
    public final e6 I;
    public long J;
    public long K;
    public final d6 L;
    public final d6 M;
    public final d6 N;
    public m9 O;
    public boolean P;
    public final org.telegram.ui.Components.c6 Q;
    public final Paint R;
    public Drawable S;
    public Drawable T;
    public final Paint U;
    public int V;
    public int W;
    public Bitmap f14444a;
    public final Matrix f14445a0;
    public final Rect f14446b;
    public final float[] f14447b0;
    public final Rect f14448c;
    public float f14449c0;
    public x7 d;
    public float f14450d0;
    public h61 f14451e;
    public float f14452e0;
    public int f14453f;
    public boolean f14454f0;
    public final org.telegram.ui.Components.c6 f14455g0;
    public int h;
    public boolean f14456h0;
    public final Matrix f14457i0;
    public final Matrix f14458j0;
    public final Matrix f14459k0;
    public boolean f14460l0;
    public final PointF m0;
    public x51 f14461n;
    public final PointF f14462n0;
    public float f14463o0;
    public double f14464p0;
    public boolean f14465q0;
    public TextureView f14466r;
    public boolean f14467r0;
    public de0 f14468s;
    public boolean f14469s0;
    public final Matrix f14470t0;
    public final Matrix f14471u0;
    public float f14472v0;
    public m9 f14473w;
    public boolean f14474w0;
    public tg.w1 f14475x;
    public boolean f14476x0;
    public h61 f14477y;
    public long f14478y0;
    public Runnable f14479z0;

    public f6(Context context, org.telegram.ui.Components.ba baVar, e6 e6Var) {
        super(context);
        this.f14446b = new Rect();
        this.f14448c = new Rect();
        Paint paint = new Paint(1);
        new d6(this, 1);
        this.L = new d6(this, 2);
        this.M = new d6(this, 3);
        this.N = new d6(this, 4);
        this.Q = new org.telegram.ui.Components.c6(this, 0L, 350L, kr.h);
        this.R = new Paint(7);
        this.U = new Paint(1);
        this.f14445a0 = new Matrix();
        this.f14447b0 = new float[2];
        this.f14454f0 = true;
        this.f14455g0 = new org.telegram.ui.Components.c6(this, 0L, 320L, kr.f36859g);
        this.f14456h0 = false;
        this.f14457i0 = new Matrix();
        this.f14458j0 = new Matrix();
        this.f14459k0 = new Matrix();
        this.f14460l0 = true;
        this.m0 = new PointF();
        this.f14462n0 = new PointF();
        this.f14470t0 = new Matrix();
        this.f14471u0 = new Matrix();
        this.A0 = new HashSet();
        this.H = baVar;
        this.I = e6Var;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(org.telegram.messenger.g0.L(3.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), 1073741824);
    }

    public static void a(hi.f6 r13, hi.x7 r14) {
        throw new UnsupportedOperationException("Method not decompiled: hi.f6.a(hi.f6, hi.x7):void");
    }

    public static Drawable e(Drawable drawable, int i7, long j3, boolean z10) {
        TLRPC.WallPaper wallPaper = null;
        if (j3 == Long.MIN_VALUE) {
            return null;
        }
        if (j3 >= 0) {
            TLRPC.UserFull d2 = mp.u1(i7).d2(j3);
            if (d2 != null) {
                wallPaper = d2.wallpaper;
            }
        } else {
            TLRPC.ChatFull P0 = mp.u1(i7).P0(-j3);
            if (P0 != null) {
                wallPaper = P0.wallpaper;
            }
        }
        return f(drawable, i7, wallPaper, z10);
    }

    public static android.graphics.drawable.Drawable f(android.graphics.drawable.Drawable r5, int r6, org.telegram.tgnet.TLRPC.WallPaper r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: hi.f6.f(android.graphics.drawable.Drawable, int, org.telegram.tgnet.TLRPC$WallPaper, boolean):android.graphics.drawable.Drawable");
    }

    public static Drawable g(int i7, final org.telegram.ui.ActionBar.s3 s3Var, final boolean z10) {
        if (s3Var.l()) {
            org.telegram.ui.ActionBar.n6.I(org.telegram.ui.ActionBar.s3.d(z10), s3Var.g(i7, z10 ? 1 : 0), ((org.telegram.ui.ActionBar.r3) s3Var.f30049f.get(z10 ? 1 : 0)).f30025g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray g10 = s3Var.g(i7, z10 ? 1 : 0);
        int i10 = org.telegram.ui.ActionBar.n6.Ee;
        int i11 = g10.get(i10, org.telegram.ui.ActionBar.n6.x0(null, i10, false));
        int i12 = org.telegram.ui.ActionBar.n6.Fe;
        int i13 = g10.get(i12, org.telegram.ui.ActionBar.n6.x0(null, i12, false));
        int i14 = org.telegram.ui.ActionBar.n6.Ge;
        int i15 = g10.get(i14, org.telegram.ui.ActionBar.n6.x0(null, i14, false));
        int i16 = org.telegram.ui.ActionBar.n6.He;
        int i17 = g10.get(i16, org.telegram.ui.ActionBar.n6.x0(null, i16, false));
        final za0 za0Var = new za0();
        za0Var.f42792g = false;
        za0Var.s(s3Var.j(z10 ? 1 : 0).settings.intensity, za0Var.f42805u);
        za0Var.o(i11, i13, i15, i17, 0, true);
        za0Var.u(0);
        final int f10 = za0Var.f();
        s3Var.n(z10 ? 1 : 0, new ResultCallback() {
            @Override
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair != null) {
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((gg.a) pair.second).f13602a;
                    org.telegram.ui.ActionBar.s3 s3Var2 = org.telegram.ui.ActionBar.s3.this;
                    if (longValue == s3Var2.h(z10 ? 1 : 0) && bitmap != null) {
                        int i18 = s3Var2.j(z10 ? 1 : 0).settings.intensity;
                        za0 za0Var2 = za0Var;
                        za0Var2.s(i18, bitmap);
                        za0Var2.t(f10);
                        za0Var2.r(1.0f);
                    }
                }
            }

            @Override
            public final void onError(Throwable th2) {
                org.telegram.tgnet.l.a(this, th2);
            }

            @Override
            public final void onError(TLRPC.TL_error tL_error) {
                org.telegram.tgnet.l.b(this, tL_error);
            }
        });
        return za0Var;
    }

    private void setupCollage(x7 x7Var) {
        ArrayList<x7> arrayList;
        xb xbVar = this.G;
        if (xbVar != null) {
            if (x7Var != null) {
                arrayList = x7Var.T;
            } else {
                arrayList = null;
            }
            xbVar.setCollage(arrayList);
        }
    }

    private void setupImage(x7 x7Var) {
        Utilities.f22879g.c(new c(8, this, x7Var));
    }

    public abstract void b();

    public final void c() {
        float f10;
        float f11;
        x7 x7Var;
        h61 h61Var = this.f14451e;
        float f12 = 0.0f;
        if (h61Var != null) {
            if (!this.P && ((x7Var = this.d) == null || !x7Var.Y)) {
                if (x7Var != null) {
                    f11 = x7Var.P;
                } else {
                    f11 = 1.0f;
                }
            } else {
                f11 = 0.0f;
            }
            h61Var.B0(f11);
        }
        h61 h61Var2 = this.f14477y;
        if (h61Var2 != null) {
            if (this.P) {
                f10 = 0.0f;
            } else {
                x7 x7Var2 = this.d;
                if (x7Var2 != null) {
                    f10 = x7Var2.f15776u0;
                } else {
                    f10 = 1.0f;
                }
            }
            h61Var2.B0(f10);
        }
        h61 h61Var3 = this.E;
        if (h61Var3 != null) {
            if (!this.P) {
                x7 x7Var3 = this.d;
                if (x7Var3 != null) {
                    f12 = x7Var3.G;
                } else {
                    f12 = 1.0f;
                }
            }
            h61Var3.B0(f12);
        }
        n0 n0Var = this.F;
        if (n0Var != null) {
            n0Var.setMuted(this.P);
        }
    }

    public final void d(Matrix matrix) {
        x7 x7Var = this.d;
        if (x7Var == null) {
            return;
        }
        float[] fArr = this.f14447b0;
        fArr[0] = x7Var.f15757k0 / 2.0f;
        fArr[1] = x7Var.f15759l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f14449c0 = fArr[0];
        this.f14450d0 = fArr[1];
        x7 x7Var2 = this.d;
        fArr[0] = x7Var2.f15757k0;
        fArr[1] = x7Var2.f15759l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f14452e0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.f14450d0, fArr[0] - this.f14449c0));
        a8.x9.a(this.f14449c0, this.f14450d0, fArr[0], fArr[1]);
        x7 x7Var3 = this.d;
        fArr[0] = x7Var3.f15757k0 / 2.0f;
        fArr[1] = x7Var3.f15759l0;
        matrix.mapPoints(fArr);
        a8.x9.a(this.f14449c0, this.f14450d0, fArr[0], fArr[1]);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        x7 x7Var;
        we weVar;
        if (this.T != null) {
            float f10 = 0.0f;
            if (this.f14456h0) {
                Path path = new Path();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.T;
            if (!(drawable instanceof za0) || ((za0) drawable).f42805u != null) {
                f10 = this.Q.e(false, 1.0f);
            }
            Drawable drawable2 = this.S;
            if (drawable2 != null && f10 < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - f10) * 255.0f));
                x7.j(canvas, this.S, getWidth(), getHeight());
            }
            this.T.setAlpha((int) (f10 * 255.0f));
            x7.j(canvas, this.T, getWidth(), getHeight());
            if (this.f14456h0) {
                canvas.restore();
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.U);
        }
        s0 s0Var = this.B0;
        if (s0Var != null) {
            s0Var.d.b(canvas2, true);
        } else if (this.f14454f0 && this.d != null && !j()) {
            if (this.f14444a == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d = this.f14455g0.d(z10);
            if (this.f14444a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.f15753i0, getHeight() / this.d.f15755j0);
                canvas2.concat(this.d.f15762n0);
                if (this.d.m0 != null) {
                    canvas2.translate(x7Var.f15757k0 / 2.0f, x7Var.f15759l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    x7 x7Var2 = this.d;
                    int i7 = x7Var2.f15757k0;
                    int i10 = x7Var2.f15759l0;
                    int i11 = x7Var2.Q;
                    we weVar2 = x7Var2.m0;
                    if (((i11 + weVar2.f27775k) / 90) % 2 == 1) {
                        i10 = i7;
                        i7 = i10;
                    }
                    float f11 = weVar2.f27771e;
                    float f12 = weVar2.f27772f;
                    float f13 = i7;
                    float f14 = i10;
                    canvas2.clipRect(((-i7) * f11) / 2.0f, ((-i10) * f12) / 2.0f, (f11 * f13) / 2.0f, (f12 * f14) / 2.0f);
                    float f15 = this.d.m0.f27770c;
                    canvas2.scale(f15, f15);
                    we weVar3 = this.d.m0;
                    canvas2.translate(weVar3.f27768a * f13, weVar3.f27769b * f14);
                    canvas2.rotate(this.d.m0.d + weVar.f27775k);
                    if (this.d.m0.f27776l) {
                        canvas2.scale(-1.0f, 1.0f);
                    }
                    canvas2.rotate(this.d.Q);
                    x7 x7Var3 = this.d;
                    canvas2.translate((-x7Var3.f15757k0) / 2.0f, (-x7Var3.f15759l0) / 2.0f);
                }
                Paint paint = this.R;
                paint.setAlpha((int) ((1.0f - d) * 255.0f));
                int width = this.f14444a.getWidth();
                int height = this.f14444a.getHeight();
                Rect rect = this.f14446b;
                rect.set(0, 0, width, height);
                x7 x7Var4 = this.d;
                int i12 = x7Var4.f15757k0;
                int i13 = x7Var4.f15759l0;
                Rect rect2 = this.f14448c;
                rect2.set(0, 0, i12, i13);
                canvas2.drawBitmap(this.f14444a, rect, rect2, paint);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: hi.f6.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        x7 x7Var;
        x7 x7Var2;
        x51 x51Var = this.f14461n;
        if (view == x51Var && (x7Var2 = this.d) != null && x7Var2.f15775u) {
            return false;
        }
        if ((view == x51Var || view == this.f14466r) && (x7Var = this.d) != null && x7Var.m0 != null) {
            canvas.save();
            canvas.scale(getWidth() / this.d.f15753i0, getHeight() / this.d.f15755j0);
            canvas.concat(this.d.f15762n0);
            x7 x7Var3 = this.d;
            if (x7Var3.m0 != null) {
                canvas.translate(x7Var3.f15757k0 / 2.0f, x7Var3.f15759l0 / 2.0f);
                canvas.rotate(-this.d.Q);
                x7 x7Var4 = this.d;
                int i7 = x7Var4.f15757k0;
                int i10 = x7Var4.f15759l0;
                int i11 = x7Var4.Q;
                we weVar = x7Var4.m0;
                if (((i11 + weVar.f27775k) / 90) % 2 == 1) {
                    i10 = i7;
                    i7 = i10;
                }
                float f10 = weVar.f27771e;
                float f11 = weVar.f27772f;
                canvas.clipRect(((-i7) * f10) / 2.0f, ((-i10) * f11) / 2.0f, (i7 * f10) / 2.0f, (i10 * f11) / 2.0f);
                canvas.rotate(this.d.Q);
                x7 x7Var5 = this.d;
                canvas.translate((-x7Var5.f15757k0) / 2.0f, (-x7Var5.f15759l0) / 2.0f);
            }
            canvas.concat(this.f14457i0);
            canvas.scale(1.0f / (getWidth() / this.d.f15753i0), 1.0f / (getHeight() / this.d.f15755j0));
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public int getContentHeight() {
        x7 x7Var = this.d;
        if (x7Var == null) {
            return 1;
        }
        return x7Var.f15759l0;
    }

    public int getContentWidth() {
        x7 x7Var = this.d;
        if (x7Var == null) {
            return 1;
        }
        return x7Var.f15757k0;
    }

    public long getCurrentPosition() {
        h61 h61Var = this.f14451e;
        if (h61Var != null) {
            return h61Var.S();
        }
        h61 h61Var2 = this.f14477y;
        if (h61Var2 != null) {
            return h61Var2.S();
        }
        h61 h61Var3 = this.E;
        if (h61Var3 != null) {
            return h61Var3.S();
        }
        return 0L;
    }

    public long getDuration() {
        x7 x7Var = this.d;
        if (x7Var != null) {
            double d = x7Var.f15752i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        h61 h61Var = this.f14451e;
        if (h61Var != null && h61Var.U() != -9223372036854775807L) {
            return this.f14451e.U();
        }
        return 1L;
    }

    public int getOrientation() {
        x7 x7Var = this.d;
        if (x7Var == null) {
            return 0;
        }
        return x7Var.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        if (this.d == null) {
            return new Pair<>(1080, 1920);
        }
        return new Pair<>(Integer.valueOf(this.d.f15753i0), Integer.valueOf(this.d.f15755j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.f14444a;
    }

    public x51 getTextureView() {
        return this.f14461n;
    }

    public final void h(w10 w10Var, View... viewArr) {
        x51 x51Var;
        int L = (int) (org.telegram.messenger.g0.L(26.0f) * org.telegram.messenger.g0.f24225p);
        int L2 = (int) (org.telegram.messenger.g0.L(30.33f) * org.telegram.messenger.g0.f24225p);
        int L3 = (int) (org.telegram.messenger.g0.L(4.0f) * org.telegram.messenger.g0.f24225p);
        ?? r52 = new Bitmap[viewArr.length];
        for (int i7 = 0; i7 < viewArr.length; i7++) {
            View view = viewArr[i7];
            if (view != null && view.getWidth() >= 0 && viewArr[i7].getHeight() > 0) {
                View view2 = viewArr[i7];
                if (view2 == this && (x51Var = this.f14461n) != null) {
                    r52[i7] = x51Var.getBitmap();
                } else if (view2 instanceof TextureView) {
                    r52[i7] = ((TextureView) view2).getBitmap();
                } else if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0) {
                    r52[i7] = Bitmap.createBitmap(L, L2, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(r52[i7]);
                    canvas.save();
                    float max = Math.max(L / viewArr[i7].getWidth(), L2 / viewArr[i7].getHeight());
                    canvas.scale(max, max);
                    viewArr[i7].draw(canvas);
                    canvas.restore();
                }
            }
        }
        Utilities.f22877e.c(new c6(L, L2, L3, r52, w10Var, 0));
    }

    public abstract void i();

    public final boolean j() {
        x7 x7Var;
        if (this.F != null && (x7Var = this.d) != null && x7Var.v()) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        return !this.A0.contains(-9982);
    }

    public final void l(x7 x7Var) {
        this.d = x7Var;
        if (x7Var == null) {
            setupImage(null);
            u(null);
            this.U.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (x7Var.K) {
            setupImage(x7Var);
            if (x7Var.A0 == 0 && x7Var.B0 == 0) {
                x7Var.z(new d6(this, 0));
            } else {
                r();
            }
        } else {
            setupImage(x7Var);
            r();
        }
        b();
        u(x7Var);
        p(x7Var, false);
        s(x7Var, null, false);
    }

    public final void m(long j3) {
        h61 h61Var = this.f14451e;
        if (h61Var != null) {
            h61Var.q0(j3, false);
        } else if (j()) {
            this.F.m(j3, false);
        } else {
            h61 h61Var2 = this.f14477y;
            if (h61Var2 != null) {
                h61Var2.q0(j3, false);
            } else {
                h61 h61Var3 = this.E;
                if (h61Var3 != null) {
                    h61Var3.q0(j3, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(x7 x7Var, s9 s9Var, long j3) {
        this.d = x7Var;
        if (x7Var == null) {
            t(null, s9Var, j3);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.U.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (x7Var.v()) {
            setupImage(null);
            t(null, s9Var, j3);
            setupCollage(x7Var);
        } else if (x7Var.K) {
            setupImage(x7Var);
            setupCollage(null);
            t(x7Var, s9Var, j3);
            if (x7Var.A0 == 0 && x7Var.B0 == 0) {
                x7Var.z(new d6(this, 0));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, s9Var, 0L);
            setupImage(x7Var);
            r();
        }
        b();
        u(x7Var);
        p(x7Var, false);
        s(x7Var, null, false);
    }

    public final void o(TextureView textureView, de0 de0Var) {
        TextureView textureView2 = this.f14466r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.f14466r = null;
        }
        this.f14468s = de0Var;
        this.f14466r = textureView;
        if (de0Var != null) {
            int i7 = this.V;
            int i10 = this.W;
            bz bzVar = de0Var.m0;
            if (bzVar != null) {
                bzVar.h(i7, i10);
            } else {
                de0Var.K0 = i7;
                de0Var.L0 = i10;
            }
        }
        TextureView textureView3 = this.f14466r;
        if (textureView3 != null) {
            addView(textureView3);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f14460l0) {
            v(motionEvent);
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void p(x7 x7Var, boolean z10) {
        boolean z11;
        String str;
        float f10;
        float f11;
        float f12;
        h61 h61Var = this.E;
        if (h61Var != null) {
            h61Var.g0();
            this.E.m0();
            this.E = null;
        }
        if (x7Var != null) {
            xb xbVar = this.G;
            boolean z12 = false;
            if (xbVar != null) {
                String str2 = x7Var.f15782y;
                String str3 = x7Var.A;
                String str4 = x7Var.B;
                long j3 = x7Var.C;
                long j10 = x7Var.D;
                float f13 = x7Var.E;
                float f14 = x7Var.F;
                float f15 = x7Var.G;
                if (!TextUtils.equals(xbVar.P, str2)) {
                    qb qbVar = xbVar.f15796b0;
                    if (qbVar != null) {
                        qbVar.a();
                        xbVar.f15796b0 = null;
                        xbVar.V = false;
                    }
                    xbVar.P = str2;
                    xbVar.p();
                }
                xbVar.P = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                xbVar.O = !isEmpty;
                if (isEmpty) {
                    xbVar.Q = false;
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
                if (xbVar.O) {
                    xbVar.S = j3;
                    xbVar.R = j10 - (((float) j3) * f13);
                    xbVar.T = f13;
                    xbVar.U = f14;
                    xbVar.W = f15;
                    float f16 = 0.0f;
                    if (str != null) {
                        StaticLayout staticLayout = new StaticLayout(str, xbVar.M0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        xbVar.N0 = staticLayout;
                        if (staticLayout.getLineCount() > 0) {
                            f11 = xbVar.N0.getLineWidth(0);
                        } else {
                            f11 = 0.0f;
                        }
                        xbVar.O0 = f11;
                        if (xbVar.N0.getLineCount() > 0) {
                            f12 = xbVar.N0.getLineLeft(0);
                        } else {
                            f12 = 0.0f;
                        }
                        xbVar.P0 = f12;
                    } else {
                        xbVar.O0 = 0.0f;
                        xbVar.N0 = null;
                    }
                    if (str4 != null) {
                        StaticLayout staticLayout2 = new StaticLayout(str4, xbVar.Q0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        xbVar.R0 = staticLayout2;
                        if (staticLayout2.getLineCount() > 0) {
                            f10 = xbVar.R0.getLineWidth(0);
                        } else {
                            f10 = 0.0f;
                        }
                        xbVar.S0 = f10;
                        if (xbVar.R0.getLineCount() > 0) {
                            f16 = xbVar.R0.getLineLeft(0);
                        }
                        xbVar.T0 = f16;
                    } else {
                        xbVar.S0 = 0.0f;
                        xbVar.R0 = null;
                    }
                }
                if (!z10) {
                    z11 = true;
                    xbVar.f15807f0.f(xbVar.O, true);
                } else {
                    z11 = true;
                }
                xbVar.invalidate();
            } else {
                z11 = true;
            }
            if (x7Var.f15782y != null) {
                h61 h61Var2 = new h61();
                this.E = h61Var2;
                h61Var2.E = z11;
                h61Var2.K = new h6.o(this, 4);
                h61Var2.j0(Uri.fromFile(new File(x7Var.f15782y)), "other");
                c();
                if (this.f14451e != null && getDuration() > 0) {
                    long duration = x7Var.Z * ((float) getDuration());
                    this.f14451e.q0(duration, false);
                    this.G.setProgress(duration);
                }
                z11 = true;
                w(true);
            }
            nb nbVar = ((bb) this).D0;
            pa paVar = nbVar.f15126w1;
            if (paVar != null) {
                x7 x7Var2 = nbVar.L1;
                if (x7Var2 != null && x7Var2.f15782y != null) {
                    z12 = z11;
                }
                paVar.setHasAudio(z12);
            }
        }
    }

    public final void q(fj fjVar) {
        long j3;
        int maxCount;
        x7 x7Var = this.d;
        if (x7Var != null) {
            x7Var.f15754j = true;
            float f10 = 1.0f;
            if (fjVar != null) {
                int i7 = fjVar.K1;
                if (fjVar.f24073k != null) {
                    TLRPC.Document F0 = fjVar.F0();
                    if (F0 != null && F0.f28498id != 0) {
                        this.d.f15784z = new TLRPC.TL_inputDocument();
                        TLRPC.InputDocument inputDocument = this.d.f15784z;
                        inputDocument.f28504id = F0.f28498id;
                        inputDocument.file_reference = F0.file_reference;
                        inputDocument.access_hash = F0.access_hash;
                    }
                    int i10 = 0;
                    if (!TextUtils.isEmpty(fjVar.f24073k.attachPath)) {
                        this.d.f15782y = fjVar.f24073k.attachPath;
                    } else {
                        org.telegram.messenger.w7.G(i7);
                        File J = org.telegram.messenger.w7.J(F0, null, false, true);
                        if (J == null || !J.exists()) {
                            org.telegram.messenger.w7.G(i7);
                            J = org.telegram.messenger.w7.J(F0, null, true, true);
                            if (J != null && J.exists()) {
                                this.d.f15782y = J.getAbsolutePath();
                            } else {
                                x7 x7Var2 = this.d;
                                x7Var2.f15782y = null;
                                x7Var2.f15784z = null;
                                x7Var2.A = null;
                                x7Var2.B = null;
                                x7Var2.D = 0L;
                                x7Var2.C = 0L;
                                x7Var2.E = 0.0f;
                                x7Var2.F = 1.0f;
                                return;
                            }
                        }
                        this.d.f15782y = J.getAbsolutePath();
                    }
                    x7 x7Var3 = this.d;
                    x7Var3.A = null;
                    x7Var3.B = null;
                    if (F0 != null) {
                        ArrayList<TLRPC.DocumentAttribute> arrayList = F0.attributes;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= size) {
                                break;
                            }
                            TLRPC.DocumentAttribute documentAttribute = arrayList.get(i11);
                            i11++;
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
                    x7 x7Var4 = this.d;
                    x7Var4.D = 0L;
                    if (x7Var4.K) {
                        x7Var4.D = x7Var4.Z * ((float) getDuration());
                    }
                    this.d.E = 0.0f;
                    if (j()) {
                        ArrayList arrayList2 = this.F.h;
                        int size2 = arrayList2.size();
                        while (i10 < size2) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            x7 x7Var5 = ((m0) obj).f14875n;
                            if (x7Var5 != null && x7Var5.K) {
                                j3 = this.F.getDuration();
                                break;
                            }
                        }
                    }
                    x7 x7Var6 = this.d;
                    if (x7Var6.K) {
                        j3 = getDuration();
                    } else {
                        j3 = x7Var6.C;
                    }
                    xb xbVar = this.G;
                    if (xbVar == null) {
                        maxCount = 1;
                    } else {
                        maxCount = xbVar.getMaxCount();
                    }
                    x7 x7Var7 = this.d;
                    if (x7Var7.C != 0) {
                        f10 = Math.min(1.0f, ((float) Math.min(j3, maxCount * 59000)) / ((float) this.d.C));
                    }
                    x7Var7.F = f10;
                }
            }
            x7Var.f15782y = null;
            x7Var.f15784z = null;
            x7Var.A = null;
            x7Var.B = null;
            x7Var.D = 0L;
            x7Var.C = 0L;
            x7Var.E = 0.0f;
            x7Var.F = 1.0f;
        }
        p(this.d, true);
    }

    public final void r() {
        int i7;
        if (this.d == null) {
            return;
        }
        if (getMeasuredHeight() > 0) {
            i7 = getMeasuredHeight();
        } else {
            i7 = org.telegram.messenger.g0.f24226q.y;
        }
        x7 x7Var = this.d;
        int i10 = x7Var.A0;
        Paint paint = this.U;
        if (i10 != 0 && x7Var.B0 != 0) {
            float f10 = i7;
            x7 x7Var2 = this.d;
            int i11 = x7Var2.A0;
            this.V = i11;
            int i12 = x7Var2.B0;
            this.W = i12;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f10, new int[]{i11, i12}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            x51 x51Var = this.f14461n;
            if (x51Var != null) {
                int i13 = this.V;
                int i14 = this.W;
                bz bzVar = x51Var.f41850b;
                if (bzVar == null) {
                    x51Var.f41854n = i13;
                    x51Var.f41855r = i14;
                } else {
                    bzVar.h(i13, i14);
                }
            }
            de0 de0Var = this.f14468s;
            if (de0Var != null) {
                int i15 = this.V;
                int i16 = this.W;
                bz bzVar2 = de0Var.m0;
                if (bzVar2 != null) {
                    bzVar2.h(i15, i16);
                } else {
                    de0Var.K0 = i15;
                    de0Var.L0 = i16;
                }
            }
        } else {
            Bitmap bitmap = this.f14444a;
            if (bitmap != null) {
                new a4(this, i7, 1).a(c8.k0.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        }
        invalidate();
    }

    public final void s(x7 x7Var, tg.w1 w1Var, boolean z10) {
        h61 h61Var;
        if (x7Var != null && x7Var.f15764o0 != null) {
            h61 h61Var2 = this.f14477y;
            if (h61Var2 != null) {
                h61Var2.m0();
                this.f14477y = null;
            }
            h61 h61Var3 = new h61();
            this.f14477y = h61Var3;
            h61Var3.E = true;
            h61Var3.K = new ob.c(this, 28);
            this.f14477y.j0(Uri.fromFile(x7Var.f15764o0), "other");
            c();
            this.f14475x = w1Var;
            if (w1Var != null && (h61Var = this.f14477y) != null) {
                h61Var.A0(w1Var.f58282w0);
            }
            this.G.n(x7Var.f15764o0.getAbsolutePath(), x7Var.f15768q0, x7Var.f15770r0, x7Var.f15772s0, x7Var.f15774t0, x7Var.f15776u0, z10);
            y(true);
            return;
        }
        h61 h61Var4 = this.f14477y;
        if (h61Var4 != null) {
            h61Var4.g0();
            this.f14477y.m0();
            this.f14477y = null;
        }
        xb xbVar = this.G;
        if (xbVar != null) {
            xbVar.setRoundNull(z10);
        }
        this.f14475x = null;
        org.telegram.messenger.g0.r(this.L);
    }

    public void set(x7 x7Var) {
        n(x7Var, null, 0L);
    }

    public void setAllowCropping(boolean z10) {
        this.f14460l0 = z10;
    }

    public void setCollageView(n0 n0Var) {
        this.F = n0Var;
    }

    public void setCropEditorDrawing(s0 s0Var) {
        if (this.B0 != s0Var) {
            this.B0 = s0Var;
            invalidate();
        }
    }

    public void setDraw(boolean z10) {
        this.f14454f0 = z10;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.f14479z0 = runnable;
    }

    public void setVideoTimelineView(xb xbVar) {
        this.G = xbVar;
        if (xbVar != null) {
            xbVar.setDelegate(new u0(this, 2));
        }
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 == 8) {
            set(null);
        }
    }

    public final void t(x7 x7Var, Runnable runnable, long j3) {
        org.telegram.ui.Components.ba baVar;
        long j10;
        boolean z10;
        ArrayList arrayList;
        org.telegram.ui.Components.ga gaVar;
        float f10 = 0.0f;
        if (x7Var != null && !x7Var.v()) {
            h61 h61Var = this.f14451e;
            if (h61Var != null) {
                h61Var.m0();
                this.f14451e = null;
            }
            h61 h61Var2 = new h61();
            this.f14451e = h61Var2;
            h61Var2.E = true;
            h61Var2.K = new h6.m(this, x7Var, new Runnable[]{runnable}, 2);
            x51 x51Var = this.f14461n;
            if (x51Var != null) {
                x51Var.clearAnimation();
                x51 x51Var2 = this.f14461n;
                bz bzVar = x51Var2.f41850b;
                if (bzVar != null) {
                    bzVar.postRunnable(new yy(bzVar, 0));
                }
                x51Var2.f41849a = null;
                removeView(this.f14461n);
                this.f14461n = null;
            }
            this.f14461n = new x51(getContext(), this.f14451e);
            this.H.e();
            x51 x51Var3 = this.f14461n;
            if (x7Var.f15775u) {
                baVar = null;
            } else {
                baVar = this.H;
            }
            x51Var3.f41856s = baVar;
            bz bzVar2 = x51Var3.f41850b;
            if (bzVar2 != null && (gaVar = bzVar2.J) != null) {
                org.telegram.ui.Components.ba baVar2 = gaVar.f35392t;
                if (baVar2 != null && baVar2.f33717m != null) {
                    baVar2.f33717m = null;
                }
                gaVar.f35392t = baVar;
                if (baVar != null && baVar.f33717m != gaVar) {
                    baVar.f33717m = gaVar;
                    baVar.d();
                }
            }
            this.f14461n.setOpaque(false);
            b();
            e6 e6Var = this.I;
            if (e6Var != null && e6Var.f14374g) {
                e6Var.a(this.f14461n);
            } else {
                x51 x51Var4 = this.f14461n;
                if (runnable != null) {
                    f10 = 1.0f;
                }
                x51Var4.setAlpha(f10);
                addView(this.f14461n, c8.na.e(-2, -2, 51));
            }
            ai.d0 d0Var = new ai.d0(this, 29);
            w7 w7Var = x7Var.f15743d1;
            if (w7Var != null) {
                d0Var.a(w7Var);
            } else if (x7Var.K && Build.VERSION.SDK_INT >= 24) {
                Utilities.f22877e.c(new s7(x7Var, d0Var, 0));
            } else {
                ?? obj = new Object();
                x7Var.f15743d1 = obj;
                d0Var.a(obj);
            }
            File file = x7Var.Z0;
            if (file == null) {
                file = x7Var.L;
            }
            this.f14451e.j0(Uri.fromFile(file), "other");
            this.f14451e.u0(this.A0.isEmpty());
            this.f14451e.s0(true);
            if (x7Var.h) {
                j10 = (x7Var.Z * ((float) x7Var.f15751h0)) + ((float) j3);
            } else {
                j10 = j3;
            }
            int i7 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i7 > 0) {
                this.f14451e.q0(j10, false);
            }
            c();
            w(true);
            if (x7Var.f15775u && (arrayList = x7Var.v) != null && arrayList.size() == 1 && ((fj) x7Var.v.get(0)).D == 5) {
                z10 = true;
            } else {
                z10 = false;
            }
            xb xbVar = this.G;
            File file2 = x7Var.Z0;
            if (file2 == null) {
                file2 = x7Var.L;
            }
            xbVar.o(z10, file2.getAbsolutePath(), getDuration(), x7Var.P);
            this.G.setVideoLeft(x7Var.Z);
            this.G.setVideoRight(x7Var.f15734a0);
            xb xbVar2 = this.G;
            if (xbVar2 != null && i7 > 0) {
                xbVar2.setProgress(j10);
                return;
            }
            return;
        }
        h61 h61Var3 = this.f14451e;
        if (h61Var3 != null) {
            h61Var3.g0();
            this.f14451e.m0();
            this.f14451e = null;
        }
        e6 e6Var2 = this.I;
        if (e6Var2 != null && e6Var2.f14374g) {
            e6Var2.a(null);
        } else {
            x51 x51Var5 = this.f14461n;
            if (x51Var5 != null) {
                x51Var5.clearAnimation();
                this.f14461n.animate().alpha(0.0f).withEndAction(new d6(this, 5)).start();
            }
        }
        xb xbVar3 = this.G;
        if (xbVar3 != null) {
            xbVar3.o(false, null, 1L, 0.0f);
        }
        org.telegram.messenger.g0.r(this.L);
        if (runnable != null) {
            org.telegram.messenger.g0.g3(runnable);
        }
    }

    public final void u(x7 x7Var) {
        Drawable drawable = this.T;
        this.S = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (x7Var == null) {
            this.T = null;
            return;
        }
        long j3 = x7Var.f15785z0;
        if (j3 != Long.MIN_VALUE) {
            Drawable e10 = e(this.T, x7Var.f15733a, j3, x7Var.f15783y0);
            x7Var.f15781x0 = e10;
            this.T = e10;
            if (this.S != e10) {
                this.S = null;
            }
            if (e10 != null) {
                e10.setCallback(this);
            }
            org.telegram.ui.Components.ba baVar = this.H;
            if (baVar != null) {
                Drawable drawable2 = this.T;
                if (drawable2 != null) {
                    if (drawable2 instanceof BitmapDrawable) {
                        baVar.f(((BitmapDrawable) drawable2).getBitmap(), false);
                    } else {
                        int intrinsicWidth = drawable2.getIntrinsicWidth();
                        int intrinsicHeight = this.T.getIntrinsicHeight();
                        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                            intrinsicWidth = 1080;
                            intrinsicHeight = 1920;
                        }
                        float f10 = intrinsicWidth;
                        float f11 = intrinsicHeight;
                        float max = Math.max(100.0f / f10, 100.0f / f11);
                        if (max > 1.0f) {
                            intrinsicWidth = (int) (f10 * max);
                            intrinsicHeight = (int) (f11 * max);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                        this.T.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                        this.T.draw(new Canvas(createBitmap));
                        baVar.f(createBitmap, true);
                    }
                } else {
                    baVar.f(null, false);
                }
            }
            invalidate();
            return;
        }
        this.T = null;
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z10;
        double d;
        float f10;
        x7 x7Var;
        PointF pointF;
        boolean z11;
        boolean z12;
        if (this.f14460l0) {
            if (motionEvent.getPointerCount() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            PointF pointF2 = this.f14462n0;
            if (z10) {
                pointF2.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                pointF2.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                f10 = a8.x9.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                d = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
            } else {
                pointF2.x = motionEvent.getX(0);
                pointF2.y = motionEvent.getY(0);
                d = 0.0d;
                f10 = 0.0f;
            }
            boolean z13 = this.f14465q0;
            PointF pointF3 = this.m0;
            if (z13 != z10) {
                pointF3.x = pointF2.x;
                pointF3.y = pointF2.y;
                this.f14463o0 = f10;
                this.f14464p0 = d;
                this.f14465q0 = z10;
            }
            if (this.d != null) {
                float width = x7Var.f15753i0 / getWidth();
                int actionMasked = motionEvent.getActionMasked();
                Matrix matrix = this.f14470t0;
                if (actionMasked == 0) {
                    this.f14472v0 = 0.0f;
                    this.f14474w0 = false;
                    invalidate();
                    this.f14476x0 = true;
                    matrix.set(this.d.f15762n0);
                }
                if (motionEvent.getActionMasked() == 2 && this.f14476x0 && this.d != null) {
                    float f11 = pointF2.x * width;
                    float f12 = pointF2.y * width;
                    float f13 = pointF3.x * width;
                    float f14 = pointF3.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f15 = this.f14463o0;
                        if (f15 != 0.0f) {
                            float f16 = f10 / f15;
                            matrix.postScale(f16, f16, f11, f12);
                        }
                        pointF = pointF2;
                        float degrees = (float) Math.toDegrees(d - this.f14464p0);
                        float f17 = this.f14472v0 + degrees;
                        this.f14472v0 = f17;
                        if (!this.f14469s0) {
                            if (Math.abs(f17) > 20.0f) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.f14469s0 = z11;
                            if (!z11) {
                                d(matrix);
                                if ((Math.round(this.f14452e0 / 90.0f) * 90.0f) - this.f14452e0 > 20.0f) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                this.f14469s0 = z12;
                            }
                            if (!this.f14474w0) {
                                org.telegram.messenger.g0.a4(this);
                                this.f14474w0 = true;
                            }
                        }
                        if (this.f14469s0) {
                            matrix.postRotate(degrees, f11, f12);
                        }
                        this.f14467r0 = true;
                    } else {
                        pointF = pointF2;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.f14467r0) {
                        matrix.postTranslate(f11 - f13, f12 - f14);
                    }
                    Matrix matrix2 = this.f14471u0;
                    matrix2.set(matrix);
                    Matrix matrix3 = this.f14445a0;
                    matrix3.set(matrix);
                    d(matrix3);
                    float round = (Math.round(this.f14452e0 / 90.0f) * 90.0f) - this.f14452e0;
                    if (this.f14469s0) {
                        if (Math.abs(round) < 3.5f) {
                            matrix2.postRotate(round, this.f14449c0, this.f14450d0);
                            if (!this.f14474w0) {
                                org.telegram.messenger.g0.a4(this);
                                this.f14474w0 = true;
                            }
                        } else {
                            this.f14474w0 = false;
                        }
                    }
                    this.d.f15762n0.set(matrix2);
                    this.d.f15754j = true;
                    b();
                    invalidate();
                } else {
                    pointF = pointF2;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getPointerCount() <= 1) {
                        this.f14467r0 = false;
                        nb nbVar = ((bb) this).D0;
                        nbVar.f15102p1.a(true, false, nbVar.f15085j0);
                        nbVar.f15102p1.b(nbVar.f15067d1.getText());
                    }
                    this.f14476x0 = false;
                    this.f14469s0 = false;
                    this.f14472v0 = 0.0f;
                    this.f14474w0 = false;
                    invalidate();
                }
                PointF pointF4 = pointF;
                pointF3.x = pointF4.x;
                pointF3.y = pointF4.y;
                this.f14463o0 = f10;
                this.f14464p0 = d;
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
        throw new UnsupportedOperationException("Method not decompiled: hi.f6.w(boolean):void");
    }

    public final void x(int i7, boolean z10) {
        HashSet hashSet = this.A0;
        if (z10) {
            hashSet.add(Integer.valueOf(i7));
        } else {
            hashSet.remove(Integer.valueOf(i7));
        }
        h61 h61Var = this.f14451e;
        if (h61Var != null) {
            h61Var.u0(hashSet.isEmpty());
        }
        n0 n0Var = this.F;
        if (n0Var != null) {
            n0Var.setPlaying(hashSet.isEmpty());
        }
        w(true);
        y(true);
    }

    public final void y(boolean z10) {
        long S;
        boolean d02;
        float f10;
        boolean z11;
        int i7;
        if (this.f14477y != null && this.d != null) {
            boolean z12 = true;
            if (this.f14451e == null && !j()) {
                this.f14477y.u0(this.A0.isEmpty());
                this.f14477y.s0(true);
                tg.w1 w1Var = this.f14475x;
                if (w1Var != null && !w1Var.D0) {
                    w1Var.D0 = true;
                    w1Var.E0.f(true, true);
                    w1Var.invalidate();
                }
                long S2 = this.f14477y.S();
                if (z10 && this.f14477y.U() != -9223372036854775807L) {
                    float U = ((float) S2) / ((float) this.f14477y.U());
                    x7 x7Var = this.d;
                    if ((U < x7Var.f15772s0 || U > x7Var.f15774t0) && System.currentTimeMillis() - this.K > 500) {
                        this.K = System.currentTimeMillis();
                        this.f14477y.q0(-this.d.f15770r0, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (j()) {
                S = this.F.getPositionWithOffset();
                d02 = this.F.f14987r0;
            } else {
                S = this.f14451e.S();
                d02 = this.f14451e.d0();
            }
            x7 x7Var2 = this.d;
            float f11 = x7Var2.f15774t0;
            float f12 = x7Var2.f15772s0;
            long j3 = (f11 - f12) * ((float) x7Var2.f15768q0);
            long j10 = x7Var2.f15770r0;
            if (S >= j10 && S <= j3 + j10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!d02 || !z11) {
                z12 = false;
            }
            long j11 = (S - j10) + (f12 * f10);
            tg.w1 w1Var2 = this.f14475x;
            if (w1Var2 != null && w1Var2.D0 != z11) {
                w1Var2.D0 = z11;
                w1Var2.invalidate();
            }
            if (this.f14477y.d0() != z12) {
                this.f14477y.u0(z12);
                this.f14477y.q0(j11, false);
            } else if (z10) {
                long abs = Math.abs(this.f14477y.S() - j11);
                if (j()) {
                    i7 = 300;
                } else {
                    i7 = 120;
                }
                if (abs > i7) {
                    this.f14477y.q0(j11, false);
                }
            }
        }
    }
}
