package lg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
public final class l extends g {
    @Override
    public final ng.f h(mg.a aVar) {
        return new ng.f(aVar, true, null);
    }

    @Override
    public final void k(android.graphics.Canvas r26) {
        throw new UnsupportedOperationException("Method not decompiled: lg.l.k(android.graphics.Canvas):void");
    }

    @Override
    public final void n(Canvas canvas) {
        float f10;
        boolean z9;
        ArrayList arrayList;
        int i7;
        ArrayList arrayList2;
        int i10;
        float f11;
        float f12;
        float f13;
        getMeasuredHeight();
        getMeasuredHeight();
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        mg.b bVar = this.f18305h0;
        if (bVar != null) {
            float[] fArr = bVar.f20024b;
            if (fArr.length < 2) {
                f10 = 1.0f;
            } else {
                f10 = fArr[1] * this.C0;
            }
            int i11 = 0;
            while (i11 < size) {
                ng.f fVar = (ng.f) arrayList3.get(i11);
                boolean z10 = fVar.f20579n;
                Paint paint = fVar.f20569b;
                float[] fArr2 = fVar.f20577l;
                Path path = fVar.f20571e;
                float f14 = 0.0f;
                if (!z10 && fVar.f20580o == 0.0f) {
                    arrayList = arrayList3;
                    i7 = size;
                } else {
                    path.reset();
                    int length = this.f18305h0.f20024b.length;
                    long[] jArr = fVar.f20568a.f20016a;
                    fVar.f20572f.reset();
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        z9 = g.A1;
                        if (i13 >= length) {
                            break;
                        }
                        float f15 = f14;
                        long[] jArr2 = jArr;
                        long j3 = jArr2[i13];
                        if (j3 < 0) {
                            arrayList2 = arrayList3;
                            i10 = size;
                        } else {
                            mg.b bVar2 = this.f18305h0;
                            arrayList2 = arrayList3;
                            float f16 = this.C0 * bVar2.f20024b[i13];
                            boolean z11 = g.B1;
                            if (z11) {
                                f11 = this.f18309j0;
                                i10 = size;
                            } else {
                                i10 = size;
                                f11 = (float) bVar2.f20026e;
                            }
                            if (z11) {
                                f13 = this.f18311k0;
                                f12 = f11;
                            } else {
                                f12 = f11;
                                f13 = (float) bVar2.f20027f;
                            }
                            float f17 = (1.0f - ((((float) j3) - f13) / (f12 - f13))) * this.B0;
                            if (z9) {
                                if (i12 == 0) {
                                    float f18 = f10 / 2.0f;
                                    fArr2[i12] = f16 - f18;
                                    fArr2[i12 + 1] = f17;
                                    float f19 = f16 + f18;
                                    fArr2[i12 + 2] = f19;
                                    fArr2[i12 + 3] = f17;
                                    int i14 = i12 + 5;
                                    fArr2[i12 + 4] = f19;
                                    i12 += 6;
                                    fArr2[i14] = f17;
                                } else if (i13 == length - 1) {
                                    float f20 = f10 / 2.0f;
                                    float f21 = f16 - f20;
                                    fArr2[i12] = f21;
                                    fArr2[i12 + 1] = f17;
                                    fArr2[i12 + 2] = f21;
                                    fArr2[i12 + 3] = f17;
                                    float f22 = f16 + f20;
                                    fArr2[i12 + 4] = f22;
                                    fArr2[i12 + 5] = f17;
                                    fArr2[i12 + 6] = f22;
                                    fArr2[i12 + 7] = f17;
                                    int i15 = i12 + 9;
                                    fArr2[i12 + 8] = f22;
                                    i12 += 10;
                                    fArr2[i15] = f15;
                                } else {
                                    float f23 = f10 / 2.0f;
                                    float f24 = f16 - f23;
                                    fArr2[i12] = f24;
                                    fArr2[i12 + 1] = f17;
                                    fArr2[i12 + 2] = f24;
                                    fArr2[i12 + 3] = f17;
                                    float f25 = f16 + f23;
                                    fArr2[i12 + 4] = f25;
                                    fArr2[i12 + 5] = f17;
                                    int i16 = i12 + 7;
                                    fArr2[i12 + 6] = f25;
                                    i12 += 8;
                                    fArr2[i16] = f17;
                                }
                            } else {
                                if (i13 == 0) {
                                    path.moveTo(f16 - (f10 / 2.0f), f17);
                                } else {
                                    path.lineTo(f16 - (f10 / 2.0f), f17);
                                }
                                path.lineTo((f10 / 2.0f) + f16, f17);
                            }
                        }
                        i13++;
                        f14 = f15;
                        jArr = jArr2;
                        arrayList3 = arrayList2;
                        size = i10;
                    }
                    arrayList = arrayList3;
                    i7 = size;
                    float f26 = f14;
                    fVar.f20575j = i12;
                    if (fVar.f20579n || fVar.f20580o != f26) {
                        paint.setAlpha((int) (fVar.f20580o * 255.0f));
                        if (z9) {
                            canvas.drawLines(fArr2, 0, fVar.f20575j, paint);
                        } else {
                            canvas.drawPath(path, paint);
                        }
                    }
                }
                i11++;
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
