package hi;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
public final class t1 {
    public final SparseIntArray f14958a = new SparseIntArray();
    public final SparseIntArray f14959b = new SparseIntArray();
    public final int[] f14960c = {l6.G6, l6.f28183u8, l6.G8, l6.E8, l6.F8, l6.I5, l6.wj};
    public float d;

    public final int a(int i7) {
        return i0.a.f(this.d, this.f14958a.get(i7), this.f14959b.get(i7));
    }

    public final void b(org.telegram.ui.ActionBar.k kVar, float f10) {
        this.d = f10;
        int i7 = l6.G6;
        kVar.setTitleColor(a(i7));
        kVar.setSubtitleColor(l6.r1(0.45f, a(i7)));
        kVar.E(a(i7), false);
        ImageView imageView = kVar.f27645e;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(a(i7), PorterDuff.Mode.SRC_IN));
        }
        kVar.D(a(l6.f28183u8), false);
    }

    public final void c(SparseIntArray sparseIntArray, int i7, g6 g6Var) {
        int i10;
        int i11;
        int[] iArr = this.f14960c;
        int i12 = 0;
        if (i7 == 0) {
            while (i12 < iArr.length) {
                int i13 = iArr[i12];
                sparseIntArray.put(i13, l6.w0(i13, g6Var));
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
            if (i14 != l6.G8 && i14 != l6.E8 && i14 != l6.F8 && i14 != (i11 = l6.I5)) {
                if (i14 == l6.wj) {
                    sparseIntArray.put(i14, i0.a.f(0.5f, i7, i10));
                } else if (i14 != l6.f28183u8 && i14 != i11) {
                    sparseIntArray.put(i14, i10);
                } else {
                    sparseIntArray.put(i14, o4);
                }
            } else {
                sparseIntArray.put(i14, l6.w0(i14, g6Var));
            }
            i12++;
        }
    }
}
