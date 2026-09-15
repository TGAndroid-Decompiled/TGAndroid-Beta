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
    public final long f3951a;
    public final String f3952b;
    public final long f3953c;
    public final boolean d;
    public final String[] e;
    public final boolean f3954f;
    public final boolean h;

    public b(long j3, String str, long j10, boolean z10, String[] strArr, boolean z11, boolean z12) {
        this.f3951a = j3;
        this.f3952b = str;
        this.f3953c = j10;
        this.d = z10;
        this.e = strArr;
        this.f3954f = z11;
        this.h = z12;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f3952b);
            long j3 = this.f3951a;
            Pattern pattern = g6.a.f9423a;
            jSONObject.put("position", j3 / 1000.0d);
            jSONObject.put("isWatched", this.d);
            jSONObject.put("isEmbedded", this.f3954f);
            jSONObject.put("duration", this.f3953c / 1000.0d);
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
        if (g6.a.d(this.f3952b, bVar.f3952b) && this.f3951a == bVar.f3951a && this.f3953c == bVar.f3953c && this.d == bVar.d && Arrays.equals(this.e, bVar.e) && this.f3954f == bVar.f3954f && this.h == bVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3952b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 2, 8);
        parcel.writeLong(this.f3951a);
        w7.e0.l(parcel, 3, this.f3952b);
        w7.e0.s(parcel, 4, 8);
        parcel.writeLong(this.f3953c);
        w7.e0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        w7.e0.m(parcel, 6, this.e);
        w7.e0.s(parcel, 7, 4);
        parcel.writeInt(this.f3954f ? 1 : 0);
        w7.e0.s(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        w7.e0.r(parcel, q6);
    }
}
