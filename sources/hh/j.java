package hh;

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
import cg.h0;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.qb;
public final class j extends Drawable implements Animator.AnimatorListener {
    public static final RectF Y = new RectF();
    public static final Rect Z = new Rect();
    public static final int[] f7155a0 = new int[2];
    public static final g f7156b0 = new g("openFactor", 0);
    public static final g f7157c0 = new g("openFactor", 1);
    public final MessageObject B;
    public float C;
    public Bitmap F;
    public BitmapShader G;
    public Paint I;
    public b M;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public qb T;
    public float U;
    public float V;
    public final k f7158a;
    public final gf.c f7159b;
    public final LinearGradient f7161f;
    public final d[] f7165w;
    public final Drawable f7166x;
    public final t1 f7167y;
    public final Paint f7160c = new Paint(1);
    public final Matrix d = new Matrix();
    public final Path e = new Path();
    public final RectF h = new RectF();
    public final RectF f7162n = new RectF();
    public final RectF f7163r = new RectF();
    public final RectF f7164s = new RectF();
    public final RectF v = new RectF();
    public float D = 0.0f;
    public float E = 0.0f;
    public final Matrix H = new Matrix();
    public boolean J = false;
    public boolean K = false;
    public boolean L = false;
    public boolean N = true;
    public int O = -1;
    public final ObjectAnimator W = ObjectAnimator.ofFloat(this, f7156b0, 1.0f).setDuration(560L);
    public final ObjectAnimator X = ObjectAnimator.ofFloat(this, f7157c0, 1.0f).setDuration(240L);

    public j(k kVar, t1 t1Var, ArrayList arrayList, gf.c cVar) {
        this.f7159b = cVar;
        this.f7158a = kVar;
        this.f7167y = t1Var;
        this.B = t1Var.getMessageObject();
        this.f7165w = new d[Math.min(5, arrayList.size())];
        int i10 = 0;
        while (true) {
            d[] dVarArr = this.f7165w;
            if (i10 < dVarArr.length) {
                dVarArr[i10] = new d(this, ((Long) arrayList.get(i10)).longValue());
                i10++;
            } else {
                this.f7160c.setStyle(Paint.Style.FILL);
                Drawable mutate = kVar.getContext().getDrawable(R.drawable.reactions_bubble_shadow).mutate();
                this.f7166x = mutate;
                t1Var.setHideSideButtonByQuickShare(true);
                kVar.performHapticFeedback(3, 1);
                int v02 = j6.v0(j6.G8, this.f7167y.getResourcesProvider());
                mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.Td, false), PorterDuff.Mode.MULTIPLY));
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(100.0f), new int[]{v02, 16777215 & v02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f7161f = linearGradient;
                this.f7160c.setShader(linearGradient);
                ObjectAnimator objectAnimator = this.W;
                LinearInterpolator linearInterpolator = h.f7137b;
                objectAnimator.setInterpolator(linearInterpolator);
                this.W.addListener(this);
                this.X.setInterpolator(linearInterpolator);
                this.X.addListener(this);
                AndroidUtilities.makeGlobalBlurBitmap(new h0(this, 13), 15.0f);
                return;
            }
        }
    }

    public static float b(float f10, float f11, float f12, float f13) {
        return (float) Math.toDegrees((float) Math.atan2(f13 - f11, f12 - f10));
    }

    public static PointF f(float f10, float f11, float f12, float f13, float f14, float f15, boolean z4) {
        float f16 = f13 - f10;
        float f17 = f14 - f11;
        float sqrt = (float) Math.sqrt(Math.pow(f17, 2.0d) + Math.pow(f16, 2.0d));
        if (sqrt <= f12 + f15 && sqrt >= Math.abs(f12 - f15)) {
            float f18 = f12 * f12;
            float f19 = ((sqrt * sqrt) + (f18 - (f15 * f15))) / (2.0f * sqrt);
            float sqrt2 = (float) Math.sqrt(f18 - (f19 * f19));
            float d = android.support.v4.media.a.d(f19, f16, sqrt, f10);
            float d10 = android.support.v4.media.a.d(f19, f17, sqrt, f11);
            float f20 = (f17 * sqrt2) / sqrt;
            float f21 = d + f20;
            float f22 = (sqrt2 * f16) / sqrt;
            float f23 = d10 - f22;
            float f24 = d - f20;
            float f25 = d10 + f22;
            if (f21 != f24 && f21 < f24) {
                if (z4) {
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
        return e2.c.w(f11, f10, f12, f10);
    }

    public static e i(Interpolator interpolator, int i10, int i11, int i12, boolean z4) {
        float f10 = i12;
        return new e(z4, i10 / f10, i11 / f10, interpolator);
    }

    public static float j(float f10) {
        if (f10 <= 0.0f) {
            return f10 + 180.0f;
        }
        return f10 - 180.0f;
    }

    public final void a(Path path, RectF rectF, float f10, float f11, boolean z4, boolean z10) {
        float f12 = f11 - f10;
        if (z4) {
            if (f12 > 0.0f) {
                f12 -= 360.0f;
            }
        } else if (f12 < 0.0f) {
            f12 += 360.0f;
        }
        if (Math.abs(f12) > 270.0f && z10) {
            this.N = false;
        }
        path.arcTo(rectF, f10, f12);
    }

    public final void c() {
        this.X.start();
        this.L = true;
        if (this.J && !this.Q) {
            b bVar = new b(new gg.f(this, 3));
            this.M = bVar;
            RectF rectF = this.f7163r;
            int i10 = i.f7153a;
            bVar.a((int) rectF.width(), (int) (rectF.height() + AndroidUtilities.dp(30.0f)), 4.0f, AndroidUtilities.dp(10));
        }
        invalidateSelf();
    }

    public final void d() {
        d[] dVarArr;
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        this.f7167y.setHideSideButtonByQuickShare(false);
        if (!this.Q) {
            this.Q = true;
            Bitmap bitmap4 = this.F;
            if (bitmap4 != null) {
                bitmap4.recycle();
            }
            b bVar = this.M;
            if (bVar != null && (bitmap3 = bVar.f7110c) != null) {
                bitmap3.recycle();
                bVar.f7110c = null;
            }
            for (d dVar : this.f7165w) {
                b bVar2 = dVar.f7119f;
                if (bVar2 != null && (bitmap2 = bVar2.f7110c) != null) {
                    bitmap2.recycle();
                    bVar2.f7110c = null;
                }
                b bVar3 = dVar.e;
                if (bVar3 != null && (bitmap = bVar3.f7110c) != null) {
                    bitmap.recycle();
                    bVar3.f7110c = null;
                }
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        e(canvas, false, 255);
    }

    public final void e(Canvas canvas, boolean z4, int i10) {
        float f10;
        float f11;
        int i11;
        k kVar;
        boolean z10;
        Canvas canvas2;
        int i12;
        float f12;
        int i13;
        float min;
        double d;
        j jVar = this;
        boolean z11 = jVar.P;
        k kVar2 = jVar.f7158a;
        t1 t1Var = jVar.f7167y;
        int i14 = 1;
        if (!z11) {
            int[] iArr = f7155a0;
            t1Var.getLocationInWindow(iArr);
            int i15 = iArr[0];
            int i16 = iArr[1];
            kVar2.getLocationInWindow(iArr);
            int i17 = iArr[0];
            int i18 = iArr[1];
            jVar.R = i15 - i17;
            jVar.S = i16 - i18;
            float dp = AndroidUtilities.dp(16.0f);
            float sideButtonStartX = t1Var.getSideButtonStartX() + jVar.R + dp;
            float sideButtonStartY = t1Var.getSideButtonStartY() + jVar.S + dp;
            float f13 = sideButtonStartX - dp;
            float f14 = sideButtonStartY - dp;
            float f15 = sideButtonStartX + dp;
            float f16 = sideButtonStartY + dp;
            RectF rectF = jVar.h;
            rectF.set(f13, f14, f15, f16);
            float dp2 = AndroidUtilities.dp(16.0f);
            if (rectF.right + AndroidUtilities.dp(48.0f) + dp2 > kVar2.getMeasuredWidth()) {
                jVar.C = Math.max(0.0f, (kVar2.getMeasuredWidth() - dp2) - rectF.right);
            } else if (((rectF.right + AndroidUtilities.dp(48.0f)) - jVar.h()) - dp2 < 0.0f) {
                jVar.C = Math.max(0.0f, (dp2 + jVar.h()) - rectF.right);
            } else {
                jVar.C = AndroidUtilities.dp(48.0f);
            }
            jVar.W.start();
            jVar.P = true;
        }
        b bVar = jVar.M;
        d[] dVarArr = jVar.f7165w;
        int i19 = 2;
        RectF rectF2 = jVar.f7163r;
        if (bVar != null && !z4) {
            bVar.setBounds((int) rectF2.left, (int) (rectF2.top - AndroidUtilities.dp(30.0f)), (int) rectF2.right, (int) rectF2.bottom);
            jVar.M.f7113i = (int) ((1.0f - h.f7138c.getInterpolation(jVar.E)) * 255.0f);
            jVar.M.draw(canvas);
            if (jVar.O != -1) {
                float interpolation = 1.0f - h.e.getInterpolation(jVar.E);
                float interpolation2 = h.d.getInterpolation(jVar.E);
                float centerX = rectF2.centerX();
                int i20 = i.f7153a;
                float dp3 = centerX + (AndroidUtilities.dp(i20 + 11) * (jVar.O - 2));
                float centerY = rectF2.centerY();
                float f17 = jVar.U;
                float f18 = jVar.V;
                float f19 = (dp3 + f17) / 2.0f;
                qb qbVar = jVar.T;
                if (qbVar != null && qbVar.top) {
                    min = Math.max(centerY, f18) + AndroidUtilities.dp(15);
                } else {
                    min = Math.min(centerY, f18) - AndroidUtilities.dp(15);
                }
                float g10 = g(dp3, f17, interpolation2);
                double d10 = dp3;
                double d11 = centerY;
                double d12 = f17;
                double d13 = f18;
                double d14 = f19;
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
                double g11 = g(dp3, f17, interpolation2);
                float f20 = (float) ((d18 * g11) + (d * g11 * g11) + ((d11 - (d19 * d)) - (d18 * d10)));
                float f21 = i20;
                float g12 = g((AndroidUtilities.dp(f21) / 2.0f) + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), interpolation2);
                final d dVar = dVarArr[jVar.O];
                if (dVar.e == null) {
                    b bVar2 = new b(new a() {
                        @Override
                        public final void p(Canvas canvas3, int i21) {
                            float f22;
                            float f23;
                            switch (r2) {
                                case 0:
                                    d dVar2 = dVar;
                                    dVar2.getClass();
                                    canvas3.save();
                                    canvas3.translate(-dVar2.f7121i, -dVar2.f7122j);
                                    float f24 = dVar2.f7121i;
                                    float f25 = dVar2.f7122j;
                                    float f26 = i21 / 255.0f;
                                    RectF rectF3 = AndroidUtilities.rectTmp;
                                    float dp4 = AndroidUtilities.dp(21.0f) / 2.0f;
                                    int i22 = i.f7153a;
                                    float f27 = 8;
                                    rectF3.set(f24, f25, dVar2.h.getWidth() + f24 + (AndroidUtilities.dp(f27) * 2), AndroidUtilities.dp(21.0f) + f25);
                                    t1 t1Var2 = dVar2.f7117b;
                                    boolean R2 = t1Var2.R2();
                                    Paint paint = dVar2.f7120g;
                                    if (paint != null) {
                                        int alpha = paint.getAlpha();
                                        paint.setAlpha((int) (255.0f * f26));
                                        canvas3.drawRoundRect(rectF3, dp4, dp4, paint);
                                        paint.setAlpha(alpha);
                                        f22 = 21.0f;
                                    } else {
                                        Point point = AndroidUtilities.displaySize;
                                        f22 = 21.0f;
                                        t1Var2.q0(0.0f, 0.0f, point.x, point.y);
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
                                        int alpha3 = j6.f19974h2.getAlpha();
                                        j6.f19974h2.setAlpha((int) (alpha3 * f26));
                                        canvas3.drawRoundRect(rectF3, dp4, dp4, j6.f19974h2);
                                        j6.f19974h2.setAlpha(alpha3);
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
                                    int i23 = i.f7153a;
                                    float dp5 = AndroidUtilities.dp(21);
                                    dVar3.a(canvas3, dp5, dp5, dp5, i21 / 255.0f);
                                    return;
                            }
                        }
                    });
                    dVar.e = bVar2;
                    bVar2.a(AndroidUtilities.dp(f21), AndroidUtilities.dp(f21), 4.0f, AndroidUtilities.dp(10));
                }
                canvas.save();
                canvas.translate(g10 - g12, f20 - g12);
                float f22 = 21;
                canvas.scale(g12 / AndroidUtilities.dp(f22), g12 / AndroidUtilities.dp(f22));
                b bVar3 = dVar.e;
                bVar3.f7113i = (int) (interpolation * 255.0f);
                bVar3.draw(canvas);
                canvas.restore();
                return;
            }
            return;
        }
        if (!z4) {
            f10 = 1.0f - jVar.E;
        } else {
            f10 = i10 / 255.0f;
        }
        float f23 = f10;
        float g13 = g(0.3f, 0.075f, h.f7143k.getInterpolation(jVar.D));
        Matrix matrix = jVar.d;
        matrix.reset();
        matrix.setScale(g13, g13);
        matrix.postTranslate(0.0f, rectF2.bottom);
        jVar.f7161f.setLocalMatrix(matrix);
        Paint paint = jVar.f7160c;
        paint.setAlpha((int) (h.f7142j.getInterpolation(jVar.D) * 255.0f * f23));
        RectF rectF3 = Y;
        rectF3.set(rectF2);
        rectF3.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        Rect rect = Z;
        rectF3.round(rect);
        Drawable drawable = jVar.f7166x;
        drawable.setAlpha((int) (f23 * 255.0f));
        drawable.setBounds(rect);
        drawable.draw(canvas);
        boolean z12 = jVar.J;
        RectF rectF4 = jVar.f7162n;
        if (!z12) {
            canvas.save();
            canvas.translate(rectF4.left, rectF4.top);
            canvas.rotate((h.f7139f.getInterpolation(jVar.D) - h.f7140g.getInterpolation(jVar.D)) * (-40.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            canvas.translate(-t1Var.getSideButtonStartX(), -t1Var.getSideButtonStartY());
            t1Var.k2(canvas, true);
            canvas.restore();
        }
        if (jVar.N && !jVar.J) {
            canvas.drawPath(jVar.e, paint);
        } else {
            float min2 = Math.min(rectF2.width(), rectF2.height()) / 2.0f;
            float min3 = Math.min(rectF4.width(), rectF4.height()) / 2.0f;
            canvas.drawRoundRect(rectF2, min2, min2, paint);
            if (!jVar.J) {
                canvas.drawRoundRect(rectF4, min3, min3, paint);
            }
        }
        float interpolation3 = h.f7152t.getInterpolation(jVar.D) * AndroidUtilities.dp(2.0f);
        float f24 = i.f7153a + 2;
        float interpolation4 = ((h.f7149q.getInterpolation(jVar.D) * AndroidUtilities.dp(f24)) / 2.0f) - interpolation3;
        float interpolation5 = ((h.f7150r.getInterpolation(jVar.D) * AndroidUtilities.dp(f24)) / 2.0f) - interpolation3;
        float interpolation6 = ((h.f7151s.getInterpolation(jVar.D) * AndroidUtilities.dp(f24)) / 2.0f) - interpolation3;
        int i21 = 0;
        while (i21 < i19) {
            int i22 = 0;
            while (i22 < dVarArr.length) {
                if ((i21 == 0 && i22 == jVar.O) || (i21 == i14 && i22 != jVar.O)) {
                    i11 = i21;
                    i13 = i22;
                    kVar = kVar2;
                } else {
                    float length = i22 - ((dVarArr.length / 2.0f) - 0.5f);
                    if (i22 == i19) {
                        f11 = interpolation4;
                    } else if (i22 != i14 && i22 != 3) {
                        f11 = interpolation6;
                    } else {
                        f11 = interpolation5;
                    }
                    float dp4 = (AndroidUtilities.dp(i.f7153a + 11) * length) + rectF2.centerX();
                    float centerY2 = rectF2.centerY();
                    i11 = i21;
                    final d dVar2 = dVarArr[i22];
                    float f25 = 16;
                    float dp5 = AndroidUtilities.dp(f25);
                    float measuredWidth = kVar2.getMeasuredWidth() - AndroidUtilities.dp(f25);
                    float f26 = rectF2.left;
                    kVar = kVar2;
                    float f27 = rectF2.right;
                    if (i22 == jVar.O && jVar.L) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        dVar2.getClass();
                        canvas2 = canvas;
                        i12 = i22;
                        f12 = dp4;
                        dVar2.a(canvas2, f12, centerY2, f11 + (AndroidUtilities.dp(2.0f) * dVar2.f7127o), f23);
                    } else {
                        canvas2 = canvas;
                        i12 = i22;
                        f12 = dp4;
                    }
                    float f28 = dVar2.f7127o;
                    if (f28 > 0.0f && dVar2.h != null) {
                        float f29 = (f28 * 0.15f) + 0.85f;
                        canvas2.save();
                        canvas2.scale(f29, f29, f12, centerY2);
                        float f30 = dVar2.f7127o * f23;
                        i13 = i12;
                        float D = y3.D(8, 2, dVar2.h.getWidth());
                        dVar2.f7121i = d.b(d.b(f12, D, f26, f27), D, dp5, measuredWidth) - (D / 2.0f);
                        dVar2.f7122j = centerY2 - AndroidUtilities.dp(58.0f);
                        if (dVar2.f7119f == null) {
                            j jVar2 = dVar2.f7116a;
                            if (!jVar2.Q) {
                                dVar2.f7120g = jVar2.I;
                                b bVar4 = new b(new a() {
                                    @Override
                                    public final void p(Canvas canvas3, int i212) {
                                        float f222;
                                        float f232;
                                        switch (r2) {
                                            case 0:
                                                d dVar22 = dVar2;
                                                dVar22.getClass();
                                                canvas3.save();
                                                canvas3.translate(-dVar22.f7121i, -dVar22.f7122j);
                                                float f242 = dVar22.f7121i;
                                                float f252 = dVar22.f7122j;
                                                float f262 = i212 / 255.0f;
                                                RectF rectF32 = AndroidUtilities.rectTmp;
                                                float dp42 = AndroidUtilities.dp(21.0f) / 2.0f;
                                                int i222 = i.f7153a;
                                                float f272 = 8;
                                                rectF32.set(f242, f252, dVar22.h.getWidth() + f242 + (AndroidUtilities.dp(f272) * 2), AndroidUtilities.dp(21.0f) + f252);
                                                t1 t1Var2 = dVar22.f7117b;
                                                boolean R2 = t1Var2.R2();
                                                Paint paint2 = dVar22.f7120g;
                                                if (paint2 != null) {
                                                    int alpha = paint2.getAlpha();
                                                    paint2.setAlpha((int) (255.0f * f262));
                                                    canvas3.drawRoundRect(rectF32, dp42, dp42, paint2);
                                                    paint2.setAlpha(alpha);
                                                    f222 = 21.0f;
                                                } else {
                                                    Point point = AndroidUtilities.displaySize;
                                                    f222 = 21.0f;
                                                    t1Var2.q0(0.0f, 0.0f, point.x, point.y);
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
                                                    int alpha3 = j6.f19974h2.getAlpha();
                                                    j6.f19974h2.setAlpha((int) (alpha3 * f262));
                                                    canvas3.drawRoundRect(rectF32, dp42, dp42, j6.f19974h2);
                                                    j6.f19974h2.setAlpha(alpha3);
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
                                                int i23 = i.f7153a;
                                                float dp52 = AndroidUtilities.dp(21);
                                                dVar3.a(canvas3, dp52, dp52, dp52, i212 / 255.0f);
                                                return;
                                        }
                                    }
                                });
                                dVar2.f7119f = bVar4;
                                bVar4.a((int) D, AndroidUtilities.dp(21.0f), 3.0f, AndroidUtilities.dp(4));
                            }
                        }
                        b bVar5 = dVar2.f7119f;
                        if (bVar5 != null) {
                            float f31 = dVar2.f7121i;
                            float f32 = dVar2.f7122j;
                            bVar5.setBounds((int) f31, (int) f32, (int) (f31 + D), (int) (f32 + AndroidUtilities.dp(21.0f)));
                            b bVar6 = dVar2.f7119f;
                            bVar6.f7113i = (int) (f30 * 255.0f);
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
        return AndroidUtilities.dp(((i.f7153a + 11) * this.f7165w.length) + 7);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ObjectAnimator objectAnimator = this.W;
        gf.c cVar = this.f7159b;
        if (animator == objectAnimator) {
            this.f7167y.setHideSideButtonByQuickShare(false);
            this.J = true;
            invalidateSelf();
            if (this.K) {
                cVar.run();
            }
        } else if (animator == this.X) {
            this.K = true;
            invalidateSelf();
            qb qbVar = this.T;
            if (qbVar != null) {
                qbVar.f28099a.setVisibility(0);
            }
            if (this.J) {
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
