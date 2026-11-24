package defpackage;

import android.util.SparseIntArray;
import org.telegram.ui.PrivacyControlActivity;
public final class vj8 extends zde {
    public int a;
    public final SparseIntArray b = new SparseIntArray();
    public final SparseIntArray c = new SparseIntArray();
    public final PrivacyControlActivity d;

    public vj8(PrivacyControlActivity privacyControlActivity) {
        this.d = privacyControlActivity;
    }

    public static void f(int i, int i2, SparseIntArray sparseIntArray) {
        if (i2 >= 0) {
            sparseIntArray.put(i2, i);
        }
    }

    @Override
    public final boolean a(int i, int i2) {
        return b(i, i2);
    }

    @Override
    public final boolean b(int i, int i2) {
        int i3 = this.b.get(i, -1);
        if (i3 == this.c.get(i2, -1) && i3 >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int c() {
        return this.d.t0;
    }

    @Override
    public final int d() {
        return this.a;
    }

    public final void e(SparseIntArray sparseIntArray) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        sparseIntArray.clear();
        PrivacyControlActivity privacyControlActivity = this.d;
        f(1, privacyControlActivity.O, sparseIntArray);
        f(2, privacyControlActivity.P, sparseIntArray);
        i = privacyControlActivity.everybodyRow;
        f(3, i, sparseIntArray);
        f(4, privacyControlActivity.Q, sparseIntArray);
        i2 = privacyControlActivity.nobodyRow;
        f(5, i2, sparseIntArray);
        f(6, privacyControlActivity.i0, sparseIntArray);
        f(7, privacyControlActivity.R, sparseIntArray);
        f(8, privacyControlActivity.T, sparseIntArray);
        f(9, privacyControlActivity.U, sparseIntArray);
        f(10, privacyControlActivity.V, sparseIntArray);
        f(11, privacyControlActivity.W, sparseIntArray);
        f(12, privacyControlActivity.X, sparseIntArray);
        f(13, privacyControlActivity.Y, sparseIntArray);
        f(14, privacyControlActivity.Z, sparseIntArray);
        f(15, privacyControlActivity.a0, sparseIntArray);
        i3 = privacyControlActivity.photoForRestRow;
        f(16, i3, sparseIntArray);
        i4 = privacyControlActivity.currentPhotoForRestRow;
        f(17, i4, sparseIntArray);
        f(18, privacyControlActivity.b0, sparseIntArray);
        f(19, privacyControlActivity.c0, sparseIntArray);
        f(20, privacyControlActivity.d0, sparseIntArray);
        f(21, privacyControlActivity.e0, sparseIntArray);
        i5 = privacyControlActivity.readRow;
        f(22, i5, sparseIntArray);
        f(23, privacyControlActivity.f0, sparseIntArray);
        f(24, privacyControlActivity.g0, sparseIntArray);
        f(25, privacyControlActivity.h0, sparseIntArray);
        f(26, privacyControlActivity.j0, sparseIntArray);
        i6 = privacyControlActivity.priceRow;
        f(27, i6, sparseIntArray);
        f(28, privacyControlActivity.l0, sparseIntArray);
        i7 = privacyControlActivity.showGiftIconRow;
        f(29, i7, sparseIntArray);
        f(30, privacyControlActivity.m0, sparseIntArray);
        i8 = privacyControlActivity.giftTypesHeaderRow;
        f(31, i8, sparseIntArray);
        f(32, privacyControlActivity.o0, sparseIntArray);
        f(33, privacyControlActivity.n0, sparseIntArray);
        f(34, privacyControlActivity.p0, sparseIntArray);
        f(35, privacyControlActivity.q0, sparseIntArray);
        f(36, privacyControlActivity.r0, sparseIntArray);
        f(37, privacyControlActivity.s0, sparseIntArray);
    }
}
