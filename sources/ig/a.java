package ig;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.ul;
public final class a extends g {
    @Override
    public float getMinDistance() {
        return 0.1f;
    }

    @Override
    public final kg.f h(jg.a aVar) {
        return new kg.a(aVar, this.W0);
    }

    @Override
    public final void k(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: ig.a.k(android.graphics.Canvas):void");
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
        int i13 = g.f11107q1;
        int i14 = measuredHeight - i13;
        int measuredHeight2 = (getMeasuredHeight() - this.B0) - i13;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.f11135h0 != null) {
            int i15 = 0;
            while (i15 < size) {
                kg.a aVar = (kg.a) arrayList3.get(i15);
                boolean z10 = aVar.f13618n;
                Paint paint = aVar.f13610c;
                float[] fArr = aVar.f13615k;
                if (!z10 && aVar.f13619o == 0.0f) {
                    i10 = i14;
                    arrayList = arrayList3;
                    i11 = i15;
                } else {
                    aVar.e.reset();
                    float[] fArr2 = this.f11135h0.f12991b;
                    int length = fArr2.length;
                    if (fArr2.length < 2) {
                        f7 = 1.0f;
                    } else {
                        f7 = fArr2[1] * this.C0;
                    }
                    long[] jArr = aVar.f13608a.f12984a;
                    float f12 = aVar.f13619o;
                    int i16 = 0;
                    int i17 = 0;
                    while (i16 < length) {
                        int i18 = i15;
                        long j3 = jArr[i16];
                        if (j3 < 0) {
                            i12 = i14;
                            arrayList2 = arrayList3;
                        } else {
                            jg.b bVar = this.f11135h0;
                            i12 = i14;
                            float f13 = this.C0 * bVar.f12991b[i16];
                            if (g.B1) {
                                f11 = this.f11139j0;
                                f10 = f13;
                                arrayList2 = arrayList3;
                            } else {
                                f10 = f13;
                                arrayList2 = arrayList3;
                                f11 = (float) bVar.e;
                            }
                            float c10 = ul.c((float) j3, f11, f12, 1.0f) * (i12 - measuredHeight2);
                            fArr[i17] = f10;
                            fArr[i17 + 1] = c10;
                            int i19 = i17 + 3;
                            fArr[i17 + 2] = f10;
                            i17 += 4;
                            fArr[i19] = getMeasuredHeight() - this.f11150s;
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
        ArrayList arrayList = this.f11120b;
        this.m0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.f11144n0 = i10;
            int i11 = this.f11144n0;
            if (i11 < this.m0) {
                l(canvas, (kg.d) arrayList.get(i11));
                p(canvas, (kg.d) arrayList.get(this.f11144n0));
                i10 = this.f11144n0 + 1;
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
