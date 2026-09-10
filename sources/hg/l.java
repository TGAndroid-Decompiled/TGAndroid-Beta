package hg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
public final class l extends g {
    @Override
    public final jg.f h(ig.a aVar) {
        return new jg.f(aVar, true, null);
    }

    @Override
    public final void k(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: hg.l.k(android.graphics.Canvas):void");
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
        ig.b bVar = this.f9365h0;
        if (bVar != null) {
            float[] fArr = bVar.f10591b;
            if (fArr.length < 2) {
                f7 = 1.0f;
            } else {
                f7 = fArr[1] * this.C0;
            }
            int i12 = 0;
            while (i12 < size) {
                jg.f fVar = (jg.f) arrayList3.get(i12);
                boolean z11 = fVar.f11924n;
                Paint paint = fVar.f11915b;
                float[] fArr2 = fVar.f11922l;
                Path path = fVar.e;
                if (!z11 && fVar.f11925o == 0.0f) {
                    arrayList = arrayList3;
                    i10 = size;
                } else {
                    path.reset();
                    int length = this.f9365h0.f10591b.length;
                    long[] jArr = fVar.f11914a.f10584a;
                    fVar.f11917f.reset();
                    int i13 = 0;
                    int i14 = 0;
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
                        } else {
                            ig.b bVar2 = this.f9365h0;
                            arrayList2 = arrayList3;
                            float f13 = this.C0 * bVar2.f10591b[i14];
                            boolean z12 = g.B1;
                            if (z12) {
                                f10 = this.f9369j0;
                                i11 = size;
                            } else {
                                i11 = size;
                                f10 = (float) bVar2.e;
                            }
                            if (z12) {
                                f12 = this.f9371k0;
                                f11 = f10;
                            } else {
                                f11 = f10;
                                f12 = (float) bVar2.f10593f;
                            }
                            float f14 = (1.0f - ((((float) j3) - f12) / (f11 - f12))) * this.B0;
                            if (z10) {
                                if (i13 == 0) {
                                    float f15 = f7 / 2.0f;
                                    fArr2[i13] = f13 - f15;
                                    fArr2[i13 + 1] = f14;
                                    float f16 = f13 + f15;
                                    fArr2[i13 + 2] = f16;
                                    fArr2[i13 + 3] = f14;
                                    int i15 = i13 + 5;
                                    fArr2[i13 + 4] = f16;
                                    i13 += 6;
                                    fArr2[i15] = f14;
                                } else if (i14 == length - 1) {
                                    float f17 = f7 / 2.0f;
                                    float f18 = f13 - f17;
                                    fArr2[i13] = f18;
                                    fArr2[i13 + 1] = f14;
                                    fArr2[i13 + 2] = f18;
                                    fArr2[i13 + 3] = f14;
                                    float f19 = f13 + f17;
                                    fArr2[i13 + 4] = f19;
                                    fArr2[i13 + 5] = f14;
                                    fArr2[i13 + 6] = f19;
                                    fArr2[i13 + 7] = f14;
                                    int i16 = i13 + 9;
                                    fArr2[i13 + 8] = f19;
                                    i13 += 10;
                                    fArr2[i16] = 0.0f;
                                } else {
                                    float f20 = f7 / 2.0f;
                                    float f21 = f13 - f20;
                                    fArr2[i13] = f21;
                                    fArr2[i13 + 1] = f14;
                                    fArr2[i13 + 2] = f21;
                                    fArr2[i13 + 3] = f14;
                                    float f22 = f13 + f20;
                                    fArr2[i13 + 4] = f22;
                                    fArr2[i13 + 5] = f14;
                                    int i17 = i13 + 7;
                                    fArr2[i13 + 6] = f22;
                                    i13 += 8;
                                    fArr2[i17] = f14;
                                }
                            } else {
                                if (i14 == 0) {
                                    path.moveTo(f13 - (f7 / 2.0f), f14);
                                } else {
                                    path.lineTo(f13 - (f7 / 2.0f), f14);
                                }
                                path.lineTo((f7 / 2.0f) + f13, f14);
                            }
                        }
                        i14++;
                        jArr = jArr2;
                        arrayList3 = arrayList2;
                        size = i11;
                    }
                    arrayList = arrayList3;
                    i10 = size;
                    fVar.f11920j = i13;
                    if (fVar.f11924n || fVar.f11925o != 0.0f) {
                        paint.setAlpha((int) (fVar.f11925o * 255.0f));
                        if (z10) {
                            canvas.drawLines(fArr2, 0, fVar.f11920j, paint);
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
