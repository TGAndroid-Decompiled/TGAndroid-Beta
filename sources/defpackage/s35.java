package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
public final class s35 {
    public final int a;
    public final long b;
    public final t35 c;

    public s35(t35 t35Var, int i, long j) {
        this.c = t35Var;
        this.a = i;
        this.b = j;
    }

    public final void a(ryc rycVar, vyc vycVar, vyc vycVar2, boolean z) {
        Integer valueOf;
        StringBuilder sb = new StringBuilder("websocket disconnected; closedByServer=");
        sb.append(z);
        sb.append(", serverCloseCode=");
        Object obj = "none";
        if (vycVar == null) {
            valueOf = "none";
        } else {
            valueOf = Integer.valueOf(vycVar.b());
        }
        sb.append(valueOf);
        sb.append(", clientCloseCode=");
        if (vycVar2 != null) {
            obj = Integer.valueOf(vycVar2.b());
        }
        sb.append(obj);
        hl.c3(new gp6(this.c, rycVar, this.a, sb.toString(), (byte) 25));
    }

    public final void b(ryc rycVar, String str) {
        StringBuilder sb = new StringBuilder("[gram-wallet-streaming] account=");
        sb.append(this.c.a);
        sb.append(" generation=");
        int i = this.a;
        sb.append(i);
        sb.append(" receive <- ");
        sb.append(str);
        cc4.b(sb.toString());
        try {
            hl.c3(new gp6(this, rycVar, i, new JSONObject(str), (byte) 26));
        } catch (JSONException unused) {
            hl.c3(new ze7(this, rycVar, i, (byte) 29));
        }
    }
}
