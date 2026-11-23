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
    public final String f11334a;
    public final String f11335b;
    public final long f11336c;
    public final String d;
    public final String f11337e;
    public final String f11338f;
    public final String h;
    public final String f11339n;
    public final String f11340r;
    public final long f11341s;
    public final String f11342w;
    public final t f11343x;
    public final JSONObject f11344y;

    public a(String str, String str2, long j3, String str3, String str4, String str5, String str6, String str7, String str8, long j10, String str9, t tVar) {
        this.f11334a = str;
        this.f11335b = str2;
        this.f11336c = j3;
        this.d = str3;
        this.f11337e = str4;
        this.f11338f = str5;
        this.h = str6;
        this.f11339n = str7;
        this.f11340r = str8;
        this.f11341s = j10;
        this.f11342w = str9;
        this.f11343x = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f11344y = new JSONObject(str6);
                return;
            } catch (JSONException e10) {
                Locale locale = Locale.ROOT;
                String message = e10.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f11344y = new JSONObject();
                return;
            }
        }
        this.f11344y = new JSONObject();
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f11334a);
            long j3 = this.f11336c;
            Pattern pattern = j6.a.f17330a;
            jSONObject.put("duration", j3 / 1000.0d);
            long j10 = this.f11341s;
            if (j10 != -1) {
                jSONObject.put("whenSkippable", j10 / 1000.0d);
            }
            String str = this.f11339n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.f11337e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f11335b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f11338f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f11344y;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f11340r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.f11342w;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f11343x;
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
        if (j6.a.d(this.f11334a, aVar.f11334a) && j6.a.d(this.f11335b, aVar.f11335b) && this.f11336c == aVar.f11336c && j6.a.d(this.d, aVar.d) && j6.a.d(this.f11337e, aVar.f11337e) && j6.a.d(this.f11338f, aVar.f11338f) && j6.a.d(this.h, aVar.h) && j6.a.d(this.f11339n, aVar.f11339n) && j6.a.d(this.f11340r, aVar.f11340r) && this.f11341s == aVar.f11341s && j6.a.d(this.f11342w, aVar.f11342w) && j6.a.d(this.f11343x, aVar.f11343x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11334a, this.f11335b, Long.valueOf(this.f11336c), this.d, this.f11337e, this.f11338f, this.h, this.f11339n, this.f11340r, Long.valueOf(this.f11341s), this.f11342w, this.f11343x});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        cc.l(parcel, 2, this.f11334a);
        cc.l(parcel, 3, this.f11335b);
        cc.q(parcel, 4, 8);
        parcel.writeLong(this.f11336c);
        cc.l(parcel, 5, this.d);
        cc.l(parcel, 6, this.f11337e);
        cc.l(parcel, 7, this.f11338f);
        cc.l(parcel, 8, this.h);
        cc.l(parcel, 9, this.f11339n);
        cc.l(parcel, 10, this.f11340r);
        cc.q(parcel, 11, 8);
        parcel.writeLong(this.f11341s);
        cc.l(parcel, 12, this.f11342w);
        cc.k(parcel, 13, this.f11343x, i7);
        cc.s(parcel, r10);
    }
}
