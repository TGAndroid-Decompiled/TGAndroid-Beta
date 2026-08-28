package m5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import g7.e7;
import g7.p8;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class n extends y5.a {
    public static final Parcelable.Creator<n> CREATOR = new v(13);
    public String f17437a;
    public String f17438b;
    public int f17439c;
    public String d;
    public m f17440e;
    public int f17441f;
    public List h;
    public int f17442n;
    public long f17443r;
    public boolean f17444s;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f17437a)) {
                jSONObject.put("id", this.f17437a);
            }
            if (!TextUtils.isEmpty(this.f17438b)) {
                jSONObject.put("entity", this.f17438b);
            }
            switch (this.f17439c) {
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
            m mVar = this.f17440e;
            if (mVar != null) {
                jSONObject.put("containerMetadata", mVar.b());
            }
            String b10 = e7.b(Integer.valueOf(this.f17441f));
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
            jSONObject.put("startIndex", this.f17442n);
            long j10 = this.f17443r;
            if (j10 != -1) {
                Pattern pattern = q5.a.f46007a;
                jSONObject.put("startTime", j10 / 1000.0d);
            }
            jSONObject.put("shuffle", this.f17444s);
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
        if (TextUtils.equals(this.f17437a, nVar.f17437a) && TextUtils.equals(this.f17438b, nVar.f17438b) && this.f17439c == nVar.f17439c && TextUtils.equals(this.d, nVar.d) && x5.l.l(this.f17440e, nVar.f17440e) && this.f17441f == nVar.f17441f && x5.l.l(this.h, nVar.h) && this.f17442n == nVar.f17442n && this.f17443r == nVar.f17443r && this.f17444s == nVar.f17444s) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17437a, this.f17438b, Integer.valueOf(this.f17439c), this.d, this.f17440e, Integer.valueOf(this.f17441f), this.h, Integer.valueOf(this.f17442n), Long.valueOf(this.f17443r), Boolean.valueOf(this.f17444s)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        List unmodifiableList;
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.f17437a);
        p8.l(parcel, 3, this.f17438b);
        int i10 = this.f17439c;
        p8.s(parcel, 4, 4);
        parcel.writeInt(i10);
        p8.l(parcel, 5, this.d);
        p8.k(parcel, 6, this.f17440e, i9);
        int i11 = this.f17441f;
        p8.s(parcel, 7, 4);
        parcel.writeInt(i11);
        List list = this.h;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        p8.p(parcel, 8, unmodifiableList);
        int i12 = this.f17442n;
        p8.s(parcel, 9, 4);
        parcel.writeInt(i12);
        long j10 = this.f17443r;
        p8.s(parcel, 10, 8);
        parcel.writeLong(j10);
        boolean z10 = this.f17444s;
        p8.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        p8.r(parcel, q10);
    }
}
