package h6;

import org.json.JSONException;
import org.json.JSONObject;
public final class l extends o {
    public final int f13961r;
    public final double f13962s;
    public final h f13963t;

    public l(h hVar, double d, int i7) {
        super(hVar, false);
        this.f13961r = i7;
        this.f13963t = hVar;
        this.f13962s = d;
    }

    @Override
    public final void n() {
        switch (this.f13961r) {
            case 0:
                j6.m mVar = this.f13963t.f13950c;
                j6.n o4 = o();
                mVar.getClass();
                double d = this.f13962s;
                if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                    JSONObject jSONObject = new JSONObject();
                    long b10 = mVar.b();
                    try {
                        jSONObject.put("requestId", b10);
                        jSONObject.put("type", "SET_VOLUME");
                        jSONObject.put("mediaSessionId", mVar.p());
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("level", d);
                        jSONObject.put("volume", jSONObject2);
                    } catch (JSONException unused) {
                    }
                    mVar.c(b10, jSONObject.toString());
                    mVar.f17284n.a(b10, o4);
                    return;
                }
                throw new IllegalArgumentException("Volume cannot be " + d);
            default:
                j6.m mVar2 = this.f13963t.f13950c;
                j6.n o10 = o();
                double d2 = this.f13962s;
                if (mVar2.f17277f != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    long b11 = mVar2.b();
                    try {
                        jSONObject3.put("requestId", b11);
                        jSONObject3.put("type", "SET_PLAYBACK_RATE");
                        jSONObject3.put("playbackRate", d2);
                        q6.m.i(mVar2.f17277f, "mediaStatus should not be null");
                        jSONObject3.put("mediaSessionId", mVar2.f17277f.f11470b);
                    } catch (JSONException unused2) {
                    }
                    mVar2.c(b11, jSONObject3.toString());
                    mVar2.f17291u.a(b11, o10);
                    return;
                }
                throw new Exception();
        }
    }
}
