package ci;

import android.view.ScaleGestureDetector;
import java.util.ArrayList;
public final class i1 implements o1.f {
    public final int f5431a;
    public final ArrayList f5432b;
    public final ScaleGestureDetector.OnScaleGestureListener f5433c;

    public i1(ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener, ArrayList arrayList, int i10) {
        this.f5431a = i10;
        this.f5433c = onScaleGestureListener;
        this.f5432b = arrayList;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f5431a) {
            case 0:
                ArrayList arrayList = hVar.f17619k;
                int indexOf = arrayList.indexOf(this);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, null);
                }
                ArrayList arrayList2 = this.f5432b;
                arrayList2.add((o1.k) hVar);
                if (arrayList2.size() == 2) {
                    ((j1) this.f5433c).a();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList3 = hVar.f17619k;
                int indexOf2 = arrayList3.indexOf(this);
                if (indexOf2 >= 0) {
                    arrayList3.set(indexOf2, null);
                }
                ArrayList arrayList4 = this.f5432b;
                arrayList4.add((o1.k) hVar);
                if (arrayList4.size() == 2) {
                    ((mg.b) this.f5433c).b();
                    return;
                }
                return;
            default:
                ArrayList arrayList5 = hVar.f17619k;
                int indexOf3 = arrayList5.indexOf(this);
                if (indexOf3 >= 0) {
                    arrayList5.set(indexOf3, null);
                }
                ArrayList arrayList6 = this.f5432b;
                arrayList6.add((o1.k) hVar);
                if (arrayList6.size() == 2) {
                    ((mg.b) this.f5433c).b();
                    return;
                }
                return;
        }
    }
}
