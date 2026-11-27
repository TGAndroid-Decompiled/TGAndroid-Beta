package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
public final class q46 extends pf0 {
    @Override
    public final o46 h(nk1 nk1Var) {
        return new o46(nk1Var, false, null);
    }

    @Override
    public final void k(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q46.k(android.graphics.Canvas):void");
    }

    @Override
    public final void n(Canvas canvas) {
        boolean z;
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        int i2;
        int i3;
        float f;
        float f2;
        getMeasuredHeight();
        getMeasuredHeight();
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.i0 != null) {
            int i4 = 0;
            while (i4 < size) {
                o46 o46Var = (o46) arrayList3.get(i4);
                boolean z2 = o46Var.n;
                float[] fArr = o46Var.l;
                Paint paint = o46Var.b;
                Path path = o46Var.e;
                float f3 = 0.0f;
                if (!z2 && o46Var.o == 0.0f) {
                    arrayList = arrayList3;
                    i = size;
                } else {
                    path.reset();
                    int length = this.i0.b.length;
                    long[] jArr = o46Var.a.a;
                    o46Var.f.reset();
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        z = pf0.B1;
                        if (i5 >= length) {
                            break;
                        }
                        float f4 = f3;
                        long[] jArr2 = jArr;
                        long j = jArr2[i5];
                        if (j < 0) {
                            arrayList2 = arrayList3;
                            i2 = size;
                            i3 = length;
                        } else {
                            ok1 ok1Var = this.i0;
                            arrayList2 = arrayList3;
                            float f5 = this.D0 * ok1Var.b[i5];
                            if (pf0.C1) {
                                f2 = this.k0;
                                i2 = size;
                                f = this.l0;
                                i3 = length;
                            } else {
                                i2 = size;
                                i3 = length;
                                fArr = fArr;
                                f = (float) ok1Var.f;
                                f2 = (float) ok1Var.e;
                            }
                            float f6 = (1.0f - ((((float) j) - f) / (f2 - f))) * this.C0;
                            if (z) {
                                int i7 = i6 + 1;
                                if (i6 == 0) {
                                    fArr[i6] = f5;
                                    i6 += 2;
                                    fArr[i7] = f6;
                                } else {
                                    fArr[i6] = f5;
                                    fArr[i7] = f6;
                                    int i8 = i6 + 3;
                                    fArr[i6 + 2] = f5;
                                    i6 += 4;
                                    fArr[i8] = f6;
                                }
                            } else if (i5 == 0) {
                                path.moveTo(f5, f6);
                            } else {
                                path.lineTo(f5, f6);
                            }
                        }
                        i5++;
                        f3 = f4;
                        jArr = jArr2;
                        arrayList3 = arrayList2;
                        size = i2;
                        length = i3;
                    }
                    arrayList = arrayList3;
                    i = size;
                    float f7 = f3;
                    o46Var.j = i6;
                    if (o46Var.n || o46Var.o != f7) {
                        paint.setAlpha((int) (o46Var.o * 255.0f));
                        if (z) {
                            canvas.drawLines(fArr, 0, o46Var.j, paint);
                        } else {
                            canvas.drawPath(path, paint);
                        }
                    }
                }
                i4++;
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
