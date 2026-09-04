package jg;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.wl;
public final class a extends g {
    @Override
    public float getMinDistance() {
        return 0.1f;
    }

    @Override
    public final lg.f h(kg.a aVar) {
        return new lg.a(aVar, this.W0);
    }

    @Override
    public final void k(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: jg.a.k(android.graphics.Canvas):void");
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
        int i13 = g.f13644q1;
        int i14 = measuredHeight - i13;
        int measuredHeight2 = (getMeasuredHeight() - this.B0) - i13;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.f13673h0 != null) {
            int i15 = 0;
            while (i15 < size) {
                lg.a aVar = (lg.a) arrayList3.get(i15);
                boolean z10 = aVar.f15448n;
                Paint paint = aVar.f15439c;
                float[] fArr = aVar.f15445k;
                if (!z10 && aVar.f15449o == 0.0f) {
                    i10 = i14;
                    arrayList = arrayList3;
                    i11 = i15;
                } else {
                    aVar.f15440e.reset();
                    float[] fArr2 = this.f13673h0.f14926b;
                    int length = fArr2.length;
                    if (fArr2.length < 2) {
                        f7 = 1.0f;
                    } else {
                        f7 = fArr2[1] * this.C0;
                    }
                    long[] jArr = aVar.f15437a.f14918a;
                    float f12 = aVar.f15449o;
                    int i16 = 0;
                    int i17 = 0;
                    while (i16 < length) {
                        int i18 = i15;
                        long j3 = jArr[i16];
                        if (j3 < 0) {
                            i12 = i14;
                            arrayList2 = arrayList3;
                        } else {
                            kg.b bVar = this.f13673h0;
                            i12 = i14;
                            float f13 = this.C0 * bVar.f14926b[i16];
                            if (g.B1) {
                                f11 = this.f13677j0;
                                f10 = f13;
                                arrayList2 = arrayList3;
                            } else {
                                f10 = f13;
                                arrayList2 = arrayList3;
                                f11 = (float) bVar.f14928e;
                            }
                            float c10 = wl.c((float) j3, f11, f12, 1.0f) * (i12 - measuredHeight2);
                            fArr[i17] = f10;
                            fArr[i17 + 1] = c10;
                            int i19 = i17 + 3;
                            fArr[i17 + 2] = f10;
                            i17 += 4;
                            fArr[i19] = getMeasuredHeight() - this.f13688s;
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
        ArrayList arrayList = this.f13657b;
        this.m0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.f13682n0 = i10;
            int i11 = this.f13682n0;
            if (i11 < this.m0) {
                l(canvas, (lg.d) arrayList.get(i11));
                p(canvas, (lg.d) arrayList.get(this.f13682n0));
                i10 = this.f13682n0 + 1;
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
