package nh;

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
import org.telegram.ui.Components.ef0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.yb0;
public abstract class f6 extends FrameLayout {
    public static final int f17643x0 = 0;
    public e0 A;
    public qb B;
    public final org.telegram.ui.Components.ga C;
    public final e6 D;
    public long E;
    public long F;
    public final a6 G;
    public final a6 H;
    public final a6 I;
    public g9 J;
    public boolean K;
    public final org.telegram.ui.Components.d6 L;
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
    public Bitmap f17644a;
    public boolean f17645a0;
    public final Rect f17646b;
    public final org.telegram.ui.Components.d6 f17647b0;
    public final Rect f17648c;
    public boolean f17649c0;
    public o7 d;
    public final Matrix f17650d0;
    public x61 f17651e;
    public final Matrix f17652e0;
    public int f17653f;
    public final Matrix f17654f0;
    public boolean f17655g0;
    public int h;
    public final PointF f17656h0;
    public final PointF f17657i0;
    public float f17658j0;
    public double f17659k0;
    public boolean f17660l0;
    public boolean m0;
    public l61 f17661n;
    public boolean f17662n0;
    public final Matrix f17663o0;
    public final Matrix f17664p0;
    public float f17665q0;
    public TextureView f17666r;
    public boolean f17667r0;
    public ef0 f17668s;
    public boolean f17669s0;
    public long f17670t0;
    public Runnable f17671u0;
    public g9 v;
    public final HashSet f17672v0;
    public bg.f3 f17673w;
    public j0 f17674w0;
    public x61 f17675x;
    public x61 f17676y;

    public f6(Context context, org.telegram.ui.Components.ga gaVar, e6 e6Var) {
        super(context);
        this.f17646b = new Rect();
        this.f17648c = new Rect();
        Paint paint = new Paint(1);
        new a6(this, 2);
        this.G = new a6(this, 3);
        this.H = new a6(this, 4);
        this.I = new a6(this, 5);
        this.L = new org.telegram.ui.Components.d6(this, 0L, 350L, jr.h);
        this.M = new Paint(7);
        this.P = new Paint(1);
        this.S = new Matrix();
        this.T = new float[2];
        this.f17645a0 = true;
        this.f17647b0 = new org.telegram.ui.Components.d6(this, 0L, 320L, jr.f29801g);
        this.f17649c0 = false;
        this.f17650d0 = new Matrix();
        this.f17652e0 = new Matrix();
        this.f17654f0 = new Matrix();
        this.f17655g0 = true;
        this.f17656h0 = new PointF();
        this.f17657i0 = new PointF();
        this.f17663o0 = new Matrix();
        this.f17664p0 = new Matrix();
        this.f17672v0 = new HashSet();
        this.C = gaVar;
        this.D = e6Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 1073741824);
    }

    public static void a(nh.f6 r13, nh.o7 r14) {
        throw new UnsupportedOperationException("Method not decompiled: nh.f6.a(nh.f6, nh.o7):void");
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
        throw new UnsupportedOperationException("Method not decompiled: nh.f6.f(android.graphics.drawable.Drawable, int, org.telegram.tgnet.TLRPC$WallPaper, boolean):android.graphics.drawable.Drawable");
    }

    public static Drawable g(int i10, final org.telegram.ui.ActionBar.b4 b4Var, final boolean z10) {
        if (b4Var.m()) {
            org.telegram.ui.ActionBar.g6.H(org.telegram.ui.ActionBar.b4.e(z10), b4Var.h(i10, z10 ? 1 : 0), ((org.telegram.ui.ActionBar.a4) b4Var.f22766f.get(z10 ? 1 : 0)).f22735g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray h = b4Var.h(i10, z10 ? 1 : 0);
        int i11 = org.telegram.ui.ActionBar.g6.Nd;
        int i12 = h.get(i11, org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        int i13 = org.telegram.ui.ActionBar.g6.Od;
        int i14 = h.get(i13, org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        int i15 = org.telegram.ui.ActionBar.g6.Pd;
        int i16 = h.get(i15, org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        int i17 = org.telegram.ui.ActionBar.g6.Qd;
        int i18 = h.get(i17, org.telegram.ui.ActionBar.g6.w0(null, i17, false));
        final yb0 yb0Var = new yb0();
        yb0Var.f35023g = false;
        yb0Var.t(yb0Var.f35036u, b4Var.k(z10 ? 1 : 0).settings.intensity);
        yb0Var.o(i12, i14, i16, i18, 0, true);
        yb0Var.v(0);
        final int f9 = yb0Var.f();
        b4Var.o(z10 ? 1 : 0, new ResultCallback() {
            @Override
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair != null) {
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((of.a) pair.second).f19547b;
                    org.telegram.ui.ActionBar.b4 b4Var2 = org.telegram.ui.ActionBar.b4.this;
                    if (longValue == b4Var2.i(z10 ? 1 : 0) && bitmap != null) {
                        int i19 = b4Var2.k(z10 ? 1 : 0).settings.intensity;
                        yb0 yb0Var2 = yb0Var;
                        yb0Var2.t(bitmap, i19);
                        yb0Var2.u(f9);
                        yb0Var2.s(1.0f);
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
        return yb0Var;
    }

    private void setupCollage(o7 o7Var) {
        ArrayList<o7> arrayList;
        qb qbVar = this.B;
        if (qbVar != null) {
            if (o7Var != null) {
                arrayList = o7Var.T;
            } else {
                arrayList = null;
            }
            qbVar.setCollage(arrayList);
        }
    }

    private void setupImage(o7 o7Var) {
        Utilities.searchQueue.postRunnable(new b6(1, this, o7Var));
    }

    public abstract void b();

    public final void c() {
        float f9;
        float f10;
        o7 o7Var;
        x61 x61Var = this.f17651e;
        float f11 = 0.0f;
        if (x61Var != null) {
            if (!this.K && ((o7Var = this.d) == null || !o7Var.Y)) {
                if (o7Var != null) {
                    f10 = o7Var.P;
                } else {
                    f10 = 1.0f;
                }
            } else {
                f10 = 0.0f;
            }
            x61Var.X(f10);
        }
        x61 x61Var2 = this.f17675x;
        if (x61Var2 != null) {
            if (this.K) {
                f9 = 0.0f;
            } else {
                o7 o7Var2 = this.d;
                if (o7Var2 != null) {
                    f9 = o7Var2.f18297u0;
                } else {
                    f9 = 1.0f;
                }
            }
            x61Var2.X(f9);
        }
        x61 x61Var3 = this.f17676y;
        if (x61Var3 != null) {
            if (!this.K) {
                o7 o7Var3 = this.d;
                if (o7Var3 != null) {
                    f11 = o7Var3.G;
                } else {
                    f11 = 1.0f;
                }
            }
            x61Var3.X(f11);
        }
        e0 e0Var = this.A;
        if (e0Var != null) {
            e0Var.setMuted(this.K);
        }
    }

    public final void d(Matrix matrix) {
        o7 o7Var = this.d;
        if (o7Var == null) {
            return;
        }
        float[] fArr = this.T;
        fArr[0] = o7Var.f18278k0 / 2.0f;
        fArr[1] = o7Var.f18280l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.U = fArr[0];
        this.V = fArr[1];
        o7 o7Var2 = this.d;
        fArr[0] = o7Var2.f18278k0;
        fArr[1] = o7Var2.f18280l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.W = (float) Math.toDegrees(Math.atan2(fArr[1] - this.V, fArr[0] - this.U));
        i7.z5.a(this.U, this.V, fArr[0], fArr[1]);
        o7 o7Var3 = this.d;
        fArr[0] = o7Var3.f18278k0 / 2.0f;
        fArr[1] = o7Var3.f18280l0;
        matrix.mapPoints(fArr);
        i7.z5.a(this.U, this.V, fArr[0], fArr[1]);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        o7 o7Var;
        MediaController.CropState cropState;
        if (this.O != null) {
            float f9 = 0.0f;
            if (this.f17649c0) {
                Path path = new Path();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.O;
            if (!(drawable instanceof yb0) || ((yb0) drawable).f35036u != null) {
                f9 = this.L.d(1.0f, false);
            }
            Drawable drawable2 = this.N;
            if (drawable2 != null && f9 < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - f9) * 255.0f));
                o7.j(canvas, this.N, getWidth(), getHeight());
            }
            this.O.setAlpha((int) (f9 * 255.0f));
            o7.j(canvas, this.O, getWidth(), getHeight());
            if (this.f17649c0) {
                canvas.restore();
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.P);
        }
        j0 j0Var = this.f17674w0;
        if (j0Var != null) {
            j0Var.d.b(canvas2, true);
        } else if (this.f17645a0 && this.d != null && !j()) {
            if (this.f17644a == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e10 = this.f17647b0.e(z10);
            if (this.f17644a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.f18274i0, getHeight() / this.d.f18276j0);
                canvas2.concat(this.d.f18283n0);
                if (this.d.m0 != null) {
                    canvas2.translate(o7Var.f18278k0 / 2.0f, o7Var.f18280l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    o7 o7Var2 = this.d;
                    int i10 = o7Var2.f18278k0;
                    int i11 = o7Var2.f18280l0;
                    int i12 = o7Var2.Q;
                    MediaController.CropState cropState2 = o7Var2.m0;
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
                    o7 o7Var3 = this.d;
                    canvas2.translate((-o7Var3.f18278k0) / 2.0f, (-o7Var3.f18280l0) / 2.0f);
                }
                Paint paint = this.M;
                paint.setAlpha((int) ((1.0f - e10) * 255.0f));
                int width = this.f17644a.getWidth();
                int height = this.f17644a.getHeight();
                Rect rect = this.f17646b;
                rect.set(0, 0, width, height);
                o7 o7Var4 = this.d;
                int i13 = o7Var4.f18278k0;
                int i14 = o7Var4.f18280l0;
                Rect rect2 = this.f17648c;
                rect2.set(0, 0, i13, i14);
                canvas2.drawBitmap(this.f17644a, rect, rect2, paint);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: nh.f6.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        o7 o7Var;
        o7 o7Var2;
        l61 l61Var = this.f17661n;
        if (view == l61Var && (o7Var2 = this.d) != null && o7Var2.f18296u) {
            return false;
        }
        if ((view == l61Var || view == this.f17666r) && (o7Var = this.d) != null && o7Var.m0 != null) {
            canvas.save();
            canvas.scale(getWidth() / this.d.f18274i0, getHeight() / this.d.f18276j0);
            canvas.concat(this.d.f18283n0);
            o7 o7Var3 = this.d;
            if (o7Var3.m0 != null) {
                canvas.translate(o7Var3.f18278k0 / 2.0f, o7Var3.f18280l0 / 2.0f);
                canvas.rotate(-this.d.Q);
                o7 o7Var4 = this.d;
                int i10 = o7Var4.f18278k0;
                int i11 = o7Var4.f18280l0;
                int i12 = o7Var4.Q;
                MediaController.CropState cropState = o7Var4.m0;
                if (((i12 + cropState.transformRotation) / 90) % 2 == 1) {
                    i11 = i10;
                    i10 = i11;
                }
                float f9 = cropState.cropPw;
                float f10 = cropState.cropPh;
                canvas.clipRect(((-i10) * f9) / 2.0f, ((-i11) * f10) / 2.0f, (i10 * f9) / 2.0f, (i11 * f10) / 2.0f);
                canvas.rotate(this.d.Q);
                o7 o7Var5 = this.d;
                canvas.translate((-o7Var5.f18278k0) / 2.0f, (-o7Var5.f18280l0) / 2.0f);
            }
            canvas.concat(this.f17650d0);
            canvas.scale(1.0f / (getWidth() / this.d.f18274i0), 1.0f / (getHeight() / this.d.f18276j0));
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public int getContentHeight() {
        o7 o7Var = this.d;
        if (o7Var == null) {
            return 1;
        }
        return o7Var.f18280l0;
    }

    public int getContentWidth() {
        o7 o7Var = this.d;
        if (o7Var == null) {
            return 1;
        }
        return o7Var.f18278k0;
    }

    public long getCurrentPosition() {
        x61 x61Var = this.f17651e;
        if (x61Var != null) {
            return x61Var.o();
        }
        x61 x61Var2 = this.f17675x;
        if (x61Var2 != null) {
            return x61Var2.o();
        }
        x61 x61Var3 = this.f17676y;
        if (x61Var3 != null) {
            return x61Var3.o();
        }
        return 0L;
    }

    public long getDuration() {
        o7 o7Var = this.d;
        if (o7Var != null) {
            double d = o7Var.f18273i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        x61 x61Var = this.f17651e;
        if (x61Var != null && x61Var.q() != -9223372036854775807L) {
            return this.f17651e.q();
        }
        return 1L;
    }

    public int getOrientation() {
        o7 o7Var = this.d;
        if (o7Var == null) {
            return 0;
        }
        return o7Var.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        if (this.d == null) {
            return new Pair<>(1080, 1920);
        }
        return new Pair<>(Integer.valueOf(this.d.f18274i0), Integer.valueOf(this.d.f18276j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.f17644a;
    }

    public l61 getTextureView() {
        return this.f17661n;
    }

    public final void h(Utilities.Callback callback, View... viewArr) {
        l61 l61Var;
        int dp = (int) (AndroidUtilities.dp(26.0f) * AndroidUtilities.density);
        int dp2 = (int) (AndroidUtilities.dp(30.33f) * AndroidUtilities.density);
        int dp3 = (int) (AndroidUtilities.dp(4.0f) * AndroidUtilities.density);
        Bitmap[] bitmapArr = new Bitmap[viewArr.length];
        for (int i10 = 0; i10 < viewArr.length; i10++) {
            View view = viewArr[i10];
            if (view != null && view.getWidth() >= 0 && viewArr[i10].getHeight() > 0) {
                View view2 = viewArr[i10];
                if (view2 == this && (l61Var = this.f17661n) != null) {
                    bitmapArr[i10] = l61Var.getBitmap();
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
        Utilities.globalQueue.postRunnable(new z5(dp, dp2, dp3, bitmapArr, callback));
    }

    public abstract void i();

    public final boolean j() {
        o7 o7Var;
        if (this.A != null && (o7Var = this.d) != null && o7Var.v()) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        return !this.f17672v0.contains(-9982);
    }

    public final void l(o7 o7Var) {
        this.d = o7Var;
        if (o7Var == null) {
            setupImage(null);
            u(null);
            this.P.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (o7Var.K) {
            setupImage(o7Var);
            if (o7Var.A0 == 0 && o7Var.B0 == 0) {
                o7Var.z(new a6((va) this, 0));
            } else {
                r();
            }
        } else {
            setupImage(o7Var);
            r();
        }
        b();
        u(o7Var);
        p(o7Var, false);
        s(o7Var, null, false);
    }

    public final void m(long j10) {
        x61 x61Var = this.f17651e;
        if (x61Var != null) {
            x61Var.M(j10, false);
        } else if (j()) {
            this.A.m(j10, false);
        } else {
            x61 x61Var2 = this.f17675x;
            if (x61Var2 != null) {
                x61Var2.M(j10, false);
            } else {
                x61 x61Var3 = this.f17676y;
                if (x61Var3 != null) {
                    x61Var3.M(j10, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(o7 o7Var, m9 m9Var, long j10) {
        this.d = o7Var;
        if (o7Var == null) {
            t(null, m9Var, j10);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.P.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (o7Var.v()) {
            setupImage(null);
            t(null, m9Var, j10);
            setupCollage(o7Var);
        } else if (o7Var.K) {
            setupImage(o7Var);
            setupCollage(null);
            t(o7Var, m9Var, j10);
            if (o7Var.A0 == 0 && o7Var.B0 == 0) {
                o7Var.z(new a6(this, 1));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, m9Var, 0L);
            setupImage(o7Var);
            r();
        }
        b();
        u(o7Var);
        p(o7Var, false);
        s(o7Var, null, false);
    }

    public final void o(TextureView textureView, ef0 ef0Var) {
        TextureView textureView2 = this.f17666r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.f17666r = null;
        }
        this.f17668s = ef0Var;
        this.f17666r = textureView;
        if (ef0Var != null) {
            int i10 = this.Q;
            int i11 = this.R;
            qz qzVar = ef0Var.f28034h0;
            if (qzVar != null) {
                qzVar.i(i10, i11);
            } else {
                ef0Var.F0 = i10;
                ef0Var.G0 = i11;
            }
        }
        TextureView textureView3 = this.f17666r;
        if (textureView3 != null) {
            addView(textureView3);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f17655g0) {
            v(motionEvent);
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void p(o7 o7Var, boolean z10) {
        boolean z11;
        String str;
        float f9;
        float f10;
        float f11;
        x61 x61Var = this.f17676y;
        if (x61Var != null) {
            x61Var.C();
            this.f17676y.I();
            this.f17676y = null;
        }
        if (o7Var != null) {
            qb qbVar = this.B;
            boolean z12 = false;
            if (qbVar != null) {
                String str2 = o7Var.f18303y;
                String str3 = o7Var.A;
                String str4 = o7Var.B;
                long j10 = o7Var.C;
                long j11 = o7Var.D;
                float f12 = o7Var.E;
                float f13 = o7Var.F;
                float f14 = o7Var.G;
                if (!TextUtils.equals(qbVar.K, str2)) {
                    jb jbVar = qbVar.T;
                    if (jbVar != null) {
                        jbVar.a();
                        qbVar.T = null;
                        qbVar.Q = false;
                    }
                    qbVar.K = str2;
                    qbVar.p();
                }
                qbVar.K = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                qbVar.J = !isEmpty;
                if (isEmpty) {
                    qbVar.L = false;
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
                if (qbVar.J) {
                    qbVar.N = j10;
                    qbVar.M = j11 - (((float) j10) * f12);
                    qbVar.O = f12;
                    qbVar.P = f13;
                    qbVar.R = f14;
                    float f15 = 0.0f;
                    if (str != null) {
                        StaticLayout staticLayout = new StaticLayout(str, qbVar.H0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        qbVar.I0 = staticLayout;
                        if (staticLayout.getLineCount() > 0) {
                            f10 = qbVar.I0.getLineWidth(0);
                        } else {
                            f10 = 0.0f;
                        }
                        qbVar.J0 = f10;
                        if (qbVar.I0.getLineCount() > 0) {
                            f11 = qbVar.I0.getLineLeft(0);
                        } else {
                            f11 = 0.0f;
                        }
                        qbVar.K0 = f11;
                    } else {
                        qbVar.J0 = 0.0f;
                        qbVar.I0 = null;
                    }
                    if (str4 != null) {
                        StaticLayout staticLayout2 = new StaticLayout(str4, qbVar.L0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        qbVar.M0 = staticLayout2;
                        if (staticLayout2.getLineCount() > 0) {
                            f9 = qbVar.M0.getLineWidth(0);
                        } else {
                            f9 = 0.0f;
                        }
                        qbVar.N0 = f9;
                        if (qbVar.M0.getLineCount() > 0) {
                            f15 = qbVar.M0.getLineLeft(0);
                        }
                        qbVar.O0 = f15;
                    } else {
                        qbVar.N0 = 0.0f;
                        qbVar.M0 = null;
                    }
                }
                if (!z10) {
                    z11 = true;
                    qbVar.f18414a0.f(qbVar.J, true);
                } else {
                    z11 = true;
                }
                qbVar.invalidate();
            } else {
                z11 = true;
            }
            if (o7Var.f18303y != null) {
                x61 x61Var2 = new x61();
                this.f17676y = x61Var2;
                x61Var2.f34643y = z11;
                x61Var2.F = new d6(this, 0);
                x61Var2.E(Uri.fromFile(new File(o7Var.f18303y)), "other");
                c();
                if (this.f17651e != null && getDuration() > 0) {
                    long duration = o7Var.Z * ((float) getDuration());
                    this.f17651e.M(duration, false);
                    this.B.setProgress(duration);
                }
                w(true);
            }
            gb gbVar = ((va) this).f18766y0;
            ja jaVar = gbVar.f17792r1;
            if (jaVar != null) {
                o7 o7Var2 = gbVar.G1;
                if (o7Var2 != null && o7Var2.f18303y != null) {
                    z12 = true;
                }
                jaVar.setHasAudio(z12);
            }
        }
    }

    public final void q(MessageObject messageObject) {
        long j10;
        int maxCount;
        o7 o7Var = this.d;
        if (o7Var != null) {
            o7Var.f18275j = true;
            float f9 = 1.0f;
            if (messageObject != null && messageObject.messageOwner != null) {
                TLRPC.Document document = messageObject.getDocument();
                if (document != null && document.f22398id != 0) {
                    this.d.f18305z = new TLRPC.TL_inputDocument();
                    TLRPC.InputDocument inputDocument = this.d.f18305z;
                    inputDocument.f22404id = document.f22398id;
                    inputDocument.file_reference = document.file_reference;
                    inputDocument.access_hash = document.access_hash;
                }
                int i10 = 0;
                if (!TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                    this.d.f18303y = messageObject.messageOwner.attachPath;
                } else {
                    File pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, false, true);
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, true, true);
                        if (pathToAttach != null && pathToAttach.exists()) {
                            this.d.f18303y = pathToAttach.getAbsolutePath();
                        } else {
                            o7 o7Var2 = this.d;
                            o7Var2.f18303y = null;
                            o7Var2.f18305z = null;
                            o7Var2.A = null;
                            o7Var2.B = null;
                            o7Var2.D = 0L;
                            o7Var2.C = 0L;
                            o7Var2.E = 0.0f;
                            o7Var2.F = 1.0f;
                            return;
                        }
                    }
                    this.d.f18303y = pathToAttach.getAbsolutePath();
                }
                o7 o7Var3 = this.d;
                o7Var3.A = null;
                o7Var3.B = null;
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
                o7 o7Var4 = this.d;
                o7Var4.D = 0L;
                if (o7Var4.K) {
                    o7Var4.D = o7Var4.Z * ((float) getDuration());
                }
                this.d.E = 0.0f;
                if (j()) {
                    ArrayList arrayList2 = this.A.h;
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        o7 o7Var5 = ((d0) obj).f17515n;
                        if (o7Var5 != null && o7Var5.K) {
                            j10 = this.A.getDuration();
                            break;
                        }
                    }
                }
                o7 o7Var6 = this.d;
                if (o7Var6.K) {
                    j10 = getDuration();
                } else {
                    j10 = o7Var6.C;
                }
                qb qbVar = this.B;
                if (qbVar == null) {
                    maxCount = 1;
                } else {
                    maxCount = qbVar.getMaxCount();
                }
                o7 o7Var7 = this.d;
                if (o7Var7.C != 0) {
                    f9 = Math.min(1.0f, ((float) Math.min(j10, maxCount * 59000)) / ((float) this.d.C));
                }
                o7Var7.F = f9;
            } else {
                o7Var.f18303y = null;
                o7Var.f18305z = null;
                o7Var.A = null;
                o7Var.B = null;
                o7Var.D = 0L;
                o7Var.C = 0L;
                o7Var.E = 0.0f;
                o7Var.F = 1.0f;
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
        o7 o7Var = this.d;
        int i11 = o7Var.A0;
        Paint paint = this.P;
        if (i11 != 0 && o7Var.B0 != 0) {
            float f9 = i10;
            o7 o7Var2 = this.d;
            int i12 = o7Var2.A0;
            this.Q = i12;
            int i13 = o7Var2.B0;
            this.R = i13;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f9, new int[]{i12, i13}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            l61 l61Var = this.f17661n;
            if (l61Var != null) {
                int i14 = this.Q;
                int i15 = this.R;
                qz qzVar = l61Var.f30235b;
                if (qzVar == null) {
                    l61Var.f30239n = i14;
                    l61Var.f30240r = i15;
                } else {
                    qzVar.i(i14, i15);
                }
            }
            ef0 ef0Var = this.f17668s;
            if (ef0Var != null) {
                int i16 = this.Q;
                int i17 = this.R;
                qz qzVar2 = ef0Var.f28034h0;
                if (qzVar2 != null) {
                    qzVar2.i(i16, i17);
                } else {
                    ef0Var.F0 = i16;
                    ef0Var.G0 = i17;
                }
            }
        } else {
            Bitmap bitmap = this.f17644a;
            if (bitmap != null) {
                new c6(this, i10, 0).run(n0.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        }
        invalidate();
    }

    public final void s(o7 o7Var, bg.f3 f3Var, boolean z10) {
        x61 x61Var;
        if (o7Var != null && o7Var.f18285o0 != null) {
            x61 x61Var2 = this.f17675x;
            if (x61Var2 != null) {
                x61Var2.I();
                this.f17675x = null;
            }
            x61 x61Var3 = new x61();
            this.f17675x = x61Var3;
            x61Var3.f34643y = true;
            x61Var3.F = new m5.i(this, 28);
            this.f17675x.E(Uri.fromFile(o7Var.f18285o0), "other");
            c();
            this.f17673w = f3Var;
            if (f3Var != null && (x61Var = this.f17675x) != null) {
                x61Var.W(f3Var.f2201q0);
            }
            this.B.n(o7Var.f18285o0.getAbsolutePath(), o7Var.f18289q0, o7Var.f18291r0, o7Var.f18293s0, o7Var.f18295t0, o7Var.f18297u0, z10);
            y(true);
            return;
        }
        x61 x61Var4 = this.f17675x;
        if (x61Var4 != null) {
            x61Var4.C();
            this.f17675x.I();
            this.f17675x = null;
        }
        qb qbVar = this.B;
        if (qbVar != null) {
            qbVar.setRoundNull(z10);
        }
        this.f17673w = null;
        AndroidUtilities.cancelRunOnUIThread(this.G);
    }

    public void set(o7 o7Var) {
        n(o7Var, null, 0L);
    }

    public void setAllowCropping(boolean z10) {
        this.f17655g0 = z10;
    }

    public void setCollageView(e0 e0Var) {
        this.A = e0Var;
    }

    public void setCropEditorDrawing(j0 j0Var) {
        if (this.f17674w0 != j0Var) {
            this.f17674w0 = j0Var;
            invalidate();
        }
    }

    public void setDraw(boolean z10) {
        this.f17645a0 = z10;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.f17671u0 = runnable;
    }

    public void setVideoTimelineView(qb qbVar) {
        this.B = qbVar;
        if (qbVar != null) {
            qbVar.setDelegate(new ha.c(this, 29));
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8) {
            set(null);
        }
    }

    public final void t(o7 o7Var, Runnable runnable, long j10) {
        org.telegram.ui.Components.ga gaVar;
        boolean z10;
        ArrayList arrayList;
        org.telegram.ui.Components.ma maVar;
        float f9 = 0.0f;
        if (o7Var != null && !o7Var.v()) {
            x61 x61Var = this.f17651e;
            if (x61Var != null) {
                x61Var.I();
                this.f17651e = null;
            }
            x61 x61Var2 = new x61();
            this.f17651e = x61Var2;
            x61Var2.f34643y = true;
            x61Var2.F = new l3.g0(this, o7Var, new Runnable[]{runnable}, 10);
            l61 l61Var = this.f17661n;
            if (l61Var != null) {
                l61Var.clearAnimation();
                l61 l61Var2 = this.f17661n;
                qz qzVar = l61Var2.f30235b;
                if (qzVar != null) {
                    qzVar.postRunnable(new nz(qzVar, 0));
                }
                l61Var2.f30234a = null;
                removeView(this.f17661n);
                this.f17661n = null;
            }
            this.f17661n = new l61(getContext(), this.f17651e);
            this.C.e();
            l61 l61Var3 = this.f17661n;
            if (o7Var.f18296u) {
                gaVar = null;
            } else {
                gaVar = this.C;
            }
            l61Var3.f30241s = gaVar;
            qz qzVar2 = l61Var3.f30235b;
            if (qzVar2 != null && (maVar = qzVar2.E) != null) {
                org.telegram.ui.Components.ga gaVar2 = maVar.f30626t;
                if (gaVar2 != null && gaVar2.f28858m != null) {
                    gaVar2.f28858m = null;
                }
                maVar.f30626t = gaVar;
                if (gaVar != null && gaVar.f28858m != maVar) {
                    gaVar.f28858m = maVar;
                    gaVar.d();
                }
            }
            this.f17661n.setOpaque(false);
            b();
            e6 e6Var = this.D;
            if (e6Var != null && e6Var.f17598g) {
                e6Var.a(this.f17661n);
            } else {
                l61 l61Var4 = this.f17661n;
                if (runnable != null) {
                    f9 = 1.0f;
                }
                l61Var4.setAlpha(f9);
                addView(this.f17661n, i7.f6.e(-2, -2, 51));
            }
            b0 b0Var = new b0(this, 5);
            n7 n7Var = o7Var.f18264d1;
            if (n7Var != null) {
                b0Var.run(n7Var);
            } else if (o7Var.K && Build.VERSION.SDK_INT >= 24) {
                Utilities.globalQueue.postRunnable(new j7(o7Var, b0Var, 0));
            } else {
                ?? obj = new Object();
                o7Var.f18264d1 = obj;
                b0Var.run(obj);
            }
            File file = o7Var.Z0;
            if (file == null) {
                file = o7Var.L;
            }
            this.f17651e.E(Uri.fromFile(file), "other");
            this.f17651e.Q(this.f17672v0.isEmpty());
            this.f17651e.O(true);
            if (o7Var.h) {
                j10 = (o7Var.Z * ((float) o7Var.f18272h0)) + ((float) j10);
            }
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 > 0) {
                this.f17651e.M(j10, false);
            }
            c();
            w(true);
            if (o7Var.f18296u && (arrayList = o7Var.v) != null && arrayList.size() == 1 && ((MessageObject) o7Var.v.get(0)).type == 5) {
                z10 = true;
            } else {
                z10 = false;
            }
            qb qbVar = this.B;
            File file2 = o7Var.Z0;
            if (file2 == null) {
                file2 = o7Var.L;
            }
            qbVar.o(z10, file2.getAbsolutePath(), getDuration(), o7Var.P);
            this.B.setVideoLeft(o7Var.Z);
            this.B.setVideoRight(o7Var.f18255a0);
            qb qbVar2 = this.B;
            if (qbVar2 != null && i10 > 0) {
                qbVar2.setProgress(j10);
                return;
            }
            return;
        }
        x61 x61Var3 = this.f17651e;
        if (x61Var3 != null) {
            x61Var3.C();
            this.f17651e.I();
            this.f17651e = null;
        }
        e6 e6Var2 = this.D;
        if (e6Var2 != null && e6Var2.f17598g) {
            e6Var2.a(null);
        } else {
            l61 l61Var5 = this.f17661n;
            if (l61Var5 != null) {
                l61Var5.clearAnimation();
                this.f17661n.animate().alpha(0.0f).withEndAction(new a6(this, 6)).start();
            }
        }
        qb qbVar3 = this.B;
        if (qbVar3 != null) {
            qbVar3.o(false, null, 1L, 0.0f);
        }
        AndroidUtilities.cancelRunOnUIThread(this.G);
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public final void u(o7 o7Var) {
        Drawable drawable = this.O;
        this.N = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (o7Var == null) {
            this.O = null;
            return;
        }
        long j10 = o7Var.f18306z0;
        if (j10 != Long.MIN_VALUE) {
            Drawable e10 = e(this.O, o7Var.f18254a, j10, o7Var.f18304y0);
            o7Var.f18302x0 = e10;
            this.O = e10;
            if (this.N != e10) {
                this.N = null;
            }
            if (e10 != null) {
                e10.setCallback(this);
            }
            org.telegram.ui.Components.ga gaVar = this.C;
            if (gaVar != null) {
                Drawable drawable2 = this.O;
                if (drawable2 != null) {
                    if (drawable2 instanceof BitmapDrawable) {
                        gaVar.f(((BitmapDrawable) drawable2).getBitmap(), false);
                    } else {
                        int intrinsicWidth = drawable2.getIntrinsicWidth();
                        int intrinsicHeight = this.O.getIntrinsicHeight();
                        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                            intrinsicWidth = 1080;
                            intrinsicHeight = 1920;
                        }
                        float f9 = intrinsicWidth;
                        float f10 = intrinsicHeight;
                        float max = Math.max(100.0f / f9, 100.0f / f10);
                        if (max > 1.0f) {
                            intrinsicWidth = (int) (f9 * max);
                            intrinsicHeight = (int) (f10 * max);
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                        this.O.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                        this.O.draw(new Canvas(createBitmap));
                        gaVar.f(createBitmap, true);
                    }
                } else {
                    gaVar.f(null, false);
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
        float f9;
        PointF pointF;
        boolean z11;
        boolean z12;
        if (this.f17655g0) {
            if (motionEvent.getPointerCount() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            PointF pointF2 = this.f17657i0;
            if (z10) {
                pointF2.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                pointF2.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                f9 = i7.z5.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                d = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
            } else {
                pointF2.x = motionEvent.getX(0);
                pointF2.y = motionEvent.getY(0);
                d = 0.0d;
                f9 = 0.0f;
            }
            boolean z13 = this.f17660l0;
            PointF pointF3 = this.f17656h0;
            if (z13 != z10) {
                pointF3.x = pointF2.x;
                pointF3.y = pointF2.y;
                this.f17658j0 = f9;
                this.f17659k0 = d;
                this.f17660l0 = z10;
            }
            o7 o7Var = this.d;
            if (o7Var != null) {
                float width = o7Var.f18274i0 / getWidth();
                int actionMasked = motionEvent.getActionMasked();
                Matrix matrix = this.f17663o0;
                if (actionMasked == 0) {
                    this.f17665q0 = 0.0f;
                    this.f17667r0 = false;
                    invalidate();
                    this.f17669s0 = true;
                    matrix.set(this.d.f18283n0);
                }
                if (motionEvent.getActionMasked() == 2 && this.f17669s0 && this.d != null) {
                    float f10 = pointF2.x * width;
                    float f11 = pointF2.y * width;
                    float f12 = pointF3.x * width;
                    float f13 = pointF3.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f14 = this.f17658j0;
                        if (f14 != 0.0f) {
                            float f15 = f9 / f14;
                            matrix.postScale(f15, f15, f10, f11);
                        }
                        pointF = pointF2;
                        float degrees = (float) Math.toDegrees(d - this.f17659k0);
                        float f16 = this.f17665q0 + degrees;
                        this.f17665q0 = f16;
                        if (!this.f17662n0) {
                            if (Math.abs(f16) > 20.0f) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.f17662n0 = z11;
                            if (!z11) {
                                d(matrix);
                                if ((Math.round(this.W / 90.0f) * 90.0f) - this.W > 20.0f) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                this.f17662n0 = z12;
                            }
                            if (!this.f17667r0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.f17667r0 = true;
                            }
                        }
                        if (this.f17662n0) {
                            matrix.postRotate(degrees, f10, f11);
                        }
                        this.m0 = true;
                    } else {
                        pointF = pointF2;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.m0) {
                        matrix.postTranslate(f10 - f12, f11 - f13);
                    }
                    Matrix matrix2 = this.f17664p0;
                    matrix2.set(matrix);
                    Matrix matrix3 = this.S;
                    matrix3.set(matrix);
                    d(matrix3);
                    float round = (Math.round(this.W / 90.0f) * 90.0f) - this.W;
                    if (this.f17662n0) {
                        if (Math.abs(round) < 3.5f) {
                            matrix2.postRotate(round, this.U, this.V);
                            if (!this.f17667r0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.f17667r0 = true;
                            }
                        } else {
                            this.f17667r0 = false;
                        }
                    }
                    this.d.f18283n0.set(matrix2);
                    this.d.f18275j = true;
                    b();
                    invalidate();
                } else {
                    pointF = pointF2;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getPointerCount() <= 1) {
                        this.m0 = false;
                        gb gbVar = ((va) this).f18766y0;
                        gbVar.f17771k1.a(true, false, gbVar.f17751e0);
                        gbVar.f17771k1.b(gbVar.Y0.getText());
                    }
                    this.f17669s0 = false;
                    this.f17662n0 = false;
                    this.f17665q0 = 0.0f;
                    this.f17667r0 = false;
                    invalidate();
                }
                PointF pointF4 = pointF;
                pointF3.x = pointF4.x;
                pointF3.y = pointF4.y;
                this.f17658j0 = f9;
                this.f17659k0 = d;
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
        throw new UnsupportedOperationException("Method not decompiled: nh.f6.w(boolean):void");
    }

    public final void x(int i10, boolean z10) {
        HashSet hashSet = this.f17672v0;
        if (z10) {
            hashSet.add(Integer.valueOf(i10));
        } else {
            hashSet.remove(Integer.valueOf(i10));
        }
        x61 x61Var = this.f17651e;
        if (x61Var != null) {
            x61Var.Q(hashSet.isEmpty());
        }
        e0 e0Var = this.A;
        if (e0Var != null) {
            e0Var.setPlaying(hashSet.isEmpty());
        }
        w(true);
        y(true);
    }

    public final void y(boolean z10) {
        long o10;
        boolean z11;
        float f9;
        boolean z12;
        int i10;
        if (this.f17675x != null && this.d != null) {
            boolean z13 = true;
            if (this.f17651e == null && !j()) {
                this.f17675x.Q(this.f17672v0.isEmpty());
                this.f17675x.O(true);
                bg.f3 f3Var = this.f17673w;
                if (f3Var != null && !f3Var.f2208x0) {
                    f3Var.f2208x0 = true;
                    f3Var.f2209y0.f(true, true);
                    f3Var.invalidate();
                }
                long o11 = this.f17675x.o();
                if (z10 && this.f17675x.q() != -9223372036854775807L) {
                    float q6 = ((float) o11) / ((float) this.f17675x.q());
                    o7 o7Var = this.d;
                    if ((q6 < o7Var.f18293s0 || q6 > o7Var.f18295t0) && System.currentTimeMillis() - this.F > 500) {
                        this.F = System.currentTimeMillis();
                        this.f17675x.M(-this.d.f18291r0, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (j()) {
                o10 = this.A.getPositionWithOffset();
                z11 = this.A.m0;
            } else {
                o10 = this.f17651e.o();
                z11 = this.f17651e.z();
            }
            o7 o7Var2 = this.d;
            float f10 = o7Var2.f18295t0;
            float f11 = o7Var2.f18293s0;
            long j10 = (f10 - f11) * ((float) o7Var2.f18289q0);
            long j11 = o7Var2.f18291r0;
            if (o10 >= j11 && o10 <= j10 + j11) {
                z12 = true;
            } else {
                z12 = false;
            }
            z13 = (z11 && z12) ? false : false;
            long j12 = (o10 - j11) + (f11 * f9);
            bg.f3 f3Var2 = this.f17673w;
            if (f3Var2 != null && f3Var2.f2208x0 != z12) {
                f3Var2.f2208x0 = z12;
                f3Var2.invalidate();
            }
            if (this.f17675x.z() != z13) {
                this.f17675x.Q(z13);
                this.f17675x.M(j12, false);
            } else if (z10) {
                long abs = Math.abs(this.f17675x.o() - j12);
                if (j()) {
                    i10 = 300;
                } else {
                    i10 = 120;
                }
                if (abs > i10) {
                    this.f17675x.M(j12, false);
                }
            }
        }
    }
}
