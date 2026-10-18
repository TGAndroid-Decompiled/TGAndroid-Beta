package ei;

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
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.wc0;
public abstract class r6 extends FrameLayout {
    public static final int B0 = 0;
    public j0 A0;
    public e0 E;
    public gc F;
    public final org.telegram.ui.Components.ja G;
    public final q6 H;
    public long I;
    public long J;
    public final o6 K;
    public final o6 L;
    public final o6 M;
    public t9 N;
    public boolean O;
    public final org.telegram.ui.Components.f6 P;
    public final Paint Q;
    public Drawable R;
    public Drawable S;
    public final Paint T;
    public int U;
    public int V;
    public final Matrix W;
    public Bitmap f9708a;
    public final float[] f9709a0;
    public final Rect f9710b;
    public float f9711b0;
    public final Rect f9712c;
    public float f9713c0;
    public a8 d;
    public float f9714d0;
    public a81 e;
    public boolean f9715e0;
    public int f9716f;
    public final org.telegram.ui.Components.f6 f9717f0;
    public boolean f9718g0;
    public int h;
    public final Matrix f9719h0;
    public final Matrix f9720i0;
    public final Matrix f9721j0;
    public boolean f9722k0;
    public final PointF f9723l0;
    public final PointF m0;
    public p71 f9724n;
    public float f9725n0;
    public double f9726o0;
    public boolean f9727p0;
    public boolean f9728q0;
    public TextureView f9729r;
    public boolean f9730r0;
    public cg0 f9731s;
    public final Matrix f9732s0;
    public final Matrix f9733t0;
    public float f9734u0;
    public t9 v;
    public boolean f9735v0;
    public rg.b2 f9736w;
    public boolean f9737w0;
    public a81 f9738x;
    public long f9739x0;
    public a81 f9740y;
    public Runnable f9741y0;
    public final HashSet f9742z0;

    public r6(Context context, org.telegram.ui.Components.ja jaVar, q6 q6Var) {
        super(context);
        this.f9710b = new Rect();
        this.f9712c = new Rect();
        Paint paint = new Paint(1);
        new o6(this, 2);
        this.K = new o6(this, 3);
        this.L = new o6(this, 4);
        this.M = new o6(this, 5);
        this.P = new org.telegram.ui.Components.f6(this, 0L, 350L, bs.h);
        this.Q = new Paint(7);
        this.T = new Paint(1);
        this.W = new Matrix();
        this.f9709a0 = new float[2];
        this.f9715e0 = true;
        this.f9717f0 = new org.telegram.ui.Components.f6(this, 0L, 320L, bs.f25038g);
        this.f9718g0 = false;
        this.f9719h0 = new Matrix();
        this.f9720i0 = new Matrix();
        this.f9721j0 = new Matrix();
        this.f9722k0 = true;
        this.f9723l0 = new PointF();
        this.m0 = new PointF();
        this.f9732s0 = new Matrix();
        this.f9733t0 = new Matrix();
        this.f9742z0 = new HashSet();
        this.G = jaVar;
        this.H = q6Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 1073741824);
    }

    public static void a(ei.r6 r13, ei.a8 r14) {
        throw new UnsupportedOperationException("Method not decompiled: ei.r6.a(ei.r6, ei.a8):void");
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
        throw new UnsupportedOperationException("Method not decompiled: ei.r6.f(android.graphics.drawable.Drawable, int, org.telegram.tgnet.TLRPC$WallPaper, boolean):android.graphics.drawable.Drawable");
    }

    public static Drawable g(int i10, final org.telegram.ui.ActionBar.c4 c4Var, final boolean z10) {
        if (c4Var.l()) {
            org.telegram.ui.ActionBar.h6.H(org.telegram.ui.ActionBar.c4.d(z10), c4Var.g(i10, z10 ? 1 : 0), ((org.telegram.ui.ActionBar.b4) c4Var.f20729f.get(z10 ? 1 : 0)).f20699g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray g10 = c4Var.g(i10, z10 ? 1 : 0);
        int i11 = org.telegram.ui.ActionBar.h6.Nd;
        int i12 = g10.get(i11, org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        int i13 = org.telegram.ui.ActionBar.h6.Od;
        int i14 = g10.get(i13, org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        int i15 = org.telegram.ui.ActionBar.h6.Pd;
        int i16 = g10.get(i15, org.telegram.ui.ActionBar.h6.x0(null, i15, false));
        int i17 = org.telegram.ui.ActionBar.h6.Qd;
        int i18 = g10.get(i17, org.telegram.ui.ActionBar.h6.x0(null, i17, false));
        final wc0 wc0Var = new wc0();
        wc0Var.f32095g = false;
        wc0Var.s(wc0Var.f32108u, c4Var.j(z10 ? 1 : 0).settings.intensity);
        wc0Var.o(i12, i14, i16, i18, 0, true);
        wc0Var.u(0);
        final int f7 = wc0Var.f();
        c4Var.n(z10 ? 1 : 0, new ResultCallback() {
            @Override
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair != null) {
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((eg.a) pair.second).f8648b;
                    org.telegram.ui.ActionBar.c4 c4Var2 = org.telegram.ui.ActionBar.c4.this;
                    if (longValue == c4Var2.h(z10 ? 1 : 0) && bitmap != null) {
                        int i19 = c4Var2.j(z10 ? 1 : 0).settings.intensity;
                        wc0 wc0Var2 = wc0Var;
                        wc0Var2.s(bitmap, i19);
                        wc0Var2.t(f7);
                        wc0Var2.r(1.0f);
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
        return wc0Var;
    }

    private void setupCollage(a8 a8Var) {
        ArrayList<a8> arrayList;
        gc gcVar = this.F;
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
        Utilities.searchQueue.postRunnable(new ci.v7(29, this, a8Var));
    }

    public abstract void b();

    public final void c() {
        float f7;
        float f10;
        a8 a8Var;
        a81 a81Var = this.e;
        float f11 = 0.0f;
        if (a81Var != null) {
            if (!this.O && ((a8Var = this.d) == null || !a8Var.Y)) {
                if (a8Var != null) {
                    f10 = a8Var.P;
                } else {
                    f10 = 1.0f;
                }
            } else {
                f10 = 0.0f;
            }
            a81Var.W(f10);
        }
        a81 a81Var2 = this.f9738x;
        if (a81Var2 != null) {
            if (this.O) {
                f7 = 0.0f;
            } else {
                a8 a8Var2 = this.d;
                if (a8Var2 != null) {
                    f7 = a8Var2.f8739u0;
                } else {
                    f7 = 1.0f;
                }
            }
            a81Var2.W(f7);
        }
        a81 a81Var3 = this.f9740y;
        if (a81Var3 != null) {
            if (!this.O) {
                a8 a8Var3 = this.d;
                if (a8Var3 != null) {
                    f11 = a8Var3.G;
                } else {
                    f11 = 1.0f;
                }
            }
            a81Var3.W(f11);
        }
        e0 e0Var = this.E;
        if (e0Var != null) {
            e0Var.setMuted(this.O);
        }
    }

    public final void d(Matrix matrix) {
        a8 a8Var = this.d;
        if (a8Var == null) {
            return;
        }
        float[] fArr = this.f9709a0;
        fArr[0] = a8Var.f8720k0 / 2.0f;
        fArr[1] = a8Var.f8722l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f9711b0 = fArr[0];
        this.f9713c0 = fArr[1];
        a8 a8Var2 = this.d;
        fArr[0] = a8Var2.f8720k0;
        fArr[1] = a8Var2.f8722l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f9714d0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.f9713c0, fArr[0] - this.f9711b0));
        v7.f7.a(this.f9711b0, this.f9713c0, fArr[0], fArr[1]);
        a8 a8Var3 = this.d;
        fArr[0] = a8Var3.f8720k0 / 2.0f;
        fArr[1] = a8Var3.f8722l0;
        matrix.mapPoints(fArr);
        v7.f7.a(this.f9711b0, this.f9713c0, fArr[0], fArr[1]);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        a8 a8Var;
        MediaController.CropState cropState;
        if (this.S != null) {
            float f7 = 0.0f;
            if (this.f9718g0) {
                Path path = new Path();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.S;
            if (!(drawable instanceof wc0) || ((wc0) drawable).f32108u != null) {
                f7 = this.P.d(1.0f, false);
            }
            Drawable drawable2 = this.R;
            if (drawable2 != null && f7 < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - f7) * 255.0f));
                a8.j(canvas, this.R, getWidth(), getHeight());
            }
            this.S.setAlpha((int) (f7 * 255.0f));
            a8.j(canvas, this.S, getWidth(), getHeight());
            if (this.f9718g0) {
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
        } else if (this.f9715e0 && this.d != null && !j()) {
            if (this.f9708a == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e = this.f9717f0.e(z10);
            if (this.f9708a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.f8716i0, getHeight() / this.d.f8718j0);
                canvas2.concat(this.d.f8725n0);
                if (this.d.m0 != null) {
                    canvas2.translate(a8Var.f8720k0 / 2.0f, a8Var.f8722l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    a8 a8Var2 = this.d;
                    int i10 = a8Var2.f8720k0;
                    int i11 = a8Var2.f8722l0;
                    int i12 = a8Var2.Q;
                    MediaController.CropState cropState2 = a8Var2.m0;
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
                    a8 a8Var3 = this.d;
                    canvas2.translate((-a8Var3.f8720k0) / 2.0f, (-a8Var3.f8722l0) / 2.0f);
                }
                Paint paint = this.Q;
                paint.setAlpha((int) ((1.0f - e) * 255.0f));
                int width = this.f9708a.getWidth();
                int height = this.f9708a.getHeight();
                Rect rect = this.f9710b;
                rect.set(0, 0, width, height);
                a8 a8Var4 = this.d;
                int i13 = a8Var4.f8720k0;
                int i14 = a8Var4.f8722l0;
                Rect rect2 = this.f9712c;
                rect2.set(0, 0, i13, i14);
                canvas2.drawBitmap(this.f9708a, rect, rect2, paint);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: ei.r6.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        a8 a8Var;
        a8 a8Var2;
        p71 p71Var = this.f9724n;
        if (view == p71Var && (a8Var2 = this.d) != null && a8Var2.f8738u) {
            return false;
        }
        if ((view == p71Var || view == this.f9729r) && (a8Var = this.d) != null && a8Var.m0 != null) {
            canvas.save();
            canvas.scale(getWidth() / this.d.f8716i0, getHeight() / this.d.f8718j0);
            canvas.concat(this.d.f8725n0);
            a8 a8Var3 = this.d;
            if (a8Var3.m0 != null) {
                canvas.translate(a8Var3.f8720k0 / 2.0f, a8Var3.f8722l0 / 2.0f);
                canvas.rotate(-this.d.Q);
                a8 a8Var4 = this.d;
                int i10 = a8Var4.f8720k0;
                int i11 = a8Var4.f8722l0;
                int i12 = a8Var4.Q;
                MediaController.CropState cropState = a8Var4.m0;
                if (((i12 + cropState.transformRotation) / 90) % 2 == 1) {
                    i11 = i10;
                    i10 = i11;
                }
                float f7 = cropState.cropPw;
                float f10 = cropState.cropPh;
                canvas.clipRect(((-i10) * f7) / 2.0f, ((-i11) * f10) / 2.0f, (i10 * f7) / 2.0f, (i11 * f10) / 2.0f);
                canvas.rotate(this.d.Q);
                a8 a8Var5 = this.d;
                canvas.translate((-a8Var5.f8720k0) / 2.0f, (-a8Var5.f8722l0) / 2.0f);
            }
            canvas.concat(this.f9719h0);
            canvas.scale(1.0f / (getWidth() / this.d.f8716i0), 1.0f / (getHeight() / this.d.f8718j0));
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
        return a8Var.f8722l0;
    }

    public int getContentWidth() {
        a8 a8Var = this.d;
        if (a8Var == null) {
            return 1;
        }
        return a8Var.f8720k0;
    }

    public long getCurrentPosition() {
        a81 a81Var = this.e;
        if (a81Var != null) {
            return a81Var.n();
        }
        a81 a81Var2 = this.f9738x;
        if (a81Var2 != null) {
            return a81Var2.n();
        }
        a81 a81Var3 = this.f9740y;
        if (a81Var3 != null) {
            return a81Var3.n();
        }
        return 0L;
    }

    public long getDuration() {
        a8 a8Var = this.d;
        if (a8Var != null) {
            double d = a8Var.f8715i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        a81 a81Var = this.e;
        if (a81Var != null && a81Var.p() != -9223372036854775807L) {
            return this.e.p();
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
        return new Pair<>(Integer.valueOf(this.d.f8716i0), Integer.valueOf(this.d.f8718j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.f9708a;
    }

    public p71 getTextureView() {
        return this.f9724n;
    }

    public final void h(Utilities.Callback callback, View... viewArr) {
        p71 p71Var;
        int dp = (int) (AndroidUtilities.dp(26.0f) * AndroidUtilities.density);
        int dp2 = (int) (AndroidUtilities.dp(30.33f) * AndroidUtilities.density);
        int dp3 = (int) (AndroidUtilities.dp(4.0f) * AndroidUtilities.density);
        Bitmap[] bitmapArr = new Bitmap[viewArr.length];
        for (int i10 = 0; i10 < viewArr.length; i10++) {
            View view = viewArr[i10];
            if (view != null && view.getWidth() >= 0 && viewArr[i10].getHeight() > 0) {
                View view2 = viewArr[i10];
                if (view2 == this && (p71Var = this.f9724n) != null) {
                    bitmapArr[i10] = p71Var.getBitmap();
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
        Utilities.globalQueue.postRunnable(new n6(dp, dp2, dp3, bitmapArr, callback));
    }

    public abstract void i();

    public final boolean j() {
        a8 a8Var;
        if (this.E != null && (a8Var = this.d) != null && a8Var.v()) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        return !this.f9742z0.contains(-9982);
    }

    public final void l(a8 a8Var) {
        this.d = a8Var;
        if (a8Var == null) {
            setupImage(null);
            u(null);
            this.T.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (a8Var.K) {
            setupImage(a8Var);
            if (a8Var.A0 == 0 && a8Var.B0 == 0) {
                a8Var.z(new o6((jb) this, 0));
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
        a81 a81Var = this.e;
        if (a81Var != null) {
            a81Var.L(j10, false);
        } else if (j()) {
            this.E.m(j10, false);
        } else {
            a81 a81Var2 = this.f9738x;
            if (a81Var2 != null) {
                a81Var2.L(j10, false);
            } else {
                a81 a81Var3 = this.f9740y;
                if (a81Var3 != null) {
                    a81Var3.L(j10, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(a8 a8Var, z9 z9Var, long j10) {
        this.d = a8Var;
        if (a8Var == null) {
            t(null, z9Var, j10);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.T.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (a8Var.v()) {
            setupImage(null);
            t(null, z9Var, j10);
            setupCollage(a8Var);
        } else if (a8Var.K) {
            setupImage(a8Var);
            setupCollage(null);
            t(a8Var, z9Var, j10);
            if (a8Var.A0 == 0 && a8Var.B0 == 0) {
                a8Var.z(new o6(this, 1));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, z9Var, 0L);
            setupImage(a8Var);
            r();
        }
        b();
        u(a8Var);
        p(a8Var, false);
        s(a8Var, null, false);
    }

    public final void o(TextureView textureView, cg0 cg0Var) {
        TextureView textureView2 = this.f9729r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.f9729r = null;
        }
        this.f9731s = cg0Var;
        this.f9729r = textureView;
        if (cg0Var != null) {
            int i10 = this.U;
            int i11 = this.V;
            e00 e00Var = cg0Var.f25226l0;
            if (e00Var != null) {
                e00Var.i(i10, i11);
            } else {
                cg0Var.J0 = i10;
                cg0Var.K0 = i11;
            }
        }
        TextureView textureView3 = this.f9729r;
        if (textureView3 != null) {
            addView(textureView3);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f9722k0) {
            v(motionEvent);
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void p(a8 a8Var, boolean z10) {
        boolean z11;
        String str;
        float f7;
        float f10;
        float f11;
        a81 a81Var = this.f9740y;
        if (a81Var != null) {
            a81Var.B();
            this.f9740y.H();
            this.f9740y = null;
        }
        if (a8Var != null) {
            gc gcVar = this.F;
            boolean z12 = false;
            if (gcVar != null) {
                String str2 = a8Var.f8745y;
                String str3 = a8Var.A;
                String str4 = a8Var.B;
                long j10 = a8Var.C;
                long j11 = a8Var.D;
                float f12 = a8Var.E;
                float f13 = a8Var.F;
                float f14 = a8Var.G;
                if (!TextUtils.equals(gcVar.O, str2)) {
                    yb ybVar = gcVar.f9083a0;
                    if (ybVar != null) {
                        ybVar.a();
                        gcVar.f9083a0 = null;
                        gcVar.U = false;
                    }
                    gcVar.O = str2;
                    gcVar.p();
                }
                gcVar.O = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                gcVar.N = !isEmpty;
                if (isEmpty) {
                    gcVar.P = false;
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
                if (gcVar.N) {
                    gcVar.R = j10;
                    gcVar.Q = j11 - (((float) j10) * f12);
                    gcVar.S = f12;
                    gcVar.T = f13;
                    gcVar.V = f14;
                    float f15 = 0.0f;
                    if (str != null) {
                        StaticLayout staticLayout = new StaticLayout(str, gcVar.L0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        gcVar.M0 = staticLayout;
                        if (staticLayout.getLineCount() > 0) {
                            f10 = gcVar.M0.getLineWidth(0);
                        } else {
                            f10 = 0.0f;
                        }
                        gcVar.N0 = f10;
                        if (gcVar.M0.getLineCount() > 0) {
                            f11 = gcVar.M0.getLineLeft(0);
                        } else {
                            f11 = 0.0f;
                        }
                        gcVar.O0 = f11;
                    } else {
                        gcVar.N0 = 0.0f;
                        gcVar.M0 = null;
                    }
                    if (str4 != null) {
                        StaticLayout staticLayout2 = new StaticLayout(str4, gcVar.P0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        gcVar.Q0 = staticLayout2;
                        if (staticLayout2.getLineCount() > 0) {
                            f7 = gcVar.Q0.getLineWidth(0);
                        } else {
                            f7 = 0.0f;
                        }
                        gcVar.R0 = f7;
                        if (gcVar.Q0.getLineCount() > 0) {
                            f15 = gcVar.Q0.getLineLeft(0);
                        }
                        gcVar.S0 = f15;
                    } else {
                        gcVar.R0 = 0.0f;
                        gcVar.Q0 = null;
                    }
                }
                if (!z10) {
                    z11 = true;
                    gcVar.f9093e0.f(gcVar.N, true);
                } else {
                    z11 = true;
                }
                gcVar.invalidate();
            } else {
                z11 = true;
            }
            if (a8Var.f8745y != null) {
                a81 a81Var2 = new a81();
                this.f9740y = a81Var2;
                a81Var2.f24547y = z11;
                a81Var2.J = new ya.c(this, 16);
                a81Var2.D(Uri.fromFile(new File(a8Var.f8745y)), "other");
                c();
                if (this.e != null && getDuration() > 0) {
                    long duration = a8Var.Z * ((float) getDuration());
                    this.e.L(duration, false);
                    this.F.setProgress(duration);
                }
                z11 = true;
                w(true);
            }
            vb vbVar = ((jb) this).C0;
            xa xaVar = vbVar.f10018v1;
            if (xaVar != null) {
                a8 a8Var2 = vbVar.K1;
                if (a8Var2 != null && a8Var2.f8745y != null) {
                    z12 = z11;
                }
                xaVar.setHasAudio(z12);
            }
        }
    }

    public final void q(MessageObject messageObject) {
        long j10;
        int maxCount;
        a8 a8Var = this.d;
        if (a8Var != null) {
            a8Var.f8717j = true;
            float f7 = 1.0f;
            if (messageObject != null && messageObject.messageOwner != null) {
                TLRPC.Document document = messageObject.getDocument();
                if (document != null && document.f20285id != 0) {
                    this.d.f8747z = new TLRPC.TL_inputDocument();
                    TLRPC.InputDocument inputDocument = this.d.f8747z;
                    inputDocument.f20291id = document.f20285id;
                    inputDocument.file_reference = document.file_reference;
                    inputDocument.access_hash = document.access_hash;
                }
                int i10 = 0;
                if (!TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                    this.d.f8745y = messageObject.messageOwner.attachPath;
                } else {
                    File pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, false, true);
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, true, true);
                        if (pathToAttach != null && pathToAttach.exists()) {
                            this.d.f8745y = pathToAttach.getAbsolutePath();
                        } else {
                            a8 a8Var2 = this.d;
                            a8Var2.f8745y = null;
                            a8Var2.f8747z = null;
                            a8Var2.A = null;
                            a8Var2.B = null;
                            a8Var2.D = 0L;
                            a8Var2.C = 0L;
                            a8Var2.E = 0.0f;
                            a8Var2.F = 1.0f;
                            return;
                        }
                    }
                    this.d.f8745y = pathToAttach.getAbsolutePath();
                }
                a8 a8Var3 = this.d;
                a8Var3.A = null;
                a8Var3.B = null;
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
                a8 a8Var4 = this.d;
                a8Var4.D = 0L;
                if (a8Var4.K) {
                    a8Var4.D = a8Var4.Z * ((float) getDuration());
                }
                this.d.E = 0.0f;
                if (j()) {
                    ArrayList arrayList2 = this.E.h;
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        a8 a8Var5 = ((d0) obj).f8878n;
                        if (a8Var5 != null && a8Var5.K) {
                            j10 = this.E.getDuration();
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
                gc gcVar = this.F;
                if (gcVar == null) {
                    maxCount = 1;
                } else {
                    maxCount = gcVar.getMaxCount();
                }
                a8 a8Var7 = this.d;
                if (a8Var7.C != 0) {
                    f7 = Math.min(1.0f, ((float) Math.min(j10, maxCount * 59000)) / ((float) this.d.C));
                }
                a8Var7.F = f7;
            } else {
                a8Var.f8745y = null;
                a8Var.f8747z = null;
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
        int i10;
        if (this.d == null) {
            return;
        }
        if (getMeasuredHeight() > 0) {
            i10 = getMeasuredHeight();
        } else {
            i10 = AndroidUtilities.displaySize.y;
        }
        a8 a8Var = this.d;
        int i11 = a8Var.A0;
        Paint paint = this.T;
        if (i11 != 0 && a8Var.B0 != 0) {
            float f7 = i10;
            a8 a8Var2 = this.d;
            int i12 = a8Var2.A0;
            this.U = i12;
            int i13 = a8Var2.B0;
            this.V = i13;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f7, new int[]{i12, i13}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            p71 p71Var = this.f9724n;
            if (p71Var != null) {
                int i14 = this.U;
                int i15 = this.V;
                e00 e00Var = p71Var.f29227b;
                if (e00Var == null) {
                    p71Var.f29230n = i14;
                    p71Var.f29231r = i15;
                } else {
                    e00Var.i(i14, i15);
                }
            }
            cg0 cg0Var = this.f9731s;
            if (cg0Var != null) {
                int i16 = this.U;
                int i17 = this.V;
                e00 e00Var2 = cg0Var.f25226l0;
                if (e00Var2 != null) {
                    e00Var2.i(i16, i17);
                } else {
                    cg0Var.J0 = i16;
                    cg0Var.K0 = i17;
                }
            }
        } else {
            Bitmap bitmap = this.f9708a;
            if (bitmap != null) {
                new e4(this, i10, 1).run(n0.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        }
        invalidate();
    }

    public final void s(a8 a8Var, rg.b2 b2Var, boolean z10) {
        a81 a81Var;
        if (a8Var != null && a8Var.f8727o0 != null) {
            a81 a81Var2 = this.f9738x;
            if (a81Var2 != null) {
                a81Var2.H();
                this.f9738x = null;
            }
            a81 a81Var3 = new a81();
            this.f9738x = a81Var3;
            a81Var3.f24547y = true;
            a81Var3.J = new ag.b(this, 16);
            this.f9738x.D(Uri.fromFile(a8Var.f8727o0), "other");
            c();
            this.f9736w = b2Var;
            if (b2Var != null && (a81Var = this.f9738x) != null) {
                a81Var.V(b2Var.f45346u0);
            }
            this.F.n(a8Var.f8727o0.getAbsolutePath(), a8Var.f8731q0, a8Var.f8733r0, a8Var.f8735s0, a8Var.f8737t0, a8Var.f8739u0, z10);
            y(true);
            return;
        }
        a81 a81Var4 = this.f9738x;
        if (a81Var4 != null) {
            a81Var4.B();
            this.f9738x.H();
            this.f9738x = null;
        }
        gc gcVar = this.F;
        if (gcVar != null) {
            gcVar.setRoundNull(z10);
        }
        this.f9736w = null;
        AndroidUtilities.cancelRunOnUIThread(this.K);
    }

    public void set(a8 a8Var) {
        n(a8Var, null, 0L);
    }

    public void setAllowCropping(boolean z10) {
        this.f9722k0 = z10;
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
        this.f9715e0 = z10;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.f9741y0 = runnable;
    }

    public void setVideoTimelineView(gc gcVar) {
        this.F = gcVar;
        if (gcVar != null) {
            gcVar.setDelegate(new a6.i(this, 19));
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8) {
            set(null);
        }
    }

    public final void t(a8 a8Var, Runnable runnable, long j10) {
        org.telegram.ui.Components.ja jaVar;
        boolean z10;
        ArrayList arrayList;
        org.telegram.ui.Components.pa paVar;
        float f7 = 0.0f;
        if (a8Var != null && !a8Var.v()) {
            a81 a81Var = this.e;
            if (a81Var != null) {
                a81Var.H();
                this.e = null;
            }
            a81 a81Var2 = new a81();
            this.e = a81Var2;
            a81Var2.f24547y = true;
            a81Var2.J = new androidx.biometric.e(this, a8Var, new Runnable[]{runnable});
            p71 p71Var = this.f9724n;
            if (p71Var != null) {
                p71Var.clearAnimation();
                p71 p71Var2 = this.f9724n;
                e00 e00Var = p71Var2.f29227b;
                if (e00Var != null) {
                    e00Var.postRunnable(new b00(e00Var, 0));
                }
                p71Var2.f29226a = null;
                removeView(this.f9724n);
                this.f9724n = null;
            }
            this.f9724n = new p71(getContext(), this.e);
            this.G.e();
            p71 p71Var3 = this.f9724n;
            if (a8Var.f8738u) {
                jaVar = null;
            } else {
                jaVar = this.G;
            }
            p71Var3.f29232s = jaVar;
            e00 e00Var2 = p71Var3.f29227b;
            if (e00Var2 != null && (paVar = e00Var2.I) != null) {
                org.telegram.ui.Components.ja jaVar2 = paVar.f29268t;
                if (jaVar2 != null && jaVar2.f27492m != null) {
                    jaVar2.f27492m = null;
                }
                paVar.f29268t = jaVar;
                if (jaVar != null && jaVar.f27492m != paVar) {
                    jaVar.f27492m = paVar;
                    jaVar.d();
                }
            }
            this.f9724n.setOpaque(false);
            b();
            q6 q6Var = this.H;
            if (q6Var != null && q6Var.f9650g) {
                q6Var.a(this.f9724n);
            } else {
                p71 p71Var4 = this.f9724n;
                if (runnable != null) {
                    f7 = 1.0f;
                }
                p71Var4.setAlpha(f7);
                addView(this.f9724n, w7.z5.e(-2, -2, 51));
            }
            ai.r0 r0Var = new ai.r0(this, 19);
            z7 z7Var = a8Var.f8707d1;
            if (z7Var != null) {
                r0Var.run(z7Var);
            } else if (a8Var.K && Build.VERSION.SDK_INT >= 24) {
                Utilities.globalQueue.postRunnable(new v7(a8Var, r0Var, 0));
            } else {
                ?? obj = new Object();
                a8Var.f8707d1 = obj;
                r0Var.run(obj);
            }
            File file = a8Var.Z0;
            if (file == null) {
                file = a8Var.L;
            }
            this.e.D(Uri.fromFile(file), "other");
            this.e.P(this.f9742z0.isEmpty());
            this.e.N(true);
            if (a8Var.h) {
                j10 = (a8Var.Z * ((float) a8Var.f8714h0)) + ((float) j10);
            }
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 > 0) {
                this.e.L(j10, false);
            }
            c();
            w(true);
            if (a8Var.f8738u && (arrayList = a8Var.v) != null && arrayList.size() == 1 && ((MessageObject) a8Var.v.get(0)).type == 5) {
                z10 = true;
            } else {
                z10 = false;
            }
            gc gcVar = this.F;
            File file2 = a8Var.Z0;
            if (file2 == null) {
                file2 = a8Var.L;
            }
            gcVar.o(z10, file2.getAbsolutePath(), getDuration(), a8Var.P);
            this.F.setVideoLeft(a8Var.Z);
            this.F.setVideoRight(a8Var.f8698a0);
            gc gcVar2 = this.F;
            if (gcVar2 != null && i10 > 0) {
                gcVar2.setProgress(j10);
                return;
            }
            return;
        }
        a81 a81Var3 = this.e;
        if (a81Var3 != null) {
            a81Var3.B();
            this.e.H();
            this.e = null;
        }
        q6 q6Var2 = this.H;
        if (q6Var2 != null && q6Var2.f9650g) {
            q6Var2.a(null);
        } else {
            p71 p71Var5 = this.f9724n;
            if (p71Var5 != null) {
                p71Var5.clearAnimation();
                this.f9724n.animate().alpha(0.0f).withEndAction(new o6(this, 6)).start();
            }
        }
        gc gcVar3 = this.F;
        if (gcVar3 != null) {
            gcVar3.o(false, null, 1L, 0.0f);
        }
        AndroidUtilities.cancelRunOnUIThread(this.K);
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public final void u(a8 a8Var) {
        Drawable drawable = this.S;
        this.R = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (a8Var == null) {
            this.S = null;
            return;
        }
        long j10 = a8Var.f8748z0;
        if (j10 != Long.MIN_VALUE) {
            Drawable e = e(this.S, a8Var.f8697a, j10, a8Var.f8746y0);
            a8Var.f8744x0 = e;
            this.S = e;
            if (this.R != e) {
                this.R = null;
            }
            if (e != null) {
                e.setCallback(this);
            }
            org.telegram.ui.Components.ja jaVar = this.G;
            if (jaVar != null) {
                Drawable drawable2 = this.S;
                if (drawable2 != null) {
                    if (drawable2 instanceof BitmapDrawable) {
                        jaVar.f(((BitmapDrawable) drawable2).getBitmap(), false);
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
                        jaVar.f(createBitmap, true);
                    }
                } else {
                    jaVar.f(null, false);
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
        a8 a8Var;
        PointF pointF;
        boolean z11;
        boolean z12;
        if (this.f9722k0) {
            if (motionEvent.getPointerCount() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            PointF pointF2 = this.m0;
            if (z10) {
                pointF2.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                pointF2.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                f7 = v7.f7.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                d = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
            } else {
                pointF2.x = motionEvent.getX(0);
                pointF2.y = motionEvent.getY(0);
                d = 0.0d;
                f7 = 0.0f;
            }
            boolean z13 = this.f9727p0;
            PointF pointF3 = this.f9723l0;
            if (z13 != z10) {
                pointF3.x = pointF2.x;
                pointF3.y = pointF2.y;
                this.f9725n0 = f7;
                this.f9726o0 = d;
                this.f9727p0 = z10;
            }
            if (this.d != null) {
                float width = a8Var.f8716i0 / getWidth();
                int actionMasked = motionEvent.getActionMasked();
                Matrix matrix = this.f9732s0;
                if (actionMasked == 0) {
                    this.f9734u0 = 0.0f;
                    this.f9735v0 = false;
                    invalidate();
                    this.f9737w0 = true;
                    matrix.set(this.d.f8725n0);
                }
                if (motionEvent.getActionMasked() == 2 && this.f9737w0 && this.d != null) {
                    float f10 = pointF2.x * width;
                    float f11 = pointF2.y * width;
                    float f12 = pointF3.x * width;
                    float f13 = pointF3.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f14 = this.f9725n0;
                        if (f14 != 0.0f) {
                            float f15 = f7 / f14;
                            matrix.postScale(f15, f15, f10, f11);
                        }
                        pointF = pointF2;
                        float degrees = (float) Math.toDegrees(d - this.f9726o0);
                        float f16 = this.f9734u0 + degrees;
                        this.f9734u0 = f16;
                        if (!this.f9730r0) {
                            if (Math.abs(f16) > 20.0f) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.f9730r0 = z11;
                            if (!z11) {
                                d(matrix);
                                if ((Math.round(this.f9714d0 / 90.0f) * 90.0f) - this.f9714d0 > 20.0f) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                this.f9730r0 = z12;
                            }
                            if (!this.f9735v0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.f9735v0 = true;
                            }
                        }
                        if (this.f9730r0) {
                            matrix.postRotate(degrees, f10, f11);
                        }
                        this.f9728q0 = true;
                    } else {
                        pointF = pointF2;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.f9728q0) {
                        matrix.postTranslate(f10 - f12, f11 - f13);
                    }
                    Matrix matrix2 = this.f9733t0;
                    matrix2.set(matrix);
                    Matrix matrix3 = this.W;
                    matrix3.set(matrix);
                    d(matrix3);
                    float round = (Math.round(this.f9714d0 / 90.0f) * 90.0f) - this.f9714d0;
                    if (this.f9730r0) {
                        if (Math.abs(round) < 3.5f) {
                            matrix2.postRotate(round, this.f9711b0, this.f9713c0);
                            if (!this.f9735v0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.f9735v0 = true;
                            }
                        } else {
                            this.f9735v0 = false;
                        }
                    }
                    this.d.f8725n0.set(matrix2);
                    this.d.f8717j = true;
                    b();
                    invalidate();
                } else {
                    pointF = pointF2;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getPointerCount() <= 1) {
                        this.f9728q0 = false;
                        vb vbVar = ((jb) this).C0;
                        vbVar.f9995o1.a(true, false, vbVar.f9977i0);
                        vbVar.f9995o1.b(vbVar.f9959c1.getText());
                    }
                    this.f9737w0 = false;
                    this.f9730r0 = false;
                    this.f9734u0 = 0.0f;
                    this.f9735v0 = false;
                    invalidate();
                }
                PointF pointF4 = pointF;
                pointF3.x = pointF4.x;
                pointF3.y = pointF4.y;
                this.f9725n0 = f7;
                this.f9726o0 = d;
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
        throw new UnsupportedOperationException("Method not decompiled: ei.r6.w(boolean):void");
    }

    public final void x(int i10, boolean z10) {
        HashSet hashSet = this.f9742z0;
        if (z10) {
            hashSet.add(Integer.valueOf(i10));
        } else {
            hashSet.remove(Integer.valueOf(i10));
        }
        a81 a81Var = this.e;
        if (a81Var != null) {
            a81Var.P(hashSet.isEmpty());
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
        if (this.f9738x != null && this.d != null) {
            boolean z12 = true;
            if (this.e == null && !j()) {
                this.f9738x.P(this.f9742z0.isEmpty());
                this.f9738x.N(true);
                rg.b2 b2Var = this.f9736w;
                if (b2Var != null && !b2Var.B0) {
                    b2Var.B0 = true;
                    b2Var.C0.f(true, true);
                    b2Var.invalidate();
                }
                long n11 = this.f9738x.n();
                if (z10 && this.f9738x.p() != -9223372036854775807L) {
                    float p5 = ((float) n11) / ((float) this.f9738x.p());
                    a8 a8Var = this.d;
                    if ((p5 < a8Var.f8735s0 || p5 > a8Var.f8737t0) && System.currentTimeMillis() - this.J > 500) {
                        this.J = System.currentTimeMillis();
                        this.f9738x.L(-this.d.f8733r0, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (j()) {
                n10 = this.E.getPositionWithOffset();
                y3 = this.E.f8939q0;
            } else {
                n10 = this.e.n();
                y3 = this.e.y();
            }
            a8 a8Var2 = this.d;
            float f10 = a8Var2.f8737t0;
            float f11 = a8Var2.f8735s0;
            long j10 = (f10 - f11) * ((float) a8Var2.f8731q0);
            long j11 = a8Var2.f8733r0;
            if (n10 >= j11 && n10 <= j10 + j11) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!y3 || !z11) {
                z12 = false;
            }
            long j12 = (n10 - j11) + (f11 * f7);
            rg.b2 b2Var2 = this.f9736w;
            if (b2Var2 != null && b2Var2.B0 != z11) {
                b2Var2.B0 = z11;
                b2Var2.invalidate();
            }
            if (this.f9738x.y() != z12) {
                this.f9738x.P(z12);
                this.f9738x.L(j12, false);
            } else if (z10) {
                long abs = Math.abs(this.f9738x.n() - j12);
                if (j()) {
                    i10 = 300;
                } else {
                    i10 = 120;
                }
                if (abs > i10) {
                    this.f9738x.L(j12, false);
                }
            }
        }
    }
}
