package c6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new v(12);
    public int f4530a;
    public String f4531b;
    public List f4532c;
    public List d;
    public double f4533e;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i10 = this.f4530a;
            if (i10 != 0) {
                if (i10 == 1) {
                    jSONObject.put("containerType", "AUDIOBOOK_CONTAINER");
                }
            } else {
                jSONObject.put("containerType", "GENERIC_CONTAINER");
            }
            if (!TextUtils.isEmpty(this.f4531b)) {
                jSONObject.put("title", this.f4531b);
            }
            List list = this.f4532c;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (l lVar : this.f4532c) {
                    jSONArray.put(lVar.d());
                }
                jSONObject.put("sections", jSONArray);
            }
            List list2 = this.d;
            if (list2 != null && !list2.isEmpty()) {
                jSONObject.put("containerImages", h6.a.b(this.d));
            }
            jSONObject.put("containerDuration", this.f4533e);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f4530a == mVar.f4530a && TextUtils.equals(this.f4531b, mVar.f4531b) && n6.l.l(this.f4532c, mVar.f4532c) && n6.l.l(this.d, mVar.d) && this.f4533e == mVar.f4533e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4530a), this.f4531b, this.f4532c, this.d, Double.valueOf(this.f4533e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        List unmodifiableList;
        int q6 = w7.e0.q(parcel, 20293);
        int i11 = this.f4530a;
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        w7.e0.l(parcel, 3, this.f4531b);
        List list = this.f4532c;
        List list2 = null;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        w7.e0.p(parcel, 4, unmodifiableList);
        List list3 = this.d;
        if (list3 != null) {
            list2 = DesugarCollections.unmodifiableList(list3);
        }
        w7.e0.p(parcel, 5, list2);
        double d = this.f4533e;
        w7.e0.s(parcel, 6, 8);
        parcel.writeDouble(d);
        w7.e0.r(parcel, q6);
    }
}
