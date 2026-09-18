package ai;

import android.view.ScaleGestureDetector;
import java.util.ArrayList;
public final class g2 implements o1.f {
    public final int f892a;
    public final ArrayList f893b;
    public final ScaleGestureDetector.OnScaleGestureListener f894c;

    public g2(ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener, ArrayList arrayList, int i10) {
        this.f892a = i10;
        this.f894c = onScaleGestureListener;
        this.f893b = arrayList;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f892a) {
            case 0:
                ArrayList arrayList = hVar.f15358k;
                int indexOf = arrayList.indexOf(this);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, null);
                }
                ArrayList arrayList2 = this.f893b;
                arrayList2.add((o1.k) hVar);
                if (arrayList2.size() == 2) {
                    ((h2) this.f894c).a();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList3 = hVar.f15358k;
                int indexOf2 = arrayList3.indexOf(this);
                if (indexOf2 >= 0) {
                    arrayList3.set(indexOf2, null);
                }
                ArrayList arrayList4 = this.f893b;
                arrayList4.add((o1.k) hVar);
                if (arrayList4.size() == 2) {
                    ((lg.b) this.f894c).b();
                    return;
                }
                return;
            default:
                ArrayList arrayList5 = hVar.f15358k;
                int indexOf3 = arrayList5.indexOf(this);
                if (indexOf3 >= 0) {
                    arrayList5.set(indexOf3, null);
                }
                ArrayList arrayList6 = this.f893b;
                arrayList6.add((o1.k) hVar);
                if (arrayList6.size() == 2) {
                    ((lg.b) this.f894c).b();
                    return;
                }
                return;
        }
    }
}
