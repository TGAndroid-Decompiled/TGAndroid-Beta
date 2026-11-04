package mg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
public final class m extends g {
    @Override
    public final og.f h(ng.a aVar) {
        return new og.f(aVar, false, null);
    }

    @Override
    public final void k(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: mg.m.k(android.graphics.Canvas):void");
    }

    @Override
    public final void n(Canvas canvas) {
        boolean z10;
        ArrayList arrayList;
        int i3;
        ArrayList arrayList2;
        int i10;
        int i11;
        Paint paint;
        float f10;
        float f11;
        getMeasuredHeight();
        getMeasuredHeight();
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.f19346i0 != null) {
            int i12 = 0;
            while (i12 < size) {
                og.f fVar = (og.f) arrayList3.get(i12);
                boolean z11 = fVar.f21096n;
                Paint paint2 = fVar.f21086b;
                float[] fArr = fVar.f21094l;
                Path path = fVar.f21088e;
                float f12 = 0.0f;
                if (!z11 && fVar.f21097o == 0.0f) {
                    arrayList = arrayList3;
                    i3 = size;
                } else {
                    path.reset();
                    int length = this.f19346i0.f20374b.length;
                    long[] jArr = fVar.f21085a.f20366a;
                    fVar.f21089f.reset();
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        z10 = g.B1;
                        if (i13 >= length) {
                            break;
                        }
                        float f13 = f12;
                        long[] jArr2 = jArr;
                        long j10 = jArr2[i13];
                        if (j10 < 0) {
                            arrayList2 = arrayList3;
                            i10 = size;
                            i11 = length;
                        } else {
                            ng.b bVar = this.f19346i0;
                            arrayList2 = arrayList3;
                            float f14 = this.D0 * bVar.f20374b[i13];
                            boolean z12 = g.C1;
                            i10 = size;
                            if (z12) {
                                i11 = length;
                                f10 = this.f19350k0;
                                paint = paint2;
                            } else {
                                i11 = length;
                                paint = paint2;
                                f10 = (float) bVar.f20376e;
                            }
                            if (z12) {
                                f11 = this.f19351l0;
                                paint2 = paint;
                            } else {
                                paint2 = paint;
                                f11 = (float) bVar.f20377f;
                            }
                            float f15 = (1.0f - ((((float) j10) - f11) / (f10 - f11))) * this.C0;
                            if (z10) {
                                if (i14 == 0) {
                                    int i15 = i14 + 1;
                                    fArr[i14] = f14;
                                    i14 += 2;
                                    fArr[i15] = f15;
                                } else {
                                    fArr[i14] = f14;
                                    fArr[i14 + 1] = f15;
                                    int i16 = i14 + 3;
                                    fArr[i14 + 2] = f14;
                                    i14 += 4;
                                    fArr[i16] = f15;
                                }
                            } else if (i13 == 0) {
                                path.moveTo(f14, f15);
                            } else {
                                path.lineTo(f14, f15);
                            }
                        }
                        i13++;
                        f12 = f13;
                        jArr = jArr2;
                        arrayList3 = arrayList2;
                        size = i10;
                        length = i11;
                    }
                    arrayList = arrayList3;
                    i3 = size;
                    float f16 = f12;
                    fVar.f21092j = i14;
                    if (fVar.f21096n || fVar.f21097o != f16) {
                        Paint paint3 = paint2;
                        paint3.setAlpha((int) (fVar.f21097o * 255.0f));
                        if (z10) {
                            canvas.drawLines(fArr, 0, fVar.f21092j, paint3);
                        } else {
                            canvas.drawPath(path, paint3);
                        }
                        i12++;
                        arrayList3 = arrayList;
                        size = i3;
                    }
                }
                i12++;
                arrayList3 = arrayList;
                size = i3;
            }
        }
    }

    @Override
    public final void t() {
        this.Q0 = true;
        super.t();
    }
}
