package f6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c8.bc;
import c8.c1;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class n extends r6.a {
    public static final Parcelable.Creator<n> CREATOR = new v(13);
    public String f11427a;
    public String f11428b;
    public int f11429c;
    public String d;
    public m f11430e;
    public int f11431f;
    public List h;
    public int f11432n;
    public long f11433r;
    public boolean f11434s;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f11427a)) {
                jSONObject.put("id", this.f11427a);
            }
            if (!TextUtils.isEmpty(this.f11428b)) {
                jSONObject.put("entity", this.f11428b);
            }
            switch (this.f11429c) {
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
            m mVar = this.f11430e;
            if (mVar != null) {
                jSONObject.put("containerMetadata", mVar.b());
            }
            String b10 = c1.b(Integer.valueOf(this.f11431f));
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
            jSONObject.put("startIndex", this.f11432n);
            long j3 = this.f11433r;
            if (j3 != -1) {
                Pattern pattern = j6.a.f17242a;
                jSONObject.put("startTime", j3 / 1000.0d);
            }
            jSONObject.put("shuffle", this.f11434s);
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
        if (TextUtils.equals(this.f11427a, nVar.f11427a) && TextUtils.equals(this.f11428b, nVar.f11428b) && this.f11429c == nVar.f11429c && TextUtils.equals(this.d, nVar.d) && q6.m.l(this.f11430e, nVar.f11430e) && this.f11431f == nVar.f11431f && q6.m.l(this.h, nVar.h) && this.f11432n == nVar.f11432n && this.f11433r == nVar.f11433r && this.f11434s == nVar.f11434s) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11427a, this.f11428b, Integer.valueOf(this.f11429c), this.d, this.f11430e, Integer.valueOf(this.f11431f), this.h, Integer.valueOf(this.f11432n), Long.valueOf(this.f11433r), Boolean.valueOf(this.f11434s)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        List unmodifiableList;
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.f11427a);
        bc.l(parcel, 3, this.f11428b);
        int i10 = this.f11429c;
        bc.q(parcel, 4, 4);
        parcel.writeInt(i10);
        bc.l(parcel, 5, this.d);
        bc.k(parcel, 6, this.f11430e, i7);
        int i11 = this.f11431f;
        bc.q(parcel, 7, 4);
        parcel.writeInt(i11);
        List list = this.h;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        bc.p(parcel, 8, unmodifiableList);
        int i12 = this.f11432n;
        bc.q(parcel, 9, 4);
        parcel.writeInt(i12);
        long j3 = this.f11433r;
        bc.q(parcel, 10, 8);
        parcel.writeLong(j3);
        boolean z10 = this.f11434s;
        bc.q(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        bc.s(parcel, r10);
    }
}
