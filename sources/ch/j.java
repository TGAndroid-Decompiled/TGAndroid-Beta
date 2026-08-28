package ch;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.l0;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.ob;
public final class j extends Drawable implements Animator.AnimatorListener {
    public static final RectF X = new RectF();
    public static final Rect Y = new Rect();
    public static final int[] Z = new int[2];
    public static final g f2475a0 = new g("openFactor", 0);
    public static final g f2476b0 = new g("openFactor", 1);
    public final MessageObject A;
    public float B;
    public Bitmap E;
    public BitmapShader F;
    public Paint H;
    public b L;
    public boolean O;
    public boolean P;
    public int Q;
    public int R;
    public ob S;
    public float T;
    public float U;
    public final k f2477a;
    public final a1.e f2478b;
    public final LinearGradient f2481f;
    public final d[] f2485w;
    public final Drawable f2486x;
    public final t1 f2487y;
    public final Paint f2479c = new Paint(1);
    public final Matrix d = new Matrix();
    public final Path f2480e = new Path();
    public final RectF h = new RectF();
    public final RectF f2482n = new RectF();
    public final RectF f2483r = new RectF();
    public final RectF f2484s = new RectF();
    public final RectF v = new RectF();
    public float C = 0.0f;
    public float D = 0.0f;
    public final Matrix G = new Matrix();
    public boolean I = false;
    public boolean J = false;
    public boolean K = false;
    public boolean M = true;
    public int N = -1;
    public final ObjectAnimator V = ObjectAnimator.ofFloat(this, f2475a0, 1.0f).setDuration(560L);
    public final ObjectAnimator W = ObjectAnimator.ofFloat(this, f2476b0, 1.0f).setDuration(240L);

    public j(k kVar, t1 t1Var, ArrayList arrayList, a1.e eVar) {
        this.f2478b = eVar;
        this.f2477a = kVar;
        this.f2487y = t1Var;
        this.A = t1Var.getMessageObject();
        this.f2485w = new d[Math.min(5, arrayList.size())];
        int i9 = 0;
        while (true) {
            d[] dVarArr = this.f2485w;
            if (i9 < dVarArr.length) {
                dVarArr[i9] = new d(this, ((Long) arrayList.get(i9)).longValue());
                i9++;
            } else {
                this.f2479c.setStyle(Paint.Style.FILL);
                Drawable mutate = kVar.getContext().getDrawable(R.drawable.reactions_bubble_shadow).mutate();
                this.f2486x = mutate;
                t1Var.setHideSideButtonByQuickShare(true);
                kVar.performHapticFeedback(3, 1);
                int v02 = f6.v0(f6.G8, this.f2487y.getResourcesProvider());
                mutate.setColorFilter(new PorterDuffColorFilter(f6.w0(null, f6.Td, false), PorterDuff.Mode.MULTIPLY));
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(100.0f), new int[]{v02, 16777215 & v02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f2481f = linearGradient;
                this.f2479c.setShader(linearGradient);
                ObjectAnimator objectAnimator = this.V;
                LinearInterpolator linearInterpolator = h.f2456b;
                objectAnimator.setInterpolator(linearInterpolator);
                this.V.addListener(this);
                this.W.setInterpolator(linearInterpolator);
                this.W.addListener(this);
                AndroidUtilities.makeGlobalBlurBitmap(new bg.i(this, 6), 15.0f);
                return;
            }
        }
    }

    public static float b(float f10, float f11, float f12, float f13) {
        return (float) Math.toDegrees((float) Math.atan2(f13 - f11, f12 - f10));
    }

    public static PointF f(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10) {
        float f16 = f13 - f10;
        float f17 = f14 - f11;
        float sqrt = (float) Math.sqrt(Math.pow(f17, 2.0d) + Math.pow(f16, 2.0d));
        if (sqrt <= f12 + f15 && sqrt >= Math.abs(f12 - f15)) {
            float f18 = f12 * f12;
            float f19 = ((sqrt * sqrt) + (f18 - (f15 * f15))) / (2.0f * sqrt);
            float sqrt2 = (float) Math.sqrt(f18 - (f19 * f19));
            float d = aa.d.d(f19, f16, sqrt, f10);
            float d9 = aa.d.d(f19, f17, sqrt, f11);
            float f20 = (f17 * sqrt2) / sqrt;
            float f21 = d + f20;
            float f22 = (sqrt2 * f16) / sqrt;
            float f23 = d9 - f22;
            float f24 = d - f20;
            float f25 = d9 + f22;
            if (f21 != f24 && f21 < f24) {
                if (z10) {
                    return new PointF(f21, f23);
                }
                return new PointF(f24, f25);
            } else if (f23 > f25) {
                return new PointF(f21, f23);
            } else {
                return new PointF(f24, f25);
            }
        }
        return null;
    }

    public static float g(float f10, float f11, float f12) {
        return e2.c.z(f11, f10, f12, f10);
    }

    public static e i(Interpolator interpolator, int i9, int i10, int i11, boolean z10) {
        float f10 = i11;
        return new e(z10, i9 / f10, i10 / f10, interpolator);
    }

    public static float j(float f10) {
        if (f10 <= 0.0f) {
            return f10 + 180.0f;
        }
        return f10 - 180.0f;
    }

    public final void a(Path path, RectF rectF, float f10, float f11, boolean z10, boolean z11) {
        float f12 = f11 - f10;
        if (z10) {
            if (f12 > 0.0f) {
                f12 -= 360.0f;
            }
        } else if (f12 < 0.0f) {
            f12 += 360.0f;
        }
        if (Math.abs(f12) > 270.0f && z11) {
            this.M = false;
        }
        path.arcTo(rectF, f10, f12);
    }

    public final void c() {
        this.W.start();
        this.K = true;
        if (this.I && !this.P) {
            b bVar = new b(new a1.c(this, 13));
            this.L = bVar;
            RectF rectF = this.f2483r;
            int i9 = i.f2473a;
            bVar.a((int) rectF.width(), (int) (rectF.height() + AndroidUtilities.dp(30.0f)), 4.0f, AndroidUtilities.dp(10));
        }
        invalidateSelf();
    }

    public final void d() {
        d[] dVarArr;
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        this.f2487y.setHideSideButtonByQuickShare(false);
        if (!this.P) {
            this.P = true;
            Bitmap bitmap4 = this.E;
            if (bitmap4 != null) {
                bitmap4.recycle();
            }
            b bVar = this.L;
            if (bVar != null && (bitmap3 = bVar.f2427c) != null) {
                bitmap3.recycle();
                bVar.f2427c = null;
            }
            for (d dVar : this.f2485w) {
                b bVar2 = dVar.f2438f;
                if (bVar2 != null && (bitmap2 = bVar2.f2427c) != null) {
                    bitmap2.recycle();
                    bVar2.f2427c = null;
                }
                b bVar3 = dVar.f2437e;
                if (bVar3 != null && (bitmap = bVar3.f2427c) != null) {
                    bitmap.recycle();
                    bVar3.f2427c = null;
                }
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        e(canvas, false, 255);
    }

    public final void e(Canvas canvas, boolean z10, int i9) {
        float f10;
        float f11;
        int i10;
        k kVar;
        boolean z11;
        Canvas canvas2;
        int i11;
        float f12;
        int i12;
        float min;
        double d;
        j jVar = this;
        boolean z12 = jVar.O;
        k kVar2 = jVar.f2477a;
        t1 t1Var = jVar.f2487y;
        int i13 = 1;
        if (!z12) {
            int[] iArr = Z;
            t1Var.getLocationInWindow(iArr);
            int i14 = iArr[0];
            int i15 = iArr[1];
            kVar2.getLocationInWindow(iArr);
            int i16 = iArr[0];
            int i17 = iArr[1];
            jVar.Q = i14 - i16;
            jVar.R = i15 - i17;
            float dp = AndroidUtilities.dp(16.0f);
            float sideButtonStartX = t1Var.getSideButtonStartX() + jVar.Q + dp;
            float sideButtonStartY = t1Var.getSideButtonStartY() + jVar.R + dp;
            float f13 = sideButtonStartX - dp;
            float f14 = sideButtonStartY - dp;
            float f15 = sideButtonStartX + dp;
            float f16 = sideButtonStartY + dp;
            RectF rectF = jVar.h;
            rectF.set(f13, f14, f15, f16);
            float dp2 = AndroidUtilities.dp(16.0f);
            if (rectF.right + AndroidUtilities.dp(48.0f) + dp2 > kVar2.getMeasuredWidth()) {
                jVar.B = Math.max(0.0f, (kVar2.getMeasuredWidth() - dp2) - rectF.right);
            } else if (((rectF.right + AndroidUtilities.dp(48.0f)) - jVar.h()) - dp2 < 0.0f) {
                jVar.B = Math.max(0.0f, (dp2 + jVar.h()) - rectF.right);
            } else {
                jVar.B = AndroidUtilities.dp(48.0f);
            }
            jVar.V.start();
            jVar.O = true;
        }
        b bVar = jVar.L;
        d[] dVarArr = jVar.f2485w;
        int i18 = 2;
        RectF rectF2 = jVar.f2483r;
        if (bVar != null && !z10) {
            bVar.setBounds((int) rectF2.left, (int) (rectF2.top - AndroidUtilities.dp(30.0f)), (int) rectF2.right, (int) rectF2.bottom);
            jVar.L.f2431i = (int) ((1.0f - h.f2457c.getInterpolation(jVar.D)) * 255.0f);
            jVar.L.draw(canvas);
            if (jVar.N != -1) {
                float interpolation = 1.0f - h.f2458e.getInterpolation(jVar.D);
                float interpolation2 = h.d.getInterpolation(jVar.D);
                float centerX = rectF2.centerX();
                int i19 = i.f2473a;
                float dp3 = centerX + (AndroidUtilities.dp(i19 + 11) * (jVar.N - 2));
                float centerY = rectF2.centerY();
                float f17 = jVar.T;
                float f18 = jVar.U;
                float f19 = (dp3 + f17) / 2.0f;
                ob obVar = jVar.S;
                if (obVar != null && obVar.top) {
                    min = Math.max(centerY, f18) + AndroidUtilities.dp(15);
                } else {
                    min = Math.min(centerY, f18) - AndroidUtilities.dp(15);
                }
                float g10 = g(dp3, f17, interpolation2);
                double d9 = dp3;
                double d10 = centerY;
                double d11 = f17;
                double d12 = f18;
                double d13 = f19;
                double d14 = d11 - d9;
                double d15 = (min - (((d12 - d10) * (d13 - d9)) / d14)) - d10;
                double d16 = ((d11 * d9) + ((d13 * d13) - (d11 * d13))) - (d13 * d9);
                double d17 = 0.0d;
                if (d16 == 0.0d) {
                    d = 0.0d;
                } else {
                    d = d15 / d16;
                }
                double d18 = d9 * d9;
                double d19 = (d12 - (((d11 * d11) - d18) * d)) - d10;
                if (d14 != 0.0d) {
                    d17 = d19 / d14;
                }
                double g11 = g(dp3, f17, interpolation2);
                float f20 = (float) ((d17 * g11) + (d * g11 * g11) + ((d10 - (d18 * d)) - (d17 * d9)));
                float f21 = i19;
                float g12 = g((AndroidUtilities.dp(f21) / 2.0f) + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), interpolation2);
                final d dVar = dVarArr[jVar.N];
                if (dVar.f2437e == null) {
                    b bVar2 = new b(new a() {
                        @Override
                        public final void l(Canvas canvas3, int i20) {
                            float f22;
                            float f23;
                            switch (r2) {
                                case 0:
                                    d dVar2 = dVar;
                                    dVar2.getClass();
                                    canvas3.save();
                                    canvas3.translate(-dVar2.f2440i, -dVar2.f2441j);
                                    float f24 = dVar2.f2440i;
                                    float f25 = dVar2.f2441j;
                                    float f26 = i20 / 255.0f;
                                    RectF rectF3 = AndroidUtilities.rectTmp;
                                    float dp4 = AndroidUtilities.dp(21.0f) / 2.0f;
                                    int i21 = i.f2473a;
                                    float f27 = 8;
                                    rectF3.set(f24, f25, dVar2.h.getWidth() + f24 + (AndroidUtilities.dp(f27) * 2), AndroidUtilities.dp(21.0f) + f25);
                                    t1 t1Var2 = dVar2.f2435b;
                                    boolean R2 = t1Var2.R2();
                                    Paint paint = dVar2.f2439g;
                                    if (paint != null) {
                                        int alpha = paint.getAlpha();
                                        paint.setAlpha((int) (255.0f * f26));
                                        canvas3.drawRoundRect(rectF3, dp4, dp4, paint);
                                        paint.setAlpha(alpha);
                                        f22 = 21.0f;
                                    } else {
                                        Point point = AndroidUtilities.displaySize;
                                        f22 = 21.0f;
                                        t1Var2.p0(0.0f, 0.0f, point.x, point.y);
                                        Paint M2 = t1Var2.M2("paintChatActionBackground");
                                        int alpha2 = M2.getAlpha();
                                        if (R2) {
                                            f23 = alpha2;
                                        } else {
                                            f23 = 229.5f;
                                        }
                                        M2.setAlpha((int) (f23 * f26));
                                        canvas3.drawRoundRect(rectF3, dp4, dp4, M2);
                                        M2.setAlpha(alpha2);
                                    }
                                    if (R2 || paint != null) {
                                        int alpha3 = f6.f23069h2.getAlpha();
                                        f6.f23069h2.setAlpha((int) (alpha3 * f26));
                                        canvas3.drawRoundRect(rectF3, dp4, dp4, f6.f23069h2);
                                        f6.f23069h2.setAlpha(alpha3);
                                    }
                                    canvas3.save();
                                    canvas3.translate(f24 + AndroidUtilities.dp(f27), ((AndroidUtilities.dp(f22) - dVar2.h.getHeight()) / 2.0f) + f25);
                                    int alpha4 = dVar2.h.getPaint().getAlpha();
                                    dVar2.h.getPaint().setAlpha((int) (alpha4 * f26));
                                    dVar2.h.draw(canvas3);
                                    dVar2.h.getPaint().setAlpha(alpha4);
                                    canvas3.restore();
                                    canvas3.restore();
                                    return;
                                default:
                                    d dVar3 = dVar;
                                    dVar3.getClass();
                                    int i22 = i.f2473a;
                                    float dp5 = AndroidUtilities.dp(21);
                                    dVar3.a(canvas3, dp5, dp5, dp5, i20 / 255.0f);
                                    return;
                            }
                        }
                    });
                    dVar.f2437e = bVar2;
                    bVar2.a(AndroidUtilities.dp(f21), AndroidUtilities.dp(f21), 4.0f, AndroidUtilities.dp(10));
                }
                canvas.save();
                canvas.translate(g10 - g12, f20 - g12);
                float f22 = 21;
                canvas.scale(g12 / AndroidUtilities.dp(f22), g12 / AndroidUtilities.dp(f22));
                b bVar3 = dVar.f2437e;
                bVar3.f2431i = (int) (interpolation * 255.0f);
                bVar3.draw(canvas);
                canvas.restore();
                return;
            }
            return;
        }
        if (!z10) {
            f10 = 1.0f - jVar.D;
        } else {
            f10 = i9 / 255.0f;
        }
        float f23 = f10;
        float g13 = g(0.3f, 0.075f, h.f2463k.getInterpolation(jVar.C));
        Matrix matrix = jVar.d;
        matrix.reset();
        matrix.setScale(g13, g13);
        matrix.postTranslate(0.0f, rectF2.bottom);
        jVar.f2481f.setLocalMatrix(matrix);
        Paint paint = jVar.f2479c;
        paint.setAlpha((int) (h.f2462j.getInterpolation(jVar.C) * 255.0f * f23));
        RectF rectF3 = X;
        rectF3.set(rectF2);
        rectF3.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        Rect rect = Y;
        rectF3.round(rect);
        Drawable drawable = jVar.f2486x;
        drawable.setAlpha((int) (f23 * 255.0f));
        drawable.setBounds(rect);
        drawable.draw(canvas);
        boolean z13 = jVar.I;
        RectF rectF4 = jVar.f2482n;
        if (!z13) {
            canvas.save();
            canvas.translate(rectF4.left, rectF4.top);
            canvas.rotate((h.f2459f.getInterpolation(jVar.C) - h.f2460g.getInterpolation(jVar.C)) * (-40.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            canvas.translate(-t1Var.getSideButtonStartX(), -t1Var.getSideButtonStartY());
            t1Var.k2(canvas, true);
            canvas.restore();
        }
        if (jVar.M && !jVar.I) {
            canvas.drawPath(jVar.f2480e, paint);
        } else {
            float min2 = Math.min(rectF2.width(), rectF2.height()) / 2.0f;
            float min3 = Math.min(rectF4.width(), rectF4.height()) / 2.0f;
            canvas.drawRoundRect(rectF2, min2, min2, paint);
            if (!jVar.I) {
                canvas.drawRoundRect(rectF4, min3, min3, paint);
            }
        }
        float interpolation3 = h.f2472t.getInterpolation(jVar.C) * AndroidUtilities.dp(2.0f);
        float f24 = i.f2473a + 2;
        float interpolation4 = ((h.f2469q.getInterpolation(jVar.C) * AndroidUtilities.dp(f24)) / 2.0f) - interpolation3;
        float interpolation5 = ((h.f2470r.getInterpolation(jVar.C) * AndroidUtilities.dp(f24)) / 2.0f) - interpolation3;
        float interpolation6 = ((h.f2471s.getInterpolation(jVar.C) * AndroidUtilities.dp(f24)) / 2.0f) - interpolation3;
        int i20 = 0;
        while (i20 < i18) {
            int i21 = 0;
            while (i21 < dVarArr.length) {
                if ((i20 == 0 && i21 == jVar.N) || (i20 == i13 && i21 != jVar.N)) {
                    i10 = i20;
                    i12 = i21;
                    kVar = kVar2;
                } else {
                    float length = i21 - ((dVarArr.length / 2.0f) - 0.5f);
                    if (i21 == i18) {
                        f11 = interpolation4;
                    } else if (i21 != i13 && i21 != 3) {
                        f11 = interpolation6;
                    } else {
                        f11 = interpolation5;
                    }
                    float dp4 = (AndroidUtilities.dp(i.f2473a + 11) * length) + rectF2.centerX();
                    float centerY2 = rectF2.centerY();
                    i10 = i20;
                    final d dVar2 = dVarArr[i21];
                    float f25 = 16;
                    float dp5 = AndroidUtilities.dp(f25);
                    float measuredWidth = kVar2.getMeasuredWidth() - AndroidUtilities.dp(f25);
                    float f26 = rectF2.left;
                    kVar = kVar2;
                    float f27 = rectF2.right;
                    if (i21 == jVar.N && jVar.K) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        dVar2.getClass();
                        canvas2 = canvas;
                        i11 = i21;
                        f12 = dp4;
                        dVar2.a(canvas2, f12, centerY2, f11 + (AndroidUtilities.dp(2.0f) * dVar2.f2446o), f23);
                    } else {
                        canvas2 = canvas;
                        i11 = i21;
                        f12 = dp4;
                    }
                    float f28 = dVar2.f2446o;
                    if (f28 > 0.0f && dVar2.h != null) {
                        float f29 = (f28 * 0.15f) + 0.85f;
                        canvas2.save();
                        canvas2.scale(f29, f29, f12, centerY2);
                        float f30 = dVar2.f2446o * f23;
                        i12 = i11;
                        float D = l0.D(8, 2, dVar2.h.getWidth());
                        dVar2.f2440i = d.b(d.b(f12, D, f26, f27), D, dp5, measuredWidth) - (D / 2.0f);
                        dVar2.f2441j = centerY2 - AndroidUtilities.dp(58.0f);
                        if (dVar2.f2438f == null) {
                            j jVar2 = dVar2.f2434a;
                            if (!jVar2.P) {
                                dVar2.f2439g = jVar2.H;
                                b bVar4 = new b(new a() {
                                    @Override
                                    public final void l(Canvas canvas3, int i202) {
                                        float f222;
                                        float f232;
                                        switch (r2) {
                                            case 0:
                                                d dVar22 = dVar2;
                                                dVar22.getClass();
                                                canvas3.save();
                                                canvas3.translate(-dVar22.f2440i, -dVar22.f2441j);
                                                float f242 = dVar22.f2440i;
                                                float f252 = dVar22.f2441j;
                                                float f262 = i202 / 255.0f;
                                                RectF rectF32 = AndroidUtilities.rectTmp;
                                                float dp42 = AndroidUtilities.dp(21.0f) / 2.0f;
                                                int i212 = i.f2473a;
                                                float f272 = 8;
                                                rectF32.set(f242, f252, dVar22.h.getWidth() + f242 + (AndroidUtilities.dp(f272) * 2), AndroidUtilities.dp(21.0f) + f252);
                                                t1 t1Var2 = dVar22.f2435b;
                                                boolean R2 = t1Var2.R2();
                                                Paint paint2 = dVar22.f2439g;
                                                if (paint2 != null) {
                                                    int alpha = paint2.getAlpha();
                                                    paint2.setAlpha((int) (255.0f * f262));
                                                    canvas3.drawRoundRect(rectF32, dp42, dp42, paint2);
                                                    paint2.setAlpha(alpha);
                                                    f222 = 21.0f;
                                                } else {
                                                    Point point = AndroidUtilities.displaySize;
                                                    f222 = 21.0f;
                                                    t1Var2.p0(0.0f, 0.0f, point.x, point.y);
                                                    Paint M2 = t1Var2.M2("paintChatActionBackground");
                                                    int alpha2 = M2.getAlpha();
                                                    if (R2) {
                                                        f232 = alpha2;
                                                    } else {
                                                        f232 = 229.5f;
                                                    }
                                                    M2.setAlpha((int) (f232 * f262));
                                                    canvas3.drawRoundRect(rectF32, dp42, dp42, M2);
                                                    M2.setAlpha(alpha2);
                                                }
                                                if (R2 || paint2 != null) {
                                                    int alpha3 = f6.f23069h2.getAlpha();
                                                    f6.f23069h2.setAlpha((int) (alpha3 * f262));
                                                    canvas3.drawRoundRect(rectF32, dp42, dp42, f6.f23069h2);
                                                    f6.f23069h2.setAlpha(alpha3);
                                                }
                                                canvas3.save();
                                                canvas3.translate(f242 + AndroidUtilities.dp(f272), ((AndroidUtilities.dp(f222) - dVar22.h.getHeight()) / 2.0f) + f252);
                                                int alpha4 = dVar22.h.getPaint().getAlpha();
                                                dVar22.h.getPaint().setAlpha((int) (alpha4 * f262));
                                                dVar22.h.draw(canvas3);
                                                dVar22.h.getPaint().setAlpha(alpha4);
                                                canvas3.restore();
                                                canvas3.restore();
                                                return;
                                            default:
                                                d dVar3 = dVar2;
                                                dVar3.getClass();
                                                int i22 = i.f2473a;
                                                float dp52 = AndroidUtilities.dp(21);
                                                dVar3.a(canvas3, dp52, dp52, dp52, i202 / 255.0f);
                                                return;
                                        }
                                    }
                                });
                                dVar2.f2438f = bVar4;
                                bVar4.a((int) D, AndroidUtilities.dp(21.0f), 3.0f, AndroidUtilities.dp(4));
                            }
                        }
                        b bVar5 = dVar2.f2438f;
                        if (bVar5 != null) {
                            float f31 = dVar2.f2440i;
                            float f32 = dVar2.f2441j;
                            bVar5.setBounds((int) f31, (int) f32, (int) (f31 + D), (int) (f32 + AndroidUtilities.dp(21.0f)));
                            b bVar6 = dVar2.f2438f;
                            bVar6.f2431i = (int) (f30 * 255.0f);
                            bVar6.draw(canvas2);
                        }
                        canvas2.restore();
                    } else {
                        i12 = i11;
                    }
                }
                i21 = i12 + 1;
                jVar = this;
                i20 = i10;
                kVar2 = kVar;
                i13 = 1;
                i18 = 2;
            }
            i20++;
            jVar = this;
            i13 = 1;
            i18 = 2;
        }
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    public final int h() {
        return AndroidUtilities.dp(((i.f2473a + 11) * this.f2485w.length) + 7);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ObjectAnimator objectAnimator = this.V;
        a1.e eVar = this.f2478b;
        if (animator == objectAnimator) {
            this.f2487y.setHideSideButtonByQuickShare(false);
            this.I = true;
            invalidateSelf();
            if (this.J) {
                eVar.run();
            }
        } else if (animator == this.W) {
            this.J = true;
            invalidateSelf();
            ob obVar = this.S;
            if (obVar != null) {
                obVar.f31342a.setVisibility(0);
            }
            if (this.I) {
                eVar.run();
            }
        }
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
    }

    @Override
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override
    public final void onAnimationStart(Animator animator) {
    }

    @Override
    public final void setAlpha(int i9) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
