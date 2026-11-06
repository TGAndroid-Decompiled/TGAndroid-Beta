package hi;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
public final class t1 {
    public final SparseIntArray f14955a = new SparseIntArray();
    public final SparseIntArray f14956b = new SparseIntArray();
    public final int[] f14957c = {k6.G6, k6.f28167u8, k6.G8, k6.E8, k6.F8, k6.I5, k6.wj};
    public float d;

    public final int a(int i7) {
        return i0.a.f(this.d, this.f14955a.get(i7), this.f14956b.get(i7));
    }

    public final void b(org.telegram.ui.ActionBar.k kVar, float f10) {
        this.d = f10;
        int i7 = k6.G6;
        kVar.setTitleColor(a(i7));
        kVar.setSubtitleColor(k6.r1(0.45f, a(i7)));
        kVar.D(a(i7), false);
        ImageView imageView = kVar.f27658e;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(a(i7), PorterDuff.Mode.SRC_IN));
        }
        kVar.C(a(k6.f28167u8), false);
    }

    public final void c(SparseIntArray sparseIntArray, int i7, f6 f6Var) {
        int i10;
        int i11;
        int[] iArr = this.f14957c;
        int i12 = 0;
        if (i7 == 0) {
            while (i12 < iArr.length) {
                int i13 = iArr[i12];
                sparseIntArray.put(i13, k6.w0(i13, f6Var));
                i12++;
            }
            return;
        }
        if (i0.a.h(i7) < 0.5d) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        int o4 = i0.a.o(i10, 60);
        while (i12 < iArr.length) {
            int i14 = iArr[i12];
            if (i14 != k6.G8 && i14 != k6.E8 && i14 != k6.F8 && i14 != (i11 = k6.I5)) {
                if (i14 == k6.wj) {
                    sparseIntArray.put(i14, i0.a.f(0.5f, i7, i10));
                } else if (i14 != k6.f28167u8 && i14 != i11) {
                    sparseIntArray.put(i14, i10);
                } else {
                    sparseIntArray.put(i14, o4);
                }
            } else {
                sparseIntArray.put(i14, k6.w0(i14, f6Var));
            }
            i12++;
        }
    }
}
