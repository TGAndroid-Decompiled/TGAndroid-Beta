package gi;

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
import b8.mf;
import b8.nc;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hp;
import org.telegram.messenger.re;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.my;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.py;
import org.telegram.ui.Components.xq;
public abstract class y5 extends FrameLayout {
    public static final int C0 = 0;
    public final HashSet A0;
    public j0 B0;
    public m51 E;
    public e0 F;
    public fb G;
    public final org.telegram.ui.Components.x9 H;
    public final x5 I;
    public long J;
    public long K;
    public final u5 L;
    public final u5 M;
    public final u5 N;
    public v8 O;
    public boolean P;
    public final org.telegram.ui.Components.u5 Q;
    public final Paint R;
    public Drawable S;
    public Drawable T;
    public final Paint U;
    public int V;
    public int W;
    public Bitmap f13936a;
    public final Matrix f13937a0;
    public final Rect f13938b;
    public final float[] f13939b0;
    public final Rect f13940c;
    public float f13941c0;
    public f7 d;
    public float f13942d0;
    public m51 f13943e;
    public float f13944e0;
    public int f13945f;
    public boolean f13946f0;
    public final org.telegram.ui.Components.u5 f13947g0;
    public int h;
    public boolean f13948h0;
    public final Matrix f13949i0;
    public final Matrix f13950j0;
    public final Matrix f13951k0;
    public boolean f13952l0;
    public final PointF m0;
    public b51 f13953n;
    public final PointF f13954n0;
    public float f13955o0;
    public double f13956p0;
    public boolean f13957q0;
    public TextureView f13958r;
    public boolean f13959r0;
    public nd0 f13960s;
    public boolean f13961s0;
    public final Matrix f13962t0;
    public final Matrix f13963u0;
    public float f13964v0;
    public v8 f13965w;
    public boolean f13966w0;
    public ug.r1 f13967x;
    public boolean f13968x0;
    public m51 f13969y;
    public long f13970y0;
    public Runnable f13971z0;

    public y5(Context context, org.telegram.ui.Components.x9 x9Var, x5 x5Var) {
        super(context);
        this.f13938b = new Rect();
        this.f13940c = new Rect();
        Paint paint = new Paint(1);
        new u5(this, 2);
        this.L = new u5(this, 3);
        this.M = new u5(this, 4);
        this.N = new u5(this, 5);
        this.Q = new org.telegram.ui.Components.u5(this, 0L, 350L, xq.h);
        this.R = new Paint(7);
        this.U = new Paint(1);
        this.f13937a0 = new Matrix();
        this.f13939b0 = new float[2];
        this.f13946f0 = true;
        this.f13947g0 = new org.telegram.ui.Components.u5(this, 0L, 320L, xq.f40453g);
        this.f13948h0 = false;
        this.f13949i0 = new Matrix();
        this.f13950j0 = new Matrix();
        this.f13951k0 = new Matrix();
        this.f13952l0 = true;
        this.m0 = new PointF();
        this.f13954n0 = new PointF();
        this.f13962t0 = new Matrix();
        this.f13963u0 = new Matrix();
        this.A0 = new HashSet();
        this.H = x9Var;
        this.I = x5Var;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(org.telegram.messenger.g0.L(3.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), 1073741824);
    }

    public static void a(gi.y5 r13, gi.f7 r14) {
        throw new UnsupportedOperationException("Method not decompiled: gi.y5.a(gi.y5, gi.f7):void");
    }

    public static Drawable e(Drawable drawable, int i3, long j10, boolean z10) {
        TLRPC.WallPaper wallPaper = null;
        if (j10 == Long.MIN_VALUE) {
            return null;
        }
        if (j10 >= 0) {
            TLRPC.UserFull b22 = hp.s1(i3).b2(j10);
            if (b22 != null) {
                wallPaper = b22.wallpaper;
            }
        } else {
            TLRPC.ChatFull N0 = hp.s1(i3).N0(-j10);
            if (N0 != null) {
                wallPaper = N0.wallpaper;
            }
        }
        return f(drawable, i3, wallPaper, z10);
    }

    public static android.graphics.drawable.Drawable f(android.graphics.drawable.Drawable r5, int r6, org.telegram.tgnet.TLRPC.WallPaper r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: gi.y5.f(android.graphics.drawable.Drawable, int, org.telegram.tgnet.TLRPC$WallPaper, boolean):android.graphics.drawable.Drawable");
    }

    public static Drawable g(int i3, final org.telegram.ui.ActionBar.p3 p3Var, final boolean z10) {
        if (p3Var.l()) {
            org.telegram.ui.ActionBar.k6.I(org.telegram.ui.ActionBar.p3.d(z10), p3Var.g(i3, z10 ? 1 : 0), ((org.telegram.ui.ActionBar.o3) p3Var.f28423f.get(z10 ? 1 : 0)).f28387g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray g7 = p3Var.g(i3, z10 ? 1 : 0);
        int i10 = org.telegram.ui.ActionBar.k6.Be;
        int i11 = g7.get(i10, org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        int i12 = org.telegram.ui.ActionBar.k6.Ce;
        int i13 = g7.get(i12, org.telegram.ui.ActionBar.k6.x0(null, i12, false));
        int i14 = org.telegram.ui.ActionBar.k6.De;
        int i15 = g7.get(i14, org.telegram.ui.ActionBar.k6.x0(null, i14, false));
        int i16 = org.telegram.ui.ActionBar.k6.Ee;
        int i17 = g7.get(i16, org.telegram.ui.ActionBar.k6.x0(null, i16, false));
        final la0 la0Var = new la0();
        la0Var.f35655g = false;
        la0Var.s(la0Var.f35668u, p3Var.j(z10 ? 1 : 0).settings.intensity);
        la0Var.o(i11, i13, i15, i17, 0, true);
        la0Var.u(0);
        final int f10 = la0Var.f();
        p3Var.n(z10 ? 1 : 0, new ResultCallback() {
            @Override
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair != null) {
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((hg.a) pair.second).f14399a;
                    org.telegram.ui.ActionBar.p3 p3Var2 = org.telegram.ui.ActionBar.p3.this;
                    if (longValue == p3Var2.h(z10 ? 1 : 0) && bitmap != null) {
                        int i18 = p3Var2.j(z10 ? 1 : 0).settings.intensity;
                        la0 la0Var2 = la0Var;
                        la0Var2.s(bitmap, i18);
                        la0Var2.t(f10);
                        la0Var2.r(1.0f);
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
        return la0Var;
    }

    private void setupCollage(f7 f7Var) {
        ArrayList<f7> arrayList;
        fb fbVar = this.G;
        if (fbVar != null) {
            if (f7Var != null) {
                arrayList = f7Var.T;
            } else {
                arrayList = null;
            }
            fbVar.setCollage(arrayList);
        }
    }

    private void setupImage(f7 f7Var) {
        Utilities.f21389g.c(new g2.c(14, this, f7Var));
    }

    public abstract void b();

    public final void c() {
        float f10;
        float f11;
        f7 f7Var;
        m51 m51Var = this.f13943e;
        float f12 = 0.0f;
        if (m51Var != null) {
            if (!this.P && ((f7Var = this.d) == null || !f7Var.Y)) {
                if (f7Var != null) {
                    f11 = f7Var.P;
                } else {
                    f11 = 1.0f;
                }
            } else {
                f11 = 0.0f;
            }
            m51Var.B0(f11);
        }
        m51 m51Var2 = this.f13969y;
        if (m51Var2 != null) {
            if (this.P) {
                f10 = 0.0f;
            } else {
                f7 f7Var2 = this.d;
                if (f7Var2 != null) {
                    f10 = f7Var2.f12745u0;
                } else {
                    f10 = 1.0f;
                }
            }
            m51Var2.B0(f10);
        }
        m51 m51Var3 = this.E;
        if (m51Var3 != null) {
            if (!this.P) {
                f7 f7Var3 = this.d;
                if (f7Var3 != null) {
                    f12 = f7Var3.G;
                } else {
                    f12 = 1.0f;
                }
            }
            m51Var3.B0(f12);
        }
        e0 e0Var = this.F;
        if (e0Var != null) {
            e0Var.setMuted(this.P);
        }
    }

    public final void d(Matrix matrix) {
        f7 f7Var = this.d;
        if (f7Var == null) {
            return;
        }
        float[] fArr = this.f13939b0;
        fArr[0] = f7Var.f12726k0 / 2.0f;
        fArr[1] = f7Var.f12728l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f13941c0 = fArr[0];
        this.f13942d0 = fArr[1];
        f7 f7Var2 = this.d;
        fArr[0] = f7Var2.f12726k0;
        fArr[1] = f7Var2.f12728l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f13944e0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.f13942d0, fArr[0] - this.f13941c0));
        a7.h.a(this.f13941c0, this.f13942d0, fArr[0], fArr[1]);
        f7 f7Var3 = this.d;
        fArr[0] = f7Var3.f12726k0 / 2.0f;
        fArr[1] = f7Var3.f12728l0;
        matrix.mapPoints(fArr);
        a7.h.a(this.f13941c0, this.f13942d0, fArr[0], fArr[1]);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        f7 f7Var;
        re reVar;
        if (this.T != null) {
            float f10 = 0.0f;
            if (this.f13948h0) {
                Path path = new Path();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.T;
            if (!(drawable instanceof la0) || ((la0) drawable).f35668u != null) {
                f10 = this.Q.e(false, 1.0f);
            }
            Drawable drawable2 = this.S;
            if (drawable2 != null && f10 < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - f10) * 255.0f));
                f7.j(canvas, this.S, getWidth(), getHeight());
            }
            this.T.setAlpha((int) (f10 * 255.0f));
            f7.j(canvas, this.T, getWidth(), getHeight());
            if (this.f13948h0) {
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
        } else if (this.f13946f0 && this.d != null && !j()) {
            if (this.f13936a == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d = this.f13947g0.d(z10);
            if (this.f13936a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.f12722i0, getHeight() / this.d.f12724j0);
                canvas2.concat(this.d.f12731n0);
                if (this.d.m0 != null) {
                    canvas2.translate(f7Var.f12726k0 / 2.0f, f7Var.f12728l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    f7 f7Var2 = this.d;
                    int i3 = f7Var2.f12726k0;
                    int i10 = f7Var2.f12728l0;
                    int i11 = f7Var2.Q;
                    re reVar2 = f7Var2.m0;
                    if (((i11 + reVar2.f25117k) / 90) % 2 == 1) {
                        i10 = i3;
                        i3 = i10;
                    }
                    float f11 = reVar2.f25113e;
                    float f12 = reVar2.f25114f;
                    float f13 = i3;
                    float f14 = i10;
                    canvas2.clipRect(((-i3) * f11) / 2.0f, ((-i10) * f12) / 2.0f, (f11 * f13) / 2.0f, (f12 * f14) / 2.0f);
                    float f15 = this.d.m0.f25112c;
                    canvas2.scale(f15, f15);
                    re reVar3 = this.d.m0;
                    canvas2.translate(reVar3.f25110a * f13, reVar3.f25111b * f14);
                    canvas2.rotate(this.d.m0.d + reVar.f25117k);
                    if (this.d.m0.f25118l) {
                        canvas2.scale(-1.0f, 1.0f);
                    }
                    canvas2.rotate(this.d.Q);
                    f7 f7Var3 = this.d;
                    canvas2.translate((-f7Var3.f12726k0) / 2.0f, (-f7Var3.f12728l0) / 2.0f);
                }
                Paint paint = this.R;
                paint.setAlpha((int) ((1.0f - d) * 255.0f));
                int width = this.f13936a.getWidth();
                int height = this.f13936a.getHeight();
                Rect rect = this.f13938b;
                rect.set(0, 0, width, height);
                f7 f7Var4 = this.d;
                int i12 = f7Var4.f12726k0;
                int i13 = f7Var4.f12728l0;
                Rect rect2 = this.f13940c;
                rect2.set(0, 0, i12, i13);
                canvas2.drawBitmap(this.f13936a, rect, rect2, paint);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: gi.y5.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        f7 f7Var;
        f7 f7Var2;
        b51 b51Var = this.f13953n;
        if (view == b51Var && (f7Var2 = this.d) != null && f7Var2.f12744u) {
            return false;
        }
        if ((view == b51Var || view == this.f13958r) && (f7Var = this.d) != null && f7Var.m0 != null) {
            canvas.save();
            canvas.scale(getWidth() / this.d.f12722i0, getHeight() / this.d.f12724j0);
            canvas.concat(this.d.f12731n0);
            f7 f7Var3 = this.d;
            if (f7Var3.m0 != null) {
                canvas.translate(f7Var3.f12726k0 / 2.0f, f7Var3.f12728l0 / 2.0f);
                canvas.rotate(-this.d.Q);
                f7 f7Var4 = this.d;
                int i3 = f7Var4.f12726k0;
                int i10 = f7Var4.f12728l0;
                int i11 = f7Var4.Q;
                re reVar = f7Var4.m0;
                if (((i11 + reVar.f25117k) / 90) % 2 == 1) {
                    i10 = i3;
                    i3 = i10;
                }
                float f10 = reVar.f25113e;
                float f11 = reVar.f25114f;
                canvas.clipRect(((-i3) * f10) / 2.0f, ((-i10) * f11) / 2.0f, (i3 * f10) / 2.0f, (i10 * f11) / 2.0f);
                canvas.rotate(this.d.Q);
                f7 f7Var5 = this.d;
                canvas.translate((-f7Var5.f12726k0) / 2.0f, (-f7Var5.f12728l0) / 2.0f);
            }
            canvas.concat(this.f13949i0);
            canvas.scale(1.0f / (getWidth() / this.d.f12722i0), 1.0f / (getHeight() / this.d.f12724j0));
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public int getContentHeight() {
        f7 f7Var = this.d;
        if (f7Var == null) {
            return 1;
        }
        return f7Var.f12728l0;
    }

    public int getContentWidth() {
        f7 f7Var = this.d;
        if (f7Var == null) {
            return 1;
        }
        return f7Var.f12726k0;
    }

    public long getCurrentPosition() {
        m51 m51Var = this.f13943e;
        if (m51Var != null) {
            return m51Var.S();
        }
        m51 m51Var2 = this.f13969y;
        if (m51Var2 != null) {
            return m51Var2.S();
        }
        m51 m51Var3 = this.E;
        if (m51Var3 != null) {
            return m51Var3.S();
        }
        return 0L;
    }

    public long getDuration() {
        f7 f7Var = this.d;
        if (f7Var != null) {
            double d = f7Var.f12721i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        m51 m51Var = this.f13943e;
        if (m51Var != null && m51Var.U() != -9223372036854775807L) {
            return this.f13943e.U();
        }
        return 1L;
    }

    public int getOrientation() {
        f7 f7Var = this.d;
        if (f7Var == null) {
            return 0;
        }
        return f7Var.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        if (this.d == null) {
            return new Pair<>(1080, 1920);
        }
        return new Pair<>(Integer.valueOf(this.d.f12722i0), Integer.valueOf(this.d.f12724j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.f13936a;
    }

    public b51 getTextureView() {
        return this.f13953n;
    }

    public final void h(u10 u10Var, View... viewArr) {
        b51 b51Var;
        int L = (int) (org.telegram.messenger.g0.L(26.0f) * org.telegram.messenger.g0.f22607p);
        int L2 = (int) (org.telegram.messenger.g0.L(30.33f) * org.telegram.messenger.g0.f22607p);
        int L3 = (int) (org.telegram.messenger.g0.L(4.0f) * org.telegram.messenger.g0.f22607p);
        ?? r5 = new Bitmap[viewArr.length];
        for (int i3 = 0; i3 < viewArr.length; i3++) {
            View view = viewArr[i3];
            if (view != null && view.getWidth() >= 0 && viewArr[i3].getHeight() > 0) {
                View view2 = viewArr[i3];
                if (view2 == this && (b51Var = this.f13953n) != null) {
                    r5[i3] = b51Var.getBitmap();
                } else if (view2 instanceof TextureView) {
                    r5[i3] = ((TextureView) view2).getBitmap();
                } else if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0) {
                    r5[i3] = Bitmap.createBitmap(L, L2, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(r5[i3]);
                    canvas.save();
                    float max = Math.max(L / viewArr[i3].getWidth(), L2 / viewArr[i3].getHeight());
                    canvas.scale(max, max);
                    viewArr[i3].draw(canvas);
                    canvas.restore();
                }
            }
        }
        Utilities.f21387e.c(new t5(L, L2, L3, r5, u10Var, 0));
    }

    public abstract void i();

    public final boolean j() {
        f7 f7Var;
        if (this.F != null && (f7Var = this.d) != null && f7Var.v()) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        return !this.A0.contains(-9982);
    }

    public final void l(f7 f7Var) {
        this.d = f7Var;
        if (f7Var == null) {
            setupImage(null);
            u(null);
            this.U.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (f7Var.K) {
            setupImage(f7Var);
            if (f7Var.A0 == 0 && f7Var.B0 == 0) {
                f7Var.z(new u5((ja) this, 0));
            } else {
                r();
            }
        } else {
            setupImage(f7Var);
            r();
        }
        b();
        u(f7Var);
        p(f7Var, false);
        s(f7Var, null, false);
    }

    public final void m(long j10) {
        m51 m51Var = this.f13943e;
        if (m51Var != null) {
            m51Var.q0(j10, false);
        } else if (j()) {
            this.F.m(j10, false);
        } else {
            m51 m51Var2 = this.f13969y;
            if (m51Var2 != null) {
                m51Var2.q0(j10, false);
            } else {
                m51 m51Var3 = this.E;
                if (m51Var3 != null) {
                    m51Var3.q0(j10, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(f7 f7Var, b9 b9Var, long j10) {
        this.d = f7Var;
        if (f7Var == null) {
            t(null, b9Var, j10);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.U.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (f7Var.v()) {
            setupImage(null);
            t(null, b9Var, j10);
            setupCollage(f7Var);
        } else if (f7Var.K) {
            setupImage(f7Var);
            setupCollage(null);
            t(f7Var, b9Var, j10);
            if (f7Var.A0 == 0 && f7Var.B0 == 0) {
                f7Var.z(new u5(this, 1));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, b9Var, 0L);
            setupImage(f7Var);
            r();
        }
        b();
        u(f7Var);
        p(f7Var, false);
        s(f7Var, null, false);
    }

    public final void o(TextureView textureView, nd0 nd0Var) {
        TextureView textureView2 = this.f13958r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.f13958r = null;
        }
        this.f13960s = nd0Var;
        this.f13958r = textureView;
        if (nd0Var != null) {
            int i3 = this.V;
            int i10 = this.W;
            py pyVar = nd0Var.m0;
            if (pyVar != null) {
                pyVar.h(i3, i10);
            } else {
                nd0Var.K0 = i3;
                nd0Var.L0 = i10;
            }
        }
        TextureView textureView3 = this.f13958r;
        if (textureView3 != null) {
            addView(textureView3);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f13952l0) {
            v(motionEvent);
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void p(f7 f7Var, boolean z10) {
        boolean z11;
        String str;
        float f10;
        float f11;
        float f12;
        m51 m51Var = this.E;
        if (m51Var != null) {
            m51Var.g0();
            this.E.m0();
            this.E = null;
        }
        if (f7Var != null) {
            fb fbVar = this.G;
            boolean z12 = false;
            if (fbVar != null) {
                String str2 = f7Var.f12751y;
                String str3 = f7Var.A;
                String str4 = f7Var.B;
                long j10 = f7Var.C;
                long j11 = f7Var.D;
                float f13 = f7Var.E;
                float f14 = f7Var.F;
                float f15 = f7Var.G;
                if (!TextUtils.equals(fbVar.P, str2)) {
                    ya yaVar = fbVar.f12762b0;
                    if (yaVar != null) {
                        yaVar.a();
                        fbVar.f12762b0 = null;
                        fbVar.V = false;
                    }
                    fbVar.P = str2;
                    fbVar.p();
                }
                fbVar.P = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                fbVar.O = !isEmpty;
                if (isEmpty) {
                    fbVar.Q = false;
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
                if (fbVar.O) {
                    fbVar.S = j10;
                    fbVar.R = j11 - (((float) j10) * f13);
                    fbVar.T = f13;
                    fbVar.U = f14;
                    fbVar.W = f15;
                    float f16 = 0.0f;
                    if (str != null) {
                        StaticLayout staticLayout = new StaticLayout(str, fbVar.M0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        fbVar.N0 = staticLayout;
                        if (staticLayout.getLineCount() > 0) {
                            f11 = fbVar.N0.getLineWidth(0);
                        } else {
                            f11 = 0.0f;
                        }
                        fbVar.O0 = f11;
                        if (fbVar.N0.getLineCount() > 0) {
                            f12 = fbVar.N0.getLineLeft(0);
                        } else {
                            f12 = 0.0f;
                        }
                        fbVar.P0 = f12;
                    } else {
                        fbVar.O0 = 0.0f;
                        fbVar.N0 = null;
                    }
                    if (str4 != null) {
                        StaticLayout staticLayout2 = new StaticLayout(str4, fbVar.Q0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        fbVar.R0 = staticLayout2;
                        if (staticLayout2.getLineCount() > 0) {
                            f10 = fbVar.R0.getLineWidth(0);
                        } else {
                            f10 = 0.0f;
                        }
                        fbVar.S0 = f10;
                        if (fbVar.R0.getLineCount() > 0) {
                            f16 = fbVar.R0.getLineLeft(0);
                        }
                        fbVar.T0 = f16;
                    } else {
                        fbVar.S0 = 0.0f;
                        fbVar.R0 = null;
                    }
                }
                if (!z10) {
                    z11 = true;
                    fbVar.f12773f0.f(fbVar.O, true);
                } else {
                    z11 = true;
                }
                fbVar.invalidate();
            } else {
                z11 = true;
            }
            if (f7Var.f12751y != null) {
                m51 m51Var2 = new m51();
                this.E = m51Var2;
                m51Var2.E = z11;
                m51Var2.K = new v5(this, 0);
                m51Var2.j0(Uri.fromFile(new File(f7Var.f12751y)), "other");
                c();
                if (this.f13943e != null && getDuration() > 0) {
                    long duration = f7Var.Z * ((float) getDuration());
                    this.f13943e.q0(duration, false);
                    this.G.setProgress(duration);
                }
                z11 = true;
                w(true);
            }
            va vaVar = ((ja) this).D0;
            x9 x9Var = vaVar.f13770w1;
            if (x9Var != null) {
                f7 f7Var2 = vaVar.L1;
                if (f7Var2 != null && f7Var2.f12751y != null) {
                    z12 = z11;
                }
                x9Var.setHasAudio(z12);
            }
        }
    }

    public final void q(zi ziVar) {
        long j10;
        int maxCount;
        f7 f7Var = this.d;
        if (f7Var != null) {
            f7Var.f12723j = true;
            float f10 = 1.0f;
            if (ziVar != null) {
                int i3 = ziVar.I1;
                if (ziVar.f26868k != null) {
                    TLRPC.Document F0 = ziVar.F0();
                    if (F0 != null && F0.f27007id != 0) {
                        this.d.f12753z = new TLRPC.TL_inputDocument();
                        TLRPC.InputDocument inputDocument = this.d.f12753z;
                        inputDocument.f27013id = F0.f27007id;
                        inputDocument.file_reference = F0.file_reference;
                        inputDocument.access_hash = F0.access_hash;
                    }
                    int i10 = 0;
                    if (!TextUtils.isEmpty(ziVar.f26868k.attachPath)) {
                        this.d.f12751y = ziVar.f26868k.attachPath;
                    } else {
                        org.telegram.messenger.w7.G(i3);
                        File K = org.telegram.messenger.w7.K(F0, null, false, true);
                        if (K == null || !K.exists()) {
                            org.telegram.messenger.w7.G(i3);
                            K = org.telegram.messenger.w7.K(F0, null, true, true);
                            if (K != null && K.exists()) {
                                this.d.f12751y = K.getAbsolutePath();
                            } else {
                                f7 f7Var2 = this.d;
                                f7Var2.f12751y = null;
                                f7Var2.f12753z = null;
                                f7Var2.A = null;
                                f7Var2.B = null;
                                f7Var2.D = 0L;
                                f7Var2.C = 0L;
                                f7Var2.E = 0.0f;
                                f7Var2.F = 1.0f;
                                return;
                            }
                        }
                        this.d.f12751y = K.getAbsolutePath();
                    }
                    f7 f7Var3 = this.d;
                    f7Var3.A = null;
                    f7Var3.B = null;
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
                    f7 f7Var4 = this.d;
                    f7Var4.D = 0L;
                    if (f7Var4.K) {
                        f7Var4.D = f7Var4.Z * ((float) getDuration());
                    }
                    this.d.E = 0.0f;
                    if (j()) {
                        ArrayList arrayList2 = this.F.h;
                        int size2 = arrayList2.size();
                        while (i10 < size2) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            f7 f7Var5 = ((d0) obj).f12544n;
                            if (f7Var5 != null && f7Var5.K) {
                                j10 = this.F.getDuration();
                                break;
                            }
                        }
                    }
                    f7 f7Var6 = this.d;
                    if (f7Var6.K) {
                        j10 = getDuration();
                    } else {
                        j10 = f7Var6.C;
                    }
                    fb fbVar = this.G;
                    if (fbVar == null) {
                        maxCount = 1;
                    } else {
                        maxCount = fbVar.getMaxCount();
                    }
                    f7 f7Var7 = this.d;
                    if (f7Var7.C != 0) {
                        f10 = Math.min(1.0f, ((float) Math.min(j10, maxCount * 59000)) / ((float) this.d.C));
                    }
                    f7Var7.F = f10;
                }
            }
            f7Var.f12751y = null;
            f7Var.f12753z = null;
            f7Var.A = null;
            f7Var.B = null;
            f7Var.D = 0L;
            f7Var.C = 0L;
            f7Var.E = 0.0f;
            f7Var.F = 1.0f;
        }
        p(this.d, true);
    }

    public final void r() {
        int i3;
        if (this.d == null) {
            return;
        }
        if (getMeasuredHeight() > 0) {
            i3 = getMeasuredHeight();
        } else {
            i3 = org.telegram.messenger.g0.f22608q.y;
        }
        f7 f7Var = this.d;
        int i10 = f7Var.A0;
        Paint paint = this.U;
        if (i10 != 0 && f7Var.B0 != 0) {
            float f10 = i3;
            f7 f7Var2 = this.d;
            int i11 = f7Var2.A0;
            this.V = i11;
            int i12 = f7Var2.B0;
            this.W = i12;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f10, new int[]{i11, i12}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            b51 b51Var = this.f13953n;
            if (b51Var != null) {
                int i13 = this.V;
                int i14 = this.W;
                py pyVar = b51Var.f32088b;
                if (pyVar == null) {
                    b51Var.f32092n = i13;
                    b51Var.f32093r = i14;
                } else {
                    pyVar.h(i13, i14);
                }
            }
            nd0 nd0Var = this.f13960s;
            if (nd0Var != null) {
                int i15 = this.V;
                int i16 = this.W;
                py pyVar2 = nd0Var.m0;
                if (pyVar2 != null) {
                    pyVar2.h(i15, i16);
                } else {
                    nd0Var.K0 = i15;
                    nd0Var.L0 = i16;
                }
            }
        } else {
            Bitmap bitmap = this.f13936a;
            if (bitmap != null) {
                new s3(this, i3, 1).a(nc.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        }
        invalidate();
    }

    public final void s(f7 f7Var, ug.r1 r1Var, boolean z10) {
        m51 m51Var;
        if (f7Var != null && f7Var.f12733o0 != null) {
            m51 m51Var2 = this.f13969y;
            if (m51Var2 != null) {
                m51Var2.m0();
                this.f13969y = null;
            }
            m51 m51Var3 = new m51();
            this.f13969y = m51Var3;
            m51Var3.E = true;
            m51Var3.K = new w5(this, 0);
            this.f13969y.j0(Uri.fromFile(f7Var.f12733o0), "other");
            c();
            this.f13967x = r1Var;
            if (r1Var != null && (m51Var = this.f13969y) != null) {
                m51Var.A0(r1Var.f56240v0);
            }
            this.G.n(f7Var.f12733o0.getAbsolutePath(), f7Var.f12737q0, f7Var.f12739r0, f7Var.f12741s0, f7Var.f12743t0, f7Var.f12745u0, z10);
            y(true);
            return;
        }
        m51 m51Var4 = this.f13969y;
        if (m51Var4 != null) {
            m51Var4.g0();
            this.f13969y.m0();
            this.f13969y = null;
        }
        fb fbVar = this.G;
        if (fbVar != null) {
            fbVar.setRoundNull(z10);
        }
        this.f13967x = null;
        org.telegram.messenger.g0.r(this.L);
    }

    public void set(f7 f7Var) {
        n(f7Var, null, 0L);
    }

    public void setAllowCropping(boolean z10) {
        this.f13952l0 = z10;
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
        this.f13946f0 = z10;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.f13971z0 = runnable;
    }

    public void setVideoTimelineView(fb fbVar) {
        this.G = fbVar;
        if (fbVar != null) {
            fbVar.setDelegate(new android.support.v4.media.c(this, 28));
        }
    }

    @Override
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        if (i3 == 8) {
            set(null);
        }
    }

    public final void t(f7 f7Var, Runnable runnable, long j10) {
        org.telegram.ui.Components.x9 x9Var;
        boolean z10;
        ArrayList arrayList;
        org.telegram.ui.Components.ca caVar;
        float f10 = 0.0f;
        if (f7Var != null && !f7Var.v()) {
            m51 m51Var = this.f13943e;
            if (m51Var != null) {
                m51Var.m0();
                this.f13943e = null;
            }
            m51 m51Var2 = new m51();
            this.f13943e = m51Var2;
            m51Var2.E = true;
            m51Var2.K = new android.support.v4.media.session.a0((FrameLayout) this, (Object) f7Var, (Serializable) new Runnable[]{runnable}, 25);
            b51 b51Var = this.f13953n;
            if (b51Var != null) {
                b51Var.clearAnimation();
                b51 b51Var2 = this.f13953n;
                py pyVar = b51Var2.f32088b;
                if (pyVar != null) {
                    pyVar.postRunnable(new my(pyVar, 0));
                }
                b51Var2.f32087a = null;
                removeView(this.f13953n);
                this.f13953n = null;
            }
            this.f13953n = new b51(getContext(), this.f13943e);
            this.H.e();
            b51 b51Var3 = this.f13953n;
            if (f7Var.f12744u) {
                x9Var = null;
            } else {
                x9Var = this.H;
            }
            b51Var3.f32094s = x9Var;
            py pyVar2 = b51Var3.f32088b;
            if (pyVar2 != null && (caVar = pyVar2.J) != null) {
                org.telegram.ui.Components.x9 x9Var2 = caVar.f32638t;
                if (x9Var2 != null && x9Var2.f40281m != null) {
                    x9Var2.f40281m = null;
                }
                caVar.f32638t = x9Var;
                if (x9Var != null && x9Var.f40281m != caVar) {
                    x9Var.f40281m = caVar;
                    x9Var.d();
                }
            }
            this.f13953n.setOpaque(false);
            b();
            x5 x5Var = this.I;
            if (x5Var != null && x5Var.f13843g) {
                x5Var.a(this.f13953n);
            } else {
                b51 b51Var4 = this.f13953n;
                if (runnable != null) {
                    f10 = 1.0f;
                }
                b51Var4.setAlpha(f10);
                addView(this.f13953n, mf.e(-2, -2, 51));
            }
            ai.v2 v2Var = new ai.v2(this, 27);
            e7 e7Var = f7Var.f12712d1;
            if (e7Var != null) {
                v2Var.a(e7Var);
            } else if (f7Var.K && Build.VERSION.SDK_INT >= 24) {
                Utilities.f21387e.c(new a7(f7Var, v2Var, 0));
            } else {
                ?? obj = new Object();
                f7Var.f12712d1 = obj;
                v2Var.a(obj);
            }
            File file = f7Var.Z0;
            if (file == null) {
                file = f7Var.L;
            }
            this.f13943e.j0(Uri.fromFile(file), "other");
            this.f13943e.u0(this.A0.isEmpty());
            this.f13943e.s0(true);
            if (f7Var.h) {
                j10 = (f7Var.Z * ((float) f7Var.f12720h0)) + ((float) j10);
            }
            int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i3 > 0) {
                this.f13943e.q0(j10, false);
            }
            c();
            w(true);
            if (f7Var.f12744u && (arrayList = f7Var.v) != null && arrayList.size() == 1 && ((zi) f7Var.v.get(0)).D == 5) {
                z10 = true;
            } else {
                z10 = false;
            }
            fb fbVar = this.G;
            File file2 = f7Var.Z0;
            if (file2 == null) {
                file2 = f7Var.L;
            }
            fbVar.o(z10, file2.getAbsolutePath(), getDuration(), f7Var.P);
            this.G.setVideoLeft(f7Var.Z);
            this.G.setVideoRight(f7Var.f12703a0);
            fb fbVar2 = this.G;
            if (fbVar2 != null && i3 > 0) {
                fbVar2.setProgress(j10);
                return;
            }
            return;
        }
        m51 m51Var3 = this.f13943e;
        if (m51Var3 != null) {
            m51Var3.g0();
            this.f13943e.m0();
            this.f13943e = null;
        }
        x5 x5Var2 = this.I;
        if (x5Var2 != null && x5Var2.f13843g) {
            x5Var2.a(null);
        } else {
            b51 b51Var5 = this.f13953n;
            if (b51Var5 != null) {
                b51Var5.clearAnimation();
                this.f13953n.animate().alpha(0.0f).withEndAction(new u5(this, 6)).start();
            }
        }
        fb fbVar3 = this.G;
        if (fbVar3 != null) {
            fbVar3.o(false, null, 1L, 0.0f);
        }
        org.telegram.messenger.g0.r(this.L);
        if (runnable != null) {
            org.telegram.messenger.g0.h3(runnable);
        }
    }

    public final void u(f7 f7Var) {
        Drawable drawable = this.T;
        this.S = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (f7Var == null) {
            this.T = null;
            return;
        }
        long j10 = f7Var.f12754z0;
        if (j10 != Long.MIN_VALUE) {
            Drawable e10 = e(this.T, f7Var.f12702a, j10, f7Var.f12752y0);
            f7Var.f12750x0 = e10;
            this.T = e10;
            if (this.S != e10) {
                this.S = null;
            }
            if (e10 != null) {
                e10.setCallback(this);
            }
            org.telegram.ui.Components.x9 x9Var = this.H;
            if (x9Var != null) {
                Drawable drawable2 = this.T;
                if (drawable2 != null) {
                    if (drawable2 instanceof BitmapDrawable) {
                        x9Var.f(((BitmapDrawable) drawable2).getBitmap(), false);
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
                        x9Var.f(createBitmap, true);
                    }
                } else {
                    x9Var.f(null, false);
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
        f7 f7Var;
        PointF pointF;
        boolean z11;
        boolean z12;
        if (this.f13952l0) {
            if (motionEvent.getPointerCount() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            PointF pointF2 = this.f13954n0;
            if (z10) {
                pointF2.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                pointF2.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                f10 = a7.h.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                d = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
            } else {
                pointF2.x = motionEvent.getX(0);
                pointF2.y = motionEvent.getY(0);
                d = 0.0d;
                f10 = 0.0f;
            }
            boolean z13 = this.f13957q0;
            PointF pointF3 = this.m0;
            if (z13 != z10) {
                pointF3.x = pointF2.x;
                pointF3.y = pointF2.y;
                this.f13955o0 = f10;
                this.f13956p0 = d;
                this.f13957q0 = z10;
            }
            if (this.d != null) {
                float width = f7Var.f12722i0 / getWidth();
                int actionMasked = motionEvent.getActionMasked();
                Matrix matrix = this.f13962t0;
                if (actionMasked == 0) {
                    this.f13964v0 = 0.0f;
                    this.f13966w0 = false;
                    invalidate();
                    this.f13968x0 = true;
                    matrix.set(this.d.f12731n0);
                }
                if (motionEvent.getActionMasked() == 2 && this.f13968x0 && this.d != null) {
                    float f11 = pointF2.x * width;
                    float f12 = pointF2.y * width;
                    float f13 = pointF3.x * width;
                    float f14 = pointF3.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f15 = this.f13955o0;
                        if (f15 != 0.0f) {
                            float f16 = f10 / f15;
                            matrix.postScale(f16, f16, f11, f12);
                        }
                        pointF = pointF2;
                        float degrees = (float) Math.toDegrees(d - this.f13956p0);
                        float f17 = this.f13964v0 + degrees;
                        this.f13964v0 = f17;
                        if (!this.f13961s0) {
                            if (Math.abs(f17) > 20.0f) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.f13961s0 = z11;
                            if (!z11) {
                                d(matrix);
                                if ((Math.round(this.f13944e0 / 90.0f) * 90.0f) - this.f13944e0 > 20.0f) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                this.f13961s0 = z12;
                            }
                            if (!this.f13966w0) {
                                org.telegram.messenger.g0.c4(this);
                                this.f13966w0 = true;
                            }
                        }
                        if (this.f13961s0) {
                            matrix.postRotate(degrees, f11, f12);
                        }
                        this.f13959r0 = true;
                    } else {
                        pointF = pointF2;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.f13959r0) {
                        matrix.postTranslate(f11 - f13, f12 - f14);
                    }
                    Matrix matrix2 = this.f13963u0;
                    matrix2.set(matrix);
                    Matrix matrix3 = this.f13937a0;
                    matrix3.set(matrix);
                    d(matrix3);
                    float round = (Math.round(this.f13944e0 / 90.0f) * 90.0f) - this.f13944e0;
                    if (this.f13961s0) {
                        if (Math.abs(round) < 3.5f) {
                            matrix2.postRotate(round, this.f13941c0, this.f13942d0);
                            if (!this.f13966w0) {
                                org.telegram.messenger.g0.c4(this);
                                this.f13966w0 = true;
                            }
                        } else {
                            this.f13966w0 = false;
                        }
                    }
                    this.d.f12731n0.set(matrix2);
                    this.d.f12723j = true;
                    b();
                    invalidate();
                } else {
                    pointF = pointF2;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getPointerCount() <= 1) {
                        this.f13959r0 = false;
                        va vaVar = ((ja) this).D0;
                        vaVar.f13746p1.a(true, false, vaVar.f13729j0);
                        vaVar.f13746p1.b(vaVar.f13710d1.getText());
                    }
                    this.f13968x0 = false;
                    this.f13961s0 = false;
                    this.f13964v0 = 0.0f;
                    this.f13966w0 = false;
                    invalidate();
                }
                PointF pointF4 = pointF;
                pointF3.x = pointF4.x;
                pointF3.y = pointF4.y;
                this.f13955o0 = f10;
                this.f13956p0 = d;
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
        throw new UnsupportedOperationException("Method not decompiled: gi.y5.w(boolean):void");
    }

    public final void x(int i3, boolean z10) {
        HashSet hashSet = this.A0;
        if (z10) {
            hashSet.add(Integer.valueOf(i3));
        } else {
            hashSet.remove(Integer.valueOf(i3));
        }
        m51 m51Var = this.f13943e;
        if (m51Var != null) {
            m51Var.u0(hashSet.isEmpty());
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
        int i3;
        if (this.f13969y != null && this.d != null) {
            boolean z12 = true;
            if (this.f13943e == null && !j()) {
                this.f13969y.u0(this.A0.isEmpty());
                this.f13969y.s0(true);
                ug.r1 r1Var = this.f13967x;
                if (r1Var != null && !r1Var.C0) {
                    r1Var.C0 = true;
                    r1Var.D0.f(true, true);
                    r1Var.invalidate();
                }
                long S2 = this.f13969y.S();
                if (z10 && this.f13969y.U() != -9223372036854775807L) {
                    float U = ((float) S2) / ((float) this.f13969y.U());
                    f7 f7Var = this.d;
                    if ((U < f7Var.f12741s0 || U > f7Var.f12743t0) && System.currentTimeMillis() - this.K > 500) {
                        this.K = System.currentTimeMillis();
                        this.f13969y.q0(-this.d.f12739r0, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (j()) {
                S = this.F.getPositionWithOffset();
                d02 = this.F.f12640r0;
            } else {
                S = this.f13943e.S();
                d02 = this.f13943e.d0();
            }
            f7 f7Var2 = this.d;
            float f11 = f7Var2.f12743t0;
            float f12 = f7Var2.f12741s0;
            long j10 = (f11 - f12) * ((float) f7Var2.f12737q0);
            long j11 = f7Var2.f12739r0;
            if (S >= j11 && S <= j10 + j11) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!d02 || !z11) {
                z12 = false;
            }
            long j12 = (S - j11) + (f12 * f10);
            ug.r1 r1Var2 = this.f13967x;
            if (r1Var2 != null && r1Var2.C0 != z11) {
                r1Var2.C0 = z11;
                r1Var2.invalidate();
            }
            if (this.f13969y.d0() != z12) {
                this.f13969y.u0(z12);
                this.f13969y.q0(j12, false);
            } else if (z10) {
                long abs = Math.abs(this.f13969y.S() - j12);
                if (j()) {
                    i3 = 300;
                } else {
                    i3 = 120;
                }
                if (abs > i3) {
                    this.f13969y.q0(j12, false);
                }
            }
        }
    }
}
