package o5;

import m5.r;
import org.json.JSONException;
import org.json.JSONObject;

public final class i extends n {

    public final int f19339r;

    public final h f19340s;

    public i(h hVar, int i10) {
        super(hVar, false);
        this.f19339r = i10;
        this.f19340s = hVar;
    }

    @Override
    public final void n() {
        switch (this.f19339r) {
            case 0:
                r5.n nVar = this.f19340s.f19333c;
                r5.o oVarO = o();
                nVar.getClass();
                JSONObject jSONObject = new JSONObject();
                long jB = nVar.b();
                try {
                    jSONObject.put("requestId", jB);
                    jSONObject.put("type", "GET_STATUS");
                    r rVar = nVar.f46782f;
                    if (rVar != null) {
                        jSONObject.put("mediaSessionId", rVar.f17833b);
                    }
                    break;
                } catch (JSONException unused) {
                }
                nVar.c(jB, jSONObject.toString());
                nVar.f46791p.a(jB, oVarO);
                break;
            case 1:
                this.f19340s.f19333c.d(o(), -1, null);
                break;
            case 2:
                this.f19340s.f19333c.d(o(), 1, null);
                break;
            case 3:
                this.f19340s.f19333c.d(o(), 0, 2);
                break;
            case 4:
                r5.n nVar2 = this.f19340s.f19333c;
                r5.o oVarO2 = o();
                nVar2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long jB2 = nVar2.b();
                try {
                    jSONObject2.put("requestId", jB2);
                    jSONObject2.put("type", "QUEUE_GET_ITEM_IDS");
                    jSONObject2.put("mediaSessionId", nVar2.p());
                    break;
                } catch (JSONException unused2) {
                }
                nVar2.c(jB2, jSONObject2.toString());
                nVar2.f46793r.a(jB2, oVarO2);
                break;
            case 5:
                r5.n nVar3 = this.f19340s.f19333c;
                r5.o oVarO3 = o();
                nVar3.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long jB3 = nVar3.b();
                try {
                    jSONObject3.put("requestId", jB3);
                    jSONObject3.put("type", "PAUSE");
                    jSONObject3.put("mediaSessionId", nVar3.p());
                    break;
                } catch (JSONException unused3) {
                }
                nVar3.c(jB3, jSONObject3.toString());
                nVar3.f46786k.a(jB3, oVarO3);
                break;
            default:
                r5.n nVar4 = this.f19340s.f19333c;
                r5.o oVarO4 = o();
                nVar4.getClass();
                JSONObject jSONObject4 = new JSONObject();
                long jB4 = nVar4.b();
                try {
                    jSONObject4.put("requestId", jB4);
                    jSONObject4.put("type", "PLAY");
                    jSONObject4.put("mediaSessionId", nVar4.p());
                    break;
                } catch (JSONException unused4) {
                }
                nVar4.c(jB4, jSONObject4.toString());
                nVar4.f46787l.a(jB4, oVarO4);
                break;
        }
    }

    public i(h hVar) {
        super(hVar, true);
        this.f19339r = 4;
        this.f19340s = hVar;
    }
}
