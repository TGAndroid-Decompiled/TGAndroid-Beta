package o5;

import android.util.Log;
import com.google.android.gms.cast.MediaInfo;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class j extends n {
    public final int f18994r;
    public final h f18995s;
    public final Object f18996t;

    public j(h hVar, Object obj, int i9) {
        super(hVar, false);
        this.f18994r = i9;
        this.f18995s = hVar;
        this.f18996t = obj;
    }

    @Override
    public final void n() {
        int i9 = this.f18994r;
        Object obj = this.f18996t;
        h hVar = this.f18995s;
        switch (i9) {
            case 0:
                q5.n nVar = hVar.f18986c;
                q5.o o6 = o();
                int[] iArr = (int[]) obj;
                nVar.getClass();
                JSONObject jSONObject = new JSONObject();
                long b10 = nVar.b();
                try {
                    jSONObject.put("requestId", b10);
                    jSONObject.put("type", "QUEUE_GET_ITEMS");
                    jSONObject.put("mediaSessionId", nVar.p());
                    JSONArray jSONArray = new JSONArray();
                    for (int i10 : iArr) {
                        jSONArray.put(i10);
                    }
                    jSONObject.put("itemIds", jSONArray);
                } catch (JSONException unused) {
                }
                nVar.c(b10, jSONObject.toString());
                nVar.f46035s.a(b10, o6);
                return;
            case 1:
                q5.n nVar2 = hVar.f18986c;
                q5.o o9 = o();
                m5.k kVar = (m5.k) obj;
                nVar2.getClass();
                MediaInfo mediaInfo = kVar.f17419a;
                m5.n nVar3 = kVar.f17420b;
                if (mediaInfo == null && nVar3 == null) {
                    throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
                }
                long[] jArr = kVar.f17423f;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    MediaInfo mediaInfo2 = kVar.f17419a;
                    if (mediaInfo2 != null) {
                        jSONObject2.put("media", mediaInfo2.b());
                    }
                    if (nVar3 != null) {
                        jSONObject2.put("queueData", nVar3.b());
                    }
                    jSONObject2.putOpt("autoplay", kVar.f17421c);
                    long j10 = kVar.d;
                    if (j10 != -1) {
                        Pattern pattern = q5.a.f46007a;
                        jSONObject2.put("currentTime", j10 / 1000.0d);
                    }
                    jSONObject2.put("playbackRate", kVar.f17422e);
                    jSONObject2.putOpt("credentials", kVar.f17425r);
                    jSONObject2.putOpt("credentialsType", kVar.f17426s);
                    jSONObject2.putOpt("atvCredentials", kVar.v);
                    jSONObject2.putOpt("atvCredentialsType", kVar.f17427w);
                    if (jArr != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (int i11 = 0; i11 < jArr.length; i11++) {
                            jSONArray2.put(i11, jArr[i11]);
                        }
                        jSONObject2.put("activeTrackIds", jSONArray2);
                    }
                    jSONObject2.putOpt("customData", kVar.f17424n);
                    jSONObject2.put("requestId", kVar.f17428x);
                } catch (JSONException e10) {
                    q5.b bVar = m5.k.f17418y;
                    Log.e(bVar.f46009a, bVar.d("Error transforming MediaLoadRequestData into JSONObject", e10));
                    jSONObject2 = new JSONObject();
                }
                long b11 = nVar2.b();
                try {
                    jSONObject2.put("requestId", b11);
                    jSONObject2.put("type", "LOAD");
                } catch (JSONException unused2) {
                }
                nVar2.c(b11, jSONObject2.toString());
                nVar2.f46026j.a(b11, o9);
                return;
            default:
                q5.n nVar4 = hVar.f18986c;
                q5.o o10 = o();
                nVar4.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long b12 = nVar4.b();
                long j11 = ((m5.p) obj).f17452a;
                try {
                    jSONObject3.put("requestId", b12);
                    jSONObject3.put("type", "SEEK");
                    jSONObject3.put("mediaSessionId", nVar4.p());
                    Pattern pattern2 = q5.a.f46007a;
                    jSONObject3.put("currentTime", j11 / 1000.0d);
                } catch (JSONException unused3) {
                }
                nVar4.c(b12, jSONObject3.toString());
                nVar4.f46024g = Long.valueOf(j11);
                nVar4.f46029m.a(b12, new q5.k(nVar4, o10, 0));
                return;
        }
    }

    public j(h hVar, int[] iArr) {
        super(hVar, true);
        this.f18994r = 0;
        this.f18995s = hVar;
        this.f18996t = iArr;
    }
}
