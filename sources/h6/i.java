package h6;

import org.json.JSONException;
import org.json.JSONObject;
public final class i extends o {
    public final int f13956r;
    public final h f13957s;

    public i(h hVar, int i7) {
        super(hVar, false);
        this.f13956r = i7;
        this.f13957s = hVar;
    }

    @Override
    public final void n() {
        switch (this.f13956r) {
            case 0:
                j6.m mVar = this.f13957s.f13950c;
                j6.n o4 = o();
                mVar.getClass();
                JSONObject jSONObject = new JSONObject();
                long b10 = mVar.b();
                try {
                    jSONObject.put("requestId", b10);
                    jSONObject.put("type", "GET_STATUS");
                    f6.q qVar = mVar.f17277f;
                    if (qVar != null) {
                        jSONObject.put("mediaSessionId", qVar.f11470b);
                    }
                } catch (JSONException unused) {
                }
                mVar.c(b10, jSONObject.toString());
                mVar.f17286p.a(b10, o4);
                return;
            case 1:
                this.f13957s.f13950c.d(o(), -1, null);
                return;
            case 2:
                this.f13957s.f13950c.d(o(), 1, null);
                return;
            case 3:
                this.f13957s.f13950c.d(o(), 0, 2);
                return;
            case 4:
                j6.m mVar2 = this.f13957s.f13950c;
                j6.n o10 = o();
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
                mVar2.f17288r.a(b11, o10);
                return;
            case 5:
                j6.m mVar3 = this.f13957s.f13950c;
                j6.n o11 = o();
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
                mVar3.f17281k.a(b12, o11);
                return;
            default:
                j6.m mVar4 = this.f13957s.f13950c;
                j6.n o12 = o();
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
                mVar4.f17282l.a(b13, o12);
                return;
        }
    }

    public i(h hVar) {
        super(hVar, true);
        this.f13956r = 4;
        this.f13957s = hVar;
    }
}
