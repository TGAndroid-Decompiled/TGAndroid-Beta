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
    public final String f11343a;
    public final String f11344b;
    public final long f11345c;
    public final String d;
    public final String f11346e;
    public final String f11347f;
    public final String h;
    public final String f11348n;
    public final String f11349r;
    public final long f11350s;
    public final String f11351w;
    public final t f11352x;
    public final JSONObject f11353y;

    public a(String str, String str2, long j3, String str3, String str4, String str5, String str6, String str7, String str8, long j10, String str9, t tVar) {
        this.f11343a = str;
        this.f11344b = str2;
        this.f11345c = j3;
        this.d = str3;
        this.f11346e = str4;
        this.f11347f = str5;
        this.h = str6;
        this.f11348n = str7;
        this.f11349r = str8;
        this.f11350s = j10;
        this.f11351w = str9;
        this.f11352x = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f11353y = new JSONObject(str6);
                return;
            } catch (JSONException e10) {
                Locale locale = Locale.ROOT;
                String message = e10.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f11353y = new JSONObject();
                return;
            }
        }
        this.f11353y = new JSONObject();
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f11343a);
            long j3 = this.f11345c;
            Pattern pattern = j6.a.f17242a;
            jSONObject.put("duration", j3 / 1000.0d);
            long j10 = this.f11350s;
            if (j10 != -1) {
                jSONObject.put("whenSkippable", j10 / 1000.0d);
            }
            String str = this.f11348n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.f11346e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f11344b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f11347f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f11353y;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f11349r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.f11351w;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f11352x;
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
        if (j6.a.d(this.f11343a, aVar.f11343a) && j6.a.d(this.f11344b, aVar.f11344b) && this.f11345c == aVar.f11345c && j6.a.d(this.d, aVar.d) && j6.a.d(this.f11346e, aVar.f11346e) && j6.a.d(this.f11347f, aVar.f11347f) && j6.a.d(this.h, aVar.h) && j6.a.d(this.f11348n, aVar.f11348n) && j6.a.d(this.f11349r, aVar.f11349r) && this.f11350s == aVar.f11350s && j6.a.d(this.f11351w, aVar.f11351w) && j6.a.d(this.f11352x, aVar.f11352x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11343a, this.f11344b, Long.valueOf(this.f11345c), this.d, this.f11346e, this.f11347f, this.h, this.f11348n, this.f11349r, Long.valueOf(this.f11350s), this.f11351w, this.f11352x});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f11343a);
        bc.l(parcel, 3, this.f11344b);
        bc.q(parcel, 4, 8);
        parcel.writeLong(this.f11345c);
        bc.l(parcel, 5, this.d);
        bc.l(parcel, 6, this.f11346e);
        bc.l(parcel, 7, this.f11347f);
        bc.l(parcel, 8, this.h);
        bc.l(parcel, 9, this.f11348n);
        bc.l(parcel, 10, this.f11349r);
        bc.q(parcel, 11, 8);
        parcel.writeLong(this.f11350s);
        bc.l(parcel, 12, this.f11351w);
        bc.k(parcel, 13, this.f11352x, i7);
        bc.s(parcel, r10);
    }
}
