package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class na {
    public final int f17070c;
    public o7 e;
    public boolean f17071f;
    public int f17072g;
    public int h;
    public TLRPC.Peer f17073i;
    public String f17075k;
    public int f17076l;
    public int f17077m;
    public boolean f17078n;
    public final ArrayList f17068a = new ArrayList();
    public final HashMap f17069b = new HashMap();
    public int d = -1;
    public int f17074j = Integer.MAX_VALUE;

    public na(int i10) {
        this.f17070c = i10;
    }

    public final void a() {
        if (this.d >= 0) {
            ConnectionsManager.getInstance(this.f17070c).cancelRequest(this.d, true);
            this.d = -1;
        }
        o7 o7Var = this.e;
        if (o7Var != null) {
            o7Var.run();
            this.e = null;
        }
        this.f17068a.clear();
        this.f17069b.clear();
        this.f17072g = 0;
        this.h = 0;
        this.f17073i = null;
        this.f17074j = 2147483637;
        this.f17075k = null;
        this.f17076l = 0;
        this.f17077m = 0;
        this.f17078n = false;
    }

    public final int b() {
        int i10 = 1;
        if (this.f17076l >= this.f17068a.size() - 1) {
            i10 = 0;
        }
        if (this.f17076l > 0) {
            return i10 | 2;
        }
        return i10;
    }
}
