package e6;

import org.json.JSONException;
import org.json.JSONObject;
public final class l extends n {
    public final int f6297r;
    public final double f6298s;
    public final h f6299t;

    public l(h hVar, double d, int i10) {
        super(hVar, false);
        this.f6297r = i10;
        this.f6299t = hVar;
        this.f6298s = d;
    }

    @Override
    public final void n() {
        switch (this.f6297r) {
            case 0:
                g6.m mVar = this.f6299t.f6287c;
                g6.n o10 = o();
                mVar.getClass();
                double d = this.f6298s;
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
                    mVar.f7384n.a(b10, o10);
                    return;
                }
                throw new IllegalArgumentException("Volume cannot be " + d);
            default:
                g6.m mVar2 = this.f6299t.f6287c;
                g6.n o11 = o();
                double d10 = this.f6298s;
                if (mVar2.f7377f != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    long b11 = mVar2.b();
                    try {
                        jSONObject3.put("requestId", b11);
                        jSONObject3.put("type", "SET_PLAYBACK_RATE");
                        jSONObject3.put("playbackRate", d10);
                        n6.l.h(mVar2.f7377f, "mediaStatus should not be null");
                        jSONObject3.put("mediaSessionId", mVar2.f7377f.f3922b);
                    } catch (JSONException unused2) {
                    }
                    mVar2.c(b11, jSONObject3.toString());
                    mVar2.f7391u.a(b11, o11);
                    return;
                }
                throw new Exception();
        }
    }
}
