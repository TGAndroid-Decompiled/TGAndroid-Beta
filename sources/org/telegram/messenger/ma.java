package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ma {
    public final int f25005c;
    public l7 f25006e;
    public boolean f25007f;
    public int f25008g;
    public int h;
    public TLRPC.Peer f25009i;
    public String f25011k;
    public int f25012l;
    public int f25013m;
    public boolean f25014n;
    public final ArrayList f25003a = new ArrayList();
    public final HashMap f25004b = new HashMap();
    public int d = -1;
    public int f25010j = Integer.MAX_VALUE;

    public ma(int i7) {
        this.f25005c = i7;
    }

    public final void a() {
        if (this.d >= 0) {
            ConnectionsManager.getInstance(this.f25005c).cancelRequest(this.d, true);
            this.d = -1;
        }
        l7 l7Var = this.f25006e;
        if (l7Var != null) {
            l7Var.run();
            this.f25006e = null;
        }
        this.f25003a.clear();
        this.f25004b.clear();
        this.f25008g = 0;
        this.h = 0;
        this.f25009i = null;
        this.f25010j = 2147483637;
        this.f25011k = null;
        this.f25012l = 0;
        this.f25013m = 0;
        this.f25014n = false;
    }

    public final int b() {
        int i7 = 1;
        if (this.f25012l >= this.f25003a.size() - 1) {
            i7 = 0;
        }
        if (this.f25012l > 0) {
            return i7 | 2;
        }
        return i7;
    }
}
