package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.LaunchActivity;
public final class fz0 extends View {
    public float E;
    public float F;
    public long G;
    public boolean H;
    public boolean I;
    public VelocityTracker J;
    public float K;
    public boolean L;
    public float M;
    public Bitmap N;
    public BitmapShader O;
    public Paint P;
    public Matrix Q;
    public final RectF R;
    public final ArrayList S;
    public View T;
    public ValueAnimator U;
    public boolean V;
    public float W;
    public xy0 a;
    public ValueAnimator a0;
    public cz0 b;
    public final int[] b0;
    public uy0 c;
    public final int[] c0;
    public ValueAnimator d;
    public final RectF d0;
    public float e;
    public final RectF e0;
    public final ln f;
    public final RectF f0;
    public final Path g0;
    public final OverScroller h;
    public uib h0;
    public boolean i0;
    public fg0 j0;
    public in3 k0;
    public final int n;
    public final int r;
    public int s;
    public final bz0 w;
    public ez0 x;
    public boolean y;

    public fz0(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f = new ln(this, 0L, 350L, d53.h);
        this.R = new RectF();
        this.S = new ArrayList();
        this.b0 = new int[2];
        this.c0 = new int[2];
        this.d0 = new RectF();
        this.e0 = new RectF();
        this.f0 = new RectF();
        this.g0 = new Path();
        setWillNotDraw(false);
        this.h = new OverScroller(launchActivity);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(launchActivity);
        this.n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.r = viewConfiguration.getScaledMinimumFlingVelocity();
        bz0 bz0Var = new bz0(this, this);
        this.w = bz0Var;
        kfc.k(this, bz0Var);
        setImportantForAccessibility(2);
        cfc.i(this, new xg0(this, (byte) 17));
    }

    public static void g(ViewGroup viewGroup, float f, final x0 x0Var) {
        if (viewGroup.getWidth() > 0 && viewGroup.getHeight() > 0) {
            final SurfaceTexture d = fl.d();
            d.setDefaultBufferSize(viewGroup.getWidth(), viewGroup.getHeight());
            final Surface surface = new Surface(d);
            final Bitmap createBitmap = Bitmap.createBitmap(viewGroup.getWidth(), viewGroup.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
            lockHardwareCanvas.translate(0.0f, f);
            viewGroup.draw(lockHardwareCanvas);
            surface.unlockCanvasAndPost(lockHardwareCanvas);
            PixelCopy.request(surface, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() {
                @Override
                public final void onPixelCopyFinished(int i) {
                    x0 x0Var2 = x0.this;
                    Bitmap bitmap = createBitmap;
                    Surface surface2 = surface;
                    SurfaceTexture surfaceTexture = d;
                    if (i == 0) {
                        x0Var2.a(bitmap);
                    } else {
                        bitmap.recycle();
                        x0Var2.a(null);
                    }
                    surface2.release();
                    surfaceTexture.release();
                }
            }, new Handler());
            return;
        }
        x0Var.a(null);
    }

    private float getScrollStep() {
        return gm.L(200.0f);
    }

    private void setModalAccessibility(boolean z) {
        int i;
        int i2;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        setImportantForAccessibility(i);
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                View childAt = viewGroup.getChildAt(i3);
                if (childAt != this) {
                    if (z) {
                        i2 = 4;
                    } else {
                        i2 = 0;
                    }
                    childAt.setImportantForAccessibility(i2);
                }
            }
        }
        bz0 bz0Var = this.w;
        if (bz0Var != null) {
            bz0Var.i();
        }
        if (z) {
            sendAccessibilityEvent(32);
        }
    }

    public final void a(boolean z) {
        float f;
        if (this.V == z) {
            return;
        }
        ValueAnimator valueAnimator = this.a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.V = z;
        xy0 xy0Var = this.a;
        if (xy0Var != null) {
            xy0Var.b = false;
            xy0Var.invalidate();
        }
        setModalAccessibility(z);
        invalidate();
        float f2 = this.W;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.a0 = ofFloat;
        ofFloat.addUpdateListener(new yy0(this, (byte) 0));
        this.a0.addListener(new g0(this, (byte) 29));
        this.a0.setInterpolator(d53.h);
        this.a0.setDuration(320L);
        this.a0.start();
    }

    public final void b(cz0 cz0Var) {
        ValueAnimator valueAnimator;
        if (this.a == null) {
            return;
        }
        if (this.b != null && (valueAnimator = this.d) != null) {
            valueAnimator.end();
            this.d = null;
        }
        this.b = cz0Var;
        cz0Var.b(false);
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        wy0 c = cz0Var.c();
        xy0 xy0Var = this.a;
        ArrayList<wy0> tabs = xy0Var.getTabs();
        ArrayList<uy0> tabDrawables = xy0Var.getTabDrawables();
        uy0 uy0Var = new uy0(xy0Var, c);
        uy0Var.e.e(true, -1.0f);
        uy0Var.f.e(true, 0.0f);
        tabDrawables.add(uy0Var);
        tabs.add(0, c);
        for (int i = 0; i < tabDrawables.size(); i++) {
            uy0 uy0Var2 = tabDrawables.get(i);
            int indexOf = tabs.indexOf(uy0Var2.a);
            uy0Var2.d = indexOf;
            if (indexOf >= 0) {
                uy0Var2.c = indexOf;
            }
        }
        xy0Var.n();
        xy0Var.o(true);
        xy0Var.invalidate();
        vy0 vy0Var = xy0Var.e;
        if (vy0Var != null) {
            vy0Var.i();
        }
        this.c = uy0Var;
        post(new yt0(cz0Var, (byte) 7));
        invalidate();
        this.e = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.addUpdateListener(new yy0(this, (byte) 2));
        this.d.addListener(new i8(this, c, cz0Var, (byte) 2));
        gm.n(this.d, 220.0d, 30.0d);
        ValueAnimator valueAnimator3 = this.d;
        valueAnimator3.setDuration(((float) valueAnimator3.getDuration()) * 1.1f);
        this.d.start();
    }

    public final float c(boolean z) {
        return (e(z) - Math.min(3.0f, e(z))) - (Utilities.i(4.0f - e(z), 0.5f, 0.0f) * (Math.min(3.0f, e(z)) / 3.0f));
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller = this.h;
        if (overScroller.computeScrollOffset()) {
            setScrollOffset(overScroller.getCurrY() / getScrollStep());
            postInvalidateOnAnimation();
        }
    }

    public final float d(boolean z) {
        return Utilities.i(e(z), 1.0f, 0.0f) * ((-getScrollWindow()) / 3.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        float f;
        ArrayList arrayList;
        float f2;
        float scrollMin;
        int i;
        fg0 i0;
        float f3;
        int i2;
        int i3;
        int i4;
        float f4;
        float f5;
        ArrayList arrayList2;
        float f6;
        RectF rectF2;
        int i5;
        float f7;
        float f8;
        float f9;
        int i6;
        fz0 fz0Var = this;
        super.dispatchDraw(canvas);
        cz0 cz0Var = fz0Var.b;
        float f10 = 1.0f;
        float f11 = 0.0f;
        int i7 = 1;
        int[] iArr = fz0Var.b0;
        int[] iArr2 = fz0Var.c0;
        int i8 = 0;
        RectF rectF3 = fz0Var.d0;
        if (cz0Var != null) {
            fz0Var.getLocationOnScreen(iArr2);
            fz0Var.a.getLocationOnScreen(iArr);
            fz0Var.a.d(rectF3, 0.0f);
            rectF3.offset(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
            canvas.save();
            canvas.clipRect(0, 0, fz0Var.getMeasuredWidth(), fz0Var.getMeasuredHeight() - fz0Var.s);
            dz0 mo21d = fz0Var.b.mo21d();
            float f12 = fz0Var.e;
            RectF rectF4 = fz0Var.f0;
            float y = mo21d.y(canvas, rectF3, f12, rectF4, f12);
            if (fz0Var.c != null) {
                Path path = fz0Var.g0;
                path.rewind();
                path.addRoundRect(rectF4, y, y, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float B = kt6.B(1.0f, fz0Var.e, gm.L(50.0f), rectF4.top);
                rectF3.set(rectF4.left, B, rectF4.right, gm.L(50.0f) + B);
                fz0Var.a.setupTab(fz0Var.c);
                fz0Var.c.a(canvas, rectF3, y, fz0Var.e, 1.0f);
                rectF = rectF3;
                canvas.restore();
            } else {
                rectF = rectF3;
            }
            canvas.restore();
        } else {
            rectF = rectF3;
        }
        if (fz0Var.W <= 0.0f) {
            return;
        }
        canvas.save();
        View view = fz0Var.T;
        RectF rectF5 = fz0Var.R;
        if (view != null) {
            view.getLocationOnScreen(iArr);
            fz0Var.getLocationOnScreen(iArr2);
            rectF5.set(iArr[0] - iArr2[0], iArr[1] - iArr2[1], fz0Var.T.getWidth() + i6, fz0Var.T.getHeight() + (iArr[1] - iArr2[1]));
        } else {
            iArr[1] = 0;
            iArr[0] = 0;
            rectF5.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        canvas.clipRect(rectF5);
        canvas.translate(rectF5.left, rectF5.top);
        float width = rectF5.width();
        float height = rectF5.height();
        float f13 = 255.0f;
        if (fz0Var.N != null) {
            fz0Var.Q.reset();
            float width2 = rectF5.width() / fz0Var.N.getWidth();
            fz0Var.Q.postScale(width2, width2);
            fz0Var.O.setLocalMatrix(fz0Var.Q);
            fz0Var.P.setAlpha((int) (fz0Var.W * 255.0f));
            canvas.drawRect(0.0f, 0.0f, width, height, fz0Var.P);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, width, height, 255, 31);
        float f14 = width;
        float L = gm.L(55.0f) + gm.L(40.0f) + gm.m;
        float L2 = gm.L(68.0f);
        int min = (int) Math.min(gm.L(340.0f), 0.95f * f14);
        if (gm.O1()) {
            f = rectF5.height() * 0.5f;
        } else {
            f = 0.75f * height;
        }
        int i9 = (int) f;
        float f15 = f14 / 2.0f;
        float f16 = 0.0f;
        int i10 = 0;
        while (true) {
            arrayList = fz0Var.S;
            f2 = f13;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (((ez0) arrayList.get(i10)).d.d >= 0) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            f16 += f9;
            i10++;
            f13 = f2;
        }
        float e = fz0Var.f.e(false, f16);
        if (fz0Var.getScrollWindow() <= 0.0f) {
            scrollMin = 0.0f;
        } else {
            scrollMin = ((fz0Var.getScrollMin() - fz0Var.getScrollOffset()) / (fz0Var.getScrollWindow() * 0.15f)) * 0.2f;
        }
        float R1 = gm.R1(0.0f, 1.0f - Utilities.i(scrollMin, 1.0f, 0.0f), fz0Var.W);
        int i11 = 0;
        while (true) {
            i = i7;
            int i12 = i8;
            if (i11 >= arrayList.size() + 1) {
                break;
            }
            if (i11 == arrayList.size()) {
                f7 = L;
                f3 = L2;
                i3 = min;
                f4 = R1;
                i2 = i11;
                f5 = f14;
                f8 = f10;
                arrayList2 = arrayList;
                f6 = e;
                rectF2 = rectF;
                i5 = i9;
            } else {
                ez0 ez0Var = (ez0) arrayList.get(i11);
                if (i11 < arrayList.size()) {
                    uy0 uy0Var = ez0Var.d;
                }
                uy0 uy0Var2 = ez0Var.d;
                float f17 = f10;
                float[] fArr = ez0Var.h;
                float f18 = f11;
                float[] fArr2 = ez0Var.g;
                float f19 = L;
                Matrix matrix = ez0Var.f;
                float c = (e - f17) - uy0Var2.c();
                f3 = L2;
                i2 = i11;
                float max = (c - Math.max(fz0Var.getScrollMin(), fz0Var.getScrollOffset())) / fz0Var.getScrollWindow();
                float min2 = (Math.min(5.0f, c) * gm.L(6.0f)) + f19;
                float f20 = i9;
                float f21 = ((((height - f3) - (0.26f * f20)) - min2) * max) + min2;
                float f22 = min / 2.0f;
                i3 = min;
                RectF rectF6 = fz0Var.e0;
                rectF6.set(f15 - f22, f21, f15 + f22, f21 + f20);
                if ((rectF6.top > height || rectF6.bottom < f18 || R1 < 0.1f) && c < e - 3.0f) {
                    i4 = i;
                } else {
                    i4 = i12;
                }
                int i13 = i4;
                fz0Var.a.d(rectF, Utilities.i(uy0Var2.c(), f17, f18));
                rectF.offset(fz0Var.a.getX(), fz0Var.a.getY());
                gm.a2(rectF, rectF6, R1, rectF6);
                xy0 xy0Var = fz0Var.a;
                if (xy0Var != null) {
                    xy0Var.setupTab(uy0Var2);
                }
                if (rectF6.top <= height && rectF6.bottom >= 0.0f) {
                    canvas.save();
                    ez0Var.a.set(rectF6);
                    matrix.reset();
                    fArr2[i12] = rectF6.left;
                    float f23 = rectF6.top;
                    fArr2[i] = f23;
                    float f24 = rectF6.right;
                    fArr2[2] = f24;
                    fArr2[3] = f23;
                    fArr2[4] = f24;
                    fArr2[5] = (rectF6.height() * 1.0f) + f23;
                    fArr2[6] = rectF6.left;
                    fArr2[7] = (rectF6.height() * 1.0f) + rectF6.top;
                    fArr[i12] = rectF6.left;
                    fArr[i] = rectF6.top - gm.L(0.0f);
                    fArr[2] = rectF6.right;
                    fArr[3] = rectF6.top - gm.L(0.0f);
                    float f25 = R1 * 1.0f;
                    fArr[4] = (gm.R1(1.0f, 0.83f, f25) * (rectF6.width() / 2.0f)) + rectF6.centerX();
                    fArr[5] = (gm.R1(1.0f, 0.6f, f25) * ((rectF6.height() * 1.0f) + gm.L(0.0f))) + (rectF6.top - gm.L(0.0f));
                    fArr[6] = rectF6.centerX() - (gm.R1(1.0f, 0.83f, f25) * (rectF6.width() / 2.0f));
                    fArr[7] = (gm.R1(1.0f, 0.6f, f25) * ((rectF6.height() * 1.0f) + gm.L(0.0f))) + (rectF6.top - gm.L(0.0f));
                    matrix.setPolyToPoly(fArr2, 0, fArr, 0, 4);
                    canvas.concat(matrix);
                    float R12 = gm.R1(uy0Var2.b(), 1.0f, fz0Var.W);
                    float R13 = gm.R1(Utilities.l((c - e) + 2.0f), 1.0f, Utilities.l((R1 - 0.1f) / 0.8f));
                    uy0 uy0Var3 = ez0Var.d;
                    RadialGradient radialGradient = ez0Var.p;
                    Paint paint = ez0Var.o;
                    Paint paint2 = ez0Var.r;
                    Matrix matrix2 = ez0Var.q;
                    f4 = R1;
                    wy0 wy0Var = ez0Var.c;
                    arrayList2 = arrayList;
                    Path path2 = ez0Var.n;
                    f6 = e;
                    Paint paint3 = ez0Var.e;
                    rectF2 = rectF;
                    RectF rectF7 = ez0Var.m;
                    i5 = i9;
                    Paint paint4 = ez0Var.l;
                    f5 = f14;
                    f8 = 1.0f;
                    float i14 = Utilities.i(1.0f - ((Math.abs(ez0Var.i) - 0.3f) / 0.7f), 1.0f, 0.0f) * R12;
                    if (i14 <= 0.0f) {
                        f7 = f19;
                    } else {
                        float f26 = f25 * 1.0f;
                        float R14 = gm.R1(1.0f, 1.3f, f26);
                        float currentActionBarHeight = ((a.getCurrentActionBarHeight() + gm.m) - gm.L(50.0f)) * 0.0f;
                        canvas.save();
                        canvas.rotate(ez0Var.i * 20.0f, (ez0Var.i * gm.L(50.0f)) + rectF6.centerX(), rectF6.bottom + gm.L(350.0f));
                        float a = ez0Var.k.a(0.01f);
                        canvas.scale(a, a, rectF6.centerX(), rectF6.centerY());
                        float U1 = gm.U1(f25, gm.L(18.0f), gm.L(18.0f));
                        if (i13 != 0) {
                            paint4.setColor(i12);
                            paint4.setShadowLayer(gm.L(30.0f), 0.0f, gm.L(10.0f), cmb.p1(i14 * f25 * 1.0f, 536870912));
                            canvas.drawRoundRect(rectF6, U1, U1, paint4);
                            paint3.setAlpha((int) (i14 * f2));
                            canvas.drawRoundRect(rectF6, U1, U1, paint3);
                            canvas.restore();
                            f7 = f19;
                            f8 = 1.0f;
                        } else {
                            path2.rewind();
                            path2.addRoundRect(rectF6, U1, U1, Path.Direction.CW);
                            canvas.save();
                            paint4.setColor(0);
                            paint4.setShadowLayer(gm.L(30.0f), 0.0f, gm.L(10.0f), cmb.p1(i14 * f25 * 1.0f, 536870912));
                            canvas.drawPath(path2, paint4);
                            canvas.clipPath(path2);
                            float f27 = i14 * f2 * f25;
                            int i15 = (int) f27;
                            paint3.setAlpha(i15);
                            canvas.drawRoundRect(rectF6, U1, U1, paint3);
                            canvas.save();
                            canvas.translate(rectF6.left, ts2.i(gm.L(50.0f), R14, rectF6.top, currentActionBarHeight));
                            canvas.scale(1.0f, gm.R1(1.0f, 1.25f, f26));
                            if (wy0Var != null && wy0Var.m != null) {
                                float width3 = rectF6.width() / wy0Var.m.getWidth();
                                canvas.scale(width3, width3);
                                paint.setAlpha(i15);
                                canvas.drawBitmap(wy0Var.m, 0.0f, 0.0f, paint);
                            }
                            canvas.restore();
                            canvas.save();
                            paint2.setAlpha((int) (f27 * 1.0f));
                            matrix2.reset();
                            float height2 = rectF6.height() / f2;
                            matrix2.postScale(height2, height2);
                            matrix2.postTranslate(rectF6.centerX(), rectF6.top);
                            radialGradient.setLocalMatrix(matrix2);
                            paint2.setShader(radialGradient);
                            canvas.drawRect(rectF6, paint2);
                            canvas.restore();
                            rectF7.set(rectF6);
                            rectF7.bottom = Math.min(rectF6.height(), gm.L(50.0f)) + rectF7.top;
                            rectF7.offset(0.0f, currentActionBarHeight);
                            uy0Var3.w = f25;
                            f8 = 1.0f;
                            canvas.scale(1.0f, R14, rectF7.centerX(), rectF7.top);
                            float f28 = i14 * i14;
                            f7 = f19;
                            uy0Var3.a(canvas, rectF7, U1, f28, R13);
                            canvas.restore();
                            canvas.restore();
                        }
                    }
                    canvas.restore();
                } else {
                    f4 = R1;
                    f5 = f14;
                    arrayList2 = arrayList;
                    f6 = e;
                    rectF2 = rectF;
                    i5 = i9;
                    f7 = f19;
                    f8 = 1.0f;
                }
            }
            i11 = i2 + 1;
            L = f7;
            f10 = f8;
            i7 = i;
            R1 = f4;
            arrayList = arrayList2;
            e = f6;
            rectF = rectF2;
            i9 = i5;
            L2 = f3;
            f14 = f5;
            min = i3;
            f11 = 0.0f;
            i8 = 0;
            fz0Var = this;
        }
        float f29 = L;
        float f30 = f14;
        canvas.save();
        if (this.k0 == null) {
            this.k0 = new in3((byte) 7);
        }
        RectF rectF8 = gm.P;
        rectF8.set(0.0f, 0.0f, f30, f29);
        this.k0.r(canvas, rectF8, i, this.W);
        canvas.restore();
        canvas.restore();
        if (this.h0 == null) {
            this.h0 = new uib(jb6.M0(2131753064, null), 14.0f, gm.o());
        }
        if (this.j0 == null || this.i0 != cmb.I.o()) {
            boolean o = cmb.I.o();
            this.i0 = o;
            if (o) {
                i0 = cmb.i0(64, 64, 64, 64, 553648127, 872415231, 872415231);
                this.j0 = i0;
            } else {
                i0 = cmb.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688);
                this.j0 = i0;
            }
            i0.setCallback(this);
        }
        float L3 = this.h0.c + gm.L(24.0f);
        float f31 = (f30 - L3) / 2.0f;
        this.j0.setBounds((int) f31, (int) ((f29 - (gm.L(95.0f) / 2.0f)) - gm.L(14.0f)), (int) ((f30 + L3) / 2.0f), (int) ((f29 - (gm.L(95.0f) / 2.0f)) + gm.L(14.0f)));
        this.j0.setAlpha((int) (this.W * f2));
        this.j0.draw(canvas);
        this.h0.c(f31 + gm.L(12.0f), f29 - (gm.L(95.0f) / 2.0f), this.W, -1, canvas);
        canvas.restore();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        bz0 bz0Var;
        if (this.W > 0.0f && (bz0Var = this.w) != null && bz0Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz0.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final float e(boolean z) {
        float f;
        float f2 = 0.0f;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.S;
            if (i >= arrayList.size()) {
                break;
            }
            if (((ez0) arrayList.get(i)).d.d >= 0) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            f2 += f;
            i++;
        }
        if (z) {
            return this.f.e(false, f2);
        }
        return f2;
    }

    public final void f() {
        float f;
        uy0 uy0Var;
        xy0 xy0Var = this.a;
        if (xy0Var != null && (xy0Var.getParent() instanceof View)) {
            HashSet hashSet = wx0.b1;
            if (!hashSet.isEmpty()) {
                Iterator it = new HashSet(hashSet).iterator();
                while (it.hasNext()) {
                    ((wx0) it.next()).m(true);
                }
                gm.d3(new yt0(this, (byte) 8), 100L);
                return;
            }
            ValueAnimator valueAnimator = this.d;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.d = null;
            }
            View view = (View) this.a.getParent();
            this.T = view;
            int[] iArr = this.b0;
            if (view != null) {
                view.getLocationOnScreen(iArr);
            } else {
                iArr[1] = 0;
                iArr[0] = 0;
            }
            int[] iArr2 = this.c0;
            getLocationOnScreen(iArr2);
            int i = iArr[0] - iArr2[0];
            int i2 = iArr[1] - iArr2[1];
            this.R.set(i, iArr[1] - iArr2[1], this.T.getWidth() + i, this.T.getHeight() + i2);
            View view2 = this.T;
            gm.m0 = true;
            this.N = gm.h2(14.0f, 14, view2);
            gm.m0 = false;
            Paint paint = new Paint(1);
            this.P = paint;
            Bitmap bitmap = this.N;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.O = bitmapShader;
            paint.setShader(bitmapShader);
            ColorMatrix colorMatrix = new ColorMatrix();
            if (cmb.I.o()) {
                f = 0.08f;
            } else {
                f = 0.25f;
            }
            gm.i(colorMatrix, f);
            this.P.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            this.Q = new Matrix();
            ArrayList arrayList = this.S;
            arrayList.clear();
            ArrayList<wy0> tabs = this.a.getTabs();
            ArrayList<uy0> tabDrawables = this.a.getTabDrawables();
            for (int size = tabs.size() - 1; size >= 0; size--) {
                wy0 wy0Var = tabs.get(size);
                int i3 = 0;
                while (true) {
                    if (i3 < tabDrawables.size()) {
                        uy0Var = tabDrawables.get(i3);
                        if (uy0Var.a == wy0Var) {
                            break;
                        }
                        i3++;
                    } else {
                        uy0Var = null;
                        break;
                    }
                }
                if (uy0Var != null) {
                    arrayList.add(new ez0(this, wy0Var, uy0Var));
                }
            }
            this.f.e(true, arrayList.size());
            setScrollOffset(getScrollMax());
            a(true);
        }
    }

    public float getScrollMax() {
        return c(true);
    }

    public float getScrollMin() {
        return d(true);
    }

    public float getScrollOffset() {
        return this.M;
    }

    public float getScrollRange() {
        return e(true);
    }

    public float getScrollWindow() {
        return Math.min(3.0f, getScrollRange());
    }

    public final void h(float f) {
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.U = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M, f);
        this.U = ofFloat;
        ofFloat.addUpdateListener(new yy0(this, (byte) 1));
        this.U.setDuration(250L);
        this.U.setInterpolator(d53.h);
        this.U.start();
    }

    public void setScrollOffset(float f) {
        this.M = f;
    }

    public void setTabsView(xy0 xy0Var) {
        this.a = xy0Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.j0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void setSlowerDismiss(boolean z) {
    }
}
