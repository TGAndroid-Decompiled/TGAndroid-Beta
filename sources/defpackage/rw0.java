package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.a;
public final class rw0 {
    public final SparseIntArray a = new SparseIntArray();
    public final SparseIntArray b = new SparseIntArray();
    public final int[] c = {cmb.F6, cmb.t8, cmb.F8, cmb.D8, cmb.E8, cmb.H5, cmb.yj};
    public float d;

    public final int a(int i) {
        return on2.f(this.d, this.a.get(i), this.b.get(i));
    }

    public final void b(a aVar, float f) {
        this.d = f;
        int i = cmb.F6;
        aVar.setTitleColor(a(i));
        aVar.setSubtitleColor(cmb.p1(0.45f, a(i)));
        aVar.H(a(i), false);
        ImageView imageView = aVar.e;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(a(i), PorterDuff.Mode.SRC_IN));
        }
        aVar.G(a(cmb.t8), false);
    }

    public final void c(SparseIntArray sparseIntArray, int i, ylb ylbVar) {
        int i2;
        int i3;
        int[] iArr = this.c;
        int i4 = 0;
        if (i == 0) {
            while (i4 < iArr.length) {
                int i5 = iArr[i4];
                sparseIntArray.put(i5, cmb.v0(i5, ylbVar));
                i4++;
            }
            return;
        }
        if (on2.h(i) < 0.5d) {
            i2 = -1;
        } else {
            i2 = -16777216;
        }
        int p = on2.p(i2, 60);
        while (i4 < iArr.length) {
            int i6 = iArr[i4];
            if (i6 != cmb.F8 && i6 != cmb.D8 && i6 != cmb.E8 && i6 != (i3 = cmb.H5)) {
                if (i6 == cmb.yj) {
                    sparseIntArray.put(i6, on2.f(0.5f, i, i2));
                } else if (i6 != cmb.t8 && i6 != i3) {
                    sparseIntArray.put(i6, i2);
                } else {
                    sparseIntArray.put(i6, p);
                }
            } else {
                sparseIntArray.put(i6, cmb.v0(i6, ylbVar));
            }
            i4++;
        }
    }
}
