package d6;

import a8.df;
import a8.uc;
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
public final class n extends p6.a {
    public static final Parcelable.Creator<n> CREATOR = new v(13);
    public String f8104a;
    public String f8105b;
    public int f8106c;
    public String d;
    public m e;
    public int f8107f;
    public List h;
    public int f8108n;
    public long f8109r;
    public boolean f8110s;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f8104a)) {
                jSONObject.put("id", this.f8104a);
            }
            if (!TextUtils.isEmpty(this.f8105b)) {
                jSONObject.put("entity", this.f8105b);
            }
            switch (this.f8106c) {
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
            String b10 = uc.b(Integer.valueOf(this.f8107f));
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
            jSONObject.put("startIndex", this.f8108n);
            long j10 = this.f8109r;
            if (j10 != -1) {
                Pattern pattern = h6.a.f12619a;
                jSONObject.put("startTime", j10 / 1000.0d);
            }
            jSONObject.put("shuffle", this.f8110s);
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
        if (TextUtils.equals(this.f8104a, nVar.f8104a) && TextUtils.equals(this.f8105b, nVar.f8105b) && this.f8106c == nVar.f8106c && TextUtils.equals(this.d, nVar.d) && o6.l.l(this.e, nVar.e) && this.f8107f == nVar.f8107f && o6.l.l(this.h, nVar.h) && this.f8108n == nVar.f8108n && this.f8109r == nVar.f8109r && this.f8110s == nVar.f8110s) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8104a, this.f8105b, Integer.valueOf(this.f8106c), this.d, this.e, Integer.valueOf(this.f8107f), this.h, Integer.valueOf(this.f8108n), Long.valueOf(this.f8109r), Boolean.valueOf(this.f8110s)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        List unmodifiableList;
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f8104a);
        df.l(parcel, 3, this.f8105b);
        int i11 = this.f8106c;
        df.s(parcel, 4, 4);
        parcel.writeInt(i11);
        df.l(parcel, 5, this.d);
        df.k(parcel, 6, this.e, i10);
        int i12 = this.f8107f;
        df.s(parcel, 7, 4);
        parcel.writeInt(i12);
        List list = this.h;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        df.p(parcel, 8, unmodifiableList);
        int i13 = this.f8108n;
        df.s(parcel, 9, 4);
        parcel.writeInt(i13);
        long j10 = this.f8109r;
        df.s(parcel, 10, 8);
        parcel.writeLong(j10);
        boolean z10 = this.f8110s;
        df.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        df.r(parcel, q5);
    }
}
