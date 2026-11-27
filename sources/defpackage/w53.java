package defpackage;

import android.util.SparseIntArray;
public final class w53 extends x53 {
    public final byte g;

    public w53() {
        this.g = (byte) 0;
        this.b.put(aob.d6, -14537933);
        this.b.put(aob.h5, -14537933);
        this.b.put(aob.a7, -13616313);
        this.b.put(aob.e7, -14142917);
        this.b.put(aob.f7, -8090220);
        this.b.put(aob.Ti, -14142917);
        this.b.put(aob.G8, -13616313);
        this.b.put(aob.H8, -14733761);
        this.b.put(aob.F8, -1);
        this.b.put(aob.E8, -1);
        this.b.put(aob.wj, -231982259);
        this.b.put(aob.v6, -11683585);
        this.b.put(aob.u6, -10637330);
        this.b.put(aob.W6, -12692893);
        this.b.put(aob.i7, -15033089);
    }

    @Override
    public final void k() {
        byte b = this.g;
        SparseIntArray sparseIntArray = this.b;
        switch (b) {
            case 1:
                sparseIntArray.put(aob.d7, 352321535);
                return;
            case 2:
                sparseIntArray.append(aob.h5, -14671840);
                return;
            case 3:
                int i = aob.a7;
                int i2 = aob.h5;
                sparseIntArray.put(i, h(i2));
                sparseIntArray.put(aob.d7, -15264235);
                sparseIntArray.put(aob.Oe, aob.p1(0.45f, -1));
                sparseIntArray.put(aob.i5, 352321535);
                sparseIntArray.put(aob.zf, h(i2));
                return;
            default:
                return;
        }
    }

    public w53(byte b) {
        this.g = b;
    }
}
