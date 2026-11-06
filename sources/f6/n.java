package f6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c8.xb;
import c8.y0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class n extends r6.a {
    public static final Parcelable.Creator<n> CREATOR = new v(13);
    public String f11293a;
    public String f11294b;
    public int f11295c;
    public String d;
    public m f11296e;
    public int f11297f;
    public List h;
    public int f11298n;
    public long f11299r;
    public boolean f11300s;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f11293a)) {
                jSONObject.put("id", this.f11293a);
            }
            if (!TextUtils.isEmpty(this.f11294b)) {
                jSONObject.put("entity", this.f11294b);
            }
            switch (this.f11295c) {
                case 1:
                    jSONObject.put("queueType", "ALBUM");
                    break;
                case 2:
                    jSONObject.put("queueType", "PLAYLIST");
                    break;
                case 3:
                    jSONObject.put("queueType", "AUDIOBOOK");
                    break;
                case 4:
                    jSONObject.put("queueType", "RADIO_STATION");
                    break;
                case 5:
                    jSONObject.put("queueType", "PODCAST_SERIES");
                    break;
                case 6:
                    jSONObject.put("queueType", "TV_SERIES");
                    break;
                case 7:
                    jSONObject.put("queueType", "VIDEO_PLAYLIST");
                    break;
                case 8:
                    jSONObject.put("queueType", "LIVE_TV");
                    break;
                case 9:
                    jSONObject.put("queueType", "MOVIE");
                    break;
            }
            if (!TextUtils.isEmpty(this.d)) {
                jSONObject.put("name", this.d);
            }
            m mVar = this.f11296e;
            if (mVar != null) {
                jSONObject.put("containerMetadata", mVar.b());
            }
            String b10 = y0.b(Integer.valueOf(this.f11297f));
            if (b10 != null) {
                jSONObject.put("repeatMode", b10);
            }
            List list = this.h;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (o oVar : this.h) {
                    jSONArray.put(oVar.c());
                }
                jSONObject.put("items", jSONArray);
            }
            jSONObject.put("startIndex", this.f11298n);
            long j3 = this.f11299r;
            if (j3 != -1) {
                Pattern pattern = j6.a.f16503a;
                jSONObject.put("startTime", j3 / 1000.0d);
            }
            jSONObject.put("shuffle", this.f11300s);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (TextUtils.equals(this.f11293a, nVar.f11293a) && TextUtils.equals(this.f11294b, nVar.f11294b) && this.f11295c == nVar.f11295c && TextUtils.equals(this.d, nVar.d) && q6.m.k(this.f11296e, nVar.f11296e) && this.f11297f == nVar.f11297f && q6.m.k(this.h, nVar.h) && this.f11298n == nVar.f11298n && this.f11299r == nVar.f11299r && this.f11300s == nVar.f11300s) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11293a, this.f11294b, Integer.valueOf(this.f11295c), this.d, this.f11296e, Integer.valueOf(this.f11297f), this.h, Integer.valueOf(this.f11298n), Long.valueOf(this.f11299r), Boolean.valueOf(this.f11300s)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        List unmodifiableList;
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f11293a);
        xb.l(parcel, 3, this.f11294b);
        int i10 = this.f11295c;
        xb.q(parcel, 4, 4);
        parcel.writeInt(i10);
        xb.l(parcel, 5, this.d);
        xb.k(parcel, 6, this.f11296e, i7);
        int i11 = this.f11297f;
        xb.q(parcel, 7, 4);
        parcel.writeInt(i11);
        List list = this.h;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        xb.p(parcel, 8, unmodifiableList);
        int i12 = this.f11298n;
        xb.q(parcel, 9, 4);
        parcel.writeInt(i12);
        long j3 = this.f11299r;
        xb.q(parcel, 10, 8);
        parcel.writeLong(j3);
        boolean z9 = this.f11300s;
        xb.q(parcel, 11, 4);
        parcel.writeInt(z9 ? 1 : 0);
        xb.s(parcel, r10);
    }
}
