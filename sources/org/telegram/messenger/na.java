package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class na {
    public final int f24155c;
    public k7 f24156e;
    public boolean f24157f;
    public int f24158g;
    public int h;
    public TLRPC.Peer f24159i;
    public String f24161k;
    public int f24162l;
    public int f24163m;
    public boolean f24164n;
    public final ArrayList f24153a = new ArrayList();
    public final HashMap f24154b = new HashMap();
    public int d = -1;
    public int f24160j = Integer.MAX_VALUE;

    public na(int i7) {
        this.f24155c = i7;
    }

    public final void a() {
        if (this.d >= 0) {
            ConnectionsManager.getInstance(this.f24155c).cancelRequest(this.d, true);
            this.d = -1;
        }
        k7 k7Var = this.f24156e;
        if (k7Var != null) {
            k7Var.run();
            this.f24156e = null;
        }
        this.f24153a.clear();
        this.f24154b.clear();
        this.f24158g = 0;
        this.h = 0;
        this.f24159i = null;
        this.f24160j = 2147483637;
        this.f24161k = null;
        this.f24162l = 0;
        this.f24163m = 0;
        this.f24164n = false;
    }

    public final int b() {
        int i7 = 1;
        if (this.f24162l >= this.f24153a.size() - 1) {
            i7 = 0;
        }
        if (this.f24162l > 0) {
            return i7 | 2;
        }
        return i7;
    }
}
