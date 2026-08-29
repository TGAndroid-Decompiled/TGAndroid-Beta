package fh;

import a4.w;
import ag.i0;
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
import eg.n;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.x3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.ub;
public final class j extends Drawable implements Animator.AnimatorListener {
    public static final RectF X = new RectF();
    public static final Rect Y = new Rect();
    public static final int[] Z = new int[2];
    public static final g f6814a0 = new g("openFactor", 0);
    public static final g f6815b0 = new g("openFactor", 1);
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
    public ub S;
    public float T;
    public float U;
    public final k f6816a;
    public final ef.c f6817b;
    public final LinearGradient f6820f;
    public final d[] f6824w;
    public final Drawable f6825x;
    public final s1 f6826y;
    public final Paint f6818c = new Paint(1);
    public final Matrix d = new Matrix();
    public final Path f6819e = new Path();
    public final RectF h = new RectF();
    public final RectF f6821n = new RectF();
    public final RectF f6822r = new RectF();
    public final RectF f6823s = new RectF();
    public final RectF v = new RectF();
    public float C = 0.0f;
    public float D = 0.0f;
    public final Matrix G = new Matrix();
    public boolean I = false;
    public boolean J = false;
    public boolean K = false;
    public boolean M = true;
    public int N = -1;
    public final ObjectAnimator V = ObjectAnimator.ofFloat(this, f6814a0, 1.0f).setDuration(560L);
    public final ObjectAnimator W = ObjectAnimator.ofFloat(this, f6815b0, 1.0f).setDuration(240L);

    public j(k kVar, s1 s1Var, ArrayList arrayList, ef.c cVar) {
        this.f6817b = cVar;
        this.f6816a = kVar;
        this.f6826y = s1Var;
        this.A = s1Var.getMessageObject();
        this.f6824w = new d[Math.min(5, arrayList.size())];
        int i10 = 0;
        while (true) {
            d[] dVarArr = this.f6824w;
            if (i10 < dVarArr.length) {
                dVarArr[i10] = new d(this, ((Long) arrayList.get(i10)).longValue());
                i10++;
            } else {
                this.f6818c.setStyle(Paint.Style.FILL);
                Drawable mutate = kVar.getContext().getDrawable(R.drawable.reactions_bubble_shadow).mutate();
                this.f6825x = mutate;
                s1Var.setHideSideButtonByQuickShare(true);
                kVar.performHapticFeedback(3, 1);
                int v02 = g6.v0(g6.G8, this.f6826y.getResourcesProvider());
                mutate.setColorFilter(new PorterDuffColorFilter(g6.w0(null, g6.Td, false), PorterDuff.Mode.MULTIPLY));
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(100.0f), new int[]{v02, 16777215 & v02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f6820f = linearGradient;
                this.f6818c.setShader(linearGradient);
                ObjectAnimator objectAnimator = this.V;
                LinearInterpolator linearInterpolator = h.f6795b;
                objectAnimator.setInterpolator(linearInterpolator);
                this.V.addListener(this);
                this.W.setInterpolator(linearInterpolator);
                this.W.addListener(this);
                AndroidUtilities.makeGlobalBlurBitmap(new i0(this, 13), 15.0f);
                return;
            }
        }
    }

    public static float b(float f9, float f10, float f11, float f12) {
        return (float) Math.toDegrees((float) Math.atan2(f12 - f10, f11 - f9));
    }

    public static PointF f(float f9, float f10, float f11, float f12, float f13, float f14, boolean z10) {
        float f15 = f12 - f9;
        float f16 = f13 - f10;
        float sqrt = (float) Math.sqrt(Math.pow(f16, 2.0d) + Math.pow(f15, 2.0d));
        if (sqrt <= f11 + f14 && sqrt >= Math.abs(f11 - f14)) {
            float f17 = f11 * f11;
            float f18 = ((sqrt * sqrt) + (f17 - (f14 * f14))) / (2.0f * sqrt);
            float sqrt2 = (float) Math.sqrt(f17 - (f18 * f18));
            float d = w.d(f18, f15, sqrt, f9);
            float d10 = w.d(f18, f16, sqrt, f10);
            float f19 = (f16 * sqrt2) / sqrt;
            float f20 = d + f19;
            float f21 = (sqrt2 * f15) / sqrt;
            float f22 = d10 - f21;
            float f23 = d - f19;
            float f24 = d10 + f21;
            if (f20 != f23 && f20 < f23) {
                if (z10) {
                    return new PointF(f20, f22);
                }
                return new PointF(f23, f24);
            } else if (f22 > f24) {
                return new PointF(f20, f22);
            } else {
                return new PointF(f23, f24);
            }
        }
        return null;
    }

    public static float g(float f9, float f10, float f11) {
        return com.google.android.recaptcha.internal.a.z(f10, f9, f11, f9);
    }

    public static e i(Interpolator interpolator, int i10, int i11, int i12, boolean z10) {
        float f9 = i12;
        return new e(z10, i10 / f9, i11 / f9, interpolator);
    }

    public static float j(float f9) {
        if (f9 <= 0.0f) {
            return f9 + 180.0f;
        }
        return f9 - 180.0f;
    }

    public final void a(Path path, RectF rectF, float f9, float f10, boolean z10, boolean z11) {
        float f11 = f10 - f9;
        if (z10) {
            if (f11 > 0.0f) {
                f11 -= 360.0f;
            }
        } else if (f11 < 0.0f) {
            f11 += 360.0f;
        }
        if (Math.abs(f11) > 270.0f && z11) {
            this.M = false;
        }
        path.arcTo(rectF, f9, f11);
    }

    public final void c() {
        this.W.start();
        this.K = true;
        if (this.I && !this.P) {
            b bVar = new b(new n(this, 3));
            this.L = bVar;
            RectF rectF = this.f6822r;
            int i10 = i.f6812a;
            bVar.a((int) rectF.width(), (int) (rectF.height() + AndroidUtilities.dp(30.0f)), 4.0f, AndroidUtilities.dp(10));
        }
        invalidateSelf();
    }

    public final void d() {
        d[] dVarArr;
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        this.f6826y.setHideSideButtonByQuickShare(false);
        if (!this.P) {
            this.P = true;
            Bitmap bitmap4 = this.E;
            if (bitmap4 != null) {
                bitmap4.recycle();
            }
            b bVar = this.L;
            if (bVar != null && (bitmap3 = bVar.f6766c) != null) {
                bitmap3.recycle();
                bVar.f6766c = null;
            }
            for (d dVar : this.f6824w) {
                b bVar2 = dVar.f6777f;
                if (bVar2 != null && (bitmap2 = bVar2.f6766c) != null) {
                    bitmap2.recycle();
                    bVar2.f6766c = null;
                }
                b bVar3 = dVar.f6776e;
                if (bVar3 != null && (bitmap = bVar3.f6766c) != null) {
                    bitmap.recycle();
                    bVar3.f6766c = null;
                }
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        e(canvas, false, 255);
    }

    public final void e(Canvas canvas, boolean z10, int i10) {
        float f9;
        float f10;
        int i11;
        k kVar;
        boolean z11;
        Canvas canvas2;
        int i12;
        float f11;
        int i13;
        float min;
        double d;
        j jVar = this;
        boolean z12 = jVar.O;
        k kVar2 = jVar.f6816a;
        s1 s1Var = jVar.f6826y;
        int i14 = 1;
        if (!z12) {
            int[] iArr = Z;
            s1Var.getLocationInWindow(iArr);
            int i15 = iArr[0];
            int i16 = iArr[1];
            kVar2.getLocationInWindow(iArr);
            int i17 = iArr[0];
            int i18 = iArr[1];
            jVar.Q = i15 - i17;
            jVar.R = i16 - i18;
            float dp = AndroidUtilities.dp(16.0f);
            float sideButtonStartX = s1Var.getSideButtonStartX() + jVar.Q + dp;
            float sideButtonStartY = s1Var.getSideButtonStartY() + jVar.R + dp;
            float f12 = sideButtonStartX - dp;
            float f13 = sideButtonStartY - dp;
            float f14 = sideButtonStartX + dp;
            float f15 = sideButtonStartY + dp;
            RectF rectF = jVar.h;
            rectF.set(f12, f13, f14, f15);
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
        d[] dVarArr = jVar.f6824w;
        int i19 = 2;
        RectF rectF2 = jVar.f6822r;
        if (bVar != null && !z10) {
            bVar.setBounds((int) rectF2.left, (int) (rectF2.top - AndroidUtilities.dp(30.0f)), (int) rectF2.right, (int) rectF2.bottom);
            jVar.L.f6770i = (int) ((1.0f - h.f6796c.getInterpolation(jVar.D)) * 255.0f);
            jVar.L.draw(canvas);
            if (jVar.N != -1) {
                float interpolation = 1.0f - h.f6797e.getInterpolation(jVar.D);
                float interpolation2 = h.d.getInterpolation(jVar.D);
                float centerX = rectF2.centerX();
                int i20 = i.f6812a;
                float dp3 = centerX + (AndroidUtilities.dp(i20 + 11) * (jVar.N - 2));
                float centerY = rectF2.centerY();
                float f16 = jVar.T;
                float f17 = jVar.U;
                float f18 = (dp3 + f16) / 2.0f;
                ub ubVar = jVar.S;
                if (ubVar != null && ubVar.top) {
                    min = Math.max(centerY, f17) + AndroidUtilities.dp(15);
                } else {
                    min = Math.min(centerY, f17) - AndroidUtilities.dp(15);
                }
                float g10 = g(dp3, f16, interpolation2);
                double d10 = dp3;
                double d11 = centerY;
                double d12 = f16;
                double d13 = f17;
                double d14 = f18;
                double d15 = d12 - d10;
                double d16 = (min - (((d13 - d11) * (d14 - d10)) / d15)) - d11;
                double d17 = ((d12 * d10) + ((d14 * d14) - (d12 * d14))) - (d14 * d10);
                double d18 = 0.0d;
                if (d17 == 0.0d) {
                    d = 0.0d;
                } else {
                    d = d16 / d17;
                }
                double d19 = d10 * d10;
                double d20 = (d13 - (((d12 * d12) - d19) * d)) - d11;
                if (d15 != 0.0d) {
                    d18 = d20 / d15;
                }
                double g11 = g(dp3, f16, interpolation2);
                float f19 = (float) ((d18 * g11) + (d * g11 * g11) + ((d11 - (d19 * d)) - (d18 * d10)));
                float f20 = i20;
                float g12 = g((AndroidUtilities.dp(f20) / 2.0f) + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), interpolation2);
                final d dVar = dVarArr[jVar.N];
                if (dVar.f6776e == null) {
                    b bVar2 = new b(new a() {
                        @Override
                        public final void p(Canvas canvas3, int i21) {
                            float f21;
                            float f22;
                            switch (r2) {
                                case 0:
                                    d dVar2 = dVar;
                                    dVar2.getClass();
                                    canvas3.save();
                                    canvas3.translate(-dVar2.f6779i, -dVar2.f6780j);
                                    float f23 = dVar2.f6779i;
                                    float f24 = dVar2.f6780j;
                                    float f25 = i21 / 255.0f;
                                    RectF rectF3 = AndroidUtilities.rectTmp;
                                    float dp4 = AndroidUtilities.dp(21.0f) / 2.0f;
                                    int i22 = i.f6812a;
                                    float f26 = 8;
                                    rectF3.set(f23, f24, dVar2.h.getWidth() + f23 + (AndroidUtilities.dp(f26) * 2), AndroidUtilities.dp(21.0f) + f24);
                                    s1 s1Var2 = dVar2.f6774b;
                                    boolean R2 = s1Var2.R2();
                                    Paint paint = dVar2.f6778g;
                                    if (paint != null) {
                                        int alpha = paint.getAlpha();
                                        paint.setAlpha((int) (255.0f * f25));
                                        canvas3.drawRoundRect(rectF3, dp4, dp4, paint);
                                        paint.setAlpha(alpha);
                                        f21 = 21.0f;
                                    } else {
                                        Point point = AndroidUtilities.displaySize;
                                        f21 = 21.0f;
                                        s1Var2.q0(0.0f, 0.0f, point.x, point.y);
                                        Paint M2 = s1Var2.M2("paintChatActionBackground");
                                        int alpha2 = M2.getAlpha();
                                        if (R2) {
                                            f22 = alpha2;
                                        } else {
                                            f22 = 229.5f;
                                        }
                                        M2.setAlpha((int) (f22 * f25));
                                        canvas3.drawRoundRect(rectF3, dp4, dp4, M2);
                                        M2.setAlpha(alpha2);
                                    }
                                    if (R2 || paint != null) {
                                        int alpha3 = g6.f23130h2.getAlpha();
                                        g6.f23130h2.setAlpha((int) (alpha3 * f25));
                                        canvas3.drawRoundRect(rectF3, dp4, dp4, g6.f23130h2);
                                        g6.f23130h2.setAlpha(alpha3);
                                    }
                                    canvas3.save();
                                    canvas3.translate(f23 + AndroidUtilities.dp(f26), ((AndroidUtilities.dp(f21) - dVar2.h.getHeight()) / 2.0f) + f24);
                                    int alpha4 = dVar2.h.getPaint().getAlpha();
                                    dVar2.h.getPaint().setAlpha((int) (alpha4 * f25));
                                    dVar2.h.draw(canvas3);
                                    dVar2.h.getPaint().setAlpha(alpha4);
                                    canvas3.restore();
                                    canvas3.restore();
                                    return;
                                default:
                                    d dVar3 = dVar;
                                    dVar3.getClass();
                                    int i23 = i.f6812a;
                                    float dp5 = AndroidUtilities.dp(21);
                                    dVar3.a(canvas3, dp5, dp5, dp5, i21 / 255.0f);
                                    return;
                            }
                        }
                    });
                    dVar.f6776e = bVar2;
                    bVar2.a(AndroidUtilities.dp(f20), AndroidUtilities.dp(f20), 4.0f, AndroidUtilities.dp(10));
                }
                canvas.save();
                canvas.translate(g10 - g12, f19 - g12);
                float f21 = 21;
                canvas.scale(g12 / AndroidUtilities.dp(f21), g12 / AndroidUtilities.dp(f21));
                b bVar3 = dVar.f6776e;
                bVar3.f6770i = (int) (interpolation * 255.0f);
                bVar3.draw(canvas);
                canvas.restore();
                return;
            }
            return;
        }
        if (!z10) {
            f9 = 1.0f - jVar.D;
        } else {
            f9 = i10 / 255.0f;
        }
        float f22 = f9;
        float g13 = g(0.3f, 0.075f, h.f6802k.getInterpolation(jVar.C));
        Matrix matrix = jVar.d;
        matrix.reset();
        matrix.setScale(g13, g13);
        matrix.postTranslate(0.0f, rectF2.bottom);
        jVar.f6820f.setLocalMatrix(matrix);
        Paint paint = jVar.f6818c;
        paint.setAlpha((int) (h.f6801j.getInterpolation(jVar.C) * 255.0f * f22));
        RectF rectF3 = X;
        rectF3.set(rectF2);
        rectF3.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        Rect rect = Y;
        rectF3.round(rect);
        Drawable drawable = jVar.f6825x;
        drawable.setAlpha((int) (f22 * 255.0f));
        drawable.setBounds(rect);
        drawable.draw(canvas);
        boolean z13 = jVar.I;
        RectF rectF4 = jVar.f6821n;
        if (!z13) {
            canvas.save();
            canvas.translate(rectF4.left, rectF4.top);
            canvas.rotate((h.f6798f.getInterpolation(jVar.C) - h.f6799g.getInterpolation(jVar.C)) * (-40.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            canvas.translate(-s1Var.getSideButtonStartX(), -s1Var.getSideButtonStartY());
            s1Var.k2(canvas, true);
            canvas.restore();
        }
        if (jVar.M && !jVar.I) {
            canvas.drawPath(jVar.f6819e, paint);
        } else {
            float min2 = Math.min(rectF2.width(), rectF2.height()) / 2.0f;
            float min3 = Math.min(rectF4.width(), rectF4.height()) / 2.0f;
            canvas.drawRoundRect(rectF2, min2, min2, paint);
            if (!jVar.I) {
                canvas.drawRoundRect(rectF4, min3, min3, paint);
            }
        }
        float interpolation3 = h.f6811t.getInterpolation(jVar.C) * AndroidUtilities.dp(2.0f);
        float f23 = i.f6812a + 2;
        float interpolation4 = ((h.f6808q.getInterpolation(jVar.C) * AndroidUtilities.dp(f23)) / 2.0f) - interpolation3;
        float interpolation5 = ((h.f6809r.getInterpolation(jVar.C) * AndroidUtilities.dp(f23)) / 2.0f) - interpolation3;
        float interpolation6 = ((h.f6810s.getInterpolation(jVar.C) * AndroidUtilities.dp(f23)) / 2.0f) - interpolation3;
        int i21 = 0;
        while (i21 < i19) {
            int i22 = 0;
            while (i22 < dVarArr.length) {
                if ((i21 == 0 && i22 == jVar.N) || (i21 == i14 && i22 != jVar.N)) {
                    i11 = i21;
                    i13 = i22;
                    kVar = kVar2;
                } else {
                    float length = i22 - ((dVarArr.length / 2.0f) - 0.5f);
                    if (i22 == i19) {
                        f10 = interpolation4;
                    } else if (i22 != i14 && i22 != 3) {
                        f10 = interpolation6;
                    } else {
                        f10 = interpolation5;
                    }
                    float dp4 = (AndroidUtilities.dp(i.f6812a + 11) * length) + rectF2.centerX();
                    float centerY2 = rectF2.centerY();
                    i11 = i21;
                    final d dVar2 = dVarArr[i22];
                    float f24 = 16;
                    float dp5 = AndroidUtilities.dp(f24);
                    float measuredWidth = kVar2.getMeasuredWidth() - AndroidUtilities.dp(f24);
                    float f25 = rectF2.left;
                    kVar = kVar2;
                    float f26 = rectF2.right;
                    if (i22 == jVar.N && jVar.K) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        dVar2.getClass();
                        canvas2 = canvas;
                        i12 = i22;
                        f11 = dp4;
                        dVar2.a(canvas2, f11, centerY2, f10 + (AndroidUtilities.dp(2.0f) * dVar2.f6785o), f22);
                    } else {
                        canvas2 = canvas;
                        i12 = i22;
                        f11 = dp4;
                    }
                    float f27 = dVar2.f6785o;
                    if (f27 > 0.0f && dVar2.h != null) {
                        float f28 = (f27 * 0.15f) + 0.85f;
                        canvas2.save();
                        canvas2.scale(f28, f28, f11, centerY2);
                        float f29 = dVar2.f6785o * f22;
                        i13 = i12;
                        float D = x3.D(8, 2, dVar2.h.getWidth());
                        dVar2.f6779i = d.b(d.b(f11, D, f25, f26), D, dp5, measuredWidth) - (D / 2.0f);
                        dVar2.f6780j = centerY2 - AndroidUtilities.dp(58.0f);
                        if (dVar2.f6777f == null) {
                            j jVar2 = dVar2.f6773a;
                            if (!jVar2.P) {
                                dVar2.f6778g = jVar2.H;
                                b bVar4 = new b(new a() {
                                    @Override
                                    public final void p(Canvas canvas3, int i212) {
                                        float f212;
                                        float f222;
                                        switch (r2) {
                                            case 0:
                                                d dVar22 = dVar2;
                                                dVar22.getClass();
                                                canvas3.save();
                                                canvas3.translate(-dVar22.f6779i, -dVar22.f6780j);
                                                float f232 = dVar22.f6779i;
                                                float f242 = dVar22.f6780j;
                                                float f252 = i212 / 255.0f;
                                                RectF rectF32 = AndroidUtilities.rectTmp;
                                                float dp42 = AndroidUtilities.dp(21.0f) / 2.0f;
                                                int i222 = i.f6812a;
                                                float f262 = 8;
                                                rectF32.set(f232, f242, dVar22.h.getWidth() + f232 + (AndroidUtilities.dp(f262) * 2), AndroidUtilities.dp(21.0f) + f242);
                                                s1 s1Var2 = dVar22.f6774b;
                                                boolean R2 = s1Var2.R2();
                                                Paint paint2 = dVar22.f6778g;
                                                if (paint2 != null) {
                                                    int alpha = paint2.getAlpha();
                                                    paint2.setAlpha((int) (255.0f * f252));
                                                    canvas3.drawRoundRect(rectF32, dp42, dp42, paint2);
                                                    paint2.setAlpha(alpha);
                                                    f212 = 21.0f;
                                                } else {
                                                    Point point = AndroidUtilities.displaySize;
                                                    f212 = 21.0f;
                                                    s1Var2.q0(0.0f, 0.0f, point.x, point.y);
                                                    Paint M2 = s1Var2.M2("paintChatActionBackground");
                                                    int alpha2 = M2.getAlpha();
                                                    if (R2) {
                                                        f222 = alpha2;
                                                    } else {
                                                        f222 = 229.5f;
                                                    }
                                                    M2.setAlpha((int) (f222 * f252));
                                                    canvas3.drawRoundRect(rectF32, dp42, dp42, M2);
                                                    M2.setAlpha(alpha2);
                                                }
                                                if (R2 || paint2 != null) {
                                                    int alpha3 = g6.f23130h2.getAlpha();
                                                    g6.f23130h2.setAlpha((int) (alpha3 * f252));
                                                    canvas3.drawRoundRect(rectF32, dp42, dp42, g6.f23130h2);
                                                    g6.f23130h2.setAlpha(alpha3);
                                                }
                                                canvas3.save();
                                                canvas3.translate(f232 + AndroidUtilities.dp(f262), ((AndroidUtilities.dp(f212) - dVar22.h.getHeight()) / 2.0f) + f242);
                                                int alpha4 = dVar22.h.getPaint().getAlpha();
                                                dVar22.h.getPaint().setAlpha((int) (alpha4 * f252));
                                                dVar22.h.draw(canvas3);
                                                dVar22.h.getPaint().setAlpha(alpha4);
                                                canvas3.restore();
                                                canvas3.restore();
                                                return;
                                            default:
                                                d dVar3 = dVar2;
                                                dVar3.getClass();
                                                int i23 = i.f6812a;
                                                float dp52 = AndroidUtilities.dp(21);
                                                dVar3.a(canvas3, dp52, dp52, dp52, i212 / 255.0f);
                                                return;
                                        }
                                    }
                                });
                                dVar2.f6777f = bVar4;
                                bVar4.a((int) D, AndroidUtilities.dp(21.0f), 3.0f, AndroidUtilities.dp(4));
                            }
                        }
                        b bVar5 = dVar2.f6777f;
                        if (bVar5 != null) {
                            float f30 = dVar2.f6779i;
                            float f31 = dVar2.f6780j;
                            bVar5.setBounds((int) f30, (int) f31, (int) (f30 + D), (int) (f31 + AndroidUtilities.dp(21.0f)));
                            b bVar6 = dVar2.f6777f;
                            bVar6.f6770i = (int) (f29 * 255.0f);
                            bVar6.draw(canvas2);
                        }
                        canvas2.restore();
                    } else {
                        i13 = i12;
                    }
                }
                i22 = i13 + 1;
                jVar = this;
                i21 = i11;
                kVar2 = kVar;
                i14 = 1;
                i19 = 2;
            }
            i21++;
            jVar = this;
            i14 = 1;
            i19 = 2;
        }
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    public final int h() {
        return AndroidUtilities.dp(((i.f6812a + 11) * this.f6824w.length) + 7);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ObjectAnimator objectAnimator = this.V;
        ef.c cVar = this.f6817b;
        if (animator == objectAnimator) {
            this.f6826y.setHideSideButtonByQuickShare(false);
            this.I = true;
            invalidateSelf();
            if (this.J) {
                cVar.run();
            }
        } else if (animator == this.W) {
            this.J = true;
            invalidateSelf();
            ub ubVar = this.S;
            if (ubVar != null) {
                ubVar.f33184a.setVisibility(0);
            }
            if (this.I) {
                cVar.run();
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
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
