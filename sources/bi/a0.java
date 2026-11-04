package bi;

import ai.e3;
import ai.z3;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import b8.mf;
import com.google.android.gms.internal.vision.t2;
import com.google.android.gms.internal.vision.x1;
import k2.p1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.lc;
import org.telegram.messenger.u10;
import org.telegram.messenger.v10;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.w1;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.xq;
public final class a0 extends FrameLayout {
    public static final xq A0 = new xq(0.05d, 0.7d, 0.1d, 1.0d);
    public static final xq B0 = new xq(0.3d, 0.0d, 0.1d, 1.0d);
    public final Paint E;
    public final Paint F;
    public final c1 G;
    public final Drawable H;
    public final Drawable I;
    public final Drawable J;
    public final w1 K;
    public final TextPaint L;
    public String M;
    public final TextPaint N;
    public boolean O;
    public v10 P;
    public Runnable Q;
    public StaticLayout R;
    public final float S;
    public float T;
    public ValueAnimator U;
    public boolean V;
    public boolean W;
    public final z f3357a;
    public int f3358a0;
    public CameraView f3359b;
    public float f3360b0;
    public Object f3361c;
    public float f3362c0;
    public final RectF d;
    public float f3363d0;
    public final RectF f3364e;
    public boolean f3365e0;
    public final RectF f3366f;
    public float f3367f0;
    public final HandlerThread f3368g0;
    public final RectF h;
    public final Handler f3369h0;
    public volatile boolean f3370i0;
    public t8.n f3371j0;
    public c6.i f3372k0;
    public Bitmap f3373l0;
    public boolean m0;
    public final RectF f3374n;
    public PointF[] f3375n0;
    public float f3376o0;
    public Bitmap f3377p0;
    public Bitmap f3378q0;
    public final RectF f3379r;
    public final RectF f3380r0;
    public final RectF f3381s;
    public final Paint f3382s0;
    public BitmapShader f3383t0;
    public final Paint f3384u0;
    public final Matrix f3385v0;
    public final Path f3386w;
    public Bitmap f3387w0;
    public final Path f3388x;
    public final Paint f3389x0;
    public final Paint f3390y;
    public final RectF f3391y0;
    public final a3.o f3392z0;

    public a0(Activity activity, RectF rectF, RectF rectF2, z zVar) {
        super(activity);
        View view;
        RectF rectF3 = new RectF();
        this.d = rectF3;
        this.f3364e = new RectF();
        RectF rectF4 = new RectF();
        this.f3366f = rectF4;
        this.h = new RectF();
        this.f3374n = new RectF();
        this.f3379r = new RectF();
        this.f3381s = new RectF();
        this.f3386w = new Path();
        this.f3388x = new Path();
        this.f3390y = new Paint(1);
        Paint paint = new Paint(1);
        this.E = paint;
        Paint paint2 = new Paint(1);
        this.F = paint2;
        this.G = new c1(0);
        w1 w1Var = new w1(true);
        this.K = w1Var;
        TextPaint textPaint = new TextPaint(1);
        this.L = textPaint;
        this.N = new TextPaint(1);
        this.P = new x(0);
        this.f3358a0 = -1;
        this.f3360b0 = 1.0f;
        this.f3362c0 = 1.0f;
        this.f3363d0 = 1.0f;
        HandlerThread handlerThread = new HandlerThread("QrScan");
        this.f3368g0 = handlerThread;
        this.f3380r0 = new RectF();
        this.f3382s0 = new Paint(2);
        this.f3384u0 = new Paint(3);
        this.f3385v0 = new Matrix();
        this.f3389x0 = new Paint(2);
        this.f3391y0 = new RectF();
        this.f3392z0 = new a3.o(this, 11);
        this.f3357a = zVar;
        rectF3.set(rectF);
        rectF4.set(rectF2);
        setWillNotDraw(false);
        this.H = o(activity, 2131232319);
        this.I = o(activity, 2131232627);
        this.J = o(activity, 2131232628);
        w1Var.a(-1);
        w1Var.b(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(22.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        paint.setColor(-1);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(4.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(join);
        paint2.setColor(-8697);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(6.0f));
        Activity W = org.telegram.messenger.g0.W(getContext());
        if (W != null) {
            view = W.getWindow().getDecorView();
        } else {
            view = this;
        }
        this.S = v.g(view);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f3369h0 = handler;
        handler.post(new w(this, 2));
        invalidate();
        a(1.0f, 390L, new w(this, 3));
    }

    public static boolean c() {
        if (v.f() && lc.e(256)) {
            return true;
        }
        return false;
    }

    public static boolean d(Activity activity) {
        if (activity == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                return false;
            }
            return true;
        } else if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
            activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
            return false;
        } else {
            return true;
        }
    }

    public static p4.q f(android.graphics.Bitmap r11, t8.n r12, c6.i r13, org.telegram.messenger.v10 r14) {
        throw new UnsupportedOperationException("Method not decompiled: bi.a0.f(android.graphics.Bitmap, t8.n, c6.i, org.telegram.messenger.v10):p4.q");
    }

    public static boolean j(RectF rectF, float f10, float f11) {
        if (f10 >= rectF.left - org.telegram.messenger.g0.L(8.0f) && f10 <= rectF.right + org.telegram.messenger.g0.L(8.0f) && f11 >= rectF.top - org.telegram.messenger.g0.L(8.0f) && f11 <= rectF.bottom + org.telegram.messenger.g0.L(8.0f)) {
            return true;
        }
        return false;
    }

    public static a0 k(h41 h41Var, View view, v10 v10Var, u10 u10Var, Runnable runnable) {
        FrameLayout frameLayout;
        int[] iArr;
        int[] iArr2;
        q4 parentLayout = h41Var.getParentLayout();
        if (parentLayout != null) {
            frameLayout = parentLayout.getOverlayContainerView();
        } else {
            frameLayout = null;
        }
        if (frameLayout == null || h41Var.getParentActivity() == null) {
            return null;
        }
        frameLayout.getLocationInWindow(new int[2]);
        view.getLocationInWindow(new int[2]);
        float width = (view.getWidth() / 2.0f) + (iArr2[0] - iArr[0]);
        float height = (view.getHeight() / 2.0f) + (iArr2[1] - iArr[1]);
        float min = Math.min(view.getWidth(), view.getHeight()) / 2.0f;
        a0 a0Var = new a0(h41Var.getParentActivity(), new RectF(width - min, height - min, width + min, height + min), new RectF(), new tf.b(u10Var, runnable));
        a0Var.setPlainButton(true);
        a0Var.setAccept(v10Var);
        a0Var.setOnGallery(new z3(h41Var, a0Var, v10Var, u10Var, 3));
        frameLayout.addView(a0Var, mf.c(-1.0f, -1));
        return a0Var;
    }

    public static String l(Bitmap bitmap, v10 v10Var) {
        t8.n nVar;
        String str = null;
        try {
            Context context = org.telegram.messenger.t0.f25457b;
            ?? obj = new Object();
            obj.f7715a = 256;
            nVar = new t8.n(new t2(context, (x1) obj));
        } catch (Throwable th2) {
            a8.g(th2, true);
            nVar = null;
        }
        try {
            p4.q f10 = f(bitmap, nVar, new c6.i(9), v10Var);
            if (f10 != null) {
                str = (String) f10.f53181a;
            }
            return str;
        } finally {
            if (nVar != null) {
                nVar.X0();
            }
        }
    }

    public static Drawable o(Context context, int i3) {
        Drawable mutate = context.getDrawable(i3).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        return mutate;
    }

    public static void p(d2 d2Var, int i3, y yVar) {
        if (d2Var.isFinished) {
            return;
        }
        q4 parentLayout = d2Var.getParentLayout();
        if (parentLayout != null && ((parentLayout.getLastFragment() != d2Var || ((ActionBarLayout) parentLayout).B()) && i3 < 40)) {
            org.telegram.messenger.g0.i3(new e3(d2Var, i3, yVar, 1), 50L);
        } else {
            yVar.run();
        }
    }

    public final void a(float f10, long j10, Runnable runnable) {
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T, f10);
        ofFloat.addUpdateListener(new bh.f(this, 1));
        ofFloat.addListener(new androidx.fragment.app.g(this, runnable));
        ofFloat.setDuration(Math.abs(f10 - this.T) * ((float) j10));
        ofFloat.setInterpolator(new LinearInterpolator());
        this.U = ofFloat;
        ofFloat.start();
    }

    public final float b(float f10, float f11) {
        if (Math.abs(f10 - f11) < 0.005f) {
            return f11;
        }
        invalidate();
        return ((f11 - f10) * 0.3f) + f10;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: bi.a0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        CameraSessionWrapper cameraSessionWrapper;
        String str;
        if (this.T >= 1.0f && !this.V) {
            float x10 = motionEvent.getX();
            float y9 = motionEvent.getY();
            int actionMasked = motionEvent.getActionMasked();
            RectF rectF = this.f3374n;
            RectF rectF2 = this.h;
            RectF rectF3 = this.f3366f;
            int i3 = -1;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3) {
                            this.f3358a0 = -1;
                            invalidate();
                            return true;
                        }
                    } else if ((this.f3358a0 == 0 && !j(rectF3, x10, y9)) || ((this.f3358a0 == 1 && !j(rectF2, x10, y9)) || (this.f3358a0 == 2 && !j(rectF, x10, y9)))) {
                        this.f3358a0 = -1;
                        invalidate();
                        return true;
                    }
                } else {
                    int i10 = this.f3358a0;
                    if (i10 == 0) {
                        performHapticFeedback(3);
                        e();
                    } else if (i10 == 1) {
                        performHapticFeedback(3);
                        CameraView cameraView = this.f3359b;
                        if (cameraView != null) {
                            cameraSessionWrapper = cameraView.getCameraSession();
                        } else {
                            cameraSessionWrapper = null;
                        }
                        if (cameraSessionWrapper != null) {
                            boolean z10 = this.f3365e0;
                            this.f3365e0 = !z10;
                            if (!z10) {
                                str = "torch";
                            } else {
                                str = "off";
                            }
                            cameraSessionWrapper.setCurrentFlashMode(str);
                            invalidate();
                        }
                    } else if (i10 == 2 && this.Q != null) {
                        performHapticFeedback(3);
                        this.Q.run();
                    } else {
                        CameraView cameraView2 = this.f3359b;
                        if (cameraView2 != null) {
                            cameraView2.focusToPoint((int) x10, (int) y9);
                        }
                    }
                    this.f3358a0 = -1;
                    invalidate();
                    return true;
                }
            } else {
                if (j(rectF3, x10, y9)) {
                    i3 = 0;
                } else if (j(rectF2, x10, y9)) {
                    i3 = 1;
                } else if (this.Q != null && j(rectF, x10, y9)) {
                    i3 = 2;
                }
                this.f3358a0 = i3;
                invalidate();
            }
        }
        return true;
    }

    public final void e() {
        TextureView textureView;
        if (!this.V && !this.W) {
            this.V = true;
            this.f3370i0 = false;
            Matrix matrix = this.f3385v0;
            RectF rectF = this.f3380r0;
            CameraView cameraView = this.f3359b;
            if (cameraView != null && cameraView.getAlpha() >= 0.5f && (textureView = cameraView.getTextureView()) != null && textureView.isAvailable() && textureView.getWidth() > 0 && textureView.getHeight() > 0) {
                try {
                    this.f3377p0 = textureView.getBitmap(Math.max(1, textureView.getWidth() / 2), Math.max(1, textureView.getHeight() / 2));
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    this.f3377p0 = null;
                }
                if (this.f3377p0 != null) {
                    rectF.set(textureView.getLeft() + cameraView.getLeft(), textureView.getTop() + cameraView.getTop(), textureView.getRight() + cameraView.getLeft(), textureView.getBottom() + cameraView.getTop());
                    if (c()) {
                        Bitmap bitmap = this.f3377p0;
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.max(1, bitmap.getWidth() / 8), Math.max(1, this.f3377p0.getHeight() / 8), true);
                        this.f3378q0 = createScaledBitmap;
                        Utilities.stackBlurBitmap(createScaledBitmap, 6);
                        Bitmap bitmap2 = this.f3378q0;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        this.f3383t0 = new BitmapShader(bitmap2, tileMode, tileMode);
                        matrix.setScale(rectF.width() / this.f3378q0.getWidth(), rectF.height() / this.f3378q0.getHeight());
                        matrix.postTranslate(rectF.left, rectF.top);
                        this.f3383t0.setLocalMatrix(matrix);
                        this.f3384u0.setShader(this.f3383t0);
                    }
                }
            }
            m();
            a(0.0f, 330L, new w(this, 0));
        }
    }

    public final void g() {
        if (this.W) {
            return;
        }
        this.W = true;
        this.f3370i0 = false;
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.U = null;
        }
        m();
        this.f3369h0.removeCallbacksAndMessages(null);
        this.f3369h0.post(new w(this, 1));
    }

    public final void h(Canvas canvas, RectF rectF, float f10, float f11, Drawable drawable) {
        canvas.save();
        canvas.scale(f10, f10, rectF.centerX(), rectF.centerY());
        float height = rectF.height() / 2.0f;
        i(height, f11, canvas, rectF, true);
        if (drawable == this.I && this.f3367f0 > 0.0f) {
            Paint paint = this.f3390y;
            paint.setColor(-1);
            paint.setAlpha((int) (this.f3367f0 * 102.0f * f11));
            canvas.drawRoundRect(rectF, height, height, paint);
        }
        if (drawable != null) {
            int L = org.telegram.messenger.g0.L(28.0f);
            float centerX = rectF.centerX();
            float f12 = L / 2.0f;
            drawable.setBounds((int) (centerX - f12), (int) (rectF.centerY() - f12), (int) (rectF.centerX() + f12), (int) (rectF.centerY() + f12));
            drawable.setAlpha((int) (f11 * 255.0f));
            drawable.draw(canvas);
        } else {
            w1 w1Var = this.K;
            w1Var.setAlpha((int) (f11 * 255.0f));
            canvas.save();
            canvas.translate(rectF.centerX() - (org.telegram.messenger.g0.L(24.0f) / 2.0f), rectF.centerY() - (org.telegram.messenger.g0.L(24.0f) / 2.0f));
            w1Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void i(float f10, float f11, Canvas canvas, RectF rectF, boolean z10) {
        int i3;
        boolean z11;
        if (f11 <= 0.0f) {
            return;
        }
        int l10 = (int) (Utilities.l(d1.f3698b[3] / 100.0f) * 255.0f);
        Paint paint = this.f3390y;
        if (z10) {
            if (this.f3359b != null && canvas.isHardwareAccelerated() && c()) {
                if (this.f3361c == null) {
                    this.f3361c = this.f3359b.getBlurRenderNode();
                    invalidate();
                }
                z11 = v.e(this.f3361c);
            } else {
                z11 = false;
            }
            if (z11) {
                Path path = this.f3388x;
                path.rewind();
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                canvas.save();
                canvas.translate(this.f3359b.getLeft(), this.f3359b.getTop());
                v.h(this.f3361c, f11);
                v.c(canvas, this.f3361c);
                canvas.restore();
                paint.setColor((l10 << 24) | 16777215);
                paint.setAlpha((int) (l10 * f11));
                canvas.drawRect(rectF, paint);
                u.b(canvas, rectF, f11);
                canvas.restore();
                this.G.a(f10, f11, 0, canvas, rectF);
            }
        }
        if (z10 && this.f3378q0 != null) {
            Paint paint2 = this.f3384u0;
            paint2.setAlpha((int) (255.0f * f11));
            canvas.drawRoundRect(rectF, f10, f10, paint2);
            paint.setColor((l10 << 24) | 16777215);
            paint.setAlpha((int) (l10 * f11));
            canvas.drawRoundRect(rectF, f10, f10, paint);
            u.c(canvas, rectF, f10, f11);
        } else {
            int i10 = (l10 << 24) | 16777215;
            if (c()) {
                i3 = 687865856;
            } else {
                i3 = Integer.MIN_VALUE;
            }
            paint.setColor(i0.a.k(i10, i3));
            paint.setAlpha((int) (Color.alpha(paint.getColor()) * f11));
            canvas.drawRoundRect(rectF, f10, f10, paint);
            u.c(canvas, rectF, f10, f11);
        }
        this.G.a(f10, f11, 0, canvas, rectF);
    }

    public final void m() {
        CameraView cameraView = this.f3359b;
        if (cameraView == null) {
            return;
        }
        this.f3359b = null;
        this.f3361c = null;
        CameraSessionWrapper cameraSession = cameraView.getCameraSession();
        if (this.f3365e0 && cameraSession != null) {
            cameraSession.setCurrentFlashMode("off");
        }
        cameraView.animate().cancel();
        cameraView.destroy(true, null);
        removeView(cameraView);
    }

    public final float n() {
        if (this.V) {
            return 1.0f - B0.getInterpolation(1.0f - this.T);
        }
        return A0.getInterpolation(Utilities.l(this.T));
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        float f10;
        super.onLayout(z10, i3, i10, i11, i12);
        int i14 = i11 - i3;
        float L = ((i12 - i10) / 2.0f) - org.telegram.messenger.g0.L(20.0f);
        float f11 = i14 / 2.0f;
        float min = (Math.min(i14, i13) * 0.66f) / 2.0f;
        float f12 = f11 - min;
        float f13 = L - min;
        float f14 = f11 + min;
        float f15 = L + min;
        RectF rectF = this.f3379r;
        rectF.set(f12, f13, f14, f15);
        float L2 = org.telegram.messenger.g0.L(56.0f);
        float L3 = rectF.bottom + org.telegram.messenger.g0.L(64.0f);
        if (this.Q != null) {
            f10 = (L2 / 2.0f) + org.telegram.messenger.g0.L(35.0f) + f11;
        } else {
            f10 = f11;
        }
        float f16 = L2 / 2.0f;
        float f17 = L2 + L3;
        this.h.set(f10 - f16, L3, f10 + f16, f17);
        float L4 = (f11 - org.telegram.messenger.g0.L(35.0f)) - f16;
        this.f3374n.set(L4 - f16, L3, L4 + f16, f17);
        this.R = new StaticLayout(bd.M0(2131745871, null), this.L, p1.d(72.0f, i14, 1), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        RectF rectF2 = this.f3366f;
        if (rectF2.isEmpty()) {
            String[] strArr = a1.C9;
            int i15 = org.telegram.messenger.g0.f22602m;
            View view = this;
            int i16 = 0;
            while (true) {
                int top = view.getTop() + i16;
                if (!(view.getParent() instanceof View)) {
                    float currentActionBarHeight = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + Math.max(0, i15 - top);
                    rectF2.set(org.telegram.messenger.g0.L(9.0f), currentActionBarHeight - org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(49.0f), currentActionBarHeight + org.telegram.messenger.g0.L(20.0f));
                    return;
                }
                view = (View) view.getParent();
                i16 = top - view.getScrollY();
            }
        }
    }

    public void setAccept(v10 v10Var) {
        this.P = v10Var;
    }

    public void setButtonLabel(String str) {
        this.M = str;
        Typeface o10 = org.telegram.messenger.g0.o();
        TextPaint textPaint = this.N;
        textPaint.setTypeface(o10);
        textPaint.setColor(-1);
        invalidate();
    }

    public void setOnGallery(Runnable runnable) {
        this.Q = runnable;
        requestLayout();
        invalidate();
    }

    public void setPlainButton(boolean z10) {
        this.O = z10;
        invalidate();
    }
}
