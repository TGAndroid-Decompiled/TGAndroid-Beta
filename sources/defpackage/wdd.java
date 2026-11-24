package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
public final class wdd extends pfd {
    public final byte r;
    public final double s;
    public final k89 t;

    public wdd(k89 k89Var, double d, byte b) {
        super(k89Var, false);
        this.r = b;
        this.t = k89Var;
        this.s = d;
    }

    @Override
    public final void n() {
        byte b = this.r;
        double d = this.s;
        k89 k89Var = this.t;
        switch (b) {
            case 0:
                abd abdVar = k89Var.c;
                hbd o = o();
                abdVar.getClass();
                if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                    JSONObject jSONObject = new JSONObject();
                    long l = abdVar.l();
                    try {
                        jSONObject.put("requestId", l);
                        jSONObject.put("type", "SET_VOLUME");
                        jSONObject.put("mediaSessionId", abdVar.p());
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("level", d);
                        jSONObject.put("volume", jSONObject2);
                    } catch (JSONException unused) {
                    }
                    abdVar.n(l, jSONObject.toString());
                    abdVar.n.a(l, o);
                    return;
                }
                throw new IllegalArgumentException("Volume cannot be " + d);
            default:
                abd abdVar2 = k89Var.c;
                hbd o2 = o();
                if (abdVar2.f != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    long l2 = abdVar2.l();
                    try {
                        jSONObject3.put("requestId", l2);
                        jSONObject3.put("type", "SET_PLAYBACK_RATE");
                        jSONObject3.put("playbackRate", d);
                        ite.i(abdVar2.f, "mediaStatus should not be null");
                        jSONObject3.put("mediaSessionId", abdVar2.f.b);
                    } catch (JSONException unused2) {
                    }
                    abdVar2.n(l2, jSONObject3.toString());
                    abdVar2.u.a(l2, o2);
                    return;
                }
                throw new Exception();
        }
    }
}
