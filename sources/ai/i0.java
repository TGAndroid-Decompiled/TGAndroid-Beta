package ai;

import a8.ra;
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
import c8.ha;
import com.google.android.gms.internal.vision.t2;
import com.google.android.gms.internal.vision.x1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.d20;
import org.telegram.messenger.hd;
import org.telegram.messenger.rc;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.y1;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.xq;
public final class i0 extends FrameLayout {
    public final Paint D;
    public final Paint E;
    public final n1 F;
    public final Drawable G;
    public final Drawable H;
    public final Drawable I;
    public final y1 J;
    public final TextPaint K;
    public String L;
    public final TextPaint M;
    public boolean N;
    public d20 O;
    public Runnable P;
    public StaticLayout Q;
    public final float R;
    public float S;
    public ValueAnimator T;
    public boolean U;
    public boolean V;
    public int W;
    public final h0 f1239a;
    public float f1240a0;
    public CameraView f1241b;
    public float f1242b0;
    public Object f1243c;
    public float f1244c0;
    public final RectF d;
    public boolean f1245d0;
    public final RectF f1246e;
    public float f1247e0;
    public final RectF f1248f;
    public final HandlerThread f1249f0;
    public final Handler f1250g0;
    public final RectF h;
    public volatile boolean f1251h0;
    public u8.n f1252i0;
    public aa.n f1253j0;
    public Bitmap f1254k0;
    public boolean f1255l0;
    public PointF[] m0;
    public final RectF f1256n;
    public float f1257n0;
    public Bitmap f1258o0;
    public Bitmap f1259p0;
    public final RectF f1260q0;
    public final RectF f1261r;
    public final Paint f1262r0;
    public final RectF f1263s;
    public BitmapShader f1264s0;
    public final Paint f1265t0;
    public final Matrix f1266u0;
    public Bitmap f1267v0;
    public final Path f1268w;
    public final Paint f1269w0;
    public final Path f1270x;
    public final RectF f1271x0;
    public final Paint f1272y;
    public final ra f1273y0;
    public static final xq f1238z0 = new xq(0.05d, 0.7d, 0.1d, 1.0d);
    public static final xq A0 = new xq(0.3d, 0.0d, 0.1d, 1.0d);

    public i0(Activity activity, RectF rectF, RectF rectF2, h0 h0Var) {
        super(activity);
        View view;
        RectF rectF3 = new RectF();
        this.d = rectF3;
        this.f1246e = new RectF();
        RectF rectF4 = new RectF();
        this.f1248f = rectF4;
        this.h = new RectF();
        this.f1256n = new RectF();
        this.f1261r = new RectF();
        this.f1263s = new RectF();
        this.f1268w = new Path();
        this.f1270x = new Path();
        this.f1272y = new Paint(1);
        Paint paint = new Paint(1);
        this.D = paint;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        this.F = new n1(0);
        y1 y1Var = new y1(true);
        this.J = y1Var;
        TextPaint textPaint = new TextPaint(1);
        this.K = textPaint;
        this.M = new TextPaint(1);
        this.O = new c0(0);
        this.W = -1;
        this.f1240a0 = 1.0f;
        this.f1242b0 = 1.0f;
        this.f1244c0 = 1.0f;
        HandlerThread handlerThread = new HandlerThread("QrScan");
        this.f1249f0 = handlerThread;
        this.f1260q0 = new RectF();
        this.f1262r0 = new Paint(2);
        this.f1265t0 = new Paint(3);
        this.f1266u0 = new Matrix();
        this.f1269w0 = new Paint(2);
        this.f1271x0 = new RectF();
        this.f1273y0 = new ra(this, 1);
        this.f1239a = h0Var;
        rectF3.set(rectF);
        rectF4.set(rectF2);
        setWillNotDraw(false);
        this.G = o(activity, 2131232319);
        this.H = o(activity, 2131232629);
        this.I = o(activity, 2131232630);
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
        this.R = a0.g(view);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f1250g0 = handler;
        handler.post(new b0(this, 2));
        invalidate();
        a(1.0f, 390L, new b0(this, 3));
    }

    public static boolean c() {
        if (a0.f() && rc.e(256)) {
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

    public static q4.q f(android.graphics.Bitmap r11, u8.n r12, aa.n r13, org.telegram.messenger.d20 r14) {
        throw new UnsupportedOperationException("Method not decompiled: ai.i0.f(android.graphics.Bitmap, u8.n, aa.n, org.telegram.messenger.d20):q4.q");
    }

    public static boolean j(RectF rectF, float f10, float f11) {
        if (f10 >= rectF.left - org.telegram.messenger.g0.L(8.0f) && f10 <= rectF.right + org.telegram.messenger.g0.L(8.0f) && f11 >= rectF.top - org.telegram.messenger.g0.L(8.0f) && f11 <= rectF.bottom + org.telegram.messenger.g0.L(8.0f)) {
            return true;
        }
        return false;
    }

    public static i0 k(h41 h41Var, View view, d20 d20Var, c20 c20Var, Runnable runnable) {
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
        i0 i0Var = new i0(h41Var.getParentActivity(), new RectF(width - min, height - min, width + min, height + min), new RectF(), new wf.b(3, c20Var, runnable));
        i0Var.setPlainButton(true);
        i0Var.setAccept(d20Var);
        i0Var.setOnGallery(new d0(h41Var, i0Var, d20Var, c20Var, 0));
        frameLayout.addView(i0Var, ha.c(-1.0f, -1));
        return i0Var;
    }

    public static String l(Bitmap bitmap, d20 d20Var) {
        u8.n nVar;
        String str = null;
        try {
            Context context = org.telegram.messenger.t0.f25555b;
            ?? obj = new Object();
            obj.f7660a = 256;
            nVar = new u8.n(new t2(context, (x1) obj));
        } catch (Throwable th2) {
            a8.g(th2, true);
            nVar = null;
        }
        try {
            q4.q f10 = f(bitmap, nVar, new aa.n(20), d20Var);
            if (f10 != null) {
                str = (String) f10.f53686b;
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

    public static void p(f2 f2Var, int i7, f0 f0Var) {
        if (f2Var.isFinished) {
            return;
        }
        q4 parentLayout = f2Var.getParentLayout();
        if (parentLayout != null && ((parentLayout.getLastFragment() != f2Var || ((ActionBarLayout) parentLayout).B()) && i7 < 40)) {
            org.telegram.messenger.g0.i3(new e0(f2Var, i7, f0Var, 0), 50L);
        } else {
            f0Var.run();
        }
    }

    public final void a(float f10, long j3, Runnable runnable) {
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.S, f10);
        ofFloat.addUpdateListener(new ah.h(this, 1));
        ofFloat.addListener(new g0(this, runnable));
        ofFloat.setDuration(Math.abs(f10 - this.S) * ((float) j3));
        ofFloat.setInterpolator(new LinearInterpolator());
        this.T = ofFloat;
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
        throw new UnsupportedOperationException("Method not decompiled: ai.i0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        CameraSessionWrapper cameraSessionWrapper;
        String str;
        if (this.S >= 1.0f && !this.U) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int actionMasked = motionEvent.getActionMasked();
            RectF rectF = this.f1256n;
            RectF rectF2 = this.h;
            RectF rectF3 = this.f1248f;
            int i7 = -1;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3) {
                            this.W = -1;
                            invalidate();
                            return true;
                        }
                    } else if ((this.W == 0 && !j(rectF3, x10, y10)) || ((this.W == 1 && !j(rectF2, x10, y10)) || (this.W == 2 && !j(rectF, x10, y10)))) {
                        this.W = -1;
                        invalidate();
                        return true;
                    }
                } else {
                    int i10 = this.W;
                    if (i10 == 0) {
                        performHapticFeedback(3);
                        e();
                    } else if (i10 == 1) {
                        performHapticFeedback(3);
                        CameraView cameraView = this.f1241b;
                        if (cameraView != null) {
                            cameraSessionWrapper = cameraView.getCameraSession();
                        } else {
                            cameraSessionWrapper = null;
                        }
                        if (cameraSessionWrapper != null) {
                            boolean z9 = this.f1245d0;
                            this.f1245d0 = !z9;
                            if (!z9) {
                                str = "torch";
                            } else {
                                str = "off";
                            }
                            cameraSessionWrapper.setCurrentFlashMode(str);
                            invalidate();
                        }
                    } else if (i10 == 2 && this.P != null) {
                        performHapticFeedback(3);
                        this.P.run();
                    } else {
                        CameraView cameraView2 = this.f1241b;
                        if (cameraView2 != null) {
                            cameraView2.focusToPoint((int) x10, (int) y10);
                        }
                    }
                    this.W = -1;
                    invalidate();
                    return true;
                }
            } else {
                if (j(rectF3, x10, y10)) {
                    i7 = 0;
                } else if (j(rectF2, x10, y10)) {
                    i7 = 1;
                } else if (this.P != null && j(rectF, x10, y10)) {
                    i7 = 2;
                }
                this.W = i7;
                invalidate();
            }
        }
        return true;
    }

    public final void e() {
        TextureView textureView;
        if (!this.U && !this.V) {
            this.U = true;
            this.f1251h0 = false;
            Matrix matrix = this.f1266u0;
            RectF rectF = this.f1260q0;
            CameraView cameraView = this.f1241b;
            if (cameraView != null && cameraView.getAlpha() >= 0.5f && (textureView = cameraView.getTextureView()) != null && textureView.isAvailable() && textureView.getWidth() > 0 && textureView.getHeight() > 0) {
                try {
                    this.f1258o0 = textureView.getBitmap(Math.max(1, textureView.getWidth() / 2), Math.max(1, textureView.getHeight() / 2));
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    this.f1258o0 = null;
                }
                if (this.f1258o0 != null) {
                    rectF.set(textureView.getLeft() + cameraView.getLeft(), textureView.getTop() + cameraView.getTop(), textureView.getRight() + cameraView.getLeft(), textureView.getBottom() + cameraView.getTop());
                    if (c()) {
                        Bitmap bitmap = this.f1258o0;
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.max(1, bitmap.getWidth() / 8), Math.max(1, this.f1258o0.getHeight() / 8), true);
                        this.f1259p0 = createScaledBitmap;
                        Utilities.stackBlurBitmap(createScaledBitmap, 6);
                        Bitmap bitmap2 = this.f1259p0;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        this.f1264s0 = new BitmapShader(bitmap2, tileMode, tileMode);
                        matrix.setScale(rectF.width() / this.f1259p0.getWidth(), rectF.height() / this.f1259p0.getHeight());
                        matrix.postTranslate(rectF.left, rectF.top);
                        this.f1264s0.setLocalMatrix(matrix);
                        this.f1265t0.setShader(this.f1264s0);
                    }
                }
            }
            m();
            a(0.0f, 330L, new b0(this, 0));
        }
    }

    public final void g() {
        if (this.V) {
            return;
        }
        this.V = true;
        this.f1251h0 = false;
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.T = null;
        }
        m();
        this.f1250g0.removeCallbacksAndMessages(null);
        this.f1250g0.post(new b0(this, 1));
    }

    public final void h(Canvas canvas, RectF rectF, float f10, float f11, Drawable drawable) {
        canvas.save();
        canvas.scale(f10, f10, rectF.centerX(), rectF.centerY());
        float height = rectF.height() / 2.0f;
        i(height, f11, canvas, rectF, true);
        if (drawable == this.H && this.f1247e0 > 0.0f) {
            Paint paint = this.f1272y;
            paint.setColor(-1);
            paint.setAlpha((int) (this.f1247e0 * 102.0f * f11));
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
            y1 y1Var = this.J;
            y1Var.setAlpha((int) (f11 * 255.0f));
            canvas.save();
            canvas.translate(rectF.centerX() - (org.telegram.messenger.g0.L(24.0f) / 2.0f), rectF.centerY() - (org.telegram.messenger.g0.L(24.0f) / 2.0f));
            y1Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void i(float f10, float f11, Canvas canvas, RectF rectF, boolean z9) {
        int i7;
        boolean z10;
        if (f11 <= 0.0f) {
            return;
        }
        int l10 = (int) (Utilities.l(o1.f1596b[3] / 100.0f) * 255.0f);
        Paint paint = this.f1272y;
        if (z9) {
            if (this.f1241b != null && canvas.isHardwareAccelerated() && c()) {
                if (this.f1243c == null) {
                    this.f1243c = this.f1241b.getBlurRenderNode();
                    invalidate();
                }
                z10 = a0.e(this.f1243c);
            } else {
                z10 = false;
            }
            if (z10) {
                Path path = this.f1270x;
                path.rewind();
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                canvas.save();
                canvas.translate(this.f1241b.getLeft(), this.f1241b.getTop());
                a0.h(this.f1243c, f11);
                a0.c(canvas, this.f1243c);
                canvas.restore();
                paint.setColor((l10 << 24) | 16777215);
                paint.setAlpha((int) (l10 * f11));
                canvas.drawRect(rectF, paint);
                z.b(canvas, rectF, f11);
                canvas.restore();
                this.F.a(f10, f11, 0, canvas, rectF);
            }
        }
        if (z9 && this.f1259p0 != null) {
            Paint paint2 = this.f1265t0;
            paint2.setAlpha((int) (255.0f * f11));
            canvas.drawRoundRect(rectF, f10, f10, paint2);
            paint.setColor((l10 << 24) | 16777215);
            paint.setAlpha((int) (l10 * f11));
            canvas.drawRoundRect(rectF, f10, f10, paint);
            z.c(canvas, rectF, f10, f11);
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
            z.c(canvas, rectF, f10, f11);
        }
        this.F.a(f10, f11, 0, canvas, rectF);
    }

    public final void m() {
        CameraView cameraView = this.f1241b;
        if (cameraView == null) {
            return;
        }
        this.f1241b = null;
        this.f1243c = null;
        CameraSessionWrapper cameraSession = cameraView.getCameraSession();
        if (this.f1245d0 && cameraSession != null) {
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
        return f1238z0.getInterpolation(Utilities.l(this.S));
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        float f10;
        super.onLayout(z9, i7, i10, i11, i12);
        int i14 = i11 - i7;
        float L = ((i12 - i10) / 2.0f) - org.telegram.messenger.g0.L(20.0f);
        float f11 = i14 / 2.0f;
        float min = (Math.min(i14, i13) * 0.66f) / 2.0f;
        float f12 = f11 - min;
        float f13 = L - min;
        float f14 = f11 + min;
        float f15 = L + min;
        RectF rectF = this.f1261r;
        rectF.set(f12, f13, f14, f15);
        float L2 = org.telegram.messenger.g0.L(56.0f);
        float L3 = rectF.bottom + org.telegram.messenger.g0.L(64.0f);
        if (this.P != null) {
            f10 = (L2 / 2.0f) + org.telegram.messenger.g0.L(35.0f) + f11;
        } else {
            f10 = f11;
        }
        float f16 = L2 / 2.0f;
        float f17 = L2 + L3;
        this.h.set(f10 - f16, L3, f10 + f16, f17);
        float L4 = (f11 - org.telegram.messenger.g0.L(35.0f)) - f16;
        this.f1256n.set(L4 - f16, L3, L4 + f16, f17);
        this.Q = new StaticLayout(hd.M0(2131745862, null), this.K, jg.g.e(72.0f, i14, 1), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        RectF rectF2 = this.f1248f;
        if (rectF2.isEmpty()) {
            String[] strArr = l1.B9;
            int i15 = org.telegram.messenger.g0.f22531m;
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

    public void setAccept(d20 d20Var) {
        this.O = d20Var;
    }

    public void setButtonLabel(String str) {
        this.L = str;
        Typeface o4 = org.telegram.messenger.g0.o();
        TextPaint textPaint = this.M;
        textPaint.setTypeface(o4);
        textPaint.setColor(-1);
        invalidate();
    }

    public void setOnGallery(Runnable runnable) {
        this.P = runnable;
        requestLayout();
        invalidate();
    }

    public void setPlainButton(boolean z9) {
        this.N = z9;
        invalidate();
    }
}
