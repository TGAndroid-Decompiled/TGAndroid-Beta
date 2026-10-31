package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w7.h0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new v(4);
    public final long f3843a;
    public final String f3844b;
    public final long f3845c;
    public final boolean d;
    public final String[] e;
    public final boolean f3846f;
    public final boolean h;

    public b(long j10, String str, long j11, boolean z10, String[] strArr, boolean z11, boolean z12) {
        this.f3843a = j10;
        this.f3844b = str;
        this.f3845c = j11;
        this.d = z10;
        this.e = strArr;
        this.f3846f = z11;
        this.h = z12;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f3844b);
            long j10 = this.f3843a;
            Pattern pattern = g6.a.f7365a;
            jSONObject.put("position", j10 / 1000.0d);
            jSONObject.put("isWatched", this.d);
            jSONObject.put("isEmbedded", this.f3846f);
            jSONObject.put("duration", this.f3845c / 1000.0d);
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
        if (g6.a.d(this.f3844b, bVar.f3844b) && this.f3843a == bVar.f3843a && this.f3845c == bVar.f3845c && this.d == bVar.d && Arrays.equals(this.e, bVar.e) && this.f3846f == bVar.f3846f && this.h == bVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3844b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 2, 8);
        parcel.writeLong(this.f3843a);
        h0.l(parcel, 3, this.f3844b);
        h0.s(parcel, 4, 8);
        parcel.writeLong(this.f3845c);
        h0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        h0.m(parcel, 6, this.e);
        h0.s(parcel, 7, 4);
        parcel.writeInt(this.f3846f ? 1 : 0);
        h0.s(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        h0.r(parcel, q6);
    }
}
