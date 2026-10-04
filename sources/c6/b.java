package c6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w7.g0;
public final class b extends o6.a {
    public static final Parcelable.Creator<b> CREATOR = new v(4);
    public final long f4269a;
    public final String f4270b;
    public final long f4271c;
    public final boolean d;
    public final String[] f4272e;
    public final boolean f4273f;
    public final boolean h;

    public b(long j3, String str, long j10, boolean z10, String[] strArr, boolean z11, boolean z12) {
        this.f4269a = j3;
        this.f4270b = str;
        this.f4271c = j10;
        this.d = z10;
        this.f4272e = strArr;
        this.f4273f = z11;
        this.h = z12;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f4270b);
            long j3 = this.f4269a;
            Pattern pattern = g6.a.f10247a;
            jSONObject.put("position", j3 / 1000.0d);
            jSONObject.put("isWatched", this.d);
            jSONObject.put("isEmbedded", this.f4273f);
            jSONObject.put("duration", this.f4271c / 1000.0d);
            jSONObject.put("expanded", this.h);
            String[] strArr = this.f4272e;
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
        if (g6.a.d(this.f4270b, bVar.f4270b) && this.f4269a == bVar.f4269a && this.f4271c == bVar.f4271c && this.d == bVar.d && Arrays.equals(this.f4272e, bVar.f4272e) && this.f4273f == bVar.f4273f && this.h == bVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4270b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 2, 8);
        parcel.writeLong(this.f4269a);
        g0.l(parcel, 3, this.f4270b);
        g0.s(parcel, 4, 8);
        parcel.writeLong(this.f4271c);
        g0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        g0.m(parcel, 6, this.f4272e);
        g0.s(parcel, 7, 4);
        parcel.writeInt(this.f4273f ? 1 : 0);
        g0.s(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        g0.r(parcel, q6);
    }
}
