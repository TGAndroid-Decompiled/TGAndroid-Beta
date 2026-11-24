package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class z9 extends b4 {
    public static final Parcelable.Creator<z9> CREATOR = new j9d((byte) 19);
    public final long a;
    public final String b;
    public final long c;
    public final boolean d;
    public final String[] e;
    public final boolean f;
    public final boolean h;

    public z9(long j, String str, long j2, boolean z, String[] strArr, boolean z2, boolean z3) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = z;
        this.e = strArr;
        this.f = z2;
        this.h = z3;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.b);
            long j = this.a;
            Pattern pattern = id1.a;
            jSONObject.put("position", j / 1000.0d);
            jSONObject.put("isWatched", this.d);
            jSONObject.put("isEmbedded", this.f);
            jSONObject.put("duration", this.c / 1000.0d);
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
        if (!(obj instanceof z9)) {
            return false;
        }
        z9 z9Var = (z9) obj;
        if (id1.d(this.b, z9Var.b) && this.a == z9Var.a && this.c == z9Var.c && this.d == z9Var.d && Arrays.equals(this.e, z9Var.e) && this.f == z9Var.f && this.h == z9Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 8);
        parcel.writeLong(this.a);
        jte.l(parcel, 3, this.b);
        jte.q(parcel, 4, 8);
        parcel.writeLong(this.c);
        jte.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        jte.m(parcel, 6, this.e);
        jte.q(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        jte.q(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        jte.s(parcel, r);
    }
}
