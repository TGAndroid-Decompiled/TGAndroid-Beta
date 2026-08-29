package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class b extends a6.a {
    public static final Parcelable.Creator<b> CREATOR = new v(4);
    public final long f19225a;
    public final String f19226b;
    public final long f19227c;
    public final boolean d;
    public final String[] f19228e;
    public final boolean f19229f;
    public final boolean h;

    public b(long j10, String str, long j11, boolean z10, String[] strArr, boolean z11, boolean z12) {
        this.f19225a = j10;
        this.f19226b = str;
        this.f19227c = j11;
        this.d = z10;
        this.f19228e = strArr;
        this.f19229f = z11;
        this.h = z12;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f19226b);
            long j10 = this.f19225a;
            Pattern pattern = s5.a.f47578a;
            jSONObject.put("position", j10 / 1000.0d);
            jSONObject.put("isWatched", this.d);
            jSONObject.put("isEmbedded", this.f19229f);
            jSONObject.put("duration", this.f19227c / 1000.0d);
            jSONObject.put("expanded", this.h);
            String[] strArr = this.f19228e;
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
        if (s5.a.d(this.f19226b, bVar.f19226b) && this.f19225a == bVar.f19225a && this.f19227c == bVar.f19227c && this.d == bVar.d && Arrays.equals(this.f19228e, bVar.f19228e) && this.f19229f == bVar.f19229f && this.h == bVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19226b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 8);
        parcel.writeLong(this.f19225a);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f19226b);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 8);
        parcel.writeLong(this.f19227c);
        com.google.android.gms.internal.cast.o.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        com.google.android.gms.internal.cast.o.m(parcel, 6, this.f19228e);
        com.google.android.gms.internal.cast.o.s(parcel, 7, 4);
        parcel.writeInt(this.f19229f ? 1 : 0);
        com.google.android.gms.internal.cast.o.s(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
