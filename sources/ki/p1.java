package ki;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
public final class p1 {
    public final SparseIntArray f18926a = new SparseIntArray();
    public final SparseIntArray f18927b = new SparseIntArray();
    public final int[] f18928c = {n6.G6, n6.f29769u8, n6.G8, n6.E8, n6.F8, n6.I5, n6.zj};
    public float d;

    public final int a(int i7) {
        return i0.a.f(this.d, this.f18926a.get(i7), this.f18927b.get(i7));
    }

    public final void b(org.telegram.ui.ActionBar.k kVar, float f10) {
        this.d = f10;
        int i7 = n6.G6;
        kVar.setTitleColor(a(i7));
        kVar.setSubtitleColor(n6.r1(0.45f, a(i7)));
        kVar.F(a(i7), false);
        ImageView imageView = kVar.f29146e;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(a(i7), PorterDuff.Mode.SRC_IN));
        }
        kVar.E(a(n6.f29769u8), false);
    }

    public final void c(SparseIntArray sparseIntArray, int i7, i6 i6Var) {
        int i10;
        int i11;
        int[] iArr = this.f18928c;
        int i12 = 0;
        if (i7 == 0) {
            while (i12 < iArr.length) {
                int i13 = iArr[i12];
                sparseIntArray.put(i13, n6.w0(i13, i6Var));
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
            if (i14 != n6.G8 && i14 != n6.E8 && i14 != n6.F8 && i14 != (i11 = n6.I5)) {
                if (i14 == n6.zj) {
                    sparseIntArray.put(i14, i0.a.f(0.5f, i7, i10));
                } else if (i14 != n6.f29769u8 && i14 != i11) {
                    sparseIntArray.put(i14, i10);
                } else {
                    sparseIntArray.put(i14, o4);
                }
            } else {
                sparseIntArray.put(i14, n6.w0(i14, i6Var));
            }
            i12++;
        }
    }
}
