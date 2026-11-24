package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.Arrays;
import java.util.Random;
public final class yqc extends View {
    public ValueAnimator E;
    public final zqc F;
    public final Paint a;
    public final char[] b;
    public final Random c;
    public final int[] d;
    public final float[] e;
    public final float f;
    public final float h;
    public final float n;
    public final float r;
    public final Paint.FontMetrics s;
    public String w;
    public float x;
    public boolean y;

    public yqc(zqc zqcVar, Context context) {
        super(context);
        this.F = zqcVar;
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new char[1];
        this.c = new Random();
        this.d = new int[48];
        this.e = new float[48];
        paint.setTypeface(gm.n1("fonts/rmono.ttf"));
        paint.setTextSize(gm.L(12.0f));
        this.f = paint.measureText("U");
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        this.s = fontMetrics;
        float f = fontMetrics.top;
        this.n = -f;
        float f2 = fontMetrics.descent - fontMetrics.ascent;
        this.h = f2;
        this.r = (fontMetrics.bottom - f) + f2;
        setImportantForAccessibility(1);
        setContentDescription(jb6.M0(2131748536, null));
    }

    public final float a() {
        String str = this.w;
        int i = 24;
        if (str != null) {
            i = Math.min(24, str.length());
        }
        return this.f * (Math.max(0, (i - 1) / 4) + i);
    }

    public final int b() {
        int max = Math.max(0, Math.min(24, this.w.length()) - 1);
        return (((max / 4) + max) * 18) + 560;
    }

    public final void c(String str, boolean z) {
        boolean z2;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        if (!z && TextUtils.equals(this.w, str)) {
            return;
        }
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.E = null;
        }
        this.w = str;
        this.x = 0.0f;
        Arrays.fill(this.d, -1);
        String str2 = this.w;
        if (str2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.y = z2;
        if (str2 == null) {
            str2 = jb6.M0(2131748536, null);
        }
        setContentDescription(str2);
        requestLayout();
        d();
        invalidate();
    }

    public final void d() {
        if (this.y && isAttachedToWindow() && isShown()) {
            this.y = false;
            int b = b();
            if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
                this.x = b;
                invalidate();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, b);
            this.E = ofFloat;
            ofFloat.setDuration(b);
            this.E.setInterpolator(new LinearInterpolator());
            this.E.addUpdateListener(new oxb(this, (byte) 16));
            this.E.start();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    @Override
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.E = null;
        }
        if (this.w != null && !this.y) {
            this.x = b();
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        float max;
        Canvas canvas2;
        int i2;
        float f;
        float f2;
        Paint paint;
        int i3;
        float f3;
        float f4;
        float f5;
        float x;
        int i4;
        float f6;
        float cos;
        boolean z;
        float f7;
        char charAt;
        float[] fArr;
        int i5;
        float f8;
        float f9;
        int i6;
        int i7;
        super.onDraw(canvas);
        int i8 = cmb.C6;
        ylb ylbVar = this.F.a;
        int v0 = cmb.v0(i8, ylbVar);
        int v02 = cmb.v0(cmb.F6, ylbVar);
        String str = this.w;
        int i9 = 48;
        if (str != null) {
            i9 = Math.min(48, str.length());
        }
        int i10 = i9;
        int i11 = 0;
        while (true) {
            int i12 = i11 << 2;
            if (i12 < i10) {
                int i13 = i12 / 24;
                int i14 = (i11 % 6) * 5;
                float f10 = this.f;
                float f11 = i14 * f10;
                float f12 = i13 * this.h;
                float f13 = this.n;
                float f14 = f12 + f13;
                float f15 = this.x - (i * 90);
                if (this.w == null) {
                    max = 1.0f;
                } else {
                    max = 1.0f - Math.max(0.0f, Math.min(1.0f, f15 / 180.0f));
                }
                int i15 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
                float f16 = 0.0f;
                Paint.FontMetrics fontMetrics = this.s;
                Paint paint2 = this.a;
                if (i15 > 0) {
                    paint2.setColor(v0);
                    paint2.setAlpha(Math.round(paint2.getAlpha() * 0.22f * max));
                    i2 = i14;
                    float e = td4.e(fontMetrics.ascent, fontMetrics.descent, 2.0f, f14);
                    f = f10;
                    f2 = f13;
                    i3 = i11;
                    f3 = 1.0f;
                    f5 = f14;
                    canvas2 = canvas;
                    canvas2.drawRoundRect(f11, e - gm.L(2.0f), (Math.min(4, i10 - i12) * f10) + f11, e + gm.L(2.0f), gm.L(2.0f), gm.L(2.0f), paint2);
                    paint = paint2;
                    f4 = f11;
                } else {
                    canvas2 = canvas;
                    i2 = i14;
                    f = f10;
                    f2 = f13;
                    paint = paint2;
                    i3 = i11;
                    f3 = 1.0f;
                    f4 = f11;
                    f5 = f14;
                }
                if (this.w != null) {
                    int i16 = 0;
                    int i17 = 4;
                    while (i16 < i17) {
                        int i18 = i12 + i16;
                        if (i18 < i10) {
                            float f17 = this.x - ((i2 + i16) * 18);
                            if (f17 <= f16) {
                                i7 = i17;
                                i4 = i12;
                                f9 = f16;
                                i6 = i16;
                            } else {
                                if (kt6.x(f17, 560.0f, f3, f16) >= f3) {
                                    f6 = f17;
                                    i4 = i12;
                                    cos = 0.0f;
                                } else {
                                    i4 = i12;
                                    f6 = f17;
                                    cos = (float) (Math.cos(x * 12.0f) * Math.exp((-8.0f) * x));
                                }
                                int i19 = (int) (f6 / 50.0f);
                                if (f6 < 260.0f) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    f7 = f6;
                                    charAt = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(((i19 * 13) + (i18 * 17)) % 64);
                                } else {
                                    f7 = f6;
                                    charAt = this.w.charAt(i18);
                                }
                                this.b[0] = charAt;
                                float[] fArr2 = this.e;
                                if (z) {
                                    int[] iArr = this.d;
                                    fArr = fArr2;
                                    if (iArr[i18] != i19) {
                                        iArr[i18] = i19;
                                        fArr[i18] = this.c.nextFloat();
                                    }
                                } else {
                                    fArr = fArr2;
                                }
                                if (z) {
                                    i5 = on2.f(fArr[i18], v0, v02);
                                } else if ((i3 + i13) % 2 == 0) {
                                    i5 = v0;
                                } else {
                                    i5 = v02;
                                }
                                paint.setColor(i5);
                                paint.setAlpha(Math.round(Math.max(0.0f, Math.min(1.0f, f7 / 100.0f)) * paint.getAlpha()));
                                int save = canvas2.save();
                                float L = gm.L(1.0f) + f2 + fontMetrics.descent;
                                if (i13 == 0) {
                                    f8 = 0.0f;
                                } else {
                                    f8 = L;
                                }
                                float width = getWidth();
                                if (i13 != 0) {
                                    L = getHeight();
                                }
                                f9 = 0.0f;
                                canvas2.clipRect(0.0f, f8, width, L);
                                i6 = i16;
                                i7 = 4;
                                canvas2.drawText(this.b, 0, 1, (i16 * f) + f4, f5 - (gm.L(24.0f) * cos), paint);
                                canvas2.restoreToCount(save);
                            }
                            i16 = i6 + 1;
                            f16 = f9;
                            i17 = i7;
                            i12 = i4;
                            f3 = 1.0f;
                        }
                    }
                }
                i11 = i3 + 1;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSize((int) Math.ceil(a()), i), View.resolveSize((int) Math.ceil(this.r), i2));
    }

    @Override
    public final void onVisibilityChanged(View view, int i) {
        float b;
        super.onVisibilityChanged(view, i);
        if (isShown()) {
            d();
            return;
        }
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.E = null;
            }
            if (this.w == null) {
                b = 0.0f;
            } else {
                b = b();
            }
            this.x = b;
        }
    }
}
