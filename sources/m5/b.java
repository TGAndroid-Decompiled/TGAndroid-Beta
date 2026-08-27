package m5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends z5.a {
    public static final Parcelable.Creator<b> CREATOR = new w(4);

    public final long f17740a;

    public final String f17741b;

    public final long f17742c;
    public final boolean d;

    public final String[] f17743e;

    public final boolean f17744f;
    public final boolean h;

    public b(long j10, String str, long j11, boolean z10, String[] strArr, boolean z11, boolean z12) {
        this.f17740a = j10;
        this.f17741b = str;
        this.f17742c = j11;
        this.d = z10;
        this.f17743e = strArr;
        this.f17744f = z11;
        this.h = z12;
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f17741b);
            long j10 = this.f17740a;
            Pattern pattern = r5.a.f46766a;
            jSONObject.put("position", j10 / 1000.0d);
            jSONObject.put("isWatched", this.d);
            jSONObject.put("isEmbedded", this.f17744f);
            jSONObject.put("duration", this.f17742c / 1000.0d);
            jSONObject.put("expanded", this.h);
            String[] strArr = this.f17743e;
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
        return r5.a.d(this.f17741b, bVar.f17741b) && this.f17740a == bVar.f17740a && this.f17742c == bVar.f17742c && this.d == bVar.d && Arrays.equals(this.f17743e, bVar.f17743e) && this.f17744f == bVar.f17744f && this.h == bVar.h;
    }

    public final int hashCode() {
        return this.f17741b.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 8);
        parcel.writeLong(this.f17740a);
        r8.l(parcel, 3, this.f17741b);
        r8.s(parcel, 4, 8);
        parcel.writeLong(this.f17742c);
        r8.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        r8.m(parcel, 6, this.f17743e);
        r8.s(parcel, 7, 4);
        parcel.writeInt(this.f17744f ? 1 : 0);
        r8.s(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        r8.r(parcel, iQ);
    }
}
