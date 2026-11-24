package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;
public final class jza {
    public boolean a;
    public String b;
    public long c;
    public nl1 d;
    public nl1 e;
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

    public jza(String str, int i) {
        this.j = str;
        this.i = i;
    }

    public final void a(int i, int i2, int i3, iac iacVar) {
        if (!this.k) {
            this.k = true;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.f;
            ConnectionsManager.getInstance(i).bindRequestToGuid(ConnectionsManager.getInstance(i).sendRequest(tL_loadAsyncGraph, new ara(this, iacVar, (byte) 3), null, null, 0, i3, 1, true), i2);
        }
    }
}
