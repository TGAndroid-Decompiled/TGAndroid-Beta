package defpackage;

import android.util.SparseIntArray;
public final class mnb extends t37 {
    public final byte U;
    public final Object V;

    public mnb(boolean z, SparseIntArray sparseIntArray, byte b) {
        super(2, z, false, null);
        this.U = b;
        this.V = sparseIntArray;
    }

    @Override
    public final int g(int i) {
        byte b = this.U;
        Object obj = this.V;
        switch (b) {
            case 0:
                SparseIntArray sparseIntArray = (SparseIntArray) obj;
                int indexOfKey = sparseIntArray.indexOfKey(i);
                if (indexOfKey > 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                return aob.hm[i];
            case 1:
                return ((SparseIntArray) obj).get(i);
            default:
                return super.g(i);
        }
    }

    @Override
    public final int i(int i) {
        byte b = this.U;
        Object obj = this.V;
        switch (b) {
            case 0:
                return ((SparseIntArray) obj).get(i);
            case 1:
                return ((SparseIntArray) obj).get(i);
            default:
                return super.i(i);
        }
    }

    @Override
    public final void o(int i, int i2, int i3) {
        switch (this.U) {
            case 2:
                if (!((pqb) this.V).f2) {
                    super.o(i, i2, i3);
                    return;
                }
                return;
            default:
                super.o(i, i2, i3);
                return;
        }
    }

    @Override
    public final void p(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        switch (this.U) {
            case 2:
                if (!((pqb) this.V).f2) {
                    super.p(i, i2, i3, i4, i5, i6, z, z2);
                    return;
                }
                return;
            default:
                super.p(i, i2, i3, i4, i5, i6, z, z2);
                return;
        }
    }

    public mnb(pqb pqbVar, int i, boolean z) {
        super(i, true, z, null);
        this.U = (byte) 2;
        this.V = pqbVar;
    }
}
