package h6;

import android.util.Log;
import com.google.android.gms.cast.MediaInfo;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class j extends p {
    public final int f13924r;
    public final h f13925s;
    public final Object f13926t;

    public j(h hVar, Object obj, int i7) {
        super(hVar, false);
        this.f13924r = i7;
        this.f13925s = hVar;
        this.f13926t = obj;
    }

    @Override
    public final void n() {
        int i7 = this.f13924r;
        Object obj = this.f13926t;
        h hVar = this.f13925s;
        switch (i7) {
            case 0:
                j6.n nVar = hVar.f13916c;
                j6.o o4 = o();
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
                nVar.f17358s.a(b10, o4);
                return;
            case 1:
                j6.n nVar2 = hVar.f13916c;
                j6.o o10 = o();
                f6.k kVar = (f6.k) obj;
                nVar2.getClass();
                MediaInfo mediaInfo = kVar.f11399a;
                f6.n nVar3 = kVar.f11400b;
                if (mediaInfo == null && nVar3 == null) {
                    throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
                }
                long[] jArr = kVar.f11403f;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    MediaInfo mediaInfo2 = kVar.f11399a;
                    if (mediaInfo2 != null) {
                        jSONObject2.put("media", mediaInfo2.b());
                    }
                    if (nVar3 != null) {
                        jSONObject2.put("queueData", nVar3.b());
                    }
                    jSONObject2.putOpt("autoplay", kVar.f11401c);
                    long j3 = kVar.d;
                    if (j3 != -1) {
                        Pattern pattern = j6.a.f17330a;
                        jSONObject2.put("currentTime", j3 / 1000.0d);
                    }
                    jSONObject2.put("playbackRate", kVar.f11402e);
                    jSONObject2.putOpt("credentials", kVar.f11405r);
                    jSONObject2.putOpt("credentialsType", kVar.f11406s);
                    jSONObject2.putOpt("atvCredentials", kVar.f11407w);
                    jSONObject2.putOpt("atvCredentialsType", kVar.f11408x);
                    if (jArr != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (int i11 = 0; i11 < jArr.length; i11++) {
                            jSONArray2.put(i11, jArr[i11]);
                        }
                        jSONObject2.put("activeTrackIds", jSONArray2);
                    }
                    jSONObject2.putOpt("customData", kVar.f11404n);
                    jSONObject2.put("requestId", kVar.f11409y);
                } catch (JSONException e10) {
                    j6.b bVar = f6.k.E;
                    Log.e(bVar.f17332a, bVar.d("Error transforming MediaLoadRequestData into JSONObject", e10));
                    jSONObject2 = new JSONObject();
                }
                long b11 = nVar2.b();
                try {
                    jSONObject2.put("requestId", b11);
                    jSONObject2.put("type", "LOAD");
                } catch (JSONException unused2) {
                }
                nVar2.c(b11, jSONObject2.toString());
                nVar2.f17349j.a(b11, o10);
                return;
            default:
                j6.n nVar4 = hVar.f13916c;
                j6.o o11 = o();
                nVar4.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long b12 = nVar4.b();
                long j10 = ((f6.p) obj).f11433a;
                try {
                    jSONObject3.put("requestId", b12);
                    jSONObject3.put("type", "SEEK");
                    jSONObject3.put("mediaSessionId", nVar4.p());
                    Pattern pattern2 = j6.a.f17330a;
                    jSONObject3.put("currentTime", j10 / 1000.0d);
                } catch (JSONException unused3) {
                }
                nVar4.c(b12, jSONObject3.toString());
                nVar4.f17347g = Long.valueOf(j10);
                nVar4.f17352m.a(b12, new wf.b(nVar4, o11, false, 28));
                return;
        }
    }

    public j(h hVar, int[] iArr) {
        super(hVar, true);
        this.f13924r = 0;
        this.f13925s = hVar;
        this.f13926t = iArr;
    }
}
