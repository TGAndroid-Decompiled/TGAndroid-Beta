package fi;

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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.ye;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.py;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.xq;
public abstract class y5 extends FrameLayout {
    public static final int B0 = 0;
    public j0 A0;
    public u51 D;
    public e0 E;
    public fb F;
    public final org.telegram.ui.Components.y9 G;
    public final x5 H;
    public long I;
    public long J;
    public final w5 K;
    public final w5 L;
    public final w5 M;
    public u8 N;
    public boolean O;
    public final org.telegram.ui.Components.w5 P;
    public final Paint Q;
    public Drawable R;
    public Drawable S;
    public final Paint T;
    public int U;
    public int V;
    public final Matrix W;
    public Bitmap f13162a;
    public final float[] f13163a0;
    public final Rect f13164b;
    public float f13165b0;
    public final Rect f13166c;
    public float f13167c0;
    public e7 d;
    public float f13168d0;
    public u51 f13169e;
    public boolean f13170e0;
    public int f13171f;
    public final org.telegram.ui.Components.w5 f13172f0;
    public boolean f13173g0;
    public int h;
    public final Matrix f13174h0;
    public final Matrix f13175i0;
    public final Matrix f13176j0;
    public boolean f13177k0;
    public final PointF f13178l0;
    public final PointF m0;
    public i51 f13179n;
    public float f13180n0;
    public double f13181o0;
    public boolean f13182p0;
    public boolean f13183q0;
    public TextureView f13184r;
    public boolean f13185r0;
    public td0 f13186s;
    public final Matrix f13187s0;
    public final Matrix f13188t0;
    public float f13189u0;
    public boolean f13190v0;
    public u8 f13191w;
    public boolean f13192w0;
    public tg.r1 f13193x;
    public long f13194x0;
    public u51 f13195y;
    public Runnable f13196y0;
    public final HashSet f13197z0;

    public y5(Context context, org.telegram.ui.Components.y9 y9Var, x5 x5Var) {
        super(context);
        this.f13164b = new Rect();
        this.f13166c = new Rect();
        Paint paint = new Paint(1);
        new w5(this, 2);
        this.K = new w5(this, 3);
        this.L = new w5(this, 4);
        this.M = new w5(this, 5);
        this.P = new org.telegram.ui.Components.w5(this, 0L, 350L, xq.h);
        this.Q = new Paint(7);
        this.T = new Paint(1);
        this.W = new Matrix();
        this.f13163a0 = new float[2];
        this.f13170e0 = true;
        this.f13172f0 = new org.telegram.ui.Components.w5(this, 0L, 320L, xq.f40459g);
        this.f13173g0 = false;
        this.f13174h0 = new Matrix();
        this.f13175i0 = new Matrix();
        this.f13176j0 = new Matrix();
        this.f13177k0 = true;
        this.f13178l0 = new PointF();
        this.m0 = new PointF();
        this.f13187s0 = new Matrix();
        this.f13188t0 = new Matrix();
        this.f13197z0 = new HashSet();
        this.G = y9Var;
        this.H = x5Var;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(org.telegram.messenger.g0.L(3.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), 1073741824);
    }

    public static void a(fi.y5 r13, fi.e7 r14) {
        throw new UnsupportedOperationException("Method not decompiled: fi.y5.a(fi.y5, fi.e7):void");
    }

    public static Drawable e(Drawable drawable, int i7, long j3, boolean z9) {
        TLRPC.WallPaper wallPaper = null;
        if (j3 == Long.MIN_VALUE) {
            return null;
        }
        if (j3 >= 0) {
            TLRPC.UserFull b22 = qp.s1(i7).b2(j3);
            if (b22 != null) {
                wallPaper = b22.wallpaper;
            }
        } else {
            TLRPC.ChatFull N0 = qp.s1(i7).N0(-j3);
            if (N0 != null) {
                wallPaper = N0.wallpaper;
            }
        }
        return f(drawable, i7, wallPaper, z9);
    }

    public static android.graphics.drawable.Drawable f(android.graphics.drawable.Drawable r5, int r6, org.telegram.tgnet.TLRPC.WallPaper r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: fi.y5.f(android.graphics.drawable.Drawable, int, org.telegram.tgnet.TLRPC$WallPaper, boolean):android.graphics.drawable.Drawable");
    }

    public static Drawable g(int i7, final org.telegram.ui.ActionBar.r3 r3Var, final boolean z9) {
        if (r3Var.l()) {
            org.telegram.ui.ActionBar.l6.I(org.telegram.ui.ActionBar.r3.d(z9), r3Var.g(i7, z9 ? 1 : 0), ((org.telegram.ui.ActionBar.q3) r3Var.f28464f.get(z9 ? 1 : 0)).f28413g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray g10 = r3Var.g(i7, z9 ? 1 : 0);
        int i10 = org.telegram.ui.ActionBar.l6.Be;
        int i11 = g10.get(i10, org.telegram.ui.ActionBar.l6.x0(null, i10, false));
        int i12 = org.telegram.ui.ActionBar.l6.Ce;
        int i13 = g10.get(i12, org.telegram.ui.ActionBar.l6.x0(null, i12, false));
        int i14 = org.telegram.ui.ActionBar.l6.De;
        int i15 = g10.get(i14, org.telegram.ui.ActionBar.l6.x0(null, i14, false));
        int i16 = org.telegram.ui.ActionBar.l6.Ee;
        int i17 = g10.get(i16, org.telegram.ui.ActionBar.l6.x0(null, i16, false));
        final ra0 ra0Var = new ra0();
        ra0Var.f37621g = false;
        ra0Var.s(r3Var.j(z9 ? 1 : 0).settings.intensity, ra0Var.f37634u);
        ra0Var.o(i11, i13, i15, i17, 0, true);
        ra0Var.u(0);
        final int f10 = ra0Var.f();
        r3Var.n(z9 ? 1 : 0, new ResultCallback() {
            @Override
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair != null) {
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((gg.a) pair.second).f13953a;
                    org.telegram.ui.ActionBar.r3 r3Var2 = org.telegram.ui.ActionBar.r3.this;
                    if (longValue == r3Var2.h(z9 ? 1 : 0) && bitmap != null) {
                        int i18 = r3Var2.j(z9 ? 1 : 0).settings.intensity;
                        ra0 ra0Var2 = ra0Var;
                        ra0Var2.s(i18, bitmap);
                        ra0Var2.t(f10);
                        ra0Var2.r(1.0f);
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
        return ra0Var;
    }

    private void setupCollage(e7 e7Var) {
        ArrayList<e7> arrayList;
        fb fbVar = this.F;
        if (fbVar != null) {
            if (e7Var != null) {
                arrayList = e7Var.T;
            } else {
                arrayList = null;
            }
            fbVar.setCollage(arrayList);
        }
    }

    private void setupImage(e7 e7Var) {
        Utilities.f21338g.c(new f2.h(8, this, e7Var));
    }

    public abstract void b();

    public final void c() {
        float f10;
        float f11;
        e7 e7Var;
        u51 u51Var = this.f13169e;
        float f12 = 0.0f;
        if (u51Var != null) {
            if (!this.O && ((e7Var = this.d) == null || !e7Var.Y)) {
                if (e7Var != null) {
                    f11 = e7Var.P;
                } else {
                    f11 = 1.0f;
                }
            } else {
                f11 = 0.0f;
            }
            u51Var.B0(f11);
        }
        u51 u51Var2 = this.f13195y;
        if (u51Var2 != null) {
            if (this.O) {
                f10 = 0.0f;
            } else {
                e7 e7Var2 = this.d;
                if (e7Var2 != null) {
                    f10 = e7Var2.f11919u0;
                } else {
                    f10 = 1.0f;
                }
            }
            u51Var2.B0(f10);
        }
        u51 u51Var3 = this.D;
        if (u51Var3 != null) {
            if (!this.O) {
                e7 e7Var3 = this.d;
                if (e7Var3 != null) {
                    f12 = e7Var3.G;
                } else {
                    f12 = 1.0f;
                }
            }
            u51Var3.B0(f12);
        }
        e0 e0Var = this.E;
        if (e0Var != null) {
            e0Var.setMuted(this.O);
        }
    }

    public final void d(Matrix matrix) {
        e7 e7Var = this.d;
        if (e7Var == null) {
            return;
        }
        float[] fArr = this.f13163a0;
        fArr[0] = e7Var.f11900k0 / 2.0f;
        fArr[1] = e7Var.f11902l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f13165b0 = fArr[0];
        this.f13167c0 = fArr[1];
        e7 e7Var2 = this.d;
        fArr[0] = e7Var2.f11900k0;
        fArr[1] = e7Var2.f11902l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f13168d0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.f13167c0, fArr[0] - this.f13165b0));
        a8.r9.a(this.f13165b0, this.f13167c0, fArr[0], fArr[1]);
        e7 e7Var3 = this.d;
        fArr[0] = e7Var3.f11900k0 / 2.0f;
        fArr[1] = e7Var3.f11902l0;
        matrix.mapPoints(fArr);
        a8.r9.a(this.f13165b0, this.f13167c0, fArr[0], fArr[1]);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z9;
        e7 e7Var;
        ye yeVar;
        if (this.S != null) {
            float f10 = 0.0f;
            if (this.f13173g0) {
                Path path = new Path();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.S;
            if (!(drawable instanceof ra0) || ((ra0) drawable).f37634u != null) {
                f10 = this.P.e(false, 1.0f);
            }
            Drawable drawable2 = this.R;
            if (drawable2 != null && f10 < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - f10) * 255.0f));
                e7.j(canvas, this.R, getWidth(), getHeight());
            }
            this.S.setAlpha((int) (f10 * 255.0f));
            e7.j(canvas, this.S, getWidth(), getHeight());
            if (this.f13173g0) {
                canvas.restore();
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.T);
        }
        j0 j0Var = this.A0;
        if (j0Var != null) {
            j0Var.d.b(canvas2, true);
        } else if (this.f13170e0 && this.d != null && !j()) {
            if (this.f13162a == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            float d = this.f13172f0.d(z9);
            if (this.f13162a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.f11896i0, getHeight() / this.d.f11898j0);
                canvas2.concat(this.d.f11905n0);
                if (this.d.m0 != null) {
                    canvas2.translate(e7Var.f11900k0 / 2.0f, e7Var.f11902l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    e7 e7Var2 = this.d;
                    int i7 = e7Var2.f11900k0;
                    int i10 = e7Var2.f11902l0;
                    int i11 = e7Var2.Q;
                    ye yeVar2 = e7Var2.m0;
                    if (((i11 + yeVar2.f26642k) / 90) % 2 == 1) {
                        i10 = i7;
                        i7 = i10;
                    }
                    float f11 = yeVar2.f26638e;
                    float f12 = yeVar2.f26639f;
                    float f13 = i7;
                    float f14 = i10;
                    canvas2.clipRect(((-i7) * f11) / 2.0f, ((-i10) * f12) / 2.0f, (f11 * f13) / 2.0f, (f12 * f14) / 2.0f);
                    float f15 = this.d.m0.f26637c;
                    canvas2.scale(f15, f15);
                    ye yeVar3 = this.d.m0;
                    canvas2.translate(yeVar3.f26635a * f13, yeVar3.f26636b * f14);
                    canvas2.rotate(this.d.m0.d + yeVar.f26642k);
                    if (this.d.m0.f26643l) {
                        canvas2.scale(-1.0f, 1.0f);
                    }
                    canvas2.rotate(this.d.Q);
                    e7 e7Var3 = this.d;
                    canvas2.translate((-e7Var3.f11900k0) / 2.0f, (-e7Var3.f11902l0) / 2.0f);
                }
                Paint paint = this.Q;
                paint.setAlpha((int) ((1.0f - d) * 255.0f));
                int width = this.f13162a.getWidth();
                int height = this.f13162a.getHeight();
                Rect rect = this.f13164b;
                rect.set(0, 0, width, height);
                e7 e7Var4 = this.d;
                int i12 = e7Var4.f11900k0;
                int i13 = e7Var4.f11902l0;
                Rect rect2 = this.f13166c;
                rect2.set(0, 0, i12, i13);
                canvas2.drawBitmap(this.f13162a, rect, rect2, paint);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: fi.y5.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        e7 e7Var;
        e7 e7Var2;
        i51 i51Var = this.f13179n;
        if (view == i51Var && (e7Var2 = this.d) != null && e7Var2.f11918u) {
            return false;
        }
        if ((view == i51Var || view == this.f13184r) && (e7Var = this.d) != null && e7Var.m0 != null) {
            canvas.save();
            canvas.scale(getWidth() / this.d.f11896i0, getHeight() / this.d.f11898j0);
            canvas.concat(this.d.f11905n0);
            e7 e7Var3 = this.d;
            if (e7Var3.m0 != null) {
                canvas.translate(e7Var3.f11900k0 / 2.0f, e7Var3.f11902l0 / 2.0f);
                canvas.rotate(-this.d.Q);
                e7 e7Var4 = this.d;
                int i7 = e7Var4.f11900k0;
                int i10 = e7Var4.f11902l0;
                int i11 = e7Var4.Q;
                ye yeVar = e7Var4.m0;
                if (((i11 + yeVar.f26642k) / 90) % 2 == 1) {
                    i10 = i7;
                    i7 = i10;
                }
                float f10 = yeVar.f26638e;
                float f11 = yeVar.f26639f;
                canvas.clipRect(((-i7) * f10) / 2.0f, ((-i10) * f11) / 2.0f, (i7 * f10) / 2.0f, (i10 * f11) / 2.0f);
                canvas.rotate(this.d.Q);
                e7 e7Var5 = this.d;
                canvas.translate((-e7Var5.f11900k0) / 2.0f, (-e7Var5.f11902l0) / 2.0f);
            }
            canvas.concat(this.f13174h0);
            canvas.scale(1.0f / (getWidth() / this.d.f11896i0), 1.0f / (getHeight() / this.d.f11898j0));
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public int getContentHeight() {
        e7 e7Var = this.d;
        if (e7Var == null) {
            return 1;
        }
        return e7Var.f11902l0;
    }

    public int getContentWidth() {
        e7 e7Var = this.d;
        if (e7Var == null) {
            return 1;
        }
        return e7Var.f11900k0;
    }

    public long getCurrentPosition() {
        u51 u51Var = this.f13169e;
        if (u51Var != null) {
            return u51Var.S();
        }
        u51 u51Var2 = this.f13195y;
        if (u51Var2 != null) {
            return u51Var2.S();
        }
        u51 u51Var3 = this.D;
        if (u51Var3 != null) {
            return u51Var3.S();
        }
        return 0L;
    }

    public long getDuration() {
        e7 e7Var = this.d;
        if (e7Var != null) {
            double d = e7Var.f11895i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        u51 u51Var = this.f13169e;
        if (u51Var != null && u51Var.U() != -9223372036854775807L) {
            return this.f13169e.U();
        }
        return 1L;
    }

    public int getOrientation() {
        e7 e7Var = this.d;
        if (e7Var == null) {
            return 0;
        }
        return e7Var.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        if (this.d == null) {
            return new Pair<>(1080, 1920);
        }
        return new Pair<>(Integer.valueOf(this.d.f11896i0), Integer.valueOf(this.d.f11898j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.f13162a;
    }

    public i51 getTextureView() {
        return this.f13179n;
    }

    public final void h(c20 c20Var, View... viewArr) {
        i51 i51Var;
        int L = (int) (org.telegram.messenger.g0.L(26.0f) * org.telegram.messenger.g0.f22562p);
        int L2 = (int) (org.telegram.messenger.g0.L(30.33f) * org.telegram.messenger.g0.f22562p);
        int L3 = (int) (org.telegram.messenger.g0.L(4.0f) * org.telegram.messenger.g0.f22562p);
        ?? r52 = new Bitmap[viewArr.length];
        for (int i7 = 0; i7 < viewArr.length; i7++) {
            View view = viewArr[i7];
            if (view != null && view.getWidth() >= 0 && viewArr[i7].getHeight() > 0) {
                View view2 = viewArr[i7];
                if (view2 == this && (i51Var = this.f13179n) != null) {
                    r52[i7] = i51Var.getBitmap();
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
        Utilities.f21336e.c(new v5(L, L2, L3, r52, c20Var, 0));
    }

    public abstract void i();

    public final boolean j() {
        e7 e7Var;
        if (this.E != null && (e7Var = this.d) != null && e7Var.v()) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        return !this.f13197z0.contains(-9982);
    }

    public final void l(e7 e7Var) {
        this.d = e7Var;
        if (e7Var == null) {
            setupImage(null);
            u(null);
            this.T.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (e7Var.K) {
            setupImage(e7Var);
            if (e7Var.A0 == 0 && e7Var.B0 == 0) {
                e7Var.z(new w5((ja) this, 0));
            } else {
                r();
            }
        } else {
            setupImage(e7Var);
            r();
        }
        b();
        u(e7Var);
        p(e7Var, false);
        s(e7Var, null, false);
    }

    public final void m(long j3) {
        u51 u51Var = this.f13169e;
        if (u51Var != null) {
            u51Var.q0(j3, false);
        } else if (j()) {
            this.E.m(j3, false);
        } else {
            u51 u51Var2 = this.f13195y;
            if (u51Var2 != null) {
                u51Var2.q0(j3, false);
            } else {
                u51 u51Var3 = this.D;
                if (u51Var3 != null) {
                    u51Var3.q0(j3, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(e7 e7Var, a9 a9Var, long j3) {
        this.d = e7Var;
        if (e7Var == null) {
            t(null, a9Var, j3);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.T.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (e7Var.v()) {
            setupImage(null);
            t(null, a9Var, j3);
            setupCollage(e7Var);
        } else if (e7Var.K) {
            setupImage(e7Var);
            setupCollage(null);
            t(e7Var, a9Var, j3);
            if (e7Var.A0 == 0 && e7Var.B0 == 0) {
                e7Var.z(new w5(this, 1));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, a9Var, 0L);
            setupImage(e7Var);
            r();
        }
        b();
        u(e7Var);
        p(e7Var, false);
        s(e7Var, null, false);
    }

    public final void o(TextureView textureView, td0 td0Var) {
        TextureView textureView2 = this.f13184r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.f13184r = null;
        }
        this.f13186s = td0Var;
        this.f13184r = textureView;
        if (td0Var != null) {
            int i7 = this.U;
            int i10 = this.V;
            sy syVar = td0Var.f38370l0;
            if (syVar != null) {
                syVar.h(i7, i10);
            } else {
                td0Var.J0 = i7;
                td0Var.K0 = i10;
            }
        }
        TextureView textureView3 = this.f13184r;
        if (textureView3 != null) {
            addView(textureView3);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f13177k0) {
            v(motionEvent);
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void p(e7 e7Var, boolean z9) {
        boolean z10;
        String str;
        float f10;
        float f11;
        float f12;
        u51 u51Var = this.D;
        if (u51Var != null) {
            u51Var.g0();
            this.D.m0();
            this.D = null;
        }
        if (e7Var != null) {
            fb fbVar = this.F;
            boolean z11 = false;
            if (fbVar != null) {
                String str2 = e7Var.f11925y;
                String str3 = e7Var.A;
                String str4 = e7Var.B;
                long j3 = e7Var.C;
                long j10 = e7Var.D;
                float f13 = e7Var.E;
                float f14 = e7Var.F;
                float f15 = e7Var.G;
                if (!TextUtils.equals(fbVar.O, str2)) {
                    ya yaVar = fbVar.f11994a0;
                    if (yaVar != null) {
                        yaVar.a();
                        fbVar.f11994a0 = null;
                        fbVar.U = false;
                    }
                    fbVar.O = str2;
                    fbVar.p();
                }
                fbVar.O = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                fbVar.N = !isEmpty;
                if (isEmpty) {
                    fbVar.P = false;
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
                if (fbVar.N) {
                    fbVar.R = j3;
                    fbVar.Q = j10 - (((float) j3) * f13);
                    fbVar.S = f13;
                    fbVar.T = f14;
                    fbVar.V = f15;
                    float f16 = 0.0f;
                    if (str != null) {
                        StaticLayout staticLayout = new StaticLayout(str, fbVar.L0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        fbVar.M0 = staticLayout;
                        if (staticLayout.getLineCount() > 0) {
                            f11 = fbVar.M0.getLineWidth(0);
                        } else {
                            f11 = 0.0f;
                        }
                        fbVar.N0 = f11;
                        if (fbVar.M0.getLineCount() > 0) {
                            f12 = fbVar.M0.getLineLeft(0);
                        } else {
                            f12 = 0.0f;
                        }
                        fbVar.O0 = f12;
                    } else {
                        fbVar.N0 = 0.0f;
                        fbVar.M0 = null;
                    }
                    if (str4 != null) {
                        StaticLayout staticLayout2 = new StaticLayout(str4, fbVar.P0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        fbVar.Q0 = staticLayout2;
                        if (staticLayout2.getLineCount() > 0) {
                            f10 = fbVar.Q0.getLineWidth(0);
                        } else {
                            f10 = 0.0f;
                        }
                        fbVar.R0 = f10;
                        if (fbVar.Q0.getLineCount() > 0) {
                            f16 = fbVar.Q0.getLineLeft(0);
                        }
                        fbVar.S0 = f16;
                    } else {
                        fbVar.R0 = 0.0f;
                        fbVar.Q0 = null;
                    }
                }
                if (!z9) {
                    z10 = true;
                    fbVar.f12005e0.f(fbVar.N, true);
                } else {
                    z10 = true;
                }
                fbVar.invalidate();
            } else {
                z10 = true;
            }
            if (e7Var.f11925y != null) {
                u51 u51Var2 = new u51();
                this.D = u51Var2;
                u51Var2.D = z10;
                u51Var2.J = new cb.c(this, 26);
                u51Var2.j0(Uri.fromFile(new File(e7Var.f11925y)), "other");
                c();
                if (this.f13169e != null && getDuration() > 0) {
                    long duration = e7Var.Z * ((float) getDuration());
                    this.f13169e.q0(duration, false);
                    this.F.setProgress(duration);
                }
                z10 = true;
                w(true);
            }
            va vaVar = ((ja) this).C0;
            x9 x9Var = vaVar.f13002v1;
            if (x9Var != null) {
                e7 e7Var2 = vaVar.K1;
                if (e7Var2 != null && e7Var2.f11925y != null) {
                    z11 = z10;
                }
                x9Var.setHasAudio(z11);
            }
        }
    }

    public final void q(ij ijVar) {
        long j3;
        int maxCount;
        e7 e7Var = this.d;
        if (e7Var != null) {
            e7Var.f11897j = true;
            float f10 = 1.0f;
            if (ijVar != null) {
                int i7 = ijVar.I1;
                if (ijVar.f23262k != null) {
                    TLRPC.Document F0 = ijVar.F0();
                    if (F0 != null && F0.f26962id != 0) {
                        this.d.f11927z = new TLRPC.TL_inputDocument();
                        TLRPC.InputDocument inputDocument = this.d.f11927z;
                        inputDocument.f26968id = F0.f26962id;
                        inputDocument.file_reference = F0.file_reference;
                        inputDocument.access_hash = F0.access_hash;
                    }
                    int i10 = 0;
                    if (!TextUtils.isEmpty(ijVar.f23262k.attachPath)) {
                        this.d.f11925y = ijVar.f23262k.attachPath;
                    } else {
                        org.telegram.messenger.w7.G(i7);
                        File J = org.telegram.messenger.w7.J(F0, null, false, true);
                        if (J == null || !J.exists()) {
                            org.telegram.messenger.w7.G(i7);
                            J = org.telegram.messenger.w7.J(F0, null, true, true);
                            if (J != null && J.exists()) {
                                this.d.f11925y = J.getAbsolutePath();
                            } else {
                                e7 e7Var2 = this.d;
                                e7Var2.f11925y = null;
                                e7Var2.f11927z = null;
                                e7Var2.A = null;
                                e7Var2.B = null;
                                e7Var2.D = 0L;
                                e7Var2.C = 0L;
                                e7Var2.E = 0.0f;
                                e7Var2.F = 1.0f;
                                return;
                            }
                        }
                        this.d.f11925y = J.getAbsolutePath();
                    }
                    e7 e7Var3 = this.d;
                    e7Var3.A = null;
                    e7Var3.B = null;
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
                    e7 e7Var4 = this.d;
                    e7Var4.D = 0L;
                    if (e7Var4.K) {
                        e7Var4.D = e7Var4.Z * ((float) getDuration());
                    }
                    this.d.E = 0.0f;
                    if (j()) {
                        ArrayList arrayList2 = this.E.h;
                        int size2 = arrayList2.size();
                        while (i10 < size2) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            e7 e7Var5 = ((d0) obj).f11779n;
                            if (e7Var5 != null && e7Var5.K) {
                                j3 = this.E.getDuration();
                                break;
                            }
                        }
                    }
                    e7 e7Var6 = this.d;
                    if (e7Var6.K) {
                        j3 = getDuration();
                    } else {
                        j3 = e7Var6.C;
                    }
                    fb fbVar = this.F;
                    if (fbVar == null) {
                        maxCount = 1;
                    } else {
                        maxCount = fbVar.getMaxCount();
                    }
                    e7 e7Var7 = this.d;
                    if (e7Var7.C != 0) {
                        f10 = Math.min(1.0f, ((float) Math.min(j3, maxCount * 59000)) / ((float) this.d.C));
                    }
                    e7Var7.F = f10;
                }
            }
            e7Var.f11925y = null;
            e7Var.f11927z = null;
            e7Var.A = null;
            e7Var.B = null;
            e7Var.D = 0L;
            e7Var.C = 0L;
            e7Var.E = 0.0f;
            e7Var.F = 1.0f;
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
            i7 = org.telegram.messenger.g0.f22563q.y;
        }
        e7 e7Var = this.d;
        int i10 = e7Var.A0;
        Paint paint = this.T;
        if (i10 != 0 && e7Var.B0 != 0) {
            float f10 = i7;
            e7 e7Var2 = this.d;
            int i11 = e7Var2.A0;
            this.U = i11;
            int i12 = e7Var2.B0;
            this.V = i12;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f10, new int[]{i11, i12}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            i51 i51Var = this.f13179n;
            if (i51Var != null) {
                int i13 = this.U;
                int i14 = this.V;
                sy syVar = i51Var.f34577b;
                if (syVar == null) {
                    i51Var.f34581n = i13;
                    i51Var.f34582r = i14;
                } else {
                    syVar.h(i13, i14);
                }
            }
            td0 td0Var = this.f13186s;
            if (td0Var != null) {
                int i15 = this.U;
                int i16 = this.V;
                sy syVar2 = td0Var.f38370l0;
                if (syVar2 != null) {
                    syVar2.h(i15, i16);
                } else {
                    td0Var.J0 = i15;
                    td0Var.K0 = i16;
                }
            }
        } else {
            Bitmap bitmap = this.f13162a;
            if (bitmap != null) {
                new t3(this, i7, 1).a(a8.ba.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        }
        invalidate();
    }

    public final void s(e7 e7Var, tg.r1 r1Var, boolean z9) {
        u51 u51Var;
        if (e7Var != null && e7Var.f11907o0 != null) {
            u51 u51Var2 = this.f13195y;
            if (u51Var2 != null) {
                u51Var2.m0();
                this.f13195y = null;
            }
            u51 u51Var3 = new u51();
            this.f13195y = u51Var3;
            u51Var3.D = true;
            u51Var3.J = new aa.n(this, 23);
            this.f13195y.j0(Uri.fromFile(e7Var.f11907o0), "other");
            c();
            this.f13193x = r1Var;
            if (r1Var != null && (u51Var = this.f13195y) != null) {
                u51Var.A0(r1Var.f55944u0);
            }
            this.F.n(e7Var.f11907o0.getAbsolutePath(), e7Var.f11911q0, e7Var.f11913r0, e7Var.f11915s0, e7Var.f11917t0, e7Var.f11919u0, z9);
            y(true);
            return;
        }
        u51 u51Var4 = this.f13195y;
        if (u51Var4 != null) {
            u51Var4.g0();
            this.f13195y.m0();
            this.f13195y = null;
        }
        fb fbVar = this.F;
        if (fbVar != null) {
            fbVar.setRoundNull(z9);
        }
        this.f13193x = null;
        org.telegram.messenger.g0.r(this.K);
    }

    public void set(e7 e7Var) {
        n(e7Var, null, 0L);
    }

    public void setAllowCropping(boolean z9) {
        this.f13177k0 = z9;
    }

    public void setCollageView(e0 e0Var) {
        this.E = e0Var;
    }

    public void setCropEditorDrawing(j0 j0Var) {
        if (this.A0 != j0Var) {
            this.A0 = j0Var;
            invalidate();
        }
    }

    public void setDraw(boolean z9) {
        this.f13170e0 = z9;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.f13196y0 = runnable;
    }

    public void setVideoTimelineView(fb fbVar) {
        this.F = fbVar;
        if (fbVar != null) {
            fbVar.setDelegate(new d6.i(this, 26));
        }
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 == 8) {
            set(null);
        }
    }

    public final void t(e7 e7Var, Runnable runnable, long j3) {
        org.telegram.ui.Components.y9 y9Var;
        boolean z9;
        ArrayList arrayList;
        org.telegram.ui.Components.da daVar;
        float f10 = 0.0f;
        if (e7Var != null && !e7Var.v()) {
            u51 u51Var = this.f13169e;
            if (u51Var != null) {
                u51Var.m0();
                this.f13169e = null;
            }
            u51 u51Var2 = new u51();
            this.f13169e = u51Var2;
            u51Var2.D = true;
            u51Var2.J = new android.support.v4.media.session.a0((FrameLayout) this, (Object) e7Var, (Serializable) new Runnable[]{runnable}, 26);
            i51 i51Var = this.f13179n;
            if (i51Var != null) {
                i51Var.clearAnimation();
                i51 i51Var2 = this.f13179n;
                sy syVar = i51Var2.f34577b;
                if (syVar != null) {
                    syVar.postRunnable(new py(syVar, 0));
                }
                i51Var2.f34576a = null;
                removeView(this.f13179n);
                this.f13179n = null;
            }
            this.f13179n = new i51(getContext(), this.f13169e);
            this.G.e();
            i51 i51Var3 = this.f13179n;
            if (e7Var.f11918u) {
                y9Var = null;
            } else {
                y9Var = this.G;
            }
            i51Var3.f34583s = y9Var;
            sy syVar2 = i51Var3.f34577b;
            if (syVar2 != null && (daVar = syVar2.I) != null) {
                org.telegram.ui.Components.y9 y9Var2 = daVar.f32913t;
                if (y9Var2 != null && y9Var2.f40681m != null) {
                    y9Var2.f40681m = null;
                }
                daVar.f32913t = y9Var;
                if (y9Var != null && y9Var.f40681m != daVar) {
                    y9Var.f40681m = daVar;
                    y9Var.d();
                }
            }
            this.f13179n.setOpaque(false);
            b();
            x5 x5Var = this.H;
            if (x5Var != null && x5Var.f13085g) {
                x5Var.a(this.f13179n);
            } else {
                i51 i51Var4 = this.f13179n;
                if (runnable != null) {
                    f10 = 1.0f;
                }
                i51Var4.setAlpha(f10);
                addView(this.f13179n, c8.ha.e(-2, -2, 51));
            }
            ai.i iVar = new ai.i(this, 24);
            d7 d7Var = e7Var.f11886d1;
            if (d7Var != null) {
                iVar.a(d7Var);
            } else if (e7Var.K && Build.VERSION.SDK_INT >= 24) {
                Utilities.f21336e.c(new z6(e7Var, iVar, 0));
            } else {
                ?? obj = new Object();
                e7Var.f11886d1 = obj;
                iVar.a(obj);
            }
            File file = e7Var.Z0;
            if (file == null) {
                file = e7Var.L;
            }
            this.f13169e.j0(Uri.fromFile(file), "other");
            this.f13169e.u0(this.f13197z0.isEmpty());
            this.f13169e.s0(true);
            if (e7Var.h) {
                j3 = (e7Var.Z * ((float) e7Var.f11894h0)) + ((float) j3);
            }
            int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i7 > 0) {
                this.f13169e.q0(j3, false);
            }
            c();
            w(true);
            if (e7Var.f11918u && (arrayList = e7Var.v) != null && arrayList.size() == 1 && ((ij) e7Var.v.get(0)).D == 5) {
                z9 = true;
            } else {
                z9 = false;
            }
            fb fbVar = this.F;
            File file2 = e7Var.Z0;
            if (file2 == null) {
                file2 = e7Var.L;
            }
            fbVar.o(z9, file2.getAbsolutePath(), getDuration(), e7Var.P);
            this.F.setVideoLeft(e7Var.Z);
            this.F.setVideoRight(e7Var.f11877a0);
            fb fbVar2 = this.F;
            if (fbVar2 != null && i7 > 0) {
                fbVar2.setProgress(j3);
                return;
            }
            return;
        }
        u51 u51Var3 = this.f13169e;
        if (u51Var3 != null) {
            u51Var3.g0();
            this.f13169e.m0();
            this.f13169e = null;
        }
        x5 x5Var2 = this.H;
        if (x5Var2 != null && x5Var2.f13085g) {
            x5Var2.a(null);
        } else {
            i51 i51Var5 = this.f13179n;
            if (i51Var5 != null) {
                i51Var5.clearAnimation();
                this.f13179n.animate().alpha(0.0f).withEndAction(new w5(this, 6)).start();
            }
        }
        fb fbVar3 = this.F;
        if (fbVar3 != null) {
            fbVar3.o(false, null, 1L, 0.0f);
        }
        org.telegram.messenger.g0.r(this.K);
        if (runnable != null) {
            org.telegram.messenger.g0.h3(runnable);
        }
    }

    public final void u(e7 e7Var) {
        Drawable drawable = this.S;
        this.R = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (e7Var == null) {
            this.S = null;
            return;
        }
        long j3 = e7Var.f11928z0;
        if (j3 != Long.MIN_VALUE) {
            Drawable e10 = e(this.S, e7Var.f11876a, j3, e7Var.f11926y0);
            e7Var.f11924x0 = e10;
            this.S = e10;
            if (this.R != e10) {
                this.R = null;
            }
            if (e10 != null) {
                e10.setCallback(this);
            }
            org.telegram.ui.Components.y9 y9Var = this.G;
            if (y9Var != null) {
                Drawable drawable2 = this.S;
                if (drawable2 != null) {
                    if (drawable2 instanceof BitmapDrawable) {
                        y9Var.f(((BitmapDrawable) drawable2).getBitmap(), false);
                    } else {
                        int intrinsicWidth = drawable2.getIntrinsicWidth();
                        int intrinsicHeight = this.S.getIntrinsicHeight();
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
                        this.S.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                        this.S.draw(new Canvas(createBitmap));
                        y9Var.f(createBitmap, true);
                    }
                } else {
                    y9Var.f(null, false);
                }
            }
            invalidate();
            return;
        }
        this.S = null;
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z9;
        double d;
        float f10;
        e7 e7Var;
        PointF pointF;
        boolean z10;
        boolean z11;
        if (this.f13177k0) {
            if (motionEvent.getPointerCount() > 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            PointF pointF2 = this.m0;
            if (z9) {
                pointF2.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                pointF2.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                f10 = a8.r9.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                d = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
            } else {
                pointF2.x = motionEvent.getX(0);
                pointF2.y = motionEvent.getY(0);
                d = 0.0d;
                f10 = 0.0f;
            }
            boolean z12 = this.f13182p0;
            PointF pointF3 = this.f13178l0;
            if (z12 != z9) {
                pointF3.x = pointF2.x;
                pointF3.y = pointF2.y;
                this.f13180n0 = f10;
                this.f13181o0 = d;
                this.f13182p0 = z9;
            }
            if (this.d != null) {
                float width = e7Var.f11896i0 / getWidth();
                int actionMasked = motionEvent.getActionMasked();
                Matrix matrix = this.f13187s0;
                if (actionMasked == 0) {
                    this.f13189u0 = 0.0f;
                    this.f13190v0 = false;
                    invalidate();
                    this.f13192w0 = true;
                    matrix.set(this.d.f11905n0);
                }
                if (motionEvent.getActionMasked() == 2 && this.f13192w0 && this.d != null) {
                    float f11 = pointF2.x * width;
                    float f12 = pointF2.y * width;
                    float f13 = pointF3.x * width;
                    float f14 = pointF3.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f15 = this.f13180n0;
                        if (f15 != 0.0f) {
                            float f16 = f10 / f15;
                            matrix.postScale(f16, f16, f11, f12);
                        }
                        pointF = pointF2;
                        float degrees = (float) Math.toDegrees(d - this.f13181o0);
                        float f17 = this.f13189u0 + degrees;
                        this.f13189u0 = f17;
                        if (!this.f13185r0) {
                            if (Math.abs(f17) > 20.0f) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.f13185r0 = z10;
                            if (!z10) {
                                d(matrix);
                                if ((Math.round(this.f13168d0 / 90.0f) * 90.0f) - this.f13168d0 > 20.0f) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                this.f13185r0 = z11;
                            }
                            if (!this.f13190v0) {
                                org.telegram.messenger.g0.c4(this);
                                this.f13190v0 = true;
                            }
                        }
                        if (this.f13185r0) {
                            matrix.postRotate(degrees, f11, f12);
                        }
                        this.f13183q0 = true;
                    } else {
                        pointF = pointF2;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.f13183q0) {
                        matrix.postTranslate(f11 - f13, f12 - f14);
                    }
                    Matrix matrix2 = this.f13188t0;
                    matrix2.set(matrix);
                    Matrix matrix3 = this.W;
                    matrix3.set(matrix);
                    d(matrix3);
                    float round = (Math.round(this.f13168d0 / 90.0f) * 90.0f) - this.f13168d0;
                    if (this.f13185r0) {
                        if (Math.abs(round) < 3.5f) {
                            matrix2.postRotate(round, this.f13165b0, this.f13167c0);
                            if (!this.f13190v0) {
                                org.telegram.messenger.g0.c4(this);
                                this.f13190v0 = true;
                            }
                        } else {
                            this.f13190v0 = false;
                        }
                    }
                    this.d.f11905n0.set(matrix2);
                    this.d.f11897j = true;
                    b();
                    invalidate();
                } else {
                    pointF = pointF2;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getPointerCount() <= 1) {
                        this.f13183q0 = false;
                        va vaVar = ((ja) this).C0;
                        vaVar.f12979o1.a(true, false, vaVar.f12962i0);
                        vaVar.f12979o1.b(vaVar.f12944c1.getText());
                    }
                    this.f13192w0 = false;
                    this.f13185r0 = false;
                    this.f13189u0 = 0.0f;
                    this.f13190v0 = false;
                    invalidate();
                }
                PointF pointF4 = pointF;
                pointF3.x = pointF4.x;
                pointF3.y = pointF4.y;
                this.f13180n0 = f10;
                this.f13181o0 = d;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.S != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void w(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: fi.y5.w(boolean):void");
    }

    public final void x(int i7, boolean z9) {
        HashSet hashSet = this.f13197z0;
        if (z9) {
            hashSet.add(Integer.valueOf(i7));
        } else {
            hashSet.remove(Integer.valueOf(i7));
        }
        u51 u51Var = this.f13169e;
        if (u51Var != null) {
            u51Var.u0(hashSet.isEmpty());
        }
        e0 e0Var = this.E;
        if (e0Var != null) {
            e0Var.setPlaying(hashSet.isEmpty());
        }
        w(true);
        y(true);
    }

    public final void y(boolean z9) {
        long S;
        boolean d02;
        float f10;
        boolean z10;
        int i7;
        if (this.f13195y != null && this.d != null) {
            boolean z11 = true;
            if (this.f13169e == null && !j()) {
                this.f13195y.u0(this.f13197z0.isEmpty());
                this.f13195y.s0(true);
                tg.r1 r1Var = this.f13193x;
                if (r1Var != null && !r1Var.B0) {
                    r1Var.B0 = true;
                    r1Var.C0.f(true, true);
                    r1Var.invalidate();
                }
                long S2 = this.f13195y.S();
                if (z9 && this.f13195y.U() != -9223372036854775807L) {
                    float U = ((float) S2) / ((float) this.f13195y.U());
                    e7 e7Var = this.d;
                    if ((U < e7Var.f11915s0 || U > e7Var.f11917t0) && System.currentTimeMillis() - this.J > 500) {
                        this.J = System.currentTimeMillis();
                        this.f13195y.q0(-this.d.f11913r0, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (j()) {
                S = this.E.getPositionWithOffset();
                d02 = this.E.f11843q0;
            } else {
                S = this.f13169e.S();
                d02 = this.f13169e.d0();
            }
            e7 e7Var2 = this.d;
            float f11 = e7Var2.f11917t0;
            float f12 = e7Var2.f11915s0;
            long j3 = (f11 - f12) * ((float) e7Var2.f11911q0);
            long j10 = e7Var2.f11913r0;
            if (S >= j10 && S <= j3 + j10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!d02 || !z10) {
                z11 = false;
            }
            long j11 = (S - j10) + (f12 * f10);
            tg.r1 r1Var2 = this.f13193x;
            if (r1Var2 != null && r1Var2.B0 != z10) {
                r1Var2.B0 = z10;
                r1Var2.invalidate();
            }
            if (this.f13195y.d0() != z11) {
                this.f13195y.u0(z11);
                this.f13195y.q0(j11, false);
            } else if (z9) {
                long abs = Math.abs(this.f13195y.S() - j11);
                if (j()) {
                    i7 = 300;
                } else {
                    i7 = 120;
                }
                if (abs > i7) {
                    this.f13195y.q0(j11, false);
                }
            }
        }
    }
}
