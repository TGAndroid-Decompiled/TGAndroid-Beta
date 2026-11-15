package f6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c8.a1;
import c8.yb;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class n extends r6.a {
    public static final Parcelable.Creator<n> CREATOR = new v(13);
    public String f11107a;
    public String f11108b;
    public int f11109c;
    public String d;
    public m f11110e;
    public int f11111f;
    public List h;
    public int f11112n;
    public long f11113r;
    public boolean f11114s;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f11107a)) {
                jSONObject.put("id", this.f11107a);
            }
            if (!TextUtils.isEmpty(this.f11108b)) {
                jSONObject.put("entity", this.f11108b);
            }
            switch (this.f11109c) {
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
            m mVar = this.f11110e;
            if (mVar != null) {
                jSONObject.put("containerMetadata", mVar.b());
            }
            String b10 = a1.b(Integer.valueOf(this.f11111f));
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
            jSONObject.put("startIndex", this.f11112n);
            long j3 = this.f11113r;
            if (j3 != -1) {
                Pattern pattern = j6.a.f16857a;
                jSONObject.put("startTime", j3 / 1000.0d);
            }
            jSONObject.put("shuffle", this.f11114s);
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
        if (TextUtils.equals(this.f11107a, nVar.f11107a) && TextUtils.equals(this.f11108b, nVar.f11108b) && this.f11109c == nVar.f11109c && TextUtils.equals(this.d, nVar.d) && q6.m.k(this.f11110e, nVar.f11110e) && this.f11111f == nVar.f11111f && q6.m.k(this.h, nVar.h) && this.f11112n == nVar.f11112n && this.f11113r == nVar.f11113r && this.f11114s == nVar.f11114s) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11107a, this.f11108b, Integer.valueOf(this.f11109c), this.d, this.f11110e, Integer.valueOf(this.f11111f), this.h, Integer.valueOf(this.f11112n), Long.valueOf(this.f11113r), Boolean.valueOf(this.f11114s)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        List unmodifiableList;
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 2, this.f11107a);
        yb.l(parcel, 3, this.f11108b);
        int i10 = this.f11109c;
        yb.q(parcel, 4, 4);
        parcel.writeInt(i10);
        yb.l(parcel, 5, this.d);
        yb.k(parcel, 6, this.f11110e, i7);
        int i11 = this.f11111f;
        yb.q(parcel, 7, 4);
        parcel.writeInt(i11);
        List list = this.h;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        yb.p(parcel, 8, unmodifiableList);
        int i12 = this.f11112n;
        yb.q(parcel, 9, 4);
        parcel.writeInt(i12);
        long j3 = this.f11113r;
        yb.q(parcel, 10, 8);
        parcel.writeLong(j3);
        boolean z10 = this.f11114s;
        yb.q(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        yb.s(parcel, r10);
    }
}
