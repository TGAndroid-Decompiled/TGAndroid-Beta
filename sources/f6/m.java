package f6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c8.xb;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new v(12);
    public int f11294a;
    public String f11295b;
    public List f11296c;
    public List d;
    public double f11297e;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i7 = this.f11294a;
            if (i7 != 0) {
                if (i7 == 1) {
                    jSONObject.put("containerType", "AUDIOBOOK_CONTAINER");
                }
            } else {
                jSONObject.put("containerType", "GENERIC_CONTAINER");
            }
            if (!TextUtils.isEmpty(this.f11295b)) {
                jSONObject.put("title", this.f11295b);
            }
            List list = this.f11296c;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (l lVar : this.f11296c) {
                    jSONArray.put(lVar.d());
                }
                jSONObject.put("sections", jSONArray);
            }
            List list2 = this.d;
            if (list2 != null && !list2.isEmpty()) {
                jSONObject.put("containerImages", k6.a.b(this.d));
            }
            jSONObject.put("containerDuration", this.f11297e);
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
        if (this.f11294a == mVar.f11294a && TextUtils.equals(this.f11295b, mVar.f11295b) && q6.m.k(this.f11296c, mVar.f11296c) && q6.m.k(this.d, mVar.d) && this.f11297e == mVar.f11297e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11294a), this.f11295b, this.f11296c, this.d, Double.valueOf(this.f11297e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        List unmodifiableList;
        int r10 = xb.r(parcel, 20293);
        int i10 = this.f11294a;
        xb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        xb.l(parcel, 3, this.f11295b);
        List list = this.f11296c;
        List list2 = null;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        xb.p(parcel, 4, unmodifiableList);
        List list3 = this.d;
        if (list3 != null) {
            list2 = DesugarCollections.unmodifiableList(list3);
        }
        xb.p(parcel, 5, list2);
        double d = this.f11297e;
        xb.q(parcel, 6, 8);
        parcel.writeDouble(d);
        xb.s(parcel, r10);
    }
}
