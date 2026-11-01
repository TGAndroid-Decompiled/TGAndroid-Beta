package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import java.util.Arrays;
import java.util.HashMap;
public final class j00 {
    public b4.d f16394a;
    public final float[] f16395b = new float[8];
    public int f16396c;
    public int d;
    public int e;
    public int f16397f;
    public Drawable f16398g;

    public final Bitmap a(String str, int i10, int i11, HashMap hashMap, Bitmap bitmap, float f7, int i12, int i13) {
        ac.d dVar;
        int i14;
        Bitmap createBitmap;
        boolean z10;
        float f10;
        char c10;
        int i15;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i16;
        float f11;
        float f12;
        int i17;
        int i18;
        Bitmap bitmap2;
        Paint paint;
        if (!str.isEmpty()) {
            if (i10 >= 0 && i11 >= 0) {
                vb.b bVar = vb.b.f50762a;
                if (hashMap.containsKey(bVar)) {
                    dVar = ac.d.valueOf(hashMap.get(bVar).toString());
                } else {
                    dVar = ac.d.L;
                }
                vb.b bVar2 = vb.b.f50764c;
                if (hashMap.containsKey(bVar2)) {
                    i14 = Integer.parseInt(hashMap.get(bVar2).toString());
                } else {
                    i14 = 4;
                }
                b4.d dVar2 = (b4.d) cc.b.b(str, dVar, hashMap).f4118f;
                this.f16394a = dVar2;
                if (dVar2 != null) {
                    int i19 = dVar2.f2458b;
                    int i20 = dVar2.f2459c;
                    for (int i21 = 0; i21 < i19 && b(i21, 0); i21++) {
                        this.e++;
                    }
                    int i22 = i14 * 2;
                    int i23 = i19 + i22;
                    int i24 = i22 + i20;
                    int min = Math.min(Math.max(i10, i23) / i23, Math.max(i11, i24) / i24);
                    int i25 = min * i19;
                    int i26 = i25 + 32;
                    if (bitmap != null && bitmap.getWidth() == i26) {
                        createBitmap = bitmap;
                    } else {
                        createBitmap = Bitmap.createBitmap(i26, i26, Bitmap.Config.ARGB_8888);
                    }
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(i12);
                    Paint paint2 = new Paint(1);
                    paint2.setColor(i13);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    float[] fArr = this.f16395b;
                    gradientDrawable.setCornerRadii(fArr);
                    float f13 = min;
                    int round = Math.round((i25 / 4.65f) / f13);
                    this.f16396c = round;
                    int i27 = 1;
                    if (round % 2 != i19 % 2) {
                        this.f16396c = round + 1;
                    }
                    int i28 = this.f16396c;
                    this.d = (i19 - i28) / 2;
                    int i29 = (i28 * min) - 24;
                    this.f16397f = i29;
                    int i30 = (i26 - i29) / 2;
                    paint2.setColor(i13);
                    float f14 = this.e;
                    float f15 = i26;
                    if (Color.alpha(i12) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadii(fArr);
                    Path path = new Path();
                    RectF rectF = new RectF();
                    int i31 = 0;
                    while (true) {
                        f10 = f13;
                        c10 = 3;
                        boolean z16 = z10;
                        i15 = 16;
                        if (i31 >= 3) {
                            break;
                        }
                        if (i31 == 0) {
                            f11 = 16;
                            f12 = f11;
                        } else if (i31 == i27) {
                            f12 = 16;
                            f11 = (f15 - (f14 * f10)) - f12;
                        } else {
                            f11 = 16;
                            f12 = (f15 - (f14 * f10)) - f11;
                        }
                        if (z16) {
                            i18 = i31;
                            bitmap2 = createBitmap;
                            float f16 = (f14 - 1.0f) * f10;
                            paint = paint2;
                            i17 = i30;
                            rectF.set(f11 + f10, f12 + f10, f11 + f16, f12 + f16);
                            float f17 = ((f14 * f10) / 4.0f) * f7;
                            path.reset();
                            path.addRoundRect(rectF, f17, f17, Path.Direction.CW);
                            path.close();
                            canvas.save();
                            canvas.clipPath(path, Region.Op.DIFFERENCE);
                        } else {
                            i17 = i30;
                            i18 = i31;
                            bitmap2 = createBitmap;
                            paint = paint2;
                        }
                        float f18 = f14 * f10;
                        Arrays.fill(fArr, (f18 / 3.0f) * f7);
                        gradientDrawable.setColor(i13);
                        Path path2 = path;
                        gradientDrawable.setBounds((int) f11, (int) f12, (int) (f11 + f18), (int) (f12 + f18));
                        gradientDrawable.draw(canvas);
                        float f19 = f11 + f10;
                        GradientDrawable gradientDrawable2 = gradientDrawable;
                        float f20 = f12 + f10;
                        float f21 = (f14 - 1.0f) * f10;
                        float f22 = f11 + f21;
                        float f23 = f12 + f21;
                        canvas.drawRect(f19, f20, f22, f23, paint);
                        if (z16) {
                            canvas.restore();
                        }
                        if (!z16) {
                            Arrays.fill(fArr, (f18 / 4.0f) * f7);
                            gradientDrawable2.setColor(i12);
                            gradientDrawable2.setBounds((int) f19, (int) f20, (int) f22, (int) f23);
                            gradientDrawable2.draw(canvas);
                        }
                        float f24 = (f14 - 2.0f) * f10;
                        Arrays.fill(fArr, (f24 / 4.0f) * f7);
                        gradientDrawable2.setColor(i13);
                        float f25 = f10 * 2.0f;
                        gradientDrawable2.setBounds((int) (f11 + f25), (int) (f25 + f12), (int) (f11 + f24), (int) (f12 + f24));
                        gradientDrawable2.draw(canvas);
                        i31 = i18 + 1;
                        f13 = f10;
                        z10 = z16;
                        gradientDrawable = gradientDrawable2;
                        paint2 = paint;
                        createBitmap = bitmap2;
                        i30 = i17;
                        path = path2;
                        i27 = 1;
                    }
                    int i32 = i30;
                    Bitmap bitmap3 = createBitmap;
                    Paint paint3 = paint2;
                    GradientDrawable gradientDrawable3 = gradientDrawable;
                    if (Color.alpha(i12) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    float f26 = (f10 / 2.0f) * f7;
                    int i33 = 16;
                    int i34 = 0;
                    while (i34 < i20) {
                        int i35 = i15;
                        int i36 = 0;
                        while (i36 < i19) {
                            char c11 = c10;
                            if (b(i36, i34)) {
                                Arrays.fill(fArr, f26);
                                if (b(i36, i34 - 1)) {
                                    fArr[1] = 0.0f;
                                    fArr[0] = 0.0f;
                                    fArr[c11] = 0.0f;
                                    fArr[2] = 0.0f;
                                }
                                if (b(i36, i34 + 1)) {
                                    fArr[7] = 0.0f;
                                    fArr[6] = 0.0f;
                                    fArr[5] = 0.0f;
                                    fArr[4] = 0.0f;
                                }
                                if (b(i36 - 1, i34)) {
                                    fArr[1] = 0.0f;
                                    fArr[0] = 0.0f;
                                    fArr[7] = 0.0f;
                                    fArr[6] = 0.0f;
                                }
                                if (b(i36 + 1, i34)) {
                                    fArr[c11] = 0.0f;
                                    fArr[2] = 0.0f;
                                    fArr[5] = 0.0f;
                                    fArr[4] = 0.0f;
                                }
                                gradientDrawable3.setColor(i13);
                                gradientDrawable3.setBounds(i35, i33, i35 + min, i33 + min);
                                gradientDrawable3.draw(canvas);
                                z14 = z11;
                                i16 = i20;
                            } else {
                                Arrays.fill(fArr, 0.0f);
                                int i37 = i36 - 1;
                                int i38 = i34 - 1;
                                if (b(i37, i38) && b(i37, i34) && b(i36, i38)) {
                                    z12 = true;
                                    fArr[1] = f26;
                                    fArr[0] = f26;
                                    z13 = true;
                                } else {
                                    z12 = true;
                                    z13 = false;
                                }
                                z14 = z11;
                                int i39 = i36 + 1;
                                if (b(i39, i38) && b(i39, i34) && b(i36, i38)) {
                                    fArr[c11] = f26;
                                    fArr[2] = f26;
                                    z13 = z12;
                                }
                                int i40 = i34 + 1;
                                if (b(i37, i40) && b(i37, i34) && b(i36, i40)) {
                                    fArr[7] = f26;
                                    fArr[6] = f26;
                                    z15 = z12;
                                } else {
                                    z15 = z13;
                                }
                                if (b(i39, i40) && b(i39, i34) && b(i36, i40)) {
                                    fArr[5] = f26;
                                    fArr[4] = f26;
                                    z15 = z12;
                                }
                                if (z15 && !z14) {
                                    int i41 = i35 + min;
                                    int i42 = i33 + min;
                                    i16 = i20;
                                    canvas.drawRect(i35, i33, i41, i42, paint3);
                                    gradientDrawable3.setColor(i12);
                                    gradientDrawable3.setBounds(i35, i33, i41, i42);
                                    gradientDrawable3.draw(canvas);
                                } else {
                                    i16 = i20;
                                }
                            }
                            i36++;
                            i35 += min;
                            i20 = i16;
                            c10 = c11;
                            z11 = z14;
                        }
                        i34++;
                        i33 += min;
                        i15 = 16;
                    }
                    Drawable drawable = this.f16398g;
                    if (drawable != null) {
                        int i43 = i32 + this.f16397f;
                        drawable.setBounds(i32, i32, i43, i43);
                        this.f16398g.draw(canvas);
                    } else {
                        String y22 = i0.y2(null, 2131624168);
                        int i44 = this.f16397f;
                        Bitmap e = e00.e(i44, i44, y22);
                        float f27 = i32;
                        canvas.drawBitmap(e, f27, f27, (Paint) null);
                        e.recycle();
                    }
                    canvas.setBitmap(null);
                    return bitmap3;
                }
                throw new IllegalStateException();
            }
            throw new IllegalArgumentException("Requested dimensions are too small: " + i10 + 'x' + i11);
        }
        throw new IllegalArgumentException("Found empty contents");
    }

    public final boolean b(int i10, int i11) {
        int i12 = this.d;
        if (i10 >= i12) {
            int i13 = this.f16396c;
            if (i10 < i12 + i13 && i11 >= i12 && i11 < i12 + i13) {
                return false;
            }
        }
        int i14 = this.e;
        if ((i10 < i14 || i10 >= this.f16394a.f2458b - i14) && i11 < i14) {
            return false;
        }
        if ((i10 >= i14 || i11 < this.f16394a.f2459c - i14) && i10 >= 0 && i11 >= 0) {
            b4.d dVar = this.f16394a;
            if (i10 < dVar.f2458b && i11 < dVar.f2459c && dVar.e(i10, i11) == 1) {
                return true;
            }
        }
        return false;
    }
}
