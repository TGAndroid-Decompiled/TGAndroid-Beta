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
    public final long f11223a;
    public final String f11224b;
    public final long f11225c;
    public final boolean d;
    public final String[] f11226e;
    public final boolean f11227f;
    public final boolean h;

    public b(long j3, String str, long j10, boolean z9, String[] strArr, boolean z10, boolean z11) {
        this.f11223a = j3;
        this.f11224b = str;
        this.f11225c = j10;
        this.d = z9;
        this.f11226e = strArr;
        this.f11227f = z10;
        this.h = z11;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f11224b);
            long j3 = this.f11223a;
            Pattern pattern = j6.a.f16503a;
            jSONObject.put("position", j3 / 1000.0d);
            jSONObject.put("isWatched", this.d);
            jSONObject.put("isEmbedded", this.f11227f);
            jSONObject.put("duration", this.f11225c / 1000.0d);
            jSONObject.put("expanded", this.h);
            String[] strArr = this.f11226e;
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
        if (j6.a.d(this.f11224b, bVar.f11224b) && this.f11223a == bVar.f11223a && this.f11225c == bVar.f11225c && this.d == bVar.d && Arrays.equals(this.f11226e, bVar.f11226e) && this.f11227f == bVar.f11227f && this.h == bVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11224b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 8);
        parcel.writeLong(this.f11223a);
        xb.l(parcel, 3, this.f11224b);
        xb.q(parcel, 4, 8);
        parcel.writeLong(this.f11225c);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        xb.m(parcel, 6, this.f11226e);
        xb.q(parcel, 7, 4);
        parcel.writeInt(this.f11227f ? 1 : 0);
        xb.q(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        xb.s(parcel, r10);
    }
}
