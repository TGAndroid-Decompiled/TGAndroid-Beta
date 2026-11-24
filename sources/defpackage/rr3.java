package defpackage;

import java.util.ArrayList;
public final class rr3 implements Runnable {
    public final byte a;
    public final qac b;
    public final ArrayList c;

    public rr3(qac qacVar, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = qacVar;
        this.c = arrayList;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.c;
        qac qacVar = this.b;
        switch (b) {
            case 0:
                qacVar.a(arrayList);
                return;
            default:
                if (qacVar != null) {
                    qacVar.a(arrayList);
                    return;
                }
                return;
        }
    }
}
