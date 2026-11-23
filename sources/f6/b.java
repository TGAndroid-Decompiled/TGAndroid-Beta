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
    public final long f11386a;
    public final String f11387b;
    public final long f11388c;
    public final boolean d;
    public final String[] f11389e;
    public final boolean f11390f;
    public final boolean h;

    public b(long j3, String str, long j10, boolean z10, String[] strArr, boolean z11, boolean z12) {
        this.f11386a = j3;
        this.f11387b = str;
        this.f11388c = j10;
        this.d = z10;
        this.f11389e = strArr;
        this.f11390f = z11;
        this.h = z12;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f11387b);
            long j3 = this.f11386a;
            Pattern pattern = j6.a.f17267a;
            jSONObject.put("position", j3 / 1000.0d);
            jSONObject.put("isWatched", this.d);
            jSONObject.put("isEmbedded", this.f11390f);
            jSONObject.put("duration", this.f11388c / 1000.0d);
            jSONObject.put("expanded", this.h);
            String[] strArr = this.f11389e;
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
        if (j6.a.d(this.f11387b, bVar.f11387b) && this.f11386a == bVar.f11386a && this.f11388c == bVar.f11388c && this.d == bVar.d && Arrays.equals(this.f11389e, bVar.f11389e) && this.f11390f == bVar.f11390f && this.h == bVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11387b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 8);
        parcel.writeLong(this.f11386a);
        bc.l(parcel, 3, this.f11387b);
        bc.q(parcel, 4, 8);
        parcel.writeLong(this.f11388c);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        bc.m(parcel, 6, this.f11389e);
        bc.q(parcel, 7, 4);
        parcel.writeInt(this.f11390f ? 1 : 0);
        bc.q(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        bc.s(parcel, r10);
    }
}
