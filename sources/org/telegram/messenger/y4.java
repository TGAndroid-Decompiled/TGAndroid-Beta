package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
public final class y4 implements Runnable {
    public final int f19551a;
    public final i5 f19552b;
    public final HashMap f19553c;
    public final ArrayList d;
    public final HashMap e;

    public y4(i5 i5Var, ArrayList arrayList, HashMap hashMap, HashMap hashMap2) {
        this.f19551a = 4;
        this.f19552b = i5Var;
        this.d = arrayList;
        this.f19553c = hashMap;
        this.e = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f19551a) {
            case 0:
                HashMap hashMap = this.e;
                i5 i5Var = this.f19552b;
                i5Var.E(this.f19553c, this.d, hashMap, true);
                i5Var.N();
                i5Var.getNotificationCenter().k(25, new Object[0]);
                i5Var.getNotificationCenter().k(26, new Object[0]);
                return;
            case 1:
                HashMap hashMap2 = this.e;
                i5 i5Var2 = this.f19552b;
                i5Var2.E(this.f19553c, this.d, hashMap2, true);
                i5Var2.N();
                i5Var2.getNotificationCenter().k(25, new Object[0]);
                i5Var2.getNotificationCenter().k(26, new Object[0]);
                return;
            case 2:
                this.f19552b.E(this.f19553c, this.d, this.e, true);
                return;
            case 3:
                HashMap hashMap3 = this.e;
                i5 i5Var3 = this.f19552b;
                i5Var3.E(this.f19553c, this.d, hashMap3, true);
                i5Var3.getNotificationCenter().k(26, new Object[0]);
                return;
            default:
                i5 i5Var4 = this.f19552b;
                i5Var4.f16216c0 = this.d;
                i5Var4.f16217d0 = this.f19553c;
                i5Var4.f16214b0 = this.e;
                return;
        }
    }

    public y4(i5 i5Var, HashMap hashMap, ArrayList arrayList, HashMap hashMap2, int i10) {
        this.f19551a = i10;
        this.f19552b = i5Var;
        this.f19553c = hashMap;
        this.d = arrayList;
        this.e = hashMap2;
    }
}
