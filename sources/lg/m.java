package lg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
public final class m extends g {
    @Override
    public final ng.f h(mg.a aVar) {
        return new ng.f(aVar, false, null);
    }

    @Override
    public final void k(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: lg.m.k(android.graphics.Canvas):void");
    }

    @Override
    public final void n(Canvas canvas) {
        boolean z9;
        ArrayList arrayList;
        int i7;
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
        if (this.f18308h0 != null) {
            int i12 = 0;
            while (i12 < size) {
                ng.f fVar = (ng.f) arrayList3.get(i12);
                boolean z10 = fVar.f20584n;
                Paint paint2 = fVar.f20574b;
                float[] fArr = fVar.f20582l;
                Path path = fVar.f20576e;
                float f12 = 0.0f;
                if (!z10 && fVar.f20585o == 0.0f) {
                    arrayList = arrayList3;
                    i7 = size;
                } else {
                    path.reset();
                    int length = this.f18308h0.f20029b.length;
                    long[] jArr = fVar.f20573a.f20021a;
                    fVar.f20577f.reset();
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        z9 = g.A1;
                        if (i13 >= length) {
                            break;
                        }
                        float f13 = f12;
                        long[] jArr2 = jArr;
                        long j3 = jArr2[i13];
                        if (j3 < 0) {
                            arrayList2 = arrayList3;
                            i10 = size;
                            i11 = length;
                        } else {
                            mg.b bVar = this.f18308h0;
                            arrayList2 = arrayList3;
                            float f14 = this.C0 * bVar.f20029b[i13];
                            boolean z11 = g.B1;
                            i10 = size;
                            if (z11) {
                                i11 = length;
                                f10 = this.f18312j0;
                                paint = paint2;
                            } else {
                                i11 = length;
                                paint = paint2;
                                f10 = (float) bVar.f20031e;
                            }
                            if (z11) {
                                f11 = this.f18314k0;
                                paint2 = paint;
                            } else {
                                paint2 = paint;
                                f11 = (float) bVar.f20032f;
                            }
                            float f15 = (1.0f - ((((float) j3) - f11) / (f10 - f11))) * this.B0;
                            if (z9) {
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
                    i7 = size;
                    float f16 = f12;
                    fVar.f20580j = i14;
                    if (fVar.f20584n || fVar.f20585o != f16) {
                        Paint paint3 = paint2;
                        paint3.setAlpha((int) (fVar.f20585o * 255.0f));
                        if (z9) {
                            canvas.drawLines(fArr, 0, fVar.f20580j, paint3);
                        } else {
                            canvas.drawPath(path, paint3);
                        }
                        i12++;
                        arrayList3 = arrayList;
                        size = i7;
                    }
                }
                i12++;
                arrayList3 = arrayList;
                size = i7;
            }
        }
    }

    @Override
    public final void t() {
        this.P0 = true;
        super.t();
    }
}
