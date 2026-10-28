package di;

import android.view.ScaleGestureDetector;
import java.util.ArrayList;
public final class i1 implements o1.f {
    public final int f8661a;
    public final ArrayList f8662b;
    public final ScaleGestureDetector.OnScaleGestureListener f8663c;

    public i1(ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener, ArrayList arrayList, int i10) {
        this.f8661a = i10;
        this.f8663c = onScaleGestureListener;
        this.f8662b = arrayList;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f8661a) {
            case 0:
                ArrayList arrayList = hVar.f18966k;
                int indexOf = arrayList.indexOf(this);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, null);
                }
                ArrayList arrayList2 = this.f8662b;
                arrayList2.add((o1.j) hVar);
                if (arrayList2.size() == 2) {
                    ((j1) this.f8663c).a();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList3 = hVar.f18966k;
                int indexOf2 = arrayList3.indexOf(this);
                if (indexOf2 >= 0) {
                    arrayList3.set(indexOf2, null);
                }
                ArrayList arrayList4 = this.f8662b;
                arrayList4.add((o1.j) hVar);
                if (arrayList4.size() == 2) {
                    ((ng.b) this.f8663c).b();
                    return;
                }
                return;
            default:
                ArrayList arrayList5 = hVar.f18966k;
                int indexOf3 = arrayList5.indexOf(this);
                if (indexOf3 >= 0) {
                    arrayList5.set(indexOf3, null);
                }
                ArrayList arrayList6 = this.f8662b;
                arrayList6.add((o1.j) hVar);
                if (arrayList6.size() == 2) {
                    ((ng.b) this.f8663c).b();
                    return;
                }
                return;
        }
    }
}
