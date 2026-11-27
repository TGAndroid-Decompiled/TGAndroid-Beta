package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
public final class xu2 implements Runnable {
    public final byte a;
    public final lv2 b;
    public final HashMap c;
    public final ArrayList d;
    public final HashMap e;

    public xu2(lv2 lv2Var, ArrayList arrayList, HashMap hashMap, HashMap hashMap2) {
        this.a = (byte) 4;
        this.b = lv2Var;
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
        lv2 lv2Var = this.b;
        switch (b) {
            case 0:
                lv2Var.E(hashMap2, arrayList, hashMap, true);
                lv2Var.N();
                lv2Var.getNotificationCenter().k(25, new Object[0]);
                lv2Var.getNotificationCenter().k(26, new Object[0]);
                return;
            case 1:
                lv2Var.E(hashMap2, arrayList, hashMap, true);
                lv2Var.N();
                lv2Var.getNotificationCenter().k(25, new Object[0]);
                lv2Var.getNotificationCenter().k(26, new Object[0]);
                return;
            case 2:
                lv2Var.E(hashMap2, arrayList, hashMap, true);
                return;
            case 3:
                lv2Var.E(hashMap2, arrayList, hashMap, true);
                lv2Var.getNotificationCenter().k(26, new Object[0]);
                return;
            default:
                lv2Var.d0 = arrayList;
                lv2Var.e0 = hashMap2;
                lv2Var.c0 = hashMap;
                return;
        }
    }

    public xu2(lv2 lv2Var, HashMap hashMap, ArrayList arrayList, HashMap hashMap2, byte b) {
        this.a = b;
        this.b = lv2Var;
        this.c = hashMap;
        this.d = arrayList;
        this.e = hashMap2;
    }
}
