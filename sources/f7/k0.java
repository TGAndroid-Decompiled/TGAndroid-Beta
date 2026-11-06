package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
public final class k0 extends r6.a {
    public static final Parcelable.Creator<k0> CREATOR = new db.k(27);
    public final List f11399a;

    public k0(ArrayList arrayList) {
        this.f11399a = arrayList;
    }

    public final JSONArray b() {
        try {
            JSONArray jSONArray = new JSONArray();
            List list = this.f11399a;
            if (list != null) {
                for (int i7 = 0; i7 < list.size(); i7++) {
                    l0 l0Var = (l0) list.get(i7);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) l0Var.f11402c);
                    jSONArray2.put((int) l0Var.f11401b);
                    jSONArray2.put((int) l0Var.f11402c);
                    jSONArray.put(i7, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e10) {
            throw new RuntimeException("Error encoding UvmEntries to JSON object", e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k0)) {
            return false;
        }
        List list = ((k0) obj).f11399a;
        List list2 = this.f11399a;
        if (list2 == null && list == null) {
            return true;
        }
        if (list2 == null || list == null || !list2.containsAll(list) || !list.containsAll(list2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        HashSet hashSet;
        List list = this.f11399a;
        if (list == null) {
            hashSet = null;
        } else {
            hashSet = new HashSet(list);
        }
        return Arrays.hashCode(new Object[]{hashSet});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.p(parcel, 1, this.f11399a);
        xb.s(parcel, r10);
    }
}
