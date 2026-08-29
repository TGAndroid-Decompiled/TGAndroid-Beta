package lh;

import android.view.ScaleGestureDetector;
import java.util.ArrayList;
import org.telegram.ui.Components.yf0;
public final class e1 implements o1.g {
    public final int f15571a;
    public final ArrayList f15572b;
    public final ScaleGestureDetector.OnScaleGestureListener f15573c;

    public e1(ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener, ArrayList arrayList, int i10) {
        this.f15571a = i10;
        this.f15573c = onScaleGestureListener;
        this.f15572b = arrayList;
    }

    @Override
    public final void a(o1.i iVar, boolean z10, float f9, float f10) {
        switch (this.f15571a) {
            case 0:
                ArrayList arrayList = iVar.f19043k;
                int indexOf = arrayList.indexOf(this);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, null);
                }
                ArrayList arrayList2 = this.f15572b;
                arrayList2.add((o1.k) iVar);
                if (arrayList2.size() == 2) {
                    ((f1) this.f15573c).a();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList3 = iVar.f19043k;
                int indexOf2 = arrayList3.indexOf(this);
                if (indexOf2 >= 0) {
                    arrayList3.set(indexOf2, null);
                }
                ArrayList arrayList4 = this.f15572b;
                arrayList4.add((o1.k) iVar);
                if (arrayList4.size() == 2) {
                    ((yf0) this.f15573c).b();
                    return;
                }
                return;
            default:
                ArrayList arrayList5 = iVar.f19043k;
                int indexOf3 = arrayList5.indexOf(this);
                if (indexOf3 >= 0) {
                    arrayList5.set(indexOf3, null);
                }
                ArrayList arrayList6 = this.f15572b;
                arrayList6.add((o1.k) iVar);
                if (arrayList6.size() == 2) {
                    ((yf0) this.f15573c).b();
                    return;
                }
                return;
        }
    }
}
