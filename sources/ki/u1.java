package ki;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
public final class u1 {
    public final SparseIntArray f18583a = new SparseIntArray();
    public final SparseIntArray f18584b = new SparseIntArray();
    public final int[] f18585c = {j6.G6, j6.f29167u8, j6.G8, j6.E8, j6.F8, j6.I5, j6.zj};
    public float d;

    public final int a(int i7) {
        return i0.a.f(this.d, this.f18583a.get(i7), this.f18584b.get(i7));
    }

    public final void b(org.telegram.ui.ActionBar.k kVar, float f10) {
        this.d = f10;
        int i7 = j6.G6;
        kVar.setTitleColor(a(i7));
        kVar.setSubtitleColor(j6.r1(0.45f, a(i7)));
        kVar.H(a(i7), false);
        ImageView imageView = kVar.f29284e;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(a(i7), PorterDuff.Mode.SRC_IN));
        }
        kVar.F(a(j6.f29167u8), false);
    }

    public final void c(SparseIntArray sparseIntArray, int i7, e6 e6Var) {
        int i10;
        int i11;
        int[] iArr = this.f18585c;
        int i12 = 0;
        if (i7 == 0) {
            while (i12 < iArr.length) {
                int i13 = iArr[i12];
                sparseIntArray.put(i13, j6.w0(i13, e6Var));
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
            if (i14 != j6.G8 && i14 != j6.E8 && i14 != j6.F8 && i14 != (i11 = j6.I5)) {
                if (i14 == j6.zj) {
                    sparseIntArray.put(i14, i0.a.f(0.5f, i7, i10));
                } else if (i14 != j6.f29167u8 && i14 != i11) {
                    sparseIntArray.put(i14, i10);
                } else {
                    sparseIntArray.put(i14, o4);
                }
            } else {
                sparseIntArray.put(i14, j6.w0(i14, e6Var));
            }
            i12++;
        }
    }
}
