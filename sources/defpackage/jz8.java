package defpackage;

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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;
public final class jz8 extends FrameLayout {
    public static final k43 A0 = new k43(0.05d, 0.7d, 0.1d, 1.0d);
    public static final k43 B0 = new k43(0.3d, 0.0d, 0.1d, 1.0d);
    public final Paint E;
    public final Paint F;
    public final so4 G;
    public final Drawable H;
    public final Drawable I;
    public final Drawable J;
    public final gd0 K;
    public final TextPaint L;
    public String M;
    public final TextPaint N;
    public boolean O;
    public qcc P;
    public Runnable Q;
    public StaticLayout R;
    public final float S;
    public float T;
    public ValueAnimator U;
    public boolean V;
    public boolean W;
    public final iz8 a;
    public int a0;
    public CameraView b;
    public float b0;
    public Object c;
    public float c0;
    public final RectF d;
    public float d0;
    public final RectF e;
    public boolean e0;
    public final RectF f;
    public float f0;
    public final HandlerThread g0;
    public final RectF h;
    public final Handler h0;
    public volatile boolean i0;
    public af0 j0;
    public aj3 k0;
    public Bitmap l0;
    public boolean m0;
    public final RectF n;
    public PointF[] n0;
    public float o0;
    public Bitmap p0;
    public Bitmap q0;
    public final RectF r;
    public final RectF r0;
    public final RectF s;
    public final Paint s0;
    public BitmapShader t0;
    public final Paint u0;
    public final Matrix v0;
    public final Path w;
    public Bitmap w0;
    public final Path x;
    public final Paint x0;
    public final Paint y;
    public final RectF y0;
    public final li7 z0;

    public jz8(Activity activity, RectF rectF, RectF rectF2, iz8 iz8Var) {
        super(activity);
        View view;
        RectF rectF3 = new RectF();
        this.d = rectF3;
        this.e = new RectF();
        RectF rectF4 = new RectF();
        this.f = rectF4;
        this.h = new RectF();
        this.n = new RectF();
        this.r = new RectF();
        this.s = new RectF();
        this.w = new Path();
        this.x = new Path();
        this.y = new Paint(1);
        Paint paint = new Paint(1);
        this.E = paint;
        Paint paint2 = new Paint(1);
        this.F = paint2;
        this.G = new so4();
        gd0 gd0Var = new gd0(true);
        this.K = gd0Var;
        TextPaint textPaint = new TextPaint(1);
        this.L = textPaint;
        this.N = new TextPaint(1);
        this.P = new sb((byte) 8);
        this.a0 = -1;
        this.b0 = 1.0f;
        this.c0 = 1.0f;
        this.d0 = 1.0f;
        HandlerThread handlerThread = new HandlerThread("QrScan");
        this.g0 = handlerThread;
        this.r0 = new RectF();
        this.s0 = new Paint(2);
        this.u0 = new Paint(3);
        this.v0 = new Matrix();
        this.x0 = new Paint(2);
        this.y0 = new RectF();
        this.z0 = new li7(this, (byte) 11);
        this.a = iz8Var;
        rectF3.set(rectF);
        rectF4.set(rectF2);
        setWillNotDraw(false);
        this.H = o(activity, 2131232324);
        this.I = o(activity, 2131232645);
        this.J = o(activity, 2131232646);
        gd0Var.a(-1);
        gd0Var.b(-1);
        textPaint.setColor(-1);
        uh9.p(textPaint, hl.L(22.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        paint.setColor(-1);
        paint.setStrokeWidth(hl.L(4.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(join);
        paint2.setColor(-8697);
        paint2.setStrokeWidth(hl.L(6.0f));
        Activity W = hl.W(getContext());
        if (W != null) {
            view = W.getWindow().getDecorView();
        } else {
            view = this;
        }
        this.S = zz.r(view);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.h0 = handler;
        handler.post(new gz8(this, (byte) 2));
        invalidate();
        a(1.0f, 390L, new gz8(this, (byte) 3));
    }

    public static boolean c() {
        if (zz.o() && i86.e(256)) {
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

    public static defpackage.ym4 f(android.graphics.Bitmap r16, defpackage.af0 r17, defpackage.aj3 r18, defpackage.qcc r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz8.f(android.graphics.Bitmap, af0, aj3, qcc):ym4");
    }

    public static boolean j(float f, float f2, RectF rectF) {
        if (f >= rectF.left - hl.L(8.0f) && f <= rectF.right + hl.L(8.0f) && f2 >= rectF.top - hl.L(8.0f) && f2 <= rectF.bottom + hl.L(8.0f)) {
            return true;
        }
        return false;
    }

    public static jz8 k(n9c n9cVar, View view, qcc qccVar, pcc pccVar, Runnable runnable) {
        FrameLayout frameLayout;
        int[] iArr;
        int[] iArr2;
        wk5 parentLayout = n9cVar.getParentLayout();
        if (parentLayout != null) {
            frameLayout = parentLayout.getOverlayContainerView();
        } else {
            frameLayout = null;
        }
        if (frameLayout == null || n9cVar.getParentActivity() == null) {
            return null;
        }
        frameLayout.getLocationInWindow(new int[2]);
        view.getLocationInWindow(new int[2]);
        float width = (view.getWidth() / 2.0f) + (iArr2[0] - iArr[0]);
        float height = (view.getHeight() / 2.0f) + (iArr2[1] - iArr[1]);
        float min = Math.min(view.getWidth(), view.getHeight()) / 2.0f;
        jz8 jz8Var = new jz8(n9cVar.getParentActivity(), new RectF(width - min, height - min, width + min, height + min), new RectF(), new um4(pccVar, runnable, (byte) 21));
        jz8Var.setPlainButton(true);
        jz8Var.setAccept(qccVar);
        jz8Var.setOnGallery(new vp8(n9cVar, jz8Var, qccVar, pccVar, (byte) 5));
        frameLayout.addView(jz8Var, tre.c(-1.0f, -1));
        return jz8Var;
    }

    public static String l(Bitmap bitmap, qcc qccVar) {
        af0 af0Var;
        String str = null;
        try {
            Context context = a.b;
            ?? obj = new Object();
            obj.a = 256;
            af0Var = new af0(new cgd(context, (qwe) obj));
        } catch (Throwable th) {
            cc4.g(th, true);
            af0Var = null;
        }
        try {
            ym4 f = f(bitmap, af0Var, new aj3((byte) 29), qccVar);
            if (f != null) {
                str = (String) f.b;
            }
            return str;
        } finally {
            if (af0Var != null) {
                af0Var.d();
            }
        }
    }

    public static Drawable o(Activity activity, int i) {
        Drawable mutate = activity.getDrawable(i).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        return mutate;
    }

    public static void p(e eVar, int i, hz8 hz8Var) {
        if (eVar.isFinished) {
            return;
        }
        wk5 parentLayout = eVar.getParentLayout();
        if (parentLayout != null && ((parentLayout.getLastFragment() != eVar || ((ActionBarLayout) parentLayout).z()) && i < 40)) {
            hl.d3(new l65(eVar, i, hz8Var, (byte) 29), 50L);
        } else {
            hz8Var.run();
        }
    }

    public final void a(float f, long j, Runnable runnable) {
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T, f);
        ofFloat.addUpdateListener(new pv7(this, (byte) 24));
        ofFloat.addListener(new rw(this, runnable, (byte) 8));
        ofFloat.setDuration(Math.abs(f - this.T) * ((float) j));
        ofFloat.setInterpolator(new LinearInterpolator());
        this.U = ofFloat;
        ofFloat.start();
    }

    public final float b(float f, float f2) {
        if (Math.abs(f - f2) < 0.005f) {
            return f2;
        }
        invalidate();
        return ((f2 - f) * 0.3f) + f;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz8.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        CameraSessionWrapper cameraSessionWrapper;
        String str;
        if (this.T >= 1.0f && !this.V) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int actionMasked = motionEvent.getActionMasked();
            RectF rectF = this.n;
            RectF rectF2 = this.h;
            RectF rectF3 = this.f;
            int i = -1;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3) {
                            this.a0 = -1;
                            invalidate();
                            return true;
                        }
                    } else if ((this.a0 == 0 && !j(x, y, rectF3)) || ((this.a0 == 1 && !j(x, y, rectF2)) || (this.a0 == 2 && !j(x, y, rectF)))) {
                        this.a0 = -1;
                        invalidate();
                        return true;
                    }
                } else {
                    int i2 = this.a0;
                    if (i2 == 0) {
                        performHapticFeedback(3);
                        e();
                    } else if (i2 == 1) {
                        performHapticFeedback(3);
                        CameraView cameraView = this.b;
                        if (cameraView != null) {
                            cameraSessionWrapper = cameraView.getCameraSession();
                        } else {
                            cameraSessionWrapper = null;
                        }
                        if (cameraSessionWrapper != null) {
                            boolean z = this.e0;
                            this.e0 = !z;
                            if (!z) {
                                str = "torch";
                            } else {
                                str = "off";
                            }
                            cameraSessionWrapper.setCurrentFlashMode(str);
                            invalidate();
                        }
                    } else if (i2 == 2 && this.Q != null) {
                        performHapticFeedback(3);
                        this.Q.run();
                    } else {
                        CameraView cameraView2 = this.b;
                        if (cameraView2 != null) {
                            cameraView2.focusToPoint((int) x, (int) y);
                        }
                    }
                    this.a0 = -1;
                    invalidate();
                    return true;
                }
            } else {
                if (j(x, y, rectF3)) {
                    i = 0;
                } else if (j(x, y, rectF2)) {
                    i = 1;
                } else if (this.Q != null && j(x, y, rectF)) {
                    i = 2;
                }
                this.a0 = i;
                invalidate();
            }
        }
        return true;
    }

    public final void e() {
        TextureView textureView;
        if (!this.V && !this.W) {
            this.V = true;
            this.i0 = false;
            Matrix matrix = this.v0;
            RectF rectF = this.r0;
            CameraView cameraView = this.b;
            if (cameraView != null && cameraView.getAlpha() >= 0.5f && (textureView = cameraView.getTextureView()) != null && textureView.isAvailable() && textureView.getWidth() > 0 && textureView.getHeight() > 0) {
                try {
                    this.p0 = textureView.getBitmap(Math.max(1, textureView.getWidth() / 2), Math.max(1, textureView.getHeight() / 2));
                } catch (Throwable th) {
                    cc4.g(th, true);
                    this.p0 = null;
                }
                if (this.p0 != null) {
                    rectF.set(textureView.getLeft() + cameraView.getLeft(), textureView.getTop() + cameraView.getTop(), textureView.getRight() + cameraView.getLeft(), textureView.getBottom() + cameraView.getTop());
                    if (c()) {
                        Bitmap bitmap = this.p0;
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.max(1, bitmap.getWidth() / 8), Math.max(1, this.p0.getHeight() / 8), true);
                        this.q0 = createScaledBitmap;
                        Utilities.stackBlurBitmap(createScaledBitmap, 6);
                        Bitmap bitmap2 = this.q0;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        this.t0 = new BitmapShader(bitmap2, tileMode, tileMode);
                        matrix.setScale(rectF.width() / this.q0.getWidth(), rectF.height() / this.q0.getHeight());
                        matrix.postTranslate(rectF.left, rectF.top);
                        this.t0.setLocalMatrix(matrix);
                        this.u0.setShader(this.t0);
                    }
                }
            }
            m();
            a(0.0f, 330L, new gz8(this, (byte) 0));
        }
    }

    public final void g() {
        if (this.W) {
            return;
        }
        this.W = true;
        this.i0 = false;
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.U = null;
        }
        m();
        this.h0.removeCallbacksAndMessages(null);
        this.h0.post(new gz8(this, (byte) 1));
    }

    public final void h(Canvas canvas, RectF rectF, float f, float f2, Drawable drawable) {
        canvas.save();
        canvas.scale(f, f, rectF.centerX(), rectF.centerY());
        float height = rectF.height() / 2.0f;
        i(height, f2, canvas, rectF, true);
        if (drawable == this.I && this.f0 > 0.0f) {
            Paint paint = this.y;
            paint.setColor(-1);
            paint.setAlpha((int) (this.f0 * 102.0f * f2));
            canvas.drawRoundRect(rectF, height, height, paint);
        }
        if (drawable != null) {
            float L = hl.L(28.0f) / 2.0f;
            drawable.setBounds((int) (rectF.centerX() - L), (int) (rectF.centerY() - L), (int) (rectF.centerX() + L), (int) (rectF.centerY() + L));
            drawable.setAlpha((int) (f2 * 255.0f));
            drawable.draw(canvas);
        } else {
            gd0 gd0Var = this.K;
            gd0Var.setAlpha((int) (f2 * 255.0f));
            canvas.save();
            float centerX = rectF.centerX() - (hl.L(24.0f) / 2.0f);
            uh9.n(hl.L(24.0f), 2.0f, rectF.centerY(), centerX, canvas);
            gd0Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void i(float f, float f2, Canvas canvas, RectF rectF, boolean z) {
        int i;
        boolean z2;
        if (f2 <= 0.0f) {
            return;
        }
        int l = (int) (Utilities.l(ehd.b[3] / 100.0f) * 255.0f);
        Paint paint = this.y;
        if (z) {
            if (this.b != null && canvas.isHardwareAccelerated() && c()) {
                if (this.c == null) {
                    this.c = this.b.getBlurRenderNode();
                    invalidate();
                }
                z2 = zz.n(this.c);
            } else {
                z2 = false;
            }
            if (z2) {
                Path path = this.x;
                path.rewind();
                path.addRoundRect(rectF, f, f, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                canvas.save();
                canvas.translate(this.b.getLeft(), this.b.getTop());
                zz.s(this.c, f2);
                zz.h(canvas, this.c);
                canvas.restore();
                paint.setColor((l << 24) | 16777215);
                paint.setAlpha((int) (l * f2));
                canvas.drawRect(rectF, paint);
                fz8.b(canvas, rectF, f2);
                canvas.restore();
                this.G.a(f, f2, 0, canvas, rectF);
            }
        }
        if (z && this.q0 != null) {
            Paint paint2 = this.u0;
            paint2.setAlpha((int) (255.0f * f2));
            canvas.drawRoundRect(rectF, f, f, paint2);
            paint.setColor((l << 24) | 16777215);
            paint.setAlpha((int) (l * f2));
            canvas.drawRoundRect(rectF, f, f, paint);
            fz8.c(canvas, rectF, f, f2);
        } else {
            int i2 = (l << 24) | 16777215;
            if (c()) {
                i = 687865856;
            } else {
                i = Integer.MIN_VALUE;
            }
            paint.setColor(vm2.k(i2, i));
            paint.setAlpha((int) (Color.alpha(paint.getColor()) * f2));
            canvas.drawRoundRect(rectF, f, f, paint);
            fz8.c(canvas, rectF, f, f2);
        }
        this.G.a(f, f2, 0, canvas, rectF);
    }

    public final void m() {
        CameraView cameraView = this.b;
        if (cameraView == null) {
            return;
        }
        this.b = null;
        this.c = null;
        CameraSessionWrapper cameraSession = cameraView.getCameraSession();
        if (this.e0 && cameraSession != null) {
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f;
        jz8 jz8Var = this;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = i3 - i;
        float L = ((i4 - i2) / 2.0f) - hl.L(20.0f);
        float f2 = i6 / 2.0f;
        float min = (Math.min(i6, i5) * 0.66f) / 2.0f;
        float f3 = f2 - min;
        float f4 = L - min;
        float f5 = f2 + min;
        float f6 = L + min;
        RectF rectF = jz8Var.r;
        rectF.set(f3, f4, f5, f6);
        float L2 = hl.L(56.0f);
        float L3 = rectF.bottom + hl.L(64.0f);
        if (jz8Var.Q != null) {
            f = (L2 / 2.0f) + hl.L(35.0f) + f2;
        } else {
            f = f2;
        }
        float f7 = L2 / 2.0f;
        float f8 = L2 + L3;
        jz8Var.h.set(f - f7, L3, f + f7, f8);
        float L4 = (f2 - hl.L(35.0f)) - f7;
        jz8Var.n.set(L4 - f7, L3, L4 + f7, f8);
        jz8Var.R = new StaticLayout(ob6.M0(2131745589, null), jz8Var.L, c00.d(72.0f, i6, 1), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        RectF rectF2 = jz8Var.f;
        if (rectF2.isEmpty()) {
            String[] strArr = g09.B9;
            int i7 = hl.m;
            int i8 = 0;
            View view = jz8Var;
            while (true) {
                int top = view.getTop() + i8;
                if (!(view.getParent() instanceof View)) {
                    float currentActionBarHeight = (org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2.0f) + Math.max(0, i7 - top);
                    rectF2.set(hl.L(9.0f), currentActionBarHeight - hl.L(20.0f), hl.L(49.0f), currentActionBarHeight + hl.L(20.0f));
                    return;
                }
                View view2 = (View) view.getParent();
                i8 = top - view2.getScrollY();
                view = view2;
            }
        }
    }

    public void setAccept(qcc qccVar) {
        this.P = qccVar;
    }

    public void setButtonLabel(String str) {
        this.M = str;
        Typeface o = hl.o();
        TextPaint textPaint = this.N;
        textPaint.setTypeface(o);
        textPaint.setColor(-1);
        invalidate();
    }

    public void setOnGallery(Runnable runnable) {
        this.Q = runnable;
        requestLayout();
        invalidate();
    }

    public void setPlainButton(boolean z) {
        this.O = z;
        invalidate();
    }
}
