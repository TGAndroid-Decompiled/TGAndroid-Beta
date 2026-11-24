package defpackage;

import java.util.ArrayList;
public final class n9c implements Runnable {
    public final byte a;
    public final t9c b;

    public n9c(t9c t9cVar, byte b) {
        this.a = b;
        this.b = t9cVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        t9c t9cVar = this.b;
        switch (b) {
            case 0:
                t9cVar.c1(true);
                return;
            case 1:
                t9cVar.Y1.setVisibility(8);
                return;
            case 2:
                t9cVar.Y0();
                t9cVar.g1(true, false);
                return;
            case 3:
                gi7 gi7Var = t9cVar.U1;
                gi7Var.b.r(jb6.M0(2131745570, null), true);
                return;
            case 4:
                gi7 gi7Var2 = t9cVar.U1;
                gi7Var2.b.r(jb6.M0(2131749427, null), true);
                return;
            case 5:
                t9cVar.Y0();
                t9cVar.g1(true, false);
                return;
            case 6:
                ArrayList arrayList = t9cVar.d2;
                if (arrayList.isEmpty()) {
                    arrayList.addAll(hs6.d0(t9cVar.a).j1);
                    t9cVar.f1(true, true);
                    return;
                }
                return;
            case 7:
                t9cVar.Y1.setVisibility(8);
                return;
            case 8:
                t9cVar.Y0();
                t9cVar.g1(true, false);
                return;
            case 9:
                t9cVar.f1(true, true);
                return;
            case 10:
                t9cVar.dismiss();
                return;
            default:
                t9cVar.Y0();
                t9cVar.g1(true, false);
                return;
        }
    }
}
