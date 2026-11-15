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
import org.telegram.messenger.z10;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.wy;
public abstract class x5 extends FrameLayout {
    public static final int C0 = 0;
    public final HashSet A0;
    public j0 B0;
    public u51 E;
    public e0 F;
    public cb G;
    public final org.telegram.ui.Components.u9 H;
    public final w5 I;
    public long J;
    public long K;
    public final v5 L;
    public final v5 M;
    public final v5 N;
    public s8 O;
    public boolean P;
    public final org.telegram.ui.Components.u5 Q;
    public final Paint R;
    public Drawable S;
    public Drawable T;
    public final Paint U;
    public int V;
    public int W;
    public Bitmap f15338a;
    public final Matrix f15339a0;
    public final Rect f15340b;
    public final float[] f15341b0;
    public final Rect f15342c;
    public float f15343c0;
    public d7 d;
    public float f15344d0;
    public u51 f15345e;
    public float f15346e0;
    public int f15347f;
    public boolean f15348f0;
    public final org.telegram.ui.Components.u5 f15349g0;
    public int h;
    public boolean f15350h0;
    public final Matrix f15351i0;
    public final Matrix f15352j0;
    public final Matrix f15353k0;
    public boolean f15354l0;
    public final PointF m0;
    public k51 f15355n;
    public final PointF f15356n0;
    public float f15357o0;
    public double f15358p0;
    public boolean f15359q0;
    public TextureView f15360r;
    public boolean f15361r0;
    public td0 f15362s;
    public boolean f15363s0;
    public final Matrix f15364t0;
    public final Matrix f15365u0;
    public float f15366v0;
    public s8 f15367w;
    public boolean f15368w0;
    public tg.r1 f15369x;
    public boolean f15370x0;
    public u51 f15371y;
    public long f15372y0;
    public Runnable f15373z0;

    public x5(Context context, org.telegram.ui.Components.u9 u9Var, w5 w5Var) {
        super(context);
        this.f15340b = new Rect();
        this.f15342c = new Rect();
        Paint paint = new Paint(1);
        new v5(this, 2);
        this.L = new v5(this, 3);
        this.M = new v5(this, 4);
        this.N = new v5(this, 5);
        this.Q = new org.telegram.ui.Components.u5(this, 0L, 350L, er.h);
        this.R = new Paint(7);
        this.U = new Paint(1);
        this.f15339a0 = new Matrix();
        this.f15341b0 = new float[2];
        this.f15348f0 = true;
        this.f15349g0 = new org.telegram.ui.Components.u5(this, 0L, 320L, er.f34420g);
        this.f15350h0 = false;
        this.f15351i0 = new Matrix();
        this.f15352j0 = new Matrix();
        this.f15353k0 = new Matrix();
        this.f15354l0 = true;
        this.m0 = new PointF();
        this.f15356n0 = new PointF();
        this.f15364t0 = new Matrix();
        this.f15365u0 = new Matrix();
        this.A0 = new HashSet();
        this.H = u9Var;
        this.I = w5Var;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(org.telegram.messenger.g0.L(3.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), 1073741824);
    }

    public static void a(hi.x5 r13, hi.d7 r14) {
        throw new UnsupportedOperationException("Method not decompiled: hi.x5.a(hi.x5, hi.d7):void");
    }

    public static Drawable e(Drawable drawable, int i7, long j3, boolean z10) {
        TLRPC.WallPaper wallPaper = null;
        if (j3 == Long.MIN_VALUE) {
            return null;
        }
        if (j3 >= 0) {
            TLRPC.UserFull b22 = np.s1(i7).b2(j3);
            if (b22 != null) {
                wallPaper = b22.wallpaper;
            }
        } else {
            TLRPC.ChatFull N0 = np.s1(i7).N0(-j3);
            if (N0 != null) {
                wallPaper = N0.wallpaper;
            }
        }
        return f(drawable, i7, wallPaper, z10);
    }

    public static android.graphics.drawable.Drawable f(android.graphics.drawable.Drawable r5, int r6, org.telegram.tgnet.TLRPC.WallPaper r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: hi.x5.f(android.graphics.drawable.Drawable, int, org.telegram.tgnet.TLRPC$WallPaper, boolean):android.graphics.drawable.Drawable");
    }

    public static Drawable g(int i7, final org.telegram.ui.ActionBar.p3 p3Var, final boolean z10) {
        if (p3Var.l()) {
            org.telegram.ui.ActionBar.j6.I(org.telegram.ui.ActionBar.p3.d(z10), p3Var.g(i7, z10 ? 1 : 0), ((org.telegram.ui.ActionBar.o3) p3Var.f29474f.get(z10 ? 1 : 0)).f29441g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray g10 = p3Var.g(i7, z10 ? 1 : 0);
        int i10 = org.telegram.ui.ActionBar.j6.Ee;
        int i11 = g10.get(i10, org.telegram.ui.ActionBar.j6.x0(null, i10, false));
        int i12 = org.telegram.ui.ActionBar.j6.Fe;
        int i13 = g10.get(i12, org.telegram.ui.ActionBar.j6.x0(null, i12, false));
        int i14 = org.telegram.ui.ActionBar.j6.Ge;
        int i15 = g10.get(i14, org.telegram.ui.ActionBar.j6.x0(null, i14, false));
        int i16 = org.telegram.ui.ActionBar.j6.He;
        int i17 = g10.get(i16, org.telegram.ui.ActionBar.j6.x0(null, i16, false));
        final ra0 ra0Var = new ra0();
        ra0Var.f38920g = false;
        ra0Var.s(p3Var.j(z10 ? 1 : 0).settings.intensity, ra0Var.f38933u);
        ra0Var.o(i11, i13, i15, i17, 0, true);
        ra0Var.u(0);
        final int f10 = ra0Var.f();
        p3Var.n(z10 ? 1 : 0, new ResultCallback() {
            @Override
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair != null) {
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((gg.a) pair.second).f13295a;
                    org.telegram.ui.ActionBar.p3 p3Var2 = org.telegram.ui.ActionBar.p3.this;
                    if (longValue == p3Var2.h(z10 ? 1 : 0) && bitmap != null) {
                        int i18 = p3Var2.j(z10 ? 1 : 0).settings.intensity;
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

    private void setupCollage(d7 d7Var) {
        ArrayList<d7> arrayList;
        cb cbVar = this.G;
        if (cbVar != null) {
            if (d7Var != null) {
                arrayList = d7Var.T;
            } else {
                arrayList = null;
            }
            cbVar.setCollage(arrayList);
        }
    }

    private void setupImage(d7 d7Var) {
        Utilities.f22418g.c(new h4(3, this, d7Var));
    }

    public abstract void b();

    public final void c() {
        float f10;
        float f11;
        d7 d7Var;
        u51 u51Var = this.f15345e;
        float f12 = 0.0f;
        if (u51Var != null) {
            if (!this.P && ((d7Var = this.d) == null || !d7Var.Y)) {
                if (d7Var != null) {
                    f11 = d7Var.P;
                } else {
                    f11 = 1.0f;
                }
            } else {
                f11 = 0.0f;
            }
            u51Var.B0(f11);
        }
        u51 u51Var2 = this.f15371y;
        if (u51Var2 != null) {
            if (this.P) {
                f10 = 0.0f;
            } else {
                d7 d7Var2 = this.d;
                if (d7Var2 != null) {
                    f10 = d7Var2.f14166u0;
                } else {
                    f10 = 1.0f;
                }
            }
            u51Var2.B0(f10);
        }
        u51 u51Var3 = this.E;
        if (u51Var3 != null) {
            if (!this.P) {
                d7 d7Var3 = this.d;
                if (d7Var3 != null) {
                    f12 = d7Var3.G;
                } else {
                    f12 = 1.0f;
                }
            }
            u51Var3.B0(f12);
        }
        e0 e0Var = this.F;
        if (e0Var != null) {
            e0Var.setMuted(this.P);
        }
    }

    public final void d(Matrix matrix) {
        d7 d7Var = this.d;
        if (d7Var == null) {
            return;
        }
        float[] fArr = this.f15341b0;
        fArr[0] = d7Var.f14147k0 / 2.0f;
        fArr[1] = d7Var.f14149l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f15343c0 = fArr[0];
        this.f15344d0 = fArr[1];
        d7 d7Var2 = this.d;
        fArr[0] = d7Var2.f14147k0;
        fArr[1] = d7Var2.f14149l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f15346e0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.f15344d0, fArr[0] - this.f15343c0));
        a8.t9.a(this.f15343c0, this.f15344d0, fArr[0], fArr[1]);
        d7 d7Var3 = this.d;
        fArr[0] = d7Var3.f14147k0 / 2.0f;
        fArr[1] = d7Var3.f14149l0;
        matrix.mapPoints(fArr);
        a8.t9.a(this.f15343c0, this.f15344d0, fArr[0], fArr[1]);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        d7 d7Var;
        xe xeVar;
        if (this.T != null) {
            float f10 = 0.0f;
            if (this.f15350h0) {
                Path path = new Path();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.T;
            if (!(drawable instanceof ra0) || ((ra0) drawable).f38933u != null) {
                f10 = this.Q.e(false, 1.0f);
            }
            Drawable drawable2 = this.S;
            if (drawable2 != null && f10 < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - f10) * 255.0f));
                d7.j(canvas, this.S, getWidth(), getHeight());
            }
            this.T.setAlpha((int) (f10 * 255.0f));
            d7.j(canvas, this.T, getWidth(), getHeight());
            if (this.f15350h0) {
                canvas.restore();
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.U);
        }
        j0 j0Var = this.B0;
        if (j0Var != null) {
            j0Var.d.b(canvas2, true);
        } else if (this.f15348f0 && this.d != null && !j()) {
            if (this.f15338a == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d = this.f15349g0.d(z10);
            if (this.f15338a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.f14143i0, getHeight() / this.d.f14145j0);
                canvas2.concat(this.d.f14152n0);
                if (this.d.m0 != null) {
                    canvas2.translate(d7Var.f14147k0 / 2.0f, d7Var.f14149l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    d7 d7Var2 = this.d;
                    int i7 = d7Var2.f14147k0;
                    int i10 = d7Var2.f14149l0;
                    int i11 = d7Var2.Q;
                    xe xeVar2 = d7Var2.m0;
                    if (((i11 + xeVar2.f27496k) / 90) % 2 == 1) {
                        i10 = i7;
                        i7 = i10;
                    }
                    float f11 = xeVar2.f27492e;
                    float f12 = xeVar2.f27493f;
                    float f13 = i7;
                    float f14 = i10;
                    canvas2.clipRect(((-i7) * f11) / 2.0f, ((-i10) * f12) / 2.0f, (f11 * f13) / 2.0f, (f12 * f14) / 2.0f);
                    float f15 = this.d.m0.f27491c;
                    canvas2.scale(f15, f15);
                    xe xeVar3 = this.d.m0;
                    canvas2.translate(xeVar3.f27489a * f13, xeVar3.f27490b * f14);
                    canvas2.rotate(this.d.m0.d + xeVar.f27496k);
                    if (this.d.m0.f27497l) {
                        canvas2.scale(-1.0f, 1.0f);
                    }
                    canvas2.rotate(this.d.Q);
                    d7 d7Var3 = this.d;
                    canvas2.translate((-d7Var3.f14147k0) / 2.0f, (-d7Var3.f14149l0) / 2.0f);
                }
                Paint paint = this.R;
                paint.setAlpha((int) ((1.0f - d) * 255.0f));
                int width = this.f15338a.getWidth();
                int height = this.f15338a.getHeight();
                Rect rect = this.f15340b;
                rect.set(0, 0, width, height);
                d7 d7Var4 = this.d;
                int i12 = d7Var4.f14147k0;
                int i13 = d7Var4.f14149l0;
                Rect rect2 = this.f15342c;
                rect2.set(0, 0, i12, i13);
                canvas2.drawBitmap(this.f15338a, rect, rect2, paint);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: hi.x5.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        d7 d7Var;
        d7 d7Var2;
        k51 k51Var = this.f15355n;
        if (view == k51Var && (d7Var2 = this.d) != null && d7Var2.f14165u) {
            return false;
        }
        if ((view == k51Var || view == this.f15360r) && (d7Var = this.d) != null && d7Var.m0 != null) {
            canvas.save();
            canvas.scale(getWidth() / this.d.f14143i0, getHeight() / this.d.f14145j0);
            canvas.concat(this.d.f14152n0);
            d7 d7Var3 = this.d;
            if (d7Var3.m0 != null) {
                canvas.translate(d7Var3.f14147k0 / 2.0f, d7Var3.f14149l0 / 2.0f);
                canvas.rotate(-this.d.Q);
                d7 d7Var4 = this.d;
                int i7 = d7Var4.f14147k0;
                int i10 = d7Var4.f14149l0;
                int i11 = d7Var4.Q;
                xe xeVar = d7Var4.m0;
                if (((i11 + xeVar.f27496k) / 90) % 2 == 1) {
                    i10 = i7;
                    i7 = i10;
                }
                float f10 = xeVar.f27492e;
                float f11 = xeVar.f27493f;
                canvas.clipRect(((-i7) * f10) / 2.0f, ((-i10) * f11) / 2.0f, (i7 * f10) / 2.0f, (i10 * f11) / 2.0f);
                canvas.rotate(this.d.Q);
                d7 d7Var5 = this.d;
                canvas.translate((-d7Var5.f14147k0) / 2.0f, (-d7Var5.f14149l0) / 2.0f);
            }
            canvas.concat(this.f15351i0);
            canvas.scale(1.0f / (getWidth() / this.d.f14143i0), 1.0f / (getHeight() / this.d.f14145j0));
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
        return d7Var.f14149l0;
    }

    public int getContentWidth() {
        d7 d7Var = this.d;
        if (d7Var == null) {
            return 1;
        }
        return d7Var.f14147k0;
    }

    public long getCurrentPosition() {
        u51 u51Var = this.f15345e;
        if (u51Var != null) {
            return u51Var.S();
        }
        u51 u51Var2 = this.f15371y;
        if (u51Var2 != null) {
            return u51Var2.S();
        }
        u51 u51Var3 = this.E;
        if (u51Var3 != null) {
            return u51Var3.S();
        }
        return 0L;
    }

    public long getDuration() {
        d7 d7Var = this.d;
        if (d7Var != null) {
            double d = d7Var.f14142i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        u51 u51Var = this.f15345e;
        if (u51Var != null && u51Var.U() != -9223372036854775807L) {
            return this.f15345e.U();
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
        return new Pair<>(Integer.valueOf(this.d.f14143i0), Integer.valueOf(this.d.f14145j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.f15338a;
    }

    public k51 getTextureView() {
        return this.f15355n;
    }

    public final void h(z10 z10Var, View... viewArr) {
        k51 k51Var;
        int L = (int) (org.telegram.messenger.g0.L(26.0f) * org.telegram.messenger.g0.f23610p);
        int L2 = (int) (org.telegram.messenger.g0.L(30.33f) * org.telegram.messenger.g0.f23610p);
        int L3 = (int) (org.telegram.messenger.g0.L(4.0f) * org.telegram.messenger.g0.f23610p);
        ?? r52 = new Bitmap[viewArr.length];
        for (int i7 = 0; i7 < viewArr.length; i7++) {
            View view = viewArr[i7];
            if (view != null && view.getWidth() >= 0 && viewArr[i7].getHeight() > 0) {
                View view2 = viewArr[i7];
                if (view2 == this && (k51Var = this.f15355n) != null) {
                    r52[i7] = k51Var.getBitmap();
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
        Utilities.f22416e.c(new u5(L, L2, L3, r52, z10Var, 0));
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
                d7Var.z(new v5((ga) this, 0));
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
        u51 u51Var = this.f15345e;
        if (u51Var != null) {
            u51Var.q0(j3, false);
        } else if (j()) {
            this.F.m(j3, false);
        } else {
            u51 u51Var2 = this.f15371y;
            if (u51Var2 != null) {
                u51Var2.q0(j3, false);
            } else {
                u51 u51Var3 = this.E;
                if (u51Var3 != null) {
                    u51Var3.q0(j3, false);
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
                d7Var.z(new v5(this, 1));
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

    public final void o(TextureView textureView, td0 td0Var) {
        TextureView textureView2 = this.f15360r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.f15360r = null;
        }
        this.f15362s = td0Var;
        this.f15360r = textureView;
        if (td0Var != null) {
            int i7 = this.V;
            int i10 = this.W;
            wy wyVar = td0Var.m0;
            if (wyVar != null) {
                wyVar.h(i7, i10);
            } else {
                td0Var.K0 = i7;
                td0Var.L0 = i10;
            }
        }
        TextureView textureView3 = this.f15360r;
        if (textureView3 != null) {
            addView(textureView3);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f15354l0) {
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
        u51 u51Var = this.E;
        if (u51Var != null) {
            u51Var.g0();
            this.E.m0();
            this.E = null;
        }
        if (d7Var != null) {
            cb cbVar = this.G;
            boolean z12 = false;
            if (cbVar != null) {
                String str2 = d7Var.f14172y;
                String str3 = d7Var.A;
                String str4 = d7Var.B;
                long j3 = d7Var.C;
                long j10 = d7Var.D;
                float f13 = d7Var.E;
                float f14 = d7Var.F;
                float f15 = d7Var.G;
                if (!TextUtils.equals(cbVar.P, str2)) {
                    va vaVar = cbVar.f13994b0;
                    if (vaVar != null) {
                        vaVar.a();
                        cbVar.f13994b0 = null;
                        cbVar.V = false;
                    }
                    cbVar.P = str2;
                    cbVar.p();
                }
                cbVar.P = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                cbVar.O = !isEmpty;
                if (isEmpty) {
                    cbVar.Q = false;
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
                if (cbVar.O) {
                    cbVar.S = j3;
                    cbVar.R = j10 - (((float) j3) * f13);
                    cbVar.T = f13;
                    cbVar.U = f14;
                    cbVar.W = f15;
                    float f16 = 0.0f;
                    if (str != null) {
                        StaticLayout staticLayout = new StaticLayout(str, cbVar.M0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        cbVar.N0 = staticLayout;
                        if (staticLayout.getLineCount() > 0) {
                            f11 = cbVar.N0.getLineWidth(0);
                        } else {
                            f11 = 0.0f;
                        }
                        cbVar.O0 = f11;
                        if (cbVar.N0.getLineCount() > 0) {
                            f12 = cbVar.N0.getLineLeft(0);
                        } else {
                            f12 = 0.0f;
                        }
                        cbVar.P0 = f12;
                    } else {
                        cbVar.O0 = 0.0f;
                        cbVar.N0 = null;
                    }
                    if (str4 != null) {
                        StaticLayout staticLayout2 = new StaticLayout(str4, cbVar.Q0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        cbVar.R0 = staticLayout2;
                        if (staticLayout2.getLineCount() > 0) {
                            f10 = cbVar.R0.getLineWidth(0);
                        } else {
                            f10 = 0.0f;
                        }
                        cbVar.S0 = f10;
                        if (cbVar.R0.getLineCount() > 0) {
                            f16 = cbVar.R0.getLineLeft(0);
                        }
                        cbVar.T0 = f16;
                    } else {
                        cbVar.S0 = 0.0f;
                        cbVar.R0 = null;
                    }
                }
                if (!z10) {
                    z11 = true;
                    cbVar.f14005f0.f(cbVar.O, true);
                } else {
                    z11 = true;
                }
                cbVar.invalidate();
            } else {
                z11 = true;
            }
            if (d7Var.f14172y != null) {
                u51 u51Var2 = new u51();
                this.E = u51Var2;
                u51Var2.E = z11;
                u51Var2.K = new gc.b(this, 5);
                u51Var2.j0(Uri.fromFile(new File(d7Var.f14172y)), "other");
                c();
                if (this.f15345e != null && getDuration() > 0) {
                    long duration = d7Var.Z * ((float) getDuration());
                    this.f15345e.q0(duration, false);
                    this.G.setProgress(duration);
                }
                z11 = true;
                w(true);
            }
            sa saVar = ((ga) this).D0;
            u9 u9Var = saVar.f15107w1;
            if (u9Var != null) {
                d7 d7Var2 = saVar.L1;
                if (d7Var2 != null && d7Var2.f14172y != null) {
                    z12 = z11;
                }
                u9Var.setHasAudio(z12);
            }
        }
    }

    public final void q(gj gjVar) {
        long j3;
        int maxCount;
        d7 d7Var = this.d;
        if (d7Var != null) {
            d7Var.f14144j = true;
            float f10 = 1.0f;
            if (gjVar != null) {
                int i7 = gjVar.K1;
                if (gjVar.f23819k != null) {
                    TLRPC.Document F0 = gjVar.F0();
                    if (F0 != null && F0.f28057id != 0) {
                        this.d.f14174z = new TLRPC.TL_inputDocument();
                        TLRPC.InputDocument inputDocument = this.d.f14174z;
                        inputDocument.f28063id = F0.f28057id;
                        inputDocument.file_reference = F0.file_reference;
                        inputDocument.access_hash = F0.access_hash;
                    }
                    int i10 = 0;
                    if (!TextUtils.isEmpty(gjVar.f23819k.attachPath)) {
                        this.d.f14172y = gjVar.f23819k.attachPath;
                    } else {
                        org.telegram.messenger.w7.G(i7);
                        File J = org.telegram.messenger.w7.J(F0, null, false, true);
                        if (J == null || !J.exists()) {
                            org.telegram.messenger.w7.G(i7);
                            J = org.telegram.messenger.w7.J(F0, null, true, true);
                            if (J != null && J.exists()) {
                                this.d.f14172y = J.getAbsolutePath();
                            } else {
                                d7 d7Var2 = this.d;
                                d7Var2.f14172y = null;
                                d7Var2.f14174z = null;
                                d7Var2.A = null;
                                d7Var2.B = null;
                                d7Var2.D = 0L;
                                d7Var2.C = 0L;
                                d7Var2.E = 0.0f;
                                d7Var2.F = 1.0f;
                                return;
                            }
                        }
                        this.d.f14172y = J.getAbsolutePath();
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
                            d7 d7Var5 = ((d0) obj).f14083n;
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
                    cb cbVar = this.G;
                    if (cbVar == null) {
                        maxCount = 1;
                    } else {
                        maxCount = cbVar.getMaxCount();
                    }
                    d7 d7Var7 = this.d;
                    if (d7Var7.C != 0) {
                        f10 = Math.min(1.0f, ((float) Math.min(j3, maxCount * 59000)) / ((float) this.d.C));
                    }
                    d7Var7.F = f10;
                }
            }
            d7Var.f14172y = null;
            d7Var.f14174z = null;
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
            i7 = org.telegram.messenger.g0.f23611q.y;
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
            k51 k51Var = this.f15355n;
            if (k51Var != null) {
                int i13 = this.V;
                int i14 = this.W;
                wy wyVar = k51Var.f36280b;
                if (wyVar == null) {
                    k51Var.f36284n = i13;
                    k51Var.f36285r = i14;
                } else {
                    wyVar.h(i13, i14);
                }
            }
            td0 td0Var = this.f15362s;
            if (td0Var != null) {
                int i15 = this.V;
                int i16 = this.W;
                wy wyVar2 = td0Var.m0;
                if (wyVar2 != null) {
                    wyVar2.h(i15, i16);
                } else {
                    td0Var.K0 = i15;
                    td0Var.L0 = i16;
                }
            }
        } else {
            Bitmap bitmap = this.f15338a;
            if (bitmap != null) {
                new ai.y1(this, i7, 2).a(c8.h0.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        }
        invalidate();
    }

    public final void s(d7 d7Var, tg.r1 r1Var, boolean z10) {
        u51 u51Var;
        if (d7Var != null && d7Var.f14154o0 != null) {
            u51 u51Var2 = this.f15371y;
            if (u51Var2 != null) {
                u51Var2.m0();
                this.f15371y = null;
            }
            u51 u51Var3 = new u51();
            this.f15371y = u51Var3;
            u51Var3.E = true;
            u51Var3.K = new l0(this, 2);
            this.f15371y.j0(Uri.fromFile(d7Var.f14154o0), "other");
            c();
            this.f15369x = r1Var;
            if (r1Var != null && (u51Var = this.f15371y) != null) {
                u51Var.A0(r1Var.f57543v0);
            }
            this.G.n(d7Var.f14154o0.getAbsolutePath(), d7Var.f14158q0, d7Var.f14160r0, d7Var.f14162s0, d7Var.f14164t0, d7Var.f14166u0, z10);
            y(true);
            return;
        }
        u51 u51Var4 = this.f15371y;
        if (u51Var4 != null) {
            u51Var4.g0();
            this.f15371y.m0();
            this.f15371y = null;
        }
        cb cbVar = this.G;
        if (cbVar != null) {
            cbVar.setRoundNull(z10);
        }
        this.f15369x = null;
        org.telegram.messenger.g0.r(this.L);
    }

    public void set(d7 d7Var) {
        n(d7Var, null, 0L);
    }

    public void setAllowCropping(boolean z10) {
        this.f15354l0 = z10;
    }

    public void setCollageView(e0 e0Var) {
        this.F = e0Var;
    }

    public void setCropEditorDrawing(j0 j0Var) {
        if (this.B0 != j0Var) {
            this.B0 = j0Var;
            invalidate();
        }
    }

    public void setDraw(boolean z10) {
        this.f15348f0 = z10;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.f15373z0 = runnable;
    }

    public void setVideoTimelineView(cb cbVar) {
        this.G = cbVar;
        if (cbVar != null) {
            cbVar.setDelegate(new d6.i(this, 27));
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
        org.telegram.ui.Components.u9 u9Var;
        boolean z10;
        ArrayList arrayList;
        org.telegram.ui.Components.z9 z9Var;
        float f10 = 0.0f;
        if (d7Var != null && !d7Var.v()) {
            u51 u51Var = this.f15345e;
            if (u51Var != null) {
                u51Var.m0();
                this.f15345e = null;
            }
            u51 u51Var2 = new u51();
            this.f15345e = u51Var2;
            u51Var2.E = true;
            u51Var2.K = new h6.m(this, d7Var, new Runnable[]{runnable}, 1);
            k51 k51Var = this.f15355n;
            if (k51Var != null) {
                k51Var.clearAnimation();
                k51 k51Var2 = this.f15355n;
                wy wyVar = k51Var2.f36280b;
                if (wyVar != null) {
                    wyVar.postRunnable(new ty(wyVar, 0));
                }
                k51Var2.f36279a = null;
                removeView(this.f15355n);
                this.f15355n = null;
            }
            this.f15355n = new k51(getContext(), this.f15345e);
            this.H.e();
            k51 k51Var3 = this.f15355n;
            if (d7Var.f14165u) {
                u9Var = null;
            } else {
                u9Var = this.H;
            }
            k51Var3.f36286s = u9Var;
            wy wyVar2 = k51Var3.f36280b;
            if (wyVar2 != null && (z9Var = wyVar2.J) != null) {
                org.telegram.ui.Components.u9 u9Var2 = z9Var.f42323t;
                if (u9Var2 != null && u9Var2.f39976m != null) {
                    u9Var2.f39976m = null;
                }
                z9Var.f42323t = u9Var;
                if (u9Var != null && u9Var.f39976m != z9Var) {
                    u9Var.f39976m = z9Var;
                    u9Var.d();
                }
            }
            this.f15355n.setOpaque(false);
            b();
            w5 w5Var = this.I;
            if (w5Var != null && w5Var.f15295g) {
                w5Var.a(this.f15355n);
            } else {
                k51 k51Var4 = this.f15355n;
                if (runnable != null) {
                    f10 = 1.0f;
                }
                k51Var4.setAlpha(f10);
                addView(this.f15355n, c8.ja.e(-2, -2, 51));
            }
            ai.g0 g0Var = new ai.g0(this, 28);
            c7 c7Var = d7Var.f14133d1;
            if (c7Var != null) {
                g0Var.a(c7Var);
            } else if (d7Var.K && Build.VERSION.SDK_INT >= 24) {
                Utilities.f22416e.c(new y6(d7Var, g0Var, 0));
            } else {
                ?? obj = new Object();
                d7Var.f14133d1 = obj;
                g0Var.a(obj);
            }
            File file = d7Var.Z0;
            if (file == null) {
                file = d7Var.L;
            }
            this.f15345e.j0(Uri.fromFile(file), "other");
            this.f15345e.u0(this.A0.isEmpty());
            this.f15345e.s0(true);
            if (d7Var.h) {
                j3 = (d7Var.Z * ((float) d7Var.f14141h0)) + ((float) j3);
            }
            int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i7 > 0) {
                this.f15345e.q0(j3, false);
            }
            c();
            w(true);
            if (d7Var.f14165u && (arrayList = d7Var.v) != null && arrayList.size() == 1 && ((gj) d7Var.v.get(0)).D == 5) {
                z10 = true;
            } else {
                z10 = false;
            }
            cb cbVar = this.G;
            File file2 = d7Var.Z0;
            if (file2 == null) {
                file2 = d7Var.L;
            }
            cbVar.o(z10, file2.getAbsolutePath(), getDuration(), d7Var.P);
            this.G.setVideoLeft(d7Var.Z);
            this.G.setVideoRight(d7Var.f14124a0);
            cb cbVar2 = this.G;
            if (cbVar2 != null && i7 > 0) {
                cbVar2.setProgress(j3);
                return;
            }
            return;
        }
        u51 u51Var3 = this.f15345e;
        if (u51Var3 != null) {
            u51Var3.g0();
            this.f15345e.m0();
            this.f15345e = null;
        }
        w5 w5Var2 = this.I;
        if (w5Var2 != null && w5Var2.f15295g) {
            w5Var2.a(null);
        } else {
            k51 k51Var5 = this.f15355n;
            if (k51Var5 != null) {
                k51Var5.clearAnimation();
                this.f15355n.animate().alpha(0.0f).withEndAction(new v5(this, 6)).start();
            }
        }
        cb cbVar3 = this.G;
        if (cbVar3 != null) {
            cbVar3.o(false, null, 1L, 0.0f);
        }
        org.telegram.messenger.g0.r(this.L);
        if (runnable != null) {
            org.telegram.messenger.g0.h3(runnable);
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
        long j3 = d7Var.f14175z0;
        if (j3 != Long.MIN_VALUE) {
            Drawable e10 = e(this.T, d7Var.f14123a, j3, d7Var.f14173y0);
            d7Var.f14171x0 = e10;
            this.T = e10;
            if (this.S != e10) {
                this.S = null;
            }
            if (e10 != null) {
                e10.setCallback(this);
            }
            org.telegram.ui.Components.u9 u9Var = this.H;
            if (u9Var != null) {
                Drawable drawable2 = this.T;
                if (drawable2 != null) {
                    if (drawable2 instanceof BitmapDrawable) {
                        u9Var.f(((BitmapDrawable) drawable2).getBitmap(), false);
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
                        u9Var.f(createBitmap, true);
                    }
                } else {
                    u9Var.f(null, false);
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
        if (this.f15354l0) {
            if (motionEvent.getPointerCount() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            PointF pointF2 = this.f15356n0;
            if (z10) {
                pointF2.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                pointF2.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                f10 = a8.t9.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                d = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
            } else {
                pointF2.x = motionEvent.getX(0);
                pointF2.y = motionEvent.getY(0);
                d = 0.0d;
                f10 = 0.0f;
            }
            boolean z13 = this.f15359q0;
            PointF pointF3 = this.m0;
            if (z13 != z10) {
                pointF3.x = pointF2.x;
                pointF3.y = pointF2.y;
                this.f15357o0 = f10;
                this.f15358p0 = d;
                this.f15359q0 = z10;
            }
            if (this.d != null) {
                float width = d7Var.f14143i0 / getWidth();
                int actionMasked = motionEvent.getActionMasked();
                Matrix matrix = this.f15364t0;
                if (actionMasked == 0) {
                    this.f15366v0 = 0.0f;
                    this.f15368w0 = false;
                    invalidate();
                    this.f15370x0 = true;
                    matrix.set(this.d.f14152n0);
                }
                if (motionEvent.getActionMasked() == 2 && this.f15370x0 && this.d != null) {
                    float f11 = pointF2.x * width;
                    float f12 = pointF2.y * width;
                    float f13 = pointF3.x * width;
                    float f14 = pointF3.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f15 = this.f15357o0;
                        if (f15 != 0.0f) {
                            float f16 = f10 / f15;
                            matrix.postScale(f16, f16, f11, f12);
                        }
                        pointF = pointF2;
                        float degrees = (float) Math.toDegrees(d - this.f15358p0);
                        float f17 = this.f15366v0 + degrees;
                        this.f15366v0 = f17;
                        if (!this.f15363s0) {
                            if (Math.abs(f17) > 20.0f) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.f15363s0 = z11;
                            if (!z11) {
                                d(matrix);
                                if ((Math.round(this.f15346e0 / 90.0f) * 90.0f) - this.f15346e0 > 20.0f) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                this.f15363s0 = z12;
                            }
                            if (!this.f15368w0) {
                                org.telegram.messenger.g0.b4(this);
                                this.f15368w0 = true;
                            }
                        }
                        if (this.f15363s0) {
                            matrix.postRotate(degrees, f11, f12);
                        }
                        this.f15361r0 = true;
                    } else {
                        pointF = pointF2;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.f15361r0) {
                        matrix.postTranslate(f11 - f13, f12 - f14);
                    }
                    Matrix matrix2 = this.f15365u0;
                    matrix2.set(matrix);
                    Matrix matrix3 = this.f15339a0;
                    matrix3.set(matrix);
                    d(matrix3);
                    float round = (Math.round(this.f15346e0 / 90.0f) * 90.0f) - this.f15346e0;
                    if (this.f15363s0) {
                        if (Math.abs(round) < 3.5f) {
                            matrix2.postRotate(round, this.f15343c0, this.f15344d0);
                            if (!this.f15368w0) {
                                org.telegram.messenger.g0.b4(this);
                                this.f15368w0 = true;
                            }
                        } else {
                            this.f15368w0 = false;
                        }
                    }
                    this.d.f14152n0.set(matrix2);
                    this.d.f14144j = true;
                    b();
                    invalidate();
                } else {
                    pointF = pointF2;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getPointerCount() <= 1) {
                        this.f15361r0 = false;
                        sa saVar = ((ga) this).D0;
                        saVar.f15083p1.a(true, false, saVar.f15066j0);
                        saVar.f15083p1.b(saVar.f15048d1.getText());
                    }
                    this.f15370x0 = false;
                    this.f15363s0 = false;
                    this.f15366v0 = 0.0f;
                    this.f15368w0 = false;
                    invalidate();
                }
                PointF pointF4 = pointF;
                pointF3.x = pointF4.x;
                pointF3.y = pointF4.y;
                this.f15357o0 = f10;
                this.f15358p0 = d;
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
        throw new UnsupportedOperationException("Method not decompiled: hi.x5.w(boolean):void");
    }

    public final void x(int i7, boolean z10) {
        HashSet hashSet = this.A0;
        if (z10) {
            hashSet.add(Integer.valueOf(i7));
        } else {
            hashSet.remove(Integer.valueOf(i7));
        }
        u51 u51Var = this.f15345e;
        if (u51Var != null) {
            u51Var.u0(hashSet.isEmpty());
        }
        e0 e0Var = this.F;
        if (e0Var != null) {
            e0Var.setPlaying(hashSet.isEmpty());
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
        if (this.f15371y != null && this.d != null) {
            boolean z12 = true;
            if (this.f15345e == null && !j()) {
                this.f15371y.u0(this.A0.isEmpty());
                this.f15371y.s0(true);
                tg.r1 r1Var = this.f15369x;
                if (r1Var != null && !r1Var.C0) {
                    r1Var.C0 = true;
                    r1Var.D0.f(true, true);
                    r1Var.invalidate();
                }
                long S2 = this.f15371y.S();
                if (z10 && this.f15371y.U() != -9223372036854775807L) {
                    float U = ((float) S2) / ((float) this.f15371y.U());
                    d7 d7Var = this.d;
                    if ((U < d7Var.f14162s0 || U > d7Var.f14164t0) && System.currentTimeMillis() - this.K > 500) {
                        this.K = System.currentTimeMillis();
                        this.f15371y.q0(-this.d.f14160r0, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (j()) {
                S = this.F.getPositionWithOffset();
                d02 = this.F.f14215r0;
            } else {
                S = this.f15345e.S();
                d02 = this.f15345e.d0();
            }
            d7 d7Var2 = this.d;
            float f11 = d7Var2.f14164t0;
            float f12 = d7Var2.f14162s0;
            long j3 = (f11 - f12) * ((float) d7Var2.f14158q0);
            long j10 = d7Var2.f14160r0;
            if (S >= j10 && S <= j3 + j10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!d02 || !z11) {
                z12 = false;
            }
            long j11 = (S - j10) + (f12 * f10);
            tg.r1 r1Var2 = this.f15369x;
            if (r1Var2 != null && r1Var2.C0 != z11) {
                r1Var2.C0 = z11;
                r1Var2.invalidate();
            }
            if (this.f15371y.d0() != z12) {
                this.f15371y.u0(z12);
                this.f15371y.q0(j11, false);
            } else if (z10) {
                long abs = Math.abs(this.f15371y.S() - j11);
                if (j()) {
                    i7 = 300;
                } else {
                    i7 = 120;
                }
                if (abs > i7) {
                    this.f15371y.q0(j11, false);
                }
            }
        }
    }
}
