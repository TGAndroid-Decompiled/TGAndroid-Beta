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
    public int f4386a;
    public String f4387b;
    public List f4388c;
    public List d;
    public double f4389e;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i10 = this.f4386a;
            if (i10 != 0) {
                if (i10 == 1) {
                    jSONObject.put("containerType", "AUDIOBOOK_CONTAINER");
                }
            } else {
                jSONObject.put("containerType", "GENERIC_CONTAINER");
            }
            if (!TextUtils.isEmpty(this.f4387b)) {
                jSONObject.put("title", this.f4387b);
            }
            List list = this.f4388c;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (l lVar : this.f4388c) {
                    jSONArray.put(lVar.d());
                }
                jSONObject.put("sections", jSONArray);
            }
            List list2 = this.d;
            if (list2 != null && !list2.isEmpty()) {
                jSONObject.put("containerImages", h6.a.b(this.d));
            }
            jSONObject.put("containerDuration", this.f4389e);
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
        if (this.f4386a == mVar.f4386a && TextUtils.equals(this.f4387b, mVar.f4387b) && n6.m.l(this.f4388c, mVar.f4388c) && n6.m.l(this.d, mVar.d) && this.f4389e == mVar.f4389e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4386a), this.f4387b, this.f4388c, this.d, Double.valueOf(this.f4389e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        List unmodifiableList;
        int q6 = w7.d0.q(parcel, 20293);
        int i11 = this.f4386a;
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        w7.d0.l(parcel, 3, this.f4387b);
        List list = this.f4388c;
        List list2 = null;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        w7.d0.p(parcel, 4, unmodifiableList);
        List list3 = this.d;
        if (list3 != null) {
            list2 = DesugarCollections.unmodifiableList(list3);
        }
        w7.d0.p(parcel, 5, list2);
        double d = this.f4389e;
        w7.d0.s(parcel, 6, 8);
        parcel.writeDouble(d);
        w7.d0.r(parcel, q6);
    }
}
