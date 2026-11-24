package defpackage;

import android.util.SparseIntArray;
public final class q63 extends r63 {
    public final byte g;

    public q63() {
        this.g = (byte) 0;
        this.b.put(cmb.c6, -14537933);
        this.b.put(cmb.g5, -14537933);
        this.b.put(cmb.Z6, -13616313);
        this.b.put(cmb.d7, -14142917);
        this.b.put(cmb.e7, -8090220);
        this.b.put(cmb.Si, -14142917);
        this.b.put(cmb.F8, -13616313);
        this.b.put(cmb.G8, -14733761);
        this.b.put(cmb.E8, -1);
        this.b.put(cmb.D8, -1);
        this.b.put(cmb.vj, -231982259);
        this.b.put(cmb.u6, -11683585);
        this.b.put(cmb.t6, -10637330);
        this.b.put(cmb.V6, -12692893);
        this.b.put(cmb.h7, -15033089);
    }

    @Override
    public final void k() {
        byte b = this.g;
        SparseIntArray sparseIntArray = this.b;
        switch (b) {
            case 1:
                sparseIntArray.put(cmb.c7, 352321535);
                return;
            case 2:
                sparseIntArray.append(cmb.g5, -14671840);
                return;
            case 3:
                int i = cmb.Z6;
                int i2 = cmb.g5;
                sparseIntArray.put(i, h(i2));
                sparseIntArray.put(cmb.c7, -15264235);
                sparseIntArray.put(cmb.Ne, cmb.p1(0.45f, -1));
                sparseIntArray.put(cmb.h5, 352321535);
                sparseIntArray.put(cmb.yf, h(i2));
                return;
            default:
                return;
        }
    }

    public q63(byte b) {
        this.g = b;
    }
}
