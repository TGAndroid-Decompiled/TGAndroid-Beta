package c6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new v(0);
    public final String f4358a;
    public final String f4359b;
    public final long f4360c;
    public final String d;
    public final String e;
    public final String f4361f;
    public final String h;
    public final String f4362n;
    public final String f4363r;
    public final long f4364s;
    public final String v;
    public final t f4365w;
    public final JSONObject f4366x;

    public a(String str, String str2, long j3, String str3, String str4, String str5, String str6, String str7, String str8, long j10, String str9, t tVar) {
        this.f4358a = str;
        this.f4359b = str2;
        this.f4360c = j3;
        this.d = str3;
        this.e = str4;
        this.f4361f = str5;
        this.h = str6;
        this.f4362n = str7;
        this.f4363r = str8;
        this.f4364s = j10;
        this.v = str9;
        this.f4365w = tVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f4366x = new JSONObject(str6);
                return;
            } catch (JSONException e) {
                Locale locale = Locale.ROOT;
                String message = e.getMessage();
                Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + message);
                this.h = null;
                this.f4366x = new JSONObject();
                return;
            }
        }
        this.f4366x = new JSONObject();
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f4358a);
            long j3 = this.f4360c;
            Pattern pattern = g6.a.f8556a;
            jSONObject.put("duration", j3 / 1000.0d);
            long j10 = this.f4364s;
            if (j10 != -1) {
                jSONObject.put("whenSkippable", j10 / 1000.0d);
            }
            String str = this.f4362n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f4359b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f4361f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f4366x;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f4363r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.v;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            t tVar = this.f4365w;
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
        if (g6.a.d(this.f4358a, aVar.f4358a) && g6.a.d(this.f4359b, aVar.f4359b) && this.f4360c == aVar.f4360c && g6.a.d(this.d, aVar.d) && g6.a.d(this.e, aVar.e) && g6.a.d(this.f4361f, aVar.f4361f) && g6.a.d(this.h, aVar.h) && g6.a.d(this.f4362n, aVar.f4362n) && g6.a.d(this.f4363r, aVar.f4363r) && this.f4364s == aVar.f4364s && g6.a.d(this.v, aVar.v) && g6.a.d(this.f4365w, aVar.f4365w)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4358a, this.f4359b, Long.valueOf(this.f4360c), this.d, this.e, this.f4361f, this.h, this.f4362n, this.f4363r, Long.valueOf(this.f4364s), this.v, this.f4365w});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 2, this.f4358a);
        w7.e0.l(parcel, 3, this.f4359b);
        w7.e0.s(parcel, 4, 8);
        parcel.writeLong(this.f4360c);
        w7.e0.l(parcel, 5, this.d);
        w7.e0.l(parcel, 6, this.e);
        w7.e0.l(parcel, 7, this.f4361f);
        w7.e0.l(parcel, 8, this.h);
        w7.e0.l(parcel, 9, this.f4362n);
        w7.e0.l(parcel, 10, this.f4363r);
        w7.e0.s(parcel, 11, 8);
        parcel.writeLong(this.f4364s);
        w7.e0.l(parcel, 12, this.v);
        w7.e0.k(parcel, 13, this.f4365w, i10);
        w7.e0.r(parcel, q6);
    }
}
