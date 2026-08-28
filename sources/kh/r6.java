package kh;

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
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.qe0;
import org.telegram.ui.Components.y51;
public abstract class r6 extends FrameLayout {
    public static final int f15928x0 = 0;
    public f0 A;
    public gc B;
    public final org.telegram.ui.Components.ba C;
    public final q6 D;
    public long E;
    public long F;
    public final o6 G;
    public final o6 H;
    public final o6 I;
    public v9 J;
    public boolean K;
    public final org.telegram.ui.Components.y5 L;
    public final Paint M;
    public Drawable N;
    public Drawable O;
    public final Paint P;
    public int Q;
    public int R;
    public final Matrix S;
    public final float[] T;
    public float U;
    public float V;
    public float W;
    public Bitmap f15929a;
    public boolean f15930a0;
    public final Rect f15931b;
    public final org.telegram.ui.Components.y5 f15932b0;
    public final Rect f15933c;
    public boolean f15934c0;
    public a8 d;
    public final Matrix f15935d0;
    public k61 f15936e;
    public final Matrix f15937e0;
    public int f15938f;
    public final Matrix f15939f0;
    public boolean f15940g0;
    public int h;
    public final PointF f15941h0;
    public final PointF f15942i0;
    public float f15943j0;
    public double f15944k0;
    public boolean f15945l0;
    public boolean m0;
    public y51 f15946n;
    public boolean f15947n0;
    public final Matrix f15948o0;
    public final Matrix f15949p0;
    public float f15950q0;
    public TextureView f15951r;
    public boolean f15952r0;
    public qe0 f15953s;
    public boolean f15954s0;
    public long f15955t0;
    public Runnable f15956u0;
    public v9 v;
    public final HashSet f15957v0;
    public yf.b2 f15958w;
    public k0 f15959w0;
    public k61 f15960x;
    public k61 f15961y;

    public r6(Context context, org.telegram.ui.Components.ba baVar, q6 q6Var) {
        super(context);
        this.f15931b = new Rect();
        this.f15933c = new Rect();
        Paint paint = new Paint(1);
        new o6(this, 2);
        this.G = new o6(this, 3);
        this.H = new o6(this, 4);
        this.I = new o6(this, 5);
        this.L = new org.telegram.ui.Components.y5(this, 0L, 350L, gr.h);
        this.M = new Paint(7);
        this.P = new Paint(1);
        this.S = new Matrix();
        this.T = new float[2];
        this.f15930a0 = true;
        this.f15932b0 = new org.telegram.ui.Components.y5(this, 0L, 320L, gr.f28845g);
        this.f15934c0 = false;
        this.f15935d0 = new Matrix();
        this.f15937e0 = new Matrix();
        this.f15939f0 = new Matrix();
        this.f15940g0 = true;
        this.f15941h0 = new PointF();
        this.f15942i0 = new PointF();
        this.f15948o0 = new Matrix();
        this.f15949p0 = new Matrix();
        this.f15957v0 = new HashSet();
        this.C = baVar;
        this.D = q6Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 1073741824);
    }

    public static void a(kh.r6 r13, kh.a8 r14) {
        throw new UnsupportedOperationException("Method not decompiled: kh.r6.a(kh.r6, kh.a8):void");
    }

    public static Drawable e(Drawable drawable, int i9, long j10, boolean z10) {
        TLRPC.WallPaper wallPaper = null;
        if (j10 == Long.MIN_VALUE) {
            return null;
        }
        if (j10 >= 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i9).getUserFull(j10);
            if (userFull != null) {
                wallPaper = userFull.wallpaper;
            }
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i9).getChatFull(-j10);
            if (chatFull != null) {
                wallPaper = chatFull.wallpaper;
            }
        }
        return f(drawable, i9, wallPaper, z10);
    }

    public static android.graphics.drawable.Drawable f(android.graphics.drawable.Drawable r5, int r6, org.telegram.tgnet.TLRPC.WallPaper r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: kh.r6.f(android.graphics.drawable.Drawable, int, org.telegram.tgnet.TLRPC$WallPaper, boolean):android.graphics.drawable.Drawable");
    }

    public static Drawable g(int i9, final org.telegram.ui.ActionBar.b4 b4Var, final boolean z10) {
        if (b4Var.m()) {
            org.telegram.ui.ActionBar.f6.H(org.telegram.ui.ActionBar.b4.e(z10), b4Var.h(i9, z10 ? 1 : 0), ((org.telegram.ui.ActionBar.a4) b4Var.f22752f.get(z10 ? 1 : 0)).f22719g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray h = b4Var.h(i9, z10 ? 1 : 0);
        int i10 = org.telegram.ui.ActionBar.f6.Nd;
        int i11 = h.get(i10, org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        int i12 = org.telegram.ui.ActionBar.f6.Od;
        int i13 = h.get(i12, org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        int i14 = org.telegram.ui.ActionBar.f6.Pd;
        int i15 = h.get(i14, org.telegram.ui.ActionBar.f6.w0(null, i14, false));
        int i16 = org.telegram.ui.ActionBar.f6.Qd;
        int i17 = h.get(i16, org.telegram.ui.ActionBar.f6.w0(null, i16, false));
        final jb0 jb0Var = new jb0();
        jb0Var.f29695g = false;
        jb0Var.t(jb0Var.f29708u, b4Var.k(z10 ? 1 : 0).settings.intensity);
        jb0Var.o(i11, i13, i15, i17, 0, true);
        jb0Var.v(0);
        final int f10 = jb0Var.f();
        b4Var.o(z10 ? 1 : 0, new ResultCallback() {
            @Override
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair != null) {
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((lf.a) pair.second).f16853b;
                    org.telegram.ui.ActionBar.b4 b4Var2 = org.telegram.ui.ActionBar.b4.this;
                    if (longValue == b4Var2.i(z10 ? 1 : 0) && bitmap != null) {
                        int i18 = b4Var2.k(z10 ? 1 : 0).settings.intensity;
                        jb0 jb0Var2 = jb0Var;
                        jb0Var2.t(bitmap, i18);
                        jb0Var2.u(f10);
                        jb0Var2.s(1.0f);
                    }
                }
            }

            @Override
            public final void onError(Throwable th) {
                org.telegram.tgnet.k.a(this, th);
            }

            @Override
            public final void onError(TLRPC.TL_error tL_error) {
                org.telegram.tgnet.k.b(this, tL_error);
            }
        });
        return jb0Var;
    }

    private void setupCollage(a8 a8Var) {
        ArrayList<a8> arrayList;
        gc gcVar = this.B;
        if (gcVar != null) {
            if (a8Var != null) {
                arrayList = a8Var.T;
            } else {
                arrayList = null;
            }
            gcVar.setCollage(arrayList);
        }
    }

    private void setupImage(a8 a8Var) {
        Utilities.searchQueue.postRunnable(new ih.j7(18, this, a8Var));
    }

    public abstract void b();

    public final void c() {
        float f10;
        float f11;
        a8 a8Var;
        k61 k61Var = this.f15936e;
        float f12 = 0.0f;
        if (k61Var != null) {
            if (!this.K && ((a8Var = this.d) == null || !a8Var.Y)) {
                if (a8Var != null) {
                    f11 = a8Var.P;
                } else {
                    f11 = 1.0f;
                }
            } else {
                f11 = 0.0f;
            }
            k61Var.X(f11);
        }
        k61 k61Var2 = this.f15960x;
        if (k61Var2 != null) {
            if (this.K) {
                f10 = 0.0f;
            } else {
                a8 a8Var2 = this.d;
                if (a8Var2 != null) {
                    f10 = a8Var2.f14944u0;
                } else {
                    f10 = 1.0f;
                }
            }
            k61Var2.X(f10);
        }
        k61 k61Var3 = this.f15961y;
        if (k61Var3 != null) {
            if (!this.K) {
                a8 a8Var3 = this.d;
                if (a8Var3 != null) {
                    f12 = a8Var3.G;
                } else {
                    f12 = 1.0f;
                }
            }
            k61Var3.X(f12);
        }
        f0 f0Var = this.A;
        if (f0Var != null) {
            f0Var.setMuted(this.K);
        }
    }

    public final void d(Matrix matrix) {
        a8 a8Var = this.d;
        if (a8Var == null) {
            return;
        }
        float[] fArr = this.T;
        fArr[0] = a8Var.f14925k0 / 2.0f;
        fArr[1] = a8Var.f14927l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.U = fArr[0];
        this.V = fArr[1];
        a8 a8Var2 = this.d;
        fArr[0] = a8Var2.f14925k0;
        fArr[1] = a8Var2.f14927l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.W = (float) Math.toDegrees(Math.atan2(fArr[1] - this.V, fArr[0] - this.U));
        g7.w.a(this.U, this.V, fArr[0], fArr[1]);
        a8 a8Var3 = this.d;
        fArr[0] = a8Var3.f14925k0 / 2.0f;
        fArr[1] = a8Var3.f14927l0;
        matrix.mapPoints(fArr);
        g7.w.a(this.U, this.V, fArr[0], fArr[1]);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        a8 a8Var;
        MediaController.CropState cropState;
        if (this.O != null) {
            float f10 = 0.0f;
            if (this.f15934c0) {
                Path path = new Path();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.O;
            if (!(drawable instanceof jb0) || ((jb0) drawable).f29708u != null) {
                f10 = this.L.d(1.0f, false);
            }
            Drawable drawable2 = this.N;
            if (drawable2 != null && f10 < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - f10) * 255.0f));
                a8.j(canvas, this.N, getWidth(), getHeight());
            }
            this.O.setAlpha((int) (f10 * 255.0f));
            a8.j(canvas, this.O, getWidth(), getHeight());
            if (this.f15934c0) {
                canvas.restore();
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.P);
        }
        k0 k0Var = this.f15959w0;
        if (k0Var != null) {
            k0Var.d.b(canvas2, true);
        } else if (this.f15930a0 && this.d != null && !j()) {
            if (this.f15929a == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e10 = this.f15932b0.e(z10);
            if (this.f15929a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.f14921i0, getHeight() / this.d.f14923j0);
                canvas2.concat(this.d.f14930n0);
                if (this.d.m0 != null) {
                    canvas2.translate(a8Var.f14925k0 / 2.0f, a8Var.f14927l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    a8 a8Var2 = this.d;
                    int i9 = a8Var2.f14925k0;
                    int i10 = a8Var2.f14927l0;
                    int i11 = a8Var2.Q;
                    MediaController.CropState cropState2 = a8Var2.m0;
                    if (((i11 + cropState2.transformRotation) / 90) % 2 == 1) {
                        i10 = i9;
                        i9 = i10;
                    }
                    float f11 = cropState2.cropPw;
                    float f12 = cropState2.cropPh;
                    float f13 = i9;
                    float f14 = i10;
                    canvas2.clipRect(((-i9) * f11) / 2.0f, ((-i10) * f12) / 2.0f, (f11 * f13) / 2.0f, (f12 * f14) / 2.0f);
                    float f15 = this.d.m0.cropScale;
                    canvas2.scale(f15, f15);
                    MediaController.CropState cropState3 = this.d.m0;
                    canvas2.translate(cropState3.cropPx * f13, cropState3.cropPy * f14);
                    canvas2.rotate(this.d.m0.cropRotate + cropState.transformRotation);
                    if (this.d.m0.mirrored) {
                        canvas2.scale(-1.0f, 1.0f);
                    }
                    canvas2.rotate(this.d.Q);
                    a8 a8Var3 = this.d;
                    canvas2.translate((-a8Var3.f14925k0) / 2.0f, (-a8Var3.f14927l0) / 2.0f);
                }
                Paint paint = this.M;
                paint.setAlpha((int) ((1.0f - e10) * 255.0f));
                int width = this.f15929a.getWidth();
                int height = this.f15929a.getHeight();
                Rect rect = this.f15931b;
                rect.set(0, 0, width, height);
                a8 a8Var4 = this.d;
                int i12 = a8Var4.f14925k0;
                int i13 = a8Var4.f14927l0;
                Rect rect2 = this.f15933c;
                rect2.set(0, 0, i12, i13);
                canvas2.drawBitmap(this.f15929a, rect, rect2, paint);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: kh.r6.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        a8 a8Var;
        a8 a8Var2;
        y51 y51Var = this.f15946n;
        if (view == y51Var && (a8Var2 = this.d) != null && a8Var2.f14943u) {
            return false;
        }
        if ((view == y51Var || view == this.f15951r) && (a8Var = this.d) != null && a8Var.m0 != null) {
            canvas.save();
            canvas.scale(getWidth() / this.d.f14921i0, getHeight() / this.d.f14923j0);
            canvas.concat(this.d.f14930n0);
            a8 a8Var3 = this.d;
            if (a8Var3.m0 != null) {
                canvas.translate(a8Var3.f14925k0 / 2.0f, a8Var3.f14927l0 / 2.0f);
                canvas.rotate(-this.d.Q);
                a8 a8Var4 = this.d;
                int i9 = a8Var4.f14925k0;
                int i10 = a8Var4.f14927l0;
                int i11 = a8Var4.Q;
                MediaController.CropState cropState = a8Var4.m0;
                if (((i11 + cropState.transformRotation) / 90) % 2 == 1) {
                    i10 = i9;
                    i9 = i10;
                }
                float f10 = cropState.cropPw;
                float f11 = cropState.cropPh;
                canvas.clipRect(((-i9) * f10) / 2.0f, ((-i10) * f11) / 2.0f, (i9 * f10) / 2.0f, (i10 * f11) / 2.0f);
                canvas.rotate(this.d.Q);
                a8 a8Var5 = this.d;
                canvas.translate((-a8Var5.f14925k0) / 2.0f, (-a8Var5.f14927l0) / 2.0f);
            }
            canvas.concat(this.f15935d0);
            canvas.scale(1.0f / (getWidth() / this.d.f14921i0), 1.0f / (getHeight() / this.d.f14923j0));
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public int getContentHeight() {
        a8 a8Var = this.d;
        if (a8Var == null) {
            return 1;
        }
        return a8Var.f14927l0;
    }

    public int getContentWidth() {
        a8 a8Var = this.d;
        if (a8Var == null) {
            return 1;
        }
        return a8Var.f14925k0;
    }

    public long getCurrentPosition() {
        k61 k61Var = this.f15936e;
        if (k61Var != null) {
            return k61Var.o();
        }
        k61 k61Var2 = this.f15960x;
        if (k61Var2 != null) {
            return k61Var2.o();
        }
        k61 k61Var3 = this.f15961y;
        if (k61Var3 != null) {
            return k61Var3.o();
        }
        return 0L;
    }

    public long getDuration() {
        a8 a8Var = this.d;
        if (a8Var != null) {
            double d = a8Var.f14920i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        k61 k61Var = this.f15936e;
        if (k61Var != null && k61Var.q() != -9223372036854775807L) {
            return this.f15936e.q();
        }
        return 1L;
    }

    public int getOrientation() {
        a8 a8Var = this.d;
        if (a8Var == null) {
            return 0;
        }
        return a8Var.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        if (this.d == null) {
            return new Pair<>(1080, 1920);
        }
        return new Pair<>(Integer.valueOf(this.d.f14921i0), Integer.valueOf(this.d.f14923j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.f15929a;
    }

    public y51 getTextureView() {
        return this.f15946n;
    }

    public final void h(Utilities.Callback callback, View... viewArr) {
        y51 y51Var;
        int dp = (int) (AndroidUtilities.dp(26.0f) * AndroidUtilities.density);
        int dp2 = (int) (AndroidUtilities.dp(30.33f) * AndroidUtilities.density);
        int dp3 = (int) (AndroidUtilities.dp(4.0f) * AndroidUtilities.density);
        Bitmap[] bitmapArr = new Bitmap[viewArr.length];
        for (int i9 = 0; i9 < viewArr.length; i9++) {
            View view = viewArr[i9];
            if (view != null && view.getWidth() >= 0 && viewArr[i9].getHeight() > 0) {
                View view2 = viewArr[i9];
                if (view2 == this && (y51Var = this.f15946n) != null) {
                    bitmapArr[i9] = y51Var.getBitmap();
                } else if (view2 instanceof TextureView) {
                    bitmapArr[i9] = ((TextureView) view2).getBitmap();
                } else if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0) {
                    bitmapArr[i9] = Bitmap.createBitmap(dp, dp2, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapArr[i9]);
                    canvas.save();
                    float max = Math.max(dp / viewArr[i9].getWidth(), dp2 / viewArr[i9].getHeight());
                    canvas.scale(max, max);
                    viewArr[i9].draw(canvas);
                    canvas.restore();
                }
            }
        }
        Utilities.globalQueue.postRunnable(new n6(dp, dp2, dp3, bitmapArr, callback));
    }

    public abstract void i();

    public final boolean j() {
        a8 a8Var;
        if (this.A != null && (a8Var = this.d) != null && a8Var.v()) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        return !this.f15957v0.contains(-9982);
    }

    public final void l(a8 a8Var) {
        this.d = a8Var;
        if (a8Var == null) {
            setupImage(null);
            u(null);
            this.P.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (a8Var.K) {
            setupImage(a8Var);
            if (a8Var.A0 == 0 && a8Var.B0 == 0) {
                a8Var.z(new o6((kb) this, 0));
            } else {
                r();
            }
        } else {
            setupImage(a8Var);
            r();
        }
        b();
        u(a8Var);
        p(a8Var, false);
        s(a8Var, null, false);
    }

    public final void m(long j10) {
        k61 k61Var = this.f15936e;
        if (k61Var != null) {
            k61Var.M(j10, false);
        } else if (j()) {
            this.A.m(j10, false);
        } else {
            k61 k61Var2 = this.f15960x;
            if (k61Var2 != null) {
                k61Var2.M(j10, false);
            } else {
                k61 k61Var3 = this.f15961y;
                if (k61Var3 != null) {
                    k61Var3.M(j10, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(a8 a8Var, ba baVar, long j10) {
        this.d = a8Var;
        if (a8Var == null) {
            t(null, baVar, j10);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.P.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (a8Var.v()) {
            setupImage(null);
            t(null, baVar, j10);
            setupCollage(a8Var);
        } else if (a8Var.K) {
            setupImage(a8Var);
            setupCollage(null);
            t(a8Var, baVar, j10);
            if (a8Var.A0 == 0 && a8Var.B0 == 0) {
                a8Var.z(new o6(this, 1));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, baVar, 0L);
            setupImage(a8Var);
            r();
        }
        b();
        u(a8Var);
        p(a8Var, false);
        s(a8Var, null, false);
    }

    public final void o(TextureView textureView, qe0 qe0Var) {
        TextureView textureView2 = this.f15951r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.f15951r = null;
        }
        this.f15953s = qe0Var;
        this.f15951r = textureView;
        if (qe0Var != null) {
            int i9 = this.Q;
            int i10 = this.R;
            hz hzVar = qe0Var.f31902h0;
            if (hzVar != null) {
                hzVar.i(i9, i10);
            } else {
                qe0Var.F0 = i9;
                qe0Var.G0 = i10;
            }
        }
        TextureView textureView3 = this.f15951r;
        if (textureView3 != null) {
            addView(textureView3);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f15940g0) {
            v(motionEvent);
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void p(a8 a8Var, boolean z10) {
        boolean z11;
        String str;
        float f10;
        float f11;
        float f12;
        k61 k61Var = this.f15961y;
        if (k61Var != null) {
            k61Var.C();
            this.f15961y.I();
            this.f15961y = null;
        }
        if (a8Var != null) {
            gc gcVar = this.B;
            boolean z12 = false;
            if (gcVar != null) {
                String str2 = a8Var.f14950y;
                String str3 = a8Var.A;
                String str4 = a8Var.B;
                long j10 = a8Var.C;
                long j11 = a8Var.D;
                float f13 = a8Var.E;
                float f14 = a8Var.F;
                float f15 = a8Var.G;
                if (!TextUtils.equals(gcVar.K, str2)) {
                    zb zbVar = gcVar.T;
                    if (zbVar != null) {
                        zbVar.a();
                        gcVar.T = null;
                        gcVar.Q = false;
                    }
                    gcVar.K = str2;
                    gcVar.p();
                }
                gcVar.K = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                gcVar.J = !isEmpty;
                if (isEmpty) {
                    gcVar.L = false;
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
                if (gcVar.J) {
                    gcVar.N = j10;
                    gcVar.M = j11 - (((float) j10) * f13);
                    gcVar.O = f13;
                    gcVar.P = f14;
                    gcVar.R = f15;
                    float f16 = 0.0f;
                    if (str != null) {
                        StaticLayout staticLayout = new StaticLayout(str, gcVar.H0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        gcVar.I0 = staticLayout;
                        if (staticLayout.getLineCount() > 0) {
                            f11 = gcVar.I0.getLineWidth(0);
                        } else {
                            f11 = 0.0f;
                        }
                        gcVar.J0 = f11;
                        if (gcVar.I0.getLineCount() > 0) {
                            f12 = gcVar.I0.getLineLeft(0);
                        } else {
                            f12 = 0.0f;
                        }
                        gcVar.K0 = f12;
                    } else {
                        gcVar.J0 = 0.0f;
                        gcVar.I0 = null;
                    }
                    if (str4 != null) {
                        StaticLayout staticLayout2 = new StaticLayout(str4, gcVar.L0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        gcVar.M0 = staticLayout2;
                        if (staticLayout2.getLineCount() > 0) {
                            f10 = gcVar.M0.getLineWidth(0);
                        } else {
                            f10 = 0.0f;
                        }
                        gcVar.N0 = f10;
                        if (gcVar.M0.getLineCount() > 0) {
                            f16 = gcVar.M0.getLineLeft(0);
                        }
                        gcVar.O0 = f16;
                    } else {
                        gcVar.N0 = 0.0f;
                        gcVar.M0 = null;
                    }
                }
                if (!z10) {
                    z11 = true;
                    gcVar.f15327a0.f(gcVar.J, true);
                } else {
                    z11 = true;
                }
                gcVar.invalidate();
            } else {
                z11 = true;
            }
            if (a8Var.f14950y != null) {
                k61 k61Var2 = new k61();
                this.f15961y = k61Var2;
                k61Var2.f30013y = z11;
                k61Var2.F = new android.support.v4.media.c(this, 22);
                k61Var2.E(Uri.fromFile(new File(a8Var.f14950y)), "other");
                c();
                if (this.f15936e != null && getDuration() > 0) {
                    long duration = a8Var.Z * ((float) getDuration());
                    this.f15936e.M(duration, false);
                    this.B.setProgress(duration);
                }
                w(true);
            }
            wb wbVar = ((kb) this).f15555y0;
            ya yaVar = wbVar.f16302r1;
            if (yaVar != null) {
                a8 a8Var2 = wbVar.G1;
                if (a8Var2 != null && a8Var2.f14950y != null) {
                    z12 = true;
                }
                yaVar.setHasAudio(z12);
            }
        }
    }

    public final void q(MessageObject messageObject) {
        long j10;
        int maxCount;
        a8 a8Var = this.d;
        if (a8Var != null) {
            a8Var.f14922j = true;
            float f10 = 1.0f;
            if (messageObject != null && messageObject.messageOwner != null) {
                TLRPC.Document document = messageObject.getDocument();
                if (document != null && document.f22386id != 0) {
                    this.d.f14952z = new TLRPC.TL_inputDocument();
                    TLRPC.InputDocument inputDocument = this.d.f14952z;
                    inputDocument.f22392id = document.f22386id;
                    inputDocument.file_reference = document.file_reference;
                    inputDocument.access_hash = document.access_hash;
                }
                int i9 = 0;
                if (!TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                    this.d.f14950y = messageObject.messageOwner.attachPath;
                } else {
                    File pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, false, true);
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, true, true);
                        if (pathToAttach != null && pathToAttach.exists()) {
                            this.d.f14950y = pathToAttach.getAbsolutePath();
                        } else {
                            a8 a8Var2 = this.d;
                            a8Var2.f14950y = null;
                            a8Var2.f14952z = null;
                            a8Var2.A = null;
                            a8Var2.B = null;
                            a8Var2.D = 0L;
                            a8Var2.C = 0L;
                            a8Var2.E = 0.0f;
                            a8Var2.F = 1.0f;
                            return;
                        }
                    }
                    this.d.f14950y = pathToAttach.getAbsolutePath();
                }
                a8 a8Var3 = this.d;
                a8Var3.A = null;
                a8Var3.B = null;
                if (document != null) {
                    ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = arrayList.get(i10);
                        i10++;
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
                a8 a8Var4 = this.d;
                a8Var4.D = 0L;
                if (a8Var4.K) {
                    a8Var4.D = a8Var4.Z * ((float) getDuration());
                }
                this.d.E = 0.0f;
                if (j()) {
                    ArrayList arrayList2 = this.A.h;
                    int size2 = arrayList2.size();
                    while (i9 < size2) {
                        Object obj = arrayList2.get(i9);
                        i9++;
                        a8 a8Var5 = ((e0) obj).f15140n;
                        if (a8Var5 != null && a8Var5.K) {
                            j10 = this.A.getDuration();
                            break;
                        }
                    }
                }
                a8 a8Var6 = this.d;
                if (a8Var6.K) {
                    j10 = getDuration();
                } else {
                    j10 = a8Var6.C;
                }
                gc gcVar = this.B;
                if (gcVar == null) {
                    maxCount = 1;
                } else {
                    maxCount = gcVar.getMaxCount();
                }
                a8 a8Var7 = this.d;
                if (a8Var7.C != 0) {
                    f10 = Math.min(1.0f, ((float) Math.min(j10, maxCount * 59000)) / ((float) this.d.C));
                }
                a8Var7.F = f10;
            } else {
                a8Var.f14950y = null;
                a8Var.f14952z = null;
                a8Var.A = null;
                a8Var.B = null;
                a8Var.D = 0L;
                a8Var.C = 0L;
                a8Var.E = 0.0f;
                a8Var.F = 1.0f;
            }
        }
        p(this.d, true);
    }

    public final void r() {
        int i9;
        if (this.d == null) {
            return;
        }
        if (getMeasuredHeight() > 0) {
            i9 = getMeasuredHeight();
        } else {
            i9 = AndroidUtilities.displaySize.y;
        }
        a8 a8Var = this.d;
        int i10 = a8Var.A0;
        Paint paint = this.P;
        if (i10 != 0 && a8Var.B0 != 0) {
            float f10 = i9;
            a8 a8Var2 = this.d;
            int i11 = a8Var2.A0;
            this.Q = i11;
            int i12 = a8Var2.B0;
            this.R = i12;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f10, new int[]{i11, i12}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            y51 y51Var = this.f15946n;
            if (y51Var != null) {
                int i13 = this.Q;
                int i14 = this.R;
                hz hzVar = y51Var.f34862b;
                if (hzVar == null) {
                    y51Var.f34866n = i13;
                    y51Var.f34867r = i14;
                } else {
                    hzVar.i(i13, i14);
                }
            }
            qe0 qe0Var = this.f15953s;
            if (qe0Var != null) {
                int i15 = this.Q;
                int i16 = this.R;
                hz hzVar2 = qe0Var.f31902h0;
                if (hzVar2 != null) {
                    hzVar2.i(i15, i16);
                } else {
                    qe0Var.F0 = i15;
                    qe0Var.G0 = i16;
                }
            }
        } else {
            Bitmap bitmap = this.f15929a;
            if (bitmap != null) {
                new p6(this, i9, 0).run(o0.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        }
        invalidate();
    }

    public final void s(a8 a8Var, yf.b2 b2Var, boolean z10) {
        k61 k61Var;
        if (a8Var != null && a8Var.f14932o0 != null) {
            k61 k61Var2 = this.f15960x;
            if (k61Var2 != null) {
                k61Var2.I();
                this.f15960x = null;
            }
            k61 k61Var3 = new k61();
            this.f15960x = k61Var3;
            k61Var3.f30013y = true;
            k61Var3.F = new fa.c(this, 25);
            this.f15960x.E(Uri.fromFile(a8Var.f14932o0), "other");
            c();
            this.f15958w = b2Var;
            if (b2Var != null && (k61Var = this.f15960x) != null) {
                k61Var.W(b2Var.f49763q0);
            }
            this.B.n(a8Var.f14932o0.getAbsolutePath(), a8Var.f14936q0, a8Var.f14938r0, a8Var.f14940s0, a8Var.f14942t0, a8Var.f14944u0, z10);
            y(true);
            return;
        }
        k61 k61Var4 = this.f15960x;
        if (k61Var4 != null) {
            k61Var4.C();
            this.f15960x.I();
            this.f15960x = null;
        }
        gc gcVar = this.B;
        if (gcVar != null) {
            gcVar.setRoundNull(z10);
        }
        this.f15958w = null;
        AndroidUtilities.cancelRunOnUIThread(this.G);
    }

    public void set(a8 a8Var) {
        n(a8Var, null, 0L);
    }

    public void setAllowCropping(boolean z10) {
        this.f15940g0 = z10;
    }

    public void setCollageView(f0 f0Var) {
        this.A = f0Var;
    }

    public void setCropEditorDrawing(k0 k0Var) {
        if (this.f15959w0 != k0Var) {
            this.f15959w0 = k0Var;
            invalidate();
        }
    }

    public void setDraw(boolean z10) {
        this.f15930a0 = z10;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.f15956u0 = runnable;
    }

    public void setVideoTimelineView(gc gcVar) {
        this.B = gcVar;
        if (gcVar != null) {
            gcVar.setDelegate(new xa.c(this, 24));
        }
    }

    @Override
    public void setVisibility(int i9) {
        super.setVisibility(i9);
        if (i9 == 8) {
            set(null);
        }
    }

    public final void t(a8 a8Var, Runnable runnable, long j10) {
        org.telegram.ui.Components.ba baVar;
        boolean z10;
        ArrayList arrayList;
        org.telegram.ui.Components.ha haVar;
        float f10 = 0.0f;
        if (a8Var != null && !a8Var.v()) {
            k61 k61Var = this.f15936e;
            if (k61Var != null) {
                k61Var.I();
                this.f15936e = null;
            }
            k61 k61Var2 = new k61();
            this.f15936e = k61Var2;
            k61Var2.f30013y = true;
            k61Var2.F = new j4.c(this, a8Var, new Runnable[]{runnable}, 9);
            y51 y51Var = this.f15946n;
            if (y51Var != null) {
                y51Var.clearAnimation();
                y51 y51Var2 = this.f15946n;
                hz hzVar = y51Var2.f34862b;
                if (hzVar != null) {
                    hzVar.postRunnable(new ez(hzVar, 0));
                }
                y51Var2.f34861a = null;
                removeView(this.f15946n);
                this.f15946n = null;
            }
            this.f15946n = new y51(getContext(), this.f15936e);
            this.C.e();
            y51 y51Var3 = this.f15946n;
            if (a8Var.f14943u) {
                baVar = null;
            } else {
                baVar = this.C;
            }
            y51Var3.f34868s = baVar;
            hz hzVar2 = y51Var3.f34862b;
            if (hzVar2 != null && (haVar = hzVar2.E) != null) {
                org.telegram.ui.Components.ba baVar2 = haVar.f29021t;
                if (baVar2 != null && baVar2.f27130m != null) {
                    baVar2.f27130m = null;
                }
                haVar.f29021t = baVar;
                if (baVar != null && baVar.f27130m != haVar) {
                    baVar.f27130m = haVar;
                    baVar.d();
                }
            }
            this.f15946n.setOpaque(false);
            b();
            q6 q6Var = this.D;
            if (q6Var != null && q6Var.f15884g) {
                q6Var.a(this.f15946n);
            } else {
                y51 y51Var4 = this.f15946n;
                if (runnable != null) {
                    f10 = 1.0f;
                }
                y51Var4.setAlpha(f10);
                addView(this.f15946n, g7.e6.e(-2, -2, 51));
            }
            bg.i iVar = new bg.i(this, 28);
            z7 z7Var = a8Var.f14911d1;
            if (z7Var != null) {
                iVar.run(z7Var);
            } else if (a8Var.K && Build.VERSION.SDK_INT >= 24) {
                Utilities.globalQueue.postRunnable(new v7(a8Var, iVar, 0));
            } else {
                ?? obj = new Object();
                a8Var.f14911d1 = obj;
                iVar.run(obj);
            }
            File file = a8Var.Z0;
            if (file == null) {
                file = a8Var.L;
            }
            this.f15936e.E(Uri.fromFile(file), "other");
            this.f15936e.Q(this.f15957v0.isEmpty());
            this.f15936e.O(true);
            if (a8Var.h) {
                j10 = (a8Var.Z * ((float) a8Var.f14919h0)) + ((float) j10);
            }
            int i9 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i9 > 0) {
                this.f15936e.M(j10, false);
            }
            c();
            w(true);
            if (a8Var.f14943u && (arrayList = a8Var.v) != null && arrayList.size() == 1 && ((MessageObject) a8Var.v.get(0)).type == 5) {
                z10 = true;
            } else {
                z10 = false;
            }
            gc gcVar = this.B;
            File file2 = a8Var.Z0;
            if (file2 == null) {
                file2 = a8Var.L;
            }
            gcVar.o(z10, file2.getAbsolutePath(), getDuration(), a8Var.P);
            this.B.setVideoLeft(a8Var.Z);
            this.B.setVideoRight(a8Var.f14902a0);
            gc gcVar2 = this.B;
            if (gcVar2 != null && i9 > 0) {
                gcVar2.setProgress(j10);
                return;
            }
            return;
        }
        k61 k61Var3 = this.f15936e;
        if (k61Var3 != null) {
            k61Var3.C();
            this.f15936e.I();
            this.f15936e = null;
        }
        q6 q6Var2 = this.D;
        if (q6Var2 != null && q6Var2.f15884g) {
            q6Var2.a(null);
        } else {
            y51 y51Var5 = this.f15946n;
            if (y51Var5 != null) {
                y51Var5.clearAnimation();
                this.f15946n.animate().alpha(0.0f).withEndAction(new o6(this, 6)).start();
            }
        }
        gc gcVar3 = this.B;
        if (gcVar3 != null) {
            gcVar3.o(false, null, 1L, 0.0f);
        }
        AndroidUtilities.cancelRunOnUIThread(this.G);
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public final void u(a8 a8Var) {
        Drawable drawable = this.O;
        this.N = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (a8Var == null) {
            this.O = null;
            return;
        }
        long j10 = a8Var.f14953z0;
        if (j10 != Long.MIN_VALUE) {
            Drawable e10 = e(this.O, a8Var.f14901a, j10, a8Var.f14951y0);
            a8Var.f14949x0 = e10;
            this.O = e10;
            if (this.N != e10) {
                this.N = null;
            }
            if (e10 != null) {
                e10.setCallback(this);
            }
            org.telegram.ui.Components.ba baVar = this.C;
            if (baVar != null) {
                Drawable drawable2 = this.O;
                if (drawable2 != null) {
                    if (drawable2 instanceof BitmapDrawable) {
                        baVar.f(((BitmapDrawable) drawable2).getBitmap(), false);
                    } else {
                        int intrinsicWidth = drawable2.getIntrinsicWidth();
                        int intrinsicHeight = this.O.getIntrinsicHeight();
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
                        this.O.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                        this.O.draw(new Canvas(createBitmap));
                        baVar.f(createBitmap, true);
                    }
                } else {
                    baVar.f(null, false);
                }
            }
            invalidate();
            return;
        }
        this.O = null;
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z10;
        double d;
        float f10;
        PointF pointF;
        boolean z11;
        boolean z12;
        if (this.f15940g0) {
            if (motionEvent.getPointerCount() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            PointF pointF2 = this.f15942i0;
            if (z10) {
                pointF2.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                pointF2.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                f10 = g7.w.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                d = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
            } else {
                pointF2.x = motionEvent.getX(0);
                pointF2.y = motionEvent.getY(0);
                d = 0.0d;
                f10 = 0.0f;
            }
            boolean z13 = this.f15945l0;
            PointF pointF3 = this.f15941h0;
            if (z13 != z10) {
                pointF3.x = pointF2.x;
                pointF3.y = pointF2.y;
                this.f15943j0 = f10;
                this.f15944k0 = d;
                this.f15945l0 = z10;
            }
            a8 a8Var = this.d;
            if (a8Var != null) {
                float width = a8Var.f14921i0 / getWidth();
                int actionMasked = motionEvent.getActionMasked();
                Matrix matrix = this.f15948o0;
                if (actionMasked == 0) {
                    this.f15950q0 = 0.0f;
                    this.f15952r0 = false;
                    invalidate();
                    this.f15954s0 = true;
                    matrix.set(this.d.f14930n0);
                }
                if (motionEvent.getActionMasked() == 2 && this.f15954s0 && this.d != null) {
                    float f11 = pointF2.x * width;
                    float f12 = pointF2.y * width;
                    float f13 = pointF3.x * width;
                    float f14 = pointF3.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f15 = this.f15943j0;
                        if (f15 != 0.0f) {
                            float f16 = f10 / f15;
                            matrix.postScale(f16, f16, f11, f12);
                        }
                        pointF = pointF2;
                        float degrees = (float) Math.toDegrees(d - this.f15944k0);
                        float f17 = this.f15950q0 + degrees;
                        this.f15950q0 = f17;
                        if (!this.f15947n0) {
                            if (Math.abs(f17) > 20.0f) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.f15947n0 = z11;
                            if (!z11) {
                                d(matrix);
                                if ((Math.round(this.W / 90.0f) * 90.0f) - this.W > 20.0f) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                this.f15947n0 = z12;
                            }
                            if (!this.f15952r0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.f15952r0 = true;
                            }
                        }
                        if (this.f15947n0) {
                            matrix.postRotate(degrees, f11, f12);
                        }
                        this.m0 = true;
                    } else {
                        pointF = pointF2;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.m0) {
                        matrix.postTranslate(f11 - f13, f12 - f14);
                    }
                    Matrix matrix2 = this.f15949p0;
                    matrix2.set(matrix);
                    Matrix matrix3 = this.S;
                    matrix3.set(matrix);
                    d(matrix3);
                    float round = (Math.round(this.W / 90.0f) * 90.0f) - this.W;
                    if (this.f15947n0) {
                        if (Math.abs(round) < 3.5f) {
                            matrix2.postRotate(round, this.U, this.V);
                            if (!this.f15952r0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.f15952r0 = true;
                            }
                        } else {
                            this.f15952r0 = false;
                        }
                    }
                    this.d.f14930n0.set(matrix2);
                    this.d.f14922j = true;
                    b();
                    invalidate();
                } else {
                    pointF = pointF2;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getPointerCount() <= 1) {
                        this.m0 = false;
                        wb wbVar = ((kb) this).f15555y0;
                        wbVar.f16281k1.a(true, false, wbVar.f16261e0);
                        wbVar.f16281k1.b(wbVar.Y0.getText());
                    }
                    this.f15954s0 = false;
                    this.f15947n0 = false;
                    this.f15950q0 = 0.0f;
                    this.f15952r0 = false;
                    invalidate();
                }
                PointF pointF4 = pointF;
                pointF3.x = pointF4.x;
                pointF3.y = pointF4.y;
                this.f15943j0 = f10;
                this.f15944k0 = d;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.O != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void w(boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: kh.r6.w(boolean):void");
    }

    public final void x(int i9, boolean z10) {
        HashSet hashSet = this.f15957v0;
        if (z10) {
            hashSet.add(Integer.valueOf(i9));
        } else {
            hashSet.remove(Integer.valueOf(i9));
        }
        k61 k61Var = this.f15936e;
        if (k61Var != null) {
            k61Var.Q(hashSet.isEmpty());
        }
        f0 f0Var = this.A;
        if (f0Var != null) {
            f0Var.setPlaying(hashSet.isEmpty());
        }
        w(true);
        y(true);
    }

    public final void y(boolean z10) {
        long o6;
        boolean z11;
        float f10;
        boolean z12;
        int i9;
        if (this.f15960x != null && this.d != null) {
            boolean z13 = true;
            if (this.f15936e == null && !j()) {
                this.f15960x.Q(this.f15957v0.isEmpty());
                this.f15960x.O(true);
                yf.b2 b2Var = this.f15958w;
                if (b2Var != null && !b2Var.f49770x0) {
                    b2Var.f49770x0 = true;
                    b2Var.f49771y0.f(true, true);
                    b2Var.invalidate();
                }
                long o9 = this.f15960x.o();
                if (z10 && this.f15960x.q() != -9223372036854775807L) {
                    float q10 = ((float) o9) / ((float) this.f15960x.q());
                    a8 a8Var = this.d;
                    if ((q10 < a8Var.f14940s0 || q10 > a8Var.f14942t0) && System.currentTimeMillis() - this.F > 500) {
                        this.F = System.currentTimeMillis();
                        this.f15960x.M(-this.d.f14938r0, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (j()) {
                o6 = this.A.getPositionWithOffset();
                z11 = this.A.m0;
            } else {
                o6 = this.f15936e.o();
                z11 = this.f15936e.z();
            }
            a8 a8Var2 = this.d;
            float f11 = a8Var2.f14942t0;
            float f12 = a8Var2.f14940s0;
            long j10 = (f11 - f12) * ((float) a8Var2.f14936q0);
            long j11 = a8Var2.f14938r0;
            if (o6 >= j11 && o6 <= j10 + j11) {
                z12 = true;
            } else {
                z12 = false;
            }
            z13 = (z11 && z12) ? false : false;
            long j12 = (o6 - j11) + (f12 * f10);
            yf.b2 b2Var2 = this.f15958w;
            if (b2Var2 != null && b2Var2.f49770x0 != z12) {
                b2Var2.f49770x0 = z12;
                b2Var2.invalidate();
            }
            if (this.f15960x.z() != z13) {
                this.f15960x.Q(z13);
                this.f15960x.M(j12, false);
            } else if (z10) {
                long abs = Math.abs(this.f15960x.o() - j12);
                if (j()) {
                    i9 = 300;
                } else {
                    i9 = 120;
                }
                if (abs > i9) {
                    this.f15960x.M(j12, false);
                }
            }
        }
    }
}
