package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
public final class u0 extends i {
    public final int f10290n = 3;
    public final Paint f10291r;
    public final Path f10292s;

    public u0(v0 v0Var, Context context) {
        super(v0Var, context);
        Paint paint = new Paint(1);
        this.f10291r = paint;
        this.f10292s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override
    public final int a(float f7, float f10) {
        switch (this.f10290n) {
            case 0:
                float L = org.telegram.messenger.i0.L(19.5f);
                float L2 = org.telegram.messenger.i0.L(1.0f) + L;
                float f11 = L2 * 2.0f;
                float measuredWidth = getMeasuredWidth() - f11;
                float B = c3.i0.B(getMeasuredHeight(), f11, 2.0f, L2);
                if (f7 > L2 - L && f10 > B - L && f7 < L2 + L && f10 < B + L) {
                    return 1;
                }
                float f12 = L2 + measuredWidth;
                if (f7 > f12 - L && f10 > B - L && f7 < f12 + L && f10 < B + L) {
                    return 2;
                }
                return 0;
            case 1:
                float L3 = org.telegram.messenger.i0.L(19.5f);
                float L4 = org.telegram.messenger.i0.L(1.0f) + L3;
                float f13 = L4 * 2.0f;
                float measuredWidth2 = getMeasuredWidth() - f13;
                float B2 = c3.i0.B(getMeasuredHeight(), f13, 2.0f, L4);
                if (f7 > L4 - L3 && f10 > B2 - L3 && f7 < L4 + L3 && f10 < B2 + L3) {
                    return 1;
                }
                float f14 = L4 + measuredWidth2;
                if (f7 > f14 - L3 && f10 > B2 - L3 && f7 < f14 + L3 && f10 < B2 + L3) {
                    return 2;
                }
                return 0;
            case 2:
                float L5 = org.telegram.messenger.i0.L(19.5f);
                float L6 = org.telegram.messenger.i0.L(1.0f) + L5;
                float f15 = L6 * 2.0f;
                float measuredWidth3 = getMeasuredWidth() - f15;
                float measuredHeight = getMeasuredHeight() - f15;
                float f16 = (measuredHeight / 2.0f) + L6;
                if (f7 > L6 - L5 && f10 > f16 - L5 && f7 < L6 + L5 && f10 < f16 + L5) {
                    return 1;
                }
                float f17 = L6 + measuredWidth3;
                if (f7 > f17 - L5 && f10 > f16 - L5 && f7 < f17 + L5 && f10 < f16 + L5) {
                    return 2;
                }
                if (f7 > L6 && f7 < measuredWidth3 && f10 > L6 && f10 < measuredHeight) {
                    return 3;
                }
                return 0;
            case 3:
                float L7 = org.telegram.messenger.i0.L(19.5f);
                float L8 = org.telegram.messenger.i0.L(1.0f) + L7;
                float f18 = L8 * 2.0f;
                float measuredWidth4 = getMeasuredWidth() - f18;
                float measuredHeight2 = getMeasuredHeight() - f18;
                float f19 = (measuredHeight2 / 2.0f) + L8;
                if (f7 > L8 - L7 && f10 > f19 - L7 && f7 < L8 + L7 && f10 < f19 + L7) {
                    return 1;
                }
                float f20 = L8 + measuredWidth4;
                if (f7 > f20 - L7 && f10 > f19 - L7 && f7 < f20 + L7 && f10 < f19 + L7) {
                    return 2;
                }
                if (f7 > L8 && f7 < measuredWidth4 && f10 > L8 && f10 < measuredHeight2) {
                    return 3;
                }
                return 0;
            case 4:
                float L9 = org.telegram.messenger.i0.L(19.5f);
                float L10 = org.telegram.messenger.i0.L(1.0f) + L9;
                float f21 = L10 * 2.0f;
                float measuredWidth5 = getMeasuredWidth() - f21;
                float B3 = c3.i0.B(getMeasuredHeight(), f21, 2.0f, L10);
                if (f7 > L10 - L9 && f10 > B3 - L9 && f7 < L10 + L9 && f10 < B3 + L9) {
                    return 1;
                }
                float f22 = L10 + measuredWidth5;
                if (f7 > f22 - L9 && f10 > B3 - L9 && f7 < f22 + L9 && f10 < B3 + L9) {
                    return 2;
                }
                return 0;
            default:
                float L11 = org.telegram.messenger.i0.L(19.5f);
                float L12 = org.telegram.messenger.i0.L(1.0f) + L11;
                float f23 = L12 * 2.0f;
                float measuredWidth6 = getMeasuredWidth() - f23;
                float B4 = c3.i0.B(getMeasuredHeight(), f23, 2.0f, L12);
                if (f7 > L12 - L11 && f10 > B4 - L11 && f7 < L12 + L11 && f10 < B4 + L11) {
                    return 1;
                }
                float f24 = L12 + measuredWidth6;
                if (f7 > f24 - L11 && f10 > B4 - L11 && f7 < f24 + L11 && f10 < B4 + L11) {
                    return 2;
                }
                return 0;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f10290n) {
            case 0:
                super.onDraw(canvas);
                int saveCount = canvas.getSaveCount();
                float showAlpha = getShowAlpha();
                if (showAlpha > 0.0f) {
                    if (showAlpha < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha * 255.0f), 31);
                    }
                    float N = org.telegram.messenger.i0.N(5.66f);
                    float L = org.telegram.messenger.i0.L(2.0f) + N + org.telegram.messenger.i0.L(15.0f);
                    float f7 = L * 2.0f;
                    float measuredWidth = getMeasuredWidth() - f7;
                    float measuredHeight = getMeasuredHeight() - f7;
                    RectF rectF = org.telegram.messenger.i0.P;
                    float f10 = L + measuredWidth;
                    float f11 = L + measuredHeight;
                    rectF.set(L, L, f10, f11);
                    float L2 = org.telegram.messenger.i0.L(12.0f);
                    float min = Math.min(L2, measuredWidth / 2.0f);
                    float f12 = measuredHeight / 2.0f;
                    float min2 = Math.min(L2, f12);
                    Path path = this.f10292s;
                    path.rewind();
                    float f13 = min * 2.0f;
                    float f14 = L + f13;
                    float f15 = 2.0f * min2;
                    float f16 = L + f15;
                    rectF.set(L, L, f14, f16);
                    path.arcTo(rectF, 180.0f, 90.0f);
                    float f17 = f10 - f13;
                    rectF.set(f17, L, f10, f16);
                    path.arcTo(rectF, 270.0f, 90.0f);
                    Paint paint = this.f10011a;
                    canvas.drawPath(path, paint);
                    path.rewind();
                    float f18 = f11 - f15;
                    rectF.set(L, f18, f14, f11);
                    path.arcTo(rectF, 180.0f, -90.0f);
                    rectF.set(f17, f18, f10, f11);
                    path.arcTo(rectF, 90.0f, -90.0f);
                    canvas.drawPath(path, paint);
                    float f19 = L + f12;
                    Paint paint2 = this.f10013c;
                    canvas.drawCircle(L, f19, N, paint2);
                    Paint paint3 = this.f10012b;
                    canvas.drawCircle(L, f19, (N - org.telegram.messenger.i0.L(1.0f)) + 1.0f, paint3);
                    canvas.drawCircle(f10, f19, N, paint2);
                    canvas.drawCircle(f10, f19, (N - org.telegram.messenger.i0.L(1.0f)) + 1.0f, paint3);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f20 = L + min2;
                    float f21 = f11 - min2;
                    canvas.drawLine(L, f20, L, f21, paint);
                    canvas.drawLine(f10, f20, f10, f21, paint);
                    Paint paint4 = this.f10291r;
                    canvas.drawCircle(f10, f19, (org.telegram.messenger.i0.L(1.0f) + N) - 1.0f, paint4);
                    canvas.drawCircle(L, f19, (N + org.telegram.messenger.i0.L(1.0f)) - 1.0f, paint4);
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
                    float N2 = org.telegram.messenger.i0.N(5.66f);
                    float L3 = org.telegram.messenger.i0.L(2.0f) + N2 + org.telegram.messenger.i0.L(15.0f);
                    float f22 = L3 * 2.0f;
                    float measuredWidth2 = getMeasuredWidth() - f22;
                    float measuredHeight2 = getMeasuredHeight() - f22;
                    RectF rectF2 = org.telegram.messenger.i0.P;
                    float f23 = L3 + measuredWidth2;
                    float f24 = L3 + measuredHeight2;
                    rectF2.set(L3, L3, f23, f24);
                    float L4 = org.telegram.messenger.i0.L(12.0f);
                    float min3 = Math.min(L4, measuredWidth2 / 2.0f);
                    float f25 = measuredHeight2 / 2.0f;
                    float min4 = Math.min(L4, f25);
                    Path path2 = this.f10292s;
                    path2.rewind();
                    float f26 = min3 * 2.0f;
                    float f27 = L3 + f26;
                    float f28 = 2.0f * min4;
                    float f29 = L3 + f28;
                    rectF2.set(L3, L3, f27, f29);
                    path2.arcTo(rectF2, 180.0f, 90.0f);
                    float f30 = f23 - f26;
                    rectF2.set(f30, L3, f23, f29);
                    path2.arcTo(rectF2, 270.0f, 90.0f);
                    Paint paint5 = this.f10011a;
                    canvas.drawPath(path2, paint5);
                    path2.rewind();
                    float f31 = f24 - f28;
                    rectF2.set(L3, f31, f27, f24);
                    path2.arcTo(rectF2, 180.0f, -90.0f);
                    rectF2.set(f30, f31, f23, f24);
                    path2.arcTo(rectF2, 90.0f, -90.0f);
                    canvas.drawPath(path2, paint5);
                    float f32 = L3 + f25;
                    Paint paint6 = this.f10013c;
                    canvas.drawCircle(L3, f32, N2, paint6);
                    Paint paint7 = this.f10012b;
                    canvas.drawCircle(L3, f32, (N2 - org.telegram.messenger.i0.L(1.0f)) + 1.0f, paint7);
                    canvas.drawCircle(f23, f32, N2, paint6);
                    canvas.drawCircle(f23, f32, (N2 - org.telegram.messenger.i0.L(1.0f)) + 1.0f, paint7);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f33 = L3 + min4;
                    float f34 = f24 - min4;
                    canvas.drawLine(L3, f33, L3, f34, paint5);
                    canvas.drawLine(f23, f33, f23, f34, paint5);
                    Paint paint8 = this.f10291r;
                    canvas.drawCircle(f23, f32, (org.telegram.messenger.i0.L(1.0f) + N2) - 1.0f, paint8);
                    canvas.drawCircle(L3, f32, (N2 + org.telegram.messenger.i0.L(1.0f)) - 1.0f, paint8);
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
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha3 * 255.0f), 31);
                    }
                    float N3 = org.telegram.messenger.i0.N(5.66f);
                    float L5 = org.telegram.messenger.i0.L(2.0f) + N3 + org.telegram.messenger.i0.L(15.0f);
                    float f35 = L5 * 2.0f;
                    float measuredWidth3 = getMeasuredWidth() - f35;
                    float measuredHeight3 = getMeasuredHeight() - f35;
                    RectF rectF3 = org.telegram.messenger.i0.P;
                    float f36 = L5 + measuredWidth3;
                    float f37 = L5 + measuredHeight3;
                    rectF3.set(L5, L5, f36, f37);
                    float L6 = org.telegram.messenger.i0.L(12.0f);
                    float min5 = Math.min(L6, measuredWidth3 / 2.0f);
                    float f38 = measuredHeight3 / 2.0f;
                    float min6 = Math.min(L6, f38);
                    Path path3 = this.f10292s;
                    path3.rewind();
                    float f39 = min5 * 2.0f;
                    float f40 = L5 + f39;
                    float f41 = 2.0f * min6;
                    float f42 = L5 + f41;
                    rectF3.set(L5, L5, f40, f42);
                    path3.arcTo(rectF3, 180.0f, 90.0f);
                    float f43 = f36 - f39;
                    rectF3.set(f43, L5, f36, f42);
                    path3.arcTo(rectF3, 270.0f, 90.0f);
                    Paint paint9 = this.f10011a;
                    canvas.drawPath(path3, paint9);
                    path3.rewind();
                    float f44 = f37 - f41;
                    rectF3.set(L5, f44, f40, f37);
                    path3.arcTo(rectF3, 180.0f, -90.0f);
                    rectF3.set(f43, f44, f36, f37);
                    path3.arcTo(rectF3, 90.0f, -90.0f);
                    canvas.drawPath(path3, paint9);
                    float f45 = L5 + f38;
                    Paint paint10 = this.f10013c;
                    canvas.drawCircle(L5, f45, N3, paint10);
                    Paint paint11 = this.f10012b;
                    canvas.drawCircle(L5, f45, (N3 - org.telegram.messenger.i0.L(1.0f)) + 1.0f, paint11);
                    canvas.drawCircle(f36, f45, N3, paint10);
                    canvas.drawCircle(f36, f45, (N3 - org.telegram.messenger.i0.L(1.0f)) + 1.0f, paint11);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f46 = L5 + min6;
                    float f47 = f37 - min6;
                    canvas.drawLine(L5, f46, L5, f47, paint9);
                    canvas.drawLine(f36, f46, f36, f47, paint9);
                    Paint paint12 = this.f10291r;
                    canvas.drawCircle(f36, f45, (org.telegram.messenger.i0.L(1.0f) + N3) - 1.0f, paint12);
                    canvas.drawCircle(L5, f45, (N3 + org.telegram.messenger.i0.L(1.0f)) - 1.0f, paint12);
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
                    float N4 = org.telegram.messenger.i0.N(5.66f);
                    float L7 = org.telegram.messenger.i0.L(2.0f) + N4 + org.telegram.messenger.i0.L(15.0f);
                    float f48 = L7 * 2.0f;
                    float measuredWidth4 = getMeasuredWidth() - f48;
                    float measuredHeight4 = getMeasuredHeight() - f48;
                    RectF rectF4 = org.telegram.messenger.i0.P;
                    float f49 = L7 + measuredWidth4;
                    float f50 = L7 + measuredHeight4;
                    rectF4.set(L7, L7, f49, f50);
                    float L8 = org.telegram.messenger.i0.L(12.0f);
                    float min7 = Math.min(L8, measuredWidth4 / 2.0f);
                    float f51 = measuredHeight4 / 2.0f;
                    float min8 = Math.min(L8, f51);
                    Path path4 = this.f10292s;
                    path4.rewind();
                    float f52 = min7 * 2.0f;
                    float f53 = L7 + f52;
                    float f54 = 2.0f * min8;
                    float f55 = L7 + f54;
                    rectF4.set(L7, L7, f53, f55);
                    path4.arcTo(rectF4, 180.0f, 90.0f);
                    float f56 = f49 - f52;
                    rectF4.set(f56, L7, f49, f55);
                    path4.arcTo(rectF4, 270.0f, 90.0f);
                    Paint paint13 = this.f10011a;
                    canvas.drawPath(path4, paint13);
                    path4.rewind();
                    float f57 = f50 - f54;
                    rectF4.set(L7, f57, f53, f50);
                    path4.arcTo(rectF4, 180.0f, -90.0f);
                    rectF4.set(f56, f57, f49, f50);
                    path4.arcTo(rectF4, 90.0f, -90.0f);
                    canvas.drawPath(path4, paint13);
                    float f58 = L7 + f51;
                    Paint paint14 = this.f10013c;
                    canvas.drawCircle(L7, f58, N4, paint14);
                    Paint paint15 = this.f10012b;
                    canvas.drawCircle(L7, f58, (N4 - org.telegram.messenger.i0.L(1.0f)) + 1.0f, paint15);
                    canvas.drawCircle(f49, f58, N4, paint14);
                    canvas.drawCircle(f49, f58, (N4 - org.telegram.messenger.i0.L(1.0f)) + 1.0f, paint15);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f59 = L7 + min8;
                    float f60 = f50 - min8;
                    canvas.drawLine(L7, f59, L7, f60, paint13);
                    canvas.drawLine(f49, f59, f49, f60, paint13);
                    Paint paint16 = this.f10291r;
                    canvas.drawCircle(f49, f58, (org.telegram.messenger.i0.L(1.0f) + N4) - 1.0f, paint16);
                    canvas.drawCircle(L7, f58, (N4 + org.telegram.messenger.i0.L(1.0f)) - 1.0f, paint16);
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
                    float N5 = org.telegram.messenger.i0.N(5.66f);
                    float L9 = org.telegram.messenger.i0.L(2.0f) + N5 + org.telegram.messenger.i0.L(15.0f);
                    float f61 = L9 * 2.0f;
                    float measuredWidth5 = getMeasuredWidth() - f61;
                    float measuredHeight5 = getMeasuredHeight() - f61;
                    RectF rectF5 = org.telegram.messenger.i0.P;
                    float f62 = L9 + measuredWidth5;
                    float f63 = L9 + measuredHeight5;
                    rectF5.set(L9, L9, f62, f63);
                    float L10 = org.telegram.messenger.i0.L(12.0f);
                    float min9 = Math.min(L10, measuredWidth5 / 2.0f);
                    float f64 = measuredHeight5 / 2.0f;
                    float min10 = Math.min(L10, f64);
                    Path path5 = this.f10292s;
                    path5.rewind();
                    float f65 = min9 * 2.0f;
                    float f66 = L9 + f65;
                    float f67 = 2.0f * min10;
                    float f68 = L9 + f67;
                    rectF5.set(L9, L9, f66, f68);
                    path5.arcTo(rectF5, 180.0f, 90.0f);
                    float f69 = f62 - f65;
                    rectF5.set(f69, L9, f62, f68);
                    path5.arcTo(rectF5, 270.0f, 90.0f);
                    Paint paint17 = this.f10011a;
                    canvas.drawPath(path5, paint17);
                    path5.rewind();
                    float f70 = f63 - f67;
                    rectF5.set(L9, f70, f66, f63);
                    path5.arcTo(rectF5, 180.0f, -90.0f);
                    rectF5.set(f69, f70, f62, f63);
                    path5.arcTo(rectF5, 90.0f, -90.0f);
                    canvas.drawPath(path5, paint17);
                    float f71 = L9 + f64;
                    Paint paint18 = this.f10013c;
                    canvas.drawCircle(L9, f71, N5, paint18);
                    Paint paint19 = this.f10012b;
                    canvas.drawCircle(L9, f71, (N5 - org.telegram.messenger.i0.L(1.0f)) + 1.0f, paint19);
                    canvas.drawCircle(f62, f71, N5, paint18);
                    canvas.drawCircle(f62, f71, (N5 - org.telegram.messenger.i0.L(1.0f)) + 1.0f, paint19);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f72 = L9 + min10;
                    float f73 = f63 - min10;
                    canvas.drawLine(L9, f72, L9, f73, paint17);
                    canvas.drawLine(f62, f72, f62, f73, paint17);
                    Paint paint20 = this.f10291r;
                    canvas.drawCircle(f62, f71, (org.telegram.messenger.i0.L(1.0f) + N5) - 1.0f, paint20);
                    canvas.drawCircle(L9, f71, (N5 + org.telegram.messenger.i0.L(1.0f)) - 1.0f, paint20);
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
                        int i10 = (int) (showAlpha6 * 255.0f);
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), i10, 31);
                    } else {
                        canvas2 = canvas;
                    }
                    float N6 = org.telegram.messenger.i0.N(5.66f);
                    float L11 = org.telegram.messenger.i0.L(2.0f) + N6 + org.telegram.messenger.i0.L(15.0f);
                    float f74 = L11 * 2.0f;
                    float measuredWidth6 = getMeasuredWidth() - f74;
                    float measuredHeight6 = getMeasuredHeight() - f74;
                    RectF rectF6 = org.telegram.messenger.i0.P;
                    float f75 = L11 + measuredWidth6;
                    float f76 = L11 + measuredHeight6;
                    rectF6.set(L11, L11, f75, f76);
                    float L12 = org.telegram.messenger.i0.L(12.0f);
                    float min11 = Math.min(L12, measuredWidth6 / 2.0f);
                    float f77 = measuredHeight6 / 2.0f;
                    float min12 = Math.min(L12, f77);
                    Path path6 = this.f10292s;
                    path6.rewind();
                    float f78 = min11 * 2.0f;
                    float f79 = L11 + f78;
                    float f80 = 2.0f * min12;
                    float f81 = L11 + f80;
                    rectF6.set(L11, L11, f79, f81);
                    path6.arcTo(rectF6, 180.0f, 90.0f);
                    float f82 = f75 - f78;
                    rectF6.set(f82, L11, f75, f81);
                    path6.arcTo(rectF6, 270.0f, 90.0f);
                    Paint paint21 = this.f10011a;
                    canvas2.drawPath(path6, paint21);
                    path6.rewind();
                    float f83 = f76 - f80;
                    rectF6.set(L11, f83, f79, f76);
                    path6.arcTo(rectF6, 180.0f, -90.0f);
                    rectF6.set(f82, f83, f75, f76);
                    path6.arcTo(rectF6, 90.0f, -90.0f);
                    canvas2.drawPath(path6, paint21);
                    float f84 = L11 + f77;
                    Paint paint22 = this.f10013c;
                    canvas2.drawCircle(L11, f84, N6, paint22);
                    Paint paint23 = this.f10012b;
                    canvas2.drawCircle(L11, f84, (N6 - org.telegram.messenger.i0.L(1.0f)) + 1.0f, paint23);
                    canvas2.drawCircle(f75, f84, N6, paint22);
                    canvas2.drawCircle(f75, f84, (N6 - org.telegram.messenger.i0.L(1.0f)) + 1.0f, paint23);
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f85 = L11 + min12;
                    float f86 = f76 - min12;
                    canvas.drawLine(L11, f85, L11, f86, paint21);
                    canvas.drawLine(f75, f85, f75, f86, paint21);
                    Paint paint24 = this.f10291r;
                    canvas.drawCircle(f75, f84, (org.telegram.messenger.i0.L(1.0f) + N6) - 1.0f, paint24);
                    canvas.drawCircle(L11, f84, (N6 + org.telegram.messenger.i0.L(1.0f)) - 1.0f, paint24);
                    canvas.restoreToCount(saveCount6);
                    return;
                }
                return;
        }
    }

    public u0(h3 h3Var, Context context) {
        super(h3Var, context);
        Paint paint = new Paint(1);
        this.f10291r = paint;
        this.f10292s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public u0(z0 z0Var, Context context) {
        super(z0Var, context);
        Paint paint = new Paint(1);
        this.f10291r = paint;
        this.f10292s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public u0(g3 g3Var, Context context) {
        super(g3Var, context);
        Paint paint = new Paint(1);
        this.f10291r = paint;
        this.f10292s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public u0(e2 e2Var, Context context) {
        super(e2Var, context);
        Paint paint = new Paint(1);
        this.f10291r = paint;
        this.f10292s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public u0(j1 j1Var, Context context) {
        super(j1Var, context);
        Paint paint = new Paint(1);
        this.f10291r = paint;
        this.f10292s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}
