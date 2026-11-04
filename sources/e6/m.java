package e6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class m extends q6.a {
    public static final Parcelable.Creator<m> CREATOR = new v(12);
    public int f9732a;
    public String f9733b;
    public List f9734c;
    public List d;
    public double f9735e;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i3 = this.f9732a;
            if (i3 != 0) {
                if (i3 == 1) {
                    jSONObject.put("containerType", "AUDIOBOOK_CONTAINER");
                }
            } else {
                jSONObject.put("containerType", "GENERIC_CONTAINER");
            }
            if (!TextUtils.isEmpty(this.f9733b)) {
                jSONObject.put("title", this.f9733b);
            }
            List list = this.f9734c;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (l lVar : this.f9734c) {
                    jSONArray.put(lVar.d());
                }
                jSONObject.put("sections", jSONArray);
            }
            List list2 = this.d;
            if (list2 != null && !list2.isEmpty()) {
                jSONObject.put("containerImages", j6.a.b(this.d));
            }
            jSONObject.put("containerDuration", this.f9735e);
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
        if (this.f9732a == mVar.f9732a && TextUtils.equals(this.f9733b, mVar.f9733b) && p6.m.k(this.f9734c, mVar.f9734c) && p6.m.k(this.d, mVar.d) && this.f9735e == mVar.f9735e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9732a), this.f9733b, this.f9734c, this.d, Double.valueOf(this.f9735e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        List unmodifiableList;
        int s6 = j8.a.s(parcel, 20293);
        int i10 = this.f9732a;
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(i10);
        j8.a.m(parcel, 3, this.f9733b);
        List list = this.f9734c;
        List list2 = null;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        j8.a.q(parcel, 4, unmodifiableList);
        List list3 = this.d;
        if (list3 != null) {
            list2 = DesugarCollections.unmodifiableList(list3);
        }
        j8.a.q(parcel, 5, list2);
        double d = this.f9735e;
        j8.a.r(parcel, 6, 8);
        parcel.writeDouble(d);
        j8.a.t(parcel, s6);
    }
}
