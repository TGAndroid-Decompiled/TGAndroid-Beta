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
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.Components.t71;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.yz;
public abstract class b7 extends FrameLayout {
    public static final int B0 = 0;
    public j0 A0;
    public e0 E;
    public vc F;
    public final org.telegram.ui.Components.ka G;
    public final a7 H;
    public long I;
    public long J;
    public final z6 K;
    public final z6 L;
    public final z6 M;
    public ga N;
    public boolean O;
    public final org.telegram.ui.Components.e6 P;
    public final Paint Q;
    public Drawable R;
    public Drawable S;
    public final Paint T;
    public int U;
    public int V;
    public final Matrix W;
    public Bitmap f4737a;
    public final float[] f4738a0;
    public final Rect f4739b;
    public float f4740b0;
    public final Rect f4741c;
    public float f4742c0;
    public k8 d;
    public float f4743d0;
    public d81 f4744e;
    public boolean f4745e0;
    public int f4746f;
    public final org.telegram.ui.Components.e6 f4747f0;
    public boolean f4748g0;
    public int h;
    public final Matrix f4749h0;
    public final Matrix f4750i0;
    public final Matrix f4751j0;
    public boolean f4752k0;
    public final PointF f4753l0;
    public final PointF m0;
    public t71 f4754n;
    public float f4755n0;
    public double f4756o0;
    public boolean f4757p0;
    public boolean f4758q0;
    public TextureView f4759r;
    public boolean f4760r0;
    public vf0 f4761s;
    public final Matrix f4762s0;
    public final Matrix f4763t0;
    public float f4764u0;
    public ga v;
    public boolean f4765v0;
    public qg.b2 f4766w;
    public boolean f4767w0;
    public d81 f4768x;
    public long f4769x0;
    public d81 f4770y;
    public Runnable f4771y0;
    public final HashSet f4772z0;

    public b7(Context context, org.telegram.ui.Components.ka kaVar, a7 a7Var) {
        super(context);
        this.f4739b = new Rect();
        this.f4741c = new Rect();
        Paint paint = new Paint(1);
        new z6(this, 2);
        this.K = new z6(this, 3);
        this.L = new z6(this, 4);
        this.M = new z6(this, 5);
        this.P = new org.telegram.ui.Components.e6(this, 0L, 350L, tr.h);
        this.Q = new Paint(7);
        this.T = new Paint(1);
        this.W = new Matrix();
        this.f4738a0 = new float[2];
        this.f4745e0 = true;
        this.f4747f0 = new org.telegram.ui.Components.e6(this, 0L, 320L, tr.f31141g);
        this.f4748g0 = false;
        this.f4749h0 = new Matrix();
        this.f4750i0 = new Matrix();
        this.f4751j0 = new Matrix();
        this.f4752k0 = true;
        this.f4753l0 = new PointF();
        this.m0 = new PointF();
        this.f4762s0 = new Matrix();
        this.f4763t0 = new Matrix();
        this.f4772z0 = new HashSet();
        this.G = kaVar;
        this.H = a7Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 1073741824);
    }

    public static void a(ci.b7 r13, ci.k8 r14) {
        throw new UnsupportedOperationException("Method not decompiled: ci.b7.a(ci.b7, ci.k8):void");
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

    public static Drawable g(int i10, final org.telegram.ui.ActionBar.c4 c4Var, final boolean z10) {
        if (c4Var.m()) {
            org.telegram.ui.ActionBar.i6.H(org.telegram.ui.ActionBar.c4.e(z10), c4Var.h(i10, z10 ? 1 : 0), ((org.telegram.ui.ActionBar.b4) c4Var.f20503f.get(z10 ? 1 : 0)).f20454g, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray h = c4Var.h(i10, z10 ? 1 : 0);
        int i11 = org.telegram.ui.ActionBar.i6.Nd;
        int i12 = h.get(i11, org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        int i13 = org.telegram.ui.ActionBar.i6.Od;
        int i14 = h.get(i13, org.telegram.ui.ActionBar.i6.w0(null, i13, false));
        int i15 = org.telegram.ui.ActionBar.i6.Pd;
        int i16 = h.get(i15, org.telegram.ui.ActionBar.i6.w0(null, i15, false));
        int i17 = org.telegram.ui.ActionBar.i6.Qd;
        int i18 = h.get(i17, org.telegram.ui.ActionBar.i6.w0(null, i17, false));
        final pc0 pc0Var = new pc0();
        pc0Var.f29609g = false;
        pc0Var.t(pc0Var.f29622u, c4Var.k(z10 ? 1 : 0).settings.intensity);
        pc0Var.o(i12, i14, i16, i18, 0, true);
        pc0Var.v(0);
        final int f7 = pc0Var.f();
        c4Var.o(z10 ? 1 : 0, new ResultCallback() {
            @Override
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair != null) {
                    long longValue = ((Long) pair.first).longValue();
                    Bitmap bitmap = ((dg.a) pair.second).f8337b;
                    org.telegram.ui.ActionBar.c4 c4Var2 = org.telegram.ui.ActionBar.c4.this;
                    if (longValue == c4Var2.i(z10 ? 1 : 0) && bitmap != null) {
                        int i19 = c4Var2.k(z10 ? 1 : 0).settings.intensity;
                        pc0 pc0Var2 = pc0Var;
                        pc0Var2.t(bitmap, i19);
                        pc0Var2.u(f7);
                        pc0Var2.s(1.0f);
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
        return pc0Var;
    }

    private void setupCollage(k8 k8Var) {
        ArrayList<k8> arrayList;
        vc vcVar = this.F;
        if (vcVar != null) {
            if (k8Var != null) {
                arrayList = k8Var.T;
            } else {
                arrayList = null;
            }
            vcVar.setCollage(arrayList);
        }
    }

    private void setupImage(k8 k8Var) {
        Utilities.searchQueue.postRunnable(new ai.ba(20, this, k8Var));
    }

    public abstract void b();

    public final void c() {
        float f7;
        float f10;
        k8 k8Var;
        d81 d81Var = this.f4744e;
        float f11 = 0.0f;
        if (d81Var != null) {
            if (!this.O && ((k8Var = this.d) == null || !k8Var.Y)) {
                if (k8Var != null) {
                    f10 = k8Var.P;
                } else {
                    f10 = 1.0f;
                }
            } else {
                f10 = 0.0f;
            }
            d81Var.W(f10);
        }
        d81 d81Var2 = this.f4768x;
        if (d81Var2 != null) {
            if (this.O) {
                f7 = 0.0f;
            } else {
                k8 k8Var2 = this.d;
                if (k8Var2 != null) {
                    f7 = k8Var2.f5352u0;
                } else {
                    f7 = 1.0f;
                }
            }
            d81Var2.W(f7);
        }
        d81 d81Var3 = this.f4770y;
        if (d81Var3 != null) {
            if (!this.O) {
                k8 k8Var3 = this.d;
                if (k8Var3 != null) {
                    f11 = k8Var3.G;
                } else {
                    f11 = 1.0f;
                }
            }
            d81Var3.W(f11);
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
        float[] fArr = this.f4738a0;
        fArr[0] = k8Var.f5333k0 / 2.0f;
        fArr[1] = k8Var.f5335l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f4740b0 = fArr[0];
        this.f4742c0 = fArr[1];
        k8 k8Var2 = this.d;
        fArr[0] = k8Var2.f5333k0;
        fArr[1] = k8Var2.f5335l0 / 2.0f;
        matrix.mapPoints(fArr);
        this.f4743d0 = (float) Math.toDegrees(Math.atan2(fArr[1] - this.f4742c0, fArr[0] - this.f4740b0));
        v7.z6.a(this.f4740b0, this.f4742c0, fArr[0], fArr[1]);
        k8 k8Var3 = this.d;
        fArr[0] = k8Var3.f5333k0 / 2.0f;
        fArr[1] = k8Var3.f5335l0;
        matrix.mapPoints(fArr);
        v7.z6.a(this.f4740b0, this.f4742c0, fArr[0], fArr[1]);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z10;
        k8 k8Var;
        MediaController.CropState cropState;
        if (this.S != null) {
            float f7 = 0.0f;
            if (this.f4748g0) {
                Path path = new Path();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.S;
            if (!(drawable instanceof pc0) || ((pc0) drawable).f29622u != null) {
                f7 = this.P.d(1.0f, false);
            }
            Drawable drawable2 = this.R;
            if (drawable2 != null && f7 < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - f7) * 255.0f));
                k8.j(canvas, this.R, getWidth(), getHeight());
            }
            this.S.setAlpha((int) (f7 * 255.0f));
            k8.j(canvas, this.S, getWidth(), getHeight());
            if (this.f4748g0) {
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
        } else if (this.f4745e0 && this.d != null && !j()) {
            if (this.f4737a == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e7 = this.f4747f0.e(z10);
            if (this.f4737a != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.d.f5329i0, getHeight() / this.d.f5331j0);
                canvas2.concat(this.d.f5338n0);
                if (this.d.m0 != null) {
                    canvas2.translate(k8Var.f5333k0 / 2.0f, k8Var.f5335l0 / 2.0f);
                    canvas2.rotate(-this.d.Q);
                    k8 k8Var2 = this.d;
                    int i10 = k8Var2.f5333k0;
                    int i11 = k8Var2.f5335l0;
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
                    canvas2.translate((-k8Var3.f5333k0) / 2.0f, (-k8Var3.f5335l0) / 2.0f);
                }
                Paint paint = this.Q;
                paint.setAlpha((int) ((1.0f - e7) * 255.0f));
                int width = this.f4737a.getWidth();
                int height = this.f4737a.getHeight();
                Rect rect = this.f4739b;
                rect.set(0, 0, width, height);
                k8 k8Var4 = this.d;
                int i13 = k8Var4.f5333k0;
                int i14 = k8Var4.f5335l0;
                Rect rect2 = this.f4741c;
                rect2.set(0, 0, i13, i14);
                canvas2.drawBitmap(this.f4737a, rect, rect2, paint);
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
        k8 k8Var;
        k8 k8Var2;
        t71 t71Var = this.f4754n;
        if (view == t71Var && (k8Var2 = this.d) != null && k8Var2.f5351u) {
            return false;
        }
        if ((view == t71Var || view == this.f4759r) && (k8Var = this.d) != null && k8Var.m0 != null) {
            canvas.save();
            canvas.scale(getWidth() / this.d.f5329i0, getHeight() / this.d.f5331j0);
            canvas.concat(this.d.f5338n0);
            k8 k8Var3 = this.d;
            if (k8Var3.m0 != null) {
                canvas.translate(k8Var3.f5333k0 / 2.0f, k8Var3.f5335l0 / 2.0f);
                canvas.rotate(-this.d.Q);
                k8 k8Var4 = this.d;
                int i10 = k8Var4.f5333k0;
                int i11 = k8Var4.f5335l0;
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
                canvas.translate((-k8Var5.f5333k0) / 2.0f, (-k8Var5.f5335l0) / 2.0f);
            }
            canvas.concat(this.f4749h0);
            canvas.scale(1.0f / (getWidth() / this.d.f5329i0), 1.0f / (getHeight() / this.d.f5331j0));
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public int getContentHeight() {
        k8 k8Var = this.d;
        if (k8Var == null) {
            return 1;
        }
        return k8Var.f5335l0;
    }

    public int getContentWidth() {
        k8 k8Var = this.d;
        if (k8Var == null) {
            return 1;
        }
        return k8Var.f5333k0;
    }

    public long getCurrentPosition() {
        d81 d81Var = this.f4744e;
        if (d81Var != null) {
            return d81Var.n();
        }
        d81 d81Var2 = this.f4768x;
        if (d81Var2 != null) {
            return d81Var2.n();
        }
        d81 d81Var3 = this.f4770y;
        if (d81Var3 != null) {
            return d81Var3.n();
        }
        return 0L;
    }

    public long getDuration() {
        k8 k8Var = this.d;
        if (k8Var != null) {
            double d = k8Var.f5328i;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        d81 d81Var = this.f4744e;
        if (d81Var != null && d81Var.p() != -9223372036854775807L) {
            return this.f4744e.p();
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
        return new Pair<>(Integer.valueOf(this.d.f5329i0), Integer.valueOf(this.d.f5331j0));
    }

    public Bitmap getPhotoBitmap() {
        return this.f4737a;
    }

    public t71 getTextureView() {
        return this.f4754n;
    }

    public final void h(Utilities.Callback callback, View... viewArr) {
        t71 t71Var;
        int dp = (int) (AndroidUtilities.dp(26.0f) * AndroidUtilities.density);
        int dp2 = (int) (AndroidUtilities.dp(30.33f) * AndroidUtilities.density);
        int dp3 = (int) (AndroidUtilities.dp(4.0f) * AndroidUtilities.density);
        Bitmap[] bitmapArr = new Bitmap[viewArr.length];
        for (int i10 = 0; i10 < viewArr.length; i10++) {
            View view = viewArr[i10];
            if (view != null && view.getWidth() >= 0 && viewArr[i10].getHeight() > 0) {
                View view2 = viewArr[i10];
                if (view2 == this && (t71Var = this.f4754n) != null) {
                    bitmapArr[i10] = t71Var.getBitmap();
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
        k8 k8Var;
        if (this.E != null && (k8Var = this.d) != null && k8Var.v()) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        return !this.f4772z0.contains(-9982);
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
                k8Var.z(new z6((yb) this, 0));
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

    public final void m(long j3) {
        d81 d81Var = this.f4744e;
        if (d81Var != null) {
            d81Var.L(j3, false);
        } else if (j()) {
            this.E.m(j3, false);
        } else {
            d81 d81Var2 = this.f4768x;
            if (d81Var2 != null) {
                d81Var2.L(j3, false);
            } else {
                d81 d81Var3 = this.f4770y;
                if (d81Var3 != null) {
                    d81Var3.L(j3, false);
                }
            }
        }
        w(true);
        y(true);
    }

    public final void n(k8 k8Var, ma maVar, long j3) {
        this.d = k8Var;
        if (k8Var == null) {
            t(null, maVar, j3);
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
            t(null, maVar, j3);
            setupCollage(k8Var);
        } else if (k8Var.K) {
            setupImage(k8Var);
            setupCollage(null);
            t(k8Var, maVar, j3);
            if (k8Var.A0 == 0 && k8Var.B0 == 0) {
                k8Var.z(new z6(this, 1));
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

    public final void o(TextureView textureView, vf0 vf0Var) {
        TextureView textureView2 = this.f4759r;
        if (textureView2 != null) {
            removeView(textureView2);
            this.f4759r = null;
        }
        this.f4761s = vf0Var;
        this.f4759r = textureView;
        if (vf0Var != null) {
            int i10 = this.U;
            int i11 = this.V;
            yz yzVar = vf0Var.f31658l0;
            if (yzVar != null) {
                yzVar.i(i10, i11);
            } else {
                vf0Var.J0 = i10;
                vf0Var.K0 = i11;
            }
        }
        TextureView textureView3 = this.f4759r;
        if (textureView3 != null) {
            addView(textureView3);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f4752k0) {
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
        d81 d81Var = this.f4770y;
        if (d81Var != null) {
            d81Var.B();
            this.f4770y.H();
            this.f4770y = null;
        }
        if (k8Var != null) {
            vc vcVar = this.F;
            boolean z12 = false;
            if (vcVar != null) {
                String str2 = k8Var.f5358y;
                String str3 = k8Var.A;
                String str4 = k8Var.B;
                long j3 = k8Var.C;
                long j10 = k8Var.D;
                float f12 = k8Var.E;
                float f13 = k8Var.F;
                float f14 = k8Var.G;
                if (!TextUtils.equals(vcVar.O, str2)) {
                    nc ncVar = vcVar.f6135a0;
                    if (ncVar != null) {
                        ncVar.a();
                        vcVar.f6135a0 = null;
                        vcVar.U = false;
                    }
                    vcVar.O = str2;
                    vcVar.p();
                }
                vcVar.O = str2;
                boolean isEmpty = TextUtils.isEmpty(str2);
                vcVar.N = !isEmpty;
                if (isEmpty) {
                    vcVar.P = false;
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
                if (vcVar.N) {
                    vcVar.R = j3;
                    vcVar.Q = j10 - (((float) j3) * f12);
                    vcVar.S = f12;
                    vcVar.T = f13;
                    vcVar.V = f14;
                    float f15 = 0.0f;
                    if (str != null) {
                        StaticLayout staticLayout = new StaticLayout(str, vcVar.L0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        vcVar.M0 = staticLayout;
                        if (staticLayout.getLineCount() > 0) {
                            f10 = vcVar.M0.getLineWidth(0);
                        } else {
                            f10 = 0.0f;
                        }
                        vcVar.N0 = f10;
                        if (vcVar.M0.getLineCount() > 0) {
                            f11 = vcVar.M0.getLineLeft(0);
                        } else {
                            f11 = 0.0f;
                        }
                        vcVar.O0 = f11;
                    } else {
                        vcVar.N0 = 0.0f;
                        vcVar.M0 = null;
                    }
                    if (str4 != null) {
                        StaticLayout staticLayout2 = new StaticLayout(str4, vcVar.P0, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        vcVar.Q0 = staticLayout2;
                        if (staticLayout2.getLineCount() > 0) {
                            f7 = vcVar.Q0.getLineWidth(0);
                        } else {
                            f7 = 0.0f;
                        }
                        vcVar.R0 = f7;
                        if (vcVar.Q0.getLineCount() > 0) {
                            f15 = vcVar.Q0.getLineLeft(0);
                        }
                        vcVar.S0 = f15;
                    } else {
                        vcVar.R0 = 0.0f;
                        vcVar.Q0 = null;
                    }
                }
                if (!z10) {
                    z11 = true;
                    vcVar.f6146e0.f(vcVar.N, true);
                } else {
                    z11 = true;
                }
                vcVar.invalidate();
            } else {
                z11 = true;
            }
            if (k8Var.f5358y != null) {
                d81 d81Var2 = new d81();
                this.f4770y = d81Var2;
                d81Var2.f25651y = z11;
                d81Var2.J = new a6.i(this, 12);
                d81Var2.D(Uri.fromFile(new File(k8Var.f5358y)), "other");
                c();
                if (this.f4744e != null && getDuration() > 0) {
                    long duration = k8Var.Z * ((float) getDuration());
                    this.f4744e.L(duration, false);
                    this.F.setProgress(duration);
                }
                w(true);
            }
            kc kcVar = ((yb) this).C0;
            mb mbVar = kcVar.f5442v1;
            if (mbVar != null) {
                k8 k8Var2 = kcVar.K1;
                if (k8Var2 != null && k8Var2.f5358y != null) {
                    z12 = true;
                }
                mbVar.setHasAudio(z12);
            }
        }
    }

    public final void q(MessageObject messageObject) {
        long j3;
        int maxCount;
        k8 k8Var = this.d;
        if (k8Var != null) {
            k8Var.f5330j = true;
            float f7 = 1.0f;
            if (messageObject != null && messageObject.messageOwner != null) {
                TLRPC.Document document = messageObject.getDocument();
                if (document != null && document.f20043id != 0) {
                    this.d.f5360z = new TLRPC.TL_inputDocument();
                    TLRPC.InputDocument inputDocument = this.d.f5360z;
                    inputDocument.f20049id = document.f20043id;
                    inputDocument.file_reference = document.file_reference;
                    inputDocument.access_hash = document.access_hash;
                }
                int i10 = 0;
                if (!TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                    this.d.f5358y = messageObject.messageOwner.attachPath;
                } else {
                    File pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, false, true);
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, true, true);
                        if (pathToAttach != null && pathToAttach.exists()) {
                            this.d.f5358y = pathToAttach.getAbsolutePath();
                        } else {
                            k8 k8Var2 = this.d;
                            k8Var2.f5358y = null;
                            k8Var2.f5360z = null;
                            k8Var2.A = null;
                            k8Var2.B = null;
                            k8Var2.D = 0L;
                            k8Var2.C = 0L;
                            k8Var2.E = 0.0f;
                            k8Var2.F = 1.0f;
                            return;
                        }
                    }
                    this.d.f5358y = pathToAttach.getAbsolutePath();
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
                        k8 k8Var5 = ((d0) obj).f4879n;
                        if (k8Var5 != null && k8Var5.K) {
                            j3 = this.E.getDuration();
                            break;
                        }
                    }
                }
                k8 k8Var6 = this.d;
                if (k8Var6.K) {
                    j3 = getDuration();
                } else {
                    j3 = k8Var6.C;
                }
                vc vcVar = this.F;
                if (vcVar == null) {
                    maxCount = 1;
                } else {
                    maxCount = vcVar.getMaxCount();
                }
                k8 k8Var7 = this.d;
                if (k8Var7.C != 0) {
                    f7 = Math.min(1.0f, ((float) Math.min(j3, maxCount * 59000)) / ((float) this.d.C));
                }
                k8Var7.F = f7;
            } else {
                k8Var.f5358y = null;
                k8Var.f5360z = null;
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
            t71 t71Var = this.f4754n;
            if (t71Var != null) {
                int i14 = this.U;
                int i15 = this.V;
                yz yzVar = t71Var.f30983b;
                if (yzVar == null) {
                    t71Var.f30987n = i14;
                    t71Var.f30988r = i15;
                } else {
                    yzVar.i(i14, i15);
                }
            }
            vf0 vf0Var = this.f4761s;
            if (vf0Var != null) {
                int i16 = this.U;
                int i17 = this.V;
                yz yzVar2 = vf0Var.f31658l0;
                if (yzVar2 != null) {
                    yzVar2.i(i16, i17);
                } else {
                    vf0Var.J0 = i16;
                    vf0Var.K0 = i17;
                }
            }
        } else {
            Bitmap bitmap = this.f4737a;
            if (bitmap != null) {
                new l4(this, i10, 1).run(n0.b(bitmap, true));
            } else {
                paint.setShader(null);
            }
        }
        invalidate();
    }

    public final void s(k8 k8Var, qg.b2 b2Var, boolean z10) {
        d81 d81Var;
        if (k8Var != null && k8Var.f5340o0 != null) {
            d81 d81Var2 = this.f4768x;
            if (d81Var2 != null) {
                d81Var2.H();
                this.f4768x = null;
            }
            d81 d81Var3 = new d81();
            this.f4768x = d81Var3;
            d81Var3.f25651y = true;
            d81Var3.J = new a6.m(this, 12);
            this.f4768x.D(Uri.fromFile(k8Var.f5340o0), "other");
            c();
            this.f4766w = b2Var;
            if (b2Var != null && (d81Var = this.f4768x) != null) {
                d81Var.V(b2Var.f44980u0);
            }
            this.F.n(k8Var.f5340o0.getAbsolutePath(), k8Var.f5344q0, k8Var.f5346r0, k8Var.f5348s0, k8Var.f5350t0, k8Var.f5352u0, z10);
            y(true);
            return;
        }
        d81 d81Var4 = this.f4768x;
        if (d81Var4 != null) {
            d81Var4.B();
            this.f4768x.H();
            this.f4768x = null;
        }
        vc vcVar = this.F;
        if (vcVar != null) {
            vcVar.setRoundNull(z10);
        }
        this.f4766w = null;
        AndroidUtilities.cancelRunOnUIThread(this.K);
    }

    public void set(k8 k8Var) {
        n(k8Var, null, 0L);
    }

    public void setAllowCropping(boolean z10) {
        this.f4752k0 = z10;
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
        this.f4745e0 = z10;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.f4771y0 = runnable;
    }

    public void setVideoTimelineView(vc vcVar) {
        this.F = vcVar;
        if (vcVar != null) {
            vcVar.setDelegate(new a4.m(this, 9));
        }
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8) {
            set(null);
        }
    }

    public final void t(k8 k8Var, Runnable runnable, long j3) {
        org.telegram.ui.Components.ka kaVar;
        boolean z10;
        ArrayList arrayList;
        org.telegram.ui.Components.qa qaVar;
        float f7 = 0.0f;
        if (k8Var != null && !k8Var.v()) {
            d81 d81Var = this.f4744e;
            if (d81Var != null) {
                d81Var.H();
                this.f4744e = null;
            }
            d81 d81Var2 = new d81();
            this.f4744e = d81Var2;
            d81Var2.f25651y = true;
            d81Var2.J = new aa.a(this, k8Var, new Runnable[]{runnable});
            t71 t71Var = this.f4754n;
            if (t71Var != null) {
                t71Var.clearAnimation();
                t71 t71Var2 = this.f4754n;
                yz yzVar = t71Var2.f30983b;
                if (yzVar != null) {
                    yzVar.postRunnable(new vz(yzVar, 0));
                }
                t71Var2.f30982a = null;
                removeView(this.f4754n);
                this.f4754n = null;
            }
            this.f4754n = new t71(getContext(), this.f4744e);
            this.G.e();
            t71 t71Var3 = this.f4754n;
            if (k8Var.f5351u) {
                kaVar = null;
            } else {
                kaVar = this.G;
            }
            t71Var3.f30989s = kaVar;
            yz yzVar2 = t71Var3.f30983b;
            if (yzVar2 != null && (qaVar = yzVar2.I) != null) {
                org.telegram.ui.Components.ka kaVar2 = qaVar.f29988t;
                if (kaVar2 != null && kaVar2.f28054m != null) {
                    kaVar2.f28054m = null;
                }
                qaVar.f29988t = kaVar;
                if (kaVar != null && kaVar.f28054m != qaVar) {
                    kaVar.f28054m = qaVar;
                    kaVar.d();
                }
            }
            this.f4754n.setOpaque(false);
            b();
            a7 a7Var = this.H;
            if (a7Var != null && a7Var.f4703g) {
                a7Var.a(this.f4754n);
            } else {
                t71 t71Var4 = this.f4754n;
                if (runnable != null) {
                    f7 = 1.0f;
                }
                t71Var4.setAlpha(f7);
                addView(this.f4754n, w7.z5.e(-2, -2, 51));
            }
            ai.y1 y1Var = new ai.y1(this, 13);
            j8 j8Var = k8Var.f5319d1;
            if (j8Var != null) {
                y1Var.run(j8Var);
            } else if (k8Var.K && Build.VERSION.SDK_INT >= 24) {
                Utilities.globalQueue.postRunnable(new f8(k8Var, y1Var, 0));
            } else {
                ?? obj = new Object();
                k8Var.f5319d1 = obj;
                y1Var.run(obj);
            }
            File file = k8Var.Z0;
            if (file == null) {
                file = k8Var.L;
            }
            this.f4744e.D(Uri.fromFile(file), "other");
            this.f4744e.P(this.f4772z0.isEmpty());
            this.f4744e.N(true);
            if (k8Var.h) {
                j3 = (k8Var.Z * ((float) k8Var.f5327h0)) + ((float) j3);
            }
            int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i10 > 0) {
                this.f4744e.L(j3, false);
            }
            c();
            w(true);
            if (k8Var.f5351u && (arrayList = k8Var.v) != null && arrayList.size() == 1 && ((MessageObject) k8Var.v.get(0)).type == 5) {
                z10 = true;
            } else {
                z10 = false;
            }
            vc vcVar = this.F;
            File file2 = k8Var.Z0;
            if (file2 == null) {
                file2 = k8Var.L;
            }
            vcVar.o(z10, file2.getAbsolutePath(), getDuration(), k8Var.P);
            this.F.setVideoLeft(k8Var.Z);
            this.F.setVideoRight(k8Var.f5310a0);
            vc vcVar2 = this.F;
            if (vcVar2 != null && i10 > 0) {
                vcVar2.setProgress(j3);
                return;
            }
            return;
        }
        d81 d81Var3 = this.f4744e;
        if (d81Var3 != null) {
            d81Var3.B();
            this.f4744e.H();
            this.f4744e = null;
        }
        a7 a7Var2 = this.H;
        if (a7Var2 != null && a7Var2.f4703g) {
            a7Var2.a(null);
        } else {
            t71 t71Var5 = this.f4754n;
            if (t71Var5 != null) {
                t71Var5.clearAnimation();
                this.f4754n.animate().alpha(0.0f).withEndAction(new z6(this, 6)).start();
            }
        }
        vc vcVar3 = this.F;
        if (vcVar3 != null) {
            vcVar3.o(false, null, 1L, 0.0f);
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
        long j3 = k8Var.f5361z0;
        if (j3 != Long.MIN_VALUE) {
            Drawable e7 = e(this.S, k8Var.f5309a, j3, k8Var.f5359y0);
            k8Var.f5357x0 = e7;
            this.S = e7;
            if (this.R != e7) {
                this.R = null;
            }
            if (e7 != null) {
                e7.setCallback(this);
            }
            org.telegram.ui.Components.ka kaVar = this.G;
            if (kaVar != null) {
                Drawable drawable2 = this.S;
                if (drawable2 != null) {
                    if (drawable2 instanceof BitmapDrawable) {
                        kaVar.f(((BitmapDrawable) drawable2).getBitmap(), false);
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
                        kaVar.f(createBitmap, true);
                    }
                } else {
                    kaVar.f(null, false);
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
        if (this.f4752k0) {
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
            boolean z13 = this.f4757p0;
            PointF pointF3 = this.f4753l0;
            if (z13 != z10) {
                pointF3.x = pointF2.x;
                pointF3.y = pointF2.y;
                this.f4755n0 = f7;
                this.f4756o0 = d;
                this.f4757p0 = z10;
            }
            k8 k8Var = this.d;
            if (k8Var != null) {
                float width = k8Var.f5329i0 / getWidth();
                int actionMasked = motionEvent.getActionMasked();
                Matrix matrix = this.f4762s0;
                if (actionMasked == 0) {
                    this.f4764u0 = 0.0f;
                    this.f4765v0 = false;
                    invalidate();
                    this.f4767w0 = true;
                    matrix.set(this.d.f5338n0);
                }
                if (motionEvent.getActionMasked() == 2 && this.f4767w0 && this.d != null) {
                    float f10 = pointF2.x * width;
                    float f11 = pointF2.y * width;
                    float f12 = pointF3.x * width;
                    float f13 = pointF3.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f14 = this.f4755n0;
                        if (f14 != 0.0f) {
                            float f15 = f7 / f14;
                            matrix.postScale(f15, f15, f10, f11);
                        }
                        pointF = pointF2;
                        float degrees = (float) Math.toDegrees(d - this.f4756o0);
                        float f16 = this.f4764u0 + degrees;
                        this.f4764u0 = f16;
                        if (!this.f4760r0) {
                            if (Math.abs(f16) > 20.0f) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            this.f4760r0 = z11;
                            if (!z11) {
                                d(matrix);
                                if ((Math.round(this.f4743d0 / 90.0f) * 90.0f) - this.f4743d0 > 20.0f) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                this.f4760r0 = z12;
                            }
                            if (!this.f4765v0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.f4765v0 = true;
                            }
                        }
                        if (this.f4760r0) {
                            matrix.postRotate(degrees, f10, f11);
                        }
                        this.f4758q0 = true;
                    } else {
                        pointF = pointF2;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.f4758q0) {
                        matrix.postTranslate(f10 - f12, f11 - f13);
                    }
                    Matrix matrix2 = this.f4763t0;
                    matrix2.set(matrix);
                    Matrix matrix3 = this.W;
                    matrix3.set(matrix);
                    d(matrix3);
                    float round = (Math.round(this.f4743d0 / 90.0f) * 90.0f) - this.f4743d0;
                    if (this.f4760r0) {
                        if (Math.abs(round) < 3.5f) {
                            matrix2.postRotate(round, this.f4740b0, this.f4742c0);
                            if (!this.f4765v0) {
                                AndroidUtilities.vibrateCursor(this);
                                this.f4765v0 = true;
                            }
                        } else {
                            this.f4765v0 = false;
                        }
                    }
                    this.d.f5338n0.set(matrix2);
                    this.d.f5330j = true;
                    b();
                    invalidate();
                } else {
                    pointF = pointF2;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getPointerCount() <= 1) {
                        this.f4758q0 = false;
                        kc kcVar = ((yb) this).C0;
                        kcVar.f5419o1.a(true, false, kcVar.f5401i0);
                        kcVar.f5419o1.b(kcVar.f5382c1.getText());
                    }
                    this.f4767w0 = false;
                    this.f4760r0 = false;
                    this.f4764u0 = 0.0f;
                    this.f4765v0 = false;
                    invalidate();
                }
                PointF pointF4 = pointF;
                pointF3.x = pointF4.x;
                pointF3.y = pointF4.y;
                this.f4755n0 = f7;
                this.f4756o0 = d;
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
        HashSet hashSet = this.f4772z0;
        if (z10) {
            hashSet.add(Integer.valueOf(i10));
        } else {
            hashSet.remove(Integer.valueOf(i10));
        }
        d81 d81Var = this.f4744e;
        if (d81Var != null) {
            d81Var.P(hashSet.isEmpty());
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
        if (this.f4768x != null && this.d != null) {
            boolean z12 = true;
            if (this.f4744e == null && !j()) {
                this.f4768x.P(this.f4772z0.isEmpty());
                this.f4768x.N(true);
                qg.b2 b2Var = this.f4766w;
                if (b2Var != null && !b2Var.B0) {
                    b2Var.B0 = true;
                    b2Var.C0.f(true, true);
                    b2Var.invalidate();
                }
                long n11 = this.f4768x.n();
                if (z10 && this.f4768x.p() != -9223372036854775807L) {
                    float p5 = ((float) n11) / ((float) this.f4768x.p());
                    k8 k8Var = this.d;
                    if ((p5 < k8Var.f5348s0 || p5 > k8Var.f5350t0) && System.currentTimeMillis() - this.J > 500) {
                        this.J = System.currentTimeMillis();
                        this.f4768x.L(-this.d.f5346r0, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (j()) {
                n10 = this.E.getPositionWithOffset();
                y3 = this.E.f4959q0;
            } else {
                n10 = this.f4744e.n();
                y3 = this.f4744e.y();
            }
            k8 k8Var2 = this.d;
            float f10 = k8Var2.f5350t0;
            float f11 = k8Var2.f5348s0;
            long j3 = (f10 - f11) * ((float) k8Var2.f5344q0);
            long j10 = k8Var2.f5346r0;
            if (n10 >= j10 && n10 <= j3 + j10) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = (y3 && z11) ? false : false;
            long j11 = (n10 - j10) + (f11 * f7);
            qg.b2 b2Var2 = this.f4766w;
            if (b2Var2 != null && b2Var2.B0 != z11) {
                b2Var2.B0 = z11;
                b2Var2.invalidate();
            }
            if (this.f4768x.y() != z12) {
                this.f4768x.P(z12);
                this.f4768x.L(j11, false);
            } else if (z10) {
                long abs = Math.abs(this.f4768x.n() - j11);
                if (j()) {
                    i10 = 300;
                } else {
                    i10 = 120;
                }
                if (abs > i10) {
                    this.f4768x.L(j11, false);
                }
            }
        }
    }
}
