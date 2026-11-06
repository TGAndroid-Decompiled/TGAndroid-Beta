package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
public final class v4 implements Runnable {
    public final int f25940a;
    public final g5 f25941b;
    public final HashMap f25942c;
    public final ArrayList d;
    public final HashMap f25943e;

    public v4(g5 g5Var, ArrayList arrayList, HashMap hashMap, HashMap hashMap2) {
        this.f25940a = 4;
        this.f25941b = g5Var;
        this.d = arrayList;
        this.f25942c = hashMap;
        this.f25943e = hashMap2;
    }

    @Override
    public final void run() {
        switch (this.f25940a) {
            case 0:
                HashMap hashMap = this.f25943e;
                g5 g5Var = this.f25941b;
                g5Var.E(this.f25942c, this.d, hashMap, true);
                g5Var.N();
                g5Var.getNotificationCenter().k(25, new Object[0]);
                g5Var.getNotificationCenter().k(26, new Object[0]);
                return;
            case 1:
                HashMap hashMap2 = this.f25943e;
                g5 g5Var2 = this.f25941b;
                g5Var2.E(this.f25942c, this.d, hashMap2, true);
                g5Var2.N();
                g5Var2.getNotificationCenter().k(25, new Object[0]);
                g5Var2.getNotificationCenter().k(26, new Object[0]);
                return;
            case 2:
                this.f25941b.E(this.f25942c, this.d, this.f25943e, true);
                return;
            case 3:
                HashMap hashMap3 = this.f25943e;
                g5 g5Var3 = this.f25941b;
                g5Var3.E(this.f25942c, this.d, hashMap3, true);
                g5Var3.getNotificationCenter().k(26, new Object[0]);
                return;
            default:
                g5 g5Var4 = this.f25941b;
                g5Var4.f22586c0 = this.d;
                g5Var4.f22587d0 = this.f25942c;
                g5Var4.f22584b0 = this.f25943e;
                return;
        }
    }

    public v4(g5 g5Var, HashMap hashMap, ArrayList arrayList, HashMap hashMap2, int i7) {
        this.f25940a = i7;
        this.f25941b = g5Var;
        this.f25942c = hashMap;
        this.d = arrayList;
        this.f25943e = hashMap2;
    }
}
