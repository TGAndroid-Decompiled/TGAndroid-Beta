package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
public final class qad extends fid {
    public final byte r;
    public final v99 s;

    public qad(v99 v99Var) {
        super(v99Var, true);
        this.r = (byte) 4;
        this.s = v99Var;
    }

    @Override
    public final void n() {
        byte b = this.r;
        v99 v99Var = this.s;
        switch (b) {
            case 0:
                rdd rddVar = v99Var.c;
                ydd o = o();
                rddVar.getClass();
                JSONObject jSONObject = new JSONObject();
                long l = rddVar.l();
                try {
                    jSONObject.put("requestId", l);
                    jSONObject.put("type", "GET_STATUS");
                    j07 j07Var = rddVar.f;
                    if (j07Var != null) {
                        jSONObject.put("mediaSessionId", j07Var.b);
                    }
                } catch (JSONException unused) {
                }
                rddVar.n(l, jSONObject.toString());
                rddVar.p.a(l, o);
                return;
            case 1:
                v99Var.c.a(o(), -1, null);
                return;
            case 2:
                v99Var.c.a(o(), 1, null);
                return;
            case 3:
                v99Var.c.a(o(), 0, 2);
                return;
            case 4:
                rdd rddVar2 = v99Var.c;
                ydd o2 = o();
                rddVar2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long l2 = rddVar2.l();
                try {
                    jSONObject2.put("requestId", l2);
                    jSONObject2.put("type", "QUEUE_GET_ITEM_IDS");
                    jSONObject2.put("mediaSessionId", rddVar2.p());
                } catch (JSONException unused2) {
                }
                rddVar2.n(l2, jSONObject2.toString());
                rddVar2.r.a(l2, o2);
                return;
            case 5:
                rdd rddVar3 = v99Var.c;
                ydd o3 = o();
                rddVar3.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long l3 = rddVar3.l();
                try {
                    jSONObject3.put("requestId", l3);
                    jSONObject3.put("type", "PAUSE");
                    jSONObject3.put("mediaSessionId", rddVar3.p());
                } catch (JSONException unused3) {
                }
                rddVar3.n(l3, jSONObject3.toString());
                rddVar3.k.a(l3, o3);
                return;
            default:
                rdd rddVar4 = v99Var.c;
                ydd o4 = o();
                rddVar4.getClass();
                JSONObject jSONObject4 = new JSONObject();
                long l4 = rddVar4.l();
                try {
                    jSONObject4.put("requestId", l4);
                    jSONObject4.put("type", "PLAY");
                    jSONObject4.put("mediaSessionId", rddVar4.p());
                } catch (JSONException unused4) {
                }
                rddVar4.n(l4, jSONObject4.toString());
                rddVar4.l.a(l4, o4);
                return;
        }
    }

    public qad(v99 v99Var, byte b) {
        super(v99Var, false);
        this.r = b;
        this.s = v99Var;
    }
}
