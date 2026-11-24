package defpackage;

import android.util.Log;
import com.google.android.gms.cast.MediaInfo;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class o9d extends ndd {
    public final byte r;
    public final i69 s;
    public final Object t;

    public o9d(i69 i69Var, int[] iArr) {
        super(i69Var, true);
        this.r = (byte) 0;
        this.s = i69Var;
        this.t = iArr;
    }

    @Override
    public final void n() {
        byte b = this.r;
        Object obj = this.t;
        i69 i69Var = this.s;
        switch (b) {
            case 0:
                y8d y8dVar = i69Var.c;
                f9d o = o();
                int[] iArr = (int[]) obj;
                y8dVar.getClass();
                JSONObject jSONObject = new JSONObject();
                long l = y8dVar.l();
                try {
                    jSONObject.put("requestId", l);
                    jSONObject.put("type", "QUEUE_GET_ITEMS");
                    jSONObject.put("mediaSessionId", y8dVar.p());
                    JSONArray jSONArray = new JSONArray();
                    for (int i : iArr) {
                        jSONArray.put(i);
                    }
                    jSONObject.put("itemIds", jSONArray);
                } catch (JSONException unused) {
                }
                y8dVar.n(l, jSONObject.toString());
                y8dVar.s.a(l, o);
                return;
            case 1:
                y8d y8dVar2 = i69Var.c;
                f9d o2 = o();
                gr6 gr6Var = (gr6) obj;
                y8dVar2.getClass();
                MediaInfo mediaInfo = gr6Var.a;
                yr6 yr6Var = gr6Var.b;
                if (mediaInfo == null && yr6Var == null) {
                    w26.j("MediaInfo and MediaQueueData should not be both null");
                    return;
                }
                long[] jArr = gr6Var.f;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    MediaInfo mediaInfo2 = gr6Var.a;
                    if (mediaInfo2 != null) {
                        jSONObject2.put("media", mediaInfo2.b());
                    }
                    if (yr6Var != null) {
                        jSONObject2.put("queueData", yr6Var.b());
                    }
                    jSONObject2.putOpt("autoplay", gr6Var.c);
                    long j = gr6Var.d;
                    if (j != -1) {
                        Pattern pattern = id1.a;
                        jSONObject2.put("currentTime", j / 1000.0d);
                    }
                    jSONObject2.put("playbackRate", gr6Var.e);
                    jSONObject2.putOpt("credentials", gr6Var.r);
                    jSONObject2.putOpt("credentialsType", gr6Var.s);
                    jSONObject2.putOpt("atvCredentials", gr6Var.w);
                    jSONObject2.putOpt("atvCredentialsType", gr6Var.x);
                    if (jArr != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (int i2 = 0; i2 < jArr.length; i2++) {
                            jSONArray2.put(i2, jArr[i2]);
                        }
                        jSONObject2.put("activeTrackIds", jSONArray2);
                    }
                    jSONObject2.putOpt("customData", gr6Var.n);
                    jSONObject2.put("requestId", gr6Var.y);
                } catch (JSONException e) {
                    dc6 dc6Var = gr6.E;
                    Log.e(dc6Var.a, dc6Var.d("Error transforming MediaLoadRequestData into JSONObject", e));
                    jSONObject2 = new JSONObject();
                }
                long l2 = y8dVar2.l();
                try {
                    jSONObject2.put("requestId", l2);
                    jSONObject2.put("type", "LOAD");
                } catch (JSONException unused2) {
                }
                y8dVar2.n(l2, jSONObject2.toString());
                y8dVar2.j.a(l2, o2);
                return;
            default:
                y8d y8dVar3 = i69Var.c;
                f9d o3 = o();
                y8dVar3.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long l3 = y8dVar3.l();
                long j2 = ((nu6) obj).a;
                try {
                    jSONObject3.put("requestId", l3);
                    jSONObject3.put("type", "SEEK");
                    jSONObject3.put("mediaSessionId", y8dVar3.p());
                    Pattern pattern2 = id1.a;
                    jSONObject3.put("currentTime", j2 / 1000.0d);
                } catch (JSONException unused3) {
                }
                y8dVar3.n(l3, jSONObject3.toString());
                y8dVar3.g = Long.valueOf(j2);
                y8dVar3.m.a(l3, new aec(y8dVar3, o3, (byte) 8));
                return;
        }
    }

    public o9d(i69 i69Var, Object obj, byte b) {
        super(i69Var, false);
        this.r = b;
        this.s = i69Var;
        this.t = obj;
    }
}
