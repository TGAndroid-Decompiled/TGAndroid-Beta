package di;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class f2 {
    public final SparseIntArray f6625a = new SparseIntArray();
    public final SparseIntArray f6626b = new SparseIntArray();
    public final int[] f6627c = {j6.G6, j6.f18238u8, j6.G8, j6.E8, j6.F8, j6.I5, j6.Ii};
    public float d;

    public final int a(int i10) {
        return i0.a.d(this.d, this.f6625a.get(i10), this.f6626b.get(i10));
    }

    public final void b(org.telegram.ui.ActionBar.l lVar, float f7) {
        this.d = f7;
        int i10 = j6.G6;
        lVar.setTitleColor(a(i10));
        lVar.setSubtitleColor(j6.l1(0.45f, a(i10)));
        lVar.C(a(i10), false);
        ImageView imageView = lVar.e;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(a(i10), PorterDuff.Mode.SRC_IN));
        }
        lVar.A(a(j6.f18238u8), false);
    }

    public final void c(SparseIntArray sparseIntArray, int i10, f6 f6Var) {
        int i11;
        int i12;
        int[] iArr = this.f6627c;
        int i13 = 0;
        if (i10 == 0) {
            while (i13 < iArr.length) {
                int i14 = iArr[i13];
                sparseIntArray.put(i14, j6.v0(i14, f6Var));
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
            if (i15 != j6.G8 && i15 != j6.E8 && i15 != j6.F8 && i15 != (i12 = j6.I5)) {
                if (i15 == j6.Ii) {
                    sparseIntArray.put(i15, i0.a.d(0.5f, i10, i11));
                } else if (i15 != j6.f18238u8 && i15 != i12) {
                    sparseIntArray.put(i15, i11);
                } else {
                    sparseIntArray.put(i15, k10);
                }
            } else {
                sparseIntArray.put(i15, j6.v0(i15, f6Var));
            }
            i13++;
        }
    }
}
