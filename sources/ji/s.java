package ji;

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
import org.telegram.messenger.g0;
import org.telegram.messenger.mz;
public final class s {
    public float[] f18080a;
    public int f18081b;
    public int f18082c;
    public int d;
    public int f18083e;
    public Object f18084f;
    public Object f18085g;

    public s(int i7) {
        switch (i7) {
            case 1:
                this.f18080a = new float[8];
                return;
            default:
                this.f18081b = -1;
                this.f18082c = 1;
                this.f18084f = new float[126];
                this.f18085g = new byte[4096];
                return;
        }
    }

    public Bitmap a(String str, int i7, int i10, HashMap hashMap, Bitmap bitmap, float f10, int i11, int i12) {
        gc.b bVar;
        int i13;
        Bitmap createBitmap;
        boolean z10;
        float f11;
        char c10;
        int i14;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        float f12;
        float f13;
        float f14;
        int i15;
        int i16;
        Bitmap bitmap2;
        Paint paint;
        float[] fArr = this.f18080a;
        if (!str.isEmpty()) {
            if (i7 >= 0 && i10 >= 0) {
                bc.b bVar2 = bc.b.f3123a;
                if (hashMap.containsKey(bVar2)) {
                    bVar = gc.b.valueOf(hashMap.get(bVar2).toString());
                } else {
                    bVar = gc.b.L;
                }
                bc.b bVar3 = bc.b.f3125c;
                if (hashMap.containsKey(bVar3)) {
                    i13 = Integer.parseInt(hashMap.get(bVar3).toString());
                } else {
                    i13 = 4;
                }
                cc.c cVar = (cc.c) ic.b.b(str, bVar, hashMap).f194f;
                this.f18084f = cVar;
                if (cVar != null) {
                    int i17 = cVar.f5188b;
                    int i18 = cVar.f5189c;
                    for (int i19 = 0; i19 < i17 && b(i19, 0); i19++) {
                        this.d++;
                    }
                    int i20 = i13 * 2;
                    int i21 = i17 + i20;
                    int i22 = i20 + i18;
                    int min = Math.min(Math.max(i7, i21) / i21, Math.max(i10, i22) / i22);
                    int i23 = min * i17;
                    int i24 = i23 + 32;
                    if (bitmap != null && bitmap.getWidth() == i24) {
                        createBitmap = bitmap;
                    } else {
                        createBitmap = Bitmap.createBitmap(i24, i24, Bitmap.Config.ARGB_8888);
                    }
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(i11);
                    Paint paint2 = new Paint(1);
                    paint2.setColor(i12);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadii(fArr);
                    float f15 = min;
                    int round = Math.round((i23 / 4.65f) / f15);
                    this.f18081b = round;
                    int i25 = 1;
                    if (round % 2 != i17 % 2) {
                        this.f18081b = round + 1;
                    }
                    int i26 = this.f18081b;
                    this.f18082c = (i17 - i26) / 2;
                    int i27 = (i26 * min) - 24;
                    this.f18083e = i27;
                    int i28 = (i24 - i27) / 2;
                    paint2.setColor(i12);
                    float f16 = this.d;
                    float f17 = i24;
                    if (Color.alpha(i11) == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadii(fArr);
                    Path path = new Path();
                    RectF rectF = new RectF();
                    int i29 = 0;
                    while (true) {
                        f11 = f15;
                        c10 = 3;
                        boolean z16 = z10;
                        i14 = 16;
                        if (i29 >= 3) {
                            break;
                        }
                        if (i29 == 0) {
                            f13 = 16;
                            f14 = f13;
                        } else if (i29 == i25) {
                            f14 = 16;
                            f13 = (f17 - (f16 * f11)) - f14;
                        } else {
                            f13 = 16;
                            f14 = (f17 - (f16 * f11)) - f13;
                        }
                        if (z16) {
                            i16 = i29;
                            bitmap2 = createBitmap;
                            float f18 = (f16 - 1.0f) * f11;
                            paint = paint2;
                            i15 = i28;
                            rectF.set(f13 + f11, f14 + f11, f13 + f18, f14 + f18);
                            float f19 = ((f16 * f11) / 4.0f) * f10;
                            path.reset();
                            path.addRoundRect(rectF, f19, f19, Path.Direction.CW);
                            path.close();
                            canvas.save();
                            canvas.clipPath(path, Region.Op.DIFFERENCE);
                        } else {
                            i15 = i28;
                            i16 = i29;
                            bitmap2 = createBitmap;
                            paint = paint2;
                        }
                        float f20 = f16 * f11;
                        Arrays.fill(fArr, (f20 / 3.0f) * f10);
                        gradientDrawable.setColor(i12);
                        Path path2 = path;
                        gradientDrawable.setBounds((int) f13, (int) f14, (int) (f13 + f20), (int) (f14 + f20));
                        gradientDrawable.draw(canvas);
                        float f21 = f13 + f11;
                        float f22 = f14 + f11;
                        float f23 = (f16 - 1.0f) * f11;
                        float f24 = f13 + f23;
                        float f25 = f14 + f23;
                        canvas.drawRect(f21, f22, f24, f25, paint);
                        if (z16) {
                            canvas.restore();
                        }
                        if (!z16) {
                            Arrays.fill(fArr, (f20 / 4.0f) * f10);
                            gradientDrawable.setColor(i11);
                            gradientDrawable.setBounds((int) f21, (int) f22, (int) f24, (int) f25);
                            gradientDrawable.draw(canvas);
                        }
                        float f26 = (f16 - 2.0f) * f11;
                        Arrays.fill(fArr, (f26 / 4.0f) * f10);
                        gradientDrawable.setColor(i12);
                        float f27 = f11 * 2.0f;
                        gradientDrawable.setBounds((int) (f13 + f27), (int) (f27 + f14), (int) (f13 + f26), (int) (f14 + f26));
                        gradientDrawable.draw(canvas);
                        i29 = i16 + 1;
                        f15 = f11;
                        z10 = z16;
                        paint2 = paint;
                        createBitmap = bitmap2;
                        i28 = i15;
                        path = path2;
                        i25 = 1;
                    }
                    int i30 = i28;
                    Bitmap bitmap3 = createBitmap;
                    Paint paint3 = paint2;
                    if (Color.alpha(i11) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    float f28 = (f11 / 2.0f) * f10;
                    int i31 = 16;
                    int i32 = 0;
                    while (i32 < i18) {
                        int i33 = i14;
                        int i34 = 0;
                        while (i34 < i17) {
                            char c11 = c10;
                            if (b(i34, i32)) {
                                Arrays.fill(fArr, f28);
                                if (b(i34, i32 - 1)) {
                                    fArr[1] = 0.0f;
                                    fArr[0] = 0.0f;
                                    fArr[c11] = 0.0f;
                                    fArr[2] = 0.0f;
                                }
                                if (b(i34, i32 + 1)) {
                                    fArr[7] = 0.0f;
                                    fArr[6] = 0.0f;
                                    fArr[5] = 0.0f;
                                    fArr[4] = 0.0f;
                                }
                                if (b(i34 - 1, i32)) {
                                    fArr[1] = 0.0f;
                                    fArr[0] = 0.0f;
                                    fArr[7] = 0.0f;
                                    fArr[6] = 0.0f;
                                }
                                if (b(i34 + 1, i32)) {
                                    fArr[c11] = 0.0f;
                                    fArr[2] = 0.0f;
                                    fArr[5] = 0.0f;
                                    fArr[4] = 0.0f;
                                }
                                gradientDrawable.setColor(i12);
                                gradientDrawable.setBounds(i33, i31, i33 + min, i31 + min);
                                gradientDrawable.draw(canvas);
                                z14 = z11;
                                f12 = f28;
                            } else {
                                Arrays.fill(fArr, 0.0f);
                                int i35 = i34 - 1;
                                int i36 = i32 - 1;
                                if (b(i35, i36) && b(i35, i32) && b(i34, i36)) {
                                    z12 = true;
                                    fArr[1] = f28;
                                    fArr[0] = f28;
                                    z13 = true;
                                } else {
                                    z12 = true;
                                    z13 = false;
                                }
                                z14 = z11;
                                int i37 = i34 + 1;
                                if (b(i37, i36) && b(i37, i32) && b(i34, i36)) {
                                    fArr[c11] = f28;
                                    fArr[2] = f28;
                                    z13 = z12;
                                }
                                int i38 = i32 + 1;
                                if (b(i35, i38) && b(i35, i32) && b(i34, i38)) {
                                    fArr[7] = f28;
                                    fArr[6] = f28;
                                    z15 = z12;
                                } else {
                                    z15 = z13;
                                }
                                if (b(i37, i38) && b(i37, i32) && b(i34, i38)) {
                                    fArr[5] = f28;
                                    fArr[4] = f28;
                                    z15 = z12;
                                }
                                if (z15 && !z14) {
                                    int i39 = i33 + min;
                                    int i40 = i31 + min;
                                    f12 = f28;
                                    canvas.drawRect(i33, i31, i39, i40, paint3);
                                    gradientDrawable.setColor(i11);
                                    gradientDrawable.setBounds(i33, i31, i39, i40);
                                    gradientDrawable.draw(canvas);
                                } else {
                                    f12 = f28;
                                }
                            }
                            i34++;
                            i33 += min;
                            f28 = f12;
                            c10 = c11;
                            z11 = z14;
                        }
                        i32++;
                        i31 += min;
                        i14 = 16;
                    }
                    Drawable drawable = (Drawable) this.f18085g;
                    if (drawable != null) {
                        int i41 = i30 + this.f18083e;
                        drawable.setBounds(i30, i30, i41, i41);
                        ((Drawable) this.f18085g).draw(canvas);
                    } else {
                        String y22 = g0.y2(null, 2131624171);
                        int i42 = this.f18083e;
                        Bitmap e10 = mz.e(i42, i42, y22);
                        float f29 = i30;
                        canvas.drawBitmap(e10, f29, f29, (Paint) null);
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

    public boolean b(int i7, int i10) {
        int i11 = this.f18082c;
        if (i7 >= i11) {
            int i12 = this.f18081b;
            if (i7 < i11 + i12 && i10 >= i11 && i10 < i11 + i12) {
                return false;
            }
        }
        int i13 = this.d;
        if ((i7 < i13 || i7 >= ((cc.c) this.f18084f).f5188b - i13) && i10 < i13) {
            return false;
        }
        if ((i7 >= i13 || i10 < ((cc.c) this.f18084f).f5189c - i13) && i7 >= 0 && i10 >= 0) {
            cc.c cVar = (cc.c) this.f18084f;
            if (i7 < cVar.f5188b && i10 < cVar.f5189c && cVar.e(i7, i10) == 1) {
                return true;
            }
        }
        return false;
    }

    public int c(java.nio.ByteBuffer r25, int r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: ji.s.c(java.nio.ByteBuffer, int, int):int");
    }
}
