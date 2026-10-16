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
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.y71;
public abstract class a7 extends FrameLayout {
    public static final int B0 = 0;
    public i0 A0;
    public e0 E;
    public uc F;
    public final org.telegram.ui.Components.la G;
    public final z6 H;
    public long I;
    public long J;
    public final x6 K;
    public final x6 L;
    public final x6 M;
    public ga N;
    public boolean O;
    public final org.telegram.ui.Components.g6 P;
    public final Paint Q;
    public Drawable R;
    public Drawable S;
    public final Paint T;
    public int U;
    public int V;
    public final Matrix W;
    public Bitmap f6596a;
    public final float[] f6597a0;
    public final Rect f6598b;
    public float f6599b0;
    public final Rect f6600c;
    public float f6601c0;
    public k8 d;
    public float f6602d0;
    public i81 e;
    public boolean f6603e0;
    public int f6604f;
    public final org.telegram.ui.Components.g6 f6605f0;
    public boolean f6606g0;
    public int h;
    public final Matrix f6607h0;
    public final Matrix f6608i0;
    public final Matrix f6609j0;
    public boolean f6610k0;
    public final PointF f6611l0;
    public final PointF m0;
    public y71 f6612n;
    public float f6613n0;
    public double f6614o0;
    public boolean f6615p0;
    public boolean f6616q0;
    public TextureView f6617r;
    public boolean f6618r0;
    public jg0 f6619s;
    public final Matrix f6620s0;
    public final Matrix f6621t0;
    public float f6622u0;
    public ga v;
    public boolean f6623v0;
    public rg.d2 f6624w;
    public boolean f6625w0;
    public i81 f6626x;
    public long f6627x0;
    public i81 f6628y;
    public Runnable f6629y0;
    public final HashSet f6630z0;

    public a7(Context context, org.telegram.ui.Components.la laVar, z6 z6Var) {
        super(context);
        this.f6598b = new Rect();
        this.f6600c = new Rect();
        Paint paint = new Paint(1);
        new x6(this, 2);
        this.K = new x6(this, 3);
        this.L = new x6(this, 4);
        this.M = new x6(this, 5);
        this.P = new org.telegram.ui.Components.g6(this, 0L, 350L, es.h);
        this.Q = new Paint(7);
        this.T = new Paint(1);
        this.W = new Matrix();
        this.f6597a0 = new float[2];
        this.f6603e0 = true;
        this.f6605f0 = new org.telegram.ui.Components.g6(this, 0L, 320L, es.f24466g);
        this.f6606g0 = false;
        this.f6607h0 = new Matrix();
        this.f6608i0 = new Matrix();
        this.f6609j0 = new Matrix();
        this.f6610k0 = true;
        this.f6611l0 = new PointF();
        this.m0 = new PointF();
        this.f6620s0 = new Matrix();
        this.f6621t0 = new Matrix();
        this.f6630z0 = new HashSet();
        this.G = laVar;
        this.H = z6Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 1073741824);
    }

    public static void a(di.a7 r13, di.k8 r14) {
        throw new UnsupportedOperationException("Method not decompiled: di.a7.a(di.a7, di.k8):void");
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
        throw new UnsupportedOperationException("Method not decompiled: di.a7.f(android.graphics.drawable.Drawable, int, org.telegram.tgnet.TLRPC$WallPaper, boolean):android.graphics.drawable.Drawable");
    }

    public static Drawable g(int i10, final org.telegram.ui.ActionBar.b4 b4Var, final boolean z10) {
        if (b4Var.m()) {
            org.telegram.ui.ActionBar.g6.H(org.telegram.ui.ActionBar.b4.e(z10), b4Var.h(i10, z10 ? 1 : 0), ((org.telegram.ui.ActionBar.a4) b4Var.f19345f.get(z10 ? 1 : 0)).f19300g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray h = b4Var.h(i10, z10 ? 1 : 0);
        int i11 = org.telegram.ui.ActionBar.g6.Nd;
        int i12 = h.get(i11, org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        int i13 = org.telegram.ui.ActionBar.g6.Od;
        int i14 = h.get(i13, org.telegram.ui.ActionBar.g6.x0(null, i13, false));
        int i15 = org.telegram.ui.ActionBar.g6.Pd;
        int i16 = h.get(i15, org.telegram.ui.ActionBar.g6.x0(null, i15, false));
        int i17 = org.telegram.ui.ActionBar.g6.Qd;
        int i18 = h.get(i17, org.telegram.ui.ActionBar.g6.x0(null, i17, false));
        final cd0 cd0Var = new cd0();
        cd0Var.f23697g = false;
        cd0Var.t(cd0Var.f23710u, b4Var.k(z10 ? 1 : 0).settings.intensity);
        cd0Var.o(i12, i14, i16, i18, 0, true);
        cd0Var.v(0);
        final int f7 = cd0Var.f();
        b4Var.o(z10 ? 1 : 0, new ResultCallback() {
            @Override
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair != null) {
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((eg.a) pair.second).f8767b;
                    org.telegram.ui.ActionBar.b4 b4Var2 = org.telegram.ui.ActionBar.b4.this;
                    if (longValue == b4Var2.i(z10 ? 1 : 0) && bitmap != null) {
                        int i19 = b4Var2.k(z10 ? 1 : 0).settings.intensity;
                        cd0 cd0Var2 = cd0Var;
                        cd0Var2.t(bitmap, i19);
                        cd0Var2.u(f7);
                        cd0Var2.s(1.0f);
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
        return cd0Var;
    }

    private void setupCollage(k8 k8Var) {
        ArrayList<k8> arrayList;
        uc ucVar = this.F;
        if (ucVar != null) {
            if (k8Var != null) {
                arrayList = k8Var.T;
            } else {
                arrayList = null;
            }
            ucVar.setCollage(arrayList);
        }
    }

    private void setupImage(k8 k8Var) {
        Utilities.searchQueue.postRunnable(new y6(1, this, k8Var));
    }

    public abstract void b();

    public final void c() {
        float f7;
        float f10;
        k8 k8Var;
        i81 i81Var = this.e;
        float f11 = 0.0f;
        if (i81Var != null) {
            if (!this.O && ((k8Var = this.d) == null || !k8Var.Y)) {
                if (k8Var != null) {
                    f10 = k8Var.P;
                } else {
                    f10 = 1.0f;
                }
            } else {
                f10 = 0.0f;
            }
            i81Var.W(f10);
        }
        i81 i81Var2 = this.f6626x;
        if (i81Var2 != null) {
            if (this.O) {
                f7 = 0.0f;
            } else {
                k8 k8Var2 = this.d;
                if (k8Var2 != null) {
                    f7 = k8Var2.f7217u0;
                } else {
                    f7 = 1.0f;
                }
            }
            i81Var2.W(f7);
        }
        i81 i81Var3 = this.f6628y;
        if (i81Var3 != null) {
            if (!this.O) {
                k8 k8Var3 = this.d;
                if (k8Var3 != null) {
                    f11 = k8Var3.G;
                } else {
                    f11 = 1.0f;
                }
            }
            i81Var3.W(f11);
        }
        e0 e0Var = this.E;
        if (e0Var != null) {
            e0Var.setMuted(this.O);
        }
    }

    public final void d(Matrix matrix) {
        k8 k8Var = this.d;
        if (k8Var == null) {
            return;
        }
        float[] fArr = this.f6597a0;
        fArr[0] = k8Var.f7198k0 / 2.0f;
        fArr[1] = k8Var.f7200l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f6599b0 = fArr[0];
        this.f6601c0 = fArr[1];
        k8 k8Var2 = this.d;
        fArr[0] = k8Var2.f7198k0;
        fArr[1] = k8Var2.f7200l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f6602d0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.f6601c0, fArr[0] - this.f6599b0));
        v7.f7.a(this.f6599b0, this.f6601c0, fArr[0], fArr[1]);
        k8 k8Var3 = this.d;
        fArr[0] = k8Var3.f7198k0 / 2.0f;
        fArr[1] = k8Var3.f7200l0;
        matrix.mapPoints(fArr);
        v7.f7.a(this.f6599b0, this.f6601c0, fArr[0], fArr[1]);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        k8 k8Var;
        MediaController.CropState cropState;
        if (this.S != null) {
            float f7 = 0.0f;
            if (this.f6606g0) {
                Path path = new Path();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.S;
            if (!(drawable instanceof cd0) || ((cd0) drawable).f23710u != null) {
                f7 = this.P.d(1.0f, false);
            }
            Drawable drawable2 = this.R;
            if (drawable2 != null && f7 < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - f7) * 255.0f));
                k8.j(canvas, this.R, getWidth(), getHeight());
            }
            this.S.setAlpha((int) (f7 * 255.0f));
            k8.j(canvas, this.S, getWidth(), getHeight());
            if (this.f6606g0) {
                canvas.restore();
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.T);
        }
        i0 i0Var = this.A0;
        if (i0Var != null) {
            i0Var.d.b(canvas2, true);
        } else if (this.f6603e0 && this.d != null && !j()) {
            if (this.f6596a == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e = this.f6605f0.e(z10);
            if (this.f6596a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.f7194i0, getHeight() / this.d.f7196j0);
                canvas2.concat(this.d.f7203n0);
                if (this.d.m0 != null) {
                    canvas2.translate(k8Var.f7198k0 / 2.0f, k8Var.f7200l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    k8 k8Var2 = this.d;
                    int i10 = k8Var2.f7198k0;
                    int i11 = k8Var2.f7200l0;
                    int i12 = k8Var2.Q;
                    MediaController.CropState cropState2 = k8Var2.m0;
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
                    k8 k8Var3 = this.d;
                    canvas2.translate((-k8Var3.f7198k0) / 2.0f, (-k8Var3.f7200l0) / 2.0f);
                }
                Paint paint = this.Q;
                paint.setAlpha((int) ((1.0f - e) * 255.0f));
                int width = this.f6596a.getWidth();
                int height = this.f6596a.getHeight();
                Rect rect = this.f6598b;
                rect.set(0, 0, width, height);
                k8 k8Var4 = this.d;
                int i13 = k8Var4.f7198k0;
                int i14 = k8Var4.f7200l0;
                Rect rect2 = this.f6600c;
                rect2.set(0, 0, i13, i14);
                canvas2.drawBitmap(this.f6596a, rect, rect2, paint);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: di.a7.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        k8 k8Var;
        k8 k8Var2;
        y71 y71Var = this.f6612n;
        if (view == y71Var && (k8Var2 = this.d) != null && k8Var2.f7216u) {
            return false;
        }
        if ((view == y71Var || view == this.f6617r) && (k8Var = this.d) != null && k8Var.m0 != null) {
            canvas.save();
            canvas.scale(getWidth() / this.d.f7194i0, getHeight() / this.d.f7196j0);
            canvas.concat(this.d.f7203n0);
            k8 k8Var3 = this.d;
            if (k8Var3.m0 != null) {
                canvas.translate(k8Var3.f7198k0 / 2.0f, k8Var3.f7200l0 / 2.0f);
                canvas.rotate(-this.d.Q);
                k8 k8Var4 = this.d;
                int i10 = k8Var4.f7198k0;
                int i11 = k8Var4.f7200l0;
                int i12 = k8Var4.Q;
                MediaController.CropState cropState = k8Var4.m0;
                if (((i12 + cropState.transformRotation) / 90) % 2 == 1) {
                    i11 = i10;
                    i10 = i11;
                }
                float f7 = cropState.cropPw;
                float f10 = cropState.cropPh;
                canvas.clipRect(((-i10) * f7) / 2.0f, ((-i11) * f10) / 2.0f, (i10 * f7) / 2.0f, (i11 * f10) / 2.0f);
                canvas.rotate(this.d.Q);
                k8 k8Var5 = this.d;
                canvas.translate((-k8Var5.f7198k0) / 2.0f, (-k8Var5.f7200l0) / 2.0f);
            }
            canvas.concat(this.f6607h0);
            canvas.scale(1.0f / (getWidth() / this.d.f7194i0), 1.0f / (getHeight() / this.d.f7196j0));
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public int getContentHeight() {
        k8 k8Var = this.d;
        if (k8Var == null) {
            return 1;
        }
        return k8Var.f7200l0;
    }

    public int getContentWidth() {
        k8 k8Var = this.d;
        if (k8Var == null) {
            return 1;
        }
        return k8Var.f7198k0;
    }

    public long getCurrentPosition() {
        i81 i81Var = this.e;
        if (i81Var != null) {
            return i81Var.n();
        }
        i81 i81Var2 = this.f6626x;
        if (i81Var2 != null) {
            return i81Var2.n();
        }
        i81 i81Var3 = this.f6628y;
        if (i81Var3 != null) {
            return i81Var3.n();
        }
        return 0L;
    }

    public long getDuration() {
        k8 k8Var = this.d;
        if (k8Var != null) {
            double d = k8Var.f7193i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        i81 i81Var = this.e;
        if (i81Var != null && i81Var.p() != -9223372036854775807L) {
            return this.e.p();
        }
        return 1L;
    }

    public int getOrientation() {
        k8 k8Var = this.d;
        if (k8Var == null) {
            return 0;
        }
        return k8Var.Q;
    }

    public Pair<Integer, Integer> getPaintSize() {
        if (this.d == null) {
            return new Pair<>(1080, 1920);
        }
        return new Pair<>(Integer.valueOf(this.d.f7194i0), Integer.valueOf(this.d.f7196j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.f6596a;
    }

    public y71 getTextureView() {
        return this.f6612n;
    }

    public final void h(Utilities.Callback callback, View... viewArr) {
        y71 y71Var;
        int dp = (int) (AndroidUtilities.dp(26.0f) * AndroidUtilities.density);
        int dp2 = (int) (AndroidUtilities.dp(30.33f) * AndroidUtilities.density);
        int dp3 = (int) (AndroidUtilities.dp(4.0f) * AndroidUtilities.density);
        Bitmap[] bitmapArr = new Bitmap[viewArr.length];
        for (int i10 = 0; i10 < viewArr.length; i10++) {
            View view = viewArr[i10];
            if (view != null && view.getWidth() >= 0 && viewArr[i10].getHeight() > 0) {
                View view2 = viewArr[i10];
                if (view2 == this && (y71Var = this.f6612n) != null) {
                    bitmapArr[i10] = y71Var.getBitmap();
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
        Utilities.globalQueue.postRunnable(new v6(dp, dp2, dp3, bitmapArr, callback));
    }

    public abstract void i();

    public final boolean j() {
        k8 k8Var;
        if (this.E != null && (k8Var = this.d) != null && k8Var.v()) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        return !this.f6630z0.contains(-9982);
    }

    public final void l(k8 k8Var) {
        this.d = k8Var;
        if (k8Var == null) {
            setupImage(null);
            u(null);
            this.T.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (k8Var.K) {
            setupImage(k8Var);
            if (k8Var.A0 == 0 && k8Var.B0 == 0) {
                k8Var.z(new x6((yb) this, 0));
            } else {
                r();
            }
        } else {
            setupImage(k8Var);
            r();
        }
        b();
        u(k8Var);
        p(k8Var, false);
        s(k8Var, null, false);
    }

    public final void m(long j10) {
        i81 i81Var = this.e;
        if (i81Var != null) {
            i81Var.L(j10, false);
        } else if (j()) {
            this.E.m(j10, false);
        } else {
            i81 i81Var2 = this.f6626x;
            if (i81Var2 != null) {
                i81Var2.L(j10, false);
            } else {
                i81 i81Var3 = this.f6628y;
                if (i81Var3 != null) {
                    i81Var3.L(j10, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(k8 k8Var, ma maVar, long j10) {
        this.d = k8Var;
        if (k8Var == null) {
            t(null, maVar, j10);
            setupImage(null);
            setupCollage(null);
            u(null);
            this.T.setShader(null);
            p(null, false);
            s(null, null, false);
            return;
        }
        if (k8Var.v()) {
            setupImage(null);
            t(null, maVar, j10);
            setupCollage(k8Var);
        } else if (k8Var.K) {
            setupImage(k8Var);
            setupCollage(null);
            t(k8Var, maVar, j10);
            if (k8Var.A0 == 0 && k8Var.B0 == 0) {
                k8Var.z(new x6(this, 1));
            } else {
                r();
            }
        } else {
            setupCollage(null);
            t(null, maVar, 0L);
            setupImage(k8Var);
            r();
        }
        b();
        u(k8Var);
        p(k8Var, false);
        s(k8Var, null, false);
    }

    public final void o(TextureView textureView, jg0 jg0Var) {
        TextureView textureView2 = this.f6617r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.f6617r = null;
        }
        this.f6619s = jg0Var;
        this.f6617r = textureView;
        if (jg0Var != null) {
            int i10 = this.U;
            int i11 = this.V;
            h00 h00Var = jg0Var.f26009l0;
            if (h00Var != null) {
                h00Var.i(i10, i11);
            } else {
                jg0Var.J0 = i10;
                jg0Var.K0 = i11;
            }
        }
        TextureView textureView3 = this.f6617r;
        if (textureView3 != null) {
            addView(textureView3);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f6610k0) {
            v(motionEvent);
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void p(k8 k8Var, boolean z10) {
        boolean z11;
        String str;
        float f7;
        float f10;
        float f11;
        i81 i81Var = this.f6628y;
        if (i81Var != null) {
            i81Var.B();
            this.f6628y.H();
            this.f6628y = null;
        }
        if (k8Var != null) {
            uc ucVar = this.F;
            boolean z12 = false;
            if (ucVar != null) {
                String str2 = k8Var.f7223y;
                String str3 = k8Var.A;
                String str4 = k8Var.B;
                long j10 = k8Var.C;
                long j11 = k8Var.D;
                float f12 = k8Var.E;
                float f13 = k8Var.F;
                float f14 = k8Var.G;
                if (!TextUtils.equals(ucVar.O, str2)) {
                    nc ncVar = ucVar.f7912a0;
                    if (ncVar != null) {
                        ncVar.a();
                        ucVar.f7912a0 = null;
                        ucVar.U = false;
                    }
                    ucVar.O = str2;
                    ucVar.p();
                }
                ucVar.O = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                ucVar.N = !isEmpty;
                if (isEmpty) {
                    ucVar.P = false;
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
                if (ucVar.N) {
                    ucVar.R = j10;
                    ucVar.Q = j11 - (((float) j10) * f12);
                    ucVar.S = f12;
                    ucVar.T = f13;
                    ucVar.V = f14;
                    float f15 = 0.0f;
                    if (str != null) {
                        StaticLayout staticLayout = new StaticLayout(str, ucVar.L0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        ucVar.M0 = staticLayout;
                        if (staticLayout.getLineCount() > 0) {
                            f10 = ucVar.M0.getLineWidth(0);
                        } else {
                            f10 = 0.0f;
                        }
                        ucVar.N0 = f10;
                        if (ucVar.M0.getLineCount() > 0) {
                            f11 = ucVar.M0.getLineLeft(0);
                        } else {
                            f11 = 0.0f;
                        }
                        ucVar.O0 = f11;
                    } else {
                        ucVar.N0 = 0.0f;
                        ucVar.M0 = null;
                    }
                    if (str4 != null) {
                        StaticLayout staticLayout2 = new StaticLayout(str4, ucVar.P0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        ucVar.Q0 = staticLayout2;
                        if (staticLayout2.getLineCount() > 0) {
                            f7 = ucVar.Q0.getLineWidth(0);
                        } else {
                            f7 = 0.0f;
                        }
                        ucVar.R0 = f7;
                        if (ucVar.Q0.getLineCount() > 0) {
                            f15 = ucVar.Q0.getLineLeft(0);
                        }
                        ucVar.S0 = f15;
                    } else {
                        ucVar.R0 = 0.0f;
                        ucVar.Q0 = null;
                    }
                }
                if (!z10) {
                    z11 = true;
                    ucVar.f7922e0.f(ucVar.N, true);
                } else {
                    z11 = true;
                }
                ucVar.invalidate();
            } else {
                z11 = true;
            }
            if (k8Var.f7223y != null) {
                i81 i81Var2 = new i81();
                this.f6628y = i81Var2;
                i81Var2.f25601y = z11;
                i81Var2.J = new a6.m(this, 15);
                i81Var2.D(Uri.fromFile(new File(k8Var.f7223y)), "other");
                c();
                if (this.e != null && getDuration() > 0) {
                    long duration = k8Var.Z * ((float) getDuration());
                    this.e.L(duration, false);
                    this.F.setProgress(duration);
                }
                z11 = true;
                w(true);
            }
            kc kcVar = ((yb) this).C0;
            mb mbVar = kcVar.f7305v1;
            if (mbVar != null) {
                k8 k8Var2 = kcVar.K1;
                if (k8Var2 != null && k8Var2.f7223y != null) {
                    z12 = z11;
                }
                mbVar.setHasAudio(z12);
            }
        }
    }

    public final void q(MessageObject messageObject) {
        long j10;
        int maxCount;
        k8 k8Var = this.d;
        if (k8Var != null) {
            k8Var.f7195j = true;
            float f7 = 1.0f;
            if (messageObject != null && messageObject.messageOwner != null) {
                TLRPC.Document document = messageObject.getDocument();
                if (document != null && document.f18922id != 0) {
                    this.d.f7225z = new TLRPC.TL_inputDocument();
                    TLRPC.InputDocument inputDocument = this.d.f7225z;
                    inputDocument.f18928id = document.f18922id;
                    inputDocument.file_reference = document.file_reference;
                    inputDocument.access_hash = document.access_hash;
                }
                int i10 = 0;
                if (!TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                    this.d.f7223y = messageObject.messageOwner.attachPath;
                } else {
                    File pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, false, true);
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, true, true);
                        if (pathToAttach != null && pathToAttach.exists()) {
                            this.d.f7223y = pathToAttach.getAbsolutePath();
                        } else {
                            k8 k8Var2 = this.d;
                            k8Var2.f7223y = null;
                            k8Var2.f7225z = null;
                            k8Var2.A = null;
                            k8Var2.B = null;
                            k8Var2.D = 0L;
                            k8Var2.C = 0L;
                            k8Var2.E = 0.0f;
                            k8Var2.F = 1.0f;
                            return;
                        }
                    }
                    this.d.f7223y = pathToAttach.getAbsolutePath();
                }
                k8 k8Var3 = this.d;
                k8Var3.A = null;
                k8Var3.B = null;
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
                k8 k8Var4 = this.d;
                k8Var4.D = 0L;
                if (k8Var4.K) {
                    k8Var4.D = k8Var4.Z * ((float) getDuration());
                }
                this.d.E = 0.0f;
                if (j()) {
                    ArrayList arrayList2 = this.E.h;
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        k8 k8Var5 = ((d0) obj).f6778n;
                        if (k8Var5 != null && k8Var5.K) {
                            j10 = this.E.getDuration();
                            break;
                        }
                    }
                }
                k8 k8Var6 = this.d;
                if (k8Var6.K) {
                    j10 = getDuration();
                } else {
                    j10 = k8Var6.C;
                }
                uc ucVar = this.F;
                if (ucVar == null) {
                    maxCount = 1;
                } else {
                    maxCount = ucVar.getMaxCount();
                }
                k8 k8Var7 = this.d;
                if (k8Var7.C != 0) {
                    f7 = Math.min(1.0f, ((float) Math.min(j10, maxCount * 59000)) / ((float) this.d.C));
                }
                k8Var7.F = f7;
            } else {
                k8Var.f7223y = null;
                k8Var.f7225z = null;
                k8Var.A = null;
                k8Var.B = null;
                k8Var.D = 0L;
                k8Var.C = 0L;
                k8Var.E = 0.0f;
                k8Var.F = 1.0f;
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
        k8 k8Var = this.d;
        int i11 = k8Var.A0;
        Paint paint = this.T;
        if (i11 != 0 && k8Var.B0 != 0) {
            float f7 = i10;
            k8 k8Var2 = this.d;
            int i12 = k8Var2.A0;
            this.U = i12;
            int i13 = k8Var2.B0;
            this.V = i13;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f7, new int[]{i12, i13}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            y71 y71Var = this.f6612n;
            if (y71Var != null) {
                int i14 = this.U;
                int i15 = this.V;
                h00 h00Var = y71Var.f31176b;
                if (h00Var == null) {
                    y71Var.f31179n = i14;
                    y71Var.f31180r = i15;
                } else {
                    h00Var.i(i14, i15);
                }
            }
            jg0 jg0Var = this.f6619s;
            if (jg0Var != null) {
                int i16 = this.U;
                int i17 = this.V;
                h00 h00Var2 = jg0Var.f26009l0;
                if (h00Var2 != null) {
                    h00Var2.i(i16, i17);
                } else {
                    jg0Var.J0 = i16;
                    jg0Var.K0 = i17;
                }
            }
        } else {
            Bitmap bitmap = this.f6596a;
            if (bitmap != null) {
                new k4(this, i10, 1).run(m0.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        }
        invalidate();
    }

    public final void s(k8 k8Var, rg.d2 d2Var, boolean z10) {
        i81 i81Var;
        if (k8Var != null && k8Var.f7205o0 != null) {
            i81 i81Var2 = this.f6626x;
            if (i81Var2 != null) {
                i81Var2.H();
                this.f6626x = null;
            }
            i81 i81Var3 = new i81();
            this.f6626x = i81Var3;
            i81Var3.f25601y = true;
            i81Var3.J = new a6.i(this, 15);
            this.f6626x.D(Uri.fromFile(k8Var.f7205o0), "other");
            c();
            this.f6624w = d2Var;
            if (d2Var != null && (i81Var = this.f6626x) != null) {
                i81Var.V(d2Var.f43992u0);
            }
            this.F.n(k8Var.f7205o0.getAbsolutePath(), k8Var.f7209q0, k8Var.f7211r0, k8Var.f7213s0, k8Var.f7215t0, k8Var.f7217u0, z10);
            y(true);
            return;
        }
        i81 i81Var4 = this.f6626x;
        if (i81Var4 != null) {
            i81Var4.B();
            this.f6626x.H();
            this.f6626x = null;
        }
        uc ucVar = this.F;
        if (ucVar != null) {
            ucVar.setRoundNull(z10);
        }
        this.f6624w = null;
        AndroidUtilities.cancelRunOnUIThread(this.K);
    }

    public void set(k8 k8Var) {
        n(k8Var, null, 0L);
    }

    public void setAllowCropping(boolean z10) {
        this.f6610k0 = z10;
    }

    public void setCollageView(e0 e0Var) {
        this.E = e0Var;
    }

    public void setCropEditorDrawing(i0 i0Var) {
        if (this.A0 != i0Var) {
            this.A0 = i0Var;
            invalidate();
        }
    }

    public void setDraw(boolean z10) {
        this.f6603e0 = z10;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.f6629y0 = runnable;
    }

    public void setVideoTimelineView(uc ucVar) {
        this.F = ucVar;
        if (ucVar != null) {
            ucVar.setDelegate(new ya.c(this, 16));
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8) {
            set(null);
        }
    }

    public final void t(k8 k8Var, Runnable runnable, long j10) {
        org.telegram.ui.Components.la laVar;
        boolean z10;
        ArrayList arrayList;
        org.telegram.ui.Components.ra raVar;
        float f7 = 0.0f;
        if (k8Var != null && !k8Var.v()) {
            i81 i81Var = this.e;
            if (i81Var != null) {
                i81Var.H();
                this.e = null;
            }
            i81 i81Var2 = new i81();
            this.e = i81Var2;
            i81Var2.f25601y = true;
            i81Var2.J = new androidx.biometric.e(this, k8Var, new Runnable[]{runnable});
            y71 y71Var = this.f6612n;
            if (y71Var != null) {
                y71Var.clearAnimation();
                y71 y71Var2 = this.f6612n;
                h00 h00Var = y71Var2.f31176b;
                if (h00Var != null) {
                    h00Var.postRunnable(new e00(h00Var, 0));
                }
                y71Var2.f31175a = null;
                removeView(this.f6612n);
                this.f6612n = null;
            }
            this.f6612n = new y71(getContext(), this.e);
            this.G.e();
            y71 y71Var3 = this.f6612n;
            if (k8Var.f7216u) {
                laVar = null;
            } else {
                laVar = this.G;
            }
            y71Var3.f31181s = laVar;
            h00 h00Var2 = y71Var3.f31176b;
            if (h00Var2 != null && (raVar = h00Var2.I) != null) {
                org.telegram.ui.Components.la laVar2 = raVar.f28487t;
                if (laVar2 != null && laVar2.f26710m != null) {
                    laVar2.f26710m = null;
                }
                raVar.f28487t = laVar;
                if (laVar != null && laVar.f26710m != raVar) {
                    laVar.f26710m = raVar;
                    laVar.d();
                }
            }
            this.f6612n.setOpaque(false);
            b();
            z6 z6Var = this.H;
            if (z6Var != null && z6Var.f8189g) {
                z6Var.a(this.f6612n);
            } else {
                y71 y71Var4 = this.f6612n;
                if (runnable != null) {
                    f7 = 1.0f;
                }
                y71Var4.setAlpha(f7);
                addView(this.f6612n, w7.z5.e(-2, -2, 51));
            }
            bi.o1 o1Var = new bi.o1(this, 13);
            j8 j8Var = k8Var.f7185d1;
            if (j8Var != null) {
                o1Var.run(j8Var);
            } else if (k8Var.K && Build.VERSION.SDK_INT >= 24) {
                Utilities.globalQueue.postRunnable(new f8(k8Var, o1Var, 0));
            } else {
                ?? obj = new Object();
                k8Var.f7185d1 = obj;
                o1Var.run(obj);
            }
            File file = k8Var.Z0;
            if (file == null) {
                file = k8Var.L;
            }
            this.e.D(Uri.fromFile(file), "other");
            this.e.P(this.f6630z0.isEmpty());
            this.e.N(true);
            if (k8Var.h) {
                j10 = (k8Var.Z * ((float) k8Var.f7192h0)) + ((float) j10);
            }
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 > 0) {
                this.e.L(j10, false);
            }
            c();
            w(true);
            if (k8Var.f7216u && (arrayList = k8Var.v) != null && arrayList.size() == 1 && ((MessageObject) k8Var.v.get(0)).type == 5) {
                z10 = true;
            } else {
                z10 = false;
            }
            uc ucVar = this.F;
            File file2 = k8Var.Z0;
            if (file2 == null) {
                file2 = k8Var.L;
            }
            ucVar.o(z10, file2.getAbsolutePath(), getDuration(), k8Var.P);
            this.F.setVideoLeft(k8Var.Z);
            this.F.setVideoRight(k8Var.f7176a0);
            uc ucVar2 = this.F;
            if (ucVar2 != null && i10 > 0) {
                ucVar2.setProgress(j10);
                return;
            }
            return;
        }
        i81 i81Var3 = this.e;
        if (i81Var3 != null) {
            i81Var3.B();
            this.e.H();
            this.e = null;
        }
        z6 z6Var2 = this.H;
        if (z6Var2 != null && z6Var2.f8189g) {
            z6Var2.a(null);
        } else {
            y71 y71Var5 = this.f6612n;
            if (y71Var5 != null) {
                y71Var5.clearAnimation();
                this.f6612n.animate().alpha(0.0f).withEndAction(new x6(this, 6)).start();
            }
        }
        uc ucVar3 = this.F;
        if (ucVar3 != null) {
            ucVar3.o(false, null, 1L, 0.0f);
        }
        AndroidUtilities.cancelRunOnUIThread(this.K);
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    public final void u(k8 k8Var) {
        Drawable drawable = this.S;
        this.R = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (k8Var == null) {
            this.S = null;
            return;
        }
        long j10 = k8Var.f7226z0;
        if (j10 != Long.MIN_VALUE) {
            Drawable e = e(this.S, k8Var.f7175a, j10, k8Var.f7224y0);
            k8Var.f7222x0 = e;
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
        k8 k8Var;
        PointF pointF;
        boolean z11;
        boolean z12;
        if (this.f6610k0) {
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
            boolean z13 = this.f6615p0;
            PointF pointF3 = this.f6611l0;
            if (z13 != z10) {
                pointF3.x = pointF2.x;
                pointF3.y = pointF2.y;
                this.f6613n0 = f7;
                this.f6614o0 = d;
                this.f6615p0 = z10;
            }
            if (this.d != null) {
                float width = k8Var.f7194i0 / getWidth();
                int actionMasked = motionEvent.getActionMasked();
                Matrix matrix = this.f6620s0;
                if (actionMasked == 0) {
                    this.f6622u0 = 0.0f;
                    this.f6623v0 = false;
                    invalidate();
                    this.f6625w0 = true;
                    matrix.set(this.d.f7203n0);
                }
                if (motionEvent.getActionMasked() == 2 && this.f6625w0 && this.d != null) {
                    float f10 = pointF2.x * width;
                    float f11 = pointF2.y * width;
                    float f12 = pointF3.x * width;
                    float f13 = pointF3.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f14 = this.f6613n0;
                        if (f14 != 0.0f) {
                            float f15 = f7 / f14;
                            matrix.postScale(f15, f15, f10, f11);
                        }
                        pointF = pointF2;
                        float degrees = (float) Math.toDegrees(d - this.f6614o0);
                        float f16 = this.f6622u0 + degrees;
                        this.f6622u0 = f16;
                        if (!this.f6618r0) {
                            if (Math.abs(f16) > 20.0f) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.f6618r0 = z11;
                            if (!z11) {
                                d(matrix);
                                if ((Math.round(this.f6602d0 / 90.0f) * 90.0f) - this.f6602d0 > 20.0f) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                this.f6618r0 = z12;
                            }
                            if (!this.f6623v0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.f6623v0 = true;
                            }
                        }
                        if (this.f6618r0) {
                            matrix.postRotate(degrees, f10, f11);
                        }
                        this.f6616q0 = true;
                    } else {
                        pointF = pointF2;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.f6616q0) {
                        matrix.postTranslate(f10 - f12, f11 - f13);
                    }
                    Matrix matrix2 = this.f6621t0;
                    matrix2.set(matrix);
                    Matrix matrix3 = this.W;
                    matrix3.set(matrix);
                    d(matrix3);
                    float round = (Math.round(this.f6602d0 / 90.0f) * 90.0f) - this.f6602d0;
                    if (this.f6618r0) {
                        if (Math.abs(round) < 3.5f) {
                            matrix2.postRotate(round, this.f6599b0, this.f6601c0);
                            if (!this.f6623v0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.f6623v0 = true;
                            }
                        } else {
                            this.f6623v0 = false;
                        }
                    }
                    this.d.f7203n0.set(matrix2);
                    this.d.f7195j = true;
                    b();
                    invalidate();
                } else {
                    pointF = pointF2;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getPointerCount() <= 1) {
                        this.f6616q0 = false;
                        kc kcVar = ((yb) this).C0;
                        kcVar.f7282o1.a(true, false, kcVar.f7264i0);
                        kcVar.f7282o1.b(kcVar.f7246c1.getText());
                    }
                    this.f6625w0 = false;
                    this.f6618r0 = false;
                    this.f6622u0 = 0.0f;
                    this.f6623v0 = false;
                    invalidate();
                }
                PointF pointF4 = pointF;
                pointF3.x = pointF4.x;
                pointF3.y = pointF4.y;
                this.f6613n0 = f7;
                this.f6614o0 = d;
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
        throw new UnsupportedOperationException("Method not decompiled: di.a7.w(boolean):void");
    }

    public final void x(int i10, boolean z10) {
        HashSet hashSet = this.f6630z0;
        if (z10) {
            hashSet.add(Integer.valueOf(i10));
        } else {
            hashSet.remove(Integer.valueOf(i10));
        }
        i81 i81Var = this.e;
        if (i81Var != null) {
            i81Var.P(hashSet.isEmpty());
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
        if (this.f6626x != null && this.d != null) {
            boolean z12 = true;
            if (this.e == null && !j()) {
                this.f6626x.P(this.f6630z0.isEmpty());
                this.f6626x.N(true);
                rg.d2 d2Var = this.f6624w;
                if (d2Var != null && !d2Var.B0) {
                    d2Var.B0 = true;
                    d2Var.C0.f(true, true);
                    d2Var.invalidate();
                }
                long n11 = this.f6626x.n();
                if (z10 && this.f6626x.p() != -9223372036854775807L) {
                    float p5 = ((float) n11) / ((float) this.f6626x.p());
                    k8 k8Var = this.d;
                    if ((p5 < k8Var.f7213s0 || p5 > k8Var.f7215t0) && System.currentTimeMillis() - this.J > 500) {
                        this.J = System.currentTimeMillis();
                        this.f6626x.L(-this.d.f7211r0, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (j()) {
                n10 = this.E.getPositionWithOffset();
                y3 = this.E.f6877q0;
            } else {
                n10 = this.e.n();
                y3 = this.e.y();
            }
            k8 k8Var2 = this.d;
            float f10 = k8Var2.f7215t0;
            float f11 = k8Var2.f7213s0;
            long j10 = (f10 - f11) * ((float) k8Var2.f7209q0);
            long j11 = k8Var2.f7211r0;
            if (n10 >= j11 && n10 <= j10 + j11) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!y3 || !z11) {
                z12 = false;
            }
            long j12 = (n10 - j11) + (f11 * f7);
            rg.d2 d2Var2 = this.f6624w;
            if (d2Var2 != null && d2Var2.B0 != z11) {
                d2Var2.B0 = z11;
                d2Var2.invalidate();
            }
            if (this.f6626x.y() != z12) {
                this.f6626x.P(z12);
                this.f6626x.L(j12, false);
            } else if (z10) {
                long abs = Math.abs(this.f6626x.n() - j12);
                if (j()) {
                    i10 = 300;
                } else {
                    i10 = 120;
                }
                if (abs > i10) {
                    this.f6626x.L(j12, false);
                }
            }
        }
    }
}
