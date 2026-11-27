package defpackage;

import java.util.ArrayList;
public final class mbc implements Runnable {
    public final byte a;
    public final sbc b;

    public mbc(sbc sbcVar, byte b) {
        this.a = b;
        this.b = sbcVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        sbc sbcVar = this.b;
        switch (b) {
            case 0:
                sbcVar.d1(true);
                return;
            case 1:
                sbcVar.Y1.setVisibility(8);
                return;
            case 2:
                sbcVar.Z0();
                sbcVar.h1(true, false);
                return;
            case 3:
                ni7 ni7Var = sbcVar.U1;
                ni7Var.b.r(ob6.M0(2131745564, null), true);
                return;
            case 4:
                ni7 ni7Var2 = sbcVar.U1;
                ni7Var2.b.r(ob6.M0(2131749439, null), true);
                return;
            case 5:
                sbcVar.Z0();
                sbcVar.h1(true, false);
                return;
            case 6:
                sbcVar.Y1.setVisibility(8);
                return;
            case 7:
                ArrayList arrayList = sbcVar.d2;
                if (arrayList.isEmpty()) {
                    arrayList.addAll(ls6.d0(sbcVar.a).j1);
                    sbcVar.g1(true, true);
                    return;
                }
                return;
            case 8:
                sbcVar.Z0();
                sbcVar.h1(true, false);
                return;
            case 9:
                sbcVar.g1(true, true);
                return;
            case 10:
                sbcVar.dismiss();
                return;
            default:
                sbcVar.Z0();
                sbcVar.h1(true, false);
                return;
        }
    }
}
