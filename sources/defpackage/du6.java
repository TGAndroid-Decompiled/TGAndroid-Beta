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
public final class du6 extends c4 {
    public static final Parcelable.Creator<du6> CREATOR = new zkd((byte) 14);
    public String a;
    public String b;
    public int c;
    public String d;
    public cu6 e;
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
            cu6 cu6Var = this.e;
            if (cu6Var != null) {
                jSONObject.put("containerMetadata", cu6Var.b());
            }
            String b = hte.b(Integer.valueOf(this.f));
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
                    jSONArray.put(((eu6) obj).c());
                }
                jSONObject.put("items", jSONArray);
            }
            jSONObject.put("startIndex", this.n);
            long j = this.r;
            if (j != -1) {
                Pattern pattern = qd1.a;
                jSONObject.put("startTime", j / 1000.0d);
            }
            jSONObject.put("shuffle", this.s);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof du6) {
                du6 du6Var = (du6) obj;
                if (TextUtils.equals(this.a, du6Var.a) && TextUtils.equals(this.b, du6Var.b) && this.c == du6Var.c && TextUtils.equals(this.d, du6Var.d) && vue.a(this.e, du6Var.e) && this.f == du6Var.f && vue.a(this.h, du6Var.h) && this.n == du6Var.n && this.r == du6Var.r && this.s == du6Var.s) {
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
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.l(parcel, 3, this.b);
        int i2 = this.c;
        bye.q(parcel, 4, 4);
        parcel.writeInt(i2);
        bye.l(parcel, 5, this.d);
        bye.k(parcel, 6, this.e, i);
        int i3 = this.f;
        bye.q(parcel, 7, 4);
        parcel.writeInt(i3);
        ArrayList arrayList = this.h;
        if (arrayList == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        bye.p(parcel, 8, unmodifiableList);
        int i4 = this.n;
        bye.q(parcel, 9, 4);
        parcel.writeInt(i4);
        long j = this.r;
        bye.q(parcel, 10, 8);
        parcel.writeLong(j);
        boolean z = this.s;
        bye.q(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        bye.s(parcel, r);
    }
}
