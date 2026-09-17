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
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.vz;
public abstract class d7 extends FrameLayout {
    public static final int B0 = 0;
    public j0 A0;
    public e0 E;
    public zc F;
    public final org.telegram.ui.Components.ha G;
    public final c7 H;
    public long I;
    public long J;
    public final a7 K;
    public final a7 L;
    public final a7 M;
    public ka N;
    public boolean O;
    public final org.telegram.ui.Components.c6 P;
    public final Paint Q;
    public Drawable R;
    public Drawable S;
    public final Paint T;
    public int U;
    public int V;
    public final Matrix W;
    public Bitmap f4504a;
    public final float[] f4505a0;
    public final Rect f4506b;
    public float f4507b0;
    public final Rect f4508c;
    public float f4509c0;
    public o8 d;
    public float f4510d0;
    public h71 e;
    public boolean f4511e0;
    public int f4512f;
    public final org.telegram.ui.Components.c6 f4513f0;
    public boolean f4514g0;
    public int h;
    public final Matrix f4515h0;
    public final Matrix f4516i0;
    public final Matrix f4517j0;
    public boolean f4518k0;
    public final PointF f4519l0;
    public final PointF m0;
    public v61 f4520n;
    public float f4521n0;
    public double f4522o0;
    public boolean f4523p0;
    public boolean f4524q0;
    public TextureView f4525r;
    public boolean f4526r0;
    public jf0 f4527s;
    public final Matrix f4528s0;
    public final Matrix f4529t0;
    public float f4530u0;
    public ka v;
    public boolean f4531v0;
    public qg.e2 f4532w;
    public boolean f4533w0;
    public h71 f4534x;
    public long f4535x0;
    public h71 f4536y;
    public Runnable f4537y0;
    public final HashSet f4538z0;

    public d7(Context context, org.telegram.ui.Components.ha haVar, c7 c7Var) {
        super(context);
        this.f4506b = new Rect();
        this.f4508c = new Rect();
        Paint paint = new Paint(1);
        new a7(this, 2);
        this.K = new a7(this, 3);
        this.L = new a7(this, 4);
        this.M = new a7(this, 5);
        this.P = new org.telegram.ui.Components.c6(this, 0L, 350L, qr.h);
        this.Q = new Paint(7);
        this.T = new Paint(1);
        this.W = new Matrix();
        this.f4505a0 = new float[2];
        this.f4511e0 = true;
        this.f4513f0 = new org.telegram.ui.Components.c6(this, 0L, 320L, qr.f27381g);
        this.f4514g0 = false;
        this.f4515h0 = new Matrix();
        this.f4516i0 = new Matrix();
        this.f4517j0 = new Matrix();
        this.f4518k0 = true;
        this.f4519l0 = new PointF();
        this.m0 = new PointF();
        this.f4528s0 = new Matrix();
        this.f4529t0 = new Matrix();
        this.f4538z0 = new HashSet();
        this.G = haVar;
        this.H = c7Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 1073741824);
    }

    public static void a(ci.d7 r13, ci.o8 r14) {
        throw new UnsupportedOperationException("Method not decompiled: ci.d7.a(ci.d7, ci.o8):void");
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
        throw new UnsupportedOperationException("Method not decompiled: ci.d7.f(android.graphics.drawable.Drawable, int, org.telegram.tgnet.TLRPC$WallPaper, boolean):android.graphics.drawable.Drawable");
    }

    public static Drawable g(int i10, final org.telegram.ui.ActionBar.e4 e4Var, final boolean z10) {
        if (e4Var.m()) {
            org.telegram.ui.ActionBar.j6.H(org.telegram.ui.ActionBar.e4.e(z10), e4Var.h(i10, z10 ? 1 : 0), ((org.telegram.ui.ActionBar.d4) e4Var.f18620f.get(z10 ? 1 : 0)).f18578g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray h = e4Var.h(i10, z10 ? 1 : 0);
        int i11 = org.telegram.ui.ActionBar.j6.Nd;
        int i12 = h.get(i11, org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        int i13 = org.telegram.ui.ActionBar.j6.Od;
        int i14 = h.get(i13, org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        int i15 = org.telegram.ui.ActionBar.j6.Pd;
        int i16 = h.get(i15, org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        int i17 = org.telegram.ui.ActionBar.j6.Qd;
        int i18 = h.get(i17, org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        final cc0 cc0Var = new cc0();
        cc0Var.f23003g = false;
        cc0Var.t(cc0Var.f23016u, e4Var.k(z10 ? 1 : 0).settings.intensity);
        cc0Var.o(i12, i14, i16, i18, 0, true);
        cc0Var.v(0);
        final int f7 = cc0Var.f();
        e4Var.o(z10 ? 1 : 0, new ResultCallback() {
            @Override
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair != null) {
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((dg.a) pair.second).f7727b;
                    org.telegram.ui.ActionBar.e4 e4Var2 = org.telegram.ui.ActionBar.e4.this;
                    if (longValue == e4Var2.i(z10 ? 1 : 0) && bitmap != null) {
                        int i19 = e4Var2.k(z10 ? 1 : 0).settings.intensity;
                        cc0 cc0Var2 = cc0Var;
                        cc0Var2.t(bitmap, i19);
                        cc0Var2.u(f7);
                        cc0Var2.s(1.0f);
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
        return cc0Var;
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
        Utilities.searchQueue.postRunnable(new ai.ba(20, this, o8Var));
    }

    public abstract void b();

    public final void c() {
        float f7;
        float f10;
        o8 o8Var;
        h71 h71Var = this.e;
        float f11 = 0.0f;
        if (h71Var != null) {
            if (!this.O && ((o8Var = this.d) == null || !o8Var.Y)) {
                if (o8Var != null) {
                    f10 = o8Var.P;
                } else {
                    f10 = 1.0f;
                }
            } else {
                f10 = 0.0f;
            }
            h71Var.W(f10);
        }
        h71 h71Var2 = this.f4534x;
        if (h71Var2 != null) {
            if (this.O) {
                f7 = 0.0f;
            } else {
                o8 o8Var2 = this.d;
                if (o8Var2 != null) {
                    f7 = o8Var2.f5184u0;
                } else {
                    f7 = 1.0f;
                }
            }
            h71Var2.W(f7);
        }
        h71 h71Var3 = this.f4536y;
        if (h71Var3 != null) {
            if (!this.O) {
                o8 o8Var3 = this.d;
                if (o8Var3 != null) {
                    f11 = o8Var3.G;
                } else {
                    f11 = 1.0f;
                }
            }
            h71Var3.W(f11);
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
        float[] fArr = this.f4505a0;
        fArr[0] = o8Var.f5165k0 / 2.0f;
        fArr[1] = o8Var.f5167l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f4507b0 = fArr[0];
        this.f4509c0 = fArr[1];
        o8 o8Var2 = this.d;
        fArr[0] = o8Var2.f5165k0;
        fArr[1] = o8Var2.f5167l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f4510d0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.f4509c0, fArr[0] - this.f4507b0));
        v7.z6.a(this.f4507b0, this.f4509c0, fArr[0], fArr[1]);
        o8 o8Var3 = this.d;
        fArr[0] = o8Var3.f5165k0 / 2.0f;
        fArr[1] = o8Var3.f5167l0;
        matrix.mapPoints(fArr);
        v7.z6.a(this.f4507b0, this.f4509c0, fArr[0], fArr[1]);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        o8 o8Var;
        MediaController.CropState cropState;
        if (this.S != null) {
            float f7 = 0.0f;
            if (this.f4514g0) {
                Path path = new Path();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.S;
            if (!(drawable instanceof cc0) || ((cc0) drawable).f23016u != null) {
                f7 = this.P.d(1.0f, false);
            }
            Drawable drawable2 = this.R;
            if (drawable2 != null && f7 < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - f7) * 255.0f));
                o8.j(canvas, this.R, getWidth(), getHeight());
            }
            this.S.setAlpha((int) (f7 * 255.0f));
            o8.j(canvas, this.S, getWidth(), getHeight());
            if (this.f4514g0) {
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
        } else if (this.f4511e0 && this.d != null && !j()) {
            if (this.f4504a == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e = this.f4513f0.e(z10);
            if (this.f4504a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.f5161i0, getHeight() / this.d.f5163j0);
                canvas2.concat(this.d.f5170n0);
                if (this.d.m0 != null) {
                    canvas2.translate(o8Var.f5165k0 / 2.0f, o8Var.f5167l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    o8 o8Var2 = this.d;
                    int i10 = o8Var2.f5165k0;
                    int i11 = o8Var2.f5167l0;
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
                    canvas2.translate((-o8Var3.f5165k0) / 2.0f, (-o8Var3.f5167l0) / 2.0f);
                }
                Paint paint = this.Q;
                paint.setAlpha((int) ((1.0f - e) * 255.0f));
                int width = this.f4504a.getWidth();
                int height = this.f4504a.getHeight();
                Rect rect = this.f4506b;
                rect.set(0, 0, width, height);
                o8 o8Var4 = this.d;
                int i13 = o8Var4.f5165k0;
                int i14 = o8Var4.f5167l0;
                Rect rect2 = this.f4508c;
                rect2.set(0, 0, i13, i14);
                canvas2.drawBitmap(this.f4504a, rect, rect2, paint);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: ci.d7.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        o8 o8Var;
        o8 o8Var2;
        v61 v61Var = this.f4520n;
        if (view == v61Var && (o8Var2 = this.d) != null && o8Var2.f5183u) {
            return false;
        }
        if ((view == v61Var || view == this.f4525r) && (o8Var = this.d) != null && o8Var.m0 != null) {
            canvas.save();
            canvas.scale(getWidth() / this.d.f5161i0, getHeight() / this.d.f5163j0);
            canvas.concat(this.d.f5170n0);
            o8 o8Var3 = this.d;
            if (o8Var3.m0 != null) {
                canvas.translate(o8Var3.f5165k0 / 2.0f, o8Var3.f5167l0 / 2.0f);
                canvas.rotate(-this.d.Q);
                o8 o8Var4 = this.d;
                int i10 = o8Var4.f5165k0;
                int i11 = o8Var4.f5167l0;
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
                canvas.translate((-o8Var5.f5165k0) / 2.0f, (-o8Var5.f5167l0) / 2.0f);
            }
            canvas.concat(this.f4515h0);
            canvas.scale(1.0f / (getWidth() / this.d.f5161i0), 1.0f / (getHeight() / this.d.f5163j0));
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
        return o8Var.f5167l0;
    }

    public int getContentWidth() {
        o8 o8Var = this.d;
        if (o8Var == null) {
            return 1;
        }
        return o8Var.f5165k0;
    }

    public long getCurrentPosition() {
        h71 h71Var = this.e;
        if (h71Var != null) {
            return h71Var.n();
        }
        h71 h71Var2 = this.f4534x;
        if (h71Var2 != null) {
            return h71Var2.n();
        }
        h71 h71Var3 = this.f4536y;
        if (h71Var3 != null) {
            return h71Var3.n();
        }
        return 0L;
    }

    public long getDuration() {
        o8 o8Var = this.d;
        if (o8Var != null) {
            double d = o8Var.f5160i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        h71 h71Var = this.e;
        if (h71Var != null && h71Var.p() != -9223372036854775807L) {
            return this.e.p();
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
        return new Pair<>(Integer.valueOf(this.d.f5161i0), Integer.valueOf(this.d.f5163j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.f4504a;
    }

    public v61 getTextureView() {
        return this.f4520n;
    }

    public final void h(Utilities.Callback callback, View... viewArr) {
        v61 v61Var;
        int dp = (int) (AndroidUtilities.dp(26.0f) * AndroidUtilities.density);
        int dp2 = (int) (AndroidUtilities.dp(30.33f) * AndroidUtilities.density);
        int dp3 = (int) (AndroidUtilities.dp(4.0f) * AndroidUtilities.density);
        Bitmap[] bitmapArr = new Bitmap[viewArr.length];
        for (int i10 = 0; i10 < viewArr.length; i10++) {
            View view = viewArr[i10];
            if (view != null && view.getWidth() >= 0 && viewArr[i10].getHeight() > 0) {
                View view2 = viewArr[i10];
                if (view2 == this && (v61Var = this.f4520n) != null) {
                    bitmapArr[i10] = v61Var.getBitmap();
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
        Utilities.globalQueue.postRunnable(new y6(dp, dp2, dp3, bitmapArr, callback));
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
        return !this.f4538z0.contains(-9982);
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
                o8Var.z(new a7((cc) this, 0));
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
        h71 h71Var = this.e;
        if (h71Var != null) {
            h71Var.L(j3, false);
        } else if (j()) {
            this.E.m(j3, false);
        } else {
            h71 h71Var2 = this.f4534x;
            if (h71Var2 != null) {
                h71Var2.L(j3, false);
            } else {
                h71 h71Var3 = this.f4536y;
                if (h71Var3 != null) {
                    h71Var3.L(j3, false);
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
                o8Var.z(new a7(this, 1));
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
        TextureView textureView2 = this.f4525r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.f4525r = null;
        }
        this.f4527s = jf0Var;
        this.f4525r = textureView;
        if (jf0Var != null) {
            int i10 = this.U;
            int i11 = this.V;
            vz vzVar = jf0Var.f25247l0;
            if (vzVar != null) {
                vzVar.i(i10, i11);
            } else {
                jf0Var.J0 = i10;
                jf0Var.K0 = i11;
            }
        }
        TextureView textureView3 = this.f4525r;
        if (textureView3 != null) {
            addView(textureView3);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f4518k0) {
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
        h71 h71Var = this.f4536y;
        if (h71Var != null) {
            h71Var.B();
            this.f4536y.H();
            this.f4536y = null;
        }
        if (o8Var != null) {
            zc zcVar = this.F;
            boolean z12 = false;
            if (zcVar != null) {
                String str2 = o8Var.f5190y;
                String str3 = o8Var.A;
                String str4 = o8Var.B;
                long j3 = o8Var.C;
                long j10 = o8Var.D;
                float f12 = o8Var.E;
                float f13 = o8Var.F;
                float f14 = o8Var.G;
                if (!TextUtils.equals(zcVar.O, str2)) {
                    rc rcVar = zcVar.f5884a0;
                    if (rcVar != null) {
                        rcVar.a();
                        zcVar.f5884a0 = null;
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
                    zcVar.f5894e0.f(zcVar.N, true);
                } else {
                    z11 = true;
                }
                zcVar.invalidate();
            } else {
                z11 = true;
            }
            if (o8Var.f5190y != null) {
                h71 h71Var2 = new h71();
                this.f4536y = h71Var2;
                h71Var2.f24542y = z11;
                h71Var2.J = new a6.i(this, 12);
                h71Var2.D(Uri.fromFile(new File(o8Var.f5190y)), "other");
                c();
                if (this.e != null && getDuration() > 0) {
                    long duration = o8Var.Z * ((float) getDuration());
                    this.e.L(duration, false);
                    this.F.setProgress(duration);
                }
                w(true);
            }
            oc ocVar = ((cc) this).C0;
            qb qbVar = ocVar.f5272v1;
            if (qbVar != null) {
                o8 o8Var2 = ocVar.K1;
                if (o8Var2 != null && o8Var2.f5190y != null) {
                    z12 = true;
                }
                qbVar.setHasAudio(z12);
            }
        }
    }

    public final void q(MessageObject messageObject) {
        long j3;
        int maxCount;
        o8 o8Var = this.d;
        if (o8Var != null) {
            o8Var.f5162j = true;
            float f7 = 1.0f;
            if (messageObject != null && messageObject.messageOwner != null) {
                TLRPC.Document document = messageObject.getDocument();
                if (document != null && document.f18127id != 0) {
                    this.d.f5192z = new TLRPC.TL_inputDocument();
                    TLRPC.InputDocument inputDocument = this.d.f5192z;
                    inputDocument.f18133id = document.f18127id;
                    inputDocument.file_reference = document.file_reference;
                    inputDocument.access_hash = document.access_hash;
                }
                int i10 = 0;
                if (!TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                    this.d.f5190y = messageObject.messageOwner.attachPath;
                } else {
                    File pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, false, true);
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, true, true);
                        if (pathToAttach != null && pathToAttach.exists()) {
                            this.d.f5190y = pathToAttach.getAbsolutePath();
                        } else {
                            o8 o8Var2 = this.d;
                            o8Var2.f5190y = null;
                            o8Var2.f5192z = null;
                            o8Var2.A = null;
                            o8Var2.B = null;
                            o8Var2.D = 0L;
                            o8Var2.C = 0L;
                            o8Var2.E = 0.0f;
                            o8Var2.F = 1.0f;
                            return;
                        }
                    }
                    this.d.f5190y = pathToAttach.getAbsolutePath();
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
                        o8 o8Var5 = ((d0) obj).f4474n;
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
                o8Var.f5190y = null;
                o8Var.f5192z = null;
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
            v61 v61Var = this.f4520n;
            if (v61Var != null) {
                int i14 = this.U;
                int i15 = this.V;
                vz vzVar = v61Var.f28637b;
                if (vzVar == null) {
                    v61Var.f28640n = i14;
                    v61Var.f28641r = i15;
                } else {
                    vzVar.i(i14, i15);
                }
            }
            jf0 jf0Var = this.f4527s;
            if (jf0Var != null) {
                int i16 = this.U;
                int i17 = this.V;
                vz vzVar2 = jf0Var.f25247l0;
                if (vzVar2 != null) {
                    vzVar2.i(i16, i17);
                } else {
                    jf0Var.J0 = i16;
                    jf0Var.K0 = i17;
                }
            }
        } else {
            Bitmap bitmap = this.f4504a;
            if (bitmap != null) {
                new b7(this, i10, 0).run(n0.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        }
        invalidate();
    }

    public final void s(o8 o8Var, qg.e2 e2Var, boolean z10) {
        h71 h71Var;
        if (o8Var != null && o8Var.f5172o0 != null) {
            h71 h71Var2 = this.f4534x;
            if (h71Var2 != null) {
                h71Var2.H();
                this.f4534x = null;
            }
            h71 h71Var3 = new h71();
            this.f4534x = h71Var3;
            h71Var3.f24542y = true;
            h71Var3.J = new a6.m(this, 12);
            this.f4534x.D(Uri.fromFile(o8Var.f5172o0), "other");
            c();
            this.f4532w = e2Var;
            if (e2Var != null && (h71Var = this.f4534x) != null) {
                h71Var.V(e2Var.f41369u0);
            }
            this.F.n(o8Var.f5172o0.getAbsolutePath(), o8Var.f5176q0, o8Var.f5178r0, o8Var.f5180s0, o8Var.f5182t0, o8Var.f5184u0, z10);
            y(true);
            return;
        }
        h71 h71Var4 = this.f4534x;
        if (h71Var4 != null) {
            h71Var4.B();
            this.f4534x.H();
            this.f4534x = null;
        }
        zc zcVar = this.F;
        if (zcVar != null) {
            zcVar.setRoundNull(z10);
        }
        this.f4532w = null;
        AndroidUtilities.cancelRunOnUIThread(this.K);
    }

    public void set(o8 o8Var) {
        n(o8Var, null, 0L);
    }

    public void setAllowCropping(boolean z10) {
        this.f4518k0 = z10;
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
        this.f4511e0 = z10;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.f4537y0 = runnable;
    }

    public void setVideoTimelineView(zc zcVar) {
        this.F = zcVar;
        if (zcVar != null) {
            zcVar.setDelegate(new a4.m(this, 9));
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
        org.telegram.ui.Components.ha haVar;
        boolean z10;
        ArrayList arrayList;
        org.telegram.ui.Components.na naVar;
        float f7 = 0.0f;
        if (o8Var != null && !o8Var.v()) {
            h71 h71Var = this.e;
            if (h71Var != null) {
                h71Var.H();
                this.e = null;
            }
            h71 h71Var2 = new h71();
            this.e = h71Var2;
            h71Var2.f24542y = true;
            h71Var2.J = new aa.a(this, o8Var, new Runnable[]{runnable});
            v61 v61Var = this.f4520n;
            if (v61Var != null) {
                v61Var.clearAnimation();
                v61 v61Var2 = this.f4520n;
                vz vzVar = v61Var2.f28637b;
                if (vzVar != null) {
                    vzVar.postRunnable(new sz(vzVar, 0));
                }
                v61Var2.f28636a = null;
                removeView(this.f4520n);
                this.f4520n = null;
            }
            this.f4520n = new v61(getContext(), this.e);
            this.G.e();
            v61 v61Var3 = this.f4520n;
            if (o8Var.f5183u) {
                haVar = null;
            } else {
                haVar = this.G;
            }
            v61Var3.f28642s = haVar;
            vz vzVar2 = v61Var3.f28637b;
            if (vzVar2 != null && (naVar = vzVar2.I) != null) {
                org.telegram.ui.Components.ha haVar2 = naVar.f26422t;
                if (haVar2 != null && haVar2.f24615m != null) {
                    haVar2.f24615m = null;
                }
                naVar.f26422t = haVar;
                if (haVar != null && haVar.f24615m != naVar) {
                    haVar.f24615m = naVar;
                    haVar.d();
                }
            }
            this.f4520n.setOpaque(false);
            b();
            c7 c7Var = this.H;
            if (c7Var != null && c7Var.f4434g) {
                c7Var.a(this.f4520n);
            } else {
                v61 v61Var4 = this.f4520n;
                if (runnable != null) {
                    f7 = 1.0f;
                }
                v61Var4.setAlpha(f7);
                addView(this.f4520n, w7.x5.e(-2, -2, 51));
            }
            ai.y1 y1Var = new ai.y1(this, 11);
            n8 n8Var = o8Var.f5152d1;
            if (n8Var != null) {
                y1Var.run(n8Var);
            } else if (o8Var.K && Build.VERSION.SDK_INT >= 24) {
                Utilities.globalQueue.postRunnable(new j8(o8Var, y1Var, 0));
            } else {
                ?? obj = new Object();
                o8Var.f5152d1 = obj;
                y1Var.run(obj);
            }
            File file = o8Var.Z0;
            if (file == null) {
                file = o8Var.L;
            }
            this.e.D(Uri.fromFile(file), "other");
            this.e.P(this.f4538z0.isEmpty());
            this.e.N(true);
            if (o8Var.h) {
                j3 = (o8Var.Z * ((float) o8Var.f5159h0)) + ((float) j3);
            }
            int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i10 > 0) {
                this.e.L(j3, false);
            }
            c();
            w(true);
            if (o8Var.f5183u && (arrayList = o8Var.v) != null && arrayList.size() == 1 && ((MessageObject) o8Var.v.get(0)).type == 5) {
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
            this.F.setVideoRight(o8Var.f5143a0);
            zc zcVar2 = this.F;
            if (zcVar2 != null && i10 > 0) {
                zcVar2.setProgress(j3);
                return;
            }
            return;
        }
        h71 h71Var3 = this.e;
        if (h71Var3 != null) {
            h71Var3.B();
            this.e.H();
            this.e = null;
        }
        c7 c7Var2 = this.H;
        if (c7Var2 != null && c7Var2.f4434g) {
            c7Var2.a(null);
        } else {
            v61 v61Var5 = this.f4520n;
            if (v61Var5 != null) {
                v61Var5.clearAnimation();
                this.f4520n.animate().alpha(0.0f).withEndAction(new a7(this, 6)).start();
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
        long j3 = o8Var.f5193z0;
        if (j3 != Long.MIN_VALUE) {
            Drawable e = e(this.S, o8Var.f5142a, j3, o8Var.f5191y0);
            o8Var.f5189x0 = e;
            this.S = e;
            if (this.R != e) {
                this.R = null;
            }
            if (e != null) {
                e.setCallback(this);
            }
            org.telegram.ui.Components.ha haVar = this.G;
            if (haVar != null) {
                Drawable drawable2 = this.S;
                if (drawable2 != null) {
                    if (drawable2 instanceof BitmapDrawable) {
                        haVar.f(((BitmapDrawable) drawable2).getBitmap(), false);
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
                        haVar.f(createBitmap, true);
                    }
                } else {
                    haVar.f(null, false);
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
        if (this.f4518k0) {
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
            boolean z13 = this.f4523p0;
            PointF pointF3 = this.f4519l0;
            if (z13 != z10) {
                pointF3.x = pointF2.x;
                pointF3.y = pointF2.y;
                this.f4521n0 = f7;
                this.f4522o0 = d;
                this.f4523p0 = z10;
            }
            o8 o8Var = this.d;
            if (o8Var != null) {
                float width = o8Var.f5161i0 / getWidth();
                int actionMasked = motionEvent.getActionMasked();
                Matrix matrix = this.f4528s0;
                if (actionMasked == 0) {
                    this.f4530u0 = 0.0f;
                    this.f4531v0 = false;
                    invalidate();
                    this.f4533w0 = true;
                    matrix.set(this.d.f5170n0);
                }
                if (motionEvent.getActionMasked() == 2 && this.f4533w0 && this.d != null) {
                    float f10 = pointF2.x * width;
                    float f11 = pointF2.y * width;
                    float f12 = pointF3.x * width;
                    float f13 = pointF3.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f14 = this.f4521n0;
                        if (f14 != 0.0f) {
                            float f15 = f7 / f14;
                            matrix.postScale(f15, f15, f10, f11);
                        }
                        pointF = pointF2;
                        float degrees = (float) Math.toDegrees(d - this.f4522o0);
                        float f16 = this.f4530u0 + degrees;
                        this.f4530u0 = f16;
                        if (!this.f4526r0) {
                            if (Math.abs(f16) > 20.0f) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.f4526r0 = z11;
                            if (!z11) {
                                d(matrix);
                                if ((Math.round(this.f4510d0 / 90.0f) * 90.0f) - this.f4510d0 > 20.0f) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                this.f4526r0 = z12;
                            }
                            if (!this.f4531v0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.f4531v0 = true;
                            }
                        }
                        if (this.f4526r0) {
                            matrix.postRotate(degrees, f10, f11);
                        }
                        this.f4524q0 = true;
                    } else {
                        pointF = pointF2;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.f4524q0) {
                        matrix.postTranslate(f10 - f12, f11 - f13);
                    }
                    Matrix matrix2 = this.f4529t0;
                    matrix2.set(matrix);
                    Matrix matrix3 = this.W;
                    matrix3.set(matrix);
                    d(matrix3);
                    float round = (Math.round(this.f4510d0 / 90.0f) * 90.0f) - this.f4510d0;
                    if (this.f4526r0) {
                        if (Math.abs(round) < 3.5f) {
                            matrix2.postRotate(round, this.f4507b0, this.f4509c0);
                            if (!this.f4531v0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.f4531v0 = true;
                            }
                        } else {
                            this.f4531v0 = false;
                        }
                    }
                    this.d.f5170n0.set(matrix2);
                    this.d.f5162j = true;
                    b();
                    invalidate();
                } else {
                    pointF = pointF2;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getPointerCount() <= 1) {
                        this.f4524q0 = false;
                        oc ocVar = ((cc) this).C0;
                        ocVar.f5249o1.a(true, false, ocVar.f5231i0);
                        ocVar.f5249o1.b(ocVar.f5213c1.getText());
                    }
                    this.f4533w0 = false;
                    this.f4526r0 = false;
                    this.f4530u0 = 0.0f;
                    this.f4531v0 = false;
                    invalidate();
                }
                PointF pointF4 = pointF;
                pointF3.x = pointF4.x;
                pointF3.y = pointF4.y;
                this.f4521n0 = f7;
                this.f4522o0 = d;
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
        throw new UnsupportedOperationException("Method not decompiled: ci.d7.w(boolean):void");
    }

    public final void x(int i10, boolean z10) {
        HashSet hashSet = this.f4538z0;
        if (z10) {
            hashSet.add(Integer.valueOf(i10));
        } else {
            hashSet.remove(Integer.valueOf(i10));
        }
        h71 h71Var = this.e;
        if (h71Var != null) {
            h71Var.P(hashSet.isEmpty());
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
        if (this.f4534x != null && this.d != null) {
            boolean z12 = true;
            if (this.e == null && !j()) {
                this.f4534x.P(this.f4538z0.isEmpty());
                this.f4534x.N(true);
                qg.e2 e2Var = this.f4532w;
                if (e2Var != null && !e2Var.B0) {
                    e2Var.B0 = true;
                    e2Var.C0.f(true, true);
                    e2Var.invalidate();
                }
                long n11 = this.f4534x.n();
                if (z10 && this.f4534x.p() != -9223372036854775807L) {
                    float p5 = ((float) n11) / ((float) this.f4534x.p());
                    o8 o8Var = this.d;
                    if ((p5 < o8Var.f5180s0 || p5 > o8Var.f5182t0) && System.currentTimeMillis() - this.J > 500) {
                        this.J = System.currentTimeMillis();
                        this.f4534x.L(-this.d.f5178r0, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (j()) {
                n10 = this.E.getPositionWithOffset();
                y3 = this.E.f4574q0;
            } else {
                n10 = this.e.n();
                y3 = this.e.y();
            }
            o8 o8Var2 = this.d;
            float f10 = o8Var2.f5182t0;
            float f11 = o8Var2.f5180s0;
            long j3 = (f10 - f11) * ((float) o8Var2.f5176q0);
            long j10 = o8Var2.f5178r0;
            if (n10 >= j10 && n10 <= j3 + j10) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = (y3 && z11) ? false : false;
            long j11 = (n10 - j10) + (f11 * f7);
            qg.e2 e2Var2 = this.f4532w;
            if (e2Var2 != null && e2Var2.B0 != z11) {
                e2Var2.B0 = z11;
                e2Var2.invalidate();
            }
            if (this.f4534x.y() != z12) {
                this.f4534x.P(z12);
                this.f4534x.L(j11, false);
            } else if (z10) {
                long abs = Math.abs(this.f4534x.n() - j11);
                if (j()) {
                    i10 = 300;
                } else {
                    i10 = 120;
                }
                if (abs > i10) {
                    this.f4534x.L(j11, false);
                }
            }
        }
    }
}
