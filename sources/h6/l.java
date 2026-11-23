package h6;

import org.json.JSONException;
import org.json.JSONObject;
public final class l extends p {
    public final int f13927r;
    public final double f13928s;
    public final h f13929t;

    public l(h hVar, double d, int i7) {
        super(hVar, false);
        this.f13927r = i7;
        this.f13929t = hVar;
        this.f13928s = d;
    }

    @Override
    public final void n() {
        switch (this.f13927r) {
            case 0:
                j6.n nVar = this.f13929t.f13916c;
                j6.o o4 = o();
                nVar.getClass();
                double d = this.f13928s;
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
                    nVar.f17353n.a(b10, o4);
                    return;
                }
                throw new IllegalArgumentException("Volume cannot be " + d);
            default:
                j6.n nVar2 = this.f13929t.f13916c;
                j6.o o10 = o();
                double d2 = this.f13928s;
                if (nVar2.f17346f != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    long b11 = nVar2.b();
                    try {
                        jSONObject3.put("requestId", b11);
                        jSONObject3.put("type", "SET_PLAYBACK_RATE");
                        jSONObject3.put("playbackRate", d2);
                        q6.m.i(nVar2.f17346f, "mediaStatus should not be null");
                        jSONObject3.put("mediaSessionId", nVar2.f17346f.f11435b);
                    } catch (JSONException unused2) {
                    }
                    nVar2.c(b11, jSONObject3.toString());
                    nVar2.f17360u.a(b11, o10);
                    return;
                }
                throw new Exception();
        }
    }
}
