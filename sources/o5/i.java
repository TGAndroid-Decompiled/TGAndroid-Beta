package o5;

import org.json.JSONException;
import org.json.JSONObject;
public final class i extends n {
    public final int f18992r;
    public final h f18993s;

    public i(h hVar, int i9) {
        super(hVar, false);
        this.f18992r = i9;
        this.f18993s = hVar;
    }

    @Override
    public final void n() {
        switch (this.f18992r) {
            case 0:
                q5.n nVar = this.f18993s.f18986c;
                q5.o o6 = o();
                nVar.getClass();
                JSONObject jSONObject = new JSONObject();
                long b10 = nVar.b();
                try {
                    jSONObject.put("requestId", b10);
                    jSONObject.put("type", "GET_STATUS");
                    m5.q qVar = nVar.f46023f;
                    if (qVar != null) {
                        jSONObject.put("mediaSessionId", qVar.f17454b);
                    }
                } catch (JSONException unused) {
                }
                nVar.c(b10, jSONObject.toString());
                nVar.f46032p.a(b10, o6);
                return;
            case 1:
                this.f18993s.f18986c.d(o(), -1, null);
                return;
            case 2:
                this.f18993s.f18986c.d(o(), 1, null);
                return;
            case 3:
                this.f18993s.f18986c.d(o(), 0, 2);
                return;
            case 4:
                q5.n nVar2 = this.f18993s.f18986c;
                q5.o o9 = o();
                nVar2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long b11 = nVar2.b();
                try {
                    jSONObject2.put("requestId", b11);
                    jSONObject2.put("type", "QUEUE_GET_ITEM_IDS");
                    jSONObject2.put("mediaSessionId", nVar2.p());
                } catch (JSONException unused2) {
                }
                nVar2.c(b11, jSONObject2.toString());
                nVar2.f46034r.a(b11, o9);
                return;
            case 5:
                q5.n nVar3 = this.f18993s.f18986c;
                q5.o o10 = o();
                nVar3.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long b12 = nVar3.b();
                try {
                    jSONObject3.put("requestId", b12);
                    jSONObject3.put("type", "PAUSE");
                    jSONObject3.put("mediaSessionId", nVar3.p());
                } catch (JSONException unused3) {
                }
                nVar3.c(b12, jSONObject3.toString());
                nVar3.f46027k.a(b12, o10);
                return;
            default:
                q5.n nVar4 = this.f18993s.f18986c;
                q5.o o11 = o();
                nVar4.getClass();
                JSONObject jSONObject4 = new JSONObject();
                long b13 = nVar4.b();
                try {
                    jSONObject4.put("requestId", b13);
                    jSONObject4.put("type", "PLAY");
                    jSONObject4.put("mediaSessionId", nVar4.p());
                } catch (JSONException unused4) {
                }
                nVar4.c(b13, jSONObject4.toString());
                nVar4.f46028l.a(b13, o11);
                return;
        }
    }

    public i(h hVar) {
        super(hVar, true);
        this.f18992r = 4;
        this.f18993s = hVar;
    }
}
