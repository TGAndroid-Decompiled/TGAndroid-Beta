package e6;

import android.util.Log;
import com.google.android.gms.cast.MediaInfo;
import java.util.regex.Pattern;
import n4.y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class k extends p {
    public final int f7324r;
    public final h f7325s;
    public final Object f7326t;

    public k(h hVar, Object obj, int i10) {
        super(hVar, false);
        this.f7324r = i10;
        this.f7325s = hVar;
        this.f7326t = obj;
    }

    @Override
    public final void n() {
        int i10 = this.f7324r;
        Object obj = this.f7326t;
        h hVar = this.f7325s;
        switch (i10) {
            case 0:
                g6.m mVar = hVar.f7316c;
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
                mVar.f8579s.a(b10, o9);
                return;
            case 1:
                g6.m mVar2 = hVar.f7316c;
                g6.n o10 = o();
                c6.k kVar = (c6.k) obj;
                mVar2.getClass();
                MediaInfo mediaInfo = kVar.f4419a;
                c6.n nVar = kVar.f4420b;
                if (mediaInfo == null && nVar == null) {
                    throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
                }
                long[] jArr = kVar.f4422f;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    MediaInfo mediaInfo2 = kVar.f4419a;
                    if (mediaInfo2 != null) {
                        jSONObject2.put("media", mediaInfo2.b());
                    }
                    if (nVar != null) {
                        jSONObject2.put("queueData", nVar.b());
                    }
                    jSONObject2.putOpt("autoplay", kVar.f4421c);
                    long j3 = kVar.d;
                    if (j3 != -1) {
                        Pattern pattern = g6.a.f8556a;
                        jSONObject2.put("currentTime", j3 / 1000.0d);
                    }
                    jSONObject2.put("playbackRate", kVar.e);
                    jSONObject2.putOpt("credentials", kVar.f4424r);
                    jSONObject2.putOpt("credentialsType", kVar.f4425s);
                    jSONObject2.putOpt("atvCredentials", kVar.v);
                    jSONObject2.putOpt("atvCredentialsType", kVar.f4426w);
                    if (jArr != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (int i12 = 0; i12 < jArr.length; i12++) {
                            jSONArray2.put(i12, jArr[i12]);
                        }
                        jSONObject2.put("activeTrackIds", jSONArray2);
                    }
                    jSONObject2.putOpt("customData", kVar.f4423n);
                    jSONObject2.put("requestId", kVar.f4427x);
                } catch (JSONException e) {
                    g6.b bVar = c6.k.f4418y;
                    Log.e(bVar.f8558a, bVar.d("Error transforming MediaLoadRequestData into JSONObject", e));
                    jSONObject2 = new JSONObject();
                }
                long b11 = mVar2.b();
                try {
                    jSONObject2.put("requestId", b11);
                    jSONObject2.put("type", "LOAD");
                } catch (JSONException unused2) {
                }
                mVar2.c(b11, jSONObject2.toString());
                mVar2.f8570j.a(b11, o10);
                return;
            default:
                g6.m mVar3 = hVar.f7316c;
                g6.n o11 = o();
                mVar3.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long b12 = mVar3.b();
                long j10 = ((c6.p) obj).f4447a;
                try {
                    jSONObject3.put("requestId", b12);
                    jSONObject3.put("type", "SEEK");
                    jSONObject3.put("mediaSessionId", mVar3.p());
                    Pattern pattern2 = g6.a.f8556a;
                    jSONObject3.put("currentTime", j10 / 1000.0d);
                } catch (JSONException unused3) {
                }
                mVar3.c(b12, jSONObject3.toString());
                mVar3.f8568g = Long.valueOf(j10);
                mVar3.f8573m.a(b12, new y(mVar3, o11, false, 19));
                return;
        }
    }

    public k(h hVar, int[] iArr) {
        super(hVar, true);
        this.f7324r = 0;
        this.f7325s = hVar;
        this.f7326t = iArr;
    }
}
