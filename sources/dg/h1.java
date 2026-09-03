package dg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
public final class h1 extends i {
    public final int f4559n = 2;
    public final Paint f4560r;
    public final Path f4561s;

    public h1(i1 i1Var, Context context) {
        super(i1Var, context);
        Paint paint = new Paint(1);
        this.f4560r = paint;
        this.f4561s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override
    public final int a(float f10, float f11) {
        switch (this.f4559n) {
            case 0:
                float dp = AndroidUtilities.dp(19.5f);
                float dp2 = AndroidUtilities.dp(1.0f) + dp;
                float f12 = dp2 * 2.0f;
                float measuredWidth = getMeasuredWidth() - f12;
                float x10 = e2.c.x(getMeasuredHeight(), f12, 2.0f, dp2);
                if (f10 > dp2 - dp && f11 > x10 - dp && f10 < dp2 + dp && f11 < x10 + dp) {
                    return 1;
                }
                float f13 = dp2 + measuredWidth;
                if (f10 > f13 - dp && f11 > x10 - dp && f10 < f13 + dp && f11 < x10 + dp) {
                    return 2;
                }
                return 0;
            case 1:
                float dp3 = AndroidUtilities.dp(19.5f);
                float dp4 = AndroidUtilities.dp(1.0f) + dp3;
                float f14 = dp4 * 2.0f;
                float measuredWidth2 = getMeasuredWidth() - f14;
                float x11 = e2.c.x(getMeasuredHeight(), f14, 2.0f, dp4);
                if (f10 > dp4 - dp3 && f11 > x11 - dp3 && f10 < dp4 + dp3 && f11 < x11 + dp3) {
                    return 1;
                }
                float f15 = dp4 + measuredWidth2;
                if (f10 > f15 - dp3 && f11 > x11 - dp3 && f10 < f15 + dp3 && f11 < x11 + dp3) {
                    return 2;
                }
                return 0;
            case 2:
                float dp5 = AndroidUtilities.dp(19.5f);
                float dp6 = AndroidUtilities.dp(1.0f) + dp5;
                float f16 = dp6 * 2.0f;
                float measuredWidth3 = getMeasuredWidth() - f16;
                float measuredHeight = getMeasuredHeight() - f16;
                float f17 = (measuredHeight / 2.0f) + dp6;
                if (f10 > dp6 - dp5 && f11 > f17 - dp5 && f10 < dp6 + dp5 && f11 < f17 + dp5) {
                    return 1;
                }
                float f18 = dp6 + measuredWidth3;
                if (f10 > f18 - dp5 && f11 > f17 - dp5 && f10 < f18 + dp5 && f11 < f17 + dp5) {
                    return 2;
                }
                if (f10 > dp6 && f10 < measuredWidth3 && f11 > dp6 && f11 < measuredHeight) {
                    return 3;
                }
                return 0;
            case 3:
                float dp7 = AndroidUtilities.dp(19.5f);
                float dp8 = AndroidUtilities.dp(1.0f) + dp7;
                float f19 = dp8 * 2.0f;
                float measuredWidth4 = getMeasuredWidth() - f19;
                float measuredHeight2 = getMeasuredHeight() - f19;
                float f20 = (measuredHeight2 / 2.0f) + dp8;
                if (f10 > dp8 - dp7 && f11 > f20 - dp7 && f10 < dp8 + dp7 && f11 < f20 + dp7) {
                    return 1;
                }
                float f21 = dp8 + measuredWidth4;
                if (f10 > f21 - dp7 && f11 > f20 - dp7 && f10 < f21 + dp7 && f11 < f20 + dp7) {
                    return 2;
                }
                if (f10 > dp8 && f10 < measuredWidth4 && f11 > dp8 && f11 < measuredHeight2) {
                    return 3;
                }
                return 0;
            case 4:
                float dp9 = AndroidUtilities.dp(19.5f);
                float dp10 = AndroidUtilities.dp(1.0f) + dp9;
                float f22 = dp10 * 2.0f;
                float measuredWidth5 = getMeasuredWidth() - f22;
                float x12 = e2.c.x(getMeasuredHeight(), f22, 2.0f, dp10);
                if (f10 > dp10 - dp9 && f11 > x12 - dp9 && f10 < dp10 + dp9 && f11 < x12 + dp9) {
                    return 1;
                }
                float f23 = dp10 + measuredWidth5;
                if (f10 > f23 - dp9 && f11 > x12 - dp9 && f10 < f23 + dp9 && f11 < x12 + dp9) {
                    return 2;
                }
                return 0;
            default:
                float dp11 = AndroidUtilities.dp(19.5f);
                float dp12 = AndroidUtilities.dp(1.0f) + dp11;
                float f24 = dp12 * 2.0f;
                float measuredWidth6 = getMeasuredWidth() - f24;
                float x13 = e2.c.x(getMeasuredHeight(), f24, 2.0f, dp12);
                if (f10 > dp12 - dp11 && f11 > x13 - dp11 && f10 < dp12 + dp11 && f11 < x13 + dp11) {
                    return 1;
                }
                float f25 = dp12 + measuredWidth6;
                if (f10 > f25 - dp11 && f11 > x13 - dp11 && f10 < f25 + dp11 && f11 < x13 + dp11) {
                    return 2;
                }
                return 0;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f4559n) {
            case 0:
                super.onDraw(canvas);
                int saveCount = canvas.getSaveCount();
                float showAlpha = getShowAlpha();
                if (showAlpha > 0.0f) {
                    if (showAlpha < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha * 255.0f), 31);
                    }
                    float dpf2 = AndroidUtilities.dpf2(5.66f);
                    float dp = AndroidUtilities.dp(2.0f) + dpf2 + AndroidUtilities.dp(15.0f);
                    float f10 = dp * 2.0f;
                    float measuredWidth = getMeasuredWidth() - f10;
                    float measuredHeight = getMeasuredHeight() - f10;
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f11 = dp + measuredWidth;
                    float f12 = dp + measuredHeight;
                    rectF.set(dp, dp, f11, f12);
                    float dp2 = AndroidUtilities.dp(12.0f);
                    float min = Math.min(dp2, measuredWidth / 2.0f);
                    float f13 = measuredHeight / 2.0f;
                    float min2 = Math.min(dp2, f13);
                    Path path = this.f4561s;
                    path.rewind();
                    float f14 = min * 2.0f;
                    float f15 = dp + f14;
                    float f16 = 2.0f * min2;
                    float f17 = dp + f16;
                    rectF.set(dp, dp, f15, f17);
                    path.arcTo(rectF, 180.0f, 90.0f);
                    float f18 = f11 - f14;
                    rectF.set(f18, dp, f11, f17);
                    path.arcTo(rectF, 270.0f, 90.0f);
                    Paint paint = this.f4569a;
                    canvas.drawPath(path, paint);
                    path.rewind();
                    float f19 = f12 - f16;
                    rectF.set(dp, f19, f15, f12);
                    path.arcTo(rectF, 180.0f, -90.0f);
                    rectF.set(f18, f19, f11, f12);
                    path.arcTo(rectF, 90.0f, -90.0f);
                    canvas.drawPath(path, paint);
                    float f20 = dp + f13;
                    Paint paint2 = this.f4571c;
                    canvas.drawCircle(dp, f20, dpf2, paint2);
                    Paint paint3 = this.f4570b;
                    canvas.drawCircle(dp, f20, (dpf2 - AndroidUtilities.dp(1.0f)) + 1.0f, paint3);
                    canvas.drawCircle(f11, f20, dpf2, paint2);
                    canvas.drawCircle(f11, f20, (dpf2 - AndroidUtilities.dp(1.0f)) + 1.0f, paint3);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f21 = dp + min2;
                    float f22 = f12 - min2;
                    canvas.drawLine(dp, f21, dp, f22, paint);
                    canvas.drawLine(f11, f21, f11, f22, paint);
                    Paint paint4 = this.f4560r;
                    canvas.drawCircle(f11, f20, (AndroidUtilities.dp(1.0f) + dpf2) - 1.0f, paint4);
                    canvas.drawCircle(dp, f20, (dpf2 + AndroidUtilities.dp(1.0f)) - 1.0f, paint4);
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
                    float dpf22 = AndroidUtilities.dpf2(5.66f);
                    float dp3 = AndroidUtilities.dp(2.0f) + dpf22 + AndroidUtilities.dp(15.0f);
                    float f23 = dp3 * 2.0f;
                    float measuredWidth2 = getMeasuredWidth() - f23;
                    float measuredHeight2 = getMeasuredHeight() - f23;
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f24 = dp3 + measuredWidth2;
                    float f25 = dp3 + measuredHeight2;
                    rectF2.set(dp3, dp3, f24, f25);
                    float dp4 = AndroidUtilities.dp(12.0f);
                    float min3 = Math.min(dp4, measuredWidth2 / 2.0f);
                    float f26 = measuredHeight2 / 2.0f;
                    float min4 = Math.min(dp4, f26);
                    Path path2 = this.f4561s;
                    path2.rewind();
                    float f27 = min3 * 2.0f;
                    float f28 = dp3 + f27;
                    float f29 = 2.0f * min4;
                    float f30 = dp3 + f29;
                    rectF2.set(dp3, dp3, f28, f30);
                    path2.arcTo(rectF2, 180.0f, 90.0f);
                    float f31 = f24 - f27;
                    rectF2.set(f31, dp3, f24, f30);
                    path2.arcTo(rectF2, 270.0f, 90.0f);
                    Paint paint5 = this.f4569a;
                    canvas.drawPath(path2, paint5);
                    path2.rewind();
                    float f32 = f25 - f29;
                    rectF2.set(dp3, f32, f28, f25);
                    path2.arcTo(rectF2, 180.0f, -90.0f);
                    rectF2.set(f31, f32, f24, f25);
                    path2.arcTo(rectF2, 90.0f, -90.0f);
                    canvas.drawPath(path2, paint5);
                    float f33 = dp3 + f26;
                    Paint paint6 = this.f4571c;
                    canvas.drawCircle(dp3, f33, dpf22, paint6);
                    Paint paint7 = this.f4570b;
                    canvas.drawCircle(dp3, f33, (dpf22 - AndroidUtilities.dp(1.0f)) + 1.0f, paint7);
                    canvas.drawCircle(f24, f33, dpf22, paint6);
                    canvas.drawCircle(f24, f33, (dpf22 - AndroidUtilities.dp(1.0f)) + 1.0f, paint7);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f34 = dp3 + min4;
                    float f35 = f25 - min4;
                    canvas.drawLine(dp3, f34, dp3, f35, paint5);
                    canvas.drawLine(f24, f34, f24, f35, paint5);
                    Paint paint8 = this.f4560r;
                    canvas.drawCircle(f24, f33, (AndroidUtilities.dp(1.0f) + dpf22) - 1.0f, paint8);
                    canvas.drawCircle(dp3, f33, (dpf22 + AndroidUtilities.dp(1.0f)) - 1.0f, paint8);
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
                    float dpf23 = AndroidUtilities.dpf2(5.66f);
                    float dp5 = AndroidUtilities.dp(2.0f) + dpf23 + AndroidUtilities.dp(15.0f);
                    float f36 = dp5 * 2.0f;
                    float measuredWidth3 = getMeasuredWidth() - f36;
                    float measuredHeight3 = getMeasuredHeight() - f36;
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f37 = dp5 + measuredWidth3;
                    float f38 = dp5 + measuredHeight3;
                    rectF3.set(dp5, dp5, f37, f38);
                    float dp6 = AndroidUtilities.dp(12.0f);
                    float min5 = Math.min(dp6, measuredWidth3 / 2.0f);
                    float f39 = measuredHeight3 / 2.0f;
                    float min6 = Math.min(dp6, f39);
                    Path path3 = this.f4561s;
                    path3.rewind();
                    float f40 = min5 * 2.0f;
                    float f41 = dp5 + f40;
                    float f42 = 2.0f * min6;
                    float f43 = dp5 + f42;
                    rectF3.set(dp5, dp5, f41, f43);
                    path3.arcTo(rectF3, 180.0f, 90.0f);
                    float f44 = f37 - f40;
                    rectF3.set(f44, dp5, f37, f43);
                    path3.arcTo(rectF3, 270.0f, 90.0f);
                    Paint paint9 = this.f4569a;
                    canvas.drawPath(path3, paint9);
                    path3.rewind();
                    float f45 = f38 - f42;
                    rectF3.set(dp5, f45, f41, f38);
                    path3.arcTo(rectF3, 180.0f, -90.0f);
                    rectF3.set(f44, f45, f37, f38);
                    path3.arcTo(rectF3, 90.0f, -90.0f);
                    canvas.drawPath(path3, paint9);
                    float f46 = dp5 + f39;
                    Paint paint10 = this.f4571c;
                    canvas.drawCircle(dp5, f46, dpf23, paint10);
                    Paint paint11 = this.f4570b;
                    canvas.drawCircle(dp5, f46, (dpf23 - AndroidUtilities.dp(1.0f)) + 1.0f, paint11);
                    canvas.drawCircle(f37, f46, dpf23, paint10);
                    canvas.drawCircle(f37, f46, (dpf23 - AndroidUtilities.dp(1.0f)) + 1.0f, paint11);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f47 = dp5 + min6;
                    float f48 = f38 - min6;
                    canvas.drawLine(dp5, f47, dp5, f48, paint9);
                    canvas.drawLine(f37, f47, f37, f48, paint9);
                    Paint paint12 = this.f4560r;
                    canvas.drawCircle(f37, f46, (AndroidUtilities.dp(1.0f) + dpf23) - 1.0f, paint12);
                    canvas.drawCircle(dp5, f46, (dpf23 + AndroidUtilities.dp(1.0f)) - 1.0f, paint12);
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
                    float dpf24 = AndroidUtilities.dpf2(5.66f);
                    float dp7 = AndroidUtilities.dp(2.0f) + dpf24 + AndroidUtilities.dp(15.0f);
                    float f49 = dp7 * 2.0f;
                    float measuredWidth4 = getMeasuredWidth() - f49;
                    float measuredHeight4 = getMeasuredHeight() - f49;
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float f50 = dp7 + measuredWidth4;
                    float f51 = dp7 + measuredHeight4;
                    rectF4.set(dp7, dp7, f50, f51);
                    float dp8 = AndroidUtilities.dp(12.0f);
                    float min7 = Math.min(dp8, measuredWidth4 / 2.0f);
                    float f52 = measuredHeight4 / 2.0f;
                    float min8 = Math.min(dp8, f52);
                    Path path4 = this.f4561s;
                    path4.rewind();
                    float f53 = min7 * 2.0f;
                    float f54 = dp7 + f53;
                    float f55 = 2.0f * min8;
                    float f56 = dp7 + f55;
                    rectF4.set(dp7, dp7, f54, f56);
                    path4.arcTo(rectF4, 180.0f, 90.0f);
                    float f57 = f50 - f53;
                    rectF4.set(f57, dp7, f50, f56);
                    path4.arcTo(rectF4, 270.0f, 90.0f);
                    Paint paint13 = this.f4569a;
                    canvas.drawPath(path4, paint13);
                    path4.rewind();
                    float f58 = f51 - f55;
                    rectF4.set(dp7, f58, f54, f51);
                    path4.arcTo(rectF4, 180.0f, -90.0f);
                    rectF4.set(f57, f58, f50, f51);
                    path4.arcTo(rectF4, 90.0f, -90.0f);
                    canvas.drawPath(path4, paint13);
                    float f59 = dp7 + f52;
                    Paint paint14 = this.f4571c;
                    canvas.drawCircle(dp7, f59, dpf24, paint14);
                    Paint paint15 = this.f4570b;
                    canvas.drawCircle(dp7, f59, (dpf24 - AndroidUtilities.dp(1.0f)) + 1.0f, paint15);
                    canvas.drawCircle(f50, f59, dpf24, paint14);
                    canvas.drawCircle(f50, f59, (dpf24 - AndroidUtilities.dp(1.0f)) + 1.0f, paint15);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f60 = dp7 + min8;
                    float f61 = f51 - min8;
                    canvas.drawLine(dp7, f60, dp7, f61, paint13);
                    canvas.drawLine(f50, f60, f50, f61, paint13);
                    Paint paint16 = this.f4560r;
                    canvas.drawCircle(f50, f59, (AndroidUtilities.dp(1.0f) + dpf24) - 1.0f, paint16);
                    canvas.drawCircle(dp7, f59, (dpf24 + AndroidUtilities.dp(1.0f)) - 1.0f, paint16);
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
                    float dpf25 = AndroidUtilities.dpf2(5.66f);
                    float dp9 = AndroidUtilities.dp(2.0f) + dpf25 + AndroidUtilities.dp(15.0f);
                    float f62 = dp9 * 2.0f;
                    float measuredWidth5 = getMeasuredWidth() - f62;
                    float measuredHeight5 = getMeasuredHeight() - f62;
                    RectF rectF5 = AndroidUtilities.rectTmp;
                    float f63 = dp9 + measuredWidth5;
                    float f64 = dp9 + measuredHeight5;
                    rectF5.set(dp9, dp9, f63, f64);
                    float dp10 = AndroidUtilities.dp(12.0f);
                    float min9 = Math.min(dp10, measuredWidth5 / 2.0f);
                    float f65 = measuredHeight5 / 2.0f;
                    float min10 = Math.min(dp10, f65);
                    Path path5 = this.f4561s;
                    path5.rewind();
                    float f66 = min9 * 2.0f;
                    float f67 = dp9 + f66;
                    float f68 = 2.0f * min10;
                    float f69 = dp9 + f68;
                    rectF5.set(dp9, dp9, f67, f69);
                    path5.arcTo(rectF5, 180.0f, 90.0f);
                    float f70 = f63 - f66;
                    rectF5.set(f70, dp9, f63, f69);
                    path5.arcTo(rectF5, 270.0f, 90.0f);
                    Paint paint17 = this.f4569a;
                    canvas.drawPath(path5, paint17);
                    path5.rewind();
                    float f71 = f64 - f68;
                    rectF5.set(dp9, f71, f67, f64);
                    path5.arcTo(rectF5, 180.0f, -90.0f);
                    rectF5.set(f70, f71, f63, f64);
                    path5.arcTo(rectF5, 90.0f, -90.0f);
                    canvas.drawPath(path5, paint17);
                    float f72 = dp9 + f65;
                    Paint paint18 = this.f4571c;
                    canvas.drawCircle(dp9, f72, dpf25, paint18);
                    Paint paint19 = this.f4570b;
                    canvas.drawCircle(dp9, f72, (dpf25 - AndroidUtilities.dp(1.0f)) + 1.0f, paint19);
                    canvas.drawCircle(f63, f72, dpf25, paint18);
                    canvas.drawCircle(f63, f72, (dpf25 - AndroidUtilities.dp(1.0f)) + 1.0f, paint19);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f73 = dp9 + min10;
                    float f74 = f64 - min10;
                    canvas.drawLine(dp9, f73, dp9, f74, paint17);
                    canvas.drawLine(f63, f73, f63, f74, paint17);
                    Paint paint20 = this.f4560r;
                    canvas.drawCircle(f63, f72, (AndroidUtilities.dp(1.0f) + dpf25) - 1.0f, paint20);
                    canvas.drawCircle(dp9, f72, (dpf25 + AndroidUtilities.dp(1.0f)) - 1.0f, paint20);
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
                    float dpf26 = AndroidUtilities.dpf2(5.66f);
                    float dp11 = AndroidUtilities.dp(2.0f) + dpf26 + AndroidUtilities.dp(15.0f);
                    float f75 = dp11 * 2.0f;
                    float measuredWidth6 = getMeasuredWidth() - f75;
                    float measuredHeight6 = getMeasuredHeight() - f75;
                    RectF rectF6 = AndroidUtilities.rectTmp;
                    float f76 = dp11 + measuredWidth6;
                    float f77 = dp11 + measuredHeight6;
                    rectF6.set(dp11, dp11, f76, f77);
                    float dp12 = AndroidUtilities.dp(12.0f);
                    float min11 = Math.min(dp12, measuredWidth6 / 2.0f);
                    float f78 = measuredHeight6 / 2.0f;
                    float min12 = Math.min(dp12, f78);
                    Path path6 = this.f4561s;
                    path6.rewind();
                    float f79 = min11 * 2.0f;
                    float f80 = dp11 + f79;
                    float f81 = 2.0f * min12;
                    float f82 = dp11 + f81;
                    rectF6.set(dp11, dp11, f80, f82);
                    path6.arcTo(rectF6, 180.0f, 90.0f);
                    float f83 = f76 - f79;
                    rectF6.set(f83, dp11, f76, f82);
                    path6.arcTo(rectF6, 270.0f, 90.0f);
                    Paint paint21 = this.f4569a;
                    canvas2.drawPath(path6, paint21);
                    path6.rewind();
                    float f84 = f77 - f81;
                    rectF6.set(dp11, f84, f80, f77);
                    path6.arcTo(rectF6, 180.0f, -90.0f);
                    rectF6.set(f83, f84, f76, f77);
                    path6.arcTo(rectF6, 90.0f, -90.0f);
                    canvas2.drawPath(path6, paint21);
                    float f85 = dp11 + f78;
                    Paint paint22 = this.f4571c;
                    canvas2.drawCircle(dp11, f85, dpf26, paint22);
                    Paint paint23 = this.f4570b;
                    canvas2.drawCircle(dp11, f85, (dpf26 - AndroidUtilities.dp(1.0f)) + 1.0f, paint23);
                    canvas2.drawCircle(f76, f85, dpf26, paint22);
                    canvas2.drawCircle(f76, f85, (dpf26 - AndroidUtilities.dp(1.0f)) + 1.0f, paint23);
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f86 = dp11 + min12;
                    float f87 = f77 - min12;
                    canvas.drawLine(dp11, f86, dp11, f87, paint21);
                    canvas.drawLine(f76, f86, f76, f87, paint21);
                    Paint paint24 = this.f4560r;
                    canvas.drawCircle(f76, f85, (AndroidUtilities.dp(1.0f) + dpf26) - 1.0f, paint24);
                    canvas.drawCircle(dp11, f85, (dpf26 + AndroidUtilities.dp(1.0f)) - 1.0f, paint24);
                    canvas.restoreToCount(saveCount6);
                    return;
                }
                return;
        }
    }

    public h1(c4 c4Var, Context context) {
        super(c4Var, context);
        Paint paint = new Paint(1);
        this.f4560r = paint;
        this.f4561s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public h1(m1 m1Var, Context context) {
        super(m1Var, context);
        Paint paint = new Paint(1);
        this.f4560r = paint;
        this.f4561s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public h1(b4 b4Var, Context context) {
        super(b4Var, context);
        Paint paint = new Paint(1);
        this.f4560r = paint;
        this.f4561s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public h1(v2 v2Var, Context context) {
        super(v2Var, context);
        Paint paint = new Paint(1);
        this.f4560r = paint;
        this.f4561s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public h1(a2 a2Var, Context context) {
        super(a2Var, context);
        Paint paint = new Paint(1);
        this.f4560r = paint;
        this.f4561s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}
