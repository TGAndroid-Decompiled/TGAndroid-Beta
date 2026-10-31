package bg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
public final class q extends i {
    @Override
    public final dg.g h(cg.a aVar) {
        return new dg.g(aVar, true, null);
    }

    @Override
    public final void k(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: bg.q.k(android.graphics.Canvas):void");
    }

    @Override
    public final void n(Canvas canvas) {
        float f7;
        boolean z10;
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        int i11;
        float f10;
        float f11;
        float f12;
        getMeasuredHeight();
        getMeasuredHeight();
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        cg.b bVar = this.f2722h0;
        if (bVar != null) {
            float[] fArr = bVar.f4165b;
            if (fArr.length < 2) {
                f7 = 1.0f;
            } else {
                f7 = fArr[1] * this.C0;
            }
            int i12 = 0;
            while (i12 < size) {
                dg.g gVar = (dg.g) arrayList3.get(i12);
                boolean z11 = gVar.f5919n;
                Paint paint = gVar.f5910b;
                float[] fArr2 = gVar.f5917l;
                Path path = gVar.e;
                float f13 = 0.0f;
                if (!z11 && gVar.f5920o == 0.0f) {
                    arrayList = arrayList3;
                    i10 = size;
                } else {
                    path.reset();
                    int length = this.f2722h0.f4165b.length;
                    long[] jArr = gVar.f5909a.f4158a;
                    gVar.f5912f.reset();
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        z10 = i.A1;
                        if (i14 >= length) {
                            break;
                        }
                        float f14 = f13;
                        long[] jArr2 = jArr;
                        long j10 = jArr2[i14];
                        if (j10 < 0) {
                            arrayList2 = arrayList3;
                            i11 = size;
                        } else {
                            cg.b bVar2 = this.f2722h0;
                            arrayList2 = arrayList3;
                            float f15 = this.C0 * bVar2.f4165b[i14];
                            boolean z12 = i.B1;
                            if (z12) {
                                f10 = this.f2726j0;
                                i11 = size;
                            } else {
                                i11 = size;
                                f10 = (float) bVar2.e;
                            }
                            if (z12) {
                                f12 = this.f2728k0;
                                f11 = f10;
                            } else {
                                f11 = f10;
                                f12 = (float) bVar2.f4167f;
                            }
                            float f16 = (1.0f - ((((float) j10) - f12) / (f11 - f12))) * this.B0;
                            if (z10) {
                                if (i13 == 0) {
                                    float f17 = f7 / 2.0f;
                                    fArr2[i13] = f15 - f17;
                                    fArr2[i13 + 1] = f16;
                                    float f18 = f15 + f17;
                                    fArr2[i13 + 2] = f18;
                                    fArr2[i13 + 3] = f16;
                                    int i15 = i13 + 5;
                                    fArr2[i13 + 4] = f18;
                                    i13 += 6;
                                    fArr2[i15] = f16;
                                } else if (i14 == length - 1) {
                                    float f19 = f7 / 2.0f;
                                    float f20 = f15 - f19;
                                    fArr2[i13] = f20;
                                    fArr2[i13 + 1] = f16;
                                    fArr2[i13 + 2] = f20;
                                    fArr2[i13 + 3] = f16;
                                    float f21 = f15 + f19;
                                    fArr2[i13 + 4] = f21;
                                    fArr2[i13 + 5] = f16;
                                    fArr2[i13 + 6] = f21;
                                    fArr2[i13 + 7] = f16;
                                    int i16 = i13 + 9;
                                    fArr2[i13 + 8] = f21;
                                    i13 += 10;
                                    fArr2[i16] = f14;
                                } else {
                                    float f22 = f7 / 2.0f;
                                    float f23 = f15 - f22;
                                    fArr2[i13] = f23;
                                    fArr2[i13 + 1] = f16;
                                    fArr2[i13 + 2] = f23;
                                    fArr2[i13 + 3] = f16;
                                    float f24 = f15 + f22;
                                    fArr2[i13 + 4] = f24;
                                    fArr2[i13 + 5] = f16;
                                    int i17 = i13 + 7;
                                    fArr2[i13 + 6] = f24;
                                    i13 += 8;
                                    fArr2[i17] = f16;
                                }
                            } else {
                                if (i14 == 0) {
                                    path.moveTo(f15 - (f7 / 2.0f), f16);
                                } else {
                                    path.lineTo(f15 - (f7 / 2.0f), f16);
                                }
                                path.lineTo((f7 / 2.0f) + f15, f16);
                            }
                        }
                        i14++;
                        f13 = f14;
                        jArr = jArr2;
                        arrayList3 = arrayList2;
                        size = i11;
                    }
                    arrayList = arrayList3;
                    i10 = size;
                    float f25 = f13;
                    gVar.f5915j = i13;
                    if (gVar.f5919n || gVar.f5920o != f25) {
                        paint.setAlpha((int) (gVar.f5920o * 255.0f));
                        if (z10) {
                            canvas.drawLines(fArr2, 0, gVar.f5915j, paint);
                        } else {
                            canvas.drawPath(path, paint);
                        }
                    }
                }
                i12++;
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
