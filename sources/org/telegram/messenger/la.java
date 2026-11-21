package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class la {
    public final int f25369c;
    public l7 f25370e;
    public boolean f25371f;
    public int f25372g;
    public int h;
    public TLRPC.Peer f25373i;
    public String f25375k;
    public int f25376l;
    public int f25377m;
    public boolean f25378n;
    public final ArrayList f25367a = new ArrayList();
    public final HashMap f25368b = new HashMap();
    public int d = -1;
    public int f25374j = Integer.MAX_VALUE;

    public la(int i7) {
        this.f25369c = i7;
    }

    public final void a() {
        if (this.d >= 0) {
            ConnectionsManager.getInstance(this.f25369c).cancelRequest(this.d, true);
            this.d = -1;
        }
        l7 l7Var = this.f25370e;
        if (l7Var != null) {
            l7Var.run();
            this.f25370e = null;
        }
        this.f25367a.clear();
        this.f25368b.clear();
        this.f25372g = 0;
        this.h = 0;
        this.f25373i = null;
        this.f25374j = 2147483637;
        this.f25375k = null;
        this.f25376l = 0;
        this.f25377m = 0;
        this.f25378n = false;
    }

    public final int b() {
        int i7 = 1;
        if (this.f25376l >= this.f25367a.size() - 1) {
            i7 = 0;
        }
        if (this.f25376l > 0) {
            return i7 | 2;
        }
        return i7;
    }
}
