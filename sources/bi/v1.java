package bi;

import android.view.ScaleGestureDetector;
import java.util.ArrayList;
public final class v1 implements o1.f {
    public final int f3849a;
    public final ArrayList f3850b;
    public final ScaleGestureDetector.OnScaleGestureListener f3851c;

    public v1(ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener, ArrayList arrayList, int i10) {
        this.f3849a = i10;
        this.f3851c = onScaleGestureListener;
        this.f3850b = arrayList;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f3849a) {
            case 0:
                ArrayList arrayList = hVar.f16465k;
                int indexOf = arrayList.indexOf(this);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, null);
                }
                ArrayList arrayList2 = this.f3850b;
                arrayList2.add((o1.k) hVar);
                if (arrayList2.size() == 2) {
                    ((w1) this.f3851c).a();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList3 = hVar.f16465k;
                int indexOf2 = arrayList3.indexOf(this);
                if (indexOf2 >= 0) {
                    arrayList3.set(indexOf2, null);
                }
                ArrayList arrayList4 = this.f3850b;
                arrayList4.add((o1.k) hVar);
                if (arrayList4.size() == 2) {
                    ((mg.b) this.f3851c).b();
                    return;
                }
                return;
            default:
                ArrayList arrayList5 = hVar.f16465k;
                int indexOf3 = arrayList5.indexOf(this);
                if (indexOf3 >= 0) {
                    arrayList5.set(indexOf3, null);
                }
                ArrayList arrayList6 = this.f3850b;
                arrayList6.add((o1.k) hVar);
                if (arrayList6.size() == 2) {
                    ((mg.b) this.f3851c).b();
                    return;
                }
                return;
        }
    }
}
