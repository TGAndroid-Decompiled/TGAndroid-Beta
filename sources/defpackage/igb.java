package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import java.util.Arrays;
import java.util.HashMap;
public final class igb {
    public int a;
    public int b;
    public float[] c;
    public int d;
    public int e;
    public Object f;
    public Object g;

    public igb(byte b) {
        switch (b) {
            case 1:
                this.a = -1;
                this.b = 1;
                this.f = new float[126];
                this.g = new byte[4096];
                return;
            default:
                this.c = new float[8];
                return;
        }
    }

    public final Bitmap a(String str, int i, int i2, HashMap hashMap, Bitmap bitmap, float f, int i3, int i4) {
        w34 w34Var;
        int i5;
        Bitmap createBitmap;
        boolean z;
        char c;
        boolean z2;
        Bitmap bitmap2;
        char c2;
        boolean z3;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        float f2;
        int i8;
        float f3;
        int i9;
        float f4;
        Bitmap bitmap3;
        Paint paint;
        int i10 = i4;
        float[] fArr = this.c;
        if (!str.isEmpty()) {
            if (i >= 0 && i2 >= 0) {
                n24 n24Var = n24.a;
                if (hashMap.containsKey(n24Var)) {
                    w34Var = w34.valueOf(hashMap.get(n24Var).toString());
                } else {
                    w34Var = w34.L;
                }
                n24 n24Var2 = n24.c;
                if (hashMap.containsKey(n24Var2)) {
                    i5 = Integer.parseInt(hashMap.get(n24Var2).toString());
                } else {
                    i5 = 4;
                }
                rj0 rj0Var = (rj0) p24.b(str, w34Var, hashMap).f;
                this.f = rj0Var;
                if (rj0Var != null) {
                    int i11 = rj0Var.b;
                    int i12 = rj0Var.c;
                    for (int i13 = 0; i13 < i11 && b(i13, 0); i13++) {
                        this.d++;
                    }
                    int i14 = i5 << 1;
                    int i15 = i11 + i14;
                    int i16 = i14 + i12;
                    int min = Math.min(Math.max(i, i15) / i15, Math.max(i2, i16) / i16);
                    int i17 = min * i11;
                    int i18 = i17 + 32;
                    if (bitmap != null && bitmap.getWidth() == i18) {
                        createBitmap = bitmap;
                    } else {
                        createBitmap = Bitmap.createBitmap(i18, i18, Bitmap.Config.ARGB_8888);
                    }
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(i3);
                    Paint paint2 = new Paint(1);
                    paint2.setColor(i10);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadii(fArr);
                    float f5 = min;
                    int round = Math.round((i17 / 4.65f) / f5);
                    this.a = round;
                    if (round % 2 != i11 % 2) {
                        round++;
                        this.a = round;
                    }
                    this.b = (i11 - round) / 2;
                    int i19 = (round * min) - 24;
                    this.e = i19;
                    int i20 = (i18 - i19) / 2;
                    paint2.setColor(i10);
                    float f6 = this.d;
                    float f7 = i18;
                    if (Color.alpha(i3) == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadii(fArr);
                    Path path = new Path();
                    RectF rectF = new RectF();
                    int i21 = 0;
                    while (true) {
                        float f8 = f7;
                        c = 3;
                        if (i21 >= 3) {
                            break;
                        }
                        if (i21 == 0) {
                            i8 = i21;
                            f3 = 16.0f;
                            f2 = 16.0f;
                        } else if (i21 == 1) {
                            f2 = (f8 - (f6 * f5)) - 16.0f;
                            int i22 = i21;
                            f3 = 16.0f;
                            i8 = i22;
                        } else {
                            f2 = 16.0f;
                            i8 = i21;
                            f3 = (f8 - (f6 * f5)) - 16.0f;
                        }
                        if (z) {
                            f4 = f6;
                            bitmap3 = createBitmap;
                            float f9 = (f4 - 1.0f) * f5;
                            paint = paint2;
                            i9 = i20;
                            rectF.set(f2 + f5, f3 + f5, f2 + f9, f3 + f9);
                            float f10 = ((f4 * f5) / 4.0f) * f;
                            path.reset();
                            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                            path.close();
                            canvas.save();
                            canvas.clipPath(path, Region.Op.DIFFERENCE);
                        } else {
                            i9 = i20;
                            f4 = f6;
                            bitmap3 = createBitmap;
                            paint = paint2;
                        }
                        float f11 = f4 * f5;
                        Arrays.fill(fArr, (f11 / 3.0f) * f);
                        gradientDrawable.setColor(i10);
                        RectF rectF2 = rectF;
                        gradientDrawable.setBounds((int) f2, (int) f3, (int) (f2 + f11), (int) (f3 + f11));
                        gradientDrawable.draw(canvas);
                        float f12 = f2 + f5;
                        float f13 = f3 + f5;
                        float f14 = (f4 - 1.0f) * f5;
                        float f15 = f2 + f14;
                        float f16 = f3 + f14;
                        canvas.drawRect(f12, f13, f15, f16, paint);
                        if (z) {
                            canvas.restore();
                        } else {
                            Arrays.fill(fArr, (f11 / 4.0f) * f);
                            gradientDrawable.setColor(i3);
                            gradientDrawable.setBounds((int) f12, (int) f13, (int) f15, (int) f16);
                            gradientDrawable.draw(canvas);
                        }
                        float f17 = (f4 - 2.0f) * f5;
                        Arrays.fill(fArr, (f17 / 4.0f) * f);
                        gradientDrawable.setColor(i10);
                        float f18 = f5 * 2.0f;
                        gradientDrawable.setBounds((int) (f2 + f18), (int) (f18 + f3), (int) (f2 + f17), (int) (f3 + f17));
                        gradientDrawable.draw(canvas);
                        i21 = i8 + 1;
                        f7 = f8;
                        f6 = f4;
                        rectF = rectF2;
                        paint2 = paint;
                        createBitmap = bitmap3;
                        i20 = i9;
                    }
                    int i23 = i20;
                    Bitmap bitmap4 = createBitmap;
                    Paint paint3 = paint2;
                    if (Color.alpha(i3) == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    float f19 = (f5 / 2.0f) * f;
                    int i24 = 0;
                    int i25 = 16;
                    while (i24 < i12) {
                        int i26 = 0;
                        int i27 = 16;
                        while (i26 < i11) {
                            if (b(i26, i24)) {
                                Arrays.fill(fArr, f19);
                                c2 = c;
                                if (b(i26, i24 - 1)) {
                                    fArr[1] = 0.0f;
                                    fArr[0] = 0.0f;
                                    fArr[c2] = 0.0f;
                                    fArr[2] = 0.0f;
                                }
                                if (b(i26, i24 + 1)) {
                                    fArr[7] = 0.0f;
                                    fArr[6] = 0.0f;
                                    fArr[5] = 0.0f;
                                    fArr[4] = 0.0f;
                                }
                                if (b(i26 - 1, i24)) {
                                    fArr[1] = 0.0f;
                                    fArr[0] = 0.0f;
                                    fArr[7] = 0.0f;
                                    fArr[6] = 0.0f;
                                }
                                if (b(i26 + 1, i24)) {
                                    fArr[c2] = 0.0f;
                                    fArr[2] = 0.0f;
                                    fArr[5] = 0.0f;
                                    fArr[4] = 0.0f;
                                }
                                gradientDrawable.setColor(i10);
                                gradientDrawable.setBounds(i27, i25, i27 + min, i25 + min);
                                gradientDrawable.draw(canvas);
                                i7 = i24;
                                i6 = i12;
                            } else {
                                c2 = c;
                                Arrays.fill(fArr, 0.0f);
                                int i28 = i26 - 1;
                                int i29 = i24 - 1;
                                if (b(i28, i29) && b(i28, i24) && b(i26, i29)) {
                                    z3 = true;
                                    fArr[1] = f19;
                                    fArr[0] = f19;
                                    z4 = true;
                                } else {
                                    z3 = true;
                                    z4 = false;
                                }
                                i6 = i12;
                                int i30 = i26 + 1;
                                if (b(i30, i29) && b(i30, i24) && b(i26, i29)) {
                                    fArr[c2] = f19;
                                    fArr[2] = f19;
                                    z5 = z3;
                                } else {
                                    z5 = z4;
                                }
                                int i31 = i24 + 1;
                                if (b(i28, i31) && b(i28, i24) && b(i26, i31)) {
                                    fArr[7] = f19;
                                    fArr[6] = f19;
                                    z5 = z3;
                                }
                                if (b(i30, i31) && b(i30, i24) && b(i26, i31)) {
                                    fArr[5] = f19;
                                    fArr[4] = f19;
                                    z5 = z3;
                                }
                                if (z5 && !z2) {
                                    int i32 = i27 + min;
                                    int i33 = i25 + min;
                                    i7 = i24;
                                    canvas.drawRect(i27, i25, i32, i33, paint3);
                                    gradientDrawable.setColor(i3);
                                    gradientDrawable.setBounds(i27, i25, i32, i33);
                                    gradientDrawable.draw(canvas);
                                } else {
                                    i7 = i24;
                                }
                            }
                            i26++;
                            i27 += min;
                            i10 = i4;
                            c = c2;
                            i24 = i7;
                            i12 = i6;
                        }
                        i24++;
                        i25 += min;
                        i10 = i4;
                    }
                    ColorDrawable colorDrawable = (ColorDrawable) this.g;
                    if (colorDrawable != null) {
                        int i34 = i23 + this.e;
                        colorDrawable.setBounds(i23, i23, i34, i34);
                        ((ColorDrawable) this.g).draw(canvas);
                        bitmap2 = null;
                    } else {
                        bitmap2 = null;
                        String v2 = gl.v2(null, 2131624171);
                        int i35 = this.e;
                        Bitmap e = lcb.e(i35, i35, v2);
                        float f20 = i23;
                        canvas.drawBitmap(e, f20, f20, (Paint) null);
                        e.recycle();
                    }
                    canvas.setBitmap(bitmap2);
                    return bitmap4;
                }
                sdb.a();
                return null;
            }
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        }
        w26.j("Found empty contents");
        return null;
    }

    public final boolean b(int i, int i2) {
        int i3 = this.b;
        if (i >= i3) {
            int i4 = this.a;
            if (i < i3 + i4 && i2 >= i3 && i2 < i3 + i4) {
                return false;
            }
        }
        int i5 = this.d;
        if ((i < i5 || i >= ((rj0) this.f).b - i5) && i2 < i5) {
            return false;
        }
        if ((i >= i5 || i2 < ((rj0) this.f).c - i5) && i >= 0 && i2 >= 0) {
            rj0 rj0Var = (rj0) this.f;
            if (i < rj0Var.b && i2 < rj0Var.c && rj0Var.e(i, i2) == 1) {
                return true;
            }
        }
        return false;
    }

    public final int c(java.nio.ByteBuffer r25, int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.igb.c(java.nio.ByteBuffer, int, int):int");
    }
}
