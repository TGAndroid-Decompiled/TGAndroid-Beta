package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class yr6 extends b4 {
    public static final Parcelable.Creator<yr6> CREATOR = new igd((byte) 14);
    public String a;
    public String b;
    public int c;
    public String d;
    public xr6 e;
    public int f;
    public ArrayList h;
    public int n;
    public long r;
    public boolean s;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.a)) {
                jSONObject.put("id", this.a);
            }
            if (!TextUtils.isEmpty(this.b)) {
                jSONObject.put("entity", this.b);
            }
            switch (this.c) {
                case 1:
                    jSONObject.put("queueType", "ALBUM");
                    break;
                case 2:
                    jSONObject.put("queueType", "PLAYLIST");
                    break;
                case 3:
                    jSONObject.put("queueType", "AUDIOBOOK");
                    break;
                case 4:
                    jSONObject.put("queueType", "RADIO_STATION");
                    break;
                case 5:
                    jSONObject.put("queueType", "PODCAST_SERIES");
                    break;
                case 6:
                    jSONObject.put("queueType", "TV_SERIES");
                    break;
                case 7:
                    jSONObject.put("queueType", "VIDEO_PLAYLIST");
                    break;
                case 8:
                    jSONObject.put("queueType", "LIVE_TV");
                    break;
                case 9:
                    jSONObject.put("queueType", "MOVIE");
                    break;
            }
            if (!TextUtils.isEmpty(this.d)) {
                jSONObject.put("name", this.d);
            }
            xr6 xr6Var = this.e;
            if (xr6Var != null) {
                jSONObject.put("containerMetadata", xr6Var.b());
            }
            String b = ooe.b(Integer.valueOf(this.f));
            if (b != null) {
                jSONObject.put("repeatMode", b);
            }
            ArrayList arrayList = this.h;
            if (arrayList != null && !arrayList.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList2 = this.h;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    jSONArray.put(((zr6) obj).c());
                }
                jSONObject.put("items", jSONArray);
            }
            jSONObject.put("startIndex", this.n);
            long j = this.r;
            if (j != -1) {
                Pattern pattern = id1.a;
                jSONObject.put("startTime", j / 1000.0d);
            }
            jSONObject.put("shuffle", this.s);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yr6) {
                yr6 yr6Var = (yr6) obj;
                if (TextUtils.equals(this.a, yr6Var.a) && TextUtils.equals(this.b, yr6Var.b) && this.c == yr6Var.c && TextUtils.equals(this.d, yr6Var.d) && cqe.a(this.e, yr6Var.e) && this.f == yr6Var.f && cqe.a(this.h, yr6Var.h) && this.n == yr6Var.n && this.r == yr6Var.r && this.s == yr6Var.s) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, this.e, Integer.valueOf(this.f), this.h, Integer.valueOf(this.n), Long.valueOf(this.r), Boolean.valueOf(this.s)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        List unmodifiableList;
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.l(parcel, 3, this.b);
        int i2 = this.c;
        jte.q(parcel, 4, 4);
        parcel.writeInt(i2);
        jte.l(parcel, 5, this.d);
        jte.k(parcel, 6, this.e, i);
        int i3 = this.f;
        jte.q(parcel, 7, 4);
        parcel.writeInt(i3);
        ArrayList arrayList = this.h;
        if (arrayList == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        jte.p(parcel, 8, unmodifiableList);
        int i4 = this.n;
        jte.q(parcel, 9, 4);
        parcel.writeInt(i4);
        long j = this.r;
        jte.q(parcel, 10, 8);
        parcel.writeLong(j);
        boolean z = this.s;
        jte.q(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        jte.s(parcel, r);
    }
}
