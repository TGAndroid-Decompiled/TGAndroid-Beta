package defpackage;

import android.util.SparseIntArray;
public final class e53 extends f53 {
    public final byte g;

    public e53() {
        this.g = (byte) 0;
        this.b.put(bkb.c6, -14537933);
        this.b.put(bkb.g5, -14537933);
        this.b.put(bkb.Z6, -13616313);
        this.b.put(bkb.d7, -14142917);
        this.b.put(bkb.e7, -8090220);
        this.b.put(bkb.Si, -14142917);
        this.b.put(bkb.F8, -13616313);
        this.b.put(bkb.G8, -14733761);
        this.b.put(bkb.E8, -1);
        this.b.put(bkb.D8, -1);
        this.b.put(bkb.vj, -231982259);
        this.b.put(bkb.u6, -11683585);
        this.b.put(bkb.t6, -10637330);
        this.b.put(bkb.V6, -12692893);
        this.b.put(bkb.h7, -15033089);
    }

    @Override
    public final void k() {
        byte b = this.g;
        SparseIntArray sparseIntArray = this.b;
        switch (b) {
            case 1:
                sparseIntArray.put(bkb.c7, 352321535);
                return;
            case 2:
                sparseIntArray.append(bkb.g5, -14671840);
                return;
            case 3:
                int i = bkb.Z6;
                int i2 = bkb.g5;
                sparseIntArray.put(i, h(i2));
                sparseIntArray.put(bkb.c7, -15264235);
                sparseIntArray.put(bkb.Ne, bkb.p1(0.45f, -1));
                sparseIntArray.put(bkb.h5, 352321535);
                sparseIntArray.put(bkb.yf, h(i2));
                return;
            default:
                return;
        }
    }

    public e53(byte b) {
        this.g = b;
    }
}
