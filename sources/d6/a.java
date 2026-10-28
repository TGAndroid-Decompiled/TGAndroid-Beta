package d6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
public final class a extends p6.a {
    public static final Parcelable.Creator<a> CREATOR = new v(0);
    public final String f8028a;
    public final String f8029b;
    public final long f8030c;
    public final String d;
    public final String e;
    public final String f8031f;
    public final String h;
    public final String f8032n;
    public final String f8033r;
    public final long f8034s;
    public final String v;
    public final t f8035w;
    public final JSONObject f8036x;

    public a(String str, String str2, long j10, String str3, String str4, String str5, String str6, String str7, String str8, long j11, String str9, t tVar) {
        this.f8028a = str;
        this.f8029b = str2;
        this.f8030c = j10;
        this.d = str3;
        this.e = str4;
        this.f8031f = str5;
        this.h = str6;
        this.f8032n = str7;
        this.f8033r = str8;
        this.f8034s = j11;
        this.v = str9;
        this.f8035w = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f8036x = new JSONObject(str6);
                return;
            } catch (JSONException e) {
                Locale locale = Locale.ROOT;
                String message = e.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f8036x = new JSONObject();
                return;
            }
        }
        this.f8036x = new JSONObject();
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f8028a);
            long j10 = this.f8030c;
            Pattern pattern = h6.a.f12618a;
            jSONObject.put("duration", j10 / 1000.0d);
            long j11 = this.f8034s;
            if (j11 != -1) {
                jSONObject.put("whenSkippable", j11 / 1000.0d);
            }
            String str = this.f8032n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f8029b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f8031f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f8036x;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f8033r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.v;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f8035w;
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
        if (h6.a.d(this.f8028a, aVar.f8028a) && h6.a.d(this.f8029b, aVar.f8029b) && this.f8030c == aVar.f8030c && h6.a.d(this.d, aVar.d) && h6.a.d(this.e, aVar.e) && h6.a.d(this.f8031f, aVar.f8031f) && h6.a.d(this.h, aVar.h) && h6.a.d(this.f8032n, aVar.f8032n) && h6.a.d(this.f8033r, aVar.f8033r) && this.f8034s == aVar.f8034s && h6.a.d(this.v, aVar.v) && h6.a.d(this.f8035w, aVar.f8035w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8028a, this.f8029b, Long.valueOf(this.f8030c), this.d, this.e, this.f8031f, this.h, this.f8032n, this.f8033r, Long.valueOf(this.f8034s), this.v, this.f8035w});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.f8028a);
        df.l(parcel, 3, this.f8029b);
        df.s(parcel, 4, 8);
        parcel.writeLong(this.f8030c);
        df.l(parcel, 5, this.d);
        df.l(parcel, 6, this.e);
        df.l(parcel, 7, this.f8031f);
        df.l(parcel, 8, this.h);
        df.l(parcel, 9, this.f8032n);
        df.l(parcel, 10, this.f8033r);
        df.s(parcel, 11, 8);
        parcel.writeLong(this.f8034s);
        df.l(parcel, 12, this.v);
        df.k(parcel, 13, this.f8035w, i10);
        df.r(parcel, q5);
    }
}
