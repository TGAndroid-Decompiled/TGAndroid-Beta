package lg;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import org.telegram.messenger.n10;
public final class a extends g {
    @Override
    public float getMinDistance() {
        return 0.1f;
    }

    @Override
    public final ng.f h(mg.a aVar) {
        return new ng.a(aVar, this.X0);
    }

    @Override
    public final void k(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: lg.a.k(android.graphics.Canvas):void");
    }

    @Override
    public final void n(Canvas canvas) {
        float f10;
        int i7;
        ArrayList arrayList;
        int i10;
        int i11;
        float f11;
        ArrayList arrayList2;
        float f12;
        int measuredHeight = getMeasuredHeight();
        int i12 = g.f19776r1;
        int i13 = measuredHeight - i12;
        int measuredHeight2 = (getMeasuredHeight() - this.C0) - i12;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.f19806i0 != null) {
            int i14 = 0;
            while (i14 < size) {
                ng.a aVar = (ng.a) arrayList3.get(i14);
                boolean z10 = aVar.f21513n;
                Paint paint = aVar.f21504c;
                float[] fArr = aVar.f21510k;
                if (!z10 && aVar.f21514o == 0.0f) {
                    i7 = i13;
                    arrayList = arrayList3;
                    i10 = i14;
                } else {
                    aVar.f21505e.reset();
                    float[] fArr2 = this.f19806i0.f20985b;
                    int length = fArr2.length;
                    if (fArr2.length < 2) {
                        f10 = 1.0f;
                    } else {
                        f10 = fArr2[1] * this.D0;
                    }
                    long[] jArr = aVar.f21502a.f20977a;
                    float f13 = aVar.f21514o;
                    int i15 = 0;
                    int i16 = 0;
                    while (i15 < length) {
                        int i17 = i14;
                        long j3 = jArr[i15];
                        if (j3 < 0) {
                            i11 = i13;
                            arrayList2 = arrayList3;
                        } else {
                            mg.b bVar = this.f19806i0;
                            i11 = i13;
                            float f14 = this.D0 * bVar.f20985b[i15];
                            if (g.C1) {
                                f12 = this.f19810k0;
                                f11 = f14;
                                arrayList2 = arrayList3;
                            } else {
                                f11 = f14;
                                arrayList2 = arrayList3;
                                f12 = (float) bVar.f20987e;
                            }
                            float w10 = n10.w((float) j3, f12, f13, 1.0f) * (i11 - measuredHeight2);
                            fArr[i16] = f11;
                            fArr[i16 + 1] = w10;
                            int i18 = i16 + 3;
                            fArr[i16 + 2] = f11;
                            i16 += 4;
                            fArr[i18] = getMeasuredHeight() - this.f19820s;
                        }
                        i15++;
                        i14 = i17;
                        i13 = i11;
                        arrayList3 = arrayList2;
                    }
                    i7 = i13;
                    arrayList = arrayList3;
                    i10 = i14;
                    paint.setStrokeWidth(f10 + 2.0f);
                    canvas.drawLines(fArr, 0, i16, paint);
                }
                i14 = i10 + 1;
                i13 = i7;
                arrayList3 = arrayList;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.f19788b;
        this.f19814n0 = arrayList.size();
        int i7 = 0;
        while (true) {
            this.f19815o0 = i7;
            int i10 = this.f19815o0;
            if (i10 < this.f19814n0) {
                l(canvas, (ng.d) arrayList.get(i10));
                p(canvas, (ng.d) arrayList.get(this.f19815o0));
                i7 = this.f19815o0 + 1;
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
