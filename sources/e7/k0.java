package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
public final class k0 extends q6.a {
    public static final Parcelable.Creator<k0> CREATOR = new r0(12);
    public final List f9842a;

    public k0(ArrayList arrayList) {
        this.f9842a = arrayList;
    }

    public final JSONArray b() {
        try {
            JSONArray jSONArray = new JSONArray();
            List list = this.f9842a;
            if (list != null) {
                for (int i3 = 0; i3 < list.size(); i3++) {
                    l0 l0Var = (l0) list.get(i3);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) l0Var.f9845c);
                    jSONArray2.put((int) l0Var.f9844b);
                    jSONArray2.put((int) l0Var.f9845c);
                    jSONArray.put(i3, jSONArray2);
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
        List list = ((k0) obj).f9842a;
        List list2 = this.f9842a;
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
        List list = this.f9842a;
        if (list == null) {
            hashSet = null;
        } else {
            hashSet = new HashSet(list);
        }
        return Arrays.hashCode(new Object[]{hashSet});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.q(parcel, 1, this.f9842a);
        j8.a.t(parcel, s6);
    }
}
