package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ma {
    public final int f25547c;
    public l7 f25548e;
    public boolean f25549f;
    public int f25550g;
    public int h;
    public TLRPC.Peer f25551i;
    public String f25553k;
    public int f25554l;
    public int f25555m;
    public boolean f25556n;
    public final ArrayList f25545a = new ArrayList();
    public final HashMap f25546b = new HashMap();
    public int d = -1;
    public int f25552j = Integer.MAX_VALUE;

    public ma(int i7) {
        this.f25547c = i7;
    }

    public final void a() {
        if (this.d >= 0) {
            ConnectionsManager.getInstance(this.f25547c).cancelRequest(this.d, true);
            this.d = -1;
        }
        l7 l7Var = this.f25548e;
        if (l7Var != null) {
            l7Var.run();
            this.f25548e = null;
        }
        this.f25545a.clear();
        this.f25546b.clear();
        this.f25550g = 0;
        this.h = 0;
        this.f25551i = null;
        this.f25552j = 2147483637;
        this.f25553k = null;
        this.f25554l = 0;
        this.f25555m = 0;
        this.f25556n = false;
    }

    public final int b() {
        int i7 = 1;
        if (this.f25554l >= this.f25545a.size() - 1) {
            i7 = 0;
        }
        if (this.f25554l > 0) {
            return i7 | 2;
        }
        return i7;
    }
}
