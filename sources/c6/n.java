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
import v7.r7;
public final class n extends o6.a {
    public static final Parcelable.Creator<n> CREATOR = new v(13);
    public String f4878a;
    public String f4879b;
    public int f4880c;
    public String d;
    public m e;
    public int f4881f;
    public List h;
    public int f4882n;
    public long f4883r;
    public boolean f4884s;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f4878a)) {
                jSONObject.put("id", this.f4878a);
            }
            if (!TextUtils.isEmpty(this.f4879b)) {
                jSONObject.put("entity", this.f4879b);
            }
            switch (this.f4880c) {
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
            m mVar = this.e;
            if (mVar != null) {
                jSONObject.put("containerMetadata", mVar.b());
            }
            String b10 = r7.b(Integer.valueOf(this.f4881f));
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
            jSONObject.put("startIndex", this.f4882n);
            long j10 = this.f4883r;
            if (j10 != -1) {
                Pattern pattern = g6.a.f10841a;
                jSONObject.put("startTime", j10 / 1000.0d);
            }
            jSONObject.put("shuffle", this.f4884s);
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
        if (TextUtils.equals(this.f4878a, nVar.f4878a) && TextUtils.equals(this.f4879b, nVar.f4879b) && this.f4880c == nVar.f4880c && TextUtils.equals(this.d, nVar.d) && n6.l.l(this.e, nVar.e) && this.f4881f == nVar.f4881f && n6.l.l(this.h, nVar.h) && this.f4882n == nVar.f4882n && this.f4883r == nVar.f4883r && this.f4884s == nVar.f4884s) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4878a, this.f4879b, Integer.valueOf(this.f4880c), this.d, this.e, Integer.valueOf(this.f4881f), this.h, Integer.valueOf(this.f4882n), Long.valueOf(this.f4883r), Boolean.valueOf(this.f4884s)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        List unmodifiableList;
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 2, this.f4878a);
        w7.f0.l(parcel, 3, this.f4879b);
        int i11 = this.f4880c;
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        w7.f0.l(parcel, 5, this.d);
        w7.f0.k(parcel, 6, this.e, i10);
        int i12 = this.f4881f;
        w7.f0.s(parcel, 7, 4);
        parcel.writeInt(i12);
        List list = this.h;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        w7.f0.p(parcel, 8, unmodifiableList);
        int i13 = this.f4882n;
        w7.f0.s(parcel, 9, 4);
        parcel.writeInt(i13);
        long j10 = this.f4883r;
        w7.f0.s(parcel, 10, 8);
        parcel.writeLong(j10);
        boolean z10 = this.f4884s;
        w7.f0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        w7.f0.r(parcel, q6);
    }
}
