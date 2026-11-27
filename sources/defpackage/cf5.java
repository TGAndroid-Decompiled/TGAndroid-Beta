package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class cf5 {
    public final int c;
    public a39 e;
    public boolean f;
    public int g;
    public int h;
    public TLRPC.Peer i;
    public String k;
    public int l;
    public int m;
    public boolean n;
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public int d = -1;
    public int j = Integer.MAX_VALUE;

    public cf5(int i) {
        this.c = i;
    }

    public final void a() {
        if (this.d >= 0) {
            ConnectionsManager.getInstance(this.c).cancelRequest(this.d, true);
            this.d = -1;
        }
        a39 a39Var = this.e;
        if (a39Var != null) {
            a39Var.run();
            this.e = null;
        }
        this.a.clear();
        this.b.clear();
        this.g = 0;
        this.h = 0;
        this.i = null;
        this.j = 2147483637;
        this.k = null;
        this.l = 0;
        this.m = 0;
        this.n = false;
    }

    public final int b() {
        int i = 1;
        if (this.l >= this.a.size() - 1) {
            i = 0;
        }
        if (this.l > 0) {
            return i | 2;
        }
        return i;
    }
}
