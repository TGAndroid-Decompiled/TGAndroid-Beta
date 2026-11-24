package defpackage;

import java.util.ArrayList;
public final class m7c implements Runnable {
    public final byte a;
    public final s7c b;

    public m7c(s7c s7cVar, byte b) {
        this.a = b;
        this.b = s7cVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        s7c s7cVar = this.b;
        switch (b) {
            case 0:
                s7cVar.c1(true);
                return;
            case 1:
                s7cVar.Y1.setVisibility(8);
                return;
            case 2:
                s7cVar.Y0();
                s7cVar.g1(true, false);
                return;
            case 3:
                dg7 dg7Var = s7cVar.U1;
                dg7Var.b.r(k96.M0(2131745644, null), true);
                return;
            case 4:
                dg7 dg7Var2 = s7cVar.U1;
                dg7Var2.b.r(k96.M0(2131749478, null), true);
                return;
            case 5:
                s7cVar.Y0();
                s7cVar.g1(true, false);
                return;
            case 6:
                ArrayList arrayList = s7cVar.d2;
                if (arrayList.isEmpty()) {
                    arrayList.addAll(hq6.d0(s7cVar.a).j1);
                    s7cVar.f1(true, true);
                    return;
                }
                return;
            case 7:
                s7cVar.Y1.setVisibility(8);
                return;
            case 8:
                s7cVar.Y0();
                s7cVar.g1(true, false);
                return;
            case 9:
                s7cVar.f1(true, true);
                return;
            case 10:
                s7cVar.dismiss();
                return;
            default:
                s7cVar.Y0();
                s7cVar.g1(true, false);
                return;
        }
    }
}
