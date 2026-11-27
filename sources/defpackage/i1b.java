package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class i1b {
    public boolean a;
    public String b;
    public long c;
    public ok1 d;
    public ok1 e;
    public String f;
    public String g;
    public boolean h;
    public final byte i;
    public final String j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;

    public i1b(String str, int i) {
        this.j = str;
        this.i = i;
    }

    public final void a(int i, int i2, int i3, hcc hccVar) {
        if (!this.k) {
            this.k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f;
            ConnectionsManager.getInstance(i).bindRequestToGuid(ConnectionsManager.getInstance(i).sendRequest(tL_loadAsyncGraph, new isa(this, hccVar, (byte) 4), null, null, 0, i3, 1, true), i2);
        }
    }
}
