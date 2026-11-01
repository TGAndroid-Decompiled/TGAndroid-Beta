package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class oa {
    public final int f17407c;
    public o7 e;
    public boolean f17408f;
    public int f17409g;
    public int h;
    public TLRPC.Peer f17410i;
    public String f17412k;
    public int f17413l;
    public int f17414m;
    public boolean f17415n;
    public final ArrayList f17405a = new ArrayList();
    public final HashMap f17406b = new HashMap();
    public int d = -1;
    public int f17411j = Integer.MAX_VALUE;

    public oa(int i10) {
        this.f17407c = i10;
    }

    public final void a() {
        if (this.d >= 0) {
            ConnectionsManager.getInstance(this.f17407c).cancelRequest(this.d, true);
            this.d = -1;
        }
        o7 o7Var = this.e;
        if (o7Var != null) {
            o7Var.run();
            this.e = null;
        }
        this.f17405a.clear();
        this.f17406b.clear();
        this.f17409g = 0;
        this.h = 0;
        this.f17410i = null;
        this.f17411j = 2147483637;
        this.f17412k = null;
        this.f17413l = 0;
        this.f17414m = 0;
        this.f17415n = false;
    }

    public final int b() {
        int i10 = 1;
        if (this.f17413l >= this.f17405a.size() - 1) {
            i10 = 0;
        }
        if (this.f17413l > 0) {
            return i10 | 2;
        }
        return i10;
    }
}
