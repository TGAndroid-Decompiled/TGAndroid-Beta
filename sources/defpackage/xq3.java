package defpackage;

import java.util.ArrayList;
public final class xq3 implements Runnable {
    public final byte a;
    public final pcc b;
    public final ArrayList c;

    public xq3(pcc pccVar, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = pccVar;
        this.c = arrayList;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.c;
        pcc pccVar = this.b;
        switch (b) {
            case 0:
                pccVar.a(arrayList);
                return;
            default:
                if (pccVar != null) {
                    pccVar.a(arrayList);
                    return;
                }
                return;
        }
    }
}
