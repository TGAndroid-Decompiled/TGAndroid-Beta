package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
public final class w4 implements Runnable {
    public final int f27666a;
    public final i5 f27667b;
    public final HashMap f27668c;
    public final ArrayList d;
    public final HashMap f27669e;

    public w4(i5 i5Var, ArrayList arrayList, HashMap hashMap, HashMap hashMap2) {
        this.f27666a = 4;
        this.f27667b = i5Var;
        this.d = arrayList;
        this.f27668c = hashMap;
        this.f27669e = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f27666a) {
            case 0:
                HashMap hashMap = this.f27669e;
                i5 i5Var = this.f27667b;
                i5Var.E(this.f27668c, this.d, hashMap, true);
                i5Var.N();
                i5Var.getNotificationCenter().k(25, new Object[0]);
                i5Var.getNotificationCenter().k(26, new Object[0]);
                return;
            case 1:
                HashMap hashMap2 = this.f27669e;
                i5 i5Var2 = this.f27667b;
                i5Var2.E(this.f27668c, this.d, hashMap2, true);
                i5Var2.N();
                i5Var2.getNotificationCenter().k(25, new Object[0]);
                i5Var2.getNotificationCenter().k(26, new Object[0]);
                return;
            case 2:
                this.f27667b.E(this.f27668c, this.d, this.f27669e, true);
                return;
            case 3:
                HashMap hashMap3 = this.f27669e;
                i5 i5Var3 = this.f27667b;
                i5Var3.E(this.f27668c, this.d, hashMap3, true);
                i5Var3.getNotificationCenter().k(26, new Object[0]);
                return;
            default:
                i5 i5Var4 = this.f27667b;
                i5Var4.f24591d0 = this.d;
                i5Var4.f24593e0 = this.f27668c;
                i5Var4.f24590c0 = this.f27669e;
                return;
        }
    }

    public w4(i5 i5Var, HashMap hashMap, ArrayList arrayList, HashMap hashMap2, int i7) {
        this.f27666a = i7;
        this.f27667b = i5Var;
        this.f27668c = hashMap;
        this.d = arrayList;
        this.f27669e = hashMap2;
    }
}
