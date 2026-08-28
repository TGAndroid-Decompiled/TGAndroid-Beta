package m5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import g7.p8;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class m extends y5.a {
    public static final Parcelable.Creator<m> CREATOR = new v(12);
    public int f17433a;
    public String f17434b;
    public List f17435c;
    public List d;
    public double f17436e;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i9 = this.f17433a;
            if (i9 != 0) {
                if (i9 == 1) {
                    jSONObject.put("containerType", "AUDIOBOOK_CONTAINER");
                }
            } else {
                jSONObject.put("containerType", "GENERIC_CONTAINER");
            }
            if (!TextUtils.isEmpty(this.f17434b)) {
                jSONObject.put("title", this.f17434b);
            }
            List list = this.f17435c;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (l lVar : this.f17435c) {
                    jSONArray.put(lVar.d());
                }
                jSONObject.put("sections", jSONArray);
            }
            List list2 = this.d;
            if (list2 != null && !list2.isEmpty()) {
                jSONObject.put("containerImages", r5.a.b(this.d));
            }
            jSONObject.put("containerDuration", this.f17436e);
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
        if (this.f17433a == mVar.f17433a && TextUtils.equals(this.f17434b, mVar.f17434b) && x5.l.l(this.f17435c, mVar.f17435c) && x5.l.l(this.d, mVar.d) && this.f17436e == mVar.f17436e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17433a), this.f17434b, this.f17435c, this.d, Double.valueOf(this.f17436e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        List unmodifiableList;
        int q10 = p8.q(parcel, 20293);
        int i10 = this.f17433a;
        p8.s(parcel, 2, 4);
        parcel.writeInt(i10);
        p8.l(parcel, 3, this.f17434b);
        List list = this.f17435c;
        List list2 = null;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        p8.p(parcel, 4, unmodifiableList);
        List list3 = this.d;
        if (list3 != null) {
            list2 = DesugarCollections.unmodifiableList(list3);
        }
        p8.p(parcel, 5, list2);
        double d = this.f17436e;
        p8.s(parcel, 6, 8);
        parcel.writeDouble(d);
        p8.r(parcel, q10);
    }
}
