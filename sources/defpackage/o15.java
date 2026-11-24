package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
public final class o15 {
    public final int a;
    public final long b;
    public final p15 c;

    public o15(p15 p15Var, int i, long j) {
        this.c = p15Var;
        this.a = i;
        this.b = j;
    }

    public final void a(buc bucVar, fuc fucVar, fuc fucVar2, boolean z) {
        Integer valueOf;
        StringBuilder sb = new StringBuilder("websocket disconnected; closedByServer=");
        sb.append(z);
        sb.append(", serverCloseCode=");
        Object obj = "none";
        if (fucVar == null) {
            valueOf = "none";
        } else {
            valueOf = Integer.valueOf(fucVar.b());
        }
        sb.append(valueOf);
        sb.append(", clientCloseCode=");
        if (fucVar2 != null) {
            obj = Integer.valueOf(fucVar2.b());
        }
        sb.append(obj);
        gl.d3(new tn6(this.c, bucVar, this.a, sb.toString(), (byte) 24));
    }

    public final void b(buc bucVar, String str) {
        StringBuilder sb = new StringBuilder("[gram-wallet-streaming] account=");
        sb.append(this.c.a);
        sb.append(" generation=");
        int i = this.a;
        sb.append(i);
        sb.append(" receive <- ");
        sb.append(str);
        fa4.b(sb.toString());
        try {
            gl.d3(new tn6(this, bucVar, i, new JSONObject(str), (byte) 25));
        } catch (JSONException unused) {
            gl.d3(new va7(this, bucVar, i, (byte) 29));
        }
    }
}
