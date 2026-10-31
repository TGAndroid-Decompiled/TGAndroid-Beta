package mh;

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
import org.telegram.messenger.i0;
import org.telegram.messenger.jj;
import org.telegram.messenger.m5;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.eb;
public final class j extends Drawable implements Animator.AnimatorListener {
    public static final RectF f13353b0 = new RectF();
    public static final Rect f13354c0 = new Rect();
    public static final int[] f13355d0 = new int[2];
    public static final g f13356e0 = new g("openFactor", 0);
    public static final g f13357f0 = new g("openFactor", 1);
    public final q1 D;
    public final jj E;
    public float F;
    public Bitmap I;
    public BitmapShader J;
    public Paint L;
    public b P;
    public boolean S;
    public boolean T;
    public int U;
    public int V;
    public eb W;
    public float X;
    public float Y;
    public final l f13358a;
    public final k f13360b;
    public final LinearGradient f13362f;
    public final d[] f13367x;
    public final Drawable f13368y;
    public final Paint f13361c = new Paint(1);
    public final Matrix d = new Matrix();
    public final Path e = new Path();
    public final RectF h = new RectF();
    public final RectF f13363n = new RectF();
    public final RectF f13364r = new RectF();
    public final RectF f13365s = new RectF();
    public final RectF f13366w = new RectF();
    public float G = 0.0f;
    public float H = 0.0f;
    public final Matrix K = new Matrix();
    public boolean M = false;
    public boolean N = false;
    public boolean O = false;
    public boolean Q = true;
    public int R = -1;
    public final ObjectAnimator Z = ObjectAnimator.ofFloat(this, f13356e0, 1.0f).setDuration(560L);
    public final ObjectAnimator f13359a0 = ObjectAnimator.ofFloat(this, f13357f0, 1.0f).setDuration(240L);

    public j(l lVar, q1 q1Var, ArrayList arrayList, k kVar) {
        this.f13360b = kVar;
        this.f13358a = lVar;
        this.D = q1Var;
        this.E = q1Var.getMessageObject();
        this.f13367x = new d[Math.min(5, arrayList.size())];
        int i10 = 0;
        while (true) {
            d[] dVarArr = this.f13367x;
            if (i10 < dVarArr.length) {
                dVarArr[i10] = new d(this, ((Long) arrayList.get(i10)).longValue());
                i10++;
            } else {
                this.f13361c.setStyle(Paint.Style.FILL);
                Drawable mutate = lVar.getContext().getDrawable(2131232670).mutate();
                this.f13368y = mutate;
                q1Var.setHideSideButtonByQuickShare(true);
                lVar.performHapticFeedback(3, 1);
                int w02 = t6.w0(t6.G8, this.D.getResourcesProvider());
                mutate.setColorFilter(new PorterDuffColorFilter(t6.x0(null, t6.He, false), PorterDuff.Mode.MULTIPLY));
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, i0.L(100.0f), new int[]{w02, 16777215 & w02}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f13362f = linearGradient;
                this.f13361c.setShader(linearGradient);
                ObjectAnimator objectAnimator = this.Z;
                LinearInterpolator linearInterpolator = h.f13335b;
                objectAnimator.setInterpolator(linearInterpolator);
                this.Z.addListener(this);
                this.f13359a0.setInterpolator(linearInterpolator);
                this.f13359a0.addListener(this);
                i0.l2(new ag.l(this, 20), 15.0f);
                return;
            }
        }
    }

    public static float b(float f7, float f10, float f11, float f12) {
        return (float) Math.toDegrees((float) Math.atan2(f12 - f10, f11 - f7));
    }

    public static PointF f(float f7, float f10, float f11, float f12, float f13, float f14, boolean z10) {
        float f15 = f12 - f7;
        float f16 = f13 - f10;
        float sqrt = (float) Math.sqrt(Math.pow(f16, 2.0d) + Math.pow(f15, 2.0d));
        if (sqrt <= f11 + f14 && sqrt >= Math.abs(f11 - f14)) {
            float f17 = f11 * f11;
            float f18 = ((sqrt * sqrt) + (f17 - (f14 * f14))) / (2.0f * sqrt);
            float sqrt2 = (float) Math.sqrt(f17 - (f18 * f18));
            float A = a1.g.A(f18, f15, sqrt, f7);
            float A2 = a1.g.A(f18, f16, sqrt, f10);
            float f19 = (f16 * sqrt2) / sqrt;
            float f20 = A + f19;
            float f21 = (sqrt2 * f15) / sqrt;
            float f22 = A2 - f21;
            float f23 = A - f19;
            float f24 = A2 + f21;
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

    public static float g(float f7, float f10, float f11) {
        return c3.i0.z(f10, f7, f11, f7);
    }

    public static e i(Interpolator interpolator, int i10, int i11, int i12, boolean z10) {
        float f7 = i12;
        return new e(z10, i10 / f7, i11 / f7, interpolator);
    }

    public static float j(float f7) {
        if (f7 <= 0.0f) {
            return f7 + 180.0f;
        }
        return f7 - 180.0f;
    }

    public final void a(Path path, RectF rectF, float f7, float f10, boolean z10, boolean z11) {
        float f11 = f10 - f7;
        if (z10) {
            if (f11 > 0.0f) {
                f11 -= 360.0f;
            }
        } else if (f11 < 0.0f) {
            f11 += 360.0f;
        }
        if (Math.abs(f11) > 270.0f && z11) {
            this.Q = false;
        }
        path.arcTo(rectF, f7, f11);
    }

    public final void c() {
        this.f13359a0.start();
        this.O = true;
        if (this.M && !this.T) {
            b bVar = new b(new mg.l(this, 2));
            this.P = bVar;
            RectF rectF = this.f13364r;
            int i10 = i.f13351a;
            bVar.a((int) rectF.width(), (int) (rectF.height() + i0.L(30.0f)), 4.0f, i0.L(10));
        }
        invalidateSelf();
    }

    public final void d() {
        d[] dVarArr;
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        this.D.setHideSideButtonByQuickShare(false);
        if (!this.T) {
            this.T = true;
            Bitmap bitmap4 = this.I;
            if (bitmap4 != null) {
                bitmap4.recycle();
            }
            b bVar = this.P;
            if (bVar != null && (bitmap3 = bVar.f13308c) != null) {
                bitmap3.recycle();
                bVar.f13308c = null;
            }
            for (d dVar : this.f13367x) {
                b bVar2 = dVar.f13317f;
                if (bVar2 != null && (bitmap2 = bVar2.f13308c) != null) {
                    bitmap2.recycle();
                    bVar2.f13308c = null;
                }
                b bVar3 = dVar.e;
                if (bVar3 != null && (bitmap = bVar3.f13308c) != null) {
                    bitmap.recycle();
                    bVar3.f13308c = null;
                }
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        e(canvas, false, 255);
    }

    public final void e(Canvas canvas, boolean z10, int i10) {
        float f7;
        float f10;
        float f11;
        int i11;
        l lVar;
        boolean z11;
        Canvas canvas2;
        int i12;
        float f12;
        int i13;
        int i14;
        float min;
        double d;
        j jVar = this;
        boolean z12 = jVar.S;
        l lVar2 = jVar.f13358a;
        float f13 = 0.0f;
        int i15 = 0;
        q1 q1Var = jVar.D;
        int i16 = 1;
        if (!z12) {
            int[] iArr = f13355d0;
            q1Var.getLocationInWindow(iArr);
            int i17 = iArr[0];
            int i18 = iArr[1];
            lVar2.getLocationInWindow(iArr);
            int i19 = iArr[0];
            int i20 = iArr[1];
            jVar.U = i17 - i19;
            jVar.V = i18 - i20;
            float L = i0.L(16.0f);
            float sideButtonStartX = q1Var.getSideButtonStartX() + jVar.U + L;
            float sideButtonStartY = q1Var.getSideButtonStartY() + jVar.V + L;
            float f14 = sideButtonStartX - L;
            float f15 = sideButtonStartY - L;
            float f16 = sideButtonStartX + L;
            float f17 = sideButtonStartY + L;
            RectF rectF = jVar.h;
            rectF.set(f14, f15, f16, f17);
            float L2 = i0.L(16.0f);
            if (rectF.right + i0.L(48.0f) + L2 > lVar2.getMeasuredWidth()) {
                jVar.F = Math.max(0.0f, (lVar2.getMeasuredWidth() - L2) - rectF.right);
            } else if (((rectF.right + i0.L(48.0f)) - jVar.h()) - L2 < 0.0f) {
                jVar.F = Math.max(0.0f, (L2 + jVar.h()) - rectF.right);
            } else {
                jVar.F = i0.L(48.0f);
            }
            jVar.Z.start();
            jVar.S = true;
        }
        b bVar = jVar.P;
        d[] dVarArr = jVar.f13367x;
        int i21 = 2;
        RectF rectF2 = jVar.f13364r;
        if (bVar != null && !z10) {
            bVar.setBounds((int) rectF2.left, (int) (rectF2.top - i0.L(30.0f)), (int) rectF2.right, (int) rectF2.bottom);
            jVar.P.f13311i = (int) ((1.0f - h.f13336c.getInterpolation(jVar.H)) * 255.0f);
            jVar.P.draw(canvas);
            if (jVar.R != -1) {
                float interpolation = 1.0f - h.e.getInterpolation(jVar.H);
                float interpolation2 = h.d.getInterpolation(jVar.H);
                float centerX = rectF2.centerX();
                int i22 = i.f13351a;
                float L3 = centerX + (i0.L(i22 + 11) * (jVar.R - 2));
                float centerY = rectF2.centerY();
                float f18 = jVar.X;
                float f19 = jVar.Y;
                float f20 = (L3 + f18) / 2.0f;
                eb ebVar = jVar.W;
                if (ebVar != null && ebVar.top) {
                    min = Math.max(centerY, f19) + i0.L(15);
                } else {
                    min = Math.min(centerY, f19) - i0.L(15);
                }
                float g10 = g(L3, f18, interpolation2);
                double d10 = L3;
                double d11 = centerY;
                double d12 = f18;
                double d13 = f19;
                double d14 = f20;
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
                double g11 = g(L3, f18, interpolation2);
                float f21 = (float) ((d18 * g11) + (d * g11 * g11) + ((d11 - (d19 * d)) - (d18 * d10)));
                float f22 = i22;
                float g12 = g((i0.L(f22) / 2.0f) + i0.L(2.0f), i0.L(12.0f), interpolation2);
                final d dVar = dVarArr[jVar.R];
                if (dVar.e == null) {
                    b bVar2 = new b(new a() {
                        @Override
                        public final void s(Canvas canvas3, int i23) {
                            float f23;
                            float f24;
                            switch (r2) {
                                case 0:
                                    d dVar2 = dVar;
                                    dVar2.getClass();
                                    canvas3.save();
                                    canvas3.translate(-dVar2.f13319i, -dVar2.f13320j);
                                    float f25 = dVar2.f13319i;
                                    float f26 = dVar2.f13320j;
                                    float f27 = i23 / 255.0f;
                                    RectF rectF3 = i0.P;
                                    float L4 = i0.L(21.0f) / 2.0f;
                                    int i24 = i.f13351a;
                                    float f28 = 8;
                                    rectF3.set(f25, f26, dVar2.h.getWidth() + f25 + (i0.L(f28) * 2), i0.L(21.0f) + f26);
                                    q1 q1Var2 = dVar2.f13315b;
                                    boolean e22 = q1Var2.e2();
                                    Paint paint = dVar2.f13318g;
                                    if (paint != null) {
                                        int alpha = paint.getAlpha();
                                        paint.setAlpha((int) (255.0f * f27));
                                        canvas3.drawRoundRect(rectF3, L4, L4, paint);
                                        paint.setAlpha(alpha);
                                        f23 = 21.0f;
                                    } else {
                                        Point point = i0.f16026q;
                                        f23 = 21.0f;
                                        q1Var2.A(0.0f, 0.0f, point.x, point.y);
                                        Paint X1 = q1Var2.X1("paintChatActionBackground");
                                        int alpha2 = X1.getAlpha();
                                        if (e22) {
                                            f24 = alpha2;
                                        } else {
                                            f24 = 229.5f;
                                        }
                                        X1.setAlpha((int) (f24 * f27));
                                        canvas3.drawRoundRect(rectF3, L4, L4, X1);
                                        X1.setAlpha(alpha2);
                                    }
                                    if (e22 || paint != null) {
                                        int alpha3 = t6.f20998h2.getAlpha();
                                        t6.f20998h2.setAlpha((int) (alpha3 * f27));
                                        canvas3.drawRoundRect(rectF3, L4, L4, t6.f20998h2);
                                        t6.f20998h2.setAlpha(alpha3);
                                    }
                                    canvas3.save();
                                    canvas3.translate(f25 + i0.L(f28), ((i0.L(f23) - dVar2.h.getHeight()) / 2.0f) + f26);
                                    int alpha4 = dVar2.h.getPaint().getAlpha();
                                    dVar2.h.getPaint().setAlpha((int) (alpha4 * f27));
                                    dVar2.h.draw(canvas3);
                                    dVar2.h.getPaint().setAlpha(alpha4);
                                    canvas3.restore();
                                    canvas3.restore();
                                    return;
                                default:
                                    d dVar3 = dVar;
                                    dVar3.getClass();
                                    int i25 = i.f13351a;
                                    float L5 = i0.L(21);
                                    dVar3.a(canvas3, L5, L5, L5, i23 / 255.0f);
                                    return;
                            }
                        }
                    });
                    dVar.e = bVar2;
                    bVar2.a(i0.L(f22), i0.L(f22), 4.0f, i0.L(10));
                }
                canvas.save();
                canvas.translate(g10 - g12, f21 - g12);
                float f23 = 21;
                canvas.scale(g12 / i0.L(f23), g12 / i0.L(f23));
                b bVar3 = dVar.e;
                bVar3.f13311i = (int) (interpolation * 255.0f);
                bVar3.draw(canvas);
                canvas.restore();
                return;
            }
            return;
        }
        if (!z10) {
            f7 = 1.0f - jVar.H;
        } else {
            f7 = i10 / 255.0f;
        }
        float f24 = f7;
        float g13 = g(0.3f, 0.075f, h.f13341k.getInterpolation(jVar.G));
        Matrix matrix = jVar.d;
        matrix.reset();
        matrix.setScale(g13, g13);
        matrix.postTranslate(0.0f, rectF2.bottom);
        jVar.f13362f.setLocalMatrix(matrix);
        Paint paint = jVar.f13361c;
        paint.setAlpha((int) (h.f13340j.getInterpolation(jVar.G) * 255.0f * f24));
        RectF rectF3 = f13353b0;
        rectF3.set(rectF2);
        rectF3.inset(-i0.L(8.0f), -i0.L(8.0f));
        Rect rect = f13354c0;
        rectF3.round(rect);
        Drawable drawable = jVar.f13368y;
        drawable.setAlpha((int) (f24 * 255.0f));
        drawable.setBounds(rect);
        drawable.draw(canvas);
        boolean z13 = jVar.M;
        RectF rectF4 = jVar.f13363n;
        if (!z13) {
            canvas.save();
            canvas.translate(rectF4.left, rectF4.top);
            canvas.rotate((h.f13337f.getInterpolation(jVar.G) - h.f13338g.getInterpolation(jVar.G)) * (-40.0f), i0.L(16.0f), i0.L(16.0f));
            canvas.translate(-q1Var.getSideButtonStartX(), -q1Var.getSideButtonStartY());
            q1Var.t1(canvas, true);
            canvas.restore();
        }
        if (jVar.Q && !jVar.M) {
            canvas.drawPath(jVar.e, paint);
        } else {
            float min2 = Math.min(rectF2.width(), rectF2.height()) / 2.0f;
            float min3 = Math.min(rectF4.width(), rectF4.height()) / 2.0f;
            canvas.drawRoundRect(rectF2, min2, min2, paint);
            if (!jVar.M) {
                canvas.drawRoundRect(rectF4, min3, min3, paint);
            }
        }
        float interpolation3 = h.f13350t.getInterpolation(jVar.G) * i0.L(2.0f);
        float f25 = i.f13351a + 2;
        float interpolation4 = ((h.f13347q.getInterpolation(jVar.G) * i0.L(f25)) / 2.0f) - interpolation3;
        float interpolation5 = ((h.f13348r.getInterpolation(jVar.G) * i0.L(f25)) / 2.0f) - interpolation3;
        float interpolation6 = ((h.f13349s.getInterpolation(jVar.G) * i0.L(f25)) / 2.0f) - interpolation3;
        int i23 = 0;
        while (i23 < i21) {
            int i24 = i15;
            while (i24 < dVarArr.length) {
                if ((i23 == 0 && i24 == jVar.R) || (i23 == i16 && i24 != jVar.R)) {
                    i11 = i23;
                    i13 = i24;
                    lVar = lVar2;
                    f11 = f13;
                    i14 = i21;
                } else {
                    float length = i24 - ((dVarArr.length / 2.0f) - 0.5f);
                    if (i24 == i21) {
                        f10 = interpolation4;
                    } else if (i24 != i16 && i24 != 3) {
                        f10 = interpolation6;
                    } else {
                        f10 = interpolation5;
                    }
                    f11 = f13;
                    float L4 = (i0.L(i.f13351a + 11) * length) + rectF2.centerX();
                    float centerY2 = rectF2.centerY();
                    i11 = i23;
                    final d dVar2 = dVarArr[i24];
                    float f26 = 16;
                    float L5 = i0.L(f26);
                    float measuredWidth = lVar2.getMeasuredWidth() - i0.L(f26);
                    float f27 = rectF2.left;
                    lVar = lVar2;
                    float f28 = rectF2.right;
                    if (i24 == jVar.R && jVar.O) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        dVar2.getClass();
                        canvas2 = canvas;
                        i12 = i24;
                        f12 = L4;
                        dVar2.a(canvas2, f12, centerY2, f10 + (i0.L(2.0f) * dVar2.f13325o), f24);
                    } else {
                        canvas2 = canvas;
                        i12 = i24;
                        f12 = L4;
                    }
                    float f29 = dVar2.f13325o;
                    if (f29 > f11 && dVar2.h != null) {
                        float f30 = (f29 * 0.15f) + 0.85f;
                        canvas2.save();
                        canvas2.scale(f30, f30, f12, centerY2);
                        float f31 = dVar2.f13325o * f24;
                        i13 = i12;
                        i14 = 2;
                        float D = m5.D(8, 2, dVar2.h.getWidth());
                        dVar2.f13319i = d.b(d.b(f12, D, f27, f28), D, L5, measuredWidth) - (D / 2.0f);
                        dVar2.f13320j = centerY2 - i0.L(58.0f);
                        if (dVar2.f13317f == null) {
                            j jVar2 = dVar2.f13314a;
                            if (!jVar2.T) {
                                dVar2.f13318g = jVar2.L;
                                b bVar4 = new b(new a() {
                                    @Override
                                    public final void s(Canvas canvas3, int i232) {
                                        float f232;
                                        float f242;
                                        switch (r2) {
                                            case 0:
                                                d dVar22 = dVar2;
                                                dVar22.getClass();
                                                canvas3.save();
                                                canvas3.translate(-dVar22.f13319i, -dVar22.f13320j);
                                                float f252 = dVar22.f13319i;
                                                float f262 = dVar22.f13320j;
                                                float f272 = i232 / 255.0f;
                                                RectF rectF32 = i0.P;
                                                float L42 = i0.L(21.0f) / 2.0f;
                                                int i242 = i.f13351a;
                                                float f282 = 8;
                                                rectF32.set(f252, f262, dVar22.h.getWidth() + f252 + (i0.L(f282) * 2), i0.L(21.0f) + f262);
                                                q1 q1Var2 = dVar22.f13315b;
                                                boolean e22 = q1Var2.e2();
                                                Paint paint2 = dVar22.f13318g;
                                                if (paint2 != null) {
                                                    int alpha = paint2.getAlpha();
                                                    paint2.setAlpha((int) (255.0f * f272));
                                                    canvas3.drawRoundRect(rectF32, L42, L42, paint2);
                                                    paint2.setAlpha(alpha);
                                                    f232 = 21.0f;
                                                } else {
                                                    Point point = i0.f16026q;
                                                    f232 = 21.0f;
                                                    q1Var2.A(0.0f, 0.0f, point.x, point.y);
                                                    Paint X1 = q1Var2.X1("paintChatActionBackground");
                                                    int alpha2 = X1.getAlpha();
                                                    if (e22) {
                                                        f242 = alpha2;
                                                    } else {
                                                        f242 = 229.5f;
                                                    }
                                                    X1.setAlpha((int) (f242 * f272));
                                                    canvas3.drawRoundRect(rectF32, L42, L42, X1);
                                                    X1.setAlpha(alpha2);
                                                }
                                                if (e22 || paint2 != null) {
                                                    int alpha3 = t6.f20998h2.getAlpha();
                                                    t6.f20998h2.setAlpha((int) (alpha3 * f272));
                                                    canvas3.drawRoundRect(rectF32, L42, L42, t6.f20998h2);
                                                    t6.f20998h2.setAlpha(alpha3);
                                                }
                                                canvas3.save();
                                                canvas3.translate(f252 + i0.L(f282), ((i0.L(f232) - dVar22.h.getHeight()) / 2.0f) + f262);
                                                int alpha4 = dVar22.h.getPaint().getAlpha();
                                                dVar22.h.getPaint().setAlpha((int) (alpha4 * f272));
                                                dVar22.h.draw(canvas3);
                                                dVar22.h.getPaint().setAlpha(alpha4);
                                                canvas3.restore();
                                                canvas3.restore();
                                                return;
                                            default:
                                                d dVar3 = dVar2;
                                                dVar3.getClass();
                                                int i25 = i.f13351a;
                                                float L52 = i0.L(21);
                                                dVar3.a(canvas3, L52, L52, L52, i232 / 255.0f);
                                                return;
                                        }
                                    }
                                });
                                dVar2.f13317f = bVar4;
                                bVar4.a((int) D, i0.L(21.0f), 3.0f, i0.L(4));
                            }
                        }
                        b bVar5 = dVar2.f13317f;
                        if (bVar5 != null) {
                            float f32 = dVar2.f13319i;
                            float f33 = dVar2.f13320j;
                            bVar5.setBounds((int) f32, (int) f33, (int) (f32 + D), (int) (f33 + i0.L(21.0f)));
                            b bVar6 = dVar2.f13317f;
                            bVar6.f13311i = (int) (f31 * 255.0f);
                            bVar6.draw(canvas2);
                        }
                        canvas2.restore();
                    } else {
                        i13 = i12;
                        i14 = 2;
                    }
                }
                i24 = i13 + 1;
                jVar = this;
                i21 = i14;
                i23 = i11;
                f13 = f11;
                lVar2 = lVar;
                i16 = 1;
            }
            i23++;
            jVar = this;
            i15 = 0;
            i16 = 1;
        }
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    public final int h() {
        return i0.L(((i.f13351a + 11) * this.f13367x.length) + 7);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ObjectAnimator objectAnimator = this.Z;
        k kVar = this.f13360b;
        if (animator == objectAnimator) {
            this.D.setHideSideButtonByQuickShare(false);
            this.M = true;
            invalidateSelf();
            if (this.N) {
                kVar.run();
            }
        } else if (animator == this.f13359a0) {
            this.N = true;
            invalidateSelf();
            eb ebVar = this.W;
            if (ebVar != null) {
                ebVar.f25744a.setVisibility(0);
            }
            if (this.M) {
                kVar.run();
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
