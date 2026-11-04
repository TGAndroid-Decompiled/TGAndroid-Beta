package g6;

import android.util.Log;
import com.google.android.gms.cast.MediaInfo;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class j extends n {
    public final int f12017r;
    public final h f12018s;
    public final Object f12019t;

    public j(h hVar, Object obj, int i3) {
        super(hVar, false);
        this.f12017r = i3;
        this.f12018s = hVar;
        this.f12019t = obj;
    }

    @Override
    public final void n() {
        int i3 = this.f12017r;
        Object obj = this.f12019t;
        h hVar = this.f12018s;
        switch (i3) {
            case 0:
                i6.m mVar = hVar.f12009c;
                i6.n o10 = o();
                int[] iArr = (int[]) obj;
                mVar.getClass();
                JSONObject jSONObject = new JSONObject();
                long b10 = mVar.b();
                try {
                    jSONObject.put("requestId", b10);
                    jSONObject.put("type", "QUEUE_GET_ITEMS");
                    jSONObject.put("mediaSessionId", mVar.p());
                    JSONArray jSONArray = new JSONArray();
                    for (int i10 : iArr) {
                        jSONArray.put(i10);
                    }
                    jSONObject.put("itemIds", jSONArray);
                } catch (JSONException unused) {
                }
                mVar.c(b10, jSONObject.toString());
                mVar.f14643s.a(b10, o10);
                return;
            case 1:
                i6.m mVar2 = hVar.f12009c;
                i6.n o11 = o();
                e6.k kVar = (e6.k) obj;
                mVar2.getClass();
                MediaInfo mediaInfo = kVar.f9717a;
                e6.n nVar = kVar.f9718b;
                if (mediaInfo == null && nVar == null) {
                    throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
                }
                long[] jArr = kVar.f9721f;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    MediaInfo mediaInfo2 = kVar.f9717a;
                    if (mediaInfo2 != null) {
                        jSONObject2.put("media", mediaInfo2.b());
                    }
                    if (nVar != null) {
                        jSONObject2.put("queueData", nVar.b());
                    }
                    jSONObject2.putOpt("autoplay", kVar.f9719c);
                    long j10 = kVar.d;
                    if (j10 != -1) {
                        Pattern pattern = i6.a.f14618a;
                        jSONObject2.put("currentTime", j10 / 1000.0d);
                    }
                    jSONObject2.put("playbackRate", kVar.f9720e);
                    jSONObject2.putOpt("credentials", kVar.f9723r);
                    jSONObject2.putOpt("credentialsType", kVar.f9724s);
                    jSONObject2.putOpt("atvCredentials", kVar.f9725w);
                    jSONObject2.putOpt("atvCredentialsType", kVar.f9726x);
                    if (jArr != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (int i11 = 0; i11 < jArr.length; i11++) {
                            jSONArray2.put(i11, jArr[i11]);
                        }
                        jSONObject2.put("activeTrackIds", jSONArray2);
                    }
                    jSONObject2.putOpt("customData", kVar.f9722n);
                    jSONObject2.put("requestId", kVar.f9727y);
                } catch (JSONException e10) {
                    i6.b bVar = e6.k.E;
                    Log.e(bVar.f14620a, bVar.d("Error transforming MediaLoadRequestData into JSONObject", e10));
                    jSONObject2 = new JSONObject();
                }
                long b11 = mVar2.b();
                try {
                    jSONObject2.put("requestId", b11);
                    jSONObject2.put("type", "LOAD");
                } catch (JSONException unused2) {
                }
                mVar2.c(b11, jSONObject2.toString());
                mVar2.f14634j.a(b11, o11);
                return;
            default:
                i6.m mVar3 = hVar.f12009c;
                i6.n o12 = o();
                mVar3.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long b12 = mVar3.b();
                long j11 = ((e6.p) obj).f9751a;
                try {
                    jSONObject3.put("requestId", b12);
                    jSONObject3.put("type", "SEEK");
                    jSONObject3.put("mediaSessionId", mVar3.p());
                    Pattern pattern2 = i6.a.f14618a;
                    jSONObject3.put("currentTime", j11 / 1000.0d);
                } catch (JSONException unused3) {
                }
                mVar3.c(b12, jSONObject3.toString());
                mVar3.f14632g = Long.valueOf(j11);
                mVar3.f14637m.a(b12, new tf.b(mVar3, o12, false));
                return;
        }
    }

    public j(h hVar, int[] iArr) {
        super(hVar, true);
        this.f12017r = 0;
        this.f12018s = hVar;
        this.f12019t = iArr;
    }
}
