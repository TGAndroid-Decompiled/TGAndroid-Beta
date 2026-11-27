package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
public final class ngd extends fid {
    public final byte r;
    public final double s;
    public final v99 t;

    public ngd(v99 v99Var, double d, byte b) {
        super(v99Var, false);
        this.r = b;
        this.t = v99Var;
        this.s = d;
    }

    @Override
    public final void n() {
        byte b = this.r;
        double d = this.s;
        v99 v99Var = this.t;
        switch (b) {
            case 0:
                rdd rddVar = v99Var.c;
                ydd o = o();
                rddVar.getClass();
                if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                    JSONObject jSONObject = new JSONObject();
                    long l = rddVar.l();
                    try {
                        jSONObject.put("requestId", l);
                        jSONObject.put("type", "SET_VOLUME");
                        jSONObject.put("mediaSessionId", rddVar.p());
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("level", d);
                        jSONObject.put("volume", jSONObject2);
                    } catch (JSONException unused) {
                    }
                    rddVar.n(l, jSONObject.toString());
                    rddVar.n.a(l, o);
                    return;
                }
                throw new IllegalArgumentException("Volume cannot be " + d);
            default:
                rdd rddVar2 = v99Var.c;
                ydd o2 = o();
                if (rddVar2.f != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    long l2 = rddVar2.l();
                    try {
                        jSONObject3.put("requestId", l2);
                        jSONObject3.put("type", "SET_PLAYBACK_RATE");
                        jSONObject3.put("playbackRate", d);
                        xve.i(rddVar2.f, "mediaStatus should not be null");
                        jSONObject3.put("mediaSessionId", rddVar2.f.b);
                    } catch (JSONException unused2) {
                    }
                    rddVar2.n(l2, jSONObject3.toString());
                    rddVar2.u.a(l2, o2);
                    return;
                }
                throw new Exception();
        }
    }
}
