package e6;

import android.util.Log;
import com.google.android.gms.cast.MediaInfo;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class k extends p {
    public final int f8687r;
    public final h f8688s;
    public final Object f8689t;

    public k(h hVar, Object obj, int i10) {
        super(hVar, false);
        this.f8687r = i10;
        this.f8688s = hVar;
        this.f8689t = obj;
    }

    @Override
    public final void n() {
        int i10 = this.f8687r;
        Object obj = this.f8689t;
        h hVar = this.f8688s;
        switch (i10) {
            case 0:
                g6.m mVar = hVar.f8678c;
                g6.n o9 = o();
                int[] iArr = (int[]) obj;
                mVar.getClass();
                JSONObject jSONObject = new JSONObject();
                long b10 = mVar.b();
                try {
                    jSONObject.put("requestId", b10);
                    jSONObject.put("type", "QUEUE_GET_ITEMS");
                    jSONObject.put("mediaSessionId", mVar.p());
                    JSONArray jSONArray = new JSONArray();
                    for (int i11 : iArr) {
                        jSONArray.put(i11);
                    }
                    jSONObject.put("itemIds", jSONArray);
                } catch (JSONException unused) {
                }
                mVar.c(b10, jSONObject.toString());
                mVar.f10272s.a(b10, o9);
                return;
            case 1:
                g6.m mVar2 = hVar.f8678c;
                g6.n o10 = o();
                c6.k kVar = (c6.k) obj;
                mVar2.getClass();
                MediaInfo mediaInfo = kVar.f4322a;
                c6.n nVar = kVar.f4323b;
                if (mediaInfo == null && nVar == null) {
                    throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
                }
                long[] jArr = kVar.f4326f;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    MediaInfo mediaInfo2 = kVar.f4322a;
                    if (mediaInfo2 != null) {
                        jSONObject2.put("media", mediaInfo2.b());
                    }
                    if (nVar != null) {
                        jSONObject2.put("queueData", nVar.b());
                    }
                    jSONObject2.putOpt("autoplay", kVar.f4324c);
                    long j3 = kVar.d;
                    if (j3 != -1) {
                        Pattern pattern = g6.a.f10247a;
                        jSONObject2.put("currentTime", j3 / 1000.0d);
                    }
                    jSONObject2.put("playbackRate", kVar.f4325e);
                    jSONObject2.putOpt("credentials", kVar.f4328r);
                    jSONObject2.putOpt("credentialsType", kVar.f4329s);
                    jSONObject2.putOpt("atvCredentials", kVar.v);
                    jSONObject2.putOpt("atvCredentialsType", kVar.f4330w);
                    if (jArr != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (int i12 = 0; i12 < jArr.length; i12++) {
                            jSONArray2.put(i12, jArr[i12]);
                        }
                        jSONObject2.put("activeTrackIds", jSONArray2);
                    }
                    jSONObject2.putOpt("customData", kVar.f4327n);
                    jSONObject2.put("requestId", kVar.f4331x);
                } catch (JSONException e7) {
                    g6.b bVar = c6.k.f4321y;
                    Log.e(bVar.f10249a, bVar.d("Error transforming MediaLoadRequestData into JSONObject", e7));
                    jSONObject2 = new JSONObject();
                }
                long b11 = mVar2.b();
                try {
                    jSONObject2.put("requestId", b11);
                    jSONObject2.put("type", "LOAD");
                } catch (JSONException unused2) {
                }
                mVar2.c(b11, jSONObject2.toString());
                mVar2.f10263j.a(b11, o10);
                return;
            default:
                g6.m mVar3 = hVar.f8678c;
                g6.n o11 = o();
                mVar3.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long b12 = mVar3.b();
                long j10 = ((c6.p) obj).f4355a;
                try {
                    jSONObject3.put("requestId", b12);
                    jSONObject3.put("type", "SEEK");
                    jSONObject3.put("mediaSessionId", mVar3.p());
                    Pattern pattern2 = g6.a.f10247a;
                    jSONObject3.put("currentTime", j10 / 1000.0d);
                } catch (JSONException unused3) {
                }
                mVar3.c(b12, jSONObject3.toString());
                mVar3.f10261g = Long.valueOf(j10);
                mVar3.f10266m.a(b12, new of.b(19, mVar3, o11));
                return;
        }
    }

    public k(h hVar, int[] iArr) {
        super(hVar, true);
        this.f8687r = 0;
        this.f8688s = hVar;
        this.f8689t = iArr;
    }
}
