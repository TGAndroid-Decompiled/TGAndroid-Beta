package m5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import h7.f7;
import h7.r8;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class n extends z5.a {
    public static final Parcelable.Creator<n> CREATOR = new w(13);

    public String f17814a;

    public String f17815b;

    public int f17816c;
    public String d;

    public m f17817e;

    public int f17818f;
    public List h;

    public int f17819n;

    public long f17820r;

    public boolean f17821s;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f17814a)) {
                jSONObject.put("id", this.f17814a);
            }
            if (!TextUtils.isEmpty(this.f17815b)) {
                jSONObject.put("entity", this.f17815b);
            }
            switch (this.f17816c) {
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
            m mVar = this.f17817e;
            if (mVar != null) {
                jSONObject.put("containerMetadata", mVar.b());
            }
            String strB = f7.b(Integer.valueOf(this.f17818f));
            if (strB != null) {
                jSONObject.put("repeatMode", strB);
            }
            List list = this.h;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.h.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((p) it.next()).c());
                }
                jSONObject.put("items", jSONArray);
            }
            jSONObject.put("startIndex", this.f17819n);
            long j10 = this.f17820r;
            if (j10 != -1) {
                Pattern pattern = r5.a.f46766a;
                jSONObject.put("startTime", j10 / 1000.0d);
            }
            jSONObject.put("shuffle", this.f17821s);
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
        return TextUtils.equals(this.f17814a, nVar.f17814a) && TextUtils.equals(this.f17815b, nVar.f17815b) && this.f17816c == nVar.f17816c && TextUtils.equals(this.d, nVar.d) && y5.l.l(this.f17817e, nVar.f17817e) && this.f17818f == nVar.f17818f && y5.l.l(this.h, nVar.h) && this.f17819n == nVar.f17819n && this.f17820r == nVar.f17820r && this.f17821s == nVar.f17821s;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17814a, this.f17815b, Integer.valueOf(this.f17816c), this.d, this.f17817e, Integer.valueOf(this.f17818f), this.h, Integer.valueOf(this.f17819n), Long.valueOf(this.f17820r), Boolean.valueOf(this.f17821s)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.f17814a);
        r8.l(parcel, 3, this.f17815b);
        int i11 = this.f17816c;
        r8.s(parcel, 4, 4);
        parcel.writeInt(i11);
        r8.l(parcel, 5, this.d);
        r8.k(parcel, 6, this.f17817e, i10);
        int i12 = this.f17818f;
        r8.s(parcel, 7, 4);
        parcel.writeInt(i12);
        List list = this.h;
        r8.p(parcel, 8, list == null ? null : DesugarCollections.unmodifiableList(list));
        int i13 = this.f17819n;
        r8.s(parcel, 9, 4);
        parcel.writeInt(i13);
        long j10 = this.f17820r;
        r8.s(parcel, 10, 8);
        parcel.writeLong(j10);
        boolean z10 = this.f17821s;
        r8.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        r8.r(parcel, iQ);
    }
}
