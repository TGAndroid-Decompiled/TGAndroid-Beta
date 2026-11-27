package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseIntArray;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.a;
public final class sv0 {
    public final SparseIntArray a = new SparseIntArray();
    public final SparseIntArray b = new SparseIntArray();
    public final int[] c = {aob.G6, aob.u8, aob.G8, aob.E8, aob.F8, aob.I5, aob.zj};
    public float d;

    public final int a(int i) {
        return vm2.f(this.d, this.a.get(i), this.b.get(i));
    }

    public final void b(a aVar, float f) {
        this.d = f;
        int i = aob.G6;
        aVar.setTitleColor(a(i));
        aVar.setSubtitleColor(aob.p1(0.45f, a(i)));
        aVar.H(a(i), false);
        ImageView imageView = aVar.e;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(a(i), PorterDuff.Mode.SRC_IN));
        }
        aVar.G(a(aob.u8), false);
    }

    public final void c(SparseIntArray sparseIntArray, int i, vnb vnbVar) {
        int i2;
        int i3;
        int[] iArr = this.c;
        int i4 = 0;
        if (i == 0) {
            while (i4 < iArr.length) {
                int i5 = iArr[i4];
                sparseIntArray.put(i5, aob.v0(i5, vnbVar));
                i4++;
            }
            return;
        }
        if (vm2.h(i) < 0.5d) {
            i2 = -1;
        } else {
            i2 = -16777216;
        }
        int o = vm2.o(i2, 60);
        while (i4 < iArr.length) {
            int i6 = iArr[i4];
            if (i6 != aob.G8 && i6 != aob.E8 && i6 != aob.F8 && i6 != (i3 = aob.I5)) {
                if (i6 == aob.zj) {
                    sparseIntArray.put(i6, vm2.f(0.5f, i, i2));
                } else if (i6 != aob.u8 && i6 != i3) {
                    sparseIntArray.put(i6, i2);
                } else {
                    sparseIntArray.put(i6, o);
                }
            } else {
                sparseIntArray.put(i6, aob.v0(i6, vnbVar));
            }
            i4++;
        }
    }
}
