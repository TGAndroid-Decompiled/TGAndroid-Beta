package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ga {
    public final int f22681c;
    public k7 f22682e;
    public boolean f22683f;
    public int f22684g;
    public int h;
    public TLRPC.Peer f22685i;
    public String f22687k;
    public int f22688l;
    public int f22689m;
    public boolean f22690n;
    public final ArrayList f22679a = new ArrayList();
    public final HashMap f22680b = new HashMap();
    public int d = -1;
    public int f22686j = Integer.MAX_VALUE;

    public ga(int i3) {
        this.f22681c = i3;
    }

    public final void a() {
        if (this.d >= 0) {
            ConnectionsManager.getInstance(this.f22681c).cancelRequest(this.d, true);
            this.d = -1;
        }
        k7 k7Var = this.f22682e;
        if (k7Var != null) {
            k7Var.run();
            this.f22682e = null;
        }
        this.f22679a.clear();
        this.f22680b.clear();
        this.f22684g = 0;
        this.h = 0;
        this.f22685i = null;
        this.f22686j = 2147483637;
        this.f22687k = null;
        this.f22688l = 0;
        this.f22689m = 0;
        this.f22690n = false;
    }

    public final int b() {
        int i3 = 1;
        if (this.f22688l >= this.f22679a.size() - 1) {
            i3 = 0;
        }
        if (this.f22688l > 0) {
            return i3 | 2;
        }
        return i3;
    }
}
