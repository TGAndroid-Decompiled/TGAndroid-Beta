package h6;

import org.json.JSONException;
import org.json.JSONObject;
public final class i extends p {
    public final int f13922r;
    public final h f13923s;

    public i(h hVar, int i7) {
        super(hVar, false);
        this.f13922r = i7;
        this.f13923s = hVar;
    }

    @Override
    public final void n() {
        switch (this.f13922r) {
            case 0:
                j6.n nVar = this.f13923s.f13916c;
                j6.o o4 = o();
                nVar.getClass();
                JSONObject jSONObject = new JSONObject();
                long b10 = nVar.b();
                try {
                    jSONObject.put("requestId", b10);
                    jSONObject.put("type", "GET_STATUS");
                    f6.q qVar = nVar.f17346f;
                    if (qVar != null) {
                        jSONObject.put("mediaSessionId", qVar.f11435b);
                    }
                } catch (JSONException unused) {
                }
                nVar.c(b10, jSONObject.toString());
                nVar.f17355p.a(b10, o4);
                return;
            case 1:
                this.f13923s.f13916c.d(o(), -1, null);
                return;
            case 2:
                this.f13923s.f13916c.d(o(), 1, null);
                return;
            case 3:
                this.f13923s.f13916c.d(o(), 0, 2);
                return;
            case 4:
                j6.n nVar2 = this.f13923s.f13916c;
                j6.o o10 = o();
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
                nVar2.f17357r.a(b11, o10);
                return;
            case 5:
                j6.n nVar3 = this.f13923s.f13916c;
                j6.o o11 = o();
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
                nVar3.f17350k.a(b12, o11);
                return;
            default:
                j6.n nVar4 = this.f13923s.f13916c;
                j6.o o12 = o();
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
                nVar4.f17351l.a(b13, o12);
                return;
        }
    }

    public i(h hVar) {
        super(hVar, true);
        this.f13922r = 4;
        this.f13923s = hVar;
    }
}
