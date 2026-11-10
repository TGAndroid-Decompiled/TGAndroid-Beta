package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class na {
    public final int f24165c;
    public l7 f24166e;
    public boolean f24167f;
    public int f24168g;
    public int h;
    public TLRPC.Peer f24169i;
    public String f24171k;
    public int f24172l;
    public int f24173m;
    public boolean f24174n;
    public final ArrayList f24163a = new ArrayList();
    public final HashMap f24164b = new HashMap();
    public int d = -1;
    public int f24170j = Integer.MAX_VALUE;

    public na(int i7) {
        this.f24165c = i7;
    }

    public final void a() {
        if (this.d >= 0) {
            ConnectionsManager.getInstance(this.f24165c).cancelRequest(this.d, true);
            this.d = -1;
        }
        l7 l7Var = this.f24166e;
        if (l7Var != null) {
            l7Var.run();
            this.f24166e = null;
        }
        this.f24163a.clear();
        this.f24164b.clear();
        this.f24168g = 0;
        this.h = 0;
        this.f24169i = null;
        this.f24170j = 2147483637;
        this.f24171k = null;
        this.f24172l = 0;
        this.f24173m = 0;
        this.f24174n = false;
    }

    public final int b() {
        int i7 = 1;
        if (this.f24172l >= this.f24163a.size() - 1) {
            i7 = 0;
        }
        if (this.f24172l > 0) {
            return i7 | 2;
        }
        return i7;
    }
}
