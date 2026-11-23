package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new v(4);
    public final long f11349a;
    public final String f11350b;
    public final long f11351c;
    public final boolean d;
    public final String[] f11352e;
    public final boolean f11353f;
    public final boolean h;

    public b(long j3, String str, long j10, boolean z10, String[] strArr, boolean z11, boolean z12) {
        this.f11349a = j3;
        this.f11350b = str;
        this.f11351c = j10;
        this.d = z10;
        this.f11352e = strArr;
        this.f11353f = z11;
        this.h = z12;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f11350b);
            long j3 = this.f11349a;
            Pattern pattern = j6.a.f17233a;
            jSONObject.put("position", j3 / 1000.0d);
            jSONObject.put("isWatched", this.d);
            jSONObject.put("isEmbedded", this.f11353f);
            jSONObject.put("duration", this.f11351c / 1000.0d);
            jSONObject.put("expanded", this.h);
            String[] strArr = this.f11352e;
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
        if (j6.a.d(this.f11350b, bVar.f11350b) && this.f11349a == bVar.f11349a && this.f11351c == bVar.f11351c && this.d == bVar.d && Arrays.equals(this.f11352e, bVar.f11352e) && this.f11353f == bVar.f11353f && this.h == bVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11350b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 8);
        parcel.writeLong(this.f11349a);
        cc.l(parcel, 3, this.f11350b);
        cc.q(parcel, 4, 8);
        parcel.writeLong(this.f11351c);
        cc.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        cc.m(parcel, 6, this.f11352e);
        cc.q(parcel, 7, 4);
        parcel.writeInt(this.f11353f ? 1 : 0);
        cc.q(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        cc.s(parcel, r10);
    }
}
