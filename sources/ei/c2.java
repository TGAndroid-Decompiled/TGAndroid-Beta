package ei;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
public final class c2 {
    public final SparseIntArray f8279a = new SparseIntArray();
    public final SparseIntArray f8280b = new SparseIntArray();
    public final int[] f8281c = {i6.G6, i6.f19147u8, i6.G8, i6.E8, i6.F8, i6.I5, i6.Ii};
    public float d;

    public final int a(int i10) {
        return i0.a.d(this.d, this.f8279a.get(i10), this.f8280b.get(i10));
    }

    public final void b(org.telegram.ui.ActionBar.k kVar, float f7) {
        this.d = f7;
        int i10 = i6.G6;
        kVar.setTitleColor(a(i10));
        kVar.setSubtitleColor(i6.l1(0.45f, a(i10)));
        kVar.B(a(i10), false);
        ImageView imageView = kVar.e;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(a(i10), PorterDuff.Mode.SRC_IN));
        }
        kVar.A(a(i6.f19147u8), false);
    }

    public final void c(SparseIntArray sparseIntArray, int i10, e6 e6Var) {
        int i11;
        int i12;
        int[] iArr = this.f8281c;
        int i13 = 0;
        if (i10 == 0) {
            while (i13 < iArr.length) {
                int i14 = iArr[i13];
                sparseIntArray.put(i14, i6.v0(i14, e6Var));
                i13++;
            }
            return;
        }
        if (i0.a.f(i10) < 0.5d) {
            i11 = -1;
        } else {
            i11 = -16777216;
        }
        int k10 = i0.a.k(i11, 60);
        while (i13 < iArr.length) {
            int i15 = iArr[i13];
            if (i15 != i6.G8 && i15 != i6.E8 && i15 != i6.F8 && i15 != (i12 = i6.I5)) {
                if (i15 == i6.Ii) {
                    sparseIntArray.put(i15, i0.a.d(0.5f, i10, i11));
                } else if (i15 != i6.f19147u8 && i15 != i12) {
                    sparseIntArray.put(i15, i11);
                } else {
                    sparseIntArray.put(i15, k10);
                }
            } else {
                sparseIntArray.put(i15, i6.v0(i15, e6Var));
            }
            i13++;
        }
    }
}
