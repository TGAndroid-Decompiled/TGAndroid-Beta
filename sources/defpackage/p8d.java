package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
public final class p8d extends b4 {
    public static final Parcelable.Creator<p8d> CREATOR = new t4d((byte) 26);
    public final String a;
    public final ArrayList b;

    public p8d(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        fre.h(str);
        fre.h(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && p8d.class == obj.getClass()) {
                p8d p8dVar = (p8d) obj;
                String str = p8dVar.a;
                String str2 = this.a;
                if (str2 != null) {
                    if (!str2.equals(str)) {
                        return false;
                    }
                } else if (str != null) {
                    return false;
                }
                ArrayList arrayList = p8dVar.b;
                ArrayList arrayList2 = this.b;
                if (arrayList2 != null) {
                    if (arrayList2.equals(arrayList)) {
                        return true;
                    }
                    return false;
                } else if (arrayList == null) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        String str = this.a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (i + 31) * 31;
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            i2 = arrayList.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return b00.i("CapabilityInfo{", this.a, ", ", String.valueOf(this.b), "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.p(parcel, 3, this.b);
        jte.s(parcel, r);
    }
}
