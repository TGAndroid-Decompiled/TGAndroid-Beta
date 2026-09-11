package c6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v7.v7;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new v(13);
    public String f4534a;
    public String f4535b;
    public int f4536c;
    public String d;
    public m f4537e;
    public int f4538f;
    public List h;
    public int f4539n;
    public long f4540r;
    public boolean f4541s;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f4534a)) {
                jSONObject.put("id", this.f4534a);
            }
            if (!TextUtils.isEmpty(this.f4535b)) {
                jSONObject.put("entity", this.f4535b);
            }
            switch (this.f4536c) {
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
            m mVar = this.f4537e;
            if (mVar != null) {
                jSONObject.put("containerMetadata", mVar.b());
            }
            String b10 = v7.b(Integer.valueOf(this.f4538f));
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
            jSONObject.put("startIndex", this.f4539n);
            long j3 = this.f4540r;
            if (j3 != -1) {
                Pattern pattern = g6.a.f10384a;
                jSONObject.put("startTime", j3 / 1000.0d);
            }
            jSONObject.put("shuffle", this.f4541s);
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
        if (TextUtils.equals(this.f4534a, nVar.f4534a) && TextUtils.equals(this.f4535b, nVar.f4535b) && this.f4536c == nVar.f4536c && TextUtils.equals(this.d, nVar.d) && n6.l.l(this.f4537e, nVar.f4537e) && this.f4538f == nVar.f4538f && n6.l.l(this.h, nVar.h) && this.f4539n == nVar.f4539n && this.f4540r == nVar.f4540r && this.f4541s == nVar.f4541s) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4534a, this.f4535b, Integer.valueOf(this.f4536c), this.d, this.f4537e, Integer.valueOf(this.f4538f), this.h, Integer.valueOf(this.f4539n), Long.valueOf(this.f4540r), Boolean.valueOf(this.f4541s)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        List unmodifiableList;
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 2, this.f4534a);
        w7.e0.l(parcel, 3, this.f4535b);
        int i11 = this.f4536c;
        w7.e0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        w7.e0.l(parcel, 5, this.d);
        w7.e0.k(parcel, 6, this.f4537e, i10);
        int i12 = this.f4538f;
        w7.e0.s(parcel, 7, 4);
        parcel.writeInt(i12);
        List list = this.h;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        w7.e0.p(parcel, 8, unmodifiableList);
        int i13 = this.f4539n;
        w7.e0.s(parcel, 9, 4);
        parcel.writeInt(i13);
        long j3 = this.f4540r;
        w7.e0.s(parcel, 10, 8);
        parcel.writeLong(j3);
        boolean z10 = this.f4541s;
        w7.e0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        w7.e0.r(parcel, q6);
    }
}
