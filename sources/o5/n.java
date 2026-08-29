package o5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import i7.t7;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class n extends a6.a {
    public static final Parcelable.Creator<n> CREATOR = new v(13);
    public String f19296a;
    public String f19297b;
    public int f19298c;
    public String d;
    public m f19299e;
    public int f19300f;
    public List h;
    public int f19301n;
    public long f19302r;
    public boolean f19303s;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f19296a)) {
                jSONObject.put("id", this.f19296a);
            }
            if (!TextUtils.isEmpty(this.f19297b)) {
                jSONObject.put("entity", this.f19297b);
            }
            switch (this.f19298c) {
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
            m mVar = this.f19299e;
            if (mVar != null) {
                jSONObject.put("containerMetadata", mVar.b());
            }
            String b10 = t7.b(Integer.valueOf(this.f19300f));
            if (b10 != null) {
                jSONObject.put("repeatMode", b10);
            }
            List list = this.h;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (o oVar : this.h) {
                    jSONArray.put(oVar.c());
                }
                jSONObject.put("items", jSONArray);
            }
            jSONObject.put("startIndex", this.f19301n);
            long j10 = this.f19302r;
            if (j10 != -1) {
                Pattern pattern = s5.a.f47578a;
                jSONObject.put("startTime", j10 / 1000.0d);
            }
            jSONObject.put("shuffle", this.f19303s);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (TextUtils.equals(this.f19296a, nVar.f19296a) && TextUtils.equals(this.f19297b, nVar.f19297b) && this.f19298c == nVar.f19298c && TextUtils.equals(this.d, nVar.d) && z5.l.l(this.f19299e, nVar.f19299e) && this.f19300f == nVar.f19300f && z5.l.l(this.h, nVar.h) && this.f19301n == nVar.f19301n && this.f19302r == nVar.f19302r && this.f19303s == nVar.f19303s) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19296a, this.f19297b, Integer.valueOf(this.f19298c), this.d, this.f19299e, Integer.valueOf(this.f19300f), this.h, Integer.valueOf(this.f19301n), Long.valueOf(this.f19302r), Boolean.valueOf(this.f19303s)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        List unmodifiableList;
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.f19296a);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f19297b);
        int i11 = this.f19298c;
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(i11);
        com.google.android.gms.internal.cast.o.l(parcel, 5, this.d);
        com.google.android.gms.internal.cast.o.k(parcel, 6, this.f19299e, i10);
        int i12 = this.f19300f;
        com.google.android.gms.internal.cast.o.s(parcel, 7, 4);
        parcel.writeInt(i12);
        List list = this.h;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        com.google.android.gms.internal.cast.o.p(parcel, 8, unmodifiableList);
        int i13 = this.f19301n;
        com.google.android.gms.internal.cast.o.s(parcel, 9, 4);
        parcel.writeInt(i13);
        long j10 = this.f19302r;
        com.google.android.gms.internal.cast.o.s(parcel, 10, 8);
        parcel.writeLong(j10);
        boolean z10 = this.f19303s;
        com.google.android.gms.internal.cast.o.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
