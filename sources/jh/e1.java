package jh;

import android.view.ScaleGestureDetector;
import java.util.ArrayList;
import org.telegram.ui.Components.pf0;

public final class e1 implements o1.f {

    public final int f13212a;

    public final ArrayList f13213b;

    public final ScaleGestureDetector.OnScaleGestureListener f13214c;

    public e1(ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener, ArrayList arrayList, int i10) {
        this.f13212a = i10;
        this.f13214c = onScaleGestureListener;
        this.f13213b = arrayList;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        switch (this.f13212a) {
            case 0:
                ArrayList arrayList = hVar.f19145k;
                int iIndexOf = arrayList.indexOf(this);
                if (iIndexOf >= 0) {
                    arrayList.set(iIndexOf, null);
                }
                ArrayList arrayList2 = this.f13213b;
                arrayList2.add((o1.j) hVar);
                if (arrayList2.size() == 2) {
                    ((f1) this.f13214c).a();
                }
                break;
            case 1:
                ArrayList arrayList3 = hVar.f19145k;
                int iIndexOf2 = arrayList3.indexOf(this);
                if (iIndexOf2 >= 0) {
                    arrayList3.set(iIndexOf2, null);
                }
                ArrayList arrayList4 = this.f13213b;
                arrayList4.add((o1.j) hVar);
                if (arrayList4.size() == 2) {
                    ((pf0) this.f13214c).b();
                }
                break;
            default:
                ArrayList arrayList5 = hVar.f19145k;
                int iIndexOf3 = arrayList5.indexOf(this);
                if (iIndexOf3 >= 0) {
                    arrayList5.set(iIndexOf3, null);
                }
                ArrayList arrayList6 = this.f13213b;
                arrayList6.add((o1.j) hVar);
                if (arrayList6.size() == 2) {
                    ((pf0) this.f13214c).b();
                }
                break;
        }
    }
}
