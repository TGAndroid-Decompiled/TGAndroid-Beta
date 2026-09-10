package bi;

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
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.zz;
public abstract class e8 extends FrameLayout {
    public static final int B0 = 0;
    public n0 A0;
    public j0 E;
    public me F;
    public final org.telegram.ui.Components.ia G;
    public final d8 H;
    public long I;
    public long J;
    public final b8 K;
    public final b8 L;
    public final b8 M;
    public tb N;
    public boolean O;
    public final org.telegram.ui.Components.d6 P;
    public final Paint Q;
    public Drawable R;
    public Drawable S;
    public final Paint T;
    public int U;
    public int V;
    public final Matrix W;
    public Bitmap f2631a;
    public final float[] f2632a0;
    public final Rect f2633b;
    public float f2634b0;
    public final Rect f2635c;
    public float f2636c0;
    public r9 d;
    public float f2637d0;
    public t71 e;
    public boolean f2638e0;
    public int f2639f;
    public final org.telegram.ui.Components.d6 f2640f0;
    public boolean f2641g0;
    public int h;
    public final Matrix f2642h0;
    public final Matrix f2643i0;
    public final Matrix f2644j0;
    public boolean f2645k0;
    public final PointF f2646l0;
    public final PointF m0;
    public h71 f2647n;
    public float f2648n0;
    public double f2649o0;
    public boolean f2650p0;
    public boolean f2651q0;
    public TextureView f2652r;
    public boolean f2653r0;
    public sf0 f2654s;
    public final Matrix f2655s0;
    public final Matrix f2656t0;
    public float f2657u0;
    public tb v;
    public boolean f2658v0;
    public pg.b2 f2659w;
    public boolean f2660w0;
    public t71 f2661x;
    public long f2662x0;
    public t71 f2663y;
    public Runnable f2664y0;
    public final HashSet f2665z0;

    public e8(Context context, org.telegram.ui.Components.ia iaVar, d8 d8Var) {
        super(context);
        this.f2633b = new Rect();
        this.f2635c = new Rect();
        Paint paint = new Paint(1);
        new b8(this, 2);
        this.K = new b8(this, 3);
        this.L = new b8(this, 4);
        this.M = new b8(this, 5);
        this.P = new org.telegram.ui.Components.d6(this, 0L, 350L, wr.h);
        this.Q = new Paint(7);
        this.T = new Paint(1);
        this.W = new Matrix();
        this.f2632a0 = new float[2];
        this.f2638e0 = true;
        this.f2640f0 = new org.telegram.ui.Components.d6(this, 0L, 320L, wr.f28820g);
        this.f2641g0 = false;
        this.f2642h0 = new Matrix();
        this.f2643i0 = new Matrix();
        this.f2644j0 = new Matrix();
        this.f2645k0 = true;
        this.f2646l0 = new PointF();
        this.m0 = new PointF();
        this.f2655s0 = new Matrix();
        this.f2656t0 = new Matrix();
        this.f2665z0 = new HashSet();
        this.G = iaVar;
        this.H = d8Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 1073741824);
    }

    public static void a(bi.e8 r13, bi.r9 r14) {
        throw new UnsupportedOperationException("Method not decompiled: bi.e8.a(bi.e8, bi.r9):void");
    }

    public static Drawable e(Drawable drawable, int i10, long j3, boolean z10) {
        TLRPC.WallPaper wallPaper = null;
        if (j3 == Long.MIN_VALUE) {
            return null;
        }
        if (j3 >= 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j3);
            if (userFull != null) {
                wallPaper = userFull.wallpaper;
            }
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(-j3);
            if (chatFull != null) {
                wallPaper = chatFull.wallpaper;
            }
        }
        return f(drawable, i10, wallPaper, z10);
    }

    public static android.graphics.drawable.Drawable f(android.graphics.drawable.Drawable r5, int r6, org.telegram.tgnet.TLRPC.WallPaper r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: bi.e8.f(android.graphics.drawable.Drawable, int, org.telegram.tgnet.TLRPC$WallPaper, boolean):android.graphics.drawable.Drawable");
    }

    public static Drawable g(int i10, final org.telegram.ui.ActionBar.f4 f4Var, final boolean z10) {
        if (f4Var.m()) {
            org.telegram.ui.ActionBar.j6.H(org.telegram.ui.ActionBar.f4.e(z10), f4Var.h(i10, z10 ? 1 : 0), ((org.telegram.ui.ActionBar.e4) f4Var.f17717f.get(z10 ? 1 : 0)).f17674g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray h = f4Var.h(i10, z10 ? 1 : 0);
        int i11 = org.telegram.ui.ActionBar.j6.Nd;
        int i12 = h.get(i11, org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        int i13 = org.telegram.ui.ActionBar.j6.Od;
        int i14 = h.get(i13, org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        int i15 = org.telegram.ui.ActionBar.j6.Pd;
        int i16 = h.get(i15, org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        int i17 = org.telegram.ui.ActionBar.j6.Qd;
        int i18 = h.get(i17, org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        final lc0 lc0Var = new lc0();
        lc0Var.f24946g = false;
        lc0Var.t(lc0Var.f24959u, f4Var.k(z10 ? 1 : 0).settings.intensity);
        lc0Var.o(i12, i14, i16, i18, 0, true);
        lc0Var.v(0);
        final int f7 = lc0Var.f();
        f4Var.o(z10 ? 1 : 0, new ResultCallback() {
            @Override
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair != null) {
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((cg.a) pair.second).f4676b;
                    org.telegram.ui.ActionBar.f4 f4Var2 = org.telegram.ui.ActionBar.f4.this;
                    if (longValue == f4Var2.i(z10 ? 1 : 0) && bitmap != null) {
                        int i19 = f4Var2.k(z10 ? 1 : 0).settings.intensity;
                        lc0 lc0Var2 = lc0Var;
                        lc0Var2.t(bitmap, i19);
                        lc0Var2.u(f7);
                        lc0Var2.s(1.0f);
                    }
                }
            }

            @Override
            public final void onError(Throwable th2) {
                org.telegram.tgnet.o.a(this, th2);
            }

            @Override
            public final void onError(TLRPC.TL_error tL_error) {
                org.telegram.tgnet.o.b(this, tL_error);
            }
        });
        return lc0Var;
    }

    private void setupCollage(r9 r9Var) {
        ArrayList<r9> arrayList;
        me meVar = this.F;
        if (meVar != null) {
            if (r9Var != null) {
                arrayList = r9Var.T;
            } else {
                arrayList = null;
            }
            meVar.setCollage(arrayList);
        }
    }

    private void setupImage(r9 r9Var) {
        Utilities.searchQueue.postRunnable(new a1.e(16, this, r9Var));
    }

    public abstract void b();

    public final void c() {
        float f7;
        float f10;
        r9 r9Var;
        t71 t71Var = this.e;
        float f11 = 0.0f;
        if (t71Var != null) {
            if (!this.O && ((r9Var = this.d) == null || !r9Var.Y)) {
                if (r9Var != null) {
                    f10 = r9Var.P;
                } else {
                    f10 = 1.0f;
                }
            } else {
                f10 = 0.0f;
            }
            t71Var.W(f10);
        }
        t71 t71Var2 = this.f2661x;
        if (t71Var2 != null) {
            if (this.O) {
                f7 = 0.0f;
            } else {
                r9 r9Var2 = this.d;
                if (r9Var2 != null) {
                    f7 = r9Var2.f3601u0;
                } else {
                    f7 = 1.0f;
                }
            }
            t71Var2.W(f7);
        }
        t71 t71Var3 = this.f2663y;
        if (t71Var3 != null) {
            if (!this.O) {
                r9 r9Var3 = this.d;
                if (r9Var3 != null) {
                    f11 = r9Var3.G;
                } else {
                    f11 = 1.0f;
                }
            }
            t71Var3.W(f11);
        }
        j0 j0Var = this.E;
        if (j0Var != null) {
            j0Var.setMuted(this.O);
        }
    }

    public final void d(Matrix matrix) {
        r9 r9Var = this.d;
        if (r9Var == null) {
            return;
        }
        float[] fArr = this.f2632a0;
        fArr[0] = r9Var.f3582k0 / 2.0f;
        fArr[1] = r9Var.f3584l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f2634b0 = fArr[0];
        this.f2636c0 = fArr[1];
        r9 r9Var2 = this.d;
        fArr[0] = r9Var2.f3582k0;
        fArr[1] = r9Var2.f3584l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f2637d0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.f2636c0, fArr[0] - this.f2634b0));
        v7.a7.a(this.f2634b0, this.f2636c0, fArr[0], fArr[1]);
        r9 r9Var3 = this.d;
        fArr[0] = r9Var3.f3582k0 / 2.0f;
        fArr[1] = r9Var3.f3584l0;
        matrix.mapPoints(fArr);
        v7.a7.a(this.f2634b0, this.f2636c0, fArr[0], fArr[1]);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        r9 r9Var;
        MediaController.CropState cropState;
        if (this.S != null) {
            float f7 = 0.0f;
            if (this.f2641g0) {
                Path path = new Path();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.S;
            if (!(drawable instanceof lc0) || ((lc0) drawable).f24959u != null) {
                f7 = this.P.d(1.0f, false);
            }
            Drawable drawable2 = this.R;
            if (drawable2 != null && f7 < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - f7) * 255.0f));
                r9.j(canvas, this.R, getWidth(), getHeight());
            }
            this.S.setAlpha((int) (f7 * 255.0f));
            r9.j(canvas, this.S, getWidth(), getHeight());
            if (this.f2641g0) {
                canvas.restore();
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.T);
        }
        n0 n0Var = this.A0;
        if (n0Var != null) {
            n0Var.d.b(canvas2, true);
        } else if (this.f2638e0 && this.d != null && !j()) {
            if (this.f2631a == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e = this.f2640f0.e(z10);
            if (this.f2631a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.f3578i0, getHeight() / this.d.f3580j0);
                canvas2.concat(this.d.f3587n0);
                if (this.d.m0 != null) {
                    canvas2.translate(r9Var.f3582k0 / 2.0f, r9Var.f3584l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    r9 r9Var2 = this.d;
                    int i10 = r9Var2.f3582k0;
                    int i11 = r9Var2.f3584l0;
                    int i12 = r9Var2.Q;
                    MediaController.CropState cropState2 = r9Var2.m0;
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
                    r9 r9Var3 = this.d;
                    canvas2.translate((-r9Var3.f3582k0) / 2.0f, (-r9Var3.f3584l0) / 2.0f);
                }
                Paint paint = this.Q;
                paint.setAlpha((int) ((1.0f - e) * 255.0f));
                int width = this.f2631a.getWidth();
                int height = this.f2631a.getHeight();
                Rect rect = this.f2633b;
                rect.set(0, 0, width, height);
                r9 r9Var4 = this.d;
                int i13 = r9Var4.f3582k0;
                int i14 = r9Var4.f3584l0;
                Rect rect2 = this.f2635c;
                rect2.set(0, 0, i13, i14);
                canvas2.drawBitmap(this.f2631a, rect, rect2, paint);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: bi.e8.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        r9 r9Var;
        r9 r9Var2;
        h71 h71Var = this.f2647n;
        if (view == h71Var && (r9Var2 = this.d) != null && r9Var2.f3600u) {
            return false;
        }
        if ((view == h71Var || view == this.f2652r) && (r9Var = this.d) != null && r9Var.m0 != null) {
            canvas.save();
            canvas.scale(getWidth() / this.d.f3578i0, getHeight() / this.d.f3580j0);
            canvas.concat(this.d.f3587n0);
            r9 r9Var3 = this.d;
            if (r9Var3.m0 != null) {
                canvas.translate(r9Var3.f3582k0 / 2.0f, r9Var3.f3584l0 / 2.0f);
                canvas.rotate(-this.d.Q);
                r9 r9Var4 = this.d;
                int i10 = r9Var4.f3582k0;
                int i11 = r9Var4.f3584l0;
                int i12 = r9Var4.Q;
                MediaController.CropState cropState = r9Var4.m0;
                if (((i12 + cropState.transformRotation) / 90) % 2 == 1) {
                    i11 = i10;
                    i10 = i11;
                }
                float f7 = cropState.cropPw;
                float f10 = cropState.cropPh;
                canvas.clipRect(((-i10) * f7) / 2.0f, ((-i11) * f10) / 2.0f, (i10 * f7) / 2.0f, (i11 * f10) / 2.0f);
                canvas.rotate(this.d.Q);
                r9 r9Var5 = this.d;
                canvas.translate((-r9Var5.f3582k0) / 2.0f, (-r9Var5.f3584l0) / 2.0f);
            }
            canvas.concat(this.f2642h0);
            canvas.scale(1.0f / (getWidth() / this.d.f3578i0), 1.0f / (getHeight() / this.d.f3580j0));
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public int getContentHeight() {
        r9 r9Var = this.d;
        if (r9Var == null) {
            return 1;
        }
        return r9Var.f3584l0;
    }

    public int getContentWidth() {
        r9 r9Var = this.d;
        if (r9Var == null) {
            return 1;
        }
        return r9Var.f3582k0;
    }

    public long getCurrentPosition() {
        t71 t71Var = this.e;
        if (t71Var != null) {
            return t71Var.n();
        }
        t71 t71Var2 = this.f2661x;
        if (t71Var2 != null) {
            return t71Var2.n();
        }
        t71 t71Var3 = this.f2663y;
        if (t71Var3 != null) {
            return t71Var3.n();
        }
        return 0L;
    }

    public long getDuration() {
        r9 r9Var = this.d;
        if (r9Var != null) {
            double d = r9Var.f3577i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        t71 t71Var = this.e;
        if (t71Var != null && t71Var.p() != -9223372036854775807L) {
            return this.e.p();
        }
        return 1L;
    }

    public int getOrientation() {
        r9 r9Var = this.d;
        if (r9Var == null) {
            return 0;
        }
        return r9Var.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        if (this.d == null) {
            return new Pair<>(1080, 1920);
        }
        return new Pair<>(Integer.valueOf(this.d.f3578i0), Integer.valueOf(this.d.f3580j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.f2631a;
    }

    public h71 getTextureView() {
        return this.f2647n;
    }

    public final void h(Utilities.Callback callback, View... viewArr) {
        h71 h71Var;
        int dp = (int) (AndroidUtilities.dp(26.0f) * AndroidUtilities.density);
        int dp2 = (int) (AndroidUtilities.dp(30.33f) * AndroidUtilities.density);
        int dp3 = (int) (AndroidUtilities.dp(4.0f) * AndroidUtilities.density);
        Bitmap[] bitmapArr = new Bitmap[viewArr.length];
        for (int i10 = 0; i10 < viewArr.length; i10++) {
            View view = viewArr[i10];
            if (view != null && view.getWidth() >= 0 && viewArr[i10].getHeight() > 0) {
                View view2 = viewArr[i10];
                if (view2 == this && (h71Var = this.f2647n) != null) {
                    bitmapArr[i10] = h71Var.getBitmap();
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
        Utilities.globalQueue.postRunnable(new z7(dp, dp2, dp3, bitmapArr, callback));
    }

    public abstract void i();

    public final boolean j() {
        r9 r9Var;
        if (this.E != null && (r9Var = this.d) != null && r9Var.v()) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        return !this.f2665z0.contains(-9982);
    }

    public final void l(r9 r9Var) {
        this.d = r9Var;
        if (r9Var == null) {
            setupImage(null);
            u(null);
            this.T.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (r9Var.K) {
            setupImage(r9Var);
            if (r9Var.A0 == 0 && r9Var.B0 == 0) {
                r9Var.z(new b8((nd) this, 0));
            } else {
                r();
            }
        } else {
            setupImage(r9Var);
            r();
        }
        b();
        u(r9Var);
        p(r9Var, false);
        s(r9Var, null, false);
    }

    public final void m(long j3) {
        t71 t71Var = this.e;
        if (t71Var != null) {
            t71Var.L(j3, false);
        } else if (j()) {
            this.E.m(j3, false);
        } else {
            t71 t71Var2 = this.f2661x;
            if (t71Var2 != null) {
                t71Var2.L(j3, false);
            } else {
                t71 t71Var3 = this.f2663y;
                if (t71Var3 != null) {
                    t71Var3.L(j3, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(r9 r9Var, zb zbVar, long j3) {
        this.d = r9Var;
        if (r9Var == null) {
            t(null, zbVar, j3);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.T.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (r9Var.v()) {
            setupImage(null);
            t(null, zbVar, j3);
            setupCollage(r9Var);
        } else if (r9Var.K) {
            setupImage(r9Var);
            setupCollage(null);
            t(r9Var, zbVar, j3);
            if (r9Var.A0 == 0 && r9Var.B0 == 0) {
                r9Var.z(new b8(this, 1));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, zbVar, 0L);
            setupImage(r9Var);
            r();
        }
        b();
        u(r9Var);
        p(r9Var, false);
        s(r9Var, null, false);
    }

    public final void o(TextureView textureView, sf0 sf0Var) {
        TextureView textureView2 = this.f2652r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.f2652r = null;
        }
        this.f2654s = sf0Var;
        this.f2652r = textureView;
        if (sf0Var != null) {
            int i10 = this.U;
            int i11 = this.V;
            c00 c00Var = sf0Var.f27026l0;
            if (c00Var != null) {
                c00Var.i(i10, i11);
            } else {
                sf0Var.J0 = i10;
                sf0Var.K0 = i11;
            }
        }
        TextureView textureView3 = this.f2652r;
        if (textureView3 != null) {
            addView(textureView3);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f2645k0) {
            v(motionEvent);
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void p(r9 r9Var, boolean z10) {
        boolean z11;
        String str;
        float f7;
        float f10;
        float f11;
        t71 t71Var = this.f2663y;
        if (t71Var != null) {
            t71Var.B();
            this.f2663y.H();
            this.f2663y = null;
        }
        if (r9Var != null) {
            me meVar = this.F;
            boolean z12 = false;
            if (meVar != null) {
                String str2 = r9Var.f3607y;
                String str3 = r9Var.A;
                String str4 = r9Var.B;
                long j3 = r9Var.C;
                long j10 = r9Var.D;
                float f12 = r9Var.E;
                float f13 = r9Var.F;
                float f14 = r9Var.G;
                if (!TextUtils.equals(meVar.O, str2)) {
                    fe feVar = meVar.f3149a0;
                    if (feVar != null) {
                        feVar.a();
                        meVar.f3149a0 = null;
                        meVar.U = false;
                    }
                    meVar.O = str2;
                    meVar.p();
                }
                meVar.O = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                meVar.N = !isEmpty;
                if (isEmpty) {
                    meVar.P = false;
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
                if (meVar.N) {
                    meVar.R = j3;
                    meVar.Q = j10 - (((float) j3) * f12);
                    meVar.S = f12;
                    meVar.T = f13;
                    meVar.V = f14;
                    float f15 = 0.0f;
                    if (str != null) {
                        StaticLayout staticLayout = new StaticLayout(str, meVar.L0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        meVar.M0 = staticLayout;
                        if (staticLayout.getLineCount() > 0) {
                            f10 = meVar.M0.getLineWidth(0);
                        } else {
                            f10 = 0.0f;
                        }
                        meVar.N0 = f10;
                        if (meVar.M0.getLineCount() > 0) {
                            f11 = meVar.M0.getLineLeft(0);
                        } else {
                            f11 = 0.0f;
                        }
                        meVar.O0 = f11;
                    } else {
                        meVar.N0 = 0.0f;
                        meVar.M0 = null;
                    }
                    if (str4 != null) {
                        StaticLayout staticLayout2 = new StaticLayout(str4, meVar.P0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        meVar.Q0 = staticLayout2;
                        if (staticLayout2.getLineCount() > 0) {
                            f7 = meVar.Q0.getLineWidth(0);
                        } else {
                            f7 = 0.0f;
                        }
                        meVar.R0 = f7;
                        if (meVar.Q0.getLineCount() > 0) {
                            f15 = meVar.Q0.getLineLeft(0);
                        }
                        meVar.S0 = f15;
                    } else {
                        meVar.R0 = 0.0f;
                        meVar.Q0 = null;
                    }
                }
                if (!z10) {
                    z11 = true;
                    meVar.f3159e0.f(meVar.N, true);
                } else {
                    z11 = true;
                }
                meVar.invalidate();
            } else {
                z11 = true;
            }
            if (r9Var.f3607y != null) {
                t71 t71Var2 = new t71();
                this.f2663y = t71Var2;
                t71Var2.f27379y = z11;
                t71Var2.J = new pb.c(this, 7);
                t71Var2.D(Uri.fromFile(new File(r9Var.f3607y)), "other");
                c();
                if (this.e != null && getDuration() > 0) {
                    long duration = r9Var.Z * ((float) getDuration());
                    this.e.L(duration, false);
                    this.F.setProgress(duration);
                }
                w(true);
            }
            ce ceVar = ((nd) this).C0;
            ad adVar = ceVar.f2498v1;
            if (adVar != null) {
                r9 r9Var2 = ceVar.K1;
                if (r9Var2 != null && r9Var2.f3607y != null) {
                    z12 = true;
                }
                adVar.setHasAudio(z12);
            }
        }
    }

    public final void q(MessageObject messageObject) {
        long j3;
        int maxCount;
        r9 r9Var = this.d;
        if (r9Var != null) {
            r9Var.f3579j = true;
            float f7 = 1.0f;
            if (messageObject != null && messageObject.messageOwner != null) {
                TLRPC.Document document = messageObject.getDocument();
                if (document != null && document.f17201id != 0) {
                    this.d.f3609z = new TLRPC.TL_inputDocument();
                    TLRPC.InputDocument inputDocument = this.d.f3609z;
                    inputDocument.f17207id = document.f17201id;
                    inputDocument.file_reference = document.file_reference;
                    inputDocument.access_hash = document.access_hash;
                }
                int i10 = 0;
                if (!TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                    this.d.f3607y = messageObject.messageOwner.attachPath;
                } else {
                    File pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, false, true);
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, true, true);
                        if (pathToAttach != null && pathToAttach.exists()) {
                            this.d.f3607y = pathToAttach.getAbsolutePath();
                        } else {
                            r9 r9Var2 = this.d;
                            r9Var2.f3607y = null;
                            r9Var2.f3609z = null;
                            r9Var2.A = null;
                            r9Var2.B = null;
                            r9Var2.D = 0L;
                            r9Var2.C = 0L;
                            r9Var2.E = 0.0f;
                            r9Var2.F = 1.0f;
                            return;
                        }
                    }
                    this.d.f3607y = pathToAttach.getAbsolutePath();
                }
                r9 r9Var3 = this.d;
                r9Var3.A = null;
                r9Var3.B = null;
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
                r9 r9Var4 = this.d;
                r9Var4.D = 0L;
                if (r9Var4.K) {
                    r9Var4.D = r9Var4.Z * ((float) getDuration());
                }
                this.d.E = 0.0f;
                if (j()) {
                    ArrayList arrayList2 = this.E.h;
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        r9 r9Var5 = ((i0) obj).f2835n;
                        if (r9Var5 != null && r9Var5.K) {
                            j3 = this.E.getDuration();
                            break;
                        }
                    }
                }
                r9 r9Var6 = this.d;
                if (r9Var6.K) {
                    j3 = getDuration();
                } else {
                    j3 = r9Var6.C;
                }
                me meVar = this.F;
                if (meVar == null) {
                    maxCount = 1;
                } else {
                    maxCount = meVar.getMaxCount();
                }
                r9 r9Var7 = this.d;
                if (r9Var7.C != 0) {
                    f7 = Math.min(1.0f, ((float) Math.min(j3, maxCount * 59000)) / ((float) this.d.C));
                }
                r9Var7.F = f7;
            } else {
                r9Var.f3607y = null;
                r9Var.f3609z = null;
                r9Var.A = null;
                r9Var.B = null;
                r9Var.D = 0L;
                r9Var.C = 0L;
                r9Var.E = 0.0f;
                r9Var.F = 1.0f;
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
        r9 r9Var = this.d;
        int i11 = r9Var.A0;
        Paint paint = this.T;
        if (i11 != 0 && r9Var.B0 != 0) {
            float f7 = i10;
            r9 r9Var2 = this.d;
            int i12 = r9Var2.A0;
            this.U = i12;
            int i13 = r9Var2.B0;
            this.V = i13;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f7, new int[]{i12, i13}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            h71 h71Var = this.f2647n;
            if (h71Var != null) {
                int i14 = this.U;
                int i15 = this.V;
                c00 c00Var = h71Var.f23538b;
                if (c00Var == null) {
                    h71Var.f23541n = i14;
                    h71Var.f23542r = i15;
                } else {
                    c00Var.i(i14, i15);
                }
            }
            sf0 sf0Var = this.f2654s;
            if (sf0Var != null) {
                int i16 = this.U;
                int i17 = this.V;
                c00 c00Var2 = sf0Var.f27026l0;
                if (c00Var2 != null) {
                    c00Var2.i(i16, i17);
                } else {
                    sf0Var.J0 = i16;
                    sf0Var.K0 = i17;
                }
            }
        } else {
            Bitmap bitmap = this.f2631a;
            if (bitmap != null) {
                new c8(this, i10, 0).run(r0.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        }
        invalidate();
    }

    public final void s(r9 r9Var, pg.b2 b2Var, boolean z10) {
        t71 t71Var;
        if (r9Var != null && r9Var.f3589o0 != null) {
            t71 t71Var2 = this.f2661x;
            if (t71Var2 != null) {
                t71Var2.H();
                this.f2661x = null;
            }
            t71 t71Var3 = new t71();
            this.f2661x = t71Var3;
            t71Var3.f27379y = true;
            t71Var3.J = new a6.i(this, 9);
            this.f2661x.D(Uri.fromFile(r9Var.f3589o0), "other");
            c();
            this.f2659w = b2Var;
            if (b2Var != null && (t71Var = this.f2661x) != null) {
                t71Var.V(b2Var.f39958u0);
            }
            this.F.n(r9Var.f3589o0.getAbsolutePath(), r9Var.f3593q0, r9Var.f3595r0, r9Var.f3597s0, r9Var.f3599t0, r9Var.f3601u0, z10);
            y(true);
            return;
        }
        t71 t71Var4 = this.f2661x;
        if (t71Var4 != null) {
            t71Var4.B();
            this.f2661x.H();
            this.f2661x = null;
        }
        me meVar = this.F;
        if (meVar != null) {
            meVar.setRoundNull(z10);
        }
        this.f2659w = null;
        AndroidUtilities.cancelRunOnUIThread(this.K);
    }

    public void set(r9 r9Var) {
        n(r9Var, null, 0L);
    }

    public void setAllowCropping(boolean z10) {
        this.f2645k0 = z10;
    }

    public void setCollageView(j0 j0Var) {
        this.E = j0Var;
    }

    public void setCropEditorDrawing(n0 n0Var) {
        if (this.A0 != n0Var) {
            this.A0 = n0Var;
            invalidate();
        }
    }

    public void setDraw(boolean z10) {
        this.f2638e0 = z10;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.f2664y0 = runnable;
    }

    public void setVideoTimelineView(me meVar) {
        this.F = meVar;
        if (meVar != null) {
            meVar.setDelegate(new xa.c(this, 10));
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8) {
            set(null);
        }
    }

    public final void t(r9 r9Var, Runnable runnable, long j3) {
        org.telegram.ui.Components.ia iaVar;
        boolean z10;
        ArrayList arrayList;
        org.telegram.ui.Components.oa oaVar;
        float f7 = 0.0f;
        if (r9Var != null && !r9Var.v()) {
            t71 t71Var = this.e;
            if (t71Var != null) {
                t71Var.H();
                this.e = null;
            }
            t71 t71Var2 = new t71();
            this.e = t71Var2;
            t71Var2.f27379y = true;
            t71Var2.J = new aa.a(this, r9Var, new Runnable[]{runnable});
            h71 h71Var = this.f2647n;
            if (h71Var != null) {
                h71Var.clearAnimation();
                h71 h71Var2 = this.f2647n;
                c00 c00Var = h71Var2.f23538b;
                if (c00Var != null) {
                    c00Var.postRunnable(new zz(c00Var, 0));
                }
                h71Var2.f23537a = null;
                removeView(this.f2647n);
                this.f2647n = null;
            }
            this.f2647n = new h71(getContext(), this.e);
            this.G.e();
            h71 h71Var3 = this.f2647n;
            if (r9Var.f3600u) {
                iaVar = null;
            } else {
                iaVar = this.G;
            }
            h71Var3.f23543s = iaVar;
            c00 c00Var2 = h71Var3.f23538b;
            if (c00Var2 != null && (oaVar = c00Var2.I) != null) {
                org.telegram.ui.Components.ia iaVar2 = oaVar.f25752t;
                if (iaVar2 != null && iaVar2.f23972m != null) {
                    iaVar2.f23972m = null;
                }
                oaVar.f25752t = iaVar;
                if (iaVar != null && iaVar.f23972m != oaVar) {
                    iaVar.f23972m = oaVar;
                    iaVar.d();
                }
            }
            this.f2647n.setOpaque(false);
            b();
            d8 d8Var = this.H;
            if (d8Var != null && d8Var.f2555g) {
                d8Var.a(this.f2647n);
            } else {
                h71 h71Var4 = this.f2647n;
                if (runnable != null) {
                    f7 = 1.0f;
                }
                h71Var4.setAlpha(f7);
                addView(this.f2647n, w7.a6.e(-2, -2, 51));
            }
            ai.b bVar = new ai.b(this, 7);
            q9 q9Var = r9Var.f3569d1;
            if (q9Var != null) {
                bVar.run(q9Var);
            } else if (r9Var.K && Build.VERSION.SDK_INT >= 24) {
                Utilities.globalQueue.postRunnable(new m9(r9Var, bVar, 0));
            } else {
                ?? obj = new Object();
                r9Var.f3569d1 = obj;
                bVar.run(obj);
            }
            File file = r9Var.Z0;
            if (file == null) {
                file = r9Var.L;
            }
            this.e.D(Uri.fromFile(file), "other");
            this.e.P(this.f2665z0.isEmpty());
            this.e.N(true);
            if (r9Var.h) {
                j3 = (r9Var.Z * ((float) r9Var.f3576h0)) + ((float) j3);
            }
            int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i10 > 0) {
                this.e.L(j3, false);
            }
            c();
            w(true);
            if (r9Var.f3600u && (arrayList = r9Var.v) != null && arrayList.size() == 1 && ((MessageObject) r9Var.v.get(0)).type == 5) {
                z10 = true;
            } else {
                z10 = false;
            }
            me meVar = this.F;
            File file2 = r9Var.Z0;
            if (file2 == null) {
                file2 = r9Var.L;
            }
            meVar.o(z10, file2.getAbsolutePath(), getDuration(), r9Var.P);
            this.F.setVideoLeft(r9Var.Z);
            this.F.setVideoRight(r9Var.f3560a0);
            me meVar2 = this.F;
            if (meVar2 != null && i10 > 0) {
                meVar2.setProgress(j3);
                return;
            }
            return;
        }
        t71 t71Var3 = this.e;
        if (t71Var3 != null) {
            t71Var3.B();
            this.e.H();
            this.e = null;
        }
        d8 d8Var2 = this.H;
        if (d8Var2 != null && d8Var2.f2555g) {
            d8Var2.a(null);
        } else {
            h71 h71Var5 = this.f2647n;
            if (h71Var5 != null) {
                h71Var5.clearAnimation();
                this.f2647n.animate().alpha(0.0f).withEndAction(new b8(this, 6)).start();
            }
        }
        me meVar3 = this.F;
        if (meVar3 != null) {
            meVar3.o(false, null, 1L, 0.0f);
        }
        AndroidUtilities.cancelRunOnUIThread(this.K);
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public final void u(r9 r9Var) {
        Drawable drawable = this.S;
        this.R = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (r9Var == null) {
            this.S = null;
            return;
        }
        long j3 = r9Var.f3610z0;
        if (j3 != Long.MIN_VALUE) {
            Drawable e = e(this.S, r9Var.f3559a, j3, r9Var.f3608y0);
            r9Var.f3606x0 = e;
            this.S = e;
            if (this.R != e) {
                this.R = null;
            }
            if (e != null) {
                e.setCallback(this);
            }
            org.telegram.ui.Components.ia iaVar = this.G;
            if (iaVar != null) {
                Drawable drawable2 = this.S;
                if (drawable2 != null) {
                    if (drawable2 instanceof BitmapDrawable) {
                        iaVar.f(((BitmapDrawable) drawable2).getBitmap(), false);
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
                        iaVar.f(createBitmap, true);
                    }
                } else {
                    iaVar.f(null, false);
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
        PointF pointF;
        boolean z11;
        boolean z12;
        if (this.f2645k0) {
            if (motionEvent.getPointerCount() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            PointF pointF2 = this.m0;
            if (z10) {
                pointF2.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                pointF2.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                f7 = v7.a7.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                d = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
            } else {
                pointF2.x = motionEvent.getX(0);
                pointF2.y = motionEvent.getY(0);
                d = 0.0d;
                f7 = 0.0f;
            }
            boolean z13 = this.f2650p0;
            PointF pointF3 = this.f2646l0;
            if (z13 != z10) {
                pointF3.x = pointF2.x;
                pointF3.y = pointF2.y;
                this.f2648n0 = f7;
                this.f2649o0 = d;
                this.f2650p0 = z10;
            }
            r9 r9Var = this.d;
            if (r9Var != null) {
                float width = r9Var.f3578i0 / getWidth();
                int actionMasked = motionEvent.getActionMasked();
                Matrix matrix = this.f2655s0;
                if (actionMasked == 0) {
                    this.f2657u0 = 0.0f;
                    this.f2658v0 = false;
                    invalidate();
                    this.f2660w0 = true;
                    matrix.set(this.d.f3587n0);
                }
                if (motionEvent.getActionMasked() == 2 && this.f2660w0 && this.d != null) {
                    float f10 = pointF2.x * width;
                    float f11 = pointF2.y * width;
                    float f12 = pointF3.x * width;
                    float f13 = pointF3.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f14 = this.f2648n0;
                        if (f14 != 0.0f) {
                            float f15 = f7 / f14;
                            matrix.postScale(f15, f15, f10, f11);
                        }
                        pointF = pointF2;
                        float degrees = (float) Math.toDegrees(d - this.f2649o0);
                        float f16 = this.f2657u0 + degrees;
                        this.f2657u0 = f16;
                        if (!this.f2653r0) {
                            if (Math.abs(f16) > 20.0f) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.f2653r0 = z11;
                            if (!z11) {
                                d(matrix);
                                if ((Math.round(this.f2637d0 / 90.0f) * 90.0f) - this.f2637d0 > 20.0f) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                this.f2653r0 = z12;
                            }
                            if (!this.f2658v0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.f2658v0 = true;
                            }
                        }
                        if (this.f2653r0) {
                            matrix.postRotate(degrees, f10, f11);
                        }
                        this.f2651q0 = true;
                    } else {
                        pointF = pointF2;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.f2651q0) {
                        matrix.postTranslate(f10 - f12, f11 - f13);
                    }
                    Matrix matrix2 = this.f2656t0;
                    matrix2.set(matrix);
                    Matrix matrix3 = this.W;
                    matrix3.set(matrix);
                    d(matrix3);
                    float round = (Math.round(this.f2637d0 / 90.0f) * 90.0f) - this.f2637d0;
                    if (this.f2653r0) {
                        if (Math.abs(round) < 3.5f) {
                            matrix2.postRotate(round, this.f2634b0, this.f2636c0);
                            if (!this.f2658v0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.f2658v0 = true;
                            }
                        } else {
                            this.f2658v0 = false;
                        }
                    }
                    this.d.f3587n0.set(matrix2);
                    this.d.f3579j = true;
                    b();
                    invalidate();
                } else {
                    pointF = pointF2;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getPointerCount() <= 1) {
                        this.f2651q0 = false;
                        ce ceVar = ((nd) this).C0;
                        ceVar.f2475o1.a(true, false, ceVar.f2457i0);
                        ceVar.f2475o1.b(ceVar.f2439c1.getText());
                    }
                    this.f2660w0 = false;
                    this.f2653r0 = false;
                    this.f2657u0 = 0.0f;
                    this.f2658v0 = false;
                    invalidate();
                }
                PointF pointF4 = pointF;
                pointF3.x = pointF4.x;
                pointF3.y = pointF4.y;
                this.f2648n0 = f7;
                this.f2649o0 = d;
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
        throw new UnsupportedOperationException("Method not decompiled: bi.e8.w(boolean):void");
    }

    public final void x(int i10, boolean z10) {
        HashSet hashSet = this.f2665z0;
        if (z10) {
            hashSet.add(Integer.valueOf(i10));
        } else {
            hashSet.remove(Integer.valueOf(i10));
        }
        t71 t71Var = this.e;
        if (t71Var != null) {
            t71Var.P(hashSet.isEmpty());
        }
        j0 j0Var = this.E;
        if (j0Var != null) {
            j0Var.setPlaying(hashSet.isEmpty());
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
        if (this.f2661x != null && this.d != null) {
            boolean z12 = true;
            if (this.e == null && !j()) {
                this.f2661x.P(this.f2665z0.isEmpty());
                this.f2661x.N(true);
                pg.b2 b2Var = this.f2659w;
                if (b2Var != null && !b2Var.B0) {
                    b2Var.B0 = true;
                    b2Var.C0.f(true, true);
                    b2Var.invalidate();
                }
                long n11 = this.f2661x.n();
                if (z10 && this.f2661x.p() != -9223372036854775807L) {
                    float p5 = ((float) n11) / ((float) this.f2661x.p());
                    r9 r9Var = this.d;
                    if ((p5 < r9Var.f3597s0 || p5 > r9Var.f3599t0) && System.currentTimeMillis() - this.J > 500) {
                        this.J = System.currentTimeMillis();
                        this.f2661x.L(-this.d.f3595r0, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (j()) {
                n10 = this.E.getPositionWithOffset();
                y3 = this.E.f2924q0;
            } else {
                n10 = this.e.n();
                y3 = this.e.y();
            }
            r9 r9Var2 = this.d;
            float f10 = r9Var2.f3599t0;
            float f11 = r9Var2.f3597s0;
            long j3 = (f10 - f11) * ((float) r9Var2.f3593q0);
            long j10 = r9Var2.f3595r0;
            if (n10 >= j10 && n10 <= j3 + j10) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = (y3 && z11) ? false : false;
            long j11 = (n10 - j10) + (f11 * f7);
            pg.b2 b2Var2 = this.f2659w;
            if (b2Var2 != null && b2Var2.B0 != z11) {
                b2Var2.B0 = z11;
                b2Var2.invalidate();
            }
            if (this.f2661x.y() != z12) {
                this.f2661x.P(z12);
                this.f2661x.L(j11, false);
            } else if (z10) {
                long abs = Math.abs(this.f2661x.n() - j11);
                if (j()) {
                    i10 = 300;
                } else {
                    i10 = 120;
                }
                if (abs > i10) {
                    this.f2661x.L(j11, false);
                }
            }
        }
    }
}
