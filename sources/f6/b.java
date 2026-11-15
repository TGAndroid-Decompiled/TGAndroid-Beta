package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new v(4);
    public final long f11037a;
    public final String f11038b;
    public final long f11039c;
    public final boolean d;
    public final String[] f11040e;
    public final boolean f11041f;
    public final boolean h;

    public b(long j3, String str, long j10, boolean z10, String[] strArr, boolean z11, boolean z12) {
        this.f11037a = j3;
        this.f11038b = str;
        this.f11039c = j10;
        this.d = z10;
        this.f11040e = strArr;
        this.f11041f = z11;
        this.h = z12;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f11038b);
            long j3 = this.f11037a;
            Pattern pattern = j6.a.f16857a;
            jSONObject.put("position", j3 / 1000.0d);
            jSONObject.put("isWatched", this.d);
            jSONObject.put("isEmbedded", this.f11041f);
            jSONObject.put("duration", this.f11039c / 1000.0d);
            jSONObject.put("expanded", this.h);
            String[] strArr = this.f11040e;
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
        if (j6.a.d(this.f11038b, bVar.f11038b) && this.f11037a == bVar.f11037a && this.f11039c == bVar.f11039c && this.d == bVar.d && Arrays.equals(this.f11040e, bVar.f11040e) && this.f11041f == bVar.f11041f && this.h == bVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11038b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 8);
        parcel.writeLong(this.f11037a);
        yb.l(parcel, 3, this.f11038b);
        yb.q(parcel, 4, 8);
        parcel.writeLong(this.f11039c);
        yb.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        yb.m(parcel, 6, this.f11040e);
        yb.q(parcel, 7, 4);
        parcel.writeInt(this.f11041f ? 1 : 0);
        yb.q(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        yb.s(parcel, r10);
    }
}
