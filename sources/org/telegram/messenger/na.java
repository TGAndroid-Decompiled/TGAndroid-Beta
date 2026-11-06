package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class na {
    public final int f24148c;
    public k7 f24149e;
    public boolean f24150f;
    public int f24151g;
    public int h;
    public TLRPC.Peer f24152i;
    public String f24154k;
    public int f24155l;
    public int f24156m;
    public boolean f24157n;
    public final ArrayList f24146a = new ArrayList();
    public final HashMap f24147b = new HashMap();
    public int d = -1;
    public int f24153j = Integer.MAX_VALUE;

    public na(int i7) {
        this.f24148c = i7;
    }

    public final void a() {
        if (this.d >= 0) {
            ConnectionsManager.getInstance(this.f24148c).cancelRequest(this.d, true);
            this.d = -1;
        }
        k7 k7Var = this.f24149e;
        if (k7Var != null) {
            k7Var.run();
            this.f24149e = null;
        }
        this.f24146a.clear();
        this.f24147b.clear();
        this.f24151g = 0;
        this.h = 0;
        this.f24152i = null;
        this.f24153j = 2147483637;
        this.f24154k = null;
        this.f24155l = 0;
        this.f24156m = 0;
        this.f24157n = false;
    }

    public final int b() {
        int i7 = 1;
        if (this.f24155l >= this.f24146a.size() - 1) {
            i7 = 0;
        }
        if (this.f24155l > 0) {
            return i7 | 2;
        }
        return i7;
    }
}
