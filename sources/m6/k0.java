package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
public final class k0 extends y5.a {
    public static final Parcelable.Creator<k0> CREATOR = new r0(8);
    public final List f17541a;

    public k0(ArrayList arrayList) {
        this.f17541a = arrayList;
    }

    public final JSONArray b() {
        try {
            JSONArray jSONArray = new JSONArray();
            List list = this.f17541a;
            if (list != null) {
                for (int i9 = 0; i9 < list.size(); i9++) {
                    l0 l0Var = (l0) list.get(i9);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) l0Var.f17544c);
                    jSONArray2.put((int) l0Var.f17543b);
                    jSONArray2.put((int) l0Var.f17544c);
                    jSONArray.put(i9, jSONArray2);
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
        List list = ((k0) obj).f17541a;
        List list2 = this.f17541a;
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
        List list = this.f17541a;
        if (list == null) {
            hashSet = null;
        } else {
            hashSet = new HashSet(list);
        }
        return Arrays.hashCode(new Object[]{hashSet});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.p(parcel, 1, this.f17541a);
        p8.r(parcel, q10);
    }
}
