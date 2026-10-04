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
    public final long f4270a;
    public final String f4271b;
    public final long f4272c;
    public final boolean d;
    public final String[] f4273e;
    public final boolean f4274f;
    public final boolean h;

    public b(long j3, String str, long j10, boolean z10, String[] strArr, boolean z11, boolean z12) {
        this.f4270a = j3;
        this.f4271b = str;
        this.f4272c = j10;
        this.d = z10;
        this.f4273e = strArr;
        this.f4274f = z11;
        this.h = z12;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f4271b);
            long j3 = this.f4270a;
            Pattern pattern = g6.a.f10248a;
            jSONObject.put("position", j3 / 1000.0d);
            jSONObject.put("isWatched", this.d);
            jSONObject.put("isEmbedded", this.f4274f);
            jSONObject.put("duration", this.f4272c / 1000.0d);
            jSONObject.put("expanded", this.h);
            String[] strArr = this.f4273e;
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
        if (g6.a.d(this.f4271b, bVar.f4271b) && this.f4270a == bVar.f4270a && this.f4272c == bVar.f4272c && this.d == bVar.d && Arrays.equals(this.f4273e, bVar.f4273e) && this.f4274f == bVar.f4274f && this.h == bVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4271b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 2, 8);
        parcel.writeLong(this.f4270a);
        g0.l(parcel, 3, this.f4271b);
        g0.s(parcel, 4, 8);
        parcel.writeLong(this.f4272c);
        g0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        g0.m(parcel, 6, this.f4273e);
        g0.s(parcel, 7, 4);
        parcel.writeInt(this.f4274f ? 1 : 0);
        g0.s(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        g0.r(parcel, q6);
    }
}
