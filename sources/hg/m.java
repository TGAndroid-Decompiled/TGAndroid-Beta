package hg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
public final class m extends g {
    @Override
    public final jg.f h(ig.a aVar) {
        return new jg.f(aVar, false, null);
    }

    @Override
    public final void k(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: hg.m.k(android.graphics.Canvas):void");
    }

    @Override
    public final void n(Canvas canvas) {
        boolean z10;
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        int i11;
        int i12;
        Paint paint;
        float f7;
        float f10;
        getMeasuredHeight();
        getMeasuredHeight();
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.f9365h0 != null) {
            int i13 = 0;
            while (i13 < size) {
                jg.f fVar = (jg.f) arrayList3.get(i13);
                boolean z11 = fVar.f11924n;
                Paint paint2 = fVar.f11915b;
                float[] fArr = fVar.f11922l;
                Path path = fVar.e;
                if (!z11 && fVar.f11925o == 0.0f) {
                    arrayList = arrayList3;
                    i10 = size;
                } else {
                    path.reset();
                    int length = this.f9365h0.f10591b.length;
                    long[] jArr = fVar.f11914a.f10584a;
                    fVar.f11917f.reset();
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        z10 = g.A1;
                        if (i14 >= length) {
                            break;
                        }
                        long[] jArr2 = jArr;
                        long j3 = jArr2[i14];
                        if (j3 < 0) {
                            arrayList2 = arrayList3;
                            i11 = size;
                            i12 = length;
                        } else {
                            ig.b bVar = this.f9365h0;
                            arrayList2 = arrayList3;
                            float f11 = this.C0 * bVar.f10591b[i14];
                            boolean z12 = g.B1;
                            i11 = size;
                            if (z12) {
                                i12 = length;
                                f7 = this.f9369j0;
                                paint = paint2;
                            } else {
                                i12 = length;
                                paint = paint2;
                                f7 = (float) bVar.e;
                            }
                            if (z12) {
                                f10 = this.f9371k0;
                                paint2 = paint;
                            } else {
                                paint2 = paint;
                                f10 = (float) bVar.f10593f;
                            }
                            float f12 = (1.0f - ((((float) j3) - f10) / (f7 - f10))) * this.B0;
                            if (z10) {
                                if (i15 == 0) {
                                    int i16 = i15 + 1;
                                    fArr[i15] = f11;
                                    i15 += 2;
                                    fArr[i16] = f12;
                                } else {
                                    fArr[i15] = f11;
                                    fArr[i15 + 1] = f12;
                                    int i17 = i15 + 3;
                                    fArr[i15 + 2] = f11;
                                    i15 += 4;
                                    fArr[i17] = f12;
                                }
                            } else if (i14 == 0) {
                                path.moveTo(f11, f12);
                            } else {
                                path.lineTo(f11, f12);
                            }
                        }
                        i14++;
                        jArr = jArr2;
                        arrayList3 = arrayList2;
                        size = i11;
                        length = i12;
                    }
                    arrayList = arrayList3;
                    i10 = size;
                    fVar.f11920j = i15;
                    if (fVar.f11924n || fVar.f11925o != 0.0f) {
                        Paint paint3 = paint2;
                        paint3.setAlpha((int) (fVar.f11925o * 255.0f));
                        if (z10) {
                            canvas.drawLines(fArr, 0, fVar.f11920j, paint3);
                        } else {
                            canvas.drawPath(path, paint3);
                        }
                        i13++;
                        arrayList3 = arrayList;
                        size = i10;
                    }
                }
                i13++;
                arrayList3 = arrayList;
                size = i10;
            }
        }
    }

    @Override
    public final void t() {
        this.P0 = true;
        super.t();
    }
}
