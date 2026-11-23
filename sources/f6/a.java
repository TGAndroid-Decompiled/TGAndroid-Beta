package f6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import c8.cc;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
public final class a extends r6.a {
    public static final Parcelable.Creator<a> CREATOR = new v(0);
    public final String f11335a;
    public final String f11336b;
    public final long f11337c;
    public final String d;
    public final String f11338e;
    public final String f11339f;
    public final String h;
    public final String f11340n;
    public final String f11341r;
    public final long f11342s;
    public final String f11343w;
    public final t f11344x;
    public final JSONObject f11345y;

    public a(String str, String str2, long j3, String str3, String str4, String str5, String str6, String str7, String str8, long j10, String str9, t tVar) {
        this.f11335a = str;
        this.f11336b = str2;
        this.f11337c = j3;
        this.d = str3;
        this.f11338e = str4;
        this.f11339f = str5;
        this.h = str6;
        this.f11340n = str7;
        this.f11341r = str8;
        this.f11342s = j10;
        this.f11343w = str9;
        this.f11344x = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f11345y = new JSONObject(str6);
                return;
            } catch (JSONException e10) {
                Locale locale = Locale.ROOT;
                String message = e10.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f11345y = new JSONObject();
                return;
            }
        }
        this.f11345y = new JSONObject();
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f11335a);
            long j3 = this.f11337c;
            Pattern pattern = j6.a.f17233a;
            jSONObject.put("duration", j3 / 1000.0d);
            long j10 = this.f11342s;
            if (j10 != -1) {
                jSONObject.put("whenSkippable", j10 / 1000.0d);
            }
            String str = this.f11340n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.f11338e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f11336b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f11339f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f11345y;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f11341r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.f11343w;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f11344x;
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
        if (j6.a.d(this.f11335a, aVar.f11335a) && j6.a.d(this.f11336b, aVar.f11336b) && this.f11337c == aVar.f11337c && j6.a.d(this.d, aVar.d) && j6.a.d(this.f11338e, aVar.f11338e) && j6.a.d(this.f11339f, aVar.f11339f) && j6.a.d(this.h, aVar.h) && j6.a.d(this.f11340n, aVar.f11340n) && j6.a.d(this.f11341r, aVar.f11341r) && this.f11342s == aVar.f11342s && j6.a.d(this.f11343w, aVar.f11343w) && j6.a.d(this.f11344x, aVar.f11344x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11335a, this.f11336b, Long.valueOf(this.f11337c), this.d, this.f11338e, this.f11339f, this.h, this.f11340n, this.f11341r, Long.valueOf(this.f11342s), this.f11343w, this.f11344x});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f11335a);
        cc.l(parcel, 3, this.f11336b);
        cc.q(parcel, 4, 8);
        parcel.writeLong(this.f11337c);
        cc.l(parcel, 5, this.d);
        cc.l(parcel, 6, this.f11338e);
        cc.l(parcel, 7, this.f11339f);
        cc.l(parcel, 8, this.h);
        cc.l(parcel, 9, this.f11340n);
        cc.l(parcel, 10, this.f11341r);
        cc.q(parcel, 11, 8);
        parcel.writeLong(this.f11342s);
        cc.l(parcel, 12, this.f11343w);
        cc.k(parcel, 13, this.f11344x, i7);
        cc.s(parcel, r10);
    }
}
