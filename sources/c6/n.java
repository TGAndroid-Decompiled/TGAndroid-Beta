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
import v7.t7;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new v(13);
    public String f4390a;
    public String f4391b;
    public int f4392c;
    public String d;
    public m f4393e;
    public int f4394f;
    public List h;
    public int f4395n;
    public long f4396r;
    public boolean f4397s;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f4390a)) {
                jSONObject.put("id", this.f4390a);
            }
            if (!TextUtils.isEmpty(this.f4391b)) {
                jSONObject.put("entity", this.f4391b);
            }
            switch (this.f4392c) {
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
            m mVar = this.f4393e;
            if (mVar != null) {
                jSONObject.put("containerMetadata", mVar.b());
            }
            String b10 = t7.b(Integer.valueOf(this.f4394f));
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
            jSONObject.put("startIndex", this.f4395n);
            long j3 = this.f4396r;
            if (j3 != -1) {
                Pattern pattern = g6.a.f10320a;
                jSONObject.put("startTime", j3 / 1000.0d);
            }
            jSONObject.put("shuffle", this.f4397s);
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
        if (TextUtils.equals(this.f4390a, nVar.f4390a) && TextUtils.equals(this.f4391b, nVar.f4391b) && this.f4392c == nVar.f4392c && TextUtils.equals(this.d, nVar.d) && n6.m.l(this.f4393e, nVar.f4393e) && this.f4394f == nVar.f4394f && n6.m.l(this.h, nVar.h) && this.f4395n == nVar.f4395n && this.f4396r == nVar.f4396r && this.f4397s == nVar.f4397s) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4390a, this.f4391b, Integer.valueOf(this.f4392c), this.d, this.f4393e, Integer.valueOf(this.f4394f), this.h, Integer.valueOf(this.f4395n), Long.valueOf(this.f4396r), Boolean.valueOf(this.f4397s)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        List unmodifiableList;
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.l(parcel, 2, this.f4390a);
        w7.d0.l(parcel, 3, this.f4391b);
        int i11 = this.f4392c;
        w7.d0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        w7.d0.l(parcel, 5, this.d);
        w7.d0.k(parcel, 6, this.f4393e, i10);
        int i12 = this.f4394f;
        w7.d0.s(parcel, 7, 4);
        parcel.writeInt(i12);
        List list = this.h;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        w7.d0.p(parcel, 8, unmodifiableList);
        int i13 = this.f4395n;
        w7.d0.s(parcel, 9, 4);
        parcel.writeInt(i13);
        long j3 = this.f4396r;
        w7.d0.s(parcel, 10, 8);
        parcel.writeLong(j3);
        boolean z10 = this.f4397s;
        w7.d0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        w7.d0.r(parcel, q6);
    }
}
