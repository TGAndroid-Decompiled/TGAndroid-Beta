package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class la {
    public final int f25343c;
    public l7 f25344e;
    public boolean f25345f;
    public int f25346g;
    public int h;
    public TLRPC.Peer f25347i;
    public String f25349k;
    public int f25350l;
    public int f25351m;
    public boolean f25352n;
    public final ArrayList f25341a = new ArrayList();
    public final HashMap f25342b = new HashMap();
    public int d = -1;
    public int f25348j = Integer.MAX_VALUE;

    public la(int i7) {
        this.f25343c = i7;
    }

    public final void a() {
        if (this.d >= 0) {
            ConnectionsManager.getInstance(this.f25343c).cancelRequest(this.d, true);
            this.d = -1;
        }
        l7 l7Var = this.f25344e;
        if (l7Var != null) {
            l7Var.run();
            this.f25344e = null;
        }
        this.f25341a.clear();
        this.f25342b.clear();
        this.f25346g = 0;
        this.h = 0;
        this.f25347i = null;
        this.f25348j = 2147483637;
        this.f25349k = null;
        this.f25350l = 0;
        this.f25351m = 0;
        this.f25352n = false;
    }

    public final int b() {
        int i7 = 1;
        if (this.f25350l >= this.f25341a.size() - 1) {
            i7 = 0;
        }
        if (this.f25350l > 0) {
            return i7 | 2;
        }
        return i7;
    }
}
