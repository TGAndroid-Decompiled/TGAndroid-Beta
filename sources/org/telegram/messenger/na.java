package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class na {
    public final int f24161c;
    public l7 f24162e;
    public boolean f24163f;
    public int f24164g;
    public int h;
    public TLRPC.Peer f24165i;
    public String f24167k;
    public int f24168l;
    public int f24169m;
    public boolean f24170n;
    public final ArrayList f24159a = new ArrayList();
    public final HashMap f24160b = new HashMap();
    public int d = -1;
    public int f24166j = Integer.MAX_VALUE;

    public na(int i7) {
        this.f24161c = i7;
    }

    public final void a() {
        if (this.d >= 0) {
            ConnectionsManager.getInstance(this.f24161c).cancelRequest(this.d, true);
            this.d = -1;
        }
        l7 l7Var = this.f24162e;
        if (l7Var != null) {
            l7Var.run();
            this.f24162e = null;
        }
        this.f24159a.clear();
        this.f24160b.clear();
        this.f24164g = 0;
        this.h = 0;
        this.f24165i = null;
        this.f24166j = 2147483637;
        this.f24167k = null;
        this.f24168l = 0;
        this.f24169m = 0;
        this.f24170n = false;
    }

    public final int b() {
        int i7 = 1;
        if (this.f24168l >= this.f24159a.size() - 1) {
            i7 = 0;
        }
        if (this.f24168l > 0) {
            return i7 | 2;
        }
        return i7;
    }
}
