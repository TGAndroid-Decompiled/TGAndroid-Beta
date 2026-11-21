package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new v(4);
    public final long f11383a;
    public final String f11384b;
    public final long f11385c;
    public final boolean d;
    public final String[] f11386e;
    public final boolean f11387f;
    public final boolean h;

    public b(long j3, String str, long j10, boolean z10, String[] strArr, boolean z11, boolean z12) {
        this.f11383a = j3;
        this.f11384b = str;
        this.f11385c = j10;
        this.d = z10;
        this.f11386e = strArr;
        this.f11387f = z11;
        this.h = z12;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f11384b);
            long j3 = this.f11383a;
            Pattern pattern = j6.a.f17264a;
            jSONObject.put("position", j3 / 1000.0d);
            jSONObject.put("isWatched", this.d);
            jSONObject.put("isEmbedded", this.f11387f);
            jSONObject.put("duration", this.f11385c / 1000.0d);
            jSONObject.put("expanded", this.h);
            String[] strArr = this.f11386e;
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
        if (j6.a.d(this.f11384b, bVar.f11384b) && this.f11383a == bVar.f11383a && this.f11385c == bVar.f11385c && this.d == bVar.d && Arrays.equals(this.f11386e, bVar.f11386e) && this.f11387f == bVar.f11387f && this.h == bVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11384b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 8);
        parcel.writeLong(this.f11383a);
        bc.l(parcel, 3, this.f11384b);
        bc.q(parcel, 4, 8);
        parcel.writeLong(this.f11385c);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        bc.m(parcel, 6, this.f11386e);
        bc.q(parcel, 7, 4);
        parcel.writeInt(this.f11387f ? 1 : 0);
        bc.q(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        bc.s(parcel, r10);
    }
}
