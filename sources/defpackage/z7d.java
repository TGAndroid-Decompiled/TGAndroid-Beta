package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
public final class z7d extends pfd {
    public final byte r;
    public final k89 s;

    public z7d(k89 k89Var) {
        super(k89Var, true);
        this.r = (byte) 4;
        this.s = k89Var;
    }

    @Override
    public final void n() {
        byte b = this.r;
        k89 k89Var = this.s;
        switch (b) {
            case 0:
                abd abdVar = k89Var.c;
                hbd o = o();
                abdVar.getClass();
                JSONObject jSONObject = new JSONObject();
                long l = abdVar.l();
                try {
                    jSONObject.put("requestId", l);
                    jSONObject.put("type", "GET_STATUS");
                    f07 f07Var = abdVar.f;
                    if (f07Var != null) {
                        jSONObject.put("mediaSessionId", f07Var.b);
                    }
                } catch (JSONException unused) {
                }
                abdVar.n(l, jSONObject.toString());
                abdVar.p.a(l, o);
                return;
            case 1:
                k89Var.c.a(o(), -1, null);
                return;
            case 2:
                k89Var.c.a(o(), 1, null);
                return;
            case 3:
                k89Var.c.a(o(), 0, 2);
                return;
            case 4:
                abd abdVar2 = k89Var.c;
                hbd o2 = o();
                abdVar2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long l2 = abdVar2.l();
                try {
                    jSONObject2.put("requestId", l2);
                    jSONObject2.put("type", "QUEUE_GET_ITEM_IDS");
                    jSONObject2.put("mediaSessionId", abdVar2.p());
                } catch (JSONException unused2) {
                }
                abdVar2.n(l2, jSONObject2.toString());
                abdVar2.r.a(l2, o2);
                return;
            case 5:
                abd abdVar3 = k89Var.c;
                hbd o3 = o();
                abdVar3.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long l3 = abdVar3.l();
                try {
                    jSONObject3.put("requestId", l3);
                    jSONObject3.put("type", "PAUSE");
                    jSONObject3.put("mediaSessionId", abdVar3.p());
                } catch (JSONException unused3) {
                }
                abdVar3.n(l3, jSONObject3.toString());
                abdVar3.k.a(l3, o3);
                return;
            default:
                abd abdVar4 = k89Var.c;
                hbd o4 = o();
                abdVar4.getClass();
                JSONObject jSONObject4 = new JSONObject();
                long l4 = abdVar4.l();
                try {
                    jSONObject4.put("requestId", l4);
                    jSONObject4.put("type", "PLAY");
                    jSONObject4.put("mediaSessionId", abdVar4.p());
                } catch (JSONException unused4) {
                }
                abdVar4.n(l4, jSONObject4.toString());
                abdVar4.l.a(l4, o4);
                return;
        }
    }

    public z7d(k89 k89Var, byte b) {
        super(k89Var, false);
        this.r = b;
        this.s = k89Var;
    }
}
