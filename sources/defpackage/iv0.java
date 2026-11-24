package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.a;
public final class iv0 {
    public final SparseIntArray a = new SparseIntArray();
    public final SparseIntArray b = new SparseIntArray();
    public final int[] c = {bkb.F6, bkb.t8, bkb.F8, bkb.D8, bkb.E8, bkb.H5, bkb.yj};
    public float d;

    public final int a(int i) {
        return bm2.f(this.d, this.a.get(i), this.b.get(i));
    }

    public final void b(a aVar, float f) {
        this.d = f;
        int i = bkb.F6;
        aVar.setTitleColor(a(i));
        aVar.setSubtitleColor(bkb.p1(0.45f, a(i)));
        aVar.H(a(i), false);
        ImageView imageView = aVar.e;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(a(i), PorterDuff.Mode.SRC_IN));
        }
        aVar.G(a(bkb.t8), false);
    }

    public final void c(SparseIntArray sparseIntArray, int i, wjb wjbVar) {
        int i2;
        int i3;
        int[] iArr = this.c;
        int i4 = 0;
        if (i == 0) {
            while (i4 < iArr.length) {
                int i5 = iArr[i4];
                sparseIntArray.put(i5, bkb.v0(i5, wjbVar));
                i4++;
            }
            return;
        }
        if (bm2.h(i) < 0.5d) {
            i2 = -1;
        } else {
            i2 = -16777216;
        }
        int o = bm2.o(i2, 60);
        while (i4 < iArr.length) {
            int i6 = iArr[i4];
            if (i6 != bkb.F8 && i6 != bkb.D8 && i6 != bkb.E8 && i6 != (i3 = bkb.H5)) {
                if (i6 == bkb.yj) {
                    sparseIntArray.put(i6, bm2.f(0.5f, i, i2));
                } else if (i6 != bkb.t8 && i6 != i3) {
                    sparseIntArray.put(i6, i2);
                } else {
                    sparseIntArray.put(i6, o);
                }
            } else {
                sparseIntArray.put(i6, bkb.v0(i6, wjbVar));
            }
            i4++;
        }
    }
}
