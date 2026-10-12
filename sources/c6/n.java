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
import v7.r7;
import w7.g0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new v(13);
    public String f4505a;
    public String f4506b;
    public int f4507c;
    public String d;
    public m e;
    public int f4508f;
    public List h;
    public int f4509n;
    public long f4510r;
    public boolean f4511s;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f4505a)) {
                jSONObject.put("id", this.f4505a);
            }
            if (!TextUtils.isEmpty(this.f4506b)) {
                jSONObject.put("entity", this.f4506b);
            }
            switch (this.f4507c) {
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
            m mVar = this.e;
            if (mVar != null) {
                jSONObject.put("containerMetadata", mVar.b());
            }
            String b10 = r7.b(Integer.valueOf(this.f4508f));
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
            jSONObject.put("startIndex", this.f4509n);
            long j10 = this.f4510r;
            if (j10 != -1) {
                Pattern pattern = g6.a.f9932a;
                jSONObject.put("startTime", j10 / 1000.0d);
            }
            jSONObject.put("shuffle", this.f4511s);
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
        if (TextUtils.equals(this.f4505a, nVar.f4505a) && TextUtils.equals(this.f4506b, nVar.f4506b) && this.f4507c == nVar.f4507c && TextUtils.equals(this.d, nVar.d) && n6.l.l(this.e, nVar.e) && this.f4508f == nVar.f4508f && n6.l.l(this.h, nVar.h) && this.f4509n == nVar.f4509n && this.f4510r == nVar.f4510r && this.f4511s == nVar.f4511s) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4505a, this.f4506b, Integer.valueOf(this.f4507c), this.d, this.e, Integer.valueOf(this.f4508f), this.h, Integer.valueOf(this.f4509n), Long.valueOf(this.f4510r), Boolean.valueOf(this.f4511s)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        List unmodifiableList;
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 2, this.f4505a);
        g0.l(parcel, 3, this.f4506b);
        int i11 = this.f4507c;
        g0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        g0.l(parcel, 5, this.d);
        g0.k(parcel, 6, this.e, i10);
        int i12 = this.f4508f;
        g0.s(parcel, 7, 4);
        parcel.writeInt(i12);
        List list = this.h;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        g0.p(parcel, 8, unmodifiableList);
        int i13 = this.f4509n;
        g0.s(parcel, 9, 4);
        parcel.writeInt(i13);
        long j10 = this.f4510r;
        g0.s(parcel, 10, 8);
        parcel.writeLong(j10);
        boolean z10 = this.f4511s;
        g0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        g0.r(parcel, q6);
    }
}
