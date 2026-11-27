package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
public final class r66 extends g44 {
    public final byte n = 2;
    public final Paint r;
    public final Path s;

    public r66(s66 s66Var, Context context) {
        super(s66Var, context);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override
    public final int a(float f, float f2) {
        switch (this.n) {
            case 0:
                float L = hl.L(19.5f);
                float L2 = hl.L(1.0f) + L;
                float f3 = L2 * 2.0f;
                float measuredWidth = getMeasuredWidth() - f3;
                float z = bp1.z(getMeasuredHeight(), f3, 2.0f, L2);
                if (f > L2 - L && f2 > z - L && f < L2 + L && f2 < z + L) {
                    return 1;
                }
                float f4 = L2 + measuredWidth;
                if (f > f4 - L && f2 > z - L && f < f4 + L && f2 < z + L) {
                    return 2;
                }
                return 0;
            case 1:
                float L3 = hl.L(19.5f);
                float L4 = hl.L(1.0f) + L3;
                float f5 = L4 * 2.0f;
                float measuredWidth2 = getMeasuredWidth() - f5;
                float z2 = bp1.z(getMeasuredHeight(), f5, 2.0f, L4);
                if (f > L4 - L3 && f2 > z2 - L3 && f < L4 + L3 && f2 < z2 + L3) {
                    return 1;
                }
                float f6 = L4 + measuredWidth2;
                if (f > f6 - L3 && f2 > z2 - L3 && f < f6 + L3 && f2 < z2 + L3) {
                    return 2;
                }
                return 0;
            case 2:
                float L5 = hl.L(19.5f);
                float L6 = hl.L(1.0f) + L5;
                float f7 = L6 * 2.0f;
                float measuredWidth3 = getMeasuredWidth() - f7;
                float measuredHeight = getMeasuredHeight() - f7;
                float f8 = (measuredHeight / 2.0f) + L6;
                if (f > L6 - L5 && f2 > f8 - L5 && f < L6 + L5 && f2 < f8 + L5) {
                    return 1;
                }
                float f9 = L6 + measuredWidth3;
                if (f > f9 - L5 && f2 > f8 - L5 && f < f9 + L5 && f2 < f8 + L5) {
                    return 2;
                }
                if (f > L6 && f < measuredWidth3 && f2 > L6 && f2 < measuredHeight) {
                    return 3;
                }
                return 0;
            case 3:
                float L7 = hl.L(19.5f);
                float L8 = hl.L(1.0f) + L7;
                float f10 = L8 * 2.0f;
                float measuredWidth4 = getMeasuredWidth() - f10;
                float measuredHeight2 = getMeasuredHeight() - f10;
                float f11 = (measuredHeight2 / 2.0f) + L8;
                if (f > L8 - L7 && f2 > f11 - L7 && f < L8 + L7 && f2 < f11 + L7) {
                    return 1;
                }
                float f12 = L8 + measuredWidth4;
                if (f > f12 - L7 && f2 > f11 - L7 && f < f12 + L7 && f2 < f11 + L7) {
                    return 2;
                }
                if (f > L8 && f < measuredWidth4 && f2 > L8 && f2 < measuredHeight2) {
                    return 3;
                }
                return 0;
            case 4:
                float L9 = hl.L(19.5f);
                float L10 = hl.L(1.0f) + L9;
                float f13 = L10 * 2.0f;
                float measuredWidth5 = getMeasuredWidth() - f13;
                float z3 = bp1.z(getMeasuredHeight(), f13, 2.0f, L10);
                if (f > L10 - L9 && f2 > z3 - L9 && f < L10 + L9 && f2 < z3 + L9) {
                    return 1;
                }
                float f14 = L10 + measuredWidth5;
                if (f > f14 - L9 && f2 > z3 - L9 && f < f14 + L9 && f2 < z3 + L9) {
                    return 2;
                }
                return 0;
            default:
                float L11 = hl.L(19.5f);
                float L12 = hl.L(1.0f) + L11;
                float f15 = L12 * 2.0f;
                float measuredWidth6 = getMeasuredWidth() - f15;
                float z4 = bp1.z(getMeasuredHeight(), f15, 2.0f, L12);
                if (f > L12 - L11 && f2 > z4 - L11 && f < L12 + L11 && f2 < z4 + L11) {
                    return 1;
                }
                float f16 = L12 + measuredWidth6;
                if (f > f16 - L11 && f2 > z4 - L11 && f < f16 + L11 && f2 < z4 + L11) {
                    return 2;
                }
                return 0;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        r66 r66Var;
        Canvas canvas3;
        r66 r66Var2;
        int i;
        Paint paint;
        Paint paint2;
        float f;
        float f2;
        float f3;
        float f4;
        Canvas canvas4;
        byte b = this.n;
        Path path = this.s;
        Paint paint3 = this.c;
        Paint paint4 = this.b;
        Paint paint5 = this.r;
        switch (b) {
            case 0:
                super.onDraw(canvas);
                int saveCount = canvas.getSaveCount();
                float showAlpha = getShowAlpha();
                if (showAlpha > 0.0f) {
                    if (showAlpha < 1.0f) {
                        int i2 = (int) (showAlpha * 255.0f);
                        canvas2 = canvas;
                        r66Var = this;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), i2, 31);
                    } else {
                        canvas2 = canvas;
                        r66Var = this;
                    }
                    float N = hl.N(5.66f);
                    float L = hl.L(2.0f) + N + hl.L(15.0f);
                    float f5 = L * 2.0f;
                    float measuredWidth = r66Var.getMeasuredWidth() - f5;
                    float measuredHeight = r66Var.getMeasuredHeight() - f5;
                    RectF rectF = hl.P;
                    float f6 = L + measuredWidth;
                    float f7 = L + measuredHeight;
                    rectF.set(L, L, f6, f7);
                    float L2 = hl.L(12.0f);
                    float min = Math.min(L2, measuredWidth / 2.0f);
                    float f8 = measuredHeight / 2.0f;
                    float min2 = Math.min(L2, f8);
                    path.rewind();
                    float f9 = min * 2.0f;
                    float f10 = L + f9;
                    float f11 = min2 * 2.0f;
                    float f12 = L + f11;
                    rectF.set(L, L, f10, f12);
                    path.arcTo(rectF, 180.0f, 90.0f);
                    float f13 = f6 - f9;
                    rectF.set(f13, L, f6, f12);
                    path.arcTo(rectF, 270.0f, 90.0f);
                    Paint paint6 = r66Var.a;
                    canvas2.drawPath(path, paint6);
                    path.rewind();
                    float f14 = f7 - f11;
                    rectF.set(L, f14, f10, f7);
                    path.arcTo(rectF, 180.0f, -90.0f);
                    rectF.set(f13, f14, f6, f7);
                    path.arcTo(rectF, 90.0f, -90.0f);
                    canvas2.drawPath(path, paint6);
                    float f15 = L + f8;
                    canvas2.drawCircle(L, f15, N, paint3);
                    canvas2.drawCircle(L, f15, (N - hl.L(1.0f)) + 1.0f, paint4);
                    canvas2.drawCircle(f6, f15, N, paint3);
                    canvas2.drawCircle(f6, f15, (N - hl.L(1.0f)) + 1.0f, paint4);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f16 = L + min2;
                    float f17 = f7 - min2;
                    canvas.drawLine(L, f16, L, f17, paint6);
                    canvas.drawLine(f6, f16, f6, f17, paint6);
                    canvas.drawCircle(f6, f15, (hl.L(1.0f) + N) - 1.0f, paint5);
                    canvas.drawCircle(L, f15, (N + hl.L(1.0f)) - 1.0f, paint5);
                    canvas.restoreToCount(saveCount);
                    return;
                }
                return;
            case 1:
                super.onDraw(canvas);
                int saveCount2 = canvas.getSaveCount();
                float showAlpha2 = getShowAlpha();
                if (showAlpha2 > 0.0f) {
                    if (showAlpha2 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha2 * 255.0f), 31);
                    }
                    float N2 = hl.N(5.66f);
                    float L3 = hl.L(2.0f) + N2 + hl.L(15.0f);
                    float f18 = L3 * 2.0f;
                    float measuredWidth2 = getMeasuredWidth() - f18;
                    float measuredHeight2 = getMeasuredHeight() - f18;
                    RectF rectF2 = hl.P;
                    float f19 = L3 + measuredWidth2;
                    float f20 = L3 + measuredHeight2;
                    rectF2.set(L3, L3, f19, f20);
                    float L4 = hl.L(12.0f);
                    float min3 = Math.min(L4, measuredWidth2 / 2.0f);
                    float f21 = measuredHeight2 / 2.0f;
                    float min4 = Math.min(L4, f21);
                    path.rewind();
                    float f22 = min3 * 2.0f;
                    float f23 = L3 + f22;
                    float f24 = min4 * 2.0f;
                    float f25 = L3 + f24;
                    rectF2.set(L3, L3, f23, f25);
                    path.arcTo(rectF2, 180.0f, 90.0f);
                    float f26 = f19 - f22;
                    rectF2.set(f26, L3, f19, f25);
                    path.arcTo(rectF2, 270.0f, 90.0f);
                    Paint paint7 = this.a;
                    canvas.drawPath(path, paint7);
                    path.rewind();
                    float f27 = f20 - f24;
                    rectF2.set(L3, f27, f23, f20);
                    path.arcTo(rectF2, 180.0f, -90.0f);
                    rectF2.set(f26, f27, f19, f20);
                    path.arcTo(rectF2, 90.0f, -90.0f);
                    canvas.drawPath(path, paint7);
                    float f28 = L3 + f21;
                    canvas.drawCircle(L3, f28, N2, paint3);
                    canvas.drawCircle(L3, f28, (N2 - hl.L(1.0f)) + 1.0f, paint4);
                    canvas.drawCircle(f19, f28, N2, paint3);
                    canvas.drawCircle(f19, f28, (N2 - hl.L(1.0f)) + 1.0f, paint4);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f29 = L3 + min4;
                    float f30 = f20 - min4;
                    canvas.drawLine(L3, f29, L3, f30, paint7);
                    canvas.drawLine(f19, f29, f19, f30, paint7);
                    canvas.drawCircle(f19, f28, (hl.L(1.0f) + N2) - 1.0f, paint5);
                    canvas.drawCircle(L3, f28, (N2 + hl.L(1.0f)) - 1.0f, paint5);
                    canvas.restoreToCount(saveCount2);
                    return;
                }
                return;
            case 2:
                super.onDraw(canvas);
                int saveCount3 = canvas.getSaveCount();
                float showAlpha3 = getShowAlpha();
                if (showAlpha3 > 0.0f) {
                    if (showAlpha3 < 1.0f) {
                        int i3 = (int) (showAlpha3 * 255.0f);
                        canvas3 = canvas;
                        r66Var2 = this;
                        canvas3.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), i3, 31);
                    } else {
                        canvas3 = canvas;
                        r66Var2 = this;
                    }
                    float N3 = hl.N(5.66f);
                    float L5 = hl.L(2.0f) + N3 + hl.L(15.0f);
                    float f31 = L5 * 2.0f;
                    float measuredWidth3 = r66Var2.getMeasuredWidth() - f31;
                    float measuredHeight3 = r66Var2.getMeasuredHeight() - f31;
                    RectF rectF3 = hl.P;
                    float f32 = L5 + measuredWidth3;
                    float f33 = L5 + measuredHeight3;
                    rectF3.set(L5, L5, f32, f33);
                    float L6 = hl.L(12.0f);
                    float min5 = Math.min(L6, measuredWidth3 / 2.0f);
                    float f34 = measuredHeight3 / 2.0f;
                    float min6 = Math.min(L6, f34);
                    path.rewind();
                    float f35 = min5 * 2.0f;
                    float f36 = L5 + f35;
                    float f37 = min6 * 2.0f;
                    float f38 = L5 + f37;
                    rectF3.set(L5, L5, f36, f38);
                    path.arcTo(rectF3, 180.0f, 90.0f);
                    float f39 = f32 - f35;
                    rectF3.set(f39, L5, f32, f38);
                    path.arcTo(rectF3, 270.0f, 90.0f);
                    Paint paint8 = r66Var2.a;
                    canvas3.drawPath(path, paint8);
                    path.rewind();
                    float f40 = f33 - f37;
                    rectF3.set(L5, f40, f36, f33);
                    path.arcTo(rectF3, 180.0f, -90.0f);
                    rectF3.set(f39, f40, f32, f33);
                    path.arcTo(rectF3, 90.0f, -90.0f);
                    canvas3.drawPath(path, paint8);
                    float f41 = L5 + f34;
                    canvas3.drawCircle(L5, f41, N3, paint3);
                    canvas3.drawCircle(L5, f41, (N3 - hl.L(1.0f)) + 1.0f, paint4);
                    canvas3.drawCircle(f32, f41, N3, paint3);
                    canvas3.drawCircle(f32, f41, (N3 - hl.L(1.0f)) + 1.0f, paint4);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f42 = L5 + min6;
                    float f43 = f33 - min6;
                    canvas.drawLine(L5, f42, L5, f43, paint8);
                    canvas.drawLine(f32, f42, f32, f43, paint8);
                    canvas.drawCircle(f32, f41, (hl.L(1.0f) + N3) - 1.0f, paint5);
                    canvas.drawCircle(L5, f41, (N3 + hl.L(1.0f)) - 1.0f, paint5);
                    canvas.restoreToCount(saveCount3);
                    return;
                }
                return;
            case 3:
                super.onDraw(canvas);
                int saveCount4 = canvas.getSaveCount();
                float showAlpha4 = getShowAlpha();
                if (showAlpha4 > 0.0f) {
                    if (showAlpha4 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha4 * 255.0f), 31);
                    }
                    float N4 = hl.N(5.66f);
                    float L7 = hl.L(2.0f) + N4 + hl.L(15.0f);
                    float f44 = L7 * 2.0f;
                    float measuredWidth4 = getMeasuredWidth() - f44;
                    float measuredHeight4 = getMeasuredHeight() - f44;
                    RectF rectF4 = hl.P;
                    float f45 = L7 + measuredWidth4;
                    float f46 = L7 + measuredHeight4;
                    rectF4.set(L7, L7, f45, f46);
                    float L8 = hl.L(12.0f);
                    float min7 = Math.min(L8, measuredWidth4 / 2.0f);
                    float f47 = measuredHeight4 / 2.0f;
                    float min8 = Math.min(L8, f47);
                    path.rewind();
                    float f48 = min7 * 2.0f;
                    float f49 = L7 + f48;
                    float f50 = min8 * 2.0f;
                    float f51 = L7 + f50;
                    rectF4.set(L7, L7, f49, f51);
                    path.arcTo(rectF4, 180.0f, 90.0f);
                    float f52 = f45 - f48;
                    rectF4.set(f52, L7, f45, f51);
                    path.arcTo(rectF4, 270.0f, 90.0f);
                    Paint paint9 = this.a;
                    canvas.drawPath(path, paint9);
                    path.rewind();
                    float f53 = f46 - f50;
                    rectF4.set(L7, f53, f49, f46);
                    path.arcTo(rectF4, 180.0f, -90.0f);
                    rectF4.set(f52, f53, f45, f46);
                    path.arcTo(rectF4, 90.0f, -90.0f);
                    canvas.drawPath(path, paint9);
                    float f54 = L7 + f47;
                    canvas.drawCircle(L7, f54, N4, paint3);
                    canvas.drawCircle(L7, f54, (N4 - hl.L(1.0f)) + 1.0f, paint4);
                    canvas.drawCircle(f45, f54, N4, paint3);
                    canvas.drawCircle(f45, f54, (N4 - hl.L(1.0f)) + 1.0f, paint4);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f55 = L7 + min8;
                    float f56 = f46 - min8;
                    canvas.drawLine(L7, f55, L7, f56, paint9);
                    canvas.drawLine(f45, f55, f45, f56, paint9);
                    canvas.drawCircle(f45, f54, (hl.L(1.0f) + N4) - 1.0f, paint5);
                    canvas.drawCircle(L7, f54, (N4 + hl.L(1.0f)) - 1.0f, paint5);
                    canvas.restoreToCount(saveCount4);
                    return;
                }
                return;
            case 4:
                super.onDraw(canvas);
                int saveCount5 = canvas.getSaveCount();
                float showAlpha5 = getShowAlpha();
                if (showAlpha5 > 0.0f) {
                    if (showAlpha5 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha5 * 255.0f), 31);
                    }
                    float N5 = hl.N(5.66f);
                    float L9 = hl.L(2.0f) + N5 + hl.L(15.0f);
                    float f57 = L9 * 2.0f;
                    float measuredWidth5 = getMeasuredWidth() - f57;
                    float measuredHeight5 = getMeasuredHeight() - f57;
                    RectF rectF5 = hl.P;
                    float f58 = L9 + measuredWidth5;
                    float f59 = L9 + measuredHeight5;
                    rectF5.set(L9, L9, f58, f59);
                    float L10 = hl.L(12.0f);
                    float min9 = Math.min(L10, measuredWidth5 / 2.0f);
                    float f60 = measuredHeight5 / 2.0f;
                    float min10 = Math.min(L10, f60);
                    path.rewind();
                    float f61 = min9 * 2.0f;
                    float f62 = L9 + f61;
                    float f63 = min10 * 2.0f;
                    float f64 = L9 + f63;
                    rectF5.set(L9, L9, f62, f64);
                    path.arcTo(rectF5, 180.0f, 90.0f);
                    float f65 = f58 - f61;
                    rectF5.set(f65, L9, f58, f64);
                    path.arcTo(rectF5, 270.0f, 90.0f);
                    Paint paint10 = this.a;
                    canvas.drawPath(path, paint10);
                    path.rewind();
                    float f66 = f59 - f63;
                    rectF5.set(L9, f66, f62, f59);
                    path.arcTo(rectF5, 180.0f, -90.0f);
                    rectF5.set(f65, f66, f58, f59);
                    path.arcTo(rectF5, 90.0f, -90.0f);
                    canvas.drawPath(path, paint10);
                    float f67 = L9 + f60;
                    canvas.drawCircle(L9, f67, N5, paint3);
                    canvas.drawCircle(L9, f67, (N5 - hl.L(1.0f)) + 1.0f, paint4);
                    canvas.drawCircle(f58, f67, N5, paint3);
                    canvas.drawCircle(f58, f67, (N5 - hl.L(1.0f)) + 1.0f, paint4);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f68 = L9 + min10;
                    float f69 = f59 - min10;
                    canvas.drawLine(L9, f68, L9, f69, paint10);
                    canvas.drawLine(f58, f68, f58, f69, paint10);
                    canvas.drawCircle(f58, f67, (hl.L(1.0f) + N5) - 1.0f, paint5);
                    canvas.drawCircle(L9, f67, (N5 + hl.L(1.0f)) - 1.0f, paint5);
                    canvas.restoreToCount(saveCount5);
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                int saveCount6 = canvas.getSaveCount();
                float showAlpha6 = getShowAlpha();
                if (showAlpha6 > 0.0f) {
                    if (showAlpha6 < 1.0f) {
                        i = saveCount6;
                        f = 1.0f;
                        paint2 = paint4;
                        paint = paint3;
                        f2 = 5.66f;
                        f3 = 2.0f;
                        f4 = 15.0f;
                        canvas4 = canvas;
                        canvas4.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha6 * 255.0f), 31);
                    } else {
                        i = saveCount6;
                        paint = paint3;
                        paint2 = paint4;
                        f = 1.0f;
                        f2 = 5.66f;
                        f3 = 2.0f;
                        f4 = 15.0f;
                        canvas4 = canvas;
                    }
                    float N6 = hl.N(f2);
                    float L11 = hl.L(f3) + N6 + hl.L(f4);
                    float f70 = L11 * f3;
                    float measuredWidth6 = getMeasuredWidth() - f70;
                    float measuredHeight6 = getMeasuredHeight() - f70;
                    RectF rectF6 = hl.P;
                    float f71 = L11 + measuredWidth6;
                    float f72 = L11 + measuredHeight6;
                    rectF6.set(L11, L11, f71, f72);
                    float L12 = hl.L(12.0f);
                    float min11 = Math.min(L12, measuredWidth6 / f3);
                    float f73 = measuredHeight6 / f3;
                    float min12 = Math.min(L12, f73);
                    path.rewind();
                    float f74 = min11 * f3;
                    float f75 = L11 + f74;
                    float f76 = min12 * f3;
                    float f77 = L11 + f76;
                    rectF6.set(L11, L11, f75, f77);
                    path.arcTo(rectF6, 180.0f, 90.0f);
                    float f78 = f71 - f74;
                    rectF6.set(f78, L11, f71, f77);
                    path.arcTo(rectF6, 270.0f, 90.0f);
                    Paint paint11 = this.a;
                    canvas4.drawPath(path, paint11);
                    path.rewind();
                    float f79 = f72 - f76;
                    rectF6.set(L11, f79, f75, f72);
                    path.arcTo(rectF6, 180.0f, -90.0f);
                    rectF6.set(f78, f79, f71, f72);
                    path.arcTo(rectF6, 90.0f, -90.0f);
                    canvas4.drawPath(path, paint11);
                    float f80 = L11 + f73;
                    canvas4.drawCircle(L11, f80, N6, paint);
                    Paint paint12 = paint2;
                    canvas4.drawCircle(L11, f80, (N6 - hl.L(f)) + f, paint12);
                    canvas4.drawCircle(f71, f80, N6, paint);
                    canvas4.drawCircle(f71, f80, (N6 - hl.L(f)) + f, paint12);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f81 = L11 + min12;
                    float f82 = f72 - min12;
                    canvas.drawLine(L11, f81, L11, f82, paint11);
                    canvas.drawLine(f71, f81, f71, f82, paint11);
                    canvas.drawCircle(f71, f80, (hl.L(f) + N6) - f, paint5);
                    canvas.drawCircle(L11, f80, (N6 + hl.L(f)) - f, paint5);
                    canvas.restoreToCount(i);
                    return;
                }
                return;
        }
    }

    public r66(xwc xwcVar, Context context) {
        super(xwcVar, context);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public r66(sd6 sd6Var, Context context) {
        super(sd6Var, context);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public r66(rlb rlbVar, Context context) {
        super(rlbVar, context);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public r66(v98 v98Var, Context context) {
        super(v98Var, context);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public r66(b47 b47Var, Context context) {
        super(b47Var, context);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}
