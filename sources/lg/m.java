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
        boolean z10;
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
        if (this.f19803i0 != null) {
            int i12 = 0;
            while (i12 < size) {
                ng.f fVar = (ng.f) arrayList3.get(i12);
                boolean z11 = fVar.f21510n;
                Paint paint2 = fVar.f21500b;
                float[] fArr = fVar.f21508l;
                Path path = fVar.f21502e;
                float f12 = 0.0f;
                if (!z11 && fVar.f21511o == 0.0f) {
                    arrayList = arrayList3;
                    i7 = size;
                } else {
                    path.reset();
                    int length = this.f19803i0.f20982b.length;
                    long[] jArr = fVar.f21499a.f20974a;
                    fVar.f21503f.reset();
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        z10 = g.B1;
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
                            mg.b bVar = this.f19803i0;
                            arrayList2 = arrayList3;
                            float f14 = this.D0 * bVar.f20982b[i13];
                            boolean z12 = g.C1;
                            i10 = size;
                            if (z12) {
                                i11 = length;
                                f10 = this.f19807k0;
                                paint = paint2;
                            } else {
                                i11 = length;
                                paint = paint2;
                                f10 = (float) bVar.f20984e;
                            }
                            if (z12) {
                                f11 = this.f19809l0;
                                paint2 = paint;
                            } else {
                                paint2 = paint;
                                f11 = (float) bVar.f20985f;
                            }
                            float f15 = (1.0f - ((((float) j3) - f11) / (f10 - f11))) * this.C0;
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
                    i7 = size;
                    float f16 = f12;
                    fVar.f21506j = i14;
                    if (fVar.f21510n || fVar.f21511o != f16) {
                        Paint paint3 = paint2;
                        paint3.setAlpha((int) (fVar.f21511o * 255.0f));
                        if (z10) {
                            canvas.drawLines(fArr, 0, fVar.f21506j, paint3);
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
        this.Q0 = true;
        super.t();
    }
}
