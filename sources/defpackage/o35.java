package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
public final class o35 {
    public final int a;
    public final long b;
    public final p35 c;

    public o35(p35 p35Var, int i, long j) {
        this.c = p35Var;
        this.a = i;
        this.b = j;
    }

    public final void a(cwc cwcVar, gwc gwcVar, gwc gwcVar2, boolean z) {
        Integer valueOf;
        StringBuilder sb = new StringBuilder("websocket disconnected; closedByServer=");
        sb.append(z);
        sb.append(", serverCloseCode=");
        Object obj = "none";
        if (gwcVar == null) {
            valueOf = "none";
        } else {
            valueOf = Integer.valueOf(gwcVar.b());
        }
        sb.append(valueOf);
        sb.append(", clientCloseCode=");
        if (gwcVar2 != null) {
            obj = Integer.valueOf(gwcVar2.b());
        }
        sb.append(obj);
        gm.c3(new up6(this.c, cwcVar, this.a, sb.toString(), (byte) 25));
    }

    public final void b(cwc cwcVar, String str) {
        StringBuilder sb = new StringBuilder("[gram-wallet-streaming] account=");
        sb.append(this.c.a);
        sb.append(" generation=");
        int i = this.a;
        sb.append(i);
        sb.append(" receive <- ");
        sb.append(str);
        fc4.b(sb.toString());
        try {
            gm.c3(new up6(this, cwcVar, i, new JSONObject(str), (byte) 26));
        } catch (JSONException unused) {
            gm.c3(new wc7(this, cwcVar, i, (byte) 29));
        }
    }
}
