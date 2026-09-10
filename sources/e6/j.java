package e6;

import org.json.JSONException;
import org.json.JSONObject;
public final class j extends p {
    public final int f7322r;
    public final h f7323s;

    public j(h hVar, int i10) {
        super(hVar, false);
        this.f7322r = i10;
        this.f7323s = hVar;
    }

    @Override
    public final void n() {
        switch (this.f7322r) {
            case 0:
                g6.m mVar = this.f7323s.f7316c;
                g6.n o9 = o();
                mVar.getClass();
                JSONObject jSONObject = new JSONObject();
                long b10 = mVar.b();
                try {
                    jSONObject.put("requestId", b10);
                    jSONObject.put("type", "GET_STATUS");
                    c6.q qVar = mVar.f8567f;
                    if (qVar != null) {
                        jSONObject.put("mediaSessionId", qVar.f4449b);
                    }
                } catch (JSONException unused) {
                }
                mVar.c(b10, jSONObject.toString());
                mVar.f8576p.a(b10, o9);
                return;
            case 1:
                this.f7323s.f7316c.d(o(), -1, null);
                return;
            case 2:
                this.f7323s.f7316c.d(o(), 1, null);
                return;
            case 3:
                this.f7323s.f7316c.d(o(), 0, 2);
                return;
            case 4:
                g6.m mVar2 = this.f7323s.f7316c;
                g6.n o10 = o();
                mVar2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long b11 = mVar2.b();
                try {
                    jSONObject2.put("requestId", b11);
                    jSONObject2.put("type", "QUEUE_GET_ITEM_IDS");
                    jSONObject2.put("mediaSessionId", mVar2.p());
                } catch (JSONException unused2) {
                }
                mVar2.c(b11, jSONObject2.toString());
                mVar2.f8578r.a(b11, o10);
                return;
            case 5:
                g6.m mVar3 = this.f7323s.f7316c;
                g6.n o11 = o();
                mVar3.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long b12 = mVar3.b();
                try {
                    jSONObject3.put("requestId", b12);
                    jSONObject3.put("type", "PAUSE");
                    jSONObject3.put("mediaSessionId", mVar3.p());
                } catch (JSONException unused3) {
                }
                mVar3.c(b12, jSONObject3.toString());
                mVar3.f8571k.a(b12, o11);
                return;
            default:
                g6.m mVar4 = this.f7323s.f7316c;
                g6.n o12 = o();
                mVar4.getClass();
                JSONObject jSONObject4 = new JSONObject();
                long b13 = mVar4.b();
                try {
                    jSONObject4.put("requestId", b13);
                    jSONObject4.put("type", "PLAY");
                    jSONObject4.put("mediaSessionId", mVar4.p());
                } catch (JSONException unused4) {
                }
                mVar4.c(b13, jSONObject4.toString());
                mVar4.f8572l.a(b13, o12);
                return;
        }
    }

    public j(h hVar) {
        super(hVar, true);
        this.f7322r = 4;
        this.f7323s = hVar;
    }
}
