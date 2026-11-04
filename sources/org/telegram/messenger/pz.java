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
public final class pz {
    public d4.d f24834a;
    public final float[] f24835b = new float[8];
    public int f24836c;
    public int d;
    public int f24837e;
    public int f24838f;
    public Drawable f24839g;

    public final Bitmap a(String str, int i3, int i10, HashMap hashMap, Bitmap bitmap, float f10, int i11, int i12) {
        dc.b bVar;
        int i13;
        Bitmap createBitmap;
        boolean z10;
        float f11;
        char c2;
        int i14;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i15;
        float f12;
        float f13;
        int i16;
        int i17;
        Bitmap bitmap2;
        Paint paint;
        if (!str.isEmpty()) {
            if (i3 >= 0 && i10 >= 0) {
                yb.b bVar2 = yb.b.f59350a;
                if (hashMap.containsKey(bVar2)) {
                    bVar = dc.b.valueOf(hashMap.get(bVar2).toString());
                } else {
                    bVar = dc.b.L;
                }
                yb.b bVar3 = yb.b.f59352c;
                if (hashMap.containsKey(bVar3)) {
                    i13 = Integer.parseInt(hashMap.get(bVar3).toString());
                } else {
                    i13 = 4;
                }
                d4.d dVar = (d4.d) fc.b.b(str, bVar, hashMap).f9228f;
                this.f24834a = dVar;
                if (dVar != null) {
                    int i18 = dVar.f8538b;
                    int i19 = dVar.f8539c;
                    for (int i20 = 0; i20 < i18 && b(i20, 0); i20++) {
                        this.f24837e++;
                    }
                    int i21 = i13 * 2;
                    int i22 = i18 + i21;
                    int i23 = i21 + i19;
                    int min = Math.min(Math.max(i3, i22) / i22, Math.max(i10, i23) / i23);
                    int i24 = min * i18;
                    int i25 = i24 + 32;
                    if (bitmap != null && bitmap.getWidth() == i25) {
                        createBitmap = bitmap;
                    } else {
                        createBitmap = Bitmap.createBitmap(i25, i25, Bitmap.Config.ARGB_8888);
                    }
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(i11);
                    Paint paint2 = new Paint(1);
                    paint2.setColor(i12);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    float[] fArr = this.f24835b;
                    gradientDrawable.setCornerRadii(fArr);
                    float f14 = min;
                    int round = Math.round((i24 / 4.65f) / f14);
                    this.f24836c = round;
                    int i26 = 1;
                    if (round % 2 != i18 % 2) {
                        this.f24836c = round + 1;
                    }
                    int i27 = this.f24836c;
                    this.d = (i18 - i27) / 2;
                    int i28 = (i27 * min) - 24;
                    this.f24838f = i28;
                    int i29 = (i25 - i28) / 2;
                    paint2.setColor(i12);
                    float f15 = this.f24837e;
                    float f16 = i25;
                    if (Color.alpha(i11) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadii(fArr);
                    Path path = new Path();
                    RectF rectF = new RectF();
                    int i30 = 0;
                    while (true) {
                        f11 = f14;
                        c2 = 3;
                        boolean z16 = z10;
                        i14 = 16;
                        if (i30 >= 3) {
                            break;
                        }
                        if (i30 == 0) {
                            f12 = 16;
                            f13 = f12;
                        } else if (i30 == i26) {
                            f13 = 16;
                            f12 = (f16 - (f15 * f11)) - f13;
                        } else {
                            f12 = 16;
                            f13 = (f16 - (f15 * f11)) - f12;
                        }
                        if (z16) {
                            i17 = i30;
                            bitmap2 = createBitmap;
                            float f17 = (f15 - 1.0f) * f11;
                            paint = paint2;
                            i16 = i29;
                            rectF.set(f12 + f11, f13 + f11, f12 + f17, f13 + f17);
                            float f18 = ((f15 * f11) / 4.0f) * f10;
                            path.reset();
                            path.addRoundRect(rectF, f18, f18, Path.Direction.CW);
                            path.close();
                            canvas.save();
                            canvas.clipPath(path, Region.Op.DIFFERENCE);
                        } else {
                            i16 = i29;
                            i17 = i30;
                            bitmap2 = createBitmap;
                            paint = paint2;
                        }
                        float f19 = f15 * f11;
                        Arrays.fill(fArr, (f19 / 3.0f) * f10);
                        gradientDrawable.setColor(i12);
                        Path path2 = path;
                        gradientDrawable.setBounds((int) f12, (int) f13, (int) (f12 + f19), (int) (f13 + f19));
                        gradientDrawable.draw(canvas);
                        float f20 = f12 + f11;
                        GradientDrawable gradientDrawable2 = gradientDrawable;
                        float f21 = f13 + f11;
                        float f22 = (f15 - 1.0f) * f11;
                        float f23 = f12 + f22;
                        float f24 = f13 + f22;
                        canvas.drawRect(f20, f21, f23, f24, paint);
                        if (z16) {
                            canvas.restore();
                        }
                        if (!z16) {
                            Arrays.fill(fArr, (f19 / 4.0f) * f10);
                            gradientDrawable2.setColor(i11);
                            gradientDrawable2.setBounds((int) f20, (int) f21, (int) f23, (int) f24);
                            gradientDrawable2.draw(canvas);
                        }
                        float f25 = (f15 - 2.0f) * f11;
                        Arrays.fill(fArr, (f25 / 4.0f) * f10);
                        gradientDrawable2.setColor(i12);
                        float f26 = f11 * 2.0f;
                        gradientDrawable2.setBounds((int) (f12 + f26), (int) (f26 + f13), (int) (f12 + f25), (int) (f13 + f25));
                        gradientDrawable2.draw(canvas);
                        i30 = i17 + 1;
                        f14 = f11;
                        z10 = z16;
                        gradientDrawable = gradientDrawable2;
                        paint2 = paint;
                        createBitmap = bitmap2;
                        i29 = i16;
                        path = path2;
                        i26 = 1;
                    }
                    int i31 = i29;
                    Bitmap bitmap3 = createBitmap;
                    Paint paint3 = paint2;
                    GradientDrawable gradientDrawable3 = gradientDrawable;
                    if (Color.alpha(i11) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    float f27 = (f11 / 2.0f) * f10;
                    int i32 = 16;
                    int i33 = 0;
                    while (i33 < i19) {
                        int i34 = i14;
                        int i35 = 0;
                        while (i35 < i18) {
                            char c10 = c2;
                            if (b(i35, i33)) {
                                Arrays.fill(fArr, f27);
                                if (b(i35, i33 - 1)) {
                                    fArr[1] = 0.0f;
                                    fArr[0] = 0.0f;
                                    fArr[c10] = 0.0f;
                                    fArr[2] = 0.0f;
                                }
                                if (b(i35, i33 + 1)) {
                                    fArr[7] = 0.0f;
                                    fArr[6] = 0.0f;
                                    fArr[5] = 0.0f;
                                    fArr[4] = 0.0f;
                                }
                                if (b(i35 - 1, i33)) {
                                    fArr[1] = 0.0f;
                                    fArr[0] = 0.0f;
                                    fArr[7] = 0.0f;
                                    fArr[6] = 0.0f;
                                }
                                if (b(i35 + 1, i33)) {
                                    fArr[c10] = 0.0f;
                                    fArr[2] = 0.0f;
                                    fArr[5] = 0.0f;
                                    fArr[4] = 0.0f;
                                }
                                gradientDrawable3.setColor(i12);
                                gradientDrawable3.setBounds(i34, i32, i34 + min, i32 + min);
                                gradientDrawable3.draw(canvas);
                                z14 = z11;
                                i15 = i19;
                            } else {
                                Arrays.fill(fArr, 0.0f);
                                int i36 = i35 - 1;
                                int i37 = i33 - 1;
                                if (b(i36, i37) && b(i36, i33) && b(i35, i37)) {
                                    z12 = true;
                                    fArr[1] = f27;
                                    fArr[0] = f27;
                                    z13 = true;
                                } else {
                                    z12 = true;
                                    z13 = false;
                                }
                                z14 = z11;
                                int i38 = i35 + 1;
                                if (b(i38, i37) && b(i38, i33) && b(i35, i37)) {
                                    fArr[c10] = f27;
                                    fArr[2] = f27;
                                    z13 = z12;
                                }
                                int i39 = i33 + 1;
                                if (b(i36, i39) && b(i36, i33) && b(i35, i39)) {
                                    fArr[7] = f27;
                                    fArr[6] = f27;
                                    z15 = z12;
                                } else {
                                    z15 = z13;
                                }
                                if (b(i38, i39) && b(i38, i33) && b(i35, i39)) {
                                    fArr[5] = f27;
                                    fArr[4] = f27;
                                    z15 = z12;
                                }
                                if (z15 && !z14) {
                                    int i40 = i34 + min;
                                    int i41 = i32 + min;
                                    i15 = i19;
                                    canvas.drawRect(i34, i32, i40, i41, paint3);
                                    gradientDrawable3.setColor(i11);
                                    gradientDrawable3.setBounds(i34, i32, i40, i41);
                                    gradientDrawable3.draw(canvas);
                                } else {
                                    i15 = i19;
                                }
                            }
                            i35++;
                            i34 += min;
                            i19 = i15;
                            c2 = c10;
                            z11 = z14;
                        }
                        i33++;
                        i32 += min;
                        i14 = 16;
                    }
                    Drawable drawable = this.f24839g;
                    if (drawable != null) {
                        int i42 = i31 + this.f24838f;
                        drawable.setBounds(i31, i31, i42, i42);
                        this.f24839g.draw(canvas);
                    } else {
                        String y22 = g0.y2(null, 2131624170);
                        int i43 = this.f24838f;
                        Bitmap e10 = kz.e(i43, i43, y22);
                        float f28 = i31;
                        canvas.drawBitmap(e10, f28, f28, (Paint) null);
                        e10.recycle();
                    }
                    canvas.setBitmap(null);
                    return bitmap3;
                }
                throw new IllegalStateException();
            }
            throw new IllegalArgumentException("Requested dimensions are too small: " + i3 + 'x' + i10);
        }
        throw new IllegalArgumentException("Found empty contents");
    }

    public final boolean b(int i3, int i10) {
        int i11 = this.d;
        if (i3 >= i11) {
            int i12 = this.f24836c;
            if (i3 < i11 + i12 && i10 >= i11 && i10 < i11 + i12) {
                return false;
            }
        }
        int i13 = this.f24837e;
        if ((i3 < i13 || i3 >= this.f24834a.f8538b - i13) && i10 < i13) {
            return false;
        }
        if ((i3 >= i13 || i10 < this.f24834a.f8539c - i13) && i3 >= 0 && i10 >= 0) {
            d4.d dVar = this.f24834a;
            if (i3 < dVar.f8538b && i10 < dVar.f8539c && dVar.e(i3, i10) == 1) {
                return true;
            }
        }
        return false;
    }
}
