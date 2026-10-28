package ai;

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
import com.google.android.gms.internal.vision.t2;
import com.google.android.gms.internal.vision.x1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.j2;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.n71;
public final class o0 extends FrameLayout {
    public final Paint E;
    public final v1 F;
    public final Drawable G;
    public final Drawable H;
    public final Drawable I;
    public final j2 J;
    public final TextPaint K;
    public String L;
    public final TextPaint M;
    public boolean N;
    public Utilities.CallbackReturn O;
    public Runnable P;
    public StaticLayout Q;
    public final float R;
    public float S;
    public ValueAnimator T;
    public boolean U;
    public boolean V;
    public int W;
    public final n0 f1581a;
    public float f1582a0;
    public CameraView f1583b;
    public float f1584b0;
    public Object f1585c;
    public float f1586c0;
    public final RectF d;
    public boolean f1587d0;
    public final RectF e;
    public float f1588e0;
    public final RectF f1589f;
    public final HandlerThread f1590f0;
    public final Handler f1591g0;
    public final RectF h;
    public volatile boolean f1592h0;
    public s8.n f1593i0;
    public za.c f1594j0;
    public Bitmap f1595k0;
    public boolean f1596l0;
    public PointF[] m0;
    public final RectF f1597n;
    public float f1598n0;
    public Bitmap f1599o0;
    public Bitmap f1600p0;
    public final RectF f1601q0;
    public final RectF f1602r;
    public final Paint f1603r0;
    public final RectF f1604s;
    public BitmapShader f1605s0;
    public final Paint f1606t0;
    public final Matrix f1607u0;
    public final Path v;
    public Bitmap f1608v0;
    public final Path f1609w;
    public final Paint f1610w0;
    public final Paint f1611x;
    public final RectF f1612x0;
    public final Paint f1613y;
    public final m0 f1614y0;
    public static final ds f1580z0 = new ds(0.05d, 0.7d, 0.1d, 1.0d);
    public static final ds A0 = new ds(0.3d, 0.0d, 0.1d, 1.0d);

    public o0(Activity activity, RectF rectF, RectF rectF2, n0 n0Var) {
        super(activity);
        View view;
        RectF rectF3 = new RectF();
        this.d = rectF3;
        this.e = new RectF();
        RectF rectF4 = new RectF();
        this.f1589f = rectF4;
        this.h = new RectF();
        this.f1597n = new RectF();
        this.f1602r = new RectF();
        this.f1604s = new RectF();
        this.v = new Path();
        this.f1609w = new Path();
        this.f1611x = new Paint(1);
        Paint paint = new Paint(1);
        this.f1613y = paint;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        this.F = new v1(0);
        j2 j2Var = new j2(true);
        this.J = j2Var;
        TextPaint textPaint = new TextPaint(1);
        this.K = textPaint;
        this.M = new TextPaint(1);
        this.O = new d0(0);
        this.W = -1;
        this.f1582a0 = 1.0f;
        this.f1584b0 = 1.0f;
        this.f1586c0 = 1.0f;
        HandlerThread handlerThread = new HandlerThread("QrScan");
        this.f1590f0 = handlerThread;
        this.f1601q0 = new RectF();
        this.f1603r0 = new Paint(2);
        this.f1606t0 = new Paint(3);
        this.f1607u0 = new Matrix();
        this.f1610w0 = new Paint(2);
        this.f1612x0 = new RectF();
        this.f1614y0 = new m0(this);
        this.f1581a = n0Var;
        rectF3.set(rectF);
        rectF4.set(rectF2);
        setWillNotDraw(false);
        this.G = o(activity, R.drawable.msg_qr_scan);
        this.H = o(activity, R.drawable.qr_flashlight);
        this.I = o(activity, R.drawable.qr_gallery);
        j2Var.a(-1);
        j2Var.b(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(22.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(4.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(join);
        paint2.setColor(-8697);
        paint2.setStrokeWidth(AndroidUtilities.dp(6.0f));
        Activity findActivity = AndroidUtilities.findActivity(getContext());
        if (findActivity != null) {
            view = findActivity.getWindow().getDecorView();
        } else {
            view = this;
        }
        this.R = b0.g(view);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f1591g0 = handler;
        handler.post(new c0(this, 2));
        invalidate();
        a(1.0f, 390L, new c0(this, 3));
    }

    public static boolean c() {
        if (b0.f() && LiteMode.isEnabled(256)) {
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

    public static rf.b f(android.graphics.Bitmap r10, s8.n r11, za.c r12, org.telegram.messenger.Utilities.CallbackReturn r13) {
        throw new UnsupportedOperationException("Method not decompiled: ai.o0.f(android.graphics.Bitmap, s8.n, za.c, org.telegram.messenger.Utilities$CallbackReturn):rf.b");
    }

    public static boolean j(RectF rectF, float f7, float f10) {
        if (f7 >= rectF.left - AndroidUtilities.dp(8.0f) && f7 <= rectF.right + AndroidUtilities.dp(8.0f) && f10 >= rectF.top - AndroidUtilities.dp(8.0f) && f10 <= rectF.bottom + AndroidUtilities.dp(8.0f)) {
            return true;
        }
        return false;
    }

    public static o0 k(n71 n71Var, View view, Utilities.CallbackReturn callbackReturn, Utilities.Callback callback, Runnable runnable) {
        FrameLayout frameLayout;
        int[] iArr;
        int[] iArr2;
        j5 parentLayout = n71Var.getParentLayout();
        if (parentLayout != null) {
            frameLayout = parentLayout.getOverlayContainerView();
        } else {
            frameLayout = null;
        }
        if (frameLayout == null || n71Var.getParentActivity() == null) {
            return null;
        }
        frameLayout.getLocationInWindow(new int[2]);
        view.getLocationInWindow(new int[2]);
        float width = (view.getWidth() / 2.0f) + (iArr2[0] - iArr[0]);
        float height = (view.getHeight() / 2.0f) + (iArr2[1] - iArr[1]);
        float min = Math.min(view.getWidth(), view.getHeight()) / 2.0f;
        o0 o0Var = new o0(n71Var.getParentActivity(), new RectF(width - min, height - min, width + min, height + min), new RectF(), new i0(callback, runnable));
        o0Var.setPlainButton(true);
        o0Var.setAccept(callbackReturn);
        o0Var.setOnGallery(new e0(n71Var, o0Var, callbackReturn, callback, 0));
        frameLayout.addView(o0Var, kb1.g(-1.0f, -1));
        return o0Var;
    }

    public static String l(Bitmap bitmap, Utilities.CallbackReturn callbackReturn) {
        s8.n nVar;
        String str = null;
        try {
            Context context = ApplicationLoader.applicationContext;
            ?? obj = new Object();
            obj.f7500a = 256;
            nVar = new s8.n(new t2(context, (x1) obj));
        } catch (Throwable th2) {
            FileLog.e(th2);
            nVar = null;
        }
        try {
            rf.b f7 = f(bitmap, nVar, new za.c(28), callbackReturn);
            if (f7 != null) {
                str = (String) f7.f47370b;
            }
            return str;
        } finally {
            if (nVar != null) {
                nVar.X0();
            }
        }
    }

    public static Drawable o(Context context, int i10) {
        Drawable mutate = context.getDrawable(i10).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        return mutate;
    }

    public static void p(r2 r2Var, int i10, j0 j0Var) {
        if (r2Var.isFinished) {
            return;
        }
        j5 parentLayout = r2Var.getParentLayout();
        if (parentLayout != null && ((parentLayout.getLastFragment() != r2Var || ((ActionBarLayout) parentLayout).A()) && i10 < 40)) {
            AndroidUtilities.runOnUIThread(new h0(r2Var, i10, j0Var, 0), 50L);
        } else {
            j0Var.run();
        }
    }

    public final void a(float f7, long j10, Runnable runnable) {
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.S, f7);
        ofFloat.addUpdateListener(new g0(this, 0));
        ofFloat.addListener(new l0(this, runnable));
        ofFloat.setDuration(Math.abs(f7 - this.S) * ((float) j10));
        ofFloat.setInterpolator(new LinearInterpolator());
        this.T = ofFloat;
        ofFloat.start();
    }

    public final float b(float f7, float f10) {
        if (Math.abs(f7 - f10) < 0.005f) {
            return f10;
        }
        invalidate();
        return ((f10 - f7) * 0.3f) + f7;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: ai.o0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        CameraSessionWrapper cameraSessionWrapper;
        String str;
        if (this.S >= 1.0f && !this.U) {
            float x9 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int actionMasked = motionEvent.getActionMasked();
            RectF rectF = this.f1597n;
            RectF rectF2 = this.h;
            RectF rectF3 = this.f1589f;
            int i10 = -1;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3) {
                            this.W = -1;
                            invalidate();
                            return true;
                        }
                    } else if ((this.W == 0 && !j(rectF3, x9, y3)) || ((this.W == 1 && !j(rectF2, x9, y3)) || (this.W == 2 && !j(rectF, x9, y3)))) {
                        this.W = -1;
                        invalidate();
                        return true;
                    }
                } else {
                    int i11 = this.W;
                    if (i11 == 0) {
                        performHapticFeedback(3);
                        e();
                    } else if (i11 == 1) {
                        performHapticFeedback(3);
                        CameraView cameraView = this.f1583b;
                        if (cameraView != null) {
                            cameraSessionWrapper = cameraView.getCameraSession();
                        } else {
                            cameraSessionWrapper = null;
                        }
                        if (cameraSessionWrapper != null) {
                            boolean z10 = this.f1587d0;
                            this.f1587d0 = !z10;
                            if (!z10) {
                                str = "torch";
                            } else {
                                str = "off";
                            }
                            cameraSessionWrapper.setCurrentFlashMode(str);
                            invalidate();
                        }
                    } else if (i11 == 2 && this.P != null) {
                        performHapticFeedback(3);
                        this.P.run();
                    } else {
                        CameraView cameraView2 = this.f1583b;
                        if (cameraView2 != null) {
                            cameraView2.focusToPoint((int) x9, (int) y3);
                        }
                    }
                    this.W = -1;
                    invalidate();
                    return true;
                }
            } else {
                if (j(rectF3, x9, y3)) {
                    i10 = 0;
                } else if (j(rectF2, x9, y3)) {
                    i10 = 1;
                } else if (this.P != null && j(rectF, x9, y3)) {
                    i10 = 2;
                }
                this.W = i10;
                invalidate();
            }
        }
        return true;
    }

    public final void e() {
        TextureView textureView;
        if (!this.U && !this.V) {
            this.U = true;
            this.f1592h0 = false;
            Matrix matrix = this.f1607u0;
            RectF rectF = this.f1601q0;
            CameraView cameraView = this.f1583b;
            if (cameraView != null && cameraView.getAlpha() >= 0.5f && (textureView = cameraView.getTextureView()) != null && textureView.isAvailable() && textureView.getWidth() > 0 && textureView.getHeight() > 0) {
                try {
                    this.f1599o0 = textureView.getBitmap(Math.max(1, textureView.getWidth() / 2), Math.max(1, textureView.getHeight() / 2));
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    this.f1599o0 = null;
                }
                if (this.f1599o0 != null) {
                    rectF.set(textureView.getLeft() + cameraView.getLeft(), textureView.getTop() + cameraView.getTop(), textureView.getRight() + cameraView.getLeft(), textureView.getBottom() + cameraView.getTop());
                    if (c()) {
                        Bitmap bitmap = this.f1599o0;
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.max(1, bitmap.getWidth() / 8), Math.max(1, this.f1599o0.getHeight() / 8), true);
                        this.f1600p0 = createScaledBitmap;
                        Utilities.stackBlurBitmap(createScaledBitmap, 6);
                        Bitmap bitmap2 = this.f1600p0;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        this.f1605s0 = new BitmapShader(bitmap2, tileMode, tileMode);
                        matrix.setScale(rectF.width() / this.f1600p0.getWidth(), rectF.height() / this.f1600p0.getHeight());
                        matrix.postTranslate(rectF.left, rectF.top);
                        this.f1605s0.setLocalMatrix(matrix);
                        this.f1606t0.setShader(this.f1605s0);
                    }
                }
            }
            m();
            a(0.0f, 330L, new c0(this, 0));
        }
    }

    public final void g() {
        if (this.V) {
            return;
        }
        this.V = true;
        this.f1592h0 = false;
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.T = null;
        }
        m();
        this.f1591g0.removeCallbacksAndMessages(null);
        this.f1591g0.post(new c0(this, 1));
    }

    public final void h(Canvas canvas, RectF rectF, float f7, float f10, Drawable drawable) {
        canvas.save();
        canvas.scale(f7, f7, rectF.centerX(), rectF.centerY());
        float height = rectF.height() / 2.0f;
        i(height, f10, canvas, rectF, true);
        if (drawable == this.H && this.f1588e0 > 0.0f) {
            Paint paint = this.f1611x;
            paint.setColor(-1);
            paint.setAlpha((int) (this.f1588e0 * 102.0f * f10));
            canvas.drawRoundRect(rectF, height, height, paint);
        }
        if (drawable != null) {
            int dp = AndroidUtilities.dp(28.0f);
            float centerX = rectF.centerX();
            float f11 = dp / 2.0f;
            drawable.setBounds((int) (centerX - f11), (int) (rectF.centerY() - f11), (int) (rectF.centerX() + f11), (int) (rectF.centerY() + f11));
            drawable.setAlpha((int) (f10 * 255.0f));
            drawable.draw(canvas);
        } else {
            j2 j2Var = this.J;
            j2Var.setAlpha((int) (f10 * 255.0f));
            canvas.save();
            canvas.translate(rectF.centerX() - (AndroidUtilities.dp(24.0f) / 2.0f), rectF.centerY() - (AndroidUtilities.dp(24.0f) / 2.0f));
            j2Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void i(float f7, float f10, Canvas canvas, RectF rectF, boolean z10) {
        int i10;
        boolean z11;
        if (f10 <= 0.0f) {
            return;
        }
        int clamp01 = (int) (Utilities.clamp01(w1.f1965b[3] / 100.0f) * 255.0f);
        Paint paint = this.f1611x;
        if (z10) {
            if (this.f1583b != null && canvas.isHardwareAccelerated() && c()) {
                if (this.f1585c == null) {
                    this.f1585c = this.f1583b.getBlurRenderNode();
                    invalidate();
                }
                z11 = b0.e(this.f1585c);
            } else {
                z11 = false;
            }
            if (z11) {
                Path path = this.f1609w;
                path.rewind();
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                canvas.save();
                canvas.translate(this.f1583b.getLeft(), this.f1583b.getTop());
                b0.h(this.f1585c, f10);
                b0.c(canvas, this.f1585c);
                canvas.restore();
                paint.setColor((clamp01 << 24) | 16777215);
                paint.setAlpha((int) (clamp01 * f10));
                canvas.drawRect(rectF, paint);
                a0.b(canvas, rectF, f10);
                canvas.restore();
                this.F.a(canvas, rectF, f7, 0, f10);
            }
        }
        if (z10 && this.f1600p0 != null) {
            Paint paint2 = this.f1606t0;
            paint2.setAlpha((int) (255.0f * f10));
            canvas.drawRoundRect(rectF, f7, f7, paint2);
            paint.setColor((clamp01 << 24) | 16777215);
            paint.setAlpha((int) (clamp01 * f10));
            canvas.drawRoundRect(rectF, f7, f7, paint);
            a0.c(canvas, rectF, f7, f10);
        } else {
            int i11 = (clamp01 << 24) | 16777215;
            if (c()) {
                i10 = 687865856;
            } else {
                i10 = Integer.MIN_VALUE;
            }
            paint.setColor(i0.a.k(i11, i10));
            paint.setAlpha((int) (Color.alpha(paint.getColor()) * f10));
            canvas.drawRoundRect(rectF, f7, f7, paint);
            a0.c(canvas, rectF, f7, f10);
        }
        this.F.a(canvas, rectF, f7, 0, f10);
    }

    public final void m() {
        CameraView cameraView = this.f1583b;
        if (cameraView == null) {
            return;
        }
        this.f1583b = null;
        this.f1585c = null;
        CameraSessionWrapper cameraSession = cameraView.getCameraSession();
        if (this.f1587d0 && cameraSession != null) {
            cameraSession.setCurrentFlashMode("off");
        }
        cameraView.animate().cancel();
        cameraView.destroy(true, null);
        removeView(cameraView);
    }

    public final float n() {
        if (this.U) {
            return 1.0f - A0.getInterpolation(1.0f - this.S);
        }
        return f1580z0.getInterpolation(Utilities.clamp01(this.S));
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        int i15 = i12 - i10;
        float dp = ((i13 - i11) / 2.0f) - AndroidUtilities.dp(20.0f);
        float f10 = i15 / 2.0f;
        float min = (Math.min(i15, i14) * 0.66f) / 2.0f;
        float f11 = f10 - min;
        float f12 = dp - min;
        float f13 = f10 + min;
        float f14 = dp + min;
        RectF rectF = this.f1602r;
        rectF.set(f11, f12, f13, f14);
        float dp2 = AndroidUtilities.dp(56.0f);
        float dp3 = rectF.bottom + AndroidUtilities.dp(64.0f);
        if (this.P != null) {
            f7 = (dp2 / 2.0f) + AndroidUtilities.dp(35.0f) + f10;
        } else {
            f7 = f10;
        }
        float f15 = dp2 / 2.0f;
        float f16 = dp2 + dp3;
        this.h.set(f7 - f15, dp3, f7 + f15, f16);
        float dp4 = (f10 - AndroidUtilities.dp(35.0f)) - f15;
        this.f1597n.set(dp4 - f15, dp3, dp4 + f15, f16);
        this.Q = new StaticLayout(LocaleController.getString(R.string.ScanQrCode), this.K, org.telegram.messenger.t.c(72.0f, i15, 1), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        RectF rectF2 = this.f1589f;
        if (rectF2.isEmpty()) {
            String[] strArr = t1.C9;
            int i16 = AndroidUtilities.statusBarHeight;
            View view = this;
            int i17 = 0;
            while (true) {
                int top = view.getTop() + i17;
                if (!(view.getParent() instanceof View)) {
                    float currentActionBarHeight = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + Math.max(0, i16 - top);
                    rectF2.set(AndroidUtilities.dp(9.0f), currentActionBarHeight - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(49.0f), currentActionBarHeight + AndroidUtilities.dp(20.0f));
                    return;
                }
                view = (View) view.getParent();
                i17 = top - view.getScrollY();
            }
        }
    }

    public void setAccept(Utilities.CallbackReturn<String, Boolean> callbackReturn) {
        this.O = callbackReturn;
    }

    public void setButtonLabel(String str) {
        this.L = str;
        Typeface bold = AndroidUtilities.bold();
        TextPaint textPaint = this.M;
        textPaint.setTypeface(bold);
        textPaint.setColor(-1);
        invalidate();
    }

    public void setOnGallery(Runnable runnable) {
        this.P = runnable;
        requestLayout();
        invalidate();
    }

    public void setPlainButton(boolean z10) {
        this.N = z10;
        invalidate();
    }
}
