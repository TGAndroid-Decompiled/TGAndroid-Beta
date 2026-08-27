package dh;

import a9.p;
import ag.n0;
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
import d5.u;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.y1;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.mb;

public final class j extends Drawable implements Animator.AnimatorListener {
    public static final RectF X = new RectF();
    public static final Rect Y = new Rect();
    public static final int[] Z = new int[2];

    public static final g f5019a0 = new g("openFactor", 0);

    public static final g f5020b0 = new g("openFactor", 1);
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
    public mb S;
    public float T;
    public float U;

    public final k f5021a;

    public final u f5022b;

    public final LinearGradient f5025f;

    public final d[] f5029w;

    public final Drawable f5030x;

    public final s1 f5031y;

    public final Paint f5023c = new Paint(1);
    public final Matrix d = new Matrix();

    public final Path f5024e = new Path();
    public final RectF h = new RectF();

    public final RectF f5026n = new RectF();

    public final RectF f5027r = new RectF();

    public final RectF f5028s = new RectF();
    public final RectF v = new RectF();
    public float C = 0.0f;
    public float D = 0.0f;
    public final Matrix G = new Matrix();
    public boolean I = false;
    public boolean J = false;
    public boolean K = false;
    public boolean M = true;
    public int N = -1;
    public final ObjectAnimator V = ObjectAnimator.ofFloat(this, f5019a0, 1.0f).setDuration(560L);
    public final ObjectAnimator W = ObjectAnimator.ofFloat(this, f5020b0, 1.0f).setDuration(240L);

    public j(k kVar, s1 s1Var, ArrayList arrayList, u uVar) {
        this.f5022b = uVar;
        this.f5021a = kVar;
        this.f5031y = s1Var;
        this.A = s1Var.getMessageObject();
        this.f5029w = new d[Math.min(5, arrayList.size())];
        int i10 = 0;
        while (true) {
            d[] dVarArr = this.f5029w;
            if (i10 >= dVarArr.length) {
                this.f5023c.setStyle(Paint.Style.FILL);
                Drawable drawableMutate = kVar.getContext().getDrawable(R.drawable.reactions_bubble_shadow).mutate();
                this.f5030x = drawableMutate;
                s1Var.setHideSideButtonByQuickShare(true);
                kVar.performHapticFeedback(3, 1);
                int iV0 = g6.v0(g6.G8, this.f5031y.getResourcesProvider());
                drawableMutate.setColorFilter(new PorterDuffColorFilter(g6.w0(null, g6.Td, false), PorterDuff.Mode.MULTIPLY));
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(100.0f), new int[]{iV0, 16777215 & iV0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.f5025f = linearGradient;
                this.f5023c.setShader(linearGradient);
                ObjectAnimator objectAnimator = this.V;
                LinearInterpolator linearInterpolator = h.f5000b;
                objectAnimator.setInterpolator(linearInterpolator);
                this.V.addListener(this);
                this.W.setInterpolator(linearInterpolator);
                this.W.addListener(this);
                AndroidUtilities.makeGlobalBlurBitmap(new n0(this, 8), 15.0f);
                return;
            }
            dVarArr[i10] = new d(this, ((Long) arrayList.get(i10)).longValue());
            i10++;
        }
    }

    public static float b(float f10, float f11, float f12, float f13) {
        return (float) Math.toDegrees((float) Math.atan2(f13 - f11, f12 - f10));
    }

    public static PointF f(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10) {
        float f16 = f13 - f10;
        float f17 = f14 - f11;
        float fSqrt = (float) Math.sqrt(Math.pow(f17, 2.0d) + Math.pow(f16, 2.0d));
        if (fSqrt > f12 + f15 || fSqrt < Math.abs(f12 - f15)) {
            return null;
        }
        float f18 = f12 * f12;
        float f19 = ((fSqrt * fSqrt) + (f18 - (f15 * f15))) / (2.0f * fSqrt);
        float fSqrt2 = (float) Math.sqrt(f18 - (f19 * f19));
        float fD = p.d(f19, f16, fSqrt, f10);
        float fD2 = p.d(f19, f17, fSqrt, f11);
        float f20 = (f17 * fSqrt2) / fSqrt;
        float f21 = fD + f20;
        float f22 = (fSqrt2 * f16) / fSqrt;
        float f23 = fD2 - f22;
        float f24 = fD - f20;
        float f25 = fD2 + f22;
        if (f21 == f24 || f21 >= f24) {
            return f23 > f25 ? new PointF(f21, f23) : new PointF(f24, f25);
        }
        return z10 ? new PointF(f21, f23) : new PointF(f24, f25);
    }

    public static float g(float f10, float f11, float f12) {
        return com.google.android.recaptcha.internal.a.z(f11, f10, f12, f10);
    }

    public static e i(Interpolator interpolator, int i10, int i11, int i12, boolean z10) {
        float f10 = i12;
        return new e(z10, i10 / f10, i11 / f10, interpolator);
    }

    public static float j(float f10) {
        return f10 <= 0.0f ? f10 + 180.0f : f10 - 180.0f;
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
            b bVar = new b(new a1.c(this, 19));
            this.L = bVar;
            RectF rectF = this.f5027r;
            int iWidth = (int) rectF.width();
            int iHeight = (int) (rectF.height() + AndroidUtilities.dp(30.0f));
            int i10 = i.f5017a;
            bVar.a(iWidth, iHeight, 4.0f, AndroidUtilities.dp(10));
        }
        invalidateSelf();
    }

    public final void d() {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        this.f5031y.setHideSideButtonByQuickShare(false);
        if (this.P) {
            return;
        }
        this.P = true;
        Bitmap bitmap4 = this.E;
        if (bitmap4 != null) {
            bitmap4.recycle();
        }
        b bVar = this.L;
        if (bVar != null && (bitmap3 = bVar.f4971c) != null) {
            bitmap3.recycle();
            bVar.f4971c = null;
        }
        for (d dVar : this.f5029w) {
            b bVar2 = dVar.f4982f;
            if (bVar2 != null && (bitmap2 = bVar2.f4971c) != null) {
                bitmap2.recycle();
                bVar2.f4971c = null;
            }
            b bVar3 = dVar.f4981e;
            if (bVar3 != null && (bitmap = bVar3.f4971c) != null) {
                bitmap.recycle();
                bVar3.f4971c = null;
            }
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        e(canvas, false, 255);
    }

    public final void e(Canvas canvas, boolean z10, int i10) {
        float f10;
        int i11;
        k kVar;
        Canvas canvas2;
        float f11;
        j jVar = this;
        boolean z11 = jVar.O;
        k kVar2 = jVar.f5021a;
        s1 s1Var = jVar.f5031y;
        int i12 = 1;
        if (!z11) {
            int[] iArr = Z;
            s1Var.getLocationInWindow(iArr);
            int i13 = iArr[0];
            int i14 = iArr[1];
            kVar2.getLocationInWindow(iArr);
            int i15 = iArr[0];
            int i16 = iArr[1];
            jVar.Q = i13 - i15;
            jVar.R = i14 - i16;
            float fDp = AndroidUtilities.dp(16.0f);
            float sideButtonStartX = s1Var.getSideButtonStartX() + jVar.Q + fDp;
            float sideButtonStartY = s1Var.getSideButtonStartY() + jVar.R + fDp;
            float f12 = sideButtonStartX - fDp;
            float f13 = sideButtonStartY - fDp;
            float f14 = sideButtonStartX + fDp;
            float f15 = sideButtonStartY + fDp;
            RectF rectF = jVar.h;
            rectF.set(f12, f13, f14, f15);
            float fDp2 = AndroidUtilities.dp(16.0f);
            if (rectF.right + AndroidUtilities.dp(48.0f) + fDp2 > kVar2.getMeasuredWidth()) {
                jVar.B = Math.max(0.0f, (kVar2.getMeasuredWidth() - fDp2) - rectF.right);
            } else if (((rectF.right + AndroidUtilities.dp(48.0f)) - jVar.h()) - fDp2 < 0.0f) {
                jVar.B = Math.max(0.0f, (fDp2 + jVar.h()) - rectF.right);
            } else {
                jVar.B = AndroidUtilities.dp(48.0f);
            }
            jVar.V.start();
            jVar.O = true;
        }
        b bVar = jVar.L;
        d[] dVarArr = jVar.f5029w;
        int i17 = 2;
        RectF rectF2 = jVar.f5027r;
        if (bVar != null && !z10) {
            bVar.setBounds((int) rectF2.left, (int) (rectF2.top - AndroidUtilities.dp(30.0f)), (int) rectF2.right, (int) rectF2.bottom);
            jVar.L.f4975i = (int) ((1.0f - h.f5001c.getInterpolation(jVar.D)) * 255.0f);
            jVar.L.draw(canvas);
            if (jVar.N != -1) {
                float interpolation = 1.0f - h.f5002e.getInterpolation(jVar.D);
                float interpolation2 = h.d.getInterpolation(jVar.D);
                int i18 = jVar.N - 2;
                float fCenterX = rectF2.centerX();
                int i19 = i.f5017a;
                float fDp3 = fCenterX + (AndroidUtilities.dp(i19 + 11) * i18);
                float fCenterY = rectF2.centerY();
                float f16 = jVar.T;
                float f17 = jVar.U;
                float f18 = (fDp3 + f16) / 2.0f;
                mb mbVar = jVar.S;
                float fMin = (mbVar == null || !mbVar.top) ? Math.min(fCenterY, f17) - AndroidUtilities.dp(15) : Math.max(fCenterY, f17) + AndroidUtilities.dp(15);
                float fG = g(fDp3, f16, interpolation2);
                double d = fDp3;
                double d10 = fCenterY;
                double d11 = f16;
                double d12 = f17;
                double d13 = f18;
                double d14 = d11 - d;
                double d15 = ((d11 * d) + ((d13 * d13) - (d11 * d13))) - (d13 * d);
                double d16 = d15 == 0.0d ? 0.0d : ((((double) fMin) - (((d12 - d10) * (d13 - d)) / d14)) - d10) / d15;
                double d17 = d * d;
                double d18 = d14 != 0.0d ? ((d12 - (((d11 * d11) - d17) * d16)) - d10) / d14 : 0.0d;
                double dG = g(fDp3, f16, interpolation2);
                float f19 = (float) ((d18 * dG) + (d16 * dG * dG) + ((d10 - (d17 * d16)) - (d18 * d)));
                float f20 = i19;
                float fG2 = g((AndroidUtilities.dp(f20) / 2.0f) + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), interpolation2);
                final d dVar = dVarArr[jVar.N];
                if (dVar.f4981e == null) {
                    final int i20 = 1;
                    b bVar2 = new b(new a() {
                        @Override
                        public final void l(Canvas canvas3, int i21) {
                            float f21;
                            switch (i20) {
                                case 0:
                                    d dVar2 = dVar;
                                    dVar2.getClass();
                                    canvas3.save();
                                    canvas3.translate(-dVar2.f4984i, -dVar2.f4985j);
                                    float f22 = dVar2.f4984i;
                                    float f23 = dVar2.f4985j;
                                    float f24 = i21 / 255.0f;
                                    RectF rectF3 = AndroidUtilities.rectTmp;
                                    float fDp4 = AndroidUtilities.dp(21.0f) / 2.0f;
                                    float width = dVar2.h.getWidth() + f22;
                                    int i22 = i.f5017a;
                                    float f25 = 8;
                                    rectF3.set(f22, f23, width + (AndroidUtilities.dp(f25) * 2), AndroidUtilities.dp(21.0f) + f23);
                                    s1 s1Var2 = dVar2.f4979b;
                                    boolean zQ2 = s1Var2.Q2();
                                    Paint paint = dVar2.f4983g;
                                    if (paint != null) {
                                        int alpha = paint.getAlpha();
                                        paint.setAlpha((int) (255.0f * f24));
                                        canvas3.drawRoundRect(rectF3, fDp4, fDp4, paint);
                                        paint.setAlpha(alpha);
                                        f21 = 21.0f;
                                    } else {
                                        Point point = AndroidUtilities.displaySize;
                                        f21 = 21.0f;
                                        s1Var2.p0(0.0f, 0.0f, point.x, point.y);
                                        Paint paintL2 = s1Var2.L2("paintChatActionBackground");
                                        int alpha2 = paintL2.getAlpha();
                                        paintL2.setAlpha((int) ((zQ2 ? alpha2 : 229.5f) * f24));
                                        canvas3.drawRoundRect(rectF3, fDp4, fDp4, paintL2);
                                        paintL2.setAlpha(alpha2);
                                    }
                                    if (zQ2 || paint != null) {
                                        int alpha3 = g6.f23121h2.getAlpha();
                                        g6.f23121h2.setAlpha((int) (alpha3 * f24));
                                        canvas3.drawRoundRect(rectF3, fDp4, fDp4, g6.f23121h2);
                                        g6.f23121h2.setAlpha(alpha3);
                                    }
                                    canvas3.save();
                                    canvas3.translate(f22 + AndroidUtilities.dp(f25), ((AndroidUtilities.dp(f21) - dVar2.h.getHeight()) / 2.0f) + f23);
                                    int alpha4 = dVar2.h.getPaint().getAlpha();
                                    dVar2.h.getPaint().setAlpha((int) (alpha4 * f24));
                                    dVar2.h.draw(canvas3);
                                    dVar2.h.getPaint().setAlpha(alpha4);
                                    canvas3.restore();
                                    canvas3.restore();
                                    break;
                                default:
                                    d dVar3 = dVar;
                                    dVar3.getClass();
                                    int i23 = i.f5017a;
                                    float fDp5 = AndroidUtilities.dp(21);
                                    dVar3.a(canvas3, fDp5, fDp5, fDp5, i21 / 255.0f);
                                    break;
                            }
                        }
                    });
                    dVar.f4981e = bVar2;
                    bVar2.a(AndroidUtilities.dp(f20), AndroidUtilities.dp(f20), 4.0f, AndroidUtilities.dp(10));
                }
                canvas.save();
                canvas.translate(fG - fG2, f19 - fG2);
                float f21 = 21;
                canvas.scale(fG2 / AndroidUtilities.dp(f21), fG2 / AndroidUtilities.dp(f21));
                b bVar3 = dVar.f4981e;
                bVar3.f4975i = (int) (interpolation * 255.0f);
                bVar3.draw(canvas);
                canvas.restore();
                return;
            }
            return;
        }
        float f22 = !z10 ? 1.0f - jVar.D : i10 / 255.0f;
        float fG3 = g(0.3f, 0.075f, h.f5007k.getInterpolation(jVar.C));
        Matrix matrix = jVar.d;
        matrix.reset();
        matrix.setScale(fG3, fG3);
        matrix.postTranslate(0.0f, rectF2.bottom);
        jVar.f5025f.setLocalMatrix(matrix);
        int interpolation3 = (int) (h.f5006j.getInterpolation(jVar.C) * 255.0f * f22);
        Paint paint = jVar.f5023c;
        paint.setAlpha(interpolation3);
        RectF rectF3 = X;
        rectF3.set(rectF2);
        rectF3.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        Rect rect = Y;
        rectF3.round(rect);
        Drawable drawable = jVar.f5030x;
        drawable.setAlpha((int) (f22 * 255.0f));
        drawable.setBounds(rect);
        drawable.draw(canvas);
        boolean z12 = jVar.I;
        RectF rectF4 = jVar.f5026n;
        if (!z12) {
            float interpolation4 = (h.f5003f.getInterpolation(jVar.C) - h.f5004g.getInterpolation(jVar.C)) * (-40.0f);
            canvas.save();
            canvas.translate(rectF4.left, rectF4.top);
            canvas.rotate(interpolation4, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            canvas.translate(-s1Var.getSideButtonStartX(), -s1Var.getSideButtonStartY());
            s1Var.j2(canvas, true);
            canvas.restore();
        }
        if (!jVar.M || jVar.I) {
            float fMin2 = Math.min(rectF2.width(), rectF2.height()) / 2.0f;
            float fMin3 = Math.min(rectF4.width(), rectF4.height()) / 2.0f;
            canvas.drawRoundRect(rectF2, fMin2, fMin2, paint);
            if (!jVar.I) {
                canvas.drawRoundRect(rectF4, fMin3, fMin3, paint);
            }
        } else {
            canvas.drawPath(jVar.f5024e, paint);
        }
        float interpolation5 = h.f5016t.getInterpolation(jVar.C) * AndroidUtilities.dp(2.0f);
        float f23 = i.f5017a + 2;
        float interpolation6 = ((h.f5013q.getInterpolation(jVar.C) * AndroidUtilities.dp(f23)) / 2.0f) - interpolation5;
        float interpolation7 = ((h.f5014r.getInterpolation(jVar.C) * AndroidUtilities.dp(f23)) / 2.0f) - interpolation5;
        float interpolation8 = ((h.f5015s.getInterpolation(jVar.C) * AndroidUtilities.dp(f23)) / 2.0f) - interpolation5;
        int i21 = 0;
        while (i21 < i17) {
            int i22 = 0;
            while (i22 < dVarArr.length) {
                if (!(i21 == 0 && i22 == jVar.N) && (i21 != i12 || i22 == jVar.N)) {
                    float length = i22 - ((dVarArr.length / 2.0f) - 0.5f);
                    if (i22 == i17) {
                        f10 = interpolation6;
                    } else {
                        f10 = (i22 == i12 || i22 == 3) ? interpolation7 : interpolation8;
                    }
                    float fDp4 = (AndroidUtilities.dp(i.f5017a + 11) * length) + rectF2.centerX();
                    float fCenterY2 = rectF2.centerY();
                    i11 = i21;
                    final d dVar2 = dVarArr[i22];
                    float f24 = 16;
                    float fDp5 = AndroidUtilities.dp(f24);
                    float measuredWidth = kVar2.getMeasuredWidth() - AndroidUtilities.dp(f24);
                    float f25 = rectF2.left;
                    kVar = kVar2;
                    float f26 = rectF2.right;
                    if (i22 == jVar.N && jVar.K) {
                        canvas2 = canvas;
                        f11 = fDp4;
                    } else {
                        dVar2.getClass();
                        canvas2 = canvas;
                        f11 = fDp4;
                        dVar2.a(canvas2, f11, fCenterY2, f10 + (AndroidUtilities.dp(2.0f) * dVar2.f4990o), f22);
                    }
                    float f27 = dVar2.f4990o;
                    if (f27 > 0.0f && dVar2.h != null) {
                        float f28 = (f27 * 0.15f) + 0.85f;
                        canvas2.save();
                        canvas2.scale(f28, f28, f11, fCenterY2);
                        float f29 = dVar2.f4990o * f22;
                        float fD = y1.D(8, 2, dVar2.h.getWidth());
                        dVar2.f4984i = d.b(d.b(f11, fD, f25, f26), fD, fDp5, measuredWidth) - (fD / 2.0f);
                        dVar2.f4985j = fCenterY2 - AndroidUtilities.dp(58.0f);
                        if (dVar2.f4982f == null) {
                            j jVar2 = dVar2.f4978a;
                            if (!jVar2.P) {
                                dVar2.f4983g = jVar2.H;
                                final int i23 = 0;
                                b bVar4 = new b(new a() {
                                    @Override
                                    public final void l(Canvas canvas3, int i24) {
                                        float f210;
                                        switch (i23) {
                                            case 0:
                                                d dVar3 = dVar2;
                                                dVar3.getClass();
                                                canvas3.save();
                                                canvas3.translate(-dVar3.f4984i, -dVar3.f4985j);
                                                float f211 = dVar3.f4984i;
                                                float f212 = dVar3.f4985j;
                                                float f213 = i24 / 255.0f;
                                                RectF rectF5 = AndroidUtilities.rectTmp;
                                                float fDp6 = AndroidUtilities.dp(21.0f) / 2.0f;
                                                float width = dVar3.h.getWidth() + f211;
                                                int i25 = i.f5017a;
                                                float f214 = 8;
                                                rectF5.set(f211, f212, width + (AndroidUtilities.dp(f214) * 2), AndroidUtilities.dp(21.0f) + f212);
                                                s1 s1Var2 = dVar3.f4979b;
                                                boolean zQ2 = s1Var2.Q2();
                                                Paint paint2 = dVar3.f4983g;
                                                if (paint2 != null) {
                                                    int alpha = paint2.getAlpha();
                                                    paint2.setAlpha((int) (255.0f * f213));
                                                    canvas3.drawRoundRect(rectF5, fDp6, fDp6, paint2);
                                                    paint2.setAlpha(alpha);
                                                    f210 = 21.0f;
                                                } else {
                                                    Point point = AndroidUtilities.displaySize;
                                                    f210 = 21.0f;
                                                    s1Var2.p0(0.0f, 0.0f, point.x, point.y);
                                                    Paint paintL2 = s1Var2.L2("paintChatActionBackground");
                                                    int alpha2 = paintL2.getAlpha();
                                                    paintL2.setAlpha((int) ((zQ2 ? alpha2 : 229.5f) * f213));
                                                    canvas3.drawRoundRect(rectF5, fDp6, fDp6, paintL2);
                                                    paintL2.setAlpha(alpha2);
                                                }
                                                if (zQ2 || paint2 != null) {
                                                    int alpha3 = g6.f23121h2.getAlpha();
                                                    g6.f23121h2.setAlpha((int) (alpha3 * f213));
                                                    canvas3.drawRoundRect(rectF5, fDp6, fDp6, g6.f23121h2);
                                                    g6.f23121h2.setAlpha(alpha3);
                                                }
                                                canvas3.save();
                                                canvas3.translate(f211 + AndroidUtilities.dp(f214), ((AndroidUtilities.dp(f210) - dVar3.h.getHeight()) / 2.0f) + f212);
                                                int alpha4 = dVar3.h.getPaint().getAlpha();
                                                dVar3.h.getPaint().setAlpha((int) (alpha4 * f213));
                                                dVar3.h.draw(canvas3);
                                                dVar3.h.getPaint().setAlpha(alpha4);
                                                canvas3.restore();
                                                canvas3.restore();
                                                break;
                                            default:
                                                d dVar4 = dVar2;
                                                dVar4.getClass();
                                                int i26 = i.f5017a;
                                                float fDp7 = AndroidUtilities.dp(21);
                                                dVar4.a(canvas3, fDp7, fDp7, fDp7, i24 / 255.0f);
                                                break;
                                        }
                                    }
                                });
                                dVar2.f4982f = bVar4;
                                bVar4.a((int) fD, AndroidUtilities.dp(21.0f), 3.0f, AndroidUtilities.dp(4));
                            }
                        }
                        b bVar5 = dVar2.f4982f;
                        if (bVar5 != null) {
                            float f30 = dVar2.f4984i;
                            float f31 = dVar2.f4985j;
                            bVar5.setBounds((int) f30, (int) f31, (int) (f30 + fD), (int) (f31 + AndroidUtilities.dp(21.0f)));
                            b bVar6 = dVar2.f4982f;
                            bVar6.f4975i = (int) (f29 * 255.0f);
                            bVar6.draw(canvas2);
                        }
                        canvas2.restore();
                    }
                } else {
                    i11 = i21;
                    kVar = kVar2;
                }
                i22++;
                jVar = this;
                i21 = i11;
                kVar2 = kVar;
                i12 = 1;
                i17 = 2;
            }
            i21++;
            jVar = this;
            i12 = 1;
            i17 = 2;
        }
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    public final int h() {
        return AndroidUtilities.dp(((i.f5017a + 11) * this.f5029w.length) + 7);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ObjectAnimator objectAnimator = this.V;
        u uVar = this.f5022b;
        if (animator == objectAnimator) {
            this.f5031y.setHideSideButtonByQuickShare(false);
            this.I = true;
            invalidateSelf();
            if (this.J) {
                uVar.run();
                return;
            }
            return;
        }
        if (animator == this.W) {
            this.J = true;
            invalidateSelf();
            mb mbVar = this.S;
            if (mbVar != null) {
                mbVar.f30638a.setVisibility(0);
            }
            if (this.I) {
                uVar.run();
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
