package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
public final class du2 implements Runnable {
    public final byte a;
    public final qu2 b;
    public final HashMap c;
    public final ArrayList d;
    public final HashMap e;

    public du2(qu2 qu2Var, ArrayList arrayList, HashMap hashMap, HashMap hashMap2) {
        this.a = (byte) 4;
        this.b = qu2Var;
        this.d = arrayList;
        this.c = hashMap;
        this.e = hashMap2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        HashMap hashMap = this.e;
        HashMap hashMap2 = this.c;
        ArrayList arrayList = this.d;
        qu2 qu2Var = this.b;
        switch (b) {
            case 0:
                qu2Var.E(hashMap2, arrayList, hashMap, true);
                qu2Var.N();
                qu2Var.getNotificationCenter().k(25, new Object[0]);
                qu2Var.getNotificationCenter().k(26, new Object[0]);
                return;
            case 1:
                qu2Var.E(hashMap2, arrayList, hashMap, true);
                qu2Var.N();
                qu2Var.getNotificationCenter().k(25, new Object[0]);
                qu2Var.getNotificationCenter().k(26, new Object[0]);
                return;
            case 2:
                qu2Var.E(hashMap2, arrayList, hashMap, true);
                return;
            case 3:
                qu2Var.E(hashMap2, arrayList, hashMap, true);
                qu2Var.getNotificationCenter().k(26, new Object[0]);
                return;
            default:
                qu2Var.d0 = arrayList;
                qu2Var.e0 = hashMap2;
                qu2Var.c0 = hashMap;
                return;
        }
    }

    public du2(qu2 qu2Var, HashMap hashMap, ArrayList arrayList, HashMap hashMap2, byte b) {
        this.a = b;
        this.b = qu2Var;
        this.c = hashMap;
        this.d = arrayList;
        this.e = hashMap2;
    }
}
