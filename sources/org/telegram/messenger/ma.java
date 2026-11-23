package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ma {
    public final int f25511c;
    public l7 f25512e;
    public boolean f25513f;
    public int f25514g;
    public int h;
    public TLRPC.Peer f25515i;
    public String f25517k;
    public int f25518l;
    public int f25519m;
    public boolean f25520n;
    public final ArrayList f25509a = new ArrayList();
    public final HashMap f25510b = new HashMap();
    public int d = -1;
    public int f25516j = Integer.MAX_VALUE;

    public ma(int i7) {
        this.f25511c = i7;
    }

    public final void a() {
        if (this.d >= 0) {
            ConnectionsManager.getInstance(this.f25511c).cancelRequest(this.d, true);
            this.d = -1;
        }
        l7 l7Var = this.f25512e;
        if (l7Var != null) {
            l7Var.run();
            this.f25512e = null;
        }
        this.f25509a.clear();
        this.f25510b.clear();
        this.f25514g = 0;
        this.h = 0;
        this.f25515i = null;
        this.f25516j = 2147483637;
        this.f25517k = null;
        this.f25518l = 0;
        this.f25519m = 0;
        this.f25520n = false;
    }

    public final int b() {
        int i7 = 1;
        if (this.f25518l >= this.f25509a.size() - 1) {
            i7 = 0;
        }
        if (this.f25518l > 0) {
            return i7 | 2;
        }
        return i7;
    }
}
