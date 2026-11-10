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
    public String f11298a;
    public String f11299b;
    public int f11300c;
    public String d;
    public m f11301e;
    public int f11302f;
    public List h;
    public int f11303n;
    public long f11304r;
    public boolean f11305s;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f11298a)) {
                jSONObject.put("id", this.f11298a);
            }
            if (!TextUtils.isEmpty(this.f11299b)) {
                jSONObject.put("entity", this.f11299b);
            }
            switch (this.f11300c) {
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
            m mVar = this.f11301e;
            if (mVar != null) {
                jSONObject.put("containerMetadata", mVar.b());
            }
            String b10 = y0.b(Integer.valueOf(this.f11302f));
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
            jSONObject.put("startIndex", this.f11303n);
            long j3 = this.f11304r;
            if (j3 != -1) {
                Pattern pattern = j6.a.f16506a;
                jSONObject.put("startTime", j3 / 1000.0d);
            }
            jSONObject.put("shuffle", this.f11305s);
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
        if (TextUtils.equals(this.f11298a, nVar.f11298a) && TextUtils.equals(this.f11299b, nVar.f11299b) && this.f11300c == nVar.f11300c && TextUtils.equals(this.d, nVar.d) && q6.m.k(this.f11301e, nVar.f11301e) && this.f11302f == nVar.f11302f && q6.m.k(this.h, nVar.h) && this.f11303n == nVar.f11303n && this.f11304r == nVar.f11304r && this.f11305s == nVar.f11305s) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11298a, this.f11299b, Integer.valueOf(this.f11300c), this.d, this.f11301e, Integer.valueOf(this.f11302f), this.h, Integer.valueOf(this.f11303n), Long.valueOf(this.f11304r), Boolean.valueOf(this.f11305s)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        List unmodifiableList;
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.f11298a);
        xb.l(parcel, 3, this.f11299b);
        int i10 = this.f11300c;
        xb.q(parcel, 4, 4);
        parcel.writeInt(i10);
        xb.l(parcel, 5, this.d);
        xb.k(parcel, 6, this.f11301e, i7);
        int i11 = this.f11302f;
        xb.q(parcel, 7, 4);
        parcel.writeInt(i11);
        List list = this.h;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        xb.p(parcel, 8, unmodifiableList);
        int i12 = this.f11303n;
        xb.q(parcel, 9, 4);
        parcel.writeInt(i12);
        long j3 = this.f11304r;
        xb.q(parcel, 10, 8);
        parcel.writeLong(j3);
        boolean z9 = this.f11305s;
        xb.q(parcel, 11, 4);
        parcel.writeInt(z9 ? 1 : 0);
        xb.s(parcel, r10);
    }
}
