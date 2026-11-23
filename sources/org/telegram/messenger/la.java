package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class la {
    public final int f25460c;
    public l7 f25461e;
    public boolean f25462f;
    public int f25463g;
    public int h;
    public TLRPC.Peer f25464i;
    public String f25466k;
    public int f25467l;
    public int f25468m;
    public boolean f25469n;
    public final ArrayList f25458a = new ArrayList();
    public final HashMap f25459b = new HashMap();
    public int d = -1;
    public int f25465j = Integer.MAX_VALUE;

    public la(int i7) {
        this.f25460c = i7;
    }

    public final void a() {
        if (this.d >= 0) {
            ConnectionsManager.getInstance(this.f25460c).cancelRequest(this.d, true);
            this.d = -1;
        }
        l7 l7Var = this.f25461e;
        if (l7Var != null) {
            l7Var.run();
            this.f25461e = null;
        }
        this.f25458a.clear();
        this.f25459b.clear();
        this.f25463g = 0;
        this.h = 0;
        this.f25464i = null;
        this.f25465j = 2147483637;
        this.f25466k = null;
        this.f25467l = 0;
        this.f25468m = 0;
        this.f25469n = false;
    }

    public final int b() {
        int i7 = 1;
        if (this.f25467l >= this.f25458a.size() - 1) {
            i7 = 0;
        }
        if (this.f25467l > 0) {
            return i7 | 2;
        }
        return i7;
    }
}
