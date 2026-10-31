package bg;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.z20;
public final class a extends i {
    @Override
    public float getMinDistance() {
        return 0.1f;
    }

    @Override
    public final dg.g h(cg.a aVar) {
        return new dg.a(aVar, this.W0);
    }

    @Override
    public final void k(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: bg.a.k(android.graphics.Canvas):void");
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
        int i13 = i.f2694q1;
        int i14 = measuredHeight - i13;
        int measuredHeight2 = (getMeasuredHeight() - this.B0) - i13;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.f2722h0 != null) {
            int i15 = 0;
            while (i15 < size) {
                dg.a aVar = (dg.a) arrayList3.get(i15);
                boolean z10 = aVar.f5919n;
                Paint paint = aVar.f5911c;
                float[] fArr = aVar.f5916k;
                if (!z10 && aVar.f5920o == 0.0f) {
                    i10 = i14;
                    arrayList = arrayList3;
                    i11 = i15;
                } else {
                    aVar.e.reset();
                    float[] fArr2 = this.f2722h0.f4165b;
                    int length = fArr2.length;
                    if (fArr2.length < 2) {
                        f7 = 1.0f;
                    } else {
                        f7 = fArr2[1] * this.C0;
                    }
                    long[] jArr = aVar.f5909a.f4158a;
                    float f12 = aVar.f5920o;
                    int i16 = 0;
                    int i17 = 0;
                    while (i16 < length) {
                        int i18 = i15;
                        long j10 = jArr[i16];
                        if (j10 < 0) {
                            i12 = i14;
                            arrayList2 = arrayList3;
                        } else {
                            cg.b bVar = this.f2722h0;
                            i12 = i14;
                            float f13 = this.C0 * bVar.f4165b[i16];
                            if (i.B1) {
                                f11 = this.f2726j0;
                                f10 = f13;
                                arrayList2 = arrayList3;
                            } else {
                                f10 = f13;
                                arrayList2 = arrayList3;
                                f11 = (float) bVar.e;
                            }
                            float v = z20.v((float) j10, f11, f12, 1.0f) * (i12 - measuredHeight2);
                            fArr[i17] = f10;
                            fArr[i17 + 1] = v;
                            int i19 = i17 + 3;
                            fArr[i17 + 2] = f10;
                            i17 += 4;
                            fArr[i19] = getMeasuredHeight() - this.f2737s;
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
        ArrayList arrayList = this.f2707b;
        this.m0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.f2731n0 = i10;
            int i11 = this.f2731n0;
            if (i11 < this.m0) {
                l(canvas, (dg.e) arrayList.get(i11));
                p(canvas, (dg.e) arrayList.get(this.f2731n0));
                i10 = this.f2731n0 + 1;
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
