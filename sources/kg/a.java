package kg;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.wh;
public final class a extends h {
    @Override
    public float getMinDistance() {
        return 0.1f;
    }

    @Override
    public final mg.f h(lg.a aVar) {
        return new mg.a(aVar, this.W0);
    }

    @Override
    public final void k(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: kg.a.k(android.graphics.Canvas):void");
    }

    @Override
    public final void n(Canvas canvas) {
        float f7;
        int i10;
        ArrayList arrayList;
        int i11;
        int i12;
        float f10;
        ArrayList arrayList2;
        float f11;
        int measuredHeight = getMeasuredHeight();
        int i13 = h.f16572q1;
        int i14 = measuredHeight - i13;
        int measuredHeight2 = (getMeasuredHeight() - this.B0) - i13;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.f16600h0 != null) {
            int i15 = 0;
            while (i15 < size) {
                mg.a aVar = (mg.a) arrayList3.get(i15);
                boolean z10 = aVar.f18474n;
                Paint paint = aVar.f18466c;
                float[] fArr = aVar.f18471k;
                if (!z10 && aVar.f18475o == 0.0f) {
                    i10 = i14;
                    arrayList = arrayList3;
                    i11 = i15;
                } else {
                    aVar.e.reset();
                    float[] fArr2 = this.f16600h0.f17011b;
                    int length = fArr2.length;
                    if (fArr2.length < 2) {
                        f7 = 1.0f;
                    } else {
                        f7 = fArr2[1] * this.C0;
                    }
                    long[] jArr = aVar.f18464a.f17004a;
                    float f12 = aVar.f18475o;
                    int i16 = 0;
                    int i17 = 0;
                    while (i16 < length) {
                        int i18 = i15;
                        long j10 = jArr[i16];
                        if (j10 < 0) {
                            i12 = i14;
                            arrayList2 = arrayList3;
                        } else {
                            lg.b bVar = this.f16600h0;
                            i12 = i14;
                            float f13 = this.C0 * bVar.f17011b[i16];
                            if (h.B1) {
                                f11 = this.f16604j0;
                                f10 = f13;
                                arrayList2 = arrayList3;
                            } else {
                                f10 = f13;
                                arrayList2 = arrayList3;
                                f11 = (float) bVar.e;
                            }
                            float w10 = wh.w((float) j10, f11, f12, 1.0f) * (i12 - measuredHeight2);
                            fArr[i17] = f10;
                            fArr[i17 + 1] = w10;
                            int i19 = i17 + 3;
                            fArr[i17 + 2] = f10;
                            i17 += 4;
                            fArr[i19] = getMeasuredHeight() - this.f16615s;
                        }
                        i16++;
                        i15 = i18;
                        i14 = i12;
                        arrayList3 = arrayList2;
                    }
                    i10 = i14;
                    arrayList = arrayList3;
                    i11 = i15;
                    paint.setStrokeWidth(f7 + 2.0f);
                    canvas.drawLines(fArr, 0, i17, paint);
                }
                i15 = i11 + 1;
                i14 = i10;
                arrayList3 = arrayList;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.f16585b;
        this.m0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.f16609n0 = i10;
            int i11 = this.f16609n0;
            if (i11 < this.m0) {
                l(canvas, (mg.d) arrayList.get(i11));
                p(canvas, (mg.d) arrayList.get(this.f16609n0));
                i10 = this.f16609n0 + 1;
            } else {
                j(canvas);
                m(canvas);
                super.onDraw(canvas);
                return;
            }
        }
    }

    @Override
    public final void o(Canvas canvas) {
    }
}
