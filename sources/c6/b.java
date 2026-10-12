package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w7.g0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new v(4);
    public final long f4441a;
    public final String f4442b;
    public final long f4443c;
    public final boolean d;
    public final String[] e;
    public final boolean f4444f;
    public final boolean h;

    public b(long j10, String str, long j11, boolean z10, String[] strArr, boolean z11, boolean z12) {
        this.f4441a = j10;
        this.f4442b = str;
        this.f4443c = j11;
        this.d = z10;
        this.e = strArr;
        this.f4444f = z11;
        this.h = z12;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f4442b);
            long j10 = this.f4441a;
            Pattern pattern = g6.a.f9932a;
            jSONObject.put("position", j10 / 1000.0d);
            jSONObject.put("isWatched", this.d);
            jSONObject.put("isEmbedded", this.f4444f);
            jSONObject.put("duration", this.f4443c / 1000.0d);
            jSONObject.put("expanded", this.h);
            String[] strArr = this.e;
            if (strArr != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : strArr) {
                    jSONArray.put(str);
                }
                jSONObject.put("breakClipIds", jSONArray);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (g6.a.d(this.f4442b, bVar.f4442b) && this.f4441a == bVar.f4441a && this.f4443c == bVar.f4443c && this.d == bVar.d && Arrays.equals(this.e, bVar.e) && this.f4444f == bVar.f4444f && this.h == bVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4442b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 2, 8);
        parcel.writeLong(this.f4441a);
        g0.l(parcel, 3, this.f4442b);
        g0.s(parcel, 4, 8);
        parcel.writeLong(this.f4443c);
        g0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        g0.m(parcel, 6, this.e);
        g0.s(parcel, 7, 4);
        parcel.writeInt(this.f4444f ? 1 : 0);
        g0.s(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        g0.r(parcel, q6);
    }
}
