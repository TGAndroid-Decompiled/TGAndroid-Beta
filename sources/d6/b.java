package d6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class b extends p6.a {
    public static final Parcelable.Creator<b> CREATOR = new v(4);
    public final long f8040a;
    public final String f8041b;
    public final long f8042c;
    public final boolean d;
    public final String[] e;
    public final boolean f8043f;
    public final boolean h;

    public b(long j10, String str, long j11, boolean z10, String[] strArr, boolean z11, boolean z12) {
        this.f8040a = j10;
        this.f8041b = str;
        this.f8042c = j11;
        this.d = z10;
        this.e = strArr;
        this.f8043f = z11;
        this.h = z12;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f8041b);
            long j10 = this.f8040a;
            Pattern pattern = h6.a.f12618a;
            jSONObject.put("position", j10 / 1000.0d);
            jSONObject.put("isWatched", this.d);
            jSONObject.put("isEmbedded", this.f8043f);
            jSONObject.put("duration", this.f8042c / 1000.0d);
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
        if (h6.a.d(this.f8041b, bVar.f8041b) && this.f8040a == bVar.f8040a && this.f8042c == bVar.f8042c && this.d == bVar.d && Arrays.equals(this.e, bVar.e) && this.f8043f == bVar.f8043f && this.h == bVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8041b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 8);
        parcel.writeLong(this.f8040a);
        df.l(parcel, 3, this.f8041b);
        df.s(parcel, 4, 8);
        parcel.writeLong(this.f8042c);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        df.m(parcel, 6, this.e);
        df.s(parcel, 7, 4);
        parcel.writeInt(this.f8043f ? 1 : 0);
        df.s(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        df.r(parcel, q5);
    }
}
