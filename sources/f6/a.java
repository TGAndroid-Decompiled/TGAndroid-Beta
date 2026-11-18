package f6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import c8.bc;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new v(0);
    public final String f11340a;
    public final String f11341b;
    public final long f11342c;
    public final String d;
    public final String f11343e;
    public final String f11344f;
    public final String h;
    public final String f11345n;
    public final String f11346r;
    public final long f11347s;
    public final String f11348w;
    public final t f11349x;
    public final JSONObject f11350y;

    public a(String str, String str2, long j3, String str3, String str4, String str5, String str6, String str7, String str8, long j10, String str9, t tVar) {
        this.f11340a = str;
        this.f11341b = str2;
        this.f11342c = j3;
        this.d = str3;
        this.f11343e = str4;
        this.f11344f = str5;
        this.h = str6;
        this.f11345n = str7;
        this.f11346r = str8;
        this.f11347s = j10;
        this.f11348w = str9;
        this.f11349x = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f11350y = new JSONObject(str6);
                return;
            } catch (JSONException e10) {
                Locale locale = Locale.ROOT;
                String message = e10.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f11350y = new JSONObject();
                return;
            }
        }
        this.f11350y = new JSONObject();
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f11340a);
            long j3 = this.f11342c;
            Pattern pattern = j6.a.f17239a;
            jSONObject.put("duration", j3 / 1000.0d);
            long j10 = this.f11347s;
            if (j10 != -1) {
                jSONObject.put("whenSkippable", j10 / 1000.0d);
            }
            String str = this.f11345n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.f11343e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f11341b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f11344f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f11350y;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f11346r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.f11348w;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f11349x;
            if (tVar != null) {
                jSONObject.put("vastAdsRequest", tVar.b());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j6.a.d(this.f11340a, aVar.f11340a) && j6.a.d(this.f11341b, aVar.f11341b) && this.f11342c == aVar.f11342c && j6.a.d(this.d, aVar.d) && j6.a.d(this.f11343e, aVar.f11343e) && j6.a.d(this.f11344f, aVar.f11344f) && j6.a.d(this.h, aVar.h) && j6.a.d(this.f11345n, aVar.f11345n) && j6.a.d(this.f11346r, aVar.f11346r) && this.f11347s == aVar.f11347s && j6.a.d(this.f11348w, aVar.f11348w) && j6.a.d(this.f11349x, aVar.f11349x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11340a, this.f11341b, Long.valueOf(this.f11342c), this.d, this.f11343e, this.f11344f, this.h, this.f11345n, this.f11346r, Long.valueOf(this.f11347s), this.f11348w, this.f11349x});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f11340a);
        bc.l(parcel, 3, this.f11341b);
        bc.q(parcel, 4, 8);
        parcel.writeLong(this.f11342c);
        bc.l(parcel, 5, this.d);
        bc.l(parcel, 6, this.f11343e);
        bc.l(parcel, 7, this.f11344f);
        bc.l(parcel, 8, this.h);
        bc.l(parcel, 9, this.f11345n);
        bc.l(parcel, 10, this.f11346r);
        bc.q(parcel, 11, 8);
        parcel.writeLong(this.f11347s);
        bc.l(parcel, 12, this.f11348w);
        bc.k(parcel, 13, this.f11349x, i7);
        bc.s(parcel, r10);
    }
}
