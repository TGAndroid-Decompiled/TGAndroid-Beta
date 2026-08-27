package o5;

import android.util.Log;
import com.google.android.gms.cast.MediaInfo;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class j extends n {

    public final int f19341r;

    public final h f19342s;

    public final Object f19343t;

    public j(h hVar, Object obj, int i10) {
        super(hVar, false);
        this.f19341r = i10;
        this.f19342s = hVar;
        this.f19343t = obj;
    }

    @Override
    public final void n() {
        int i10 = this.f19341r;
        Object obj = this.f19343t;
        h hVar = this.f19342s;
        int i11 = 0;
        switch (i10) {
            case 0:
                r5.n nVar = hVar.f19333c;
                r5.o oVarO = o();
                int[] iArr = (int[]) obj;
                nVar.getClass();
                JSONObject jSONObject = new JSONObject();
                long jB = nVar.b();
                try {
                    jSONObject.put("requestId", jB);
                    jSONObject.put("type", "QUEUE_GET_ITEMS");
                    jSONObject.put("mediaSessionId", nVar.p());
                    JSONArray jSONArray = new JSONArray();
                    int length = iArr.length;
                    while (i11 < length) {
                        jSONArray.put(iArr[i11]);
                        i11++;
                    }
                    jSONObject.put("itemIds", jSONArray);
                    break;
                } catch (JSONException unused) {
                }
                nVar.c(jB, jSONObject.toString());
                nVar.f46794s.a(jB, oVarO);
                return;
            case 1:
                r5.n nVar2 = hVar.f19333c;
                r5.o oVarO2 = o();
                m5.k kVar = (m5.k) obj;
                nVar2.getClass();
                MediaInfo mediaInfo = kVar.f17796a;
                m5.n nVar3 = kVar.f17797b;
                if (mediaInfo == null && nVar3 == null) {
                    throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
                }
                long[] jArr = kVar.f17800f;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    MediaInfo mediaInfo2 = kVar.f17796a;
                    if (mediaInfo2 != null) {
                        jSONObject2.put("media", mediaInfo2.b());
                    }
                    if (nVar3 != null) {
                        jSONObject2.put("queueData", nVar3.b());
                    }
                    jSONObject2.putOpt("autoplay", kVar.f17798c);
                    long j10 = kVar.d;
                    if (j10 != -1) {
                        Pattern pattern = r5.a.f46766a;
                        jSONObject2.put("currentTime", j10 / 1000.0d);
                    }
                    jSONObject2.put("playbackRate", kVar.f17799e);
                    jSONObject2.putOpt("credentials", kVar.f17802r);
                    jSONObject2.putOpt("credentialsType", kVar.f17803s);
                    jSONObject2.putOpt("atvCredentials", kVar.v);
                    jSONObject2.putOpt("atvCredentialsType", kVar.f17804w);
                    if (jArr != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (int i12 = 0; i12 < jArr.length; i12++) {
                            jSONArray2.put(i12, jArr[i12]);
                        }
                        jSONObject2.put("activeTrackIds", jSONArray2);
                    }
                    jSONObject2.putOpt("customData", kVar.f17801n);
                    jSONObject2.put("requestId", kVar.f17805x);
                    break;
                } catch (JSONException e9) {
                    r5.b bVar = m5.k.f17795y;
                    Log.e(bVar.f46768a, bVar.d("Error transforming MediaLoadRequestData into JSONObject", e9));
                    jSONObject2 = new JSONObject();
                }
                long jB2 = nVar2.b();
                try {
                    jSONObject2.put("requestId", jB2);
                    jSONObject2.put("type", "LOAD");
                    break;
                } catch (JSONException unused2) {
                }
                nVar2.c(jB2, jSONObject2.toString());
                nVar2.f46785j.a(jB2, oVarO2);
                return;
            default:
                r5.n nVar4 = hVar.f19333c;
                r5.o oVarO3 = o();
                nVar4.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long jB3 = nVar4.b();
                long j11 = ((m5.q) obj).f17831a;
                try {
                    jSONObject3.put("requestId", jB3);
                    jSONObject3.put("type", "SEEK");
                    jSONObject3.put("mediaSessionId", nVar4.p());
                    Pattern pattern2 = r5.a.f46766a;
                    jSONObject3.put("currentTime", j11 / 1000.0d);
                    break;
                } catch (JSONException unused3) {
                }
                nVar4.c(jB3, jSONObject3.toString());
                nVar4.f46783g = Long.valueOf(j11);
                nVar4.f46788m.a(jB3, new r5.k(nVar4, oVarO3, i11));
                return;
        }
    }

    public j(h hVar, int[] iArr) {
        super(hVar, true);
        this.f19341r = 0;
        this.f19342s = hVar;
        this.f19343t = iArr;
    }
}
