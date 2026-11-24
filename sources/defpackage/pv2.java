package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
public final class pv2 implements Runnable {
    public final byte a;
    public final bw2 b;
    public final HashMap c;
    public final ArrayList d;
    public final HashMap e;

    public pv2(bw2 bw2Var, ArrayList arrayList, HashMap hashMap, HashMap hashMap2) {
        this.a = (byte) 4;
        this.b = bw2Var;
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
        bw2 bw2Var = this.b;
        switch (b) {
            case 0:
                bw2Var.E(hashMap2, arrayList, hashMap, true);
                bw2Var.N();
                bw2Var.getNotificationCenter().k(25, new Object[0]);
                bw2Var.getNotificationCenter().k(26, new Object[0]);
                return;
            case 1:
                bw2Var.E(hashMap2, arrayList, hashMap, true);
                bw2Var.N();
                bw2Var.getNotificationCenter().k(25, new Object[0]);
                bw2Var.getNotificationCenter().k(26, new Object[0]);
                return;
            case 2:
                bw2Var.E(hashMap2, arrayList, hashMap, true);
                return;
            case 3:
                bw2Var.E(hashMap2, arrayList, hashMap, true);
                bw2Var.getNotificationCenter().k(26, new Object[0]);
                return;
            default:
                bw2Var.d0 = arrayList;
                bw2Var.e0 = hashMap2;
                bw2Var.c0 = hashMap;
                return;
        }
    }

    public pv2(bw2 bw2Var, HashMap hashMap, ArrayList arrayList, HashMap hashMap2, byte b) {
        this.a = b;
        this.b = bw2Var;
        this.c = hashMap;
        this.d = arrayList;
        this.e = hashMap2;
    }
}
