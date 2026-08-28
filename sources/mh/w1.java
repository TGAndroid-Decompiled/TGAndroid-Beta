package mh;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
public final class w1 {
    public final SparseIntArray f18184a = new SparseIntArray();
    public final SparseIntArray f18185b = new SparseIntArray();
    public final int[] f18186c = {f6.G6, f6.f23305u8, f6.G8, f6.E8, f6.F8, f6.I5, f6.Ii};
    public float d;

    public final int a(int i9) {
        return i0.a.d(this.d, this.f18184a.get(i9), this.f18185b.get(i9));
    }

    public final void b(org.telegram.ui.ActionBar.k kVar, float f10) {
        this.d = f10;
        int i9 = f6.G6;
        kVar.setTitleColor(a(i9));
        kVar.setSubtitleColor(f6.l1(0.45f, a(i9)));
        kVar.C(a(i9), false);
        ImageView imageView = kVar.f23565e;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(a(i9), PorterDuff.Mode.SRC_IN));
        }
        kVar.A(a(f6.f23305u8), false);
    }

    public final void c(SparseIntArray sparseIntArray, int i9, b6 b6Var) {
        int i10;
        int i11;
        int[] iArr = this.f18186c;
        int i12 = 0;
        if (i9 == 0) {
            while (i12 < iArr.length) {
                int i13 = iArr[i12];
                sparseIntArray.put(i13, f6.v0(i13, b6Var));
                i12++;
            }
            return;
        }
        if (i0.a.f(i9) < 0.5d) {
            i10 = -1;
        } else {
            i10 = -16777216;
        }
        int k10 = i0.a.k(i10, 60);
        while (i12 < iArr.length) {
            int i14 = iArr[i12];
            if (i14 != f6.G8 && i14 != f6.E8 && i14 != f6.F8 && i14 != (i11 = f6.I5)) {
                if (i14 == f6.Ii) {
                    sparseIntArray.put(i14, i0.a.d(0.5f, i9, i10));
                } else if (i14 != f6.f23305u8 && i14 != i11) {
                    sparseIntArray.put(i14, i10);
                } else {
                    sparseIntArray.put(i14, k10);
                }
            } else {
                sparseIntArray.put(i14, f6.v0(i14, b6Var));
            }
            i12++;
        }
    }
}
