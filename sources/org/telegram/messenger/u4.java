package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
public final class u4 implements Runnable {
    public final int f25728a;
    public final g5 f25729b;
    public final HashMap f25730c;
    public final ArrayList d;
    public final HashMap f25731e;

    public u4(g5 g5Var, ArrayList arrayList, HashMap hashMap, HashMap hashMap2) {
        this.f25728a = 4;
        this.f25729b = g5Var;
        this.d = arrayList;
        this.f25730c = hashMap;
        this.f25731e = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f25728a) {
            case 0:
                HashMap hashMap = this.f25731e;
                g5 g5Var = this.f25729b;
                g5Var.E(this.f25730c, this.d, hashMap, true);
                g5Var.N();
                g5Var.getNotificationCenter().k(25, new Object[0]);
                g5Var.getNotificationCenter().k(26, new Object[0]);
                return;
            case 1:
                HashMap hashMap2 = this.f25731e;
                g5 g5Var2 = this.f25729b;
                g5Var2.E(this.f25730c, this.d, hashMap2, true);
                g5Var2.N();
                g5Var2.getNotificationCenter().k(25, new Object[0]);
                g5Var2.getNotificationCenter().k(26, new Object[0]);
                return;
            case 2:
                this.f25729b.E(this.f25730c, this.d, this.f25731e, true);
                return;
            case 3:
                HashMap hashMap3 = this.f25731e;
                g5 g5Var3 = this.f25729b;
                g5Var3.E(this.f25730c, this.d, hashMap3, true);
                g5Var3.getNotificationCenter().k(26, new Object[0]);
                return;
            default:
                g5 g5Var4 = this.f25729b;
                g5Var4.f22605c0 = this.d;
                g5Var4.f22606d0 = this.f25730c;
                g5Var4.f22603b0 = this.f25731e;
                return;
        }
    }

    public u4(g5 g5Var, HashMap hashMap, ArrayList arrayList, HashMap hashMap2, int i7) {
        this.f25728a = i7;
        this.f25729b = g5Var;
        this.f25730c = hashMap;
        this.d = arrayList;
        this.f25731e = hashMap2;
    }
}
