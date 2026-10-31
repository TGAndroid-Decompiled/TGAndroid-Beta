package bg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
public final class r extends i {
    @Override
    public final dg.g h(cg.a aVar) {
        return new dg.g(aVar, false, null);
    }

    @Override
    public final void k(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: bg.r.k(android.graphics.Canvas):void");
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
        if (this.f2722h0 != null) {
            int i13 = 0;
            while (i13 < size) {
                dg.g gVar = (dg.g) arrayList3.get(i13);
                boolean z11 = gVar.f5919n;
                Paint paint2 = gVar.f5910b;
                float[] fArr = gVar.f5917l;
                Path path = gVar.e;
                float f11 = 0.0f;
                if (!z11 && gVar.f5920o == 0.0f) {
                    arrayList = arrayList3;
                    i10 = size;
                } else {
                    path.reset();
                    int length = this.f2722h0.f4165b.length;
                    long[] jArr = gVar.f5909a.f4158a;
                    gVar.f5912f.reset();
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        z10 = i.A1;
                        if (i14 >= length) {
                            break;
                        }
                        float f12 = f11;
                        long[] jArr2 = jArr;
                        long j10 = jArr2[i14];
                        if (j10 < 0) {
                            arrayList2 = arrayList3;
                            i11 = size;
                            i12 = length;
                        } else {
                            cg.b bVar = this.f2722h0;
                            arrayList2 = arrayList3;
                            float f13 = this.C0 * bVar.f4165b[i14];
                            boolean z12 = i.B1;
                            i11 = size;
                            if (z12) {
                                i12 = length;
                                f7 = this.f2726j0;
                                paint = paint2;
                            } else {
                                i12 = length;
                                paint = paint2;
                                f7 = (float) bVar.e;
                            }
                            if (z12) {
                                f10 = this.f2728k0;
                                paint2 = paint;
                            } else {
                                paint2 = paint;
                                f10 = (float) bVar.f4167f;
                            }
                            float f14 = (1.0f - ((((float) j10) - f10) / (f7 - f10))) * this.B0;
                            if (z10) {
                                if (i15 == 0) {
                                    int i16 = i15 + 1;
                                    fArr[i15] = f13;
                                    i15 += 2;
                                    fArr[i16] = f14;
                                } else {
                                    fArr[i15] = f13;
                                    fArr[i15 + 1] = f14;
                                    int i17 = i15 + 3;
                                    fArr[i15 + 2] = f13;
                                    i15 += 4;
                                    fArr[i17] = f14;
                                }
                            } else if (i14 == 0) {
                                path.moveTo(f13, f14);
                            } else {
                                path.lineTo(f13, f14);
                            }
                        }
                        i14++;
                        f11 = f12;
                        jArr = jArr2;
                        arrayList3 = arrayList2;
                        size = i11;
                        length = i12;
                    }
                    arrayList = arrayList3;
                    i10 = size;
                    float f15 = f11;
                    gVar.f5915j = i15;
                    if (gVar.f5919n || gVar.f5920o != f15) {
                        Paint paint3 = paint2;
                        paint3.setAlpha((int) (gVar.f5920o * 255.0f));
                        if (z10) {
                            canvas.drawLines(fArr, 0, gVar.f5915j, paint3);
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
