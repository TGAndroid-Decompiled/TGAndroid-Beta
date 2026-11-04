package ei;

import android.view.ScaleGestureDetector;
import java.util.ArrayList;
import org.telegram.ui.Components.ee0;
public final class h1 implements q1.c {
    public final int f10352a;
    public final ArrayList f10353b;
    public final ScaleGestureDetector.OnScaleGestureListener f10354c;

    public h1(ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener, ArrayList arrayList, int i3) {
        this.f10352a = i3;
        this.f10354c = onScaleGestureListener;
        this.f10353b = arrayList;
    }

    @Override
    public final void a(q1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f10352a) {
            case 0:
                ArrayList arrayList = gVar.f53651k;
                int indexOf = arrayList.indexOf(this);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, null);
                }
                ArrayList arrayList2 = this.f10353b;
                arrayList2.add(gVar);
                if (arrayList2.size() == 2) {
                    ((i1) this.f10354c).a();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList3 = gVar.f53651k;
                int indexOf2 = arrayList3.indexOf(this);
                if (indexOf2 >= 0) {
                    arrayList3.set(indexOf2, null);
                }
                ArrayList arrayList4 = this.f10353b;
                arrayList4.add(gVar);
                if (arrayList4.size() == 2) {
                    ((ee0) this.f10354c).b();
                    return;
                }
                return;
            default:
                ArrayList arrayList5 = gVar.f53651k;
                int indexOf3 = arrayList5.indexOf(this);
                if (indexOf3 >= 0) {
                    arrayList5.set(indexOf3, null);
                }
                ArrayList arrayList6 = this.f10353b;
                arrayList6.add(gVar);
                if (arrayList6.size() == 2) {
                    ((ee0) this.f10354c).b();
                    return;
                }
                return;
        }
    }
}
