package m5;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class b extends y5.a {
    public static final Parcelable.Creator<b> CREATOR = new v(4);
    public final long f17364a;
    public final String f17365b;
    public final long f17366c;
    public final boolean d;
    public final String[] f17367e;
    public final boolean f17368f;
    public final boolean h;

    public b(long j10, String str, long j11, boolean z10, String[] strArr, boolean z11, boolean z12) {
        this.f17364a = j10;
        this.f17365b = str;
        this.f17366c = j11;
        this.d = z10;
        this.f17367e = strArr;
        this.f17368f = z11;
        this.h = z12;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f17365b);
            long j10 = this.f17364a;
            Pattern pattern = q5.a.f46007a;
            jSONObject.put("position", j10 / 1000.0d);
            jSONObject.put("isWatched", this.d);
            jSONObject.put("isEmbedded", this.f17368f);
            jSONObject.put("duration", this.f17366c / 1000.0d);
            jSONObject.put("expanded", this.h);
            String[] strArr = this.f17367e;
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
        if (q5.a.d(this.f17365b, bVar.f17365b) && this.f17364a == bVar.f17364a && this.f17366c == bVar.f17366c && this.d == bVar.d && Arrays.equals(this.f17367e, bVar.f17367e) && this.f17368f == bVar.f17368f && this.h == bVar.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17365b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 8);
        parcel.writeLong(this.f17364a);
        p8.l(parcel, 3, this.f17365b);
        p8.s(parcel, 4, 8);
        parcel.writeLong(this.f17366c);
        p8.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        p8.m(parcel, 6, this.f17367e);
        p8.s(parcel, 7, 4);
        parcel.writeInt(this.f17368f ? 1 : 0);
        p8.s(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        p8.r(parcel, q10);
    }
}
