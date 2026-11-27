package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class aa extends c4 {
    public static final Parcelable.Creator<aa> CREATOR = new ced((byte) 19);
    public final long a;
    public final String b;
    public final long c;
    public final boolean d;
    public final String[] e;
    public final boolean f;
    public final boolean h;

    public aa(long j, String str, long j2, boolean z, String[] strArr, boolean z2, boolean z3) {
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
            Pattern pattern = qd1.a;
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
        if (!(obj instanceof aa)) {
            return false;
        }
        aa aaVar = (aa) obj;
        if (qd1.d(this.b, aaVar.b) && this.a == aaVar.a && this.c == aaVar.c && this.d == aaVar.d && Arrays.equals(this.e, aaVar.e) && this.f == aaVar.f && this.h == aaVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 8);
        parcel.writeLong(this.a);
        bye.l(parcel, 3, this.b);
        bye.q(parcel, 4, 8);
        parcel.writeLong(this.c);
        bye.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        bye.m(parcel, 6, this.e);
        bye.q(parcel, 7, 4);
        parcel.writeInt(this.f ? 1 : 0);
        bye.q(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        bye.s(parcel, r);
    }
}
