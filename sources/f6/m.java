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
    public int f11449a;
    public String f11450b;
    public List f11451c;
    public List d;
    public double f11452e;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i7 = this.f11449a;
            if (i7 != 0) {
                if (i7 == 1) {
                    jSONObject.put("containerType", "AUDIOBOOK_CONTAINER");
                }
            } else {
                jSONObject.put("containerType", "GENERIC_CONTAINER");
            }
            if (!TextUtils.isEmpty(this.f11450b)) {
                jSONObject.put("title", this.f11450b);
            }
            List list = this.f11451c;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (l lVar : this.f11451c) {
                    jSONArray.put(lVar.d());
                }
                jSONObject.put("sections", jSONArray);
            }
            List list2 = this.d;
            if (list2 != null && !list2.isEmpty()) {
                jSONObject.put("containerImages", k6.a.b(this.d));
            }
            jSONObject.put("containerDuration", this.f11452e);
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
        if (this.f11449a == mVar.f11449a && TextUtils.equals(this.f11450b, mVar.f11450b) && q6.m.l(this.f11451c, mVar.f11451c) && q6.m.l(this.d, mVar.d) && this.f11452e == mVar.f11452e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11449a), this.f11450b, this.f11451c, this.d, Double.valueOf(this.f11452e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        List unmodifiableList;
        int r10 = bc.r(parcel, 20293);
        int i10 = this.f11449a;
        bc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        bc.l(parcel, 3, this.f11450b);
        List list = this.f11451c;
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
        double d = this.f11452e;
        bc.q(parcel, 6, 8);
        parcel.writeDouble(d);
        bc.s(parcel, r10);
    }
}
