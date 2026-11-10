package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
public final class u4 implements Runnable {
    public final int f25732a;
    public final g5 f25733b;
    public final HashMap f25734c;
    public final ArrayList d;
    public final HashMap f25735e;

    public u4(g5 g5Var, ArrayList arrayList, HashMap hashMap, HashMap hashMap2) {
        this.f25732a = 4;
        this.f25733b = g5Var;
        this.d = arrayList;
        this.f25734c = hashMap;
        this.f25735e = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f25732a) {
            case 0:
                HashMap hashMap = this.f25735e;
                g5 g5Var = this.f25733b;
                g5Var.E(this.f25734c, this.d, hashMap, true);
                g5Var.N();
                g5Var.getNotificationCenter().k(25, new Object[0]);
                g5Var.getNotificationCenter().k(26, new Object[0]);
                return;
            case 1:
                HashMap hashMap2 = this.f25735e;
                g5 g5Var2 = this.f25733b;
                g5Var2.E(this.f25734c, this.d, hashMap2, true);
                g5Var2.N();
                g5Var2.getNotificationCenter().k(25, new Object[0]);
                g5Var2.getNotificationCenter().k(26, new Object[0]);
                return;
            case 2:
                this.f25733b.E(this.f25734c, this.d, this.f25735e, true);
                return;
            case 3:
                HashMap hashMap3 = this.f25735e;
                g5 g5Var3 = this.f25733b;
                g5Var3.E(this.f25734c, this.d, hashMap3, true);
                g5Var3.getNotificationCenter().k(26, new Object[0]);
                return;
            default:
                g5 g5Var4 = this.f25733b;
                g5Var4.f22609c0 = this.d;
                g5Var4.f22610d0 = this.f25734c;
                g5Var4.f22607b0 = this.f25735e;
                return;
        }
    }

    public u4(g5 g5Var, HashMap hashMap, ArrayList arrayList, HashMap hashMap2, int i7) {
        this.f25732a = i7;
        this.f25733b = g5Var;
        this.f25734c = hashMap;
        this.d = arrayList;
        this.f25735e = hashMap2;
    }
}
