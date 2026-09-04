package di;

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
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.vz;
public abstract class d7 extends FrameLayout {
    public static final int B0 = 0;
    public j0 A0;
    public e0 E;
    public zc F;
    public final org.telegram.ui.Components.ja G;
    public final c7 H;
    public long I;
    public long J;
    public final z6 K;
    public final z6 L;
    public final z6 M;
    public ka N;
    public boolean O;
    public final org.telegram.ui.Components.e6 P;
    public final Paint Q;
    public Drawable R;
    public Drawable S;
    public final Paint T;
    public int U;
    public int V;
    public final Matrix W;
    public Bitmap f7068a;
    public final float[] f7069a0;
    public final Rect f7070b;
    public float f7071b0;
    public final Rect f7072c;
    public float f7073c0;
    public o8 d;
    public float f7074d0;
    public g71 f7075e;
    public boolean f7076e0;
    public int f7077f;
    public final org.telegram.ui.Components.e6 f7078f0;
    public boolean f7079g0;
    public int h;
    public final Matrix f7080h0;
    public final Matrix f7081i0;
    public final Matrix f7082j0;
    public boolean f7083k0;
    public final PointF f7084l0;
    public final PointF m0;
    public u61 f7085n;
    public float f7086n0;
    public double f7087o0;
    public boolean f7088p0;
    public boolean f7089q0;
    public TextureView f7090r;
    public boolean f7091r0;
    public jf0 f7092s;
    public final Matrix f7093s0;
    public final Matrix f7094t0;
    public float f7095u0;
    public ka v;
    public boolean f7096v0;
    public rg.d2 f7097w;
    public boolean f7098w0;
    public g71 f7099x;
    public long f7100x0;
    public g71 f7101y;
    public Runnable f7102y0;
    public final HashSet f7103z0;

    public d7(Context context, org.telegram.ui.Components.ja jaVar, c7 c7Var) {
        super(context);
        this.f7070b = new Rect();
        this.f7072c = new Rect();
        Paint paint = new Paint(1);
        new z6(this, 2);
        this.K = new z6(this, 3);
        this.L = new z6(this, 4);
        this.M = new z6(this, 5);
        this.P = new org.telegram.ui.Components.e6(this, 0L, 350L, pr.h);
        this.Q = new Paint(7);
        this.T = new Paint(1);
        this.W = new Matrix();
        this.f7069a0 = new float[2];
        this.f7076e0 = true;
        this.f7078f0 = new org.telegram.ui.Components.e6(this, 0L, 320L, pr.f29467g);
        this.f7079g0 = false;
        this.f7080h0 = new Matrix();
        this.f7081i0 = new Matrix();
        this.f7082j0 = new Matrix();
        this.f7083k0 = true;
        this.f7084l0 = new PointF();
        this.m0 = new PointF();
        this.f7093s0 = new Matrix();
        this.f7094t0 = new Matrix();
        this.f7103z0 = new HashSet();
        this.G = jaVar;
        this.H = c7Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 1073741824);
    }

    public static void a(di.d7 r13, di.o8 r14) {
        throw new UnsupportedOperationException("Method not decompiled: di.d7.a(di.d7, di.o8):void");
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
        throw new UnsupportedOperationException("Method not decompiled: di.d7.f(android.graphics.drawable.Drawable, int, org.telegram.tgnet.TLRPC$WallPaper, boolean):android.graphics.drawable.Drawable");
    }

    public static Drawable g(int i10, final org.telegram.ui.ActionBar.d4 d4Var, final boolean z10) {
        if (d4Var.m()) {
            org.telegram.ui.ActionBar.j6.H(org.telegram.ui.ActionBar.d4.e(z10), d4Var.h(i10, z10 ? 1 : 0), ((org.telegram.ui.ActionBar.c4) d4Var.f20365f.get(z10 ? 1 : 0)).f20321g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray h = d4Var.h(i10, z10 ? 1 : 0);
        int i11 = org.telegram.ui.ActionBar.j6.Nd;
        int i12 = h.get(i11, org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        int i13 = org.telegram.ui.ActionBar.j6.Od;
        int i14 = h.get(i13, org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        int i15 = org.telegram.ui.ActionBar.j6.Pd;
        int i16 = h.get(i15, org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        int i17 = org.telegram.ui.ActionBar.j6.Qd;
        int i18 = h.get(i17, org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        final dc0 dc0Var = new dc0();
        dc0Var.f25350g = false;
        dc0Var.t(dc0Var.f25363u, d4Var.k(z10 ? 1 : 0).settings.intensity);
        dc0Var.o(i12, i14, i16, i18, 0, true);
        dc0Var.v(0);
        final int f7 = dc0Var.f();
        d4Var.o(z10 ? 1 : 0, new ResultCallback() {
            @Override
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair != null) {
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((dg.a) pair.second).f6808b;
                    org.telegram.ui.ActionBar.d4 d4Var2 = org.telegram.ui.ActionBar.d4.this;
                    if (longValue == d4Var2.i(z10 ? 1 : 0) && bitmap != null) {
                        int i19 = d4Var2.k(z10 ? 1 : 0).settings.intensity;
                        dc0 dc0Var2 = dc0Var;
                        dc0Var2.t(bitmap, i19);
                        dc0Var2.u(f7);
                        dc0Var2.s(1.0f);
                    }
                }
            }

            @Override
            public final void onError(Throwable th2) {
                org.telegram.tgnet.l.a(this, th2);
            }

            @Override
            public final void onError(TLRPC.TL_error tL_error) {
                org.telegram.tgnet.l.b(this, tL_error);
            }
        });
        return dc0Var;
    }

    private void setupCollage(o8 o8Var) {
        ArrayList<o8> arrayList;
        zc zcVar = this.F;
        if (zcVar != null) {
            if (o8Var != null) {
                arrayList = o8Var.T;
            } else {
                arrayList = null;
            }
            zcVar.setCollage(arrayList);
        }
    }

    private void setupImage(o8 o8Var) {
        Utilities.searchQueue.postRunnable(new bi.s8(29, this, o8Var));
    }

    public abstract void b();

    public final void c() {
        float f7;
        float f10;
        o8 o8Var;
        g71 g71Var = this.f7075e;
        float f11 = 0.0f;
        if (g71Var != null) {
            if (!this.O && ((o8Var = this.d) == null || !o8Var.Y)) {
                if (o8Var != null) {
                    f10 = o8Var.P;
                } else {
                    f10 = 1.0f;
                }
            } else {
                f10 = 0.0f;
            }
            g71Var.W(f10);
        }
        g71 g71Var2 = this.f7099x;
        if (g71Var2 != null) {
            if (this.O) {
                f7 = 0.0f;
            } else {
                o8 o8Var2 = this.d;
                if (o8Var2 != null) {
                    f7 = o8Var2.f7783u0;
                } else {
                    f7 = 1.0f;
                }
            }
            g71Var2.W(f7);
        }
        g71 g71Var3 = this.f7101y;
        if (g71Var3 != null) {
            if (!this.O) {
                o8 o8Var3 = this.d;
                if (o8Var3 != null) {
                    f11 = o8Var3.G;
                } else {
                    f11 = 1.0f;
                }
            }
            g71Var3.W(f11);
        }
        e0 e0Var = this.E;
        if (e0Var != null) {
            e0Var.setMuted(this.O);
        }
    }

    public final void d(Matrix matrix) {
        o8 o8Var = this.d;
        if (o8Var == null) {
            return;
        }
        float[] fArr = this.f7069a0;
        fArr[0] = o8Var.f7764k0 / 2.0f;
        fArr[1] = o8Var.f7766l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f7071b0 = fArr[0];
        this.f7073c0 = fArr[1];
        o8 o8Var2 = this.d;
        fArr[0] = o8Var2.f7764k0;
        fArr[1] = o8Var2.f7766l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f7074d0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.f7073c0, fArr[0] - this.f7071b0));
        v7.z6.a(this.f7071b0, this.f7073c0, fArr[0], fArr[1]);
        o8 o8Var3 = this.d;
        fArr[0] = o8Var3.f7764k0 / 2.0f;
        fArr[1] = o8Var3.f7766l0;
        matrix.mapPoints(fArr);
        v7.z6.a(this.f7071b0, this.f7073c0, fArr[0], fArr[1]);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        o8 o8Var;
        MediaController.CropState cropState;
        if (this.S != null) {
            float f7 = 0.0f;
            if (this.f7079g0) {
                Path path = new Path();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.S;
            if (!(drawable instanceof dc0) || ((dc0) drawable).f25363u != null) {
                f7 = this.P.d(1.0f, false);
            }
            Drawable drawable2 = this.R;
            if (drawable2 != null && f7 < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - f7) * 255.0f));
                o8.j(canvas, this.R, getWidth(), getHeight());
            }
            this.S.setAlpha((int) (f7 * 255.0f));
            o8.j(canvas, this.S, getWidth(), getHeight());
            if (this.f7079g0) {
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
        } else if (this.f7076e0 && this.d != null && !j()) {
            if (this.f7068a == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e7 = this.f7078f0.e(z10);
            if (this.f7068a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.f7760i0, getHeight() / this.d.f7762j0);
                canvas2.concat(this.d.f7769n0);
                if (this.d.m0 != null) {
                    canvas2.translate(o8Var.f7764k0 / 2.0f, o8Var.f7766l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    o8 o8Var2 = this.d;
                    int i10 = o8Var2.f7764k0;
                    int i11 = o8Var2.f7766l0;
                    int i12 = o8Var2.Q;
                    MediaController.CropState cropState2 = o8Var2.m0;
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
                    o8 o8Var3 = this.d;
                    canvas2.translate((-o8Var3.f7764k0) / 2.0f, (-o8Var3.f7766l0) / 2.0f);
                }
                Paint paint = this.Q;
                paint.setAlpha((int) ((1.0f - e7) * 255.0f));
                int width = this.f7068a.getWidth();
                int height = this.f7068a.getHeight();
                Rect rect = this.f7070b;
                rect.set(0, 0, width, height);
                o8 o8Var4 = this.d;
                int i13 = o8Var4.f7764k0;
                int i14 = o8Var4.f7766l0;
                Rect rect2 = this.f7072c;
                rect2.set(0, 0, i13, i14);
                canvas2.drawBitmap(this.f7068a, rect, rect2, paint);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: di.d7.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        o8 o8Var;
        o8 o8Var2;
        u61 u61Var = this.f7085n;
        if (view == u61Var && (o8Var2 = this.d) != null && o8Var2.f7782u) {
            return false;
        }
        if ((view == u61Var || view == this.f7090r) && (o8Var = this.d) != null && o8Var.m0 != null) {
            canvas.save();
            canvas.scale(getWidth() / this.d.f7760i0, getHeight() / this.d.f7762j0);
            canvas.concat(this.d.f7769n0);
            o8 o8Var3 = this.d;
            if (o8Var3.m0 != null) {
                canvas.translate(o8Var3.f7764k0 / 2.0f, o8Var3.f7766l0 / 2.0f);
                canvas.rotate(-this.d.Q);
                o8 o8Var4 = this.d;
                int i10 = o8Var4.f7764k0;
                int i11 = o8Var4.f7766l0;
                int i12 = o8Var4.Q;
                MediaController.CropState cropState = o8Var4.m0;
                if (((i12 + cropState.transformRotation) / 90) % 2 == 1) {
                    i11 = i10;
                    i10 = i11;
                }
                float f7 = cropState.cropPw;
                float f10 = cropState.cropPh;
                canvas.clipRect(((-i10) * f7) / 2.0f, ((-i11) * f10) / 2.0f, (i10 * f7) / 2.0f, (i11 * f10) / 2.0f);
                canvas.rotate(this.d.Q);
                o8 o8Var5 = this.d;
                canvas.translate((-o8Var5.f7764k0) / 2.0f, (-o8Var5.f7766l0) / 2.0f);
            }
            canvas.concat(this.f7080h0);
            canvas.scale(1.0f / (getWidth() / this.d.f7760i0), 1.0f / (getHeight() / this.d.f7762j0));
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public int getContentHeight() {
        o8 o8Var = this.d;
        if (o8Var == null) {
            return 1;
        }
        return o8Var.f7766l0;
    }

    public int getContentWidth() {
        o8 o8Var = this.d;
        if (o8Var == null) {
            return 1;
        }
        return o8Var.f7764k0;
    }

    public long getCurrentPosition() {
        g71 g71Var = this.f7075e;
        if (g71Var != null) {
            return g71Var.n();
        }
        g71 g71Var2 = this.f7099x;
        if (g71Var2 != null) {
            return g71Var2.n();
        }
        g71 g71Var3 = this.f7101y;
        if (g71Var3 != null) {
            return g71Var3.n();
        }
        return 0L;
    }

    public long getDuration() {
        o8 o8Var = this.d;
        if (o8Var != null) {
            double d = o8Var.f7759i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        g71 g71Var = this.f7075e;
        if (g71Var != null && g71Var.p() != -9223372036854775807L) {
            return this.f7075e.p();
        }
        return 1L;
    }

    public int getOrientation() {
        o8 o8Var = this.d;
        if (o8Var == null) {
            return 0;
        }
        return o8Var.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        if (this.d == null) {
            return new Pair<>(1080, 1920);
        }
        return new Pair<>(Integer.valueOf(this.d.f7760i0), Integer.valueOf(this.d.f7762j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.f7068a;
    }

    public u61 getTextureView() {
        return this.f7085n;
    }

    public final void h(Utilities.Callback callback, View... viewArr) {
        u61 u61Var;
        int dp = (int) (AndroidUtilities.dp(26.0f) * AndroidUtilities.density);
        int dp2 = (int) (AndroidUtilities.dp(30.33f) * AndroidUtilities.density);
        int dp3 = (int) (AndroidUtilities.dp(4.0f) * AndroidUtilities.density);
        Bitmap[] bitmapArr = new Bitmap[viewArr.length];
        for (int i10 = 0; i10 < viewArr.length; i10++) {
            View view = viewArr[i10];
            if (view != null && view.getWidth() >= 0 && viewArr[i10].getHeight() > 0) {
                View view2 = viewArr[i10];
                if (view2 == this && (u61Var = this.f7085n) != null) {
                    bitmapArr[i10] = u61Var.getBitmap();
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
        Utilities.globalQueue.postRunnable(new x6(dp, dp2, dp3, bitmapArr, callback));
    }

    public abstract void i();

    public final boolean j() {
        o8 o8Var;
        if (this.E != null && (o8Var = this.d) != null && o8Var.v()) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        return !this.f7103z0.contains(-9982);
    }

    public final void l(o8 o8Var) {
        this.d = o8Var;
        if (o8Var == null) {
            setupImage(null);
            u(null);
            this.T.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (o8Var.K) {
            setupImage(o8Var);
            if (o8Var.A0 == 0 && o8Var.B0 == 0) {
                o8Var.z(new z6((dc) this, 0));
            } else {
                r();
            }
        } else {
            setupImage(o8Var);
            r();
        }
        b();
        u(o8Var);
        p(o8Var, false);
        s(o8Var, null, false);
    }

    public final void m(long j3) {
        g71 g71Var = this.f7075e;
        if (g71Var != null) {
            g71Var.L(j3, false);
        } else if (j()) {
            this.E.m(j3, false);
        } else {
            g71 g71Var2 = this.f7099x;
            if (g71Var2 != null) {
                g71Var2.L(j3, false);
            } else {
                g71 g71Var3 = this.f7101y;
                if (g71Var3 != null) {
                    g71Var3.L(j3, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(o8 o8Var, qa qaVar, long j3) {
        this.d = o8Var;
        if (o8Var == null) {
            t(null, qaVar, j3);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.T.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (o8Var.v()) {
            setupImage(null);
            t(null, qaVar, j3);
            setupCollage(o8Var);
        } else if (o8Var.K) {
            setupImage(o8Var);
            setupCollage(null);
            t(o8Var, qaVar, j3);
            if (o8Var.A0 == 0 && o8Var.B0 == 0) {
                o8Var.z(new z6(this, 1));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, qaVar, 0L);
            setupImage(o8Var);
            r();
        }
        b();
        u(o8Var);
        p(o8Var, false);
        s(o8Var, null, false);
    }

    public final void o(TextureView textureView, jf0 jf0Var) {
        TextureView textureView2 = this.f7090r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.f7090r = null;
        }
        this.f7092s = jf0Var;
        this.f7090r = textureView;
        if (jf0Var != null) {
            int i10 = this.U;
            int i11 = this.V;
            vz vzVar = jf0Var.f27483l0;
            if (vzVar != null) {
                vzVar.i(i10, i11);
            } else {
                jf0Var.J0 = i10;
                jf0Var.K0 = i11;
            }
        }
        TextureView textureView3 = this.f7090r;
        if (textureView3 != null) {
            addView(textureView3);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f7083k0) {
            v(motionEvent);
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void p(o8 o8Var, boolean z10) {
        boolean z11;
        String str;
        float f7;
        float f10;
        float f11;
        g71 g71Var = this.f7101y;
        if (g71Var != null) {
            g71Var.B();
            this.f7101y.H();
            this.f7101y = null;
        }
        if (o8Var != null) {
            zc zcVar = this.F;
            boolean z12 = false;
            if (zcVar != null) {
                String str2 = o8Var.f7789y;
                String str3 = o8Var.A;
                String str4 = o8Var.B;
                long j3 = o8Var.C;
                long j10 = o8Var.D;
                float f12 = o8Var.E;
                float f13 = o8Var.F;
                float f14 = o8Var.G;
                if (!TextUtils.equals(zcVar.O, str2)) {
                    sc scVar = zcVar.f8536a0;
                    if (scVar != null) {
                        scVar.a();
                        zcVar.f8536a0 = null;
                        zcVar.U = false;
                    }
                    zcVar.O = str2;
                    zcVar.p();
                }
                zcVar.O = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                zcVar.N = !isEmpty;
                if (isEmpty) {
                    zcVar.P = false;
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
                if (zcVar.N) {
                    zcVar.R = j3;
                    zcVar.Q = j10 - (((float) j3) * f12);
                    zcVar.S = f12;
                    zcVar.T = f13;
                    zcVar.V = f14;
                    float f15 = 0.0f;
                    if (str != null) {
                        StaticLayout staticLayout = new StaticLayout(str, zcVar.L0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        zcVar.M0 = staticLayout;
                        if (staticLayout.getLineCount() > 0) {
                            f10 = zcVar.M0.getLineWidth(0);
                        } else {
                            f10 = 0.0f;
                        }
                        zcVar.N0 = f10;
                        if (zcVar.M0.getLineCount() > 0) {
                            f11 = zcVar.M0.getLineLeft(0);
                        } else {
                            f11 = 0.0f;
                        }
                        zcVar.O0 = f11;
                    } else {
                        zcVar.N0 = 0.0f;
                        zcVar.M0 = null;
                    }
                    if (str4 != null) {
                        StaticLayout staticLayout2 = new StaticLayout(str4, zcVar.P0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        zcVar.Q0 = staticLayout2;
                        if (staticLayout2.getLineCount() > 0) {
                            f7 = zcVar.Q0.getLineWidth(0);
                        } else {
                            f7 = 0.0f;
                        }
                        zcVar.R0 = f7;
                        if (zcVar.Q0.getLineCount() > 0) {
                            f15 = zcVar.Q0.getLineLeft(0);
                        }
                        zcVar.S0 = f15;
                    } else {
                        zcVar.R0 = 0.0f;
                        zcVar.Q0 = null;
                    }
                }
                if (!z10) {
                    z11 = true;
                    zcVar.f8547e0.f(zcVar.N, true);
                } else {
                    z11 = true;
                }
                zcVar.invalidate();
            } else {
                z11 = true;
            }
            if (o8Var.f7789y != null) {
                g71 g71Var2 = new g71();
                this.f7101y = g71Var2;
                g71Var2.f26317y = z11;
                g71Var2.J = new a6.i(this, 16);
                g71Var2.D(Uri.fromFile(new File(o8Var.f7789y)), "other");
                c();
                if (this.f7075e != null && getDuration() > 0) {
                    long duration = o8Var.Z * ((float) getDuration());
                    this.f7075e.L(duration, false);
                    this.F.setProgress(duration);
                }
                w(true);
            }
            pc pcVar = ((dc) this).C0;
            rb rbVar = pcVar.f7910v1;
            if (rbVar != null) {
                o8 o8Var2 = pcVar.K1;
                if (o8Var2 != null && o8Var2.f7789y != null) {
                    z12 = true;
                }
                rbVar.setHasAudio(z12);
            }
        }
    }

    public final void q(MessageObject messageObject) {
        long j3;
        int maxCount;
        o8 o8Var = this.d;
        if (o8Var != null) {
            o8Var.f7761j = true;
            float f7 = 1.0f;
            if (messageObject != null && messageObject.messageOwner != null) {
                TLRPC.Document document = messageObject.getDocument();
                if (document != null && document.f19875id != 0) {
                    this.d.f7791z = new TLRPC.TL_inputDocument();
                    TLRPC.InputDocument inputDocument = this.d.f7791z;
                    inputDocument.f19881id = document.f19875id;
                    inputDocument.file_reference = document.file_reference;
                    inputDocument.access_hash = document.access_hash;
                }
                int i10 = 0;
                if (!TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                    this.d.f7789y = messageObject.messageOwner.attachPath;
                } else {
                    File pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, false, true);
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, true, true);
                        if (pathToAttach != null && pathToAttach.exists()) {
                            this.d.f7789y = pathToAttach.getAbsolutePath();
                        } else {
                            o8 o8Var2 = this.d;
                            o8Var2.f7789y = null;
                            o8Var2.f7791z = null;
                            o8Var2.A = null;
                            o8Var2.B = null;
                            o8Var2.D = 0L;
                            o8Var2.C = 0L;
                            o8Var2.E = 0.0f;
                            o8Var2.F = 1.0f;
                            return;
                        }
                    }
                    this.d.f7789y = pathToAttach.getAbsolutePath();
                }
                o8 o8Var3 = this.d;
                o8Var3.A = null;
                o8Var3.B = null;
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
                o8 o8Var4 = this.d;
                o8Var4.D = 0L;
                if (o8Var4.K) {
                    o8Var4.D = o8Var4.Z * ((float) getDuration());
                }
                this.d.E = 0.0f;
                if (j()) {
                    ArrayList arrayList2 = this.E.h;
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        o8 o8Var5 = ((d0) obj).f7036n;
                        if (o8Var5 != null && o8Var5.K) {
                            j3 = this.E.getDuration();
                            break;
                        }
                    }
                }
                o8 o8Var6 = this.d;
                if (o8Var6.K) {
                    j3 = getDuration();
                } else {
                    j3 = o8Var6.C;
                }
                zc zcVar = this.F;
                if (zcVar == null) {
                    maxCount = 1;
                } else {
                    maxCount = zcVar.getMaxCount();
                }
                o8 o8Var7 = this.d;
                if (o8Var7.C != 0) {
                    f7 = Math.min(1.0f, ((float) Math.min(j3, maxCount * 59000)) / ((float) this.d.C));
                }
                o8Var7.F = f7;
            } else {
                o8Var.f7789y = null;
                o8Var.f7791z = null;
                o8Var.A = null;
                o8Var.B = null;
                o8Var.D = 0L;
                o8Var.C = 0L;
                o8Var.E = 0.0f;
                o8Var.F = 1.0f;
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
        o8 o8Var = this.d;
        int i11 = o8Var.A0;
        Paint paint = this.T;
        if (i11 != 0 && o8Var.B0 != 0) {
            float f7 = i10;
            o8 o8Var2 = this.d;
            int i12 = o8Var2.A0;
            this.U = i12;
            int i13 = o8Var2.B0;
            this.V = i13;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f7, new int[]{i12, i13}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            u61 u61Var = this.f7085n;
            if (u61Var != null) {
                int i14 = this.U;
                int i15 = this.V;
                vz vzVar = u61Var.f30821b;
                if (vzVar == null) {
                    u61Var.f30825n = i14;
                    u61Var.f30826r = i15;
                } else {
                    vzVar.i(i14, i15);
                }
            }
            jf0 jf0Var = this.f7092s;
            if (jf0Var != null) {
                int i16 = this.U;
                int i17 = this.V;
                vz vzVar2 = jf0Var.f27483l0;
                if (vzVar2 != null) {
                    vzVar2.i(i16, i17);
                } else {
                    jf0Var.J0 = i16;
                    jf0Var.K0 = i17;
                }
            }
        } else {
            Bitmap bitmap = this.f7068a;
            if (bitmap != null) {
                new a7(this, i10, 0).run(n0.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        }
        invalidate();
    }

    public final void s(o8 o8Var, rg.d2 d2Var, boolean z10) {
        g71 g71Var;
        if (o8Var != null && o8Var.f7771o0 != null) {
            g71 g71Var2 = this.f7099x;
            if (g71Var2 != null) {
                g71Var2.H();
                this.f7099x = null;
            }
            g71 g71Var3 = new g71();
            this.f7099x = g71Var3;
            g71Var3.f26317y = true;
            g71Var3.J = new a6.m(this, 16);
            this.f7099x.D(Uri.fromFile(o8Var.f7771o0), "other");
            c();
            this.f7097w = d2Var;
            if (d2Var != null && (g71Var = this.f7099x) != null) {
                g71Var.V(d2Var.f45164u0);
            }
            this.F.n(o8Var.f7771o0.getAbsolutePath(), o8Var.f7775q0, o8Var.f7777r0, o8Var.f7779s0, o8Var.f7781t0, o8Var.f7783u0, z10);
            y(true);
            return;
        }
        g71 g71Var4 = this.f7099x;
        if (g71Var4 != null) {
            g71Var4.B();
            this.f7099x.H();
            this.f7099x = null;
        }
        zc zcVar = this.F;
        if (zcVar != null) {
            zcVar.setRoundNull(z10);
        }
        this.f7097w = null;
        AndroidUtilities.cancelRunOnUIThread(this.K);
    }

    public void set(o8 o8Var) {
        n(o8Var, null, 0L);
    }

    public void setAllowCropping(boolean z10) {
        this.f7083k0 = z10;
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
        this.f7076e0 = z10;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.f7102y0 = runnable;
    }

    public void setVideoTimelineView(zc zcVar) {
        this.F = zcVar;
        if (zcVar != null) {
            zcVar.setDelegate(new a4.m(this, 16));
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8) {
            set(null);
        }
    }

    public final void t(o8 o8Var, Runnable runnable, long j3) {
        org.telegram.ui.Components.ja jaVar;
        boolean z10;
        ArrayList arrayList;
        org.telegram.ui.Components.pa paVar;
        float f7 = 0.0f;
        if (o8Var != null && !o8Var.v()) {
            g71 g71Var = this.f7075e;
            if (g71Var != null) {
                g71Var.H();
                this.f7075e = null;
            }
            g71 g71Var2 = new g71();
            this.f7075e = g71Var2;
            g71Var2.f26317y = true;
            g71Var2.J = new aa.a(this, o8Var, new Runnable[]{runnable});
            u61 u61Var = this.f7085n;
            if (u61Var != null) {
                u61Var.clearAnimation();
                u61 u61Var2 = this.f7085n;
                vz vzVar = u61Var2.f30821b;
                if (vzVar != null) {
                    vzVar.postRunnable(new sz(vzVar, 0));
                }
                u61Var2.f30820a = null;
                removeView(this.f7085n);
                this.f7085n = null;
            }
            this.f7085n = new u61(getContext(), this.f7075e);
            this.G.e();
            u61 u61Var3 = this.f7085n;
            if (o8Var.f7782u) {
                jaVar = null;
            } else {
                jaVar = this.G;
            }
            u61Var3.f30827s = jaVar;
            vz vzVar2 = u61Var3.f30821b;
            if (vzVar2 != null && (paVar = vzVar2.I) != null) {
                org.telegram.ui.Components.ja jaVar2 = paVar.f29341t;
                if (jaVar2 != null && jaVar2.f27417m != null) {
                    jaVar2.f27417m = null;
                }
                paVar.f29341t = jaVar;
                if (jaVar != null && jaVar.f27417m != paVar) {
                    jaVar.f27417m = paVar;
                    jaVar.d();
                }
            }
            this.f7085n.setOpaque(false);
            b();
            c7 c7Var = this.H;
            if (c7Var != null && c7Var.f6994g) {
                c7Var.a(this.f7085n);
            } else {
                u61 u61Var4 = this.f7085n;
                if (runnable != null) {
                    f7 = 1.0f;
                }
                u61Var4.setAlpha(f7);
                addView(this.f7085n, w7.x5.e(-2, -2, 51));
            }
            bi.o1 o1Var = new bi.o1(this, 11);
            n8 n8Var = o8Var.f7750d1;
            if (n8Var != null) {
                o1Var.run(n8Var);
            } else if (o8Var.K && Build.VERSION.SDK_INT >= 24) {
                Utilities.globalQueue.postRunnable(new j8(o8Var, o1Var, 0));
            } else {
                ?? obj = new Object();
                o8Var.f7750d1 = obj;
                o1Var.run(obj);
            }
            File file = o8Var.Z0;
            if (file == null) {
                file = o8Var.L;
            }
            this.f7075e.D(Uri.fromFile(file), "other");
            this.f7075e.P(this.f7103z0.isEmpty());
            this.f7075e.N(true);
            if (o8Var.h) {
                j3 = (o8Var.Z * ((float) o8Var.f7758h0)) + ((float) j3);
            }
            int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i10 > 0) {
                this.f7075e.L(j3, false);
            }
            c();
            w(true);
            if (o8Var.f7782u && (arrayList = o8Var.v) != null && arrayList.size() == 1 && ((MessageObject) o8Var.v.get(0)).type == 5) {
                z10 = true;
            } else {
                z10 = false;
            }
            zc zcVar = this.F;
            File file2 = o8Var.Z0;
            if (file2 == null) {
                file2 = o8Var.L;
            }
            zcVar.o(z10, file2.getAbsolutePath(), getDuration(), o8Var.P);
            this.F.setVideoLeft(o8Var.Z);
            this.F.setVideoRight(o8Var.f7741a0);
            zc zcVar2 = this.F;
            if (zcVar2 != null && i10 > 0) {
                zcVar2.setProgress(j3);
                return;
            }
            return;
        }
        g71 g71Var3 = this.f7075e;
        if (g71Var3 != null) {
            g71Var3.B();
            this.f7075e.H();
            this.f7075e = null;
        }
        c7 c7Var2 = this.H;
        if (c7Var2 != null && c7Var2.f6994g) {
            c7Var2.a(null);
        } else {
            u61 u61Var5 = this.f7085n;
            if (u61Var5 != null) {
                u61Var5.clearAnimation();
                this.f7085n.animate().alpha(0.0f).withEndAction(new z6(this, 6)).start();
            }
        }
        zc zcVar3 = this.F;
        if (zcVar3 != null) {
            zcVar3.o(false, null, 1L, 0.0f);
        }
        AndroidUtilities.cancelRunOnUIThread(this.K);
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public final void u(o8 o8Var) {
        Drawable drawable = this.S;
        this.R = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (o8Var == null) {
            this.S = null;
            return;
        }
        long j3 = o8Var.f7792z0;
        if (j3 != Long.MIN_VALUE) {
            Drawable e7 = e(this.S, o8Var.f7740a, j3, o8Var.f7790y0);
            o8Var.f7788x0 = e7;
            this.S = e7;
            if (this.R != e7) {
                this.R = null;
            }
            if (e7 != null) {
                e7.setCallback(this);
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
        PointF pointF;
        boolean z11;
        boolean z12;
        if (this.f7083k0) {
            if (motionEvent.getPointerCount() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            PointF pointF2 = this.m0;
            if (z10) {
                pointF2.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                pointF2.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                f7 = v7.z6.a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                d = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
            } else {
                pointF2.x = motionEvent.getX(0);
                pointF2.y = motionEvent.getY(0);
                d = 0.0d;
                f7 = 0.0f;
            }
            boolean z13 = this.f7088p0;
            PointF pointF3 = this.f7084l0;
            if (z13 != z10) {
                pointF3.x = pointF2.x;
                pointF3.y = pointF2.y;
                this.f7086n0 = f7;
                this.f7087o0 = d;
                this.f7088p0 = z10;
            }
            o8 o8Var = this.d;
            if (o8Var != null) {
                float width = o8Var.f7760i0 / getWidth();
                int actionMasked = motionEvent.getActionMasked();
                Matrix matrix = this.f7093s0;
                if (actionMasked == 0) {
                    this.f7095u0 = 0.0f;
                    this.f7096v0 = false;
                    invalidate();
                    this.f7098w0 = true;
                    matrix.set(this.d.f7769n0);
                }
                if (motionEvent.getActionMasked() == 2 && this.f7098w0 && this.d != null) {
                    float f10 = pointF2.x * width;
                    float f11 = pointF2.y * width;
                    float f12 = pointF3.x * width;
                    float f13 = pointF3.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f14 = this.f7086n0;
                        if (f14 != 0.0f) {
                            float f15 = f7 / f14;
                            matrix.postScale(f15, f15, f10, f11);
                        }
                        pointF = pointF2;
                        float degrees = (float) Math.toDegrees(d - this.f7087o0);
                        float f16 = this.f7095u0 + degrees;
                        this.f7095u0 = f16;
                        if (!this.f7091r0) {
                            if (Math.abs(f16) > 20.0f) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.f7091r0 = z11;
                            if (!z11) {
                                d(matrix);
                                if ((Math.round(this.f7074d0 / 90.0f) * 90.0f) - this.f7074d0 > 20.0f) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                this.f7091r0 = z12;
                            }
                            if (!this.f7096v0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.f7096v0 = true;
                            }
                        }
                        if (this.f7091r0) {
                            matrix.postRotate(degrees, f10, f11);
                        }
                        this.f7089q0 = true;
                    } else {
                        pointF = pointF2;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.f7089q0) {
                        matrix.postTranslate(f10 - f12, f11 - f13);
                    }
                    Matrix matrix2 = this.f7094t0;
                    matrix2.set(matrix);
                    Matrix matrix3 = this.W;
                    matrix3.set(matrix);
                    d(matrix3);
                    float round = (Math.round(this.f7074d0 / 90.0f) * 90.0f) - this.f7074d0;
                    if (this.f7091r0) {
                        if (Math.abs(round) < 3.5f) {
                            matrix2.postRotate(round, this.f7071b0, this.f7073c0);
                            if (!this.f7096v0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.f7096v0 = true;
                            }
                        } else {
                            this.f7096v0 = false;
                        }
                    }
                    this.d.f7769n0.set(matrix2);
                    this.d.f7761j = true;
                    b();
                    invalidate();
                } else {
                    pointF = pointF2;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getPointerCount() <= 1) {
                        this.f7089q0 = false;
                        pc pcVar = ((dc) this).C0;
                        pcVar.f7887o1.a(true, false, pcVar.f7869i0);
                        pcVar.f7887o1.b(pcVar.f7850c1.getText());
                    }
                    this.f7098w0 = false;
                    this.f7091r0 = false;
                    this.f7095u0 = 0.0f;
                    this.f7096v0 = false;
                    invalidate();
                }
                PointF pointF4 = pointF;
                pointF3.x = pointF4.x;
                pointF3.y = pointF4.y;
                this.f7086n0 = f7;
                this.f7087o0 = d;
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
        throw new UnsupportedOperationException("Method not decompiled: di.d7.w(boolean):void");
    }

    public final void x(int i10, boolean z10) {
        HashSet hashSet = this.f7103z0;
        if (z10) {
            hashSet.add(Integer.valueOf(i10));
        } else {
            hashSet.remove(Integer.valueOf(i10));
        }
        g71 g71Var = this.f7075e;
        if (g71Var != null) {
            g71Var.P(hashSet.isEmpty());
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
        if (this.f7099x != null && this.d != null) {
            boolean z12 = true;
            if (this.f7075e == null && !j()) {
                this.f7099x.P(this.f7103z0.isEmpty());
                this.f7099x.N(true);
                rg.d2 d2Var = this.f7097w;
                if (d2Var != null && !d2Var.B0) {
                    d2Var.B0 = true;
                    d2Var.C0.f(true, true);
                    d2Var.invalidate();
                }
                long n11 = this.f7099x.n();
                if (z10 && this.f7099x.p() != -9223372036854775807L) {
                    float p5 = ((float) n11) / ((float) this.f7099x.p());
                    o8 o8Var = this.d;
                    if ((p5 < o8Var.f7779s0 || p5 > o8Var.f7781t0) && System.currentTimeMillis() - this.J > 500) {
                        this.J = System.currentTimeMillis();
                        this.f7099x.L(-this.d.f7777r0, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (j()) {
                n10 = this.E.getPositionWithOffset();
                y3 = this.E.f7140q0;
            } else {
                n10 = this.f7075e.n();
                y3 = this.f7075e.y();
            }
            o8 o8Var2 = this.d;
            float f10 = o8Var2.f7781t0;
            float f11 = o8Var2.f7779s0;
            long j3 = (f10 - f11) * ((float) o8Var2.f7775q0);
            long j10 = o8Var2.f7777r0;
            if (n10 >= j10 && n10 <= j3 + j10) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = (y3 && z11) ? false : false;
            long j11 = (n10 - j10) + (f11 * f7);
            rg.d2 d2Var2 = this.f7097w;
            if (d2Var2 != null && d2Var2.B0 != z11) {
                d2Var2.B0 = z11;
                d2Var2.invalidate();
            }
            if (this.f7099x.y() != z12) {
                this.f7099x.P(z12);
                this.f7099x.L(j11, false);
            } else if (z10) {
                long abs = Math.abs(this.f7099x.n() - j11);
                if (j()) {
                    i10 = 300;
                } else {
                    i10 = 120;
                }
                if (abs > i10) {
                    this.f7099x.L(j11, false);
                }
            }
        }
    }
}
