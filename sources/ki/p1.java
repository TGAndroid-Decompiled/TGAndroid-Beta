package ki;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public final class p1 {
    public final SparseIntArray f18823a = new SparseIntArray();
    public final SparseIntArray f18824b = new SparseIntArray();
    public final int[] f18825c = {m6.G6, m6.f29665u8, m6.G8, m6.E8, m6.F8, m6.I5, m6.zj};
    public float d;

    public final int a(int i7) {
        return i0.a.f(this.d, this.f18823a.get(i7), this.f18824b.get(i7));
    }

    public final void b(org.telegram.ui.ActionBar.k kVar, float f10) {
        this.d = f10;
        int i7 = m6.G6;
        kVar.setTitleColor(a(i7));
        kVar.setSubtitleColor(m6.r1(0.45f, a(i7)));
        kVar.G(a(i7), false);
        ImageView imageView = kVar.f29096e;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(a(i7), PorterDuff.Mode.SRC_IN));
        }
        kVar.F(a(m6.f29665u8), false);
    }

    public final void c(SparseIntArray sparseIntArray, int i7, h6 h6Var) {
        int i10;
        int i11;
        int[] iArr = this.f18825c;
        int i12 = 0;
        if (i7 == 0) {
            while (i12 < iArr.length) {
                int i13 = iArr[i12];
                sparseIntArray.put(i13, m6.w0(i13, h6Var));
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
            if (i14 != m6.G8 && i14 != m6.E8 && i14 != m6.F8 && i14 != (i11 = m6.I5)) {
                if (i14 == m6.zj) {
                    sparseIntArray.put(i14, i0.a.f(0.5f, i7, i10));
                } else if (i14 != m6.f29665u8 && i14 != i11) {
                    sparseIntArray.put(i14, i10);
                } else {
                    sparseIntArray.put(i14, o4);
                }
            } else {
                sparseIntArray.put(i14, m6.w0(i14, h6Var));
            }
            i12++;
        }
    }
}
