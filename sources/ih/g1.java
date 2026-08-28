package ih;

import android.view.ScaleGestureDetector;
import java.util.ArrayList;
import org.telegram.ui.Components.mf0;
public final class g1 implements o1.f {
    public final int f11460a;
    public final ArrayList f11461b;
    public final ScaleGestureDetector.OnScaleGestureListener f11462c;

    public g1(ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener, ArrayList arrayList, int i9) {
        this.f11460a = i9;
        this.f11462c = onScaleGestureListener;
        this.f11461b = arrayList;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        switch (this.f11460a) {
            case 0:
                ArrayList arrayList = hVar.f18798k;
                int indexOf = arrayList.indexOf(this);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, null);
                }
                ArrayList arrayList2 = this.f11461b;
                arrayList2.add((o1.j) hVar);
                if (arrayList2.size() == 2) {
                    ((h1) this.f11462c).a();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList3 = hVar.f18798k;
                int indexOf2 = arrayList3.indexOf(this);
                if (indexOf2 >= 0) {
                    arrayList3.set(indexOf2, null);
                }
                ArrayList arrayList4 = this.f11461b;
                arrayList4.add((o1.j) hVar);
                if (arrayList4.size() == 2) {
                    ((mf0) this.f11462c).b();
                    return;
                }
                return;
            default:
                ArrayList arrayList5 = hVar.f18798k;
                int indexOf3 = arrayList5.indexOf(this);
                if (indexOf3 >= 0) {
                    arrayList5.set(indexOf3, null);
                }
                ArrayList arrayList6 = this.f11461b;
                arrayList6.add((o1.j) hVar);
                if (arrayList6.size() == 2) {
                    ((mf0) this.f11462c).b();
                    return;
                }
                return;
        }
    }
}
