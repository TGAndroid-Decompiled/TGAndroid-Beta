package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
public final class n46 extends ng0 {
    @Override
    public final l46 h(ml1 ml1Var) {
        return new l46(ml1Var, false, null);
    }

    @Override
    public final void k(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n46.k(android.graphics.Canvas):void");
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
                l46 l46Var = (l46) arrayList3.get(i4);
                boolean z2 = l46Var.n;
                float[] fArr = l46Var.l;
                Paint paint = l46Var.b;
                Path path = l46Var.e;
                float f3 = 0.0f;
                if (!z2 && l46Var.o == 0.0f) {
                    arrayList = arrayList3;
                    i = size;
                } else {
                    path.reset();
                    int length = this.i0.b.length;
                    long[] jArr = l46Var.a.a;
                    l46Var.f.reset();
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        z = ng0.B1;
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
                            nl1 nl1Var = this.i0;
                            arrayList2 = arrayList3;
                            float f5 = this.D0 * nl1Var.b[i5];
                            if (ng0.C1) {
                                f2 = this.k0;
                                i2 = size;
                                f = this.l0;
                                i3 = length;
                            } else {
                                i2 = size;
                                i3 = length;
                                fArr = fArr;
                                f = (float) nl1Var.f;
                                f2 = (float) nl1Var.e;
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
                    l46Var.j = i6;
                    if (l46Var.n || l46Var.o != f7) {
                        paint.setAlpha((int) (l46Var.o * 255.0f));
                        if (z) {
                            canvas.drawLines(fArr, 0, l46Var.j, paint);
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
