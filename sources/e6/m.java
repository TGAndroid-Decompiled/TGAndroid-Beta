package e6;

import org.json.JSONException;
import org.json.JSONObject;
public final class m extends p {
    public final int f8890r;
    public final double f8891s;
    public final h f8892t;

    public m(h hVar, double d, int i10) {
        super(hVar, false);
        this.f8890r = i10;
        this.f8892t = hVar;
        this.f8891s = d;
    }

    @Override
    public final void n() {
        switch (this.f8890r) {
            case 0:
                g6.m mVar = this.f8892t.f8878c;
                g6.n o9 = o();
                mVar.getClass();
                double d = this.f8891s;
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
                    mVar.f10404n.a(b10, o9);
                    return;
                }
                throw new IllegalArgumentException("Volume cannot be " + d);
            default:
                g6.m mVar2 = this.f8892t.f8878c;
                g6.n o10 = o();
                double d10 = this.f8891s;
                if (mVar2.f10397f != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    long b11 = mVar2.b();
                    try {
                        jSONObject3.put("requestId", b11);
                        jSONObject3.put("type", "SET_PLAYBACK_RATE");
                        jSONObject3.put("playbackRate", d10);
                        n6.l.i(mVar2.f10397f, "mediaStatus should not be null");
                        jSONObject3.put("mediaSessionId", mVar2.f10397f.f4551b);
                    } catch (JSONException unused2) {
                    }
                    mVar2.c(b11, jSONObject3.toString());
                    mVar2.f10411u.a(b11, o10);
                    return;
                }
                throw new Exception();
        }
    }
}
