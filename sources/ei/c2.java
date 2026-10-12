package ei;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
public final class c2 {
    public final SparseIntArray f8989a = new SparseIntArray();
    public final SparseIntArray f8990b = new SparseIntArray();
    public final int[] f8991c = {h6.G6, h6.f20877u8, h6.G8, h6.E8, h6.F8, h6.I5, h6.Ii};
    public float d;

    public final int a(int i10) {
        return i0.a.d(this.d, this.f8989a.get(i10), this.f8990b.get(i10));
    }

    public final void b(org.telegram.ui.ActionBar.k kVar, float f7) {
        this.d = f7;
        int i10 = h6.G6;
        kVar.setTitleColor(a(i10));
        kVar.setSubtitleColor(h6.m1(0.45f, a(i10)));
        kVar.E(a(i10), false);
        ImageView imageView = kVar.f21042e;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(a(i10), PorterDuff.Mode.SRC_IN));
        }
        kVar.D(a(h6.f20877u8), false);
    }

    public final void c(SparseIntArray sparseIntArray, int i10, c6 c6Var) {
        int i11;
        int i12;
        int[] iArr = this.f8991c;
        int i13 = 0;
        if (i10 == 0) {
            while (i13 < iArr.length) {
                int i14 = iArr[i13];
                sparseIntArray.put(i14, h6.w0(i14, c6Var));
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
            if (i15 != h6.G8 && i15 != h6.E8 && i15 != h6.F8 && i15 != (i12 = h6.I5)) {
                if (i15 == h6.Ii) {
                    sparseIntArray.put(i15, i0.a.d(0.5f, i10, i11));
                } else if (i15 != h6.f20877u8 && i15 != i12) {
                    sparseIntArray.put(i15, i11);
                } else {
                    sparseIntArray.put(i15, k10);
                }
            } else {
                sparseIntArray.put(i15, h6.w0(i15, c6Var));
            }
            i13++;
        }
    }
}
