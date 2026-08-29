package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
public final class k0 extends a6.a {
    public static final Parcelable.Creator<k0> CREATOR = new n0(20);
    public final List f19401a;

    public k0(ArrayList arrayList) {
        this.f19401a = arrayList;
    }

    public final JSONArray b() {
        try {
            JSONArray jSONArray = new JSONArray();
            List list = this.f19401a;
            if (list != null) {
                for (int i10 = 0; i10 < list.size(); i10++) {
                    l0 l0Var = (l0) list.get(i10);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) l0Var.f19404c);
                    jSONArray2.put((int) l0Var.f19403b);
                    jSONArray2.put((int) l0Var.f19404c);
                    jSONArray.put(i10, jSONArray2);
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
        List list = ((k0) obj).f19401a;
        List list2 = this.f19401a;
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
        List list = this.f19401a;
        if (list == null) {
            hashSet = null;
        } else {
            hashSet = new HashSet(list);
        }
        return Arrays.hashCode(new Object[]{hashSet});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.p(parcel, 1, this.f19401a);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
