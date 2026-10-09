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
    public int f4387a;
    public String f4388b;
    public List f4389c;
    public List d;
    public double f4390e;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i10 = this.f4387a;
            if (i10 != 0) {
                if (i10 == 1) {
                    jSONObject.put("containerType", "AUDIOBOOK_CONTAINER");
                }
            } else {
                jSONObject.put("containerType", "GENERIC_CONTAINER");
            }
            if (!TextUtils.isEmpty(this.f4388b)) {
                jSONObject.put("title", this.f4388b);
            }
            List list = this.f4389c;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (l lVar : this.f4389c) {
                    jSONArray.put(lVar.d());
                }
                jSONObject.put("sections", jSONArray);
            }
            List list2 = this.d;
            if (list2 != null && !list2.isEmpty()) {
                jSONObject.put("containerImages", h6.a.b(this.d));
            }
            jSONObject.put("containerDuration", this.f4390e);
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
        if (this.f4387a == mVar.f4387a && TextUtils.equals(this.f4388b, mVar.f4388b) && n6.l.l(this.f4389c, mVar.f4389c) && n6.l.l(this.d, mVar.d) && this.f4390e == mVar.f4390e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4387a), this.f4388b, this.f4389c, this.d, Double.valueOf(this.f4390e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        List unmodifiableList;
        int q6 = w7.d0.q(parcel, 20293);
        int i11 = this.f4387a;
        w7.d0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        w7.d0.l(parcel, 3, this.f4388b);
        List list = this.f4389c;
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
        double d = this.f4390e;
        w7.d0.s(parcel, 6, 8);
        parcel.writeDouble(d);
        w7.d0.r(parcel, q6);
    }
}
