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
    public final long f11354a;
    public final String f11355b;
    public final long f11356c;
    public final boolean d;
    public final String[] f11357e;
    public final boolean f11358f;
    public final boolean h;

    public b(long j3, String str, long j10, boolean z10, String[] strArr, boolean z11, boolean z12) {
        this.f11354a = j3;
        this.f11355b = str;
        this.f11356c = j10;
        this.d = z10;
        this.f11357e = strArr;
        this.f11358f = z11;
        this.h = z12;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f11355b);
            long j3 = this.f11354a;
            Pattern pattern = j6.a.f17239a;
            jSONObject.put("position", j3 / 1000.0d);
            jSONObject.put("isWatched", this.d);
            jSONObject.put("isEmbedded", this.f11358f);
            jSONObject.put("duration", this.f11356c / 1000.0d);
            jSONObject.put("expanded", this.h);
            String[] strArr = this.f11357e;
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
        if (j6.a.d(this.f11355b, bVar.f11355b) && this.f11354a == bVar.f11354a && this.f11356c == bVar.f11356c && this.d == bVar.d && Arrays.equals(this.f11357e, bVar.f11357e) && this.f11358f == bVar.f11358f && this.h == bVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11355b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 8);
        parcel.writeLong(this.f11354a);
        bc.l(parcel, 3, this.f11355b);
        bc.q(parcel, 4, 8);
        parcel.writeLong(this.f11356c);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        bc.m(parcel, 6, this.f11357e);
        bc.q(parcel, 7, 4);
        parcel.writeInt(this.f11358f ? 1 : 0);
        bc.q(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        bc.s(parcel, r10);
    }
}
