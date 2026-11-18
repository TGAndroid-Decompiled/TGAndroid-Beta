package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class la {
    public final int f25341c;
    public l7 f25342e;
    public boolean f25343f;
    public int f25344g;
    public int h;
    public TLRPC.Peer f25345i;
    public String f25347k;
    public int f25348l;
    public int f25349m;
    public boolean f25350n;
    public final ArrayList f25339a = new ArrayList();
    public final HashMap f25340b = new HashMap();
    public int d = -1;
    public int f25346j = Integer.MAX_VALUE;

    public la(int i7) {
        this.f25341c = i7;
    }

    public final void a() {
        if (this.d >= 0) {
            ConnectionsManager.getInstance(this.f25341c).cancelRequest(this.d, true);
            this.d = -1;
        }
        l7 l7Var = this.f25342e;
        if (l7Var != null) {
            l7Var.run();
            this.f25342e = null;
        }
        this.f25339a.clear();
        this.f25340b.clear();
        this.f25344g = 0;
        this.h = 0;
        this.f25345i = null;
        this.f25346j = 2147483637;
        this.f25347k = null;
        this.f25348l = 0;
        this.f25349m = 0;
        this.f25350n = false;
    }

    public final int b() {
        int i7 = 1;
        if (this.f25348l >= this.f25339a.size() - 1) {
            i7 = 0;
        }
        if (this.f25348l > 0) {
            return i7 | 2;
        }
        return i7;
    }
}
