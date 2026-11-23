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
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.messenger.xe;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.y51;
public abstract class w5 extends FrameLayout {
    public static final int C0 = 0;
    public final HashSet A0;
    public k0 B0;
    public i61 E;
    public f0 F;
    public db G;
    public final org.telegram.ui.Components.ca H;
    public final v5 I;
    public long J;
    public long K;
    public final t5 L;
    public final t5 M;
    public final t5 N;
    public s8 O;
    public boolean P;
    public final org.telegram.ui.Components.d6 Q;
    public final Paint R;
    public Drawable S;
    public Drawable T;
    public final Paint U;
    public int V;
    public int W;
    public Bitmap f15594a;
    public final Matrix f15595a0;
    public final Rect f15596b;
    public final float[] f15597b0;
    public final Rect f15598c;
    public float f15599c0;
    public d7 d;
    public float f15600d0;
    public i61 f15601e;
    public float f15602e0;
    public int f15603f;
    public boolean f15604f0;
    public final org.telegram.ui.Components.d6 f15605g0;
    public int h;
    public boolean f15606h0;
    public final Matrix f15607i0;
    public final Matrix f15608j0;
    public final Matrix f15609k0;
    public boolean f15610l0;
    public final PointF m0;
    public y51 f15611n;
    public final PointF f15612n0;
    public float f15613o0;
    public double f15614p0;
    public boolean f15615q0;
    public TextureView f15616r;
    public boolean f15617r0;
    public ee0 f15618s;
    public boolean f15619s0;
    public final Matrix f15620t0;
    public final Matrix f15621u0;
    public float f15622v0;
    public s8 f15623w;
    public boolean f15624w0;
    public tg.t1 f15625x;
    public boolean f15626x0;
    public i61 f15627y;
    public long f15628y0;
    public Runnable f15629z0;

    public w5(Context context, org.telegram.ui.Components.ca caVar, v5 v5Var) {
        super(context);
        this.f15596b = new Rect();
        this.f15598c = new Rect();
        Paint paint = new Paint(1);
        new t5(this, 2);
        this.L = new t5(this, 3);
        this.M = new t5(this, 4);
        this.N = new t5(this, 5);
        this.Q = new org.telegram.ui.Components.d6(this, 0L, 350L, nr.h);
        this.R = new Paint(7);
        this.U = new Paint(1);
        this.f15595a0 = new Matrix();
        this.f15597b0 = new float[2];
        this.f15604f0 = true;
        this.f15605g0 = new org.telegram.ui.Components.d6(this, 0L, 320L, nr.f37918g);
        this.f15606h0 = false;
        this.f15607i0 = new Matrix();
        this.f15608j0 = new Matrix();
        this.f15609k0 = new Matrix();
        this.f15610l0 = true;
        this.m0 = new PointF();
        this.f15612n0 = new PointF();
        this.f15620t0 = new Matrix();
        this.f15621u0 = new Matrix();
        this.A0 = new HashSet();
        this.H = caVar;
        this.I = v5Var;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(org.telegram.messenger.g0.L(3.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), 1073741824);
    }

    public static void a(hi.w5 r13, hi.d7 r14) {
        throw new UnsupportedOperationException("Method not decompiled: hi.w5.a(hi.w5, hi.d7):void");
    }

    public static Drawable e(Drawable drawable, int i7, long j3, boolean z10) {
        TLRPC.WallPaper wallPaper = null;
        if (j3 == Long.MIN_VALUE) {
            return null;
        }
        if (j3 >= 0) {
            TLRPC.UserFull d2 = np.u1(i7).d2(j3);
            if (d2 != null) {
                wallPaper = d2.wallpaper;
            }
        } else {
            TLRPC.ChatFull P0 = np.u1(i7).P0(-j3);
            if (P0 != null) {
                wallPaper = P0.wallpaper;
            }
        }
        return f(drawable, i7, wallPaper, z10);
    }

    public static android.graphics.drawable.Drawable f(android.graphics.drawable.Drawable r5, int r6, org.telegram.tgnet.TLRPC.WallPaper r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: hi.w5.f(android.graphics.drawable.Drawable, int, org.telegram.tgnet.TLRPC$WallPaper, boolean):android.graphics.drawable.Drawable");
    }

    public static Drawable g(int i7, final org.telegram.ui.ActionBar.s3 s3Var, final boolean z10) {
        if (s3Var.l()) {
            org.telegram.ui.ActionBar.m6.I(org.telegram.ui.ActionBar.s3.d(z10), s3Var.g(i7, z10 ? 1 : 0), ((org.telegram.ui.ActionBar.r3) s3Var.f29953f.get(z10 ? 1 : 0)).f29929g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray g10 = s3Var.g(i7, z10 ? 1 : 0);
        int i10 = org.telegram.ui.ActionBar.m6.Ee;
        int i11 = g10.get(i10, org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        int i12 = org.telegram.ui.ActionBar.m6.Fe;
        int i13 = g10.get(i12, org.telegram.ui.ActionBar.m6.x0(null, i12, false));
        int i14 = org.telegram.ui.ActionBar.m6.Ge;
        int i15 = g10.get(i14, org.telegram.ui.ActionBar.m6.x0(null, i14, false));
        int i16 = org.telegram.ui.ActionBar.m6.He;
        int i17 = g10.get(i16, org.telegram.ui.ActionBar.m6.x0(null, i16, false));
        final cb0 cb0Var = new cb0();
        cb0Var.f34116g = false;
        cb0Var.s(s3Var.j(z10 ? 1 : 0).settings.intensity, cb0Var.f34129u);
        cb0Var.o(i11, i13, i15, i17, 0, true);
        cb0Var.u(0);
        final int f10 = cb0Var.f();
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
                        cb0 cb0Var2 = cb0Var;
                        cb0Var2.s(i18, bitmap);
                        cb0Var2.t(f10);
                        cb0Var2.r(1.0f);
                    }
                }
            }

            @Override
            public final void onError(Throwable th2) {
                org.telegram.tgnet.k.a(this, th2);
            }

            @Override
            public final void onError(TLRPC.TL_error tL_error) {
                org.telegram.tgnet.k.b(this, tL_error);
            }
        });
        return cb0Var;
    }

    private void setupCollage(d7 d7Var) {
        ArrayList<d7> arrayList;
        db dbVar = this.G;
        if (dbVar != null) {
            if (d7Var != null) {
                arrayList = d7Var.T;
            } else {
                arrayList = null;
            }
            dbVar.setCollage(arrayList);
        }
    }

    private void setupImage(d7 d7Var) {
        Utilities.f22776g.c(new q1(5, this, d7Var));
    }

    public abstract void b();

    public final void c() {
        float f10;
        float f11;
        d7 d7Var;
        i61 i61Var = this.f15601e;
        float f12 = 0.0f;
        if (i61Var != null) {
            if (!this.P && ((d7Var = this.d) == null || !d7Var.Y)) {
                if (d7Var != null) {
                    f11 = d7Var.P;
                } else {
                    f11 = 1.0f;
                }
            } else {
                f11 = 0.0f;
            }
            i61Var.B0(f11);
        }
        i61 i61Var2 = this.f15627y;
        if (i61Var2 != null) {
            if (this.P) {
                f10 = 0.0f;
            } else {
                d7 d7Var2 = this.d;
                if (d7Var2 != null) {
                    f10 = d7Var2.f14405u0;
                } else {
                    f10 = 1.0f;
                }
            }
            i61Var2.B0(f10);
        }
        i61 i61Var3 = this.E;
        if (i61Var3 != null) {
            if (!this.P) {
                d7 d7Var3 = this.d;
                if (d7Var3 != null) {
                    f12 = d7Var3.G;
                } else {
                    f12 = 1.0f;
                }
            }
            i61Var3.B0(f12);
        }
        f0 f0Var = this.F;
        if (f0Var != null) {
            f0Var.setMuted(this.P);
        }
    }

    public final void d(Matrix matrix) {
        d7 d7Var = this.d;
        if (d7Var == null) {
            return;
        }
        float[] fArr = this.f15597b0;
        fArr[0] = d7Var.f14386k0 / 2.0f;
        fArr[1] = d7Var.f14388l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f15599c0 = fArr[0];
        this.f15600d0 = fArr[1];
        d7 d7Var2 = this.d;
        fArr[0] = d7Var2.f14386k0;
        fArr[1] = d7Var2.f14388l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f15602e0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.f15600d0, fArr[0] - this.f15599c0));
        a8.x9.a(this.f15599c0, this.f15600d0, fArr[0], fArr[1]);
        d7 d7Var3 = this.d;
        fArr[0] = d7Var3.f14386k0 / 2.0f;
        fArr[1] = d7Var3.f14388l0;
        matrix.mapPoints(fArr);
        a8.x9.a(this.f15599c0, this.f15600d0, fArr[0], fArr[1]);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        d7 d7Var;
        xe xeVar;
        if (this.T != null) {
            float f10 = 0.0f;
            if (this.f15606h0) {
                Path path = new Path();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.T;
            if (!(drawable instanceof cb0) || ((cb0) drawable).f34129u != null) {
                f10 = this.Q.e(false, 1.0f);
            }
            Drawable drawable2 = this.S;
            if (drawable2 != null && f10 < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - f10) * 255.0f));
                d7.j(canvas, this.S, getWidth(), getHeight());
            }
            this.T.setAlpha((int) (f10 * 255.0f));
            d7.j(canvas, this.T, getWidth(), getHeight());
            if (this.f15606h0) {
                canvas.restore();
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.U);
        }
        k0 k0Var = this.B0;
        if (k0Var != null) {
            k0Var.d.b(canvas2, true);
        } else if (this.f15604f0 && this.d != null && !j()) {
            if (this.f15594a == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d = this.f15605g0.d(z10);
            if (this.f15594a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.f14382i0, getHeight() / this.d.f14384j0);
                canvas2.concat(this.d.f14391n0);
                if (this.d.m0 != null) {
                    canvas2.translate(d7Var.f14386k0 / 2.0f, d7Var.f14388l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    d7 d7Var2 = this.d;
                    int i7 = d7Var2.f14386k0;
                    int i10 = d7Var2.f14388l0;
                    int i11 = d7Var2.Q;
                    xe xeVar2 = d7Var2.m0;
                    if (((i11 + xeVar2.f27845k) / 90) % 2 == 1) {
                        i10 = i7;
                        i7 = i10;
                    }
                    float f11 = xeVar2.f27841e;
                    float f12 = xeVar2.f27842f;
                    float f13 = i7;
                    float f14 = i10;
                    canvas2.clipRect(((-i7) * f11) / 2.0f, ((-i10) * f12) / 2.0f, (f11 * f13) / 2.0f, (f12 * f14) / 2.0f);
                    float f15 = this.d.m0.f27840c;
                    canvas2.scale(f15, f15);
                    xe xeVar3 = this.d.m0;
                    canvas2.translate(xeVar3.f27838a * f13, xeVar3.f27839b * f14);
                    canvas2.rotate(this.d.m0.d + xeVar.f27845k);
                    if (this.d.m0.f27846l) {
                        canvas2.scale(-1.0f, 1.0f);
                    }
                    canvas2.rotate(this.d.Q);
                    d7 d7Var3 = this.d;
                    canvas2.translate((-d7Var3.f14386k0) / 2.0f, (-d7Var3.f14388l0) / 2.0f);
                }
                Paint paint = this.R;
                paint.setAlpha((int) ((1.0f - d) * 255.0f));
                int width = this.f15594a.getWidth();
                int height = this.f15594a.getHeight();
                Rect rect = this.f15596b;
                rect.set(0, 0, width, height);
                d7 d7Var4 = this.d;
                int i12 = d7Var4.f14386k0;
                int i13 = d7Var4.f14388l0;
                Rect rect2 = this.f15598c;
                rect2.set(0, 0, i12, i13);
                canvas2.drawBitmap(this.f15594a, rect, rect2, paint);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: hi.w5.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        d7 d7Var;
        d7 d7Var2;
        y51 y51Var = this.f15611n;
        if (view == y51Var && (d7Var2 = this.d) != null && d7Var2.f14404u) {
            return false;
        }
        if ((view == y51Var || view == this.f15616r) && (d7Var = this.d) != null && d7Var.m0 != null) {
            canvas.save();
            canvas.scale(getWidth() / this.d.f14382i0, getHeight() / this.d.f14384j0);
            canvas.concat(this.d.f14391n0);
            d7 d7Var3 = this.d;
            if (d7Var3.m0 != null) {
                canvas.translate(d7Var3.f14386k0 / 2.0f, d7Var3.f14388l0 / 2.0f);
                canvas.rotate(-this.d.Q);
                d7 d7Var4 = this.d;
                int i7 = d7Var4.f14386k0;
                int i10 = d7Var4.f14388l0;
                int i11 = d7Var4.Q;
                xe xeVar = d7Var4.m0;
                if (((i11 + xeVar.f27845k) / 90) % 2 == 1) {
                    i10 = i7;
                    i7 = i10;
                }
                float f10 = xeVar.f27841e;
                float f11 = xeVar.f27842f;
                canvas.clipRect(((-i7) * f10) / 2.0f, ((-i10) * f11) / 2.0f, (i7 * f10) / 2.0f, (i10 * f11) / 2.0f);
                canvas.rotate(this.d.Q);
                d7 d7Var5 = this.d;
                canvas.translate((-d7Var5.f14386k0) / 2.0f, (-d7Var5.f14388l0) / 2.0f);
            }
            canvas.concat(this.f15607i0);
            canvas.scale(1.0f / (getWidth() / this.d.f14382i0), 1.0f / (getHeight() / this.d.f14384j0));
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public int getContentHeight() {
        d7 d7Var = this.d;
        if (d7Var == null) {
            return 1;
        }
        return d7Var.f14388l0;
    }

    public int getContentWidth() {
        d7 d7Var = this.d;
        if (d7Var == null) {
            return 1;
        }
        return d7Var.f14386k0;
    }

    public long getCurrentPosition() {
        i61 i61Var = this.f15601e;
        if (i61Var != null) {
            return i61Var.S();
        }
        i61 i61Var2 = this.f15627y;
        if (i61Var2 != null) {
            return i61Var2.S();
        }
        i61 i61Var3 = this.E;
        if (i61Var3 != null) {
            return i61Var3.S();
        }
        return 0L;
    }

    public long getDuration() {
        d7 d7Var = this.d;
        if (d7Var != null) {
            double d = d7Var.f14381i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        i61 i61Var = this.f15601e;
        if (i61Var != null && i61Var.U() != -9223372036854775807L) {
            return this.f15601e.U();
        }
        return 1L;
    }

    public int getOrientation() {
        d7 d7Var = this.d;
        if (d7Var == null) {
            return 0;
        }
        return d7Var.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        if (this.d == null) {
            return new Pair<>(1080, 1920);
        }
        return new Pair<>(Integer.valueOf(this.d.f14382i0), Integer.valueOf(this.d.f14384j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.f15594a;
    }

    public y51 getTextureView() {
        return this.f15611n;
    }

    public final void h(y10 y10Var, View... viewArr) {
        y51 y51Var;
        int L = (int) (org.telegram.messenger.g0.L(26.0f) * org.telegram.messenger.g0.f24009p);
        int L2 = (int) (org.telegram.messenger.g0.L(30.33f) * org.telegram.messenger.g0.f24009p);
        int L3 = (int) (org.telegram.messenger.g0.L(4.0f) * org.telegram.messenger.g0.f24009p);
        ?? r52 = new Bitmap[viewArr.length];
        for (int i7 = 0; i7 < viewArr.length; i7++) {
            View view = viewArr[i7];
            if (view != null && view.getWidth() >= 0 && viewArr[i7].getHeight() > 0) {
                View view2 = viewArr[i7];
                if (view2 == this && (y51Var = this.f15611n) != null) {
                    r52[i7] = y51Var.getBitmap();
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
        Utilities.f22774e.c(new s5(L, L2, L3, r52, y10Var, 0));
    }

    public abstract void i();

    public final boolean j() {
        d7 d7Var;
        if (this.F != null && (d7Var = this.d) != null && d7Var.v()) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        return !this.A0.contains(-9982);
    }

    public final void l(d7 d7Var) {
        this.d = d7Var;
        if (d7Var == null) {
            setupImage(null);
            u(null);
            this.U.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (d7Var.K) {
            setupImage(d7Var);
            if (d7Var.A0 == 0 && d7Var.B0 == 0) {
                d7Var.z(new t5((ha) this, 0));
            } else {
                r();
            }
        } else {
            setupImage(d7Var);
            r();
        }
        b();
        u(d7Var);
        p(d7Var, false);
        s(d7Var, null, false);
    }

    public final void m(long j3) {
        i61 i61Var = this.f15601e;
        if (i61Var != null) {
            i61Var.q0(j3, false);
        } else if (j()) {
            this.F.m(j3, false);
        } else {
            i61 i61Var2 = this.f15627y;
            if (i61Var2 != null) {
                i61Var2.q0(j3, false);
            } else {
                i61 i61Var3 = this.E;
                if (i61Var3 != null) {
                    i61Var3.q0(j3, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(d7 d7Var, y8 y8Var, long j3) {
        this.d = d7Var;
        if (d7Var == null) {
            t(null, y8Var, j3);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.U.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (d7Var.v()) {
            setupImage(null);
            t(null, y8Var, j3);
            setupCollage(d7Var);
        } else if (d7Var.K) {
            setupImage(d7Var);
            setupCollage(null);
            t(d7Var, y8Var, j3);
            if (d7Var.A0 == 0 && d7Var.B0 == 0) {
                d7Var.z(new t5(this, 1));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, y8Var, 0L);
            setupImage(d7Var);
            r();
        }
        b();
        u(d7Var);
        p(d7Var, false);
        s(d7Var, null, false);
    }

    public final void o(TextureView textureView, ee0 ee0Var) {
        TextureView textureView2 = this.f15616r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.f15616r = null;
        }
        this.f15618s = ee0Var;
        this.f15616r = textureView;
        if (ee0Var != null) {
            int i7 = this.V;
            int i10 = this.W;
            ez ezVar = ee0Var.m0;
            if (ezVar != null) {
                ezVar.h(i7, i10);
            } else {
                ee0Var.K0 = i7;
                ee0Var.L0 = i10;
            }
        }
        TextureView textureView3 = this.f15616r;
        if (textureView3 != null) {
            addView(textureView3);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f15610l0) {
            v(motionEvent);
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void p(d7 d7Var, boolean z10) {
        boolean z11;
        String str;
        float f10;
        float f11;
        float f12;
        i61 i61Var = this.E;
        if (i61Var != null) {
            i61Var.g0();
            this.E.m0();
            this.E = null;
        }
        if (d7Var != null) {
            db dbVar = this.G;
            boolean z12 = false;
            if (dbVar != null) {
                String str2 = d7Var.f14411y;
                String str3 = d7Var.A;
                String str4 = d7Var.B;
                long j3 = d7Var.C;
                long j10 = d7Var.D;
                float f13 = d7Var.E;
                float f14 = d7Var.F;
                float f15 = d7Var.G;
                if (!TextUtils.equals(dbVar.P, str2)) {
                    wa waVar = dbVar.f14425b0;
                    if (waVar != null) {
                        waVar.a();
                        dbVar.f14425b0 = null;
                        dbVar.V = false;
                    }
                    dbVar.P = str2;
                    dbVar.p();
                }
                dbVar.P = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                dbVar.O = !isEmpty;
                if (isEmpty) {
                    dbVar.Q = false;
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
                if (dbVar.O) {
                    dbVar.S = j3;
                    dbVar.R = j10 - (((float) j3) * f13);
                    dbVar.T = f13;
                    dbVar.U = f14;
                    dbVar.W = f15;
                    float f16 = 0.0f;
                    if (str != null) {
                        StaticLayout staticLayout = new StaticLayout(str, dbVar.M0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        dbVar.N0 = staticLayout;
                        if (staticLayout.getLineCount() > 0) {
                            f11 = dbVar.N0.getLineWidth(0);
                        } else {
                            f11 = 0.0f;
                        }
                        dbVar.O0 = f11;
                        if (dbVar.N0.getLineCount() > 0) {
                            f12 = dbVar.N0.getLineLeft(0);
                        } else {
                            f12 = 0.0f;
                        }
                        dbVar.P0 = f12;
                    } else {
                        dbVar.O0 = 0.0f;
                        dbVar.N0 = null;
                    }
                    if (str4 != null) {
                        StaticLayout staticLayout2 = new StaticLayout(str4, dbVar.Q0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        dbVar.R0 = staticLayout2;
                        if (staticLayout2.getLineCount() > 0) {
                            f10 = dbVar.R0.getLineWidth(0);
                        } else {
                            f10 = 0.0f;
                        }
                        dbVar.S0 = f10;
                        if (dbVar.R0.getLineCount() > 0) {
                            f16 = dbVar.R0.getLineLeft(0);
                        }
                        dbVar.T0 = f16;
                    } else {
                        dbVar.S0 = 0.0f;
                        dbVar.R0 = null;
                    }
                }
                if (!z10) {
                    z11 = true;
                    dbVar.f14436f0.f(dbVar.O, true);
                } else {
                    z11 = true;
                }
                dbVar.invalidate();
            } else {
                z11 = true;
            }
            if (d7Var.f14411y != null) {
                i61 i61Var2 = new i61();
                this.E = i61Var2;
                i61Var2.E = z11;
                i61Var2.K = new x4(this, 1);
                i61Var2.j0(Uri.fromFile(new File(d7Var.f14411y)), "other");
                c();
                if (this.f15601e != null && getDuration() > 0) {
                    long duration = d7Var.Z * ((float) getDuration());
                    this.f15601e.q0(duration, false);
                    this.G.setProgress(duration);
                }
                z11 = true;
                w(true);
            }
            ta taVar = ((ha) this).D0;
            v9 v9Var = taVar.f15459w1;
            if (v9Var != null) {
                d7 d7Var2 = taVar.L1;
                if (d7Var2 != null && d7Var2.f14411y != null) {
                    z12 = z11;
                }
                v9Var.setHasAudio(z12);
            }
        }
    }

    public final void q(gj gjVar) {
        long j3;
        int maxCount;
        d7 d7Var = this.d;
        if (d7Var != null) {
            d7Var.f14383j = true;
            float f10 = 1.0f;
            if (gjVar != null) {
                int i7 = gjVar.K1;
                if (gjVar.f24177k != null) {
                    TLRPC.Document F0 = gjVar.F0();
                    if (F0 != null && F0.f28404id != 0) {
                        this.d.f14413z = new TLRPC.TL_inputDocument();
                        TLRPC.InputDocument inputDocument = this.d.f14413z;
                        inputDocument.f28410id = F0.f28404id;
                        inputDocument.file_reference = F0.file_reference;
                        inputDocument.access_hash = F0.access_hash;
                    }
                    int i10 = 0;
                    if (!TextUtils.isEmpty(gjVar.f24177k.attachPath)) {
                        this.d.f14411y = gjVar.f24177k.attachPath;
                    } else {
                        org.telegram.messenger.w7.G(i7);
                        File J = org.telegram.messenger.w7.J(F0, null, false, true);
                        if (J == null || !J.exists()) {
                            org.telegram.messenger.w7.G(i7);
                            J = org.telegram.messenger.w7.J(F0, null, true, true);
                            if (J != null && J.exists()) {
                                this.d.f14411y = J.getAbsolutePath();
                            } else {
                                d7 d7Var2 = this.d;
                                d7Var2.f14411y = null;
                                d7Var2.f14413z = null;
                                d7Var2.A = null;
                                d7Var2.B = null;
                                d7Var2.D = 0L;
                                d7Var2.C = 0L;
                                d7Var2.E = 0.0f;
                                d7Var2.F = 1.0f;
                                return;
                            }
                        }
                        this.d.f14411y = J.getAbsolutePath();
                    }
                    d7 d7Var3 = this.d;
                    d7Var3.A = null;
                    d7Var3.B = null;
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
                    d7 d7Var4 = this.d;
                    d7Var4.D = 0L;
                    if (d7Var4.K) {
                        d7Var4.D = d7Var4.Z * ((float) getDuration());
                    }
                    this.d.E = 0.0f;
                    if (j()) {
                        ArrayList arrayList2 = this.F.h;
                        int size2 = arrayList2.size();
                        while (i10 < size2) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            d7 d7Var5 = ((e0) obj).f14494n;
                            if (d7Var5 != null && d7Var5.K) {
                                j3 = this.F.getDuration();
                                break;
                            }
                        }
                    }
                    d7 d7Var6 = this.d;
                    if (d7Var6.K) {
                        j3 = getDuration();
                    } else {
                        j3 = d7Var6.C;
                    }
                    db dbVar = this.G;
                    if (dbVar == null) {
                        maxCount = 1;
                    } else {
                        maxCount = dbVar.getMaxCount();
                    }
                    d7 d7Var7 = this.d;
                    if (d7Var7.C != 0) {
                        f10 = Math.min(1.0f, ((float) Math.min(j3, maxCount * 59000)) / ((float) this.d.C));
                    }
                    d7Var7.F = f10;
                }
            }
            d7Var.f14411y = null;
            d7Var.f14413z = null;
            d7Var.A = null;
            d7Var.B = null;
            d7Var.D = 0L;
            d7Var.C = 0L;
            d7Var.E = 0.0f;
            d7Var.F = 1.0f;
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
            i7 = org.telegram.messenger.g0.f24010q.y;
        }
        d7 d7Var = this.d;
        int i10 = d7Var.A0;
        Paint paint = this.U;
        if (i10 != 0 && d7Var.B0 != 0) {
            float f10 = i7;
            d7 d7Var2 = this.d;
            int i11 = d7Var2.A0;
            this.V = i11;
            int i12 = d7Var2.B0;
            this.W = i12;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f10, new int[]{i11, i12}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            y51 y51Var = this.f15611n;
            if (y51Var != null) {
                int i13 = this.V;
                int i14 = this.W;
                ez ezVar = y51Var.f42300b;
                if (ezVar == null) {
                    y51Var.f42304n = i13;
                    y51Var.f42305r = i14;
                } else {
                    ezVar.h(i13, i14);
                }
            }
            ee0 ee0Var = this.f15618s;
            if (ee0Var != null) {
                int i15 = this.V;
                int i16 = this.W;
                ez ezVar2 = ee0Var.m0;
                if (ezVar2 != null) {
                    ezVar2.h(i15, i16);
                } else {
                    ee0Var.K0 = i15;
                    ee0Var.L0 = i16;
                }
            }
        } else {
            Bitmap bitmap = this.f15594a;
            if (bitmap != null) {
                new r3(this, i7, 1).a(c8.k0.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        }
        invalidate();
    }

    public final void s(d7 d7Var, tg.t1 t1Var, boolean z10) {
        i61 i61Var;
        if (d7Var != null && d7Var.f14393o0 != null) {
            i61 i61Var2 = this.f15627y;
            if (i61Var2 != null) {
                i61Var2.m0();
                this.f15627y = null;
            }
            i61 i61Var3 = new i61();
            this.f15627y = i61Var3;
            i61Var3.E = true;
            i61Var3.K = new h9.g1(this, 3);
            this.f15627y.j0(Uri.fromFile(d7Var.f14393o0), "other");
            c();
            this.f15625x = t1Var;
            if (t1Var != null && (i61Var = this.f15627y) != null) {
                i61Var.A0(t1Var.f58146v0);
            }
            this.G.n(d7Var.f14393o0.getAbsolutePath(), d7Var.f14397q0, d7Var.f14399r0, d7Var.f14401s0, d7Var.f14403t0, d7Var.f14405u0, z10);
            y(true);
            return;
        }
        i61 i61Var4 = this.f15627y;
        if (i61Var4 != null) {
            i61Var4.g0();
            this.f15627y.m0();
            this.f15627y = null;
        }
        db dbVar = this.G;
        if (dbVar != null) {
            dbVar.setRoundNull(z10);
        }
        this.f15625x = null;
        org.telegram.messenger.g0.r(this.L);
    }

    public void set(d7 d7Var) {
        n(d7Var, null, 0L);
    }

    public void setAllowCropping(boolean z10) {
        this.f15610l0 = z10;
    }

    public void setCollageView(f0 f0Var) {
        this.F = f0Var;
    }

    public void setCropEditorDrawing(k0 k0Var) {
        if (this.B0 != k0Var) {
            this.B0 = k0Var;
            invalidate();
        }
    }

    public void setDraw(boolean z10) {
        this.f15604f0 = z10;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.f15629z0 = runnable;
    }

    public void setVideoTimelineView(db dbVar) {
        this.G = dbVar;
        if (dbVar != null) {
            dbVar.setDelegate(new u5(this, 0));
        }
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 == 8) {
            set(null);
        }
    }

    public final void t(d7 d7Var, Runnable runnable, long j3) {
        org.telegram.ui.Components.ca caVar;
        boolean z10;
        ArrayList arrayList;
        org.telegram.ui.Components.ha haVar;
        float f10 = 0.0f;
        if (d7Var != null && !d7Var.v()) {
            i61 i61Var = this.f15601e;
            if (i61Var != null) {
                i61Var.m0();
                this.f15601e = null;
            }
            i61 i61Var2 = new i61();
            this.f15601e = i61Var2;
            i61Var2.E = true;
            i61Var2.K = new h6.m(this, d7Var, new Runnable[]{runnable}, 1);
            y51 y51Var = this.f15611n;
            if (y51Var != null) {
                y51Var.clearAnimation();
                y51 y51Var2 = this.f15611n;
                ez ezVar = y51Var2.f42300b;
                if (ezVar != null) {
                    ezVar.postRunnable(new bz(ezVar, 0));
                }
                y51Var2.f42299a = null;
                removeView(this.f15611n);
                this.f15611n = null;
            }
            this.f15611n = new y51(getContext(), this.f15601e);
            this.H.e();
            y51 y51Var3 = this.f15611n;
            if (d7Var.f14404u) {
                caVar = null;
            } else {
                caVar = this.H;
            }
            y51Var3.f42306s = caVar;
            ez ezVar2 = y51Var3.f42300b;
            if (ezVar2 != null && (haVar = ezVar2.J) != null) {
                org.telegram.ui.Components.ca caVar2 = haVar.f35809t;
                if (caVar2 != null && caVar2.f34099m != null) {
                    caVar2.f34099m = null;
                }
                haVar.f35809t = caVar;
                if (caVar != null && caVar.f34099m != haVar) {
                    caVar.f34099m = haVar;
                    caVar.d();
                }
            }
            this.f15611n.setOpaque(false);
            b();
            v5 v5Var = this.I;
            if (v5Var != null && v5Var.f15531g) {
                v5Var.a(this.f15611n);
            } else {
                y51 y51Var4 = this.f15611n;
                if (runnable != null) {
                    f10 = 1.0f;
                }
                y51Var4.setAlpha(f10);
                addView(this.f15611n, c8.na.e(-2, -2, 51));
            }
            ai.c0 c0Var = new ai.c0(this, 29);
            c7 c7Var = d7Var.f14372d1;
            if (c7Var != null) {
                c0Var.a(c7Var);
            } else if (d7Var.K && Build.VERSION.SDK_INT >= 24) {
                Utilities.f22774e.c(new y6(d7Var, c0Var, 0));
            } else {
                ?? obj = new Object();
                d7Var.f14372d1 = obj;
                c0Var.a(obj);
            }
            File file = d7Var.Z0;
            if (file == null) {
                file = d7Var.L;
            }
            this.f15601e.j0(Uri.fromFile(file), "other");
            this.f15601e.u0(this.A0.isEmpty());
            this.f15601e.s0(true);
            if (d7Var.h) {
                j3 = (d7Var.Z * ((float) d7Var.f14380h0)) + ((float) j3);
            }
            int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i7 > 0) {
                this.f15601e.q0(j3, false);
            }
            c();
            w(true);
            if (d7Var.f14404u && (arrayList = d7Var.v) != null && arrayList.size() == 1 && ((gj) d7Var.v.get(0)).D == 5) {
                z10 = true;
            } else {
                z10 = false;
            }
            db dbVar = this.G;
            File file2 = d7Var.Z0;
            if (file2 == null) {
                file2 = d7Var.L;
            }
            dbVar.o(z10, file2.getAbsolutePath(), getDuration(), d7Var.P);
            this.G.setVideoLeft(d7Var.Z);
            this.G.setVideoRight(d7Var.f14363a0);
            db dbVar2 = this.G;
            if (dbVar2 != null && i7 > 0) {
                dbVar2.setProgress(j3);
                return;
            }
            return;
        }
        i61 i61Var3 = this.f15601e;
        if (i61Var3 != null) {
            i61Var3.g0();
            this.f15601e.m0();
            this.f15601e = null;
        }
        v5 v5Var2 = this.I;
        if (v5Var2 != null && v5Var2.f15531g) {
            v5Var2.a(null);
        } else {
            y51 y51Var5 = this.f15611n;
            if (y51Var5 != null) {
                y51Var5.clearAnimation();
                this.f15611n.animate().alpha(0.0f).withEndAction(new t5(this, 6)).start();
            }
        }
        db dbVar3 = this.G;
        if (dbVar3 != null) {
            dbVar3.o(false, null, 1L, 0.0f);
        }
        org.telegram.messenger.g0.r(this.L);
        if (runnable != null) {
            org.telegram.messenger.g0.g3(runnable);
        }
    }

    public final void u(d7 d7Var) {
        Drawable drawable = this.T;
        this.S = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (d7Var == null) {
            this.T = null;
            return;
        }
        long j3 = d7Var.f14414z0;
        if (j3 != Long.MIN_VALUE) {
            Drawable e10 = e(this.T, d7Var.f14362a, j3, d7Var.f14412y0);
            d7Var.f14410x0 = e10;
            this.T = e10;
            if (this.S != e10) {
                this.S = null;
            }
            if (e10 != null) {
                e10.setCallback(this);
            }
            org.telegram.ui.Components.ca caVar = this.H;
            if (caVar != null) {
                Drawable drawable2 = this.T;
                if (drawable2 != null) {
                    if (drawable2 instanceof BitmapDrawable) {
                        caVar.f(((BitmapDrawable) drawable2).getBitmap(), false);
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
                        caVar.f(createBitmap, true);
                    }
                } else {
                    caVar.f(null, false);
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
        d7 d7Var;
        PointF pointF;
        boolean z11;
        boolean z12;
        if (this.f15610l0) {
            if (motionEvent.getPointerCount() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            PointF pointF2 = this.f15612n0;
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
            boolean z13 = this.f15615q0;
            PointF pointF3 = this.m0;
            if (z13 != z10) {
                pointF3.x = pointF2.x;
                pointF3.y = pointF2.y;
                this.f15613o0 = f10;
                this.f15614p0 = d;
                this.f15615q0 = z10;
            }
            if (this.d != null) {
                float width = d7Var.f14382i0 / getWidth();
                int actionMasked = motionEvent.getActionMasked();
                Matrix matrix = this.f15620t0;
                if (actionMasked == 0) {
                    this.f15622v0 = 0.0f;
                    this.f15624w0 = false;
                    invalidate();
                    this.f15626x0 = true;
                    matrix.set(this.d.f14391n0);
                }
                if (motionEvent.getActionMasked() == 2 && this.f15626x0 && this.d != null) {
                    float f11 = pointF2.x * width;
                    float f12 = pointF2.y * width;
                    float f13 = pointF3.x * width;
                    float f14 = pointF3.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f15 = this.f15613o0;
                        if (f15 != 0.0f) {
                            float f16 = f10 / f15;
                            matrix.postScale(f16, f16, f11, f12);
                        }
                        pointF = pointF2;
                        float degrees = (float) Math.toDegrees(d - this.f15614p0);
                        float f17 = this.f15622v0 + degrees;
                        this.f15622v0 = f17;
                        if (!this.f15619s0) {
                            if (Math.abs(f17) > 20.0f) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.f15619s0 = z11;
                            if (!z11) {
                                d(matrix);
                                if ((Math.round(this.f15602e0 / 90.0f) * 90.0f) - this.f15602e0 > 20.0f) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                this.f15619s0 = z12;
                            }
                            if (!this.f15624w0) {
                                org.telegram.messenger.g0.a4(this);
                                this.f15624w0 = true;
                            }
                        }
                        if (this.f15619s0) {
                            matrix.postRotate(degrees, f11, f12);
                        }
                        this.f15617r0 = true;
                    } else {
                        pointF = pointF2;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.f15617r0) {
                        matrix.postTranslate(f11 - f13, f12 - f14);
                    }
                    Matrix matrix2 = this.f15621u0;
                    matrix2.set(matrix);
                    Matrix matrix3 = this.f15595a0;
                    matrix3.set(matrix);
                    d(matrix3);
                    float round = (Math.round(this.f15602e0 / 90.0f) * 90.0f) - this.f15602e0;
                    if (this.f15619s0) {
                        if (Math.abs(round) < 3.5f) {
                            matrix2.postRotate(round, this.f15599c0, this.f15600d0);
                            if (!this.f15624w0) {
                                org.telegram.messenger.g0.a4(this);
                                this.f15624w0 = true;
                            }
                        } else {
                            this.f15624w0 = false;
                        }
                    }
                    this.d.f14391n0.set(matrix2);
                    this.d.f14383j = true;
                    b();
                    invalidate();
                } else {
                    pointF = pointF2;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getPointerCount() <= 1) {
                        this.f15617r0 = false;
                        ta taVar = ((ha) this).D0;
                        taVar.f15435p1.a(true, false, taVar.f15418j0);
                        taVar.f15435p1.b(taVar.f15400d1.getText());
                    }
                    this.f15626x0 = false;
                    this.f15619s0 = false;
                    this.f15622v0 = 0.0f;
                    this.f15624w0 = false;
                    invalidate();
                }
                PointF pointF4 = pointF;
                pointF3.x = pointF4.x;
                pointF3.y = pointF4.y;
                this.f15613o0 = f10;
                this.f15614p0 = d;
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
        throw new UnsupportedOperationException("Method not decompiled: hi.w5.w(boolean):void");
    }

    public final void x(int i7, boolean z10) {
        HashSet hashSet = this.A0;
        if (z10) {
            hashSet.add(Integer.valueOf(i7));
        } else {
            hashSet.remove(Integer.valueOf(i7));
        }
        i61 i61Var = this.f15601e;
        if (i61Var != null) {
            i61Var.u0(hashSet.isEmpty());
        }
        f0 f0Var = this.F;
        if (f0Var != null) {
            f0Var.setPlaying(hashSet.isEmpty());
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
        if (this.f15627y != null && this.d != null) {
            boolean z12 = true;
            if (this.f15601e == null && !j()) {
                this.f15627y.u0(this.A0.isEmpty());
                this.f15627y.s0(true);
                tg.t1 t1Var = this.f15625x;
                if (t1Var != null && !t1Var.C0) {
                    t1Var.C0 = true;
                    t1Var.D0.f(true, true);
                    t1Var.invalidate();
                }
                long S2 = this.f15627y.S();
                if (z10 && this.f15627y.U() != -9223372036854775807L) {
                    float U = ((float) S2) / ((float) this.f15627y.U());
                    d7 d7Var = this.d;
                    if ((U < d7Var.f14401s0 || U > d7Var.f14403t0) && System.currentTimeMillis() - this.K > 500) {
                        this.K = System.currentTimeMillis();
                        this.f15627y.q0(-this.d.f14399r0, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (j()) {
                S = this.F.getPositionWithOffset();
                d02 = this.F.f14582r0;
            } else {
                S = this.f15601e.S();
                d02 = this.f15601e.d0();
            }
            d7 d7Var2 = this.d;
            float f11 = d7Var2.f14403t0;
            float f12 = d7Var2.f14401s0;
            long j3 = (f11 - f12) * ((float) d7Var2.f14397q0);
            long j10 = d7Var2.f14399r0;
            if (S >= j10 && S <= j3 + j10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!d02 || !z11) {
                z12 = false;
            }
            long j11 = (S - j10) + (f12 * f10);
            tg.t1 t1Var2 = this.f15625x;
            if (t1Var2 != null && t1Var2.C0 != z11) {
                t1Var2.C0 = z11;
                t1Var2.invalidate();
            }
            if (this.f15627y.d0() != z12) {
                this.f15627y.u0(z12);
                this.f15627y.q0(j11, false);
            } else if (z10) {
                long abs = Math.abs(this.f15627y.S() - j11);
                if (j()) {
                    i7 = 300;
                } else {
                    i7 = 120;
                }
                if (abs > i7) {
                    this.f15627y.q0(j11, false);
                }
            }
        }
    }
}
