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
public final class xz {
    public cc.c f26559a;
    public final float[] f26560b = new float[8];
    public int f26561c;
    public int d;
    public int f26562e;
    public int f26563f;
    public Drawable f26564g;

    public final Bitmap a(String str, int i7, int i10, HashMap hashMap, Bitmap bitmap, float f10, int i11, int i12) {
        gc.b bVar;
        int i13;
        Bitmap createBitmap;
        boolean z9;
        float f11;
        char c10;
        int i14;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i15;
        float f12;
        float f13;
        int i16;
        int i17;
        Bitmap bitmap2;
        Paint paint;
        if (!str.isEmpty()) {
            if (i7 >= 0 && i10 >= 0) {
                bc.b bVar2 = bc.b.f3158a;
                if (hashMap.containsKey(bVar2)) {
                    bVar = gc.b.valueOf(hashMap.get(bVar2).toString());
                } else {
                    bVar = gc.b.L;
                }
                bc.b bVar3 = bc.b.f3160c;
                if (hashMap.containsKey(bVar3)) {
                    i13 = Integer.parseInt(hashMap.get(bVar3).toString());
                } else {
                    i13 = 4;
                }
                cc.c cVar = (cc.c) ic.b.b(str, bVar, hashMap).f194f;
                this.f26559a = cVar;
                if (cVar != null) {
                    int i18 = cVar.f6048b;
                    int i19 = cVar.f6049c;
                    for (int i20 = 0; i20 < i18 && b(i20, 0); i20++) {
                        this.f26562e++;
                    }
                    int i21 = i13 * 2;
                    int i22 = i18 + i21;
                    int i23 = i21 + i19;
                    int min = Math.min(Math.max(i7, i22) / i22, Math.max(i10, i23) / i23);
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
                    float[] fArr = this.f26560b;
                    gradientDrawable.setCornerRadii(fArr);
                    float f14 = min;
                    int round = Math.round((i24 / 4.65f) / f14);
                    this.f26561c = round;
                    int i26 = 1;
                    if (round % 2 != i18 % 2) {
                        this.f26561c = round + 1;
                    }
                    int i27 = this.f26561c;
                    this.d = (i18 - i27) / 2;
                    int i28 = (i27 * min) - 24;
                    this.f26563f = i28;
                    int i29 = (i25 - i28) / 2;
                    paint2.setColor(i12);
                    float f15 = this.f26562e;
                    float f16 = i25;
                    if (Color.alpha(i11) == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadii(fArr);
                    Path path = new Path();
                    RectF rectF = new RectF();
                    int i30 = 0;
                    while (true) {
                        f11 = f14;
                        c10 = 3;
                        boolean z15 = z9;
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
                        if (z15) {
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
                        if (z15) {
                            canvas.restore();
                        }
                        if (!z15) {
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
                        z9 = z15;
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
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float f27 = (f11 / 2.0f) * f10;
                    int i32 = 16;
                    int i33 = 0;
                    while (i33 < i19) {
                        int i34 = i14;
                        int i35 = 0;
                        while (i35 < i18) {
                            char c11 = c10;
                            if (b(i35, i33)) {
                                Arrays.fill(fArr, f27);
                                if (b(i35, i33 - 1)) {
                                    fArr[1] = 0.0f;
                                    fArr[0] = 0.0f;
                                    fArr[c11] = 0.0f;
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
                                    fArr[c11] = 0.0f;
                                    fArr[2] = 0.0f;
                                    fArr[5] = 0.0f;
                                    fArr[4] = 0.0f;
                                }
                                gradientDrawable3.setColor(i12);
                                gradientDrawable3.setBounds(i34, i32, i34 + min, i32 + min);
                                gradientDrawable3.draw(canvas);
                                z13 = z10;
                                i15 = i19;
                            } else {
                                Arrays.fill(fArr, 0.0f);
                                int i36 = i35 - 1;
                                int i37 = i33 - 1;
                                if (b(i36, i37) && b(i36, i33) && b(i35, i37)) {
                                    z11 = true;
                                    fArr[1] = f27;
                                    fArr[0] = f27;
                                    z12 = true;
                                } else {
                                    z11 = true;
                                    z12 = false;
                                }
                                z13 = z10;
                                int i38 = i35 + 1;
                                if (b(i38, i37) && b(i38, i33) && b(i35, i37)) {
                                    fArr[c11] = f27;
                                    fArr[2] = f27;
                                    z12 = z11;
                                }
                                int i39 = i33 + 1;
                                if (b(i36, i39) && b(i36, i33) && b(i35, i39)) {
                                    fArr[7] = f27;
                                    fArr[6] = f27;
                                    z14 = z11;
                                } else {
                                    z14 = z12;
                                }
                                if (b(i38, i39) && b(i38, i33) && b(i35, i39)) {
                                    fArr[5] = f27;
                                    fArr[4] = f27;
                                    z14 = z11;
                                }
                                if (z14 && !z13) {
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
                            c10 = c11;
                            z10 = z13;
                        }
                        i33++;
                        i32 += min;
                        i14 = 16;
                    }
                    Drawable drawable = this.f26564g;
                    if (drawable != null) {
                        int i42 = i31 + this.f26563f;
                        drawable.setBounds(i31, i31, i42, i42);
                        this.f26564g.draw(canvas);
                    } else {
                        String y22 = g0.y2(null, 2131624170);
                        int i43 = this.f26563f;
                        Bitmap e10 = sz.e(i43, i43, y22);
                        float f28 = i31;
                        canvas.drawBitmap(e10, f28, f28, (Paint) null);
                        e10.recycle();
                    }
                    canvas.setBitmap(null);
                    return bitmap3;
                }
                throw new IllegalStateException();
            }
            throw new IllegalArgumentException("Requested dimensions are too small: " + i7 + 'x' + i10);
        }
        throw new IllegalArgumentException("Found empty contents");
    }

    public final boolean b(int i7, int i10) {
        int i11 = this.d;
        if (i7 >= i11) {
            int i12 = this.f26561c;
            if (i7 < i11 + i12 && i10 >= i11 && i10 < i11 + i12) {
                return false;
            }
        }
        int i13 = this.f26562e;
        if ((i7 < i13 || i7 >= this.f26559a.f6048b - i13) && i10 < i13) {
            return false;
        }
        if ((i7 >= i13 || i10 < this.f26559a.f6049c - i13) && i7 >= 0 && i10 >= 0) {
            cc.c cVar = this.f26559a;
            if (i7 < cVar.f6048b && i10 < cVar.f6049c && cVar.e(i7, i10) == 1) {
                return true;
            }
        }
        return false;
    }
}
