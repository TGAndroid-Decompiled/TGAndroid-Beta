package e6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b8.ed;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class n extends q6.a {
    public static final Parcelable.Creator<n> CREATOR = new v(13);
    public String f9736a;
    public String f9737b;
    public int f9738c;
    public String d;
    public m f9739e;
    public int f9740f;
    public List h;
    public int f9741n;
    public long f9742r;
    public boolean f9743s;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f9736a)) {
                jSONObject.put("id", this.f9736a);
            }
            if (!TextUtils.isEmpty(this.f9737b)) {
                jSONObject.put("entity", this.f9737b);
            }
            switch (this.f9738c) {
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
            m mVar = this.f9739e;
            if (mVar != null) {
                jSONObject.put("containerMetadata", mVar.b());
            }
            String b10 = ed.b(Integer.valueOf(this.f9740f));
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
            jSONObject.put("startIndex", this.f9741n);
            long j10 = this.f9742r;
            if (j10 != -1) {
                Pattern pattern = i6.a.f14618a;
                jSONObject.put("startTime", j10 / 1000.0d);
            }
            jSONObject.put("shuffle", this.f9743s);
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
        if (TextUtils.equals(this.f9736a, nVar.f9736a) && TextUtils.equals(this.f9737b, nVar.f9737b) && this.f9738c == nVar.f9738c && TextUtils.equals(this.d, nVar.d) && p6.m.k(this.f9739e, nVar.f9739e) && this.f9740f == nVar.f9740f && p6.m.k(this.h, nVar.h) && this.f9741n == nVar.f9741n && this.f9742r == nVar.f9742r && this.f9743s == nVar.f9743s) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9736a, this.f9737b, Integer.valueOf(this.f9738c), this.d, this.f9739e, Integer.valueOf(this.f9740f), this.h, Integer.valueOf(this.f9741n), Long.valueOf(this.f9742r), Boolean.valueOf(this.f9743s)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        List unmodifiableList;
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.f9736a);
        j8.a.m(parcel, 3, this.f9737b);
        int i10 = this.f9738c;
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(i10);
        j8.a.m(parcel, 5, this.d);
        j8.a.l(parcel, 6, this.f9739e, i3);
        int i11 = this.f9740f;
        j8.a.r(parcel, 7, 4);
        parcel.writeInt(i11);
        List list = this.h;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        j8.a.q(parcel, 8, unmodifiableList);
        int i12 = this.f9741n;
        j8.a.r(parcel, 9, 4);
        parcel.writeInt(i12);
        long j10 = this.f9742r;
        j8.a.r(parcel, 10, 8);
        parcel.writeLong(j10);
        boolean z10 = this.f9743s;
        j8.a.r(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
