package m5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import h7.r8;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class m extends z5.a {
    public static final Parcelable.Creator<m> CREATOR = new w(12);

    public int f17810a;

    public String f17811b;

    public List f17812c;
    public List d;

    public double f17813e;

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i10 = this.f17810a;
            if (i10 == 0) {
                jSONObject.put("containerType", "GENERIC_CONTAINER");
            } else if (i10 == 1) {
                jSONObject.put("containerType", "AUDIOBOOK_CONTAINER");
            }
            if (!TextUtils.isEmpty(this.f17811b)) {
                jSONObject.put("title", this.f17811b);
            }
            List list = this.f17812c;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.f17812c.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((l) it.next()).d());
                }
                jSONObject.put("sections", jSONArray);
            }
            List list2 = this.d;
            if (list2 != null && !list2.isEmpty()) {
                jSONObject.put("containerImages", s5.a.b(this.d));
            }
            jSONObject.put("containerDuration", this.f17813e);
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
        return this.f17810a == mVar.f17810a && TextUtils.equals(this.f17811b, mVar.f17811b) && y5.l.l(this.f17812c, mVar.f17812c) && y5.l.l(this.d, mVar.d) && this.f17813e == mVar.f17813e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17810a), this.f17811b, this.f17812c, this.d, Double.valueOf(this.f17813e)});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        int i11 = this.f17810a;
        r8.s(parcel, 2, 4);
        parcel.writeInt(i11);
        r8.l(parcel, 3, this.f17811b);
        List list = this.f17812c;
        r8.p(parcel, 4, list == null ? null : DesugarCollections.unmodifiableList(list));
        List list2 = this.d;
        r8.p(parcel, 5, list2 != null ? DesugarCollections.unmodifiableList(list2) : null);
        double d = this.f17813e;
        r8.s(parcel, 6, 8);
        parcel.writeDouble(d);
        r8.r(parcel, iQ);
    }
}
