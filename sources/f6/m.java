package f6;

import org.json.JSONException;
import org.json.JSONObject;
public final class m extends o {
    public final int f10227r;
    public final double f10228s;
    public final h f10229t;

    public m(h hVar, double d, int i10) {
        super(hVar, false);
        this.f10227r = i10;
        this.f10229t = hVar;
        this.f10228s = d;
    }

    @Override
    public final void n() {
        switch (this.f10227r) {
            case 0:
                h6.m mVar = this.f10229t.f10216c;
                h6.n o10 = o();
                mVar.getClass();
                double d = this.f10228s;
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
                    mVar.f12637n.a(b10, o10);
                    return;
                }
                throw new IllegalArgumentException("Volume cannot be " + d);
            default:
                h6.m mVar2 = this.f10229t.f10216c;
                h6.n o11 = o();
                double d10 = this.f10228s;
                if (mVar2.f12630f != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    long b11 = mVar2.b();
                    try {
                        jSONObject3.put("requestId", b11);
                        jSONObject3.put("type", "SET_PLAYBACK_RATE");
                        jSONObject3.put("playbackRate", d10);
                        o6.l.i(mVar2.f12630f, "mediaStatus should not be null");
                        jSONObject3.put("mediaSessionId", mVar2.f12630f.f8119b);
                    } catch (JSONException unused2) {
                    }
                    mVar2.c(b11, jSONObject3.toString());
                    mVar2.f12644u.a(b11, o11);
                    return;
                }
                throw new Exception();
        }
    }
}
