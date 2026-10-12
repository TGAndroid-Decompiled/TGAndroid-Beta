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
import w7.g0;
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new v(12);
    public int f4502a;
    public String f4503b;
    public List f4504c;
    public List d;
    public double e;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i10 = this.f4502a;
            if (i10 != 0) {
                if (i10 == 1) {
                    jSONObject.put("containerType", "AUDIOBOOK_CONTAINER");
                }
            } else {
                jSONObject.put("containerType", "GENERIC_CONTAINER");
            }
            if (!TextUtils.isEmpty(this.f4503b)) {
                jSONObject.put("title", this.f4503b);
            }
            List list = this.f4504c;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (l lVar : this.f4504c) {
                    jSONArray.put(lVar.d());
                }
                jSONObject.put("sections", jSONArray);
            }
            List list2 = this.d;
            if (list2 != null && !list2.isEmpty()) {
                jSONObject.put("containerImages", h6.a.b(this.d));
            }
            jSONObject.put("containerDuration", this.e);
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
        if (this.f4502a == mVar.f4502a && TextUtils.equals(this.f4503b, mVar.f4503b) && n6.l.l(this.f4504c, mVar.f4504c) && n6.l.l(this.d, mVar.d) && this.e == mVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4502a), this.f4503b, this.f4504c, this.d, Double.valueOf(this.e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        List unmodifiableList;
        int q6 = g0.q(parcel, 20293);
        int i11 = this.f4502a;
        g0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        g0.l(parcel, 3, this.f4503b);
        List list = this.f4504c;
        List list2 = null;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        g0.p(parcel, 4, unmodifiableList);
        List list3 = this.d;
        if (list3 != null) {
            list2 = DesugarCollections.unmodifiableList(list3);
        }
        g0.p(parcel, 5, list2);
        double d = this.e;
        g0.s(parcel, 6, 8);
        parcel.writeDouble(d);
        g0.r(parcel, q6);
    }
}
