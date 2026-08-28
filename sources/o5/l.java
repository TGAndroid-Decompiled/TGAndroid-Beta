package o5;

import org.json.JSONException;
import org.json.JSONObject;
public final class l extends n {
    public final int f18997r;
    public final double f18998s;
    public final h f18999t;

    public l(h hVar, double d, int i9) {
        super(hVar, false);
        this.f18997r = i9;
        this.f18999t = hVar;
        this.f18998s = d;
    }

    @Override
    public final void n() {
        switch (this.f18997r) {
            case 0:
                q5.n nVar = this.f18999t.f18986c;
                q5.o o6 = o();
                nVar.getClass();
                double d = this.f18998s;
                if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                    JSONObject jSONObject = new JSONObject();
                    long b10 = nVar.b();
                    try {
                        jSONObject.put("requestId", b10);
                        jSONObject.put("type", "SET_VOLUME");
                        jSONObject.put("mediaSessionId", nVar.p());
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("level", d);
                        jSONObject.put("volume", jSONObject2);
                    } catch (JSONException unused) {
                    }
                    nVar.c(b10, jSONObject.toString());
                    nVar.f46030n.a(b10, o6);
                    return;
                }
                throw new IllegalArgumentException("Volume cannot be " + d);
            default:
                q5.n nVar2 = this.f18999t.f18986c;
                q5.o o9 = o();
                double d9 = this.f18998s;
                if (nVar2.f46023f != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    long b11 = nVar2.b();
                    try {
                        jSONObject3.put("requestId", b11);
                        jSONObject3.put("type", "SET_PLAYBACK_RATE");
                        jSONObject3.put("playbackRate", d9);
                        x5.l.i(nVar2.f46023f, "mediaStatus should not be null");
                        jSONObject3.put("mediaSessionId", nVar2.f46023f.f17454b);
                    } catch (JSONException unused2) {
                    }
                    nVar2.c(b11, jSONObject3.toString());
                    nVar2.f46037u.a(b11, o9);
                    return;
                }
                throw new Exception();
        }
    }
}
