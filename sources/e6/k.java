package e6;

import android.util.Log;
import com.google.android.gms.cast.MediaInfo;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class k extends p {
    public final int f8008r;
    public final h f8009s;
    public final Object f8010t;

    public k(h hVar, Object obj, int i10) {
        super(hVar, false);
        this.f8008r = i10;
        this.f8009s = hVar;
        this.f8010t = obj;
    }

    @Override
    public final void n() {
        int i10 = this.f8008r;
        Object obj = this.f8010t;
        h hVar = this.f8009s;
        switch (i10) {
            case 0:
                g6.m mVar = hVar.f8000c;
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
                mVar.f9438s.a(b10, o9);
                return;
            case 1:
                g6.m mVar2 = hVar.f8000c;
                g6.n o10 = o();
                c6.k kVar = (c6.k) obj;
                mVar2.getClass();
                MediaInfo mediaInfo = kVar.f3999a;
                c6.n nVar = kVar.f4000b;
                if (mediaInfo == null && nVar == null) {
                    throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
                }
                long[] jArr = kVar.f4002f;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    MediaInfo mediaInfo2 = kVar.f3999a;
                    if (mediaInfo2 != null) {
                        jSONObject2.put("media", mediaInfo2.b());
                    }
                    if (nVar != null) {
                        jSONObject2.put("queueData", nVar.b());
                    }
                    jSONObject2.putOpt("autoplay", kVar.f4001c);
                    long j3 = kVar.d;
                    if (j3 != -1) {
                        Pattern pattern = g6.a.f9415a;
                        jSONObject2.put("currentTime", j3 / 1000.0d);
                    }
                    jSONObject2.put("playbackRate", kVar.e);
                    jSONObject2.putOpt("credentials", kVar.f4004r);
                    jSONObject2.putOpt("credentialsType", kVar.f4005s);
                    jSONObject2.putOpt("atvCredentials", kVar.v);
                    jSONObject2.putOpt("atvCredentialsType", kVar.f4006w);
                    if (jArr != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (int i12 = 0; i12 < jArr.length; i12++) {
                            jSONArray2.put(i12, jArr[i12]);
                        }
                        jSONObject2.put("activeTrackIds", jSONArray2);
                    }
                    jSONObject2.putOpt("customData", kVar.f4003n);
                    jSONObject2.put("requestId", kVar.f4007x);
                } catch (JSONException e) {
                    g6.b bVar = c6.k.f3998y;
                    Log.e(bVar.f9417a, bVar.d("Error transforming MediaLoadRequestData into JSONObject", e));
                    jSONObject2 = new JSONObject();
                }
                long b11 = mVar2.b();
                try {
                    jSONObject2.put("requestId", b11);
                    jSONObject2.put("type", "LOAD");
                } catch (JSONException unused2) {
                }
                mVar2.c(b11, jSONObject2.toString());
                mVar2.f9429j.a(b11, o10);
                return;
            default:
                g6.m mVar3 = hVar.f8000c;
                g6.n o11 = o();
                mVar3.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long b12 = mVar3.b();
                long j10 = ((c6.p) obj).f4027a;
                try {
                    jSONObject3.put("requestId", b12);
                    jSONObject3.put("type", "SEEK");
                    jSONObject3.put("mediaSessionId", mVar3.p());
                    Pattern pattern2 = g6.a.f9415a;
                    jSONObject3.put("currentTime", j10 / 1000.0d);
                } catch (JSONException unused3) {
                }
                mVar3.c(b12, jSONObject3.toString());
                mVar3.f9427g = Long.valueOf(j10);
                mVar3.f9432m.a(b12, new of.b(19, mVar3, o11));
                return;
        }
    }

    public k(h hVar, int[] iArr) {
        super(hVar, true);
        this.f8008r = 0;
        this.f8009s = hVar;
        this.f8010t = iArr;
    }
}
