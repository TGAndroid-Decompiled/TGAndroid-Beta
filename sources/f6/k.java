package f6;

import android.util.Log;
import com.google.android.gms.cast.MediaInfo;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class k extends o {
    public final int f10224r;
    public final h f10225s;
    public final Object f10226t;

    public k(h hVar, Object obj, int i10) {
        super(hVar, false);
        this.f10224r = i10;
        this.f10225s = hVar;
        this.f10226t = obj;
    }

    @Override
    public final void n() {
        int i10 = this.f10224r;
        Object obj = this.f10226t;
        h hVar = this.f10225s;
        switch (i10) {
            case 0:
                h6.m mVar = hVar.f10216c;
                h6.n o10 = o();
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
                mVar.f12642s.a(b10, o10);
                return;
            case 1:
                h6.m mVar2 = hVar.f10216c;
                h6.n o11 = o();
                d6.k kVar = (d6.k) obj;
                mVar2.getClass();
                MediaInfo mediaInfo = kVar.f8089a;
                d6.n nVar = kVar.f8090b;
                if (mediaInfo == null && nVar == null) {
                    throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
                }
                long[] jArr = kVar.f8092f;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    MediaInfo mediaInfo2 = kVar.f8089a;
                    if (mediaInfo2 != null) {
                        jSONObject2.put("media", mediaInfo2.b());
                    }
                    if (nVar != null) {
                        jSONObject2.put("queueData", nVar.b());
                    }
                    jSONObject2.putOpt("autoplay", kVar.f8091c);
                    long j10 = kVar.d;
                    if (j10 != -1) {
                        Pattern pattern = h6.a.f12619a;
                        jSONObject2.put("currentTime", j10 / 1000.0d);
                    }
                    jSONObject2.put("playbackRate", kVar.e);
                    jSONObject2.putOpt("credentials", kVar.f8094r);
                    jSONObject2.putOpt("credentialsType", kVar.f8095s);
                    jSONObject2.putOpt("atvCredentials", kVar.v);
                    jSONObject2.putOpt("atvCredentialsType", kVar.f8096w);
                    if (jArr != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (int i12 = 0; i12 < jArr.length; i12++) {
                            jSONArray2.put(i12, jArr[i12]);
                        }
                        jSONObject2.put("activeTrackIds", jSONArray2);
                    }
                    jSONObject2.putOpt("customData", kVar.f8093n);
                    jSONObject2.put("requestId", kVar.f8097x);
                } catch (JSONException e) {
                    h6.b bVar = d6.k.f8088y;
                    Log.e(bVar.f12621a, bVar.d("Error transforming MediaLoadRequestData into JSONObject", e));
                    jSONObject2 = new JSONObject();
                }
                long b11 = mVar2.b();
                try {
                    jSONObject2.put("requestId", b11);
                    jSONObject2.put("type", "LOAD");
                } catch (JSONException unused2) {
                }
                mVar2.c(b11, jSONObject2.toString());
                mVar2.f12633j.a(b11, o11);
                return;
            default:
                h6.m mVar3 = hVar.f10216c;
                h6.n o12 = o();
                mVar3.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long b12 = mVar3.b();
                long j11 = ((d6.p) obj).f8117a;
                try {
                    jSONObject3.put("requestId", b12);
                    jSONObject3.put("type", "SEEK");
                    jSONObject3.put("mediaSessionId", mVar3.p());
                    Pattern pattern2 = h6.a.f12619a;
                    jSONObject3.put("currentTime", j11 / 1000.0d);
                } catch (JSONException unused3) {
                }
                mVar3.c(b12, jSONObject3.toString());
                mVar3.f12631g = Long.valueOf(j11);
                mVar3.f12636m.a(b12, new rf.b(mVar3, o12, false, 22));
                return;
        }
    }

    public k(h hVar, int[] iArr) {
        super(hVar, true);
        this.f10224r = 0;
        this.f10225s = hVar;
        this.f10226t = iArr;
    }
}
