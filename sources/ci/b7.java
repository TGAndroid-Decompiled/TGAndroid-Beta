package ci;

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
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.nc0;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.uf0;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.xz;
public abstract class b7 extends FrameLayout {
    public static final int B0 = 0;
    public j0 A0;
    public e0 E;
    public wc F;
    public final org.telegram.ui.Components.ja G;
    public final a7 H;
    public long I;
    public long J;
    public final z6 K;
    public final z6 L;
    public final z6 M;
    public ha N;
    public boolean O;
    public final org.telegram.ui.Components.e6 P;
    public final Paint Q;
    public Drawable R;
    public Drawable S;
    public final Paint T;
    public int U;
    public int V;
    public final Matrix W;
    public Bitmap f4377a;
    public final float[] f4378a0;
    public final Rect f4379b;
    public float f4380b0;
    public final Rect f4381c;
    public float f4382c0;
    public l8 d;
    public float f4383d0;
    public t71 e;
    public boolean f4384e0;
    public int f4385f;
    public final org.telegram.ui.Components.e6 f4386f0;
    public boolean f4387g0;
    public int h;
    public final Matrix f4388h0;
    public final Matrix f4389i0;
    public final Matrix f4390j0;
    public boolean f4391k0;
    public final PointF f4392l0;
    public final PointF m0;
    public j71 f4393n;
    public float f4394n0;
    public double f4395o0;
    public boolean f4396p0;
    public boolean f4397q0;
    public TextureView f4398r;
    public boolean f4399r0;
    public uf0 f4400s;
    public final Matrix f4401s0;
    public final Matrix f4402t0;
    public float f4403u0;
    public ha v;
    public boolean f4404v0;
    public qg.c2 f4405w;
    public boolean f4406w0;
    public t71 f4407x;
    public long f4408x0;
    public t71 f4409y;
    public Runnable f4410y0;
    public final HashSet f4411z0;

    public b7(Context context, org.telegram.ui.Components.ja jaVar, a7 a7Var) {
        super(context);
        this.f4379b = new Rect();
        this.f4381c = new Rect();
        Paint paint = new Paint(1);
        new z6(this, 2);
        this.K = new z6(this, 3);
        this.L = new z6(this, 4);
        this.M = new z6(this, 5);
        this.P = new org.telegram.ui.Components.e6(this, 0L, 350L, sr.h);
        this.Q = new Paint(7);
        this.T = new Paint(1);
        this.W = new Matrix();
        this.f4378a0 = new float[2];
        this.f4384e0 = true;
        this.f4386f0 = new org.telegram.ui.Components.e6(this, 0L, 320L, sr.f28340g);
        this.f4387g0 = false;
        this.f4388h0 = new Matrix();
        this.f4389i0 = new Matrix();
        this.f4390j0 = new Matrix();
        this.f4391k0 = true;
        this.f4392l0 = new PointF();
        this.m0 = new PointF();
        this.f4401s0 = new Matrix();
        this.f4402t0 = new Matrix();
        this.f4411z0 = new HashSet();
        this.G = jaVar;
        this.H = a7Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 1073741824);
    }

    public static void a(ci.b7 r13, ci.l8 r14) {
        throw new UnsupportedOperationException("Method not decompiled: ci.b7.a(ci.b7, ci.l8):void");
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
        throw new UnsupportedOperationException("Method not decompiled: ci.b7.f(android.graphics.drawable.Drawable, int, org.telegram.tgnet.TLRPC$WallPaper, boolean):android.graphics.drawable.Drawable");
    }

    public static Drawable g(int i10, final org.telegram.ui.ActionBar.b4 b4Var, final boolean z10) {
        if (b4Var.m()) {
            org.telegram.ui.ActionBar.h6.H(org.telegram.ui.ActionBar.b4.e(z10), b4Var.h(i10, z10 ? 1 : 0), ((org.telegram.ui.ActionBar.a4) b4Var.f18759f.get(z10 ? 1 : 0)).f18713g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray h = b4Var.h(i10, z10 ? 1 : 0);
        int i11 = org.telegram.ui.ActionBar.h6.Nd;
        int i12 = h.get(i11, org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        int i13 = org.telegram.ui.ActionBar.h6.Od;
        int i14 = h.get(i13, org.telegram.ui.ActionBar.h6.w0(null, i13, false));
        int i15 = org.telegram.ui.ActionBar.h6.Pd;
        int i16 = h.get(i15, org.telegram.ui.ActionBar.h6.w0(null, i15, false));
        int i17 = org.telegram.ui.ActionBar.h6.Qd;
        int i18 = h.get(i17, org.telegram.ui.ActionBar.h6.w0(null, i17, false));
        final nc0 nc0Var = new nc0();
        nc0Var.f26760g = false;
        nc0Var.t(nc0Var.f26773u, b4Var.k(z10 ? 1 : 0).settings.intensity);
        nc0Var.o(i12, i14, i16, i18, 0, true);
        nc0Var.v(0);
        final int f7 = nc0Var.f();
        b4Var.o(z10 ? 1 : 0, new ResultCallback() {
            @Override
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair != null) {
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((dg.a) pair.second).f7709b;
                    org.telegram.ui.ActionBar.b4 b4Var2 = org.telegram.ui.ActionBar.b4.this;
                    if (longValue == b4Var2.i(z10 ? 1 : 0) && bitmap != null) {
                        int i19 = b4Var2.k(z10 ? 1 : 0).settings.intensity;
                        nc0 nc0Var2 = nc0Var;
                        nc0Var2.t(bitmap, i19);
                        nc0Var2.u(f7);
                        nc0Var2.s(1.0f);
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
        return nc0Var;
    }

    private void setupCollage(l8 l8Var) {
        ArrayList<l8> arrayList;
        wc wcVar = this.F;
        if (wcVar != null) {
            if (l8Var != null) {
                arrayList = l8Var.T;
            } else {
                arrayList = null;
            }
            wcVar.setCollage(arrayList);
        }
    }

    private void setupImage(l8 l8Var) {
        Utilities.searchQueue.postRunnable(new ai.ba(20, this, l8Var));
    }

    public abstract void b();

    public final void c() {
        float f7;
        float f10;
        l8 l8Var;
        t71 t71Var = this.e;
        float f11 = 0.0f;
        if (t71Var != null) {
            if (!this.O && ((l8Var = this.d) == null || !l8Var.Y)) {
                if (l8Var != null) {
                    f10 = l8Var.P;
                } else {
                    f10 = 1.0f;
                }
            } else {
                f10 = 0.0f;
            }
            t71Var.W(f10);
        }
        t71 t71Var2 = this.f4407x;
        if (t71Var2 != null) {
            if (this.O) {
                f7 = 0.0f;
            } else {
                l8 l8Var2 = this.d;
                if (l8Var2 != null) {
                    f7 = l8Var2.f5006u0;
                } else {
                    f7 = 1.0f;
                }
            }
            t71Var2.W(f7);
        }
        t71 t71Var3 = this.f4409y;
        if (t71Var3 != null) {
            if (!this.O) {
                l8 l8Var3 = this.d;
                if (l8Var3 != null) {
                    f11 = l8Var3.G;
                } else {
                    f11 = 1.0f;
                }
            }
            t71Var3.W(f11);
        }
        e0 e0Var = this.E;
        if (e0Var != null) {
            e0Var.setMuted(this.O);
        }
    }

    public final void d(Matrix matrix) {
        l8 l8Var = this.d;
        if (l8Var == null) {
            return;
        }
        float[] fArr = this.f4378a0;
        fArr[0] = l8Var.f4987k0 / 2.0f;
        fArr[1] = l8Var.f4989l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f4380b0 = fArr[0];
        this.f4382c0 = fArr[1];
        l8 l8Var2 = this.d;
        fArr[0] = l8Var2.f4987k0;
        fArr[1] = l8Var2.f4989l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f4383d0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.f4382c0, fArr[0] - this.f4380b0));
        v7.a7.a(this.f4380b0, this.f4382c0, fArr[0], fArr[1]);
        l8 l8Var3 = this.d;
        fArr[0] = l8Var3.f4987k0 / 2.0f;
        fArr[1] = l8Var3.f4989l0;
        matrix.mapPoints(fArr);
        v7.a7.a(this.f4380b0, this.f4382c0, fArr[0], fArr[1]);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        l8 l8Var;
        MediaController.CropState cropState;
        if (this.S != null) {
            float f7 = 0.0f;
            if (this.f4387g0) {
                Path path = new Path();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.S;
            if (!(drawable instanceof nc0) || ((nc0) drawable).f26773u != null) {
                f7 = this.P.d(1.0f, false);
            }
            Drawable drawable2 = this.R;
            if (drawable2 != null && f7 < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - f7) * 255.0f));
                l8.j(canvas, this.R, getWidth(), getHeight());
            }
            this.S.setAlpha((int) (f7 * 255.0f));
            l8.j(canvas, this.S, getWidth(), getHeight());
            if (this.f4387g0) {
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
        } else if (this.f4384e0 && this.d != null && !j()) {
            if (this.f4377a == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e = this.f4386f0.e(z10);
            if (this.f4377a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.f4983i0, getHeight() / this.d.f4985j0);
                canvas2.concat(this.d.f4992n0);
                if (this.d.m0 != null) {
                    canvas2.translate(l8Var.f4987k0 / 2.0f, l8Var.f4989l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    l8 l8Var2 = this.d;
                    int i10 = l8Var2.f4987k0;
                    int i11 = l8Var2.f4989l0;
                    int i12 = l8Var2.Q;
                    MediaController.CropState cropState2 = l8Var2.m0;
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
                    l8 l8Var3 = this.d;
                    canvas2.translate((-l8Var3.f4987k0) / 2.0f, (-l8Var3.f4989l0) / 2.0f);
                }
                Paint paint = this.Q;
                paint.setAlpha((int) ((1.0f - e) * 255.0f));
                int width = this.f4377a.getWidth();
                int height = this.f4377a.getHeight();
                Rect rect = this.f4379b;
                rect.set(0, 0, width, height);
                l8 l8Var4 = this.d;
                int i13 = l8Var4.f4987k0;
                int i14 = l8Var4.f4989l0;
                Rect rect2 = this.f4381c;
                rect2.set(0, 0, i13, i14);
                canvas2.drawBitmap(this.f4377a, rect, rect2, paint);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: ci.b7.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        l8 l8Var;
        l8 l8Var2;
        j71 j71Var = this.f4393n;
        if (view == j71Var && (l8Var2 = this.d) != null && l8Var2.f5005u) {
            return false;
        }
        if ((view == j71Var || view == this.f4398r) && (l8Var = this.d) != null && l8Var.m0 != null) {
            canvas.save();
            canvas.scale(getWidth() / this.d.f4983i0, getHeight() / this.d.f4985j0);
            canvas.concat(this.d.f4992n0);
            l8 l8Var3 = this.d;
            if (l8Var3.m0 != null) {
                canvas.translate(l8Var3.f4987k0 / 2.0f, l8Var3.f4989l0 / 2.0f);
                canvas.rotate(-this.d.Q);
                l8 l8Var4 = this.d;
                int i10 = l8Var4.f4987k0;
                int i11 = l8Var4.f4989l0;
                int i12 = l8Var4.Q;
                MediaController.CropState cropState = l8Var4.m0;
                if (((i12 + cropState.transformRotation) / 90) % 2 == 1) {
                    i11 = i10;
                    i10 = i11;
                }
                float f7 = cropState.cropPw;
                float f10 = cropState.cropPh;
                canvas.clipRect(((-i10) * f7) / 2.0f, ((-i11) * f10) / 2.0f, (i10 * f7) / 2.0f, (i11 * f10) / 2.0f);
                canvas.rotate(this.d.Q);
                l8 l8Var5 = this.d;
                canvas.translate((-l8Var5.f4987k0) / 2.0f, (-l8Var5.f4989l0) / 2.0f);
            }
            canvas.concat(this.f4388h0);
            canvas.scale(1.0f / (getWidth() / this.d.f4983i0), 1.0f / (getHeight() / this.d.f4985j0));
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public int getContentHeight() {
        l8 l8Var = this.d;
        if (l8Var == null) {
            return 1;
        }
        return l8Var.f4989l0;
    }

    public int getContentWidth() {
        l8 l8Var = this.d;
        if (l8Var == null) {
            return 1;
        }
        return l8Var.f4987k0;
    }

    public long getCurrentPosition() {
        t71 t71Var = this.e;
        if (t71Var != null) {
            return t71Var.n();
        }
        t71 t71Var2 = this.f4407x;
        if (t71Var2 != null) {
            return t71Var2.n();
        }
        t71 t71Var3 = this.f4409y;
        if (t71Var3 != null) {
            return t71Var3.n();
        }
        return 0L;
    }

    public long getDuration() {
        l8 l8Var = this.d;
        if (l8Var != null) {
            double d = l8Var.f4982i;
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
        l8 l8Var = this.d;
        if (l8Var == null) {
            return 0;
        }
        return l8Var.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        if (this.d == null) {
            return new Pair<>(1080, 1920);
        }
        return new Pair<>(Integer.valueOf(this.d.f4983i0), Integer.valueOf(this.d.f4985j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.f4377a;
    }

    public j71 getTextureView() {
        return this.f4393n;
    }

    public final void h(Utilities.Callback callback, View... viewArr) {
        j71 j71Var;
        int dp = (int) (AndroidUtilities.dp(26.0f) * AndroidUtilities.density);
        int dp2 = (int) (AndroidUtilities.dp(30.33f) * AndroidUtilities.density);
        int dp3 = (int) (AndroidUtilities.dp(4.0f) * AndroidUtilities.density);
        Bitmap[] bitmapArr = new Bitmap[viewArr.length];
        for (int i10 = 0; i10 < viewArr.length; i10++) {
            View view = viewArr[i10];
            if (view != null && view.getWidth() >= 0 && viewArr[i10].getHeight() > 0) {
                View view2 = viewArr[i10];
                if (view2 == this && (j71Var = this.f4393n) != null) {
                    bitmapArr[i10] = j71Var.getBitmap();
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
        l8 l8Var;
        if (this.E != null && (l8Var = this.d) != null && l8Var.v()) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        return !this.f4411z0.contains(-9982);
    }

    public final void l(l8 l8Var) {
        this.d = l8Var;
        if (l8Var == null) {
            setupImage(null);
            u(null);
            this.T.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (l8Var.K) {
            setupImage(l8Var);
            if (l8Var.A0 == 0 && l8Var.B0 == 0) {
                l8Var.z(new z6((zb) this, 0));
            } else {
                r();
            }
        } else {
            setupImage(l8Var);
            r();
        }
        b();
        u(l8Var);
        p(l8Var, false);
        s(l8Var, null, false);
    }

    public final void m(long j3) {
        t71 t71Var = this.e;
        if (t71Var != null) {
            t71Var.L(j3, false);
        } else if (j()) {
            this.E.m(j3, false);
        } else {
            t71 t71Var2 = this.f4407x;
            if (t71Var2 != null) {
                t71Var2.L(j3, false);
            } else {
                t71 t71Var3 = this.f4409y;
                if (t71Var3 != null) {
                    t71Var3.L(j3, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(l8 l8Var, na naVar, long j3) {
        this.d = l8Var;
        if (l8Var == null) {
            t(null, naVar, j3);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.T.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (l8Var.v()) {
            setupImage(null);
            t(null, naVar, j3);
            setupCollage(l8Var);
        } else if (l8Var.K) {
            setupImage(l8Var);
            setupCollage(null);
            t(l8Var, naVar, j3);
            if (l8Var.A0 == 0 && l8Var.B0 == 0) {
                l8Var.z(new z6(this, 1));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, naVar, 0L);
            setupImage(l8Var);
            r();
        }
        b();
        u(l8Var);
        p(l8Var, false);
        s(l8Var, null, false);
    }

    public final void o(TextureView textureView, uf0 uf0Var) {
        TextureView textureView2 = this.f4398r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.f4398r = null;
        }
        this.f4400s = uf0Var;
        this.f4398r = textureView;
        if (uf0Var != null) {
            int i10 = this.U;
            int i11 = this.V;
            xz xzVar = uf0Var.f28785l0;
            if (xzVar != null) {
                xzVar.i(i10, i11);
            } else {
                uf0Var.J0 = i10;
                uf0Var.K0 = i11;
            }
        }
        TextureView textureView3 = this.f4398r;
        if (textureView3 != null) {
            addView(textureView3);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f4391k0) {
            v(motionEvent);
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void p(l8 l8Var, boolean z10) {
        boolean z11;
        String str;
        float f7;
        float f10;
        float f11;
        t71 t71Var = this.f4409y;
        if (t71Var != null) {
            t71Var.B();
            this.f4409y.H();
            this.f4409y = null;
        }
        if (l8Var != null) {
            wc wcVar = this.F;
            boolean z12 = false;
            if (wcVar != null) {
                String str2 = l8Var.f5012y;
                String str3 = l8Var.A;
                String str4 = l8Var.B;
                long j3 = l8Var.C;
                long j10 = l8Var.D;
                float f12 = l8Var.E;
                float f13 = l8Var.F;
                float f14 = l8Var.G;
                if (!TextUtils.equals(wcVar.O, str2)) {
                    oc ocVar = wcVar.f5744a0;
                    if (ocVar != null) {
                        ocVar.a();
                        wcVar.f5744a0 = null;
                        wcVar.U = false;
                    }
                    wcVar.O = str2;
                    wcVar.p();
                }
                wcVar.O = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                wcVar.N = !isEmpty;
                if (isEmpty) {
                    wcVar.P = false;
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
                if (wcVar.N) {
                    wcVar.R = j3;
                    wcVar.Q = j10 - (((float) j3) * f12);
                    wcVar.S = f12;
                    wcVar.T = f13;
                    wcVar.V = f14;
                    float f15 = 0.0f;
                    if (str != null) {
                        StaticLayout staticLayout = new StaticLayout(str, wcVar.L0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        wcVar.M0 = staticLayout;
                        if (staticLayout.getLineCount() > 0) {
                            f10 = wcVar.M0.getLineWidth(0);
                        } else {
                            f10 = 0.0f;
                        }
                        wcVar.N0 = f10;
                        if (wcVar.M0.getLineCount() > 0) {
                            f11 = wcVar.M0.getLineLeft(0);
                        } else {
                            f11 = 0.0f;
                        }
                        wcVar.O0 = f11;
                    } else {
                        wcVar.N0 = 0.0f;
                        wcVar.M0 = null;
                    }
                    if (str4 != null) {
                        StaticLayout staticLayout2 = new StaticLayout(str4, wcVar.P0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        wcVar.Q0 = staticLayout2;
                        if (staticLayout2.getLineCount() > 0) {
                            f7 = wcVar.Q0.getLineWidth(0);
                        } else {
                            f7 = 0.0f;
                        }
                        wcVar.R0 = f7;
                        if (wcVar.Q0.getLineCount() > 0) {
                            f15 = wcVar.Q0.getLineLeft(0);
                        }
                        wcVar.S0 = f15;
                    } else {
                        wcVar.R0 = 0.0f;
                        wcVar.Q0 = null;
                    }
                }
                if (!z10) {
                    z11 = true;
                    wcVar.f5754e0.f(wcVar.N, true);
                } else {
                    z11 = true;
                }
                wcVar.invalidate();
            } else {
                z11 = true;
            }
            if (l8Var.f5012y != null) {
                t71 t71Var2 = new t71();
                this.f4409y = t71Var2;
                t71Var2.f28502y = z11;
                t71Var2.J = new a6.i(this, 12);
                t71Var2.D(Uri.fromFile(new File(l8Var.f5012y)), "other");
                c();
                if (this.e != null && getDuration() > 0) {
                    long duration = l8Var.Z * ((float) getDuration());
                    this.e.L(duration, false);
                    this.F.setProgress(duration);
                }
                w(true);
            }
            lc lcVar = ((zb) this).C0;
            nb nbVar = lcVar.f5094v1;
            if (nbVar != null) {
                l8 l8Var2 = lcVar.K1;
                if (l8Var2 != null && l8Var2.f5012y != null) {
                    z12 = true;
                }
                nbVar.setHasAudio(z12);
            }
        }
    }

    public final void q(MessageObject messageObject) {
        long j3;
        int maxCount;
        l8 l8Var = this.d;
        if (l8Var != null) {
            l8Var.f4984j = true;
            float f7 = 1.0f;
            if (messageObject != null && messageObject.messageOwner != null) {
                TLRPC.Document document = messageObject.getDocument();
                if (document != null && document.f18341id != 0) {
                    this.d.f5014z = new TLRPC.TL_inputDocument();
                    TLRPC.InputDocument inputDocument = this.d.f5014z;
                    inputDocument.f18347id = document.f18341id;
                    inputDocument.file_reference = document.file_reference;
                    inputDocument.access_hash = document.access_hash;
                }
                int i10 = 0;
                if (!TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                    this.d.f5012y = messageObject.messageOwner.attachPath;
                } else {
                    File pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, false, true);
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, true, true);
                        if (pathToAttach != null && pathToAttach.exists()) {
                            this.d.f5012y = pathToAttach.getAbsolutePath();
                        } else {
                            l8 l8Var2 = this.d;
                            l8Var2.f5012y = null;
                            l8Var2.f5014z = null;
                            l8Var2.A = null;
                            l8Var2.B = null;
                            l8Var2.D = 0L;
                            l8Var2.C = 0L;
                            l8Var2.E = 0.0f;
                            l8Var2.F = 1.0f;
                            return;
                        }
                    }
                    this.d.f5012y = pathToAttach.getAbsolutePath();
                }
                l8 l8Var3 = this.d;
                l8Var3.A = null;
                l8Var3.B = null;
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
                l8 l8Var4 = this.d;
                l8Var4.D = 0L;
                if (l8Var4.K) {
                    l8Var4.D = l8Var4.Z * ((float) getDuration());
                }
                this.d.E = 0.0f;
                if (j()) {
                    ArrayList arrayList2 = this.E.h;
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        l8 l8Var5 = ((d0) obj).f4488n;
                        if (l8Var5 != null && l8Var5.K) {
                            j3 = this.E.getDuration();
                            break;
                        }
                    }
                }
                l8 l8Var6 = this.d;
                if (l8Var6.K) {
                    j3 = getDuration();
                } else {
                    j3 = l8Var6.C;
                }
                wc wcVar = this.F;
                if (wcVar == null) {
                    maxCount = 1;
                } else {
                    maxCount = wcVar.getMaxCount();
                }
                l8 l8Var7 = this.d;
                if (l8Var7.C != 0) {
                    f7 = Math.min(1.0f, ((float) Math.min(j3, maxCount * 59000)) / ((float) this.d.C));
                }
                l8Var7.F = f7;
            } else {
                l8Var.f5012y = null;
                l8Var.f5014z = null;
                l8Var.A = null;
                l8Var.B = null;
                l8Var.D = 0L;
                l8Var.C = 0L;
                l8Var.E = 0.0f;
                l8Var.F = 1.0f;
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
        l8 l8Var = this.d;
        int i11 = l8Var.A0;
        Paint paint = this.T;
        if (i11 != 0 && l8Var.B0 != 0) {
            float f7 = i10;
            l8 l8Var2 = this.d;
            int i12 = l8Var2.A0;
            this.U = i12;
            int i13 = l8Var2.B0;
            this.V = i13;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f7, new int[]{i12, i13}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            j71 j71Var = this.f4393n;
            if (j71Var != null) {
                int i14 = this.U;
                int i15 = this.V;
                xz xzVar = j71Var.f25279b;
                if (xzVar == null) {
                    j71Var.f25282n = i14;
                    j71Var.f25283r = i15;
                } else {
                    xzVar.i(i14, i15);
                }
            }
            uf0 uf0Var = this.f4400s;
            if (uf0Var != null) {
                int i16 = this.U;
                int i17 = this.V;
                xz xzVar2 = uf0Var.f28785l0;
                if (xzVar2 != null) {
                    xzVar2.i(i16, i17);
                } else {
                    uf0Var.J0 = i16;
                    uf0Var.K0 = i17;
                }
            }
        } else {
            Bitmap bitmap = this.f4377a;
            if (bitmap != null) {
                new l4(this, i10, 1).run(n0.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        }
        invalidate();
    }

    public final void s(l8 l8Var, qg.c2 c2Var, boolean z10) {
        t71 t71Var;
        if (l8Var != null && l8Var.f4994o0 != null) {
            t71 t71Var2 = this.f4407x;
            if (t71Var2 != null) {
                t71Var2.H();
                this.f4407x = null;
            }
            t71 t71Var3 = new t71();
            this.f4407x = t71Var3;
            t71Var3.f28502y = true;
            t71Var3.J = new a6.m(this, 12);
            this.f4407x.D(Uri.fromFile(l8Var.f4994o0), "other");
            c();
            this.f4405w = c2Var;
            if (c2Var != null && (t71Var = this.f4407x) != null) {
                t71Var.V(c2Var.f41602u0);
            }
            this.F.n(l8Var.f4994o0.getAbsolutePath(), l8Var.f4998q0, l8Var.f5000r0, l8Var.f5002s0, l8Var.f5004t0, l8Var.f5006u0, z10);
            y(true);
            return;
        }
        t71 t71Var4 = this.f4407x;
        if (t71Var4 != null) {
            t71Var4.B();
            this.f4407x.H();
            this.f4407x = null;
        }
        wc wcVar = this.F;
        if (wcVar != null) {
            wcVar.setRoundNull(z10);
        }
        this.f4405w = null;
        AndroidUtilities.cancelRunOnUIThread(this.K);
    }

    public void set(l8 l8Var) {
        n(l8Var, null, 0L);
    }

    public void setAllowCropping(boolean z10) {
        this.f4391k0 = z10;
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
        this.f4384e0 = z10;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.f4410y0 = runnable;
    }

    public void setVideoTimelineView(wc wcVar) {
        this.F = wcVar;
        if (wcVar != null) {
            wcVar.setDelegate(new a4.m(this, 9));
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8) {
            set(null);
        }
    }

    public final void t(l8 l8Var, Runnable runnable, long j3) {
        org.telegram.ui.Components.ja jaVar;
        boolean z10;
        ArrayList arrayList;
        org.telegram.ui.Components.pa paVar;
        float f7 = 0.0f;
        if (l8Var != null && !l8Var.v()) {
            t71 t71Var = this.e;
            if (t71Var != null) {
                t71Var.H();
                this.e = null;
            }
            t71 t71Var2 = new t71();
            this.e = t71Var2;
            t71Var2.f28502y = true;
            t71Var2.J = new aa.a(this, l8Var, new Runnable[]{runnable});
            j71 j71Var = this.f4393n;
            if (j71Var != null) {
                j71Var.clearAnimation();
                j71 j71Var2 = this.f4393n;
                xz xzVar = j71Var2.f25279b;
                if (xzVar != null) {
                    xzVar.postRunnable(new uz(xzVar, 0));
                }
                j71Var2.f25278a = null;
                removeView(this.f4393n);
                this.f4393n = null;
            }
            this.f4393n = new j71(getContext(), this.e);
            this.G.e();
            j71 j71Var3 = this.f4393n;
            if (l8Var.f5005u) {
                jaVar = null;
            } else {
                jaVar = this.G;
            }
            j71Var3.f25284s = jaVar;
            xz xzVar2 = j71Var3.f25279b;
            if (xzVar2 != null && (paVar = xzVar2.I) != null) {
                org.telegram.ui.Components.ja jaVar2 = paVar.f27319t;
                if (jaVar2 != null && jaVar2.f25365m != null) {
                    jaVar2.f25365m = null;
                }
                paVar.f27319t = jaVar;
                if (jaVar != null && jaVar.f25365m != paVar) {
                    jaVar.f25365m = paVar;
                    jaVar.d();
                }
            }
            this.f4393n.setOpaque(false);
            b();
            a7 a7Var = this.H;
            if (a7Var != null && a7Var.f4349g) {
                a7Var.a(this.f4393n);
            } else {
                j71 j71Var4 = this.f4393n;
                if (runnable != null) {
                    f7 = 1.0f;
                }
                j71Var4.setAlpha(f7);
                addView(this.f4393n, w7.y5.e(-2, -2, 51));
            }
            ai.y1 y1Var = new ai.y1(this, 13);
            k8 k8Var = l8Var.f4974d1;
            if (k8Var != null) {
                y1Var.run(k8Var);
            } else if (l8Var.K && Build.VERSION.SDK_INT >= 24) {
                Utilities.globalQueue.postRunnable(new g8(l8Var, y1Var, 0));
            } else {
                ?? obj = new Object();
                l8Var.f4974d1 = obj;
                y1Var.run(obj);
            }
            File file = l8Var.Z0;
            if (file == null) {
                file = l8Var.L;
            }
            this.e.D(Uri.fromFile(file), "other");
            this.e.P(this.f4411z0.isEmpty());
            this.e.N(true);
            if (l8Var.h) {
                j3 = (l8Var.Z * ((float) l8Var.f4981h0)) + ((float) j3);
            }
            int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i10 > 0) {
                this.e.L(j3, false);
            }
            c();
            w(true);
            if (l8Var.f5005u && (arrayList = l8Var.v) != null && arrayList.size() == 1 && ((MessageObject) l8Var.v.get(0)).type == 5) {
                z10 = true;
            } else {
                z10 = false;
            }
            wc wcVar = this.F;
            File file2 = l8Var.Z0;
            if (file2 == null) {
                file2 = l8Var.L;
            }
            wcVar.o(z10, file2.getAbsolutePath(), getDuration(), l8Var.P);
            this.F.setVideoLeft(l8Var.Z);
            this.F.setVideoRight(l8Var.f4965a0);
            wc wcVar2 = this.F;
            if (wcVar2 != null && i10 > 0) {
                wcVar2.setProgress(j3);
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
        a7 a7Var2 = this.H;
        if (a7Var2 != null && a7Var2.f4349g) {
            a7Var2.a(null);
        } else {
            j71 j71Var5 = this.f4393n;
            if (j71Var5 != null) {
                j71Var5.clearAnimation();
                this.f4393n.animate().alpha(0.0f).withEndAction(new z6(this, 6)).start();
            }
        }
        wc wcVar3 = this.F;
        if (wcVar3 != null) {
            wcVar3.o(false, null, 1L, 0.0f);
        }
        AndroidUtilities.cancelRunOnUIThread(this.K);
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public final void u(l8 l8Var) {
        Drawable drawable = this.S;
        this.R = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (l8Var == null) {
            this.S = null;
            return;
        }
        long j3 = l8Var.f5015z0;
        if (j3 != Long.MIN_VALUE) {
            Drawable e = e(this.S, l8Var.f4964a, j3, l8Var.f5013y0);
            l8Var.f5011x0 = e;
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
        PointF pointF;
        boolean z11;
        boolean z12;
        if (this.f4391k0) {
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
            boolean z13 = this.f4396p0;
            PointF pointF3 = this.f4392l0;
            if (z13 != z10) {
                pointF3.x = pointF2.x;
                pointF3.y = pointF2.y;
                this.f4394n0 = f7;
                this.f4395o0 = d;
                this.f4396p0 = z10;
            }
            l8 l8Var = this.d;
            if (l8Var != null) {
                float width = l8Var.f4983i0 / getWidth();
                int actionMasked = motionEvent.getActionMasked();
                Matrix matrix = this.f4401s0;
                if (actionMasked == 0) {
                    this.f4403u0 = 0.0f;
                    this.f4404v0 = false;
                    invalidate();
                    this.f4406w0 = true;
                    matrix.set(this.d.f4992n0);
                }
                if (motionEvent.getActionMasked() == 2 && this.f4406w0 && this.d != null) {
                    float f10 = pointF2.x * width;
                    float f11 = pointF2.y * width;
                    float f12 = pointF3.x * width;
                    float f13 = pointF3.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f14 = this.f4394n0;
                        if (f14 != 0.0f) {
                            float f15 = f7 / f14;
                            matrix.postScale(f15, f15, f10, f11);
                        }
                        pointF = pointF2;
                        float degrees = (float) Math.toDegrees(d - this.f4395o0);
                        float f16 = this.f4403u0 + degrees;
                        this.f4403u0 = f16;
                        if (!this.f4399r0) {
                            if (Math.abs(f16) > 20.0f) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.f4399r0 = z11;
                            if (!z11) {
                                d(matrix);
                                if ((Math.round(this.f4383d0 / 90.0f) * 90.0f) - this.f4383d0 > 20.0f) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                this.f4399r0 = z12;
                            }
                            if (!this.f4404v0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.f4404v0 = true;
                            }
                        }
                        if (this.f4399r0) {
                            matrix.postRotate(degrees, f10, f11);
                        }
                        this.f4397q0 = true;
                    } else {
                        pointF = pointF2;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.f4397q0) {
                        matrix.postTranslate(f10 - f12, f11 - f13);
                    }
                    Matrix matrix2 = this.f4402t0;
                    matrix2.set(matrix);
                    Matrix matrix3 = this.W;
                    matrix3.set(matrix);
                    d(matrix3);
                    float round = (Math.round(this.f4383d0 / 90.0f) * 90.0f) - this.f4383d0;
                    if (this.f4399r0) {
                        if (Math.abs(round) < 3.5f) {
                            matrix2.postRotate(round, this.f4380b0, this.f4382c0);
                            if (!this.f4404v0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.f4404v0 = true;
                            }
                        } else {
                            this.f4404v0 = false;
                        }
                    }
                    this.d.f4992n0.set(matrix2);
                    this.d.f4984j = true;
                    b();
                    invalidate();
                } else {
                    pointF = pointF2;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getPointerCount() <= 1) {
                        this.f4397q0 = false;
                        lc lcVar = ((zb) this).C0;
                        lcVar.f5071o1.a(true, false, lcVar.f5053i0);
                        lcVar.f5071o1.b(lcVar.f5035c1.getText());
                    }
                    this.f4406w0 = false;
                    this.f4399r0 = false;
                    this.f4403u0 = 0.0f;
                    this.f4404v0 = false;
                    invalidate();
                }
                PointF pointF4 = pointF;
                pointF3.x = pointF4.x;
                pointF3.y = pointF4.y;
                this.f4394n0 = f7;
                this.f4395o0 = d;
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
        throw new UnsupportedOperationException("Method not decompiled: ci.b7.w(boolean):void");
    }

    public final void x(int i10, boolean z10) {
        HashSet hashSet = this.f4411z0;
        if (z10) {
            hashSet.add(Integer.valueOf(i10));
        } else {
            hashSet.remove(Integer.valueOf(i10));
        }
        t71 t71Var = this.e;
        if (t71Var != null) {
            t71Var.P(hashSet.isEmpty());
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
        if (this.f4407x != null && this.d != null) {
            boolean z12 = true;
            if (this.e == null && !j()) {
                this.f4407x.P(this.f4411z0.isEmpty());
                this.f4407x.N(true);
                qg.c2 c2Var = this.f4405w;
                if (c2Var != null && !c2Var.B0) {
                    c2Var.B0 = true;
                    c2Var.C0.f(true, true);
                    c2Var.invalidate();
                }
                long n11 = this.f4407x.n();
                if (z10 && this.f4407x.p() != -9223372036854775807L) {
                    float p5 = ((float) n11) / ((float) this.f4407x.p());
                    l8 l8Var = this.d;
                    if ((p5 < l8Var.f5002s0 || p5 > l8Var.f5004t0) && System.currentTimeMillis() - this.J > 500) {
                        this.J = System.currentTimeMillis();
                        this.f4407x.L(-this.d.f5000r0, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (j()) {
                n10 = this.E.getPositionWithOffset();
                y3 = this.E.f4580q0;
            } else {
                n10 = this.e.n();
                y3 = this.e.y();
            }
            l8 l8Var2 = this.d;
            float f10 = l8Var2.f5004t0;
            float f11 = l8Var2.f5002s0;
            long j3 = (f10 - f11) * ((float) l8Var2.f4998q0);
            long j10 = l8Var2.f5000r0;
            if (n10 >= j10 && n10 <= j3 + j10) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = (y3 && z11) ? false : false;
            long j11 = (n10 - j10) + (f11 * f7);
            qg.c2 c2Var2 = this.f4405w;
            if (c2Var2 != null && c2Var2.B0 != z11) {
                c2Var2.B0 = z11;
                c2Var2.invalidate();
            }
            if (this.f4407x.y() != z12) {
                this.f4407x.P(z12);
                this.f4407x.L(j11, false);
            } else if (z10) {
                long abs = Math.abs(this.f4407x.n() - j11);
                if (j()) {
                    i10 = 300;
                } else {
                    i10 = 120;
                }
                if (abs > i10) {
                    this.f4407x.L(j11, false);
                }
            }
        }
    }
}
