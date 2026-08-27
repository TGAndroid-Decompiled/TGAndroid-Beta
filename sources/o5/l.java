package o5;

import org.json.JSONException;
import org.json.JSONObject;

public final class l extends n {

    public final int f19344r;

    public final double f19345s;

    public final h f19346t;

    public l(h hVar, double d, int i10) {
        super(hVar, false);
        this.f19344r = i10;
        this.f19346t = hVar;
        this.f19345s = d;
    }

    @Override
    public final void n() throws r5.l {
        switch (this.f19344r) {
            case 0:
                r5.n nVar = this.f19346t.f19333c;
                r5.o oVarO = o();
                nVar.getClass();
                double d = this.f19345s;
                if (Double.isInfinite(d) || Double.isNaN(d)) {
                    throw new IllegalArgumentException("Volume cannot be " + d);
                }
                JSONObject jSONObject = new JSONObject();
                long jB = nVar.b();
                try {
                    jSONObject.put("requestId", jB);
                    jSONObject.put("type", "SET_VOLUME");
                    jSONObject.put("mediaSessionId", nVar.p());
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("level", d);
                    jSONObject.put("volume", jSONObject2);
                    break;
                } catch (JSONException unused) {
                }
                nVar.c(jB, jSONObject.toString());
                nVar.f46789n.a(jB, oVarO);
                return;
            default:
                r5.n nVar2 = this.f19346t.f19333c;
                r5.o oVarO2 = o();
                double d10 = this.f19345s;
                if (nVar2.f46782f == null) {
                    throw new r5.l();
                }
                JSONObject jSONObject3 = new JSONObject();
                long jB2 = nVar2.b();
                try {
                    jSONObject3.put("requestId", jB2);
                    jSONObject3.put("type", "SET_PLAYBACK_RATE");
                    jSONObject3.put("playbackRate", d10);
                    y5.l.i(nVar2.f46782f, "mediaStatus should not be null");
                    jSONObject3.put("mediaSessionId", nVar2.f46782f.f17833b);
                    break;
                } catch (JSONException unused2) {
                }
                nVar2.c(jB2, jSONObject3.toString());
                nVar2.f46796u.a(jB2, oVarO2);
                return;
        }
    }
}
