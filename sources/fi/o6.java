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
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.eg0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.uc0;
public abstract class o6 extends FrameLayout {
    public static final int B0 = 0;
    public j0 A0;
    public e0 E;
    public cc F;
    public final org.telegram.ui.Components.la G;
    public final n6 H;
    public long I;
    public long J;
    public final m6 K;
    public final m6 L;
    public final m6 M;
    public p9 N;
    public boolean O;
    public final org.telegram.ui.Components.h6 P;
    public final Paint Q;
    public Drawable R;
    public Drawable S;
    public final Paint T;
    public int U;
    public int V;
    public final Matrix W;
    public Bitmap f11361a;
    public final float[] f11362a0;
    public final Rect f11363b;
    public float f11364b0;
    public final Rect f11365c;
    public float f11366c0;
    public w7 d;
    public float f11367d0;
    public s81 e;
    public boolean f11368e0;
    public int f11369f;
    public final org.telegram.ui.Components.h6 f11370f0;
    public boolean f11371g0;
    public int h;
    public final Matrix f11372h0;
    public final Matrix f11373i0;
    public final Matrix f11374j0;
    public boolean f11375k0;
    public final PointF f11376l0;
    public final PointF m0;
    public h81 f11377n;
    public float f11378n0;
    public double f11379o0;
    public boolean f11380p0;
    public boolean f11381q0;
    public TextureView f11382r;
    public boolean f11383r0;
    public eg0 f11384s;
    public final Matrix f11385s0;
    public final Matrix f11386t0;
    public float f11387u0;
    public p9 v;
    public boolean f11388v0;
    public sg.d2 f11389w;
    public boolean f11390w0;
    public s81 f11391x;
    public long f11392x0;
    public s81 f11393y;
    public Runnable f11394y0;
    public final HashSet f11395z0;

    public o6(Context context, org.telegram.ui.Components.la laVar, n6 n6Var) {
        super(context);
        this.f11363b = new Rect();
        this.f11365c = new Rect();
        Paint paint = new Paint(1);
        new m6(this, 2);
        this.K = new m6(this, 3);
        this.L = new m6(this, 4);
        this.M = new m6(this, 5);
        this.P = new org.telegram.ui.Components.h6(this, 0L, 350L, ds.h);
        this.Q = new Paint(7);
        this.T = new Paint(1);
        this.W = new Matrix();
        this.f11362a0 = new float[2];
        this.f11368e0 = true;
        this.f11370f0 = new org.telegram.ui.Components.h6(this, 0L, 320L, ds.f27587g);
        this.f11371g0 = false;
        this.f11372h0 = new Matrix();
        this.f11373i0 = new Matrix();
        this.f11374j0 = new Matrix();
        this.f11375k0 = true;
        this.f11376l0 = new PointF();
        this.m0 = new PointF();
        this.f11385s0 = new Matrix();
        this.f11386t0 = new Matrix();
        this.f11395z0 = new HashSet();
        this.G = laVar;
        this.H = n6Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 1073741824);
    }

    public static void a(fi.o6 r13, fi.w7 r14) {
        throw new UnsupportedOperationException("Method not decompiled: fi.o6.a(fi.o6, fi.w7):void");
    }

    public static Drawable e(Drawable drawable, int i10, long j10, boolean z10) {
        TLRPC.WallPaper wallPaper = null;
        if (j10 == Long.MIN_VALUE) {
            return null;
        }
        if (j10 >= 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j10);
            if (userFull != null) {
                wallPaper = userFull.wallpaper;
            }
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(-j10);
            if (chatFull != null) {
                wallPaper = chatFull.wallpaper;
            }
        }
        return f(drawable, i10, wallPaper, z10);
    }

    public static android.graphics.drawable.Drawable f(android.graphics.drawable.Drawable r5, int r6, org.telegram.tgnet.TLRPC.WallPaper r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: fi.o6.f(android.graphics.drawable.Drawable, int, org.telegram.tgnet.TLRPC$WallPaper, boolean):android.graphics.drawable.Drawable");
    }

    public static Drawable g(int i10, final org.telegram.ui.ActionBar.h4 h4Var, final boolean z10) {
        if (h4Var.l()) {
            org.telegram.ui.ActionBar.y6.H(org.telegram.ui.ActionBar.h4.d(z10), h4Var.g(i10, z10 ? 1 : 0), ((org.telegram.ui.ActionBar.g4) h4Var.f22685f.get(z10 ? 1 : 0)).f22654g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray g7 = h4Var.g(i10, z10 ? 1 : 0);
        int i11 = org.telegram.ui.ActionBar.y6.Nd;
        int i12 = g7.get(i11, org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        int i13 = org.telegram.ui.ActionBar.y6.Od;
        int i14 = g7.get(i13, org.telegram.ui.ActionBar.y6.x0(null, i13, false));
        int i15 = org.telegram.ui.ActionBar.y6.Pd;
        int i16 = g7.get(i15, org.telegram.ui.ActionBar.y6.x0(null, i15, false));
        int i17 = org.telegram.ui.ActionBar.y6.Qd;
        int i18 = g7.get(i17, org.telegram.ui.ActionBar.y6.x0(null, i17, false));
        final uc0 uc0Var = new uc0();
        uc0Var.f33361g = false;
        uc0Var.s(uc0Var.f33374u, h4Var.j(z10 ? 1 : 0).settings.intensity);
        uc0Var.o(i12, i14, i16, i18, 0, true);
        uc0Var.u(0);
        final int f7 = uc0Var.f();
        h4Var.n(z10 ? 1 : 0, new ResultCallback() {
            @Override
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair != null) {
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((fg.a) pair.second).f10468b;
                    org.telegram.ui.ActionBar.h4 h4Var2 = org.telegram.ui.ActionBar.h4.this;
                    if (longValue == h4Var2.h(z10 ? 1 : 0) && bitmap != null) {
                        int i19 = h4Var2.j(z10 ? 1 : 0).settings.intensity;
                        uc0 uc0Var2 = uc0Var;
                        uc0Var2.s(bitmap, i19);
                        uc0Var2.t(f7);
                        uc0Var2.r(1.0f);
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
        return uc0Var;
    }

    private void setupCollage(w7 w7Var) {
        ArrayList<w7> arrayList;
        cc ccVar = this.F;
        if (ccVar != null) {
            if (w7Var != null) {
                arrayList = w7Var.T;
            } else {
                arrayList = null;
            }
            ccVar.setCollage(arrayList);
        }
    }

    private void setupImage(w7 w7Var) {
        Utilities.searchQueue.postRunnable(new e2.q0(10, this, w7Var));
    }

    public abstract void b();

    public final void c() {
        float f7;
        float f10;
        w7 w7Var;
        s81 s81Var = this.e;
        float f11 = 0.0f;
        if (s81Var != null) {
            if (!this.O && ((w7Var = this.d) == null || !w7Var.Y)) {
                if (w7Var != null) {
                    f10 = w7Var.P;
                } else {
                    f10 = 1.0f;
                }
            } else {
                f10 = 0.0f;
            }
            s81Var.W(f10);
        }
        s81 s81Var2 = this.f11391x;
        if (s81Var2 != null) {
            if (this.O) {
                f7 = 0.0f;
            } else {
                w7 w7Var2 = this.d;
                if (w7Var2 != null) {
                    f7 = w7Var2.f11930u0;
                } else {
                    f7 = 1.0f;
                }
            }
            s81Var2.W(f7);
        }
        s81 s81Var3 = this.f11393y;
        if (s81Var3 != null) {
            if (!this.O) {
                w7 w7Var3 = this.d;
                if (w7Var3 != null) {
                    f11 = w7Var3.G;
                } else {
                    f11 = 1.0f;
                }
            }
            s81Var3.W(f11);
        }
        e0 e0Var = this.E;
        if (e0Var != null) {
            e0Var.setMuted(this.O);
        }
    }

    public final void d(Matrix matrix) {
        w7 w7Var = this.d;
        if (w7Var == null) {
            return;
        }
        float[] fArr = this.f11362a0;
        fArr[0] = w7Var.f11911k0 / 2.0f;
        fArr[1] = w7Var.f11913l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f11364b0 = fArr[0];
        this.f11366c0 = fArr[1];
        w7 w7Var2 = this.d;
        fArr[0] = w7Var2.f11911k0;
        fArr[1] = w7Var2.f11913l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f11367d0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.f11366c0, fArr[0] - this.f11364b0));
        a8.ic.a(this.f11364b0, this.f11366c0, fArr[0], fArr[1]);
        w7 w7Var3 = this.d;
        fArr[0] = w7Var3.f11911k0 / 2.0f;
        fArr[1] = w7Var3.f11913l0;
        matrix.mapPoints(fArr);
        a8.ic.a(this.f11364b0, this.f11366c0, fArr[0], fArr[1]);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        w7 w7Var;
        MediaController.CropState cropState;
        if (this.S != null) {
            float f7 = 0.0f;
            if (this.f11371g0) {
                Path path = new Path();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.S;
            if (!(drawable instanceof uc0) || ((uc0) drawable).f33374u != null) {
                f7 = this.P.d(1.0f, false);
            }
            Drawable drawable2 = this.R;
            if (drawable2 != null && f7 < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - f7) * 255.0f));
                w7.j(canvas, this.R, getWidth(), getHeight());
            }
            this.S.setAlpha((int) (f7 * 255.0f));
            w7.j(canvas, this.S, getWidth(), getHeight());
            if (this.f11371g0) {
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
        } else if (this.f11368e0 && this.d != null && !j()) {
            if (this.f11361a == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e = this.f11370f0.e(z10);
            if (this.f11361a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.f11907i0, getHeight() / this.d.f11909j0);
                canvas2.concat(this.d.f11916n0);
                if (this.d.m0 != null) {
                    canvas2.translate(w7Var.f11911k0 / 2.0f, w7Var.f11913l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    w7 w7Var2 = this.d;
                    int i10 = w7Var2.f11911k0;
                    int i11 = w7Var2.f11913l0;
                    int i12 = w7Var2.Q;
                    MediaController.CropState cropState2 = w7Var2.m0;
                    if (((i12 + cropState2.transformRotation) / 90) % 2 == 1) {
                        i11 = i10;
                        i10 = i11;
                    }
                    float f10 = cropState2.cropPw;
                    float f11 = cropState2.cropPh;
                    float f12 = i10;
                    float f13 = i11;
                    canvas2.clipRect(((-i10) * f10) / 2.0f, ((-i11) * f11) / 2.0f, (f10 * f12) / 2.0f, (f11 * f13) / 2.0f);
                    float f14 = this.d.m0.cropScale;
                    canvas2.scale(f14, f14);
                    MediaController.CropState cropState3 = this.d.m0;
                    canvas2.translate(cropState3.cropPx * f12, cropState3.cropPy * f13);
                    canvas2.rotate(this.d.m0.cropRotate + cropState.transformRotation);
                    if (this.d.m0.mirrored) {
                        canvas2.scale(-1.0f, 1.0f);
                    }
                    canvas2.rotate(this.d.Q);
                    w7 w7Var3 = this.d;
                    canvas2.translate((-w7Var3.f11911k0) / 2.0f, (-w7Var3.f11913l0) / 2.0f);
                }
                Paint paint = this.Q;
                paint.setAlpha((int) ((1.0f - e) * 255.0f));
                int width = this.f11361a.getWidth();
                int height = this.f11361a.getHeight();
                Rect rect = this.f11363b;
                rect.set(0, 0, width, height);
                w7 w7Var4 = this.d;
                int i13 = w7Var4.f11911k0;
                int i14 = w7Var4.f11913l0;
                Rect rect2 = this.f11365c;
                rect2.set(0, 0, i13, i14);
                canvas2.drawBitmap(this.f11361a, rect, rect2, paint);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: fi.o6.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        w7 w7Var;
        w7 w7Var2;
        h81 h81Var = this.f11377n;
        if (view == h81Var && (w7Var2 = this.d) != null && w7Var2.f11929u) {
            return false;
        }
        if ((view == h81Var || view == this.f11382r) && (w7Var = this.d) != null && w7Var.m0 != null) {
            canvas.save();
            canvas.scale(getWidth() / this.d.f11907i0, getHeight() / this.d.f11909j0);
            canvas.concat(this.d.f11916n0);
            w7 w7Var3 = this.d;
            if (w7Var3.m0 != null) {
                canvas.translate(w7Var3.f11911k0 / 2.0f, w7Var3.f11913l0 / 2.0f);
                canvas.rotate(-this.d.Q);
                w7 w7Var4 = this.d;
                int i10 = w7Var4.f11911k0;
                int i11 = w7Var4.f11913l0;
                int i12 = w7Var4.Q;
                MediaController.CropState cropState = w7Var4.m0;
                if (((i12 + cropState.transformRotation) / 90) % 2 == 1) {
                    i11 = i10;
                    i10 = i11;
                }
                float f7 = cropState.cropPw;
                float f10 = cropState.cropPh;
                canvas.clipRect(((-i10) * f7) / 2.0f, ((-i11) * f10) / 2.0f, (i10 * f7) / 2.0f, (i11 * f10) / 2.0f);
                canvas.rotate(this.d.Q);
                w7 w7Var5 = this.d;
                canvas.translate((-w7Var5.f11911k0) / 2.0f, (-w7Var5.f11913l0) / 2.0f);
            }
            canvas.concat(this.f11372h0);
            canvas.scale(1.0f / (getWidth() / this.d.f11907i0), 1.0f / (getHeight() / this.d.f11909j0));
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public int getContentHeight() {
        w7 w7Var = this.d;
        if (w7Var == null) {
            return 1;
        }
        return w7Var.f11913l0;
    }

    public int getContentWidth() {
        w7 w7Var = this.d;
        if (w7Var == null) {
            return 1;
        }
        return w7Var.f11911k0;
    }

    public long getCurrentPosition() {
        s81 s81Var = this.e;
        if (s81Var != null) {
            return s81Var.n();
        }
        s81 s81Var2 = this.f11391x;
        if (s81Var2 != null) {
            return s81Var2.n();
        }
        s81 s81Var3 = this.f11393y;
        if (s81Var3 != null) {
            return s81Var3.n();
        }
        return 0L;
    }

    public long getDuration() {
        w7 w7Var = this.d;
        if (w7Var != null) {
            double d = w7Var.f11906i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        s81 s81Var = this.e;
        if (s81Var != null && s81Var.p() != -9223372036854775807L) {
            return this.e.p();
        }
        return 1L;
    }

    public int getOrientation() {
        w7 w7Var = this.d;
        if (w7Var == null) {
            return 0;
        }
        return w7Var.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        if (this.d == null) {
            return new Pair<>(1080, 1920);
        }
        return new Pair<>(Integer.valueOf(this.d.f11907i0), Integer.valueOf(this.d.f11909j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.f11361a;
    }

    public h81 getTextureView() {
        return this.f11377n;
    }

    public final void h(Utilities.Callback callback, View... viewArr) {
        h81 h81Var;
        int dp = (int) (AndroidUtilities.dp(26.0f) * AndroidUtilities.density);
        int dp2 = (int) (AndroidUtilities.dp(30.33f) * AndroidUtilities.density);
        int dp3 = (int) (AndroidUtilities.dp(4.0f) * AndroidUtilities.density);
        Bitmap[] bitmapArr = new Bitmap[viewArr.length];
        for (int i10 = 0; i10 < viewArr.length; i10++) {
            View view = viewArr[i10];
            if (view != null && view.getWidth() >= 0 && viewArr[i10].getHeight() > 0) {
                View view2 = viewArr[i10];
                if (view2 == this && (h81Var = this.f11377n) != null) {
                    bitmapArr[i10] = h81Var.getBitmap();
                } else if (view2 instanceof TextureView) {
                    bitmapArr[i10] = ((TextureView) view2).getBitmap();
                } else if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0) {
                    bitmapArr[i10] = Bitmap.createBitmap(dp, dp2, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapArr[i10]);
                    canvas.save();
                    float max = Math.max(dp / viewArr[i10].getWidth(), dp2 / viewArr[i10].getHeight());
                    canvas.scale(max, max);
                    viewArr[i10].draw(canvas);
                    canvas.restore();
                }
            }
        }
        Utilities.globalQueue.postRunnable(new l6(dp, dp2, dp3, bitmapArr, callback));
    }

    public abstract void i();

    public final boolean j() {
        w7 w7Var;
        if (this.E != null && (w7Var = this.d) != null && w7Var.v()) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        return !this.f11395z0.contains(-9982);
    }

    public final void l(w7 w7Var) {
        this.d = w7Var;
        if (w7Var == null) {
            setupImage(null);
            u(null);
            this.T.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (w7Var.K) {
            setupImage(w7Var);
            if (w7Var.A0 == 0 && w7Var.B0 == 0) {
                w7Var.z(new m6((gb) this, 0));
            } else {
                r();
            }
        } else {
            setupImage(w7Var);
            r();
        }
        b();
        u(w7Var);
        p(w7Var, false);
        s(w7Var, null, false);
    }

    public final void m(long j10) {
        s81 s81Var = this.e;
        if (s81Var != null) {
            s81Var.L(j10, false);
        } else if (j()) {
            this.E.m(j10, false);
        } else {
            s81 s81Var2 = this.f11391x;
            if (s81Var2 != null) {
                s81Var2.L(j10, false);
            } else {
                s81 s81Var3 = this.f11393y;
                if (s81Var3 != null) {
                    s81Var3.L(j10, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(w7 w7Var, v9 v9Var, long j10) {
        this.d = w7Var;
        if (w7Var == null) {
            t(null, v9Var, j10);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.T.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (w7Var.v()) {
            setupImage(null);
            t(null, v9Var, j10);
            setupCollage(w7Var);
        } else if (w7Var.K) {
            setupImage(w7Var);
            setupCollage(null);
            t(w7Var, v9Var, j10);
            if (w7Var.A0 == 0 && w7Var.B0 == 0) {
                w7Var.z(new m6(this, 1));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, v9Var, 0L);
            setupImage(w7Var);
            r();
        }
        b();
        u(w7Var);
        p(w7Var, false);
        s(w7Var, null, false);
    }

    public final void o(TextureView textureView, eg0 eg0Var) {
        TextureView textureView2 = this.f11382r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.f11382r = null;
        }
        this.f11384s = eg0Var;
        this.f11382r = textureView;
        if (eg0Var != null) {
            int i10 = this.U;
            int i11 = this.V;
            e00 e00Var = eg0Var.f27843l0;
            if (e00Var != null) {
                e00Var.i(i10, i11);
            } else {
                eg0Var.J0 = i10;
                eg0Var.K0 = i11;
            }
        }
        TextureView textureView3 = this.f11382r;
        if (textureView3 != null) {
            addView(textureView3);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f11375k0) {
            v(motionEvent);
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void p(w7 w7Var, boolean z10) {
        boolean z11;
        String str;
        float f7;
        float f10;
        float f11;
        s81 s81Var = this.f11393y;
        if (s81Var != null) {
            s81Var.B();
            this.f11393y.H();
            this.f11393y = null;
        }
        if (w7Var != null) {
            cc ccVar = this.F;
            boolean z12 = false;
            if (ccVar != null) {
                String str2 = w7Var.f11936y;
                String str3 = w7Var.A;
                String str4 = w7Var.B;
                long j10 = w7Var.C;
                long j11 = w7Var.D;
                float f12 = w7Var.E;
                float f13 = w7Var.F;
                float f14 = w7Var.G;
                if (!TextUtils.equals(ccVar.O, str2)) {
                    vb vbVar = ccVar.f10623a0;
                    if (vbVar != null) {
                        vbVar.a();
                        ccVar.f10623a0 = null;
                        ccVar.U = false;
                    }
                    ccVar.O = str2;
                    ccVar.p();
                }
                ccVar.O = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                ccVar.N = !isEmpty;
                if (isEmpty) {
                    ccVar.P = false;
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
                if (ccVar.N) {
                    ccVar.R = j10;
                    ccVar.Q = j11 - (((float) j10) * f12);
                    ccVar.S = f12;
                    ccVar.T = f13;
                    ccVar.V = f14;
                    float f15 = 0.0f;
                    if (str != null) {
                        StaticLayout staticLayout = new StaticLayout(str, ccVar.L0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        ccVar.M0 = staticLayout;
                        if (staticLayout.getLineCount() > 0) {
                            f10 = ccVar.M0.getLineWidth(0);
                        } else {
                            f10 = 0.0f;
                        }
                        ccVar.N0 = f10;
                        if (ccVar.M0.getLineCount() > 0) {
                            f11 = ccVar.M0.getLineLeft(0);
                        } else {
                            f11 = 0.0f;
                        }
                        ccVar.O0 = f11;
                    } else {
                        ccVar.N0 = 0.0f;
                        ccVar.M0 = null;
                    }
                    if (str4 != null) {
                        StaticLayout staticLayout2 = new StaticLayout(str4, ccVar.P0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        ccVar.Q0 = staticLayout2;
                        if (staticLayout2.getLineCount() > 0) {
                            f7 = ccVar.Q0.getLineWidth(0);
                        } else {
                            f7 = 0.0f;
                        }
                        ccVar.R0 = f7;
                        if (ccVar.Q0.getLineCount() > 0) {
                            f15 = ccVar.Q0.getLineLeft(0);
                        }
                        ccVar.S0 = f15;
                    } else {
                        ccVar.R0 = 0.0f;
                        ccVar.Q0 = null;
                    }
                }
                if (!z10) {
                    z11 = true;
                    ccVar.f10633e0.f(ccVar.N, true);
                } else {
                    z11 = true;
                }
                ccVar.invalidate();
            } else {
                z11 = true;
            }
            if (w7Var.f11936y != null) {
                s81 s81Var2 = new s81();
                this.f11393y = s81Var2;
                s81Var2.f32475y = z11;
                s81Var2.J = new rb.c(this, 21);
                s81Var2.D(Uri.fromFile(new File(w7Var.f11936y)), "other");
                c();
                if (this.e != null && getDuration() > 0) {
                    long duration = w7Var.Z * ((float) getDuration());
                    this.e.L(duration, false);
                    this.F.setProgress(duration);
                }
                z11 = true;
                w(true);
            }
            sb sbVar = ((gb) this).C0;
            ta taVar = sbVar.f11673v1;
            if (taVar != null) {
                w7 w7Var2 = sbVar.K1;
                if (w7Var2 != null && w7Var2.f11936y != null) {
                    z12 = z11;
                }
                taVar.setHasAudio(z12);
            }
        }
    }

    public final void q(MessageObject messageObject) {
        long j10;
        int maxCount;
        w7 w7Var = this.d;
        if (w7Var != null) {
            w7Var.f11908j = true;
            float f7 = 1.0f;
            if (messageObject != null && messageObject.messageOwner != null) {
                TLRPC.Document document = messageObject.getDocument();
                if (document != null && document.f22033id != 0) {
                    this.d.f11938z = new TLRPC.TL_inputDocument();
                    TLRPC.InputDocument inputDocument = this.d.f11938z;
                    inputDocument.f22039id = document.f22033id;
                    inputDocument.file_reference = document.file_reference;
                    inputDocument.access_hash = document.access_hash;
                }
                int i10 = 0;
                if (!TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                    this.d.f11936y = messageObject.messageOwner.attachPath;
                } else {
                    File pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, false, true);
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, true, true);
                        if (pathToAttach != null && pathToAttach.exists()) {
                            this.d.f11936y = pathToAttach.getAbsolutePath();
                        } else {
                            w7 w7Var2 = this.d;
                            w7Var2.f11936y = null;
                            w7Var2.f11938z = null;
                            w7Var2.A = null;
                            w7Var2.B = null;
                            w7Var2.D = 0L;
                            w7Var2.C = 0L;
                            w7Var2.E = 0.0f;
                            w7Var2.F = 1.0f;
                            return;
                        }
                    }
                    this.d.f11936y = pathToAttach.getAbsolutePath();
                }
                w7 w7Var3 = this.d;
                w7Var3.A = null;
                w7Var3.B = null;
                if (document != null) {
                    ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
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
                w7 w7Var4 = this.d;
                w7Var4.D = 0L;
                if (w7Var4.K) {
                    w7Var4.D = w7Var4.Z * ((float) getDuration());
                }
                this.d.E = 0.0f;
                if (j()) {
                    ArrayList arrayList2 = this.E.h;
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        w7 w7Var5 = ((d0) obj).f10712n;
                        if (w7Var5 != null && w7Var5.K) {
                            j10 = this.E.getDuration();
                            break;
                        }
                    }
                }
                w7 w7Var6 = this.d;
                if (w7Var6.K) {
                    j10 = getDuration();
                } else {
                    j10 = w7Var6.C;
                }
                cc ccVar = this.F;
                if (ccVar == null) {
                    maxCount = 1;
                } else {
                    maxCount = ccVar.getMaxCount();
                }
                w7 w7Var7 = this.d;
                if (w7Var7.C != 0) {
                    f7 = Math.min(1.0f, ((float) Math.min(j10, maxCount * 59000)) / ((float) this.d.C));
                }
                w7Var7.F = f7;
            } else {
                w7Var.f11936y = null;
                w7Var.f11938z = null;
                w7Var.A = null;
                w7Var.B = null;
                w7Var.D = 0L;
                w7Var.C = 0L;
                w7Var.E = 0.0f;
                w7Var.F = 1.0f;
            }
        }
        p(this.d, true);
    }

    public final void r() {
        int i10;
        if (this.d == null) {
            return;
        }
        if (getMeasuredHeight() > 0) {
            i10 = getMeasuredHeight();
        } else {
            i10 = AndroidUtilities.displaySize.y;
        }
        w7 w7Var = this.d;
        int i11 = w7Var.A0;
        Paint paint = this.T;
        if (i11 != 0 && w7Var.B0 != 0) {
            float f7 = i10;
            w7 w7Var2 = this.d;
            int i12 = w7Var2.A0;
            this.U = i12;
            int i13 = w7Var2.B0;
            this.V = i13;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f7, new int[]{i12, i13}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            h81 h81Var = this.f11377n;
            if (h81Var != null) {
                int i14 = this.U;
                int i15 = this.V;
                e00 e00Var = h81Var.f28862b;
                if (e00Var == null) {
                    h81Var.f28865n = i14;
                    h81Var.f28866r = i15;
                } else {
                    e00Var.i(i14, i15);
                }
            }
            eg0 eg0Var = this.f11384s;
            if (eg0Var != null) {
                int i16 = this.U;
                int i17 = this.V;
                e00 e00Var2 = eg0Var.f27843l0;
                if (e00Var2 != null) {
                    e00Var2.i(i16, i17);
                } else {
                    eg0Var.J0 = i16;
                    eg0Var.K0 = i17;
                }
            }
        } else {
            Bitmap bitmap = this.f11361a;
            if (bitmap != null) {
                new c4(this, i10, 1).run(n0.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        }
        invalidate();
    }

    public final void s(w7 w7Var, sg.d2 d2Var, boolean z10) {
        s81 s81Var;
        if (w7Var != null && w7Var.f11918o0 != null) {
            s81 s81Var2 = this.f11391x;
            if (s81Var2 != null) {
                s81Var2.H();
                this.f11391x = null;
            }
            s81 s81Var3 = new s81();
            this.f11391x = s81Var3;
            s81Var3.f32475y = true;
            s81Var3.J = new b6.i(this, 21);
            this.f11391x.D(Uri.fromFile(w7Var.f11918o0), "other");
            c();
            this.f11389w = d2Var;
            if (d2Var != null && (s81Var = this.f11391x) != null) {
                s81Var.V(d2Var.f48184u0);
            }
            this.F.n(w7Var.f11918o0.getAbsolutePath(), w7Var.f11922q0, w7Var.f11924r0, w7Var.f11926s0, w7Var.f11928t0, w7Var.f11930u0, z10);
            y(true);
            return;
        }
        s81 s81Var4 = this.f11391x;
        if (s81Var4 != null) {
            s81Var4.B();
            this.f11391x.H();
            this.f11391x = null;
        }
        cc ccVar = this.F;
        if (ccVar != null) {
            ccVar.setRoundNull(z10);
        }
        this.f11389w = null;
        AndroidUtilities.cancelRunOnUIThread(this.K);
    }

    public void set(w7 w7Var) {
        n(w7Var, null, 0L);
    }

    public void setAllowCropping(boolean z10) {
        this.f11375k0 = z10;
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

    public void setDraw(boolean z10) {
        this.f11368e0 = z10;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.f11394y0 = runnable;
    }

    public void setVideoTimelineView(cc ccVar) {
        this.F = ccVar;
        if (ccVar != null) {
            ccVar.setDelegate(new za.c(this, 22));
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8) {
            set(null);
        }
    }

    public final void t(w7 w7Var, Runnable runnable, long j10) {
        org.telegram.ui.Components.la laVar;
        boolean z10;
        ArrayList arrayList;
        org.telegram.ui.Components.ra raVar;
        float f7 = 0.0f;
        if (w7Var != null && !w7Var.v()) {
            s81 s81Var = this.e;
            if (s81Var != null) {
                s81Var.H();
                this.e = null;
            }
            s81 s81Var2 = new s81();
            this.e = s81Var2;
            s81Var2.f32475y = true;
            s81Var2.J = new a8.h0(this, w7Var, new Runnable[]{runnable});
            h81 h81Var = this.f11377n;
            if (h81Var != null) {
                h81Var.clearAnimation();
                h81 h81Var2 = this.f11377n;
                e00 e00Var = h81Var2.f28862b;
                if (e00Var != null) {
                    e00Var.postRunnable(new b00(e00Var, 0));
                }
                h81Var2.f28861a = null;
                removeView(this.f11377n);
                this.f11377n = null;
            }
            this.f11377n = new h81(getContext(), this.e);
            this.G.e();
            h81 h81Var3 = this.f11377n;
            if (w7Var.f11929u) {
                laVar = null;
            } else {
                laVar = this.G;
            }
            h81Var3.f28867s = laVar;
            e00 e00Var2 = h81Var3.f28862b;
            if (e00Var2 != null && (raVar = e00Var2.I) != null) {
                org.telegram.ui.Components.la laVar2 = raVar.f32202t;
                if (laVar2 != null && laVar2.f30146m != null) {
                    laVar2.f30146m = null;
                }
                raVar.f32202t = laVar;
                if (laVar != null && laVar.f30146m != raVar) {
                    laVar.f30146m = raVar;
                    laVar.d();
                }
            }
            this.f11377n.setOpaque(false);
            b();
            n6 n6Var = this.H;
            if (n6Var != null && n6Var.f11306g) {
                n6Var.a(this.f11377n);
            } else {
                h81 h81Var4 = this.f11377n;
                if (runnable != null) {
                    f7 = 1.0f;
                }
                h81Var4.setAlpha(f7);
                addView(this.f11377n, gb1.i(-2, -2, 51));
            }
            ai.i iVar = new ai.i(this, 23);
            v7 v7Var = w7Var.f11898d1;
            if (v7Var != null) {
                iVar.run(v7Var);
            } else if (w7Var.K && Build.VERSION.SDK_INT >= 24) {
                Utilities.globalQueue.postRunnable(new r7(w7Var, iVar, 0));
            } else {
                ?? obj = new Object();
                w7Var.f11898d1 = obj;
                iVar.run(obj);
            }
            File file = w7Var.Z0;
            if (file == null) {
                file = w7Var.L;
            }
            this.e.D(Uri.fromFile(file), "other");
            this.e.P(this.f11395z0.isEmpty());
            this.e.N(true);
            if (w7Var.h) {
                j10 = (w7Var.Z * ((float) w7Var.f11905h0)) + ((float) j10);
            }
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 > 0) {
                this.e.L(j10, false);
            }
            c();
            w(true);
            if (w7Var.f11929u && (arrayList = w7Var.v) != null && arrayList.size() == 1 && ((MessageObject) w7Var.v.get(0)).type == 5) {
                z10 = true;
            } else {
                z10 = false;
            }
            cc ccVar = this.F;
            File file2 = w7Var.Z0;
            if (file2 == null) {
                file2 = w7Var.L;
            }
            ccVar.o(z10, file2.getAbsolutePath(), getDuration(), w7Var.P);
            this.F.setVideoLeft(w7Var.Z);
            this.F.setVideoRight(w7Var.f11889a0);
            cc ccVar2 = this.F;
            if (ccVar2 != null && i10 > 0) {
                ccVar2.setProgress(j10);
                return;
            }
            return;
        }
        s81 s81Var3 = this.e;
        if (s81Var3 != null) {
            s81Var3.B();
            this.e.H();
            this.e = null;
        }
        n6 n6Var2 = this.H;
        if (n6Var2 != null && n6Var2.f11306g) {
            n6Var2.a(null);
        } else {
            h81 h81Var5 = this.f11377n;
            if (h81Var5 != null) {
                h81Var5.clearAnimation();
                this.f11377n.animate().alpha(0.0f).withEndAction(new m6(this, 6)).start();
            }
        }
        cc ccVar3 = this.F;
        if (ccVar3 != null) {
            ccVar3.o(false, null, 1L, 0.0f);
        }
        AndroidUtilities.cancelRunOnUIThread(this.K);
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public final void u(w7 w7Var) {
        Drawable drawable = this.S;
        this.R = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (w7Var == null) {
            this.S = null;
            return;
        }
        long j10 = w7Var.f11939z0;
        if (j10 != Long.MIN_VALUE) {
            Drawable e = e(this.S, w7Var.f11888a, j10, w7Var.f11937y0);
            w7Var.f11935x0 = e;
            this.S = e;
            if (this.R != e) {
                this.R = null;
            }
            if (e != null) {
                e.setCallback(this);
            }
            org.telegram.ui.Components.la laVar = this.G;
            if (laVar != null) {
                Drawable drawable2 = this.S;
                if (drawable2 != null) {
                    if (drawable2 instanceof BitmapDrawable) {
                        laVar.f(((BitmapDrawable) drawable2).getBitmap(), false);
                    } else {
                        int intrinsicWidth = drawable2.getIntrinsicWidth();
                        int intrinsicHeight = this.S.getIntrinsicHeight();
                        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                            intrinsicWidth = 1080;
                            intrinsicHeight = 1920;
                        }
                        float f7 = intrinsicWidth;
                        float f10 = intrinsicHeight;
                        float max = Math.max(100.0f / f7, 100.0f / f10);
                        if (max > 1.0f) {
                            intrinsicWidth = (int) (f7 * max);
                            intrinsicHeight = (int) (f10 * max);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                        this.S.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                        this.S.draw(new Canvas(createBitmap));
                        laVar.f(createBitmap, true);
                    }
                } else {
                    laVar.f(null, false);
                }
            }
            invalidate();
            return;
        }
        this.S = null;
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z10;
        double d;
        float f7;
        w7 w7Var;
        PointF pointF;
        boolean z11;
        boolean z12;
        if (this.f11375k0) {
            if (motionEvent.getPointerCount() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            PointF pointF2 = this.m0;
            if (z10) {
                pointF2.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                pointF2.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                f7 = a8.ic.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                d = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
            } else {
                pointF2.x = motionEvent.getX(0);
                pointF2.y = motionEvent.getY(0);
                d = 0.0d;
                f7 = 0.0f;
            }
            boolean z13 = this.f11380p0;
            PointF pointF3 = this.f11376l0;
            if (z13 != z10) {
                pointF3.x = pointF2.x;
                pointF3.y = pointF2.y;
                this.f11378n0 = f7;
                this.f11379o0 = d;
                this.f11380p0 = z10;
            }
            if (this.d != null) {
                float width = w7Var.f11907i0 / getWidth();
                int actionMasked = motionEvent.getActionMasked();
                Matrix matrix = this.f11385s0;
                if (actionMasked == 0) {
                    this.f11387u0 = 0.0f;
                    this.f11388v0 = false;
                    invalidate();
                    this.f11390w0 = true;
                    matrix.set(this.d.f11916n0);
                }
                if (motionEvent.getActionMasked() == 2 && this.f11390w0 && this.d != null) {
                    float f10 = pointF2.x * width;
                    float f11 = pointF2.y * width;
                    float f12 = pointF3.x * width;
                    float f13 = pointF3.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f14 = this.f11378n0;
                        if (f14 != 0.0f) {
                            float f15 = f7 / f14;
                            matrix.postScale(f15, f15, f10, f11);
                        }
                        pointF = pointF2;
                        float degrees = (float) Math.toDegrees(d - this.f11379o0);
                        float f16 = this.f11387u0 + degrees;
                        this.f11387u0 = f16;
                        if (!this.f11383r0) {
                            if (Math.abs(f16) > 20.0f) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.f11383r0 = z11;
                            if (!z11) {
                                d(matrix);
                                if ((Math.round(this.f11367d0 / 90.0f) * 90.0f) - this.f11367d0 > 20.0f) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                this.f11383r0 = z12;
                            }
                            if (!this.f11388v0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.f11388v0 = true;
                            }
                        }
                        if (this.f11383r0) {
                            matrix.postRotate(degrees, f10, f11);
                        }
                        this.f11381q0 = true;
                    } else {
                        pointF = pointF2;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.f11381q0) {
                        matrix.postTranslate(f10 - f12, f11 - f13);
                    }
                    Matrix matrix2 = this.f11386t0;
                    matrix2.set(matrix);
                    Matrix matrix3 = this.W;
                    matrix3.set(matrix);
                    d(matrix3);
                    float round = (Math.round(this.f11367d0 / 90.0f) * 90.0f) - this.f11367d0;
                    if (this.f11383r0) {
                        if (Math.abs(round) < 3.5f) {
                            matrix2.postRotate(round, this.f11364b0, this.f11366c0);
                            if (!this.f11388v0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.f11388v0 = true;
                            }
                        } else {
                            this.f11388v0 = false;
                        }
                    }
                    this.d.f11916n0.set(matrix2);
                    this.d.f11908j = true;
                    b();
                    invalidate();
                } else {
                    pointF = pointF2;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getPointerCount() <= 1) {
                        this.f11381q0 = false;
                        sb sbVar = ((gb) this).C0;
                        sbVar.f11650o1.a(true, false, sbVar.f11632i0);
                        sbVar.f11650o1.b(sbVar.f11614c1.getText());
                    }
                    this.f11390w0 = false;
                    this.f11383r0 = false;
                    this.f11387u0 = 0.0f;
                    this.f11388v0 = false;
                    invalidate();
                }
                PointF pointF4 = pointF;
                pointF3.x = pointF4.x;
                pointF3.y = pointF4.y;
                this.f11378n0 = f7;
                this.f11379o0 = d;
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
        throw new UnsupportedOperationException("Method not decompiled: fi.o6.w(boolean):void");
    }

    public final void x(int i10, boolean z10) {
        HashSet hashSet = this.f11395z0;
        if (z10) {
            hashSet.add(Integer.valueOf(i10));
        } else {
            hashSet.remove(Integer.valueOf(i10));
        }
        s81 s81Var = this.e;
        if (s81Var != null) {
            s81Var.P(hashSet.isEmpty());
        }
        e0 e0Var = this.E;
        if (e0Var != null) {
            e0Var.setPlaying(hashSet.isEmpty());
        }
        w(true);
        y(true);
    }

    public final void y(boolean z10) {
        long n10;
        boolean y3;
        float f7;
        boolean z11;
        int i10;
        if (this.f11391x != null && this.d != null) {
            boolean z12 = true;
            if (this.e == null && !j()) {
                this.f11391x.P(this.f11395z0.isEmpty());
                this.f11391x.N(true);
                sg.d2 d2Var = this.f11389w;
                if (d2Var != null && !d2Var.B0) {
                    d2Var.B0 = true;
                    d2Var.C0.f(true, true);
                    d2Var.invalidate();
                }
                long n11 = this.f11391x.n();
                if (z10 && this.f11391x.p() != -9223372036854775807L) {
                    float p10 = ((float) n11) / ((float) this.f11391x.p());
                    w7 w7Var = this.d;
                    if ((p10 < w7Var.f11926s0 || p10 > w7Var.f11928t0) && System.currentTimeMillis() - this.J > 500) {
                        this.J = System.currentTimeMillis();
                        this.f11391x.L(-this.d.f11924r0, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (j()) {
                n10 = this.E.getPositionWithOffset();
                y3 = this.E.f10762q0;
            } else {
                n10 = this.e.n();
                y3 = this.e.y();
            }
            w7 w7Var2 = this.d;
            float f10 = w7Var2.f11928t0;
            float f11 = w7Var2.f11926s0;
            long j10 = (f10 - f11) * ((float) w7Var2.f11922q0);
            long j11 = w7Var2.f11924r0;
            if (n10 >= j11 && n10 <= j10 + j11) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!y3 || !z11) {
                z12 = false;
            }
            long j12 = (n10 - j11) + (f11 * f7);
            sg.d2 d2Var2 = this.f11389w;
            if (d2Var2 != null && d2Var2.B0 != z11) {
                d2Var2.B0 = z11;
                d2Var2.invalidate();
            }
            if (this.f11391x.y() != z12) {
                this.f11391x.P(z12);
                this.f11391x.L(j12, false);
            } else if (z10) {
                long abs = Math.abs(this.f11391x.n() - j12);
                if (j()) {
                    i10 = 300;
                } else {
                    i10 = 120;
                }
                if (abs > i10) {
                    this.f11391x.L(j12, false);
                }
            }
        }
    }
}
