package m5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import h7.r8;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends z5.a {
    public static final Parcelable.Creator<a> CREATOR = new w(0);

    public final String f17727a;

    public final String f17728b;

    public final long f17729c;
    public final String d;

    public final String f17730e;

    public final String f17731f;
    public final String h;

    public final String f17732n;

    public final String f17733r;

    public final long f17734s;
    public final String v;

    public final u f17735w;

    public final JSONObject f17736x;

    public a(String str, String str2, long j10, String str3, String str4, String str5, String str6, String str7, String str8, long j11, String str9, u uVar) {
        this.f17727a = str;
        this.f17728b = str2;
        this.f17729c = j10;
        this.d = str3;
        this.f17730e = str4;
        this.f17731f = str5;
        this.h = str6;
        this.f17732n = str7;
        this.f17733r = str8;
        this.f17734s = j11;
        this.v = str9;
        this.f17735w = uVar;
        if (TextUtils.isEmpty(str6)) {
            this.f17736x = new JSONObject();
            return;
        }
        try {
            this.f17736x = new JSONObject(str6);
        } catch (JSONException e9) {
            Locale locale = Locale.ROOT;
            Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + e9.getMessage());
            this.h = null;
            this.f17736x = new JSONObject();
        }
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f17727a);
            long j10 = this.f17729c;
            Pattern pattern = r5.a.f46766a;
            jSONObject.put("duration", j10 / 1000.0d);
            long j11 = this.f17734s;
            if (j11 != -1) {
                jSONObject.put("whenSkippable", j11 / 1000.0d);
            }
            String str = this.f17732n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.f17730e;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f17728b;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f17731f;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f17736x;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f17733r;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.v;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            u uVar = this.f17735w;
            if (uVar != null) {
                jSONObject.put("vastAdsRequest", uVar.b());
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
        return r5.a.d(this.f17727a, aVar.f17727a) && r5.a.d(this.f17728b, aVar.f17728b) && this.f17729c == aVar.f17729c && r5.a.d(this.d, aVar.d) && r5.a.d(this.f17730e, aVar.f17730e) && r5.a.d(this.f17731f, aVar.f17731f) && r5.a.d(this.h, aVar.h) && r5.a.d(this.f17732n, aVar.f17732n) && r5.a.d(this.f17733r, aVar.f17733r) && this.f17734s == aVar.f17734s && r5.a.d(this.v, aVar.v) && r5.a.d(this.f17735w, aVar.f17735w);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17727a, this.f17728b, Long.valueOf(this.f17729c), this.d, this.f17730e, this.f17731f, this.h, this.f17732n, this.f17733r, Long.valueOf(this.f17734s), this.v, this.f17735w});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f17727a);
        r8.l(parcel, 3, this.f17728b);
        r8.s(parcel, 4, 8);
        parcel.writeLong(this.f17729c);
        r8.l(parcel, 5, this.d);
        r8.l(parcel, 6, this.f17730e);
        r8.l(parcel, 7, this.f17731f);
        r8.l(parcel, 8, this.h);
        r8.l(parcel, 9, this.f17732n);
        r8.l(parcel, 10, this.f17733r);
        r8.s(parcel, 11, 8);
        parcel.writeLong(this.f17734s);
        r8.l(parcel, 12, this.v);
        r8.k(parcel, 13, this.f17735w, i10);
        r8.r(parcel, iQ);
    }
}
