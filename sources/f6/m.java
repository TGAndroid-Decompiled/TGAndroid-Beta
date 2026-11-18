package f6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c8.bc;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class m extends r6.a {
    public static final Parcelable.Creator<m> CREATOR = new v(12);
    public int f11423a;
    public String f11424b;
    public List f11425c;
    public List d;
    public double f11426e;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i7 = this.f11423a;
            if (i7 != 0) {
                if (i7 == 1) {
                    jSONObject.put("containerType", "AUDIOBOOK_CONTAINER");
                }
            } else {
                jSONObject.put("containerType", "GENERIC_CONTAINER");
            }
            if (!TextUtils.isEmpty(this.f11424b)) {
                jSONObject.put("title", this.f11424b);
            }
            List list = this.f11425c;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (l lVar : this.f11425c) {
                    jSONArray.put(lVar.d());
                }
                jSONObject.put("sections", jSONArray);
            }
            List list2 = this.d;
            if (list2 != null && !list2.isEmpty()) {
                jSONObject.put("containerImages", k6.a.b(this.d));
            }
            jSONObject.put("containerDuration", this.f11426e);
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
        if (this.f11423a == mVar.f11423a && TextUtils.equals(this.f11424b, mVar.f11424b) && q6.m.l(this.f11425c, mVar.f11425c) && q6.m.l(this.d, mVar.d) && this.f11426e == mVar.f11426e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11423a), this.f11424b, this.f11425c, this.d, Double.valueOf(this.f11426e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        List unmodifiableList;
        int r10 = bc.r(parcel, 20293);
        int i10 = this.f11423a;
        bc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        bc.l(parcel, 3, this.f11424b);
        List list = this.f11425c;
        List list2 = null;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        bc.p(parcel, 4, unmodifiableList);
        List list3 = this.d;
        if (list3 != null) {
            list2 = DesugarCollections.unmodifiableList(list3);
        }
        bc.p(parcel, 5, list2);
        double d = this.f11426e;
        bc.q(parcel, 6, 8);
        parcel.writeDouble(d);
        bc.s(parcel, r10);
    }
}
