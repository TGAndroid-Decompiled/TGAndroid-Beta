package f6;

import org.json.JSONException;
import org.json.JSONObject;
public final class m extends o {
    public final int f10226r;
    public final double f10227s;
    public final h f10228t;

    public m(h hVar, double d, int i10) {
        super(hVar, false);
        this.f10226r = i10;
        this.f10228t = hVar;
        this.f10227s = d;
    }

    @Override
    public final void n() {
        switch (this.f10226r) {
            case 0:
                h6.m mVar = this.f10228t.f10215c;
                h6.n o10 = o();
                mVar.getClass();
                double d = this.f10227s;
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
                    mVar.f12636n.a(b10, o10);
                    return;
                }
                throw new IllegalArgumentException("Volume cannot be " + d);
            default:
                h6.m mVar2 = this.f10228t.f10215c;
                h6.n o11 = o();
                double d10 = this.f10227s;
                if (mVar2.f12629f != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    long b11 = mVar2.b();
                    try {
                        jSONObject3.put("requestId", b11);
                        jSONObject3.put("type", "SET_PLAYBACK_RATE");
                        jSONObject3.put("playbackRate", d10);
                        o6.l.i(mVar2.f12629f, "mediaStatus should not be null");
                        jSONObject3.put("mediaSessionId", mVar2.f12629f.f8119b);
                    } catch (JSONException unused2) {
                    }
                    mVar2.c(b11, jSONObject3.toString());
                    mVar2.f12643u.a(b11, o11);
                    return;
                }
                throw new Exception();
        }
    }
}
