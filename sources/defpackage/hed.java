package defpackage;

import android.util.Log;
import com.google.android.gms.cast.MediaInfo;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class hed extends fid {
    public final byte r;
    public final v99 s;
    public final Object t;

    public hed(v99 v99Var, int[] iArr) {
        super(v99Var, true);
        this.r = (byte) 0;
        this.s = v99Var;
        this.t = iArr;
    }

    @Override
    public final void n() {
        byte b = this.r;
        Object obj = this.t;
        v99 v99Var = this.s;
        switch (b) {
            case 0:
                rdd rddVar = v99Var.c;
                ydd o = o();
                int[] iArr = (int[]) obj;
                rddVar.getClass();
                JSONObject jSONObject = new JSONObject();
                long l = rddVar.l();
                try {
                    jSONObject.put("requestId", l);
                    jSONObject.put("type", "QUEUE_GET_ITEMS");
                    jSONObject.put("mediaSessionId", rddVar.p());
                    JSONArray jSONArray = new JSONArray();
                    for (int i : iArr) {
                        jSONArray.put(i);
                    }
                    jSONObject.put("itemIds", jSONArray);
                } catch (JSONException unused) {
                }
                rddVar.n(l, jSONObject.toString());
                rddVar.s.a(l, o);
                return;
            case 1:
                rdd rddVar2 = v99Var.c;
                ydd o2 = o();
                kt6 kt6Var = (kt6) obj;
                rddVar2.getClass();
                MediaInfo mediaInfo = kt6Var.a;
                du6 du6Var = kt6Var.b;
                if (mediaInfo == null && du6Var == null) {
                    lq5.j("MediaInfo and MediaQueueData should not be both null");
                    return;
                }
                long[] jArr = kt6Var.f;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    MediaInfo mediaInfo2 = kt6Var.a;
                    if (mediaInfo2 != null) {
                        jSONObject2.put("media", mediaInfo2.b());
                    }
                    if (du6Var != null) {
                        jSONObject2.put("queueData", du6Var.b());
                    }
                    jSONObject2.putOpt("autoplay", kt6Var.c);
                    long j = kt6Var.d;
                    if (j != -1) {
                        Pattern pattern = qd1.a;
                        jSONObject2.put("currentTime", j / 1000.0d);
                    }
                    jSONObject2.put("playbackRate", kt6Var.e);
                    jSONObject2.putOpt("credentials", kt6Var.r);
                    jSONObject2.putOpt("credentialsType", kt6Var.s);
                    jSONObject2.putOpt("atvCredentials", kt6Var.w);
                    jSONObject2.putOpt("atvCredentialsType", kt6Var.x);
                    if (jArr != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (int i2 = 0; i2 < jArr.length; i2++) {
                            jSONArray2.put(i2, jArr[i2]);
                        }
                        jSONObject2.put("activeTrackIds", jSONArray2);
                    }
                    jSONObject2.putOpt("customData", kt6Var.n);
                    jSONObject2.put("requestId", kt6Var.y);
                } catch (JSONException e) {
                    he6 he6Var = kt6.E;
                    Log.e(he6Var.a, he6Var.d("Error transforming MediaLoadRequestData into JSONObject", e));
                    jSONObject2 = new JSONObject();
                }
                long l2 = rddVar2.l();
                try {
                    jSONObject2.put("requestId", l2);
                    jSONObject2.put("type", "LOAD");
                } catch (JSONException unused2) {
                }
                rddVar2.n(l2, jSONObject2.toString());
                rddVar2.j.a(l2, o2);
                return;
            default:
                rdd rddVar3 = v99Var.c;
                ydd o3 = o();
                rddVar3.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long l3 = rddVar3.l();
                long j2 = ((sw6) obj).a;
                try {
                    jSONObject3.put("requestId", l3);
                    jSONObject3.put("type", "SEEK");
                    jSONObject3.put("mediaSessionId", rddVar3.p());
                    Pattern pattern2 = qd1.a;
                    jSONObject3.put("currentTime", j2 / 1000.0d);
                } catch (JSONException unused3) {
                }
                rddVar3.n(l3, jSONObject3.toString());
                rddVar3.g = Long.valueOf(j2);
                rddVar3.m.a(l3, new zhc(rddVar3, o3, (byte) 8));
                return;
        }
    }

    public hed(v99 v99Var, Object obj, byte b) {
        super(v99Var, false);
        this.r = b;
        this.s = v99Var;
        this.t = obj;
    }
}
