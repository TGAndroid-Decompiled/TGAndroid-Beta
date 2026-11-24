package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class yt6 extends b4 {
    public static final Parcelable.Creator<yt6> CREATOR = new jid((byte) 12);
    public int a;
    public String b;
    public ArrayList c;
    public ArrayList d;
    public double e;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    jSONObject.put("containerType", "AUDIOBOOK_CONTAINER");
                }
            } else {
                jSONObject.put("containerType", "GENERIC_CONTAINER");
            }
            if (!TextUtils.isEmpty(this.b)) {
                jSONObject.put("title", this.b);
            }
            ArrayList arrayList = this.c;
            if (arrayList != null && !arrayList.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList2 = this.c;
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    jSONArray.put(((it6) obj).d());
                }
                jSONObject.put("sections", jSONArray);
            }
            ArrayList arrayList3 = this.d;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                jSONObject.put("containerImages", d7d.b(this.d));
            }
            jSONObject.put("containerDuration", this.e);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yt6) {
                yt6 yt6Var = (yt6) obj;
                if (this.a == yt6Var.a && TextUtils.equals(this.b, yt6Var.b) && fse.a(this.c, yt6Var.c) && fse.a(this.d, yt6Var.d) && this.e == yt6Var.e) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, Double.valueOf(this.e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        List unmodifiableList;
        int r = mve.r(parcel, 20293);
        int i2 = this.a;
        mve.q(parcel, 2, 4);
        parcel.writeInt(i2);
        mve.l(parcel, 3, this.b);
        ArrayList arrayList = this.c;
        List list = null;
        if (arrayList == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        mve.p(parcel, 4, unmodifiableList);
        ArrayList arrayList2 = this.d;
        if (arrayList2 != null) {
            list = DesugarCollections.unmodifiableList(arrayList2);
        }
        mve.p(parcel, 5, list);
        double d = this.e;
        mve.q(parcel, 6, 8);
        parcel.writeDouble(d);
        mve.s(parcel, r);
    }
}
