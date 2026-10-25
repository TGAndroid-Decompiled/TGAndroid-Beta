package d6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class m extends p6.a {
    public static final Parcelable.Creator<m> CREATOR = new v(12);
    public int f8101a;
    public String f8102b;
    public List f8103c;
    public List d;
    public double e;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i10 = this.f8101a;
            if (i10 != 0) {
                if (i10 == 1) {
                    jSONObject.put("containerType", "AUDIOBOOK_CONTAINER");
                }
            } else {
                jSONObject.put("containerType", "GENERIC_CONTAINER");
            }
            if (!TextUtils.isEmpty(this.f8102b)) {
                jSONObject.put("title", this.f8102b);
            }
            List list = this.f8103c;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (l lVar : this.f8103c) {
                    jSONArray.put(lVar.d());
                }
                jSONObject.put("sections", jSONArray);
            }
            List list2 = this.d;
            if (list2 != null && !list2.isEmpty()) {
                jSONObject.put("containerImages", i6.a.b(this.d));
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
        if (this.f8101a == mVar.f8101a && TextUtils.equals(this.f8102b, mVar.f8102b) && o6.l.l(this.f8103c, mVar.f8103c) && o6.l.l(this.d, mVar.d) && this.e == mVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8101a), this.f8102b, this.f8103c, this.d, Double.valueOf(this.e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        List unmodifiableList;
        int q5 = df.q(parcel, 20293);
        int i11 = this.f8101a;
        df.s(parcel, 2, 4);
        parcel.writeInt(i11);
        df.l(parcel, 3, this.f8102b);
        List list = this.f8103c;
        List list2 = null;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        df.p(parcel, 4, unmodifiableList);
        List list3 = this.d;
        if (list3 != null) {
            list2 = DesugarCollections.unmodifiableList(list3);
        }
        df.p(parcel, 5, list2);
        double d = this.e;
        df.s(parcel, 6, 8);
        parcel.writeDouble(d);
        df.r(parcel, q5);
    }
}
