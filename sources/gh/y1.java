package gh;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.er;

public final class y1 extends Drawable {
    public static f2 C = new f2();
    public Paint A;
    public int B;

    public final ViewGroup f7653a;

    public final org.telegram.ui.ActionBar.c6 f7654b;

    public final Paint f7655c;
    public final Paint d;

    public final RectF f7656e;

    public final Path f7657f;

    public final boolean f7658g;
    public TL_stars.starGiftAttributeBackdrop h;

    public int f7659i;

    public RadialGradient f7660j;

    public final Matrix f7661k;

    public final x1 f7662l;

    public int[] f7663m;

    public LinearGradient f7664n;

    public final Matrix f7665o;

    public boolean f7666p;

    public final Paint f7667q;

    public final org.telegram.ui.Components.y5 f7668r;

    public float f7669s;

    public boolean f7670t;

    public boolean f7671u;
    public int v;

    public int f7672w;

    public Integer f7673x;

    public long f7674y;

    public Bitmap f7675z;

    public y1(ViewGroup viewGroup, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        Paint paint = new Paint(1);
        this.f7655c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        this.f7656e = new RectF();
        this.f7657f = new Path();
        this.f7661k = new Matrix();
        new Path();
        this.f7665o = new Matrix();
        Paint paint3 = new Paint(1);
        this.f7667q = paint3;
        this.f7668r = new org.telegram.ui.Components.y5(new f2.r(this, 8), 320L, er.h);
        this.f7669s = AndroidUtilities.dp(11.0f);
        this.f7671u = true;
        this.v = 0;
        int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
        this.f7672w = i10;
        this.f7653a = viewGroup;
        this.f7654b = c6Var;
        x1 x1Var = new x1(this, viewGroup, AndroidUtilities.dp(28.0f));
        this.f7662l = x1Var;
        viewGroup.addOnAttachStateChangeListener(new bf.b(this, 1));
        if (viewGroup.isAttachedToWindow()) {
            x1Var.a();
        }
        this.f7658g = z10;
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        a(z10);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint2.setStyle(style);
    }

    public final void a(boolean z10) {
        if (this.f7670t != z10) {
            this.f7670t = z10;
            Paint paint = this.f7655c;
            if (z10) {
                paint.setShadowLayer(AndroidUtilities.dp(1.66f), 0.0f, AndroidUtilities.dp(0.33f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f22998a6, this.f7654b));
            } else {
                paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
        }
    }

    public final void b(Canvas canvas, float f10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        float f11;
        Bitmap bitmap;
        boolean z10;
        Bitmap bitmap2;
        NinePatchDrawable ninePatchDrawable;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        float fE = this.f7668r.e(this.f7666p);
        RectF rectF = this.f7656e;
        rectF.set(bounds);
        if (this.f7671u) {
            rectF.inset(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
        }
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.h;
        Paint paint = this.f7655c;
        if (stargiftattributebackdrop != null) {
            int iLerp = AndroidUtilities.lerp(Math.min(bounds.width(), bounds.height()), Math.max(bounds.width(), bounds.height()), 0.35f) / 2;
            if (this.f7660j == null || this.f7659i != iLerp) {
                this.f7659i = iLerp;
                float f12 = iLerp;
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = this.h;
                int i10 = stargiftattributebackdrop2.center_color | (-16777216);
                this.f7660j = new RadialGradient(0.0f, 0.0f, f12, new int[]{i10, i10, stargiftattributebackdrop2.edge_color | (-16777216)}, new float[]{0.0f, 0.0f, 1.0f}, Shader.TileMode.CLAMP);
            }
            Matrix matrix = this.f7661k;
            matrix.reset();
            matrix.postTranslate(bounds.centerX(), Math.min(AndroidUtilities.dp(50.0f), bounds.centerY()));
            this.f7660j.setLocalMatrix(matrix);
            paint.setShader(this.f7660j);
        } else {
            paint.setShader(null);
        }
        int i11 = org.telegram.ui.ActionBar.g6.f22998a6;
        org.telegram.ui.ActionBar.c6 c6Var2 = this.f7654b;
        final int iV0 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var2);
        int i12 = org.telegram.ui.ActionBar.g6.f23053d6;
        final int iV1 = org.telegram.ui.ActionBar.g6.v0(i12, c6Var2);
        final int i13 = 0;
        boolean z11 = this.f7669s == ((float) AndroidUtilities.dp(11.0f)) && iV0 == org.telegram.ui.ActionBar.g6.w0(null, i11, false) && iV1 == org.telegram.ui.ActionBar.g6.w0(null, i12, false);
        boolean z12 = this.f7658g;
        a(z12 && !z11);
        if (z11) {
            if (C == null) {
                C = new f2();
            }
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            if (this.h != null) {
                if (z12) {
                    f2 f2Var = C;
                    if (f2Var.f7243b == null || f2Var.h != iV0) {
                        f2Var.h = iV0;
                        Bitmap[] bitmapArr = f2Var.f7242a;
                        float[] fArr = f2Var.f7247g;
                        final float fDp = AndroidUtilities.dp(1.66f);
                        final float fDp2 = AndroidUtilities.dp(0.33f);
                        f2Var.f7243b = h7.l6.b(bitmapArr, fArr, fDp, fDp2, 0, new pg.e() {
                            @Override
                            public final void a(Canvas canvas3, RectF rectF2, float[] fArr2) {
                                Path path = new Path();
                                path.addRoundRect(rectF2, fArr2, Path.Direction.CW);
                                Paint paint2 = new Paint(1);
                                paint2.setStyle(Paint.Style.FILL);
                                paint2.setColor(i13);
                                float f13 = fDp;
                                if (f13 > 0.0f) {
                                    paint2.setShadowLayer(f13, 0.0f, fDp2, iV0);
                                }
                                canvas3.drawPath(path, paint2);
                                if (f13 > 0.0f) {
                                    paint2.clearShadowLayer();
                                    canvas3.drawPath(path, paint2);
                                }
                            }
                        });
                    }
                    NinePatchDrawable ninePatchDrawable2 = f2Var.f7243b;
                    gf.s.h(ninePatchDrawable2, rect);
                    ninePatchDrawable2.draw(canvas2);
                }
                float f13 = this.f7669s;
                canvas2.drawRoundRect(rectF, f13, f13, paint);
            } else {
                if (z12) {
                    f2 f2Var2 = C;
                    if (f2Var2.f7246f == null || (f2Var2.f7249j != iV1 && f2Var2.f7250k != iV0)) {
                        f2Var2.f7249j = iV1;
                        f2Var2.f7250k = iV0;
                        Bitmap[] bitmapArr2 = f2Var2.f7245e;
                        float[] fArr2 = f2Var2.f7247g;
                        final float fDp3 = AndroidUtilities.dp(1.66f);
                        final float fDp4 = AndroidUtilities.dp(0.33f);
                        f2Var2.f7246f = h7.l6.b(bitmapArr2, fArr2, fDp3, fDp4, iV1, new pg.e() {
                            @Override
                            public final void a(Canvas canvas3, RectF rectF2, float[] fArr3) {
                                Path path = new Path();
                                path.addRoundRect(rectF2, fArr3, Path.Direction.CW);
                                Paint paint2 = new Paint(1);
                                paint2.setStyle(Paint.Style.FILL);
                                paint2.setColor(iV1);
                                float f14 = fDp3;
                                if (f14 > 0.0f) {
                                    paint2.setShadowLayer(f14, 0.0f, fDp4, iV0);
                                }
                                canvas3.drawPath(path, paint2);
                                if (f14 > 0.0f) {
                                    paint2.clearShadowLayer();
                                    canvas3.drawPath(path, paint2);
                                }
                            }
                        });
                    }
                    ninePatchDrawable = f2Var2.f7246f;
                } else {
                    f2 f2Var3 = C;
                    if (f2Var3.d == null || f2Var3.f7248i != iV1) {
                        f2Var3.f7248i = iV1;
                        final float f14 = 0.0f;
                        final float f15 = 0.0f;
                        f2Var3.d = h7.l6.b(f2Var3.f7244c, f2Var3.f7247g, 0.0f, 0.0f, iV1, new pg.e() {
                            @Override
                            public final void a(Canvas canvas3, RectF rectF2, float[] fArr3) {
                                Path path = new Path();
                                path.addRoundRect(rectF2, fArr3, Path.Direction.CW);
                                Paint paint2 = new Paint(1);
                                paint2.setStyle(Paint.Style.FILL);
                                paint2.setColor(iV1);
                                float f16 = f14;
                                if (f16 > 0.0f) {
                                    paint2.setShadowLayer(f16, 0.0f, f15, i13);
                                }
                                canvas3.drawPath(path, paint2);
                                if (f16 > 0.0f) {
                                    paint2.clearShadowLayer();
                                    canvas3.drawPath(path, paint2);
                                }
                            }
                        });
                    }
                    ninePatchDrawable = f2Var3.d;
                }
                gf.s.h(ninePatchDrawable, rect);
                ninePatchDrawable.draw(canvas2);
            }
        } else {
            float f16 = this.f7669s;
            canvas2.drawRoundRect(rectF, f16, f16, paint);
        }
        int[] iArr = this.f7663m;
        x1 x1Var = this.f7662l;
        boolean z13 = (iArr == null && (this.h == null || x1Var.d())) ? false : true;
        if (z13) {
            canvas2.save();
            Path path = this.f7657f;
            path.rewind();
            float f17 = this.f7669s;
            path.addRoundRect(rectF, f17, f17, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        if (this.f7663m != null) {
            if (this.f7664n == null) {
                this.f7664n = new LinearGradient(0.0f, 0.0f, 100.0f, 0.0f, this.f7663m, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            }
            Matrix matrix2 = this.f7665o;
            matrix2.reset();
            matrix2.postTranslate(bounds.left, bounds.top);
            matrix2.postRotate((float) ((Math.atan2(bounds.height(), bounds.width()) / 3.141592653589793d) * 180.0d));
            float fSqrt = ((float) Math.sqrt(Math.pow(bounds.height(), 2.0d) + Math.pow(bounds.width(), 2.0d))) / 100.0f;
            matrix2.postScale(fSqrt, fSqrt);
            this.f7664n.setLocalMatrix(matrix2);
            LinearGradient linearGradient = this.f7664n;
            Paint paint2 = this.d;
            paint2.setShader(linearGradient);
            paint2.setStrokeWidth(AndroidUtilities.dp(4.66f));
            float f18 = this.f7669s;
            canvas2.drawRoundRect(rectF, f18, f18, paint2);
        }
        if (this.h == null || x1Var.d()) {
            c6Var = c6Var2;
        } else {
            int i14 = this.h.pattern_color | (-16777216);
            canvas2.save();
            canvas2.translate(bounds.centerX(), bounds.centerY());
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 29) {
                Drawable drawable = x1Var.f29229f[0];
                f11 = 1.0f;
                if (drawable != null && x1Var.d.f34812c == 1.0f && (drawable instanceof org.telegram.ui.Components.k5)) {
                    org.telegram.ui.Components.k5 k5Var = (org.telegram.ui.Components.k5) drawable;
                    jh.y2 y2Var = k5Var.f29961k;
                    long jI = k5Var.i();
                    if (y2Var != null) {
                        c6Var = c6Var2;
                        if (jI != this.f7674y || (bitmap = y2Var.getBitmap()) == null) {
                        }
                    } else {
                        c6Var = c6Var2;
                    }
                    bitmap = null;
                } else {
                    c6Var = c6Var2;
                    bitmap = null;
                }
                if (bitmap != null) {
                    if (this.f7675z != bitmap || this.A == null) {
                        this.f7675z = bitmap;
                        this.A = g0.a.a(bitmap);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.B != i14 || z10) {
                        this.B = i14;
                        if (i15 >= 29) {
                            this.A.setColorFilter(new BlendModeColorFilter(i14, BlendMode.SRC_IN));
                        } else {
                            this.A.setColorFilter(new PorterDuffColorFilter(i14, PorterDuff.Mode.SRC_IN));
                        }
                    }
                    if (f10 < 1.0f) {
                        bitmap2 = bitmap;
                        hh.y0.b(canvas2, 2, this.A, bitmap2, bounds.width(), bounds.height(), 1.0f - f10);
                    } else {
                        bitmap2 = bitmap;
                    }
                    if (f10 > 0.0f) {
                        canvas2.translate(0.0f, AndroidUtilities.dp(-31.0f));
                        hh.y0.b(canvas2, 0, this.A, bitmap2, bounds.width(), bounds.height(), f10);
                    }
                    canvas2 = canvas;
                }
                canvas2.restore();
            } else {
                c6Var = c6Var2;
                f11 = 1.0f;
            }
            x1Var.k(Integer.valueOf(i14));
            if (f10 < f11) {
                canvas2 = canvas;
                hh.y0.a(canvas2, 2, x1Var, bounds.width(), bounds.height(), f11 - f10, 1.0f);
            } else {
                canvas2 = canvas;
            }
            if (f10 > 0.0f) {
                canvas2.translate(0.0f, AndroidUtilities.dp(-31.0f));
                hh.y0.a(canvas2, 0, x1Var, bounds.width(), bounds.height(), f10, 1.0f);
            }
            canvas2.restore();
        }
        if (z13) {
            canvas2.restore();
        }
        if (fE > 0.0f) {
            int i16 = this.v;
            Paint paint3 = this.f7667q;
            if (i16 == 0) {
                Integer num = this.f7673x;
                paint3.setColor(num != null ? num.intValue() : org.telegram.ui.ActionBar.g6.v0(this.f7672w, c6Var));
                paint3.setStrokeWidth(AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(1.667f), fE));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(rectF);
                float fLerp = AndroidUtilities.lerp(-AndroidUtilities.dpf2(2.33f), AndroidUtilities.dpf2(3.33f), fE);
                rectF2.inset(fLerp, fLerp);
                float fLerp2 = AndroidUtilities.lerp(this.f7669s, AndroidUtilities.dpf2(7.33f), fE);
                canvas2.drawRoundRect(rectF2, fLerp2, fLerp2, paint3);
                return;
            }
            org.telegram.ui.ActionBar.c6 c6Var3 = c6Var;
            if (i16 == 1) {
                Integer num2 = this.f7673x;
                paint3.setColor(num2 != null ? num2.intValue() : org.telegram.ui.ActionBar.g6.v0(this.f7672w, c6Var3));
                paint3.setStrokeWidth(AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(3.0f), fE));
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(rectF);
                float fLerp3 = AndroidUtilities.lerp(0.0f, AndroidUtilities.dpf2(3.0f) / 2.0f, fE);
                rectF3.inset(fLerp3, fLerp3);
                float fLerp4 = AndroidUtilities.lerp(this.f7669s, AndroidUtilities.dpf2(10.0f), fE);
                canvas2.drawRoundRect(rectF3, fLerp4, fLerp4, paint3);
            }
        }
    }

    public final void c() {
        this.f7653a.invalidate();
        if (getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public final void d(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (this.h != stargiftattributebackdrop) {
            this.f7660j = null;
        }
        this.h = stargiftattributebackdrop;
        c();
    }

    @Override
    public final void draw(Canvas canvas) {
        b(canvas, 0.0f);
    }

    public final void e(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.f7674y = 0L;
        x1 x1Var = this.f7662l;
        if (stargiftattributepattern == null) {
            x1Var.g(null, false);
            return;
        }
        x1Var.i(stargiftattributepattern.document, false);
        TLRPC.Document document = stargiftattributepattern.document;
        if (document != null) {
            this.f7674y = document.f22386id;
        }
    }

    public final void f(boolean z10, boolean z11) {
        if (this.f7666p == z10) {
            return;
        }
        this.f7666p = z10;
        if (!z11) {
            this.f7668r.a(z10);
        }
        c();
    }

    public final void g(int[] iArr) {
        if (this.f7663m == iArr) {
            return;
        }
        this.f7663m = iArr;
        this.f7664n = null;
        c();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final boolean getPadding(Rect rect) {
        rect.set(AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.33f), AndroidUtilities.dp(4.0f));
        return true;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
