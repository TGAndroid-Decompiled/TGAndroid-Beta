package e6;

import org.json.JSONException;
import org.json.JSONObject;
public final class m extends p {
    public final int f7327r;
    public final double f7328s;
    public final h f7329t;

    public m(h hVar, double d, int i10) {
        super(hVar, false);
        this.f7327r = i10;
        this.f7329t = hVar;
        this.f7328s = d;
    }

    @Override
    public final void n() {
        switch (this.f7327r) {
            case 0:
                g6.m mVar = this.f7329t.f7316c;
                g6.n o9 = o();
                mVar.getClass();
                double d = this.f7328s;
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
                    mVar.f8574n.a(b10, o9);
                    return;
                }
                throw new IllegalArgumentException("Volume cannot be " + d);
            default:
                g6.m mVar2 = this.f7329t.f7316c;
                g6.n o10 = o();
                double d10 = this.f7328s;
                if (mVar2.f8567f != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    long b11 = mVar2.b();
                    try {
                        jSONObject3.put("requestId", b11);
                        jSONObject3.put("type", "SET_PLAYBACK_RATE");
                        jSONObject3.put("playbackRate", d10);
                        n6.l.i(mVar2.f8567f, "mediaStatus should not be null");
                        jSONObject3.put("mediaSessionId", mVar2.f8567f.f4449b);
                    } catch (JSONException unused2) {
                    }
                    mVar2.c(b11, jSONObject3.toString());
                    mVar2.f8581u.a(b11, o10);
                    return;
                }
                throw new Exception();
        }
    }
}
