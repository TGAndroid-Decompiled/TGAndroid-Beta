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
public abstract class mm8 extends FrameLayout {
    public static final int C0 = 0;
    public final HashSet A0;
    public l33 B0;
    public kfc E;
    public kl2 F;
    public ksb G;
    public final tl0 H;
    public final o00 I;
    public long J;
    public long K;
    public final lm8 L;
    public final lm8 M;
    public final lm8 N;
    public bab O;
    public boolean P;
    public final mm Q;
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
    public c8b d;
    public float d0;
    public kfc e;
    public float e0;
    public int f;
    public boolean f0;
    public final mm g0;
    public int h;
    public boolean h0;
    public final Matrix i0;
    public final Matrix j0;
    public final Matrix k0;
    public boolean l0;
    public final PointF m0;
    public kec n;
    public final PointF n0;
    public float o0;
    public double p0;
    public boolean q0;
    public TextureView r;
    public boolean r0;
    public c98 s;
    public boolean s0;
    public final Matrix t0;
    public final Matrix u0;
    public float v0;
    public bab w;
    public boolean w0;
    public pp9 x;
    public boolean x0;
    public kfc y;
    public long y0;
    public Runnable z0;

    public mm8(Activity activity, tl0 tl0Var, o00 o00Var) {
        super(activity);
        this.b = new Rect();
        this.c = new Rect();
        Paint paint = new Paint(1);
        new lm8(this, (byte) 1);
        this.L = new lm8(this, (byte) 2);
        this.M = new lm8(this, (byte) 3);
        this.N = new lm8(this, (byte) 4);
        this.Q = new mm(this, 0L, 350L, k43.h);
        this.R = new Paint(7);
        this.U = new Paint(1);
        this.a0 = new Matrix();
        this.b0 = new float[2];
        this.f0 = true;
        this.g0 = new mm(this, 0L, 320L, k43.g);
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
        this.H = tl0Var;
        this.I = o00Var;
        paint.setStrokeWidth(hl.L(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(hl.L(3.0f), 0.0f, hl.L(1.0f), 1073741824);
    }

    public static Drawable d(Drawable drawable, int i, long j, boolean z) {
        TLRPC.WallPaper wallPaper = null;
        if (j == Long.MIN_VALUE) {
            return null;
        }
        if (j >= 0) {
            TLRPC.UserFull Y1 = uc7.s1(i).Y1(j);
            if (Y1 != null) {
                wallPaper = Y1.wallpaper;
            }
        } else {
            TLRPC.ChatFull N0 = uc7.s1(i).N0(-j);
            if (N0 != null) {
                wallPaper = N0.wallpaper;
            }
        }
        return e(drawable, i, wallPaper, z);
    }

    public static android.graphics.drawable.Drawable e(android.graphics.drawable.Drawable r5, int r6, org.telegram.tgnet.TLRPC.WallPaper r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mm8.e(android.graphics.drawable.Drawable, int, org.telegram.tgnet.TLRPC$WallPaper, boolean):android.graphics.drawable.Drawable");
    }

    public static Drawable f(int i, final ez3 ez3Var, final boolean z) {
        if (ez3Var.l()) {
            aob.I(ez3.d(z), ez3Var.g(i, z ? 1 : 0), ((dz3) ez3Var.f.get(z ? 1 : 0)).g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray g = ez3Var.g(i, z ? 1 : 0);
        int i2 = aob.Ee;
        int i3 = g.get(i2, aob.w0(null, i2, false));
        int i4 = aob.Fe;
        int i5 = g.get(i4, aob.w0(null, i4, false));
        int i6 = aob.Ge;
        int i7 = g.get(i6, aob.w0(null, i6, false));
        int i8 = aob.He;
        int i9 = g.get(i8, aob.w0(null, i8, false));
        final hh7 hh7Var = new hh7();
        hh7Var.g = false;
        hh7Var.r(ez3Var.j(z ? 1 : 0).settings.intensity, hh7Var.u);
        hh7Var.n(true, i3, i5, i7, i9);
        hh7Var.t(0);
        final int f = hh7Var.f();
        ez3Var.n(z ? 1 : 0, new ResultCallback() {
            @Override
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair != null) {
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((avc) pair.second).a;
                    ez3 ez3Var2 = ez3.this;
                    if (longValue == ez3Var2.h(z ? 1 : 0) && bitmap != null) {
                        int i10 = ez3Var2.j(z ? 1 : 0).settings.intensity;
                        hh7 hh7Var2 = hh7Var;
                        hh7Var2.r(i10, bitmap);
                        hh7Var2.s(f);
                        hh7Var2.q(1.0f);
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
        return hh7Var;
    }

    private void setupCollage(c8b c8bVar) {
        ArrayList<c8b> arrayList;
        ksb ksbVar = this.G;
        if (ksbVar != null) {
            if (c8bVar != null) {
                arrayList = c8bVar.T;
            } else {
                arrayList = null;
            }
            ksbVar.setCollage(arrayList);
        }
    }

    private void setupImage(c8b c8bVar) {
        Utilities.g.c(new h68(this, c8bVar, (byte) 19));
    }

    public abstract void a();

    public final void b() {
        float f;
        float f2;
        kfc kfcVar = this.e;
        float f3 = 0.0f;
        if (kfcVar != null) {
            if (!this.P) {
                c8b c8bVar = this.d;
                if (c8bVar != null) {
                    if (!c8bVar.Y) {
                        f2 = c8bVar.P;
                    }
                } else {
                    f2 = 1.0f;
                }
                kfcVar.A0(f2);
            }
            f2 = 0.0f;
            kfcVar.A0(f2);
        }
        kfc kfcVar2 = this.y;
        if (kfcVar2 != null) {
            if (this.P) {
                f = 0.0f;
            } else {
                c8b c8bVar2 = this.d;
                if (c8bVar2 != null) {
                    f = c8bVar2.u0;
                } else {
                    f = 1.0f;
                }
            }
            kfcVar2.A0(f);
        }
        kfc kfcVar3 = this.E;
        if (kfcVar3 != null) {
            if (!this.P) {
                c8b c8bVar3 = this.d;
                if (c8bVar3 != null) {
                    f3 = c8bVar3.G;
                } else {
                    f3 = 1.0f;
                }
            }
            kfcVar3.A0(f3);
        }
        kl2 kl2Var = this.F;
        if (kl2Var != null) {
            kl2Var.setMuted(this.P);
        }
    }

    public final void c(Matrix matrix) {
        c8b c8bVar = this.d;
        if (c8bVar == null) {
            return;
        }
        float[] fArr = this.b0;
        fArr[0] = c8bVar.k0 / 2.0f;
        fArr[1] = c8bVar.l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.c0 = fArr[0];
        this.d0 = fArr[1];
        c8b c8bVar2 = this.d;
        fArr[0] = c8bVar2.k0;
        fArr[1] = c8bVar2.l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.e0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.d0, fArr[0] - this.c0));
        float f = fArr[0];
        float f2 = fArr[1];
        c8b c8bVar3 = this.d;
        fArr[0] = c8bVar3.k0 / 2.0f;
        fArr[1] = c8bVar3.l0;
        matrix.mapPoints(fArr);
        float f3 = fArr[0];
        float f4 = fArr[1];
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z;
        c8b c8bVar;
        fo6 fo6Var;
        if (this.T != null) {
            float f = 0.0f;
            if (this.h0) {
                Path path = new Path();
                RectF rectF = hl.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, hl.L(12.0f), hl.L(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.T;
            if (!(drawable instanceof hh7) || ((hh7) drawable).u != null) {
                f = this.Q.e(false, 1.0f);
            }
            Drawable drawable2 = this.S;
            if (drawable2 != null && f < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - f) * 255.0f));
                c8b.j(canvas, this.S, getWidth(), getHeight());
            }
            this.T.setAlpha((int) (f * 255.0f));
            c8b.j(canvas, this.T, getWidth(), getHeight());
            if (this.h0) {
                canvas.restore();
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.U);
        }
        l33 l33Var = this.B0;
        if (l33Var != null) {
            l33Var.d.b(canvas2, true);
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
                    canvas2.translate(c8bVar.k0 / 2.0f, c8bVar.l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    c8b c8bVar2 = this.d;
                    int i = c8bVar2.k0;
                    int i2 = c8bVar2.l0;
                    int i3 = c8bVar2.Q;
                    fo6 fo6Var2 = c8bVar2.m0;
                    if (((i3 + fo6Var2.k) / 90) % 2 == 1) {
                        i2 = i;
                        i = i2;
                    }
                    float f2 = fo6Var2.e;
                    float f3 = fo6Var2.f;
                    float f4 = i;
                    float f5 = i2;
                    canvas2.clipRect(((-i) * f2) / 2.0f, ((-i2) * f3) / 2.0f, (f2 * f4) / 2.0f, (f3 * f5) / 2.0f);
                    float f6 = this.d.m0.c;
                    canvas2.scale(f6, f6);
                    fo6 fo6Var3 = this.d.m0;
                    canvas2.translate(fo6Var3.a * f4, fo6Var3.b * f5);
                    canvas2.rotate(this.d.m0.d + fo6Var.k);
                    if (this.d.m0.l) {
                        canvas2.scale(-1.0f, 1.0f);
                    }
                    canvas2.rotate(this.d.Q);
                    c8b c8bVar3 = this.d;
                    canvas2.translate((-c8bVar3.k0) / 2.0f, (-c8bVar3.l0) / 2.0f);
                }
                Paint paint = this.R;
                paint.setAlpha((int) ((1.0f - d) * 255.0f));
                int width = this.a.getWidth();
                int height = this.a.getHeight();
                Rect rect = this.b;
                rect.set(0, 0, width, height);
                c8b c8bVar4 = this.d;
                int i4 = c8bVar4.k0;
                int i5 = c8bVar4.l0;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mm8.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        c8b c8bVar;
        c8b c8bVar2;
        kec kecVar = this.n;
        if (view == kecVar && (c8bVar2 = this.d) != null && c8bVar2.u) {
            return false;
        }
        if ((view == kecVar || view == this.r) && (c8bVar = this.d) != null && c8bVar.m0 != null) {
            canvas.save();
            canvas.scale(getWidth() / this.d.i0, getHeight() / this.d.j0);
            canvas.concat(this.d.n0);
            c8b c8bVar3 = this.d;
            if (c8bVar3.m0 != null) {
                canvas.translate(c8bVar3.k0 / 2.0f, c8bVar3.l0 / 2.0f);
                canvas.rotate(-this.d.Q);
                c8b c8bVar4 = this.d;
                int i = c8bVar4.k0;
                int i2 = c8bVar4.l0;
                int i3 = c8bVar4.Q;
                fo6 fo6Var = c8bVar4.m0;
                if (((i3 + fo6Var.k) / 90) % 2 == 1) {
                    i2 = i;
                    i = i2;
                }
                float f = fo6Var.e;
                float f2 = fo6Var.f;
                canvas.clipRect(((-i) * f) / 2.0f, ((-i2) * f2) / 2.0f, (i * f) / 2.0f, (i2 * f2) / 2.0f);
                canvas.rotate(this.d.Q);
                c8b c8bVar5 = this.d;
                canvas.translate((-c8bVar5.k0) / 2.0f, (-c8bVar5.l0) / 2.0f);
            }
            canvas.concat(this.i0);
            canvas.scale(1.0f / (getWidth() / this.d.i0), 1.0f / (getHeight() / this.d.j0));
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    public final void g(pcc pccVar, View... viewArr) {
        kec kecVar;
        int L = (int) (hl.L(26.0f) * hl.p);
        int L2 = (int) (hl.L(30.33f) * hl.p);
        int L3 = (int) (hl.L(4.0f) * hl.p);
        ?? r5 = new Bitmap[viewArr.length];
        for (int i = 0; i < viewArr.length; i++) {
            View view = viewArr[i];
            if (view != null && view.getWidth() >= 0 && viewArr[i].getHeight() > 0) {
                View view2 = viewArr[i];
                if (view2 == this && (kecVar = this.n) != null) {
                    r5[i] = kecVar.getBitmap();
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
        Utilities.e.c(new it2(L, L2, L3, r5, pccVar, (byte) 1));
    }

    public int getContentHeight() {
        c8b c8bVar = this.d;
        if (c8bVar == null) {
            return 1;
        }
        return c8bVar.l0;
    }

    public int getContentWidth() {
        c8b c8bVar = this.d;
        if (c8bVar == null) {
            return 1;
        }
        return c8bVar.k0;
    }

    public long getCurrentPosition() {
        kfc kfcVar = this.e;
        if (kfcVar != null) {
            return kfcVar.S();
        }
        kfc kfcVar2 = this.y;
        if (kfcVar2 != null) {
            return kfcVar2.S();
        }
        kfc kfcVar3 = this.E;
        if (kfcVar3 != null) {
            return kfcVar3.S();
        }
        return 0L;
    }

    public long getDuration() {
        c8b c8bVar = this.d;
        if (c8bVar != null) {
            double d = c8bVar.i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        kfc kfcVar = this.e;
        if (kfcVar != null && kfcVar.U() != -9223372036854775807L) {
            return this.e.U();
        }
        return 1L;
    }

    public int getOrientation() {
        c8b c8bVar = this.d;
        if (c8bVar == null) {
            return 0;
        }
        return c8bVar.Q;
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

    public kec getTextureView() {
        return this.n;
    }

    public abstract void h();

    public final boolean i() {
        c8b c8bVar;
        if (this.F != null && (c8bVar = this.d) != null && c8bVar.v()) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        return !this.A0.contains(-9982);
    }

    public final void k(defpackage.c8b r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mm8.k(c8b):void");
    }

    public final void l(c8b c8bVar) {
        this.d = c8bVar;
        if (c8bVar == null) {
            setupImage(null);
            u(null);
            this.U.setShader(null);
            q(null, false);
            s(null, null, false);
            return;
        }
        if (c8bVar.K) {
            setupImage(c8bVar);
            if (c8bVar.A0 == 0 && c8bVar.B0 == 0) {
                c8bVar.y(new uk8((gbb) this, (byte) 3));
            } else {
                r();
            }
        } else {
            setupImage(c8bVar);
            r();
        }
        a();
        u(c8bVar);
        q(c8bVar, false);
        s(c8bVar, null, false);
    }

    public final void m(long j) {
        kfc kfcVar = this.e;
        if (kfcVar != null) {
            kfcVar.p0(j, false);
        } else if (i()) {
            this.F.m(j, false);
        } else {
            kfc kfcVar2 = this.y;
            if (kfcVar2 != null) {
                kfcVar2.p0(j, false);
            } else {
                kfc kfcVar3 = this.E;
                if (kfcVar3 != null) {
                    kfcVar3.p0(j, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(c8b c8bVar, z3b z3bVar, long j) {
        this.d = c8bVar;
        if (c8bVar == null) {
            t(null, z3bVar, j);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.U.setShader(null);
            q(null, false);
            s(null, null, false);
            return;
        }
        if (c8bVar.v()) {
            setupImage(null);
            t(null, z3bVar, j);
            setupCollage(c8bVar);
        } else if (c8bVar.K) {
            setupImage(c8bVar);
            setupCollage(null);
            t(c8bVar, z3bVar, j);
            if (c8bVar.A0 == 0 && c8bVar.B0 == 0) {
                c8bVar.y(new lm8(this, (byte) 0));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, z3bVar, 0L);
            setupImage(c8bVar);
            r();
        }
        a();
        u(c8bVar);
        q(c8bVar, false);
        s(c8bVar, null, false);
    }

    public final void o(TextureView textureView, c98 c98Var) {
        TextureView textureView2 = this.r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.r = null;
        }
        this.s = c98Var;
        this.r = textureView;
        if (c98Var != null) {
            int i = this.V;
            int i2 = this.W;
            rf4 rf4Var = c98Var.m0;
            if (rf4Var != null) {
                rf4Var.f(i, i2);
            } else {
                c98Var.K0 = i;
                c98Var.L0 = i2;
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

    public final void p(r47 r47Var) {
        long j;
        int maxCount;
        c8b c8bVar = this.d;
        if (c8bVar != null) {
            c8bVar.j = true;
            float f = 1.0f;
            if (r47Var != null) {
                int i = r47Var.K1;
                if (r47Var.k != null) {
                    TLRPC.Document F0 = r47Var.F0();
                    if (F0 != null && F0.id != 0) {
                        this.d.z = new TLRPC.TL_inputDocument();
                        TLRPC.InputDocument inputDocument = this.d.z;
                        inputDocument.id = F0.id;
                        inputDocument.file_reference = F0.file_reference;
                        inputDocument.access_hash = F0.access_hash;
                    }
                    int i2 = 0;
                    if (!TextUtils.isEmpty(r47Var.k.attachPath)) {
                        this.d.y = r47Var.k.attachPath;
                    } else {
                        xb4.G(i);
                        File J = xb4.J(F0, null, false, true);
                        if (J == null || !J.exists()) {
                            xb4.G(i);
                            J = xb4.J(F0, null, true, true);
                            if (J != null && J.exists()) {
                                this.d.y = J.getAbsolutePath();
                            } else {
                                c8b c8bVar2 = this.d;
                                c8bVar2.y = null;
                                c8bVar2.z = null;
                                c8bVar2.A = null;
                                c8bVar2.B = null;
                                c8bVar2.D = 0L;
                                c8bVar2.C = 0L;
                                c8bVar2.E = 0.0f;
                                c8bVar2.F = 1.0f;
                                return;
                            }
                        }
                        this.d.y = J.getAbsolutePath();
                    }
                    c8b c8bVar3 = this.d;
                    c8bVar3.A = null;
                    c8bVar3.B = null;
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
                    c8b c8bVar4 = this.d;
                    c8bVar4.D = 0L;
                    if (c8bVar4.K) {
                        c8bVar4.D = c8bVar4.Z * ((float) getDuration());
                    }
                    this.d.E = 0.0f;
                    if (i()) {
                        ArrayList arrayList2 = this.F.h;
                        int size2 = arrayList2.size();
                        while (i2 < size2) {
                            Object obj = arrayList2.get(i2);
                            i2++;
                            c8b c8bVar5 = ((jl2) obj).n;
                            if (c8bVar5 != null && c8bVar5.K) {
                                j = this.F.getDuration();
                                break;
                            }
                        }
                    }
                    c8b c8bVar6 = this.d;
                    if (c8bVar6.K) {
                        j = getDuration();
                    } else {
                        j = c8bVar6.C;
                    }
                    ksb ksbVar = this.G;
                    if (ksbVar == null) {
                        maxCount = 1;
                    } else {
                        maxCount = ksbVar.getMaxCount();
                    }
                    c8b c8bVar7 = this.d;
                    if (c8bVar7.C != 0) {
                        f = Math.min(1.0f, ((float) Math.min(j, maxCount * 59000)) / ((float) this.d.C));
                    }
                    c8bVar7.F = f;
                }
            }
            c8bVar.y = null;
            c8bVar.z = null;
            c8bVar.A = null;
            c8bVar.B = null;
            c8bVar.D = 0L;
            c8bVar.C = 0L;
            c8bVar.E = 0.0f;
            c8bVar.F = 1.0f;
        }
        q(this.d, true);
    }

    public final void q(c8b c8bVar, boolean z) {
        boolean z2;
        String str;
        float f;
        float f2;
        float f3;
        kfc kfcVar = this.E;
        if (kfcVar != null) {
            kfcVar.f0();
            this.E.l0();
            this.E = null;
        }
        if (c8bVar != null) {
            ksb ksbVar = this.G;
            boolean z3 = false;
            if (ksbVar != null) {
                String str2 = c8bVar.y;
                String str3 = c8bVar.A;
                String str4 = c8bVar.B;
                long j = c8bVar.C;
                long j2 = c8bVar.D;
                float f4 = c8bVar.E;
                float f5 = c8bVar.F;
                float f6 = c8bVar.G;
                if (!TextUtils.equals(ksbVar.P, str2)) {
                    dsb dsbVar = ksbVar.b0;
                    if (dsbVar != null) {
                        dsbVar.a();
                        ksbVar.b0 = null;
                        ksbVar.V = false;
                    }
                    ksbVar.P = str2;
                    ksbVar.p();
                }
                ksbVar.P = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                ksbVar.O = !isEmpty;
                if (isEmpty) {
                    ksbVar.Q = false;
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
                if (ksbVar.O) {
                    ksbVar.S = j;
                    ksbVar.R = j2 - (((float) j) * f4);
                    ksbVar.T = f4;
                    ksbVar.U = f5;
                    ksbVar.W = f6;
                    float f7 = 0.0f;
                    if (str != null) {
                        StaticLayout staticLayout = new StaticLayout(str, ksbVar.M0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        ksbVar.N0 = staticLayout;
                        if (staticLayout.getLineCount() > 0) {
                            f2 = ksbVar.N0.getLineWidth(0);
                        } else {
                            f2 = 0.0f;
                        }
                        ksbVar.O0 = f2;
                        if (ksbVar.N0.getLineCount() > 0) {
                            f3 = ksbVar.N0.getLineLeft(0);
                        } else {
                            f3 = 0.0f;
                        }
                        ksbVar.P0 = f3;
                    } else {
                        ksbVar.O0 = 0.0f;
                        ksbVar.N0 = null;
                    }
                    if (str4 != null) {
                        StaticLayout staticLayout2 = new StaticLayout(str4, ksbVar.Q0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        ksbVar.R0 = staticLayout2;
                        if (staticLayout2.getLineCount() > 0) {
                            f = ksbVar.R0.getLineWidth(0);
                        } else {
                            f = 0.0f;
                        }
                        ksbVar.S0 = f;
                        if (ksbVar.R0.getLineCount() > 0) {
                            f7 = ksbVar.R0.getLineLeft(0);
                        }
                        ksbVar.T0 = f7;
                    } else {
                        ksbVar.S0 = 0.0f;
                        ksbVar.R0 = null;
                    }
                }
                if (!z) {
                    z2 = true;
                    ksbVar.f0.f(ksbVar.O, true);
                } else {
                    z2 = true;
                }
                ksbVar.invalidate();
            } else {
                z2 = true;
            }
            if (c8bVar.y != null) {
                kfc kfcVar2 = new kfc();
                this.E = kfcVar2;
                kfcVar2.E = z2;
                kfcVar2.K = new aj3(this, (byte) 27);
                kfcVar2.i0(Uri.fromFile(new File(c8bVar.y)), "other");
                b();
                if (this.e != null && getDuration() > 0) {
                    long duration = c8bVar.Z * ((float) getDuration());
                    this.e.p0(duration, false);
                    this.G.setProgress(duration);
                }
                z2 = true;
                w(true);
            }
            rbb rbbVar = ((gbb) this).D0;
            vab vabVar = rbbVar.w1;
            if (vabVar != null) {
                c8b c8bVar2 = rbbVar.L1;
                if (c8bVar2 != null && c8bVar2.y != null) {
                    z3 = z2;
                }
                vabVar.setHasAudio(z3);
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
            i = hl.q.y;
        }
        c8b c8bVar = this.d;
        int i2 = c8bVar.A0;
        Paint paint = this.U;
        if (i2 != 0 && c8bVar.B0 != 0) {
            float f = i;
            c8b c8bVar2 = this.d;
            int i3 = c8bVar2.A0;
            this.V = i3;
            int i4 = c8bVar2.B0;
            this.W = i4;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f, new int[]{i3, i4}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            kec kecVar = this.n;
            if (kecVar != null) {
                int i5 = this.V;
                int i6 = this.W;
                rf4 rf4Var = kecVar.b;
                if (rf4Var == null) {
                    kecVar.n = i5;
                    kecVar.r = i6;
                } else {
                    rf4Var.f(i5, i6);
                }
            }
            c98 c98Var = this.s;
            if (c98Var != null) {
                int i7 = this.V;
                int i8 = this.W;
                rf4 rf4Var2 = c98Var.m0;
                if (rf4Var2 != null) {
                    rf4Var2.f(i7, i8);
                } else {
                    c98Var.K0 = i7;
                    c98Var.L0 = i8;
                }
            }
        } else {
            Bitmap bitmap = this.a;
            if (bitmap != null) {
                new jq0(this, i, (byte) 3).a(bje.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        }
        invalidate();
    }

    public final void s(c8b c8bVar, pp9 pp9Var, boolean z) {
        kfc kfcVar;
        if (c8bVar != null && c8bVar.o0 != null) {
            kfc kfcVar2 = this.y;
            if (kfcVar2 != null) {
                kfcVar2.l0();
                this.y = null;
            }
            kfc kfcVar3 = new kfc();
            this.y = kfcVar3;
            kfcVar3.E = true;
            kfcVar3.K = new kj4(this, (byte) 29);
            this.y.i0(Uri.fromFile(c8bVar.o0), "other");
            b();
            this.x = pp9Var;
            if (pp9Var != null && (kfcVar = this.y) != null) {
                kfcVar.z0(pp9Var.w0);
            }
            this.G.n(c8bVar.o0.getAbsolutePath(), c8bVar.q0, c8bVar.r0, c8bVar.s0, c8bVar.t0, c8bVar.u0, z);
            y(true);
            return;
        }
        kfc kfcVar4 = this.y;
        if (kfcVar4 != null) {
            kfcVar4.f0();
            this.y.l0();
            this.y = null;
        }
        ksb ksbVar = this.G;
        if (ksbVar != null) {
            ksbVar.setRoundNull(z);
        }
        this.x = null;
        hl.r(this.L);
    }

    public void set(c8b c8bVar) {
        n(c8bVar, null, 0L);
    }

    public void setAllowCropping(boolean z) {
        this.l0 = z;
    }

    public void setCollageView(kl2 kl2Var) {
        this.F = kl2Var;
    }

    public void setCropEditorDrawing(l33 l33Var) {
        if (this.B0 != l33Var) {
            this.B0 = l33Var;
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

    public void setVideoTimelineView(ksb ksbVar) {
        this.G = ksbVar;
        if (ksbVar != null) {
            ksbVar.setDelegate(new v34(this, (byte) 26));
        }
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            set(null);
        }
    }

    public final void t(c8b c8bVar, z3b z3bVar, long j) {
        tl0 tl0Var;
        long j2;
        boolean z;
        ArrayList arrayList;
        yl0 yl0Var;
        float f = 0.0f;
        if (c8bVar != null && !c8bVar.v()) {
            kfc kfcVar = this.e;
            if (kfcVar != null) {
                kfcVar.l0();
                this.e = null;
            }
            kfc kfcVar2 = new kfc();
            this.e = kfcVar2;
            kfcVar2.E = true;
            kfcVar2.K = new pm3((ViewGroup) this, (Object) c8bVar, (Object) new Runnable[]{z3bVar}, (byte) 24);
            kec kecVar = this.n;
            if (kecVar != null) {
                kecVar.clearAnimation();
                kec kecVar2 = this.n;
                rf4 rf4Var = kecVar2.b;
                if (rf4Var != null) {
                    rf4Var.postRunnable(new pf4(rf4Var, (byte) 0));
                }
                kecVar2.a = null;
                removeView(this.n);
                this.n = null;
            }
            this.n = new kec(this.e, getContext());
            this.H.e();
            kec kecVar3 = this.n;
            if (c8bVar.u) {
                tl0Var = null;
            } else {
                tl0Var = this.H;
            }
            kecVar3.s = tl0Var;
            rf4 rf4Var2 = kecVar3.b;
            if (rf4Var2 != null && (yl0Var = rf4Var2.J) != null) {
                tl0 tl0Var2 = yl0Var.t;
                if (tl0Var2 != null && tl0Var2.m != null) {
                    tl0Var2.m = null;
                }
                yl0Var.t = tl0Var;
                if (tl0Var != null && tl0Var.m != yl0Var) {
                    tl0Var.m = yl0Var;
                    tl0Var.d();
                }
            }
            this.n.setOpaque(false);
            a();
            o00 o00Var = this.I;
            if (o00Var != null && o00Var.g) {
                o00Var.a(this.n);
            } else {
                kec kecVar4 = this.n;
                if (z3bVar != null) {
                    f = 1.0f;
                }
                kecVar4.setAlpha(f);
                addView(this.n, tre.e(-2, -2, 51));
            }
            ii7 ii7Var = new ii7(this, (byte) 18);
            b8b b8bVar = c8bVar.d1;
            if (b8bVar != null) {
                ii7Var.a(b8bVar);
            } else if (c8bVar.K && Build.VERSION.SDK_INT >= 24) {
                Utilities.e.c(new y7b(c8bVar, ii7Var, (byte) 1));
            } else {
                ?? obj = new Object();
                c8bVar.d1 = obj;
                ii7Var.a(obj);
            }
            File file = c8bVar.Z0;
            if (file == null) {
                file = c8bVar.L;
            }
            this.e.i0(Uri.fromFile(file), "other");
            this.e.t0(this.A0.isEmpty());
            this.e.r0(true);
            if (c8bVar.h) {
                j2 = (c8bVar.Z * ((float) c8bVar.h0)) + ((float) j);
            } else {
                j2 = j;
            }
            int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i > 0) {
                this.e.p0(j2, false);
            }
            b();
            w(true);
            if (c8bVar.u && (arrayList = c8bVar.v) != null && arrayList.size() == 1 && ((r47) c8bVar.v.get(0)).D == 5) {
                z = true;
            } else {
                z = false;
            }
            ksb ksbVar = this.G;
            File file2 = c8bVar.Z0;
            if (file2 == null) {
                file2 = c8bVar.L;
            }
            ksbVar.o(z, file2.getAbsolutePath(), getDuration(), c8bVar.P);
            this.G.setVideoLeft(c8bVar.Z);
            this.G.setVideoRight(c8bVar.a0);
            ksb ksbVar2 = this.G;
            if (ksbVar2 != null && i > 0) {
                ksbVar2.setProgress(j2);
                return;
            }
            return;
        }
        kfc kfcVar3 = this.e;
        if (kfcVar3 != null) {
            kfcVar3.f0();
            this.e.l0();
            this.e = null;
        }
        o00 o00Var2 = this.I;
        if (o00Var2 != null && o00Var2.g) {
            o00Var2.a(null);
        } else {
            kec kecVar5 = this.n;
            if (kecVar5 != null) {
                kecVar5.clearAnimation();
                this.n.animate().alpha(0.0f).withEndAction(new lm8(this, (byte) 5)).start();
            }
        }
        ksb ksbVar3 = this.G;
        if (ksbVar3 != null) {
            ksbVar3.o(false, null, 1L, 0.0f);
        }
        hl.r(this.L);
        if (z3bVar != null) {
            hl.c3(z3bVar);
        }
    }

    public final void u(c8b c8bVar) {
        Drawable drawable = this.T;
        this.S = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (c8bVar == null) {
            this.T = null;
            return;
        }
        long j = c8bVar.z0;
        if (j != Long.MIN_VALUE) {
            Drawable d = d(this.T, c8bVar.a, j, c8bVar.y0);
            c8bVar.x0 = d;
            this.T = d;
            if (this.S != d) {
                this.S = null;
            }
            if (d != null) {
                d.setCallback(this);
            }
            tl0 tl0Var = this.H;
            if (tl0Var != null) {
                Drawable drawable2 = this.T;
                if (drawable2 != null) {
                    if (drawable2 instanceof BitmapDrawable) {
                        tl0Var.f(((BitmapDrawable) drawable2).getBitmap(), false);
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
                        tl0Var.f(createBitmap, true);
                    }
                } else {
                    tl0Var.f(null, false);
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
        c8b c8bVar;
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
                f = dte.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
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
                float width = c8bVar.i0 / getWidth();
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
                                hl.W3(this);
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
                                hl.W3(this);
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
                        rbb rbbVar = ((gbb) this).D0;
                        rbbVar.p1.a(true, false, rbbVar.j0);
                        rbbVar.p1.b(rbbVar.d1.getText());
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mm8.w(boolean):void");
    }

    public final void x(int i, boolean z) {
        HashSet hashSet = this.A0;
        if (z) {
            hashSet.add(Integer.valueOf(i));
        } else {
            hashSet.remove(Integer.valueOf(i));
        }
        kfc kfcVar = this.e;
        if (kfcVar != null) {
            kfcVar.t0(hashSet.isEmpty());
        }
        kl2 kl2Var = this.F;
        if (kl2Var != null) {
            kl2Var.setPlaying(hashSet.isEmpty());
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
                pp9 pp9Var = this.x;
                if (pp9Var != null && !pp9Var.D0) {
                    pp9Var.D0 = true;
                    pp9Var.E0.f(true, true);
                    pp9Var.invalidate();
                }
                long S2 = this.y.S();
                if (z && this.y.U() != -9223372036854775807L) {
                    float U = ((float) S2) / ((float) this.y.U());
                    c8b c8bVar = this.d;
                    if ((U < c8bVar.s0 || U > c8bVar.t0) && System.currentTimeMillis() - this.K > 500) {
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
            c8b c8bVar2 = this.d;
            float f2 = c8bVar2.t0;
            float f3 = c8bVar2.s0;
            long j = (f2 - f3) * ((float) c8bVar2.q0);
            long j2 = c8bVar2.r0;
            if (S >= j2 && S <= j + j2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!c0 || !z2) {
                z3 = false;
            }
            long j3 = (S - j2) + (f3 * f);
            pp9 pp9Var2 = this.x;
            if (pp9Var2 != null && pp9Var2.D0 != z2) {
                pp9Var2.D0 = z2;
                pp9Var2.invalidate();
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
