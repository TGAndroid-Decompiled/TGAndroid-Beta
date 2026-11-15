package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ma {
    public final int f24999c;
    public l7 f25000e;
    public boolean f25001f;
    public int f25002g;
    public int h;
    public TLRPC.Peer f25003i;
    public String f25005k;
    public int f25006l;
    public int f25007m;
    public boolean f25008n;
    public final ArrayList f24997a = new ArrayList();
    public final HashMap f24998b = new HashMap();
    public int d = -1;
    public int f25004j = Integer.MAX_VALUE;

    public ma(int i7) {
        this.f24999c = i7;
    }

    public final void a() {
        if (this.d >= 0) {
            ConnectionsManager.getInstance(this.f24999c).cancelRequest(this.d, true);
            this.d = -1;
        }
        l7 l7Var = this.f25000e;
        if (l7Var != null) {
            l7Var.run();
            this.f25000e = null;
        }
        this.f24997a.clear();
        this.f24998b.clear();
        this.f25002g = 0;
        this.h = 0;
        this.f25003i = null;
        this.f25004j = 2147483637;
        this.f25005k = null;
        this.f25006l = 0;
        this.f25007m = 0;
        this.f25008n = false;
    }

    public final int b() {
        int i7 = 1;
        if (this.f25006l >= this.f24997a.size() - 1) {
            i7 = 0;
        }
        if (this.f25006l > 0) {
            return i7 | 2;
        }
        return i7;
    }
}
