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
public abstract class v5 extends FrameLayout {
    public static final int C0 = 0;
    public final HashSet A0;
    public l0 B0;
    public i61 E;
    public g0 F;
    public cb G;
    public final org.telegram.ui.Components.ca H;
    public final u5 I;
    public long J;
    public long K;
    public final s5 L;
    public final s5 M;
    public final s5 N;
    public r8 O;
    public boolean P;
    public final org.telegram.ui.Components.d6 Q;
    public final Paint R;
    public Drawable S;
    public Drawable T;
    public final Paint U;
    public int V;
    public int W;
    public Bitmap f15619a;
    public final Matrix f15620a0;
    public final Rect f15621b;
    public final float[] f15622b0;
    public final Rect f15623c;
    public float f15624c0;
    public c7 d;
    public float f15625d0;
    public i61 f15626e;
    public float f15627e0;
    public int f15628f;
    public boolean f15629f0;
    public final org.telegram.ui.Components.d6 f15630g0;
    public int h;
    public boolean f15631h0;
    public final Matrix f15632i0;
    public final Matrix f15633j0;
    public final Matrix f15634k0;
    public boolean f15635l0;
    public final PointF m0;
    public y51 f15636n;
    public final PointF f15637n0;
    public float f15638o0;
    public double f15639p0;
    public boolean f15640q0;
    public TextureView f15641r;
    public boolean f15642r0;
    public ee0 f15643s;
    public boolean f15644s0;
    public final Matrix f15645t0;
    public final Matrix f15646u0;
    public float f15647v0;
    public r8 f15648w;
    public boolean f15649w0;
    public tg.t1 f15650x;
    public boolean f15651x0;
    public i61 f15652y;
    public long f15653y0;
    public Runnable f15654z0;

    public v5(Context context, org.telegram.ui.Components.ca caVar, u5 u5Var) {
        super(context);
        this.f15621b = new Rect();
        this.f15623c = new Rect();
        Paint paint = new Paint(1);
        new s5(this, 2);
        this.L = new s5(this, 3);
        this.M = new s5(this, 4);
        this.N = new s5(this, 5);
        this.Q = new org.telegram.ui.Components.d6(this, 0L, 350L, nr.h);
        this.R = new Paint(7);
        this.U = new Paint(1);
        this.f15620a0 = new Matrix();
        this.f15622b0 = new float[2];
        this.f15629f0 = true;
        this.f15630g0 = new org.telegram.ui.Components.d6(this, 0L, 320L, nr.f37962g);
        this.f15631h0 = false;
        this.f15632i0 = new Matrix();
        this.f15633j0 = new Matrix();
        this.f15634k0 = new Matrix();
        this.f15635l0 = true;
        this.m0 = new PointF();
        this.f15637n0 = new PointF();
        this.f15645t0 = new Matrix();
        this.f15646u0 = new Matrix();
        this.A0 = new HashSet();
        this.H = caVar;
        this.I = u5Var;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(org.telegram.messenger.g0.L(3.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), 1073741824);
    }

    public static void a(hi.v5 r13, hi.c7 r14) {
        throw new UnsupportedOperationException("Method not decompiled: hi.v5.a(hi.v5, hi.c7):void");
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
        throw new UnsupportedOperationException("Method not decompiled: hi.v5.f(android.graphics.drawable.Drawable, int, org.telegram.tgnet.TLRPC$WallPaper, boolean):android.graphics.drawable.Drawable");
    }

    public static Drawable g(int i7, final org.telegram.ui.ActionBar.s3 s3Var, final boolean z10) {
        if (s3Var.l()) {
            org.telegram.ui.ActionBar.m6.I(org.telegram.ui.ActionBar.s3.d(z10), s3Var.g(i7, z10 ? 1 : 0), ((org.telegram.ui.ActionBar.r3) s3Var.f29987f.get(z10 ? 1 : 0)).f29963g, 0, false);
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
        cb0Var.f34152g = false;
        cb0Var.s(s3Var.j(z10 ? 1 : 0).settings.intensity, cb0Var.f34165u);
        cb0Var.o(i11, i13, i15, i17, 0, true);
        cb0Var.u(0);
        final int f10 = cb0Var.f();
        s3Var.n(z10 ? 1 : 0, new ResultCallback() {
            @Override
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair != null) {
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((gg.a) pair.second).f13639a;
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

    private void setupCollage(c7 c7Var) {
        ArrayList<c7> arrayList;
        cb cbVar = this.G;
        if (cbVar != null) {
            if (c7Var != null) {
                arrayList = c7Var.T;
            } else {
                arrayList = null;
            }
            cbVar.setCollage(arrayList);
        }
    }

    private void setupImage(c7 c7Var) {
        Utilities.f22812g.c(new c(7, this, c7Var));
    }

    public abstract void b();

    public final void c() {
        float f10;
        float f11;
        c7 c7Var;
        i61 i61Var = this.f15626e;
        float f12 = 0.0f;
        if (i61Var != null) {
            if (!this.P && ((c7Var = this.d) == null || !c7Var.Y)) {
                if (c7Var != null) {
                    f11 = c7Var.P;
                } else {
                    f11 = 1.0f;
                }
            } else {
                f11 = 0.0f;
            }
            i61Var.B0(f11);
        }
        i61 i61Var2 = this.f15652y;
        if (i61Var2 != null) {
            if (this.P) {
                f10 = 0.0f;
            } else {
                c7 c7Var2 = this.d;
                if (c7Var2 != null) {
                    f10 = c7Var2.f14381u0;
                } else {
                    f10 = 1.0f;
                }
            }
            i61Var2.B0(f10);
        }
        i61 i61Var3 = this.E;
        if (i61Var3 != null) {
            if (!this.P) {
                c7 c7Var3 = this.d;
                if (c7Var3 != null) {
                    f12 = c7Var3.G;
                } else {
                    f12 = 1.0f;
                }
            }
            i61Var3.B0(f12);
        }
        g0 g0Var = this.F;
        if (g0Var != null) {
            g0Var.setMuted(this.P);
        }
    }

    public final void d(Matrix matrix) {
        c7 c7Var = this.d;
        if (c7Var == null) {
            return;
        }
        float[] fArr = this.f15622b0;
        fArr[0] = c7Var.f14362k0 / 2.0f;
        fArr[1] = c7Var.f14364l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f15624c0 = fArr[0];
        this.f15625d0 = fArr[1];
        c7 c7Var2 = this.d;
        fArr[0] = c7Var2.f14362k0;
        fArr[1] = c7Var2.f14364l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f15627e0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.f15625d0, fArr[0] - this.f15624c0));
        a8.w9.a(this.f15624c0, this.f15625d0, fArr[0], fArr[1]);
        c7 c7Var3 = this.d;
        fArr[0] = c7Var3.f14362k0 / 2.0f;
        fArr[1] = c7Var3.f14364l0;
        matrix.mapPoints(fArr);
        a8.w9.a(this.f15624c0, this.f15625d0, fArr[0], fArr[1]);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        c7 c7Var;
        xe xeVar;
        if (this.T != null) {
            float f10 = 0.0f;
            if (this.f15631h0) {
                Path path = new Path();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.T;
            if (!(drawable instanceof cb0) || ((cb0) drawable).f34165u != null) {
                f10 = this.Q.e(false, 1.0f);
            }
            Drawable drawable2 = this.S;
            if (drawable2 != null && f10 < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - f10) * 255.0f));
                c7.j(canvas, this.S, getWidth(), getHeight());
            }
            this.T.setAlpha((int) (f10 * 255.0f));
            c7.j(canvas, this.T, getWidth(), getHeight());
            if (this.f15631h0) {
                canvas.restore();
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.U);
        }
        l0 l0Var = this.B0;
        if (l0Var != null) {
            l0Var.d.b(canvas2, true);
        } else if (this.f15629f0 && this.d != null && !j()) {
            if (this.f15619a == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            float d = this.f15630g0.d(z10);
            if (this.f15619a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.f14358i0, getHeight() / this.d.f14360j0);
                canvas2.concat(this.d.f14367n0);
                if (this.d.m0 != null) {
                    canvas2.translate(c7Var.f14362k0 / 2.0f, c7Var.f14364l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    c7 c7Var2 = this.d;
                    int i7 = c7Var2.f14362k0;
                    int i10 = c7Var2.f14364l0;
                    int i11 = c7Var2.Q;
                    xe xeVar2 = c7Var2.m0;
                    if (((i11 + xeVar2.f27881k) / 90) % 2 == 1) {
                        i10 = i7;
                        i7 = i10;
                    }
                    float f11 = xeVar2.f27877e;
                    float f12 = xeVar2.f27878f;
                    float f13 = i7;
                    float f14 = i10;
                    canvas2.clipRect(((-i7) * f11) / 2.0f, ((-i10) * f12) / 2.0f, (f11 * f13) / 2.0f, (f12 * f14) / 2.0f);
                    float f15 = this.d.m0.f27876c;
                    canvas2.scale(f15, f15);
                    xe xeVar3 = this.d.m0;
                    canvas2.translate(xeVar3.f27874a * f13, xeVar3.f27875b * f14);
                    canvas2.rotate(this.d.m0.d + xeVar.f27881k);
                    if (this.d.m0.f27882l) {
                        canvas2.scale(-1.0f, 1.0f);
                    }
                    canvas2.rotate(this.d.Q);
                    c7 c7Var3 = this.d;
                    canvas2.translate((-c7Var3.f14362k0) / 2.0f, (-c7Var3.f14364l0) / 2.0f);
                }
                Paint paint = this.R;
                paint.setAlpha((int) ((1.0f - d) * 255.0f));
                int width = this.f15619a.getWidth();
                int height = this.f15619a.getHeight();
                Rect rect = this.f15621b;
                rect.set(0, 0, width, height);
                c7 c7Var4 = this.d;
                int i12 = c7Var4.f14362k0;
                int i13 = c7Var4.f14364l0;
                Rect rect2 = this.f15623c;
                rect2.set(0, 0, i12, i13);
                canvas2.drawBitmap(this.f15619a, rect, rect2, paint);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: hi.v5.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        c7 c7Var;
        c7 c7Var2;
        y51 y51Var = this.f15636n;
        if (view == y51Var && (c7Var2 = this.d) != null && c7Var2.f14380u) {
            return false;
        }
        if ((view == y51Var || view == this.f15641r) && (c7Var = this.d) != null && c7Var.m0 != null) {
            canvas.save();
            canvas.scale(getWidth() / this.d.f14358i0, getHeight() / this.d.f14360j0);
            canvas.concat(this.d.f14367n0);
            c7 c7Var3 = this.d;
            if (c7Var3.m0 != null) {
                canvas.translate(c7Var3.f14362k0 / 2.0f, c7Var3.f14364l0 / 2.0f);
                canvas.rotate(-this.d.Q);
                c7 c7Var4 = this.d;
                int i7 = c7Var4.f14362k0;
                int i10 = c7Var4.f14364l0;
                int i11 = c7Var4.Q;
                xe xeVar = c7Var4.m0;
                if (((i11 + xeVar.f27881k) / 90) % 2 == 1) {
                    i10 = i7;
                    i7 = i10;
                }
                float f10 = xeVar.f27877e;
                float f11 = xeVar.f27878f;
                canvas.clipRect(((-i7) * f10) / 2.0f, ((-i10) * f11) / 2.0f, (i7 * f10) / 2.0f, (i10 * f11) / 2.0f);
                canvas.rotate(this.d.Q);
                c7 c7Var5 = this.d;
                canvas.translate((-c7Var5.f14362k0) / 2.0f, (-c7Var5.f14364l0) / 2.0f);
            }
            canvas.concat(this.f15632i0);
            canvas.scale(1.0f / (getWidth() / this.d.f14358i0), 1.0f / (getHeight() / this.d.f14360j0));
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public int getContentHeight() {
        c7 c7Var = this.d;
        if (c7Var == null) {
            return 1;
        }
        return c7Var.f14364l0;
    }

    public int getContentWidth() {
        c7 c7Var = this.d;
        if (c7Var == null) {
            return 1;
        }
        return c7Var.f14362k0;
    }

    public long getCurrentPosition() {
        i61 i61Var = this.f15626e;
        if (i61Var != null) {
            return i61Var.S();
        }
        i61 i61Var2 = this.f15652y;
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
        c7 c7Var = this.d;
        if (c7Var != null) {
            double d = c7Var.f14357i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        i61 i61Var = this.f15626e;
        if (i61Var != null && i61Var.U() != -9223372036854775807L) {
            return this.f15626e.U();
        }
        return 1L;
    }

    public int getOrientation() {
        c7 c7Var = this.d;
        if (c7Var == null) {
            return 0;
        }
        return c7Var.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        if (this.d == null) {
            return new Pair<>(1080, 1920);
        }
        return new Pair<>(Integer.valueOf(this.d.f14358i0), Integer.valueOf(this.d.f14360j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.f15619a;
    }

    public y51 getTextureView() {
        return this.f15636n;
    }

    public final void h(y10 y10Var, View... viewArr) {
        y51 y51Var;
        int L = (int) (org.telegram.messenger.g0.L(26.0f) * org.telegram.messenger.g0.f24045p);
        int L2 = (int) (org.telegram.messenger.g0.L(30.33f) * org.telegram.messenger.g0.f24045p);
        int L3 = (int) (org.telegram.messenger.g0.L(4.0f) * org.telegram.messenger.g0.f24045p);
        ?? r52 = new Bitmap[viewArr.length];
        for (int i7 = 0; i7 < viewArr.length; i7++) {
            View view = viewArr[i7];
            if (view != null && view.getWidth() >= 0 && viewArr[i7].getHeight() > 0) {
                View view2 = viewArr[i7];
                if (view2 == this && (y51Var = this.f15636n) != null) {
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
        Utilities.f22810e.c(new r5(L, L2, L3, r52, y10Var, 0));
    }

    public abstract void i();

    public final boolean j() {
        c7 c7Var;
        if (this.F != null && (c7Var = this.d) != null && c7Var.v()) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        return !this.A0.contains(-9982);
    }

    public final void l(c7 c7Var) {
        this.d = c7Var;
        if (c7Var == null) {
            setupImage(null);
            u(null);
            this.U.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (c7Var.K) {
            setupImage(c7Var);
            if (c7Var.A0 == 0 && c7Var.B0 == 0) {
                c7Var.z(new s5((ga) this, 0));
            } else {
                r();
            }
        } else {
            setupImage(c7Var);
            r();
        }
        b();
        u(c7Var);
        p(c7Var, false);
        s(c7Var, null, false);
    }

    public final void m(long j3) {
        i61 i61Var = this.f15626e;
        if (i61Var != null) {
            i61Var.q0(j3, false);
        } else if (j()) {
            this.F.m(j3, false);
        } else {
            i61 i61Var2 = this.f15652y;
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

    public final void n(c7 c7Var, x8 x8Var, long j3) {
        this.d = c7Var;
        if (c7Var == null) {
            t(null, x8Var, j3);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.U.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (c7Var.v()) {
            setupImage(null);
            t(null, x8Var, j3);
            setupCollage(c7Var);
        } else if (c7Var.K) {
            setupImage(c7Var);
            setupCollage(null);
            t(c7Var, x8Var, j3);
            if (c7Var.A0 == 0 && c7Var.B0 == 0) {
                c7Var.z(new s5(this, 1));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, x8Var, 0L);
            setupImage(c7Var);
            r();
        }
        b();
        u(c7Var);
        p(c7Var, false);
        s(c7Var, null, false);
    }

    public final void o(TextureView textureView, ee0 ee0Var) {
        TextureView textureView2 = this.f15641r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.f15641r = null;
        }
        this.f15643s = ee0Var;
        this.f15641r = textureView;
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
        TextureView textureView3 = this.f15641r;
        if (textureView3 != null) {
            addView(textureView3);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f15635l0) {
            v(motionEvent);
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void p(c7 c7Var, boolean z10) {
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
        if (c7Var != null) {
            cb cbVar = this.G;
            boolean z12 = false;
            if (cbVar != null) {
                String str2 = c7Var.f14387y;
                String str3 = c7Var.A;
                String str4 = c7Var.B;
                long j3 = c7Var.C;
                long j10 = c7Var.D;
                float f13 = c7Var.E;
                float f14 = c7Var.F;
                float f15 = c7Var.G;
                if (!TextUtils.equals(cbVar.P, str2)) {
                    va vaVar = cbVar.f14401b0;
                    if (vaVar != null) {
                        vaVar.a();
                        cbVar.f14401b0 = null;
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
                    cbVar.f14412f0.f(cbVar.O, true);
                } else {
                    z11 = true;
                }
                cbVar.invalidate();
            } else {
                z11 = true;
            }
            if (c7Var.f14387y != null) {
                i61 i61Var2 = new i61();
                this.E = i61Var2;
                i61Var2.E = z11;
                i61Var2.K = new w4(this, 1);
                i61Var2.j0(Uri.fromFile(new File(c7Var.f14387y)), "other");
                c();
                if (this.f15626e != null && getDuration() > 0) {
                    long duration = c7Var.Z * ((float) getDuration());
                    this.f15626e.q0(duration, false);
                    this.G.setProgress(duration);
                }
                z11 = true;
                w(true);
            }
            sa saVar = ((ga) this).D0;
            u9 u9Var = saVar.f15456w1;
            if (u9Var != null) {
                c7 c7Var2 = saVar.L1;
                if (c7Var2 != null && c7Var2.f14387y != null) {
                    z12 = z11;
                }
                u9Var.setHasAudio(z12);
            }
        }
    }

    public final void q(gj gjVar) {
        long j3;
        int maxCount;
        c7 c7Var = this.d;
        if (c7Var != null) {
            c7Var.f14359j = true;
            float f10 = 1.0f;
            if (gjVar != null) {
                int i7 = gjVar.K1;
                if (gjVar.f24213k != null) {
                    TLRPC.Document F0 = gjVar.F0();
                    if (F0 != null && F0.f28440id != 0) {
                        this.d.f14389z = new TLRPC.TL_inputDocument();
                        TLRPC.InputDocument inputDocument = this.d.f14389z;
                        inputDocument.f28446id = F0.f28440id;
                        inputDocument.file_reference = F0.file_reference;
                        inputDocument.access_hash = F0.access_hash;
                    }
                    int i10 = 0;
                    if (!TextUtils.isEmpty(gjVar.f24213k.attachPath)) {
                        this.d.f14387y = gjVar.f24213k.attachPath;
                    } else {
                        org.telegram.messenger.w7.G(i7);
                        File J = org.telegram.messenger.w7.J(F0, null, false, true);
                        if (J == null || !J.exists()) {
                            org.telegram.messenger.w7.G(i7);
                            J = org.telegram.messenger.w7.J(F0, null, true, true);
                            if (J != null && J.exists()) {
                                this.d.f14387y = J.getAbsolutePath();
                            } else {
                                c7 c7Var2 = this.d;
                                c7Var2.f14387y = null;
                                c7Var2.f14389z = null;
                                c7Var2.A = null;
                                c7Var2.B = null;
                                c7Var2.D = 0L;
                                c7Var2.C = 0L;
                                c7Var2.E = 0.0f;
                                c7Var2.F = 1.0f;
                                return;
                            }
                        }
                        this.d.f14387y = J.getAbsolutePath();
                    }
                    c7 c7Var3 = this.d;
                    c7Var3.A = null;
                    c7Var3.B = null;
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
                    c7 c7Var4 = this.d;
                    c7Var4.D = 0L;
                    if (c7Var4.K) {
                        c7Var4.D = c7Var4.Z * ((float) getDuration());
                    }
                    this.d.E = 0.0f;
                    if (j()) {
                        ArrayList arrayList2 = this.F.h;
                        int size2 = arrayList2.size();
                        while (i10 < size2) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            c7 c7Var5 = ((f0) obj).f14626n;
                            if (c7Var5 != null && c7Var5.K) {
                                j3 = this.F.getDuration();
                                break;
                            }
                        }
                    }
                    c7 c7Var6 = this.d;
                    if (c7Var6.K) {
                        j3 = getDuration();
                    } else {
                        j3 = c7Var6.C;
                    }
                    cb cbVar = this.G;
                    if (cbVar == null) {
                        maxCount = 1;
                    } else {
                        maxCount = cbVar.getMaxCount();
                    }
                    c7 c7Var7 = this.d;
                    if (c7Var7.C != 0) {
                        f10 = Math.min(1.0f, ((float) Math.min(j3, maxCount * 59000)) / ((float) this.d.C));
                    }
                    c7Var7.F = f10;
                }
            }
            c7Var.f14387y = null;
            c7Var.f14389z = null;
            c7Var.A = null;
            c7Var.B = null;
            c7Var.D = 0L;
            c7Var.C = 0L;
            c7Var.E = 0.0f;
            c7Var.F = 1.0f;
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
            i7 = org.telegram.messenger.g0.f24046q.y;
        }
        c7 c7Var = this.d;
        int i10 = c7Var.A0;
        Paint paint = this.U;
        if (i10 != 0 && c7Var.B0 != 0) {
            float f10 = i7;
            c7 c7Var2 = this.d;
            int i11 = c7Var2.A0;
            this.V = i11;
            int i12 = c7Var2.B0;
            this.W = i12;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f10, new int[]{i11, i12}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            y51 y51Var = this.f15636n;
            if (y51Var != null) {
                int i13 = this.V;
                int i14 = this.W;
                ez ezVar = y51Var.f42323b;
                if (ezVar == null) {
                    y51Var.f42327n = i13;
                    y51Var.f42328r = i14;
                } else {
                    ezVar.h(i13, i14);
                }
            }
            ee0 ee0Var = this.f15643s;
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
            Bitmap bitmap = this.f15619a;
            if (bitmap != null) {
                new ai.b2(this, i7, 2).a(c8.j0.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        }
        invalidate();
    }

    public final void s(c7 c7Var, tg.t1 t1Var, boolean z10) {
        i61 i61Var;
        if (c7Var != null && c7Var.f14369o0 != null) {
            i61 i61Var2 = this.f15652y;
            if (i61Var2 != null) {
                i61Var2.m0();
                this.f15652y = null;
            }
            i61 i61Var3 = new i61();
            this.f15652y = i61Var3;
            i61Var3.E = true;
            i61Var3.K = new h9.g1(this, 3);
            this.f15652y.j0(Uri.fromFile(c7Var.f14369o0), "other");
            c();
            this.f15650x = t1Var;
            if (t1Var != null && (i61Var = this.f15652y) != null) {
                i61Var.A0(t1Var.f58181v0);
            }
            this.G.n(c7Var.f14369o0.getAbsolutePath(), c7Var.f14373q0, c7Var.f14375r0, c7Var.f14377s0, c7Var.f14379t0, c7Var.f14381u0, z10);
            y(true);
            return;
        }
        i61 i61Var4 = this.f15652y;
        if (i61Var4 != null) {
            i61Var4.g0();
            this.f15652y.m0();
            this.f15652y = null;
        }
        cb cbVar = this.G;
        if (cbVar != null) {
            cbVar.setRoundNull(z10);
        }
        this.f15650x = null;
        org.telegram.messenger.g0.r(this.L);
    }

    public void set(c7 c7Var) {
        n(c7Var, null, 0L);
    }

    public void setAllowCropping(boolean z10) {
        this.f15635l0 = z10;
    }

    public void setCollageView(g0 g0Var) {
        this.F = g0Var;
    }

    public void setCropEditorDrawing(l0 l0Var) {
        if (this.B0 != l0Var) {
            this.B0 = l0Var;
            invalidate();
        }
    }

    public void setDraw(boolean z10) {
        this.f15629f0 = z10;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.f15654z0 = runnable;
    }

    public void setVideoTimelineView(cb cbVar) {
        this.G = cbVar;
        if (cbVar != null) {
            cbVar.setDelegate(new t5(this, 0));
        }
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 == 8) {
            set(null);
        }
    }

    public final void t(c7 c7Var, Runnable runnable, long j3) {
        org.telegram.ui.Components.ca caVar;
        boolean z10;
        ArrayList arrayList;
        org.telegram.ui.Components.ha haVar;
        float f10 = 0.0f;
        if (c7Var != null && !c7Var.v()) {
            i61 i61Var = this.f15626e;
            if (i61Var != null) {
                i61Var.m0();
                this.f15626e = null;
            }
            i61 i61Var2 = new i61();
            this.f15626e = i61Var2;
            i61Var2.E = true;
            i61Var2.K = new h6.m(this, c7Var, new Runnable[]{runnable}, 1);
            y51 y51Var = this.f15636n;
            if (y51Var != null) {
                y51Var.clearAnimation();
                y51 y51Var2 = this.f15636n;
                ez ezVar = y51Var2.f42323b;
                if (ezVar != null) {
                    ezVar.postRunnable(new bz(ezVar, 0));
                }
                y51Var2.f42322a = null;
                removeView(this.f15636n);
                this.f15636n = null;
            }
            this.f15636n = new y51(getContext(), this.f15626e);
            this.H.e();
            y51 y51Var3 = this.f15636n;
            if (c7Var.f14380u) {
                caVar = null;
            } else {
                caVar = this.H;
            }
            y51Var3.f42329s = caVar;
            ez ezVar2 = y51Var3.f42323b;
            if (ezVar2 != null && (haVar = ezVar2.J) != null) {
                org.telegram.ui.Components.ca caVar2 = haVar.f35857t;
                if (caVar2 != null && caVar2.f34135m != null) {
                    caVar2.f34135m = null;
                }
                haVar.f35857t = caVar;
                if (caVar != null && caVar.f34135m != haVar) {
                    caVar.f34135m = haVar;
                    caVar.d();
                }
            }
            this.f15636n.setOpaque(false);
            b();
            u5 u5Var = this.I;
            if (u5Var != null && u5Var.f15546g) {
                u5Var.a(this.f15636n);
            } else {
                y51 y51Var4 = this.f15636n;
                if (runnable != null) {
                    f10 = 1.0f;
                }
                y51Var4.setAlpha(f10);
                addView(this.f15636n, c8.ma.e(-2, -2, 51));
            }
            ai.h0 h0Var = new ai.h0(this, 29);
            b7 b7Var = c7Var.f14348d1;
            if (b7Var != null) {
                h0Var.a(b7Var);
            } else if (c7Var.K && Build.VERSION.SDK_INT >= 24) {
                Utilities.f22810e.c(new x6(c7Var, h0Var, 0));
            } else {
                ?? obj = new Object();
                c7Var.f14348d1 = obj;
                h0Var.a(obj);
            }
            File file = c7Var.Z0;
            if (file == null) {
                file = c7Var.L;
            }
            this.f15626e.j0(Uri.fromFile(file), "other");
            this.f15626e.u0(this.A0.isEmpty());
            this.f15626e.s0(true);
            if (c7Var.h) {
                j3 = (c7Var.Z * ((float) c7Var.f14356h0)) + ((float) j3);
            }
            int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i7 > 0) {
                this.f15626e.q0(j3, false);
            }
            c();
            w(true);
            if (c7Var.f14380u && (arrayList = c7Var.v) != null && arrayList.size() == 1 && ((gj) c7Var.v.get(0)).D == 5) {
                z10 = true;
            } else {
                z10 = false;
            }
            cb cbVar = this.G;
            File file2 = c7Var.Z0;
            if (file2 == null) {
                file2 = c7Var.L;
            }
            cbVar.o(z10, file2.getAbsolutePath(), getDuration(), c7Var.P);
            this.G.setVideoLeft(c7Var.Z);
            this.G.setVideoRight(c7Var.f14339a0);
            cb cbVar2 = this.G;
            if (cbVar2 != null && i7 > 0) {
                cbVar2.setProgress(j3);
                return;
            }
            return;
        }
        i61 i61Var3 = this.f15626e;
        if (i61Var3 != null) {
            i61Var3.g0();
            this.f15626e.m0();
            this.f15626e = null;
        }
        u5 u5Var2 = this.I;
        if (u5Var2 != null && u5Var2.f15546g) {
            u5Var2.a(null);
        } else {
            y51 y51Var5 = this.f15636n;
            if (y51Var5 != null) {
                y51Var5.clearAnimation();
                this.f15636n.animate().alpha(0.0f).withEndAction(new s5(this, 6)).start();
            }
        }
        cb cbVar3 = this.G;
        if (cbVar3 != null) {
            cbVar3.o(false, null, 1L, 0.0f);
        }
        org.telegram.messenger.g0.r(this.L);
        if (runnable != null) {
            org.telegram.messenger.g0.g3(runnable);
        }
    }

    public final void u(c7 c7Var) {
        Drawable drawable = this.T;
        this.S = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (c7Var == null) {
            this.T = null;
            return;
        }
        long j3 = c7Var.f14390z0;
        if (j3 != Long.MIN_VALUE) {
            Drawable e10 = e(this.T, c7Var.f14338a, j3, c7Var.f14388y0);
            c7Var.f14386x0 = e10;
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
        c7 c7Var;
        PointF pointF;
        boolean z11;
        boolean z12;
        if (this.f15635l0) {
            if (motionEvent.getPointerCount() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            PointF pointF2 = this.f15637n0;
            if (z10) {
                pointF2.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                pointF2.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                f10 = a8.w9.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                d = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
            } else {
                pointF2.x = motionEvent.getX(0);
                pointF2.y = motionEvent.getY(0);
                d = 0.0d;
                f10 = 0.0f;
            }
            boolean z13 = this.f15640q0;
            PointF pointF3 = this.m0;
            if (z13 != z10) {
                pointF3.x = pointF2.x;
                pointF3.y = pointF2.y;
                this.f15638o0 = f10;
                this.f15639p0 = d;
                this.f15640q0 = z10;
            }
            if (this.d != null) {
                float width = c7Var.f14358i0 / getWidth();
                int actionMasked = motionEvent.getActionMasked();
                Matrix matrix = this.f15645t0;
                if (actionMasked == 0) {
                    this.f15647v0 = 0.0f;
                    this.f15649w0 = false;
                    invalidate();
                    this.f15651x0 = true;
                    matrix.set(this.d.f14367n0);
                }
                if (motionEvent.getActionMasked() == 2 && this.f15651x0 && this.d != null) {
                    float f11 = pointF2.x * width;
                    float f12 = pointF2.y * width;
                    float f13 = pointF3.x * width;
                    float f14 = pointF3.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f15 = this.f15638o0;
                        if (f15 != 0.0f) {
                            float f16 = f10 / f15;
                            matrix.postScale(f16, f16, f11, f12);
                        }
                        pointF = pointF2;
                        float degrees = (float) Math.toDegrees(d - this.f15639p0);
                        float f17 = this.f15647v0 + degrees;
                        this.f15647v0 = f17;
                        if (!this.f15644s0) {
                            if (Math.abs(f17) > 20.0f) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.f15644s0 = z11;
                            if (!z11) {
                                d(matrix);
                                if ((Math.round(this.f15627e0 / 90.0f) * 90.0f) - this.f15627e0 > 20.0f) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                this.f15644s0 = z12;
                            }
                            if (!this.f15649w0) {
                                org.telegram.messenger.g0.a4(this);
                                this.f15649w0 = true;
                            }
                        }
                        if (this.f15644s0) {
                            matrix.postRotate(degrees, f11, f12);
                        }
                        this.f15642r0 = true;
                    } else {
                        pointF = pointF2;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.f15642r0) {
                        matrix.postTranslate(f11 - f13, f12 - f14);
                    }
                    Matrix matrix2 = this.f15646u0;
                    matrix2.set(matrix);
                    Matrix matrix3 = this.f15620a0;
                    matrix3.set(matrix);
                    d(matrix3);
                    float round = (Math.round(this.f15627e0 / 90.0f) * 90.0f) - this.f15627e0;
                    if (this.f15644s0) {
                        if (Math.abs(round) < 3.5f) {
                            matrix2.postRotate(round, this.f15624c0, this.f15625d0);
                            if (!this.f15649w0) {
                                org.telegram.messenger.g0.a4(this);
                                this.f15649w0 = true;
                            }
                        } else {
                            this.f15649w0 = false;
                        }
                    }
                    this.d.f14367n0.set(matrix2);
                    this.d.f14359j = true;
                    b();
                    invalidate();
                } else {
                    pointF = pointF2;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getPointerCount() <= 1) {
                        this.f15642r0 = false;
                        sa saVar = ((ga) this).D0;
                        saVar.f15432p1.a(true, false, saVar.f15415j0);
                        saVar.f15432p1.b(saVar.f15397d1.getText());
                    }
                    this.f15651x0 = false;
                    this.f15644s0 = false;
                    this.f15647v0 = 0.0f;
                    this.f15649w0 = false;
                    invalidate();
                }
                PointF pointF4 = pointF;
                pointF3.x = pointF4.x;
                pointF3.y = pointF4.y;
                this.f15638o0 = f10;
                this.f15639p0 = d;
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
        throw new UnsupportedOperationException("Method not decompiled: hi.v5.w(boolean):void");
    }

    public final void x(int i7, boolean z10) {
        HashSet hashSet = this.A0;
        if (z10) {
            hashSet.add(Integer.valueOf(i7));
        } else {
            hashSet.remove(Integer.valueOf(i7));
        }
        i61 i61Var = this.f15626e;
        if (i61Var != null) {
            i61Var.u0(hashSet.isEmpty());
        }
        g0 g0Var = this.F;
        if (g0Var != null) {
            g0Var.setPlaying(hashSet.isEmpty());
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
        if (this.f15652y != null && this.d != null) {
            boolean z12 = true;
            if (this.f15626e == null && !j()) {
                this.f15652y.u0(this.A0.isEmpty());
                this.f15652y.s0(true);
                tg.t1 t1Var = this.f15650x;
                if (t1Var != null && !t1Var.C0) {
                    t1Var.C0 = true;
                    t1Var.D0.f(true, true);
                    t1Var.invalidate();
                }
                long S2 = this.f15652y.S();
                if (z10 && this.f15652y.U() != -9223372036854775807L) {
                    float U = ((float) S2) / ((float) this.f15652y.U());
                    c7 c7Var = this.d;
                    if ((U < c7Var.f14377s0 || U > c7Var.f14379t0) && System.currentTimeMillis() - this.K > 500) {
                        this.K = System.currentTimeMillis();
                        this.f15652y.q0(-this.d.f14375r0, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (j()) {
                S = this.F.getPositionWithOffset();
                d02 = this.F.f14688r0;
            } else {
                S = this.f15626e.S();
                d02 = this.f15626e.d0();
            }
            c7 c7Var2 = this.d;
            float f11 = c7Var2.f14379t0;
            float f12 = c7Var2.f14377s0;
            long j3 = (f11 - f12) * ((float) c7Var2.f14373q0);
            long j10 = c7Var2.f14375r0;
            if (S >= j10 && S <= j3 + j10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!d02 || !z11) {
                z12 = false;
            }
            long j11 = (S - j10) + (f12 * f10);
            tg.t1 t1Var2 = this.f15650x;
            if (t1Var2 != null && t1Var2.C0 != z11) {
                t1Var2.C0 = z11;
                t1Var2.invalidate();
            }
            if (this.f15652y.d0() != z12) {
                this.f15652y.u0(z12);
                this.f15652y.q0(j11, false);
            } else if (z10) {
                long abs = Math.abs(this.f15652y.S() - j11);
                if (j()) {
                    i7 = 300;
                } else {
                    i7 = 120;
                }
                if (abs > i7) {
                    this.f15652y.q0(j11, false);
                }
            }
        }
    }
}
