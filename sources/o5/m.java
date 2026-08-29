package o5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class m extends a6.a {
    public static final Parcelable.Creator<m> CREATOR = new v(12);
    public int f19292a;
    public String f19293b;
    public List f19294c;
    public List d;
    public double f19295e;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i10 = this.f19292a;
            if (i10 != 0) {
                if (i10 == 1) {
                    jSONObject.put("containerType", "AUDIOBOOK_CONTAINER");
                }
            } else {
                jSONObject.put("containerType", "GENERIC_CONTAINER");
            }
            if (!TextUtils.isEmpty(this.f19293b)) {
                jSONObject.put("title", this.f19293b);
            }
            List list = this.f19294c;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (l lVar : this.f19294c) {
                    jSONArray.put(lVar.d());
                }
                jSONObject.put("sections", jSONArray);
            }
            List list2 = this.d;
            if (list2 != null && !list2.isEmpty()) {
                jSONObject.put("containerImages", t5.a.b(this.d));
            }
            jSONObject.put("containerDuration", this.f19295e);
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
        if (this.f19292a == mVar.f19292a && TextUtils.equals(this.f19293b, mVar.f19293b) && z5.l.l(this.f19294c, mVar.f19294c) && z5.l.l(this.d, mVar.d) && this.f19295e == mVar.f19295e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f19292a), this.f19293b, this.f19294c, this.d, Double.valueOf(this.f19295e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        List unmodifiableList;
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        int i11 = this.f19292a;
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(i11);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.f19293b);
        List list = this.f19294c;
        List list2 = null;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        com.google.android.gms.internal.cast.o.p(parcel, 4, unmodifiableList);
        List list3 = this.d;
        if (list3 != null) {
            list2 = DesugarCollections.unmodifiableList(list3);
        }
        com.google.android.gms.internal.cast.o.p(parcel, 5, list2);
        double d = this.f19295e;
        com.google.android.gms.internal.cast.o.s(parcel, 6, 8);
        parcel.writeDouble(d);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
