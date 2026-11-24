package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
public final class w8c extends b4 {
    public static final Parcelable.Creator<w8c> CREATOR = new j9d((byte) 22);
    public final ArrayList a;

    public w8c(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final JSONArray b() {
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = this.a;
            if (arrayList != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    x8c x8cVar = (x8c) arrayList.get(i);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) x8cVar.c);
                    jSONArray2.put((int) x8cVar.b);
                    jSONArray2.put((int) x8cVar.c);
                    jSONArray.put(i, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            fyb.j("Error encoding UvmEntries to JSON object", e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w8c) {
            ArrayList arrayList = ((w8c) obj).a;
            ArrayList arrayList2 = this.a;
            if (arrayList2 == null) {
                if (arrayList == null) {
                    return true;
                }
                return false;
            } else if (arrayList != null && arrayList2.containsAll(arrayList) && arrayList.containsAll(arrayList2)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        HashSet hashSet;
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            hashSet = null;
        } else {
            hashSet = new HashSet(arrayList);
        }
        return Arrays.hashCode(new Object[]{hashSet});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.p(parcel, 1, this.a);
        jte.s(parcel, r);
    }
}
