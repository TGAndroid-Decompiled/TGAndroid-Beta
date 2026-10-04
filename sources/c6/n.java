package c6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v7.w7;
import w7.g0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new v(13);
    public String f4340a;
    public String f4341b;
    public int f4342c;
    public String d;
    public m f4343e;
    public int f4344f;
    public List h;
    public int f4345n;
    public long f4346r;
    public boolean f4347s;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f4340a)) {
                jSONObject.put("id", this.f4340a);
            }
            if (!TextUtils.isEmpty(this.f4341b)) {
                jSONObject.put("entity", this.f4341b);
            }
            switch (this.f4342c) {
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
            m mVar = this.f4343e;
            if (mVar != null) {
                jSONObject.put("containerMetadata", mVar.b());
            }
            String b10 = w7.b(Integer.valueOf(this.f4344f));
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
            jSONObject.put("startIndex", this.f4345n);
            long j3 = this.f4346r;
            if (j3 != -1) {
                Pattern pattern = g6.a.f10247a;
                jSONObject.put("startTime", j3 / 1000.0d);
            }
            jSONObject.put("shuffle", this.f4347s);
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
        if (TextUtils.equals(this.f4340a, nVar.f4340a) && TextUtils.equals(this.f4341b, nVar.f4341b) && this.f4342c == nVar.f4342c && TextUtils.equals(this.d, nVar.d) && n6.l.l(this.f4343e, nVar.f4343e) && this.f4344f == nVar.f4344f && n6.l.l(this.h, nVar.h) && this.f4345n == nVar.f4345n && this.f4346r == nVar.f4346r && this.f4347s == nVar.f4347s) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4340a, this.f4341b, Integer.valueOf(this.f4342c), this.d, this.f4343e, Integer.valueOf(this.f4344f), this.h, Integer.valueOf(this.f4345n), Long.valueOf(this.f4346r), Boolean.valueOf(this.f4347s)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        List unmodifiableList;
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f4340a);
        g0.l(parcel, 3, this.f4341b);
        int i11 = this.f4342c;
        g0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        g0.l(parcel, 5, this.d);
        g0.k(parcel, 6, this.f4343e, i10);
        int i12 = this.f4344f;
        g0.s(parcel, 7, 4);
        parcel.writeInt(i12);
        List list = this.h;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        g0.p(parcel, 8, unmodifiableList);
        int i13 = this.f4345n;
        g0.s(parcel, 9, 4);
        parcel.writeInt(i13);
        long j3 = this.f4346r;
        g0.s(parcel, 10, 8);
        parcel.writeLong(j3);
        boolean z10 = this.f4347s;
        g0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        g0.r(parcel, q6);
    }
}
