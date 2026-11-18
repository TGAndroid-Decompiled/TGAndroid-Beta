package ci;

import a8.sa;
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
import c8.ma;
import com.google.android.gms.internal.vision.u2;
import com.google.android.gms.internal.vision.x1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.messenger.pc;
import org.telegram.messenger.x10;
import org.telegram.messenger.y10;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.s4;
import org.telegram.ui.ActionBar.y1;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.lr;
public final class b0 extends FrameLayout {
    public static final lr A0 = new lr(0.05d, 0.7d, 0.1d, 1.0d);
    public static final lr B0 = new lr(0.3d, 0.0d, 0.1d, 1.0d);
    public final Paint E;
    public final Paint F;
    public final b1 G;
    public final Drawable H;
    public final Drawable I;
    public final Drawable J;
    public final y1 K;
    public final TextPaint L;
    public String M;
    public final TextPaint N;
    public boolean O;
    public y10 P;
    public Runnable Q;
    public StaticLayout R;
    public final float S;
    public float T;
    public ValueAnimator U;
    public boolean V;
    public boolean W;
    public final a0 f5550a;
    public int f5551a0;
    public CameraView f5552b;
    public float f5553b0;
    public Object f5554c;
    public float f5555c0;
    public final RectF d;
    public float f5556d0;
    public final RectF f5557e;
    public boolean f5558e0;
    public final RectF f5559f;
    public float f5560f0;
    public final HandlerThread f5561g0;
    public final RectF h;
    public final Handler f5562h0;
    public volatile boolean f5563i0;
    public u8.n f5564j0;
    public d6.i f5565k0;
    public Bitmap f5566l0;
    public boolean m0;
    public final RectF f5567n;
    public PointF[] f5568n0;
    public float f5569o0;
    public Bitmap f5570p0;
    public Bitmap f5571q0;
    public final RectF f5572r;
    public final RectF f5573r0;
    public final RectF f5574s;
    public final Paint f5575s0;
    public BitmapShader f5576t0;
    public final Paint f5577u0;
    public final Matrix f5578v0;
    public final Path f5579w;
    public Bitmap f5580w0;
    public final Path f5581x;
    public final Paint f5582x0;
    public final Paint f5583y;
    public final RectF f5584y0;
    public final sa f5585z0;

    public b0(Activity activity, RectF rectF, RectF rectF2, a0 a0Var) {
        super(activity);
        View view;
        RectF rectF3 = new RectF();
        this.d = rectF3;
        this.f5557e = new RectF();
        RectF rectF4 = new RectF();
        this.f5559f = rectF4;
        this.h = new RectF();
        this.f5567n = new RectF();
        this.f5572r = new RectF();
        this.f5574s = new RectF();
        this.f5579w = new Path();
        this.f5581x = new Path();
        this.f5583y = new Paint(1);
        Paint paint = new Paint(1);
        this.E = paint;
        Paint paint2 = new Paint(1);
        this.F = paint2;
        this.G = new b1(0);
        y1 y1Var = new y1(true);
        this.K = y1Var;
        TextPaint textPaint = new TextPaint(1);
        this.L = textPaint;
        this.N = new TextPaint(1);
        this.P = new y(0);
        this.f5551a0 = -1;
        this.f5553b0 = 1.0f;
        this.f5555c0 = 1.0f;
        this.f5556d0 = 1.0f;
        HandlerThread handlerThread = new HandlerThread("QrScan");
        this.f5561g0 = handlerThread;
        this.f5573r0 = new RectF();
        this.f5575s0 = new Paint(2);
        this.f5577u0 = new Paint(3);
        this.f5578v0 = new Matrix();
        this.f5582x0 = new Paint(2);
        this.f5584y0 = new RectF();
        this.f5585z0 = new sa(this, 17);
        this.f5550a = a0Var;
        rectF3.set(rectF);
        rectF4.set(rectF2);
        setWillNotDraw(false);
        this.H = o(activity, 2131232321);
        this.I = o(activity, 2131232631);
        this.J = o(activity, 2131232632);
        y1Var.a(-1);
        y1Var.b(-1);
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
        this.S = w.g(view);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f5562h0 = handler;
        handler.post(new x(this, 2));
        invalidate();
        a(1.0f, 390L, new x(this, 3));
    }

    public static boolean c() {
        if (w.f() && pc.e(256)) {
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

    public static q4.q f(android.graphics.Bitmap r11, u8.n r12, d6.i r13, org.telegram.messenger.y10 r14) {
        throw new UnsupportedOperationException("Method not decompiled: ci.b0.f(android.graphics.Bitmap, u8.n, d6.i, org.telegram.messenger.y10):q4.q");
    }

    public static boolean j(float f10, float f11, RectF rectF) {
        if (f10 >= rectF.left - org.telegram.messenger.g0.L(8.0f) && f10 <= rectF.right + org.telegram.messenger.g0.L(8.0f) && f11 >= rectF.top - org.telegram.messenger.g0.L(8.0f) && f11 <= rectF.bottom + org.telegram.messenger.g0.L(8.0f)) {
            return true;
        }
        return false;
    }

    public static b0 k(b51 b51Var, View view, y10 y10Var, x10 x10Var, Runnable runnable) {
        FrameLayout frameLayout;
        int[] iArr;
        int[] iArr2;
        s4 parentLayout = b51Var.getParentLayout();
        if (parentLayout != null) {
            frameLayout = parentLayout.getOverlayContainerView();
        } else {
            frameLayout = null;
        }
        if (frameLayout == null || b51Var.getParentActivity() == null) {
            return null;
        }
        frameLayout.getLocationInWindow(new int[2]);
        view.getLocationInWindow(new int[2]);
        float width = (view.getWidth() / 2.0f) + (iArr2[0] - iArr[0]);
        float height = (view.getHeight() / 2.0f) + (iArr2[1] - iArr[1]);
        float min = Math.min(view.getWidth(), view.getHeight()) / 2.0f;
        b0 b0Var = new b0(b51Var.getParentActivity(), new RectF(width - min, height - min, width + min, height + min), new RectF(), new wf.b(10, x10Var, runnable));
        b0Var.setPlainButton(true);
        b0Var.setAccept(y10Var);
        b0Var.setOnGallery(new ai.s(b51Var, b0Var, y10Var, x10Var, 5));
        frameLayout.addView(b0Var, ma.c(-1.0f, -1));
        return b0Var;
    }

    public static String l(Bitmap bitmap, y10 y10Var) {
        u8.n nVar;
        String str = null;
        try {
            Context context = org.telegram.messenger.t0.f26915b;
            ?? obj = new Object();
            obj.f7332a = 256;
            nVar = new u8.n(new u2(context, (x1) obj));
        } catch (Throwable th2) {
            a8.g(th2, true);
            nVar = null;
        }
        try {
            q4.q f10 = f(bitmap, nVar, new d6.i(20), y10Var);
            if (f10 != null) {
                str = (String) f10.f55826b;
            }
            return str;
        } finally {
            if (nVar != null) {
                nVar.X0();
            }
        }
    }

    public static Drawable o(Context context, int i7) {
        Drawable mutate = context.getDrawable(i7).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        return mutate;
    }

    public static void p(h2 h2Var, int i7, z zVar) {
        if (h2Var.isFinished) {
            return;
        }
        s4 parentLayout = h2Var.getParentLayout();
        if (parentLayout != null && ((parentLayout.getLastFragment() != h2Var || ((ActionBarLayout) parentLayout).B()) && i7 < 40)) {
            org.telegram.messenger.g0.h3(new ai.a1(h2Var, i7, zVar, 5), 50L);
        } else {
            zVar.run();
        }
    }

    public final void a(float f10, long j3, Runnable runnable) {
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T, f10);
        ofFloat.addUpdateListener(new ah.g(this, 3));
        ofFloat.addListener(new androidx.fragment.app.g(this, runnable));
        ofFloat.setDuration(Math.abs(f10 - this.T) * ((float) j3));
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
        throw new UnsupportedOperationException("Method not decompiled: ci.b0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        CameraSessionWrapper cameraSessionWrapper;
        String str;
        if (this.T >= 1.0f && !this.V) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int actionMasked = motionEvent.getActionMasked();
            RectF rectF = this.f5567n;
            RectF rectF2 = this.h;
            RectF rectF3 = this.f5559f;
            int i7 = -1;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3) {
                            this.f5551a0 = -1;
                            invalidate();
                            return true;
                        }
                    } else if ((this.f5551a0 == 0 && !j(x10, y10, rectF3)) || ((this.f5551a0 == 1 && !j(x10, y10, rectF2)) || (this.f5551a0 == 2 && !j(x10, y10, rectF)))) {
                        this.f5551a0 = -1;
                        invalidate();
                        return true;
                    }
                } else {
                    int i10 = this.f5551a0;
                    if (i10 == 0) {
                        performHapticFeedback(3);
                        e();
                    } else if (i10 == 1) {
                        performHapticFeedback(3);
                        CameraView cameraView = this.f5552b;
                        if (cameraView != null) {
                            cameraSessionWrapper = cameraView.getCameraSession();
                        } else {
                            cameraSessionWrapper = null;
                        }
                        if (cameraSessionWrapper != null) {
                            boolean z10 = this.f5558e0;
                            this.f5558e0 = !z10;
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
                        CameraView cameraView2 = this.f5552b;
                        if (cameraView2 != null) {
                            cameraView2.focusToPoint((int) x10, (int) y10);
                        }
                    }
                    this.f5551a0 = -1;
                    invalidate();
                    return true;
                }
            } else {
                if (j(x10, y10, rectF3)) {
                    i7 = 0;
                } else if (j(x10, y10, rectF2)) {
                    i7 = 1;
                } else if (this.Q != null && j(x10, y10, rectF)) {
                    i7 = 2;
                }
                this.f5551a0 = i7;
                invalidate();
            }
        }
        return true;
    }

    public final void e() {
        TextureView textureView;
        if (!this.V && !this.W) {
            this.V = true;
            this.f5563i0 = false;
            Matrix matrix = this.f5578v0;
            RectF rectF = this.f5573r0;
            CameraView cameraView = this.f5552b;
            if (cameraView != null && cameraView.getAlpha() >= 0.5f && (textureView = cameraView.getTextureView()) != null && textureView.isAvailable() && textureView.getWidth() > 0 && textureView.getHeight() > 0) {
                try {
                    this.f5570p0 = textureView.getBitmap(Math.max(1, textureView.getWidth() / 2), Math.max(1, textureView.getHeight() / 2));
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    this.f5570p0 = null;
                }
                if (this.f5570p0 != null) {
                    rectF.set(textureView.getLeft() + cameraView.getLeft(), textureView.getTop() + cameraView.getTop(), textureView.getRight() + cameraView.getLeft(), textureView.getBottom() + cameraView.getTop());
                    if (c()) {
                        Bitmap bitmap = this.f5570p0;
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.max(1, bitmap.getWidth() / 8), Math.max(1, this.f5570p0.getHeight() / 8), true);
                        this.f5571q0 = createScaledBitmap;
                        Utilities.stackBlurBitmap(createScaledBitmap, 6);
                        Bitmap bitmap2 = this.f5571q0;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        this.f5576t0 = new BitmapShader(bitmap2, tileMode, tileMode);
                        matrix.setScale(rectF.width() / this.f5571q0.getWidth(), rectF.height() / this.f5571q0.getHeight());
                        matrix.postTranslate(rectF.left, rectF.top);
                        this.f5576t0.setLocalMatrix(matrix);
                        this.f5577u0.setShader(this.f5576t0);
                    }
                }
            }
            m();
            a(0.0f, 330L, new x(this, 0));
        }
    }

    public final void g() {
        if (this.W) {
            return;
        }
        this.W = true;
        this.f5563i0 = false;
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.U = null;
        }
        m();
        this.f5562h0.removeCallbacksAndMessages(null);
        this.f5562h0.post(new x(this, 1));
    }

    public final void h(Canvas canvas, RectF rectF, float f10, float f11, Drawable drawable) {
        canvas.save();
        canvas.scale(f10, f10, rectF.centerX(), rectF.centerY());
        float height = rectF.height() / 2.0f;
        i(height, f11, canvas, rectF, true);
        if (drawable == this.I && this.f5560f0 > 0.0f) {
            Paint paint = this.f5583y;
            paint.setColor(-1);
            paint.setAlpha((int) (this.f5560f0 * 102.0f * f11));
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
            y1 y1Var = this.K;
            y1Var.setAlpha((int) (f11 * 255.0f));
            canvas.save();
            float centerX2 = rectF.centerX() - (org.telegram.messenger.g0.L(24.0f) / 2.0f);
            n10.k(org.telegram.messenger.g0.L(24.0f), 2.0f, rectF.centerY(), centerX2, canvas);
            y1Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void i(float f10, float f11, Canvas canvas, RectF rectF, boolean z10) {
        int i7;
        boolean z11;
        if (f11 <= 0.0f) {
            return;
        }
        int l10 = (int) (Utilities.l(c1.f5615b[3] / 100.0f) * 255.0f);
        Paint paint = this.f5583y;
        if (z10) {
            if (this.f5552b != null && canvas.isHardwareAccelerated() && c()) {
                if (this.f5554c == null) {
                    this.f5554c = this.f5552b.getBlurRenderNode();
                    invalidate();
                }
                z11 = w.e(this.f5554c);
            } else {
                z11 = false;
            }
            if (z11) {
                Path path = this.f5581x;
                path.rewind();
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                canvas.save();
                canvas.translate(this.f5552b.getLeft(), this.f5552b.getTop());
                w.h(this.f5554c, f11);
                w.c(canvas, this.f5554c);
                canvas.restore();
                paint.setColor((l10 << 24) | 16777215);
                paint.setAlpha((int) (l10 * f11));
                canvas.drawRect(rectF, paint);
                u.b(canvas, rectF, f11);
                canvas.restore();
                this.G.a(f10, f11, 0, canvas, rectF);
            }
        }
        if (z10 && this.f5571q0 != null) {
            Paint paint2 = this.f5577u0;
            paint2.setAlpha((int) (255.0f * f11));
            canvas.drawRoundRect(rectF, f10, f10, paint2);
            paint.setColor((l10 << 24) | 16777215);
            paint.setAlpha((int) (l10 * f11));
            canvas.drawRoundRect(rectF, f10, f10, paint);
            u.c(canvas, rectF, f10, f11);
        } else {
            int i10 = (l10 << 24) | 16777215;
            if (c()) {
                i7 = 687865856;
            } else {
                i7 = Integer.MIN_VALUE;
            }
            paint.setColor(i0.a.k(i10, i7));
            paint.setAlpha((int) (Color.alpha(paint.getColor()) * f11));
            canvas.drawRoundRect(rectF, f10, f10, paint);
            u.c(canvas, rectF, f10, f11);
        }
        this.G.a(f10, f11, 0, canvas, rectF);
    }

    public final void m() {
        CameraView cameraView = this.f5552b;
        if (cameraView == null) {
            return;
        }
        this.f5552b = null;
        this.f5554c = null;
        CameraSessionWrapper cameraSession = cameraView.getCameraSession();
        if (this.f5558e0 && cameraSession != null) {
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        float f10;
        super.onLayout(z10, i7, i10, i11, i12);
        int i14 = i11 - i7;
        float L = ((i12 - i10) / 2.0f) - org.telegram.messenger.g0.L(20.0f);
        float f11 = i14 / 2.0f;
        float min = (Math.min(i14, i13) * 0.66f) / 2.0f;
        float f12 = f11 - min;
        float f13 = L - min;
        float f14 = f11 + min;
        float f15 = L + min;
        RectF rectF = this.f5572r;
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
        this.f5567n.set(L4 - f16, L3, L4 + f16, f17);
        this.R = new StaticLayout(gd.M0(2131745666, null), this.L, i5.c.d(72.0f, i14, 1), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        RectF rectF2 = this.f5559f;
        if (rectF2.isEmpty()) {
            String[] strArr = z0.C9;
            int i15 = org.telegram.messenger.g0.f24115m;
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

    public void setAccept(y10 y10Var) {
        this.P = y10Var;
    }

    public void setButtonLabel(String str) {
        this.M = str;
        Typeface o4 = org.telegram.messenger.g0.o();
        TextPaint textPaint = this.N;
        textPaint.setTypeface(o4);
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
