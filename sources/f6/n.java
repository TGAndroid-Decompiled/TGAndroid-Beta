package f6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c8.bc;
import c8.c1;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class n extends r6.a {
    public static final Parcelable.Creator<n> CREATOR = new v(13);
    public String f11453a;
    public String f11454b;
    public int f11455c;
    public String d;
    public m f11456e;
    public int f11457f;
    public List h;
    public int f11458n;
    public long f11459r;
    public boolean f11460s;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f11453a)) {
                jSONObject.put("id", this.f11453a);
            }
            if (!TextUtils.isEmpty(this.f11454b)) {
                jSONObject.put("entity", this.f11454b);
            }
            switch (this.f11455c) {
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
            m mVar = this.f11456e;
            if (mVar != null) {
                jSONObject.put("containerMetadata", mVar.b());
            }
            String b10 = c1.b(Integer.valueOf(this.f11457f));
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
            jSONObject.put("startIndex", this.f11458n);
            long j3 = this.f11459r;
            if (j3 != -1) {
                Pattern pattern = j6.a.f17264a;
                jSONObject.put("startTime", j3 / 1000.0d);
            }
            jSONObject.put("shuffle", this.f11460s);
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
        if (TextUtils.equals(this.f11453a, nVar.f11453a) && TextUtils.equals(this.f11454b, nVar.f11454b) && this.f11455c == nVar.f11455c && TextUtils.equals(this.d, nVar.d) && q6.m.l(this.f11456e, nVar.f11456e) && this.f11457f == nVar.f11457f && q6.m.l(this.h, nVar.h) && this.f11458n == nVar.f11458n && this.f11459r == nVar.f11459r && this.f11460s == nVar.f11460s) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11453a, this.f11454b, Integer.valueOf(this.f11455c), this.d, this.f11456e, Integer.valueOf(this.f11457f), this.h, Integer.valueOf(this.f11458n), Long.valueOf(this.f11459r), Boolean.valueOf(this.f11460s)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        List unmodifiableList;
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f11453a);
        bc.l(parcel, 3, this.f11454b);
        int i10 = this.f11455c;
        bc.q(parcel, 4, 4);
        parcel.writeInt(i10);
        bc.l(parcel, 5, this.d);
        bc.k(parcel, 6, this.f11456e, i7);
        int i11 = this.f11457f;
        bc.q(parcel, 7, 4);
        parcel.writeInt(i11);
        List list = this.h;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        bc.p(parcel, 8, unmodifiableList);
        int i12 = this.f11458n;
        bc.q(parcel, 9, 4);
        parcel.writeInt(i12);
        long j3 = this.f11459r;
        bc.q(parcel, 10, 8);
        parcel.writeLong(j3);
        boolean z10 = this.f11460s;
        bc.q(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        bc.s(parcel, r10);
    }
}
