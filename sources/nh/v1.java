package nh;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

public final class v1 {

    public final SparseIntArray f19001a = new SparseIntArray();

    public final SparseIntArray f19002b = new SparseIntArray();

    public final int[] f19003c = {g6.G6, g6.f23359u8, g6.G8, g6.E8, g6.F8, g6.I5, g6.Ii};
    public float d;

    public final int a(int i10) {
        return i0.b.d(this.d, this.f19001a.get(i10), this.f19002b.get(i10));
    }

    public final void b(org.telegram.ui.ActionBar.k kVar, float f10) {
        this.d = f10;
        int i10 = g6.G6;
        kVar.setTitleColor(a(i10));
        kVar.setSubtitleColor(g6.l1(0.45f, a(i10)));
        kVar.D(a(i10), false);
        ImageView imageView = kVar.f23566e;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(a(i10), PorterDuff.Mode.SRC_IN));
        }
        kVar.C(a(g6.f23359u8), false);
    }

    public final void c(SparseIntArray sparseIntArray, int i10, c6 c6Var) {
        int i11;
        int[] iArr = this.f19003c;
        int i12 = 0;
        if (i10 == 0) {
            while (i12 < iArr.length) {
                int i13 = iArr[i12];
                sparseIntArray.put(i13, g6.v0(i13, c6Var));
                i12++;
            }
            return;
        }
        int i14 = i0.b.f(i10) < 0.5d ? -1 : -16777216;
        int iK = i0.b.k(i14, 60);
        while (i12 < iArr.length) {
            int i15 = iArr[i12];
            if (i15 == g6.G8 || i15 == g6.E8 || i15 == g6.F8 || i15 == (i11 = g6.I5)) {
                sparseIntArray.put(i15, g6.v0(i15, c6Var));
            } else if (i15 == g6.Ii) {
                sparseIntArray.put(i15, i0.b.d(0.5f, i10, i14));
            } else if (i15 == g6.f23359u8 || i15 == i11) {
                sparseIntArray.put(i15, iK);
            } else {
                sparseIntArray.put(i15, i14);
            }
            i12++;
        }
    }
}
