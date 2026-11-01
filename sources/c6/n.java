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
import v7.s7;
import w7.h0;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new v(13);
    public String f3907a;
    public String f3908b;
    public int f3909c;
    public String d;
    public m e;
    public int f3910f;
    public List h;
    public int f3911n;
    public long f3912r;
    public boolean f3913s;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f3907a)) {
                jSONObject.put("id", this.f3907a);
            }
            if (!TextUtils.isEmpty(this.f3908b)) {
                jSONObject.put("entity", this.f3908b);
            }
            switch (this.f3909c) {
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
            String b10 = s7.b(Integer.valueOf(this.f3910f));
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
            jSONObject.put("startIndex", this.f3911n);
            long j10 = this.f3912r;
            if (j10 != -1) {
                Pattern pattern = g6.a.f7366a;
                jSONObject.put("startTime", j10 / 1000.0d);
            }
            jSONObject.put("shuffle", this.f3913s);
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
        if (TextUtils.equals(this.f3907a, nVar.f3907a) && TextUtils.equals(this.f3908b, nVar.f3908b) && this.f3909c == nVar.f3909c && TextUtils.equals(this.d, nVar.d) && n6.l.k(this.e, nVar.e) && this.f3910f == nVar.f3910f && n6.l.k(this.h, nVar.h) && this.f3911n == nVar.f3911n && this.f3912r == nVar.f3912r && this.f3913s == nVar.f3913s) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3907a, this.f3908b, Integer.valueOf(this.f3909c), this.d, this.e, Integer.valueOf(this.f3910f), this.h, Integer.valueOf(this.f3911n), Long.valueOf(this.f3912r), Boolean.valueOf(this.f3913s)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        List unmodifiableList;
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.f3907a);
        h0.l(parcel, 3, this.f3908b);
        int i11 = this.f3909c;
        h0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        h0.l(parcel, 5, this.d);
        h0.k(parcel, 6, this.e, i10);
        int i12 = this.f3910f;
        h0.s(parcel, 7, 4);
        parcel.writeInt(i12);
        List list = this.h;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        h0.p(parcel, 8, unmodifiableList);
        int i13 = this.f3911n;
        h0.s(parcel, 9, 4);
        parcel.writeInt(i13);
        long j10 = this.f3912r;
        h0.s(parcel, 10, 8);
        parcel.writeLong(j10);
        boolean z10 = this.f3913s;
        h0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        h0.r(parcel, q6);
    }
}
