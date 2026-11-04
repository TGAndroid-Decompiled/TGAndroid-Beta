package g6;

import org.json.JSONException;
import org.json.JSONObject;
public final class l extends n {
    public final int f12020r;
    public final double f12021s;
    public final h f12022t;

    public l(h hVar, double d, int i3) {
        super(hVar, false);
        this.f12020r = i3;
        this.f12022t = hVar;
        this.f12021s = d;
    }

    @Override
    public final void n() {
        switch (this.f12020r) {
            case 0:
                i6.m mVar = this.f12022t.f12009c;
                i6.n o10 = o();
                mVar.getClass();
                double d = this.f12021s;
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
                    mVar.f14638n.a(b10, o10);
                    return;
                }
                throw new IllegalArgumentException("Volume cannot be " + d);
            default:
                i6.m mVar2 = this.f12022t.f12009c;
                i6.n o11 = o();
                double d10 = this.f12021s;
                if (mVar2.f14631f != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    long b11 = mVar2.b();
                    try {
                        jSONObject3.put("requestId", b11);
                        jSONObject3.put("type", "SET_PLAYBACK_RATE");
                        jSONObject3.put("playbackRate", d10);
                        p6.m.h(mVar2.f14631f, "mediaStatus should not be null");
                        jSONObject3.put("mediaSessionId", mVar2.f14631f.f9753b);
                    } catch (JSONException unused2) {
                    }
                    mVar2.c(b11, jSONObject3.toString());
                    mVar2.f14645u.a(b11, o11);
                    return;
                }
                throw new Exception();
        }
    }
}
