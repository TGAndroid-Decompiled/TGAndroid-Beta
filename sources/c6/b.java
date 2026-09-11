package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new v(4);
    public final long f4463a;
    public final String f4464b;
    public final long f4465c;
    public final boolean d;
    public final String[] f4466e;
    public final boolean f4467f;
    public final boolean h;

    public b(long j3, String str, long j10, boolean z10, String[] strArr, boolean z11, boolean z12) {
        this.f4463a = j3;
        this.f4464b = str;
        this.f4465c = j10;
        this.d = z10;
        this.f4466e = strArr;
        this.f4467f = z11;
        this.h = z12;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f4464b);
            long j3 = this.f4463a;
            Pattern pattern = g6.a.f10384a;
            jSONObject.put("position", j3 / 1000.0d);
            jSONObject.put("isWatched", this.d);
            jSONObject.put("isEmbedded", this.f4467f);
            jSONObject.put("duration", this.f4465c / 1000.0d);
            jSONObject.put("expanded", this.h);
            String[] strArr = this.f4466e;
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
        if (g6.a.d(this.f4464b, bVar.f4464b) && this.f4463a == bVar.f4463a && this.f4465c == bVar.f4465c && this.d == bVar.d && Arrays.equals(this.f4466e, bVar.f4466e) && this.f4467f == bVar.f4467f && this.h == bVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4464b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 8);
        parcel.writeLong(this.f4463a);
        w7.e0.l(parcel, 3, this.f4464b);
        w7.e0.s(parcel, 4, 8);
        parcel.writeLong(this.f4465c);
        w7.e0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.e0.m(parcel, 6, this.f4466e);
        w7.e0.s(parcel, 7, 4);
        parcel.writeInt(this.f4467f ? 1 : 0);
        w7.e0.s(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        w7.e0.r(parcel, q6);
    }
}
