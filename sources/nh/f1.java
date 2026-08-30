package nh;

import android.view.ScaleGestureDetector;
import java.util.ArrayList;
import org.telegram.ui.Components.hg0;
public final class f1 implements o1.f {
    public final int f15318a;
    public final ArrayList f15319b;
    public final ScaleGestureDetector.OnScaleGestureListener f15320c;

    public f1(ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener, ArrayList arrayList, int i10) {
        this.f15318a = i10;
        this.f15320c = onScaleGestureListener;
        this.f15319b = arrayList;
    }

    @Override
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.f15318a) {
            case 0:
                ArrayList arrayList = hVar.f16196k;
                int indexOf = arrayList.indexOf(this);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, null);
                }
                ArrayList arrayList2 = this.f15319b;
                arrayList2.add((o1.j) hVar);
                if (arrayList2.size() == 2) {
                    ((g1) this.f15320c).a();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList3 = hVar.f16196k;
                int indexOf2 = arrayList3.indexOf(this);
                if (indexOf2 >= 0) {
                    arrayList3.set(indexOf2, null);
                }
                ArrayList arrayList4 = this.f15319b;
                arrayList4.add((o1.j) hVar);
                if (arrayList4.size() == 2) {
                    ((hg0) this.f15320c).b();
                    return;
                }
                return;
            default:
                ArrayList arrayList5 = hVar.f16196k;
                int indexOf3 = arrayList5.indexOf(this);
                if (indexOf3 >= 0) {
                    arrayList5.set(indexOf3, null);
                }
                ArrayList arrayList6 = this.f15319b;
                arrayList6.add((o1.j) hVar);
                if (arrayList6.size() == 2) {
                    ((hg0) this.f15320c).b();
                    return;
                }
                return;
        }
    }
}
