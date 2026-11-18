package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
public final class w4 implements Runnable {
    public final int f27638a;
    public final i5 f27639b;
    public final HashMap f27640c;
    public final ArrayList d;
    public final HashMap f27641e;

    public w4(i5 i5Var, ArrayList arrayList, HashMap hashMap, HashMap hashMap2) {
        this.f27638a = 4;
        this.f27639b = i5Var;
        this.d = arrayList;
        this.f27640c = hashMap;
        this.f27641e = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f27638a) {
            case 0:
                HashMap hashMap = this.f27641e;
                i5 i5Var = this.f27639b;
                i5Var.E(this.f27640c, this.d, hashMap, true);
                i5Var.N();
                i5Var.getNotificationCenter().k(25, new Object[0]);
                i5Var.getNotificationCenter().k(26, new Object[0]);
                return;
            case 1:
                HashMap hashMap2 = this.f27641e;
                i5 i5Var2 = this.f27639b;
                i5Var2.E(this.f27640c, this.d, hashMap2, true);
                i5Var2.N();
                i5Var2.getNotificationCenter().k(25, new Object[0]);
                i5Var2.getNotificationCenter().k(26, new Object[0]);
                return;
            case 2:
                this.f27639b.E(this.f27640c, this.d, this.f27641e, true);
                return;
            case 3:
                HashMap hashMap3 = this.f27641e;
                i5 i5Var3 = this.f27639b;
                i5Var3.E(this.f27640c, this.d, hashMap3, true);
                i5Var3.getNotificationCenter().k(26, new Object[0]);
                return;
            default:
                i5 i5Var4 = this.f27639b;
                i5Var4.f24563d0 = this.d;
                i5Var4.f24565e0 = this.f27640c;
                i5Var4.f24562c0 = this.f27641e;
                return;
        }
    }

    public w4(i5 i5Var, HashMap hashMap, ArrayList arrayList, HashMap hashMap2, int i7) {
        this.f27638a = i7;
        this.f27639b = i5Var;
        this.f27640c = hashMap;
        this.d = arrayList;
        this.f27641e = hashMap2;
    }
}
