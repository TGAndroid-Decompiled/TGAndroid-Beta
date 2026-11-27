package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
public final class p46 extends pf0 {
    @Override
    public final o46 h(nk1 nk1Var) {
        return new o46(nk1Var, true, null);
    }

    @Override
    public final void k(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p46.k(android.graphics.Canvas):void");
    }

    @Override
    public final void n(Canvas canvas) {
        float f;
        boolean z;
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        float f2;
        int i2;
        float f3;
        float f4;
        getMeasuredHeight();
        getMeasuredHeight();
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        ok1 ok1Var = this.i0;
        if (ok1Var != null) {
            float[] fArr = ok1Var.b;
            if (fArr.length < 2) {
                f = 1.0f;
            } else {
                f = fArr[1] * this.D0;
            }
            int i3 = 0;
            while (i3 < size) {
                o46 o46Var = (o46) arrayList3.get(i3);
                boolean z2 = o46Var.n;
                Paint paint = o46Var.b;
                float[] fArr2 = o46Var.l;
                Path path = o46Var.e;
                float f5 = 0.0f;
                if (!z2 && o46Var.o == 0.0f) {
                    arrayList = arrayList3;
                    i = size;
                } else {
                    path.reset();
                    int length = this.i0.b.length;
                    long[] jArr = o46Var.a.a;
                    o46Var.f.reset();
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        z = pf0.B1;
                        if (i5 >= length) {
                            break;
                        }
                        float f6 = f5;
                        long[] jArr2 = jArr;
                        long j = jArr2[i5];
                        if (j < 0) {
                            arrayList2 = arrayList3;
                            i2 = size;
                        } else {
                            ok1 ok1Var2 = this.i0;
                            arrayList2 = arrayList3;
                            float f7 = this.D0 * ok1Var2.b[i5];
                            if (pf0.C1) {
                                f4 = this.k0;
                                f2 = f7;
                                f3 = this.l0;
                                i2 = size;
                            } else {
                                f2 = f7;
                                i2 = size;
                                float f8 = (float) ok1Var2.e;
                                f3 = (float) ok1Var2.f;
                                f4 = f8;
                            }
                            float f9 = (1.0f - ((((float) j) - f3) / (f4 - f3))) * this.C0;
                            if (z) {
                                if (i4 == 0) {
                                    float f10 = f / 2.0f;
                                    fArr2[i4] = f2 - f10;
                                    fArr2[i4 + 1] = f9;
                                    float f11 = f2 + f10;
                                    fArr2[i4 + 2] = f11;
                                    fArr2[i4 + 3] = f9;
                                    int i6 = i4 + 5;
                                    fArr2[i4 + 4] = f11;
                                    i4 += 6;
                                    fArr2[i6] = f9;
                                } else if (i5 == length - 1) {
                                    float f12 = f / 2.0f;
                                    float f13 = f2 - f12;
                                    fArr2[i4] = f13;
                                    fArr2[i4 + 1] = f9;
                                    fArr2[i4 + 2] = f13;
                                    fArr2[i4 + 3] = f9;
                                    float f14 = f2 + f12;
                                    fArr2[i4 + 4] = f14;
                                    fArr2[i4 + 5] = f9;
                                    fArr2[i4 + 6] = f14;
                                    fArr2[i4 + 7] = f9;
                                    int i7 = i4 + 9;
                                    fArr2[i4 + 8] = f14;
                                    i4 += 10;
                                    fArr2[i7] = f6;
                                } else {
                                    float f15 = f / 2.0f;
                                    float f16 = f2 - f15;
                                    fArr2[i4] = f16;
                                    fArr2[i4 + 1] = f9;
                                    fArr2[i4 + 2] = f16;
                                    fArr2[i4 + 3] = f9;
                                    float f17 = f2 + f15;
                                    fArr2[i4 + 4] = f17;
                                    fArr2[i4 + 5] = f9;
                                    int i8 = i4 + 7;
                                    fArr2[i4 + 6] = f17;
                                    i4 += 8;
                                    fArr2[i8] = f9;
                                }
                            } else {
                                float f18 = f2 - (f / 2.0f);
                                if (i5 == 0) {
                                    path.moveTo(f18, f9);
                                } else {
                                    path.lineTo(f18, f9);
                                }
                                path.lineTo((f / 2.0f) + f2, f9);
                            }
                        }
                        i5++;
                        f5 = f6;
                        jArr = jArr2;
                        arrayList3 = arrayList2;
                        size = i2;
                    }
                    arrayList = arrayList3;
                    i = size;
                    float f19 = f5;
                    o46Var.j = i4;
                    if (o46Var.n || o46Var.o != f19) {
                        paint.setAlpha((int) (o46Var.o * 255.0f));
                        if (z) {
                            canvas.drawLines(fArr2, 0, o46Var.j, paint);
                        } else {
                            canvas.drawPath(path, paint);
                        }
                    }
                }
                i3++;
                arrayList3 = arrayList;
                size = i;
            }
        }
    }

    @Override
    public final void t() {
        this.Q0 = true;
        super.t();
    }
}
