package mg;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
public final class a extends g {
    @Override
    public float getMinDistance() {
        return 0.1f;
    }

    @Override
    public final og.f h(ng.a aVar) {
        return new og.a(aVar, this.X0);
    }

    @Override
    public final void k(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: mg.a.k(android.graphics.Canvas):void");
    }

    @Override
    public final void n(Canvas canvas) {
        float f10;
        int i3;
        ArrayList arrayList;
        int i10;
        int i11;
        float f11;
        ArrayList arrayList2;
        float f12;
        int measuredHeight = getMeasuredHeight();
        int i12 = g.f19316r1;
        int i13 = measuredHeight - i12;
        int measuredHeight2 = (getMeasuredHeight() - this.C0) - i12;
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        if (this.f19346i0 != null) {
            int i14 = 0;
            while (i14 < size) {
                og.a aVar = (og.a) arrayList3.get(i14);
                boolean z10 = aVar.f21096n;
                Paint paint = aVar.f21087c;
                float[] fArr = aVar.f21093k;
                if (!z10 && aVar.f21097o == 0.0f) {
                    i3 = i13;
                    arrayList = arrayList3;
                    i10 = i14;
                } else {
                    aVar.f21088e.reset();
                    float[] fArr2 = this.f19346i0.f20374b;
                    int length = fArr2.length;
                    if (fArr2.length < 2) {
                        f10 = 1.0f;
                    } else {
                        f10 = fArr2[1] * this.D0;
                    }
                    long[] jArr = aVar.f21085a.f20366a;
                    float f13 = aVar.f21097o;
                    int i15 = 0;
                    int i16 = 0;
                    while (i15 < length) {
                        int i17 = i14;
                        long j10 = jArr[i15];
                        if (j10 < 0) {
                            i11 = i13;
                            arrayList2 = arrayList3;
                        } else {
                            ng.b bVar = this.f19346i0;
                            i11 = i13;
                            float f14 = this.D0 * bVar.f20374b[i15];
                            if (g.C1) {
                                f12 = this.f19350k0;
                                f11 = f14;
                                arrayList2 = arrayList3;
                            } else {
                                f11 = f14;
                                arrayList2 = arrayList3;
                                f12 = (float) bVar.f20376e;
                            }
                            float v = org.telegram.messenger.camera.q.v((float) j10, f12, f13, 1.0f) * (i11 - measuredHeight2);
                            fArr[i16] = f11;
                            fArr[i16 + 1] = v;
                            int i18 = i16 + 3;
                            fArr[i16 + 2] = f11;
                            i16 += 4;
                            fArr[i18] = getMeasuredHeight() - this.f19359s;
                        }
                        i15++;
                        i14 = i17;
                        i13 = i11;
                        arrayList3 = arrayList2;
                    }
                    i3 = i13;
                    arrayList = arrayList3;
                    i10 = i14;
                    paint.setStrokeWidth(f10 + 2.0f);
                    canvas.drawLines(fArr, 0, i16, paint);
                }
                i14 = i10 + 1;
                i13 = i3;
                arrayList3 = arrayList;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.f19328b;
        this.f19353n0 = arrayList.size();
        int i3 = 0;
        while (true) {
            this.f19354o0 = i3;
            int i10 = this.f19354o0;
            if (i10 < this.f19353n0) {
                l(canvas, (og.d) arrayList.get(i10));
                p(canvas, (og.d) arrayList.get(this.f19354o0));
                i3 = this.f19354o0 + 1;
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
