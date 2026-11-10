package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new v(4);
    public final long f11228a;
    public final String f11229b;
    public final long f11230c;
    public final boolean d;
    public final String[] f11231e;
    public final boolean f11232f;
    public final boolean h;

    public b(long j3, String str, long j10, boolean z9, String[] strArr, boolean z10, boolean z11) {
        this.f11228a = j3;
        this.f11229b = str;
        this.f11230c = j10;
        this.d = z9;
        this.f11231e = strArr;
        this.f11232f = z10;
        this.h = z11;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f11229b);
            long j3 = this.f11228a;
            Pattern pattern = j6.a.f16506a;
            jSONObject.put("position", j3 / 1000.0d);
            jSONObject.put("isWatched", this.d);
            jSONObject.put("isEmbedded", this.f11232f);
            jSONObject.put("duration", this.f11230c / 1000.0d);
            jSONObject.put("expanded", this.h);
            String[] strArr = this.f11231e;
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
        if (j6.a.d(this.f11229b, bVar.f11229b) && this.f11228a == bVar.f11228a && this.f11230c == bVar.f11230c && this.d == bVar.d && Arrays.equals(this.f11231e, bVar.f11231e) && this.f11232f == bVar.f11232f && this.h == bVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11229b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 8);
        parcel.writeLong(this.f11228a);
        xb.l(parcel, 3, this.f11229b);
        xb.q(parcel, 4, 8);
        parcel.writeLong(this.f11230c);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        xb.m(parcel, 6, this.f11231e);
        xb.q(parcel, 7, 4);
        parcel.writeInt(this.f11232f ? 1 : 0);
        xb.q(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        xb.s(parcel, r10);
    }
}
