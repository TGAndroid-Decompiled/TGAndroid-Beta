package e6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class b extends q6.a {
    public static final Parcelable.Creator<b> CREATOR = new v(4);
    public final long f9666a;
    public final String f9667b;
    public final long f9668c;
    public final boolean d;
    public final String[] f9669e;
    public final boolean f9670f;
    public final boolean h;

    public b(long j10, String str, long j11, boolean z10, String[] strArr, boolean z11, boolean z12) {
        this.f9666a = j10;
        this.f9667b = str;
        this.f9668c = j11;
        this.d = z10;
        this.f9669e = strArr;
        this.f9670f = z11;
        this.h = z12;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f9667b);
            long j10 = this.f9666a;
            Pattern pattern = i6.a.f14618a;
            jSONObject.put("position", j10 / 1000.0d);
            jSONObject.put("isWatched", this.d);
            jSONObject.put("isEmbedded", this.f9670f);
            jSONObject.put("duration", this.f9668c / 1000.0d);
            jSONObject.put("expanded", this.h);
            String[] strArr = this.f9669e;
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
        if (i6.a.d(this.f9667b, bVar.f9667b) && this.f9666a == bVar.f9666a && this.f9668c == bVar.f9668c && this.d == bVar.d && Arrays.equals(this.f9669e, bVar.f9669e) && this.f9670f == bVar.f9670f && this.h == bVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9667b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 8);
        parcel.writeLong(this.f9666a);
        j8.a.m(parcel, 3, this.f9667b);
        j8.a.r(parcel, 4, 8);
        parcel.writeLong(this.f9668c);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        j8.a.n(parcel, 6, this.f9669e);
        j8.a.r(parcel, 7, 4);
        parcel.writeInt(this.f9670f ? 1 : 0);
        j8.a.r(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
