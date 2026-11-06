package h6;

import android.util.Log;
import com.google.android.gms.cast.MediaInfo;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class j extends o {
    public final int f14257r;
    public final h f14258s;
    public final Object f14259t;

    public j(h hVar, Object obj, int i7) {
        super(hVar, false);
        this.f14257r = i7;
        this.f14258s = hVar;
        this.f14259t = obj;
    }

    @Override
    public final void n() {
        int i7 = this.f14257r;
        Object obj = this.f14259t;
        h hVar = this.f14258s;
        switch (i7) {
            case 0:
                j6.m mVar = hVar.f14249c;
                j6.n o4 = o();
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
                mVar.f16528s.a(b10, o4);
                return;
            case 1:
                j6.m mVar2 = hVar.f14249c;
                j6.n o10 = o();
                f6.k kVar = (f6.k) obj;
                mVar2.getClass();
                MediaInfo mediaInfo = kVar.f11274a;
                f6.n nVar = kVar.f11275b;
                if (mediaInfo == null && nVar == null) {
                    throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
                }
                long[] jArr = kVar.f11278f;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    MediaInfo mediaInfo2 = kVar.f11274a;
                    if (mediaInfo2 != null) {
                        jSONObject2.put("media", mediaInfo2.b());
                    }
                    if (nVar != null) {
                        jSONObject2.put("queueData", nVar.b());
                    }
                    jSONObject2.putOpt("autoplay", kVar.f11276c);
                    long j3 = kVar.d;
                    if (j3 != -1) {
                        Pattern pattern = j6.a.f16503a;
                        jSONObject2.put("currentTime", j3 / 1000.0d);
                    }
                    jSONObject2.put("playbackRate", kVar.f11277e);
                    jSONObject2.putOpt("credentials", kVar.f11280r);
                    jSONObject2.putOpt("credentialsType", kVar.f11281s);
                    jSONObject2.putOpt("atvCredentials", kVar.f11282w);
                    jSONObject2.putOpt("atvCredentialsType", kVar.f11283x);
                    if (jArr != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (int i11 = 0; i11 < jArr.length; i11++) {
                            jSONArray2.put(i11, jArr[i11]);
                        }
                        jSONObject2.put("activeTrackIds", jSONArray2);
                    }
                    jSONObject2.putOpt("customData", kVar.f11279n);
                    jSONObject2.put("requestId", kVar.f11284y);
                } catch (JSONException e10) {
                    j6.b bVar = f6.k.D;
                    Log.e(bVar.f16505a, bVar.d("Error transforming MediaLoadRequestData into JSONObject", e10));
                    jSONObject2 = new JSONObject();
                }
                long b11 = mVar2.b();
                try {
                    jSONObject2.put("requestId", b11);
                    jSONObject2.put("type", "LOAD");
                } catch (JSONException unused2) {
                }
                mVar2.c(b11, jSONObject2.toString());
                mVar2.f16519j.a(b11, o10);
                return;
            default:
                j6.m mVar3 = hVar.f14249c;
                j6.n o11 = o();
                mVar3.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long b12 = mVar3.b();
                long j10 = ((f6.p) obj).f11308a;
                try {
                    jSONObject3.put("requestId", b12);
                    jSONObject3.put("type", "SEEK");
                    jSONObject3.put("mediaSessionId", mVar3.p());
                    Pattern pattern2 = j6.a.f16503a;
                    jSONObject3.put("currentTime", j10 / 1000.0d);
                } catch (JSONException unused3) {
                }
                mVar3.c(b12, jSONObject3.toString());
                mVar3.f16517g = Long.valueOf(j10);
                mVar3.f16522m.a(b12, new j2.n(1, mVar3, o11));
                return;
        }
    }

    public j(h hVar, int[] iArr) {
        super(hVar, true);
        this.f14257r = 0;
        this.f14258s = hVar;
        this.f14259t = iArr;
    }
}
