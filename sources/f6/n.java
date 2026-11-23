package f6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c8.cc;
import c8.d1;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class n extends r6.a {
    public static final Parcelable.Creator<n> CREATOR = new v(13);
    public String f11418a;
    public String f11419b;
    public int f11420c;
    public String d;
    public m f11421e;
    public int f11422f;
    public List h;
    public int f11423n;
    public long f11424r;
    public boolean f11425s;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f11418a)) {
                jSONObject.put("id", this.f11418a);
            }
            if (!TextUtils.isEmpty(this.f11419b)) {
                jSONObject.put("entity", this.f11419b);
            }
            switch (this.f11420c) {
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
            m mVar = this.f11421e;
            if (mVar != null) {
                jSONObject.put("containerMetadata", mVar.b());
            }
            String b10 = d1.b(Integer.valueOf(this.f11422f));
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
            jSONObject.put("startIndex", this.f11423n);
            long j3 = this.f11424r;
            if (j3 != -1) {
                Pattern pattern = j6.a.f17330a;
                jSONObject.put("startTime", j3 / 1000.0d);
            }
            jSONObject.put("shuffle", this.f11425s);
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
        if (TextUtils.equals(this.f11418a, nVar.f11418a) && TextUtils.equals(this.f11419b, nVar.f11419b) && this.f11420c == nVar.f11420c && TextUtils.equals(this.d, nVar.d) && q6.m.l(this.f11421e, nVar.f11421e) && this.f11422f == nVar.f11422f && q6.m.l(this.h, nVar.h) && this.f11423n == nVar.f11423n && this.f11424r == nVar.f11424r && this.f11425s == nVar.f11425s) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11418a, this.f11419b, Integer.valueOf(this.f11420c), this.d, this.f11421e, Integer.valueOf(this.f11422f), this.h, Integer.valueOf(this.f11423n), Long.valueOf(this.f11424r), Boolean.valueOf(this.f11425s)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        List unmodifiableList;
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f11418a);
        cc.l(parcel, 3, this.f11419b);
        int i10 = this.f11420c;
        cc.q(parcel, 4, 4);
        parcel.writeInt(i10);
        cc.l(parcel, 5, this.d);
        cc.k(parcel, 6, this.f11421e, i7);
        int i11 = this.f11422f;
        cc.q(parcel, 7, 4);
        parcel.writeInt(i11);
        List list = this.h;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        cc.p(parcel, 8, unmodifiableList);
        int i12 = this.f11423n;
        cc.q(parcel, 9, 4);
        parcel.writeInt(i12);
        long j3 = this.f11424r;
        cc.q(parcel, 10, 8);
        parcel.writeLong(j3);
        boolean z10 = this.f11425s;
        cc.q(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        cc.s(parcel, r10);
    }
}
