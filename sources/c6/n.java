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
import v7.v7;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new v(13);
    public String f4561a;
    public String f4562b;
    public int f4563c;
    public String d;
    public m f4564e;
    public int f4565f;
    public List h;
    public int f4566n;
    public long f4567r;
    public boolean f4568s;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f4561a)) {
                jSONObject.put("id", this.f4561a);
            }
            if (!TextUtils.isEmpty(this.f4562b)) {
                jSONObject.put("entity", this.f4562b);
            }
            switch (this.f4563c) {
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
            m mVar = this.f4564e;
            if (mVar != null) {
                jSONObject.put("containerMetadata", mVar.b());
            }
            String b10 = v7.b(Integer.valueOf(this.f4565f));
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
            jSONObject.put("startIndex", this.f4566n);
            long j3 = this.f4567r;
            if (j3 != -1) {
                Pattern pattern = g6.a.f10412a;
                jSONObject.put("startTime", j3 / 1000.0d);
            }
            jSONObject.put("shuffle", this.f4568s);
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
        if (TextUtils.equals(this.f4561a, nVar.f4561a) && TextUtils.equals(this.f4562b, nVar.f4562b) && this.f4563c == nVar.f4563c && TextUtils.equals(this.d, nVar.d) && n6.l.l(this.f4564e, nVar.f4564e) && this.f4565f == nVar.f4565f && n6.l.l(this.h, nVar.h) && this.f4566n == nVar.f4566n && this.f4567r == nVar.f4567r && this.f4568s == nVar.f4568s) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4561a, this.f4562b, Integer.valueOf(this.f4563c), this.d, this.f4564e, Integer.valueOf(this.f4565f), this.h, Integer.valueOf(this.f4566n), Long.valueOf(this.f4567r), Boolean.valueOf(this.f4568s)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        List unmodifiableList;
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 2, this.f4561a);
        w7.e0.l(parcel, 3, this.f4562b);
        int i11 = this.f4563c;
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        w7.e0.l(parcel, 5, this.d);
        w7.e0.k(parcel, 6, this.f4564e, i10);
        int i12 = this.f4565f;
        w7.e0.s(parcel, 7, 4);
        parcel.writeInt(i12);
        List list = this.h;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        w7.e0.p(parcel, 8, unmodifiableList);
        int i13 = this.f4566n;
        w7.e0.s(parcel, 9, 4);
        parcel.writeInt(i13);
        long j3 = this.f4567r;
        w7.e0.s(parcel, 10, 8);
        parcel.writeLong(j3);
        boolean z10 = this.f4568s;
        w7.e0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        w7.e0.r(parcel, q6);
    }
}
